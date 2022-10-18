package xyz.wagyourtail.jsmacros.client.api.helpers.entity.specialized.vehicle;

import net.minecraft.entity.vehicle.FurnaceMinecartEntity;
import net.minecraft.state.property.Properties;

import xyz.wagyourtail.jsmacros.client.api.helpers.EntityHelper;

/**
 * @author Etheradon
 * @since 1.8.4
 */
@SuppressWarnings("unused")
public class FurnaceMinecartEntityHelper extends EntityHelper<FurnaceMinecartEntity> {

    public FurnaceMinecartEntityHelper(FurnaceMinecartEntity base) {
        super(base);
    }

    /**
     * @return {@code} true if the furnace minecart is powered, {@code false} otherwise.
     *
     * @since 1.8.4
     */
    public boolean isActive() {
        return base.getContainedBlock().get(Properties.LIT);
    }

}
