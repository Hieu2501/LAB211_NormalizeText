
package view;

import common.Library;

/**
 *
 * @author ACER
 * @param <T>
 */
public abstract class View<T> {

    protected String title;
    Library l = new Library();

    public View() {
        title = "";
    }

    public View(String td) {
        title = td;
    }

    //-------------------------------------------
    public void display() {
        System.out.println(title);
    }
//-------------------------------------------

    public String getSelected() {
        display();
        return l.getString("Enter file name: ");

    }
//-------------------------------------------

    public abstract void execute(String s);
//-------------------------------------------

    public void run() {
        String s = getSelected();
        execute(s);
    }

}
