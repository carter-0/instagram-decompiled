package X;

/* renamed from: X.SEg  reason: case insensitive filesystem */
public final class C11180SEg {
    public Integer A00;
    public boolean A01;
    public final int A02;

    public C11180SEg(int i, boolean z) {
        this.A01 = z;
        this.A02 = i;
        try {
            this.A00 = AnonymousClass05K.A00;
        } catch (IllegalArgumentException unused) {
            this.A00 = null;
            this.A01 = false;
        }
    }

    public C11180SEg() {
        this(0, false);
    }
}
