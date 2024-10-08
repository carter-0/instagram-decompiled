package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.338  reason: invalid class name */
public final class AnonymousClass338 implements AnonymousClass339, C252243on {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final Fragment A05;
    public final UserSession A06;
    public final AnonymousClass4DU A07;
    public final AnonymousClass2xS A08;
    public final C249763kK A09;
    public final C227762js A0A;
    public final AnonymousClass4DV A0B;
    public final AnonymousClass337 A0C;
    public final AnonymousClass0eM A0D = AnonymousClass0eN.A01(new AnonymousClass9L2(this, 20));

    public AnonymousClass338(Fragment fragment, C227762js r5, UserSession userSession, AnonymousClass4DU r7, AnonymousClass2xS r8, AnonymousClass4DV r9, C249763kK r10, AnonymousClass337 r11) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(fragment, 2);
        0qQ.A0B(r7, 3);
        0qQ.A0B(r10, 4);
        this.A06 = userSession;
        this.A05 = fragment;
        this.A07 = r7;
        this.A09 = r10;
        this.A0B = r9;
        this.A0A = r5;
        this.A08 = r8;
        this.A0C = r11;
        this.A04 = fragment.requireContext();
        this.A00 = 3;
        if (fragment instanceof AnonymousClass4DJ) {
            ((AnonymousClass4DJ) fragment).registerLifecycleListener(this);
        }
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final Integer BE0(1Xj r7) {
        0qQ.A0B(r7, 0);
        UserSession userSession = this.A06;
        AnonymousClass4DU r3 = this.A07;
        C55174HdQ A022 = C263264Jy.A02(A01(), userSession, r7, r3, this.A0C, AnonymousClass05K.A01);
        if (A022 instanceof C54512HGy) {
            return Integer.valueOf(((C54512HGy) A022).A03);
        }
        return null;
    }

    public final C54512HGy CG9(1Xj r7) {
        0qQ.A0B(r7, 0);
        UserSession userSession = this.A06;
        AnonymousClass4DU r3 = this.A07;
        C55174HdQ A022 = C263264Jy.A02(A01(), userSession, r7, r3, this.A0C, AnonymousClass05K.A01);
        if (A022 instanceof C54512HGy) {
            return (C54512HGy) A022;
        }
        return null;
    }

    public final void Cmp() {
    }

    public final void Co3(1Xj r8) {
        0qQ.A0B(r8, 0);
        C263264Jy.A04(this.A06, r8, this.A07, (C297795sM) null, AnonymousClass000.A00(3708), "dismiss");
        AnonymousClass37D A012 = AnonymousClass37D.A00.A01(A01());
        if (A012 != null) {
            A012.A0S(AnonymousClass05K.A00);
        }
    }

    public final void CwU(1Xj r3, AnonymousClass3W1 r4) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(r4, 1);
        AnonymousClass2xS r0 = this.A08;
        if (r0 != null) {
            r0.A0G.A0S(r3, r4, -3);
        }
    }

    public final /* synthetic */ void D6z(View view) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0162  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean E0m(android.view.View r24, X.1Xj r25, X.C55865Hom r26, X.AnonymousClass3W1 r27, X.C54512HGy r28) {
        /*
            r23 = this;
            r0 = 1
            r14 = r25
            X.0qQ.A0B(r14, r0)
            r2 = 2
            r1 = r27
            X.0qQ.A0B(r1, r2)
            r7 = 3
            X.3OA r5 = X.C250913mG.A00(r14)     // Catch:{ NullPointerException -> 0x0012 }
            goto L_0x0013
        L_0x0012:
            r5 = 0
        L_0x0013:
            r2 = r23
            androidx.fragment.app.FragmentActivity r3 = r2.A01()
            com.instagram.common.session.UserSession r12 = r2.A06
            r8 = 0
            com.instagram.model.androidlink.AndroidLink r11 = X.AnonymousClass47K.A02(r3, r12, r14, r8, r8)
            if (r11 == 0) goto L_0x016a
            java.lang.String r9 = r11.CGH()
        L_0x0026:
            if (r5 == 0) goto L_0x013b
            if (r9 == 0) goto L_0x013b
            r4 = r28
            java.lang.String r6 = r4.A07
            r3 = 3032(0xbd8, float:4.249E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            boolean r10 = X.0qQ.A0K(r6, r3)
            androidx.fragment.app.FragmentActivity r16 = r2.A01()
            X.2EG r18 = X.2EG.A4C
            X.SUL r6 = new X.SUL
            r15 = r6
            r17 = r12
            r19 = r9
            r20 = r8
            r15.<init>(r16, r17, r18, r19, r20)
            r6.A0z = r0
            boolean r3 = r4.A0J
            r6.A0Z = r3
            X.IZV r3 = new X.IZV
            r3.<init>(r4)
            r6.A0F = r3
            boolean r3 = r4.A0C
            r6.A0l = r3
            boolean r3 = r4.A0D
            r6.A1E = r3
            r6.A18 = r0
            r6.A0c = r8
            r6.A11 = r0
            boolean r3 = r4.A0K
            r6.A0f = r3
            float r3 = r4.A02
            r6.A03 = r3
            r6.A0q = r0
            boolean r9 = r4.A0G
            X.RIg r3 = X.RIg.WATCH_WITH_OVERLAY
            r6.A0s = r9
            r6.A09 = r3
            boolean r3 = r4.A0H
            r6.A0x = r3
            r6.A1A = r10
            r6.A16 = r10
            X.IZj r3 = new X.IZj
            r9 = r26
            r3.<init>(r14, r2, r9, r1)
            r6.A0G = r3
            boolean r3 = r4.A0I
            r6.A0y = r3
            X.HFb r3 = new X.HFb
            r3.<init>(r14, r2, r9)
            r6.A0J = r3
            r6.A12 = r0
            java.lang.String r3 = r5.A0j
            r6.A0D(r3)
            java.lang.String r3 = r5.A0S
            r6.A0B(r3)
            java.lang.String r3 = r14.getId()
            r6.A0C(r3)
            java.lang.String r3 = r12.A05
            r6.A0F(r3)
            boolean r3 = r4.A0B
            if (r3 == 0) goto L_0x00b5
            r6.A0k = r0
            float r3 = r4.A01
            r6.A01 = r3
        L_0x00b5:
            X.0Tu r9 = X.0Tu.A05
            r3 = 36323741013126592(0x810c4000002dc0, double:3.0346183084417985E-306)
            boolean r3 = X.182.A06(r9, r12, r3)
            if (r3 == 0) goto L_0x00db
            r3 = 36318148968781776(0x81072a002f17d0, double:3.0310818770807816E-306)
            boolean r3 = X.182.A06(r9, r12, r3)
            if (r3 == 0) goto L_0x00db
            X.1Xy r3 = r14.A0C
            X.3lZ r3 = r3.getInjected()
            if (r3 == 0) goto L_0x0139
            com.instagram.api.schemas.IGAdsIABScreenshotDataDict r3 = r3.BEo()
        L_0x00d9:
            r6.A0E = r3
        L_0x00db:
            X.3Dp r10 = X.C238833Dp.A00(r12)
            X.4DU r15 = r2.A07
            r9 = r24
            android.content.Context r3 = r9.getContext()
            X.0qQ.A07(r3)
            X.4HH r4 = new X.4HH
            r4.<init>(r3, r1, r12, r14)
            X.3e7 r3 = new X.3e7
            r3.<init>(r4, r12, r14, r15)
            r10.A0A(r9, r3)
            X.3Dp r4 = X.C238833Dp.A00(r12)
            java.lang.String[] r3 = new java.lang.String[r8]
            r4.A0B(r9, r3)
            r6.A0A()
            r2.A00 = r7
            r2.A02 = r0
            X.2EG r3 = X.2EG.A2R
            java.lang.String r18 = r3.toString()
            java.lang.String r20 = r11.CGH()
            X.GlN r3 = r1.A06()
            X.4jb r13 = new X.4jb
            r13.<init>(r12, r5, r3)
            X.3kK r3 = r2.A09
            java.lang.String r21 = r3.getSessionId()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r16 = java.lang.Float.valueOf(r3)
            java.lang.String r22 = X.1sx.A0A(r14, r1)
            java.lang.String r19 = "webclick"
            r17 = r16
            X.C233822wX.A0L(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r3 = r2.A02
            if (r3 == 0) goto L_0x015c
            A00(r14, r2, r1, r0)
        L_0x0138:
            return r3
        L_0x0139:
            r3 = 0
            goto L_0x00d9
        L_0x013b:
            X.0kg r3 = X.0kg.A03
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Ad or Link is null: Ad = "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = " , link = "
            r2.append(r0)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "WatchAndBrowse#Browser"
            X.0wb.A01(r3, r0, r2)
            r3 = 0
        L_0x015c:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            java.lang.Integer r0 = r1.A13
            if (r0 == r2) goto L_0x0138
            r1.A13 = r2
            r0 = 50
            X.AnonymousClass3W1.A00(r1, r0)
            return r3
        L_0x016a:
            r9 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass338.E0m(android.view.View, X.1Xj, X.Hom, X.3W1, X.HGy):boolean");
    }

    public final void EXc(int i, ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        View childAt = viewGroup.getChildAt(0);
        ViewGroup.LayoutParams layoutParams2 = null;
        if (childAt != null) {
            layoutParams2 = childAt.getLayoutParams();
        }
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.gravity = i;
        }
    }

    public final boolean Evt(View view, int i) {
        C238133Ar r2;
        C238133Ar r0;
        AnonymousClass2xS r3 = this.A08;
        if (!(r3 == null || (r2 = r3.A03) == null || r2.BLx(view) == -1)) {
            int BLx = r2.BLx(view);
            if (!(Integer.valueOf(BLx) == null || (r0 = r3.A03) == null)) {
                r0.Evs(BLx, i, 150);
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r10.A00 == 4) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        X.C263264Jy.A04(r10.A06, r5, r10.A07, X.C55170HdM.A00(r10.A04, r11), r8, "dismiss");
        r1 = X.AnonymousClass37D.A00.A01(A01());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        r0 = X.AnonymousClass05K.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r13.A0H == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        X.C263264Jy.A03(A01(), 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        r1 = X.AnonymousClass37D.A00.A01(A01());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        if (r1 == null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007a, code lost:
        r1.A0U(X.AnonymousClass05K.A0Y, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        r10.A00 = 4;
        r4 = r10.A06;
        r6 = r10.A07;
        r7 = X.C55170HdM.A00(r10.A04, r11);
        r9 = "collapse";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EzH(X.C53277GlP r11, X.1Xj r12, X.C54512HGy r13, java.lang.String r14) {
        /*
            r10 = this;
            r3 = 1
            r5 = r12
            X.0qQ.A0B(r12, r3)
            r4 = 2
            if (r13 == 0) goto L_0x001e
            r0 = 1870(0x74e, float:2.62E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r0)
            boolean r0 = r14.equals(r8)
            if (r0 == 0) goto L_0x008f
            java.lang.String r2 = r13.A08
            int r0 = r2.hashCode()
            r4 = 4
            switch(r0) {
                case -632085587: goto L_0x001f;
                case 270940796: goto L_0x0122;
                case 601417728: goto L_0x0035;
                case 1671672458: goto L_0x002c;
                default: goto L_0x001e;
            }
        L_0x001e:
            return
        L_0x001f:
            java.lang.String r0 = "collapse"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001e
            int r0 = r10.A00
            if (r0 != r4) goto L_0x0063
            return
        L_0x002c:
            java.lang.String r0 = "dismiss"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0045
            return
        L_0x0035:
            r0 = 2818(0xb02, float:3.949E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001e
            int r0 = r10.A00
            if (r0 != r4) goto L_0x0063
        L_0x0045:
            com.instagram.common.session.UserSession r4 = r10.A06
            X.4DU r6 = r10.A07
            android.content.Context r0 = r10.A04
            X.5sM r7 = X.C55170HdM.A00(r0, r11)
            java.lang.String r9 = "dismiss"
            X.C263264Jy.A04(r4, r5, r6, r7, r8, r9)
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r10.A01()
            X.37D r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x001e
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x00d3
        L_0x0063:
            boolean r0 = r13.A0H
            if (r0 == 0) goto L_0x006e
            androidx.fragment.app.FragmentActivity r0 = r10.A01()
            X.C263264Jy.A03(r0, r4)
        L_0x006e:
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r10.A01()
            X.37D r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x007f
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r1.A0U(r0, r3)
        L_0x007f:
            r10.A00 = r4
            com.instagram.common.session.UserSession r4 = r10.A06
            X.4DU r6 = r10.A07
            android.content.Context r0 = r10.A04
            X.5sM r7 = X.C55170HdM.A00(r0, r11)
            java.lang.String r9 = "collapse"
            goto L_0x0136
        L_0x008f:
            r0 = 5315(0x14c3, float:7.448E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r0)
            boolean r0 = r14.equals(r8)
            if (r0 == 0) goto L_0x001e
            java.lang.String r2 = r13.A09
            int r1 = r2.hashCode()
            r0 = 270940796(0x10263a7c, float:3.2782782E-29)
            if (r1 == r0) goto L_0x0122
            r0 = 707032707(0x2a247683, float:1.4607243E-13)
            if (r1 == r0) goto L_0x00d7
            r0 = 1671672458(0x63a3b28a, float:6.039369E21)
            if (r1 != r0) goto L_0x001e
            java.lang.String r9 = "dismiss"
            boolean r0 = r2.equals(r9)
            if (r0 == 0) goto L_0x001e
            com.instagram.common.session.UserSession r4 = r10.A06
            X.4DU r6 = r10.A07
            android.content.Context r0 = r10.A04
            X.5sM r7 = X.C55170HdM.A00(r0, r11)
            X.C263264Jy.A04(r4, r5, r6, r7, r8, r9)
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r10.A01()
            X.37D r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x001e
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x00d3:
            r1.A0S(r0)
            return
        L_0x00d7:
            r0 = 3076(0xc04, float:4.31E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001e
            boolean r0 = r13.A0H
            if (r0 == 0) goto L_0x00fd
            com.instagram.common.session.UserSession r3 = r10.A06
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321284292224237(0x810a04000624ed, double:3.033064668250728E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x00fd
            androidx.fragment.app.FragmentActivity r0 = r10.A01()
            X.C263264Jy.A03(r0, r4)
        L_0x00fd:
            com.instagram.common.session.UserSession r4 = r10.A06
            X.4DU r6 = r10.A07
            android.content.Context r0 = r10.A04
            X.5sM r7 = X.C55170HdM.A00(r0, r11)
            r0 = 3171(0xc63, float:4.444E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            X.C263264Jy.A04(r4, r5, r6, r7, r8, r9)
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r10.A01()
            X.37D r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x001e
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r1.A0T(r0)
            return
        L_0x0122:
            java.lang.String r0 = "disabled"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001e
            com.instagram.common.session.UserSession r4 = r10.A06
            X.4DU r6 = r10.A07
            android.content.Context r0 = r10.A04
            X.5sM r7 = X.C55170HdM.A00(r0, r11)
            java.lang.String r9 = "no_change"
        L_0x0136:
            X.C263264Jy.A04(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass338.EzH(X.GlP, X.1Xj, X.HGy, java.lang.String):void");
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final void A00(1Xj r3, AnonymousClass338 r4, AnonymousClass3W1 r5, boolean z) {
        C232722uK r0;
        AnonymousClass2xS r2 = r4.A08;
        if (!(r2 == null || (r0 = r2.A0G) == null)) {
            r0.A08 = z;
        }
        UserSession userSession = r4.A06;
        if (1GE.A00(userSession).A01 == null && C263734Nd.A00(userSession, r3, r5) && r2 != null) {
            r2.A0G.A0S(r3, r5, -7);
        }
    }

    public final FragmentActivity A01() {
        Object value = this.A0D.getValue();
        0qQ.A07(value);
        return (FragmentActivity) value;
    }

    public final void AAo(int i) {
        Integer num;
        C263744Ne r0;
        AnonymousClass3V3 r02;
        AnonymousClass3TS Adf;
        FrameLayout A002;
        AnonymousClass2xS r03 = this.A08;
        if (r03 != null) {
            C232722uK r2 = r03.A0G;
            AnonymousClass3W1 A0H = r2.A0H();
            if (A0H != null) {
                num = A0H.A13;
            } else {
                num = null;
            }
            if (num == AnonymousClass05K.A00 && (r0 = r2.A02) != null && (r02 = r0.A08) != null && (Adf = r02.Adf()) != null && (A002 = Adf.A00()) != null) {
                0nA.A0X(A002, i);
            }
        }
    }

    public final int AEx(int i, int i2) {
        Context context = this.A04;
        return ((AnonymousClass0nB.A00(context) - i) - 2Yu.A0G(context, 0Pn.A01(this.A06))) - i2;
    }

    public final int AFA(int i) {
        Context context = this.A04;
        return ((AnonymousClass0nB.A00(context) - i) - 2Yu.A0G(context, 0Pn.A01(this.A06))) / 2;
    }

    public final void AID() {
        C227762js r1 = this.A0A;
        if (r1 != null) {
            r1.A0C = true;
        }
    }

    public final int APq(View view, C238123Aq r7) {
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        RectF rectF = 0nA.A01;
        0nA.A0L(rectF, view);
        rectF.round(rect);
        r7.B9Z(rect2);
        int i = rect.top - rect2.top;
        if (182.A06(0Tu.A05, this.A06, 36317560555443537L)) {
            return i - C226122ff.A01();
        }
        return i;
    }

    public final void ATU() {
        AnonymousClass37D A012 = AnonymousClass37D.A00.A01(A01());
        if (A012 != null) {
            A012.A0B();
        }
    }

    public final void ATd() {
        AnonymousClass37D A012 = AnonymousClass37D.A00.A01(A01());
        if (A012 != null) {
            A012.A0T(AnonymousClass05K.A04);
        }
    }

    public final float AiC(int i) {
        float f;
        AnonymousClass37D A012 = AnonymousClass37D.A00.A01(A01());
        if (A012 != null) {
            C7218Pzn pzn = ((AnonymousClass37F) A012).A0D;
            if (pzn != null) {
                f = pzn.A0E(i);
            } else {
                f = 0.0f;
            }
            if (Float.valueOf(f) == null) {
                return 0.0f;
            }
            return f;
        }
        return 0.0f;
    }

    public final Integer B2a(C54512HGy hGy) {
        if (hGy != null) {
            return Integer.valueOf(hGy.A04);
        }
        return null;
    }

    public final Integer B2d() {
        return Integer.valueOf(AnonymousClass0nB.A01(this.A04));
    }

    public final View B7z() {
        AnonymousClass2xS r0 = this.A08;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public final boolean CPi() {
        return this.A01;
    }

    public final boolean CPj() {
        return this.A02;
    }

    public final void Evp(C238123Aq r7, int i, int i2) {
        r7.A03.A0z(new LinearInterpolator(), 0, i, i2, false);
    }

    public final C238133Ar getScrollingViewProxy() {
        AnonymousClass4DV r0 = this.A0B;
        if (r0 != null) {
            return r0.getScrollingViewProxy();
        }
        return null;
    }

    public final void onDestroy() {
        AnonymousClass4DJ r1 = this.A05;
        if (r1 instanceof AnonymousClass4DJ) {
            r1.unregisterLifecycleListener(this);
        }
    }

    public final void onPause() {
        if (this.A02 && !this.A01) {
            ATU();
        }
    }

    public final void onResume() {
        if (this.A02) {
            2dZ.A0t.A03(A01()).Etr(false);
        }
    }
}
