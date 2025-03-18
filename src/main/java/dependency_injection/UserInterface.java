package dependency_injection;

public interface UserInterface {
    public void start();
    public void setPerson(PersonInterface person);
    public void getPerson();
    public String getTeam();
    public String getEmail();


}
