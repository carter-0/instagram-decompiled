package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.HmG  reason: case insensitive filesystem */
public final class C55719HmG {
    public DirectShareTarget A00;
    public final AnonymousClass2t9 A01;
    public final C55624Hkj A02;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2tF, java.lang.Object] */
    public C55719HmG(Context context, AnonymousClass0iw r6, UserSession userSession, C55476HiK hiK) {
        boolean A1Y = DbW.A1Y(userSession);
        C55624Hkj hkj = new C55624Hkj(hiK, this);
        this.A02 = hkj;
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        A002.A01(new Object());
        AnonymousClass2t9 A0U = DbU.A0U(A002, new H7E(r6, userSession, hkj));
        A0U.setHasStableIds(A1Y);
        this.A01 = A0U;
    }
}
