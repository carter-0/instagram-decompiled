package X;

import com.fbpay.ptt.impl.javacpp.ServerCertsVerifierImpl;
import java.util.Map;
import java.util.concurrent.Executor;

public final class SOC {
    public final 2FO A00;
    public final SSZ A01;
    public final SFZ A02;
    public final AnonymousClass5A3 A03;

    public final C11246SHg A02(C13618Tdk tdk, C10784Ry5 ry5, C13619Tdl tdl) {
        SFZ sfz = this.A02;
        SJB sjb = new SJB(ry5.A01, ry5.A02, ry5.A03, ry5.A05, ry5.A04, (String) null);
        Map map = sfz.A03;
        if (!map.containsKey(sjb)) {
            C13738TgA tgA = (C13738TgA) map.get(sjb);
            if (tgA == null) {
                C10490Rt5 rt5 = sfz.A02;
                AnonymousClass5A3 r10 = sfz.A01;
                boolean z = sfz.A05;
                tgA = new C8283QnP(sfz.A00, sjb, (ServerCertsVerifierImpl) sfz.A04.get(), r10, rt5, z);
                map.put(sjb, tgA);
            }
            tgA.AWF(sjb);
        }
        Executor executor = this.A03.A00.A02;
        return new C11246SHg(this.A00, (C13738TgA) Pxe.A0r(sjb, map), tdk, ry5, tdl, executor);
    }

    public SOC(2FO r2, SSZ ssz, AnonymousClass5A3 r4, C10490Rt5 rt5, boolean z) {
        this.A03 = r4;
        this.A02 = new SFZ(r2, r4, rt5, z);
        this.A01 = ssz;
        this.A00 = r2;
    }

    public static SSZ A00() {
        SOC A04 = AnonymousClass2E0.A04();
        0qQ.A07(A04);
        return A04.A01;
    }

    public static SSZ A01() {
        return AnonymousClass2E0.A04().A01;
    }
}
