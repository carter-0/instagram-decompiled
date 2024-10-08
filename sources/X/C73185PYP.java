package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.PYP  reason: case insensitive filesystem */
public final class C73185PYP implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C70675OFw A01;

    public C73185PYP(C70675OFw oFw, int i) {
        this.A01 = oFw;
        this.A00 = i;
    }

    public final void run() {
        Set set;
        C67458MoD moD = this.A01.A03;
        int i = this.A00;
        0xa r5 = moD.A00;
        String string = r5.getString("EB_WARN_SOFT_BLOCK_INTERVALS_EXHAUSTED", (String) null);
        if (string != null) {
            set = C67458MoD.A02(string);
        } else {
            set = 0sl.A00;
        }
        LinkedHashSet A012 = 094.A01(Integer.valueOf(i), set);
        0xY AR4 = r5.AR4();
        AR4.E5g("EB_WARN_SOFT_BLOCK_INTERVALS_EXHAUSTED", DbT.A0z(",", A012, (0sP) null));
        AR4.apply();
    }
}
