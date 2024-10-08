package X;

import java.util.List;

/* renamed from: X.UKb  reason: case insensitive filesystem */
public final class C15022UKb extends AnonymousClass0T0 {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02 = 0.0f;
    public float A03 = 0.0f;
    public String A04 = "";
    public List A05 = null;
    public List A06 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15022UKb) {
                C15022UKb uKb = (C15022UKb) obj;
                if (!(0qQ.A0K(this.A05, uKb.A05) && Float.compare(this.A02, uKb.A02) == 0 && Float.compare(this.A03, uKb.A03) == 0 && Float.compare(this.A00, uKb.A00) == 0 && Float.compare(this.A01, uKb.A01) == 0 && 0qQ.A0K(this.A06, uKb.A06) && 0qQ.A0K(this.A04, uKb.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A04, (AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TG.A0C(this.A05) * 31, this.A02), this.A03), this.A00), this.A01) + AnonymousClass7TE.A0L(this.A06)) * 31);
    }
}
