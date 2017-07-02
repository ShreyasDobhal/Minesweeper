package minesweeper;

public class Node
{
    public int val;
    public boolean visible=false,bomb=false,mark=false;
    public javax.swing.JButton btn;
    public void activateBomb()
    {
        this.bomb=true;
    }//activateBomb
}//Node