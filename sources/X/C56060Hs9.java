package X;

/* renamed from: X.Hs9  reason: case insensitive filesystem */
public final class C56060Hs9 {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C56060Hs9) && this.A00 == ((C56060Hs9) obj).A00);
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 0:
                str = "FACEBOOK";
                break;
            case 1:
                str = "INSTAGRAM";
                break;
            default:
                str = "THREADS";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }

    public final String toString() {
        String str;
        switch (this.A00.intValue()) {
            case 0:
                str = "FACEBOOK";
                break;
            case 1:
                str = "INSTAGRAM";
                break;
            default:
                str = "THREADS";
                break;
        }
        return G9w.A0k("CdsAppGlyphProfilePhotoBadgeAddOn(glyphName=", str);
    }

    public C56060Hs9(Integer num) {
        this.A00 = num;
    }
}
