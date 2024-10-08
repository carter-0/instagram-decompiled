package com.instagram.business.fragment;

import X.002;
import X.1NY;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DH;
import X.AnonymousClass4DS;
import X.C274674os;
import X.C47697EDg;
import X.C49935FFo;
import X.C59904JbT;
import X.C59922Jbl;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbX;
import X.DbZ;
import X.Dba;
import X.Dbb;
import X.DvZ;
import X.EWP;
import X.F55;
import X.FP5;
import X.FPB;
import X.W3L;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.android.R;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.Locale;

public class SupportLinksFragment extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String A06 = 002.A0R(SupportLinksFragment.class.getName(), ".BACK_STACK");
    public LayoutInflater A00;
    public C49935FFo A01;
    public UserSession A02;
    public String A03;
    public String A04;
    public boolean A05;
    public View mLoadingIndicator;
    public ViewGroup mPartnerTypeRowsContainer;
    public ViewGroup mProfileDisplayRow;
    public View mSelectButtonRow;

    public final String getModuleName() {
        return "support_links_fragment";
    }

    public static void A00(SupportLinksFragment supportLinksFragment) {
        View view;
        String string;
        if (supportLinksFragment.A05) {
            Context context = supportLinksFragment.getContext();
            C274674os AyK = DbV.A0k(supportLinksFragment.A02).AyK();
            if (AyK == null || AyK.Ay3() == null) {
                string = context.getString(2131954403);
            } else {
                string = AyK.Ay3();
            }
            Dba.A07(supportLinksFragment.mProfileDisplayRow, R.id.shown_button_text).setText(string);
            supportLinksFragment.mProfileDisplayRow.setVisibility(0);
            view = supportLinksFragment.mSelectButtonRow;
        } else {
            supportLinksFragment.mSelectButtonRow.setVisibility(0);
            view = supportLinksFragment.mProfileDisplayRow;
        }
        view.setVisibility(8);
    }

    public static boolean A01(C274674os r2, String str) {
        if (r2 == null || r2.Ain() == null || r2.Ain().equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
            return EWP.A07.A01.equals(str);
        }
        Object obj = XIGIGBoostCallToAction.A02.get(r2.Ain().toUpperCase(Locale.US));
        if (obj == null) {
            obj = XIGIGBoostCallToAction.UNRECOGNIZED;
        }
        return W3L.A05().contains(obj);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r4) {
        ? obj = new Object();
        C59922Jbl.A01(DbV.A05(this), obj, 2131974801);
        C59904JbT.A00(FP5.A00(this, 0), r4, obj).setEnabled(true);
    }

    public final AnonymousClass0wW getSession() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(545035804);
        SupportLinksFragment.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = DbX.A0U(this);
        this.A03 = requireArguments.getString("args_entry_point");
        String string = requireArguments.getString("args_session_id");
        this.A04 = string;
        this.A01 = new C49935FFo(this, this.A02, string, this.A03);
        this.A05 = false;
        Dbb.A1M(this);
        AnonymousClass0fD.A09(-1761377935, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1521402440);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.support_links_setup_fragment);
        this.A00 = layoutInflater;
        AnonymousClass0fD.A09(-1380120416, A022);
        return A0C;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        IgdsHeadline A0U = DbZ.A0U(view, R.id.links_setup_headline);
        A0U.setImageResource(R.drawable.ig_illustrations_illo_business_flare_refresh);
        A0U.setHeadline(2131952136);
        A0U.setBody(2131974802);
        this.mSelectButtonRow = view.requireViewById(R.id.action_button_section_title);
        this.mProfileDisplayRow = DbU.A0C(view, R.id.profile_display_options_row);
        A00(this);
        FPB.A01(this.mProfileDisplayRow, 70, this);
        this.mPartnerTypeRowsContainer = DbU.A0C(view, R.id.partner_type_rows_container);
        this.mLoadingIndicator = view.findViewById(R.id.loading_spinner);
        UserSession userSession = this.A02;
        C47697EDg A002 = C47697EDg.A00(this, 28);
        1NY A0L = DbZ.A0L(userSession);
        A0L.A0A("business/profile_action_buttons/get_all_cta_categories_info/");
        A0L.A0Q(DvZ.class, F55.class);
        DbW.A1E(A0L, A002, this);
    }
}
