package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.android.R;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Locale;

public final class E7J extends MYR implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "UserPayFanclubEarningsFragment";
    public SpinnerImageView A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        DbW.A1B(r4, 2131976285);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A06 = R.drawable.instagram_info_pano_outline_24;
        A0K.A05 = 2131961996;
        DbX.A19(FP1.A00(this, 0), A0K, r4);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        SpinnerImageView A0k = DbX.A0k(view2);
        this.A00 = A0k;
        if (A0k == null) {
            0qQ.A0F("spinner");
            throw AnonymousClass00P.createAndThrow();
        }
        DbS.A1T(A0k);
        AnonymousClass0eM r1 = this.A01;
        UserSession A0l = AnonymousClass7TE.A0l(r1);
        0qQ.A0B(A0l, 1);
        FanClubInfoDict B3v = DbX.A0m(AnonymousClass7TE.A0l(r1)).B3v();
        if (B3v == null || (str = B3v.getFanClubId()) == null) {
            str = "";
        }
        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(Long.valueOf(System.currentTimeMillis()));
        0qQ.A07(format);
        C45926DFg dFg = new C45926DFg(this, 16);
        2IS A04 = C41845B3m.A04();
        2IS A042 = C41845B3m.A04();
        A04.A04("fan_club_id", str);
        A04.A04(DatePickerDialogModule.ARG_DATE, format);
        A04.A03("count", 50);
        1vm.A01(A0l).ATL(C50163FRv.A00, dFg, new PandoGraphQLRequest(C41845B3m.A05(), "FanClubInsights", A04.getParamsCopy(), A042.getParamsCopy(), BkH.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "node", AnonymousClass7TE.A1C()));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.2tE, java.lang.Object] */
    public final Collection getDefinitions() {
        return 0sr.A1P(new C232222tE[]{new EGC(requireActivity(), AnonymousClass7TE.A0l(this.A01)), new Object()});
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(G3N.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }
}
