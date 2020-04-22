import java.util.Date;

public class Man {
    private int id;
    private String name;
    private String surname;
    private String surnameTwo;
    private Date birthday;
    private String contact;
    private String education;
    private String classifier;
    private String city;
    private String language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurnameTwo() {
        return surnameTwo;
    }

    public void setSurnameTwo(String surnameTwo) {
        this.surnameTwo = surnameTwo;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getClassifier() {
        return classifier;
    }

    public void setClassifier(String classifier) {
        this.classifier = classifier;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public static class Builder {
        private Man newMan;
        public Builder() {
            newMan = new Man();
        }

        public Builder withName(String name){
            newMan.name = name;
            return this;
        }

        public Builder withSurname(String surname){
            newMan.surname = surname;
            return this;
        }

        public Builder withSurnameTwo(String surnameTwo){
            newMan.surnameTwo = surnameTwo;
            return this;
        }

        public Builder withBirthday(Date birthday){
            newMan.birthday = birthday;
            return this;
        }

        public Builder withContact(String contact){
            newMan.contact = contact;
            return this;
        }

        public Builder withEducation(String education){
            newMan.education = education;
            return this;
        }

        public Builder withClassifier(String classifier){
            newMan.classifier = classifier;
            return this;
        }

        public Builder withCity(String city){
            newMan.city = city;
            return this;
        }

        public Builder withLanguage(String language){
            newMan.language = language;
            return this;
        }

        public Man build(){
            return newMan;
        }
    }



}
