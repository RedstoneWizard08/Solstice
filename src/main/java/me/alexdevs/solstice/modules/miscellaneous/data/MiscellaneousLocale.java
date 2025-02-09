package me.alexdevs.solstice.modules.miscellaneous.data;

import java.util.Map;

public class MiscellaneousLocale {
    public static final Map<String, String> MODULE = Map.ofEntries(
            Map.entry("noEffects", "<gold>This player has no active effects.</gold>"),
            Map.entry("effectHeader", "<gold>Active effects:</gold>"),
            Map.entry("effect", "<gold><yellow>${effect}</yellow>: <yellow>x${amplifier}</yellow> for <yellow>${duration}</yellow></gold>"),
            Map.entry("infinite", "infinite"),
            Map.entry("flightEnabled", "<green>Flight enabled</green>"),
            Map.entry("flightDisabled", "<gold>Flight disabled</gold>"),
            Map.entry("flightEnabledForOther", "<green>Flight enabled for ${player}</green>"),
            Map.entry("flightDisabledForOther", "<gold>Flight disabled for ${player}</gold>"),
            Map.entry("godEnabled", "<green>Invincibility enabled</green>"),
            Map.entry("godDisabled", "<gold>Invincibility disabled</gold>"),
            Map.entry("godEnabledForOther", "<green>Invincibility enabled for ${player}</green>"),
            Map.entry("godDisabledForOther", "<gold>Invincibility disabled for ${player}</gold>")
    );
}
