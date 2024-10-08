package X;

/* renamed from: X.Dtj  reason: case insensitive filesystem */
public final class C47255Dtj extends AnonymousClass0T0 implements C51861G4u {
    public final Integer A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47255Dtj) {
                C47255Dtj dtj = (C47255Dtj) obj;
                if (!(this.A02 == dtj.A02 && this.A03 == dtj.A03 && 0qQ.A0K(this.A01, dtj.A01) && this.A00 == dtj.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A09(this.A03, i * 31)) + C48819Ekh.A00(this.A00);
    }

    public C47255Dtj(Integer num, String str, boolean z, boolean z2) {
        this.A02 = z;
        this.A03 = z2;
        this.A01 = str;
        this.A00 = num;
    }

    public C47255Dtj() {
        this(AnonymousClass05K.A01, "", false, false);
    }
}
