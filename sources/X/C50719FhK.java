package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.FhK  reason: case insensitive filesystem */
public final class C50719FhK implements AnonymousClass5IX {
    public final Context A00;
    public final UserSession A01;

    public final boolean E1z(AnonymousClass5IY r6) {
        Context context = this.A00;
        UserSession userSession = this.A01;
        return AnonymousClass7TE.A1b(AJ0.A01(context, userSession, "ig_qp_fx_native_auth_token_existence_filter", "IGNativeAuthTokenExistenceFilter", userSession.A06));
    }

    public C50719FhK(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }
}
