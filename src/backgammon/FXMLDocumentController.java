/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backgammon;

import java.awt.Paint;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import java.util.concurrent.ThreadLocalRandom;
import javafx.scene.control.Button;

/**
 *
 * @author john
 */
public class FXMLDocumentController implements Initializable {
  
  @FXML
  private ImageView StartBlueBigOne;
  @FXML
  private AnchorPane AnchorPane;
  @FXML
  private Circle RedOne;  
  @FXML
  private VBox StartRedBigOne;   
  @FXML
  private TextField DiceResultOne;  
  @FXML
  private TextField DiceResultTwo;   
  @FXML
  private Button Starter;     
  
  @FXML
  private void StartGameA(ActionEvent event) {
    Circle blP = new Circle(30);
    
    
    StartRedBigOne.getChildren().add(RedOne);
    RedOne.relocate(10, 20);
    Starter.setVisible(false);
  }

  @FXML
  private void RollDiceB(ActionEvent event){
    int min = 1;
    int max = 6;
    int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
    DiceResultOne.setText(Integer.toString(randomNum));
    randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
    DiceResultTwo.setText(Integer.toString(randomNum));
  }  
  
  
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  
  
}
