module ni.edu.uni.fcys.programacion2.simulacionexamen {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens ni.edu.uni.fcys.programacion2.simulacionexamen to javafx.fxml;
    exports ni.edu.uni.fcys.programacion2.simulacionexamen;
    exports ni.edu.uni.fcys.programacion2.simulacionexamen.controller;
    exports ni.edu.uni.fcys.programacion2.simulacionexamen.pojo;
    }
