package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.Map;

public final class E6U extends AnonymousClass32G implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CitySearchFragment";
    public C47578E8q A00;
    public BusinessFlowAnalyticsLogger A01;
    public G8D A02;
    public UserSession A03;
    public SearchEditText A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09 = new C46672Dj1(Looper.getMainLooper(), this, 1);

    public final String getModuleName() {
        return "business_city_search";
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return this.A03;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r5) {
        FPB A002 = FPB.A00(this, 32);
        if (this.A08) {
            ? obj = new Object();
            C59922Jbl.A02(DbV.A05(this), obj, 2131955121);
            ActionButton A003 = C59904JbT.A00(A002, r5, obj);
            A003.setButtonResource(R.drawable.instagram_arrow_cw_pano_outline_24);
            A003.setContentDescription(getString(2131971905));
            return;
        }
        r5.Eom(2131955121);
        r5.Eu4(true);
        r5.Ett(A002, true);
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (this.A07 || (businessFlowAnalyticsLogger = this.A01) == null) {
            return false;
        }
        businessFlowAnalyticsLogger.ChP(new C22030Xtl("page_import_info_city_town", this.A06, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        return false;
    }

    public final void A0c(String str) {
        if (!TextUtils.isEmpty(str)) {
            Handler handler = this.A09;
            if (handler.hasMessages(1)) {
                handler.removeMessages(1);
            }
            handler.sendMessageDelayed(handler.obtainMessage(1, str), 300);
        }
    }

    public final void onAttach(Context context) {
        E6U.super.onAttach(context);
        this.A02 = FG1.A01(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-512637828);
        E6U.super.onCreate(bundle);
        this.A06 = DbX.A0o(this);
        this.A00 = new C47578E8q(requireContext(), this);
        this.A08 = requireArguments().getBoolean("BusinessLocationFragment.EXTRA_SHOULD_SHOW_IN_MODAL");
        this.A03 = DbX.A0U(this);
        C227622jd r2 = new C227622jd();
        r2.A0E(new EE7(getActivity()));
        A0b(r2);
        BusinessFlowAnalyticsLogger A002 = FG1.A00(this.A02, this, this.A03);
        this.A01 = A002;
        if (A002 != null) {
            A002.Cka(new C22030Xtl("page_import_info_city_town", this.A06, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        AnonymousClass0fD.A09(-799310722, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1561778261);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.city_search_fragment);
        AnonymousClass0fD.A09(-1785230283, A022);
        return A0C;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1058252905);
        super.onResume();
        this.A04.requestFocus();
        0nA.A0Q(this.A04);
        AnonymousClass0fD.A09(159950364, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1191392317);
        E6U.super.onStop();
        DbS.A1D(this);
        AnonymousClass0fD.A09(-1973735218, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A04 = (SearchEditText) view.requireViewById(R.id.search_edit_text);
        ColorFilter A062 = DbV.A06(requireContext(), R.color.grey_5);
        this.A04.setClearButtonColorFilter(A062);
        AnonymousClass7TG.A10(A062, this.A04.getCompoundDrawablesRelative()[0]);
        this.A04.addTextChangedListener(AnonymousClass4v0.A00(this.A03));
        this.A04.A0C = new C51004Fmr(this, 0);
        A0V(this.A00);
        0S7.A00(this);
        this.A04.setOnScrollListener(new LZD(this, 0));
    }
}
