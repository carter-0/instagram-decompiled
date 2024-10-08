package X;

/* renamed from: X.TCi  reason: case insensitive filesystem */
public final class C12894TCi implements Runnable {
    public final /* synthetic */ C12061Slo A00;

    public C12894TCi(C12061Slo slo) {
        this.A00 = slo;
    }

    public final void run() {
        C12061Slo slo = this.A00;
        if (!slo.A03()) {
            slo.A03++;
            C12061Slo.A00(slo);
        }
        C13580Td6 td6 = (C13580Td6) slo.A0P.get();
        if (td6 != null) {
            td6.Dmu(slo.A02());
        }
        Q7t q7t = slo.A09;
        if (q7t != null) {
            q7t.A00 = true;
        }
    }
}
