package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.search.SearchController;
import com.instagram.wellbeing.reporting.common.impersonation.SelectVictimSearchBottomSheetFragment;

public final class FVB implements AnonymousClass0iw, C74502Pvw, G6V {
    public static final String __redex_internal_original_name = "DirectGenericSearchController";
    public Fl0 A00;
    public C337257fy A01;
    public SearchController A02;
    public String A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final AnonymousClass07i A07;
    public final C290645fe A08;
    public final UserSession A09;
    public final C294875nB A0A;
    public final boolean A0B;
    public final SelectVictimSearchBottomSheetFragment A0C;

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
        return "DIRECT_GENERIC_SEARCH_USER_CONTROLLER";
    }

    public final void DDU() {
        SearchController searchController = this.A02;
        if (searchController != null) {
            searchController.A00();
        }
        C72982PRp pRp = this.A0C.A01;
        if (pRp != null) {
            ((C48058EUc) pRp).A00.A04.A08();
        }
    }

    public final void Dhj() {
        this.A01.getClass();
        this.A01.EJE();
    }

    public final void Dhw(String str, String str2) {
        C337257fy r0 = this.A01;
        if (r0 != null) {
            r0.EhX(str);
        }
    }

    public FVB(Context context, AnonymousClass07i r3, UserSession userSession, C294875nB r5, SelectVictimSearchBottomSheetFragment selectVictimSearchBottomSheetFragment, int i, int i2, boolean z) {
        this.A06 = context;
        this.A09 = userSession;
        this.A0A = r5;
        this.A07 = r3;
        this.A05 = i;
        this.A0B = z;
        this.A08 = C290635fd.A00(userSession);
        this.A0C = selectVictimSearchBottomSheetFragment;
        this.A04 = i2;
    }
}
