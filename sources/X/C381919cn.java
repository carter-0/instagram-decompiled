package X;

/* renamed from: X.9cn  reason: invalid class name and case insensitive filesystem */
public final class C381919cn extends AnonymousClass0T0 implements C232262tL {
    public int A00 = 0;
    public String A01 = "";
    public String A02 = "";
    public boolean A03 = true;
    public boolean A04 = true;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381919cn) {
                C381919cn r5 = (C381919cn) obj;
                if (!(this.A00 == r5.A00 && 0qQ.A0K(this.A01, r5.A01) && 0qQ.A0K(this.A02, r5.A02) && this.A03 == r5.A03 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00);
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A01, this.A00 * 31)));
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        return A09 + i;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
