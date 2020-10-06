package xyz.wagyourtail.jsmacros.mixins.access;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.client.gui.screen.ingame.SignEditScreen;
import net.minecraft.text.LiteralText;
import xyz.wagyourtail.jsmacros.access.ISignEditScreen;

@Mixin(SignEditScreen.class)
public class MixinSignEditScreen implements ISignEditScreen {

    @Shadow
    @Final
    private String[] text;
    
    @Shadow
    @Final
    private SignBlockEntity sign;
    
    @Override
    public void jsmacros_setLine(int line, String text) {
        this.text[line] = text;
        this.sign.setTextOnRow(line, new LiteralText(text));
    }
    
}