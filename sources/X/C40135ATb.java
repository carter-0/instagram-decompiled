package X;

/* renamed from: X.ATb  reason: case insensitive filesystem */
public final class C40135ATb implements C345897uG {
    public final C344557s3 A00;
    public final C345557ti A01;
    public final C345957uM A02 = new Object();
    public final C345967uN A03;

    public final void AVT() {
    }

    public final void flush() {
    }

    public final void makeCurrent() {
    }

    public final void release() {
    }

    public final C344557s3 Azk() {
        C344557s3 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw new UnsupportedOperationException();
    }

    public final C345557ti BhQ() {
        return this.A01;
    }

    public final C345967uN Blv() {
        return this.A03;
    }

    public final C346007uR C3G() {
        throw new UnsupportedOperationException();
    }

    public final C345957uM C5m() {
        return this.A02;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.7uM, java.lang.Object] */
    public C40135ATb(C344557s3 r2, C345557ti r3, C344507ry r4, C344567s4 r5) {
        this.A01 = r3;
        this.A03 = new C345967uN(r4, r5);
        this.A00 = r2;
    }

    public final C344557s3 Azl(int i) {
        return Azk();
    }
}
