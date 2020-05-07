public class ManController {

    Man man;
    ManView manView;

    public ManController(Man man, ManView manView) {
        this.man = man;
        this.manView = manView;
    }

    public void setManName(String name){
        man.setName(name);
    }
    public void setManSurname(String manSurname){
        man.setSurname(manSurname);
    }

    public void updateView(){
        manView.ManView(man);
    }
}
