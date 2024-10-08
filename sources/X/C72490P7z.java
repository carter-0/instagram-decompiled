package X;

import android.content.Intent;
import android.view.MotionEvent;
import com.instagram.common.session.UserSession;

/* renamed from: X.P7z  reason: case insensitive filesystem */
public final class C72490P7z implements AnonymousClass7DS {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        NYL nyl = (NYL) obj;
        C328007Db r6 = (C328007Db) obj2;
        AnonymousClass7TG.A1N(nyl, r6);
        UserSession userSession = this.A00;
        String str = nyl.A04;
        if (str == null) {
            str = "";
        }
        O01.A00(C62670KkW.FILE_PILL_CLICK_TO_DOWNLOAD, userSession, str);
        String str2 = nyl.A01;
        if (str2 == null) {
            return false;
        }
        0kR.A00(r6.BJd().getContext(), new Intent("android.intent.action.VIEW", 0cp.A03(str2)));
        return true;
    }

    public C72490P7z(UserSession userSession) {
        this.A00 = userSession;
    }
}
