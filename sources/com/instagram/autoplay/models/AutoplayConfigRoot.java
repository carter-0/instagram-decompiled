package com.instagram.autoplay.models;

import X.0qQ;
import X.0sn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AutoplayConfigRoot {
    public final List autoplayConfigurations;
    public final AutoplayGlobalConfig globalConfig;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AutoplayConfigRoot(AutoplayGlobalConfig autoplayGlobalConfig, 0sn r3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(autoplayGlobalConfig, (i & 2) != 0 ? 0sn.A00 : r3);
    }

    public final List getAutoplayConfigurations() {
        return this.autoplayConfigurations;
    }

    public final AutoplayGlobalConfig getGlobalConfig() {
        return this.globalConfig;
    }

    public AutoplayConfigRoot(AutoplayGlobalConfig autoplayGlobalConfig, List list) {
        0qQ.A0B(autoplayGlobalConfig, 1);
        0qQ.A0B(list, 2);
        this.globalConfig = autoplayGlobalConfig;
        this.autoplayConfigurations = list;
    }
}
