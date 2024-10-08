package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nxc  reason: case insensitive filesystem */
public abstract class C70122Nxc {
    public static final void A00(Context context, UserSession userSession, 1Xc r4, String str, String str2) {
        r4.A04(userSession, str2, str);
        if (!C69733NrI.A00()) {
            context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
    }
}
