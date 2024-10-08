package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.SmU  reason: case insensitive filesystem */
public final class C12075SmU implements C66498MUb {
    public final C10203RoJ A00;
    public final Map A01 = AnonymousClass7TE.A1E();

    public final void AGB(C66373MPe mPe) {
        0qQ.A0B(mPe, 0);
        STJ stj = ((C12074SmT) mPe).A03;
        if (stj.A09 == null) {
            stj.A09 = null;
            stj.A0A = null;
            stj.A0B = null;
            stj.A02.D0e();
            return;
        }
        S1R s1r = stj.A07;
        RVG rvg = stj.A09;
        if (rvg != null) {
            AnonymousClass1TA r0 = (AnonymousClass1TA) s1r.A01.get(rvg);
            if (r0 != null) {
                r0.cancel();
            }
            Object obj = stj.A08;
            synchronized (obj) {
                obj.notifyAll();
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final C66373MPe Ewf(C11224SFy sFy, C11420SSw sSw, C13816Thj thj) {
        String str;
        AnonymousClass7TF.A1H(sSw, sFy);
        String str2 = sSw.A03;
        if ((str2 == null || str2.length() == 0) && ((str = sFy.A08) == null || str.length() == 0)) {
            throw new C8989RKf((Exception) null, "Empty file key", Collections.emptyMap(), 0, 0, false);
        }
        C12076SmV smV = new C12076SmV(this);
        ArrayList A14 = DbV.A14(smV);
        if (thj != null) {
            A14.add(thj);
        }
        C12074SmT smT = new C12074SmT(new STJ(sFy, sSw, new C12079SmY(A14), this.A00.A00));
        this.A01.put(smV, smT);
        STJ stj = smT.A03;
        stj.A02.onStart();
        C11224SFy sFy2 = stj.A04;
        C10543Rtx rtx = sFy2.A07;
        rtx.A01 = 0;
        rtx.A00 = rtx.A02.A02;
        if (sFy2.A0C) {
            STJ.A01(stj);
            return smT;
        }
        STJ.A02(stj, sFy2.A01, false);
        return smT;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0013, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C11286SJe FNE(X.C66373MPe r3) {
        /*
            r2 = this;
            r0 = 0
            X.0qQ.A0B(r3, r0)
        L_0x0004:
            r1 = r3
            X.SmT r1 = (X.C12074SmT) r1
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0018
            monitor-enter(r3)
            r3.wait()     // Catch:{ InterruptedException -> 0x0010 }
            goto L_0x0013
        L_0x0010:
            X.Pxe.A1F()     // Catch:{ all -> 0x0015 }
        L_0x0013:
            monitor-exit(r3)
            goto L_0x0004
        L_0x0015:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0018:
            X.RKf r0 = r1.A00
            if (r0 != 0) goto L_0x0025
            X.SJe r0 = r1.A01
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
        L_0x0025:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12075SmU.FNE(X.MPe):X.SJe");
    }

    public C12075SmU(S1R s1r) {
        this.A00 = new C10203RoJ(s1r);
    }

    public static final void A00(C12076SmV smV, C12075SmU smU, C8989RKf rKf) {
        Map map = smU.A01;
        C12074SmT smT = (C12074SmT) map.get(smV);
        if (smT != null) {
            smT.A01 = null;
            smT.A00 = rKf;
            smT.A02 = true;
            synchronized (smT) {
                smT.notify();
            }
            map.remove(smV);
        }
    }
}
