package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.List;

public final class UZU extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AdToolsHighlightsHubSeeAllFragment";
    public C18662VwK A00;
    public C15480UdV A01;
    public C18641Vvg A02;
    public C238143As A03;
    public AnonymousClass3AD A04;
    public SpinnerImageView A05;
    public String A06;
    public String A07;
    public String A08;
    public WGU A09;
    public final List A0A = new ArrayList();
    public final AnonymousClass0eM A0B = C227642jf.A02(this);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Eom(2131970147);
        DbX.A1A(new C18887WAz(this, 42), DbV.A0K(), r4);
    }

    public final String getModuleName() {
        return "promote_ads_manager_highlights_hub_see_all_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A05 = DbX.A0k(view);
        AnonymousClass0eM r4 = this.A0B;
        UserSession A0l = AnonymousClass7TE.A0l(r4);
        0qQ.A0B(A0l, 1);
        RecyclerView A0c = JTR.A0c(AnonymousClass2xO.A00(view, A0l, AnonymousClass05K.A0u), R.id.ad_tools_recycler_view);
        C15480UdV udV = this.A01;
        if (udV == null) {
            str = "promoteAdToolsAdapter";
        } else {
            A0c.setAdapter(udV);
            DbU.A15(getContext(), A0c, 1, false);
            this.A04 = C3253672c.A01(view, AnonymousClass7TE.A0l(r4), new C19760Wf1(this, 0));
            C238133Ar A002 = C238103Ao.A00(A0c);
            0qQ.A0C(A002, "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.RefreshableScrollingViewProxy<*>");
            C238143As r1 = (C238143As) A002;
            this.A03 = r1;
            if (r1 != null) {
                r1.ARa();
                AnonymousClass3AD r12 = this.A04;
                str = "pullToRefresh";
                if (r12 != null) {
                    if (r12 instanceof C19763Wf4) {
                        C238143As r0 = this.A03;
                        if (r0 != null) {
                            r0.setUpPTRSpinner((C19763Wf4) r12);
                        }
                    }
                    A00(this);
                    return;
                }
            }
            0qQ.A0F("recyclerViewProxy");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(UZU uzu) {
        SpinnerImageView spinnerImageView;
        List list = uzu.A0A;
        list.clear();
        C238143As r0 = uzu.A03;
        String str = "recyclerViewProxy";
        if (r0 != null) {
            r0.EaP(true);
            C238143As r02 = uzu.A03;
            if (r02 != null) {
                r02.APL();
                C238143As r03 = uzu.A03;
                if (r03 != null) {
                    r03.setIsLoading(true);
                    AnonymousClass3AD r04 = uzu.A04;
                    str = "pullToRefresh";
                    if (r04 != null) {
                        r04.setIsLoading(true);
                        if (list.isEmpty()) {
                            AnonymousClass3AD r05 = uzu.A04;
                            if (r05 != null) {
                                if (!(r05 instanceof C19763Wf4) && (spinnerImageView = uzu.A05) != null) {
                                    DbS.A1T(spinnerImageView);
                                }
                            }
                        }
                        C18641Vvg vvg = uzu.A02;
                        if (vvg == null) {
                            str = "promoteAdsManagerDataFetcher";
                        } else {
                            vvg.A01(new C15621Ufn(uzu, 5), "IG_BOOST");
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(UZU uzu) {
        C238143As r0 = uzu.A03;
        String str = "recyclerViewProxy";
        if (r0 != null) {
            r0.EaP(false);
            C238143As r02 = uzu.A03;
            if (r02 != null) {
                r02.ARa();
                C238143As r03 = uzu.A03;
                if (r03 != null) {
                    r03.setIsLoading(false);
                    AnonymousClass3AD r04 = uzu.A04;
                    if (r04 == null) {
                        str = "pullToRefresh";
                    } else {
                        r04.setIsLoading(false);
                        SpinnerImageView spinnerImageView = uzu.A05;
                        if (spinnerImageView != null) {
                            JTO.A1X(spinnerImageView);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(UZU uzu) {
        C18662VwK vwK = uzu.A00;
        if (vwK == null) {
            0qQ.A0F("adsManagerLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        vwK.A07("ads_manager_highlights_hub", AppStateModule.APP_STATE_ACTIVE, uzu.A07, "FB Login failed or cancelled");
        C13990Tnq.A0w(uzu);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0B);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.UZU, X.0iw, androidx.fragment.app.Fragment] */
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        int A022 = AnonymousClass0fD.A02(-683373706);
        UZU.super.onCreate(bundle);
        this.A01 = new C15480UdV(requireContext(), this);
        AnonymousClass0eM r4 = this.A0B;
        this.A02 = new C18641Vvg(requireContext(), this, AnonymousClass7TE.A0l(r4));
        this.A09 = JTU.A0D(r4);
        this.A00 = VA1.A00(AnonymousClass7TE.A0l(r4));
        Bundle bundle2 = this.mArguments;
        String str3 = null;
        if (bundle2 != null) {
            str = bundle2.getString("media_id");
        } else {
            str = null;
        }
        this.A07 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str2 = bundle3.getString("page_id");
        } else {
            str2 = null;
        }
        this.A08 = str2;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str3 = bundle4.getString("boosted_id");
        }
        this.A06 = str3;
        AnonymousClass0fD.A09(-1541801031, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1902344945);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.promote_ads_manager_view, false);
        AnonymousClass0fD.A09(-2083055216, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1834237049);
        this.A05 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(-806887161, A022);
    }
}
