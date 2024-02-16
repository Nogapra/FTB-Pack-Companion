package dev.ftb.packcompanion.forge.integrations.create;

import com.simibubi.create.infrastructure.gui.OpenCreateMenuButton;
import dev.ftb.packcompanion.api.client.pause.AdditionalPauseProvider;
import dev.ftb.packcompanion.api.client.pause.AdditionalPauseTarget;
import dev.ftb.packcompanion.api.client.pause.ScreenHolder;
import dev.ftb.packcompanion.api.client.pause.ScreenWidgetCollection;

public class CreatePauseProvider implements AdditionalPauseProvider {
    @Override
    public ScreenWidgetCollection init(AdditionalPauseTarget target, ScreenHolder screen, int x, int y) {
        return ScreenWidgetCollection.create()
                .addRenderableWidget(new OpenCreateMenuButton(x - 22, y - 21));
    }
}
