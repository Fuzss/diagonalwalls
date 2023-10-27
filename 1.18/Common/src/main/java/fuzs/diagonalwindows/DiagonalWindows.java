package fuzs.diagonalwindows;

import fuzs.diagonalwindows.init.ModRegistry;
import fuzs.puzzleslib.api.core.v1.ModConstructor;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DiagonalWindows implements ModConstructor {
    public static final String MOD_ID = "diagonalwindows";
    public static final String MOD_NAME = "Diagonal Windows";
    public static final Logger LOGGER = LogManager.getLogger(DiagonalWindows.MOD_NAME);

    @Override
    public void onConstructMod() {
        ModRegistry.touch();
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
