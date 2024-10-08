package com.fasterxml.jackson.databind.ser.impl;

import X.17Z;
import X.C268894eF;
import X.C269504fE;
import X.Pxi;
import X.SIF;
import X.SPK;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.util.Iterator;

@JacksonStdImpl
public class IteratorSerializer extends AsArraySerializerBase {
    public final /* bridge */ /* synthetic */ void A0A(17Z r1, C269504fE r2, Object obj) {
        Iterator it = (Iterator) obj;
        r1.A0n(it);
        A0E(r1, r2, it);
        r1.A0Y();
    }

    public final /* bridge */ /* synthetic */ boolean A0B(C269504fE r2, Object obj) {
        return !((Iterator) obj).hasNext();
    }

    public final void A0E(17Z r7, C269504fE r8, Iterator it) {
        SIF A01;
        if (it.hasNext()) {
            JsonSerializer jsonSerializer = this.A03;
            if (jsonSerializer == null) {
                SPK spk = this.A04;
                SIF sif = this.A00;
                do {
                    Object next = it.next();
                    if (next == null) {
                        r8.A0T(r7);
                    } else {
                        Class<?> cls = next.getClass();
                        JsonSerializer A00 = sif.A00(cls);
                        if (A00 == null) {
                            C268894eF r1 = this.A02;
                            if (r1.A0J()) {
                                C268894eF A0A = r8.A0A(r1, cls);
                                A00 = r8.A0B(this.A01, A0A);
                                A01 = sif.A01(A00, A0A.A00);
                            } else {
                                A00 = r8.A0G(this.A01, cls);
                                A01 = sif.A01(A00, cls);
                            }
                            if (sif != A01) {
                                this.A00 = A01;
                            }
                            sif = this.A00;
                        }
                        Pxi.A1D(r7, A00, r8, spk, next);
                    }
                } while (it.hasNext());
                return;
            }
            SPK spk2 = this.A04;
            do {
                Object next2 = it.next();
                if (next2 == null) {
                    r8.A0T(r7);
                } else {
                    Pxi.A1D(r7, jsonSerializer, r8, spk2, next2);
                }
            } while (it.hasNext());
        }
    }
}
