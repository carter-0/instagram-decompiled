package com.instagram.business.fragment;

import X.0Aj;
import X.17k;
import X.1NY;
import X.2Yu;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DH;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C274674os;
import X.C47697EDg;
import X.C49935FFo;
import X.C59904JbT;
import X.C59922Jbl;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbW;
import X.DbX;
import X.DbZ;
import X.Dba;
import X.Dbp;
import X.DvZ;
import X.E9E;
import X.F55;
import X.FP5;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.text.TitleTextView;

public class SupportProfileDisplayOptionsFragment extends AnonymousClass4DH implements AnonymousClass4DS {
    public ActionButton A00;
    public C274674os A01;
    public E9E A02;
    public C49935FFo A03;
    public UserSession A04;
    public String A05;
    public final Handler A06 = AnonymousClass7TF.A0D();
    public BusinessNavBar mBusinessNavBar;
    public View mLoadingIndicator;
    public RecyclerView mRecyclerView;

    public final String getModuleName() {
        return "support_profile_display_options";
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r4) {
        ? obj = new Object();
        C59922Jbl.A01(DbV.A05(this), obj, 2131969942);
        ActionButton A002 = C59904JbT.A00(FP5.A00(this, 2), r4, obj);
        this.A00 = A002;
        A002.setEnabled(false);
    }

    public final AnonymousClass0wW getSession() {
        return this.A04;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1251531810);
        SupportProfileDisplayOptionsFragment.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = DbX.A0U(this);
        String string = requireArguments.getString("args_session_id");
        17k.A07(string, "session_id should not be null");
        this.A05 = string;
        this.A03 = new C49935FFo(this, this.A04, this.A05, requireArguments.getString("args_entry_point"));
        this.A02 = new E9E(requireContext(), this);
        AnonymousClass0fD.A09(332902542, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1729142557);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.support_profile_display_options_fragment);
        AnonymousClass0fD.A09(-744947297, A022);
        return A0C;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        super.onViewCreated(view, bundle);
        this.mRecyclerView = DbX.A0K(view);
        this.mLoadingIndicator = view.requireViewById(R.id.loading_spinner);
        UserSession userSession = this.A04;
        C47697EDg A002 = C47697EDg.A00(this, 29);
        1NY A0L = DbZ.A0L(userSession);
        A0L.A0A("business/profile_action_buttons/get_all_cta_categories_info/");
        A0L.A0Q(DvZ.class, F55.class);
        DbW.A1E(A0L, A002, this);
        this.mRecyclerView.setAdapter(this.A02);
        C274674os AyK = DbV.A0k(this.A04).AyK();
        this.A01 = AyK;
        if (AyK != null) {
            BusinessNavBar businessNavBar = (BusinessNavBar) view.requireViewById(R.id.remove_action_bar);
            this.mBusinessNavBar = businessNavBar;
            businessNavBar.A01.setVisibility(8);
            BusinessNavBar businessNavBar2 = this.mBusinessNavBar;
            String string = getString(2131971977);
            int color = requireContext().getColor(2Yu.A03(requireContext()));
            int dimensionPixelSize = DbV.A05(this).getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
            TitleTextView titleTextView = businessNavBar2.A03;
            titleTextView.setText(string);
            titleTextView.setIsBold(true);
            titleTextView.setTextColor(color);
            titleTextView.setTextSize(0, (float) dimensionPixelSize);
            this.mBusinessNavBar.setSecondaryButtonOnclickListeners(FP5.A00(this, 1));
            this.mBusinessNavBar.setVisibility(0);
        }
        C274674os r0 = this.A01;
        String str4 = null;
        if (r0 != null) {
            str4 = r0.AmM();
            str = this.A01.Ac5();
            str2 = this.A01.Bao();
            str3 = this.A01.getUrl();
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        C49935FFo fFo = this.A03;
        0Aj A003 = C49935FFo.A00(fFo);
        DbS.A1H(A003, "edit_action_button");
        DbS.A1J(A003, "view");
        A003.AAJ(Dbp.A00(), fFo.A03);
        A003.A7p("is_support_partner_enabled", AnonymousClass7TE.A0v());
        DbS.A1N(A003, fFo.A02);
        A003.AAJ("service_type", str4);
        A003.A9F("partner_id", DbZ.A0d(str));
        Dba.A1A(A003, str2, str3);
        A003.Cgf();
    }
}
