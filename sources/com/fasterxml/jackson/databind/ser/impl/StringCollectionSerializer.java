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
import java.util.Collection;
import java.util.Iterator;

@JacksonStdImpl
public class StringCollectionSerializer extends StaticListSerializerBase {
    public static final StringCollectionSerializer A00 = new StringCollectionSerializer();

    public static final void A03(17Z r3, C269504fE r4, Collection collection) {
        int i = 0;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                if (A18 == null) {
                    r4.A0T(r3);
                } else {
                    r3.A0t(A18);
                }
                i++;
            }
        } catch (Exception e) {
            StdSerializer.A02(r4, collection, e, 0);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public StringCollectionSerializer() {
        super(Collection.class);
    }

    public final /* bridge */ /* synthetic */ void A09(17Z r2, C269504fE r3, SPK spk, Object obj) {
        Collection collection = (Collection) obj;
        C10798RyK A002 = SPK.A00(r2, 16L.A0C, spk, collection);
        r2.A0F(collection);
        A03(r2, r3, collection);
        spk.A04(r2, A002);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r4, C269504fE r5, Object obj) {
        Boolean bool;
        Collection collection = (Collection) obj;
        int size = collection.size();
        if (size != 1 || (((bool = this.A00) != null || !Pxi.A1U(r5)) && bool != Boolean.TRUE)) {
            r4.A0p(collection, size);
            A03(r4, r5, collection);
            r4.A0Y();
            return;
        }
        A03(r4, r5, collection);
    }
}
