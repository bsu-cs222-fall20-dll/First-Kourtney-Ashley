public class GUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLoader.load(getClass().getResource());
        primaryStage.setTitle("Menu");
        primaryStage.setScene(new Scene(root, 400, 350));
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }

}
