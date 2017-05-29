package main;

import javax.swing.*;
import java.util.ArrayList;

public class ChessGame {

   // private String[] figuresImgList = {"wp.jpg",
   // "wr.jpg","wk.jpg","wb.jpg","wq.jpg","wK.jpg","bp.jpg","br.jpg","bk.jpg","bb.jpg","bq.jpg","bK.jpg"};

    enum Figures { WP(8), WR(2), WKN(2), WB(2), WQ(1), WKI(1), BP(8), BB(2), BR(2), BQ(1), BKI(1), BKN(2), EMPTY(32);

    private int count;

    Figures (int count){

        this.count = count;

    }

    public int getCount(){

        return this.count;
    }

    }

    public ArrayList<Figure> figureFactory(int num){

        int count;

        ArrayList<Figure> figury = new ArrayList<Figure>();

        for (Figures fig : Figures.values()) {

            for (int i=1;i<=fig.getCount();i++){
            System.out.println(fig+" "+i);
            figury.add(new Figure(fig,i));


        }

        }

        /*
        for(int i=0;i<num;i++){

            figury.add(new Figure());
        }
*/
    return figury;
    }

    public void addFigures(GameFrame chessFrame, ArrayList<Figure> figures){

        int m,n;

        for(m = 0; m < 8; m++) {
            for(n = 0; n < 8; n++) {
                //chessFrame.panelHolder[m][n].add(figures.get(m*8+n));
                chessFrame.gameConstraints.gridx = figures.get(m*8+n).pos_x;
                chessFrame.gameConstraints.gridy = figures.get(m*8+n).pos_y;
                chessFrame.add(figures.get(m*8+n),chessFrame.gameConstraints);

            }
        }

        //chessFrame.gameConstraints.gridx = 0;
        //chessFrame.gameConstraints.gridx = 0;
        //chessFrame.add(new Figure(Figures.BB,1),chessFrame.gameConstraints);


    }




    //private GridLayout ChessGrid ;

    public void init(){

        GameFrame ChessFrame = new GameFrame();
        ChessFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // when click x close program
        ChessFrame.setSize(720, 720);
        ArrayList<Figure> figures = figureFactory(64);
        this.addFigures(ChessFrame,figures);
        ChessFrame.pack();
        ChessFrame.setVisible(true);
        ChessFrame.setTitle("Chess Game");
    }

    public void run(Board board, Player player, Figure figure){

    }

    public static void main(String args[]){

    ChessGame ChessGame1  =  new ChessGame();
    ChessGame1.init();

    }

}