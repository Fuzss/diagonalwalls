package fuzs.diagonalwalls.fabric.client;

import fuzs.diagonalwalls.DiagonalWalls;
import fuzs.diagonalwalls.client.DiagonalWallsClient;
import fuzs.puzzleslib.api.client.core.v1.ClientModConstructor;
import net.fabricmc.api.ClientModInitializer;

public class DiagonalWallsFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientModConstructor.construct(DiagonalWalls.MOD_ID, DiagonalWallsClient::new);
    }
}
