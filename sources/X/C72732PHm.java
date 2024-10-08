package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.PHm  reason: case insensitive filesystem */
public final class C72732PHm implements MVB {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final List A02;

    public final void onButtonClick(View view) {
        0qQ.A0B(view, 0);
        Activity A012 = C61270mF.A01(AnonymousClass7TE.A0S(view));
        if (A012 != null) {
            UserSession userSession = this.A01;
            AnonymousClass0iw r9 = this.A00;
            List list = this.A02;
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C66581MXm.A1M(DbT.A0k(it), A0r);
            }
            C291175gg r3 = new C291175gg(A0r);
            if (182.A06(0Tu.A05, userSession, 36313763805661419L)) {
                AnonymousClass7VT.A00(userSession).A02(r3, A0r, new C58766IxD(12, userSession, A012, r9, true), true);
                return;
            }
            1pE A013 = 1pE.A01(A012, r9, userSession, "direct_thread_content_note");
            A013.A0B = r3;
            A013.A06();
        }
    }

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public C72732PHm(AnonymousClass0iw r1, UserSession userSession, List list) {
        AnonymousClass7TG.A1O(list, userSession);
        this.A02 = list;
        this.A01 = userSession;
        this.A00 = r1;
    }
}
