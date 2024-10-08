package X;

import android.net.Uri;

/* renamed from: X.QoP  reason: case insensitive filesystem */
public final class C8323QoP extends C257213x2 {
    public Uri A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8323QoP() {
        super(false);
        Object obj = null;
        obj.getClass();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void close() {
        this.A00 = null;
    }

    public final int read(byte[] bArr, int i, int i2) {
        return i2 == 0 ? 0 : -1;
    }

    public final Uri getUri() {
        return this.A00;
    }

    public final long open(C257263x7 r2) {
        this.A00 = r2.A06;
        A02();
        throw AnonymousClass7TE.A11("array-length");
    }
}
