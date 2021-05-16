import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.FileNotFoundException;
import java.util.Locale;

public class Controller {

    @FXML
    private TextField name;

    @FXML
    private Button getData;

    @FXML
    private Text carbonHydrogen;

    @FXML
    private Text carbonhydrogenup;

    @FXML
    void initialize() {
        getData.setOnAction(event -> {
            String getUserName = name.getText().trim();
            StringBuilder exit = new StringBuilder();
            StringBuilder shortname = new StringBuilder();
            if (name.getText().equals("Метан")) {
                carbonHydrogen.setText("C");
            }
            if (name.getText().equals("Этан")) {
                carbonHydrogen.setText("C-C");
            }
            char[] ch = name.getText().toCharArray();
            for (int i = ch.length - 1; i >= 0; i--) {
                if (ch[i] == 'л') {
                    break;
                }
                shortname.insert(0, ch[i]);
            }
            char[][] chars = new char[5][5];
            Map map = new Map();
            map.map.get(getUserName);
            for (int i = 0; i < chars.length; i++) {
                for (int j = 0; j < chars[0].length; j++) {
                    chars[i][j] = map.map.get(getUserName)[i][j];
                }
            }
            for (int j = 0; j < chars[0].length; j++) {
                exit.append(chars[2][j]);
                try {
                    if ((chars[2][j] == 'C') && (chars[2][j + 1] == 'C')) {
                        exit.append("-");
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    continue;
                }
            }

            carbonHydrogen.setText(exit.toString());

            exit = new StringBuilder();

            for (int j = 0; j < chars[0].length; j++) {
                exit.append(chars[1][j]);
            }

            carbonhydrogenup.setText(exit.toString());
        });
    }
}
