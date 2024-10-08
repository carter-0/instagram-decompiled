package com.facebook.flipper.plugins.uidebugger.model;

import X.0sl;
import X.AnonymousClass00P;
import X.C16705V2i;
import X.C20482WsO;
import X.C20805WzI;
import X.C255453u9;
import X.C255463uA;
import X.C258613zM;
import X.VJ6;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonPrimitiveSerializer;

@Serializable
public final class Metadata {
    public static final C255463uA[] A09 = {null, null, null, null, null, new C20805WzI((C255463uA) InspectableValue.A00.getValue()), new C258613zM(C255453u9.A01, JsonPrimitiveSerializer.A01), null, null};
    public static final Companion Companion = new Object();
    public final int A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Map A06;
    public final Set A07;
    public final boolean A08;

    public final class Companion {
        public final C255463uA serializer() {
            return C20482WsO.A00;
        }
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Metadata(Integer num, Integer num2, String str, String str2, String str3, Map map, Set set, int i, int i2, boolean z) {
        if (415 != (i & 415)) {
            VJ6.A00(C20482WsO.A01, i, 415);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = i2;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A08 = z;
        if ((i & 32) == 0) {
            this.A07 = 0sl.A00;
        } else {
            this.A07 = set;
        }
        if ((i & 64) == 0) {
            this.A06 = null;
        } else {
            this.A06 = map;
        }
        this.A02 = num;
        this.A01 = num2;
    }
}
