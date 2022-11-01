public class Parameters {

    private String OS;
    private String gamePath;
    private String credentials;
    private int noLives;

    public Parameters(String OS, String gamePath, String credentials, int noLives){
        this.OS = OS;
        this.gamePath = gamePath;
        this.credentials = credentials;
        this.noLives = noLives;
    }

    @Override
    public String toString(){
        return "\t OS: " + this.OS + "\n\t Game Path:" + this.gamePath + "\n\t Credentials: " + this.credentials +
                "\n\t No. lives remaining: " + this.noLives;
    }
}
