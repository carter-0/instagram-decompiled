package X;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.facebook.rtc.views.omnigrid.GridItemSize;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Nep  reason: case insensitive filesystem */
public final class C69110Nep extends C71135OdY {
    public C15048ULb A00;
    public N9H A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final Activity A05;
    public final View A06;
    public final UserSession A07;
    public final OEO A08;
    public final OKY A09;
    public final C71111Ocu A0A;
    public final PML A0B;
    public final OIG A0C;
    public final Map A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G = C73894PlV.A00(this, 10);
    public final AnonymousClass0eM A0H = C73894PlV.A00(this, 11);
    public final AnonymousClass0eM A0I = C73894PlV.A00(this, 12);
    public final AnonymousClass0eM A0J = C73894PlV.A00(this, 13);
    public final AnonymousClass0eM A0K = AnonymousClass1YB.A00(C73870Pl7.A00);
    public final AnonymousClass0eM A0L;
    public final AnonymousClass0eM A0M = C73894PlV.A00(this, 15);
    public final AnonymousClass0eM A0N;
    public final AnonymousClass0eM A0O;
    public final AnonymousClass0eM A0P = C73894PlV.A00(this, 18);
    public final AnonymousClass0eM A0Q = C73894PlV.A00(this, 19);
    public final AnonymousClass0eM A0R;
    public final AnonymousClass0eM A0S = C73894PlV.A00(this, 21);
    public final AnonymousClass0iw A0T;
    public final boolean A0U;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69110Nep(Activity activity, View view, AnonymousClass0iw r25, UserSession userSession, 2el r27, OEO oeo, OKY oky, C71111Ocu ocu) {
        super(DbS.A0z(N9H.class));
        OKY oky2 = oky;
        C71111Ocu ocu2 = ocu;
        AnonymousClass7TG.A1R(ocu2, oky2);
        OEO oeo2 = oeo;
        0qQ.A0B(oeo2, 6);
        View view2 = view;
        this.A06 = view2;
        AnonymousClass0iw r11 = r25;
        this.A0T = r11;
        UserSession userSession2 = userSession;
        this.A07 = userSession2;
        this.A0A = ocu2;
        this.A09 = oky2;
        this.A08 = oeo2;
        Activity activity2 = activity;
        this.A05 = activity2;
        boolean A062 = 182.A06(0Tu.A06, userSession2, 36323324401495123L);
        this.A0U = A062;
        View A0A2 = C66581MXm.A0A(activity2);
        C66580MXl.A1R(A0A2);
        0sK phQ = new C73651PhQ(this, 1);
        C70525O9y o9y = new C70525O9y(this);
        C73588PgO A15 = C66580MXl.A15(this, 60);
        0sL pgi = new C73607Pgi(this, 10);
        C73588PgO A152 = C66580MXl.A15(this, 61);
        C73588PgO A153 = C66580MXl.A15(this, 62);
        C71536OmX omX = (C71536OmX) this.A0G.getValue();
        C73588PgO A154 = C66580MXl.A15(this, 63);
        this.A0B = new PML(view2, (ViewGroup) A0A2, omX, (C71537OmY) this.A0H.getValue(), r11, r27, o9y, (C70526O9z) this.A0I.getValue(), A15, A152, A153, A154, pgi, phQ, A062);
        this.A0C = new OIG(activity2);
        this.A0N = C73894PlV.A00(this, 16);
        this.A00 = new C15048ULb(6);
        this.A0L = C73894PlV.A00(this, 14);
        this.A0E = C73894PlV.A00(this, 9);
        this.A0F = AnonymousClass1YB.A00(C73869Pl6.A00);
        this.A0O = C73894PlV.A00(this, 17);
        this.A0R = C73894PlV.A00(this, 20);
        this.A0D = AnonymousClass7TE.A1H();
    }

    public static final Rect A00(C69110Nep nep) {
        if (nep.A00.A00 > 0) {
            View view = nep.A06;
            return new Rect(0, 0, view.getWidth(), view.getHeight() - nep.A00.A00);
        }
        Rect A0W = AnonymousClass7TE.A0W();
        nep.A06.getGlobalVisibleRect(A0W);
        return A0W;
    }

    private final void A01() {
        PML pml = this.A0B;
        if (!pml.A02()) {
            C15048ULb uLb = this.A00;
            int i = uLb.A02;
            int i2 = uLb.A01;
            AnonymousClass0eM r3 = pml.A0B;
            ViewGroup A0C2 = C66583MXo.A0C(r3);
            AnonymousClass0eM r2 = pml.A0E;
            if (A0C2.indexOfChild(AnonymousClass7TE.A0c(r2)) != -1) {
                C66583MXo.A0C(r3).removeView(AnonymousClass7TE.A0c(r2));
                DbU.A11(pml.A02.getContext(), AnonymousClass7TE.A0c(r2), R.drawable.floating_participants_background);
                pml.A01(i, i2);
                AnonymousClass0eM r32 = pml.A0A;
                View A0c = AnonymousClass7TE.A0c(r32);
                0qQ.A0B(A0c, 0);
                A0c.setOutlineProvider((ViewOutlineProvider) null);
                A0c.setClipToOutline(false);
                pml.A03.addView(AnonymousClass7TE.A0c(r32));
            }
        }
    }

    private final void A02(int i) {
        C68294N9h n9h;
        C68294N9h n9h2 = (C68294N9h) this.A01;
        if (n9h2 != null && n9h2.A0B) {
            if (182.A06(0Tu.A06, this.A07, 36323324401691734L)) {
                this.A0A.A05(new PNO(i));
            }
        }
        if (this.A0U && (n9h = (C68294N9h) this.A01) != null && n9h.A09) {
            A03(this);
        }
        if (AnonymousClass7TF.A1Z(this.A0K)) {
            this.A06.post(new C73267PZl(this, i));
        }
    }

    public static final void A03(C69110Nep nep) {
        C68294N9h n9h;
        C69110Nep nep2 = nep;
        nep2.A0A.A05(POO.A00);
        C68294N9h n9h2 = (C68294N9h) nep2.A01;
        boolean z = false;
        if (n9h2 != null) {
            if (n9h2.A09) {
                z = true;
            }
            n9h = C68294N9h.A00((C59721JVf) null, (N3V) null, n9h2, (List) null, (List) null, (Map) null, 65535, false, false, false, false, false, false, false, false, !z);
        } else {
            n9h = null;
        }
        nep2.A0J(n9h);
    }

    private final void A04(boolean z) {
        C68294N9h n9h = (C68294N9h) this.A01;
        if (n9h == null) {
            n9h = C70905OQx.A00();
        }
        AnonymousClass0eM r1 = this.A0N;
        A0J(C68294N9h.A00(((OWU) r1.getValue()).A00, ((OWU) r1.getValue()).A01, n9h, (List) null, (List) null, (Map) null, 116735, false, false, false, false, false, z, false, false, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0424, code lost:
        if (r1.A05 == true) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x043e, code lost:
        if (r1.A07 != true) goto L_0x0440;
     */
    /* JADX WARNING: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0K(X.C74272Ps0 r37) {
        /*
            r36 = this;
            r7 = r37
            r3 = 0
            boolean r1 = r7 instanceof X.C72863PMz
            r6 = 1
            r4 = 0
            r0 = r36
            if (r1 == 0) goto L_0x0038
            X.PMz r7 = (X.C72863PMz) r7
            X.87G r1 = r7.A00
            com.instagram.camera.effect.models.CameraAREffect r1 = r1.A00()
            if (r1 == 0) goto L_0x0037
            java.util.List r2 = r1.A08()
            java.lang.String r1 = "tapGestures"
            boolean r1 = r2.contains(r1)
            if (r1 != r6) goto L_0x0037
            X.PML r0 = r0.A0B
            X.0eM r1 = r0.A0E
            java.lang.Object r0 = r1.getValue()
            com.facebook.rtc.views.omnigridview.OmniGridView r0 = (com.facebook.rtc.views.omnigridview.OmniGridView) r0
            r0.setShouldInterceptChildTouchEventsForFloatingView(r3)
            java.lang.Object r0 = r1.getValue()
            com.facebook.rtc.views.omnigridview.OmniGridView r0 = (com.facebook.rtc.views.omnigridview.OmniGridView) r0
            r0.setShouldDisableDraggingForFloatingView(r6)
        L_0x0037:
            return
        L_0x0038:
            boolean r1 = r7 instanceof X.C72853PMp
            if (r1 == 0) goto L_0x0053
            X.PML r0 = r0.A0B
            X.0eM r1 = r0.A0E
            java.lang.Object r0 = r1.getValue()
            com.facebook.rtc.views.omnigridview.OmniGridView r0 = (com.facebook.rtc.views.omnigridview.OmniGridView) r0
            r0.setShouldInterceptChildTouchEventsForFloatingView(r6)
            java.lang.Object r0 = r1.getValue()
            com.facebook.rtc.views.omnigridview.OmniGridView r0 = (com.facebook.rtc.views.omnigridview.OmniGridView) r0
            r0.setShouldDisableDraggingForFloatingView(r3)
            return
        L_0x0053:
            boolean r1 = r7 instanceof X.C72864PNa
            if (r1 == 0) goto L_0x0141
            X.PNa r7 = (X.C72864PNa) r7
            int r9 = r7.A02
            X.ULb r4 = r0.A00
            int r1 = r4.A03
            int r1 = r9 - r1
            int r1 = java.lang.Math.abs(r1)
            r2 = 5
            boolean r5 = X.C51970G9q.A1W(r1, r2)
            int r8 = r7.A00
            int r1 = r4.A00
            int r1 = r8 - r1
            int r1 = java.lang.Math.abs(r1)
            boolean r2 = X.C51970G9q.A1W(r1, r2)
            boolean r1 = r0.A03
            if (r1 != 0) goto L_0x0120
            boolean r1 = r0.A02
            if (r1 != 0) goto L_0x0120
            if (r5 != 0) goto L_0x0084
            if (r2 == 0) goto L_0x0120
        L_0x0084:
            int r11 = r4.A02
            int r12 = r4.A01
            r15 = 6
            X.ULb r10 = new X.ULb
            r13 = r9
            r14 = r8
            r10.<init>(r11, r12, r13, r14, r15)
            boolean r1 = r4.equals(r10)
            if (r1 != 0) goto L_0x0098
            r0.A00 = r10
        L_0x0098:
            X.OWU r13 = X.C71135OdY.A0D(r0)
            int r2 = r7.A03
            int r1 = r7.A01
            r13.A01()
            r21 = 7
            X.ULb r16 = new X.ULb
            r17 = r9
            r18 = r8
            r19 = r2
            r20 = r1
            r16.<init>(r17, r18, r19, r20, r21)
            X.N3e r1 = r13.A01()
            java.util.List r14 = r1.A08
            int r2 = r1.A06
            r21 = r2
            int r2 = r1.A05
            r20 = r2
            boolean r2 = r1.A0B
            r25 = r2
            boolean r2 = r1.A0F
            r26 = r2
            boolean r2 = r1.A0I
            r27 = r2
            boolean r2 = r1.A0E
            r28 = r2
            boolean r2 = r1.A09
            r19 = r2
            boolean r2 = r1.A0A
            r18 = r2
            float r2 = r1.A00
            r17 = r2
            boolean r15 = r1.A0G
            boolean r12 = r1.A0D
            int r11 = r1.A02
            int r10 = r1.A03
            int r5 = r1.A04
            int r4 = r1.A01
            boolean r2 = r1.A0C
            boolean r1 = r1.A0H
            X.0qQ.A0B(r14, r3)
            X.N3e r3 = new X.N3e
            r29 = r19
            r30 = r18
            r31 = r15
            r32 = r12
            r33 = r2
            r34 = r1
            r18 = r17
            r19 = r21
            r21 = r11
            r22 = r10
            r23 = r5
            r24 = r4
            r15 = r3
            r17 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r13.A02(r3)
            X.Ocu r3 = r0.A0A
            android.graphics.Rect r2 = A00(r0)
            X.PNP r1 = new X.PNP
            r1.<init>(r2)
            r3.A05(r1)
        L_0x0120:
            r0.A04(r6)
            X.PML r3 = r0.A0B
            boolean r1 = r3.A02()
            if (r1 == 0) goto L_0x0037
            int r1 = r7.A03
            int r9 = r9 + r1
            X.ULb r0 = r0.A00
            int r2 = r0.A02
            int r1 = java.lang.Math.max(r9, r2)
            int r0 = r7.A01
            int r8 = r8 + r0
            int r0 = java.lang.Math.max(r8, r2)
            r3.A01(r1, r0)
            return
        L_0x0141:
            boolean r1 = r7 instanceof X.PN5
            if (r1 == 0) goto L_0x01cd
            com.instagram.common.session.UserSession r5 = r0.A07
            X.0Tu r4 = X.0Tu.A05
            r1 = 36318286404655175(0x81074a00001847, double:3.031168792080529E-306)
            boolean r1 = X.182.A06(r4, r5, r1)
            if (r1 == 0) goto L_0x015b
            r1 = r7
            X.PN5 r1 = (X.PN5) r1
            boolean r1 = r1.A00
            r0.A04 = r1
        L_0x015b:
            X.OWU r14 = X.C71135OdY.A0D(r0)
            X.PN5 r7 = (X.PN5) r7
            boolean r1 = r7.A00
            r21 = r1
            X.N3e r1 = r14.A01()
            java.util.List r13 = r1.A08
            int r2 = r1.A06
            r19 = r2
            int r2 = r1.A05
            r20 = r2
            boolean r2 = r1.A0B
            r18 = r2
            boolean r2 = r1.A0F
            r17 = r2
            boolean r2 = r1.A0I
            r16 = r2
            boolean r15 = r1.A0E
            boolean r12 = r1.A09
            boolean r11 = r1.A0A
            float r10 = r1.A00
            boolean r9 = r1.A0G
            int r8 = r1.A02
            int r7 = r1.A03
            int r6 = r1.A04
            int r5 = r1.A01
            X.ULb r4 = r1.A07
            boolean r2 = r1.A0C
            boolean r1 = r1.A0H
            X.C51969G9p.A1R(r13, r3, r4)
            X.N3e r3 = new X.N3e
            r29 = r12
            r30 = r11
            r31 = r9
            r32 = r21
            r33 = r2
            r34 = r1
            r22 = r7
            r23 = r6
            r24 = r5
            r25 = r18
            r26 = r17
            r27 = r16
            r28 = r15
            r15 = r3
            r16 = r4
            r17 = r13
            r18 = r10
            r21 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
        L_0x01c2:
            r14.A02(r3)
        L_0x01c5:
            X.N9H r1 = r0.A01
            if (r1 == 0) goto L_0x0037
            r0.A0M(r1)
            return
        L_0x01cd:
            boolean r1 = r7 instanceof X.PNE
            if (r1 == 0) goto L_0x0241
            X.OWU r14 = X.C71135OdY.A0D(r0)
            X.PNE r7 = (X.PNE) r7
            int r2 = r7.A00
            X.ULb r1 = r0.A00
            int r13 = r1.A03
            android.view.View r1 = r14.A06
            int r22 = r1.getMeasuredHeight()
            int r22 = r22 - r2
            int r22 = r22 - r13
            X.N3e r1 = r14.A01()
            java.util.List r12 = r1.A08
            int r2 = r1.A06
            r19 = r2
            int r2 = r1.A05
            r20 = r2
            boolean r2 = r1.A0B
            r18 = r2
            boolean r2 = r1.A0F
            r17 = r2
            boolean r2 = r1.A0I
            r16 = r2
            boolean r15 = r1.A0E
            boolean r11 = r1.A09
            boolean r10 = r1.A0A
            float r9 = r1.A00
            boolean r8 = r1.A0G
            boolean r7 = r1.A0D
            int r6 = r1.A02
            int r5 = r1.A01
            X.ULb r4 = r1.A07
            boolean r2 = r1.A0C
            boolean r1 = r1.A0H
            X.C51969G9p.A1R(r12, r3, r4)
            X.N3e r3 = new X.N3e
            r29 = r11
            r30 = r10
            r31 = r8
            r32 = r7
            r33 = r2
            r34 = r1
            r23 = r13
            r24 = r5
            r25 = r18
            r26 = r17
            r27 = r16
            r28 = r15
            r15 = r3
            r16 = r4
            r17 = r12
            r18 = r9
            r21 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x01c2
        L_0x0241:
            boolean r1 = r7 instanceof X.PN6
            if (r1 == 0) goto L_0x02f3
            X.Pry r1 = r0.A01
            X.N9h r1 = (X.C68294N9h) r1
            if (r1 != 0) goto L_0x024f
            X.N9h r1 = X.C70905OQx.A00()
        L_0x024f:
            X.PN6 r7 = (X.PN6) r7
            boolean r6 = r7.A00
            r7 = 0
            r13 = 131070(0x1fffe, float:1.83668E-40)
            r8 = r7
            r9 = r1
            r10 = r7
            r11 = r7
            r12 = r7
            r14 = r6
            r15 = r3
            r16 = r3
            r17 = r3
            r18 = r3
            r19 = r3
            r20 = r3
            r21 = r3
            r22 = r3
            X.N9h r1 = X.C68294N9h.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0.A0J(r1)
            com.instagram.common.session.UserSession r5 = r0.A07
            X.0Tu r4 = X.0Tu.A05
            r1 = 36318286404655175(0x81074a00001847, double:3.031168792080529E-306)
            boolean r1 = X.182.A06(r4, r5, r1)
            if (r1 == 0) goto L_0x0284
            r0.A04 = r6
        L_0x0284:
            X.OWU r8 = X.C71135OdY.A0D(r0)
            X.N3e r9 = r8.A01()
            java.util.List r7 = r9.A08
            int r1 = r9.A06
            r22 = r1
            int r1 = r9.A05
            r21 = r1
            boolean r1 = r9.A0B
            r20 = r1
            boolean r1 = r9.A0F
            r19 = r1
            boolean r1 = r9.A0I
            r18 = r1
            boolean r1 = r9.A09
            r17 = r1
            boolean r1 = r9.A0A
            r16 = r1
            float r15 = r9.A00
            boolean r14 = r9.A0G
            boolean r13 = r9.A0D
            int r12 = r9.A02
            int r11 = r9.A03
            int r10 = r9.A04
            int r5 = r9.A01
            X.ULb r4 = r9.A07
            boolean r2 = r9.A0C
            boolean r9 = r9.A0H
            X.C51969G9p.A1R(r7, r3, r4)
            X.N3e r1 = new X.N3e
            r30 = r17
            r31 = r16
            r32 = r14
            r33 = r13
            r34 = r2
            r35 = r9
            r23 = r11
            r24 = r10
            r25 = r5
            r26 = r20
            r27 = r19
            r28 = r18
            r29 = r6
            r16 = r1
            r17 = r4
            r18 = r7
            r19 = r15
            r20 = r22
            r22 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r8.A02(r1)
            r0.A04(r3)
            return
        L_0x02f3:
            boolean r1 = r7 instanceof X.PN0
            if (r1 == 0) goto L_0x036d
            X.PN0 r7 = (X.PN0) r7
            int r8 = r7.A00
            boolean r1 = X.AnonymousClass7TF.A1R(r8)
            r0.A02 = r1
            boolean r1 = r0.A03
            if (r1 != 0) goto L_0x0037
            X.OWU r7 = X.C71135OdY.A0D(r0)
            X.ULb r1 = r0.A00
            int r1 = r1.A01
            int r8 = r8 + r1
            boolean r1 = r0.A02
            r16 = r1
            X.N3e r9 = r7.A01()
            java.util.List r5 = r9.A08
            int r1 = r9.A06
            r29 = r1
            int r1 = r9.A05
            r28 = r1
            boolean r1 = r9.A0B
            r18 = r1
            boolean r1 = r9.A0F
            r19 = r1
            boolean r1 = r9.A0I
            r20 = r1
            boolean r1 = r9.A0E
            r21 = r1
            boolean r15 = r9.A09
            boolean r14 = r9.A0A
            float r13 = r9.A00
            boolean r12 = r9.A0D
            int r11 = r9.A02
            int r10 = r9.A03
            int r4 = r9.A04
            X.ULb r2 = r9.A07
            boolean r1 = r9.A0C
            boolean r9 = r9.A0H
            X.C51969G9p.A1R(r5, r3, r2)
            X.N3e r3 = new X.N3e
            r22 = r15
            r23 = r14
            r24 = r16
            r25 = r12
            r26 = r1
            r27 = r9
            r14 = r11
            r15 = r10
            r16 = r4
            r17 = r8
            r8 = r3
            r9 = r2
            r10 = r5
            r11 = r13
            r12 = r29
            r13 = r28
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r7.A02(r3)
            r0.A04(r6)
            return
        L_0x036d:
            boolean r1 = r7 instanceof X.PN7
            if (r1 == 0) goto L_0x03db
            X.PN7 r7 = (X.PN7) r7
            X.OWU r9 = X.C71135OdY.A0D(r0)
            int r0 = r7.A00
            r32 = r0
            X.N3e r11 = r9.A01()
            java.util.List r10 = r11.A08
            int r0 = r11.A06
            r31 = r0
            int r0 = r11.A05
            r30 = r0
            boolean r0 = r11.A0B
            r17 = r0
            boolean r0 = r11.A0F
            r16 = r0
            boolean r15 = r11.A0I
            boolean r14 = r11.A0E
            boolean r13 = r11.A09
            boolean r12 = r11.A0A
            float r8 = r11.A00
            boolean r7 = r11.A0G
            boolean r6 = r11.A0D
            int r5 = r11.A03
            int r4 = r11.A04
            int r2 = r11.A01
            X.ULb r1 = r11.A07
            boolean r0 = r11.A0C
            boolean r11 = r11.A0H
            X.C51969G9p.A1R(r10, r3, r1)
            X.N3e r3 = new X.N3e
            r24 = r13
            r25 = r12
            r26 = r7
            r27 = r6
            r28 = r0
            r29 = r11
            r18 = r4
            r19 = r2
            r20 = r17
            r21 = r16
            r22 = r15
            r23 = r14
            r12 = r10
            r13 = r8
            r14 = r31
            r15 = r30
            r16 = r32
            r17 = r5
            r10 = r3
            r11 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r9.A02(r3)
            return
        L_0x03db:
            boolean r1 = r7 instanceof X.PO2
            if (r1 == 0) goto L_0x03fb
            X.PML r1 = r0.A0B
            X.0eM r1 = r1.A0E
            java.lang.Object r5 = r1.getValue()
            X.12T r2 = X.AnonymousClass12T.A00
            r4 = 0
            r1 = -18
            X.19S r3 = X.DbY.A0r(r2, r1)
            r2 = 11
            X.MGf r1 = new X.MGf
            r1.<init>((java.lang.Object) r5, (java.lang.Object) r0, (X.AnonymousClass4D7) r4, (int) r2)
            X.AnonymousClass7TE.A1Z(r1, r3)
            return
        L_0x03fb:
            boolean r1 = r7 instanceof X.C72887PNx
            r2 = 0
            if (r1 == 0) goto L_0x0428
            X.Pry r5 = r0.A01
            X.N9h r5 = (X.C68294N9h) r5
            if (r5 == 0) goto L_0x040d
            r1 = 114687(0x1bfff, float:1.60711E-40)
            X.N9h r2 = X.C68294N9h.A00((X.C59721JVf) null, (X.N3V) null, r5, (java.util.List) null, r2, r2, r1, false, false, false, false, false, false, false, false, false)
        L_0x040d:
            r0.A0J(r2)
            r0.A03 = r6
            X.OWU r1 = X.C71135OdY.A0D(r0)
            r1.A03(r6)
        L_0x0419:
            r0.A04(r3)
            X.Pry r1 = r0.A01
            X.N9h r1 = (X.C68294N9h) r1
            if (r1 == 0) goto L_0x05ea
            boolean r1 = r1.A05
            if (r1 != r6) goto L_0x05ea
            goto L_0x01c5
        L_0x0428:
            boolean r1 = r7 instanceof X.C72886PNw
            if (r1 == 0) goto L_0x046a
            X.Pry r5 = r0.A01
            X.N9h r5 = (X.C68294N9h) r5
            if (r5 == 0) goto L_0x045d
            X.N9H r1 = r0.A01
            if (r1 == 0) goto L_0x0440
            X.N9E r1 = r1.A01
            if (r1 == 0) goto L_0x0440
            boolean r1 = r1.A07
            r20 = 1
            if (r1 == r6) goto L_0x0442
        L_0x0440:
            r20 = 0
        L_0x0442:
            r13 = 114687(0x1bfff, float:1.60711E-40)
            r7 = r2
            r8 = r2
            r9 = r5
            r10 = r2
            r11 = r2
            r12 = r2
            r14 = r3
            r15 = r3
            r16 = r3
            r17 = r3
            r18 = r3
            r19 = r3
            r21 = r3
            r22 = r3
            X.N9h r2 = X.C68294N9h.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x045d:
            r0.A0J(r2)
            r0.A03 = r3
            X.OWU r1 = X.C71135OdY.A0D(r0)
            r1.A03(r3)
            goto L_0x0419
        L_0x046a:
            boolean r1 = r7 instanceof X.C72851PMn
            if (r1 == 0) goto L_0x049f
            X.Pry r4 = r0.A01
            X.N9h r4 = (X.C68294N9h) r4
            if (r4 == 0) goto L_0x0481
            X.0sn r3 = X.0sn.A00
            X.0sm r2 = X.0Yt.A0E()
            r1 = 96767(0x179ff, float:1.356E-40)
            X.N9h r2 = X.C68294N9h.A00((X.C59721JVf) null, (X.N3V) null, r4, (java.util.List) null, r3, r2, r1, false, false, false, false, false, false, false, false, false)
        L_0x0481:
            r0.A0J(r2)
            com.instagram.common.session.UserSession r4 = r0.A07
            X.0Tu r3 = X.0Tu.A05
            r1 = 36316173280808967(0x81055e00011007, double:3.02983244405132E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x0037
            X.OEO r0 = r0.A08
            java.lang.String r1 = "RtcStopAction"
            X.PxA r0 = r0.A00
            if (r0 == 0) goto L_0x0037
            r0.AG6(r1)
            return
        L_0x049f:
            boolean r1 = r7 instanceof X.C72850PMm
            if (r1 != 0) goto L_0x01c5
            boolean r1 = r7 instanceof X.PN3
            if (r1 == 0) goto L_0x051f
            X.PN3 r7 = (X.PN3) r7
            float r14 = r7.A00
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            r28 = 0
            if (r1 < 0) goto L_0x04b5
            r28 = 1
        L_0x04b5:
            r1 = 0
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x04bb
            r6 = 0
        L_0x04bb:
            X.OWU r13 = X.C71135OdY.A0D(r0)
            X.N3e r1 = r13.A01()
            java.util.List r12 = r1.A08
            int r2 = r1.A06
            r20 = r2
            int r2 = r1.A05
            r19 = r2
            boolean r2 = r1.A0B
            r18 = r2
            boolean r2 = r1.A0F
            r17 = r2
            boolean r2 = r1.A0I
            r16 = r2
            boolean r15 = r1.A0E
            boolean r11 = r1.A0G
            boolean r10 = r1.A0D
            int r9 = r1.A02
            int r8 = r1.A03
            int r7 = r1.A04
            int r5 = r1.A01
            X.ULb r4 = r1.A07
            boolean r2 = r1.A0C
            boolean r1 = r1.A0H
            X.C51969G9p.A1R(r12, r3, r4)
            X.N3e r3 = new X.N3e
            r29 = r6
            r30 = r11
            r31 = r10
            r32 = r2
            r33 = r1
            r22 = r7
            r23 = r5
            r24 = r18
            r25 = r17
            r26 = r16
            r27 = r15
            r16 = r12
            r17 = r14
            r18 = r20
            r20 = r9
            r21 = r8
            r14 = r3
            r15 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r13.A02(r3)
            r1 = 1
            r0.A04(r1)
            return
        L_0x051f:
            boolean r1 = r7 instanceof X.PNG
            if (r1 == 0) goto L_0x0588
            X.OWU r8 = X.C71135OdY.A0D(r0)
            X.PNG r7 = (X.PNG) r7
            boolean r1 = r7.A00
            r20 = r1
            X.N3e r10 = r8.A01()
            java.util.List r9 = r10.A08
            int r1 = r10.A06
            r31 = r1
            int r1 = r10.A05
            r30 = r1
            boolean r1 = r10.A0F
            r21 = r1
            boolean r1 = r10.A0I
            r22 = r1
            boolean r1 = r10.A0E
            r16 = r1
            boolean r15 = r10.A09
            boolean r14 = r10.A0A
            float r13 = r10.A00
            boolean r12 = r10.A0G
            boolean r11 = r10.A0D
            int r7 = r10.A02
            int r6 = r10.A03
            int r5 = r10.A04
            int r4 = r10.A01
            X.ULb r2 = r10.A07
            boolean r1 = r10.A0C
            boolean r10 = r10.A0H
            X.C51969G9p.A1R(r9, r3, r2)
            X.N3e r3 = new X.N3e
            r24 = r15
            r25 = r14
            r26 = r12
            r27 = r11
            r28 = r1
            r29 = r10
            r17 = r6
            r18 = r5
            r19 = r4
            r23 = r16
            r10 = r3
            r11 = r2
            r12 = r9
            r14 = r31
            r15 = r30
            r16 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r8.A02 = r3
            goto L_0x01c5
        L_0x0588:
            boolean r1 = r7 instanceof X.PNR
            if (r1 == 0) goto L_0x05b4
            boolean r1 = r0.A03
            if (r1 != 0) goto L_0x0037
            X.ULb r3 = r0.A00
            int r1 = r3.A02
            r2 = -1
            if (r1 == r2) goto L_0x059b
            int r1 = r3.A01
            if (r1 != r2) goto L_0x0037
        L_0x059b:
            X.PNR r7 = (X.PNR) r7
            int r5 = r7.A01
            int r6 = r7.A00
            int r7 = r3.A03
            int r8 = r3.A00
            r9 = 6
            X.ULb r4 = new X.ULb
            r4.<init>(r5, r6, r7, r8, r9)
            boolean r1 = r3.equals(r4)
            if (r1 != 0) goto L_0x0037
            r0.A00 = r4
            return
        L_0x05b4:
            boolean r1 = r7 instanceof X.C72875PNl
            if (r1 != 0) goto L_0x05ea
            boolean r1 = r7 instanceof X.C72856PMs
            if (r1 == 0) goto L_0x05c2
            X.PML r0 = r0.A0B
            r0.A00()
            return
        L_0x05c2:
            boolean r1 = r7 instanceof X.C72877PNn
            if (r1 == 0) goto L_0x05d4
            X.Pry r1 = r0.A01
            X.N9h r1 = (X.C68294N9h) r1
            if (r1 == 0) goto L_0x05d0
            X.N9h r2 = X.C68294N9h.A00((X.C59721JVf) null, (X.N3V) null, r1, (java.util.List) null, (java.util.List) null, (java.util.Map) null, 98303, false, false, false, false, false, false, false, false, false)
        L_0x05d0:
            r0.A0J(r2)
            return
        L_0x05d4:
            boolean r1 = r7 instanceof X.POC
            if (r1 != 0) goto L_0x05e6
            boolean r1 = r7 instanceof X.C68298N9l
            if (r1 == 0) goto L_0x0037
            X.N9l r7 = (X.C68298N9l) r7
            java.lang.String r1 = r7.A00
            if (r1 == 0) goto L_0x0037
            boolean r1 = r7.A01
            if (r1 == 0) goto L_0x0037
        L_0x05e6:
            r0.A01()
            return
        L_0x05ea:
            X.Pry r1 = r0.A01
            X.N9h r1 = (X.C68294N9h) r1
            if (r1 == 0) goto L_0x05f8
            java.util.List r1 = r1.A03
            if (r1 == 0) goto L_0x05f8
            int r4 = r1.size()
        L_0x05f8:
            r0.A02(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69110Nep.A0K(X.Ps0):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x020d, code lost:
        if (r7 != false) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x021d, code lost:
        if (r10 != false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0252, code lost:
        if (X.182.A06(r21, r55, 36315017934539719L) == false) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x037b, code lost:
        if (X.AnonymousClass7TF.A1Z(r0.A0Q) == false) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x044c, code lost:
        if (X.AnonymousClass7TE.A1b(r43) != false) goto L_0x044e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0458, code lost:
        if (r3.A0E != false) goto L_0x045a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04e8, code lost:
        if (r6.A06 != true) goto L_0x04ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04eb, code lost:
        if (r6 != null) goto L_0x04ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04ed, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04f0, code lost:
        if (r6.A07 == true) goto L_0x04f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04f2, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x04f3, code lost:
        if (r1 == null) goto L_0x04fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x04f5, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04f8, code lost:
        if (r1.A06 == true) goto L_0x04fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04fa, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x04fb, code lost:
        if (r1 == null) goto L_0x05b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04ff, code lost:
        if (r1.A07 != true) goto L_0x05b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0077, code lost:
        if (X.182.A06(X.0Tu.A05, r0.A07, 36329552104210612L) == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0501, code lost:
        r5.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0503, code lost:
        if (r11 != false) goto L_0x050e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0505, code lost:
        if (r6 == false) goto L_0x050e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0507, code lost:
        r5.A01.A00(X.C72805PKt.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x050e, code lost:
        if (r9 == false) goto L_0x0512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0510, code lost:
        if (r11 != false) goto L_0x05a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0512, code lost:
        if (r6 == false) goto L_0x05a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0514, code lost:
        if (r12 == false) goto L_0x05a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0516, code lost:
        r2 = r5.A01;
        r1 = X.C72803PKr.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x051a, code lost:
        r2.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x051d, code lost:
        r9 = (X.C68294N9h) r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0521, code lost:
        if (r9 != null) goto L_0x0527;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0523, code lost:
        r9 = X.C70905OQx.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0527, code lost:
        r6 = r3.A0F;
        r12 = r3.A05;
        r5 = r3.A0D;
        r2 = ((X.OWU) r54.getValue()).A01().A0B;
        r45 = X.0Yt.A0B(r10);
        r10 = ((X.OWU) r54.getValue()).A00;
        r1 = ((X.OWU) r54.getValue()).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x054d, code lost:
        if (r22 == false) goto L_0x0555;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0551, code lost:
        if (r0.A03 != false) goto L_0x0555;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0553, code lost:
        r53 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0555, code lost:
        A0J(X.C68294N9h.A00(r10, r1, r9, r43, r7, r45, 100465, false, r2, r6, r12, r5, false, r53, false, false));
        r1 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0579, code lost:
        if (r1 == null) goto L_0x0586;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x057b, code lost:
        r1 = r1.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x057d, code lost:
        if (r1 != false) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0581, code lost:
        if (r3.A0E == false) goto L_0x0586;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0583, code lost:
        A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0586, code lost:
        if (r8 == r6) goto L_0x058b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0588, code lost:
        A02(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x058b, code lost:
        r0.A01 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x058d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x058e, code lost:
        if (r1 != true) goto L_0x0586;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0592, code lost:
        if (r3.A0E != false) goto L_0x0586;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0594, code lost:
        r2 = r0.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x059a, code lost:
        if (r2.A02() == false) goto L_0x0586;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x059c, code lost:
        r2.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x05a0, code lost:
        if (r11 == false) goto L_0x051d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x05a2, code lost:
        if (r9 == false) goto L_0x05af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x05a4, code lost:
        if (r12 == false) goto L_0x05a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x05a6, code lost:
        if (r6 != false) goto L_0x051d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x05a8, code lost:
        r5.A01.A00(X.C72804PKs.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x05af, code lost:
        if (r6 != false) goto L_0x051d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x05b1, code lost:
        r2 = r5.A01;
        r1 = X.C72806PKu.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x05b7, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e0, code lost:
        if (r9 == false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r3.A0F != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f0, code lost:
        if (r14 != false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0100, code lost:
        if (r16 == false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0108, code lost:
        if (r16 != false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0137, code lost:
        if (r11 != false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0151, code lost:
        if (r1.A05 != false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x017a, code lost:
        if (X.182.A06(r21, r55, 36315017934539719L) == false) goto L_0x017c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0454  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x04e5  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x05ba  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x05bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M(X.N9H r58) {
        /*
            r57 = this;
            r17 = 0
            r3 = r58
            r0 = r17
            X.0qQ.A0B(r3, r0)
            java.util.Map r0 = r3.A03
            r56 = r0
            int r0 = r56.size()
            int r13 = r0 + 1
            java.util.ArrayList r27 = X.AnonymousClass7TE.A1C()
            r26 = 2
            r0 = r26
            if (r13 != r0) goto L_0x0023
            boolean r0 = r3.A0F
            r25 = 1
            if (r0 == 0) goto L_0x0025
        L_0x0023:
            r25 = 0
        L_0x0025:
            long r1 = r3.A00
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            boolean r6 = X.AnonymousClass7TF.A1R(r0)
            X.N9E r2 = r3.A01
            boolean r14 = r2.A06
            r0 = r57
            X.N9H r1 = r0.A01
            if (r1 != 0) goto L_0x02f8
            r1 = 0
        L_0x003a:
            if (r6 == r1) goto L_0x004a
            X.OKY r5 = r0.A09
            if (r6 == 0) goto L_0x02f4
            java.lang.Integer r4 = X.AnonymousClass05K.A00
        L_0x0042:
            X.PK2 r1 = new X.PK2
            r1.<init>(r4)
            r5.A00(r1)
        L_0x004a:
            if (r6 == 0) goto L_0x005e
            if (r25 != 0) goto L_0x0052
            r1 = r26
            if (r13 <= r1) goto L_0x005e
        L_0x0052:
            X.OWU r1 = X.C71135OdY.A0D(r0)
            X.N3e r1 = r1.A01()
            boolean r1 = r1.A0E
            if (r1 == 0) goto L_0x02f0
        L_0x005e:
            boolean r1 = r3.A0A
            if (r1 == 0) goto L_0x0079
            boolean r1 = r56.isEmpty()
            r1 = r1 ^ 1
            if (r1 != 0) goto L_0x0079
            com.instagram.common.session.UserSession r7 = r0.A07
            X.0Tu r1 = X.0Tu.A05
            r4 = 36329552104210612(0x811189000540b4, double:3.0382932658427184E-306)
            boolean r1 = X.182.A06(r1, r7, r4)
            if (r1 != 0) goto L_0x02f0
        L_0x0079:
            r24 = 1
        L_0x007b:
            X.Pry r1 = r0.A01
            X.N9h r1 = (X.C68294N9h) r1
            com.instagram.common.session.UserSession r4 = r0.A07
            r55 = r4
            r4 = 40
            X.PgU r5 = X.C66580MXl.A14(r0, r4)
            X.OMJ r18 = new X.OMJ
            r4 = r18
            r4.<init>(r5)
            boolean r16 = r56.isEmpty()
            boolean r12 = r3.A0C
            boolean r4 = r56.isEmpty()
            r15 = r4 ^ 1
            boolean r5 = r0.A03
            X.0eM r4 = r0.A0N
            r54 = r4
            java.lang.Object r4 = r54.getValue()
            X.OWU r4 = (X.OWU) r4
            X.N3e r4 = r4.A01()
            boolean r9 = r4.A0B
            boolean r11 = r0.A02
            X.0eM r4 = r0.A0L
            r53 = r4
            java.lang.String r8 = X.DbS.A0t(r53)
            X.0eM r4 = r0.A0E
            r52 = r4
            java.lang.String r7 = X.DbS.A0t(r52)
            X.0eM r4 = r0.A0R
            java.lang.String r35 = X.DbS.A0t(r4)
            r23 = 3
            X.C51972G9s.A1F(r8, r7)
            r4 = 1
            if (r5 == 0) goto L_0x02ec
            if (r1 == 0) goto L_0x02ec
            boolean r10 = r1.A05
            if (r10 != r4) goto L_0x02ec
            java.lang.Integer r32 = X.AnonymousClass05K.A01
        L_0x00d6:
            boolean r10 = r2.A04
            if (r10 != 0) goto L_0x00e2
            if (r16 != 0) goto L_0x00e2
            if (r5 != 0) goto L_0x00e2
            r42 = 1
            if (r9 == 0) goto L_0x00e4
        L_0x00e2:
            r42 = 0
        L_0x00e4:
            if (r14 == 0) goto L_0x02e8
            if (r5 != 0) goto L_0x02e8
        L_0x00e8:
            boolean r9 = r2.A07
            r22 = r9
            if (r9 == 0) goto L_0x00f2
            r43 = 1
            if (r14 == 0) goto L_0x00f4
        L_0x00f2:
            r43 = 0
        L_0x00f4:
            java.lang.String r9 = r2.A02
            r20 = r9
            com.instagram.common.typedurl.ImageUrl r9 = r2.A00
            r19 = r9
            if (r43 == 0) goto L_0x0102
            r40 = 0
            if (r16 != 0) goto L_0x010a
        L_0x0102:
            r40 = 1
            if (r43 != 0) goto L_0x010a
            r41 = 1
            if (r16 == 0) goto L_0x010c
        L_0x010a:
            r41 = 0
        L_0x010c:
            java.lang.String r34 = X.C70905OQx.A01(r2, r8, r7)
            X.0Tu r21 = X.0Tu.A05
            r9 = 36312050112136066(0x81019e00000382, double:3.02722493557991E-306)
            r8 = r21
            r7 = r55
            boolean r7 = X.182.A06(r8, r7, r9)
            if (r7 == 0) goto L_0x02e4
            if (r43 == 0) goto L_0x012b
            if (r15 == 0) goto L_0x012b
            if (r1 == 0) goto L_0x02e4
            boolean r7 = r1.A05
            if (r7 != r4) goto L_0x02e4
        L_0x012b:
            r44 = 0
        L_0x012d:
            if (r43 == 0) goto L_0x0139
            if (r1 == 0) goto L_0x0139
            boolean r7 = r1.A05
            if (r7 != r4) goto L_0x0139
            r45 = 1
            if (r11 == 0) goto L_0x013b
        L_0x0139:
            r45 = 0
        L_0x013b:
            org.webrtc.RendererCommon$ScalingType r36 = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FILL
            if (r12 != 0) goto L_0x0145
            if (r1 == 0) goto L_0x02e0
            boolean r7 = r1.A05
            if (r7 != r4) goto L_0x02e0
        L_0x0145:
            r46 = 0
        L_0x0147:
            if (r1 == 0) goto L_0x02dc
            boolean r7 = r1.A0B
            if (r7 != 0) goto L_0x0153
            boolean r7 = r1.A05
            r47 = 0
            if (r7 == 0) goto L_0x0155
        L_0x0153:
            r47 = 1
        L_0x0155:
            com.facebook.rtc.views.omnigrid.GridItemType r29 = com.facebook.rtc.views.omnigrid.GridItemType.SELF_VIEW
            if (r1 == 0) goto L_0x017c
            java.util.List r1 = r1.A03
            if (r1 == 0) goto L_0x017c
            int r7 = r1.size()
            r1 = r23
            if (r7 < r1) goto L_0x017c
            boolean r1 = r2.A05
            if (r1 == 0) goto L_0x017c
            if (r5 != 0) goto L_0x017c
            r7 = 36315017934539719(0x81045100000bc7, double:3.029101798418442E-306)
            r2 = r21
            r1 = r55
            boolean r1 = X.182.A06(r2, r1, r7)
            r49 = 1
            if (r1 != 0) goto L_0x017e
        L_0x017c:
            r49 = 0
        L_0x017e:
            r37 = 1056964608(0x3f000000, float:0.5)
            r39 = 10518528(0xa08000, float:1.4739597E-38)
            X.N3g r15 = new X.N3g
            r28 = r15
            r30 = r19
            r31 = r18
            r33 = r20
            r38 = r17
            r48 = r17
            r50 = r14
            r51 = r14
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            if (r6 != 0) goto L_0x0302
            java.util.Iterator r20 = X.AnonymousClass7TF.A0u(r56)
            r19 = 0
            r1 = 0
        L_0x01a1:
            boolean r2 = r20.hasNext()
            if (r2 == 0) goto L_0x0353
            java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r20)
            java.lang.Object r18 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            X.JwE r2 = (X.C61076JwE) r2
            X.Pry r5 = r0.A01
            X.N9h r5 = (X.C68294N9h) r5
            java.lang.String r8 = r2.A01
            X.Iwl r7 = new X.Iwl
            r6 = r17
            r7.<init>(r8, r0, r6)
            X.OMJ r16 = new X.OMJ
            r6 = r16
            r6.<init>(r7)
            boolean r7 = r0.A03
            java.lang.Object r6 = r54.getValue()
            X.OWU r6 = (X.OWU) r6
            X.N3e r6 = r6.A01()
            boolean r12 = r6.A0B
            java.lang.String r9 = X.DbS.A0t(r53)
            java.lang.String r8 = X.DbS.A0t(r52)
            java.lang.Object r6 = r2.A00
            X.N9E r6 = (X.N9E) r6
            boolean r10 = r6.A06
            if (r10 == 0) goto L_0x02d8
            android.app.Activity r11 = r0.A05
            r10 = 2131972746(0x7f13528a, float:1.9582508E38)
            java.lang.String r6 = r6.A01
            java.lang.String r35 = X.DbW.A0h(r11, r6, r10)
        L_0x01f2:
            boolean r10 = r3.A0A
            X.C51972G9s.A1E(r9, r8)
            java.lang.Object r6 = r2.A00
            X.N9E r6 = (X.N9E) r6
            if (r7 == 0) goto L_0x02d4
            if (r5 == 0) goto L_0x02d4
            boolean r11 = r5.A05
            if (r11 != r4) goto L_0x02d4
            java.lang.Integer r32 = X.AnonymousClass05K.A01
        L_0x0205:
            boolean r11 = r6.A04
            if (r11 != 0) goto L_0x020f
            if (r12 != 0) goto L_0x020f
            r42 = 1
            if (r7 == 0) goto L_0x0211
        L_0x020f:
            r42 = 0
        L_0x0211:
            java.lang.String r11 = r6.A02
            r33 = r11
            com.instagram.common.typedurl.ImageUrl r12 = r6.A00
            boolean r11 = r6.A07
            if (r11 != 0) goto L_0x021f
            r40 = 1
            if (r10 == 0) goto L_0x0221
        L_0x021f:
            r40 = 0
        L_0x0221:
            r41 = r11 ^ 1
            java.lang.String r34 = X.C70905OQx.A01(r6, r9, r8)
            boolean r9 = r6.A06
            if (r9 == 0) goto L_0x02d0
            org.webrtc.RendererCommon$ScalingType r36 = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FIT
        L_0x022d:
            com.facebook.rtc.views.omnigrid.GridItemType r29 = com.facebook.rtc.views.omnigrid.GridItemType.PEER_VIEW
            if (r5 == 0) goto L_0x0254
            java.util.List r5 = r5.A03
            if (r5 == 0) goto L_0x0254
            int r8 = r5.size()
            r5 = r23
            if (r8 < r5) goto L_0x0254
            boolean r5 = r6.A05
            if (r5 == 0) goto L_0x0254
            if (r7 != 0) goto L_0x0254
            r7 = 36315017934539719(0x81045100000bc7, double:3.029101798418442E-306)
            r6 = r21
            r5 = r55
            boolean r5 = X.182.A06(r6, r5, r7)
            r49 = 1
            if (r5 != 0) goto L_0x0256
        L_0x0254:
            r49 = 0
        L_0x0256:
            if (r9 != 0) goto L_0x025a
            r35 = 0
        L_0x025a:
            r39 = 10674176(0xa2e000, float:1.4957706E-38)
            X.N3g r5 = new X.N3g
            r28 = r5
            r30 = r12
            r31 = r16
            r38 = r4
            r43 = r11
            r44 = r17
            r45 = r17
            r46 = r17
            r47 = r17
            r50 = r17
            r51 = r9
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            r6 = r27
            r6.add(r5)
            java.lang.Object r8 = r2.A00
            X.N9E r8 = (X.N9E) r8
            X.N9H r2 = r0.A01
            if (r2 == 0) goto L_0x02ce
            java.util.Map r6 = r2.A03
            if (r6 == 0) goto L_0x02ce
            r2 = r18
            java.lang.Object r2 = r6.get(r2)
            X.JwE r2 = (X.C61076JwE) r2
            if (r2 == 0) goto L_0x02ce
            java.lang.Object r6 = r2.A00
            X.N9E r6 = (X.N9E) r6
        L_0x0297:
            if (r19 != 0) goto L_0x02a0
            boolean r2 = r8.A06
            if (r2 == 0) goto L_0x02a0
            r19 = r5
            r1 = r8
        L_0x02a0:
            boolean r2 = r0.A03
            if (r2 != 0) goto L_0x01a1
            boolean r2 = r8.A07
            if (r2 != 0) goto L_0x01a1
            if (r6 == 0) goto L_0x01a1
            boolean r2 = r6.A07
            if (r2 != r4) goto L_0x01a1
            X.Ocu r7 = r0.A0A
            android.view.View r2 = r0.A06
            android.content.res.Resources r6 = r2.getResources()
            r5 = 2131954533(0x7f130b65, float:1.9545568E38)
            java.lang.String r2 = r8.A01
            java.lang.String r6 = X.AnonymousClass7TF.A0e(r6, r2, r5)
            X.0qQ.A07(r6)
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            X.PPX r2 = new X.PPX
            r2.<init>(r5, r6, r4)
            r7.A03(r2)
            goto L_0x01a1
        L_0x02ce:
            r6 = 0
            goto L_0x0297
        L_0x02d0:
            org.webrtc.RendererCommon$ScalingType r36 = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FILL
            goto L_0x022d
        L_0x02d4:
            java.lang.Integer r32 = X.AnonymousClass05K.A00
            goto L_0x0205
        L_0x02d8:
            r35 = 0
            goto L_0x01f2
        L_0x02dc:
            r47 = 0
            goto L_0x0155
        L_0x02e0:
            r46 = 1
            goto L_0x0147
        L_0x02e4:
            r44 = 1
            goto L_0x012d
        L_0x02e8:
            r35 = 0
            goto L_0x00e8
        L_0x02ec:
            java.lang.Integer r32 = X.AnonymousClass05K.A00
            goto L_0x00d6
        L_0x02f0:
            r24 = 0
            goto L_0x007b
        L_0x02f4:
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            goto L_0x0042
        L_0x02f8:
            long r4 = r1.A00
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            boolean r1 = X.AnonymousClass7TF.A1R(r1)
            goto L_0x003a
        L_0x0302:
            X.0eM r1 = r0.A0F
            java.lang.Object r5 = r1.getValue()
            com.instagram.common.typedurl.ImageUrlBase r5 = (com.instagram.common.typedurl.ImageUrlBase) r5
            X.Pps r2 = X.C74151Pps.A00
            X.OMJ r1 = new X.OMJ
            r1.<init>(r2)
            X.0eM r2 = r0.A0O
            java.lang.String r35 = X.DbS.A0t(r2)
            com.facebook.rtc.views.omnigrid.GridItemType r29 = com.facebook.rtc.views.omnigrid.GridItemType.PEER_VIEW
            java.lang.String r33 = "-1"
            java.lang.String r34 = ""
            r32 = 0
            r37 = 0
            r39 = 10976256(0xa77c00, float:1.538101E-38)
            X.N3g r2 = new X.N3g
            r28 = r2
            r30 = r5
            r31 = r1
            r36 = r32
            r38 = r4
            r40 = r4
            r41 = r17
            r42 = r17
            r43 = r17
            r44 = r17
            r45 = r17
            r46 = r17
            r47 = r17
            r48 = r4
            r49 = r17
            r50 = r17
            r51 = r17
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            r1 = r27
            r1.add(r2)
            r19 = 0
            r1 = 0
        L_0x0353:
            if (r24 == 0) goto L_0x0366
            if (r14 == 0) goto L_0x035b
            boolean r2 = r0.A03
            if (r2 != 0) goto L_0x0366
        L_0x035b:
            boolean r2 = r0.A04
            if (r2 == 0) goto L_0x03e8
            r5 = r27
            r2 = r17
            r5.add(r2, r15)
        L_0x0366:
            boolean r6 = r3.A09
            if (r6 == 0) goto L_0x037d
            r2 = r26
            if (r13 <= r2) goto L_0x037d
            boolean r2 = r0.A03
            if (r2 != 0) goto L_0x037d
            if (r19 == 0) goto L_0x037d
            X.0eM r2 = r0.A0Q
            boolean r2 = X.AnonymousClass7TF.A1Z(r2)
            r5 = 1
            if (r2 != 0) goto L_0x037e
        L_0x037d:
            r5 = 0
        L_0x037e:
            if (r14 == 0) goto L_0x03cd
            boolean r2 = r0.A03
            if (r2 != 0) goto L_0x03cd
            java.util.List r7 = X.AnonymousClass7TE.A1I(r15)
        L_0x0388:
            if (r5 != 0) goto L_0x03d5
            if (r14 != 0) goto L_0x03d5
            X.0sn r43 = X.0sn.A00
        L_0x038e:
            java.util.Map r8 = r0.A0D
            r2 = r26
            X.0qQ.A0B(r8, r2)
            java.util.LinkedHashMap r10 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r14 = X.AnonymousClass7TF.A0u(r8)
        L_0x039d:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x03ef
            java.util.Map$Entry r9 = X.AnonymousClass7TE.A1J(r14)
            java.lang.Object r2 = r9.getKey()
            long r5 = X.AnonymousClass7TE.A0R(r2)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r2 = r56
            boolean r2 = r2.containsKey(r5)
            if (r2 != 0) goto L_0x03c9
            long r5 = r15.A02
            java.lang.Object r2 = r9.getKey()
            long r11 = X.AnonymousClass7TE.A0R(r2)
            int r2 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x039d
        L_0x03c9:
            X.Dbb.A1V(r9, r10)
            goto L_0x039d
        L_0x03cd:
            if (r5 == 0) goto L_0x03de
            if (r19 == 0) goto L_0x03de
            java.util.List r7 = X.AnonymousClass7TE.A1I(r19)
        L_0x03d5:
            java.util.List r2 = X.00k.A0a(r27)
            java.util.List r43 = X.00k.A0e(r2, r7)
            goto L_0x038e
        L_0x03de:
            if (r6 == 0) goto L_0x03e5
            java.util.List r7 = X.00k.A0a(r27)
            goto L_0x0388
        L_0x03e5:
            X.0sn r7 = X.0sn.A00
            goto L_0x0388
        L_0x03e8:
            r2 = r27
            r2.add(r15)
            goto L_0x0366
        L_0x03ef:
            java.util.LinkedHashMap r10 = X.0Yt.A03(r10)
            java.util.Map r2 = r3.A02
            java.util.Iterator r11 = X.AnonymousClass7TF.A0u(r2)
        L_0x03f9:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x042a
            java.util.Map$Entry r5 = X.AnonymousClass7TE.A1J(r11)
            java.lang.Object r2 = r5.getKey()
            boolean r2 = r10.containsKey(r2)
            if (r2 != 0) goto L_0x03f9
            java.lang.Object r9 = r5.getKey()
            java.lang.Object r2 = r5.getValue()
            X.Gms r2 = (X.C53368Gms) r2
            int r6 = r2.A01
            java.lang.Object r2 = r5.getValue()
            X.Gms r2 = (X.C53368Gms) r2
            int r5 = r2.A00
            com.facebook.rtc.views.omnigrid.GridItemSize r2 = new com.facebook.rtc.views.omnigrid.GridItemSize
            r2.<init>(r6, r5)
            r10.put(r9, r2)
            goto L_0x03f9
        L_0x042a:
            r8.clear()
            r8.putAll(r10)
            java.lang.Object r2 = r54.getValue()
            X.OWU r2 = (X.OWU) r2
            X.N3e r2 = r2.A01()
            X.ULb r6 = r0.A00
            int r5 = r6.A02
            r26 = r5
            int r5 = r6.A01
            r24 = r5
            if (r25 != 0) goto L_0x044e
            boolean r5 = X.AnonymousClass7TE.A1b(r43)
            r34 = 0
            if (r5 == 0) goto L_0x0450
        L_0x044e:
            r34 = 1
        L_0x0450:
            boolean r5 = r0.A03
            if (r5 != 0) goto L_0x045a
            boolean r5 = r3.A0E
            r35 = 0
            if (r5 == 0) goto L_0x045c
        L_0x045a:
            r35 = 1
        L_0x045c:
            r53 = 0
            boolean r5 = r3.A0A
            r23 = r5
            boolean r5 = r2.A0B
            r21 = r5
            boolean r5 = r2.A0E
            r20 = r5
            boolean r5 = r2.A09
            r19 = r5
            boolean r5 = r2.A0A
            r18 = r5
            float r5 = r2.A00
            r16 = r5
            boolean r15 = r2.A0G
            boolean r14 = r2.A0D
            int r12 = r2.A02
            int r11 = r2.A03
            int r9 = r2.A04
            int r8 = r2.A01
            X.ULb r6 = r2.A07
            boolean r5 = r2.A0C
            r2 = 16
            X.0qQ.A0B(r6, r2)
            X.N3e r2 = new X.N3e
            r27 = r26
            r28 = r24
            r29 = r12
            r30 = r11
            r31 = r9
            r32 = r8
            r33 = r21
            r36 = r20
            r37 = r19
            r38 = r18
            r39 = r15
            r40 = r14
            r41 = r5
            r42 = r23
            r23 = r2
            r24 = r6
            r25 = r7
            r26 = r16
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            java.lang.Object r5 = r54.getValue()
            X.OWU r5 = (X.OWU) r5
            r5.A02(r2)
            X.Pry r2 = r0.A01
            X.N9h r2 = (X.C68294N9h) r2
            if (r2 == 0) goto L_0x05bd
            java.util.List r2 = r2.A03
            if (r2 == 0) goto L_0x05bd
            int r5 = r2.size()
        L_0x04cb:
            X.Pry r2 = r0.A01
            X.N9h r2 = (X.C68294N9h) r2
            if (r2 == 0) goto L_0x05ba
            boolean r8 = r2.A0B
        L_0x04d3:
            if (r5 == r13) goto L_0x04d8
            r0.A02(r13)
        L_0x04d8:
            X.0eM r2 = r0.A0P
            java.lang.Object r5 = r2.getValue()
            X.OCl r5 = (X.C70588OCl) r5
            X.N9E r6 = r5.A00
            r12 = 1
            if (r6 == 0) goto L_0x04ea
            boolean r2 = r6.A06
            r11 = 1
            if (r2 == r4) goto L_0x04ed
        L_0x04ea:
            r11 = 0
            if (r6 == 0) goto L_0x04f2
        L_0x04ed:
            boolean r2 = r6.A07
            r9 = 1
            if (r2 == r4) goto L_0x04f3
        L_0x04f2:
            r9 = 0
        L_0x04f3:
            if (r1 == 0) goto L_0x04fa
            boolean r2 = r1.A06
            r6 = 1
            if (r2 == r4) goto L_0x04fd
        L_0x04fa:
            r6 = 0
            if (r1 == 0) goto L_0x05b7
        L_0x04fd:
            boolean r2 = r1.A07
            if (r2 != r4) goto L_0x05b7
        L_0x0501:
            r5.A00 = r1
            if (r11 != 0) goto L_0x050e
            if (r6 == 0) goto L_0x050e
            X.OKY r2 = r5.A01
            X.PKt r1 = X.C72805PKt.A00
            r2.A00(r1)
        L_0x050e:
            if (r9 == 0) goto L_0x0512
            if (r11 != 0) goto L_0x05a4
        L_0x0512:
            if (r6 == 0) goto L_0x05a0
            if (r12 == 0) goto L_0x05a0
            X.OKY r2 = r5.A01
            X.PKr r1 = X.C72803PKr.A00
        L_0x051a:
            r2.A00(r1)
        L_0x051d:
            X.Pry r9 = r0.A01
            X.N9h r9 = (X.C68294N9h) r9
            if (r9 != 0) goto L_0x0527
            X.N9h r9 = X.C70905OQx.A00()
        L_0x0527:
            boolean r6 = r3.A0F
            boolean r12 = r3.A05
            boolean r5 = r3.A0D
            java.lang.Object r1 = r54.getValue()
            X.OWU r1 = (X.OWU) r1
            X.N3e r1 = r1.A01()
            boolean r2 = r1.A0B
            java.util.Map r45 = X.0Yt.A0B(r10)
            java.lang.Object r1 = r54.getValue()
            X.OWU r1 = (X.OWU) r1
            X.JVf r10 = r1.A00
            java.lang.Object r1 = r54.getValue()
            X.OWU r1 = (X.OWU) r1
            X.N3V r1 = r1.A01
            if (r22 == 0) goto L_0x0555
            boolean r11 = r0.A03
            if (r11 != 0) goto L_0x0555
            r53 = 1
        L_0x0555:
            r46 = 100465(0x18871, float:1.40781E-40)
            r40 = r10
            r41 = r1
            r42 = r9
            r44 = r7
            r47 = r17
            r48 = r2
            r49 = r6
            r50 = r12
            r51 = r5
            r52 = r17
            r54 = r17
            r55 = r17
            X.N9h r1 = X.C68294N9h.A00(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            r0.A0J(r1)
            X.N9H r1 = r0.A01
            if (r1 == 0) goto L_0x0586
            boolean r1 = r1.A0E
            if (r1 != 0) goto L_0x058e
            boolean r1 = r3.A0E
            if (r1 == 0) goto L_0x0586
            r0.A01()
        L_0x0586:
            if (r8 == r6) goto L_0x058b
            r0.A02(r13)
        L_0x058b:
            r0.A01 = r3
            return
        L_0x058e:
            if (r1 != r4) goto L_0x0586
            boolean r1 = r3.A0E
            if (r1 != 0) goto L_0x0586
            X.PML r2 = r0.A0B
            boolean r1 = r2.A02()
            if (r1 == 0) goto L_0x0586
            r2.A00()
            goto L_0x0586
        L_0x05a0:
            if (r11 == 0) goto L_0x051d
            if (r9 == 0) goto L_0x05af
        L_0x05a4:
            if (r12 == 0) goto L_0x05a8
            if (r6 != 0) goto L_0x051d
        L_0x05a8:
            X.OKY r2 = r5.A01
            X.PKs r1 = X.C72804PKs.A00
            r2.A00(r1)
        L_0x05af:
            if (r6 != 0) goto L_0x051d
            X.OKY r2 = r5.A01
            X.PKu r1 = X.C72806PKu.A00
            goto L_0x051a
        L_0x05b7:
            r12 = 0
            goto L_0x0501
        L_0x05ba:
            r8 = 0
            goto L_0x04d3
        L_0x05bd:
            r5 = 0
            goto L_0x04cb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69110Nep.A0M(X.N9H):void");
    }

    public static final boolean A05(Map map) {
        int i;
        Collection<GridItemSize> values = map.values();
        if (values != null && values.isEmpty()) {
            return false;
        }
        for (GridItemSize gridItemSize : values) {
            int i2 = gridItemSize.width;
            if (i2 != 0 && (i = gridItemSize.height) != 0 && i2 > i) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A06(Map map) {
        int i;
        boolean z;
        Collection values = map.values();
        if (values == null || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GridItemSize gridItemSize = (GridItemSize) it.next();
                int i2 = gridItemSize.width;
                if (i2 != 0 && (i = gridItemSize.height) != 0 && i2 <= i) {
                    z = true;
                    break;
                }
            }
            boolean A052 = A05(map);
            if (!z && A052) {
                return true;
            }
        }
        z = false;
        boolean A0522 = A05(map);
        return !z ? false : false;
    }
}
