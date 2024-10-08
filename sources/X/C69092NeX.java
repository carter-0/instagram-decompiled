package X;

import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.NeX  reason: case insensitive filesystem */
public final class C69092NeX extends C71135OdY {
    public N97 A00;
    public final ViewGroup A01;
    public final UserSession A02;
    public final 1Av A03;
    public final OKY A04;
    public final C71111Ocu A05;
    public final O9L A06;
    public final PMA A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69092NeX(ViewGroup viewGroup, UserSession userSession, OKY oky, C71111Ocu ocu, O9L o9l) {
        super(DbS.A0z(N97.class));
        C51972G9s.A1D(ocu, oky);
        this.A01 = viewGroup;
        this.A02 = userSession;
        this.A05 = ocu;
        this.A04 = oky;
        this.A06 = o9l;
        this.A07 = new PMA(viewGroup, new OA8(this));
        this.A03 = 1Au.A00(userSession);
    }
}
