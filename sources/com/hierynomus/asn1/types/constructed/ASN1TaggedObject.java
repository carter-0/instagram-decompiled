package com.hierynomus.asn1.types.constructed;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C51968G9o;
import X.Pxh;
import X.RRQ;
import X.S58;
import X.SPJ;
import java.util.Iterator;

public final class ASN1TaggedObject extends RRQ implements Iterable {
    public S58 A00;
    public byte[] A01;

    public final Iterator iterator() {
        SPJ spj = SPJ.A0C;
        byte[] bArr = this.A01;
        if (bArr != null) {
            return ((ASN1Sequence) spj.A01(this.A00).A00(spj, bArr)).iterator();
        }
        throw new RuntimeException(String.format("Unable to parse the implicit Tagged Object with %s, it is explicit", new Object[]{spj}));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(C51968G9o.A16(this));
        Pxh.A1P(A1A);
        A1A.append(this.A00);
        A1A.append(",<unknown>");
        return AnonymousClass7TF.A0l("]", A1A);
    }
}
