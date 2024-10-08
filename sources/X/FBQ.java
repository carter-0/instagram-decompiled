package X;

import android.os.Bundle;

public final class FBQ {
    public final int A00;
    public final AnonymousClass818 A01;
    public final AnonymousClass819 A02;
    public final C59793JYm A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public static Bundle A00(FBQ fbq) {
        Bundle bundle = new Bundle();
        bundle.putString("ARG_MEDIA_SOURCE_TYPE", fbq.A03.name());
        bundle.putString("ARG_UPSELL_ENTRY_POINT", fbq.A01.name());
        bundle.putString("ARG_UPSELL_VARIANT", fbq.A02.name());
        bundle.putString("ARG_WATERFALL_ID", fbq.A07);
        bundle.putString("ARG_MODULE_NAME", fbq.A06);
        return bundle;
    }

    public final boolean A01() {
        AnonymousClass818 r2 = this.A01;
        if (r2 == AnonymousClass818.IG_SELF_REEL_SHARE_SHEET || r2 == AnonymousClass818.IG_SELF_REEL_LIKES_SHEET || r2 == AnonymousClass818.IG_SELF_REEL_FEED_VIEW || r2 == AnonymousClass818.IG_REELS_OVERFLOW_MENU || r2 == AnonymousClass818.IG_REEL_IN_FEED_OVERFLOW_MENU) {
            return true;
        }
        return false;
    }

    public FBQ(AnonymousClass818 r1, AnonymousClass819 r2, C59793JYm jYm, String str, String str2, String str3, String str4, int i) {
        AnonymousClass7TG.A1U(jYm, r1, r2);
        this.A03 = jYm;
        this.A01 = r1;
        this.A02 = r2;
        this.A07 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A00 = i;
        this.A05 = str4;
    }
}
