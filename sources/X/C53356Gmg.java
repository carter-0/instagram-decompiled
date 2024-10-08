package X;

/* renamed from: X.Gmg  reason: case insensitive filesystem */
public final class C53356Gmg extends AnonymousClass0T0 {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C53356Gmg(Integer num, Integer num2, Integer num3, String str, String str2) {
        this.A01 = num;
        this.A04 = str;
        this.A00 = num2;
        this.A05 = true;
        this.A02 = num3;
        this.A03 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53356Gmg) {
                C53356Gmg gmg = (C53356Gmg) obj;
                if (!0qQ.A0K(this.A01, gmg.A01) || !0qQ.A0K(this.A04, gmg.A04) || !0qQ.A0K(this.A00, gmg.A00) || this.A05 != gmg.A05 || this.A02 != gmg.A02 || !0qQ.A0K(this.A03, gmg.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A09 = AnonymousClass7TF.A09(this.A05, ((((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31);
        int intValue = this.A02.intValue();
        if (1 != intValue) {
            str = "Text";
        } else {
            str = "Icon";
        }
        return C51971G9r.A0F(str, intValue, A09) + C41845B3m.A00(this.A03);
    }

    public C53356Gmg() {
        this((Integer) null, (Integer) null, AnonymousClass05K.A00, (String) null, (String) null);
    }
}
