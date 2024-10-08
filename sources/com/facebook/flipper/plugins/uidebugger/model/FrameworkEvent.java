package com.facebook.flipper.plugins.uidebugger.model;

import X.AnonymousClass00P;
import X.C16705V2i;
import X.C20466Ws8;
import X.C255453u9;
import X.C255463uA;
import X.C258613zM;
import X.VJ6;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class FrameworkEvent {
    public static final C255463uA[] A07;
    public static final Companion Companion = new Object();
    public final int A00;
    public final int A01;
    public final long A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final Map A06;

    public final class Companion {
        public final C255463uA serializer() {
            return C20466Ws8.A00;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.facebook.flipper.plugins.uidebugger.model.FrameworkEvent$Companion] */
    static {
        C255453u9 r0 = C255453u9.A01;
        A07 = new C255463uA[]{null, null, null, null, null, null, new C258613zM(r0, r0)};
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FrameworkEvent(Long l, String str, String str2, Map map, int i, int i2, int i3, long j) {
        if (127 != (i & 127)) {
            VJ6.A00(C20466Ws8.A01, i, 127);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = i2;
        this.A00 = i3;
        this.A05 = str;
        this.A02 = j;
        this.A03 = l;
        this.A04 = str2;
        this.A06 = map;
    }
}
