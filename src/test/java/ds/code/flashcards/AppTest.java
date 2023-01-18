//import static org.junit.jupiter.api.Assertions.assertEquals;
//import javafx.scene.Scene;
//import javafx.scene.canvas.Canvas;
//import javafx.stage.Stage;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.testfx.framework.junit5.ApplicationExtension;
//import org.testfx.framework.junit5.Start;
//
//@ExtendWith(ApplicationExtension.class)
//public class AppTest {
//    private app.App app;
//
//    @Start
//    public void start(Stage stage) {
//        app = new app.App();
//        app.start(stage);
//    }
//
//    @Test
//    public void testSceneDimensions() {
//        Scene scene = app.getScene();
//        assertEquals(1200, scene.getWidth());
//        assertEquals(800, scene.getHeight());
//    }
//
//    @Test
//    public void testCanvasDimensions() {
//        Canvas canvas = (Canvas) app.getScene().getRoot().getChildren().get(0);
//        assertEquals(1200, canvas.getWidth());
//        assertEquals(800, canvas.getHeight());
//    }
//
//    @Test
//    public void testMouseMovedEvent() {
//        Canvas canvas = (Canvas) app.getScene().getRoot().getChildren().get(0);
//        canvas.getOnMouseMoved().handle(null);
//        assertEquals(1, app.getCardStack().size());
//    }
//
//    @Test
//    public void testPrimaryStageResizable() {
//        assertEquals(false, app.getPrimaryStage().isResizable());
//    }
//
//    @Test
//    public void testStopMethod() {
//        //test if the connection is closed after stop is called
//    }
//}
