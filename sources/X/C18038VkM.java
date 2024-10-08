package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.VkM  reason: case insensitive filesystem */
public final class C18038VkM {
    public final Context A00;
    public final UserSession A01;
    public final 0xa A02;

    public C18038VkM(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = 1Al.A01(userSession).A03(1An.A0w);
    }

    public final long A00() {
        return this.A02.getLong(002.A0R(this.A01.A06, "LAST_UPLOAD_SUCCESS_TS"), 0);
    }

    public final String A01() {
        String string = this.A02.getString(002.A0R(this.A01.A06, "last_upload_client_root_hash"), "");
        0qQ.A0A(string);
        return string;
    }

    public final void A02(long j) {
        UserSession userSession = this.A01;
        String str = userSession.A06;
        boolean A06 = 182.A06(0Tu.A05, userSession, 36311985687692114L);
        0xY AR4 = this.A02.AR4();
        if (A06) {
            AR4.E5c(002.A0R(str, "LAST_UPLOAD_SUCCESS_TS"), j);
        } else {
            AR4.E5c(002.A0R(str, "LAST_UPLOAD_SUCCESS_TS"), 0);
        }
        AR4.apply();
    }
}
