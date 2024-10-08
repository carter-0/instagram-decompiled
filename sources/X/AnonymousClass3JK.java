package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.ui.swipenavigation.PositionConfig;
import java.util.List;
import java.util.Set;

/* renamed from: X.3JK  reason: invalid class name */
public final class AnonymousClass3JK implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass354 A00;

    public AnonymousClass3JK(AnonymousClass354 r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(402361974);
        AnonymousClass354 r0 = this.A00;
        C227802jw A002 = AnonymousClass354.A00(r0);
        if (A002 != null) {
            UserSession userSession = r0.A01;
            AnonymousClass4DU r5 = r0.A02;
            int i = A002.A0A().A0H().A02;
            2aX r9 = new 2aX(2aD.A0I, (List) null, i, i);
            AnonymousClass2g1 r8 = AnonymousClass2g1.TOP_NAVIGATION_BAR;
            C226252fx r2 = C226252fx.NUMBERED;
            2aN.A00(userSession).A00().A01(r2, r8, r9);
            2aV A01 = 2aN.A00(userSession).A01();
            0qQ.A0B(r8, 0);
            A01.A03(new C239993Jd(r2, r8, (C71062aE) null, (Set) null), r9, false);
            C249813kP.A00.A06("direct_inbox", "mainFeedDirectButtonClick", false);
            AnonymousClass332 r02 = A002.A07;
            if (r02 != null) {
                r02.A00.onPause();
            }
            2Zg A07 = A002.A07();
            if (A07 != null) {
                AB2.A01(userSession, r5, "main_direct");
                A07.FLD(new PositionConfig((AnonymousClass57C) null, (CameraConfiguration) null, (AnonymousClass3QO) null, "on_launch_direct_inbox", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1.0f, 0, true));
            }
        }
        AnonymousClass0fD.A0C(-757881146, A05);
    }
}
