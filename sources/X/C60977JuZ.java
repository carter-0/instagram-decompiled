package X;

/* renamed from: X.JuZ  reason: case insensitive filesystem */
public final class C60977JuZ extends AnonymousClass0T0 {
    public final float A00;
    public final C60930Jto A01;
    public final C60930Jto A02;
    public final C60930Jto A03;
    public final C60930Jto A04;
    public final C60930Jto A05;
    public final C60930Jto A06;
    public final Integer A07;
    public final Integer A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60977JuZ) {
                C60977JuZ juZ = (C60977JuZ) obj;
                if (!0qQ.A0K(this.A07, juZ.A07) || !0qQ.A0K(this.A08, juZ.A08) || this.A0B != juZ.A0B || this.A09 != juZ.A09 || this.A0A != juZ.A0A || !0qQ.A0K(this.A05, juZ.A05) || !0qQ.A0K(this.A06, juZ.A06) || !0qQ.A0K(this.A04, juZ.A04) || !0qQ.A0K(this.A03, juZ.A03) || !0qQ.A0K(this.A01, juZ.A01) || !0qQ.A0K(this.A02, juZ.A02) || Float.compare(this.A00, juZ.A00) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A0B, ((AnonymousClass7TG.A0C(this.A07) * 31) + AnonymousClass7TE.A0L(this.A08)) * 31))))))))) + Float.floatToIntBits(this.A00);
    }

    public C60977JuZ(C60930Jto jto, C60930Jto jto2, C60930Jto jto3, C60930Jto jto4, C60930Jto jto5, C60930Jto jto6, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3) {
        this.A07 = num;
        this.A08 = num2;
        this.A0B = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A05 = jto;
        this.A06 = jto2;
        this.A04 = jto3;
        this.A03 = jto4;
        this.A01 = jto5;
        this.A02 = jto6;
        this.A00 = f;
    }
}
