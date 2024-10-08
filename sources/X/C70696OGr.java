package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.OGr  reason: case insensitive filesystem */
public final class C70696OGr {
    public final int A00;
    public final Context A01;
    public final Fragment A02;
    public final UserSession A03;
    public final NKI A04;
    public final AnonymousClass6ST A05;

    public C70696OGr(Context context, Fragment fragment, UserSession userSession, NKI nki) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A01 = context;
        this.A02 = fragment;
        this.A04 = nki;
        this.A00 = DbS.A04(0Tu.A05, userSession, 36602385606578812L);
        AnonymousClass6ST r0 = new AnonymousClass6ST(context, true);
        this.A05 = r0;
        DbX.A15(context, r0);
    }
}
