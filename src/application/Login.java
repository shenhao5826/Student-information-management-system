package application;

import java.util.Optional;
import JDBC.Loginutils;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Login extends Application {

	public static void main(String[] args) {

		launch(args);

	}

	private double x1;
	private double y1;
	private double x_primaryStage;
	private double y_primaryStage;
	private boolean istab = true;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("学生信息管理系统");
		primaryStage.getIcons().add(new Image("/Icon/Icon.png"));
		primaryStage.setWidth(432.6);
		primaryStage.setHeight(700);
		primaryStage.setResizable(false);// 不可改变窗口大小
		primaryStage.initStyle(StageStyle.DECORATED);

		Label l1 = new Label("学生信息\n管理系统");
		l1.setFont(Font.font(50));
		l1.setStyle("-fx-font-family:'幼圆'");
		l1.setTextFill(Paint.valueOf("white"));

		TextField seradd = new TextField();
		seradd.setPromptText("请输入信息系统服务器地址");
		seradd.setFocusTraversable(istab);
		seradd.setPrefHeight(42);
		seradd.setPrefWidth(297);
		seradd.setStyle("-fx-background-radius: 15px;"
				+ "-fx-background-color:#0088c6;");
		seradd.setLayoutY(0);
		// 监听传参，test2、pw1类似
		seradd.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				// TODO 自动生成的方法存根

			}
		});

		TextField login = new TextField();
		login.setPromptText("请输入用户名");
		login.setFocusTraversable(istab);
		login.setPrefHeight(42);
		login.setPrefWidth(297);
		login.setStyle("-fx-background-radius: 15px;" + "-fx-background-color:#0088c6;");
		login.setLayoutY(50);

		PasswordField pw1 = new PasswordField();
		pw1.setPromptText("请输入密码");
		pw1.setFocusTraversable(istab);
		pw1.setPrefHeight(42);
		pw1.setPrefWidth(297);
		pw1.setStyle("-fx-background-radius: 15px;" + "-fx-background-color:#0088c6;");
		pw1.setLayoutY(100);

		Button b1 = new Button();
		b1.setText("登	录");
		b1.setPrefHeight(42);
		b1.setPrefWidth(297);
		b1.setLayoutY(150);
		b1.setStyle("-fx-background-radius: 15px;" + "-fx-background-color:#ffffff;");

		b1.setOnMouseMoved(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				b1.setStyle("-fx-background-radius: 15px;"
						+ "-fx-background-color:#0088c6;");
				
			}
		});
		
		b1.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				
				b1.setStyle("-fx-background-radius: 15px;"
						+ "-fx-background-color:#ffffff;");
			}
		});
		
		GridPane gr = new GridPane();
		gr.setStyle("-fx-background-color:#00a0e9");
		
		//自定义退出按钮
		Image iquit = new Image("/Icon/quit.png");
		ImageView vi1 = new ImageView(iquit);
		Button quit = new Button();
		quit.setAlignment(Pos.CENTER);
		quit.setPrefHeight(25);
		quit.setPrefWidth(25);
		quit.setStyle("-fx-background-radius: 0px;"
				+ "-fx-background-position:center;"
				+ "-fx-background-color:#00a0e9;"
				+ "-fx-background-image:url('/Icon/quit.png');"
				+ "-fx-background-size: 15px;"
				+ "-fx-background-repeat:no-repeat");
		vi1.setFitHeight(20);
		vi1.setFitWidth(20);
		quit.setLayoutX(407.6);
		
		quit.setOnMouseMoved(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				
				quit.setStyle("-fx-background-radius: 0px;"
						+ "-fx-background-position:center;"
						+ "-fx-background-color:red;"
						+ "-fx-background-image:url('/Icon/quit.png');"
						+ "-fx-background-size: 15px;"
						+ "-fx-background-repeat:no-repeat");
				
			}
		});
		
		quit.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				
				quit.setStyle("-fx-background-radius: 0px;"
						+ "-fx-background-position:center;"
						+ "-fx-background-color:#00a0e9;"
						+ "-fx-background-image:url('/Icon/quit.png');"
						+ "-fx-background-size: 15px;"
						+ "-fx-background-repeat:no-repeat");
				
			}
		});
		
		//确认退出按钮，使用自有类实现
		quit.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				
				    Alert alert2 = new Alert(Alert.AlertType.CONFIRMATION);
				    //设置对话框标题
				    alert2.setTitle("退出");
				     //设置内容
				    alert2.setHeaderText("你确定要退出吗？");
				    //显示对话框
				    Optional<ButtonType> result = alert2.showAndWait();
				    if (result.get() == ButtonType.OK){
				    	primaryStage.close();
				    }
			}
		});
		
		//自定义最小化按钮
		Image imix = new Image("/Icon/mix.png");
		ImageView vi2 = new ImageView(imix);
		Button mix = new Button();
		mix.setPrefHeight(25);
		mix.setPrefWidth(25);
		mix.setStyle("-fx-background-radius: 0px;"
				+ "-fx-background-color:#00a0e9;"
				+ "-fx-background-image:url('/Icon/mix.png');"
				+ "-fx-background-size: 15px;"
				+ "-fx-background-position:center;"
				+ "-fx-background-repeat:no-repeat");
		vi2.setFitHeight(20);
		vi2.setFitWidth(20);
		mix.setLayoutX(382.6);
		mix.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				primaryStage.setIconified(true);
			}
		});
		
		mix.setOnMouseMoved(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				
				mix.setStyle("-fx-background-radius: 0px;"
						+ "-fx-background-position:center;"
						+ "-fx-background-color:#767676;"
						+ "-fx-background-image:url('/Icon/mix.png');"
						+ "-fx-background-size: 15px;"
						+ "-fx-background-repeat:no-repeat");
				
			}
		});
		
		mix.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				
				mix.setStyle("-fx-background-radius: 0px;"
						+ "-fx-background-position:center;"
						+ "-fx-background-color:#00a0e9;"
						+ "-fx-background-image:url('/Icon/mix.png');"
						+ "-fx-background-size: 15px;"
						+ "-fx-background-repeat:no-repeat");
				
			}
		});
		
		gr.add(l1, 1, 10);
		gr.add(seradd, 1, 19);
		gr.add(login, 1, 20);
		gr.add(pw1, 1, 21);
		gr.add(b1, 1, 25);

		//label节点实现居中
		l1.setMaxWidth(Double.MAX_VALUE);
		l1.setAlignment(Pos.CENTER);
		
		gr.setGridLinesVisible(false);
		
		gr.setAlignment(Pos.TOP_CENTER);

		gr.setHgap(0);
		gr.setVgap(10);
		
		//BorderPane布局顶部实现最小化、退出按钮的位置
		AnchorPane ap = new AnchorPane();
		ap.getChildren().addAll(mix,quit);
		
		BorderPane bor = new BorderPane();
		bor.setStyle("-fx-background-color:#00a0e9");
		
		//BorderPane布局顶部的ap布局
		bor.setTop(ap);		
		bor.setAlignment(ap, Pos.TOP_RIGHT);
		bor.setCenter(gr);
		
		Scene scene = new Scene(bor);
		primaryStage.setScene(scene);

		// 单机事件判断MySQL认证是否成功，并跳转窗口
		b1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				Loginutils aaaa = new Loginutils();
				aaaa.getLogin(seradd.getText(), login.getText(), pw1.getText());
				
				Alert alert3 = new Alert(Alert.AlertType.INFORMATION);
			    alert3.setTitle("登录提示");
			    if(aaaa.getislogin() == true) {
			    	
			    	alert3.setHeaderText("登陆成功！");
			    	
			    }else {
			    	alert3.setHeaderText("登陆失败，请重新检查登录信息是否正确！");
			    }
			    Optional<ButtonType> result = alert3.showAndWait();
			    if(aaaa.getislogin() == true && result.get() == ButtonType.OK) {
			    	try {
			    		primaryStage.hide();
						new Window().start(new Stage());
					} catch (Exception e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
			    }
			}
		});
		
		// 快捷键：回车登录，并跳转窗口
		KeyCombination enter = new KeyCodeCombination(KeyCode.ENTER);
		scene.getAccelerators().put(enter, new Runnable() {

			@Override
			public void run() {
				
				Loginutils aaaa = new Loginutils();
				aaaa.getLogin(seradd.getText(), login.getText(), pw1.getText());
				
				Alert alert3 = new Alert(Alert.AlertType.INFORMATION);
			    alert3.setTitle("登录提示");
			    if(aaaa.getislogin() == true) {
			    	
			    	alert3.setHeaderText("登陆成功！");
			    	
			    }else {
			    	alert3.setHeaderText("登陆失败，请重新检查登录信息是否正确！");
			    }
			    Optional<ButtonType> result = alert3.showAndWait();
			    if(aaaa.getislogin() == true && result.get() == ButtonType.OK) {
			    	try {
			    		primaryStage.hide();
						new Window().start(new Stage());
					} catch (Exception e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
			    }
				
		}});

		//无边框实现拖动
		scene.setOnMouseDragged(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent m) {

				// 计算
				primaryStage.setX(x_primaryStage + m.getScreenX() - x1);
				primaryStage.setY(y_primaryStage + m.getScreenY() - y1);

			}
		});
		scene.setOnDragEntered(null);
		scene.setOnMousePressed(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent m) {

				// 按下鼠标后，记录当前鼠标的坐标
				x1 = m.getScreenX();
				y1 = m.getScreenY();
				x_primaryStage = primaryStage.getX();
				y_primaryStage = primaryStage.getY();

			}
		});

		
		primaryStage.initStyle(StageStyle.TRANSPARENT);
		primaryStage.show();
		
	}
}