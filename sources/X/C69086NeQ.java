package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.NeQ  reason: case insensitive filesystem */
public final class C69086NeQ extends C71135OdY {
    public final Activity A00;
    public final UserSession A01;
    public final OKY A02;
    public final C71111Ocu A03;
    public final PM4 A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C69086NeQ(Activity activity, UserSession userSession, OKY oky, C71111Ocu ocu, PM4 pm4) {
        super(DbS.A0z(C72831PLt.class));
        C51972G9s.A1D(ocu, oky);
        this.A01 = userSession;
        this.A04 = pm4;
        this.A03 = ocu;
        this.A02 = oky;
        this.A00 = activity;
        pm4.A00 = new C70512O9l(this);
    }
}
