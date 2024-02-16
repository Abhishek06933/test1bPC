module com.example.test1b_pc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test1b_pc to javafx.fxml;
    exports com.example.test1b_pc;
}