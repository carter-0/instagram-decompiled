package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5SM  reason: invalid class name */
public abstract class AnonymousClass5SM {
    public AnonymousClass5SK A00;
    public boolean A01 = true;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final AnonymousClass5SK A07;
    public final Map A08 = new HashMap();

    public static final void A00(C292215ia r4, AnonymousClass5SM r5, C268054cg r6, int i) {
        long A002;
        float A012;
        loop0:
        while (true) {
            float f = (float) i;
            A002 = C289325dP.A00(f, f);
            do {
                A002 = r5.A02(r6, A002);
                r6 = r6.A07;
                0qQ.A0A(r6);
                if (0qQ.A0K(r6, r5.A07.BHL())) {
                    break loop0;
                }
            } while (!r5.A03(r6).containsKey(r4));
            i = r5.A01(r4, r6);
        }
        if (r4 instanceof C292205iZ) {
            A012 = C289295dM.A02(A002);
        } else {
            A012 = C289295dM.A01(A002);
        }
        int round = Math.round(A012);
        Map map = r5.A08;
        if (map.containsKey(r4)) {
            round = ((Number) r4.A00.invoke(Integer.valueOf(((Number) 0k2.A0I(r4, map)).intValue()), Integer.valueOf(round))).intValue();
        }
        map.put(r4, Integer.valueOf(round));
    }

    public final void A04() {
        this.A01 = true;
        AnonymousClass5SK r2 = this.A07;
        AnonymousClass5SK BaU = r2.BaU();
        if (BaU != null) {
            if (this.A06) {
                BaU.EHV();
            } else if (this.A02 || this.A05) {
                BaU.requestLayout();
            }
            if (this.A04) {
                r2.EHV();
            }
            if (this.A03) {
                r2.requestLayout();
            }
            BaU.Aal().A04();
        }
    }

    public long A02(C268054cg r3, long j) {
        AnonymousClass5S3 r0 = C268054cg.A0L;
        return r3.A0W(j);
    }

    public final void A05() {
        Map map = this.A08;
        map.clear();
        AnonymousClass5SK r2 = this.A07;
        r2.AWC(new J6M(this, 35));
        map.putAll(A03(r2.BHL()));
        this.A01 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        if (r1.A03 == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0068, code lost:
        r0 = r0.Aal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r3.A03 != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06() {
        /*
            r3 = this;
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x0011
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0011
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0011
            boolean r1 = r3.A03
            r0 = 0
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            X.5SK r2 = r3.A07
            if (r0 != 0) goto L_0x0038
            X.5SK r0 = r2.BaU()
            if (r0 == 0) goto L_0x003a
            X.5SM r0 = r0.Aal()
            X.5SK r2 = r0.A00
            if (r2 == 0) goto L_0x003b
            X.5SM r1 = r2.Aal()
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x0038
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0038
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x0038
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x003b
        L_0x0038:
            r3.A00 = r2
        L_0x003a:
            return
        L_0x003b:
            X.5SK r2 = r3.A00
            if (r2 == 0) goto L_0x003a
            X.5SM r1 = r2.Aal()
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x003a
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x003a
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x003a
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x003a
            X.5SK r0 = r2.BaU()
            if (r0 == 0) goto L_0x0062
            X.5SM r0 = r0.Aal()
            if (r0 == 0) goto L_0x0062
            r0.A06()
        L_0x0062:
            X.5SK r0 = r2.BaU()
            if (r0 == 0) goto L_0x0071
            X.5SM r0 = r0.Aal()
            if (r0 == 0) goto L_0x0071
            X.5SK r2 = r0.A00
            goto L_0x0038
        L_0x0071:
            r2 = 0
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5SM.A06():void");
    }

    public AnonymousClass5SM(AnonymousClass5SK r2) {
        this.A07 = r2;
    }

    public int A01(C292215ia r2, C268054cg r3) {
        return r3.AWx(r2);
    }

    public Map A03(C268054cg r2) {
        return r2.A0N().Aam();
    }
}
