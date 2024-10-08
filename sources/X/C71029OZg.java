package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.OZg  reason: case insensitive filesystem */
public final class C71029OZg {
    public View A00;
    public ViewGroup A01;
    public C45275Cte A02;
    public List A03;
    public boolean A04;
    public final Activity A05;
    public final LayoutInflater A06;
    public final AnonymousClass0iw A07;
    public final UserSession A08;
    public final C329127Hr A09;

    public static final void A00(C71029OZg oZg) {
        ViewGroup viewGroup = oZg.A01;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        oZg.A01 = null;
        View view = oZg.A00;
        if (view != null) {
            C66580MXl.A1R(view);
            ((ViewGroup) view).removeAllViews();
            return;
        }
        0qQ.A0F("view");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0297, code lost:
        if (r14 != false) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r0 != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        if (r0.isEmpty() != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0174, code lost:
        if (r4.isEmpty() != false) goto L_0x0176;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A01(android.view.View r22, X.C74238PrR r23) {
        /*
            r21 = this;
            r7 = r22
            r1 = r23
            X.P0j r1 = (X.C72292P0j) r1
            r10 = 0
            boolean r2 = X.AnonymousClass7TF.A1U(r10, r7, r1)
            X.2Ep r0 = r1.A00
            if (r0 == 0) goto L_0x02d6
            X.3su r0 = r0.BKv()
            boolean r14 = X.DbW.A1a(r0)
            X.2Ep r0 = r1.A00
            if (r0 == 0) goto L_0x02d6
            X.3U9 r0 = (X.AnonymousClass3U9) r0
            X.3S9 r0 = r0.A01
            java.util.List r4 = r0.A23
            java.util.List r8 = r1.A00()
            X.2Ep r3 = r1.A00
            r6 = 0
            if (r3 == 0) goto L_0x02d6
            r0 = r3
            X.3U9 r0 = (X.AnonymousClass3U9) r0
            X.3S9 r0 = r0.A01
            X.9IV r0 = r0.A0T
            if (r0 == 0) goto L_0x0037
            java.lang.Object r6 = r0.A01
            java.util.List r6 = (java.util.List) r6
        L_0x0037:
            X.3su r5 = r3.BKv()
            r15 = r21
            if (r5 != 0) goto L_0x02a2
            if (r4 == 0) goto L_0x0047
            boolean r0 = r4.isEmpty()
        L_0x0045:
            if (r0 == 0) goto L_0x0048
        L_0x0047:
            r4 = 0
        L_0x0048:
            if (r14 != 0) goto L_0x0057
            java.util.List r0 = r1.A00()
            if (r0 == 0) goto L_0x0057
            boolean r0 = r0.isEmpty()
            r13 = 1
            if (r0 == 0) goto L_0x0058
        L_0x0057:
            r13 = 0
        L_0x0058:
            X.2Ep r3 = r1.A00
            r0 = 0
            if (r3 == 0) goto L_0x02d6
            X.3U9 r3 = (X.AnonymousClass3U9) r3
            X.3S9 r3 = r3.A01
            X.9IV r3 = r3.A0T
            if (r3 == 0) goto L_0x0067
            java.lang.Object r0 = r3.A00
        L_0x0067:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 != 0) goto L_0x029f
            if (r4 == 0) goto L_0x008b
            java.util.Iterator r3 = r4.iterator()
        L_0x0077:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x029f
            java.lang.Object r0 = r3.next()
            X.4ou r0 = (X.C274694ou) r0
            java.lang.Boolean r0 = r0.A00
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 != 0) goto L_0x0077
        L_0x008b:
            r12 = 0
        L_0x008c:
            X.2Ep r0 = r1.A00
            if (r0 == 0) goto L_0x02d6
            java.util.List r0 = r0.BRZ()
            int r0 = r0.size()
            if (r0 != r2) goto L_0x029b
            X.2Ep r0 = r1.A00
            if (r0 == 0) goto L_0x02d6
            java.util.List r0 = r0.BRZ()
            com.instagram.user.model.User r17 = X.DbS.A0g(r0, r10)
        L_0x00a6:
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            X.2Ep r0 = r1.A00
            if (r0 == 0) goto L_0x02d6
            java.lang.String r5 = r0.C6C()
            if (r5 != 0) goto L_0x00b4
            java.lang.String r5 = ""
        L_0x00b4:
            X.2Ep r0 = r1.A00
            if (r0 == 0) goto L_0x02d6
            X.3U9 r0 = (X.AnonymousClass3U9) r0
            X.3S9 r0 = r0.A01
            X.Cte r6 = r0.A0d
            boolean r9 = r0.A2T
            java.util.List r0 = r15.A03
            boolean r0 = X.2PP.A00(r4, r0)
            if (r0 == 0) goto L_0x00d1
            X.Cte r0 = r15.A02
            boolean r0 = X.2PP.A00(r6, r0)
            if (r0 == 0) goto L_0x00d1
        L_0x00d0:
            return
        L_0x00d1:
            A00(r15)
            r15.A03 = r4
            r15.A02 = r6
            if (r17 == 0) goto L_0x0297
            com.instagram.common.session.UserSession r8 = r15.A08
            X.0Tu r3 = X.0Tu.A05
            r0 = 36314867610684266(0x81042e00000b6a, double:3.029006733006948E-306)
            boolean r0 = X.182.A06(r3, r8, r0)
            if (r0 == 0) goto L_0x0297
            if (r14 == 0) goto L_0x013d
            if (r4 == 0) goto L_0x0131
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0131
            X.7GH r3 = X.AnonymousClass7GF.A00(r8)
            java.lang.String r1 = r17.getId()
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0292
            java.lang.String r0 = r3.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0292
            r3.A06 = r2
            r3.A04 = r5
            android.view.LayoutInflater r1 = r15.A06
            r0 = 2131624983(0x7f0e0417, float:1.8877161E38)
            android.widget.TextView r5 = X.C66582MXn.A0E(r1, r7, r0, r10)
            android.content.res.Resources r3 = r5.getResources()
            r1 = 2131959448(0x7f131e98, float:1.9555537E38)
            java.lang.String r0 = r17.getUsername()
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r3, r0, r1)
            X.0qQ.A07(r0)
            r5.setVisibility(r10)
            r5.setText(r0)
            r7.addView(r5)
        L_0x0131:
            android.view.LayoutInflater r1 = r15.A06
            r0 = 2131629046(0x7f0e13f6, float:1.8885402E38)
            android.view.View r0 = r1.inflate(r0, r7, r10)
            r7.addView(r0)
        L_0x013d:
            r11 = 0
            if (r4 == 0) goto L_0x0176
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0170
            if (r13 != 0) goto L_0x0170
            android.view.LayoutInflater r1 = r15.A06
            r0 = 2131624980(0x7f0e0414, float:1.8877155E38)
            android.view.View r8 = X.C66583MXo.A0A(r1, r7, r0)
            r0 = 2131434832(0x7f0b1d50, float:1.849149E38)
            android.widget.TextView r5 = X.DbW.A0B(r8, r0)
            android.content.res.Resources r3 = X.C66580MXl.A0B(r8)
            if (r12 == 0) goto L_0x0283
            r0 = 2131958890(0x7f131c6a, float:1.9554405E38)
            java.lang.String r0 = r3.getString(r0)
        L_0x0165:
            if (r0 == 0) goto L_0x016d
            r5.setVisibility(r10)
            r5.setText(r0)
        L_0x016d:
            r7.addView(r8)
        L_0x0170:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0177
        L_0x0176:
            r11 = 1
        L_0x0177:
            r3 = r11 ^ 1
            if (r6 == 0) goto L_0x01d5
            if (r14 == 0) goto L_0x01d5
            android.view.LayoutInflater r1 = r15.A06
            r0 = 2131624992(0x7f0e0420, float:1.887718E38)
            r11 = 0
            android.view.View r8 = X.C66583MXo.A0A(r1, r7, r0)
            r0 = 2131434842(0x7f0b1d5a, float:1.849151E38)
            android.widget.TextView r5 = X.AnonymousClass7TG.A0R(r8, r0)
            r0 = 2131434838(0x7f0b1d56, float:1.8491501E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r8, r0)
            r0 = 2131434840(0x7f0b1d58, float:1.8491505E38)
            android.view.View r0 = r8.requireViewById(r0)
            X.0qQ.A07(r0)
            java.lang.String r0 = r6.A01
            r1.setText(r0)
            r8.setVisibility(r10)
            if (r3 == 0) goto L_0x026f
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            r0 = 6
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r6, r0)
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            android.content.res.Resources r3 = r8.getResources()
            r1 = 2131165195(0x7f07000b, float:1.79446E38)
            int r0 = r3.getDimensionPixelSize(r1)
            r6.topMargin = r0
            int r0 = r3.getDimensionPixelSize(r1)
            r6.bottomMargin = r0
            r8.setLayoutParams(r6)
            r11 = 8
        L_0x01cf:
            r5.setVisibility(r11)
            r7.addView(r8)
        L_0x01d5:
            if (r4 == 0) goto L_0x00d0
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00d0
            android.view.LayoutInflater r8 = r15.A06
            r0 = 2131624982(0x7f0e0416, float:1.887716E38)
            if (r14 == 0) goto L_0x01e7
            r0 = 2131624990(0x7f0e041e, float:1.8877175E38)
        L_0x01e7:
            android.view.View r6 = r8.inflate(r0, r7, r10)
            java.lang.String r3 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r6, r3)
            r0 = 2131431660(0x7f0b10ec, float:1.8485055E38)
            android.view.ViewGroup r5 = X.DbX.A0I(r6, r0)
            r0 = 2131624984(0x7f0e0418, float:1.8877163E38)
            android.view.View r1 = X.DbU.A08(r8, r0)
            X.0qQ.A0C(r1, r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r15.A01 = r1
            if (r14 == 0) goto L_0x022f
            boolean r0 = r1 instanceof android.widget.LinearLayout
            if (r0 == 0) goto L_0x022f
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.LinearLayout"
            X.0qQ.A0C(r1, r0)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setOrientation(r2)
            android.view.ViewGroup r11 = r15.A01
            if (r11 == 0) goto L_0x022f
            int r3 = r7.getPaddingStart()
            int r2 = r7.getPaddingEnd()
            android.content.res.Resources r1 = X.DbU.A05(r7)
            r0 = 2131165204(0x7f070014, float:1.7944619E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r11.setPadding(r3, r10, r2, r0)
        L_0x022f:
            java.util.Iterator r10 = r4.iterator()
        L_0x0233:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02c2
            java.lang.Object r4 = r10.next()
            X.4ou r4 = (X.C274694ou) r4
            android.view.ViewGroup r3 = r15.A01
            if (r3 == 0) goto L_0x0233
            r0 = 2131624986(0x7f0e041a, float:1.8877167E38)
            android.view.View r2 = X.C66583MXo.A0A(r8, r3, r0)
            java.lang.String r1 = r4.A05
            X.0qQ.A07(r1)
            java.lang.String r0 = r4.A03
            X.OjG r14 = new X.OjG
            r18 = r1
            r19 = r0
            r20 = r9
            r16 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20)
            X.AnonymousClass0fU.A00(r14, r2)
            r0 = 2131434836(0x7f0b1d54, float:1.8491497E38)
            android.widget.TextView r0 = X.DbW.A0B(r2, r0)
            r0.setText(r1)
            r3.addView(r2)
            goto L_0x0233
        L_0x026f:
            android.content.res.Resources r3 = r8.getResources()
            r1 = 2131960759(0x7f1323b7, float:1.9558196E38)
            if (r17 == 0) goto L_0x0281
            java.lang.String r0 = r17.B8Q()
        L_0x027c:
            X.DbY.A0y(r3, r5, r0, r1)
            goto L_0x01cf
        L_0x0281:
            r0 = 0
            goto L_0x027c
        L_0x0283:
            if (r17 == 0) goto L_0x016d
            r1 = 2131959588(0x7f131f24, float:1.955582E38)
            java.lang.String r0 = r17.getUsername()
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r3, r0, r1)
            goto L_0x0165
        L_0x0292:
            r3.A01()
            goto L_0x0131
        L_0x0297:
            if (r14 == 0) goto L_0x013d
            goto L_0x0131
        L_0x029b:
            r17 = 0
            goto L_0x00a6
        L_0x029f:
            r12 = 1
            goto L_0x008c
        L_0x02a2:
            com.instagram.common.session.UserSession r0 = r15.A08
            java.lang.String r3 = r0.A06
            java.lang.String r0 = r5.A1u
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x02b9
            if (r8 == 0) goto L_0x02b9
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x02b9
            r4 = r8
            goto L_0x0048
        L_0x02b9:
            if (r6 == 0) goto L_0x0047
            boolean r0 = r6.isEmpty()
            r4 = r6
            goto L_0x0045
        L_0x02c2:
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L_0x02cb
            r5.removeAllViews()
        L_0x02cb:
            android.view.ViewGroup r0 = r15.A01
            if (r0 == 0) goto L_0x02d2
            r5.addView(r0)
        L_0x02d2:
            r7.addView(r6)
            return
        L_0x02d6:
            java.lang.String r0 = "thread"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71029OZg.A01(android.view.View, X.PrR):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        if (X.AnonymousClass7TE.A1b(r4) != false) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean A02(X.C74238PrR r9) {
        /*
            r8 = this;
            X.P0j r9 = (X.C72292P0j) r9
            r0 = 0
            X.0qQ.A0B(r9, r0)
            X.2Ep r0 = r9.A00
            if (r0 == 0) goto L_0x00a5
            X.3su r2 = r0.BKv()
            r7 = 0
            r6 = 1
            if (r2 != 0) goto L_0x0078
            X.2Ep r0 = r9.A00
            if (r0 == 0) goto L_0x00a5
            X.3U9 r0 = (X.AnonymousClass3U9) r0
            X.3S9 r0 = r0.A01
            java.util.List r0 = r0.A23
            if (r0 == 0) goto L_0x0097
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0097
            X.2Ep r0 = r9.A00
            if (r0 == 0) goto L_0x00a5
            X.3U9 r0 = (X.AnonymousClass3U9) r0
            X.3S9 r0 = r0.A01
            java.util.List r5 = r0.A23
            if (r5 == 0) goto L_0x00a3
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r5.iterator()
        L_0x0038:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004f
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.4ou r0 = (X.C274694ou) r0
            java.lang.Boolean r1 = r0.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            X.JTR.A1P(r1, r0, r2, r4)
            goto L_0x0038
        L_0x004f:
            boolean r0 = X.AnonymousClass7TE.A1b(r4)
            if (r0 == 0) goto L_0x00a3
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r5.iterator()
        L_0x005d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0091
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.4ou r0 = (X.C274694ou) r0
            java.lang.String r1 = r0.A04
            java.lang.String r0 = "General"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005d
            r4.add(r2)
            goto L_0x005d
        L_0x0078:
            com.instagram.common.session.UserSession r0 = r8.A08
            java.lang.String r1 = r0.A06
            java.lang.String r0 = r2.A1u
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00a4
            java.util.List r0 = r9.A00()
            if (r0 == 0) goto L_0x00a4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00a3
            return r7
        L_0x0091:
            boolean r0 = X.AnonymousClass7TE.A1b(r4)
            if (r0 == 0) goto L_0x00a3
        L_0x0097:
            X.2Ep r0 = r9.A00
            if (r0 == 0) goto L_0x00a5
            X.3U9 r0 = (X.AnonymousClass3U9) r0
            X.3S9 r0 = r0.A01
            X.Cte r0 = r0.A0d
            if (r0 == 0) goto L_0x00a4
        L_0x00a3:
            r7 = 1
        L_0x00a4:
            return r7
        L_0x00a5:
            java.lang.String r0 = "thread"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71029OZg.A02(X.PrR):boolean");
    }

    public C71029OZg() {
    }

    public C71029OZg(Activity activity, LayoutInflater layoutInflater, AnonymousClass0iw r3, UserSession userSession, C329127Hr r5) {
        this.A06 = layoutInflater;
        this.A08 = userSession;
        this.A07 = r3;
        this.A05 = activity;
        this.A09 = r5;
    }
}
