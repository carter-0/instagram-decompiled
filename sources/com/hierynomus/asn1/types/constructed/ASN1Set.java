package com.hierynomus.asn1.types.constructed;

import X.Pxg;
import X.RRQ;
import X.SPJ;
import java.util.Iterator;
import java.util.Set;

public final class ASN1Set extends RRQ implements Iterable {
    public byte[] A00;
    public final Set A01;

    public ASN1Set(Set set, byte[] bArr) {
        this.A00 = SPJ.A0D;
        this.A01 = set;
        this.A00 = bArr;
    }

    public final Iterator iterator() {
        return Pxg.A15(this.A01);
    }
}
