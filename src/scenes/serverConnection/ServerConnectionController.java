package scenes.serverConnection;

import javafx.stage.Stage;

import java.net.Socket;

public class ServerConnectionController {

    private final ServerConnectionModel model;
    private final ServerConnectionView view;


    public ServerConnectionController(){
        this.model = new ServerConnectionModel();
        this.view = new ServerConnectionView(model);
    }

    public void show(Stage stage) {
        view.createLayout();
        view.show(stage);
    }

    public Socket tryToConnect() {
        model.tryConnect();
        view.showConnectionAlert(getIsConnected());
        return model.getSocket();
    }

    public boolean getIsConnected() {
        return model.isConnected;
    }
}
