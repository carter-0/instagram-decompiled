package com.facebook.flipper.plugins.uidebugger.model;

import X.0Yt;
import X.0qQ;
import X.0sm;
import X.C16705V2i;
import X.C20482WsO;
import X.C255463uA;
import X.C258613zM;
import X.C360278eK;
import X.C73531PeN;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class MetadataUpdateEvent {
    public static final C255463uA[] A01 = {new C258613zM(C360278eK.A00, C20482WsO.A00)};
    public static final Companion Companion = new Object();
    public final Map A00;

    public final class Companion {
        public final C255463uA serializer() {
            return C73531PeN.A00;
        }
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ MetadataUpdateEvent(Map map, int i) {
        if ((i & 1) == 0) {
            this.A00 = 0Yt.A0E();
        } else {
            this.A00 = map;
        }
    }

    public MetadataUpdateEvent() {
        0sm A0E = 0Yt.A0E();
        0qQ.A0B(A0E, 1);
        this.A00 = A0E;
    }
}
