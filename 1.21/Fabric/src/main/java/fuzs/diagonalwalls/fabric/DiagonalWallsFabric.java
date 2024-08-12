package fuzs.diagonalwalls.fabric;

import fuzs.diagonalwalls.DiagonalWalls;
import fuzs.puzzleslib.api.core.v1.ModConstructor;
import net.fabricmc.api.ModInitializer;

public class DiagonalWallsFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        ModConstructor.construct(DiagonalWalls.MOD_ID, DiagonalWalls::new);
    }
}
