package X;

/* renamed from: X.HtV  reason: case insensitive filesystem */
public final class C56143HtV {
    public final HNN A00;
    public final HNO A01;
    public final HNO A02;
    public final CharSequence A03;
    public final Integer A04;
    public final String A05;
    public final 0sL A06;
    public final boolean A07;

    public C56143HtV(HNN hnn, HNO hno, HNO hno2, CharSequence charSequence, Integer num, String str, 0sL r8, boolean z) {
        AnonymousClass7TF.A1E(hno, 5, hno2);
        this.A04 = num;
        this.A05 = str;
        this.A00 = hnn;
        this.A07 = z;
        this.A02 = hno;
        this.A03 = charSequence;
        this.A01 = hno2;
        this.A06 = r8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56143HtV) {
                C56143HtV htV = (C56143HtV) obj;
                if (!(this.A04 == htV.A04 && 0qQ.A0K(this.A05, htV.A05) && this.A00 == htV.A00 && this.A07 == htV.A07 && this.A02 == htV.A02 && 0qQ.A0K(this.A03, htV.A03) && this.A01 == htV.A01 && 0qQ.A0K(this.A06, htV.A06))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A04.intValue();
        if (intValue != 0) {
            str = "TEXT";
        } else {
            str = "ICON";
        }
        int A0F = C51968G9o.A0F(str, intValue);
        int A09 = AnonymousClass7TF.A09(this.A07, (AnonymousClass7TF.A08(this.A05, A0F) + AnonymousClass7TG.A0C(this.A00)) * 31);
        return AnonymousClass7TE.A0N(this.A06, AnonymousClass7TF.A07(this.A01, (AnonymousClass7TF.A07(this.A02, A09) + AnonymousClass7TG.A0C(this.A03)) * 31));
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MetaAiActionButtonConfig(buttonType=");
        if (this.A04.intValue() != 0) {
            str = "TEXT";
        } else {
            str = "ICON";
        }
        A1A.append(str);
        A1A.append(", buttonAccessAbilityLabel=");
        A1A.append(this.A05);
        A1A.append(", buttonIconName=");
        A1A.append(this.A00);
        A1A.append(", isEnabled=");
        A1A.append(this.A07);
        A1A.append(", iconTintColor=");
        A1A.append(this.A02);
        A1A.append(", buttonText=");
        A1A.append(this.A03);
        A1A.append(", buttonTextColor=");
        A1A.append(this.A01);
        A1A.append(", onClick=");
        return AnonymousClass7TG.A0n(this.A06, A1A);
    }
}
