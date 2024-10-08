package com.instagram.debug.quickexperiment;

import X.0qQ;
import X.AnonymousClass7TE;
import X.JTP;
import java.util.Map;

public final class UniverseCollapseTracker {
    public final boolean collapseByDefault;
    public final Map collapsedState = AnonymousClass7TE.A1H();

    public final boolean isCollapsed(String str) {
        0qQ.A0B(str, 0);
        Boolean bool = (Boolean) this.collapsedState.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return this.collapseByDefault;
    }

    public final void toggleCollapsedState(String str) {
        0qQ.A0B(str, 0);
        JTP.A1R(str, this.collapsedState, !isCollapsed(str));
    }

    public UniverseCollapseTracker(boolean z) {
        this.collapseByDefault = z;
    }
}
