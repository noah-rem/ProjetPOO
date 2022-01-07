package FXML;


import SQLQueries.DAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ResourceBundle;

public class ControllerSuppStag implements Initializable {
    @FXML
    public TableView<Stagiaire> Stagiaire;
    public TextField idSuppStag ;
    public Button OkSuppStag ;

    private Connection con ;
    private DAO test= new DAO(con);


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void OkSuppAction(ActionEvent actionEvent) {

        Stage stage = (Stage) OkSuppStag.getScene().getWindow();

        try {
            test.Instance();
            this.con=test.getCon();
            String SQL = "DELETE FROM stagiaire WHERE idStagiaire =" + Integer.parseInt(idSuppStag.getText());

            Statement st = con.createStatement();
            st.executeUpdate(SQL);


        } catch (Exception e) {
            e.printStackTrace();
        }
        stage.close() ;
    }
}
