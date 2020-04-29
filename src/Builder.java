
import java.util.Date;

public class Builder  {

    private Man newMan;

    public Builder() {
        newMan = new Man();
    }

    public Builder withName(String name){
        newMan.setName(name);
        return this;
    }

    public Builder withSurname(String surname){
        newMan.setSurname(surname);
        return this;
    }

    public Builder withSurnameTwo(String surnameTwo){
        newMan.setSurnameTwo(surnameTwo);
        return this;
    }

    public Builder withBirthday(Date birthday){
        newMan.setBirthday(birthday);
        return this;
    }

    public Builder withContact(String contact){
        newMan.setContact(contact);
        return this;
    }

    public Builder withEducation(String education){
        newMan.setEducation(education);
        return this;
    }

    public Builder withClassifier(String classifier){
        newMan.setClassifier(classifier);
        return this;
    }

    public Builder withCity(String city){
        newMan.setCity(city);
        return this;
    }

    public Builder withLanguage(String language){
        newMan.setLanguage(language);
        return this;
    }

    public Builder withCompanyName(String companyName){
        newMan.setCompanyName(companyName);
        return this;
    }

    public Builder withCompany(Company company){
        newMan.setCompany(company);
        return this;
    }

    public Man build(){
        return newMan;
    }

}
