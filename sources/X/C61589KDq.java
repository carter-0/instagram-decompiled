package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.KDq  reason: case insensitive filesystem */
public final class C61589KDq extends C228042kh {
    public final Activity A00;
    public final Context A01;
    public final AnonymousClass07i A02;
    public final UserSession A03;

    public C61589KDq(Activity activity, Context context, AnonymousClass07i r4, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A01 = context;
        this.A00 = activity;
        this.A02 = r4;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A03;
        return new C60211JhU(this.A00, this.A02, userSession, new C63707L3r(userSession, this.A01));
    }
}
