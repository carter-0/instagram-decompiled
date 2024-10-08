package X;

public final class I1u {
    public final HNN A00;
    public final HNN A01;
    public final HNO A02;
    public final CharSequence A03;
    public final Integer A04;
    public final String A05;
    public final 0sP A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof I1u) {
                I1u i1u = (I1u) obj;
                if (!0qQ.A0K(this.A05, i1u.A05) || this.A00 != i1u.A00 || this.A04 != i1u.A04 || !0qQ.A0K(this.A03, i1u.A03) || !0qQ.A0K(this.A06, i1u.A06) || this.A01 != i1u.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A07 = AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A05)));
        int intValue = this.A04.intValue();
        if (intValue != 0) {
            str = "TEXT";
        } else {
            str = "ICON";
        }
        return AnonymousClass7TF.A07(this.A06, (C51971G9r.A0F(str, intValue, A07) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public I1u(HNN hnn, HNN hnn2, HNO hno, CharSequence charSequence, Integer num, String str, 0sP r7) {
        C51974G9v.A1P(str, hnn, hno, num);
        this.A05 = str;
        this.A00 = hnn;
        this.A02 = hno;
        this.A04 = num;
        this.A03 = charSequence;
        this.A06 = r7;
        this.A01 = hnn2;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MetaAiNavigationButtonConfig(buttonAccessAbilityLabel=");
        A1A.append(this.A05);
        A1A.append(", buttonIconName=");
        A1A.append(this.A00);
        A1A.append(", iconTintColor=");
        A1A.append(this.A02);
        A1A.append(", buttonType=");
        if (this.A04.intValue() != 0) {
            str = "TEXT";
        } else {
            str = "ICON";
        }
        A1A.append(str);
        A1A.append(", buttonText=");
        A1A.append(this.A03);
        A1A.append(", onClick=");
        A1A.append(this.A06);
        A1A.append(", rtlButtonIconName=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }

    public I1u() {
        this(HNN.A0G, (HNN) null, HNO.A0W, (CharSequence) null, AnonymousClass05K.A00, "Close Bottom Sheet", J5X.A00);
    }
}
