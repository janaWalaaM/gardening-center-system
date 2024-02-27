/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.gardening_center;

/**
 *
 * @author janawalaa
 */
public class Cards {
   String Size;
   String Color;
   int fontSize;
    public Cards() {
    }

    public Cards(String Size, String Color, int fontSize) {
        this.Size = Size;
        this.Color = Color;
        this.fontSize = fontSize;
    }

    public String getSize() {
        return Size;
    }

    public String getColor() {
        return Color;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "The Size:" + Size + ", Color=" + Color + ", fontSize=" + fontSize ;
    }
    
   
   
}

