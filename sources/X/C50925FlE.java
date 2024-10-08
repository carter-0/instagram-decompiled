package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FlE  reason: case insensitive filesystem */
public final class C50925FlE implements 0Js {
    public final /* bridge */ /* synthetic */ void ATN(UserSession userSession, 0Jv r7, Object obj) {
        EyT eyT = (EyT) obj;
        0qQ.A0B(userSession, 0);
        if (eyT != null) {
            int i = eyT.A02;
            int i2 = eyT.A01;
            int i3 = eyT.A00;
            1NY A0L = DbZ.A0L(userSession);
            DbX.A1M(A0L, "day", Dbc.A0D(A0L, "accounts/set_birthday/", i, i2, i3));
            1ES.A03(A0L.A0M());
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
