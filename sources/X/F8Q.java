package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import java.util.List;

public abstract class F8Q {
    public static final void A01(Activity activity, UserSession userSession, Reel reel, AnonymousClass3BQ r8, String str, String str2, List list, int i, boolean z, boolean z2) {
        0qQ.A0B(r8, 3);
        C309416Ye A0i = DbS.A0i();
        UserSession userSession2 = userSession;
        A0i.A02(userSession, reel.getId(), list);
        A0i.A0C = str;
        A0i.A0D = str2;
        A0i.A04 = r8;
        DbY.A1R(A0i);
        A0i.A00 = i;
        Bundle A00 = A0i.A00();
        Activity activity2 = activity;
        A00(activity2, A00, userSession2, reel, r8, z, z2);
    }

    public static final void A00(Activity activity, Bundle bundle, UserSession userSession, Reel reel, AnonymousClass3BQ r7, boolean z, boolean z2) {
        AnonymousClass3WR r2;
        C270194gL r1 = reel.A0H;
        if (r1 != null) {
            r2 = r1.A04(userSession);
        } else {
            r2 = null;
        }
        if (reel.A0d()) {
            if (r1 != null && r2 != null) {
                C255593uO.A00(userSession).A01(new C256203vO(r2, r7.A00));
            } else if (!z) {
                return;
            }
        }
        AnonymousClass6W8 A0b = DbS.A0b(activity, bundle, userSession, ModalActivity.class, "reel_viewer");
        if (z2) {
            A0b.A07();
        } else {
            A0b.A0J = ModalActivity.A08;
        }
        A0b.A0C(activity);
    }
}
