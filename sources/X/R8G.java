package X;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

public final class R8G extends C240383Kr {
    public String A00 = "";

    private final void A01() {
        FH7.A06(requireActivity(), (UserSession) null, AnonymousClass47L.AD_DESTINATION_APP_STORE, (C49716F3b) null, this.A00, (String) null);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        R8G.super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            0wb.A04("ig_fb_google_play_store_overlay_fragment", "fallback_to_gps_on_error_code", 1);
            A01();
        }
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException th;
        String string;
        0bs r0;
        int A02 = AnonymousClass0fD.A02(-22516741);
        R8G.super.onCreate(bundle);
        try {
            Bundle bundle2 = this.mArguments;
            if (bundle2 == null || (string = bundle2.getString("EXTRA_URL")) == null) {
                th = AnonymousClass7TE.A0z("Received url is empty");
                AnonymousClass0fD.A09(-499854164, A02);
            } else {
                this.A00 = string;
                Intent A09 = DbS.A09();
                C66581MXm.A17(A09, "com.facebook.katana", "com.facebook.googleplaystore.GooglePlaystoreOverlayExternalActivity");
                A09.putExtra("IG_GPS_AD_CONTENT", this.A00);
                0b6 r6 = 0kR.A00;
                synchronized (r6) {
                    try {
                        0bs r5 = r6.A02;
                        if (r5 == null) {
                            r5 = new 0bs(r6.A0C(), (String) null, r6.A0H, r6.A0I);
                            r6.A02 = r5;
                        }
                        r0 = new 0bs(r5.A01, "IG_GOOGLE_PLAYSTORE_FRAGMENT", r5.A03, r5.A04);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (!r0.A0H(A09, this, 0)) {
                    0wb.A04("ig_fb_google_play_store_overlay_fragment", "fallback_to_gps_on_activity_not_launched", 1);
                    A01();
                } else {
                    0wb.A04("ig_fb_google_play_store_overlay_fragment", "launched", 1);
                }
                AnonymousClass0fD.A09(-2140105867, A02);
                return;
            }
            throw th;
        } catch (AnonymousClass063 | ActivityNotFoundException | IllegalAccessException | IllegalStateException | NullPointerException e) {
            0wb.A08("ig_fb_google_play_store_overlay_fragment", e);
            A01();
            AnonymousClass0fD.A09(-199764421, A02);
        }
    }
}
