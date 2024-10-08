package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.search.SearchController;
import com.instagram.wellbeing.reporting.common.impersonation.HighProfileVictimSearchBottomSheetFragment;

public final class FVA implements AnonymousClass0iw, C74502Pvw {
    public static final String __redex_internal_original_name = "HighProfileUsersSearchController";
    public AnonymousClass2t9 A00;
    public SearchController A01;
    public EBM A02;
    public String A03;
    public boolean A04;
    public HighProfileVictimSearchBottomSheetFragment A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final UserSession A09;
    public final C294875nB A0A;
    public final AnonymousClass07i A0B;

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
        return "HIGH_PROFILE_USERS_SEARCH_CONTROLLER";
    }

    public final void DDU() {
        SearchController searchController = this.A01;
        if (searchController != null) {
            searchController.A00();
        }
        C72982PRp pRp = this.A05.A05;
        if (pRp != null) {
            ((C48058EUc) pRp).A00.A04.A08();
        }
    }

    public FVA(Context context, AnonymousClass07i r2, UserSession userSession, C294875nB r4, HighProfileVictimSearchBottomSheetFragment highProfileVictimSearchBottomSheetFragment, String str, int i, int i2) {
        this.A08 = context;
        this.A09 = userSession;
        this.A03 = str;
        this.A0B = r2;
        this.A07 = i;
        this.A0A = r4;
        this.A05 = highProfileVictimSearchBottomSheetFragment;
        this.A06 = i2 <= 0 ? Integer.MAX_VALUE : i2;
    }

    public final void Dhw(String str, String str2) {
        if (!TextUtils.isEmpty(str) && this.A04) {
            AnonymousClass2t9 r5 = this.A00;
            if (r5 != null) {
                ViewModelListUpdate A0R = DbS.A0R();
                Context context = this.A08;
                A0R.A00(new C47765EGc(context.getString(2131972868), DbV.A01(context), true));
                r5.A05(A0R);
            }
            C228602lw r52 = new C228602lw(this.A08, this.A0B);
            UserSession userSession = this.A09;
            int i = this.A06;
            1NY A0M = DbZ.A0M(userSession);
            A0M.A0A("direct_v2/high_profile_search/");
            A0M.A0Q(C43843CFj.class, D32.class);
            A0M.A9m("query", str);
            A0M.A9m("search_surface", "verified_user_search");
            A0M.A0C("count", i);
            A0M.A0C("max_fb_results", i);
            1OC A0M2 = A0M.A0M();
            A0M2.A00 = this.A02;
            r52.schedule(A0M2);
        }
    }
}
