package com.instagram.debug.devoptions.search.bootstrap;

import X.0Yg;
import X.0qQ;
import X.0sL;
import X.C293645l7;
import X.JTO;
import java.util.Collections;
import java.util.Map;

public final class BootstrapUserInfo$Companion$generateInfosForSurface$1 extends 0Yg implements 0sL {
    public final /* synthetic */ C293645l7 $surface;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BootstrapUserInfo$Companion$generateInfosForSurface$1(C293645l7 r2) {
        super(2);
        this.$surface = r2;
    }

    public final Integer invoke(BootstrapUserInfo bootstrapUserInfo, BootstrapUserInfo bootstrapUserInfo2) {
        Map map = this.$surface.A03;
        if (map == null) {
            map = Collections.emptyMap();
        }
        Object obj = map.get(bootstrapUserInfo2.user.getId());
        0qQ.A0A(obj);
        double A00 = JTO.A00(obj);
        Map map2 = this.$surface.A03;
        if (map2 == null) {
            map2 = Collections.emptyMap();
        }
        Object obj2 = map2.get(bootstrapUserInfo.user.getId());
        0qQ.A0A(obj2);
        return Integer.valueOf(Double.compare(A00, JTO.A00(obj2)));
    }
}
