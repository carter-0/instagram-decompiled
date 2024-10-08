package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6jI  reason: invalid class name and case insensitive filesystem */
public final class C315066jI implements C315036jF {
    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r3, C316026kz r4) {
        return null;
    }

    public final C226262fy C8G() {
        return C226262fy.ABOVE_ANCHOR;
    }

    public final View C8E(C255773uh r2, C316026kz r3) {
        return r3.CFK();
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r5, C250973mM r6) {
        return new C315476jx((CharSequence) context.getString(2131974006));
    }

    public final void DsI(Context context, AnonymousClass0iw r7, UserSession userSession, C255773uh r9, C250973mM r10) {
        1Av A00 = 1Au.A00(userSession);
        A00.A5G.Epx(A00, true, 1Av.A8a[199]);
    }

    public final boolean EtQ(UserSession userSession, C255773uh r6, C250973mM r7, C316026kz r8) {
        View CFK = r8.CFK();
        if (CFK != null && CFK.getVisibility() == 0) {
            1Xj r1 = r6.A0b;
            if (!(AnonymousClass6UJ.A00(r1) == null || AnonymousClass6UJ.A00(r1).A01() == 0)) {
                1Av A00 = 1Au.A00(userSession);
                if (((Boolean) A00.A5G.CDM(A00, 1Av.A8a[199])).booleanValue()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
