package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6jM  reason: invalid class name and case insensitive filesystem */
public final class C315106jM implements C315036jF {
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
        return new C315476jx((CharSequence) context.getString(2131971246));
    }

    public final void DsI(Context context, AnonymousClass0iw r7, UserSession userSession, C255773uh r9, C250973mM r10) {
        1Av A00 = 1Au.A00(userSession);
        A00.A5F.Epx(A00, true, 1Av.A8a[198]);
    }

    public final boolean EtQ(UserSession userSession, C255773uh r7, C250973mM r8, C316026kz r9) {
        1Xj r1;
        View CFK = r9.CFK();
        if (CFK == null || CFK.getVisibility() != 0 || r7 == null || (r1 = r7.A0b) == null || r1.A0C.C12() == null || r1.A0C.C12().isEmpty() || ((DUS) r1.A0C.C12().get(0)).Bal() == null || ((DUS) r1.A0C.C12().get(0)).Bal().isEmpty()) {
            return false;
        }
        1Av A00 = 1Au.A00(userSession);
        if (!((Boolean) A00.A5F.CDM(A00, 1Av.A8a[198])).booleanValue()) {
            return true;
        }
        return false;
    }
}
