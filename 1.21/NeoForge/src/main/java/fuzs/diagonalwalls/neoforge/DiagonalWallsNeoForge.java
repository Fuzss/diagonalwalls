package fuzs.diagonalwalls.neoforge;

import fuzs.diagonalwalls.DiagonalWalls;
import fuzs.puzzleslib.api.core.v1.ModConstructor;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;

@Mod(DiagonalWalls.MOD_ID)
@Mod.EventBusSubscriber(modid = DiagonalWalls.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DiagonalWallsNeoForge {

    @SubscribeEvent
    public static void onConstructMod(final FMLConstructModEvent evt) {
        ModConstructor.construct(DiagonalWalls.MOD_ID, DiagonalWalls::new);
    }
}
