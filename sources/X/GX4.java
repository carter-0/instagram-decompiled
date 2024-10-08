package X;

import java.util.List;

public abstract class GX4 implements XBx, XBt {
    public final List A00 = AnonymousClass7TE.A1C();

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0107, code lost:
        if (r2 != null) goto L_0x0109;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Iterator A03() {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.GWW
            if (r0 == 0) goto L_0x0061
            r2 = r7
            X.GWW r2 = (X.GWW) r2
            X.GWV r3 = r2.A01
            X.2sQ r5 = r2.A02
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.util.List r0 = r3.A03
            java.util.Iterator r6 = r0.iterator()
            r4 = 0
        L_0x0016:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x003a
            java.lang.Object r0 = r6.next()
            X.5r0 r0 = (X.C297005r0) r0
            java.util.List r0 = r0.A02
            java.util.Iterator r1 = r0.iterator()
        L_0x0028:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()
            boolean r0 = r5.Esp(r0)
            if (r0 != 0) goto L_0x0028
            r4 = 1
            goto L_0x0016
        L_0x003a:
            if (r4 == 0) goto L_0x0052
            java.util.List r0 = r3.A03
            java.util.List r1 = X.00k.A0a(r0)
            java.util.List r0 = r3.A03
            r0.clear()
            java.util.Set r0 = r3.A05
            r0.clear()
            X.GWV.A00(r3)
            r3.A06(r5, r1)
        L_0x0052:
            java.util.List r0 = r3.A02
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x00f3
            java.util.List r0 = r3.A02
            java.util.Iterator r0 = r0.iterator()
            return r0
        L_0x0061:
            boolean r0 = r7 instanceof X.HAH
            if (r0 == 0) goto L_0x0079
            r1 = r7
            X.HAH r1 = (X.HAH) r1
            X.Ik1 r0 = r1.A00
            java.util.List r1 = r1.A02
            java.util.Iterator r1 = r1.iterator()
            r0.A01 = r1
            X.5qt r1 = r0.A00()
            r0.A00 = r1
            return r0
        L_0x0079:
            r4 = r7
            X.HAI r4 = (X.HAI) r4
            X.Uz8 r0 = r4.A00
            X.GWV r0 = X.HAI.A00(r0, r4)
            java.util.List r0 = r0.A02
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x00ca
            X.Uz8 r6 = r4.A00
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            X.HAI.A02(r4, r3)
            X.Uz8 r5 = r4.A00
            java.util.Map r0 = r4.A06
            java.lang.Object r0 = r0.get(r5)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00c0
            java.util.Iterator r2 = r0.iterator()
        L_0x00a3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C232262tL
            if (r0 != 0) goto L_0x00bc
            boolean r0 = r1 instanceof X.C298695ts
            if (r0 == 0) goto L_0x00a3
            X.VgA r0 = r4.A01
            X.WSo r1 = new X.WSo
            r1.<init>(r0, r5)
        L_0x00bc:
            r3.add(r1)
            goto L_0x00a3
        L_0x00c0:
            X.GWV r0 = X.HAI.A00(r6, r4)
            java.util.List r0 = r0.A02
            r3.addAll(r0)
            goto L_0x0113
        L_0x00ca:
            X.Uz8 r2 = r4.A00
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            X.HAI.A02(r4, r3)
            X.2ms r1 = r4.A03
            boolean r0 = r1.isLoading()
            if (r0 != 0) goto L_0x0113
            boolean r0 = r1.CT5()
            if (r0 != 0) goto L_0x0118
            java.util.Map r1 = r4.A05
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x00f0
            java.lang.Object r2 = r1.get(r2)
            X.72b r2 = (X.C3253572b) r2
            goto L_0x0109
        L_0x00f0:
            X.72b r2 = r4.A02
            goto L_0x0109
        L_0x00f3:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            X.2ms r1 = r2.A04
            boolean r0 = r1.isLoading()
            if (r0 != 0) goto L_0x0113
            boolean r0 = r1.CT5()
            if (r0 != 0) goto L_0x0118
            X.72b r2 = r2.A03
            if (r2 == 0) goto L_0x0113
        L_0x0109:
            X.6rr r1 = X.C320156rr.EMPTY
        L_0x010b:
            X.NPV r0 = new X.NPV
            r0.<init>(r2, r1)
            r3.add(r0)
        L_0x0113:
            java.util.Iterator r0 = r3.iterator()
            return r0
        L_0x0118:
            X.72b r2 = new X.72b
            r2.<init>()
            X.6rr r1 = X.C320156rr.ERROR
            goto L_0x010b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GX4.A03():java.util.Iterator");
    }

    public final void A04() {
        for (JO5 DvM : this.A00) {
            DvM.DvM();
        }
    }
}
