package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;

@Deprecated(message = "Keep in sync with AggregatingRulesEnforcerKt which is the Kotlin equivalent of this class, which is being AB tested. If adding a usage of this class, you should also use AggregatingRulesEnforcerKt depending on A/B test state.")
/* renamed from: X.2vx  reason: invalid class name and case insensitive filesystem */
public final class C233582vx implements C233432vi {
    public final List A00;
    public final List A01;
    public final Set A02 = new LinkedHashSet();

    public static boolean A00(double d, double d2) {
        return d == -1.0d && d2 != -1.0d;
    }

    public final void ATF(AnonymousClass30Y r1, C252093oY r2) {
    }

    public final String B4s() {
        return "";
    }

    public final void CJE(C376459Ib r1, List list) {
    }

    public final void EIs(1PW r1) {
    }

    public final void A7t(C233602vz r2) {
        if (r2 != null) {
            this.A02.add(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00db, code lost:
        if (r5.A0G != false) goto L_0x00dd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.1PW AGd(java.util.List r10) {
        /*
            r9 = this;
            java.util.List r1 = r9.A01
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x000b
            X.1PW r4 = X.1PW.A0K
        L_0x000a:
            return r4
        L_0x000b:
            java.lang.Integer r6 = X.AnonymousClass05K.A0N
            X.1PW r4 = new X.1PW
            r4.<init>(r6)
            java.util.Iterator r8 = r1.iterator()
        L_0x0016:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x000a
            java.lang.Object r0 = r8.next()
            X.2vi r0 = (X.C233432vi) r0
            X.1PW r5 = r0.AGd(r10)
            java.lang.Integer r0 = r5.A0C
            if (r0 != r6) goto L_0x0016
            java.util.List r0 = r4.A00()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0060
            java.util.List r0 = r5.A00()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0060
            java.util.List r0 = r5.A00()
            java.util.Iterator r2 = r0.iterator()
        L_0x0046:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0060
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.List r0 = r4.A00()
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0046
            r4.A01(r1)
            goto L_0x0046
        L_0x0060:
            int r0 = r4.A01
            double r2 = (double) r0
            int r7 = r5.A01
            double r0 = (double) r7
            boolean r0 = A00(r2, r0)
            if (r0 == 0) goto L_0x006e
            r4.A01 = r7
        L_0x006e:
            int r0 = r4.A04
            double r2 = (double) r0
            int r7 = r5.A04
            double r0 = (double) r7
            boolean r0 = A00(r2, r0)
            if (r0 == 0) goto L_0x007c
            r4.A04 = r7
        L_0x007c:
            int r0 = r4.A02
            double r2 = (double) r0
            int r7 = r5.A02
            double r0 = (double) r7
            boolean r0 = A00(r2, r0)
            if (r0 == 0) goto L_0x008a
            r4.A02 = r7
        L_0x008a:
            double r2 = r4.A00
            double r0 = r5.A00
            boolean r2 = A00(r2, r0)
            if (r2 == 0) goto L_0x0096
            r4.A00 = r0
        L_0x0096:
            int r0 = r4.A03
            double r2 = (double) r0
            int r7 = r5.A03
            double r0 = (double) r7
            boolean r0 = A00(r2, r0)
            if (r0 == 0) goto L_0x00a4
            r4.A03 = r7
        L_0x00a4:
            int r0 = r4.A09
            double r2 = (double) r0
            int r7 = r5.A09
            double r0 = (double) r7
            boolean r0 = A00(r2, r0)
            if (r0 == 0) goto L_0x00b2
            r4.A09 = r7
        L_0x00b2:
            int r0 = r4.A0A
            double r2 = (double) r0
            int r7 = r5.A0A
            double r0 = (double) r7
            boolean r0 = A00(r2, r0)
            if (r0 == 0) goto L_0x00c0
            r4.A0A = r7
        L_0x00c0:
            java.lang.String r0 = r4.A0D
            java.lang.String r1 = r5.A0D
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00d4
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00d4
            java.lang.String r0 = r5.A0D
            r4.A0D = r0
        L_0x00d4:
            boolean r0 = r4.A0G
            if (r0 != 0) goto L_0x00dd
            boolean r1 = r5.A0G
            r0 = 0
            if (r1 == 0) goto L_0x00de
        L_0x00dd:
            r0 = 1
        L_0x00de:
            r4.A0G = r0
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233582vx.AGd(java.util.List):X.1PW");
    }

    public final C233612w1 AMC() {
        return new C233882wd(this);
    }

    public final AnonymousClass4lJ AN3() {
        return new C272734lI(this);
    }

    public final Set Bsw() {
        return new HashSet();
    }

    public final void CNn() {
        for (C233432vi CNn : this.A01) {
            CNn.CNn();
        }
    }

    public final void Crm(int i) {
        for (C233432vi Crm : this.A01) {
            Crm.Crm(i);
        }
    }

    public final void Crv(int i) {
        for (C233432vi Crv : this.A01) {
            Crv.Crv(i);
        }
    }

    public final void Dpb() {
        for (C233432vi Dpb : this.A01) {
            Dpb.Dpb();
        }
    }

    public final void Dpe() {
        for (C233432vi Dpe : this.A01) {
            Dpe.Dpe();
        }
    }

    public final void Dpg(String str) {
        for (C233432vi Dpg : this.A01) {
            Dpg.Dpg(str);
        }
    }

    public final void Dpk() {
        for (C233432vi Dpk : this.A01) {
            Dpk.Dpk();
        }
    }

    public final void EBI() {
        for (C233432vi EBI : this.A01) {
            EBI.EBI();
        }
    }

    public final void EDQ(C233602vz r2) {
        this.A02.remove(r2);
    }

    public final void EIr() {
        for (C233432vi EIr : this.A01) {
            EIr.EIr();
        }
    }

    public final void EO6(C233452vk r3) {
        for (C233432vi EO6 : this.A01) {
            EO6.EO6(r3);
        }
    }

    public C233582vx(List list) {
        this.A01 = list;
        this.A00 = new ArrayList();
        C233592vy r4 = new C233592vy(this);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C233432vi r2 = (C233432vi) it.next();
            this.A00.add(r2.AMC());
            r2.A7t(r4);
        }
    }
}
