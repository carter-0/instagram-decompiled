package com.facebook.flipper.plugins.uidebugger.model;

import X.AnonymousClass00P;
import X.C16705V2i;
import X.C20461Ws3;
import X.C255463uA;
import X.VJ6;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class Color {
    public static final Companion Companion = new Object();
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final class Companion {
        public final C255463uA serializer() {
            return C20461Ws3.A00;
        }
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Color(int i, int i2, int i3, int i4, float f) {
        if (15 != (i & 15)) {
            VJ6.A00(C20461Ws3.A01, i, 15);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A03 = i2;
        this.A02 = i3;
        this.A01 = i4;
        this.A00 = f;
    }
}
