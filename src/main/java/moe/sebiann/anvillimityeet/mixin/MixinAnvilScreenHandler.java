package moe.sebiann.anvillimityeet.mixin;

import net.minecraft.entity.player.*;
import net.minecraft.screen.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(AnvilScreenHandler.class)
public abstract class MixinAnvilScreenHandler extends ForgingScreenHandler {
    public MixinAnvilScreenHandler(ScreenHandlerType<?> type, int syncId, PlayerInventory playerInventory, ScreenHandlerContext context) {
        super(type, syncId, playerInventory, context, null);
    }

    @Redirect(at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/PlayerEntity;getAbilities()Lnet/minecraft/entity/player/PlayerAbilities;"), method = "updateResult")
    public PlayerAbilities redirectGetAbilities(PlayerEntity player) {
        PlayerAbilities abilities = player.getAbilities(); // Get the actual PlayerAbilities
        abilities.creativeMode = true; // Set creative mode to true
        return abilities; // Return the modified abilities
    }
}