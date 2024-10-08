package X;

import android.widget.CompoundButton;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.textcell.IgdsListCell;

public final class FQP implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public FQP(IgTextView igTextView, E4V e4v, IgdsListCell igdsListCell, int i) {
        this.A00 = i;
        if (4 - i != 0) {
            this.A02 = igTextView;
            this.A03 = e4v;
            this.A01 = igdsListCell;
        } else {
            this.A01 = igTextView;
            this.A03 = e4v;
            this.A02 = igdsListCell;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0181, code lost:
        ((com.instagram.igds.components.textcell.IgdsListCell) r0).setChecked(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0186, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0243, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r12, boolean r13) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0187;
                case 1: goto L_0x013f;
                case 2: goto L_0x01ac;
                case 3: goto L_0x0127;
                case 4: goto L_0x016a;
                case 5: goto L_0x0152;
                case 6: goto L_0x0061;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x0019;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A03
            X.ERZ r0 = (X.ERZ) r0
            X.F21 r2 = r0.A00
            if (r2 == 0) goto L_0x0018
            java.lang.Object r1 = r11.A02
            X.JwH r1 = (X.C61079JwH) r1
            java.lang.Object r0 = r11.A01
            X.Dgg r0 = (X.C46539Dgg) r0
            r2.A00(r1, r0, r13)
        L_0x0018:
            return
        L_0x0019:
            java.lang.Object r6 = r11.A01
            X.ERk r6 = (X.C48021ERk) r6
            android.app.Activity r5 = r6.getRootActivity()
            r5.getClass()
            java.lang.String r3 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r0 = X.1DL.A05(r5, r3)
            r2 = 1
            r4 = 0
            if (r13 != 0) goto L_0x019f
            java.lang.Object r0 = r11.A02
            int r1 = X.AnonymousClass7TE.A0M(r0)
            if (r1 == r4) goto L_0x0056
            if (r1 == r2) goto L_0x004b
            r0 = 2
            if (r1 != r0) goto L_0x0018
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1Av r3 = X.1Au.A00(r0)
            X.0s0 r2 = r3.A7p
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 31
        L_0x0047:
            X.AnonymousClass7TF.A1J(r3, r2, r1, r0, r4)
            return
        L_0x004b:
            java.lang.Object r3 = r11.A03
            X.1Av r3 = (X.1Av) r3
            X.0s0 r2 = r3.A7E
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 33
            goto L_0x0047
        L_0x0056:
            java.lang.Object r3 = r11.A03
            X.1Av r3 = (X.1Av) r3
            X.0s0 r2 = r3.A7D
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 32
            goto L_0x0047
        L_0x0061:
            java.lang.Object r0 = r11.A03
            X.EFr r0 = (X.C47757EFr) r0
            X.Jfm r3 = r0.A00
            java.lang.Object r6 = r11.A01
            X.JyH r6 = (X.C61165JyH) r6
            r7 = 0
            X.05G r5 = r3.A05
            java.lang.Object r1 = r5.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r0 = r1 instanceof java.util.Collection
            r2 = 0
            if (r0 == 0) goto L_0x00a1
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00a1
        L_0x0082:
            java.lang.Object r0 = r5.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r7 = r0.iterator()
        L_0x008c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r4 = r7.next()
            X.JyH r4 = (X.C61165JyH) r4
            int r1 = r4.A03
            int r0 = r6.A03
            if (r1 != r0) goto L_0x008c
            r4.A01 = r13
            goto L_0x008c
        L_0x00a1:
            java.util.Iterator r4 = r1.iterator()
            r1 = 0
        L_0x00a6:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r0 = r4.next()
            X.JyH r0 = (X.C61165JyH) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x00a6
            int r1 = r1 + 1
            if (r1 >= 0) goto L_0x00a6
            goto L_0x00f6
        L_0x00bb:
            r0 = 3
            if (r1 != r0) goto L_0x0082
            if (r13 != 0) goto L_0x0082
            X.05G r3 = r3.A04
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r0 = 2131957286(0x7f131626, float:1.9551152E38)
            X.GKO r2 = X.DbS.A0Q(r1, r0)
            X.6aq r1 = X.C310346aq.ERROR
            X.EKN r0 = new X.EKN
            r0.<init>(r2, r1)
            r3.Epw(r0)
            java.lang.Object r1 = r11.A02
            com.instagram.igds.components.textcell.IgdsListCell r1 = (com.instagram.igds.components.textcell.IgdsListCell) r1
            r0 = 1
            r1.setChecked(r0)
            return
        L_0x00de:
            java.util.Iterator r1 = r1.iterator()
        L_0x00e2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x010e
            java.lang.Object r0 = r1.next()
            X.JyH r0 = (X.C61165JyH) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x00e2
            int r2 = r2 + 1
            if (r2 >= 0) goto L_0x00e2
        L_0x00f6:
            X.0sr.A1S()
            goto L_0x023f
        L_0x00fb:
            java.lang.Object r1 = r5.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00de
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00de
        L_0x010e:
            X.C60106Jfm.A00(r3, r2)
            r0 = 8
            if (r2 != r0) goto L_0x011d
            X.05G r1 = r3.A04
            X.EKO r0 = X.EKO.A00
        L_0x0119:
            r1.Epw(r0)
            return
        L_0x011d:
            r0 = 7
            if (r2 != r0) goto L_0x0018
            if (r13 != 0) goto L_0x0018
            X.05G r1 = r3.A04
            X.EKP r0 = X.EKP.A00
            goto L_0x0119
        L_0x0127:
            java.lang.Object r0 = r11.A03
            X.EGF r0 = (X.EGF) r0
            X.0sK r3 = r0.A03
            if (r3 == 0) goto L_0x0018
            java.lang.Object r2 = r11.A02
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            java.lang.Object r0 = r11.A01
            X.Dp5 r0 = (X.C47013Dp5) r0
            android.widget.CheckBox r0 = r0.A00
            r3.invoke(r2, r1, r0)
            return
        L_0x013f:
            if (r13 == 0) goto L_0x0018
            java.lang.Object r3 = r11.A03
            com.instagram.bugreporter.BugReportSevereSwitchView r3 = (com.instagram.bugreporter.BugReportSevereSwitchView) r3
            java.lang.Object r2 = r11.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r11.A01
            X.F1n r1 = (X.C49680F1n) r1
            r0 = 1
            com.instagram.bugreporter.BugReportSevereSwitchView.A01(r3, r2, r1, r0)
            return
        L_0x0152:
            java.lang.Object r1 = r11.A02
            android.view.View r1 = (android.view.View) r1
            int r0 = X.DbW.A01(r13)
            r1.setVisibility(r0)
            java.lang.Object r0 = r11.A03
            X.E4V r0 = (X.E4V) r0
            X.DkL r0 = X.E4V.A00(r0)
            r0.A04 = r13
            java.lang.Object r0 = r11.A01
            goto L_0x0181
        L_0x016a:
            java.lang.Object r1 = r11.A01
            android.view.View r1 = (android.view.View) r1
            int r0 = X.DbW.A01(r13)
            r1.setVisibility(r0)
            java.lang.Object r0 = r11.A03
            X.E4V r0 = (X.E4V) r0
            X.DkL r0 = X.E4V.A00(r0)
            r0.A03 = r13
            java.lang.Object r0 = r11.A02
        L_0x0181:
            com.instagram.igds.components.textcell.IgdsListCell r0 = (com.instagram.igds.components.textcell.IgdsListCell) r0
            r0.setChecked(r13)
            return
        L_0x0187:
            java.lang.Object r3 = r11.A02
            X.4tV r3 = (X.C276544tV) r3
            java.lang.Object r2 = r11.A03
            X.4uI r2 = (X.C277014uI) r2
            X.6Tl r0 = X.DbU.A0T(r3)
            X.6Tm r1 = r0.A00()
            java.lang.Object r0 = r11.A01
            X.6Rm r0 = (X.C307786Rm) r0
            X.C307886Rw.A03(r0, r3, r1, r2)
            return
        L_0x019f:
            X.FXn r1 = new X.FXn
            r1.<init>(r5, r11, r0)
            java.lang.String[] r0 = new java.lang.String[]{r3}
            X.1DL.A04(r5, r1, r0)
            return
        L_0x01ac:
            java.lang.String r10 = "currentDoNotTranslateLanguages"
            java.lang.Object r9 = r11.A03
            X.E1J r9 = (X.E1J) r9
            java.util.Set r1 = r9.A00
            if (r13 == 0) goto L_0x0206
            if (r1 == 0) goto L_0x023c
            java.lang.Object r0 = r11.A01
            X.EWL r0 = (X.EWL) r0
            java.lang.String r0 = r0.A01
            r1.add(r0)
        L_0x01c1:
            java.lang.Object r0 = r11.A02
            com.instagram.igds.components.textcell.IgdsListCell r0 = (com.instagram.igds.components.textcell.IgdsListCell) r0
            r0.setChecked(r13)
            X.0eM r4 = r9.A02
            X.1Av r1 = X.DbX.A0h(r4)
            java.util.Set r0 = r9.A00
            if (r0 == 0) goto L_0x023c
            r1.A1A(r0)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            X.EWL[] r7 = X.EWL.values()
            r6 = 0
            int r5 = r7.length
        L_0x01df:
            if (r6 >= r5) goto L_0x0212
            r1 = r7[r6]
            X.2IV r3 = new X.2IV
            r3.<init>()
            java.util.Set r0 = r9.A00
            if (r0 == 0) goto L_0x023c
            java.lang.String r2 = r1.A01
            boolean r0 = r0.contains(r2)
            java.lang.Boolean r1 = X.DbT.A0l(r0)
            java.lang.String r0 = "enabled"
            r3.A08(r0, r1)
            java.lang.String r0 = "language"
            r3.A09(r2, r0)
            r8.add(r3)
            int r6 = r6 + 1
            goto L_0x01df
        L_0x0206:
            if (r1 == 0) goto L_0x023c
            java.lang.Object r0 = r11.A01
            X.EWL r0 = (X.EWL) r0
            java.lang.String r0 = r0.A01
            r1.remove(r0)
            goto L_0x01c1
        L_0x0212:
            X.2IV r3 = new X.2IV
            r3.<init>()
            java.lang.String r0 = "translate_from_preference"
            r3.A05(r0, r8)
            X.2IS r2 = X.C41845B3m.A04()
            X.2IS r1 = X.C41845B3m.A04()
            java.lang.String r0 = "input"
            r2.A00(r3, r0)
            com.facebook.pando.PandoGraphQLRequest r3 = X.C50169FSb.A00(r2, r1)
            X.1vn r2 = X.Dba.A0G(r4)
            X.0qQ.A0A(r3)
            X.FSL r1 = X.FSL.A00
            X.FRm r0 = X.C50154FRm.A00
            r2.ATL(r0, r1, r3)
            return
        L_0x023c:
            X.0qQ.A0F(r10)
        L_0x023f:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FQP.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }

    public FQP(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
    }
}
