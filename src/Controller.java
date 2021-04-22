import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.FileNotFoundException;

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
            if (shortname.toString().equals("Бутан")) {
                Tree4 tree4 = new Tree4();
                try {
                    char[][] arr = new char[tree4.findWithName(getUserName).length][tree4.findWithName(getUserName)[0].length];
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[0].length; j++) {
                            arr[i][j] = tree4.findWithName(getUserName)[i][j];
                        }
                    }
                    for (int j = 0; j < arr[0].length; j++) {
                        exit.append(arr[2][j]);
                        try {
                            if ((arr[2][j] == 'C') && (arr[2][j + 1] == 'C')) {
                                exit.append("-");
                            }
                        } catch (ArrayIndexOutOfBoundsException e) {
                            continue;
                        }
                    }

                    carbonHydrogen.setText(exit.toString());

                    exit = new StringBuilder();

                    for (int j = 0; j < arr[0].length; j++) {
                        exit.append(arr[1][j]);
                    }

                    carbonhydrogenup.setText(exit.toString());

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
