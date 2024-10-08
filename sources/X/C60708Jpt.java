package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.igtv.model.IGTVViewerLoggingToken;
import com.instagram.ui.widget.base.AspectRatioFrameLayout;

/* renamed from: X.Jpt  reason: case insensitive filesystem */
public final class C60708Jpt extends C249703kE implements C246453ed {
    public I9I A00;
    public MXT A01;
    public final View A02;
    public final TextView A03;
    public final UserSession A04;
    public final UserSession A05;
    public final C60005JdE A06;
    public final C71662eb A07;
    public final C71662eb A08;
    public final C71662eb A09;
    public final AnonymousClass4DU A0A;
    public final AnonymousClass4DU A0B;
    public final C256033v7 A0C;
    public final MSR A0D;
    public final JSz A0E;
    public final IGTVViewerLoggingToken A0F;
    public final String A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final int A0J;
    public final View A0K;
    public final View A0L;
    public final TextView A0M;
    public final TextView A0N;
    public final MSR A0O;
    public final AspectRatioFrameLayout A0P;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(android.content.Context r16, com.instagram.common.session.UserSession r17, X.C60005JdE r18, X.C71662eb r19, X.MXT r20, java.lang.String r21) {
        /*
            r15 = this;
            r14 = 0
            r10 = r16
            X.0qQ.A0B(r10, r14)
            r5 = 1
            r7 = r19
            r8 = r20
            r13 = r21
            X.C51974G9v.A1M(r8, r13, r7)
            r0 = 5
            r12 = r18
            X.0qQ.A0B(r12, r0)
            r9 = r15
            X.JSz r0 = r15.A0E
            boolean r0 = r0.AB7()
            if (r0 == 0) goto L_0x002b
            boolean r0 = r8.CWu()
            if (r0 != 0) goto L_0x002c
            X.4gL r0 = r8.Ahy()
            if (r0 != 0) goto L_0x002c
        L_0x002b:
            return r14
        L_0x002c:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            X.MXT r0 = r15.A01
            r0.getClass()
            X.MXT r2 = r15.A01
            X.0qQ.A0B(r2, r14)
            boolean r0 = r2.CWu()
            if (r0 == 0) goto L_0x0081
            X.1Xj r2 = r2.BPf()
            com.instagram.common.session.UserSession r0 = r15.A04
            X.0qQ.A0A(r2)
            X.1se r0 = X.1sd.A00(r0)
            boolean r0 = r0.A05(r2)
            if (r0 == 0) goto L_0x0081
            X.HNQ r0 = X.HNQ.A0a
        L_0x0055:
            r1.add(r0)
        L_0x0058:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x002b
            X.Dg1 r2 = new X.Dg1
            r0 = r17
            r2.<init>(r10, r0)
            r0 = 0
            r2.A03 = r0
            java.util.Iterator r1 = r1.iterator()
        L_0x006c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0106
            java.lang.Object r11 = r1.next()
            X.HNQ r11 = (X.HNQ) r11
            X.ICd r6 = new X.ICd
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            X.C55030Hb1.A00(r10, r6, r2, r11)
            goto L_0x006c
        L_0x0081:
            X.MXT r3 = r15.A01
            boolean r0 = r3.CWu()
            r4 = 1
            if (r0 == 0) goto L_0x00bc
            com.instagram.common.session.UserSession r2 = r15.A04
            X.1Xj r0 = r3.BPf()
            boolean r0 = X.2R8.A02(r2, r0)
            if (r0 == 0) goto L_0x00bc
            X.HNQ r0 = X.HNQ.A0B
            r1.add(r0)
            X.HNQ r0 = X.HNQ.A0A
            r1.add(r0)
            X.HNQ r0 = X.HNQ.A0V
            r1.add(r0)
            X.HNQ r0 = X.HNQ.A0C
            r1.add(r0)
            X.MXT r0 = r15.A01
            X.1Xj r0 = r0.BPf()
            boolean r0 = r0.CbC()
            if (r0 == 0) goto L_0x00b9
            X.HNQ r0 = X.HNQ.A0c
            goto L_0x0055
        L_0x00b9:
            X.HNQ r0 = X.HNQ.A0T
            goto L_0x0055
        L_0x00bc:
            java.lang.String r3 = r15.A0G
            X.EXG r2 = X.EXG.A0W
            X.LC5 r0 = new X.LC5
            r0.<init>(r2)
            java.lang.String r0 = r0.A00()
            boolean r3 = r3.equals(r0)
            X.MXT r2 = r15.A01
            X.4gL r0 = r2.Ahy()
            if (r0 != 0) goto L_0x00d6
            r4 = 0
        L_0x00d6:
            X.HNQ r0 = X.HNQ.A0Q
            r1.add(r0)
            if (r3 != 0) goto L_0x00e7
            X.HNQ r0 = X.HNQ.A0J
            r1.add(r0)
            X.HNQ r0 = X.HNQ.A0e
            r1.add(r0)
        L_0x00e7:
            if (r4 != 0) goto L_0x00f8
            X.1Xj r0 = r2.BPf()
            boolean r0 = r0.CbC()
            if (r0 == 0) goto L_0x0103
            X.HNQ r0 = X.HNQ.A0c
        L_0x00f5:
            r1.add(r0)
        L_0x00f8:
            X.HNQ r0 = X.HNQ.A0U
            r1.add(r0)
            if (r4 != 0) goto L_0x0058
            X.HNQ r0 = X.HNQ.A0A
            goto L_0x0055
        L_0x0103:
            X.HNQ r0 = X.HNQ.A0T
            goto L_0x00f5
        L_0x0106:
            X.FFy r0 = new X.FFy
            r0.<init>(r2)
            r0.A05(r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60708Jpt.A03(android.content.Context, com.instagram.common.session.UserSession, X.JdE, X.2eb, X.MXT, java.lang.String):boolean");
    }

    public final void D8I(C278014w6 r1, AnonymousClass1Xp r2, int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
        if (r2 == false) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.MXT r10, X.C60708Jpt r11) {
        /*
            r11.A01 = r10
            java.lang.String r0 = r10.BJX()
            boolean r0 = X.0mp.A0B(r0)
            android.widget.TextView r1 = r11.A0M
            if (r0 == 0) goto L_0x019c
            r0 = 8
            r1.setVisibility(r0)
        L_0x0013:
            boolean r0 = r11.A0I
            if (r0 == 0) goto L_0x005e
            android.widget.TextView r3 = r11.A03
            if (r3 == 0) goto L_0x005e
            X.MXT r0 = r11.A01
            r0.getClass()
            boolean r0 = r0.CeQ()
            if (r0 == 0) goto L_0x018e
            android.view.ViewTreeObserver r2 = r3.getViewTreeObserver()
            r1 = 1
            X.LZ3 r0 = new X.LZ3
            r0.<init>(r1, r11, r3)
            r2.addOnPreDrawListener(r0)
        L_0x0033:
            X.MXT r0 = r11.A01
            r0.getClass()
            boolean r0 = r0.CWu()
            if (r0 == 0) goto L_0x005e
            X.MXT r0 = r11.A01
            X.1Xj r0 = r0.BPf()
            boolean r0 = r0.A5Y()
            if (r0 == 0) goto L_0x005e
            android.content.Context r2 = r3.getContext()
            r1 = 2131964089(0x7f1330b9, float:1.956495E38)
            X.MXT r0 = r11.A01
            java.lang.String r0 = r0.getUsername()
            java.lang.String r0 = X.DbW.A0h(r2, r0, r1)
            r3.setContentDescription(r0)
        L_0x005e:
            android.widget.TextView r2 = r11.A0N
            android.content.res.Resources r1 = r2.getResources()
            int r0 = r10.getViewCount()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = X.AnonymousClass3f0.A01(r1, r0)
            r2.setText(r0)
            X.MXT r0 = r11.A01
            boolean r2 = r0.CYu()
            android.view.View r1 = r11.A02
            boolean r0 = r11.A0H
            if (r0 == 0) goto L_0x0082
            r0 = 0
            if (r2 != 0) goto L_0x0084
        L_0x0082:
            r0 = 8
        L_0x0084:
            r1.setVisibility(r0)
            r9 = 0
            X.2eb r1 = r11.A09
            android.view.View r0 = r1.A01()
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r9)
            r1.A02()
            X.JdE r5 = r11.A06
            r5.A04 = r9
            r5.invalidateSelf()
            r8 = 1
            r5.A05 = r8
            r5.invalidateSelf()
            X.MXT r0 = r11.A01
            r0.getClass()
            boolean r0 = r0.EtN()
            X.2eb r2 = r11.A08
            if (r0 == 0) goto L_0x018a
            android.view.View r1 = r2.A01()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131238787(0x7f081f83, float:1.8093863E38)
            r1.setImageResource(r0)
            r0 = 0
        L_0x00bd:
            r2.A03(r0)
            X.MXT r1 = r11.A01
            android.view.View r0 = r11.A0K
            android.content.Context r0 = r0.getContext()
            com.instagram.common.typedurl.ImageUrl r0 = r1.C74(r0)
            r2 = 0
            r5.A02(r0, r2)
            com.instagram.ui.widget.base.AspectRatioFrameLayout r1 = r11.A0P
            int r0 = r11.A0J
            X.0nA.A0V(r1, r0)
            r0 = 1059363750(0x3f249ba6, float:0.643)
            r1.setAspectRatio(r0)
            X.MXT r4 = r11.A01
            java.lang.String r0 = r11.A0G
            X.2eb r3 = r11.A07
            X.0qQ.A0B(r4, r9)
            X.AnonymousClass7TF.A1B(r0, r8, r3)
            X.4gL r1 = r4.Ahy()
            boolean r0 = r4.CWu()
            if (r0 == 0) goto L_0x017c
            X.1Xj r1 = r4.BPf()
            com.instagram.common.session.UserSession r0 = r11.A04
            X.0qQ.A0A(r1)
            X.1se r0 = X.1sd.A00(r0)
            boolean r0 = r0.A05(r1)
        L_0x0104:
            if (r0 == 0) goto L_0x0179
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x0108:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0172
            A02(r11, r8)
        L_0x010f:
            X.MXT r0 = r11.A01
            r0.getClass()
            boolean r0 = r0.CWu()
            if (r0 == 0) goto L_0x01ab
            X.MXT r0 = r11.A01
            X.1Xj r3 = r0.BPf()
            boolean r0 = r3.A5f()
            if (r0 == 0) goto L_0x01ab
            X.3v7 r6 = r11.A0C
            r0 = -1
            X.3ev r5 = X.C246473ef.A00(r3, r2, r11, r0, r9)
            X.4DU r4 = r11.A0B
            r0 = 8
            float[] r7 = new float[r0]
            r10 = r9
            X.C256013v5.A02(r4, r5, r6, r7, r8, r9, r10)
            r2 = 10
            android.widget.LinearLayout r1 = r6.A04
            if (r1 == 0) goto L_0x014c
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r1)
            float r0 = X.0nA.A04(r0, r2)
            int r0 = java.lang.Math.round(r0)
            X.0nA.A0Y(r1, r0)
        L_0x014c:
            android.widget.LinearLayout r1 = r6.A04
            if (r1 == 0) goto L_0x015f
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r1)
            float r0 = X.0nA.A04(r0, r2)
            int r0 = java.lang.Math.round(r0)
            X.0nA.A0a(r1, r0)
        L_0x015f:
            com.instagram.common.session.UserSession r2 = r11.A05
            java.lang.String r0 = "igtv_sensitivity_screen_impression"
            X.3sc r1 = X.C55028Haz.A00(r3, r4, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.C233822wX.A0I(r2, r1, r4, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            X.I2F.A02(r3, r4, r2, r0)
            return
        L_0x0172:
            A02(r11, r9)
            A00(r5, r3, r4, r1)
            goto L_0x010f
        L_0x0179:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x0108
        L_0x017c:
            if (r1 == 0) goto L_0x010f
            com.instagram.common.session.UserSession r0 = r11.A04
            X.4wN r0 = X.C278164wN.A00(r0)
            boolean r0 = r0.A02(r1)
            goto L_0x0104
        L_0x018a:
            r0 = 8
            goto L_0x00bd
        L_0x018e:
            X.MXT r0 = r11.A01
            r0.getClass()
            java.lang.String r0 = r0.getUsername()
            r3.setText(r0)
            goto L_0x0033
        L_0x019c:
            r0 = 0
            r1.setVisibility(r0)
            X.MXT r0 = r11.A01
            java.lang.String r0 = r0.BJX()
            r1.setText(r0)
            goto L_0x0013
        L_0x01ab:
            X.3v7 r0 = r11.A0C
            X.C256013v5.A03(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60708Jpt.A01(X.MXT, X.Jpt):void");
    }

    public static void A02(C60708Jpt jpt, boolean z) {
        int i = 0;
        jpt.A06.setVisible(z, false);
        jpt.A0L.setVisibility(DbW.A01(z ? 1 : 0));
        C71662eb r0 = jpt.A07;
        if (z) {
            i = 8;
        }
        r0.A03(i);
    }

    public final void D1v(C278014w6 r5, AnonymousClass1Xp r6, int i) {
        UserSession userSession = this.A05;
        C56587I2r.A01(r6, userSession);
        I2F.A01(HNS.CLEAR_MEDIA_COVER, HNP.A00(r5), r6, userSession, this.A0B);
    }

    public final void DVE(C278014w6 r5, AnonymousClass1Xp r6, int i) {
        if (r6 instanceof 1Xj) {
            r5.getActionUrl().getClass();
            UserSession userSession = this.A05;
            AnonymousClass4DU r2 = this.A0B;
            HNS hns = HNS.OPEN_BLOKS_APP;
            hns.A00 = r5.getActionUrl();
            I2F.A01(hns, HNP.A00(r5), r6, userSession, r2);
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.igtv.model.IGTVViewerLoggingToken, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60708Jpt(android.content.Context r26, android.view.View r27, com.instagram.common.session.UserSession r28, X.AnonymousClass4DU r29, X.MSR r30, X.EXG r31, X.I9I r32, X.JSz r33, boolean r34, boolean r35) {
        /*
            r25 = this;
            r6 = 2131165196(0x7f07000c, float:1.7944602E38)
            r5 = 2131165231(0x7f07002f, float:1.7944673E38)
            r2 = r27
            r1 = r28
            r0 = r30
            r4 = r33
            X.C51974G9v.A1P(r2, r0, r1, r4)
            r3 = 5
            r9 = r29
            X.0qQ.A0B(r9, r3)
            r3 = r25
            r3.<init>(r2)
            r3.A0D = r0
            r3.A04 = r1
            r3.A0E = r4
            r3.A0A = r9
            com.instagram.igtv.model.IGTVViewerLoggingToken r8 = new com.instagram.igtv.model.IGTVViewerLoggingToken
            r8.<init>()
            r3.A0F = r8
            r4 = r34
            r3.A0I = r4
            r4 = r35
            r3.A0H = r4
            java.lang.String r7 = r9.getModuleName()
            r3.A0G = r7
            r3.A0B = r9
            r3.A0O = r0
            r3.A05 = r1
            r4 = r31
            java.lang.String r4 = r4.A00
            r8.A03 = r4
            r8.A05 = r7
            X.Ki5 r4 = X.C62572Ki5.THUMBNAIL
            java.lang.String r4 = r4.A00
            r8.A02 = r4
            r4 = 2131435072(0x7f0b1e40, float:1.8491976E38)
            android.widget.TextView r4 = X.DbU.A0G(r2, r4)
            r3.A0M = r4
            r4 = 2131443595(0x7f0b3f8b, float:1.8509263E38)
            android.widget.TextView r7 = X.DbU.A0G(r2, r4)
            r3.A03 = r7
            boolean r4 = r3.A0I
            int r4 = X.DbW.A01(r4)
            r7.setVisibility(r4)
            boolean r4 = r2 instanceof com.instagram.ui.widget.base.AspectRatioFrameLayout
            if (r4 == 0) goto L_0x013a
            r4 = r2
        L_0x006d:
            com.instagram.ui.widget.base.AspectRatioFrameLayout r4 = (com.instagram.ui.widget.base.AspectRatioFrameLayout) r4
            r3.A0P = r4
            r4 = 2131430890(0x7f0b0dea, float:1.8483494E38)
            android.view.View r4 = r2.requireViewById(r4)
            r3.A0K = r4
            r7 = 2131433909(0x7f0b19b5, float:1.8489617E38)
            X.2eb r7 = X.DbY.A0T(r2, r7)
            r3.A07 = r7
            r7 = 2131435899(0x7f0b217b, float:1.8493653E38)
            android.view.ViewStub r7 = X.DbS.A0F(r2, r7)
            X.3v7 r7 = X.C256013v5.A00(r7)
            r3.A0C = r7
            r7 = 2131436321(0x7f0b2321, float:1.849451E38)
            android.view.View r7 = r2.requireViewById(r7)
            r3.A0L = r7
            android.view.View r8 = r3.itemView
            r7 = 2131441049(0x7f0b3599, float:1.8504099E38)
            X.2eb r7 = X.DbY.A0T(r8, r7)
            r3.A09 = r7
            r7 = 2131443819(0x7f0b406b, float:1.8509717E38)
            android.widget.TextView r7 = X.DbU.A0G(r2, r7)
            r3.A0N = r7
            r7 = 2131441158(0x7f0b3606, float:1.850432E38)
            android.view.View r8 = r2.requireViewById(r7)
            r3.A02 = r8
            boolean r7 = r3.A0H
            int r7 = X.DbW.A01(r7)
            r8.setVisibility(r7)
            android.view.View r8 = r3.itemView
            r7 = 2131434673(0x7f0b1cb1, float:1.8491167E38)
            X.2eb r7 = X.DbY.A0T(r8, r7)
            r3.A08 = r7
            r7 = 2131099669(0x7f060015, float:1.7811698E38)
            r10 = r26
            int r17 = r10.getColor(r7)
            int r7 = X.2Yu.A0C(r10)
            int r18 = r10.getColor(r7)
            r21 = 0
            r12 = 1056964608(0x3f000000, float:0.5)
            r15 = 1058642330(0x3f19999a, float:0.6)
            r13 = 0
            r19 = 300(0x12c, double:1.48E-321)
            r16 = -1
            r11 = 1045220557(0x3e4ccccd, float:0.2)
            X.JdE r9 = new X.JdE
            r14 = r11
            r22 = r21
            r23 = r21
            r24 = r21
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24)
            r3.A06 = r9
            r4.setBackground(r9)
            r4 = r32
            r3.A00 = r4
            android.content.res.Resources r9 = r2.getResources()
            r4 = 2131492889(0x7f0c0019, float:1.8609243E38)
            int r8 = r9.getInteger(r4)
            int r7 = r8 + -1
            int r4 = r9.getDimensionPixelSize(r6)
            int r6 = r4 * 2
            int r4 = r9.getDimensionPixelSize(r5)
            int r7 = r7 * r4
            int r6 = r6 + r7
            int r4 = X.0nA.A09(r10)
            int r4 = r4 - r6
            int r4 = r4 / r8
            float r5 = (float) r4
            r4 = 1059363750(0x3f249ba6, float:0.643)
            int r4 = X.JTO.A04(r5, r4)
            r3.A0J = r4
            X.2eS.A01(r2)
            r4 = 26
            X.LYA.A01(r2, r1, r3, r0, r4)
            r4 = 4
            X.LYV r0 = new X.LYV
            r0.<init>(r4, r3, r1)
            r2.setOnLongClickListener(r0)
            return
        L_0x013a:
            r4 = 2131428160(0x7f0b0340, float:1.8477957E38)
            android.view.View r4 = r2.requireViewById(r4)
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60708Jpt.<init>(android.content.Context, android.view.View, com.instagram.common.session.UserSession, X.4DU, X.MSR, X.EXG, X.I9I, X.JSz, boolean, boolean):void");
    }

    public static final void A00(C60005JdE jdE, C71662eb r5, MXT mxt, Integer num) {
        View A012 = r5.A01();
        0qQ.A07(A012);
        Bitmap bitmap = jdE.A01;
        if (bitmap != null) {
            A012.setBackground(new BitmapDrawable(A012.getResources(), BlurUtil.blur(bitmap, 0.1f, 6)));
        }
        if (mxt.CWu()) {
            mxt.BPf();
        } else if (mxt.Ahy() == null) {
            return;
        }
        View A013 = r5.A01();
        0qQ.A07(A013);
        0qQ.A0B(num, 0);
        View findViewById = A013.findViewById(R.id.hidden_item_title);
        View findViewById2 = A013.findViewById(R.id.hidden_item_description);
        View findViewById3 = A013.findViewById(R.id.hidden_item_button);
        View findViewById4 = A013.findViewById(R.id.hidden_item_see_why);
        ImageView A0G2 = DbS.A0G(A013, R.id.hidden_item_icon);
        if (num.intValue() == 0) {
            JTT.A14(findViewById, findViewById2, findViewById3, 8);
            findViewById4.setVisibility(8);
            A0G2.setImageResource(R.drawable.instagram_eye_off_pano_outline_24);
        }
    }
}
