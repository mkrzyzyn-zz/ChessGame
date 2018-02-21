package main;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by mkrzyzy on 3/30/2017.
 */
public class Figure extends JButton {

    public int pos_x, pos_y;

    public Figure(ChessGame.Figures figure, int i) {

        this.setPreferredSize(new Dimension(90,90));
        this.setFont(new Font(this.getFont().getName(), this.getFont().getStyle(), 50));
        this.setVerticalAlignment(SwingConstants.CENTER);
  //      this.setBackground(Color.BLACK);
    //    this.setForeground(Color.white);
        Border emptyBorder = BorderFactory.createEmptyBorder();
        this.setBorder(emptyBorder);
        this.setFocusable(true);
//        this.setText("\u2654");
        this.setBorder(null);
        this.setBorderPainted(false);
        this.setMargin(new Insets(0,0,0,0));

    switch (figure){

        case EMPTY:

            pos_y = (int) ((i-1)/8) +2 ; pos_x = (i-1)%8;
            this.setText("");
            System.out.println(pos_x+" "+pos_y);
            break;
        case WP:

            this.setText("\u2659"); this.setForeground(Color.WHITE);

            if (i==1) {pos_y=6;pos_x=0;}
            if (i==2) {pos_y=6;pos_x=1;}
            if (i==3) {pos_y=6;pos_x=2;}
            if (i==4) {pos_y=6;pos_x=3;}
            if (i==5) {pos_y=6;pos_x=4;}
            if (i==6) {pos_y=6;pos_x=5;}
            if (i==7) {pos_y=6;pos_x=6;}
            if (i==8) {pos_y=6;pos_x=7;}

            break;
        case WR:
            this.setText("\u2656"); this.setForeground(Color.WHITE);
            if (i==1) {pos_x = 0; pos_y = 7;} else {pos_x=7;pos_y=7;};
            break;
        case WKN:
            this.setText("\u2658"); this.setForeground(Color.WHITE);
            if (i==1) {pos_x = 1; pos_y = 7;} else {pos_x=6;pos_y=7;};
            break;
        case WB:
            this.setText("\u2657"); this.setForeground(Color.WHITE);
            if (i==1) {pos_x = 2; pos_y = 7;} else {pos_x=5;pos_y=7;};
            break;
        case WQ:
            this.setText("\u2655"); this.setForeground(Color.WHITE);
            pos_x = 3; pos_y = 7;
            break;
        case WKI:
            this.setText("\u2654"); this.setForeground(Color.WHITE);
            pos_x = 4; pos_y = 7;
            break;
        case BP:

            this.setText("\u265f"); this.setForeground(Color.BLACK);

            if (i==1) {pos_y=1;pos_x=0;}
            if (i==2) {pos_y=1;pos_x=1;}
            if (i==3) {pos_y=1;pos_x=2;}
            if (i==4) {pos_y=1;pos_x=3;}
            if (i==5) {pos_y=1;pos_x=4;}
            if (i==6) {pos_y=1;pos_x=5;}
            if (i==7) {pos_y=1;pos_x=6;}
            if (i==8) {pos_y=1;pos_x=7;}
            break;

        case BB:
            this.setText("\u265d"); this.setForeground(Color.BLACK);
            if (i==1) {pos_x = 2; pos_y = 0;} else {pos_x=5;pos_y=0;};
        break;

        case BR:
            this.setText("\u265c"); this.setForeground(Color.BLACK);
            if (i==1) {pos_x = 0; pos_y = 0;} else {pos_x=7;pos_y=0;};
        break;

        case BQ:
            this.setText("\u265b"); this.setForeground(Color.BLACK);
            pos_x = 3; pos_y = 0;
            break;
        case BKI:
            this.setText("\u265a"); this.setForeground(Color.BLACK);
            pos_x = 4; pos_y = 0;
            break;
        case BKN:
            this.setText("\u265e"); this.setForeground(Color.BLACK);
            if (i==1) {pos_x = 1; pos_y = 0;} else {pos_x=6;pos_y=0;};
            break;
    }

        if ((pos_y+pos_x) % 2 == 0) {this.setBackground(Color.DARK_GRAY);} else this.setBackground(Color.GRAY);
    }
}
