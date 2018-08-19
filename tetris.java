package eluosifangkuai;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Random;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

public class tetris extends Application{
	public static boolean bool=true;
	static Random random=new Random();
	public static final int degree=20;
	Pane pane=new Pane();
	VBox vpane=new VBox();
	static double chushisudu;
	Button button1,button2,button3;
	BorderPane borderpane=new BorderPane();
	BorderPane minborderpane=new BorderPane();
	Label label;
	static Label label2,label3;
	Line line;
	static Down down;
	static int x=9,y=0;
	static int tuxingbianhao=0;
	static int score=0;
	static int Map[][]=new int[20][20];
	static int Map1[][]=new int[21][21];
	static int sudu=500;
	static double jiasudu=0.1;
	static Timeline t0,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18;
	static handlee0 h0;
	static handlee1 h1;
	static handlee2 h2;
	static handlee3 h3;
	static handlee4 h4;
	static handlee5 h5;
	static handlee6 h6;
	static handlee7 h7;
	static handlee8 h8;
	static handlee9 h9;
	static handlee10 h10;
	static handlee11 h11;
	static handlee12 h12;
	static handlee13 h13;
	static handlee14 h14;
	static handlee15 h15;
	static handlee16 h16;
	static handlee17 h17;
	static handlee18 h18;
	public void start(Stage primaryStage){
//=====================初始化界面和Map1和Map=====================
		for(int i=0;i<20;i++){
			for(int j=0;j<20;j++){
				Map[j][i]=0;
				Rectangle r1=new Rectangle(i*degree,j*degree,degree,degree);
				r1.setStyle("-fx-fill: white; -fx-stroke: white;");
				pane.getChildren().add(r1);
			}
		}
		for(int i=0;i<21;i++){
			for(int j=0;j<21;j++){
				if(i==20||j==20)
					Map1[j][i]=1;
				else
					Map1[j][i]=0;
			    }
			}
		down=new Down();
		button1=new Button("继续");
		button2=new Button("暂停");
		button3=new Button("重新开始");
		line=new Line(0,0,0,400);
		label=new Label();
		label2=new Label();
		label3=new Label();
		label.setFont(Font.font("Times New Roman", FontWeight.BOLD,FontPosture.ITALIC,20));
		label.setTextFill(Color.RED);
		label.setText("分数为:");
		label2.setFont(Font.font("Times New Roman", FontWeight.BOLD,FontPosture.ITALIC,20));
		label2.setTextFill(Color.RED);
		label2.setText(""+score);
		label3.setFont(Font.font("Times New Roman", FontWeight.BOLD,FontPosture.ITALIC,12));
		label3.setTextFill(Color.RED);
		label3.setText("速度:"+500);
		vpane.setSpacing(50);
		vpane.setAlignment(Pos.CENTER);
		vpane.getChildren().addAll(label,label2,label3,button1,button2,button3);
		minborderpane.setLeft(line);
		minborderpane.setCenter(vpane);
//=======================多个时间轴=====================================
		   h0=new handlee0();
		   t0=new Timeline(new KeyFrame(Duration.millis(sudu),h0));
		   t0.setCycleCount(Timeline.INDEFINITE);
	       h1=new handlee1();
		   t1=new Timeline(new KeyFrame(Duration.millis(sudu),h1));
		   t1.setCycleCount(Timeline.INDEFINITE);
		   h2=new handlee2();
		   t2=new Timeline(new KeyFrame(Duration.millis(sudu),h2));
		   t2.setCycleCount(Timeline.INDEFINITE);
		   h3=new handlee3();
		   t3=new Timeline(new KeyFrame(Duration.millis(sudu),h3));
		   t3.setCycleCount(Timeline.INDEFINITE);
		   h4=new handlee4();
		   t4=new Timeline(new KeyFrame(Duration.millis(sudu),h4));
		   t4.setCycleCount(Timeline.INDEFINITE);
		   h5=new handlee5();
		   t5=new Timeline(new KeyFrame(Duration.millis(sudu),h5));
		   t5.setCycleCount(Timeline.INDEFINITE);
		   h6=new handlee6();
		   t6=new Timeline(new KeyFrame(Duration.millis(sudu),h6));
		   t6.setCycleCount(Timeline.INDEFINITE);
		   h7=new handlee7();
		   t7=new Timeline(new KeyFrame(Duration.millis(sudu),h7));
		   t7.setCycleCount(Timeline.INDEFINITE);
		   h8=new handlee8();
		   t8=new Timeline(new KeyFrame(Duration.millis(sudu),h8));
		   t8.setCycleCount(Timeline.INDEFINITE);
		   h9=new handlee9();
		   t9=new Timeline(new KeyFrame(Duration.millis(sudu),h9));
		   t9.setCycleCount(Timeline.INDEFINITE);
		   h10=new handlee10();
		   t10=new Timeline(new KeyFrame(Duration.millis(sudu),h10));
		   t10.setCycleCount(Timeline.INDEFINITE);
		   h11=new handlee11();
		   t11=new Timeline(new KeyFrame(Duration.millis(sudu),h11));
		   t11.setCycleCount(Timeline.INDEFINITE);
		   h12=new handlee12();
		   t12=new Timeline(new KeyFrame(Duration.millis(sudu),h12));
		   t12.setCycleCount(Timeline.INDEFINITE);
		   h13=new handlee13();
		   t13=new Timeline(new KeyFrame(Duration.millis(sudu),h13));
		   t13.setCycleCount(Timeline.INDEFINITE);
		   h14=new handlee14();
		   t14=new Timeline(new KeyFrame(Duration.millis(sudu),h14));
		   t14.setCycleCount(Timeline.INDEFINITE);
		   h15=new handlee15();
		   t15=new Timeline(new KeyFrame(Duration.millis(sudu),h15));
		   t15.setCycleCount(Timeline.INDEFINITE);
		   h16=new handlee16();
		   t16=new Timeline(new KeyFrame(Duration.millis(sudu),h16));
		   t16.setCycleCount(Timeline.INDEFINITE);
		   h17=new handlee17();
		   t17=new Timeline(new KeyFrame(Duration.millis(sudu),h17));
		   t17.setCycleCount(Timeline.INDEFINITE);
		   h18=new handlee18();
		   t18=new Timeline(new KeyFrame(Duration.millis(sudu),h18));
		   t18.setCycleCount(Timeline.INDEFINITE);
		   chushisudu=t0.getRate();
//===========================按钮事件绑定==================================
		   handlebutton1 b1=new handlebutton1();
		   handlebutton2 b2=new handlebutton2();
		   handlebutton3 b3=new handlebutton3();
		   button1.setOnAction(b1);
		   button2.setOnAction(b2);
		   button3.setOnAction(b3);
		   Methed.shuffle();
//============================界面显示===================================
		 handle hhh=new handle();
		  pane.setOnKeyPressed(hhh);
		  borderpane.setCenter(pane);
		  borderpane.setRight(minborderpane);
		Scene scene=new Scene(borderpane,460,390);
			primaryStage.setTitle("showTetris");
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();
			pane.requestFocus();
	}
//=======================界面矩形显示 功能是涂色===========================
public class Down {
	public void run() {
		for(int i=0;i<20;i++){
			for(int j=0;j<20;j++){
			if(Map[j][i]==1||Map1[j][i]==1){
				if(Map[j][i]==1){	
				pane.getChildren().get(i*degree+j).setStyle("-fx-fill: green; -fx-stroke: blue;");
				}
			
				else if(Map1[j][i]==1)
					pane.getChildren().get(i*degree+j).setStyle("-fx-fill: yellow; -fx-stroke: green;");
			}
			else {
				pane.getChildren().get(i*degree+j).setStyle("-fx-fill: white; -fx-stroke: white;");
			}
			}
			}
	}	
}
//=========================动画handlee0======================================
class handlee0 implements EventHandler<ActionEvent>{
	public void handle(ActionEvent e){
		if(Map1[y+1][x]==0&&Map1[y+1][x+1]==0){				
				Methed.shape(0);
				tuxingbianhao=0;
				down.run();
				y=y+1;	

				if(Map1[y+1][x]==1||Map1[y+1][x+1]==1){
					for(int i=0;i<20;i++){
						for(int j=0;j<20;j++){
						if(Map[j][i]==1)
							Map1[j][i]=1;
						     }
						}
					y=0;
					x=9;
					Methed.xiaochuhang();
					Methed.shuffle();
				}			
			}
	}
}
//=========================动画handlee1======================================
class handlee1 implements EventHandler<ActionEvent>{
	public void handle(ActionEvent e){
		if(Map1[y+1][x]==0&&Map1[y+1][x+1]==0&&Map1[y+1][x-1]==0){
				
				Methed.shape(1);
				tuxingbianhao=1;
			down.run();
				y=y+1;	

				if(Map1[y+1][x]==1||Map1[y+1][x+1]==1||Map1[y+1][x-1]==1){
					for(int i=0;i<20;i++){
						for(int j=0;j<20;j++){
						if(Map[j][i]==1)
							Map1[j][i]=1;
						     }
						}
					y=0;
					x=9;
					Methed.xiaochuhang();
					Methed.shuffle();
				}
				
				
			
			}
	}
}
//=========================动画handlee2======================================
class handlee2 implements EventHandler<ActionEvent>{
	public void handle(ActionEvent e){
		if(Map1[y+2][x-1]==0&&Map1[y+1][x]==0){
				
				Methed.shape(2);
				tuxingbianhao=2;
			down.run();
				y=y+1;	

				if(Map1[y+2][x-1]==1||Map1[y+1][x]==1){
					for(int i=0;i<20;i++){
						for(int j=0;j<20;j++){
						if(Map[j][i]==1)
							Map1[j][i]=1;
						     }
						}
					y=0;
					x=9;
					Methed.xiaochuhang();
					Methed.shuffle();	
				}
				
				
			
			}
	}
}
//=========================动画handlee3======================================
class handlee3 implements EventHandler<ActionEvent>{
	public void handle(ActionEvent e){
		if(Map1[y+3][x]==0){
				
				Methed.shape(3);
				tuxingbianhao=3;
			down.run();
				y=y+1;	

				if(Map1[y+3][x]==1){
					for(int i=0;i<20;i++){
						for(int j=0;j<20;j++){
						if(Map[j][i]==1)
							Map1[j][i]=1;
						     }
						}
					y=0;
					x=9;
					Methed.xiaochuhang();
					Methed.shuffle();					
				}
				
				
			
			}
	}
}
//=========================动画handlee4======================================
class handlee4 implements EventHandler<ActionEvent>{
	public void handle(ActionEvent e){
		if(Map1[y+1][x]==0&&Map1[y+2][x+1]==0){
				
				Methed.shape(4);
				tuxingbianhao=4;
			down.run();
				y=y+1;	

				if(Map1[y+1][x]==1||Map1[y+2][x+1]==1){
					for(int i=0;i<20;i++){
						for(int j=0;j<20;j++){
						if(Map[j][i]==1)
							Map1[j][i]=1;
						     }
						}
					y=0;
					x=9;
					Methed.xiaochuhang();
					Methed.shuffle();
					
				}
				
				
			
			}
	}
}
//=========================动画handlee5======================================
class handlee5 implements EventHandler<ActionEvent>{
	public void handle(ActionEvent e){
		if(Map1[y+1][x]==0&&Map1[y+1][x+1]==0&&Map1[y+1][x+2]==0){
				
				Methed.shape(5);
				tuxingbianhao=5;
			down.run();
				y=y+1;	

				if(Map1[y+1][x]==1||Map1[y+1][x+1]==1||Map1[y+1][x+2]==1){
					for(int i=0;i<20;i++){
						for(int j=0;j<20;j++){
						if(Map[j][i]==1)
							Map1[j][i]=1;
						     }
						}
					y=0;
					x=9;
					Methed.xiaochuhang();
					Methed.shuffle();
					
				}
				
				
			
			}
	}
}
//=========================动画handlee6======================================
class handlee6 implements EventHandler<ActionEvent>{
	public void handle(ActionEvent e){
		if(Map1[y+1][x]==0&&Map1[y+1][x-1]==0&&Map1[y+1][x-2]==0){
				
				Methed.shape(6);
				tuxingbianhao=6;
			down.run();
				y=y+1;	

				if(Map1[y+1][x]==1||Map1[y+1][x-1]==1||Map1[y+1][x-2]==1){
					for(int i=0;i<20;i++){
						for(int j=0;j<20;j++){
						if(Map[j][i]==1)
							Map1[j][i]=1;
						     }
						}
					y=0;
					x=9;
					Methed.xiaochuhang();
					Methed.shuffle();
					
				}
				
				
			
			}
	}
}
//=========================动画handlee7======================================
class handlee7 implements EventHandler<ActionEvent>{
	public void handle(ActionEvent e){
		if(Map1[y+2][x]==0&&Map1[y+2][x-1]==0){
				
				Methed.shape(7);
				tuxingbianhao=7;
			down.run();
				y=y+1;	

				if(Map1[y+2][x]==1||Map1[y+2][x-1]==1){
					for(int i=0;i<20;i++){
						for(int j=0;j<20;j++){
						if(Map[j][i]==1)
							Map1[j][i]=1;
						     }
						}
					y=0;
					x=9;
					Methed.xiaochuhang();
					Methed.shuffle();				
				}
			}
	}
}
//=========================动画handlee8======================================
class handlee8 implements EventHandler<ActionEvent>{
	public void handle(ActionEvent e){
		if(Map1[y][x]==0&&Map1[y][x+1]==0&&Map1[y+1][x+2]==0){
				
				Methed.shape(8);
				tuxingbianhao=8;
			down.run();
				y=y+1;	

				if(Map1[y][x]==1||Map1[y][x+1]==1||Map1[y+1][x+2]==1){
					for(int i=0;i<20;i++){
						for(int j=0;j<20;j++){
						if(Map[j][i]==1)
							Map1[j][i]=1;
						     }
						}
					y=0;
					x=9;
					Methed.xiaochuhang();
					Methed.shuffle();				
				}
			}
	}
}
//=========================动画handlee9======================================
class handlee9 implements EventHandler<ActionEvent>{
	public void handle(ActionEvent e){
		if(Map1[y+2][x]==0&&Map1[y][x+1]==0){
				
				Methed.shape(9);
				tuxingbianhao=9;
			down.run();
				y=y+1;	

				if(Map1[y+2][x]==1||Map1[y][x+1]==1){
					for(int i=0;i<20;i++){
						for(int j=0;j<20;j++){
						if(Map[j][i]==1)
							Map1[j][i]=1;
						     }
						}
					y=0;
					x=9;
					Methed.xiaochuhang();
					Methed.shuffle();				
				}
			}
	}
}
//=========================动画handlee10======================================
class handlee10 implements EventHandler<ActionEvent>{
	public void handle(ActionEvent e){
		if(Map1[y][x]==0&&Map1[y+2][x+1]==0){
				
				Methed.shape(10);
				tuxingbianhao=10;
			down.run();
				y=y+1;	

				if(Map1[y][x]==1||Map1[y+2][x+1]==1){
					for(int i=0;i<20;i++){
						for(int j=0;j<20;j++){
						if(Map[j][i]==1)
							Map1[j][i]=1;
						     }
						}
					y=0;
					x=9;
					Methed.xiaochuhang();
					Methed.shuffle();				
				}
			}
	}
}
//=========================动画handlee11======================================
class handlee11 implements EventHandler<ActionEvent>{
	public void handle(ActionEvent e){
		if(Map1[y+1][x]==0&&Map1[y][x+1]==0&&Map1[y][x+2]==0){
				
				Methed.shape(11);
				tuxingbianhao=11;
			down.run();
				y=y+1;	

				if(Map1[y+1][x]==1||Map1[y][x+1]==1||Map1[y][x+2]==1){
					for(int i=0;i<20;i++){
						for(int j=0;j<20;j++){
						if(Map[j][i]==1)
							Map1[j][i]=1;
						     }
						}
					y=0;
					x=9;
					Methed.xiaochuhang();
					Methed.shuffle();				
				}
			}
	}
}
//=========================动画handlee12======================================
class handlee12 implements EventHandler<ActionEvent>{
	public void handle(ActionEvent e){
		if(Map1[y+2][x]==0&&Map1[y+2][x+1]==0){
				
				Methed.shape(12);
				tuxingbianhao=12;
			down.run();
				y=y+1;	

				if(Map1[y+2][x]==1||Map1[y+2][x+1]==1){
					for(int i=0;i<20;i++){
						for(int j=0;j<20;j++){
						if(Map[j][i]==1)
							Map1[j][i]=1;
						     }
						}
					y=0;
					x=9;
					Methed.xiaochuhang();
					Methed.shuffle();				
				}
			}
	}
}
//=========================动画handlee13======================================
class handlee13 implements EventHandler<ActionEvent>{
	public void handle(ActionEvent e){
		if(Map1[y+1][x-1]==0&&Map1[y+2][x]==0){
				
				Methed.shape(13);
				tuxingbianhao=13;
			down.run();
				y=y+1;	

				if(Map1[y+1][x-1]==1||Map1[y+2][x]==1){
					for(int i=0;i<20;i++){
						for(int j=0;j<20;j++){
						if(Map[j][i]==1)
							Map1[j][i]=1;
						     }
						}
					y=0;
					x=9;
					Methed.xiaochuhang();
					Methed.shuffle();				
				}
			}
	}
}
//=========================动画handlee14======================================
class handlee14 implements EventHandler<ActionEvent>{
	public void handle(ActionEvent e){
		if(Map1[y][x]==0&&Map1[y+1][x+1]==0&&Map1[y][x+2]==0){
				
				Methed.shape(14);
				tuxingbianhao=14;
			down.run();
				y=y+1;	

				if(Map1[y][x]==1||Map1[y+1][x+1]==1||Map1[y][x+2]==1){
					for(int i=0;i<20;i++){
						for(int j=0;j<20;j++){
						if(Map[j][i]==1)
							Map1[j][i]=1;
						     }
						}
					y=0;
					x=9;
					Methed.xiaochuhang();
					Methed.shuffle();				
				}
			}
	}
}
//=========================动画handlee15======================================
class handlee15 implements EventHandler<ActionEvent>{
	public void handle(ActionEvent e){
		if(Map1[y+2][x]==0&&Map1[y+1][x+1]==0){
				
				Methed.shape(15);
				tuxingbianhao=15;
			down.run();
				y=y+1;	

				if(Map1[y+2][x]==1||Map1[y+1][x+1]==1){
					for(int i=0;i<20;i++){
						for(int j=0;j<20;j++){
						if(Map[j][i]==1)
							Map1[j][i]=1;
						     }
						}
					y=0;
					x=9;
					Methed.xiaochuhang();
					Methed.shuffle();				
				}
			}
	}
}
//=========================动画handlee16======================================
class handlee16 implements EventHandler<ActionEvent>{
	public void handle(ActionEvent e){
		if(Map1[y][x]==0&&Map1[y+1][x+1]==0&&Map1[y+1][x+2]==0){
				
				Methed.shape(16);
				tuxingbianhao=16;
			down.run();
				y=y+1;	

				if(Map1[y][x]==1||Map1[y+1][x+1]==1||Map1[y+1][x+2]==1){
					for(int i=0;i<20;i++){
						for(int j=0;j<20;j++){
						if(Map[j][i]==1)
							Map1[j][i]=1;
						     }
						}
					y=0;
					x=9;
					Methed.xiaochuhang();
					Methed.shuffle();				
				}
			}
	}
}
//=========================动画handlee17======================================
class handlee17 implements EventHandler<ActionEvent>{
	public void handle(ActionEvent e){
		if(Map1[y+1][x-1]==0&&Map1[y+1][x]==0&&Map1[y][x+1]==0){
				
				Methed.shape(17);
				tuxingbianhao=17;
			down.run();
				y=y+1;	

				if(Map1[y+1][x-1]==1||Map1[y+1][x]==1||Map1[y][x+1]==1){
					for(int i=0;i<20;i++){
						for(int j=0;j<20;j++){
						if(Map[j][i]==1)
							Map1[j][i]=1;
						     }
						}
					y=0;
					x=9;
					Methed.xiaochuhang();
					Methed.shuffle();				
				}
			}
	}
}
//=========================动画handlee18======================================
class handlee18 implements EventHandler<ActionEvent>{
	public void handle(ActionEvent e){
		if(Map1[y][x+1]==0&&Map1[y][x]==0&&Map1[y][x+2]==0&&Map1[y][x+3]==0){
				
				Methed.shape(18);
				tuxingbianhao=18;
			down.run();
				y=y+1;	

				if(Map1[y][x+1]==1||Map1[y][x]==1||Map1[y][x+2]==1||Map1[y][x+3]==1){
					for(int i=0;i<20;i++){
						for(int j=0;j<20;j++){
						if(Map[j][i]==1)
							Map1[j][i]=1;
						     }
						}
					y=0;
					x=9;
					Methed.xiaochuhang();
					Methed.shuffle();				
				}
			}
	}
}
//=========================存储各种方法的Methed()类=============================
public static class Methed{
//===========================消除已经满格的一行=================================
	public static void xiaochuhang(){
		for(int rows=0;rows<=19;rows++){
			if(Map1[rows][0]==1&&Map1[rows][1]==1&&Map1[rows][2]==1
					&&Map1[rows][3]==1&&Map1[rows][4]==1&&Map1[rows][5]==1
					&&Map1[rows][6]==1&&Map1[rows][7]==1&&Map1[rows][8]==1
					&&Map1[rows][9]==1&&Map1[rows][10]==1&&Map1[rows][11]==1
					&&Map1[rows][12]==1&&Map1[rows][13]==1&&Map1[rows][14]==1
					&&Map1[rows][15]==1&&Map1[rows][16]==1&&Map1[rows][17]==1
					&&Map1[rows][18]==1&&Map1[rows][19]==1){
				for(int lows=0;lows<=19;lows++){
					Map1[rows][lows]=0;
				}
				for(int qq=19;qq>=0;qq--){
					for(int aa=19;aa>=0;aa--){
						if(Map1[aa][qq]==1&&aa<rows){
							Map1[aa+1][qq]=1;
							Map1[aa][qq]=0;
						}
							
					}
				}				
				score+=100;
				String s=score+"";
				label2.setText(s);
				
				t0.setRate(t0.getRate()+jiasudu);
				t1.setRate(t1.getRate()+jiasudu);
				t2.setRate(t2.getRate()+jiasudu);
				t3.setRate(t3.getRate()+jiasudu);
				t4.setRate(t4.getRate()+jiasudu);
				t5.setRate(t5.getRate()+jiasudu);
				t6.setRate(t6.getRate()+jiasudu);
				t7.setRate(t7.getRate()+jiasudu);
				t8.setRate(t8.getRate()+jiasudu);
				t9.setRate(t9.getRate()+jiasudu);
				t10.setRate(t10.getRate()+jiasudu);
				t11.setRate(t11.getRate()+jiasudu);
				t12.setRate(t12.getRate()+jiasudu);
				t13.setRate(t13.getRate()+jiasudu);
				t14.setRate(t14.getRate()+jiasudu);
				t15.setRate(t15.getRate()+jiasudu);
				t16.setRate(t16.getRate()+jiasudu);
				t17.setRate(t17.getRate()+jiasudu);
				t18.setRate(t18.getRate()+jiasudu);
		ArrayList<Double> list=new ArrayList<>();
			list.add(t0.getRate());
			list.add(t1.getRate());
			list.add(t2.getRate());
			list.add(t3.getRate());
			list.add(t4.getRate());
			list.add(t5.getRate());
			list.add(t5.getRate());
			list.add(t7.getRate());
			list.add(t8.getRate());
			list.add(t9.getRate());
			list.add(t10.getRate());
			list.add(t11.getRate());
			list.add(t12.getRate());
			list.add(t13.getRate());
			list.add(t14.getRate());
			list.add(t15.getRate());
			list.add(t16.getRate());
			list.add(t17.getRate());
			list.add(t18.getRate());
				label3.setText("速度:"+(sudu+=100));
				
			}
	}
	}
//==========================图形生成函数=======================================
	public static void shape(int w){
		if(w==0){
			for(int i=0;i<20;i++){
				for(int j=0;j<20;j++){
					if(i==x&&j==y){
						Map[j][i]=1;
					}
					else if(i==x+1&&j==y){
						Map[j][i]=1;
					}
					else if(i==x&&j==y+1){
						Map[j][i]=1;
					}
					else if(i==x+1&&j==y+1){
						Map[j][i]=1;
					}
					else{
						Map[j][i]=0;
					}
				}
			}
		}
		if(w==1){
			for(int i=0;i<20;i++){
				for(int j=0;j<20;j++){
					if(i==x&&j==y){
						Map[j][i]=1;
					}
					else if(i==x&&j==y+1){
						Map[j][i]=1;
					}
					else if(i==x-1&&j==y+1){
						Map[j][i]=1;
					}
					else if(i==x+1&&j==y+1){
						Map[j][i]=1;
					}
					else{
						Map[j][i]=0;
					}
				}
			}
		}
		if(w==2){
			for(int i=0;i<20;i++){
				for(int j=0;j<20;j++){
					if(i==x&&j==y){
						Map[j][i]=1;
					}
					else if(i==x&&j==y+1){
						Map[j][i]=1;
					}
					else if(i==x-1&&j==y+1){
						Map[j][i]=1;
					}
					else if(i==x-1&&j==y+2){
						Map[j][i]=1;
					}
					else{
						Map[j][i]=0;
					}
				   }
				}
		}
		if(w==3){
			for(int i=0;i<20;i++){
				for(int j=0;j<20;j++){
					if(i==x&&j==y){
						Map[j][i]=1;
					}
					else if(i==x&&j==y+1){
						Map[j][i]=1;
					}
					else if(i==x&&j==y+2){
						Map[j][i]=1;
					}
					else if(i==x&&j==y+3){
						Map[j][i]=1;
					}
					else{
						Map[j][i]=0;
					}
				   }
				}
		}
		if(w==4){
			for(int i=0;i<20;i++){
				for(int j=0;j<20;j++){
					if(i==x&&j==y){
						Map[j][i]=1;
					}
					else if(i==x&&j==y+1){
						Map[j][i]=1;
					}
					else if(i==x+1&&j==y+1){
						Map[j][i]=1;
					}
					else if(i==x+1&&j==y+2){
						Map[j][i]=1;
					}
					else{
						Map[j][i]=0;
					}
				   }
				}
		}
		if(w==5){
			for(int i=0;i<20;i++){
				for(int j=0;j<20;j++){
					if(i==x&&j==y){
						Map[j][i]=1;
					}
					else if(i==x&&j==y+1){
						Map[j][i]=1;
					}
					else if(i==x+1&&j==y+1){
						Map[j][i]=1;
					}
					else if(i==x+2&&j==y+1){
						Map[j][i]=1;
					}
					else{
						Map[j][i]=0;
					}
				   }
				}
		}
		if(w==6){
			for(int i=0;i<20;i++){
				for(int j=0;j<20;j++){
					if(i==x&&j==y){
						Map[j][i]=1;
					}
					else if(i==x&&j==y+1){
						Map[j][i]=1;
					}
					else if(i==x-1&&j==y+1){
						Map[j][i]=1;
					}
					else if(i==x-2&&j==y+1){
						Map[j][i]=1;
					}
					else{
						Map[j][i]=0;
					}
				   }
				}
		}
		if(w==7){
			for(int i=0;i<20;i++){
				for(int j=0;j<20;j++){
					if(i==x&&j==y){
						Map[j][i]=1;
					}
					else if(i==x&&j==y+1){
						Map[j][i]=1;
					}
					else if(i==x&&j==y+2){
						Map[j][i]=1;
					}
					else if(i==x-1&&j==y+2){
						Map[j][i]=1;
					}
					else{
						Map[j][i]=0;
					}
				   }
				}
		}
		if(w==8){
			for(int i=0;i<20;i++){
				for(int j=0;j<20;j++){
					if(i==x&&j==y){
						Map[j][i]=1;
					}
					else if(i==x+1&&j==y){
						Map[j][i]=1;
					}
					else if(i==x+2&&j==y){
						Map[j][i]=1;
					}
					else if(i==x+2&&j==y+1){
						Map[j][i]=1;
					}
					else{
						Map[j][i]=0;
					}
				   }
				}
		}
		if(w==9){
			for(int i=0;i<20;i++){
				for(int j=0;j<20;j++){
					if(i==x&&j==y){
						Map[j][i]=1;
					}
					else if(i==x+1&&j==y){
						Map[j][i]=1;
					}
					else if(i==x&&j==y+1){
						Map[j][i]=1;
					}
					else if(i==x&&j==y+2){
						Map[j][i]=1;
					}
					else{
						Map[j][i]=0;
					}
				   }
				}
		}
		if(w==10){
			for(int i=0;i<20;i++){
				for(int j=0;j<20;j++){
					if(i==x&&j==y){
						Map[j][i]=1;
					}
					else if(i==x+1&&j==y){
						Map[j][i]=1;
					}
					else if(i==x+1&&j==y+1){
						Map[j][i]=1;
					}
					else if(i==x+1&&j==y+2){
						Map[j][i]=1;
					}
					else{
						Map[j][i]=0;
					}
				   }
				}
		}
		if(w==11){
			for(int i=0;i<20;i++){
				for(int j=0;j<20;j++){
					if(i==x&&j==y){
						Map[j][i]=1;
					}
					else if(i==x&&j==y+1){
						Map[j][i]=1;
					}
					else if(i==x+1&&j==y){
						Map[j][i]=1;
					}
					else if(i==x+2&&j==y){
						Map[j][i]=1;
					}
					else{
						Map[j][i]=0;
					}
				   }
				}
		}
		if(w==12){
			for(int i=0;i<20;i++){
				for(int j=0;j<20;j++){
					if(i==x&&j==y){
						Map[j][i]=1;
					}
					else if(i==x&&j==y+1){
						Map[j][i]=1;
					}
					else if(i==x&&j==y+2){
						Map[j][i]=1;
					}
					else if(i==x+1&&j==y+2){
						Map[j][i]=1;
					}
					else{
						Map[j][i]=0;
					}
				   }
				}
		}
		if(w==13){
			for(int i=0;i<20;i++){
				for(int j=0;j<20;j++){
					if(i==x&&j==y){
						Map[j][i]=1;
					}
					else if(i==x&&j==y+1){
						Map[j][i]=1;
					}
					else if(i==x&&j==y+2){
						Map[j][i]=1;
					}
					else if(i==x-1&&j==y+1){
						Map[j][i]=1;
					}
					else{
						Map[j][i]=0;
					}
				   }
				}
		}
		if(w==14){
			for(int i=0;i<20;i++){
				for(int j=0;j<20;j++){
					if(i==x&&j==y){
						Map[j][i]=1;
					}
					else if(i==x+1&&j==y){
						Map[j][i]=1;
					}
					else if(i==x+2&&j==y){
						Map[j][i]=1;
					}
					else if(i==x+1&&j==y+1){
						Map[j][i]=1;
					}
					else{
						Map[j][i]=0;
					}
				   }
				}
		}
		if(w==15){
			for(int i=0;i<20;i++){
				for(int j=0;j<20;j++){
					if(i==x&&j==y){
						Map[j][i]=1;
					}
					else if(i==x&&j==y+1){
						Map[j][i]=1;
					}
					else if(i==x&&j==y+2){
						Map[j][i]=1;
					}
					else if(i==x+1&&j==y+1){
						Map[j][i]=1;
					}
					else{
						Map[j][i]=0;
					}
				   }
				}
		}
		if(w==16){
			for(int i=0;i<20;i++){
				for(int j=0;j<20;j++){
					if(i==x&&j==y){
						Map[j][i]=1;
					}
					else if(i==x+1&&j==y){
						Map[j][i]=1;
					}
					else if(i==x+1&&j==y+1){
						Map[j][i]=1;
					}
					else if(i==x+2&&j==y+1){
						Map[j][i]=1;
					}
					else{
						Map[j][i]=0;
					}
				   }
				}
		}
		if(w==17){
			for(int i=0;i<20;i++){
				for(int j=0;j<20;j++){
					if(i==x&&j==y){
						Map[j][i]=1;
					}
					else if(i==x+1&&j==y){
						Map[j][i]=1;
					}
					else if(i==x&&j==y+1){
						Map[j][i]=1;
					}
					else if(i==x-1&&j==y+1){
						Map[j][i]=1;
					}
					else{
						Map[j][i]=0;
					}
				   }
				}
		}
		if(w==18){
			for(int i=0;i<20;i++){
				for(int j=0;j<20;j++){
					if(i==x&&j==y){
						Map[j][i]=1;
					}
					else if(i==x+1&&j==y){
						Map[j][i]=1;
					}
					else if(i==x+2&&j==y){
						Map[j][i]=1;
					}
					else if(i==x+3&&j==y){
						Map[j][i]=1;
					}
					else{
						Map[j][i]=0;
					}
				   }
				}
		}
	}
public static void shuffle(){	
		tuxingbianhao=random.nextInt(18);	
			switch(tuxingbianhao){
			case 0:t0.play();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
			case 1:t0.pause();t1.play();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
			case 2:t0.pause();t1.pause();t2.play();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
			case 3:t0.pause();t1.pause();t2.pause();t3.play();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
			case 4:t0.pause();t1.pause();t2.pause();t3.pause();t4.play();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
			case 5:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.play();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
			case 6:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.play();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
			case 7:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.play();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
			case 8:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.play();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
			case 9:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.play();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
			case 10:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.play();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
			case 11:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.play();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
			case 12:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.play();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
			case 13:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.play();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
			case 14:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.play();t15.pause();t16.pause();t17.pause();t18.pause();break;
			case 15:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.play();t16.pause();t17.pause();t18.pause();break;
			case 16:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.play();t17.pause();t18.pause();break;
			case 17:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.play();t18.pause();break;
			case 18:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.play();break;
		}
	}	
}
//===========================键盘事件处理======================================
	class handle implements EventHandler<KeyEvent>{
	  	 public void handle(KeyEvent e){
	  		if(e.getCode()==KeyCode.LEFT){
	  			if(tuxingbianhao==0){
	  				if(x>0&&x<=18&&Map1[y][x-1]==0&&Map1[y+1][x-1]==0){
	  	  				x-=1;
	  	  			}
	  			}
	  			else if(tuxingbianhao==1){
	  				if(x>1&&x<=18&&Map1[y][x-1]==0&&Map1[y+1][x-2]==0){
	  	  				x-=1;
	  	  			}	  				
	  			}
	  			else if(tuxingbianhao==2){
	  				if(x>1&&x<=19&&Map1[y][x-1]==0&&Map1[y+1][x-2]==0&&Map1[y+2][x-2]==0){
	  					x-=1;
	  				}
	  			}
	  			else if(tuxingbianhao==3){
	  				if(x>0&&x<19&&Map1[y][x-1]==0&&Map1[y+1][x-1]==0&&Map1[y+2][x-1]==0&&Map1[y+3][x-1]==0){
	  					x-=1;
	  				}
	  			}
	  			else if(tuxingbianhao==4){
	  				if(x>0&&x<19&&Map1[y][x-1]==0&&Map1[y+1][x-1]==0&&Map1[y+2][x]==0){
	  					x-=1;
	  				}
	  			}
	  			else if(tuxingbianhao==5){
	  				if(x>0&&x<=17&&Map1[y][x-1]==0&&Map1[y+1][x-1]==0){
	  					x-=1;
	  				}
	  			}
	  			else if(tuxingbianhao==6){
	  				if(x>2&&x<=19&&Map1[y+1][x-3]==0&&Map1[y][x-1]==0){
	  					x-=1;
	  				}
	  			}
	  			else if(tuxingbianhao==7){
	  				if(x>1&&x<=19&&Map1[y][x-1]==0&&Map1[y+1][x-1]==0&&Map1[y+2][x-2]==0){
	  					x-=1;
	  				}
	  			}
	  			else if(tuxingbianhao==8){
	  				if(x>0&&x<=17&&Map1[y][x-1]==0&&Map1[y+1][x-1]==0){
	  					x-=1;
	  				}
	  			}
	  			else if(tuxingbianhao==9){
	  				if(x>0&&x<=18&&Map1[y][x-1]==0&&Map1[y+1][x-1]==0&&Map1[y+2][x-1]==0){
	  					x-=1;
	  				}
	  			}
	  			else if(tuxingbianhao==10){
	  				if(x>0&&x<=18&&Map1[y][x-1]==0&&Map1[y+1][x]==0&&Map1[y+2][x]==0){
	  					x-=1;
	  				}
	  			}
	  			else if(tuxingbianhao==11){
	  				if(x>0&&x<=17&&Map1[y][x-1]==0&&Map1[y+1][x-1]==0){
	  					x-=1;
	  				}
	  			}
	  			else if(tuxingbianhao==12){
	  				if(x>0&&x<=18&&Map1[y][x-1]==0&&Map1[y+1][x-1]==0&&Map1[y+2][x-1]==0){
	  					x-=1;
	  				}
	  			}
	  			else if(tuxingbianhao==13){
	  				if(x>1&&x<=19&&Map1[y][x-1]==0&&Map1[y+1][x-2]==0&&Map1[y+2][x-1]==0){
	  					x-=1;
	  				}
	  			}
	  			else if(tuxingbianhao==14){
	  				if(x>0&&x<=17&&Map1[y][x-1]==0&&Map1[y+1][x]==0){
	  					x-=1;
	  				}
	  			}
	  			else if(tuxingbianhao==15){
	  				if(x>0&&x<=18&&Map1[y][x-1]==0&&Map1[y+1][x-1]==0&&Map1[y+2][x-1]==0){
	  					x-=1;
	  				}
	  			}
	  			else if(tuxingbianhao==16){
	  				if(x>0&&x<=17&&Map1[y][x-1]==0&&Map1[y+1][x]==0){
	  					x-=1;
	  				}
	  			}
	  			else if(tuxingbianhao==17){
	  				if(x>1&&x<=18&&Map1[y][x-1]==0&&Map1[y+1][x-2]==0){
	  					x-=1;
	  				}
	  			}
	  			else if(tuxingbianhao==18){
	  				if(x>0&&x<=16&&Map1[y][x-1]==0){
	  					x-=1;
	  				}
	  			}
	  		}
	  		if(e.getCode()==KeyCode.RIGHT){
	  			if(tuxingbianhao==0){
	  				if(x>=0&&x<18&&Map1[y][x+2]==0&&Map1[y+1][x+2]==0){
	  	  				x+=1;
	  	  			}
	  			}
	  			else if(tuxingbianhao==1){
	  				if(x>0&&x<18&&Map1[y][x+1]==0&&Map1[y+1][x+2]==0){
	  	  				x+=1;
	  	  			}
	  			}
	  			else if(tuxingbianhao==2){
	  				if(x>0&&x<=19&&Map1[y][x+1]==0&&Map1[y+1][x+1]==0&&Map1[y+2][x]==0){
	  					x+=1;
	  				}
	  			}
	  			else if(tuxingbianhao==3){
	  				if(x>=0&&x<19&&Map1[y][x+1]==0&&Map1[y+1][x+1]==0&&Map1[y+2][x+1]==0&&Map1[y+3][x+1]==0){
	  					x+=1;
	  				}
	  			}
	  			else if(tuxingbianhao==4){
	  				if(x>=0&&x<18&&Map1[y][x+1]==0&&Map1[y+1][x+2]==0&&Map1[y+2][x+2]==0){
	  					x+=1;
	  				}
	  			}
	  			else if(tuxingbianhao==5){
	  				if(x>=0&&x<17&&Map1[y][x+1]==0&&Map1[y+1][x+3]==0){
	  					x+=1;
	  				}
	  			}
	  			else if(tuxingbianhao==6){
	  				if(x>=2&&x<=18&&Map1[y][x+1]==0&&Map1[y+1][x+1]==0){
	  					x+=1;
	  				}
	  			}
	  			else if(tuxingbianhao==7){
	  				if(x>=1&&x<=18&&Map1[y][x+1]==0&&Map1[y+1][x+1]==0&&Map1[y+2][x+1]==0){
	  					x+=1;
	  				}
	  			}
	  			else if(tuxingbianhao==8){
	  				if(x>=0&&x<=16&&Map1[y][x+3]==0&&Map1[y+1][x+3]==0){
	  					x+=1;
	  				}
	  			}
	  			else if(tuxingbianhao==9){
	  				if(x>=0&&x<=17&&Map1[y][x+2]==0&&Map1[y+1][x+1]==0&&Map1[y+2][x+1]==0){
	  					x+=1;
	  				}
	  			}
	  			else if(tuxingbianhao==10){
	  				if(x>=0&&x<=17&&Map1[y][x+2]==0&&Map1[y+1][x+2]==0&&Map1[y+2][x+2]==0){
	  					x+=1;
	  				}
	  			}
	  			else if(tuxingbianhao==11){
	  				if(x>=0&&x<=16&&Map1[y][x+3]==0&&Map1[y+1][x+1]==0){
	  					x+=1;
	  				}
	  			}
	  			else if(tuxingbianhao==12){
	  				if(x>=0&&x<=17&&Map1[y][x+1]==0&&Map1[y+1][x+1]==0&&Map1[y+2][x+2]==0){
	  					x+=1;
	  				}
	  			}
	  			else if(tuxingbianhao==13){
	  				if(x>=1&&x<=18&&Map1[y][x+1]==0&&Map1[y+1][x+1]==0&&Map1[y+2][x+1]==0){
	  					x+=1;
	  				}
	  			}
	  			else if(tuxingbianhao==14){
	  				if(x>=0&&x<=16&&Map1[y][x+3]==0&&Map1[y+1][x+2]==0){
	  					x+=1;
	  				}
	  			}
	  			else if(tuxingbianhao==15){
	  				if(x>=0&&x<=17&&Map1[y][x+1]==0&&Map1[y+1][x+2]==0&&Map1[y+2][x+1]==0){
	  					x+=1;
	  				}
	  			}
	  			else if(tuxingbianhao==16){
	  				if(x>=0&&x<=16&&Map1[y][x+2]==0&&Map1[y+1][x+3]==0){
	  					x+=1;
	  				}
	  			}
	  			else if(tuxingbianhao==17){
	  				if(x>=1&&x<=17&&Map1[y][x+2]==0&&Map1[y+1][x+1]==0){
	  					x+=1;
	  				}
	  			}
	  			else if(tuxingbianhao==18){
	  				if(x>=0&&x<=15&&Map1[y][x+4]==0){
	  					x+=1;
	  				}
	  			}
	  		}
	  		if(e.getCode()==KeyCode.UP){
	  			if(tuxingbianhao==0){	  				
	  
	  			}
	  			if(tuxingbianhao==1){	  				
	  				if(Map1[y+1][x-1]==0&&Map1[y+2][x]==0){
	  					t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.play();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();
	  				}
	  			}
	  			if(tuxingbianhao==2){	  				
	  				if(Map1[y][x]==0&&Map1[y+1][x+1]==0&&Map1[y+1][x+2]==0){
	  					t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.play();t17.pause();t18.pause();
	  				}
	  			}
	  			if(tuxingbianhao==3){	  				
	  				if(Map1[y][x+1]==0&&Map1[y][x]==0&&Map1[y][x+2]==0&&Map1[y][x+3]==0){
	  					t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.play();
	  				}
	  			}
	  			if(tuxingbianhao==4){	  				
	  				if(Map1[y+1][x-1]==0&&Map1[y+1][x]==0&&Map1[y][x+1]==0){
	  					t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.play();t18.pause();
	  				}
	  			}
	  			if(tuxingbianhao==5){	  				
	  				if(Map1[y+2][x]==0&&Map1[y+2][x-1]==0){
	  					t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.play();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();
	  				}
	  			}
	  			if(tuxingbianhao==6){	  				
	  				if(Map1[y][x]==0&&Map1[y+2][x+1]==0){
	  					t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.play();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();
	  				}
	  			}
	  			if(tuxingbianhao==7){	  				
	  				if(Map1[y][x]==0&&Map1[y][x+1]==0&&Map1[y+1][x+2]==0){
	  					t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.play();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();
	  				}
	  			}
	  			if(tuxingbianhao==8){	  				
	  				if(Map1[y+2][x]==0&&Map1[y][x+1]==0){
	  					t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.play();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();
	  				}
	  			}
	  			if(tuxingbianhao==9){	  				
	  				if(Map1[y+1][x]==0&&Map1[y+1][x+1]==0&&Map1[y+1][x+2]==0){
	  					t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.play();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();
	  				}
	  			}
	  			if(tuxingbianhao==10){	  				
	  				if(Map1[y+1][x]==0&&Map1[y][x+1]==0&&Map1[y][x+2]==0){
	  					t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.play();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();	
	  				}
	  			}
	  			if(tuxingbianhao==11){	  				
	  				if(Map1[y+2][x]==0&&Map1[y+2][x+1]==0){
	  					t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.play();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();		
	  				}
	  			}
	  			if(tuxingbianhao==12){	  				
	  				if(Map1[y+1][x]==0&&Map1[y+1][x-1]==0&&Map1[y+1][x-2]==0){
	  					t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.play();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();
	  				}
	  			}
	  			if(tuxingbianhao==13){	  				
	  				if(Map1[y][x]==0&&Map1[y+1][x+1]==0&&Map1[y][x+2]==0){
	  					t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.play();t15.pause();t16.pause();t17.pause();t18.pause();
	  				}
	  			}
	  			if(tuxingbianhao==14){	  				
	  				if(Map1[y+2][x]==0&&Map1[y+1][x+1]==0){
	  					t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.play();t16.pause();t17.pause();t18.pause();
	  				}
	  			}
	  			if(tuxingbianhao==15){	  				
	  				if(Map1[y+1][x]==0&&Map1[y+1][x+1]==0&&Map1[y+1][x-1]==0){
	  					t0.pause();t1.play();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();	
	  				}
	  			}
	  			if(tuxingbianhao==16){	  				
	  				if(Map1[y+2][x-1]==0&&Map1[y+1][x]==0){
	  					t0.pause();t1.pause();t2.play();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();
	  				}
	  			}
	  			if(tuxingbianhao==17){	  				
	  				if(Map1[y+1][x]==0&&Map1[y+2][x+1]==0){
	  					t0.pause();t1.pause();t2.pause();t3.pause();t4.play();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();
	  				}
	  			}
	  			if(tuxingbianhao==18){	  				
	  				if(Map1[y+3][x]==0){
	  					t0.pause();t1.pause();t2.pause();t3.play();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();
	  				}
	  			}
	  		}
	  		
	  	 }
	}
//==========================按钮事件处理=======================================
	class handlebutton1 implements EventHandler<ActionEvent>{
    	public void handle(ActionEvent e){ 		
    			   		switch(tuxingbianhao){
    					case 0:t0.play();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
    					case 1:t0.pause();t1.play();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
    					case 2:t0.pause();t1.pause();t2.play();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
    					case 3:t0.pause();t1.pause();t2.pause();t3.play();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
    					case 4:t0.pause();t1.pause();t2.pause();t3.pause();t4.play();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
    					case 5:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.play();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
    					case 6:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.play();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
    					case 7:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.play();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
    					case 8:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.play();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
    					case 9:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.play();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
    					case 10:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.play();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
    					case 11:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.play();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
    					case 12:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.play();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
    					case 13:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.play();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();break;
    					case 14:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.play();t15.pause();t16.pause();t17.pause();t18.pause();break;
    					case 15:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.play();t16.pause();t17.pause();t18.pause();break;
    					case 16:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.play();t17.pause();t18.pause();break;
    					case 17:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.play();t18.pause();break;
    					case 18:t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.play();break;
    				}
    			   		pane.requestFocus();	
    }
    }
	
	class handlebutton2 implements EventHandler<ActionEvent>{
    	public void handle(ActionEvent e){ 		
    		t0.pause();t1.pause();t2.pause();t3.pause();t4.pause();t5.pause();t6.pause();t7.pause();t8.pause();t9.pause();t10.pause();t11.pause();t12.pause();t13.pause();t14.pause();t15.pause();t16.pause();t17.pause();t18.pause();	
    		pane.requestFocus();
    	}
    }
	class handlebutton3 implements EventHandler<ActionEvent>{
    	public void handle(ActionEvent e){ 		
    		for(int i=0;i<20;i++){
    			for(int j=0;j<20;j++){
    				Map[j][i]=0;
    			}
    		}
    		for(int i=0;i<21;i++){
    			for(int j=0;j<21;j++){
    				if(i==20||j==20)
    					Map1[j][i]=1;
    				else
    					Map1[j][i]=0;
    			    }
    			}
    		x=9;
    		y=0;
    		sudu=500;
    		score=0;
    		
    		label2.setText(score+"");
			label3.setText("速度:"+(sudu));
			t0.setRate(chushisudu);
			t1.setRate(chushisudu);
			t2.setRate(chushisudu);
			t3.setRate(chushisudu);
			t4.setRate(chushisudu);
			t5.setRate(chushisudu);
			t6.setRate(chushisudu);
			t7.setRate(chushisudu);
			t8.setRate(chushisudu);
			t9.setRate(chushisudu);
			t10.setRate(chushisudu);
			t11.setRate(chushisudu);
			t12.setRate(chushisudu);
			t13.setRate(chushisudu);
			t14.setRate(chushisudu);
			t15.setRate(chushisudu);
			t16.setRate(chushisudu);
			t17.setRate(chushisudu);
			t18.setRate(chushisudu);
    		 Methed.shuffle();
    		pane.requestFocus();
    	}
    }
//==========================main()函数=======================================
public static void main(String[] args) {
	Application.launch(args);
}
}