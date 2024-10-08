package X;

import com.instagram.mainactivity.InstagramMainActivity;

public final class T63 implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "InstagramMainActivity$TabDerivedAnalyticsModule";
    public final /* synthetic */ InstagramMainActivity A00;

    public T63(InstagramMainActivity instagramMainActivity) {
        this.A00 = instagramMainActivity;
    }

    public final String getModuleName() {
        String A02;
        2b7 r0 = this.A00.A09;
        if (r0 == null || (A02 = r0.A02()) == null) {
            return "main_activity";
        }
        return A02;
    }
}
