package X;

/* renamed from: X.GEn  reason: case insensitive filesystem */
public final class C52093GEn extends AnonymousClass0T0 {
    public final int A00;
    public final C52087GEh A01;
    public final C52088GEi A02;
    public final AnonymousClass3W1 A03;
    public final 1Av A04;
    public final Integer A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C52093GEn(C52087GEh gEh, C52088GEi gEi, AnonymousClass3W1 r4, 1Av r5, Integer num, int i, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(r5, 3);
        this.A03 = r4;
        this.A05 = num;
        this.A04 = r5;
        this.A06 = z;
        this.A08 = z2;
        this.A07 = z3;
        this.A00 = i;
        this.A01 = gEh;
        this.A02 = gEi;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52093GEn) {
                C52093GEn gEn = (C52093GEn) obj;
                if (!(0qQ.A0K(this.A03, gEn.A03) && this.A05 == gEn.A05 && 0qQ.A0K(this.A04, gEn.A04) && this.A06 == gEn.A06 && this.A08 == gEn.A08 && this.A07 == gEn.A07 && this.A00 == gEn.A00 && 0qQ.A0K(this.A01, gEn.A01) && 0qQ.A0K(this.A02, gEn.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0C = AnonymousClass7TG.A0C(this.A03) * 31;
        int intValue = this.A05.intValue();
        switch (intValue) {
            case 1:
                str = "BELOW_PAUSE_ICON";
                break;
            case 2:
                str = "NO_AUDIO_CONTROL";
                break;
            default:
                str = "ABOVE_PAUSE_ICON";
                break;
        }
        int A09 = AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A07(this.A04, C51971G9r.A0F(str, intValue, A0C))));
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A01, (AnonymousClass7TF.A09(this.A07, A09) + this.A00) * 31));
    }
}
