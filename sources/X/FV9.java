package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.search.SearchController;
import com.instagram.wellbeing.reporting.common.impersonation.ConsolidatedProfileSearchBottomSheetFragment;

public final class FV9 implements AnonymousClass0iw, C74502Pvw {
    public static final String __redex_internal_original_name = "ConsolidatedProfileSearchController";
    public AnonymousClass2t9 A00;
    public SearchController A01;
    public boolean A02;
    public ConsolidatedProfileSearchBottomSheetFragment A03;
    public final int A04;
    public final Context A05;
    public final UserSession A06;
    public final C294875nB A07;
    public final int A08;
    public String mResponsibleUserId;

    public final float Abo(SearchController searchController, Integer num) {
        return 0.0f;
    }

    public final void CvL(SearchController searchController, Integer num, float f, float f2) {
    }

    public final void DRx() {
    }

    public final void DRz() {
    }

    public final void Dhf(SearchController searchController, boolean z) {
    }

    public final void Dht(String str, boolean z) {
    }

    public final void Dmq(SearchController searchController, Integer num, Integer num2) {
    }

    public final String getModuleName() {
        return "CONSOLIDATED_PROFILE_SEARCH_CONTROLLER";
    }

    public final void DDU() {
        SearchController searchController = this.A01;
        if (searchController != null) {
            searchController.A00();
        }
        C72982PRp pRp = this.A03.A05;
        if (pRp != null) {
            ((C48058EUc) pRp).A00.A04.A08();
        }
    }

    public final void Dhw(String str, String str2) {
        String str3 = str;
        if (!TextUtils.isEmpty(str3)) {
            if (this.A02) {
                AnonymousClass2t9 r6 = this.A00;
                if (r6 != null) {
                    ViewModelListUpdate A0R = DbS.A0R();
                    Context context = this.A05;
                    A0R.A00(new C47765EGc(context.getString(2131972868), DbV.A01(context), true));
                    r6.A05(A0R);
                }
                1vn A012 = 1vm.A01(this.A06);
                int i = this.A08;
                0Df A032 = C41845B3m.A03(GraphQlCallInput.A02, str3, "query");
                0Df.A00(A032, DbS.A0j(i), "count");
                0Df.A00(A032, "report_profile_ig_search", "search_surface");
                2IS A042 = C41845B3m.A04();
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(A032, A042, "request_data"), "ProfileReportingSearchQuery", A042.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C69.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_profile_reporting_search", AnonymousClass7TE.A1C());
                A012.ATL(new C19026WHc(8), new FSC(this, 16), pandoGraphQLRequest);
            }
        }
    }

    public FV9(Context context, UserSession userSession, C294875nB r3, ConsolidatedProfileSearchBottomSheetFragment consolidatedProfileSearchBottomSheetFragment, String str, int i, int i2) {
        this.A05 = context;
        this.A06 = userSession;
        this.mResponsibleUserId = str;
        this.A04 = i;
        this.A07 = r3;
        this.A03 = consolidatedProfileSearchBottomSheetFragment;
        this.A08 = i2 <= 0 ? Integer.MAX_VALUE : i2;
    }
}
