import net.minecraft.init.SoundEvents;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.minecraftforge.event.entity.PlaySoundAtEntityEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Matt on 11/14/2016.
 */
public class EventCanceler {
        @SubscribeEvent
        public void cancelevent(PlaySoundAtEntityEvent event)
        {
            if (event.getSound() == SoundEvents.ENTITY_CHICKEN_STEP) {
                event.setCanceled(true);
            }
        }
    }
