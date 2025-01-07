package moe.sebiann.anvillimityeet;

import net.fabricmc.api.ModInitializer;
import org.slf4j.*;

public class AnvilLimitYeet implements ModInitializer {
    public static final String MOD_ID = "meowcraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Anvil Limit YEET loaded!");
    }
}
