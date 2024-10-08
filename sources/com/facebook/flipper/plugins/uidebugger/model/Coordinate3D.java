package com.facebook.flipper.plugins.uidebugger.model;

import X.AnonymousClass00P;
import X.C16705V2i;
import X.C20433WrJ;
import X.C20463Ws5;
import X.C255463uA;
import X.VJ6;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class Coordinate3D {
    public static final Companion Companion = new Object();
    public final Number A00;
    public final Number A01;
    public final Number A02;

    public final class Companion {
        public final C255463uA serializer() {
            return C20463Ws5.A00;
        }
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Coordinate3D(Number number, @Serializable(with = C20433WrJ.class) Number number2, @Serializable(with = C20433WrJ.class) Number number3, @Serializable(with = C20433WrJ.class) int i) {
        if (7 != (i & 7)) {
            VJ6.A00(C20463Ws5.A01, i, 7);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = number;
        this.A01 = number2;
        this.A02 = number3;
    }
}
