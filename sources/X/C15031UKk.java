package X;

/* renamed from: X.UKk  reason: case insensitive filesystem */
public final class C15031UKk extends AnonymousClass0T0 {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02 = 0.0f;
    public float A03 = 0.0f;
    public float A04 = 0.0f;
    public float A05 = 0.0f;
    public int A06 = 0;
    public C15048ULb A07 = null;
    public C16567UxK A08 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15031UKk) {
                C15031UKk uKk = (C15031UKk) obj;
                if (!(this.A08 == uKk.A08 && Float.compare(this.A00, uKk.A00) == 0 && Float.compare(this.A01, uKk.A01) == 0 && Float.compare(this.A04, uKk.A04) == 0 && Float.compare(this.A05, uKk.A05) == 0 && this.A06 == uKk.A06 && Float.compare(this.A02, uKk.A02) == 0 && Float.compare(this.A03, uKk.A03) == 0 && 0qQ.A0K(this.A07, uKk.A07))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A00(AnonymousClass7TF.A00((AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TG.A0C(this.A08) * 31, this.A00), this.A01), this.A04), this.A05) + this.A06) * 31, this.A02), this.A03) + AnonymousClass7TE.A0L(this.A07);
    }
}
