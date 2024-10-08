package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2zZ  reason: invalid class name */
public final class AnonymousClass2zZ implements C250603lj {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final C235222zY A03;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0092, code lost:
        if (r6 != false) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r18, X.C252093oY r19) {
        /*
            r17 = this;
            r6 = 0
            r1 = r18
            X.0qQ.A0B(r1, r6)
            r3 = 1
            r7 = r19
            X.0qQ.A0B(r7, r3)
            java.lang.Object r13 = r1.A03
            X.1Xj r13 = (X.1Xj) r13
            java.lang.String r4 = r13.getId()
            if (r4 == 0) goto L_0x011b
            r2 = r17
            X.2zY r5 = r2.A03
            java.util.Map r0 = r5.A00
            java.lang.Object r10 = r0.get(r4)
            android.view.View r10 = (android.view.View) r10
            if (r10 == 0) goto L_0x011b
            boolean r9 = r13.A5D()
            java.lang.Integer r0 = r7.CEk(r1)
            int r0 = r0.intValue()
            if (r0 == r6) goto L_0x006f
            if (r0 == r3) goto L_0x006f
            r5.A00(r4)
            java.util.Map r5 = r5.A01
            java.lang.Object r0 = r5.get(r4)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0056
            java.util.Iterator r3 = r0.iterator()
        L_0x0045:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r2 = r3.next()
            android.view.View r2 = (android.view.View) r2
            r0 = 0
            r2.setTouchDelegate(r0)
            goto L_0x0045
        L_0x0056:
            r5.remove(r4)
            java.lang.Object r2 = r1.A04
            X.0qQ.A06(r2)
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            X.0qQ.A0B(r2, r6)
            r1 = 0
            java.lang.Integer r0 = r2.A12
            if (r0 == 0) goto L_0x011b
            java.lang.Integer r0 = r2.A11
            if (r0 == r1) goto L_0x011b
            r2.A11 = r1
            return
        L_0x006f:
            boolean r0 = r13.A5H()
            if (r0 != 0) goto L_0x00cf
            java.lang.String r15 = "cta_extension_tap_on_media"
            java.util.Map r8 = r5.A02
            boolean r0 = r8.containsKey(r4)
            if (r0 != 0) goto L_0x00cf
            X.3Xb r6 = X.C243013Xb.A00
            r0 = -1
            android.view.View r7 = X.C243013Xb.A00(r10, r0)
            if (r7 == 0) goto L_0x00cf
            if (r9 == 0) goto L_0x00c7
            java.util.ArrayList r0 = r6.A04(r7)
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L_0x009b
        L_0x0094:
            java.util.List r0 = java.util.Collections.singletonList(r7)
            X.0qQ.A07(r0)
        L_0x009b:
            r8.put(r4, r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x00a2:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r11 = r7.next()
            android.view.View r11 = (android.view.View) r11
            java.lang.Object r14 = r1.A04
            X.0qQ.A06(r14)
            X.3W1 r14 = (X.AnonymousClass3W1) r14
            com.instagram.common.session.UserSession r12 = r2.A01
            android.content.Context r6 = r2.A00
            X.4DU r0 = r2.A02
            java.lang.String r0 = r0.getModuleName()
            int r16 = X.C256073vB.A00(r6, r12, r13, r0, r15)
            X.C243013Xb.A01(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00a2
        L_0x00c7:
            android.view.View r0 = r6.A03(r7)
            if (r0 == 0) goto L_0x0094
            r7 = r0
            goto L_0x0094
        L_0x00cf:
            java.lang.String r15 = "cta_extension_tap_on_ufi"
            java.util.Map r5 = r5.A01
            boolean r0 = r5.containsKey(r4)
            if (r0 != 0) goto L_0x011b
            X.3Xb r0 = X.C243013Xb.A00
            android.view.View r3 = X.C243013Xb.A00(r10, r3)
            if (r3 == 0) goto L_0x011b
            android.view.View r0 = r0.A03(r3)
            if (r0 == 0) goto L_0x00e8
            r3 = r0
        L_0x00e8:
            java.util.List r0 = java.util.Collections.singletonList(r3)
            X.0qQ.A07(r0)
            r5.put(r4, r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x00f6:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x011b
            java.lang.Object r11 = r4.next()
            android.view.View r11 = (android.view.View) r11
            java.lang.Object r14 = r1.A04
            X.0qQ.A06(r14)
            X.3W1 r14 = (X.AnonymousClass3W1) r14
            com.instagram.common.session.UserSession r12 = r2.A01
            android.content.Context r3 = r2.A00
            X.4DU r0 = r2.A02
            java.lang.String r0 = r0.getModuleName()
            int r16 = X.C256073vB.A00(r3, r12, r13, r0, r15)
            X.C243013Xb.A01(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00f6
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2zZ.ATF(X.30Y, X.3oY):void");
    }

    public AnonymousClass2zZ(Context context, UserSession userSession, AnonymousClass4DU r3, C235222zY r4) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = r4;
    }
}
