package FXML;


import SQLQueries.DAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;


public class ControllerModifEntr implements Initializable {


    @FXML private Button ValiderEntrModif ;
    @FXML private TextField RaisonEntrModif ;
    @FXML private TextField DenoEntrModif ;
    @FXML private TextField AdresseEntrModif ;
    @FXML private TextField idEntrModif ;
    @FXML private TextField NomEntrModif ;
    @FXML private TextField SiteEntrModif ;
    @FXML private Button  OkEntrModif;
    @FXML private Button ViderEntrModif;
    @FXML private TextField DateEntrModif;
    @FXML private TextField SecteurEntrModif;

    private Connection con ;
    private DAO test= new DAO(con);








    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }



    public void ActionValidaxModifEntr(ActionEvent actionEvent) {

        Stage stage = (Stage) ValiderEntrModif.getScene().getWindow();

        try {
            test.Instance();
            this.con=test.getCon();
            String SQL = "UPDATE entreprise SET  NomEntrep='"+NomEntrModif.getText()+" ',Raison_sociale='"+RaisonEntrModif.getText()+" ',Denomination='"+DenoEntrModif.getText()+" ',Adresse_du_siege='"+AdresseEntrModif.getText()+"',Secteurs_d_activite='"+SecteurEntrModif.getText()+" ',Date_de_creation='"+DateEntrModif.getText()+" ',Site_internet='"+SiteEntrModif.getText()+" ' WHERE idEntreprise='"+idEntrModif.getText()+"'";

            Statement st = con.createStatement();
            st.executeUpdate(SQL);


        } catch (Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setContentText("Attention aux erreurs de syntaxes ou bien des id qui n'éxiste pas !");
            alert.showAndWait();
        }
        stage.close() ;
    }

    public void OkModifActionEntr(ActionEvent actionEvent) {



        try {
            test.Instance();
            this.con=test.getCon();
            String SQL = "SELECT * FROM entreprise WHERE idEntreprise =" + Integer.parseInt(idEntrModif.getText());
            PreparedStatement st =  con.prepareStatement(SQL);
            ResultSet rs = st.executeQuery();

            while (rs.next()){

                NomEntrModif.setText(rs.getString("NomEntrep"));
                RaisonEntrModif.setText(rs.getString("Raison_sociale"));
                DenoEntrModif.setText(rs.getString("Denomination"));
                AdresseEntrModif.setText(rs.getString("Adresse_du_siege"));
                SecteurEntrModif.setText(rs.getString("Secteurs_d_activite"));
                DateEntrModif.setText(rs.getString("Date_de_creation"));
                SiteEntrModif.setText(rs.getString("Site_internet"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void ActionViderModif(ActionEvent actionEvent) {
        idEntrModif.setText("");
        NomEntrModif.setText("");
        RaisonEntrModif.setText("");
        DenoEntrModif.setText("");
        AdresseEntrModif.setText("");
        SecteurEntrModif.setText("");
        DateEntrModif.setText("");
        SiteEntrModif.setText("");

    }
}

