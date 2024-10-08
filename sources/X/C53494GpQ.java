package X;

/* renamed from: X.GpQ  reason: case insensitive filesystem */
public final class C53494GpQ extends AnonymousClass0T0 implements C59481JLf {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53494GpQ) {
                C53494GpQ gpQ = (C53494GpQ) obj;
                if (!0qQ.A0K(this.A00, gpQ.A00) || !0qQ.A0K(this.A01, gpQ.A01) || this.A02 != gpQ.A02 || this.A03 != gpQ.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A03, AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A00))));
    }

    public C53494GpQ(String str, String str2, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = z;
        this.A03 = z2;
    }
}
