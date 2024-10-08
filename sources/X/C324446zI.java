package X;

import android.view.View;

/* renamed from: X.6zI  reason: invalid class name and case insensitive filesystem */
public final class C324446zI extends C232922uf {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C324436zH A02;

    public C324446zI(View view, View view2, C324436zH r3) {
        this.A01 = view;
        this.A00 = view2;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        if (r0.doubleValue() != 1.0d) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DmC(X.2cs r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0017
            X.2ct r0 = r6.A09
            double r0 = r0.A00
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r0 == 0) goto L_0x0017
            double r1 = r0.doubleValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            android.view.View r1 = r5.A01
            r0 = 4
            if (r2 == 0) goto L_0x001e
            r0 = 0
        L_0x001e:
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C324446zI.DmC(X.2cs):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        if (r1 != 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DmD(X.2cs r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x001a
            double r0 = r7.A01
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r0 == 0) goto L_0x0015
            double r2 = r0.doubleValue()
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 1
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r0 = r0 ^ 1
            r7.A06 = r0
        L_0x001a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C324446zI.DmD(X.2cs):void");
    }

    public final void DmE(2cs r6) {
        if (r6 != null) {
            double d = r6.A09.A00;
            this.A01.setAlpha((float) d);
            View view = this.A00;
            float f = (float) ((d * ((double) (1.0f - 0.8f))) + 0.800000011920929d);
            view.setScaleX(Math.signum(view.getScaleX()) * f);
            view.setScaleY(Math.signum(view.getScaleY()) * f);
        }
        this.A01.setVisibility(0);
    }
}
