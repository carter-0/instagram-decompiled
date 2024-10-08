package X;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ntt  reason: case insensitive filesystem */
public abstract class C69891Ntt {
    public static final OO6 A00(Context context, UserSession userSession, Integer num) {
        Context context2 = context;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1T(userSession, context, num);
        C3024563j r4 = new C3024563j(AnonymousClass63C.A00(context));
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
        0qQ.A07(googleApiAvailability);
        C67346MmN mmN = new C67346MmN(googleApiAvailability);
        02m r2 = 02m.A0p;
        NUV nuv = new NUV(r2, AnonymousClass65D.A00(userSession), C66580MXl.A0o(userSession, r2));
        return new OO6(context2, r4, mmN, OP5.A00(userSession2, "BlockStoreBackupRepository"), userSession2, C69896Nty.A00(userSession2), nuv, num);
    }
}
