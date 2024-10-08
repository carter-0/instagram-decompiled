package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.Q1x  reason: case insensitive filesystem */
public final class C7273Q1x {
    public final UserSession A00;
    public final C61480nO A01;

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final ListenableFuture A00(Q2X q2x, Q1l q1l, String str, String str2, boolean z) {
        Q1l q1l2 = q1l;
        String str3 = str;
        boolean A1U = AnonymousClass7TF.A1U(0, str3, q1l);
        0qQ.A0B(q2x, 4);
        try {
            1OC A002 = SBX.A00(q1l2, this.A00, str3, str2, z, false);
            0qQ.A0B(A002, 0);
            R22 r22 = new R22(new Object(), A002);
            C255183ti.A04(new T0J(q2x, 5), r22, new 0nQ(this.A01, 330, 3, false, A1U));
            return r22;
        } catch (IllegalArgumentException e) {
            return RKD.A00(q2x, e);
        } catch (IOException e2) {
            return RKD.A00(q2x, e2);
        }
    }

    public C7273Q1x(UserSession userSession, C61480nO r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }
}
