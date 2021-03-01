package application;

import java.util.HashMap;
import java.util.Optional;
import JDBC.Loginutils;
import JDBC.Newselect;
import JDBC.Privilegeutils;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;

public class Window extends Application {
	public static void main(String[] args) {
		
		launch(args);
		
	}
	
	private double x1;
	private double y1;
	public static String snoo;
	private double x_primaryStage;
	private double y_primaryStage;
	private boolean issnoo = true;
	public static String newselect1;
	private TableView<HashMap<String, SimpleStringProperty>> tab = new TableView<HashMap<String, SimpleStringProperty>>();
	
	public void start(Stage primaryStage) throws Exception {
		
		Privilegeutils a = new Privilegeutils();
		String aa = Loginutils.user;
		a.getPrivilege();
		a.isadmin();
		
		primaryStage.setWidth(432.6);
		primaryStage.setHeight(700);
		
		GridPane sgr1 = new GridPane();
		
		Label sno1 = new Label("学号"+" ");
		sno1.setFont(Font.font(17));
		sno1.setStyle("-fx-font-family:'幼圆'");
		sno1.setMaxWidth(Double.MAX_VALUE);
		sno1.setAlignment(Pos.CENTER);
		TextField textfield1 = new TextField();
		textfield1.setPromptText("填写学生学号！");
		textfield1.setPrefHeight(25);
		textfield1.setPrefWidth(200);
		textfield1.setFocusTraversable(false);
		textfield1.setStyle("-fx-background-radius: 7px;" + "-fx-background-color:#0088c6;");
		
		Label sname1 = new Label("姓名"+" ");
		sname1.setFont(Font.font(17));
		sname1.setStyle("-fx-font-family:'幼圆'");
		sname1.setMaxWidth(Double.MAX_VALUE);
		sname1.setAlignment(Pos.CENTER);
		TextField textfield2 = new TextField();
		textfield2.setPromptText("填写学生姓名!");
		textfield2.setPrefHeight(25);
		textfield2.setPrefWidth(200);
		textfield2.setFocusTraversable(false);
		textfield2.setStyle("-fx-background-radius: 7px;" + "-fx-background-color:#0088c6;");

		Button select = new Button();
		select.setText("查询");
		select.setPrefHeight(30);
		select.setPrefWidth(100);
		select.setStyle("-fx-background-radius: 7px;" + "-fx-background-color:#ffffff;");

		select.setOnMouseMoved(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				select.setStyle("-fx-background-radius: 7px;"
						+ "-fx-background-color:#0088c6;");
				
			}
		});
		
		select.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				
				select.setStyle("-fx-background-radius: 7px;"
						+ "-fx-background-color:#ffffff;");
				
			}
		});
		select.setMaxWidth(Double.MAX_VALUE);
		select.setAlignment(Pos.CENTER);
		
		GridPane sgr11 = new GridPane();
		sgr11.setAlignment(Pos.CENTER);
		
		sgr11.add(select, 1, 0);
		
		sgr1.add(sno1, 1, 0);
		sgr1.add(textfield1, 3, 0);
		sgr1.setMargin(sno1, new Insets(5));
		
		sgr1.add(sname1, 1, 2);
		sgr1.add(textfield2, 3, 2);
		sgr1.setMargin(sname1, new Insets(5));
		
		sgr1.add(sgr11, 1 ,4,4,4);
		sgr1.setMargin(sgr11, new Insets(10));
		
		sgr1.setAlignment(Pos.CENTER);
		
		BorderPane sbor = new BorderPane();
		
		sbor.setCenter(tab);
		
		select.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				if(textfield1.getText() != "") {
					newselect1 = textfield1.getText();
				}else if(textfield2.getText() != ""){
					newselect1 = textfield2.getText();
				}else {
					newselect1 = "";
				}
					Newselect newselect = new Newselect(newselect1);
					//判断是否有查询信息
					//判断问题
					if(newselect.getisinformation()) {
						tab = new TableView<HashMap<String, SimpleStringProperty>>(newselect.out());
						TableColumn<HashMap<String, SimpleStringProperty>,String> tc1 = new TableColumn("学号");
						tc1.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<HashMap<String, SimpleStringProperty>,String>, ObservableValue<String>>() {

							@Override
							public ObservableValue<String> call(CellDataFeatures<HashMap<String, SimpleStringProperty>, String> arg0) {
								// TODO 自动生成的方法存根
								return arg0.getValue().get("sno");
							}
						});
						
						TableColumn<HashMap<String, SimpleStringProperty>,String> tc2 = new TableColumn("姓名");
						tc2.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<HashMap<String, SimpleStringProperty>,String>, ObservableValue<String>>() {

							@Override
							public ObservableValue<String> call(CellDataFeatures<HashMap<String, SimpleStringProperty>, String> arg0) {
								// TODO 自动生成的方法存根
								return arg0.getValue().get("sname");
							}
						});
						
						TableColumn<HashMap<String, SimpleStringProperty>,String> tc3 = new TableColumn("性别");
						tc3.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<HashMap<String, SimpleStringProperty>,String>, ObservableValue<String>>() {

							@Override
							public ObservableValue<String> call(CellDataFeatures<HashMap<String, SimpleStringProperty>, String> arg0) {
								// TODO 自动生成的方法存根
								return arg0.getValue().get("ssex");
							}
						});
						
						TableColumn<HashMap<String, SimpleStringProperty>,String> tc4 = new TableColumn("年龄");
						tc4.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<HashMap<String, SimpleStringProperty>,String>, ObservableValue<String>>() {

							@Override
							public ObservableValue<String> call(CellDataFeatures<HashMap<String, SimpleStringProperty>, String> arg0) {
								// TODO 自动生成的方法存根
								return arg0.getValue().get("sage");
							}
						});
						
						TableColumn<HashMap<String, SimpleStringProperty>,String> tc5 = new TableColumn("班级");
						tc5.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<HashMap<String, SimpleStringProperty>,String>, ObservableValue<String>>() {

							@Override
							public ObservableValue<String> call(CellDataFeatures<HashMap<String, SimpleStringProperty>, String> arg0) {
								// TODO 自动生成的方法存根
								return arg0.getValue().get("clname");
							}
						});
						
						tab.getColumns().add(tc1);
						tab.getColumns().add(tc2);
						tab.getColumns().add(tc3);
						tab.getColumns().add(tc4);
						tab.getColumns().add(tc5);
						
						tab.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<HashMap<String,SimpleStringProperty>>() {
						
						@Override
						public void changed(ObservableValue<? extends HashMap<String, SimpleStringProperty>> arg0,
								HashMap<String, SimpleStringProperty> arg1, HashMap<String, SimpleStringProperty> arg2) {
							// TODO 自动生成的方法存根
							snoo = arg2.get("sno").getValue();
							
						}
					});
						
						sbor.setCenter(tab);
				}else {
					Alert alert3 = new Alert(Alert.AlertType.ERROR);
				    alert3.setTitle("查询错误");
				    alert3.setHeaderText("查无此人，请重新输入信息");
				    Optional<ButtonType> result = alert3.showAndWait();
				}
			}
			});
		
		
		
		GridPane sgr3 = new GridPane();
		
		Button detailedselect = new Button();
		detailedselect.setText("详细查询");
		detailedselect.setAlignment(Pos.CENTER);
		detailedselect.setPrefHeight(30);
		detailedselect.setPrefWidth(70);
		detailedselect.setStyle("-fx-background-radius: 7px;" + "-fx-background-color:#ffffff;");

		detailedselect.setOnMouseMoved(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				detailedselect.setStyle("-fx-background-radius: 7px;"
						+ "-fx-background-color:#0088c6;");
				
			}
		});
		
		detailedselect.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				
				detailedselect.setStyle("-fx-background-radius: 7px;"
						+ "-fx-background-color:#ffffff;");
			}
		});
		
		detailedselect.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
			    	try {
			    		if(snoo == null) {
			    			
			    			Alert alert2 = new Alert(Alert.AlertType.WARNING);
						    //设置对话框标题
						    alert2.setTitle("出错");
						     //设置内容
						    alert2.setHeaderText("请先选择的人员信息");
						    //显示对话框
						    Optional<ButtonType> result = alert2.showAndWait();
						    
			    		}else {
			    			new Detailedselect().start(new Stage());
			    		}
					} catch (Exception e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
			}
		});
		
		Button creat = new Button();
		//添加学生
		creat.setText("增加信息");
		creat.setAlignment(Pos.CENTER);
		creat.setPrefHeight(30);
		creat.setPrefWidth(70);
		creat.setStyle("-fx-background-radius: 7px;" + "-fx-background-color:#ffffff;");

		creat.setOnMouseMoved(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				creat.setStyle("-fx-background-radius: 7px;"
						+ "-fx-background-color:#0088c6;");
				
			}
		});
		
		creat.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				
				creat.setStyle("-fx-background-radius: 7px;"
						+ "-fx-background-color:#ffffff;");
			}
		});
		
		creat.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
			    	try {
						new Insert().start(new Stage());
					} catch (Exception e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
			}
		});
		
		Button drop = new Button();
		drop.setText("删除信息");
		drop.setAlignment(Pos.CENTER);
		drop.setPrefHeight(30);
		drop.setPrefWidth(70);
		drop.setStyle("-fx-background-radius: 7px;" + "-fx-background-color:#ffffff;");

		drop.setOnMouseMoved(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				drop.setStyle("-fx-background-radius: 7px;"
						+ "-fx-background-color:#0088c6;");
				
			}
		});
		
		drop.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				
				drop.setStyle("-fx-background-radius: 7px;"
						+ "-fx-background-color:#ffffff;");
			}
		});
		
		drop.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
			    	try {
			    		if(snoo == null) {
			    			
			    			Alert alert2 = new Alert(Alert.AlertType.WARNING);
						    //设置对话框标题
						    alert2.setTitle("出错");
						     //设置内容
						    alert2.setHeaderText("请先选择的人员信息");
						    //显示对话框
						    Optional<ButtonType> result = alert2.showAndWait();
						    
			    		}else {
			    			Delete delete = new Delete();
				    		delete.start();
			    		}
					} catch (Exception e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
			}
		});
		
		Button update = new Button();
		update.setText("更改信息");
		update.setAlignment(Pos.CENTER);
		update.setPrefHeight(30);
		update.setPrefWidth(70);
		update.setStyle("-fx-background-radius: 7px;" + "-fx-background-color:#ffffff;");

		update.setOnMouseMoved(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				update.setStyle("-fx-background-radius: 7px;"
						+ "-fx-background-color:#0088c6;");
				
			}
		});
		
		update.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				
				update.setStyle("-fx-background-radius: 7px;"
						+ "-fx-background-color:#ffffff;");
			}
		});
		
		update.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
			    	try {
			    		if(snoo == null) {
			    			
			    			Alert alert2 = new Alert(Alert.AlertType.WARNING);
						    //设置对话框标题
						    alert2.setTitle("出错");
						     //设置内容
						    alert2.setHeaderText("请先选择的人员信息");
						    //显示对话框
						    Optional<ButtonType> result = alert2.showAndWait();
						    
			    		}else {
			    			new Update().start(new Stage());
			    		}
						
					} catch (Exception e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
			}
		});
		
		//管理员显示增删改
		if(a.getisadmin()) {
			primaryStage.setTitle(aa+"为管理员");
			sgr3.add(detailedselect, 1, 1);
			sgr1.setMargin(detailedselect, new Insets(5));
			sgr3.add(creat, 2, 1);
			sgr1.setMargin(creat, new Insets(5));
			sgr3.add(drop, 3, 1);
			sgr1.setMargin(drop, new Insets(5));
			sgr3.add(update, 4, 1);
			sgr1.setMargin(update, new Insets(5));
		}else {
			primaryStage.setTitle(aa+"为普通用户");
		}
		
		sgr1.setGridLinesVisible(false);
		sgr3.setGridLinesVisible(false);
		
		sgr1.setAlignment(Pos.CENTER);
		sgr3.setAlignment(Pos.CENTER);
		
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
				
		//BorderPane布局顶部实现最小化、退出按钮的位置
		AnchorPane ap = new AnchorPane();
		ap.getChildren().addAll(mix,quit);
		
		AnchorPane ap2 = new AnchorPane();
		ap2.getChildren().add(sgr1);
		
		ap.getChildren().add(ap2);
		ap.setTopAnchor(ap2, 25.0);
		ap2.setLayoutX(100);;
		
		sbor.setTop(ap);
				
		sbor.setBottom(sgr3);
		
		sbor.setStyle("-fx-background-color:#00a0e9");
		
		Scene scene = new Scene(sbor);
		
		
		primaryStage.setScene(scene);
		
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

		primaryStage.getIcons().add(new Image("/Icon/Icon.png"));
		primaryStage.initStyle(StageStyle.TRANSPARENT);
		primaryStage.show();
		
	}
}
