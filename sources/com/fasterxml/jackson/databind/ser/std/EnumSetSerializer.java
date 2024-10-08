package com.fasterxml.jackson.databind.ser.std;

import X.17Z;
import X.C269504fE;
import X.Pxi;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.AbstractCollection;
import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetSerializer extends AsArraySerializerBase {
    public final /* bridge */ /* synthetic */ void A0A(17Z r4, C269504fE r5, Object obj) {
        Boolean bool;
        EnumSet enumSet = (EnumSet) obj;
        int size = enumSet.size();
        if (size != 1 || (((bool = this.A05) != null || !Pxi.A1U(r5)) && bool != Boolean.TRUE)) {
            r4.A0p(enumSet, size);
            A0E(r4, r5, enumSet);
            r4.A0Y();
            return;
        }
        A0E(r4, r5, enumSet);
    }

    public final /* bridge */ /* synthetic */ boolean A0B(C269504fE r2, Object obj) {
        return ((AbstractCollection) obj).isEmpty();
    }

    public final void A0E(17Z r5, C269504fE r6, EnumSet enumSet) {
        JsonSerializer jsonSerializer = this.A03;
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            Enum enumR = (Enum) it.next();
            if (jsonSerializer == null) {
                jsonSerializer = r6.A0G(this.A01, enumR.getDeclaringClass());
            }
            jsonSerializer.A0A(r5, r6, enumR);
        }
    }
}
