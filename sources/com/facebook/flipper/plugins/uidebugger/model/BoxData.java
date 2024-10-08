package com.facebook.flipper.plugins.uidebugger.model;

import X.AnonymousClass00P;
import X.AnonymousClass409;
import X.C16705V2i;
import X.C20460Ws2;
import X.C255463uA;
import X.C2592140v;
import X.VJ6;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class BoxData {
    public static final C255463uA[] A03;
    public static final Companion Companion = new Object();
    public final List A00;
    public final List A01;
    public final List A02;

    public final class Companion {
        public final C255463uA serializer() {
            return C20460Ws2.A00;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.flipper.plugins.uidebugger.model.BoxData$Companion, java.lang.Object] */
    static {
        C2592140v r3 = C2592140v.A00;
        A03 = new C255463uA[]{new AnonymousClass409(r3), new AnonymousClass409(r3), new AnonymousClass409(r3)};
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ BoxData(int i, List list, List list2, List list3) {
        if (7 != (i & 7)) {
            VJ6.A00(C20460Ws2.A01, i, 7);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = list;
        this.A00 = list2;
        this.A02 = list3;
    }
}
