package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class FIJ implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass3WZ A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ AnonymousClass3W1 A02;

    public FIJ(AnonymousClass3WZ r1, 1Xj r2, AnonymousClass3W1 r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        dialogInterface.dismiss();
        AnonymousClass3WZ r2 = this.A00;
        1Xj r5 = this.A01;
        AnonymousClass3W1 r4 = this.A02;
        C297555rw A002 = C297545rv.A00(r2.A03);
        String moduleName = r2.A04.getModuleName();
        String sessionId = r2.A07.getSessionId();
        UserSession userSession = A002.A00;
        0Aj A0e = AnonymousClass7TE.A0e(DbW.A0J(userSession, moduleName), "instagram_feed_favorite_edit_favorites_dialog_dismiss_tap");
        if (A0e.isSampled()) {
            DbS.A1K(A0e, moduleName);
            String A30 = r5.A30();
            A30.getClass();
            A0e.A9F("ig_media_id", DbV.A0q(A30));
            if (r5.A0C.BIl() != null) {
                str = r5.A0C.BIl();
            } else {
                str = "";
            }
            A0e.AAJ("inventory_source", str);
            A0e.AAJ("ranking_info_token", DbT.A0x(r5));
            User A2A = r5.A2A(userSession);
            A2A.getClass();
            Dbc.A0b(A0e, r5, r4, DbV.A0q(A2A.getId()), sessionId);
        }
    }
}
