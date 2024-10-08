package X;

import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.PHc  reason: case insensitive filesystem */
public final class C72722PHc implements G77 {
    public final int A00;
    public final Object A01;

    public C72722PHc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onSearchCleared(String str) {
        switch (this.A00) {
            case 1:
                ((C68482NJz) this.A01).Dhu("");
                return;
            case 2:
                IgdsBottomButtonLayout igdsBottomButtonLayout = ((NJZ) this.A01).A09;
                if (igdsBottomButtonLayout != null) {
                    AnonymousClass7TE.A1U(igdsBottomButtonLayout, true);
                    return;
                }
                return;
            case 4:
                ((OZV) this.A01).A02();
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSearchTextChanged(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0092;
                case 1: goto L_0x0086;
                case 2: goto L_0x001b;
                case 3: goto L_0x006f;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.Object r1 = r6.A01
            X.OZV r1 = (X.OZV) r1
            X.LlB r0 = r1.A00
            if (r0 != 0) goto L_0x00c3
            java.lang.String r0 = "reactionsSearchController"
        L_0x0013:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001b:
            int r4 = X.C66581MXm.A04(r7)
            r3 = 1
            int r4 = r4 - r3
            r2 = 0
            r1 = 0
        L_0x0023:
            if (r2 > r4) goto L_0x003b
            r0 = r4
            if (r1 != 0) goto L_0x0029
            r0 = r2
        L_0x0029:
            boolean r0 = X.Dbc.A13(r7, r0)
            if (r1 != 0) goto L_0x0036
            if (r0 != 0) goto L_0x0033
            r1 = 1
            goto L_0x0023
        L_0x0033:
            int r2 = r2 + 1
            goto L_0x0023
        L_0x0036:
            if (r0 == 0) goto L_0x003b
            int r4 = r4 + -1
            goto L_0x0023
        L_0x003b:
            java.lang.String r0 = X.Dba.A0c(r7, r4, r2)
            if (r0 == 0) goto L_0x0063
            int r0 = r0.length()
            if (r0 <= r3) goto L_0x0063
            java.lang.Object r1 = r6.A01
            X.NJZ r1 = (X.NJZ) r1
            r1.A0C = r7
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r1.A09
            if (r0 == 0) goto L_0x0058
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C294975nL.A07(r0, r3)
        L_0x0058:
            boolean r0 = r1.A0D
            if (r0 == 0) goto L_0x00d1
            X.Ob6 r5 = r1.A08
            if (r5 != 0) goto L_0x00ab
            java.lang.String r0 = "uiController"
            goto L_0x0013
        L_0x0063:
            java.lang.Object r1 = r6.A01
            X.NJZ r1 = (X.NJZ) r1
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r1.A09
            if (r0 == 0) goto L_0x0058
            X.AnonymousClass7TE.A1U(r0, r3)
            goto L_0x0058
        L_0x006f:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.Object r0 = r6.A01
            X.H1O r0 = (X.H1O) r0
            X.H1O.A04(r0)
            X.0eM r0 = r0.A0U
            java.lang.Object r0 = r0.getValue()
            X.7fy r0 = (X.C337257fy) r0
            r0.EhX(r7)
            return
        L_0x0086:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.Object r0 = r6.A01
            X.NJz r0 = (X.C68482NJz) r0
            r0.Dhu(r7)
            return
        L_0x0092:
            java.lang.Object r0 = r6.A01
            X.NJq r0 = (X.NJq) r0
            r0.A0G = r7
            androidx.fragment.app.Fragment r1 = X.PRE.A00(r0)
            if (r1 == 0) goto L_0x00d1
            boolean r0 = r1 instanceof X.C74568PxH
            if (r0 == 0) goto L_0x00d1
            X.PxH r1 = (X.C74568PxH) r1
            r7.getClass()
            r1.Dhu(r7)
            return
        L_0x00ab:
            X.N47 r0 = r5.A01
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            java.lang.Object r3 = r0.A01
            java.util.List r3 = (java.util.List) r3
            boolean r2 = r0.A05
            java.lang.Object r1 = r0.A03
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.String r0 = r0.A04
            X.N47 r0 = X.N47.A00(r1, r4, r0, r3, r2)
            X.C71083Ob6.A01(r0, r5)
            return
        L_0x00c3:
            X.0mM r0 = r0.A01
            r0.A01(r7)
            int r0 = r7.length()
            if (r0 != 0) goto L_0x00d1
            r1.A02()
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72722PHc.onSearchTextChanged(java.lang.String):void");
    }
}
