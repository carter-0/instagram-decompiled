package com.instagram.business.fragment;

import X.0lg;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass32G;
import X.AnonymousClass3JR;
import X.AnonymousClass3Jb;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass7TF;
import X.C22030Xtl;
import X.C227622jd;
import X.C319586qr;
import X.C319596qs;
import X.C46445Df7;
import X.C47584E8w;
import X.C51857G4p;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbX;
import X.EE7;
import X.FPB;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.business.activity.FbConnectPageActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class EditBusinessFBPageFragment extends AnonymousClass32G implements AnonymousClass4DR, AnonymousClass4DS, C51857G4p {
    public static final CallerContext A07 = CallerContext.A01(EditBusinessFBPageFragment.class.getName());
    public ImageView A00;
    public C47584E8w A01;
    public UserSession A02;
    public String A03;
    public TextView A04;
    public ViewSwitcher A05;
    public BusinessFlowAnalyticsLogger A06;

    public final String getModuleName() {
        return "edit_business_fb_page";
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return this.A02;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A06;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.ChP(new C22030Xtl("page_change", this.A03, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        FragmentActivity activity = getActivity();
        if (!(activity instanceof FbConnectPageActivity)) {
            return false;
        }
        activity.finish();
        return true;
    }

    private void A01() {
        ViewSwitcher viewSwitcher;
        if (isResumed() && (viewSwitcher = this.A05) != null) {
            viewSwitcher.setEnabled(false);
            TextView textView = this.A04;
            textView.getClass();
            ColorStateList textColors = this.A04.getTextColors();
            textColors.getClass();
            textView.setTextColor(textColors.withAlpha(64));
        }
    }

    public final void configureActionBar(2da r4) {
        r4.Eom(2131976965);
        FPB.A02(DbV.A0K(), r4, this, 38);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A0A = R.layout.business_text_action_button;
        A0K.A05 = 2131960992;
        A0K.A0G = FPB.A00(this, 39);
        ViewSwitcher viewSwitcher = (ViewSwitcher) r4.AA5(new AnonymousClass3Jb(A0K));
        this.A05 = viewSwitcher;
        TextView textView = (TextView) viewSwitcher.getChildAt(0);
        this.A04 = textView;
        textView.setText(2131960992);
        A01();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2107892518);
        EditBusinessFBPageFragment.super.onCreate(bundle);
        this.A03 = DbX.A0o(this);
        C227622jd r2 = new C227622jd();
        r2.A0E(new EE7(getActivity()));
        A0b(r2);
        UserSession A0U = DbX.A0U(this);
        this.A02 = A0U;
        DbV.A0k(A0U).BaE();
        this.A01 = new C47584E8w(requireContext(), this, this, getString(2131973039), (CharSequence) null, (String) null);
        this.A06 = C319596qs.A00(C319586qr.EDIT_PROFILE, this, this.A02, AnonymousClass7TF.A0b());
        AnonymousClass0fD.A09(-75179511, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(381946027);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.edit_business_fb_page_view);
        AnonymousClass0fD.A09(1490347579, A022);
        return A0C;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-26026926);
        super.onResume();
        A01();
        AnonymousClass0fD.A09(-540530219, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        A0V(this.A01);
        C46445Df7.A01(this, this.A01.isEmpty());
        ImageView A0F = DbU.A0F(view, R.id.refresh);
        this.A00 = A0F;
        A0F.setVisibility(8);
        FPB.A01(this.A00, 37, this);
    }
}
