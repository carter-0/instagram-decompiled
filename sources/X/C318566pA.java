package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.user.model.User;

/* renamed from: X.6pA  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C318566pA implements View.OnClickListener {
    public final /* synthetic */ C323366xN A00;
    public final /* synthetic */ User A01;

    public /* synthetic */ C318566pA(C323366xN r1, User user) {
        this.A00 = r1;
        this.A01 = user;
    }

    public final void onClick(View view) {
        C323366xN r0 = this.A00;
        User user = this.A01;
        AnonymousClass4DH r2 = r0.A0D;
        FragmentActivity activity = r2.getActivity();
        if (activity != null) {
            UserSession userSession = r0.A0E;
            if (C322606w6.A02(userSession)) {
                Bundle bundle = new Bundle();
                bundle.putString("displayed_user_id", user.getId());
                bundle.putBoolean("disable_initial_animation", true);
                C49080Eoy.A00(activity, bundle, userSession, user.getId(), true);
                return;
            }
            C46447Df9.A03();
            0qQ.A0B(userSession, 1);
            C49731F3w A07 = 1as.A04.A02.A07(r2, userSession, 2FW.A1O);
            A07.A06(user.getId());
            DirectShareSheetFragment A002 = A07.A00();
            0wc A012 = AnonymousClass0kN.A01(r2, userSession);
            0Aj A003 = A012.A00(A012.A00, "direct_reshare_button_tap");
            if (A003.isSampled()) {
                A003.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
                A003.Cgf();
            }
            AnonymousClass37D A013 = AnonymousClass37D.A00.A01(activity);
            if (A013 != null) {
                A013.A0J(A002);
            }
        }
    }
}
