package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class VWN {
    public final C68506NLd A00;
    public final EAA A01;
    public final NLH A02;

    public VWN(Context context, FragmentActivity fragmentActivity, AnonymousClass0iw r20, UserSession userSession, C74428Pui pui, C74585PxY pxY, Integer num, String str, boolean z, boolean z2, boolean z3) {
        Context context2 = context;
        AnonymousClass0iw r5 = r20;
        UserSession userSession2 = userSession;
        C74585PxY pxY2 = pxY;
        C51974G9v.A1P(context2, userSession2, r5, pxY2);
        C74428Pui pui2 = pui;
        0qQ.A0B(pui2, 5);
        XAH xah = XAH.A01;
        0qQ.A0B(xah, 5);
        this.A00 = new C68506NLd(context2, r5, userSession2, pxY2, xah, num, str, z, z2, z3, false, false, false);
        this.A02 = new NLH(pui2);
        this.A01 = new EAA(userSession2, fragmentActivity);
    }
}
