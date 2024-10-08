package com.facebook.flipper.plugins.uidebugger.model;

import X.AnonymousClass00P;
import X.C16705V2i;
import X.C20467Ws9;
import X.C255463uA;
import X.VJ6;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class FrameworkEventMetadata {
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;

    public final class Companion {
        public final C255463uA serializer() {
            return C20467Ws9.A00;
        }
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FrameworkEventMetadata(String str, String str2, int i) {
        if (3 != (i & 3)) {
            VJ6.A00(C20467Ws9.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = str;
        this.A00 = str2;
    }
}
