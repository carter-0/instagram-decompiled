package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

public final class P8J implements AnonymousClass7DS {
    public final Activity A00;
    public final UserSession A01;
    public final AnonymousClass0iw A02;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r1 != null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean DRa(android.view.MotionEvent r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r7 = this;
            X.7Fw r9 = (X.C328717Fw) r9
            r0 = 0
            X.0qQ.A0B(r9, r0)
            java.lang.String r1 = r9.A04
            if (r1 == 0) goto L_0x0036
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0036
            android.net.Uri r2 = X.0cp.A03(r1)
            if (r2 == 0) goto L_0x001e
            java.lang.String r0 = "user_ids"
            java.lang.String r1 = r2.getQueryParameter(r0)
            if (r1 != 0) goto L_0x0020
        L_0x001e:
            java.lang.String r1 = ""
        L_0x0020:
            r0 = 44
            boolean r0 = X.00l.A0X(r1, r0)
            r6 = r0 ^ 1
            if (r2 == 0) goto L_0x0034
            java.lang.String r3 = r9.A02
            java.lang.String r4 = r9.A01
            java.lang.String r5 = r9.A03
            r1 = r7
            r1.A00(r2, r3, r4, r5, r6)
        L_0x0034:
            r0 = 1
            return r0
        L_0x0036:
            r2 = 0
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P8J.DRa(android.view.MotionEvent, java.lang.Object, java.lang.Object):boolean");
    }

    public P8J(Activity activity, AnonymousClass0iw r2, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = activity;
        this.A02 = r2;
    }

    public final void A00(Uri uri, String str, String str2, String str3, boolean z) {
        Bundle A0a = AnonymousClass7TE.A0a();
        String queryParameter = uri.getQueryParameter("user_ids");
        if (queryParameter == null) {
            queryParameter = "";
        }
        UserSession userSession = this.A01;
        String str4 = userSession.A06;
        if (0qQ.A0K(str4, str2)) {
            str4 = str3;
        }
        A0a.putString("recs_from_friends_user_ids", queryParameter);
        A0a.putString("thread_name", str);
        A0a.putString("thread_user_id", str3);
        A0a.putString("sender_id", str2);
        if (z) {
            AnonymousClass0iw r0 = this.A02;
            String queryParameter2 = uri.getQueryParameter("user_ids");
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            C46474Dfc A012 = C46548Dgp.A01(userSession, queryParameter2, "direct_thread_recs_from_friends_message", r0.getModuleName());
            FragmentActivity fragmentActivity = this.A00;
            DbS.A1X(fragmentActivity);
            C46474Dfc.A03(DbU.A0Q(fragmentActivity, userSession), userSession, C46447Df9.A03().A01, A012);
        } else {
            DbU.A0w(this.A00, A0a, userSession, ModalActivity.class, "recs_from_friends_receiver");
        }
        AnonymousClass0iw r02 = this.A02;
        ONF onf = new ONF(r02, userSession);
        Long A0d = DbZ.A0d(str4);
        String moduleName = r02.getModuleName();
        0qQ.A0B(moduleName, 2);
        0Aj A0e = AnonymousClass7TE.A0e(onf.A00, "ig_recs_from_friends_xma_click_events");
        DbS.A1J(A0e, "tap_card_stack");
        A0e.A9F("target_id", A0d);
        A0e.AAJ("module", moduleName);
        A0e.Cgf();
    }
}
