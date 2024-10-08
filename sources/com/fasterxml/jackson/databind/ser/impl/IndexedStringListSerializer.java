package com.fasterxml.jackson.databind.ser.impl;

import X.16L;
import X.17Z;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.C10798RyK;
import X.C269504fE;
import X.Pxi;
import X.SPK;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.util.List;

@JacksonStdImpl
public final class IndexedStringListSerializer extends StaticListSerializerBase {
    public static final IndexedStringListSerializer A00 = new IndexedStringListSerializer();

    public static final void A03(17Z r2, C269504fE r3, List list, int i) {
        int i2 = 0;
        while (i2 < i) {
            try {
                String A19 = AnonymousClass7TE.A19(list, i2);
                if (A19 == null) {
                    r3.A0T(r2);
                } else {
                    r2.A0t(A19);
                }
                i2++;
            } catch (Exception e) {
                StdSerializer.A02(r3, list, e, i2);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public IndexedStringListSerializer() {
        super(List.class);
    }

    public final /* bridge */ /* synthetic */ void A09(17Z r3, C269504fE r4, SPK spk, Object obj) {
        List list = (List) obj;
        C10798RyK A002 = SPK.A00(r3, 16L.A0C, spk, list);
        r3.A0F(list);
        A03(r3, r4, list, list.size());
        spk.A04(r3, A002);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r5, C269504fE r6, Object obj) {
        Boolean bool;
        List list = (List) obj;
        int size = list.size();
        if (size != 1 || (((bool = this.A00) != null || !Pxi.A1U(r6)) && bool != Boolean.TRUE)) {
            r5.A0p(list, size);
            A03(r5, r6, list, size);
            r5.A0Y();
            return;
        }
        A03(r5, r6, list, 1);
    }
}
