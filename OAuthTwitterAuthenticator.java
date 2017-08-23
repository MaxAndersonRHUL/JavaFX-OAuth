public class OAuthTwitterAuthenticator extends OAuthAuthenticator {
    public OAuthTwitterAuthenticator(String clientID, String redirectUri, String clientSecret) {
        super(clientID, redirectUri, clientSecret);
    }

    @Override
    String getWebUrl() {
        return "https://api.twitter.com/oauth/request_token";
    }

    @Override
    String getApiTokenUrl() {
        return null;
    }

    @Override
    String getApiAccessUrl() {
        return null;
    }

    @Override
    String getApiAccessParams() {
        return null;
    }
}
