package X;

import com.instagram.android.R;

/* renamed from: X.UzG  reason: case insensitive filesystem */
public enum C16680UzG {
    ACCOUNT_SPENDING_LIMIT(R.drawable.instagram_warning_pano_outline_24, "account_spending_limit"),
    AD_SLIDER(R.drawable.instagram_sliders_pano_outline_24, "ad_slider"),
    BOOST(R.drawable.instagram_browse_effects_pano_outline_24, "open_boost"),
    OPEN_LINK(R.drawable.instagram_browse_effects_pano_outline_24, "open_link"),
    MEDIA_PICKER(R.drawable.instagram_reels_pano_outline_24, "media_picker"),
    RESUME_AD(R.drawable.instagram_promote_pano_outline_24, "resume_ad");
    
    public final int A00;
    public final String A01;

    public final String toString() {
        return this.A01;
    }

    /* access modifiers changed from: public */
    static {
        C16680UzG[] uzGArr;
        A02 = 0oU.A00(uzGArr);
    }

    /* access modifiers changed from: public */
    C16680UzG(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
