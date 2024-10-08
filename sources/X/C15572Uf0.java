package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Uf0  reason: case insensitive filesystem */
public final class C15572Uf0 extends C336937fQ {
    public final int A00 = 3;
    public final Context A01;
    public final X3C A02;
    public final X6E A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C15572Uf0(Context context, X3C x3c, X6E x6e, AnonymousClass0iw r5, UserSession userSession, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = context;
        this.A05 = userSession;
        this.A04 = r5;
        this.A03 = x6e;
        this.A02 = x3c;
        this.A08 = z;
        this.A09 = z2;
        this.A06 = z3;
        this.A07 = z4;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [android.widget.ImageView, com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    /* JADX WARNING: type inference failed for: r5v4, types: [android.widget.ImageView, com.instagram.igds.components.imagebutton.IgImageButton, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r1 != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r43, android.view.View r44, android.view.ViewGroup r45, java.lang.Object r46, java.lang.Object r47) {
        /*
            r42 = this;
            r25 = r47
            r13 = r46
            r0 = -1718819599(0xffffffff998ce4f1, float:-1.456813E-23)
            int r24 = X.AnonymousClass0fD.A03(r0)
            boolean r1 = X.AnonymousClass7TF.A1V(r44)
            r0 = -1912834628(0xffffffff8dfc75bc, float:-1.5559043E-30)
            int r18 = X.AnonymousClass0fD.A03(r0)
            r2 = r42
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x0020
            r40 = 1
            if (r1 == 0) goto L_0x0022
        L_0x0020:
            r40 = 0
        L_0x0022:
            android.content.Context r9 = r2.A01
            int r12 = r2.A00
            boolean r4 = r2.A09
            r0 = 0
            X.0qQ.A0B(r9, r0)
            android.content.res.Resources r1 = r9.getResources()
            r11 = 2131165672(0x7f0701e8, float:1.7945568E38)
            int r17 = r1.getDimensionPixelSize(r11)
            int r1 = X.AnonymousClass7TF.A02(r9, r11)
            int r6 = X.AnonymousClass0nB.A01(r9)
            int r15 = r12 + -1
            int r1 = r1 * r15
            int r6 = r6 - r1
            int r6 = r6 / r12
            android.util.DisplayMetrics r3 = X.0nA.A0H(r9)
            if (r4 == 0) goto L_0x0112
            r4 = 1058013184(0x3f100000, float:0.5625)
        L_0x004c:
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r9)
            X.Vg7 r10 = new X.Vg7
            r10.<init>(r3)
            r8 = 0
        L_0x0057:
            if (r8 >= r12) goto L_0x011e
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r9)
            r1 = 2131626308(0x7f0e0944, float:1.8879849E38)
            android.view.View r1 = r5.inflate(r1, r3, r0)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r1 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r1
            r1.A00 = r4
            r5 = 2131431335(0x7f0b0fa7, float:1.8484396E38)
            android.view.View r5 = r1.requireViewById(r5)
            com.instagram.igds.components.imagebutton.IgImageButton r5 = (com.instagram.igds.components.imagebutton.IgImageButton) r5
            r5.A00 = r4
            r5.setEnableTouchOverlay(r0)
            int r7 = X.2Yu.A04(r9)
            int r35 = r9.getColor(r7)
            r28 = 0
            r32 = 1058642330(0x3f19999a, float:0.6)
            r39 = 1
            r36 = 200(0xc8, double:9.9E-322)
            r31 = 1045220557(0x3e4ccccd, float:0.2)
            X.JdE r16 = new X.JdE
            r29 = r28
            r30 = r28
            r33 = r0
            r34 = r0
            r38 = r0
            r41 = r0
            r26 = r16
            r27 = r9
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r39, r40, r41)
            r7 = r16
            r5.setImageDrawable(r7)
            r7 = 2131429351(0x7f0b07e7, float:1.8480372E38)
            android.view.View r27 = r1.requireViewById(r7)
            r7 = 2131436531(0x7f0b23f3, float:1.8494935E38)
            android.widget.TextView r32 = X.DbU.A0G(r1, r7)
            r7 = 2131431337(0x7f0b0fa9, float:1.84844E38)
            android.widget.TextView r33 = X.DbU.A0G(r1, r7)
            r7 = 2131441035(0x7f0b358b, float:1.850407E38)
            android.view.View r28 = r1.requireViewById(r7)
            r7 = 2131436045(0x7f0b220d, float:1.849395E38)
            android.view.View r14 = r1.requireViewById(r7)
            android.widget.CheckBox r14 = (android.widget.CheckBox) r14
            r7 = 2131432453(0x7f0b1405, float:1.8486664E38)
            android.view.ViewStub r29 = X.DbU.A0D(r1, r7)
            r7 = 2131442963(0x7f0b3d13, float:1.850798E38)
            android.view.ViewStub r30 = X.DbU.A0D(r1, r7)
            r7 = 2131436013(0x7f0b21ed, float:1.8493884E38)
            android.widget.TextView r34 = X.DbU.A0G(r1, r7)
            r7 = 2131442831(0x7f0b3c8f, float:1.8507713E38)
            android.widget.TextView r35 = X.DbU.A0G(r1, r7)
            X.Wb3 r7 = new X.Wb3
            r26 = r7
            r31 = r14
            r36 = r16
            r37 = r5
            r38 = r1
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r1.setTag(r7)
            java.util.List r1 = r10.A01
            r1.add(r7)
            r1 = -2
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r6, r1)
            r1 = r17
            if (r8 != r15) goto L_0x0107
            r1 = 0
        L_0x0107:
            r5.rightMargin = r1
            com.instagram.ui.widget.framelayout.MediaFrameLayout r1 = r7.A0E
            r3.addView(r1, r5)
            int r8 = r8 + 1
            goto L_0x0057
        L_0x0112:
            X.0qQ.A0B(r3, r0)
            int r1 = r3.widthPixels
            float r4 = (float) r1
            int r1 = r3.heightPixels
            float r1 = (float) r1
            float r4 = r4 / r1
            goto L_0x004c
        L_0x011e:
            r3.setTag(r10)
            r4 = -281377955(0xffffffffef3a835d, float:-5.772302E28)
            r1 = r18
            X.AnonymousClass0fD.A0A(r4, r1)
            X.VVA r13 = (X.VVA) r13
            r1 = r25
            X.Ult r1 = (X.C15977Ult) r1
            r25 = r1
            r1 = 366434710(0x15d75996, float:8.697915E-26)
            int r23 = X.AnonymousClass0fD.A03(r1)
            X.04u r7 = new X.04u
            r7.<init>(r0)
            X.X3C r1 = r2.A02
            if (r1 == 0) goto L_0x0145
            java.util.Set r7 = r1.Brl()
        L_0x0145:
            java.lang.Object r10 = X.DbT.A0o(r3)
            X.Vg7 r10 = (X.C17795Vg7) r10
            X.71g r1 = r13.A00
            r36 = r1
            java.util.List r1 = r13.A02
            r30 = r1
            X.0iw r1 = r2.A04
            r35 = r1
            X.X6E r8 = r2.A03
            r1 = r25
            boolean r1 = r1 instanceof X.C15975Ulr
            if (r1 == 0) goto L_0x0331
            r1 = r25
            X.Ulr r1 = (X.C15975Ulr) r1
            X.UdK r1 = r1.A00
            boolean r6 = r1.A02
        L_0x0167:
            boolean r1 = r2.A06
            r22 = r1
            boolean r1 = r2.A07
            r21 = r1
            com.instagram.common.session.UserSession r9 = r2.A05
            X.0qQ.A0B(r10, r0)
            r5 = 1
            r4 = 3
            r2 = r36
            r1 = r30
            int r20 = X.DbW.A02(r5, r2, r1)
            r1 = r35
            X.DbW.A1N(r1, r4, r8)
            r1 = 7
            X.C51969G9p.A1N(r7, r1, r9)
            android.view.View r2 = r10.A00
            r1 = r25
            boolean r1 = r1.A04
            if (r1 == 0) goto L_0x032b
            r1 = 0
        L_0x0190:
            X.0nA.A0X(r2, r1)
            java.util.List r1 = r10.A01
            r34 = r1
            int r19 = r34.size()
            r10 = 0
        L_0x019c:
            r1 = r19
            if (r10 >= r1) goto L_0x0334
            r1 = r34
            java.lang.Object r12 = r1.get(r10)
            X.Wb3 r12 = (X.C19517Wb3) r12
            int r1 = r36.A01()
            if (r10 >= r1) goto L_0x0326
            r1 = r36
            java.lang.Object r11 = r1.A02(r10)
            X.Vbs r11 = (X.C17662Vbs) r11
            java.lang.Integer r1 = r11.A05
            int r2 = r1.intValue()
            if (r2 == r4) goto L_0x0222
            r1 = r20
            if (r2 == r1) goto L_0x01f3
            X.C18129Vlx.A00(r12)
            if (r2 == r5) goto L_0x01d0
            com.instagram.ui.widget.framelayout.MediaFrameLayout r2 = r12.A0E
            r1 = 4
            r2.setVisibility(r1)
        L_0x01cd:
            int r10 = r10 + 1
            goto L_0x019c
        L_0x01d0:
            com.instagram.ui.widget.framelayout.MediaFrameLayout r2 = r12.A0E
            r13 = 0
            r2.setVisibility(r0)
            int r1 = r12.A01
            r2.setBackgroundColor(r1)
            if (r6 == 0) goto L_0x01e5
            android.widget.CheckBox r1 = r12.A04
            r1.setVisibility(r0)
            r1.setChecked(r0)
        L_0x01e5:
            long r1 = r11.A01
            int r11 = r11.A00
            if (r11 != 0) goto L_0x021e
            r14 = 0
            int r11 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r11 == 0) goto L_0x021e
            r13 = 1
            goto L_0x021e
        L_0x01f3:
            X.C18129Vlx.A00(r12)
            X.WNP r1 = new X.WNP
            r1.<init>(r11, r8)
            r12.A00 = r1
            com.instagram.ui.widget.framelayout.MediaFrameLayout r2 = r12.A0E
            r13 = 0
            r2.setVisibility(r0)
            int r1 = r12.A01
            r2.setBackgroundColor(r1)
            android.widget.CheckBox r2 = r12.A04
            r1 = 8
            r2.setVisibility(r1)
            r2.setChecked(r0)
            X.2eb r1 = r12.A0C
            r1.A03(r0)
            int r1 = r11.A00
            if (r1 != 0) goto L_0x021c
            r13 = 1
        L_0x021c:
            long r1 = r11.A01
        L_0x021e:
            X.C18129Vlx.A01(r12, r1, r13)
            goto L_0x01cd
        L_0x0222:
            r1 = r25
            int r1 = r1.A00
            r18 = r1
            java.lang.String r1 = r11.A06
            boolean r16 = r7.contains(r1)
            X.C18129Vlx.A00(r12)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r1 = r12.A0E
            r17 = r1
            r1.setVisibility(r0)
            com.instagram.igds.components.imagebutton.IgImageButton r14 = r12.A0D
            r14.setVisibility(r0)
            X.1Xj r13 = r11.A02
            r13.getClass()
            com.instagram.common.typedurl.ImageUrl r15 = r13.A1Q()
            boolean r1 = r13.A6b(r9)
            if (r1 == 0) goto L_0x0319
            android.content.Context r1 = r17.getContext()
            android.content.res.Resources r15 = r1.getResources()
            r2 = 2131231519(0x7f08031f, float:1.8079121E38)
            android.content.res.Resources$Theme r1 = r1.getTheme()
            android.graphics.drawable.Drawable r1 = r15.getDrawable(r2, r1)
            r14.setImageDrawable(r1)
        L_0x0262:
            X.WNQ r1 = new X.WNQ
            r26 = r1
            r27 = r11
            r28 = r8
            r29 = r12
            r31 = r18
            r32 = r10
            r33 = r16
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            r12.A00 = r1
            r14 = 8
            android.widget.CheckBox r2 = r12.A04
            if (r6 == 0) goto L_0x030f
            r2.setVisibility(r0)
            r1 = r16
            r2.setChecked(r1)
            android.view.View r2 = r12.A03
            int r1 = X.DbW.A01(r16)
            r2.setVisibility(r1)
        L_0x028e:
            int r1 = r11.A00
            boolean r15 = X.AnonymousClass7TF.A1Q(r1)
            long r1 = r11.A01
            X.C18129Vlx.A01(r12, r1, r15)
            X.3uh r1 = r11.A04
            r1.getClass()
            boolean r2 = r1.A1H()
            X.2eb r1 = r12.A0B
            if (r2 == 0) goto L_0x030b
            r1.A03(r0)
        L_0x02a9:
            if (r22 == 0) goto L_0x02b0
            android.widget.TextView r1 = r12.A06
            r1.setVisibility(r0)
        L_0x02b0:
            if (r21 == 0) goto L_0x01cd
            X.1Xy r1 = r13.A0C
            java.lang.Long r1 = r1.AcM()
            if (r1 == 0) goto L_0x01cd
            long r13 = java.lang.System.currentTimeMillis()
            android.widget.TextView r12 = r12.A08
            long r1 = r1.longValue()
            long r1 = r1 - r13
            android.content.Context r11 = r17.getContext()
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r17 = r14.toDays(r1)
            r15 = 1
            int r13 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r13 <= 0) goto L_0x02e8
            r2 = 2131953156(0x7f130604, float:1.9542775E38)
        L_0x02d8:
            java.lang.Long r1 = java.lang.Long.valueOf(r17)
            java.lang.String r1 = X.DbW.A0h(r11, r1, r2)
        L_0x02e0:
            r12.setText(r1)
            r12.setVisibility(r0)
            goto L_0x01cd
        L_0x02e8:
            int r13 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r13 != 0) goto L_0x02f4
            r2 = 2131953155(0x7f130603, float:1.9542773E38)
        L_0x02ef:
            java.lang.String r1 = r11.getString(r2)
            goto L_0x02e0
        L_0x02f4:
            long r17 = r14.toHours(r1)
            int r1 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r1 <= 0) goto L_0x0300
            r2 = 2131953159(0x7f130607, float:1.9542781E38)
            goto L_0x02d8
        L_0x0300:
            int r1 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            r2 = 2131953160(0x7f130608, float:1.9542783E38)
            if (r1 != 0) goto L_0x02ef
            r2 = 2131953158(0x7f130606, float:1.954278E38)
            goto L_0x02ef
        L_0x030b:
            r1.A03(r14)
            goto L_0x02a9
        L_0x030f:
            r2.setVisibility(r14)
            android.view.View r1 = r12.A03
            r1.setVisibility(r14)
            goto L_0x028e
        L_0x0319:
            if (r15 == 0) goto L_0x0262
            X.JdE r2 = r12.A09
            java.lang.String r1 = r35.getModuleName()
            r2.A02(r15, r1)
            goto L_0x0262
        L_0x0326:
            X.C18129Vlx.A00(r12)
            goto L_0x01cd
        L_0x032b:
            int r1 = X.JTT.A05(r2, r11)
            goto L_0x0190
        L_0x0331:
            r6 = 0
            goto L_0x0167
        L_0x0334:
            r1 = -1324343526(0xffffffffb1101f1a, float:-2.0972437E-9)
            r0 = r23
            X.AnonymousClass0fD.A0A(r1, r0)
            r1 = 1716020882(0x66486692, float:2.3659135E23)
            r0 = r24
            X.AnonymousClass0fD.A0A(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15572Uf0.getView(int, android.view.View, android.view.ViewGroup, java.lang.Object, java.lang.Object):android.view.View");
    }
}
