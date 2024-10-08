package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

public final class H1B extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DS, C74302Psc {
    public static final String __redex_internal_original_name = "TemplatePivotPageFragment";
    public ViewGroup A00;
    public 1Xj A01;
    public H1K A02;
    public H17 A03;
    public String A04;
    public final String A05 = AnonymousClass7TG.A0j();
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;

    public final void configureActionBar(2da r3) {
        DbW.A1C(r3, DbT.A06(this, r3, 0).getString(2131975064));
    }

    public final String getModuleName() {
        return "template_pivot_page";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        H1B.super.onAttach(context);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((C52999Ggq) this.A07.getValue()).A01.A01.A04((Long) null, (String) null, 0sn.A00, false);
        view.requireViewById(R.id.swipe_refresh).setEnabled(false);
        ViewGroup A0C = DbU.A0C(view, R.id.use_in_camera_button_scene_root);
        this.A00 = A0C;
        if (A0C != null) {
            A0C.setVisibility(8);
            C58099ImL.A01(this, DbV.A0J(this), 30);
            ViewGroup viewGroup = this.A00;
            if (viewGroup != null) {
                TextView A0G = DbU.A0G(viewGroup, R.id.use_in_camera_label);
                DbT.A18(requireContext(), A0G, 2131955889);
                2eS.A01(A0G);
                ViewGroup viewGroup2 = this.A00;
                if (viewGroup2 != null) {
                    DbU.A13(requireActivity(), DbU.A0F(viewGroup2, R.id.use_in_camera_icon), R.drawable.instagram_templates_pano_outline_24);
                    ViewGroup viewGroup3 = this.A00;
                    if (viewGroup3 != null) {
                        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(viewGroup3);
                        A0m.A04 = new C54310H7f(this, 8);
                        A0m.A07 = true;
                        A0m.A00();
                        return;
                    }
                }
            }
        }
        0qQ.A0F("useInCameraButtonGroup");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Dwi() {
        String str;
        C53381GnB gnB = (C53381GnB) ((C52999Ggq) this.A07.getValue()).A04.getValue();
        if (gnB != null && (str = gnB.A08) != null) {
            AnonymousClass0eM r0 = this.A06;
            0lg A0X = DbT.A0X(r0);
            C51974G9v.A0f(requireActivity(), C46447Df9.A02().A01(AnonymousClass7TE.A0l(r0), C46548Dgp.A02(AnonymousClass7TE.A0l(r0), str, "clips_template_pivot_page", "template_pivot_page").A04()), this, A0X);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public H1B() {
        C58709IwI iwI = new C58709IwI(this, 19);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58709IwI(new C58709IwI(this, 16), 17));
        this.A07 = DbS.A0I(new C58709IwI(A002, 18), iwI, new C58693Iw2(1, A002, (Object) null), DbS.A0z(C52999Ggq.class));
        this.A06 = C227642jf.A02(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1942389032);
        H1B.super.onCreate(bundle);
        this.A04 = C320236s2.A01(requireArguments(), "arg_media_id");
        C55671HlU A002 = C55246Heb.A00(AnonymousClass7TE.A0l(this.A06));
        AnonymousClass0eM r4 = A002.A01;
        long flowStartForMarker = C51965G9l.A0a(r4).flowStartForMarker(444404712, PublicKeyCredentialControllerUtility.JSON_KEY_USER, false);
        Long valueOf = Long.valueOf(flowStartForMarker);
        A002.A00 = valueOf;
        if (valueOf != null) {
            C51965G9l.A0a(r4).flowAnnotate(flowStartForMarker, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "template");
        }
        AnonymousClass0fD.A09(15908371, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-721317409);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_pivot_default_parent_fragment, viewGroup, false);
        AnonymousClass0eM r4 = this.A06;
        UserSession A0S = DbW.A0S(r4, 0);
        H17 h17 = new H17();
        Bundle A0a = AnonymousClass7TE.A0a();
        C227642jf.A04(A0a, A0S);
        h17.setArguments(A0a);
        this.A03 = h17;
        String str2 = this.A04;
        if (str2 == null) {
            str = "mediaId";
        } else {
            String str3 = this.A05;
            this.A02 = C55245Hea.A00(ClipsViewerSource.CLIPS_TEMPLATE, str2, str3, (String) null, 182.A06(0Tu.A05, DbT.A0X(r4), 36328229254151265L));
            0s1 A0C = DbW.A0C(this);
            H17 h172 = this.A03;
            if (h172 == null) {
                str = "headerFragment";
            } else {
                A0C.A09(h172, R.id.header_container);
                H1K h1k = this.A02;
                if (h1k == null) {
                    str = "gridFragment";
                } else {
                    A0C.A09(h1k, R.id.grid_container);
                    A0C.A0H(new C57769IgA(this));
                    A0C.A0K();
                    AnonymousClass0fD.A09(1133448638, A022);
                    return inflate;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1161770149);
        super.onDestroy();
        C55671HlU A002 = C55246Heb.A00(AnonymousClass7TE.A0l(this.A06));
        Long l = A002.A00;
        if (l != null) {
            C51965G9l.A0a(A002.A01).flowEndCancel(l.longValue(), CancelReason.USER_CANCELLED);
        }
        A002.A00 = null;
        AnonymousClass0fD.A09(403461353, A022);
    }
}
