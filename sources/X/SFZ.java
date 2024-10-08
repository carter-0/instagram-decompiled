package X;

import com.fbpay.ptt.impl.javacpp.ServerCertsVerifierImpl;
import java.util.Map;

public final class SFZ {
    public static final SJB A06 = new SJB();
    public final 2FO A00;
    public final AnonymousClass5A3 A01;
    public final C10490Rt5 A02;
    public final Map A03;
    public final AnonymousClass0eK A04;
    public final boolean A05;

    public SFZ(2FO r9, AnonymousClass5A3 r10, C10490Rt5 rt5, boolean z) {
        C13182TOo tOo = new C13182TOo(4);
        Map A0w = Pxf.A0w();
        this.A03 = A0w;
        this.A02 = rt5;
        this.A01 = r10;
        this.A04 = tOo;
        this.A05 = z;
        SJB sjb = A06;
        ServerCertsVerifierImpl serverCertsVerifierImpl = (ServerCertsVerifierImpl) tOo.get();
        2FO r2 = r9;
        A0w.put(sjb, new C8283QnP(r2, sjb, serverCertsVerifierImpl, r10, rt5, z));
        this.A00 = r9;
    }
}
