package X;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;
import java.util.HashMap;

public final class Fd8 implements MVB {
    public final /* synthetic */ C49867FAk A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InstagramMainActivity A02;

    public final void onDismiss() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public Fd8(C49867FAk fAk, UserSession userSession, InstagramMainActivity instagramMainActivity) {
        this.A00 = fAk;
        this.A01 = userSession;
        this.A02 = instagramMainActivity;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.FAk, java.lang.Object] */
    public final void onButtonClick(View view) {
        UserSession userSession = this.A01;
        C49867FAk.A00(userSession, "ntf", "land_on_existing_feed", "create_secondary_profile_click_create", (String) null, (HashMap) null);
        0BQ A002 = AnonymousClass0BO.A00(userSession);
        0Tu r3 = 0Tu.A05;
        0qQ.A08(r3);
        boolean A06 = 1AW.A06(r3, 18312263081473951L);
        InstagramMainActivity instagramMainActivity = this.A02;
        FragmentActivity fragmentActivity = instagramMainActivity.A0f;
        Bundle bundle = A002.AEP(fragmentActivity, (Uri) null, userSession, "reg_existing_login", !A06, A06).A00;
        0qQ.A0B(fragmentActivity, 1);
        DbX.A0z(fragmentActivity);
        Fl7 fl7 = C49287EsW.A00;
        if (Fl7.A01() || A06 || !C48760Ejj.A00()) {
            FFQ.A00();
            C48974EnC.A00(fragmentActivity, bundle, userSession, false);
            return;
        }
        new Object().A01(userSession, AnonymousClass05K.A0C);
        if (fragmentActivity instanceof FragmentActivity) {
            fl7.A02(bundle, fragmentActivity, userSession, instagramMainActivity.A0n().getModuleName());
        }
    }

    public final void onShow() {
        C49867FAk.A00(this.A01, "ntf", "land_on_existing_feed", "create_secondary_profile_cta_impression", (String) null, (HashMap) null);
    }
}
