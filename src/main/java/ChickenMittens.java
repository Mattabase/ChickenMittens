import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Created by TheMattaBase on 11/14/2016.
 */
@Mod(modid="chickenmittens", name="Chicken Mittens", version="1.0.1", acceptableRemoteVersions="*")
public class ChickenMittens
{
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        if (event.getSide() == Side.CLIENT) {
            MinecraftForge.EVENT_BUS.register(new EventCanceler());
        }
    }
}
