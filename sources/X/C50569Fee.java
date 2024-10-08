package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.api.schemas.PrivateReplyStatus;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fee  reason: case insensitive filesystem */
public final class C50569Fee implements G7C {
    public final UserSession A00;
    public final Dd4 A01;

    public final boolean AFM(C48087EVf eVf, C283155Gi r3, int i) {
        0qQ.A0B(eVf, 1);
        return AnonymousClass7TF.A1W(eVf, C48087EVf.MESSAGE_BUTTON);
    }

    public final void AJS(View view, JV7 jv7, C48087EVf eVf, C283155Gi r13, int i) {
        String str;
        User A04;
        0qQ.A0B(r13, 0);
        String str2 = r13.A04.A0f;
        if (str2 == null || !DdN.A00(this.A00, str2)) {
            PrivateReplyStatus privateReplyStatus = r13.A04.A00;
            if (privateReplyStatus == null || privateReplyStatus.ordinal() != 3) {
                str = "private_reply_message";
            } else {
                str = AnonymousClass000.A00(742);
            }
        } else {
            str = "notification_message_button";
        }
        if (r13.A00 == 101) {
            Dd4 dd4 = this.A01;
            AnonymousClass37D A0i = DbT.A0i(dd4.A05);
            if (A0i != null && (A04 = r13.A04()) != null) {
                UserSession userSession = dd4.A0A;
                String id = A04.getId();
                0qQ.A0B(userSession, 0);
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), C66579MXk.A00(1124));
                if (A0e.isSampled()) {
                    A0e.AAJ("target_id", id);
                    A0e.AAJ("view_module", "activity_feed");
                    A0e.AAJ(AnonymousClass000.A00(90), "button_tapped");
                    A0e.Cgf();
                }
                OOA A06 = 1as.A04.A02.A06(dd4.A0B, userSession, "activity_feed");
                Bundle bundle = A06.A01;
                bundle.putBoolean(C66579MXk.A00(91), true);
                bundle.putString(C66579MXk.A00(525), A04.getId());
                A0i.A0I(A06.A00());
                return;
            }
            return;
        }
        this.A01.DZS(r13, str);
    }

    public C50569Fee(UserSession userSession, Dd4 dd4) {
        this.A01 = dd4;
        this.A00 = userSession;
    }
}
