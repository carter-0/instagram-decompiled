package X;

import android.content.Context;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* renamed from: X.HqV  reason: case insensitive filesystem */
public final class C55964HqV {
    public final Context A00;
    public final C327807Cg A01;
    public final boolean A02;
    public final UserSession A03;

    public C55964HqV(Context context, UserSession userSession, C327807Cg r4) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A00 = context;
        this.A01 = r4;
        this.A02 = C51972G9s.A1J(context.getResources().getConfiguration().uiMode & 48);
    }

    public final void A00(String str, boolean z) {
        2IS A04 = C41845B3m.A04();
        2IS A042 = C41845B3m.A04();
        A04.A04("theme_id", str);
        PandoGraphQLRequest A002 = C71583OnK.A00(A04, A042);
        1vn A012 = 1vm.A01(this.A03);
        0qQ.A0A(A002);
        C56925IHu.A00(new C56930IHz(1, this, z), A002, A012, this, 5);
    }
}
