package com.fasterxml.jackson.datatype.guava.ser;

import X.17Z;
import X.AnonymousClass4eE;
import X.C11031S6j;
import X.C13901TjO;
import X.C268894eF;
import X.C268924eI;
import X.C269504fE;
import X.C269714fZ;
import X.C269754fd;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.Range;
import java.util.List;

public class RangeSetSerializer extends JsonSerializer implements C269714fZ {
    public C268894eF A00;

    public final /* bridge */ /* synthetic */ void A0A(17Z r3, C269504fE r4, Object obj) {
        JsonSerializer A0K;
        C11031S6j s6j = (C11031S6j) obj;
        C268894eF r0 = this.A00;
        if (r0 == null) {
            A0K = r4.A0N(List.class);
        } else {
            A0K = r4.A0K(r0);
        }
        A0K.A0A(r3, r4, s6j.A00());
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object, com.fasterxml.jackson.datatype.guava.ser.RangeSetSerializer] */
    public final JsonSerializer ALi(C13901TjO tjO, C269504fE r8) {
        if (tjO == null) {
            return this;
        }
        ? obj = new Object();
        AnonymousClass4eE A05 = r8.A05();
        Class<Range> cls = Range.class;
        obj.A00 = A05.A0A(A05.A04(A05.A06((C269754fd) null, C268924eI.A02(cls, new C268894eF[]{tjO.CAJ().A07(0)}), cls)), List.class);
        return obj;
    }
}
