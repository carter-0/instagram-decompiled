package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.9qp  reason: invalid class name and case insensitive filesystem */
public final class C390159qp extends C57460Ib4 {
    public C14044Tol A00;
    public final Context A01;
    public final UserSession A02;
    public final A4Y A03;

    public final void onProgressUpdate(int i, int i2, boolean z) {
        this.A03.A00.A08.Epw(new C40433Ac4(i, i2, 0));
    }

    public C390159qp(Context context, UserSession userSession, A4Y a4y) {
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = a4y;
    }
}
