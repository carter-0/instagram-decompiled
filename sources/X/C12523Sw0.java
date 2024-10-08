package X;

import java.util.HashMap;

/* renamed from: X.Sw0  reason: case insensitive filesystem */
public final class C12523Sw0 implements C13625Tdr {
    public final S5K A00;
    public final C13624Tdq A01;
    public final C9144RQv A02;
    public final C13455Tai A03;
    public final String A04;

    public final void ELI(RLp rLp) {
        Sw2 sw2 = new Sw2();
        C13455Tai tai = this.A03;
        C9144RQv rQv = this.A02;
        String str = this.A04;
        C13624Tdq tdq = this.A01;
        S5K s5k = this.A00;
        if ("".isEmpty()) {
            Sw4 sw4 = (Sw4) tai;
            C13457Tak tak = sw4.A00;
            C8302Qni qni = (C8302Qni) rLp;
            RE0 re0 = qni.A00;
            C8311Qnr qnr = (C8311Qnr) rQv;
            String str2 = qnr.A01;
            if (str2 == null) {
                throw AnonymousClass7TE.A11("Null backendName");
            } else if (re0 != null) {
                C8311Qnr A002 = C9689Rf7.A00(re0, str2, qnr.A02);
                HashMap A1E = AnonymousClass7TE.A1E();
                Sw8 sw8 = (Sw8) tak;
                sw8.A04.execute(new C13061TJr(sw2, C9688Rf6.A00(new C11011S5i(s5k, tdq.ABs(qni.A01)), (Integer) null, Long.valueOf(sw4.A02.C7E()), Long.valueOf(sw4.A03.C7E()), str, A1E), A002, sw8));
            } else {
                throw AnonymousClass7TE.A11("Null priority");
            }
        } else {
            throw DbW.A0c("Missing required properties:", "");
        }
    }

    public C12523Sw0(S5K s5k, C13624Tdq tdq, C9144RQv rQv, C13455Tai tai, String str) {
        this.A02 = rQv;
        this.A04 = str;
        this.A00 = s5k;
        this.A01 = tdq;
        this.A03 = tai;
    }
}
