package X;

import android.view.View;

/* renamed from: X.Ok3  reason: case insensitive filesystem */
public final class C71404Ok3 implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C71404Ok3(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public static void A01(View view, Object obj, int i, int i2) {
        AnonymousClass0fU.A00(new C71404Ok3(obj, i, i2), view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009c, code lost:
        r12 = "listener";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x011b, code lost:
        X.0qQ.A0F(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0122, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0216, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0219, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x01ed;
                case 1: goto L_0x01cd;
                case 2: goto L_0x00fa;
                case 3: goto L_0x00db;
                case 4: goto L_0x00c3;
                case 5: goto L_0x00b7;
                case 6: goto L_0x00ab;
                case 7: goto L_0x009f;
                case 8: goto L_0x0073;
                case 9: goto L_0x0037;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0020;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r13.A02
            com.instagram.ui.widget.fixedtabbar.FixedTabBar r3 = (com.instagram.ui.widget.fixedtabbar.FixedTabBar) r3
            int r2 = r13.A01
            X.Ptm r1 = r3.A06
            r1.getClass()
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x001c
            java.util.List r0 = r3.A07
            int r0 = X.C51966G9m.A06(r0)
            int r2 = r0 - r2
        L_0x001c:
            r1.setMode(r2)
            return
        L_0x0020:
            r0 = -1307664449(0xffffffffb20e9fbf, float:-8.30181E-9)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A02
            X.Nh4 r0 = (X.C69204Nh4) r0
            androidx.viewpager.widget.ViewPager r1 = r0.A00
            int r0 = r13.A01
            r1.setCurrentItem(r0)
            r0 = -1223073541(0xffffffffb71960fb, float:-9.142091E-6)
            goto L_0x0216
        L_0x0037:
            r0 = 2108026296(0x7da5edb8, float:2.7569616E37)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A02
            X.MsO r0 = (X.C67686MsO) r0
            X.OJy r0 = r0.A00
            if (r0 == 0) goto L_0x009c
            int r1 = r13.A01
            X.NJa r0 = r0.A00
            X.C68462NJa.A03(r0, r1)
            X.NdD r2 = X.C68462NJa.A01(r0)
            android.content.res.Resources r1 = X.DbV.A05(r0)
            r0 = 2131971063(0x7f134bf7, float:1.9579095E38)
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r1, r0)
            r2.A0Z(r0)
            r0 = 43
            X.J6i r1 = new X.J6i
            r1.<init>(r2, r0)
            X.PGi r0 = new X.PGi
            r0.<init>(r1)
            r2.A0P(r0)
            r0 = 993030120(0x3b306fe8, float:0.002692217)
            goto L_0x0216
        L_0x0073:
            r0 = 1468581253(0x5788c585, float:3.00763843E14)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A02
            X.MsO r0 = (X.C67686MsO) r0
            X.OJy r2 = r0.A00
            if (r2 == 0) goto L_0x009c
            int r1 = r13.A01
            java.util.List r0 = r0.A03
            java.lang.String r0 = X.C51966G9m.A1G(r0, r1)
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = X.DbV.A12(r0)
            if (r0 != 0) goto L_0x0094
        L_0x0092:
            java.lang.String r0 = ""
        L_0x0094:
            r2.A00(r1, r0)
            r0 = -220780476(0xfffffffff2d72844, float:-8.523258E30)
            goto L_0x0216
        L_0x009c:
            java.lang.String r12 = "listener"
            goto L_0x011b
        L_0x009f:
            r0 = 409218377(0x18642d49, float:2.9491172E-24)
            int r5 = A00(r14, r13, r0)
            r0 = -1756702602(0xffffffff974ad876, float:-6.554293E-25)
            goto L_0x0216
        L_0x00ab:
            r0 = 121593796(0x73f5fc4, float:1.4397386E-34)
            int r5 = A00(r14, r13, r0)
            r0 = -1721542356(0xffffffff9963592c, float:-1.1753633E-23)
            goto L_0x0216
        L_0x00b7:
            r0 = 270477772(0x101f29cc, float:3.138942E-29)
            int r5 = A00(r14, r13, r0)
            r0 = -122396311(0xfffffffff8b46169, float:-2.926841E34)
            goto L_0x0216
        L_0x00c3:
            r0 = -2136712785(0xffffffff80a459af, float:-1.5093194E-38)
            int r5 = X.AnonymousClass0fD.A05(r0)
            int r1 = r13.A01
            r0 = -1
            if (r1 == r0) goto L_0x00d6
            java.lang.Object r0 = r13.A02
            X.MsP r0 = (X.C67687MsP) r0
            X.C67687MsP.A01(r0, r1)
        L_0x00d6:
            r0 = 1781463337(0x6a2ef929, float:5.288243E25)
            goto L_0x0216
        L_0x00db:
            r0 = -1252043252(0xffffffffb55f560c, float:-8.319919E-7)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A02
            X.Mv7 r0 = (X.C67803Mv7) r0
            X.0sL r2 = r0.A01
            java.lang.String[] r1 = r0.A02
            int r0 = r13.A01
            r1 = r1[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.invoke(r1, r0)
            r0 = -824810537(0xffffffffced663d7, float:-1.79843366E9)
            goto L_0x0216
        L_0x00fa:
            r0 = 668059961(0x27d1c939, float:5.822732E-15)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r13.A02
            X.MvG r6 = (X.C67812MvG) r6
            X.O8C r0 = r6.A00
            java.util.List r7 = r6.A01
            int r4 = r13.A01
            java.lang.Object r1 = r7.get(r4)
            r11 = 0
            X.0qQ.A0B(r1, r11)
            X.NIj r8 = r0.A00
            java.util.Map r0 = r8.A08
            if (r0 != 0) goto L_0x0123
            java.lang.String r12 = "selectedThreads"
        L_0x011b:
            X.0qQ.A0F(r12)
        L_0x011e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0123:
            r0.remove(r1)
            java.util.Map r0 = r8.A08
            java.lang.String r12 = "selectedThreads"
            r9 = 0
            if (r0 == 0) goto L_0x011b
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01be
            java.util.Map r0 = r8.A08
            if (r0 == 0) goto L_0x011b
            int r0 = r0.size()
            java.lang.String r10 = "description"
            if (r0 <= r1) goto L_0x019a
            com.instagram.common.ui.base.IgTextView r3 = r8.A02
            if (r3 == 0) goto L_0x01c8
            android.content.Context r0 = r8.getContext()
            if (r0 == 0) goto L_0x0198
            android.content.res.Resources r2 = r0.getResources()
            if (r2 == 0) goto L_0x0198
            r1 = 2131954366(0x7f130abe, float:1.954523E38)
            int r0 = r8.A00
            java.lang.String r0 = X.JTS.A0i(r2, r0, r1)
        L_0x015b:
            r3.setText(r0)
            com.instagram.common.ui.base.IgTextView r0 = r8.A02
            if (r0 == 0) goto L_0x01c8
            r0.setVisibility(r11)
            com.instagram.common.ui.base.IgTextView r3 = r8.A03
            if (r3 == 0) goto L_0x0187
            android.content.Context r0 = r8.getContext()
            if (r0 == 0) goto L_0x0184
            android.content.res.Resources r2 = r0.getResources()
            if (r2 == 0) goto L_0x0184
            r1 = 2131954365(0x7f130abd, float:1.9545227E38)
            java.util.Map r0 = r8.A08
            if (r0 == 0) goto L_0x011b
            int r0 = r0.size()
            java.lang.String r9 = X.JTS.A0i(r2, r0, r1)
        L_0x0184:
            r3.setText(r9)
        L_0x0187:
            r7.remove(r4)
            r6.notifyItemRemoved(r4)
            int r0 = X.DbT.A02(r7, r4)
            r6.notifyItemRangeChanged(r4, r0)
            r0 = -1180204792(0xffffffffb9a78108, float:-3.1948858E-4)
            goto L_0x0216
        L_0x0198:
            r0 = r9
            goto L_0x015b
        L_0x019a:
            com.instagram.common.ui.base.IgTextView r2 = r8.A03
            if (r2 == 0) goto L_0x01b4
            android.content.Context r0 = r8.getContext()
            if (r0 == 0) goto L_0x01b1
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x01b1
            r0 = 2131954367(0x7f130abf, float:1.9545231E38)
            java.lang.String r9 = r1.getString(r0)
        L_0x01b1:
            r2.setText(r9)
        L_0x01b4:
            com.instagram.common.ui.base.IgTextView r1 = r8.A02
            if (r1 == 0) goto L_0x01c8
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0187
        L_0x01be:
            X.OE5 r0 = r8.A05
            if (r0 == 0) goto L_0x0187
            X.7Pu r0 = r0.A01
            r0.A07()
            goto L_0x0187
        L_0x01c8:
            X.0qQ.A0F(r10)
            goto L_0x011e
        L_0x01cd:
            r0 = -1209959485(0xffffffffb7e17bc3, float:-2.6879721E-5)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A02
            X.OcD r0 = (X.C71091OcD) r0
            int r2 = r13.A01
            X.Pvc r1 = r0.A0I
            java.util.List r0 = r0.A0K
            java.lang.Object r0 = r0.get(r2)
            X.OFN r0 = (X.OFN) r0
            java.lang.String r0 = r0.A00
            r1.DBp(r0, r2)
            r0 = -2137357301(0xffffffff809a840b, float:-1.4190035E-38)
            goto L_0x0216
        L_0x01ed:
            r0 = -1311964453(0xffffffffb1cd02db, float:-5.96661E-9)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r13.A02
            X.OFy r4 = (X.C70677OFy) r4
            int r2 = r13.A01
            java.util.List r0 = r4.A03
            java.lang.Object r3 = r0.get(r2)
            X.N4H r3 = (X.N4H) r3
            X.Jec r1 = r4.A02
            r0 = 1
            r1.A01(r2, r0)
            r4.A00 = r2
            X.0sL r2 = r4.A04
            java.lang.String r1 = r3.A05
            java.lang.Object r0 = r3.A04
            r2.invoke(r1, r0)
            r0 = 1569616463(0x5d8e724f, float:1.28304417E18)
        L_0x0216:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71404Ok3.onClick(android.view.View):void");
    }

    public static int A00(View view, C71404Ok3 ok3, int i) {
        int A05 = AnonymousClass0fD.A05(i);
        C17774Vfl vfl = ((C67804Mv8) ok3.A02).A00;
        if (vfl != null) {
            int i2 = ok3.A01;
            0qQ.A0A(view);
            vfl.A00(view, i2);
        }
        return A05;
    }
}
