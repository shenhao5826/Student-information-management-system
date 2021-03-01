package application;

import java.util.Optional;

import JDBC.Newdelete;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class Delete {
	
	private String snoo = Window.snoo;
	
	public void start()  {
		
		Alert alert3 = new Alert(Alert.AlertType.CONFIRMATION);
	    alert3.setTitle("删除提示");
	    
	    alert3.setHeaderText("是否确认删除"+snoo+"！");
	    	
	    Optional<ButtonType> result = alert3.showAndWait();
	    
	    if (result.isPresent() && result.get() == ButtonType.OK){
	    	Newdelete delete = new Newdelete(snoo);
	    	if(delete.isdelete == true) {
	    		Alert alert4 = new Alert(Alert.AlertType.INFORMATION);
	    	    alert3.setTitle("删除提示");
	    	    alert3.setHeaderText("删除成功！");
	    	    Optional<ButtonType> result1 = alert3.showAndWait();
	    	}
	    }
	}
}
