package fuzs.diagonalwalls;

import fuzs.diagonalblocks.api.v2.block.type.DiagonalBlockType;
import fuzs.diagonalblocks.api.v2.block.type.DiagonalBlockTypes;
import fuzs.puzzleslib.api.core.v1.ModConstructor;
import net.minecraft.resources.Identifier;
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

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
