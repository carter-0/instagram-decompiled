package X;

import java.util.List;

public final class UOY extends AnonymousClass0T0 implements XCH {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public ULw A04;
    public ULH A05;
    public C15042UKv A06;
    public C16582Uxc A07;
    public C16597Uxr A08;
    public Boolean A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public List A0E;
    public final String A0F;

    public UOY(C16582Uxc uxc, C16597Uxr uxr, Boolean bool, String str, String str2, List list, int i, int i2, int i3) {
        0qQ.A0B(list, 7);
        this.A0D = str;
        this.A08 = uxr;
        this.A06 = null;
        this.A05 = null;
        this.A04 = null;
        this.A03 = 0;
        this.A0E = list;
        this.A01 = i;
        this.A07 = uxc;
        this.A00 = i2;
        this.A02 = i3;
        this.A0B = str2;
        this.A09 = bool;
        this.A0C = null;
        this.A0A = null;
        this.A0F = "media_karaoke_caption_sticker";
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UOY) {
                UOY uoy = (UOY) obj;
                if (!0qQ.A0K(this.A0D, uoy.A0D) || this.A08 != uoy.A08 || !0qQ.A0K(this.A06, uoy.A06) || !0qQ.A0K(this.A05, uoy.A05) || !0qQ.A0K(this.A04, uoy.A04) || this.A03 != uoy.A03 || !0qQ.A0K(this.A0E, uoy.A0E) || this.A01 != uoy.A01 || this.A07 != uoy.A07 || this.A00 != uoy.A00 || this.A02 != uoy.A02 || !0qQ.A0K(this.A0B, uoy.A0B) || !0qQ.A0K(this.A09, uoy.A09) || !0qQ.A0K(this.A0C, uoy.A0C) || !0qQ.A0K(this.A0A, uoy.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ULH Ayy() {
        return this.A05;
    }

    public final C15042UKv Az6() {
        return this.A06;
    }

    public final int Brw() {
        return this.A03;
    }

    public final C16597Uxr Bzo() {
        return this.A08;
    }

    public final ULw C7Q() {
        return this.A04;
    }

    public final String CDC() {
        return this.A0D;
    }

    public final void EUX(ULH ulh) {
        this.A05 = ulh;
    }

    public final void EUZ(C15042UKv uKv) {
        this.A06 = uKv;
    }

    public final void Ejk(int i) {
        this.A03 = i;
    }

    public final void Eoi(ULw uLw) {
        this.A04 = uLw;
    }

    public final String getTypeName() {
        return this.A0F;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A0D);
        List list = this.A0E;
        return ((((((((((AnonymousClass7TF.A07(this.A07, (AnonymousClass7TF.A07(list, (((((((AnonymousClass7TF.A07(this.A08, A0O) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + this.A03) * 31) + this.A01) * 31) + this.A00) * 31) + this.A02) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31) + C41845B3m.A00(this.A0A);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UOY() {
        /*
            r10 = this;
            r3 = 0
            java.lang.String r4 = X.AnonymousClass7TG.A0j()
            X.Uxr r2 = X.C16597Uxr.UNKNOWN
            r7 = 0
            X.0sn r6 = X.0sn.A00
            X.Uxc r1 = X.C16582Uxc.DYNAMIC_REVEAL
            r0 = r10
            r5 = r3
            r8 = r7
            r9 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UOY.<init>():void");
    }
}
