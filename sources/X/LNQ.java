package X;

import android.content.Intent;
import android.net.Uri;
import com.instagram.common.session.UserSession;

public final class LNQ {
    public static final LNQ A00 = new Object();

    public final boolean A00(Intent intent, 0hq r12, UserSession userSession) {
        Intent intent2 = intent;
        String stringExtra = intent.getStringExtra(Pxd.A00(634));
        String stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        if (stringExtra == null || stringExtra.length() == 0 || !"android.intent.action.SEND".equals(intent.getAction()) || 2L2.A00(userSession).A0N(stringExtra) == null) {
            return false;
        }
        AnonymousClass7TF.A0D().postDelayed(new C66064M9x(intent2, (Uri) intent.getParcelableExtra(AnonymousClass000.A00(66)), r12, stringExtra, stringExtra2), 100);
        return true;
    }
}
