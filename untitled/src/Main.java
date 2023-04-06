import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String queryString1 = "id=33&count=1&age=14&studentNo=65&name=Paul";

        // 압축해제 시작
        String[] queryStringBits1 = queryString1.split("&");
        Map<String, String> params1 = new HashMap<>();

        for(String bit : queryStringBits1) {
            String[] bitBits = bit.split("=");
            params1.put(bitBits[0], bitBits[1]);  // key, value
        }
        // 압축해제 끝

        String queryString2 = "id=33&name=Paul";

        // 압축해제 시작
        String[] queryStringBits2 = queryString2.split("&");
        Map<String, String> params2 = new HashMap<>();

        for(String bit : queryStringBits2) {
            String[] bitBits = bit.split("=");
            params2.put(bitBits[0], bitBits[1]);  // key, value
        }
        // 압축해제 끝

        System.out.println("== 반복문에 의해서 전체출력 ==");
        for(String paramName : params2.keySet()) {
            String paramValue = params2.get(paramName);

            System.out.printf("%s : %s\n", paramName, paramValue);
        }

    }
}