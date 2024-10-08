package X;

import java.util.List;

/* renamed from: X.Gmi  reason: case insensitive filesystem */
public final class C53358Gmi extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final String A04;
    public final List A05;

    public C53358Gmi() {
        this((Integer) null, (String) null, (List) null, 63);
    }

    public /* synthetic */ C53358Gmi(Integer num, String str, 0sn r7, int i) {
        int i2 = 0;
        int i3 = 0;
        r7 = (i & 1) != 0 ? 0sn.A00 : r7;
        str = (i & 2) != 0 ? "" : str;
        i2 = (i & 4) != 0 ? 2131964477 : i2;
        num = (i & 8) != 0 ? AnonymousClass05K.A01 : num;
        int A002 = DbW.A00(i & 16);
        if ((i & 32) != 0) {
            i3 = 2131968421;
            if (str.length() == 0) {
                i3 = 2131968388;
            }
        }
        C51974G9v.A1L(r7, str, num);
        this.A05 = r7;
        this.A04 = str;
        this.A00 = i2;
        this.A03 = num;
        this.A01 = A002;
        this.A02 = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53358Gmi) {
                C53358Gmi gmi = (C53358Gmi) obj;
                if (!(0qQ.A0K(this.A05, gmi.A05) && 0qQ.A0K(this.A04, gmi.A04) && this.A00 == gmi.A00 && this.A03 == gmi.A03 && this.A01 == gmi.A01 && this.A02 == gmi.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A08 = (AnonymousClass7TF.A08(this.A04, AnonymousClass7TE.A0K(this.A05)) + this.A00) * 31;
        int intValue = this.A03.intValue();
        switch (intValue) {
            case 1:
                str = "SUCCESS";
                break;
            case 2:
                str = "ERROR";
                break;
            default:
                str = "LOADING";
                break;
        }
        return ((C51971G9r.A0F(str, intValue, A08) + this.A01) * 31) + this.A02;
    }
}
