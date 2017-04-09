/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c482_fx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Mike
 */
public class AddModifyProdController implements Initializable {

    @FXML
    private TextField prodProductIDTB;
    @FXML
    private TextField prodProductNameTB;
    @FXML
    private TextField prodProductInvLevelTB;
    @FXML
    private TextField prodProductPrice;
    @FXML
    private TextField prodProductMaxTB;
    @FXML
    private TextField prodProductMinTB;
    @FXML
    private Label prodMainLabel;
    @FXML
    private TableView<?> prodCurrentPartTable;
    @FXML
    private Button prodSearchBtn;
    @FXML
    private TextField productSearchTB;
    @FXML
    private Button prodAddPartBtn;
    @FXML
    private TableView<?> prodAvailablePartTable;
    @FXML
    private Button prodDeletePartBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
