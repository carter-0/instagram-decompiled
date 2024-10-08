package com.fasterxml.jackson.databind.ser.std;

import X.17Z;
import X.C269504fE;
import X.Pxi;
import X.SPK;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.Iterator;

@JacksonStdImpl
public class IterableSerializer extends AsArraySerializerBase {
    public final /* bridge */ /* synthetic */ void A0A(17Z r3, C269504fE r4, Object obj) {
        Iterable iterable = (Iterable) obj;
        Boolean bool = this.A05;
        if (((bool == null && Pxi.A1U(r4)) || bool == Boolean.TRUE) && iterable != null) {
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                it.next();
                if (!it.hasNext()) {
                    A0E(r3, r4, iterable);
                    return;
                }
            }
        }
        r3.A0n(iterable);
        A0E(r3, r4, iterable);
        r3.A0Y();
    }

    public final /* bridge */ /* synthetic */ boolean A0B(C269504fE r2, Object obj) {
        return !((Iterable) obj).iterator().hasNext();
    }

    public final void A0E(17Z r8, C269504fE r9, Iterable iterable) {
        JsonSerializer jsonSerializer;
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            SPK spk = this.A04;
            Class<?> cls = null;
            JsonSerializer jsonSerializer2 = null;
            do {
                Object next = it.next();
                if (next == null) {
                    r9.A0T(r8);
                } else {
                    JsonSerializer jsonSerializer3 = this.A03;
                    if (jsonSerializer3 == null) {
                        Class<?> cls2 = next.getClass();
                        if (cls2 != cls) {
                            jsonSerializer2 = r9.A0I(this.A01, cls2);
                            cls = cls2;
                        }
                        jsonSerializer = jsonSerializer2;
                    } else {
                        jsonSerializer = jsonSerializer2;
                        jsonSerializer2 = jsonSerializer3;
                    }
                    Pxi.A1D(r8, jsonSerializer2, r9, spk, next);
                    jsonSerializer2 = jsonSerializer;
                }
            } while (it.hasNext());
        }
    }
}
