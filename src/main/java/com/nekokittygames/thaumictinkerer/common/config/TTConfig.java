package com.nekokittygames.thaumictinkerer.common.config;


import com.nekokittygames.thaumictinkerer.common.libs.LibMisc;
import net.minecraftforge.common.config.Config;

@Config(modid = LibMisc.MOD_ID)
@Config.LangKey("thaumictinkerer.config.title")
public class TTConfig {
    @Config.Comment("This is the amount of uses given to the Talisman of Remedium.")
    @Config.Name("Talisman of Remedium Uses")
    @Config.LangKey("thaumictinkerer.config.talisman")
    @Config.RangeInt(min=0)
    public static int talismanUses=100;
}
