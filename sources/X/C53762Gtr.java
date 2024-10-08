package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gtr  reason: case insensitive filesystem */
public final class C53762Gtr extends C251343mx {
    public final Activity A00;
    public final UserSession A01;
    public final C55679Hlc A02;
    public final JNJ A03;

    public final C251263mp A0X(AnonymousClass3Y5 r9) {
        0qQ.A0B(r9, 0);
        JNJ jnj = this.A03;
        if (jnj instanceof C53604GrJ) {
            AnonymousClass3XV r4 = 2WX.A02;
            2WX A0D = C51974G9v.A0D((2WX) null, C51965G9l.A0b(AnonymousClass05K.A00, 100.0f, 0), 100.0f, 0);
            2Wb A0Q = C51972G9s.A0Q(r9);
            A0Q.A00(new C53950Gwu(this.A00, r4, this.A01, this.A02, (C53604GrJ) jnj));
            return C243563Zg.A01(A0Q, r9, A0D);
        } else if (jnj instanceof C57685Ieo) {
            return null;
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    public C53762Gtr(Activity activity, UserSession userSession, C55679Hlc hlc, JNJ jnj) {
        C51974G9v.A1P(activity, userSession, jnj, hlc);
        this.A00 = activity;
        this.A01 = userSession;
        this.A03 = jnj;
        this.A02 = hlc;
    }
}
