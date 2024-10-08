package X;

import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ListView;
import com.instagram.android.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class K4W extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ImmersiveAvatarHomeFragment";
    public ListView A00;
    public C64301LZb A01;
    public C60052JeK A02;
    public SpinnerImageView A03;
    public Boolean A04;
    public final C64509LdB A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(new C51799G2i(this, 34));
    public final AnonymousClass0eM A0A;

    public final String getModuleName() {
        return "immersive_avatar_home";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0G = AnonymousClass7TF.A0G(view, R.id.avatar_home_button_back);
        this.A03 = (SpinnerImageView) view.requireViewById(R.id.avatar_home_loading_spinner);
        LYC.A00(A0G, 52, this);
        SpinnerImageView spinnerImageView = this.A03;
        if (spinnerImageView != null) {
            DbS.A1T(spinnerImageView);
        }
        ((C60229Jhm) this.A07.getValue()).A00();
    }

    public static final void A00(K4W k4w, boolean z) {
        ListView listView = k4w.A00;
        if (listView != null) {
            int childCount = listView.getChildCount();
            int i = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = listView.getChildAt(i2);
                0qQ.A07(childAt);
                View A0G = AnonymousClass7TF.A0G(childAt, R.id.entrypoint_icon);
                int A022 = DbZ.A02(k4w);
                int width = A0G.getWidth() + A022 + AnonymousClass7TG.A03(k4w.requireContext());
                if (z) {
                    View A0G2 = AnonymousClass7TF.A0G(childAt, R.id.entrypoint_label);
                    Object systemService = k4w.requireContext().getSystemService("window");
                    0qQ.A0C(systemService, AnonymousClass000.A00(14));
                    Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    A0G2.measure(defaultDisplay.getWidth(), defaultDisplay.getHeight());
                    width += A0G2.getMeasuredWidth();
                }
                i = Math.max(i, width);
            }
            listView.getLayoutParams().width = i;
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public K4W() {
        C51799G2i g2i = new C51799G2i(this, 32);
        C51799G2i g2i2 = new C51799G2i(this, 38);
        0eO r4 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r4, new C51799G2i(g2i2, 39));
        this.A07 = DbS.A0I(new C51799G2i(A002, 40), g2i, new MMX(24, (Object) null, (Object) A002), DbS.A0z(C60229Jhm.class));
        C51799G2i g2i3 = new C51799G2i(this, 31);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(r4, new C51799G2i(new C51799G2i(this, 41), 42));
        this.A06 = DbS.A0I(new C51799G2i(A003, 43), g2i3, new MMX(25, (Object) null, (Object) A003), DbS.A0z(C60223Jhg.class));
        C51799G2i g2i4 = new C51799G2i(this, 33);
        AnonymousClass0eM A004 = AnonymousClass0eN.A00(r4, new C51799G2i(new C51799G2i(this, 35), 36));
        this.A08 = DbS.A0I(new C51799G2i(A004, 37), g2i4, new MMX(23, (Object) null, (Object) A004), DbS.A0z(C60131JgC.class));
        this.A05 = new C64509LdB(this, 0);
        this.A0A = C227642jf.A02(this);
    }

    public final void onCreate(Bundle bundle) {
        Boolean bool;
        int A022 = AnonymousClass0fD.A02(-1122495287);
        K4W.super.onCreate(bundle);
        AnonymousClass0eM r1 = this.A09;
        ((02m) r1.getValue()).markerStart(116928509);
        ((02m) r1.getValue()).markerAnnotate(116928509, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "ig_self_profile");
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            bool = DbU.A0g(bundle2, "coin_flip_enabled");
        } else {
            bool = null;
        }
        this.A04 = bool;
        AnonymousClass0fD.A09(-239361489, A022);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.07Z, X.K4W, androidx.fragment.app.Fragment, java.lang.Object] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-979288913);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 0);
        this.A01 = new C64301LZb((LGB) null, AnonymousClass7TE.A0l(this.A0A));
        View inflate = layoutInflater2.inflate(R.layout.avatar_immersive_home_fragment, viewGroup, false);
        C64301LZb lZb = this.A01;
        if (lZb != null) {
            this.mLifecycleRegistry.A09(lZb);
        }
        C64301LZb lZb2 = this.A01;
        if (lZb2 != null) {
            Context requireContext = requireContext();
            0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            lZb2.A00(requireContext, (ViewGroup) inflate, new C61042Jvg(3, 0, false), "", DbV.A0J(this));
        }
        this.A00 = (ListView) inflate.requireViewById(R.id.entrypoints_list);
        07U r10 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        MHH mhh = new MHH(r10, this, viewLifecycleOwner, (AnonymousClass4D7) null, 31);
        19B r2 = 19B.A00;
        1Eo.A05(r2, mhh, A002);
        AnonymousClass07Z A0I = JTP.A0I(this, r2, new MFS(this, (AnonymousClass4D7) null, 16), DbW.A0E(this));
        AnonymousClass07Z A0I2 = JTP.A0I(this, r2, new MHH(r10, this, A0I, (AnonymousClass4D7) null, 33), AnonymousClass07a.A00(A0I));
        1Eo.A05(r2, new MHH(r10, this, A0I2, (AnonymousClass4D7) null, 32), AnonymousClass07a.A00(A0I2));
        C64301LZb lZb3 = this.A01;
        if (lZb3 != null) {
            2YL A0H = DbS.A0H(this.A06);
            1Eo.A05(r2, new MHC((Object) lZb3, (Object) A0H, (AnonymousClass4D7) null, 4), C318116oQ.A00(A0H));
        }
        AnonymousClass07Z viewLifecycleOwner2 = getViewLifecycleOwner();
        1Eo.A05(r2, new MHH(r10, this, viewLifecycleOwner2, (AnonymousClass4D7) null, 34), AnonymousClass07a.A00(viewLifecycleOwner2));
        AnonymousClass0fD.A09(-1585305026, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(465578382);
        C64301LZb lZb = this.A01;
        if (lZb != null) {
            this.mLifecycleRegistry.A0A(lZb);
        }
        super.onDestroyView();
        AnonymousClass0fD.A09(148828524, A022);
    }
}
