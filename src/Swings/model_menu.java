
package Swings;

import javax.swing.Icon;

/**
 *
 * @author user
 */
public class model_menu {

    /**
     * @return the numb
     */
    public int getNumb() {
        return numb;
    }

    /**
     * @param numb the numb to set
     */
    public void setNumb(int numb) {
        this.numb = numb;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the Descrip
     */
    public String getDescrip() {
        return Descrip;
    }

    /**
     * @param Descrip the Descrip to set
     */
    public void setDescrip(String Descrip) {
        this.Descrip = Descrip;
    }

    /**
     * @return the amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * @return the image
     */
    public Icon getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Icon image) {
        this.image = image;
    }
    private int numb;
    private String name;
    private String Descrip;
    private Double amount;
    private Icon image;

    public model_menu() {
    }

    public model_menu(int numb, String name, String Descrip, Double amount, Icon image) {
        this.numb = numb;
        this.name = name;
        this.Descrip = Descrip;
        this.amount = amount;
        this.image = image;
    }
    
    
}
