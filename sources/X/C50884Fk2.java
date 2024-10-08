package X;

import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fk2  reason: case insensitive filesystem */
public final class C50884Fk2 implements G6H {
    public Dc2 A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;

    public C50884Fk2(AnonymousClass4DH r2, UserSession userSession) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
        this.A02 = userSession;
    }

    public static final void A00(C50884Fk2 fk2) {
        AnonymousClass4DH r4 = fk2.A01;
        UserSession userSession = fk2.A02;
        int i = EWN.RECIPROCAL_FOLLOWS.A00;
        Integer valueOf = Integer.valueOf(i);
        1NY A05 = Dbc.A05(userSession);
        if (valueOf != null) {
            A05.A0C("visibility_status", i);
        }
        1OC A0T = DbT.A0T(A05, "surface", "qp");
        0qQ.A0C(A0T, C273654mx.A00(351));
        C47696EDf.A01(A0T, fk2, 19);
        r4.schedule(A0T);
    }

    public final void CI0(Uri uri, Bundle bundle) {
        A00(this);
    }
}
