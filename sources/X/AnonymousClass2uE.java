package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2uE  reason: invalid class name */
public final class AnonymousClass2uE extends C252233om implements C232682uF, AnonymousClass4DR, View.OnTouchListener, C228412ld, AnonymousClass0j6, C232692uG, C232702uH, C60660ix {
    public static final C71392co A0j = C71392co.A04(60.0d, 5.0d);
    public static final String __redex_internal_original_name = "PeekMediaController";
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public ViewGroup A06;
    public 2cv A07;
    public C55489HiX A08;
    public C3254872q A09;
    public C323176x4 A0A;
    public C289875eN A0B;
    public Integer A0C;
    public Runnable A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public 1Xj A0I;
    public String A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final int A0N;
    public final Activity A0O;
    public final Context A0P;
    public final Handler A0Q;
    public final Fragment A0R;
    public final 2cs A0S;
    public final UserSession A0T;
    public final AnonymousClass57N A0U;
    public final C232712uI A0V;
    public final C232902ud A0W;
    public final AnonymousClass4DU A0X;
    public final C231292rN A0Y;
    public final C232722uK A0Z;
    public final C249763kK A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final int[] A0e;
    public final C232922uf A0f;
    public final AnonymousClass2k1 A0g;
    public final C232952ui A0h;
    public final Map A0i;

    public AnonymousClass2uE(Activity activity, Fragment fragment, 0hq r19, UserSession userSession, AnonymousClass57N r21, AnonymousClass4DU r22, C231292rN r23, C249763kK r24, boolean z, boolean z2, boolean z3) {
        String str;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 5);
        Activity activity2 = activity;
        this.A0O = activity2;
        Fragment fragment2 = fragment;
        this.A0R = fragment2;
        this.A0d = z;
        this.A0T = userSession2;
        AnonymousClass4DU r8 = r22;
        this.A0X = r8;
        C249763kK r4 = r24;
        this.A0a = r4;
        this.A0c = z2;
        this.A0U = r21;
        this.A0b = z3;
        this.A0V = new C232712uI(activity2);
        Context requireContext = fragment2.requireContext();
        this.A0P = requireContext;
        this.A0Y = r23;
        this.A0Q = new Handler();
        this.A0N = 2db.A01(activity2);
        this.A0M = AnonymousClass2uJ.A00;
        this.A0e = new int[2];
        AnonymousClass2k1 r5 = new AnonymousClass2k1();
        this.A0g = r5;
        if (r5.A00 == null) {
            r5.A00 = "peek_media";
        }
        Resources resources = activity2.getResources();
        this.A0K = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A0L = resources.getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
        if (r24 != null) {
            str = r4.getSessionId();
        } else {
            str = null;
        }
        C232722uK r52 = new C232722uK(activity2, userSession2, r8, (C228412ld) null, str == null ? "" : str, true, true, false, true, false);
        this.A0Z = r52;
        r52.A0P.add(this);
        r52.A08 = true;
        this.A0W = new C232902ud(r19, userSession2, new C230562pp(userSession2, new C232832uW(userSession2, r4), this, false), this, r8, this, r4);
        this.A0C = AnonymousClass05K.A00;
        this.A0i = new HashMap();
        2cs A022 = C61340me.A00().A02();
        A022.A09(A0j);
        this.A0S = A022;
        this.A0f = new C232912ue(this);
        C232952ui r42 = new C232952ui(requireContext, userSession2, new C232932ug(this));
        this.A0h = r42;
        r42.A0D = false;
        r42.A01 = 0;
        r42.A04.A09(C71392co.A03(10.0d, 20.0d));
        r42.A05.A09(C71392co.A03(8.0d, 12.0d));
    }

    public static final void A02(AnonymousClass2uE r4, AnonymousClass3WA r5) {
        int i;
        A03(r4, r5, true);
        boolean z = C240133Js.A00(r4.A0T).A01;
        Context context = r4.A0P;
        if (z) {
            i = 2131972214;
        } else {
            i = 2131972212;
        }
        C59689JTv.A01(context, (String) null, i, 1);
    }

    public final AnonymousClass3W1 BQr(1Xj r5) {
        0qQ.A0B(r5, 0);
        Map map = this.A0i;
        AnonymousClass3W1 r2 = (AnonymousClass3W1) map.get(r5.getId());
        if (r2 == null) {
            r2 = new AnonymousClass3W1(r5.A0o(), r5.A4o());
            String id = r5.getId();
            if (id != null) {
                map.put(id, r2);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return r2;
    }

    public final void D6z(View view) {
        0qQ.A0B(view, 0);
        this.A0W.A01.D6z(view);
    }

    public final void DYx(1Xj r1, int i) {
    }

    public final /* synthetic */ void Dql(1Xj r1, AnonymousClass3V3 r2, AnonymousClass3W1 r3) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (A07().A5D() == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Dsa(android.view.MotionEvent r4, android.view.View r5, X.AnonymousClass1Xq r6, int r7) {
        /*
            r3 = this;
            r2 = 0
            X.0qQ.A0B(r5, r2)
            r0 = 1
            X.0qQ.A0B(r4, r0)
            r0 = 2
            X.0qQ.A0B(r6, r0)
            int r0 = r4.getActionMasked()
            if (r0 != 0) goto L_0x003a
            com.instagram.common.session.UserSession r0 = r3.A0T
            X.1E8 r1 = X.1E7.A00(r0)
            java.lang.String r0 = r6.getId()
            X.1Xj r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0024
            r3.A0I = r0
        L_0x0024:
            X.1Xj r0 = r3.A0I
            if (r0 == 0) goto L_0x0033
            X.1Xj r0 = r3.A07()
            boolean r1 = r0.A5D()
            r0 = 0
            if (r1 != 0) goto L_0x0034
        L_0x0033:
            r0 = -1
        L_0x0034:
            r3.A00 = r0
            r3.A01 = r7
            r3.A05 = r5
        L_0x003a:
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x0048
            int r1 = r4.getActionMasked()
            r0 = 3
            if (r1 != r0) goto L_0x0048
            r3.A0F = r2
            return r2
        L_0x0048:
            X.2ui r0 = r3.A0h
            r0.onTouch(r5, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2uE.Dsa(android.view.MotionEvent, android.view.View, X.1Xq, int):boolean");
    }

    public final void Dxf(1Xj r1, String str) {
    }

    public final void Dxw(1Xj r1, boolean z) {
    }

    public final void DyO(C257183wz r1, 1Xj r2) {
    }

    public final 0jB E4l(1Xj r3) {
        0jB r0;
        0qQ.A0B(r3, 0);
        AnonymousClass4DU r1 = this.A0X;
        if (r1 instanceof C232682uF) {
            r0 = ((C232682uF) r1).E4l(r3);
        } else {
            r0 = new 0jB();
        }
        0qQ.A0A(r0);
        return r0;
    }

    public final void EU9(C289875eN r2) {
        0qQ.A0B(r2, 0);
        this.A0B = r2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1) {
            2cv r1 = this.A07;
            if (r1 != null) {
                r1.CNi((View.OnTouchListener) null);
            }
            this.A07 = null;
        }
        this.A0h.onTouch(this.A05, motionEvent);
        if (this.A0C == AnonymousClass05K.A00) {
            return false;
        }
        return true;
    }

    public static final void A00(AnonymousClass2uE r3) {
        r3.A0h.A01();
        C3254872q r0 = r3.A09;
        if (r0 != null) {
            r0.A00.setVisibility(4);
            r3.A0W.A00(r3.A07(), r3.A00);
            r3.A0C = AnonymousClass05K.A0C;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A01(AnonymousClass2uE r3) {
        Fragment fragment = r3.A0R;
        UserSession userSession = r3.A0T;
        String A2n = r3.A07().A2n();
        if (A2n != null) {
            1ES.A03(C56334Hwl.A00(fragment, userSession, A2n));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A03(AnonymousClass2uE r4, AnonymousClass3WA r5, boolean z) {
        C231292rN r1;
        UserSession userSession = r4.A0T;
        1sd.A00(userSession).A02(r4.A07(), true);
        1sd.A00(userSession).A01(r4.A07(), r5.A00);
        AnonymousClass1Nd.A00(userSession).A00(new C57066INg(r4.A07()));
        AnonymousClass32M r2 = r4.A0R;
        if (r2 instanceof AnonymousClass32M) {
            0qQ.A0C(r2, "null cannot be cast to non-null type com.instagram.feed.helper.DismissMediaListener");
            r2.DPz(r4.A07(), r4.BQr(r4.A07()), z);
            return;
        }
        if (r2 instanceof AnonymousClass32G) {
            ListAdapter listAdapter = ((0S7) r2).A03;
            if (listAdapter instanceof C231292rN) {
                r1 = (C231292rN) listAdapter;
            } else {
                return;
            }
        } else {
            r1 = r4.A0Y;
            if (r1 == null) {
                return;
            }
        }
        r1.Cs9(r4.A07());
    }

    public static final boolean A04(View view, AnonymousClass2uE r3, String str, float f, float f2) {
        C3254872q r1 = r3.A09;
        if (r1 == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (view.getVisibility() != 0 || !VC2.A00(view, f, f2)) {
            return false;
        } else {
            View view2 = r1.A01;
            view2.setAlpha(0.0f);
            view2.bringToFront();
            ((TextView) view2).setText(str);
            r3.A02 = view;
            view.getLocationInWindow(r3.A0e);
            return true;
        }
    }

    public static final boolean A05(AnonymousClass2uE r4) {
        PromptStickerModel A002;
        C323176x4 r0 = r4.A0A;
        if (r0 == null || !r0.CZI()) {
            return false;
        }
        0eE r02 = AnonymousClass0t1.A01;
        UserSession userSession = r4.A0T;
        if (!0qQ.A0K(r02.A01(userSession), r4.A07().A2A(userSession)) || (A002 = C52200GIr.A00(r4.A07())) == null || !A002.A0K()) {
            return false;
        }
        return true;
    }

    public static final boolean A06(AnonymousClass2uE r2) {
        C323176x4 r0 = r2.A0A;
        if (r0 == null || !r0.CZJ() || r2.A07().A58() || r2.A07().A5s() || !2R8.A02(r2.A0T, r2.A07())) {
            return false;
        }
        return true;
    }

    public final 1Xj A07() {
        1Xj r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("media");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DnU(1Xj r5, int i, int i2, int i3) {
        AnonymousClass3W1 BQr;
        if (r5 != null) {
            C231292rN r3 = this.A0Y;
            1Xj A072 = A07();
            if (r3 == null) {
                BQr = BQr(A072);
            } else {
                BQr = r3.BQr(A072);
            }
            if (BQr != null || r3 == null) {
                BQr.A0E(i, BQr.A03);
            } else {
                0wb.A03(__redex_internal_original_name, 002.A0R("MediaStateAdapter gave a null MediaState which should not happen. Guilty adapter class: ", r3.getClass().getSimpleName()));
            }
        }
    }

    public final 0jB E4k() {
        0jB r0;
        AnonymousClass4DU r1 = this.A0X;
        if (r1 instanceof C232682uF) {
            r0 = ((C232682uF) r1).E4k();
        } else {
            r0 = new 0jB();
        }
        0qQ.A0A(r0);
        return r0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0007: MOVE  (r2v1 X.0j6) = (r2v0 X.0j6)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final X.0jB E4x() {
        /*
            r3 = this;
            androidx.fragment.app.Fragment r2 = r3.A0R
            boolean r1 = r2 instanceof X.AnonymousClass0j6
            r0 = 0
            if (r1 == 0) goto L_0x000f
            X.0j6 r2 = (X.AnonymousClass0j6) r2
            if (r2 == 0) goto L_0x000f
            X.0jB r0 = r2.E4x()
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2uE.E4x():X.0jB");
    }

    public final String getModuleName() {
        String str = this.A0J;
        if (str == null) {
            str = 002.A0R(AnonymousClass000.A00(3726), this.A0X.getModuleName());
            this.A0J = str;
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return str;
    }

    public final String getModuleNameV2() {
        return this.A0g.A00;
    }

    public final boolean isOrganicEligible() {
        return this.A0X.isOrganicEligible();
    }

    public final boolean isSponsoredEligible() {
        return this.A0X.isSponsoredEligible();
    }

    public final boolean onBackPressed() {
        Integer num = this.A0C;
        if (num == AnonymousClass05K.A00 || num == AnonymousClass05K.A01) {
            return false;
        }
        return true;
    }

    public final void onCreate() {
        this.A0W.A01.onCreate();
    }

    public final void onDestroy() {
        this.A0W.A01.onDestroy();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r1 != null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDestroyView() {
        /*
            r2 = this;
            X.72q r0 = r2.A09
            if (r0 == 0) goto L_0x0011
            X.52z r0 = r0.A0H
            if (r0 == 0) goto L_0x0011
            X.GAM r0 = r0.A04
            if (r0 == 0) goto L_0x0011
            android.animation.ValueAnimator r0 = r0.A08
            r0.cancel()
        L_0x0011:
            android.view.ViewGroup r1 = r2.A06
            if (r1 != 0) goto L_0x0026
            android.content.Context r1 = r2.A0P
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            X.0qQ.A0C(r1, r0)
            android.app.Activity r1 = (android.app.Activity) r1
            android.view.ViewGroup r1 = X.C232972uk.A03(r1)
            r2.A06 = r1
            if (r1 == 0) goto L_0x002b
        L_0x0026:
            android.view.View r0 = r2.A04
            r1.removeView(r0)
        L_0x002b:
            r0 = 0
            r2.A04 = r0
            r2.A09 = r0
            X.2ud r0 = r2.A0W
            X.2pp r0 = r0.A01
            r0.onDestroyView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2uE.onDestroyView():void");
    }

    public final void onPause() {
        View view;
        this.A0C = AnonymousClass05K.A00;
        if (this.A0I != null) {
            C232902ud r0 = this.A0W;
            1Xj A072 = A07();
            int i = this.A00;
            C230562pp r02 = r0.A01;
            r02.A03(A072, i);
            r02.A02(A072, i);
            r02.onPause();
            1Xj A073 = A07();
            1Xj A1c = A073.A1c(this.A00);
            if (A1c == null) {
                A1c = A073;
            }
            if (A1c.CeS()) {
                this.A0Z.A0U("fragment_paused", false, false);
            }
        }
        View view2 = this.A04;
        if (!(view2 == null || this.A09 == null)) {
            view2.setVisibility(4);
            C3254872q r03 = this.A09;
            if (!(r03 == null || (view = r03.A00) == null)) {
                view.setVisibility(4);
            }
        }
        this.A0h.A00();
        2cs r1 = this.A0S;
        r1.A0B(this.A0f);
        r1.A01();
        this.A05 = null;
        2cv r04 = this.A07;
        if (r04 != null) {
            r04.CNi((View.OnTouchListener) null);
        }
        this.A07 = null;
    }

    public final void onResume() {
        this.A0S.A0A(this.A0f);
        this.A0W.A01.onResume();
        UserSession userSession = this.A0T;
        if (C240133Js.A00(userSession).A00) {
            C240133Js.A00(userSession);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2uE(android.app.Activity r13, androidx.fragment.app.Fragment r14, X.0hq r15, com.instagram.common.session.UserSession r16, X.AnonymousClass4DU r17, X.C231292rN r18, X.C249763kK r19, boolean r20) {
        /*
            r12 = this;
            r10 = 1
            r0 = 3
            r3 = r15
            X.0qQ.A0B(r15, r0)
            r0 = 5
            r4 = r16
            X.0qQ.A0B(r4, r0)
            r5 = 0
            r11 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2uE.<init>(android.app.Activity, androidx.fragment.app.Fragment, X.0hq, com.instagram.common.session.UserSession, X.4DU, X.2rN, X.3kK, boolean):void");
    }
}
