module se233.chapter1 {
    requires javafx.fxml;
    requires javafx.controls;
    requires org.apache.logging.log4j.slf4j;
    requires slf4j.api;

    opens se233.chapter1 to javafx.fxml;
    exports se233.chapter1;


}