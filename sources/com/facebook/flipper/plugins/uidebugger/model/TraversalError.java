package com.facebook.flipper.plugins.uidebugger.model;

import X.AnonymousClass00P;
import X.C16705V2i;
import X.C20488WsU;
import X.C255463uA;
import X.VJ6;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class TraversalError {
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final class Companion {
        public final C255463uA serializer() {
            return C20488WsU.A00;
        }
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ TraversalError(String str, String str2, String str3, String str4, int i) {
        if (15 != (i & 15)) {
            VJ6.A00(C20488WsU.A01, i, 15);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A03 = str4;
    }
}
