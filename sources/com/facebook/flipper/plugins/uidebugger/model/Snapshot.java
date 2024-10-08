package com.facebook.flipper.plugins.uidebugger.model;

import X.AnonymousClass00P;
import X.C16705V2i;
import X.C20486WsS;
import X.C255463uA;
import X.VJ6;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class Snapshot {
    public static final Companion Companion = new Object();
    public final int A00;
    public final String A01;

    public final class Companion {
        public final C255463uA serializer() {
            return C20486WsS.A00;
        }
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Snapshot(String str, int i, int i2) {
        if (3 != (i & 3)) {
            VJ6.A00(C20486WsS.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = i2;
        this.A01 = str;
    }
}
