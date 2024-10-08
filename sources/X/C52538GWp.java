package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.GWp  reason: case insensitive filesystem */
public final class C52538GWp {
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;
    public final C52536GWn A03;
    public final AnonymousClass4DU A04;
    public final String A05;

    public C52538GWp(Context context, Fragment fragment, UserSession userSession, C52536GWn gWn, AnonymousClass4DU r6, String str) {
        0qQ.A0B(fragment, 1);
        this.A01 = fragment;
        this.A00 = context;
        this.A04 = r6;
        this.A02 = userSession;
        this.A05 = str;
        this.A03 = gWn;
    }

    public final void A00() {
        String str;
        C52536GWn gWn = this.A03;
        AnonymousClass4DU r2 = this.A04;
        if (0qQ.A0K(r2.getModuleName(), "explore_popular")) {
            str = "explore_grid_media_tap";
        } else if (0qQ.A0K(r2.getModuleName(), "serp_top")) {
            str = "search_grid_media_tap";
        } else {
            0wb.A03("GridAdsLogger", "wrong module for logging grid media tap");
            return;
        }
        gWn.A01(r2, str);
    }
}
