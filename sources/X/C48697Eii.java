package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Eii  reason: case insensitive filesystem */
public abstract class C48697Eii {
    public static Object A00(C307896Rx r10, AnonymousClass6Tm r11) {
        C277014uI r0;
        FTZ ftz;
        Object A0e = DbW.A0e(r11);
        if (A0e instanceof C280064zw) {
            r0 = ((C280064zw) A0e).A00;
        } else {
            r0 = null;
        }
        UserSession A0Y = DbT.A0Y(r10);
        if (r0 != null) {
            ftz = new FTZ(r10, r0, A0Y);
        } else {
            ftz = null;
        }
        boolean z = AnonymousClass36O.A0G;
        Fragment A0H = DbU.A0H(r10);
        0hq A05 = C308206Td.A05(r10);
        User A0j = DbT.A0j(A0Y);
        Integer num = AnonymousClass05K.A0w;
        AnonymousClass7TG.A1U(A0Y, A0H, A05);
        AnonymousClass36O r2 = new AnonymousClass36O(A0H, A05, ftz, A0Y, A0j, num, (0sP) null);
        C308206Td.A0K(r10, new EEI(2, (Object) r2, (Object) r10));
        Context context = DbU.A0H(r10).getContext();
        if (context != null) {
            r2.A05(context);
        }
        return null;
    }
}
