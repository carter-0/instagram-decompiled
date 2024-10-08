package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.sup.voltron.SUPMediaStreamControllerDownloader;

/* renamed from: X.VgJ  reason: case insensitive filesystem */
public final class C17806VgJ {
    public C18078Vl7 A00;
    public final SUPMediaStreamControllerDownloader A01;

    public C17806VgJ(SUPMediaStreamControllerDownloader sUPMediaStreamControllerDownloader) {
        0qQ.A0B(sUPMediaStreamControllerDownloader, 1);
        this.A01 = sUPMediaStreamControllerDownloader;
    }

    public final void A00(Context context, UserSession userSession, X59 x59, String str) {
        AnonymousClass7TG.A1N(context, userSession);
        C18078Vl7 vl7 = this.A00;
        if (vl7 != null) {
            x59.Dba(vl7);
            return;
        }
        this.A01.A02(context, userSession, new C19666WdU(context, userSession, this, x59), str);
    }
}
