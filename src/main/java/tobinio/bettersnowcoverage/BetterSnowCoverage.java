package tobinio.bettersnowcoverage;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tobinio.bettersnowcoverage.config.Config;

public class BetterSnowCoverage implements ClientModInitializer {
    public static final String MOD_ID = "better-snow-coverage";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @SuppressWarnings("null")
    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }

    @Override
    public void onInitializeClient() {
        Config.HANDLER.load();
        Config.update();
    }
}