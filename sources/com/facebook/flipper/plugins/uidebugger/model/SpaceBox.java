package com.facebook.flipper.plugins.uidebugger.model;

import X.AnonymousClass00P;
import X.C16705V2i;
import X.C20487WsT;
import X.C255463uA;
import X.VJ6;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class SpaceBox {
    public static final Companion Companion = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final class Companion {
        public final C255463uA serializer() {
            return C20487WsT.A00;
        }
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ SpaceBox(int i, int i2, int i3, int i4, int i5) {
        if (15 != (i & 15)) {
            VJ6.A00(C20487WsT.A01, i, 15);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
        this.A01 = i5;
    }
}
