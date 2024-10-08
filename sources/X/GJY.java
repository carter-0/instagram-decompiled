package X;

import com.instagram.clips.intf.ClipsViewerSource;

public enum GJY {
    A08(r4, (ClipsViewerSource) null, "DEFAULT", 0, 2131955518),
    A09(r4, r9, "FOLLOWING", 1, 2131955878),
    A0B(r4, r10, "LOCATION", 2, 2131955882),
    A0C(C52210GJb.A00, r11, "MEDIA_NOTES", 3, 2131955883),
    A0A(r4, r11, "FRIENDLY_VIEWER", 4, 2131955880),
    A0D(r4, r17, "MIXED_MEDIA_CHAINS", 5, 2131955881),
    A0E(r4, r18, "STAR_SEARCH", 6, 2131955884),
    A07(r4, r19, "ADS_ONLY", 7, 2131955875);
    
    public final int A00;
    public final C52209GJa A01;
    public final ClipsViewerSource A02;
    public final C59645JRn A03;
    public final Integer A04;

    /* access modifiers changed from: public */
    static {
        GJY[] gjyArr;
        A05 = 0oU.A00(gjyArr);
    }

    /* access modifiers changed from: public */
    GJY(C59645JRn jRn, Integer num, String str, int i, int i2) {
        this.A00 = i2;
        this.A04 = num;
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = jRn;
    }
}
