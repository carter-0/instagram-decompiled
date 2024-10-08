package X;

import com.instagram.model.showreel.IgShowreelComposition;

/* renamed from: X.GmC  reason: case insensitive filesystem */
public final class C53326GmC extends AnonymousClass0T0 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass9J3 A04;
    public final C61084JwM A05;
    public final AnonymousClass6L7 A06;
    public final C46218DQz A07;
    public final 1Xj A08;
    public final C246953fX A09;
    public final AnonymousClass3W1 A0A;
    public final IgShowreelComposition A0B;
    public final C247083fk A0C;
    public final boolean A0D;
    public final boolean A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53326GmC) {
                C53326GmC gmC = (C53326GmC) obj;
                if (!0qQ.A0K(this.A08, gmC.A08) || Float.compare(this.A00, gmC.A00) != 0 || this.A01 != gmC.A01 || this.A02 != gmC.A02 || this.A03 != gmC.A03 || !0qQ.A0K(this.A06, gmC.A06) || !0qQ.A0K(this.A0B, gmC.A0B) || !0qQ.A0K(this.A07, gmC.A07) || !0qQ.A0K(this.A0A, gmC.A0A) || this.A0D != gmC.A0D || !0qQ.A0K(this.A09, gmC.A09) || this.A0E != gmC.A0E || !0qQ.A0K(this.A0C, gmC.A0C) || !0qQ.A0K(this.A05, gmC.A05) || !0qQ.A0K(this.A04, gmC.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A0C, AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A07(this.A09, AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A07(this.A0A, (((((((((((AnonymousClass7TF.A00(AnonymousClass7TE.A0K(this.A08), this.A00) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31)))))) + AnonymousClass7TE.A0L(this.A04);
    }

    public C53326GmC(AnonymousClass9J3 r1, C61084JwM jwM, AnonymousClass6L7 r3, C46218DQz dQz, 1Xj r5, C246953fX r6, AnonymousClass3W1 r7, IgShowreelComposition igShowreelComposition, C247083fk r9, float f, int i, int i2, int i3, boolean z, boolean z2) {
        this.A08 = r5;
        this.A00 = f;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A06 = r3;
        this.A0B = igShowreelComposition;
        this.A07 = dQz;
        this.A0A = r7;
        this.A0D = z;
        this.A09 = r6;
        this.A0E = z2;
        this.A0C = r9;
        this.A05 = jwM;
        this.A04 = r1;
    }
}
