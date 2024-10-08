package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ksh  reason: case insensitive filesystem */
public abstract class C63174Ksh {
    public static final void A00(Context context, UserSession userSession, C293505kq r7, AnonymousClass3Q2 r8, 2Nn r9) {
        AnonymousClass3QS r1;
        C366688pV r0;
        boolean A1Y = C51970G9q.A1Y(r9);
        AnonymousClass51W r12 = r8.A1P;
        if (r12 == null) {
            List list = r7.A0v;
            C370018vh r02 = r7.A0C;
            if (r02 == null || (r0 = r02.A01) == null) {
                r1 = null;
            } else {
                r1 = r0.A07;
            }
            r12 = C39563A0f.A00(r1, list, r7.A0j, (Map) null);
            r8.A1P = r12;
        }
        if (r8.A0r == null) {
            r8.A0r = AHJ.A01(context, userSession, r12, r9, A1Y);
        }
    }
}
