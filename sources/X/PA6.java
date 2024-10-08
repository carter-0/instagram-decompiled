package X;

import android.view.MotionEvent;

public final class PA6 implements C328107Dl {
    public final /* synthetic */ AnonymousClass7DS A00;
    public final /* synthetic */ AnonymousClass7DU A01;
    public final /* synthetic */ O86 A02;
    public final /* synthetic */ Object A03;

    public final boolean DRb(MotionEvent motionEvent, Object obj) {
        0qQ.A0B(motionEvent, 1);
        return this.A00.DRa(motionEvent, obj, this.A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        if (r1 == 0) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DRg(android.view.MotionEvent r9, java.lang.Object r10, boolean r11) {
        /*
            r8 = this;
            r0 = 1
            X.0qQ.A0B(r9, r0)
            X.O86 r2 = r8.A02
            java.lang.Object r1 = r8.A03
            X.OuB r10 = (X.C71979OuB) r10
            X.3kE r1 = (X.C249703kE) r1
            X.Dba.A0j(r0, r10, r1)
            boolean r0 = r10.A0E
            if (r0 != 0) goto L_0x0046
            com.instagram.user.model.User r5 = r10.A03
            if (r5 == 0) goto L_0x0046
            X.OE1 r0 = r2.A00
            X.Mtw r2 = r0.A02
            android.view.View r4 = X.JTO.A0F(r1)
            float r1 = r9.getX()
            float r0 = r9.getY()
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>(r1, r0)
            java.lang.String r6 = r10.A06
            java.lang.String r0 = r10.A07
            if (r0 == 0) goto L_0x0039
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            r7 = r0 ^ 1
            X.05G r0 = r2.A07
            X.N8f r2 = new X.N8f
            r2.<init>(r3, r4, r5, r6, r7)
            r0.Epw(r2)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PA6.DRg(android.view.MotionEvent, java.lang.Object, boolean):void");
    }

    public final boolean DsN(MotionEvent motionEvent, Object obj) {
        return false;
    }

    public PA6(AnonymousClass7DS r1, AnonymousClass7DU r2, O86 o86, Object obj) {
        this.A00 = r1;
        this.A03 = obj;
        this.A01 = r2;
        this.A02 = o86;
    }

    public final boolean DA7(Object obj) {
        return this.A01.DA8(obj, this.A03);
    }
}
