package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.3JJ  reason: invalid class name */
public final class AnonymousClass3JJ implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass354 A00;

    public AnonymousClass3JJ(AnonymousClass354 r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        2Zg A07;
        int A05 = AnonymousClass0fD.A05(-637046468);
        AnonymousClass354 r1 = this.A00;
        C227802jw A002 = AnonymousClass354.A00(r1);
        if (A002 == null || (A07 = A002.A07()) == null) {
            0wb.A03("MainFeedFragment:getLeftClickListener", "MainFeedFragmentIsNull");
        } else {
            UserSession userSession = r1.A01;
            AnonymousClass332 r0 = A002.A07;
            if (r0 != null) {
                r0.A00.onPause();
            }
            AB2.A00(userSession, C363138jC.A00, r1.A02, A07, "camera_action_bar_button_main_feed");
        }
        AnonymousClass0fD.A0C(-2040951494, A05);
    }
}
