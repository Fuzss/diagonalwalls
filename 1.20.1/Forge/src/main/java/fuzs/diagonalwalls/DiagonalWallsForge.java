package fuzs.diagonalwalls;

import fuzs.puzzleslib.api.core.v1.ModConstructor;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;

@Mod(DiagonalWalls.MOD_ID)
@Mod.EventBusSubscriber(modid = DiagonalWalls.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DiagonalWallsForge {

    @SubscribeEvent
    public static void onConstructMod(final FMLConstructModEvent evt) {
        ModConstructor.construct(DiagonalWalls.MOD_ID, DiagonalWalls::new);
    }
}
