package sample;

import com.jfoenix.controls.JFXDialog;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import untils.CldCommonUntils;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

//    @FXML注解，表示这个属性或者方法是和xml文件中对应着的，要调用或者初始化时JavaFx会自动进行。
@FXML
private TextField textName;

    @FXML
    private Button btnMd5;

    @FXML
    private TextField textEnd;

    @FXML
    private Button btnHello;

    @FXML
    private TextField textStart;

    @FXML
    private JFXDialog MyDialog;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void showHello(ActionEvent event){
        System.out.println("Hello");
        textName.setText("Hello!!!");

//        JFXDialog dialog = new JFXDialog();
//        dialog.setContent(new Label("Content"));
//        button.setOnAction((action)->dialog.show(rootStackPane));

        MyDialog.onDialogOpenedProperty();
    }



    @FXML
    void doMD5(ActionEvent event) {
        String text = textStart.getText();
        String endStr = CldCommonUntils.encodeMD5(text);
        textEnd.setText(endStr);
    }


}
