package fuzs.diagonalwalls;

import fuzs.diagonalblocks.api.v2.DiagonalBlockType;
import fuzs.diagonalblocks.api.v2.DiagonalBlockTypes;
import fuzs.puzzleslib.api.core.v1.ModConstructor;
import fuzs.puzzleslib.api.core.v1.utility.ResourceLocationHelper;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DiagonalWalls implements ModConstructor {
    public static final String MOD_ID = "diagonalwalls";
    public static final String MOD_NAME = "Diagonal Walls";
    public static final Logger LOGGER = LogManager.getLogger(DiagonalWalls.MOD_NAME);

    @Override
    public void onConstructMod() {
        DiagonalBlockType.register(DiagonalBlockTypes.WALL);
    }

    public static ResourceLocation id(String path) {
        return ResourceLocationHelper.fromNamespaceAndPath(MOD_ID, path);
    }
}
