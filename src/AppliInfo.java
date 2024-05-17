public class AppliInfo {
    
    private String name;
    private String version;
    private String author;
    private String info;

    public AppliInfo(String name, String version, String author, String info){

        this.name = new String(name);
        this.version = new String(version);
        this.author = new String(author);
        this.info = new String(info);
    }

    public String getDescription(){

        String description = new String();
        description = description.concat("===" + name + "===\n");
        description = description.concat("Version :" + version + "\n");
        description = description.concat("Autheur :" + author + "\n");
        description = description.concat(info);

        return description;
    }
}
