package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.profile.intf.AutoLaunchReelParams;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Uat  reason: case insensitive filesystem */
public final class C15343Uat extends AnonymousClass4DH implements AnonymousClass4DU, C229132mt, AnonymousClass723, C74357PtX {
    public static final String __redex_internal_original_name = "HighlightsInGridTabFragment";
    public RecyclerView A00;
    public UserDetailTabController A01;
    public WWy A02;
    public AutoLaunchReelParams A03;
    public AnonymousClass32A A04;
    public String A05 = "highlights_profile";
    public String A06;
    public Boolean A07;
    public final 1wn A08 = new C19221WQb(this, 29);
    public final 1wn A09 = new C19221WQb(this, 30);
    public final 1wn A0A = new C19221WQb(this, 31);
    public final List A0B = new ArrayList();
    public final AnonymousClass0eM A0C = C227642jf.A02(this);
    public final AnonymousClass0eM A0D;
    public final ViewGroup A0E;
    public final 2el A0F = C51969G9p.A0k();
    public final ReelViewerConfig A0G;

    public final String BhI() {
        return C273654mx.A00(367);
    }

    public final void Daz(UserDetailTabController userDetailTabController) {
        C252553pI r0;
        0qQ.A0B(userDetailTabController, 0);
        if (this.A01 == null) {
            this.A01 = userDetailTabController;
            ((C60097Jfd) this.A0D.getValue()).A0F();
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                r0 = recyclerView.A0D;
            } else {
                r0 = null;
            }
            C3251871j A002 = VFU.A00(r0, this);
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 != null) {
                recyclerView2.A15(A002);
            }
        }
    }

    public final void DqG(boolean z) {
    }

    public final void DqM() {
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C320806sz r0;
        C252553pI r02;
        2Rw r03;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        this.A00 = DbT.A0I(view, R.id.highlights_grid_recyclerview);
        2el r8 = this.A0F;
        Dba.A0z(view, r8, this);
        C19520Wb6 wb6 = new C19520Wb6(requireContext, this);
        String str = this.A06;
        if (str == null) {
            0qQ.A0F("viewedProfileUserId");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A02 = new WWy(requireActivity(), requireContext, this, AnonymousClass7TE.A0l(this.A0C), r8, this, wb6, str);
        FastScrollingGridLayoutManager fastScrollingGridLayoutManager = new FastScrollingGridLayoutManager(requireContext, 3);
        WWy wWy = this.A02;
        if (wWy != null) {
            r0 = (C320806sz) wWy.A0F.getValue();
        } else {
            r0 = null;
        }
        fastScrollingGridLayoutManager.A01 = r0;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(fastScrollingGridLayoutManager);
        }
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            WWy wWy2 = this.A02;
            if (wWy2 != null) {
                r03 = wWy2.A09;
            } else {
                r03 = null;
            }
            recyclerView2.setAdapter(r03);
        }
        RecyclerView recyclerView3 = this.A00;
        if (recyclerView3 != null) {
            recyclerView3.A11(C320826t1.A00(requireContext, 0, true));
        }
        RecyclerView recyclerView4 = this.A00;
        if (recyclerView4 != null) {
            r02 = recyclerView4.A0D;
        } else {
            r02 = null;
        }
        C3251871j A002 = VFU.A00(r02, this);
        RecyclerView recyclerView5 = this.A00;
        if (recyclerView5 != null) {
            recyclerView5.A15(A002);
        }
        07U r9 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MH5(r9, this, viewLifecycleOwner, (AnonymousClass4D7) null, 9), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final void A00(Reel reel, C15343Uat uat, int i, boolean z) {
        DbX.A0R(uat.A0C).A00(new C321926uy(reel, i, z));
    }

    public static final void A01(C15343Uat uat, String str) {
        WWy wWy = uat.A02;
        if (wWy != null) {
            wWy.A0E.removeIf(new MBF(4, new MYK(str, 43)));
            wWy.A02();
        }
        WWy wWy2 = uat.A02;
        if (wWy2 != null) {
            wWy2.A09.notifyDataSetChanged();
        }
    }

    public static final void A02(C15343Uat uat, String str) {
        String str2;
        0eE r0 = AnonymousClass0t1.A01;
        C15343Uat uat2 = uat;
        AnonymousClass0eM r1 = uat.A0C;
        boolean A2P = DbX.A0l(r0, r1).A2P();
        C319976rX r2 = C319976rX.A00;
        UserSession A0l = AnonymousClass7TE.A0l(r1);
        C319986rY r5 = C319986rY.SELF;
        String A0u = DbU.A0u(r1);
        if (A2P) {
            str2 = "forced_migration";
        } else {
            str2 = "opt_in";
        }
        r2.A0D(uat2, A0l, r5, str, A0u, str2, (String) null);
    }

    public final Fragment ACU() {
        return this;
    }

    public final void ACw() {
        ((C60097Jfd) this.A0D.getValue()).A0E();
    }

    public final void AGI() {
        WWy wWy = this.A02;
        if (wWy != null) {
            for (C19269WSc wSc : wWy.A0E) {
                wSc.A03 = false;
            }
        }
        WWy wWy2 = this.A02;
        if (wWy2 != null) {
            wWy2.A09.notifyDataSetChanged();
        }
    }

    public final ViewGroup BqB() {
        return this.A0E;
    }

    public final void DqL(boolean z) {
        WWy wWy;
        if (AnonymousClass7TF.A1Y(this.A07, true)) {
            ((C60097Jfd) this.A0D.getValue()).A0F();
            wWy = this.A02;
            if (wWy != null) {
                wWy.A04 = true;
            } else {
                return;
            }
        } else {
            wWy = this.A02;
            if (wWy == null) {
                return;
            }
        }
        wWy.A02();
    }

    public final String getModuleName() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public C15343Uat() {
        AnonymousClass32D r1 = new AnonymousClass32D();
        r1.A07 = true;
        this.A0G = new ReelViewerConfig(r1);
        C51795G2e g2e = new C51795G2e(this, 11);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51795G2e(new C51795G2e(this, 8), 9));
        this.A0D = new C227862kA(new C51795G2e(A002, 10), g2e, new MJ4(38, (Object) null, A002), new 0Yh(C60097Jfd.class));
        this.A0E = this.A00;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-606054119);
        C15343Uat.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A06 = JTP.A0m(bundle2, AnonymousClass000.A00(4207));
            this.A07 = DbU.A0g(bundle2, AnonymousClass000.A00(3219));
            this.A03 = (AutoLaunchReelParams) bundle2.getParcelable(AnonymousClass000.A00(2077));
            AnonymousClass0eM r5 = this.A0C;
            String A0u = DbU.A0u(r5);
            String str2 = this.A06;
            if (str2 == null) {
                0qQ.A0F("viewedProfileUserId");
                throw AnonymousClass00P.createAndThrow();
            }
            if (0qQ.A0K(A0u, str2)) {
                str = "self_highlights_profile";
            } else {
                str = "highlights_profile";
            }
            this.A05 = str;
            AnonymousClass32A r4 = new AnonymousClass32A(this, AnonymousClass7TE.A0l(r5), new AnonymousClass328(this));
            r4.A0C = AnonymousClass7TF.A0b();
            setModuleNameV2(this.A05);
            r4.A0F = true;
            r4.A03 = this.A0G;
            r4.A06 = new C19494Wag(this, 2);
            r4.A05 = new C16155Upg(1);
            this.A04 = r4;
            1Ng A0R = DbX.A0R(r5);
            A0R.A01(this.A0A, WQD.class);
            A0R.A01(this.A09, AnonymousClass376.class);
            A0R.A01(this.A08, C321936uz.class);
            AnonymousClass0fD.A09(-530309044, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-897704211, A022);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1752037248);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_highlights_in_grid_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-2108486240, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1272428978);
        super.onDestroy();
        this.A0B.clear();
        1Ng A0R = DbX.A0R(this.A0C);
        A0R.A02(this.A0A, WQD.class);
        A0R.A02(this.A09, AnonymousClass376.class);
        A0R.A02(this.A08, C321936uz.class);
        AnonymousClass0fD.A09(912412231, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1045237055);
        super.onDestroyView();
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.A0b();
        }
        AnonymousClass0fD.A09(-824711970, A022);
    }
}
