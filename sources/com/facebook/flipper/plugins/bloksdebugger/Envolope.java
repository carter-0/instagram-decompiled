package com.facebook.flipper.plugins.bloksdebugger;

import X.0qQ;
import X.AnonymousClass00P;
import X.C16705V2i;
import X.C20548WtT;
import X.C255463uA;
import X.C255533uI;
import X.C255543uJ;
import X.VJ6;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Serializable
public final class Envolope {
    public static final C255463uA[] A02 = {null, (C255463uA) Event.A00.getValue()};
    public static final SerialDescriptor A03;
    public static final Companion Companion = new Object();
    public final long A00;
    public final Event A01;

    public final class Companion {
        public final C255463uA serializer(C255463uA r2) {
            0qQ.A0B(r2, 0);
            return new C20548WtT(r2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.flipper.plugins.bloksdebugger.Envolope$Companion, java.lang.Object] */
    static {
        C255543uJ r1 = new C255543uJ("com.facebook.flipper.plugins.bloksdebugger.Envolope", (C255533uI) null, 2);
        r1.A01("t", false);
        r1.A01("d", false);
        A03 = r1;
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Envolope(Event event, int i, long j) {
        if (3 != (i & 3)) {
            VJ6.A00(A03, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = j;
        this.A01 = event;
    }
}
