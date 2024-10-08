package X;

import android.widget.LinearLayout;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.3ND  reason: invalid class name */
public abstract class AnonymousClass3ND {
    public static void A00(UserSession userSession, AnonymousClass3BT r3, AnonymousClass3N6 r4) {
        LinearLayout linearLayout;
        float f;
        Reel reel = r3.A03;
        String str = reel.A1o;
        0qQ.A07(str);
        r4.A01 = str;
        if (!reel.A1Y || AnonymousClass3NF.A00(userSession, r3)) {
            linearLayout = r4.A05;
            f = 1.0f;
        } else {
            linearLayout = r4.A05;
            f = 0.3f;
        }
        linearLayout.setAlpha(f);
        AnonymousClass6VJ r1 = r4.A00;
        if (r1 != null) {
            r1.A05(AnonymousClass05K.A01);
            r4.A00 = null;
        }
    }
}
