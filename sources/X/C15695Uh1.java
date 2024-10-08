package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Uh1  reason: case insensitive filesystem */
public final class C15695Uh1 extends C252233om implements C232682uF, AnonymousClass4DR, View.OnTouchListener, C228412ld, AnonymousClass0j6, C232692uG, C232702uH {
    public static final String __redex_internal_original_name = "GridQuickPreviewController";
    public int A00;
    public int A01;
    public View A02;
    public 2cv A03;
    public 1Xj A04;
    public C289875eN A05;
    public C56008HrG A06;
    public C19719WeL A07;
    public C317396nC A08;
    public Boolean A09;
    public Integer A0A;
    public boolean A0B;
    public String A0C;
    public final Context A0D;
    public final Fragment A0E;
    public final 2cs A0F;
    public final UserSession A0G;
    public final C2356130n A0H;
    public final C232902ud A0I;
    public final VZU A0J;
    public final AnonymousClass4DU A0K;
    public final AnonymousClass4JX A0L = new WX9(this);
    public final C232722uK A0M;
    public final C232922uf A0N;
    public final VNE A0O;
    public final VNF A0P;
    public final IU6 A0Q;
    public final W85 A0R;
    public final C231292rN A0S;
    public final Map A0T;

    public C15695Uh1(Context context, Fragment fragment, 0hq r26, UserSession userSession, C2356130n r28, AnonymousClass4DU r29, C231292rN r30, 0Pl r31) {
        VNE vne = new VNE(this);
        this.A0O = vne;
        this.A0P = new VNF(this);
        C15165UTq uTq = new C15165UTq(this, 2);
        this.A0N = uTq;
        Context context2 = context;
        this.A0D = context2;
        UserSession userSession2 = userSession;
        this.A0G = userSession2;
        Fragment fragment2 = fragment;
        this.A0E = fragment2;
        this.A0S = r30;
        AnonymousClass4DU r9 = r29;
        this.A0K = r9;
        this.A0A = AnonymousClass05K.A00;
        this.A0T = new HashMap();
        this.A0R = new W85(context2, vne);
        0hq r1 = r26;
        0hq r16 = r1;
        this.A0I = new C232902ud(r16, userSession2, new C230562pp(userSession2, new C232832uW(userSession2, (C249763kK) null), this, false), this, r9, this, (C249763kK) null);
        IU6 iu6 = new IU6(fragment2, r1, userSession2, this);
        this.A0Q = iu6;
        this.A0J = new VZU(context2, fragment2.requireActivity(), userSession2, iu6, r31);
        2cs A0J2 = AnonymousClass7TF.A0J();
        A0J2.A06 = true;
        A0J2.A00 = 0.019999999552965164d;
        A0J2.A09(C71392co.A03(8.0d, 12.0d));
        A0J2.A0A(uTq);
        this.A0F = A0J2;
        0qQ.A0B(userSession2, 3);
        C232722uK r6 = new C232722uK(context2, userSession2, r9, (C228412ld) null, "", true, true, false, true, false);
        this.A0M = r6;
        r6.A08 = true;
        r6.A0P.add(this);
        this.A0H = r28;
    }

    public final void DYx(1Xj r1, int i) {
    }

    public final /* synthetic */ void Dql(1Xj r1, AnonymousClass3V3 r2, AnonymousClass3W1 r3) {
    }

    public final void Dxf(1Xj r1, String str) {
    }

    public final void Dxw(1Xj r1, boolean z) {
    }

    public final void DyO(C257183wz r1, 1Xj r2) {
    }

    public static void A01(2cs r4, C15695Uh1 uh1) {
        Integer num;
        if (r4.A09.A00 != 1.0d && uh1.A0A != (num = AnonymousClass05K.A00)) {
            uh1.A0A = num;
            uh1.A02.setVisibility(8);
            C289875eN r0 = uh1.A05;
            if (r0 != null) {
                r0.DWZ();
            }
            AnonymousClass1Po.A00.A00();
        }
    }

    public static void A02(C15695Uh1 uh1) {
        2cs r5 = uh1.A0F;
        r5.A06(0.0d);
        if (r5.A09.A00 == 0.0d) {
            A01(r5, uh1);
        }
        if (A00(uh1.A04, uh1.A00).CeS()) {
            uh1.A0M.A0U(AnonymousClass000.A00(3059), true, false);
        }
        C19719WeL weL = uh1.A07;
        if (weL.A09 != null) {
            TouchInterceptorFrameLayout touchInterceptorFrameLayout = weL.A0H;
            touchInterceptorFrameLayout.getViewTreeObserver().removeOnGlobalLayoutListener(weL.A09);
            weL.A09 = null;
            StringBuilder sb = new StringBuilder();
            C19719WeL.A00(weL, sb);
            sb.append(touchInterceptorFrameLayout.getHeight());
            sb.append(" mMediaContainer.getHeight(): ");
            0wb.A03("GridQuickPreviewDragHelper#tearDown", Pxe.A0z(sb, weL.A0I.getHeight()));
        }
        uh1.A0I.A00(uh1.A04, uh1.A00);
        uh1.A0A = AnonymousClass05K.A0C;
    }

    public static void A03(C15695Uh1 uh1) {
        C243363Yl r1;
        VNF vnf = uh1.A0P;
        if (0q2.A00(uh1.A0G).A0N(uh1.A04)) {
            r1 = C243363Yl.NOT_LIKED;
        } else {
            r1 = C243363Yl.LIKED;
        }
        0qQ.A0B(vnf, 0);
        int i = 2131964931;
        if (r1 == C243363Yl.NOT_LIKED) {
            i = 2131975945;
        }
        List A1P = 0sr.A1P(new C15051ULh[]{new C15051ULh((View.OnClickListener) new WB9((Object) vnf, 10), (int) R.drawable.ufi_heart_icon, i, false), new C15051ULh((View.OnClickListener) new WB9((Object) vnf, 9), (int) R.drawable.instagram_direct_pano_outline_24, 2131973441, false), new C15051ULh((View.OnClickListener) new WB9((Object) vnf, 12), (int) R.drawable.instagram_eye_pano_outline_24, 2131968504, true), new C15051ULh((View.OnClickListener) new WB9((Object) vnf, 11), (int) R.drawable.instagram_report_pano_outline_24, 2131972171, true)});
        for (int i2 = 0; i2 < uh1.A06.A0B.length; i2++) {
            int size = A1P.size();
            C52874Ge8 ge8 = uh1.A06.A0B[i2];
            if (i2 < size) {
                C15051ULh uLh = (C15051ULh) A1P.get(i2);
                0qQ.A0B(uLh, 0);
                ge8.setOnClickListener((View.OnClickListener) uLh.A02);
                IgTextView igTextView = ge8.A00;
                if (igTextView == null) {
                    0qQ.A0F("igTextView");
                    throw AnonymousClass00P.createAndThrow();
                }
                Context context = ge8.getContext();
                boolean z = uLh.A03;
                int i3 = R.attr.igds_color_primary_text;
                if (z) {
                    i3 = R.attr.igds_color_error_or_destructive;
                }
                DbT.A17(context, igTextView, 2Yu.A0H(context, i3));
                igTextView.setText(uLh.A01);
            } else {
                ge8.setVisibility(8);
            }
        }
    }

    public static void A04(C15695Uh1 uh1, C243363Yl r22, GQ0 gq0) {
        C15695Uh1 uh12 = uh1;
        Context context = uh12.A0D;
        1Xj r10 = uh12.A04;
        int i = uh12.A01;
        int i2 = uh12.A00;
        int i3 = uh12.A06.A09.A0N.getCurrentScans().get();
        Integer num = AnonymousClass05K.A0C;
        FragmentActivity activity = uh12.A0E.getActivity();
        UserSession userSession = uh12.A0G;
        boolean z = uh12.BQr(uh12.A04).A2V;
        AnonymousClass7TG.A1N(context, r10);
        C243363Yl r9 = r22;
        C13988Tno.A1O(r9, 7, userSession);
        C56622I4z.A01(activity, context, (0jB) null, userSession, (JPO) null, r9, r10, gq0, uh12, C324636ze.A00(userSession).A00, (C249763kK) null, num, (Long) null, (String) null, i, -1, i2, i3, z);
    }

    public static void A05(C15695Uh1 uh1, boolean z) {
        C231292rN r1;
        1sd.A00(uh1.A0G).A02(uh1.A04, true);
        AnonymousClass32M r2 = uh1.A0E;
        if (r2 instanceof AnonymousClass32M) {
            1Xj r12 = uh1.A04;
            r2.DPz(r12, uh1.BQr(r12), z);
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
            r1 = uh1.A0S;
        }
        r1.Cs9(uh1.A04);
    }

    public final void A06(boolean z) {
        this.A06.A04.setVisibility(8);
        this.A06.A06.setVisibility(8);
        if (!z) {
            ViewGroup viewGroup = this.A06.A08.A0E;
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = 0;
            viewGroup.setLayoutParams(layoutParams);
        }
    }

    public final AnonymousClass3W1 BQr(1Xj r4) {
        Map map = this.A0T;
        AnonymousClass3W1 r1 = (AnonymousClass3W1) map.get(r4.getId());
        if (r1 != null) {
            return r1;
        }
        AnonymousClass3W1 A18 = G9t.A18(r4);
        map.put(r4.getId(), A18);
        return A18;
    }

    public final void D6z(View view) {
        VZU vzu = this.A0J;
        Context context = this.A0D;
        View inflate = LayoutInflater.from(context).inflate(R.layout.grid_quick_preview, (ViewGroup) null, false);
        inflate.setTag(new C56008HrG(context, inflate, vzu.A02));
        this.A02 = inflate;
        C56008HrG hrG = (C56008HrG) DbT.A0o(inflate);
        this.A06 = hrG;
        this.A0Q.A00 = hrG;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = hrG.A07;
        RoundedCornerConstraintLayout roundedCornerConstraintLayout = hrG.A0A;
        C19719WeL weL = new C19719WeL(context, hrG.A05, hrG.A04, this.A06.A06, touchInterceptorFrameLayout, new VND(this), roundedCornerConstraintLayout, hrG.A00());
        this.A07 = weL;
        C317396nC r1 = new C317396nC(context, weL);
        this.A08 = r1;
        C317416nE.A00(this.A06.A07, r1);
        this.A02.setVisibility(8);
        C232902ud r0 = this.A0I;
        0qQ.A0B(view, 0);
        r0.A01.D6z(view);
    }

    public final void DnU(1Xj r3, int i, int i2, int i3) {
        if (r3 != null) {
            AnonymousClass3W1 BQr = BQr(r3);
            BQr.A0E(i, BQr.A03);
        }
    }

    public final 0jB E4k() {
        AnonymousClass4DU r1 = this.A0K;
        if (r1 instanceof C232682uF) {
            return ((C232682uF) r1).E4k();
        }
        return new 0jB();
    }

    public final 0jB E4l(1Xj r3) {
        AnonymousClass4DU r1 = this.A0K;
        if (r1 instanceof C232682uF) {
            return ((C232682uF) r1).E4l(r3);
        }
        return new 0jB();
    }

    public final 0jB E4x() {
        AnonymousClass0j6 r1 = this.A0E;
        if (r1 instanceof AnonymousClass0j6) {
            return r1.E4x();
        }
        return null;
    }

    public final void EU9(C289875eN r1) {
        this.A05 = r1;
    }

    public final String getModuleName() {
        String str = this.A0C;
        if (str != null) {
            return str;
        }
        String A0R2 = 002.A0R(AnonymousClass000.A00(3726), this.A0K.getModuleName());
        this.A0C = A0R2;
        return A0R2;
    }

    public final boolean isOrganicEligible() {
        return this.A0K.isOrganicEligible();
    }

    public final boolean isSponsoredEligible() {
        return this.A0K.isSponsoredEligible();
    }

    public final boolean onBackPressed() {
        int intValue = this.A0A.intValue();
        if (intValue == 0 || intValue == 1) {
            return false;
        }
        if (intValue == 3) {
            A02(this);
        }
        return true;
    }

    public final void onCreate() {
        this.A0I.A01.onCreate();
    }

    public final void onDestroy() {
        this.A0I.A01.onDestroy();
    }

    public final void onDestroyView() {
        2cv r0 = this.A03;
        if (r0 != null) {
            r0.ACi().removeView(this.A02);
            this.A03 = null;
        }
        this.A0Q.A00 = null;
        this.A02 = null;
        this.A06 = null;
        this.A04 = null;
        this.A0I.A01.onDestroyView();
    }

    public final void onPause() {
        this.A0A = AnonymousClass05K.A00;
        C232902ud r3 = this.A0I;
        1Xj r2 = this.A04;
        int i = this.A00;
        if (r2 != null) {
            C230562pp r0 = r3.A01;
            r0.A03(r2, i);
            r0.A02(r2, i);
        }
        r3.A01.onPause();
        1Xj r1 = this.A04;
        if (r1 != null && A00(r1, this.A00).CeS()) {
            this.A0M.A0U("fragment_paused", false, false);
        }
        this.A02.setVisibility(8);
        W85 w85 = this.A0R;
        w85.A03.removeCallbacksAndMessages((Object) null);
        w85.A01 = false;
        2cs r32 = this.A0F;
        r32.A06(0.0d);
        r32.A08(0.0d, true);
        2cv r02 = this.A03;
        if (r02 != null) {
            r02.CNi((View.OnTouchListener) null);
        }
    }

    public final void onResume() {
        UserSession userSession = this.A0G;
        if (C240133Js.A00(userSession).A00) {
            C240133Js.A00(userSession);
        }
        this.A0I.A01.onResume();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        2cv r3 = this.A03;
        if ((motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1) && r3 != null) {
            r3.CNi((View.OnTouchListener) null);
        }
        this.A0R.A00(motionEvent);
        if (this.A0A == AnonymousClass05K.A00) {
            return false;
        }
        return true;
    }

    public static 1Xj A00(1Xj r1, int i) {
        if (r1.A5D()) {
            return r1.A1c(i);
        }
        if (r1.A5H()) {
            return r1.A1b();
        }
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r1 == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Dsa(android.view.MotionEvent r4, android.view.View r5, X.AnonymousClass1Xq r6, int r7) {
        /*
            r3 = this;
            int r0 = r4.getActionMasked()
            r2 = 0
            if (r0 != 0) goto L_0x0025
            com.instagram.common.session.UserSession r0 = r3.A0G
            X.1E8 r1 = X.1E7.A00(r0)
            java.lang.String r0 = r6.getId()
            X.1Xj r0 = r1.A02(r0)
            r3.A04 = r0
            if (r0 == 0) goto L_0x0020
            boolean r1 = r0.A5D()
            r0 = 0
            if (r1 != 0) goto L_0x0021
        L_0x0020:
            r0 = -1
        L_0x0021:
            r3.A00 = r0
            r3.A01 = r7
        L_0x0025:
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0033
            int r1 = r4.getActionMasked()
            r0 = 3
            if (r1 != r0) goto L_0x0033
            r3.A0B = r2
            return r2
        L_0x0033:
            X.W85 r0 = r3.A0R
            r0.A00(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15695Uh1.Dsa(android.view.MotionEvent, android.view.View, X.1Xq, int):boolean");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        2cv A002 = C324286z2.A00(view);
        this.A03 = A002;
        if (A002 != null) {
            A002.ACi().addView(this.A02, new ViewGroup.LayoutParams(-1, -1));
        }
    }
}
