package popups;

import actions.App;
import actions.GameConfig;
import actions.PlayRequest;
import animatefx.animation.Tada;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.tictactoe.tictactoefx.SwitchTo;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import org.json.simple.JSONObject;
import org.kordamp.ikonli.javafx.FontIcon;
import player.PlayerHandler;
import playerModel.Player;

public class SaveGameSuccessPopupController implements Initializable {
    private JSONObject jsonData;

    @FXML private FontIcon heartIcon;
    @FXML private void okButtonClicked(ActionEvent event)
    {
        App.getPopUpWindow().close();
        try {
            SwitchTo.changeTo(App.getWindow(), 2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        jsonData=GameConfig.getSaveGameSuccesPobUp();


    }    
    
}
