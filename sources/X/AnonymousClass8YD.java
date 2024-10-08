package X;

/* renamed from: X.8YD  reason: invalid class name */
public final class AnonymousClass8YD extends AnonymousClass84D {
    public final int A00;
    public final AnonymousClass84B A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YD(AnonymousClass84B r2, String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z) {
        super(r2);
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A04 = str2;
        this.A01 = r2;
        this.A03 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A05 = str6;
        this.A00 = i;
        this.A08 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8YD) {
                AnonymousClass8YD r5 = (AnonymousClass8YD) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A04, r5.A04) || this.A01 != r5.A01 || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A05, r5.A05) || this.A00 != r5.A00 || this.A08 != r5.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String A00() {
        String str = this.A04;
        if (0qQ.A0K(str, "test_lint")) {
            return "test_effect_deep_link";
        }
        if (0qQ.A0K(str, "permalink")) {
            return "preview_effect_deep_link";
        }
        if (0qQ.A0K(str, "mini_gallery")) {
            return "mini_gallery_select_effect";
        }
        if (this.A01 == AnonymousClass84B.EFFECT_TRAY) {
            return "dial_select";
        }
        return "select_effect";
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = ((((this.A02.hashCode() * 31) + this.A04.hashCode()) * 31) + this.A01.hashCode()) * 31;
        String str = this.A03;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        String str2 = this.A06;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.A07;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.A05;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int i5 = (((i4 + i) * 31) + this.A00) * 31;
        int i6 = 1237;
        if (this.A08) {
            i6 = 1231;
        }
        return i5 + i6;
    }
}
