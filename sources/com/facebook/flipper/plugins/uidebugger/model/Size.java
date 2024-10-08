package com.facebook.flipper.plugins.uidebugger.model;

import X.AnonymousClass00P;
import X.C16705V2i;
import X.C20433WrJ;
import X.C20485WsR;
import X.C255463uA;
import X.VJ6;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class Size {
    public static final Companion Companion = new Object();
    public final Number A00;
    public final Number A01;

    public final class Companion {
        public final C255463uA serializer() {
            return C20485WsR.A00;
        }
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Size(Number number, @Serializable(with = C20433WrJ.class) Number number2, @Serializable(with = C20433WrJ.class) int i) {
        if (3 != (i & 3)) {
            VJ6.A00(C20485WsR.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = number;
        this.A00 = number2;
    }
}
