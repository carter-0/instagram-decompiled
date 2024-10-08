package X;

/* renamed from: X.NYb  reason: case insensitive filesystem */
public final class C68817NYb extends AnonymousClass7FV implements AnonymousClass7FW {
    public final int A00;
    public final N4R A01;
    public final AnonymousClass7FE A02;
    public final C328667Fr A03;
    public final C70456O7h A04;
    public final C69610Nos A05;
    public final String A06;
    public final String A07;
    public final AnonymousClass7FT A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68817NYb) {
                C68817NYb nYb = (C68817NYb) obj;
                if (!0qQ.A0K(this.A03, nYb.A03) || !0qQ.A0K(this.A01, nYb.A01) || !0qQ.A0K(this.A07, nYb.A07) || !0qQ.A0K(this.A06, nYb.A06) || !0qQ.A0K(this.A05, nYb.A05) || this.A00 != nYb.A00 || !0qQ.A0K(this.A04, nYb.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A03))))) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A04);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C68817NYb(X.N4R r3, X.C328667Fr r4, X.C70456O7h r5, X.C69610Nos r6, java.lang.String r7, java.lang.String r8, int r9) {
        /*
            r2 = this;
            X.C51972G9s.A1B(r4, r8)
            X.7FT r1 = r4.A0B
            r2.<init>(r1)
            r2.A03 = r4
            r2.A01 = r3
            r2.A07 = r7
            r2.A06 = r8
            r2.A05 = r6
            r2.A00 = r9
            r2.A04 = r5
            X.7FE r0 = r4.A0C
            r2.A02 = r0
            r2.A08 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68817NYb.<init>(X.N4R, X.7Fr, X.O7h, X.Nos, java.lang.String, java.lang.String, int):void");
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PortraitVideoShareContentViewModel(xmaViewModel=");
        A1A.append(this.A03);
        A1A.append(", mediaForAutoplayFields=");
        A1A.append(this.A01);
        A1A.append(C273654mx.A00(99));
        A1A.append(this.A07);
        A1A.append(", aspectRatio=");
        A1A.append(this.A06);
        A1A.append(", typeSpecificFields=");
        A1A.append(this.A05);
        A1A.append(", width=");
        A1A.append(this.A00);
        A1A.append(", reaction=");
        return AnonymousClass7TG.A0n(this.A04, A1A);
    }
}
