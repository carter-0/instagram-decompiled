package X;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.friendmap.view.fragment.FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig;
import com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

public final class NKO extends AnonymousClass4DH implements C273414mX, C252213ok, JOK, JSy {
    public static final String __redex_internal_original_name = "FriendMapPresenceReplyFragment";
    public N4t A00;
    public QuickSnapReactionEmitterView A01;
    public Long A02;
    public boolean A03;
    public final C72379P3s A04 = new C72379P3s(this, 2);
    public final C63939LEc A05 = new C63939LEc();
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08 = C73898PlZ.A00(this, 5);
    public final AnonymousClass0eM A09 = C73898PlZ.A00(this, 6);
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C = C227642jf.A02(this);
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I;
    public final AnonymousClass3E6 A0J = AnonymousClass3E4.A01(this, false, true);
    public final 2el A0K = 2el.A00();
    public final String A0L = "friend_map_presence_reply_fragment";

    public final void DMr(int i, boolean z) {
        if (i > 0) {
            this.A03 = true;
        } else if (this.A03) {
            this.A03 = false;
            DbZ.A15(this);
        }
    }

    public final void DbZ(N4t n4t, String str) {
        0qQ.A0B(str, 0);
        C69027NdB ndB = (C69027NdB) this.A0B.getValue();
        C319736r8 r1 = (C319736r8) this.A08.getValue();
        0qQ.A0B(r1, 1);
        C69027NdB.A00(r1, ndB, str);
        ndB.A0P(C72700PGe.A00);
        C71144Ody.A06(new C71144Ody(this, DbW.A0S(this.A0C, 0)), false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, "QUICK_REACT", "TAP", (String) null, (String) null, str);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup viewGroup;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r3 = this.A0E;
        ((C308476Uk) r3.getValue()).A00(AnonymousClass7TF.A03(requireContext(), R.attr.igds_color_gradient_blue), false);
        ((C308476Uk) r3.getValue()).A01((Boolean) null, false, true);
        C71273OhE.A00(JTO.A0I(this.A0A), this, 25);
        C71402Ok1.A00(AnonymousClass7TE.A0c(this.A0D), 62, this);
        this.A05.A01((IgSimpleImageView) null, (IgBouncyUfiButtonImageView) this.A07.getValue());
        if (182.A06(0Tu.A05, AnonymousClass7TF.A0L(this.A0C, 0), 36321769627133698L)) {
            View rootView = view.getRootView();
            if ((rootView instanceof ViewGroup) && (viewGroup = (ViewGroup) rootView) != null) {
                QuickSnapReactionEmitterView quickSnapReactionEmitterView = new QuickSnapReactionEmitterView(AnonymousClass7TE.A0S(view), (AttributeSet) null, 0);
                this.A01 = quickSnapReactionEmitterView;
                viewGroup.addView(quickSnapReactionEmitterView);
                AnonymousClass0eM r0 = this.A06;
                DbW.A1R(r0, 0);
                OSM.A01(requireContext(), C66583MXo.A0C(r0), this, this);
            }
        }
        C72382P3v p3v = new C72382P3v(this);
        C72384P3x p3x = new C72384P3x(this);
        2el r32 = this.A0K;
        Dba.A0z(view, r32, this);
        AnonymousClass0eM r6 = this.A09;
        C2354830a A002 = AnonymousClass30Y.A00(Long.valueOf(DbY.A04(AnonymousClass7TE.A10(((FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig) r6.getValue()).A02))), C60340gF.A00, ((FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig) r6.getValue()).A02);
        A002.A00(new C72262OzX(p3v));
        A002.A00(new C68682NSo(p3x));
        C51967G9n.A0z(view, A002, r32);
        07U r62 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass0xx A003 = AnonymousClass07a.A00(viewLifecycleOwner);
        MHE mhe = new MHE(viewLifecycleOwner, r62, this, (AnonymousClass4D7) null, 34);
        19B r1 = 19B.A00;
        AnonymousClass07Z A0I2 = JTP.A0I(this, r1, mhe, A003);
        1Eo.A05(r1, new MHE(A0I2, r62, this, (AnonymousClass4D7) null, 35), AnonymousClass07a.A00(A0I2));
    }

    public final N4t B8A() {
        return this.A00;
    }

    public final QuickSnapReactionEmitterView Bjn() {
        return this.A01;
    }

    public final void Cyc() {
        ((FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig) this.A09.getValue()).A04.invoke();
    }

    public final void Cyf() {
        AnonymousClass0eM r1 = this.A0A;
        AnonymousClass7TE.A0c(r1).clearFocus();
        0nA.A0N(AnonymousClass7TE.A0c(r1));
    }

    public final String getModuleName() {
        return this.A0L;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public NKO() {
        C73898PlZ plZ = new C73898PlZ(this, 8);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73898PlZ(new C73898PlZ(this, 11), 12));
        this.A0B = DbS.A0I(new C73898PlZ(A002, 13), plZ, new C58185Inp(23, (Object) null, A002), DbS.A0z(C69027NdB.class));
        this.A0G = C73898PlZ.A00(this, 15);
        this.A0I = C73898PlZ.A00(this, 17);
        this.A0H = C73898PlZ.A00(this, 16);
        this.A0A = C73898PlZ.A00(this, 7);
        this.A06 = C73898PlZ.A00(this, 3);
        this.A0F = C73898PlZ.A00(this, 14);
        this.A0D = C73898PlZ.A00(this, 9);
        this.A0E = C73898PlZ.A00(this, 10);
        this.A07 = C73898PlZ.A00(this, 4);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2050225432);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.friend_map_presence_reply_sheet, false);
        AnonymousClass0fD.A09(824070945, A022);
        return A0D2;
    }

    public final void onDestroyView() {
        ViewGroup viewGroup;
        int A022 = AnonymousClass0fD.A02(491247396);
        this.A0K.A04(this.mView);
        super.onDestroyView();
        QuickSnapReactionEmitterView quickSnapReactionEmitterView = this.A01;
        if (quickSnapReactionEmitterView != null) {
            quickSnapReactionEmitterView.A01();
        }
        QuickSnapReactionEmitterView quickSnapReactionEmitterView2 = this.A01;
        ViewParent viewParent = null;
        if (quickSnapReactionEmitterView2 != null) {
            viewParent = quickSnapReactionEmitterView2.getParent();
        }
        if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
            viewGroup.removeView(this.A01);
        }
        AnonymousClass0fD.A09(-606031957, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1246228352);
        NKO.super.onPause();
        AnonymousClass3E6 r0 = this.A0J;
        r0.onStop();
        r0.EEH(this);
        AnonymousClass0fD.A09(-1682122122, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1556359948);
        super.onResume();
        AnonymousClass0eM r1 = this.A0A;
        AnonymousClass7TE.A0c(r1).requestFocus();
        0nA.A0S(AnonymousClass7TE.A0c(r1));
        AnonymousClass3E6 r0 = this.A0J;
        JTP.A17(this, r0);
        r0.A9Y(this);
        AnonymousClass0fD.A09(-1695963805, A022);
    }
}
