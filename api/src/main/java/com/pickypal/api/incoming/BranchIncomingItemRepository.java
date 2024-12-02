package com.pickypal.api.incoming;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BranchIncomingItemRepository extends JpaRepository<BranchIncomingItem, String> {
    /* 지점의 입고 조회: 그 지점의 row만 반환해야 함에 유의 */
    // 최신순으로 지점 입고 내역 조회
    List<BranchIncomingItem> findAllByBranchIdOrderByInTimeDesc(String branchId);

    // 상품 ID로 필터링하여 조회
    List<BranchIncomingItem> findAllByBranchIdAndItemId(String branchId, String itemId);

    // 상품명으로 필터링하여 조회
    @Query(value=
            "SELECT * FROM ( " +
                "SELECT * FROM branch_incoming_item bi " +
                "JOIN item it USING(item_id) " +
            ") res " +
            "WHERE res.branch_id = :branch_id AND res.name LIKE %:item_name%;", nativeQuery=true)
    List<BranchIncomingItem> findAllByBranchIdAndItemNameLike(@Param("branch_id") String branchId, @Param("item_name") String itemName);

    // 입고 등록일시로 필터링하여 조회
    @Query(value=
            "SELECT * FROM branch_incoming_item " +
            "WHERE branch_id = :branch_id AND in_time >= :date AND in_time < :next_date;", nativeQuery=true)
    List<BranchIncomingItem> findAllByBranchIdAndInTime(@Param("branch_id") String branchId, @Param("date") String date, @Param("next_date") String nextDate);
}