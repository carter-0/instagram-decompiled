package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nee  reason: case insensitive filesystem */
public final class C69099Nee extends C71135OdY {
    public C68285N8y A00;
    public final Context A01;
    public final UserSession A02;
    public final OKY A03;
    public final C71111Ocu A04;
    public final PMH A05;
    public final AnonymousClass0eM A06 = C73922Pm2.A01(this, 10);
    public final C62320sa A07;
    public final C62320sa A08;
    public final C62320sa A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69099Nee(Context context, UserSession userSession, OKY oky, C71111Ocu ocu, PMH pmh, C62320sa r12, C62320sa r13, C62320sa r14) {
        super(DbS.A0z(C68285N8y.class));
        0qQ.A0B(ocu, 4);
        AnonymousClass7TG.A1S(r12, oky);
        this.A01 = context;
        this.A02 = userSession;
        this.A05 = pmh;
        this.A04 = ocu;
        this.A08 = r12;
        this.A03 = oky;
        this.A07 = r13;
        this.A09 = r14;
        A0J(new C68292N9f(false, false, false, false, false));
        this.A05.A00 = new OK6(this);
    }

    public static final boolean A00(C69099Nee nee, float f) {
        if (!182.A06(0Tu.A05, nee.A02, 36314919150816153L) || ((double) f) >= 1.0d - C66580MXl.A0r(nee.A06).doubleValue() || JTR.A0H(nee.A07) != JTR.A0H(nee.A09)) {
            return false;
        }
        nee.A04.A05(C72889PNz.A00);
        return true;
    }
}
