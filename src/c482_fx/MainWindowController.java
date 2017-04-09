package c482_fx;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MainWindowController implements Initializable  {

    @FXML
    private Button partUpdatePartBtn;

    @FXML
    private Button partDeletePartBtn;

    @FXML
    private Button partAddPartBtn;

    @FXML
    private TableView<Part> partsTable;

    @FXML
    private Button partSearchBtn;

    @FXML
    private TextField partSearchTB;

    @FXML
    private Button prodAddProdBtn;

    @FXML
    private TableView<?> prodTable;

    @FXML
    private Button prodSearchBtn;

    @FXML
    private TextField prodSearchTB;

    @FXML
    private Button mainExitBtn;
    
    private Inventory inventory;
    

      @FXML
    void onAddPartsBtnClicked(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader;
            fxmlLoader = new FXMLLoader(getClass().getResource("AddModifyPart.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                
                AddModifyPartController controller = fxmlLoader.<AddModifyPartController>getController();
                Part part = new InHouse();
                part.setPartID(-1);
            
                controller.setPart(part);
            
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));  
                stage.show();
        } catch(Exception e) {
           e.printStackTrace();
          }
    }

    @FXML
    void onDeletePartBtnClicked(MouseEvent event) {

    }

    @FXML
    void onDeleteProdBtnClicked(MouseEvent event) {

    }

    @FXML
    void onExitBtnClicked(MouseEvent event) {
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    void onPartSearchBtnClicked(MouseEvent event) {

    }

    @FXML
    void onProdAddBtnClicked(MouseEvent event) {

    }

    @FXML
    void onProdSearchBtnClicked(MouseEvent event) {

    }

    @FXML
    void onUpdatePartBtnClicked(MouseEvent event) {
        Part selPart = partsTable.getSelectionModel().getSelectedItem();
        
        if(selPart == null)
        {
            return;
        }
         try {
            FXMLLoader fxmlLoader;
            fxmlLoader = new FXMLLoader(getClass().getResource("AddModifyPart.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                
                AddModifyPartController controller = fxmlLoader.<AddModifyPartController>getController();
                
            
                controller.setPart(selPart);
            
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));  
                stage.show();
        } catch(Exception e) {
           e.printStackTrace();
          }
    }

    @FXML
    void onUpdateProdBtnClicked(MouseEvent event) {

    }

    @FXML
    void prodDeleteProdBtn(ActionEvent event) {

    }

    @FXML
    void prodUpdateProdBtn(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initInventory();
       
        
    }    
    
   
    
    private void initParts()
    {
        inventory.addPart( new InHouse("IH - Part 1", 5.00, 5,1,5, 200) );
        inventory.addPart( new InHouse("IH - Part 2", 5.00, 5,1,5, 200) );
        inventory.addPart( new InHouse("IH - Part 3", 5.00, 5,1,5, 200) );
        inventory.addPart( new InHouse("IH - Part 4", 5.00, 5,1,5, 200) );
        
        inventory.addPart( new Outsourced("OS - Part 1", 5.00, 5,1,5, "ACME") );
        inventory.addPart( new Outsourced("OS - Part 2", 5.00, 5,1,5, "ACME") );
        inventory.addPart( new Outsourced("OS - Part 3", 5.00, 5,1,5, "ACME") );
        inventory.addPart( new Outsourced("OS - Part 4", 5.00, 5,1,5, "ACME") );
        
    }
    
    private void initProducts()
    {
       
    }
    
    private void initInventory()
    {
        inventory = new Inventory();
        
        initParts();
        initProducts();
        initPartsTable(inventory.getParts());
       
        
    }
    
    private void initPartsTable(ArrayList<Part> data)
    {
        ObservableList<Part> partList = FXCollections.observableArrayList(data);
       
        
        TableColumn<Part, String> partID = new TableColumn<>("Part ID");
        partID.setCellValueFactory(new PropertyValueFactory<>("partID"));
        partsTable.getColumns().add(partID);
        
        TableColumn<Part, String> partName = new TableColumn<>("Part Name");
        partName.setCellValueFactory(new PropertyValueFactory<>("name"));
        partsTable.getColumns().add(partName);
        
        TableColumn<Part, String> partInv = new TableColumn<>("Inventory Level");
        partInv.setCellValueFactory(new PropertyValueFactory<>("instock"));
        partsTable.getColumns().add(partInv);
        
        TableColumn<Part, Double> partPrice = new TableColumn<>("Price/Cost per unit");
        //NumberFormat.getCurrencyInstance().format(prods.get(i).getPrice())
        partPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        partsTable.getColumns().add(partPrice);
        
        partsTable.setItems(partList);
        
    }
    
    private void  initProductsTable()
    {
 
    }
}
