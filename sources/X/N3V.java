package X;

public final class N3V extends AnonymousClass0T0 {
    public final float A00;
    public final float A01;
    public final C69671Npt A02;
    public final C69671Npt A03;
    public final C69671Npt A04;
    public final C69671Npt A05;
    public final Integer A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N3V) {
                N3V n3v = (N3V) obj;
                if (this.A06 != n3v.A06 || Float.compare(this.A00, n3v.A00) != 0 || Float.compare(this.A01, n3v.A01) != 0 || !0qQ.A0K(this.A03, n3v.A03) || !0qQ.A0K(this.A05, n3v.A05) || !0qQ.A0K(this.A04, n3v.A04) || !0qQ.A0K(this.A02, n3v.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ N3V(C69671Npt npt, C69671Npt npt2, C69671Npt npt3, C69671Npt npt4, Integer num, float f, int i) {
        f = (i & 2) != 0 ? 1.0f : f;
        float f2 = (i & 4) != 0 ? 0.25f : 0.0f;
        npt = (i & 8) != 0 ? C70372O3y.A00 : npt;
        npt2 = (i & 16) != 0 ? C70372O3y.A00 : npt2;
        npt3 = (i & 32) != 0 ? C70372O3y.A00 : npt3;
        npt4 = (i & 64) != 0 ? C70372O3y.A00 : npt4;
        0qQ.A0B(npt, 4);
        C51974G9v.A1N(npt2, npt3, npt4);
        this.A06 = num;
        this.A00 = f;
        this.A01 = f2;
        this.A03 = npt;
        this.A05 = npt2;
        this.A04 = npt3;
        this.A02 = npt4;
    }

    public final int hashCode() {
        Integer num = this.A06;
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A00(AnonymousClass7TF.A00(C51971G9r.A0D(num, C69736NrL.A00(num)) * 31, this.A00), this.A01)))));
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GridFloatingLayoutConfig(mode=");
        Integer num = this.A06;
        if (num != null) {
            str = C69736NrL.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", aspectRatio=");
        A1A.append(this.A00);
        A1A.append(", sizeRatio=");
        A1A.append(this.A01);
        A1A.append(", leftMargin=");
        A1A.append(this.A03);
        A1A.append(", topMargin=");
        A1A.append(this.A05);
        A1A.append(", rightMargin=");
        A1A.append(this.A04);
        A1A.append(", bottomMargin=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
