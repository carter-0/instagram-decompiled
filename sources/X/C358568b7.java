package X;

/* renamed from: X.8b7  reason: invalid class name and case insensitive filesystem */
public final class C358568b7 extends C231402rc {
    public final /* synthetic */ C358368an A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public C358568b7(C358368an r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        if (r2 > 0) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013e, code lost:
        if (r2 == 1) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0143, code lost:
        if (r2 == 0) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0145, code lost:
        r0 = r4.A1D;
        r0.getClass();
        r0.A0o(0);
        X.C294975nL.A05(new android.view.View[]{r4.A0z}, true);
        X.C358368an.A0C(r4);
        X.C294975nL.A04((X.C295005nO) null, new android.view.View[]{r4.A1m}, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0165, code lost:
        if (r2 > 1) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChanged() {
        /*
            r11 = this;
            X.8an r4 = r11.A00
            X.8MG r0 = r4.A1X
            boolean r0 = r0.Cd8()
            if (r0 == 0) goto L_0x0020
            X.6if r1 = r4.A1Y
            if (r1 == 0) goto L_0x0021
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r1.get()
            X.9Sf r0 = (X.C379049Sf) r0
            X.9YP r0 = r0.A0G
            int r0 = r0.getItemCount()
            if (r0 <= 0) goto L_0x0021
        L_0x0020:
            return
        L_0x0021:
            X.82p r0 = r4.A1Q
            X.82o r1 = r0.A02
            X.82Y r0 = r1.A01
            X.8Yz r2 = r0.A0X
            r2.getClass()
            r3 = 1
            X.8aL r0 = X.C358088aL.A0p
            r5 = 0
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r2.A0V(r0)
            if (r0 != 0) goto L_0x0020
            X.8b6 r0 = r4.A1S
            r0.getClass()
            int r2 = r0.getItemCount()
            android.view.View r7 = r4.A0A
            if (r7 == 0) goto L_0x0056
            com.instagram.ui.text.ConstrainedEditText r0 = r4.A1j
            float r6 = r0.getY()
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r6 = r6 + r0
            r7.setY(r6)
        L_0x0056:
            boolean r0 = r4.A0Y
            if (r0 != 0) goto L_0x0136
            boolean r0 = r4.A0b
            if (r0 != 0) goto L_0x0136
            int r0 = r4.A02
            if (r0 != 0) goto L_0x0141
            if (r2 <= 0) goto L_0x00e1
        L_0x0064:
            X.C358368an.A0I(r4, r3)
            X.8bA r10 = r4.A0I
            if (r10 == 0) goto L_0x007a
            com.instagram.igds.components.switchbutton.IgdsSwitch r6 = r10.A01
            com.instagram.common.session.UserSession r0 = r10.A00
            X.1Av r0 = X.1Au.A00(r0)
            boolean r0 = r0.A1h()
            r6.setChecked(r0)
        L_0x007a:
            X.8bD r0 = r4.A1T
            if (r0 == 0) goto L_0x009b
            com.instagram.igds.components.switchbutton.IgdsSwitch r9 = r0.A05
            com.instagram.common.session.UserSession r0 = r0.A03
            X.1Av r8 = X.1Au.A00(r0)
            X.0s0 r7 = r8.A0B
            X.0YZ[] r6 = X.1Av.A8a
            r0 = 234(0xea, float:3.28E-43)
            r0 = r6[r0]
            java.lang.Object r0 = r7.CDM(r8, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r9.setChecked(r0)
        L_0x009b:
            android.view.View r0 = r4.A0z
            android.view.View[] r6 = new android.view.View[]{r0}
            r0 = 0
            X.C294975nL.A04(r0, r6, r3)
            com.instagram.common.session.UserSession r9 = r4.A1J
            X.1Am r0 = X.1Al.A01(r9)
            X.1An r8 = X.1An.A34
            java.lang.Class r7 = r11.getClass()
            X.0xa r0 = r0.A04(r8, r7)
            java.lang.String r6 = "has_seen_mention_sharing_enabled_nux"
            boolean r5 = r0.getBoolean(r6, r5)
            if (r10 == 0) goto L_0x00e4
            X.4yO r0 = X.C358368an.A01(r4)
            boolean r0 = r0 instanceof X.C363138jC
            if (r0 != 0) goto L_0x00e4
            X.8ar r8 = r4.A1U
            com.instagram.igds.components.switchbutton.IgdsSwitch r7 = r10.A01
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            X.8nd r5 = r1.A01()
            X.8nd r1 = X.C365758nd.A04
            r0 = 0
            if (r5 != r1) goto L_0x00d5
            r0 = 1
        L_0x00d5:
            r8.A00(r7, r6, r0)
        L_0x00d8:
            com.instagram.ui.widget.drawing.StrokeWidthTool r0 = r4.A1m
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C294975nL.A05(r0, r3)
        L_0x00e1:
            r4.A02 = r2
            return
        L_0x00e4:
            boolean r0 = r11.A02
            if (r0 != 0) goto L_0x00d8
            X.4yO r0 = X.C358368an.A01(r4)
            boolean r0 = r0 instanceof X.C363138jC
            if (r0 != 0) goto L_0x00d8
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x00fe
            X.1Av r0 = X.1Au.A00(r9)
            boolean r0 = r0.A1h()
            if (r0 == 0) goto L_0x00d8
        L_0x00fe:
            if (r5 != 0) goto L_0x00d8
            android.view.View r0 = r4.A0A
            if (r0 == 0) goto L_0x00d8
            X.0Tu r5 = X.0Tu.A05
            r0 = 36319265657199709(0x81082e00001c5d, double:3.031788075332826E-306)
            boolean r0 = X.182.A06(r5, r9, r0)
            if (r0 == 0) goto L_0x00d8
            android.view.View r0 = r4.A0A
            X.5nL r5 = X.C294975nL.A01(r0, r3)
            r0 = 750(0x2ee, double:3.705E-321)
            r5.A0C(r0)
            android.view.View r5 = r4.A0A
            r0 = 3000(0xbb8, double:1.482E-320)
            X.C294975nL.A02(r5, r0)
            X.1Am r0 = X.1Al.A01(r9)
            X.0xa r0 = r0.A04(r8, r7)
            X.0xY r0 = r0.AR4()
            r0.E5T(r6, r3)
            r0.apply()
            goto L_0x00d8
        L_0x0136:
            int r0 = r4.A02
            if (r0 == 0) goto L_0x0165
            if (r0 == r3) goto L_0x0165
            if (r0 <= r3) goto L_0x00e1
            if (r2 != r3) goto L_0x00e1
            goto L_0x0145
        L_0x0141:
            if (r0 <= 0) goto L_0x00e1
            if (r2 != 0) goto L_0x00e1
        L_0x0145:
            androidx.recyclerview.widget.RecyclerView r0 = r4.A1D
            r0.getClass()
            r0.A0o(r5)
            android.view.View r0 = r4.A0z
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C294975nL.A05(r0, r3)
            X.C358368an.A0C(r4)
            com.instagram.ui.widget.drawing.StrokeWidthTool r0 = r4.A1m
            android.view.View[] r1 = new android.view.View[]{r0}
            r0 = 0
            X.C294975nL.A04(r0, r1, r3)
            goto L_0x00e1
        L_0x0165:
            if (r2 <= r3) goto L_0x00e1
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358568b7.onChanged():void");
    }
}
