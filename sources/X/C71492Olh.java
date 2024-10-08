package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Olh  reason: case insensitive filesystem */
public final class C71492Olh implements AnonymousClass03Q {
    public final int A00;
    public final Object A01;

    public C71492Olh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
        if (r2 != null) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
        X.0nA.A0e(r2, r3.A03);
        X.0nA.A0T(r2, r3.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a0, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.04k Cvn(android.view.View r5, X.04k r6) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x007b;
                case 1: goto L_0x0054;
                case 2: goto L_0x0016;
                case 3: goto L_0x001f;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1
            X.0qQ.A0B(r6, r0)
            java.lang.Object r2 = r4.A01
            android.view.View r2 = (android.view.View) r2
            int r1 = r6.A02()
            r0 = 0
            r2.setPadding(r0, r0, r0, r1)
        L_0x0015:
            return r6
        L_0x0016:
            X.02M r3 = X.C66583MXo.A0F(r6)
            java.lang.Object r2 = r4.A01
            android.view.View r2 = (android.view.View) r2
            goto L_0x0096
        L_0x001f:
            X.AnonymousClass7TG.A1N(r5, r6)
            java.lang.Object r0 = r4.A01
            com.instagram.rtc.activity.RtcCallActivity r0 = (com.instagram.rtc.activity.RtcCallActivity) r0
            X.ONx r1 = r0.A02
            if (r1 != 0) goto L_0x0034
            java.lang.String r0 = "presenterBridge"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0034:
            X.04h r0 = r6.A00
            X.02M r0 = r0.A03()
            int r3 = r0.A03
            int r2 = r6.A02()
            X.Ocu r1 = r1.A04
            X.PNR r0 = new X.PNR
            r0.<init>(r3, r2)
            r1.A05(r0)
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0015
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r4.A00(r5, r6)
            return r6
        L_0x0054:
            X.02M r3 = X.C66583MXo.A0F(r6)
            java.lang.Object r2 = r4.A01
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 == 0) goto L_0x0015
            r0 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            android.view.View r1 = r2.findViewById(r0)
            if (r1 == 0) goto L_0x0071
            int r0 = r3.A03
            X.0nA.A0e(r1, r0)
            int r0 = r3.A00
            X.0nA.A0T(r1, r0)
        L_0x0071:
            r0 = 2131427520(0x7f0b00c0, float:1.8476659E38)
            android.view.View r2 = r2.findViewById(r0)
            if (r2 == 0) goto L_0x0015
            goto L_0x0096
        L_0x007b:
            r0 = 1
            X.0qQ.A0B(r6, r0)
            java.lang.Object r1 = r4.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2131435212(0x7f0b1ecc, float:1.849226E38)
            android.view.View r2 = r1.findViewById(r0)
            if (r2 == 0) goto L_0x0015
            r1 = 7
            X.04h r0 = r6.A00
            X.02M r3 = r0.A05(r1)
            X.0qQ.A07(r3)
        L_0x0096:
            int r0 = r3.A03
            X.0nA.A0e(r2, r0)
            int r0 = r3.A00
            X.0nA.A0T(r2, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71492Olh.Cvn(android.view.View, X.04k):X.04k");
    }

    public final void A00(ViewGroup viewGroup, 04k r6) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getFitsSystemWindows()) {
                03v.A05(childAt, r6);
            }
            if (childAt instanceof ViewGroup) {
                A00((ViewGroup) childAt, r6);
            }
        }
    }
}
