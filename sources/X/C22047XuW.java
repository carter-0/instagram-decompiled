package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.XuW  reason: case insensitive filesystem */
public final class C22047XuW implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C21225XPt A01;

    public C22047XuW(UserSession userSession, C21225XPt xPt) {
        this.A01 = xPt;
        this.A00 = userSession;
    }

    public final void onClick(View view) {
        C314256hu r0;
        XR4 xr4;
        int A05 = AnonymousClass0fD.A05(2047293608);
        C21225XPt xPt = this.A01;
        Boolean bool = xPt.A01;
        if (bool != null) {
            UserSession userSession = this.A00;
            boolean booleanValue = bool.booleanValue();
            xPt.A02();
            C314256hu r2 = xPt.A00;
            if (r2 != null) {
                if (xPt.A02 == AnonymousClass8ZM.FIRST_OPTION) {
                    xr4 = XR4.Emoji;
                } else {
                    xr4 = XR4.Avatar;
                }
                r2.DuK(xr4);
            }
            if (!booleanValue && (r0 = xPt.A00) != null) {
                r0.Etz();
            }
            if (xPt.A02 == AnonymousClass8ZM.SECOND_OPTION) {
                LRq.A00(userSession, AnonymousClass000.A00(642));
            }
        }
        AnonymousClass0fD.A0C(-193642564, A05);
    }
}
