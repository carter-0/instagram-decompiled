package com.facebook.flipper.plugins.uidebugger.model;

import X.AnonymousClass00P;
import X.AnonymousClass409;
import X.C16705V2i;
import X.C20464Ws6;
import X.C20467Ws9;
import X.C20468WsA;
import X.C255463uA;
import X.VJ6;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class InitEvent {
    public static final C255463uA[] A03 = {null, new AnonymousClass409(C20467Ws9.A00), new AnonymousClass409(C20464Ws6.A00)};
    public static final Companion Companion = new Object();
    public final int A00;
    public final List A01;
    public final List A02;

    public final class Companion {
        public final C255463uA serializer() {
            return C20468WsA.A00;
        }
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ InitEvent(List list, List list2, int i, int i2) {
        if (7 != (i & 7)) {
            VJ6.A00(C20468WsA.A01, i, 7);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = i2;
        this.A02 = list;
        this.A01 = list2;
    }
}
