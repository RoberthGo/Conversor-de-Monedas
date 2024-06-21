package functions;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;

import models.InformationConversion;

public class ConnectionApi {

    private String apiKey = "";
    private String url;
    private HttpClient client;
    private HttpRequest request;

    public ConnectionApi(String apiKey) {
        this.apiKey = apiKey;
        this.url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/";
        this.client = HttpClient.newHttpClient();
    }

    public String getConversion(InformationConversion coin) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url + "pair/" + coin.getBaseCode() + "/" + coin.getTargetCode() + "/" + coin.getAmount()))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            System.out.println("Alguna de las monedas ingresadas no es valida, vuelva a intentarlo.");
            return "";
        }
    }

}
