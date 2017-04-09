/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c482_fx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

/**
 * FXML Controller class
 *
 * @author Mike
 */
public class AddModifyPartController implements Initializable {

    @FXML
    private TextField partPartIDTB;
    @FXML
    private TextField partPartNameTB;
    @FXML
    private TextField partPartCostTB;
    @FXML
    private TextField partPartCompanyNameTB;
    @FXML
    private TextField partMachineIDTB;
    @FXML
    private TextField partPartInvLevelTB;
    @FXML
    private TextField partMaxInvTB;
    @FXML
    private TextField partMinInvTB;
    @FXML
    private RadioButton partInhouseRadio;
    @FXML
    private ToggleGroup Group1;
    @FXML
    private RadioButton partOutsourceRadio;
    @FXML
    private Button partSaveBtn;
    @FXML
    private Button partCancelBtn;
    @FXML
    private Label partCategoryLbl = new Label();
    
    @FXML
    private GridPane gridPane;

    private Part part;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    public void init()
    {
        if(this.part != null)
        {
            partPartNameTB.textProperty().bindBidirectional(this.part.getPartNameProperty());     
            partPartCostTB.textProperty().bind(Bindings.concat("$").concat(this.part.getPriceProperty()));
            
            StringConverter<Number> conv = new NumberStringConverter();
            
            partPartInvLevelTB.textProperty().bindBidirectional(this.part.getInstockProperty(), conv);     
            partMaxInvTB.textProperty().bindBidirectional(this.part.getMaxProperty(), conv);  
            partMinInvTB.textProperty().bindBidirectional(this.part.getMinProperty(), conv);  
           
        
            if(this.part instanceof InHouse)
            {
                
               partMachineIDTB.setVisible(true);
               partPartCompanyNameTB.setVisible(false);
                partCategoryLbl.setText("Machine ID");
                partInhouseRadio.setSelected(true);
                partOutsourceRadio.setSelected(false);
                 
            }else{
                partMachineIDTB.setVisible(false);
                partPartCompanyNameTB.setVisible(true);
                partCategoryLbl.setText("Company Name");
                partOutsourceRadio.setSelected(true);  
                partInhouseRadio.setSelected(false);
                
            }
           
        }
    }
    
    public void setPart(Part inPart)
    {
        this.part = inPart;   
        init();
        
    }
   
    
}
