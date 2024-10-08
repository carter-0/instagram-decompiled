package X;

import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.3aX  reason: invalid class name and case insensitive filesystem */
public final class C244033aX {
    public final AnonymousClass3Z1 A00;

    public final View.OnTouchListener A00(AnonymousClass9J2 r4, String str) {
        0qQ.A0B(r4, 0);
        AnonymousClass3Z1 r1 = this.A00;
        1Xj r2 = (1Xj) r4.A01;
        0qQ.A0B(r2, 0);
        if (r2.A0A != null) {
            return null;
        }
        User A2A = r2.A2A(r1.A00);
        if (A2A != null) {
            C242813Wa r12 = r1.A01;
            String id = A2A.getId();
            if (str == null) {
                str = "";
            }
            return r12.Dsk(r2, id, str);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A01(AnonymousClass9J2 r6, int i) {
        0qQ.A0B(r6, 0);
        AnonymousClass3Z1 r4 = this.A00;
        1Xj r3 = (1Xj) r6.A01;
        AnonymousClass3W1 r2 = (AnonymousClass3W1) r6.A02;
        boolean z = r6.A05;
        0qQ.A0B(r3, 0);
        0qQ.A0B(r2, 1);
        if (r3.A0A == null) {
            r4.A01.D2O(r3, r2, i, z);
        }
    }

    public final void A02(AnonymousClass9J2 r8, int i) {
        0qQ.A0B(r8, 0);
        AnonymousClass3Z1 r1 = this.A00;
        1Xj r2 = (1Xj) r8.A01;
        AnonymousClass3W1 r3 = (AnonymousClass3W1) r8.A02;
        boolean z = r8.A05;
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        if (r2.A0A == null) {
            User A2A = r2.A2A(r1.A00);
            C242813Wa r12 = r1.A01;
            if (A2A != null) {
                r12.D3K(r2, r3, A2A.getId(), i, z);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public C244033aX(AnonymousClass3Z1 r1) {
        this.A00 = r1;
    }
}
