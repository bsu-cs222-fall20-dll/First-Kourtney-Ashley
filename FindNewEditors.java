public class FindNewEditors {
    public String editorUsername;
    public String firstPageTimeStamp;
    public int numberOfEditsMade = 0;

    public FindNewEditors(String editorUsername, String timeStamps) {
        this.editorUsername = editorUsername.replaceAll("\" ","");
        this.timeStamps = timeStamps.replaceAll("\" ","");
    }

    public void addNewEdit() {
        numberOfEditsMade += 1;
    }
}
