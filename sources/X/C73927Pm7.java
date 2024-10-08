package X;

import android.view.View;

/* renamed from: X.Pm7  reason: case insensitive filesystem */
public final class C73927Pm7 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73927Pm7(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static View A00(C73927Pm7 pm7) {
        return ((OI9) pm7.A01).A00.getView();
    }

    public static 0t0 A01(Object obj, int i) {
        return AnonymousClass0eN.A01(new C73927Pm7(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0147, code lost:
        return r1.findViewById(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0277, code lost:
        return X.AnonymousClass7TF.A0G(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x006a;
                case 1: goto L_0x0076;
                case 2: goto L_0x0082;
                case 3: goto L_0x008e;
                case 4: goto L_0x009a;
                case 5: goto L_0x00a6;
                case 6: goto L_0x00af;
                case 7: goto L_0x00bb;
                case 8: goto L_0x00c7;
                case 9: goto L_0x00cf;
                case 10: goto L_0x00db;
                case 11: goto L_0x00e7;
                case 12: goto L_0x0100;
                case 13: goto L_0x010a;
                case 14: goto L_0x0118;
                case 15: goto L_0x0126;
                case 16: goto L_0x0130;
                case 17: goto L_0x013a;
                case 18: goto L_0x0148;
                case 19: goto L_0x015d;
                case 20: goto L_0x0167;
                case 21: goto L_0x0005;
                case 22: goto L_0x0167;
                case 23: goto L_0x0005;
                case 24: goto L_0x017a;
                case 25: goto L_0x0189;
                case 26: goto L_0x01b1;
                case 27: goto L_0x01ba;
                case 28: goto L_0x01ca;
                case 29: goto L_0x01d3;
                case 30: goto L_0x01dc;
                case 31: goto L_0x0008;
                case 32: goto L_0x01e5;
                case 33: goto L_0x01f5;
                case 34: goto L_0x01fd;
                case 35: goto L_0x0205;
                case 36: goto L_0x021c;
                case 37: goto L_0x022d;
                case 38: goto L_0x023e;
                case 39: goto L_0x0246;
                case 40: goto L_0x024e;
                case 41: goto L_0x0256;
                case 42: goto L_0x025e;
                case 43: goto L_0x0266;
                case 44: goto L_0x0278;
                case 45: goto L_0x028a;
                case 46: goto L_0x02a0;
                case 47: goto L_0x02b2;
                case 48: goto L_0x02c8;
                case 49: goto L_0x02dd;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r11.A01
        L_0x0007:
            return r4
        L_0x0008:
            java.lang.Object r4 = r11.A01
            X.3oV r4 = (X.C252063oV) r4
            android.view.View r1 = r4.getView()
            r0 = 2131440055(0x7f0b31b7, float:1.8502083E38)
            android.view.View r3 = r1.requireViewById(r0)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r1 = r4.getView()
            r0 = 2131440056(0x7f0b31b8, float:1.8502085E38)
            android.view.View r2 = r1.requireViewById(r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r1 = r4.getView()
            r0 = 2131440057(0x7f0b31b9, float:1.8502087E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.ViewGroup[] r0 = new android.view.ViewGroup[]{r3, r2, r0}
            r6 = 0
            X.0qQ.A0B(r0, r6)
            java.util.List r0 = X.03t.A0I(r0)
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x0047:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0007
            java.lang.Object r3 = r5.next()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r2 = 1
            android.view.LayoutInflater r1 = X.DbX.A0F(r3, r6)
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            r0 = 2131627266(0x7f0e0d02, float:1.8881792E38)
            android.view.View r1 = X.DbT.A0D(r1, r3, r0, r2)
            X.Myl r0 = new X.Myl
            r0.<init>(r3, r1)
            r4.add(r0)
            goto L_0x0047
        L_0x006a:
            java.lang.Object r1 = r11.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131439659(0x7f0b302b, float:1.850128E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x0076:
            java.lang.Object r1 = r11.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131434293(0x7f0b1b35, float:1.8490396E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x0082:
            java.lang.Object r1 = r11.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131434294(0x7f0b1b36, float:1.8490398E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x008e:
            java.lang.Object r1 = r11.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131434295(0x7f0b1b37, float:1.84904E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x009a:
            java.lang.Object r1 = r11.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131428130(0x7f0b0322, float:1.8477896E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x00a6:
            java.lang.Object r1 = r11.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131439696(0x7f0b3050, float:1.8501354E38)
            goto L_0x0143
        L_0x00af:
            java.lang.Object r1 = r11.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131439719(0x7f0b3067, float:1.8501401E38)
            X.3oV r4 = X.DbU.A0Z(r1, r0)
            return r4
        L_0x00bb:
            java.lang.Object r1 = r11.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131439720(0x7f0b3068, float:1.8501403E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x00c7:
            java.lang.Object r1 = r11.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131439724(0x7f0b306c, float:1.8501411E38)
            goto L_0x0143
        L_0x00cf:
            java.lang.Object r1 = r11.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131439727(0x7f0b306f, float:1.8501417E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x00db:
            java.lang.Object r1 = r11.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131443710(0x7f0b3ffe, float:1.8509496E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x00e7:
            java.lang.Object r1 = r11.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131439728(0x7f0b3070, float:1.850142E38)
            android.view.View r1 = r1.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x00fe
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x00f8:
            X.2eb r4 = new X.2eb
            r4.<init>(r1)
            return r4
        L_0x00fe:
            r1 = 0
            goto L_0x00f8
        L_0x0100:
            java.lang.Object r0 = r11.A01
            X.JZS r0 = (X.JZS) r0
            android.view.View r1 = r0.A01
            r0 = 2131433600(0x7f0b1880, float:1.848899E38)
            goto L_0x0143
        L_0x010a:
            java.lang.Object r0 = r11.A01
            X.JZS r0 = (X.JZS) r0
            android.view.View r1 = r0.A01
            r0 = 2131435641(0x7f0b2079, float:1.849313E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x0118:
            java.lang.Object r0 = r11.A01
            X.JZS r0 = (X.JZS) r0
            android.view.View r1 = r0.A01
            r0 = 2131436164(0x7f0b2284, float:1.849419E38)
            X.3Nc r4 = X.C240903Nb.A00(r1, r0)
            return r4
        L_0x0126:
            java.lang.Object r0 = r11.A01
            X.JZS r0 = (X.JZS) r0
            android.view.View r1 = r0.A01
            r0 = 2131436166(0x7f0b2286, float:1.8494195E38)
            goto L_0x0143
        L_0x0130:
            java.lang.Object r0 = r11.A01
            X.JZS r0 = (X.JZS) r0
            android.view.View r1 = r0.A01
            r0 = 2131436252(0x7f0b22dc, float:1.849437E38)
            goto L_0x0143
        L_0x013a:
            java.lang.Object r0 = r11.A01
            X.JZS r0 = (X.JZS) r0
            android.view.View r1 = r0.A01
            r0 = 2131441665(0x7f0b3801, float:1.8505348E38)
        L_0x0143:
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x0148:
            java.lang.Object r0 = r11.A01
            X.JZS r0 = (X.JZS) r0
            android.view.View r1 = r0.A01
            r0 = 2131434498(0x7f0b1c02, float:1.8490812E38)
            android.view.View r0 = X.AnonymousClass7TE.A0b(r1, r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            X.L2M r4 = new X.L2M
            r4.<init>(r0)
            return r4
        L_0x015d:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Oy0 r4 = new X.Oy0
            r4.<init>(r0)
            return r4
        L_0x0167:
            java.lang.Object r0 = r11.A01
            X.3mM r0 = (X.C250973mM) r0
            com.instagram.model.reels.Reel r0 = r0.A0H
            java.lang.String r0 = X.JTP.A0r(r0)
            int r0 = r0.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x017a:
            java.lang.Object r0 = r11.A01
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r0 = r0.A0B
            int r0 = r0.A00()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x0189:
            java.lang.Object r0 = r11.A01
            X.3oV r0 = (X.C252063oV) r0
            android.view.View r1 = r0.getView()
            r0 = 2131440059(0x7f0b31bb, float:1.850209E38)
            androidx.recyclerview.widget.RecyclerView r4 = X.DbT.A0I(r1, r0)
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r4)
            r0 = 6
            int r8 = X.C61380mr.A01(r1, r0)
            int r9 = X.C61380mr.A01(r1, r0)
            r6 = 0
            X.8gZ r5 = new X.8gZ
            r7 = r6
            r10 = r6
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A11(r5)
            return r4
        L_0x01b1:
            java.lang.Object r1 = r11.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131435048(0x7f0b1e28, float:1.8491927E38)
            goto L_0x0273
        L_0x01ba:
            java.lang.Object r1 = r11.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131435049(0x7f0b1e29, float:1.849193E38)
            com.instagram.common.ui.widget.imageview.IgImageView r4 = X.DbT.A0b(r1, r0)
            X.Oz2 r0 = X.C72234Oz2.A00
            r4.A0I = r0
            return r4
        L_0x01ca:
            java.lang.Object r1 = r11.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131435071(0x7f0b1e3f, float:1.8491974E38)
            goto L_0x0273
        L_0x01d3:
            java.lang.Object r1 = r11.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131435072(0x7f0b1e40, float:1.8491976E38)
            goto L_0x0273
        L_0x01dc:
            java.lang.Object r1 = r11.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131441066(0x7f0b35aa, float:1.8504133E38)
            goto L_0x0273
        L_0x01e5:
            java.lang.Object r0 = r11.A01
            X.3oV r0 = (X.C252063oV) r0
            android.view.View r1 = r0.getView()
            r0 = 2131440054(0x7f0b31b6, float:1.850208E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r1, r0)
            return r4
        L_0x01f5:
            android.view.View r1 = A00(r11)
            r0 = 2131428426(0x7f0b044a, float:1.8478496E38)
            goto L_0x0273
        L_0x01fd:
            android.view.View r1 = A00(r11)
            r0 = 2131440049(0x7f0b31b1, float:1.850207E38)
            goto L_0x0273
        L_0x0205:
            android.view.View r1 = A00(r11)
            r0 = 2131440058(0x7f0b31ba, float:1.8502089E38)
            X.3oV r0 = X.C66581MXm.A0T(r1, r0)
            android.view.View r0 = r0.getView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.Ndw r4 = new X.Ndw
            r4.<init>(r0)
            return r4
        L_0x021c:
            android.view.View r1 = A00(r11)
            r0 = 2131440060(0x7f0b31bc, float:1.8502093E38)
            X.3oV r0 = X.C66581MXm.A0T(r1, r0)
            X.O9G r4 = new X.O9G
            r4.<init>(r0)
            return r4
        L_0x022d:
            android.view.View r1 = A00(r11)
            r0 = 2131440063(0x7f0b31bf, float:1.8502099E38)
            X.3oV r0 = X.C66581MXm.A0T(r1, r0)
            X.Ndx r4 = new X.Ndx
            r4.<init>(r0)
            return r4
        L_0x023e:
            android.view.View r1 = A00(r11)
            r0 = 2131440061(0x7f0b31bd, float:1.8502095E38)
            goto L_0x0273
        L_0x0246:
            android.view.View r1 = A00(r11)
            r0 = 2131440062(0x7f0b31be, float:1.8502097E38)
            goto L_0x0273
        L_0x024e:
            android.view.View r1 = A00(r11)
            r0 = 2131440072(0x7f0b31c8, float:1.8502117E38)
            goto L_0x0273
        L_0x0256:
            android.view.View r1 = A00(r11)
            r0 = 2131440064(0x7f0b31c0, float:1.85021E38)
            goto L_0x0273
        L_0x025e:
            android.view.View r1 = A00(r11)
            r0 = 2131440065(0x7f0b31c1, float:1.8502103E38)
            goto L_0x0273
        L_0x0266:
            java.lang.Object r0 = r11.A01
            X.OEM r0 = (X.OEM) r0
            X.3oV r0 = r0.A00
            android.view.View r1 = r0.getView()
            r0 = 2131442333(0x7f0b3a9d, float:1.8506703E38)
        L_0x0273:
            android.view.View r4 = X.AnonymousClass7TF.A0G(r1, r0)
            return r4
        L_0x0278:
            java.lang.Object r0 = r11.A01
            X.OEM r0 = (X.OEM) r0
            X.3oV r0 = r0.A00
            android.view.View r1 = r0.getView()
            r0 = 2131442332(0x7f0b3a9c, float:1.85067E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r1, r0)
            return r4
        L_0x028a:
            java.lang.Object r0 = r11.A01
            X.6YS r0 = (X.AnonymousClass6YS) r0
            com.instagram.common.session.UserSession r3 = r0.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36597875893603364(0x820593002c0c24, double:3.207982310707871E-306)
            int r0 = X.DbS.A04(r2, r3, r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x02a0:
            java.lang.Object r0 = r11.A01
            X.6YS r0 = (X.AnonymousClass6YS) r0
            com.instagram.common.session.UserSession r3 = r0.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36597875893406755(0x82059300290c23, double:3.207982310583535E-306)
            java.lang.Long r4 = X.AnonymousClass7TF.A0Y(r2, r3, r0)
            return r4
        L_0x02b2:
            java.lang.Object r0 = r11.A01
            X.6YS r0 = (X.AnonymousClass6YS) r0
            com.instagram.common.session.UserSession r3 = r0.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 37160825846890648(0x840593002a0098, double:3.5639941279842635E-306)
            double r0 = X.182.A00(r2, r3, r0)
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            return r4
        L_0x02c8:
            java.lang.Object r0 = r11.A01
            android.content.Context r0 = (android.content.Context) r0
            int r1 = X.AnonymousClass0nB.A00(r0)
            int r0 = X.AnonymousClass3XX.A00
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x02dd:
            java.lang.Object r0 = r11.A01
            android.content.Context r0 = (android.content.Context) r0
            int r1 = X.AnonymousClass0nB.A01(r0)
            int r0 = X.AnonymousClass3XX.A00
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73927Pm7.invoke():java.lang.Object");
    }
}
