package X;

import android.view.View;

/* renamed from: X.6YA  reason: invalid class name */
public abstract class AnonymousClass6YA {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0050, code lost:
        if (X.00l.A0W(r0) != false) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C317746nl r12, X.C317366n9 r13, X.C316006kx r14, X.C294975nL r15, X.0sP r16, X.0sP r17) {
        /*
            r6 = 0
            X.0qQ.A0B(r13, r6)
            r5 = 1
            X.0qQ.A0B(r12, r5)
            X.9JK r1 = r13.A03
            X.9LS r0 = new X.9LS
            r0.<init>(r14, r6)
            X.0t0 r7 = X.AnonymousClass0eN.A01(r0)
            r4 = 0
            r3 = 8
            if (r1 == 0) goto L_0x00d2
            boolean r0 = r13.A0M
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r13.A0I
            if (r0 != 0) goto L_0x00d2
            X.3oV r0 = r14.A0x
            r0.setVisibility(r3)
            X.3oV r0 = r14.A0y
            r0.setVisibility(r6)
            X.3oV r0 = r14.A0z
            r0.setVisibility(r6)
            boolean r0 = r13.A0G
            r1 = r17
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r2 = r7.getValue()
            X.9Yo r2 = (X.C380539Yo) r2
            android.view.View r8 = r2.A00
            X.0eM r0 = r2.A01
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L_0x0052
            boolean r0 = X.00l.A0W(r0)
            r10 = 0
            if (r0 == 0) goto L_0x0053
        L_0x0052:
            r10 = 1
        L_0x0053:
            r0 = 11
            X.9M1 r7 = new X.9M1
            r7.<init>(r0, r1, r2)
            com.instagram.common.session.UserSession r3 = r12.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 37162672680599803(0x840741000800fb, double:3.5651620730585356E-306)
            double r0 = X.182.A00(r2, r3, r0)
            float r9 = (float) r0
            r2 = 4617315517961601024(0x4014000000000000, double:5.0)
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            if (r10 == 0) goto L_0x0092
            r0 = 0
            X.5nL r1 = A00(r8, r7, r0)
        L_0x0073:
            r0 = r16
            r0.invoke(r1)
        L_0x0078:
            X.6lA r3 = r14.A1e
            X.3oV r2 = r3.A1Y
            boolean r1 = r13.A0K
            r0 = 8
            if (r1 == 0) goto L_0x0083
            r0 = 0
        L_0x0083:
            r2.setVisibility(r0)
            X.3oV r1 = r3.A1Z
            boolean r0 = r13.A0L
            if (r0 != 0) goto L_0x008e
            r4 = 8
        L_0x008e:
            r1.setVisibility(r4)
            return
        L_0x0092:
            X.DJc r10 = X.C46019DJc.A00
            r11 = 1065353216(0x3f800000, float:1.0)
            X.5nL r12 = X.C294975nL.A01(r8, r6)
            X.Lyk r6 = new X.Lyk
            r6.<init>(r8, r11)
            r12.A07 = r6
            r12.A0G()
            X.5nL r5 = r12.A0F(r5)
            X.2co r0 = X.C71392co.A03(r2, r0)
            X.5nL r1 = r5.A0E(r0)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.A0U(r11, r9, r0)
            r1.A0V(r11, r9, r0)
            X.PQG r0 = new X.PQG
            r0.<init>(r10)
            r1.A05 = r0
            X.Ag9 r0 = new X.Ag9
            r0.<init>(r8, r7, r9)
            r1.A05 = r0
            r1.A0H()
            goto L_0x0073
        L_0x00ca:
            java.lang.Object r0 = r7.getValue()
            r1.invoke(r0)
            goto L_0x0078
        L_0x00d2:
            boolean r2 = r13.A0I
            X.3oV r1 = r14.A0z
            r1.setVisibility(r3)
            X.3oV r0 = r14.A0x
            if (r2 == 0) goto L_0x00e6
            r0.setVisibility(r6)
            X.3oV r0 = r14.A0y
            r0.setVisibility(r6)
            goto L_0x0078
        L_0x00e6:
            r0.setVisibility(r3)
            X.3oV r0 = r14.A0y
            r0.setVisibility(r3)
            boolean r0 = r1.CVM()
            if (r0 == 0) goto L_0x0112
            java.lang.Object r0 = r7.getValue()
            X.9Yo r0 = (X.C380539Yo) r0
            android.view.View r0 = r0.A00
            r0.setVisibility(r3)
            java.lang.Object r0 = r7.getValue()
            X.9Yo r0 = (X.C380539Yo) r0
            X.0eM r0 = r0.A01
            java.lang.Object r1 = r0.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = ""
            r1.setText(r0)
        L_0x0112:
            if (r15 == 0) goto L_0x0078
            boolean r0 = r15.A0W()
            if (r0 != r5) goto L_0x0078
            r15.A0G()
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YA.A02(X.6nl, X.6n9, X.6kx, X.5nL, X.0sP, X.0sP):void");
    }

    public static final C294975nL A00(View view, C62320sa r10, float f) {
        r10.invoke();
        C46018DJb dJb = C46018DJb.A00;
        C294975nL A01 = C294975nL.A01(view, 0);
        A01.A07 = new C65730Lyk(view, f);
        A01.A0G();
        C294975nL A0E = A01.A0F(false).A0E(C71392co.A03(5.0d, 10.0d));
        A0E.A0U(f, 1.0f, -1.0f);
        A0E.A0V(f, 1.0f, -1.0f);
        A0E.A05 = new PQG(dJb);
        A0E.A0H();
        return A0E;
    }

    public static final void A01(C252063oV r1, 0sP r2) {
        if (r1.CVM()) {
            r2.invoke(r1.getView());
        } else {
            r1.EeU(new C308446Uh(r2));
        }
    }
}
