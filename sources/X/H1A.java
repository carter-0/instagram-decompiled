package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

public final class H1A extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DS, C74302Psc {
    public static final String __redex_internal_original_name = "ThirdPartyAppPivotPageFragment";
    public C54117Gzm A00;
    public H1K A01;
    public H17 A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public ImageUrl A08;
    public ImageUrl A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public final String A0D = AnonymousClass7TG.A0j();
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final 05G A0G = 106.A01((Object) null);
    public final 05G A0H = 106.A01((Object) null);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eom(2131975268);
        r3.Eu5(C56801ICy.A00(this, 24), true);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A02(AnonymousClass05K.A01);
        DbX.A19(C56801ICy.A00(this, 25), A0K, r3);
    }

    public final String getModuleName() {
        return "third_party_app_pivot_page";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        H1A.super.onAttach(context);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        view.requireViewById(R.id.swipe_refresh).setEnabled(false);
        ((C52992Ggj) this.A0F.getValue()).A01.A00.A04((Long) null, (String) null, 0sn.A00, false);
        DbX.A1B(view, R.id.use_in_camera_button_scene_root);
    }

    public final void Dwi() {
        String str;
        String str2;
        C53381GnB gnB = (C53381GnB) this.A0H.getValue();
        if (gnB != null && (str = gnB.A08) != null) {
            AnonymousClass0eM r6 = this.A0E;
            0lg A0X = DbT.A0X(r6);
            C51974G9v.A0f(requireActivity(), C46447Df9.A02().A01(AnonymousClass7TE.A0l(r6), C46548Dgp.A02(AnonymousClass7TE.A0l(r6), str, "clips_third_party_app_pivot_page", "third_party_app_pivot_page").A04()), this, A0X);
            0lg A0X2 = DbT.A0X(r6);
            String str3 = this.A06;
            if (str3 == null) {
                str2 = "mediaId";
            } else {
                String str4 = this.A03;
                if (str4 == null) {
                    str2 = "attributionAppId";
                } else {
                    0qQ.A0B(A0X2, 0);
                    0Aj A0O = C51972G9s.A0O(this, A0X2);
                    if (A0O.isSampled()) {
                        C51965G9l.A1M(A0O, "third_party_app_pivot_page");
                        String A0u = C51965G9l.A0u(str3);
                        0qQ.A0B(A0u, 0);
                        C51974G9v.A0l(A0O, 0, DbZ.A07(A0u));
                        C51967G9n.A17(A0O);
                        C51965G9l.A19(C52236GKd.A1L, A0O);
                        C51965G9l.A1C(AnonymousClass5OC.THIRD_PARTY_APP_PIVOT_PAGE, A0O);
                        A0O.A9F("app_attribution_id", 00y.A0n(10, str4));
                        A0O.Cgf();
                        return;
                    }
                    return;
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0E);
    }

    public H1A() {
        C58712IwL A012 = C58712IwL.A01(this, 15);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, C58712IwL.A01(C58712IwL.A01(this, 12), 13));
        this.A0F = DbS.A0I(C58712IwL.A01(A002, 14), A012, C58690Ivz.A00((Object) null, A002, 33), DbS.A0z(C52992Ggj.class));
        this.A0E = C227642jf.A02(this);
    }

    public final void onCreate(Bundle bundle) {
        Object value;
        String str;
        String str2;
        int A022 = AnonymousClass0fD.A02(-1701142296);
        H1A.super.onCreate(bundle);
        this.A03 = C320236s2.A01(requireArguments(), "attribution_app_id");
        this.A04 = C320236s2.A01(requireArguments(), AnonymousClass000.A00(2660));
        this.A06 = C320236s2.A01(requireArguments(), "media_id");
        String string = requireArguments().getString("media_count");
        if (string == null) {
            string = "";
        }
        this.A0A = string;
        String string2 = requireArguments().getString(AnonymousClass000.A00(273));
        if (string2 == null) {
            string2 = "";
        }
        this.A05 = string2;
        this.A08 = (ImageUrl) requireArguments().getParcelable(AnonymousClass000.A00(2995));
        this.A0B = requireArguments().getString(AnonymousClass000.A00(1720));
        this.A0C = requireArguments().getBoolean("profile_verified");
        this.A09 = (ImageUrl) requireArguments().getParcelable(AnonymousClass000.A00(40));
        requireArguments().getString("profile_id");
        SimpleImageUrl simpleImageUrl = this.A08;
        if (simpleImageUrl == null) {
            simpleImageUrl = DbS.A0V("");
        }
        String str3 = this.A04;
        String str4 = "attributionAppName";
        if (str3 != null) {
            String A0z = DbV.A0z(this, str3, 2131975266);
            0qQ.A07(A0z);
            String str5 = this.A06;
            if (str5 == null) {
                str4 = "mediaId";
            } else {
                this.A07 = 002.A0R("https://www.instagram.com/reels/app?media_id=", str5);
                05G r2 = this.A0H;
                do {
                    value = r2.getValue();
                    str = this.A04;
                    if (str != null) {
                        str2 = this.A0B;
                    }
                } while (!r2.AIY(value, new C53381GnB((C56078HsR) null, (C56078HsR) null, this.A09, simpleImageUrl, Boolean.valueOf(this.A0C), str, str2, this.A0A, 96)));
                05G r22 = this.A0G;
                do {
                } while (!r22.AIY(r22.getValue(), new C55559Hjf(A0z)));
                AnonymousClass0fD.A09(1543507961, A022);
                return;
            }
        }
        0qQ.A0F(str4);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(307712400);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_pivot_default_parent_fragment, viewGroup, false);
        AnonymousClass0eM r5 = this.A0E;
        UserSession A0S = DbW.A0S(r5, 0);
        H17 h17 = new H17();
        Bundle A0a = AnonymousClass7TE.A0a();
        C227642jf.A04(A0a, A0S);
        h17.setArguments(A0a);
        this.A02 = h17;
        this.A00 = new C54117Gzm();
        String str = this.A06;
        String str2 = "mediaId";
        if (str != null) {
            this.A01 = C55245Hea.A00(ClipsViewerSource.THIRD_PARTY_APP_PIVOT_PAGE, str, this.A0D, "third_party_app_pivot_page", false);
            0s1 A0C2 = DbW.A0C(this);
            H17 h172 = this.A02;
            if (h172 == null) {
                str2 = "headerFragment";
            } else {
                A0C2.A09(h172, R.id.header_container);
                C54117Gzm gzm = this.A00;
                if (gzm != null) {
                    A0C2.A09(gzm, R.id.middle_container);
                    H1K h1k = this.A01;
                    if (h1k == null) {
                        str2 = "gridFragment";
                    } else {
                        A0C2.A09(h1k, R.id.grid_container);
                        A0C2.A0H(new C57768Ig9(this));
                        A0C2.A0K();
                        if (this.A0B != null) {
                            0lg A0X = DbT.A0X(r5);
                            String str3 = this.A06;
                            if (str3 != null) {
                                String str4 = this.A03;
                                if (str4 != null) {
                                    0qQ.A0B(A0X, 0);
                                    0Aj A0u = G9t.A0u(this, A0X);
                                    if (A0u.isSampled()) {
                                        C51965G9l.A1M(A0u, "third_party_app_pivot_page");
                                        String A0u2 = C51965G9l.A0u(str3);
                                        0qQ.A0B(A0u2, 0);
                                        C51974G9v.A0l(A0u, 0, DbZ.A07(A0u2));
                                        C51967G9n.A17(A0u);
                                        A0u.A9F("app_attribution_id", 00y.A0n(10, str4));
                                        C51965G9l.A19(C52236GKd.A1L, A0u);
                                        C51965G9l.A1C(AnonymousClass5OC.THIRD_PARTY_APP_PIVOT_PAGE, A0u);
                                        A0u.Cgf();
                                    }
                                }
                                0qQ.A0F("attributionAppId");
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                        String str5 = this.A05;
                        if (str5 == null) {
                            str2 = "contentUrl";
                        } else {
                            if (str5.length() == 0) {
                                0hq childFragmentManager = getChildFragmentManager();
                                0qQ.A07(childFragmentManager);
                                0s1 r1 = new 0s1(childFragmentManager);
                                C54117Gzm gzm2 = this.A00;
                                if (gzm2 != null) {
                                    r1.A03(gzm2);
                                    r1.A00();
                                }
                            } else {
                                0lg A0X2 = DbT.A0X(r5);
                                String str6 = this.A06;
                                if (str6 != null) {
                                    String str7 = this.A03;
                                    if (str7 != null) {
                                        0qQ.A0B(A0X2, 0);
                                        0Aj A0u3 = G9t.A0u(this, A0X2);
                                        if (A0u3.isSampled()) {
                                            C51965G9l.A1M(A0u3, "third_party_app_pivot_page");
                                            String A0u4 = C51965G9l.A0u(str6);
                                            0qQ.A0B(A0u4, 0);
                                            C51974G9v.A0l(A0u3, 0, DbZ.A07(A0u4));
                                            C51967G9n.A17(A0u3);
                                            A0u3.A9F("app_attribution_id", 00y.A0n(10, str7));
                                            C51965G9l.A19(C52236GKd.A1K, A0u3);
                                            C51965G9l.A1C(AnonymousClass5OC.THIRD_PARTY_APP_PIVOT_PAGE, A0u3);
                                            A0u3.Cgf();
                                        }
                                    }
                                    0qQ.A0F("attributionAppId");
                                    throw AnonymousClass00P.createAndThrow();
                                }
                            }
                            0qQ.A0A(inflate);
                            AnonymousClass0fD.A09(1020268441, A022);
                            return inflate;
                        }
                    }
                }
                0qQ.A0F("ctaFragment");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }
}
