package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Hkf  reason: case insensitive filesystem */
public final class C55620Hkf {
    public final AnonymousClass2t9 A00;
    public final List A01 = AnonymousClass7TE.A1C();

    /* JADX WARNING: type inference failed for: r0v2, types: [X.2tF, java.lang.Object] */
    public C55620Hkf(Context context, AnonymousClass0iw r4, UserSession userSession, JO1 jo1) {
        C51972G9s.A1D(jo1, userSession);
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        A002.A01(new H7D(r4, userSession, jo1));
        this.A00 = DbU.A0U(A002, new Object());
    }
}
