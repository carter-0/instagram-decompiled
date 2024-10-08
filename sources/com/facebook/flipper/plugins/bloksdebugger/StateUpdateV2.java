package com.facebook.flipper.plugins.bloksdebugger;

import X.AnonymousClass00P;
import X.AnonymousClass409;
import X.C16705V2i;
import X.C20432WrI;
import X.C20453Wrv;
import X.C255463uA;
import X.C360278eK;
import X.VJ6;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class StateUpdateV2 extends Event {
    public static final C255463uA[] A06 = {null, null, null, null, null, new AnonymousClass409(C360278eK.A00)};
    public static final Companion Companion = new Object();
    public final Object A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public final class Companion {
        public final C255463uA serializer() {
            return C20453Wrv.A00;
        }
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ StateUpdateV2(Object obj, String str, String str2, String str3, @Serializable(with = C20432WrI.class) String str4, List list, int i) {
        if (63 != (i & 63)) {
            VJ6.A00(C20453Wrv.A01, i, 63);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = obj;
        this.A01 = str4;
        this.A05 = list;
    }
}
