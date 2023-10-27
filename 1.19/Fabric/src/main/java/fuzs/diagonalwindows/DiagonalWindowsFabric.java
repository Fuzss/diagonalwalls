package fuzs.diagonalwindows;

import fuzs.puzzleslib.core.CoreServices;
import net.fabricmc.api.ModInitializer;

public class DiagonalWindowsFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        CoreServices.FACTORIES.modConstructor(DiagonalWindows.MOD_ID).accept(new DiagonalWindows());
    }
}
