package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.4Gx  reason: invalid class name and case insensitive filesystem */
public abstract class C263024Gx {
    public static final void A00(AnonymousClass9J0 r3, UserSession userSession, C262994Gu r5, AnonymousClass3W1 r6, C262864Gh r7, AnonymousClass3V9 r8) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r7, 2);
        0qQ.A0B(r5, 3);
        0qQ.A0B(r3, 4);
        0qQ.A0B(r6, 5);
        if (!r3.A02) {
            r8.A0A();
            return;
        }
        C262954Gq.A00((View.OnClickListener) ((0sP) ((AnonymousClass9IE) r3.A00).A00).invoke(r5), r7, (C262744Fv) r3.A04, new IZK(r6), r8);
        String str = r3.A01;
        if (str != null && str.length() > 0 && 182.A06(0Tu.A05, userSession, 36320279271055530L)) {
            r8.A0H(str);
        }
    }
}
