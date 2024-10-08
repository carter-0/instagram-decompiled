package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;
import java.util.regex.Pattern;

/* renamed from: X.Fvu  reason: case insensitive filesystem */
public final class C51548Fvu implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ 1Wh A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C51548Fvu(UserSession userSession, 1Wh r2, User user, String str, String str2, String str3, String str4) {
        this.A00 = userSession;
        this.A02 = user;
        this.A01 = r2;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A03 = str4;
    }

    public final void run() {
        UserSession userSession = this.A00;
        0tB A002 = AnonymousClass0BO.A00(userSession);
        if (A002.CKD()) {
            User BWD = A002.BWD(this.A02);
            if (BWD != null) {
                Context context = this.A01.A02;
                0tB r4 = A002;
                AnonymousClass7TG.A1N(context, userSession);
                if (r4.A04) {
                    0tB.A01(context, userSession, r4, BWD);
                } else {
                    User A0Q = AnonymousClass7TF.A0Q(userSession);
                    07v.A01(context, userSession, r4.A03.A00);
                    0tB.A00(context, userSession, r4, BWD);
                    0tB.A02(A0Q, BWD);
                }
                1Ln r2 = new 1Ln(AnonymousClass7TE.A0e(AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession), "ig_account_switched"), 189);
                r2.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "force_logout");
                r2.A0R("to_pk", BWD.getId());
                r2.A0R("from_pk", userSession.A06);
                r2.Cgf();
            }
        } else {
            Context context2 = this.A01.A02;
            String str = this.A05;
            String str2 = this.A04;
            0qQ.A0B(context2, 0);
            07v.A01(context2, userSession, userSession.A04.A00);
            1xC.A01.A00(new 0KY(str, str2));
        }
        1Wh r1 = this.A01;
        synchronized (r1) {
            r1.A01 = false;
        }
        Context context3 = r1.A02;
        String str3 = this.A06;
        String str4 = this.A03;
        boolean A1U = AnonymousClass7TF.A1U(0, context3, userSession);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("accounts/perform_post_force_logout_actions/");
        DbZ.A0x(context3, A0a, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, userSession.A06);
        Pattern pattern = 0mp.A01;
        if (str3 == null) {
            str3 = "";
        }
        A0a.A9m(AnonymousClass000.A00(3531), str3);
        if (str4 == null) {
            str4 = "";
        }
        DbX.A1M(A0a, "path", str4);
        1ES.A05(DbT.A0U(A0a, A1U), 152, 3, false, A1U);
    }
}
