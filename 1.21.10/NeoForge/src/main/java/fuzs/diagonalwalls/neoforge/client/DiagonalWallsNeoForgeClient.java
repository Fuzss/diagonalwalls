package fuzs.diagonalwalls.neoforge.client;

import fuzs.diagonalwalls.DiagonalWalls;
import fuzs.diagonalwalls.client.DiagonalWallsClient;
import fuzs.puzzleslib.api.client.core.v1.ClientModConstructor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

@Mod(value = DiagonalWalls.MOD_ID, dist = Dist.CLIENT)
public class DiagonalWallsNeoForgeClient {

    public DiagonalWallsNeoForgeClient() {
        ClientModConstructor.construct(DiagonalWalls.MOD_ID, DiagonalWallsClient::new);
    }
}
