package X;

/* renamed from: X.UKv  reason: case insensitive filesystem */
public final class C15042UKv extends AnonymousClass0T0 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public int A08 = 0;
    public int A09;
    public int A0A;
    public int A0B;
    public String A0C;
    public boolean A0D;

    public C15042UKv() {
        String A0j = AnonymousClass7TG.A0j();
        this.A0C = A0j;
        this.A0A = 0;
        this.A07 = 0;
        this.A09 = 0;
        this.A0B = 0;
        this.A03 = 0.0f;
        this.A04 = 0.0f;
        this.A01 = 0.0f;
        this.A02 = 0.0f;
        this.A05 = 0.0f;
        this.A06 = 0.0f;
        this.A00 = 0.0f;
        this.A0D = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15042UKv) {
                C15042UKv uKv = (C15042UKv) obj;
                if (!(this.A08 == uKv.A08 && 0qQ.A0K(this.A0C, uKv.A0C) && this.A0A == uKv.A0A && this.A07 == uKv.A07 && this.A09 == uKv.A09 && this.A0B == uKv.A0B && Float.compare(this.A03, uKv.A03) == 0 && Float.compare(this.A04, uKv.A04) == 0 && Float.compare(this.A01, uKv.A01) == 0 && Float.compare(this.A02, uKv.A02) == 0 && Float.compare(this.A05, uKv.A05) == 0 && Float.compare(this.A06, uKv.A06) == 0 && Float.compare(this.A00, uKv.A00) == 0 && this.A0D == uKv.A0D)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A0D, AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00((((((((AnonymousClass7TF.A08(this.A0C, this.A08 * 31) + this.A0A) * 31) + this.A07) * 31) + this.A09) * 31) + this.A0B) * 31, this.A03), this.A04), this.A01), this.A02), this.A05), this.A06), this.A00));
    }
}
