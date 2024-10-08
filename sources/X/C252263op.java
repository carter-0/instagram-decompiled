package X;

import android.content.Context;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.3op  reason: invalid class name and case insensitive filesystem */
public final class C252263op {
    public final UserSession A00;
    public final C252273oq A01;

    public C252263op(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new C252273oq(userSession);
    }

    public final boolean A00(Context context, 1Xj r5) {
        Boolean valueOf;
        0qQ.A0B(context, 0);
        if (r5.CeS()) {
            AnonymousClass3WR CEL = r5.CEL();
            C252273oq r0 = this.A01;
            String str = CEL.A0G;
            0qQ.A0B(str, 0);
            return 1wS.A01(r0.A00).A0G(str);
        }
        ExtendedImageUrl A1n = r5.A1n(context);
        if (A1n == null) {
            return false;
        }
        Looper.myLooper();
        Looper.getMainLooper();
        A1n.AjH();
        1NK A002 = 1NK.A00();
        String A0L = A002.A0L(A1n);
        1JK r1 = A002.A0F.A00;
        if (r1 == null || (valueOf = Boolean.valueOf(r1.CZs(A0L))) == null) {
            return false;
        }
        return valueOf.booleanValue();
    }
}
