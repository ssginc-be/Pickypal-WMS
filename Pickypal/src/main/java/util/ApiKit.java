package util;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * @author Queue-ri
 */

@Slf4j
public class ApiKit {

    // Http GET request to backend server
    // **no auth header: 회원가입, 로그인 용도**
    public void getRequest(String endpoint) {

    }

    // Http GET request **with auth header** to backend server
    // 모든 조회 용도: access token 필요
    public ApiResponse getRequestWithAuth(String endpoint) {
        String ACCESS_TOKEN = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJyb290Iiwicm9sZSI6IkhFQUQiLCJleHAiOjE3MzU3NDQ0NjN9.4Y6yReg_4HO_66rz5e-7XGrQEux80gxf0RQu9ONG598";
        ApiResponse res = new ApiResponse();

        try {
            CloseableHttpClient client = HttpClients.createDefault();
            HttpGet getRequest = new HttpGet(endpoint); //GET 메소드 URL 생성
            getRequest.addHeader("Authorization", "Bearer " + ACCESS_TOKEN); //KEY 입력

            CloseableHttpResponse response = client.execute(getRequest);
            int statusCode = response.getStatusLine().getStatusCode();
            res.setStatusCode(statusCode);

            // Response 출력
            String body;
            if (statusCode == 200) {
                ResponseHandler<String> handler = new BasicResponseHandler();
                body = handler.handleResponse(response);
                log.info("* * * ApiKit(auth GET): 200 OK");
                System.out.println(body);
            } else {
                log.error("* * * ApiKit(auth GET): Server returned " + statusCode);
                body = null;
            }
            res.setJsonStr(body);
            client.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }

    // Http POST request **with auth header** to backend server
    // 모든 등록 용도: access token 필요
    public void postRequestWithAuth(String endpoint) {

    }

    // Http DELETE request **with auth header** to backend server
    // 모든 삭제 용도: access token 필요
    public void deleteRequestWithAuth(String endpoint) {

    }
}
