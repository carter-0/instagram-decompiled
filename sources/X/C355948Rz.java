package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.8Rz  reason: invalid class name and case insensitive filesystem */
public final class C355948Rz implements AnonymousClass88G, C352348Cz, AnonymousClass8LV, B1P, C3493580b, C3502283u {
    public View A00;
    public boolean A01;
    public boolean A02;
    public C279284yO A03;
    public Set A04;
    public boolean A05;
    public final Context A06;
    public final C3507686c A07;
    public final AnonymousClass86W A08;
    public final UserSession A09;
    public final C357638Yz A0A;
    public final AnonymousClass8BA A0B;
    public final C352888Fl A0C;
    public final C352538Dt A0D;
    public final C3509286x A0E;
    public final AnonymousClass80D A0F;
    public final AnonymousClass8AL A0G;
    public final AnonymousClass8DD A0H;
    public final AnonymousClass8DB A0I;
    public final AnonymousClass8E5 A0J;
    public final C3497281m A0K;
    public final AnonymousClass8S2 A0L;
    public final AnonymousClass8E6 A0M;
    public final AnonymousClass80U A0N;
    public final C353508Hx A0O;
    public final C3510287h A0P;
    public final InteractiveDrawableContainer A0Q;
    public final List A0R = new ArrayList();
    public final boolean A0S;
    public final View A0T;
    public final AnonymousClass8GD A0U;
    public final AnonymousClass85X A0V;
    public final C3496881i A0W;
    public final boolean A0X;

    public C355948Rz(Context context, View view, C3507686c r7, AnonymousClass86W r8, UserSession userSession, C357638Yz r10, AnonymousClass8BA r11, C352888Fl r12, C352538Dt r13, AnonymousClass85X r14, C3509286x r15, AnonymousClass80D r16, AnonymousClass8AL r17, AnonymousClass8DD r18, AnonymousClass8DB r19, C3496881i r20, AnonymousClass8E5 r21, C3497281m r22, AnonymousClass8E6 r23, AnonymousClass80U r24, C353508Hx r25, C3510287h r26, InteractiveDrawableContainer interactiveDrawableContainer, boolean z, boolean z2) {
        this.A06 = context;
        AnonymousClass80U r0 = r24;
        this.A0N = r0;
        r0.A7w(this);
        this.A0F = r16;
        this.A09 = userSession;
        this.A0A = r10;
        r10.A0E(new AnonymousClass8S0(this));
        this.A0K = r22;
        this.A0G = r17;
        this.A0V = r14;
        this.A0D = r13;
        this.A0C = r12;
        this.A0J = r21;
        this.A0O = r25;
        this.A0I = r19;
        this.A0P = r26;
        this.A0B = r11;
        this.A0L = new AnonymousClass8S2(this.A09, new AnonymousClass8S1(this), r13);
        this.A0Q = interactiveDrawableContainer;
        this.A0E = r15;
        this.A0H = r18;
        this.A0M = r23;
        this.A0S = z;
        this.A0U = new AnonymousClass8S3(this);
        this.A0T = view;
        A03((C279284yO) r10.A08.A00, this, (Set) r10.A09.A00);
        this.A00 = null;
        C3496881i r1 = r20;
        this.A0W = r1;
        if (!AnonymousClass8FD.A00(context.getApplicationContext())) {
            r1.A04(new C378769Rd(this));
        }
        this.A08 = r8;
        this.A07 = r7;
        this.A0X = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r4 == X.AnonymousClass87I.QUICK_SNAP_AUDIENCE_SELECTOR_ENTRYPOINT) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.AnonymousClass87G r7) {
        /*
            r6 = this;
            r3 = 0
            r2 = 1
            if (r7 == 0) goto L_0x0017
            X.87I r4 = r7.A04
            X.87I r0 = X.AnonymousClass87I.EMPTY
            if (r4 == r0) goto L_0x0017
            if (r4 != 0) goto L_0x000e
            X.87I r4 = X.AnonymousClass87I.EMPTY
        L_0x000e:
            X.87I r0 = X.AnonymousClass87I.TYPE
            if (r4 == r0) goto L_0x0017
            X.87I r0 = X.AnonymousClass87I.QUICK_SNAP_AUDIENCE_SELECTOR_ENTRYPOINT
            r1 = 0
            if (r4 != r0) goto L_0x0018
        L_0x0017:
            r1 = 1
        L_0x0018:
            r5 = r1 ^ 1
            X.8Yz r4 = r6.A0A
            X.80m r0 = r4.A07
            java.lang.Object r0 = r0.A00
            java.util.Set r0 = (java.util.Set) r0
            int r0 = r0.size()
            if (r0 <= r2) goto L_0x005e
            boolean r0 = r4.A0R()
            if (r0 != 0) goto L_0x005e
            X.80m r0 = r4.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0044
            X.8Hx r0 = r6.A0O
            X.8IY r0 = r0.AuT()
            X.8IW r0 = r0.A00
            int r0 = r0.ordinal()
            if (r0 != r3) goto L_0x005e
        L_0x0044:
            r1 = 1
        L_0x0045:
            X.8aL r0 = X.C358088aL.A0C
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r4.A0V(r0)
            if (r5 != 0) goto L_0x0053
            if (r1 == 0) goto L_0x0056
        L_0x0053:
            if (r0 != 0) goto L_0x0056
            r3 = 1
        L_0x0056:
            X.8AL r0 = r6.A0G
            if (r3 == 0) goto L_0x0060
            r0.A0C(r2)
            return
        L_0x005e:
            r1 = 0
            goto L_0x0045
        L_0x0060:
            r0.A0B(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355948Rz.A09(X.87G):void");
    }

    public final /* synthetic */ void CtK(Drawable drawable) {
    }

    public final /* synthetic */ void CtX() {
    }

    public final /* synthetic */ void CtY() {
    }

    public final /* synthetic */ void CuV(Drawable drawable, int i) {
    }

    public final /* synthetic */ void DAq(Drawable drawable, int i) {
    }

    public final /* synthetic */ void DAr(float f, float f2) {
    }

    public final /* synthetic */ void DAs(Drawable drawable) {
    }

    public final /* synthetic */ void DDu() {
    }

    public final /* synthetic */ void DDv(int i) {
    }

    public final /* synthetic */ void DP7(Drawable drawable, int i, float f, float f2) {
    }

    public final /* synthetic */ void DPH() {
    }

    public final /* synthetic */ void DdI(Drawable drawable, int i, boolean z) {
    }

    public final /* synthetic */ void DlE(Drawable drawable, float f, float f2, float f3, float f4, int i) {
    }

    private void A00() {
        AnonymousClass37D A022 = AnonymousClass37D.A00.A02(this.A06);
        if (A022 != null) {
            BottomSheetFragment A092 = A022.A09();
            if ((A092 instanceof BottomSheetFragment) && (A092.A0M() instanceof C384869i1)) {
                A022.A0B();
            }
        }
    }

    private void A01() {
        this.A0K.A00().Ety(true);
        this.A0O.DDZ(-1);
        AnonymousClass8DD r0 = this.A0H;
        if (r0 != null) {
            AnonymousClass8DM r02 = r0.A0O;
            if (r02 != null) {
                r02.Ev0();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    private void A02() {
        AnonymousClass80U r2 = this.A0N;
        if (r2.Ats() == AnonymousClass80X.PRE_CAPTURE && r2.Atr() != AnonymousClass80V.MEDIA_EDIT) {
            AnonymousClass8S1 r22 = this.A0L.A01;
            if (!r22.A00.A0C.A0V() || AnonymousClass05K.A0N != r22.A01()) {
                this.A0K.A00().Eu6(false);
            }
        }
    }

    public static void A03(C279284yO r5, C355948Rz r6, Set set) {
        if (r6.A0N.Ats() == AnonymousClass80X.PRE_CAPTURE) {
            Set set2 = r6.A04;
            r6.A04 = set;
            r6.A03 = r5;
            A05(r6);
            Set set3 = r6.A04;
            C358088aL r3 = C358088aL.A0C;
            r6.A0Q.A0O = !set3.contains(r3);
            C3497881t A002 = r6.A0K.A00();
            boolean z = false;
            if (r5 != C363138jC.A00) {
                z = true;
            }
            A002.EZh(z);
            if (set2 != null && set2.contains(r3) && !r6.A04.contains(r3)) {
                C3509286x r1 = r6.A0E;
                if (!r1.A03) {
                    r1.A01.A00();
                }
                r1.A08(false);
            }
            11Z.A03(new C347057wC(r6));
        }
    }

    public static void A04(C355948Rz r26) {
        boolean A002 = 2CC.A00(AnonymousClass05K.A0Q);
        C355948Rz r4 = r26;
        if (r4.A0N.Ats() == AnonymousClass80X.PRE_CAPTURE || !A002) {
            r4.A0K.A00().FM9(false, false, false, false, false, r4.A0F.A3F, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false);
        }
        r4.A0P.A00().A0P(false, true);
        r4.A0E.A09(false);
        r4.A0O.EkX(true);
    }

    public static void A05(C355948Rz r8) {
        C357638Yz r7 = r8.A0A;
        C358088aL r3 = C358088aL.A0T;
        Drawable drawable = null;
        if (r7.A0V(r3, C358088aL.A0z)) {
            AnonymousClass80U r2 = r8.A0N;
            if (r2.Atr() == AnonymousClass80V.LAYOUT_COMPLETE || r2.Atr() == AnonymousClass80V.VIDEO_LAYOUT_COMPLETE) {
                Drawable A002 = C61360ml.A00(r8.A0Q.getContext(), R.drawable.instagram_check_pano_filled_24);
                A002.setBounds(0, 0, A002.getIntrinsicWidth(), A002.getIntrinsicHeight());
                r8.A0K.A00().ElK(A002);
                return;
            }
            r8.A0K.A00().ElK((Drawable) null);
            if (r7.A0V(r3)) {
                return;
            }
        }
        int A003 = C347047wB.A00(r7.A06());
        if (A003 != -1) {
            C3494680m r32 = r7.A08;
            if (r32.A00 != AnonymousClass80L.A00 && !r7.A0V(C358088aL.A0B, C358088aL.A0M, C358088aL.A0D) && !(r32.A00 instanceof AnonymousClass80O)) {
                Context context = r8.A0Q.getContext();
                drawable = C61360ml.A00(context, A003);
                int A004 = AnonymousClass879.A00(context);
                drawable.setBounds(0, 0, A004, A004);
            }
        }
        r8.A0K.A00().ElK(drawable);
    }

    public static void A06(C355948Rz r2) {
        r2.A0C.A0U(r2.A0U);
    }

    public static void A07(C355948Rz r6) {
        AnonymousClass87G A012;
        AnonymousClass87G A013;
        AnonymousClass8S2 r2 = r6.A0L;
        boolean z = false;
        if (r6.A0A.A0V(C358088aL.A0C)) {
            C355948Rz r1 = r2.A01.A00;
            if (!r1.A01 && r1.A0B.A0D == null && !r1.A0E.A0A()) {
                z = true;
            }
        }
        C3509286x r5 = r6.A0E;
        boolean z2 = false;
        if (r5.A05 && (A013 = r5.A0H.A01()) != null) {
            if (!C3509386y.A01(A013)) {
                AA8 A022 = r5.A02(A013);
                if (!(A022 instanceof C387479mH) && !(A022 instanceof C387489mI) && !(A022 instanceof C387559mP)) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        boolean z3 = false;
        if (r5.A05 && (A012 = r5.A0H.A01()) != null) {
            z3 = C3509386y.A01(A012) ? true : r5.A02(A012).A0G();
        }
        r6.A0K.A00().FMA(z, z2, z3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (X.AnonymousClass8FD.A00(r3.A06.getApplicationContext()) == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08() {
        /*
            r3 = this;
            android.view.View r0 = r3.A00
            if (r0 == 0) goto L_0x0030
            X.8Yz r0 = r3.A0A
            X.80m r0 = r0.A08
            java.lang.Object r1 = r0.A00
            X.8jC r0 = X.C363138jC.A00
            if (r1 != r0) goto L_0x0025
            X.80U r0 = r3.A0N
            X.80X r1 = r0.Ats()
            X.80X r0 = X.AnonymousClass80X.PRE_CAPTURE
            if (r1 != r0) goto L_0x0025
            android.content.Context r0 = r3.A06
            android.content.Context r0 = r0.getApplicationContext()
            boolean r0 = X.AnonymousClass8FD.A00(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            android.view.View r1 = r3.A00
            r0 = 8
            if (r2 == 0) goto L_0x002d
            r0 = 0
        L_0x002d:
            r1.setVisibility(r0)
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355948Rz.A08():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r1.A3m != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D19(boolean r8) {
        /*
            r7 = this;
            X.80D r1 = r7.A0F
            boolean r5 = r1.A3F
            X.8S2 r0 = r7.A0L
            boolean r4 = r0.A00()
            boolean r3 = r0.A02()
            android.view.View r6 = r7.A0T
            r2 = 8
            if (r8 == 0) goto L_0x0019
            boolean r1 = r1.A3m
            r0 = 0
            if (r1 == 0) goto L_0x001b
        L_0x0019:
            r0 = 8
        L_0x001b:
            r6.setVisibility(r0)
            if (r8 == 0) goto L_0x003e
            android.view.View r0 = r7.A00
            if (r0 == 0) goto L_0x0027
            r0.setVisibility(r2)
        L_0x0027:
            X.81m r0 = r7.A0K
            X.81t r2 = r0.A00()
            X.8Fl r0 = r7.A0C
            float r1 = r0.A00
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x0038
            r0 = 1
        L_0x0038:
            r0 = r0 ^ 1
            r2.FMH(r5, r4, r3, r0)
            return
        L_0x003e:
            X.81m r0 = r7.A0K
            X.81t r2 = r0.A00()
            X.8Fl r0 = r7.A0C
            float r1 = r0.A00
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x004f
            r0 = 1
        L_0x004f:
            r0 = r0 ^ 1
            r2.FMI(r5, r4, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355948Rz.D19(boolean):void");
    }

    public final void DBP(boolean z) {
        AnonymousClass80U r2 = this.A0N;
        if (r2.Ats() == AnonymousClass80X.PRE_CAPTURE && r2.Atr() != AnonymousClass80V.MEDIA_EDIT) {
            A06(this);
            if (!this.A0E.A0A()) {
                this.A0P.A00().A0O(true);
            }
        }
    }

    public final void DBQ() {
        if (this.A0N.Ats() == AnonymousClass80X.PRE_CAPTURE) {
            A06(this);
            this.A0P.A00().A0O(false);
        }
    }

    public final void DDt() {
        AnonymousClass80U r2 = this.A0N;
        if (r2.Ats() == AnonymousClass80X.PRE_CAPTURE && r2.Atr() != AnonymousClass80V.MEDIA_EDIT) {
            this.A0K.A00().CLF(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r6.A0O.AuT().A01 == X.AnonymousClass8IX.CLIPS_REVIEW) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DHa(float r7, float r8) {
        /*
            r6 = this;
            r5 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            X.8Hx r0 = r6.A0O
            X.8IY r0 = r0.AuT()
            X.8IX r1 = r0.A01
            X.8IX r0 = X.AnonymousClass8IX.CLIPS_REVIEW
            r3 = 1
            if (r1 != r0) goto L_0x0015
        L_0x0014:
            r3 = 0
        L_0x0015:
            X.81m r0 = r6.A0K
            X.81t r2 = r0.A00()
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L_0x0021
            r0 = 1
        L_0x0021:
            r2.FMD(r3, r0)
            X.85X r0 = r6.A0V
            r0.A00 = r7
            X.AnonymousClass85X.A06(r0)
            X.AnonymousClass85X.A04(r0)
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0034
            r4 = 1
        L_0x0034:
            r6.A05 = r4
            X.87h r0 = r6.A0P
            X.8Jc r1 = r0.A00()
            boolean r0 = r6.A05
            r0 = r0 ^ 1
            r1.A0L = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355948Rz.DHa(float, float):void");
    }

    public final void DhH(Drawable drawable, float f, float f2, float f3, float f4) {
        if (!this.A0X) {
            C3497281m r2 = this.A0K;
            r2.A00().CLF(false);
            A04(this);
            if (drawable instanceof C354808Nl) {
                r2.A00().CLH();
            }
        }
    }

    public final void DlC(Drawable drawable, int i, float f, float f2) {
        AnonymousClass8BA r2 = this.A0B;
        C357068Wi r1 = (C357068Wi) r2.A1v.get();
        if (r1 != null && (drawable instanceof B3d)) {
            r1.A0H.A00().DlD();
        }
        ((AnonymousClass8ME) r2.A1g.get()).A1G(drawable, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0111, code lost:
        if (r1.A0n.A0A() != false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0171, code lost:
        if ((r13 instanceof X.AnonymousClass8SP) != false) goto L_0x0173;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void Dmx(java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            r10 = this;
            X.80V r11 = (X.AnonymousClass80V) r11
            X.80V r12 = (X.AnonymousClass80V) r12
            int r1 = r11.ordinal()
            r0 = 10
            if (r1 == r0) goto L_0x0162
            r0 = 51
            if (r1 == r0) goto L_0x0162
            r0 = 50
            if (r1 == r0) goto L_0x0155
            r0 = 48
            if (r1 == r0) goto L_0x013e
            r0 = 52
            if (r1 == r0) goto L_0x013e
        L_0x001c:
            int r0 = r12.ordinal()
            r6 = 0
            switch(r0) {
                case 3: goto L_0x0048;
                case 9: goto L_0x0076;
                case 10: goto L_0x0087;
                case 11: goto L_0x0125;
                case 48: goto L_0x012a;
                case 51: goto L_0x0087;
                case 52: goto L_0x012a;
                default: goto L_0x0024;
            }
        L_0x0024:
            X.80U r0 = r10.A0N
            X.80X r1 = r0.Ats()
            X.80X r0 = X.AnonymousClass80X.PRE_CAPTURE
            if (r1 != r0) goto L_0x003b
            X.80V r0 = X.AnonymousClass80V.MUSIC_OVERLAY_STICKER_COMPOSE
            if (r12 != r0) goto L_0x003c
            X.81m r0 = r10.A0K
            X.81t r0 = r0.A00()
            r0.CLF(r6)
        L_0x003b:
            return
        L_0x003c:
            if (r11 != r0) goto L_0x003b
            X.81m r0 = r10.A0K
            X.81t r0 = r0.A00()
            r0.Eu6(r6)
            return
        L_0x0048:
            X.80U r0 = r10.A0N
            X.80X r1 = r0.Ats()
            X.80X r0 = X.AnonymousClass80X.PRE_CAPTURE
            if (r1 != r0) goto L_0x0024
            r0 = 0
            r10.A0A(r0)
            X.80V r0 = X.AnonymousClass80V.VIDEO_LAYOUT_COMPLETE
            if (r11 != r0) goto L_0x0024
            boolean r0 = r13 instanceof X.AnonymousClass8SD
            if (r0 != 0) goto L_0x0072
            boolean r0 = r13 instanceof X.C356328Tl
            if (r0 != 0) goto L_0x0072
            boolean r0 = r13 instanceof X.AnonymousClass8SZ
            if (r0 == 0) goto L_0x0024
            X.8DD r0 = r10.A0H
            if (r0 == 0) goto L_0x0024
            X.8DM r0 = r0.A0O
            if (r0 == 0) goto L_0x01c5
            r0.CLe()
            goto L_0x0024
        L_0x0072:
            r10.A01()
            goto L_0x0024
        L_0x0076:
            X.80D r0 = r10.A0F
            boolean r5 = r0.A3F
            X.81m r0 = r10.A0K
            X.81t r4 = r0.A00()
            r7 = r6
            r8 = r6
            r9 = r6
            r4.FMJ(r5, r6, r7, r8, r9)
            goto L_0x0024
        L_0x0087:
            X.80D r0 = r10.A0F
            boolean r3 = r0.A3F
            X.8S2 r0 = r10.A0L
            X.8S1 r2 = r0.A01
            X.8Rz r1 = r2.A00
            X.8Yz r0 = r1.A0A
            X.80m r0 = r0.A09
            java.lang.Object r5 = r0.A00
            java.util.Set r5 = (java.util.Set) r5
            X.4yO r4 = r2.A00()
            X.9QA r0 = X.AnonymousClass9QA.A00
            r2 = 1
            if (r4 != r0) goto L_0x00d9
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x00d9
        L_0x00a8:
            r2 = 0
        L_0x00a9:
            X.8Fl r1 = r10.A0C
            X.8lC r0 = new X.8lC
            r0.<init>(r10, r3, r2)
            r1.A0U(r0)
            r10.A00()
            X.80V r2 = X.AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY
            r1 = 1
            r0 = 0
            if (r11 != r2) goto L_0x00bd
            r0 = 1
        L_0x00bd:
            r10.A02 = r0
            X.8DB r0 = r10.A0I
            X.81C r0 = r0.A00
            X.81E r0 = r0.A00()
            X.8Hd r0 = (X.C353318Hd) r0
            r0.CL9(r1)
            X.8E6 r0 = r10.A0M
            if (r0 == 0) goto L_0x0024
            X.B3Y r0 = r0.A00()
            r0.DCW()
            goto L_0x0024
        L_0x00d9:
            boolean r0 = r4 instanceof X.AnonymousClass80O
            if (r0 != 0) goto L_0x00a8
            X.8jC r0 = X.C363138jC.A00
            if (r4 == r0) goto L_0x00a8
            X.8aL r0 = X.C358088aL.A0G
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L_0x00a8
            X.8aL r0 = X.C358088aL.A0M
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L_0x00a8
            X.8aL r0 = X.C358088aL.A0D
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L_0x00a8
            X.8aL r0 = X.C358088aL.A0B
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x0114
            X.8Fl r1 = r1.A0C
            com.instagram.ui.widget.shutterbutton.ShutterButton r0 = r1.A1I
            X.5zl r0 = r0.A0i
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x00a8
            X.8GA r0 = r1.A0n
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x00a8
            goto L_0x00a9
        L_0x0114:
            java.lang.String r1 = "isFlashVisibleInVideoRecording() unsupported camera state="
            java.lang.String r0 = X.C393999xN.A00(r4, r5)
            java.lang.String r2 = X.002.A0R(r1, r0)
            java.lang.String r1 = "ig_camera"
            r0 = 0
            X.0kD.A07(r1, r2, r0)
            goto L_0x00a8
        L_0x0125:
            r10.A00()
            goto L_0x0024
        L_0x012a:
            X.81m r0 = r10.A0K
            X.81t r0 = r0.A00()
            r0.Ety(r6)
            X.8AL r0 = r10.A0G
            com.instagram.creation.capture.quickcapture.faceeffectui.NestableSnapPickerRecyclerView r1 = r0.A0P
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0024
        L_0x013e:
            X.81m r0 = r10.A0K
            X.81t r1 = r0.A00()
            X.80D r0 = r10.A0F
            boolean r0 = r0.A3D
            r1.Ety(r0)
            X.8AL r0 = r10.A0G
            com.instagram.creation.capture.quickcapture.faceeffectui.NestableSnapPickerRecyclerView r1 = r0.A0P
            r0 = 0
            r1.setVisibility(r0)
            goto L_0x001c
        L_0x0155:
            boolean r0 = r13 instanceof X.AnonymousClass8SD
            if (r0 != 0) goto L_0x015d
            boolean r0 = r13 instanceof X.C356328Tl
            if (r0 == 0) goto L_0x001c
        L_0x015d:
            r10.A01()
            goto L_0x001c
        L_0x0162:
            boolean r2 = r13 instanceof X.C355968Sb
            if (r2 != 0) goto L_0x0179
            boolean r0 = r13 instanceof X.C355958Sa
            if (r0 != 0) goto L_0x0173
            boolean r0 = r13 instanceof X.AnonymousClass8SO
            if (r0 != 0) goto L_0x0173
            boolean r0 = r13 instanceof X.AnonymousClass8SP
            r1 = 0
            if (r0 == 0) goto L_0x0174
        L_0x0173:
            r1 = 1
        L_0x0174:
            java.lang.String r0 = "the only events that take the camera out of the VIDEO_RECORDING state are either VideoRecordingStopped, VideoRecordingCanceled, VideoCaptured or MultipleMediaCaptured"
            X.17k.A0G(r1, r0)
        L_0x0179:
            X.8Yz r0 = r10.A0A
            X.80m r4 = r0.A08
            java.lang.Object r0 = r4.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0198
            boolean r0 = r13 instanceof X.AnonymousClass8SO
            if (r0 != 0) goto L_0x0198
            r3 = -1
            if (r2 != 0) goto L_0x0193
            boolean r0 = r13 instanceof X.C355958Sa
            if (r0 == 0) goto L_0x01ae
            r0 = r13
            X.8Sa r0 = (X.C355958Sa) r0
            int r3 = r0.A00
        L_0x0193:
            X.8Hx r0 = r10.A0O
            r0.DDZ(r3)
        L_0x0198:
            A06(r10)
            java.lang.Object r1 = r4.A00
            X.80N r0 = X.AnonymousClass80N.A00
            if (r1 != r0) goto L_0x001c
            X.8DD r0 = r10.A0H
            if (r0 == 0) goto L_0x001c
            X.8DM r0 = r0.A0O
            if (r0 == 0) goto L_0x01cd
            r0.CLe()
            goto L_0x001c
        L_0x01ae:
            java.lang.String r2 = "PreCaptureUICoordinator"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "unknown event state: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            X.0kD.A01(r2, r0)
            goto L_0x0193
        L_0x01c5:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01cd:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355948Rz.Dmx(java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    public final void Dsb() {
        if (!this.A05 && this.A0N.Ats() == AnonymousClass80X.PRE_CAPTURE) {
            AnonymousClass8S1 r2 = this.A0L.A01;
            if (!r2.A00.A0C.A0V() || AnonymousClass05K.A0N != r2.A01()) {
                this.A0K.A00().Eu6(false);
            }
            A06(this);
            this.A0K.A00().EuA();
        }
    }

    public final void A0A(AnonymousClass80X r7) {
        AnonymousClass87G A0D2;
        A06(this);
        InteractiveDrawableContainer interactiveDrawableContainer = this.A0Q;
        interactiveDrawableContainer.A0y(this);
        C357638Yz r5 = this.A0A;
        C358088aL r4 = C358088aL.A0C;
        interactiveDrawableContainer.A0O = !r5.A0V(r4);
        C3494680m r3 = r5.A08;
        if (r3.A00 instanceof AnonymousClass80O) {
            A05(this);
        } else {
            if (r5.A0V(r4)) {
                A0D2 = this.A0E.A0H.A01();
            } else {
                AnonymousClass8DD r0 = this.A0H;
                if (r0 != null) {
                    A0D2 = r0.A0D();
                }
            }
            A09(A0D2);
        }
        if ((r3.A00 instanceof AnonymousClass9QA) && r7 != null && r7 == AnonymousClass80X.SUB_FRAGMENT) {
            List<C390829ru> list = this.A0R;
            for (C390829ru ordinal : list) {
                int ordinal2 = ordinal.ordinal();
                if (ordinal2 == 0) {
                    this.A0K.A00().EuK();
                } else if (ordinal2 == 2) {
                    this.A0K.A00().Eu6(true);
                } else if (ordinal2 == 1) {
                    this.A0K.A00().EuA();
                } else if (ordinal2 == 3) {
                    this.A0K.A00().EuE();
                }
            }
            list.clear();
        }
    }

    public final void DDq() {
        A02();
    }

    public final void DDs(int i) {
        A02();
    }
}
