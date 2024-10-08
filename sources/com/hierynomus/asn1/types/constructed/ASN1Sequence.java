package com.hierynomus.asn1.types.constructed;

import X.Pxg;
import X.RRQ;
import X.SPJ;
import java.util.Iterator;
import java.util.List;

public final class ASN1Sequence extends RRQ implements Iterable {
    public byte[] A00;
    public final List A01;

    public ASN1Sequence(List list, byte[] bArr) {
        this.A00 = SPJ.A0C;
        this.A01 = list;
        this.A00 = bArr;
    }

    public final Iterator iterator() {
        return Pxg.A16(this.A01);
    }
}
