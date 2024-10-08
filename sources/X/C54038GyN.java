package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GyN  reason: case insensitive filesystem */
public final class C54038GyN extends AnonymousClass5F8 {
    public final UserSession A00;
    public final C309686Zf A01;
    public final JOS A02;
    public final Iterable A03;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            r7 = 1
            java.lang.Iterable r1 = r11.A03
            boolean r0 = r1 instanceof java.util.Collection
            r10 = 0
            if (r0 == 0) goto L_0x001b
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001b
        L_0x0011:
            r1 = 1
        L_0x0012:
            int r0 = r13.getAction()
            if (r0 == 0) goto L_0x006a
            if (r0 == r7) goto L_0x0062
            return r10
        L_0x001b:
            java.util.Iterator r9 = r1.iterator()
        L_0x001f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0011
            java.lang.Object r8 = r9.next()
            X.Hiz r8 = (X.C55517Hiz) r8
            boolean r0 = r8 instanceof X.HDS
            if (r0 == 0) goto L_0x0053
            X.HDS r8 = (X.HDS) r8
            double r3 = r8.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x001f
            r1 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0060
            double r5 = r8.A00
            int r0 = r8.A01
            double r3 = (double) r0
            double r3 = r3 - r5
            float r0 = r13.getX()
        L_0x0049:
            double r1 = (double) r0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0060
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0060
            goto L_0x001f
        L_0x0053:
            X.HDT r8 = (X.HDT) r8
            double r5 = r8.A00
            int r0 = r8.A01
            double r3 = (double) r0
            double r3 = r3 - r5
            float r0 = r13.getRawX()
            goto L_0x0049
        L_0x0060:
            r1 = 0
            goto L_0x0012
        L_0x0062:
            if (r1 == 0) goto L_0x0071
            X.JOS r0 = r11.A02
            r0.D2i(r13)
            return r1
        L_0x006a:
            if (r1 == 0) goto L_0x0071
            X.6Zf r0 = r11.A01
            r0.Ded()
        L_0x0071:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54038GyN.A00(android.view.View, android.view.MotionEvent):boolean");
    }

    public C54038GyN(UserSession userSession, C309686Zf r2, JOS jos, Iterable iterable, boolean z) {
        super(userSession, z);
        this.A01 = r2;
        this.A03 = iterable;
        this.A02 = jos;
        this.A00 = userSession;
    }
}
