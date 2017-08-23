import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * Created by max on 29/07/2017.
 */
public class main extends Application {
    public void start(Stage primaryStage) throws Exception {
        String gClientId = "###############";
        String gRedir = "##########";
        String gScope = "https://www.googleapis.com/auth/userinfo.profile";
        String gSecret = "8QXZg1ug5HbY0IFH6AdwzV4u";
        OAuthAuthenticator auth = new OAuthGoogleAuthenticator(gClientId, gRedir, gSecret, gScope);
        //auth.startLogin();

        String FACEBOOK_clientID = "###############";
        String FACEBOOK_redirectUri = "http://www.############.com/";
        String FACEBOOK_fieldsString = "name,gender,id";
        String FACEBOOK_clientSecret = "#########;

        OAuthAuthenticator authFB = new OAuthFacebookAuthenticator(FACEBOOK_clientID, FACEBOOK_redirectUri, FACEBOOK_clientSecret, FACEBOOK_fieldsString);
        //authFB.startLogin();

        String GIT_clientID = "############";
        String GIT_redirectUri = "############;
        String GIT_scope = "user";
        String GIT_clientSecret = "##############";

        OAuthAuthenticator authGit = new OAuthGithubAuthenticator(GIT_clientID, GIT_redirectUri, GIT_clientSecret, GIT_scope);
        authGit.startLogin();


    }
}
