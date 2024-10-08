package X;

import android.app.Application;
import com.google.common.util.concurrent.MoreExecutors;
import com.instagram.common.session.UserSession;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Jfn  reason: case insensitive filesystem */
public final class C60107Jfn extends C361478gI {
    public C63573KzM A00;
    public ZLu A01;
    public final C64103LMx A02;
    public final C258483z9 A03 = MoreExecutors.listeningDecorator((ExecutorService) new 0na(643412514, 3, false, true));
    public final UserSession A04;
    public final AnonymousClass0eM A05 = MMR.A00(this, 8);
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(MKQ.A00);
    public final Q1Q A07;
    public final AnonymousClass0eM A08 = MMR.A00(this, 7);
    public final AnonymousClass0eM A09 = MMR.A00(this, 9);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60107Jfn(Application application, UserSession userSession) {
        super(application);
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        Q1Q q1q = new Q1Q(userSession);
        this.A07 = q1q;
        this.A02 = new C64103LMx(new LMP(q1q, AnonymousClass05K.A0u, AnonymousClass7TG.A0j()));
    }

    public static final void A02(C60107Jfn jfn, AnonymousClass51M r14, 0sP r15, 0sP r16, 0sL r17, int i) {
        int i2 = r14.A09;
        int i3 = r14.A08;
        float abs = Math.abs(r14.A00);
        C60107Jfn jfn2 = jfn;
        C64103LMx lMx = jfn.A02;
        C62516Kh7 kh7 = C62516Kh7.JUMPCUT;
        ZLs zLs = new ZLs(r14.A0F.A0F);
        C63875LAe lAe = new C63875LAe(jfn2, r15, r16, r17, abs, i, i2, i3);
        long nanoTime = System.nanoTime();
        Object obj = lMx.A01.get(kh7);
        if (obj != null) {
            C66497MUa AMM = ((MRS) obj).AMM();
            C63573KzM kzM = new C63573KzM(zLs);
            lMx.A02.put(kzM, AMM);
            lMx.A03.execute(new MA8(zLs, AMM, lMx, kzM, lAe, DbY.A0m("type_name", kh7.toString()), nanoTime));
            jfn2.A00 = kzM;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
