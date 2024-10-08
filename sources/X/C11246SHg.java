package X;

import com.fbpay.ptt.impl.javacpp.PttImpl;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.SHg  reason: case insensitive filesystem */
public final class C11246SHg {
    public final C13619Tdl A00;
    public final Executor A01;
    public final 2FO A02;
    public final C13738TgA A03;
    public final C13618Tdk A04;
    public final C10784Ry5 A05;

    public static void A00(C13617Tdj tdj, C11246SHg sHg, PttImpl pttImpl, Map map, Executor executor) {
        C13617Tdj tdj2 = tdj;
        C11246SHg sHg2 = sHg;
        try {
            String createPtt = pttImpl.createPtt(JTQ.A0c(map));
            C13618Tdk tdk = sHg.A04;
            createPtt.getClass();
            tdk.ATK(new C10699Rwd(tdj2, sHg, pttImpl, executor), createPtt);
        } catch (IllegalArgumentException e) {
            executor.execute(new TKG(tdj2, sHg2, (Object) null, (String) null, e));
        }
    }

    public final void A01(C13617Tdj tdj, Object obj, String str, Set set, Executor executor) {
        2Fk Bsc = this.A03.Bsc(this.A05);
        Executor executor2 = executor;
        Bsc.A09(new C11645Sdn(obj, executor2, set, Bsc, this, tdj, str, 1));
    }

    public C11246SHg(2FO r1, C13738TgA tgA, C13618Tdk tdk, C10784Ry5 ry5, C13619Tdl tdl, Executor executor) {
        this.A00 = tdl;
        this.A04 = tdk;
        this.A01 = executor;
        this.A03 = tgA;
        this.A05 = ry5;
        this.A02 = r1;
    }
}
