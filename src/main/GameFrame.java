package main;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mkrzyzy on 3/31/2017.
 */

public class GameFrame extends JFrame {

    //private int i = 8;
    //private int j = 8;

    //JPanel[][] panelHolder = new JPanel[i][j];

    GridBagConstraints gameConstraints ;
    GridBagLayout gameLayout ;

    GameFrame() {

        //gameConstraints.weightx = 0.5;
        //gameConstraints.weighty = 0.5;

        //gameConstraints.insets = new Insets(0,0,0,0);

        gameConstraints = new GridBagConstraints();
        gameLayout = new GridBagLayout();
        setLayout(gameLayout);
/*
        for (int m = 0; m < i; m++) {
            for (int n = 0; n < j; n++) {

                panelHolder[m][n] = new JPanel();

                panelHolder[m][n].setBorder(null);
                gameConstraints.gridx = n;
                gameConstraints.gridy = m;
                add(panelHolder[m][n], gameConstraints);

            }
        }
  */

    }
}
