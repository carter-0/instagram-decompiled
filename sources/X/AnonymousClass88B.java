package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.File;

/* renamed from: X.88B  reason: invalid class name */
public final class AnonymousClass88B extends 2YL {
    public C3498982i A00;
    public File A01;
    public 05G A02;
    public final 2Fk A03;
    public final AnonymousClass2Fj A04;
    public final AnonymousClass2Fj A05;
    public final AnonymousClass2Fj A06 = new 2Fk(AnonymousClass88C.UNSET);
    public final 05G A07;

    public final void A01(Context context, UserSession userSession, File file) {
        0qQ.A0B(file, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 1);
        Context context2 = context;
        0qQ.A0B(context, 2);
        this.A07.Epw(false);
        Medium A032 = C282665Eg.A03(file, 1, 0);
        2Nn A002 = 2Nm.A00(context, userSession);
        String str = 27p.A01(userSession).A04.A0L;
        if (str == null) {
            str = "";
        }
        C39810AAh.A01(context2, A032, userSession2, new C385809jZ(this), AnonymousClass72R.A00(context, userSession), A002, str, true);
    }

    public final AnonymousClass9P8 A00() {
        String A2U;
        C3498982i r2 = this.A00;
        if (r2 == null) {
            return null;
        }
        AnonymousClass804 r5 = (AnonymousClass804) this.A05.A02();
        C369458un r7 = (C369458un) this.A04.A02();
        AnonymousClass8JI r6 = r2.A00;
        if (!r6.A01) {
            return null;
        }
        1Xj r1 = r2.A04;
        String id = r1.getId();
        if (id != null) {
            long A1B = r1.A1B();
            if (r1.A5p()) {
                ExtendedImageUrl A1m = r1.A1m(r1.A0y());
                if (A1m == null) {
                    return null;
                }
                A2U = A1m.A0A;
            } else {
                A2U = r1.A2U();
            }
            if (A2U == null) {
                return null;
            }
            return new AnonymousClass9P8(r2.A02, r5, r6, r7, Boolean.valueOf(0qQ.A0K(r1.A0C.AcQ(), true)), id, A2U, r2.A05.getUsername(), 0sn.A00, A1B);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean A02() {
        AnonymousClass8JI r2;
        C3498982i r0 = this.A00;
        if (r0 != null) {
            r2 = r0.A00;
        } else {
            r2 = null;
        }
        if (r2 == AnonymousClass8JI.SEQUENTIAL_REMIX) {
            return true;
        }
        return false;
    }

    public AnonymousClass88B() {
        AnonymousClass2Fj r2 = new AnonymousClass2Fj();
        this.A05 = r2;
        this.A04 = new AnonymousClass2Fj();
        this.A02 = new 02z(false);
        this.A03 = r2;
        this.A07 = new 02z(false);
    }
}
