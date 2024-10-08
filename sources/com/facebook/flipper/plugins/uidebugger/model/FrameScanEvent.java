package com.facebook.flipper.plugins.uidebugger.model;

import X.AnonymousClass00P;
import X.AnonymousClass409;
import X.C16705V2i;
import X.C20465Ws7;
import X.C20466Ws8;
import X.C20483WsP;
import X.C255463uA;
import X.VJ6;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class FrameScanEvent {
    public static final C255463uA[] A04 = {null, new AnonymousClass409(C20483WsP.A00), null, new AnonymousClass409(C20466Ws8.A00)};
    public static final Companion Companion = new Object();
    public final long A00;
    public final Snapshot A01;
    public final List A02;
    public final List A03;

    public final class Companion {
        public final C255463uA serializer() {
            return C20465Ws7.A00;
        }
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FrameScanEvent(Snapshot snapshot, List list, List list2, int i, long j) {
        if (15 != (i & 15)) {
            VJ6.A00(C20465Ws7.A01, i, 15);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = j;
        this.A03 = list;
        this.A01 = snapshot;
        this.A02 = list2;
    }
}
