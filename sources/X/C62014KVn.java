package X;

/* renamed from: X.KVn  reason: case insensitive filesystem */
public final class C62014KVn extends C64386Lb3 {
    public final AnonymousClass3Q2 A00;

    public C62014KVn(AnonymousClass3Q2 r1) {
        this.A00 = r1;
    }

    public final void onBytesTransferred(long j, long j2) {
        super.onBytesTransferred(j, j2);
        if (j2 > 0) {
            double d = ((double) j) / ((double) j2);
            AnonymousClass3Q2 r4 = this.A00;
            if (r4.A1G == 1iA.A0Q) {
                r4.A0g(AnonymousClass05K.A00, d);
                r4.A0g(AnonymousClass05K.A01, d);
                if (r4.A0E().A00 && r4.A10()) {
                    return;
                }
            }
            r4.A0g(AnonymousClass05K.A0C, d);
        }
    }
}
