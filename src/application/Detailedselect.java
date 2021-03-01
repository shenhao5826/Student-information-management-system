package application;

import JDBC.Newdetailedselect;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Detailedselect extends Application {
	public static void main(String[] args) {
		
		launch(args);
		
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Newdetailedselect detailedselect = new Newdetailedselect(Window.snoo);
		
		GridPane sgr1 = new GridPane();
		
		Label sno11 = new Label("学号");	
		sno11.setMaxWidth(Double.MAX_VALUE);
		sno11.setAlignment(Pos.CENTER);
		Label sname11 = new Label("姓名");
		sname11.setMaxWidth(Double.MAX_VALUE);
		sname11.setAlignment(Pos.CENTER);
		Label ssex11 = new Label("性别");
		ssex11.setMaxWidth(Double.MAX_VALUE);
		ssex11.setAlignment(Pos.CENTER);
		Label sage11 = new Label("年龄");
		sage11.setMaxWidth(Double.MAX_VALUE);
		sage11.setAlignment(Pos.CENTER);
		Label setnic11 = new Label("民族");
		setnic11.setMaxWidth(Double.MAX_VALUE);
		setnic11.setAlignment(Pos.CENTER);
		Label syear11 = new Label("入学年份");
		syear11.setMaxWidth(Double.MAX_VALUE);
		syear11.setAlignment(Pos.CENTER);
		Label sid11 = new Label("身份证号");
		sid11.setMaxWidth(Double.MAX_VALUE);
		sid11.setAlignment(Pos.CENTER);
		Label sduration11 = new Label("学制");
		sduration11.setMaxWidth(Double.MAX_VALUE);
		sduration11.setAlignment(Pos.CENTER);
		Label dname11 = new Label("所在系");
		dname11.setMaxWidth(Double.MAX_VALUE);
		dname11.setAlignment(Pos.CENTER);
		Label coname11 = new Label("所在学院");
		coname11.setMaxWidth(Double.MAX_VALUE);
		coname11.setAlignment(Pos.CENTER);
		Label clname11 = new Label("所在班级");
		clname11.setMaxWidth(Double.MAX_VALUE);
		clname11.setAlignment(Pos.CENTER);
		
		sgr1.setPadding(new Insets(30));
		sgr1.setMargin(sno11, new Insets(10));
		sgr1.setMargin(sname11, new Insets(10));
		sgr1.setMargin(ssex11, new Insets(10));
		sgr1.setMargin(sage11, new Insets(10));
		sgr1.setMargin(setnic11, new Insets(10));
		sgr1.setMargin(syear11, new Insets(10));
		sgr1.setMargin(sid11, new Insets(10));
		sgr1.setMargin(sduration11, new Insets(10));
		sgr1.setMargin(dname11, new Insets(10));
		sgr1.setMargin(coname11, new Insets(10));
		sgr1.setMargin(clname11, new Insets(10));
		
		Label sno = new Label();	
		sno.setMaxWidth(Double.MAX_VALUE);
		sno.setAlignment(Pos.CENTER);
		Label sname = new Label();
		sname.setMaxWidth(Double.MAX_VALUE);
		sname.setAlignment(Pos.CENTER);
		Label ssex = new Label();
		ssex.setMaxWidth(Double.MAX_VALUE);
		ssex.setAlignment(Pos.CENTER);
		Label sage = new Label();
		sage.setMaxWidth(Double.MAX_VALUE);
		sage.setAlignment(Pos.CENTER);
		Label setnic = new Label();
		setnic.setMaxWidth(Double.MAX_VALUE);
		setnic.setAlignment(Pos.CENTER);
		Label syear = new Label();
		syear.setMaxWidth(Double.MAX_VALUE);
		syear.setAlignment(Pos.CENTER);
		Label sid = new Label();
		sid.setMaxWidth(Double.MAX_VALUE);
		sid.setAlignment(Pos.CENTER);
		Label sduration = new Label();
		sduration.setMaxWidth(Double.MAX_VALUE);
		sduration.setAlignment(Pos.CENTER);
		Label dname = new Label();
		dname.setMaxWidth(Double.MAX_VALUE);
		dname.setAlignment(Pos.CENTER);
		Label coname = new Label();
		coname.setMaxWidth(Double.MAX_VALUE);
		coname.setAlignment(Pos.CENTER);
		Label clname = new Label();
		clname.setMaxWidth(Double.MAX_VALUE);
		clname.setAlignment(Pos.CENTER);
		
		sno.setText(detailedselect.getSno());
		sname.setText(detailedselect.getSname());
		ssex.setText(detailedselect.getSsex());
		sage.setText(detailedselect.getSage());
		setnic.setText(detailedselect.getSetnic());
		syear.setText(detailedselect.getSyear());
		sid.setText(detailedselect.getSid());
		sduration.setText(detailedselect.getSduration());
		dname.setText(detailedselect.getDname());
		coname.setText(detailedselect.getConame());
		clname.setText(detailedselect.getClname());
		
		sgr1.setAlignment(Pos.CENTER);
		
		sgr1.add(sno11, 1, 0);
		sgr1.add(sname11, 4, 0);
		sgr1.add(ssex11, 1, 1);
		sgr1.add(sage11, 4, 1);
		sgr1.add(setnic11, 1, 2);
		sgr1.add(syear11, 4, 2);
		sgr1.add(sid11, 1, 3);
		sgr1.add(sduration11, 4, 3);
		sgr1.add(dname11, 4, 4);
		sgr1.add(coname11, 1, 5);
		sgr1.add(clname11, 1, 4);
		
		sgr1.add(sno, 2, 0);
		sgr1.add(sname, 5, 0);
		sgr1.add(ssex, 2, 1);
		sgr1.add(sage, 5, 1);
		sgr1.add(setnic, 2, 2);
		sgr1.add(syear, 5, 2);
		sgr1.add(sid, 2, 3);
		sgr1.add(sduration, 5, 3);
		sgr1.add(dname, 5, 4);
		sgr1.add(coname, 2, 5);
		sgr1.add(clname, 2, 4);
		
		Scene scene = new Scene(sgr1);
		
		primaryStage.setScene(scene);

		primaryStage.getIcons().add(new Image("/Icon/Icon.png"));
		primaryStage.initModality(Modality.APPLICATION_MODAL);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
}
