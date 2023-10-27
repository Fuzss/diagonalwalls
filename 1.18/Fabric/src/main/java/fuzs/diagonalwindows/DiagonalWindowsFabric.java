package fuzs.diagonalwindows;

import fuzs.puzzleslib.api.core.v1.ModConstructor;
import net.fabricmc.api.ModInitializer;

public class DiagonalWindowsFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        ModConstructor.construct(DiagonalWindows.MOD_ID, DiagonalWindows::new);
    }
}
