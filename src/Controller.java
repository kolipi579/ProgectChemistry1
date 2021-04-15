import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField name;

    @FXML
    private Button getData;

    @FXML
    private Text carbonHydrogen;

    @FXML
    void initialize() {
        getData.setOnAction(event -> {
            String getUserName = name.getText().trim();
            StringBuilder exit = new StringBuilder();
            Tree4 tree4 = new Tree4();
                char[][] arr = new char[tree4.findWithName(getUserName).length][tree4.findWithName(getUserName)[0].length];
            for (int i = 0; i < tree4.findWithName(getUserName).length; i++) {
                for (int j = 0; j < tree4.findWithName(getUserName)[0].length; j++) {
                    arr[i][j] = tree4.findWithName(getUserName)[i][j];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    exit.append(arr[i][j]);
                    if ((arr[i][j] == 'C')&&(arr[i][j+1] == 'C')){
                        exit.append("-");
                    }
                }
            }
            carbonHydrogen.setText(exit.toString());
        });
    }
}
