package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.urlhandler.IgMeMessageUrlHandlerActivity;
import com.instagram.user.model.User;

/* renamed from: X.FnA  reason: case insensitive filesystem */
public final class C51018FnA implements G7O {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ IgMeMessageUrlHandlerActivity A01;
    public final /* synthetic */ String A02;

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.urlhandler.IgMeMessageUrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity] */
    public final void DwD(C3727892k r7) {
        0qQ.A0B(r7, 0);
        User A002 = C324696zk.A00(r7);
        if (A002 == null) {
            DwC();
            return;
        }
        ? r4 = this.A01;
        r4.finish();
        IgMeMessageUrlHandlerActivity.A00(r4, String.valueOf(r4.A00), RealtimeConstants.SEND_SUCCESS);
        if (182.A06(0Tu.A05, r4.getSession(), 36314867610684266L)) {
            UserSession session = r4.getSession();
            DbS.A1Z(session);
            AnonymousClass7GH A003 = AnonymousClass7GF.A00(session);
            String str = this.A02;
            if (str == null || str.length() == 0) {
                A003.A01();
            } else {
                String id = A002.getId();
                A003.A02 = str;
                A003.A03 = id;
            }
        }
        1pE A012 = 1pE.A01(r4, DbS.A0O(C49300Esj.A00), this.A00, "ig_me_message_url_entry_point");
        Dbc.A0x(A012, A002);
        A012.A0m = true;
        A012.A06();
    }

    public C51018FnA(UserSession userSession, IgMeMessageUrlHandlerActivity igMeMessageUrlHandlerActivity, String str) {
        this.A01 = igMeMessageUrlHandlerActivity;
        this.A02 = str;
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandler.IgMeMessageUrlHandlerActivity, android.content.Context] */
    public final void DwC() {
        ? r2 = this.A01;
        IgMeMessageUrlHandlerActivity.A00(r2, String.valueOf(r2.A00), "failure");
        0kR.A0B(r2, DbX.A08(r2));
    }
}
