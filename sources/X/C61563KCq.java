package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.KCq  reason: case insensitive filesystem */
public final class C61563KCq extends C228042kh {
    public final Context A00;
    public final UserSession A01;

    public C61563KCq(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Context context = this.A00;
        UserSession userSession = this.A01;
        return new C46783DlB(context, userSession, C63305Kuo.A00(userSession), AnonymousClass2o3.A00(userSession));
    }
}
