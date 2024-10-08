package X;

import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.ERr  reason: case insensitive filesystem */
public final class C48028ERr extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LocationPageInfoPageReportFragment";
    public Eu7 A00;
    public List A01;
    public UserSession A02;

    public final void configureActionBar(2da r2) {
        r2.Eu4(true);
        r2.Eom(2131972193);
    }

    public final String getModuleName() {
        return "location_page_info_page_report_fragment";
    }

    public final AnonymousClass0wW getSession() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1138602116);
        super.onCreate(bundle);
        this.A02 = DbX.A0U(this);
        boolean z = requireArguments().getBoolean("show_linked_business_report_options");
        List asList = Arrays.asList(new Pair[]{new Pair(2131972195, "INACCURATE_INFO"), new Pair(2131972201, "DISLIKE"), new Pair(2131972194, "HARASSING"), new Pair(2131972203, "SHOULD_NOT_BE_ON_IG"), new Pair(2131972202, "SCAM"), new Pair(2131972198, "IP")});
        this.A01 = asList;
        if (z) {
            ArrayList A1D = AnonymousClass7TE.A1D(asList);
            this.A01 = A1D;
            A1D.addAll(Arrays.asList(new Pair[]{new Pair(2131972177, AnonymousClass000.A00(2508)), new Pair(2131972176, "SPAM"), new Pair(2131972178, "WRONG_CLAIM")}));
        }
        ArrayList A1D2 = AnonymousClass7TE.A1D(this.A01);
        this.A01 = A1D2;
        A1D2.addAll(Arrays.asList(new Pair[]{new Pair(2131972196, "PIN_INACCURATE"), new Pair(2131972197, "INAPPROPRIATE_AR"), new Pair(2131972199, "CONTENT_NOT_RELEVANT"), new Pair(2131972200, "NO_CONTENT_ALLOWED")}));
        AnonymousClass0fD.A09(351360826, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ArrayList A1C = AnonymousClass7TE.A1C();
        C46448DfA A002 = C46448DfA.A00(2131972175);
        A002.A0K = false;
        A1C.add(A002);
        for (Pair pair : this.A01) {
            C50989Fmc.A02(requireContext(), new WBG(63, pair, this), A1C, AnonymousClass7TE.A0M(pair.first));
        }
        setItems(A1C);
    }
}
