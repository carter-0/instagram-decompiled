package X;

/* renamed from: X.HIw  reason: case insensitive filesystem */
public final class C54561HIw extends C55551HjX {
    public final HNN A00;
    public final HNO A01;
    public final HNO A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final C62320sa A07;
    public final boolean A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54561HIw) {
                C54561HIw hIw = (C54561HIw) obj;
                if (!(this.A00 == hIw.A00 && 0qQ.A0K(this.A07, hIw.A07) && 0qQ.A0K(this.A06, hIw.A06) && this.A01 == hIw.A01 && this.A02 == hIw.A02 && this.A03 == hIw.A03 && this.A0B == hIw.A0B && this.A0A == hIw.A0A && this.A0C == hIw.A0C && this.A09 == hIw.A09 && this.A05 == hIw.A05 && this.A08 == hIw.A08 && this.A04 == hIw.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static final 2WX A00(JSK jsk, C54561HIw hIw) {
        long A072 = G9w.A07(jsk, AnonymousClass05K.A0G);
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A0E = C51974G9v.A0E(C51974G9v.A0G(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A01, 0, G9w.A07(jsk, hIw.A09)), C51965G9l.A0c(AnonymousClass05K.A0u, 0, G9w.A07(jsk, hIw.A0B)), 0, A072), C51965G9l.A0c(AnonymousClass05K.A1F, 0, G9w.A07(jsk, hIw.A0A)), 0, A072);
        long A073 = G9w.A07(jsk, AnonymousClass05K.A0I);
        return C51973G9u.A0R(A0E, C51967G9n.A0U(0, A073), 0, G9w.A07(jsk, AnonymousClass05K.A0H)).A00(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A00, 0, G9w.A07(jsk, hIw.A0C)));
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A07(this.A07, AnonymousClass7TE.A0K(this.A00)))));
        Integer num = this.A03;
        int A0B2 = AnonymousClass7TG.A0B(num, C55231HeM.A00(num), A072);
        Integer num2 = this.A0B;
        int A0B3 = AnonymousClass7TG.A0B(num2, C55231HeM.A00(num2), A0B2);
        Integer num3 = this.A0A;
        int A0B4 = AnonymousClass7TG.A0B(num3, C55231HeM.A00(num3), A0B3);
        Integer num4 = this.A0C;
        int A0B5 = AnonymousClass7TG.A0B(num4, C55231HeM.A00(num4), A0B4);
        Integer num5 = this.A09;
        int A0B6 = (AnonymousClass7TG.A0B(num5, C55231HeM.A00(num5), A0B5) - 1468332762) * 31;
        Integer num6 = this.A05;
        return AnonymousClass7TF.A09(this.A08, AnonymousClass7TG.A0B(num6, C55235HeQ.A00(num6), A0B6)) + C56363HxG.A00(this.A04);
    }

    public C54561HIw(HNN hnn, HNO hno, HNO hno2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, String str, C62320sa r13, boolean z) {
        super(num6);
        this.A00 = hnn;
        this.A07 = r13;
        this.A06 = str;
        this.A01 = hno;
        this.A02 = hno2;
        this.A03 = num;
        this.A0B = num2;
        this.A0A = num3;
        this.A0C = num4;
        this.A09 = num5;
        this.A05 = num7;
        this.A08 = z;
        this.A04 = num8;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MetaAIIconButtonTextInputAddOnModel(iconName=");
        A1A.append(this.A00);
        A1A.append(", onClick=");
        A1A.append(this.A07);
        A1A.append(", accessibilityLabel=");
        A1A.append(this.A06);
        A1A.append(", buttonBackgroundColor=");
        A1A.append(this.A01);
        A1A.append(", iconTintColor=");
        A1A.append(this.A02);
        A1A.append(C66579MXk.A00(79));
        A1A.append(C55231HeM.A00(this.A03));
        A1A.append(", paddingStart=");
        A1A.append(C55231HeM.A00(this.A0B));
        A1A.append(", paddingEnd=");
        A1A.append(C55231HeM.A00(this.A0A));
        A1A.append(C66579MXk.A00(193));
        A1A.append(C55231HeM.A00(this.A0C));
        A1A.append(", height=");
        A1A.append(C55231HeM.A00(this.A09));
        A1A.append(", isContainedInTextInput=");
        A1A.append("TextInputIconButtonEndAddOnContained");
        A1A.append(", visibilityRule=");
        A1A.append(C55235HeQ.A00(this.A05));
        A1A.append(", isEnabled=");
        A1A.append(this.A08);
        A1A.append(C273654mx.A00(1165));
        return C51975G9x.A0i(C56363HxG.A01(this.A04), A1A);
    }
}
