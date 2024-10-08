package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: X.5sA  reason: invalid class name and case insensitive filesystem */
public final class C297685sA implements AnonymousClass1Px {
    public final 1Fn A00;
    public final byte[] A01;

    public C297685sA(1Fn r2, byte[] bArr) {
        0qQ.A0B(bArr, 1);
        this.A01 = bArr;
        this.A00 = r2;
    }

    public final 1Fn Aqb() {
        return null;
    }

    public final 1Fn Aql() {
        return this.A00;
    }

    public final InputStream E15() {
        return new ByteArrayInputStream(this.A01);
    }

    public final long getContentLength() {
        return (long) this.A01.length;
    }
}
