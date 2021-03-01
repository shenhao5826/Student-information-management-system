package application;

import java.util.Optional;
import JDBC.Newinsert;
import JDBC.selectsno;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Insert extends Application {
	public static void main(String[] args) {
		
		launch(args);
		
	}

	String number;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
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
		Label slno11 = new Label("入学年份");
		slno11.setMaxWidth(Double.MAX_VALUE);
		slno11.setAlignment(Pos.CENTER);
		Label sid11 = new Label("系号");
		sid11.setMaxWidth(Double.MAX_VALUE);
		sid11.setAlignment(Pos.CENTER);
		Label dno11 = new Label("身份证号");
		dno11.setMaxWidth(Double.MAX_VALUE);
		dno11.setAlignment(Pos.CENTER);
		Label syear11 = new Label("班级");
		syear11.setMaxWidth(Double.MAX_VALUE);
		syear11.setAlignment(Pos.CENTER);
		Label sduration11 = new Label("学制");
		sduration11.setMaxWidth(Double.MAX_VALUE);
		sduration11.setAlignment(Pos.CENTER);
		
		Label sno = new Label();
		selectsno insert = new selectsno();
		sno.setMaxWidth(Double.MAX_VALUE);
		sno.setAlignment(Pos.CENTER);
		sno.setText(Integer.toString(insert.out()+1));
		
		TextField sname = new TextField();
		sname.setMaxWidth(Double.MAX_VALUE);
		sname.setAlignment(Pos.CENTER);
		
		ChoiceBox<String> ssex = new ChoiceBox<String>();
		ssex.setItems(FXCollections.observableArrayList(
				"男", "女 " )
		);
		
		
		
		TextField sage = new TextField();
		sage.setMaxWidth(Double.MAX_VALUE);
		sage.setAlignment(Pos.CENTER);
		
		ChoiceBox<String> setnic = new ChoiceBox<String>();
		setnic.setItems(FXCollections.observableArrayList(
				"汉族","蒙古族","回族","藏族","维吾尔族",
				"苗族","彝族","壮族","布依族","朝鲜族",
				"满族","侗族","瑶族","白族","土家族",
				"哈尼族","哈萨克族","傣族","黎族","僳僳族",
				"佤族","畲族","高山族","拉祜族","水族",
				"东乡族","纳西族","景颇族","柯尔克孜族",
				"土族","达斡尔族","仫佬族","羌族","布朗族",
				"撒拉族","毛南族","仡佬族","锡伯族","阿昌族",
				"普米族","塔吉克族","怒族","乌孜别克族","俄罗斯族",
				"鄂温克族","德昂族","保安族","裕固族","京族","塔塔尔族",
				"独龙族","鄂伦春族","赫哲族","门巴族","珞巴族","基诺族" )
		);
		
		TextField syear = new TextField();
		syear.setMaxWidth(Double.MAX_VALUE);
		syear.setAlignment(Pos.CENTER);
		
		//下拉菜单文本对应数据库值
		ChoiceBox<String> dno = new ChoiceBox<String>();
		dno.setItems(FXCollections.observableArrayList(
				"电子科学与技术","电子信息工程","通信工程","信息安全","计算机科学与技术",
				"数学与应用数学","统计学","信息与计算科学","土木工程","道路桥梁与渡河工程",
				"交通设备与控制工程","建筑环境与能源应用工程","工业设计","建筑学","城乡规划",
				"生物医学工程","生物工程","制药工程","市场营销","工程管理",
				"会计学","国际经济与贸易","物流管理","能源经济","电子商务" )
		);
		
		String[] str = new String[] {"1000","1001","1002","1003","1004","1010",
				"1011","1012","1020","1021","1022","1023","1030","1031","1032",
				"1040","1041","1042","1050","1051","1052","1053","1054","1055","1056"};
		
		dno.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				// TODO 自动生成的方法存根
				number = str[arg2.intValue()];
			}
		});
		
		
		TextField sid = new TextField();
		sid.setMaxWidth(Double.MAX_VALUE);
		sid.setAlignment(Pos.CENTER);
		
		TextField clno = new TextField();
		clno.setMaxWidth(Double.MAX_VALUE);
		clno.setAlignment(Pos.CENTER);
		
		ChoiceBox<String> sduration = new ChoiceBox<String>();
		sduration.setItems(FXCollections.observableArrayList(
				"3","4","5")
		);
		
		sgr1.setAlignment(Pos.CENTER);
		
		sgr1.add(sno11, 1, 0);
		sgr1.add(sname11, 2, 0);
		sgr1.add(ssex11, 3, 0);
		sgr1.add(sage11, 4, 0);
		sgr1.add(setnic11, 5, 0);
		sgr1.add(slno11, 6, 0);
		sgr1.add(sid11, 7, 0);
		sgr1.add(dno11, 8, 0);
		sgr1.add(syear11, 9, 0);
		sgr1.add(sduration11, 10, 0);
		
		sgr1.add(sno, 1, 1);
		sgr1.add(sname, 2, 1);
		sgr1.add(ssex, 3, 1);
		sgr1.add(sage, 4, 1);
		sgr1.add(setnic, 5, 1);
		sgr1.add(syear, 6, 1);
		sgr1.add(dno, 7, 1);
		sgr1.add(sid, 8, 1);
		sgr1.add(clno, 9, 1);
		sgr1.add(sduration, 10, 1);
		
		GridPane sgr2 = new GridPane();
		
		Button submit = new Button();
		submit.setText("提交");
		
		submit.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Newinsert insert = new Newinsert(sno.getText(), sname.getText(), (String) ssex.getValue(), sage.getText(),
						(String) setnic.getValue(), syear.getText(), number, sid.getText(), clno.getText(), (String) sduration.getValue()); 
			
			    Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
			    //设置对话框标题
			    alert2.setTitle("添加情况");
			    //设置内容
				if(insert.isInsert == true) {
					alert2.setHeaderText("添加成功");
				}else {
					alert2.setHeaderText("添加失败");
				}
				Optional<ButtonType> result = alert2.showAndWait();
				if(insert.isInsert == true && result.get() == ButtonType.OK) {
					alert2.close();
					primaryStage.close();
				}
			}
		});
		
		Button cancel = new Button();
		cancel.setText("取消");
		
		cancel.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				primaryStage.close();
			}
		});
		
		BorderPane sbor = new BorderPane();
		
		sgr2.add(submit, 1, 0);
		sgr2.add(cancel, 2, 0);
		sgr2.setAlignment(Pos.TOP_CENTER);
		
		sbor.setAlignment(submit, Pos.CENTER);
		
		sbor.setTop(sgr1);
		sbor.setBottom(sgr2);
		
		Scene scene = new Scene(sbor);
		primaryStage.setScene(scene);
		
		primaryStage.getIcons().add(new Image("/Icon/Icon.png"));
		primaryStage.initModality(Modality.APPLICATION_MODAL);
		primaryStage.show();
		
	}
}
