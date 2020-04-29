import java.util.ArrayList;
import java.util.List;

public class Company implements Notifier {

    private List channels;
    private int id;
    private String name;
    private String city;
    private String address;

    public Company(String name, String city, String address) {
        this.name = name;
        this.city = city;
        this.address = address;
        channels = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyObserver();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void addObserver(Channel ch) {
        channels.add(ch);
    }

    @Override
    public void removeObserver(Channel ch) {
        int i = channels.indexOf(ch);
        if (i >= 0){
            channels.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < channels.size(); i++){
            Channel ch = (Channel)channels.get(i);
            ch.update(this);
        }
    }
}
