package X;

import android.app.Activity;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.NeS  reason: case insensitive filesystem */
public final class C69088NeS extends C71135OdY {
    public final Activity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C71111Ocu A03;
    public final PM9 A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69088NeS(Activity activity, ViewGroup viewGroup, AnonymousClass0iw r5, UserSession userSession, C71111Ocu ocu) {
        super(DbS.A0z(N97.class));
        0qQ.A0B(ocu, 4);
        this.A00 = activity;
        this.A02 = userSession;
        this.A03 = ocu;
        this.A01 = r5;
        this.A04 = new PM9(viewGroup, new OA7(this));
    }
}
