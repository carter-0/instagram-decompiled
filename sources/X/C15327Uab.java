package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.business.boost.model.BoostFlowType;
import com.instagram.business.promote.model.InstagramMediaProductType;
import com.instagram.business.promote.model.PromoteAdsManagerActionType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Uab  reason: case insensitive filesystem */
public final class C15327Uab extends AnonymousClass4DH implements AnonymousClass4DR, C229132mt, AnonymousClass4DS, X8N {
    public static final String __redex_internal_original_name = "PromoteAdToolsPastPromotionsFragment";
    public int A00;
    public C18662VwK A01;
    public C15480UdV A02;
    public C18641Vvg A03;
    public C238143As A04;
    public AnonymousClass3AD A05;
    public SpinnerImageView A06;
    public String A07;
    public String A08 = "ads_manager";
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public WGU A0F;
    public final List A0G = new ArrayList();
    public final List A0H = new ArrayList();
    public final AnonymousClass0eM A0I = C227642jf.A02(this);
    public final 1wn A0J = new C19221WQb(this, 12);

    public static final void A02(C15327Uab uab, boolean z) {
        uab.A0D = true;
        C18676VwZ.A00(uab.requireActivity(), new WO5(uab, z), AnonymousClass7TE.A0l(uab.A0I));
    }

    public final void CtF(PromoteAdsManagerActionType promoteAdsManagerActionType, C21004X9b x9b) {
        0qQ.A0B(promoteAdsManagerActionType, 1);
        if (this.A0E) {
            W3M.A04(requireContext(), this.A0A, this.A09);
            return;
        }
        C19176WOi wOi = (C19176WOi) x9b;
        int ordinal = promoteAdsManagerActionType.ordinal();
        boolean z = true;
        if (ordinal == 6) {
            C18662VwK vwK = this.A01;
            if (vwK == null) {
                0qQ.A0F("adsManagerLogger");
                throw AnonymousClass00P.createAndThrow();
            }
            vwK.A08("past_promotion_list", "promote_again", wOi.BYo(), (String) null);
            1Yh A002 = C18138VmE.A00();
            1Yg A003 = VA4.A00();
            String BYo = wOi.BYo();
            String str = this.A08;
            W29 A004 = A003.A00(requireContext(), AnonymousClass7TE.A0l(this.A0I), BYo, str);
            A004.A01 = BoostFlowType.BOOST_AGAIN;
            A002.A06(this, A004, this);
        } else if (ordinal == 7) {
            ImageUrl C73 = wOi.C73();
            if (wOi.BHn() != InstagramMediaProductType.STORY) {
                z = false;
            }
            W3M.A03(requireContext(), new C18833W4v(5, wOi, this), this, C73, z);
        }
    }

    public final void Dz3(C21004X9b x9b) {
        String str;
        C21004X9b x9b2 = x9b;
        C18662VwK vwK = this.A01;
        String str2 = "adsManagerLogger";
        if (vwK != null) {
            if (00k.A0J(x9b.ByH()) != null) {
                str = "view_ad_comparison_insights";
            } else {
                str = "view_insights";
            }
            vwK.A0A("past_promotion_list", str, x9b.BYo(), (String) null);
            if (this.A0E) {
                W3M.A04(requireContext(), this.A0A, this.A09);
                return;
            }
            C19176WOi wOi = (C19176WOi) x9b2;
            C18662VwK vwK2 = this.A01;
            if (vwK2 != null) {
                String str3 = wOi.A0C;
                if (str3 != null) {
                    vwK2.A08("past_promotion_list", "view_insights", str3, (String) null);
                    UserSession A0l = AnonymousClass7TE.A0l(this.A0I);
                    FragmentActivity requireActivity = requireActivity();
                    String str4 = wOi.A0C;
                    if (str4 != null) {
                        W3M.A05(requireActivity, wOi, A0l, str4, "ads_manager", new HashMap(), AnonymousClass7TF.A1W(wOi.BHn(), InstagramMediaProductType.STORY), AnonymousClass7TF.A1W(wOi.BHn(), InstagramMediaProductType.IGTV), AnonymousClass7TF.A1W(wOi.BHn(), InstagramMediaProductType.CLIPS));
                        return;
                    }
                }
                str2 = "adsMediaIgId";
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Eom(2131970160);
        DbX.A1A(new C18887WAz(this, 51), DbV.A0K(), r4);
    }

    public final String getModuleName() {
        return "promote_ads_manager_past_promotions_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A06 = DbX.A0k(view);
        AnonymousClass0eM r3 = this.A0I;
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        0qQ.A0B(A0l, 1);
        View A002 = AnonymousClass2xO.A00(view, A0l, AnonymousClass05K.A0u);
        RecyclerView A0c = JTR.A0c(A002, R.id.ad_tools_recycler_view);
        C15480UdV udV = this.A02;
        if (udV == null) {
            str = "pastPromotionsAdapter";
        } else {
            A0c.setAdapter(udV);
            DbY.A16(this, A0c);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
            A0c.setLayoutManager(linearLayoutManager);
            this.A05 = C3253672c.A01(A002, AnonymousClass7TE.A0l(r3), new C19760Wf1(this, 2));
            JTQ.A0y(linearLayoutManager, A0c, this, C3251771i.A0A);
            C238133Ar A003 = C238103Ao.A00(A0c);
            0qQ.A0C(A003, "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.RefreshableScrollingViewProxy<*>");
            C238143As r1 = (C238143As) A003;
            this.A04 = r1;
            str = "recyclerViewProxy";
            if (r1 != null) {
                r1.ARa();
                AnonymousClass3AD r12 = this.A05;
                if (r12 == null) {
                    0qQ.A0F("pullToRefresh");
                    throw AnonymousClass00P.createAndThrow();
                }
                if (r12 instanceof C19763Wf4) {
                    C238143As r0 = this.A04;
                    if (r0 != null) {
                        r0.setUpPTRSpinner((C19763Wf4) r12);
                    }
                } else {
                    List list = this.A0H;
                    if (list == null || list.isEmpty()) {
                        SpinnerImageView spinnerImageView = this.A06;
                        if (spinnerImageView == null) {
                            str = "loadingSpinner";
                        } else {
                            DbS.A1T(spinnerImageView);
                        }
                    }
                    C238143As r13 = this.A04;
                    if (r13 != null) {
                        r13.ErF(new C19988Wiz(this));
                    }
                }
                List list2 = this.A0H;
                if (list2 == null || list2.isEmpty()) {
                    A02(this, true);
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final AnonymousClass9JK A00() {
        Map map = 0Yh.A03;
        CallerContext A012 = CallerContext.A01(0q1.A01(C15327Uab.class));
        0qQ.A0A(A012);
        return new AnonymousClass9JK(A012, "ig_android_promote_ads_manager_ig_to_fb_fetch_promotions", "ads_manager", C16678UzE.ADS_MANAGER.toString(), "past_promotion_list");
    }

    public static final void A01(C15327Uab uab, String str, boolean z) {
        int A012 = (int) 182.A01(0Tu.A05, DbT.A0X(uab.A0I), 36612603333646693L);
        C18641Vvg vvg = uab.A03;
        if (vvg == null) {
            0qQ.A0F("pastPromotionsDataFetcher");
            throw AnonymousClass00P.createAndThrow();
        }
        C18641Vvg.A00(vvg, new C15611Ufd(uab, A012, z), C18146VmM.A00(vvg.A02, "INACTIVE", str, A012, uab.A00));
    }

    public final void ACw() {
        if (this.A0C && !this.A0D) {
            A02(this, false);
        }
    }

    public final void Dz6(C21004X9b x9b) {
        String A0R = 002.A0R("promote_ads_manager_past_promotions_fragment", ".BACK_STACK");
        W2F w2f = C17137VJm.A00;
        String BYn = x9b.BYn();
        w2f.A05(requireActivity(), AnonymousClass7TE.A0l(this.A0I), A0R, BYn);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0I);
    }

    public final boolean onBackPressed() {
        C18662VwK vwK = this.A01;
        if (vwK == null) {
            0qQ.A0F("adsManagerLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        vwK.A01(C16678UzE.ADS_MANAGER_PAST_PROMOTIONS.toString());
        DbT.A1I(this);
        return true;
    }

    public final void DrN(C21004X9b x9b) {
        XIGIGBoostCallToAction Awb = x9b.Awb();
        C18662VwK vwK = this.A01;
        String str = null;
        if (vwK == null) {
            0qQ.A0F("adsManagerLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        vwK.A08("past_promotion_list", "promotion_preview", x9b.BYo(), (String) null);
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(this.A0I);
        String BYo = x9b.BYo();
        if (Awb != null) {
            str = Awb.toString();
        }
        C305796Jo.A02(requireContext, A0l, "ads_manager", BYo, str, x9b.BdT(), x9b.BHq());
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, X.0iw, X.X8N, androidx.fragment.app.Fragment, java.lang.Object, X.Uab] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-189339832);
        C15327Uab.super.onCreate(bundle);
        AnonymousClass0eM r5 = this.A0I;
        this.A02 = new C15480UdV(requireContext(), this, this, AnonymousClass7TE.A0l(r5));
        this.A03 = new C18641Vvg(requireContext(), this, AnonymousClass7TE.A0l(r5));
        DbX.A0R(r5).A01(this.A0J, WQ1.class);
        UserSession A0l = AnonymousClass7TE.A0l(r5);
        AnonymousClass9JK A002 = A00();
        WO2 wo2 = new WO2(this, 2);
        0qQ.A0B(A0l, 0);
        AnonymousClass9F4.A00(AnonymousClass9F3.A00(A0l)).AUs(A002, AnonymousClass9F1.A00, wo2);
        C16899VAc.A00(A00(), new WO2(this, 3), AnonymousClass7TE.A0l(r5));
        String string = requireArguments().getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (string != null) {
            this.A08 = string;
        }
        this.A01 = VA1.A00(AnonymousClass7TE.A0l(r5));
        this.A0F = JTU.A0D(r5);
        AnonymousClass0fD.A09(1949339255, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-689883828);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.promote_ads_manager_view, false);
        AnonymousClass0fD.A09(1403042457, A022);
        return A0D2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-975635243);
        super.onDestroy();
        DbX.A0R(this.A0I).A02(this.A0J, WQ1.class);
        this.A00 = 0;
        this.A0G.clear();
        this.A0C = false;
        AnonymousClass0fD.A09(-385831837, A022);
    }
}
