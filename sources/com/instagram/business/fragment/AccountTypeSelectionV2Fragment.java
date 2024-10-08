package com.instagram.business.fragment;

import X.0Tu;
import X.0eE;
import X.0qQ;
import X.16V;
import X.1ES;
import X.1OC;
import X.AnonymousClass0fD;
import X.AnonymousClass0fU;
import X.AnonymousClass0t1;
import X.AnonymousClass0wW;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C22030Xtl;
import X.C319586qr;
import X.C319596qs;
import X.C47697EDg;
import X.C48756Ejf;
import X.C49454Evv;
import X.C49581Eyq;
import X.C51170Fpg;
import X.C51925G7t;
import X.C51926G7u;
import X.C59689JTv;
import X.DbT;
import X.DbU;
import X.DbX;
import X.DbY;
import X.Dba;
import X.EDV;
import X.EEJ;
import X.F7X;
import X.FG1;
import X.FPB;
import X.FPH;
import X.G8D;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import java.util.HashMap;
import java.util.Map;

public class AccountTypeSelectionV2Fragment extends AnonymousClass4DH implements AnonymousClass4DR, C51926G7u, C51925G7t {
    public BusinessFlowAnalyticsLogger A00;
    public EEJ A01;
    public UserSession A02;
    public 16V A03;
    public 16V A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08 = AnonymousClass7TF.A0D();
    public RadioButton mBusinessRadioButton;
    public G8D mController;
    public RadioButton mCreatorRadioButton;

    public final void APF() {
    }

    public final void ARL() {
    }

    public final void DeS() {
    }

    public final void Di0() {
    }

    public final String getModuleName() {
        return "account_type_selection_v2_fragment";
    }

    public static void A00(C319586qr r10, AccountTypeSelectionV2Fragment accountTypeSelectionV2Fragment) {
        G8D g8d = accountTypeSelectionV2Fragment.mController;
        if (g8d != null) {
            g8d.EWu(r10);
            Dba.A1P(accountTypeSelectionV2Fragment.mController);
        }
        if (accountTypeSelectionV2Fragment.A00 != null) {
            String str = accountTypeSelectionV2Fragment.A05;
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("preselected_account_type", accountTypeSelectionV2Fragment.A03.A01);
            HashMap A1E2 = AnonymousClass7TE.A1E();
            A1E2.put("selected_account_type", accountTypeSelectionV2Fragment.A04.A01);
            accountTypeSelectionV2Fragment.A00.Ci7(new C22030Xtl("account_type_selection", str, (String) null, (String) null, (String) null, A1E, A1E2, (Map) null));
        }
        G8D g8d2 = accountTypeSelectionV2Fragment.mController;
        if (g8d2 != null) {
            C319596qs.A00(r10, accountTypeSelectionV2Fragment, accountTypeSelectionV2Fragment.A02, (String) AnonymousClass7TE.A14(((BusinessConversionActivity) g8d2).A0C));
        }
    }

    public static void A01(AccountTypeSelectionV2Fragment accountTypeSelectionV2Fragment) {
        C319586qr r5;
        if (accountTypeSelectionV2Fragment.mController != null) {
            boolean z = accountTypeSelectionV2Fragment.A06;
            16V A0J = DbT.A0j(accountTypeSelectionV2Fragment.A02).A0J();
            16V r0 = 16V.A06;
            if (z) {
                if (A0J == r0) {
                    r5 = C319586qr.CREATOR_SIGNUP_FLOW;
                } else {
                    r5 = C319586qr.BUSINESS_SIGNUP_FLOW;
                }
            } else if (A0J == r0) {
                r5 = C319586qr.CREATOR_CONVERSION_FLOW;
            } else {
                r5 = C319586qr.CONVERSION_FLOW;
            }
            if (DbY.A1Y(0Tu.A05, accountTypeSelectionV2Fragment.A02, 36316826115773079L)) {
                BusinessFlowAnalyticsLogger A002 = C319596qs.A00(r5, accountTypeSelectionV2Fragment, accountTypeSelectionV2Fragment.A02, (String) AnonymousClass7TE.A14(((BusinessConversionActivity) accountTypeSelectionV2Fragment.mController).A0C));
                C49581Eyq eyq = new C49581Eyq(A002, r5, new C49454Evv(r5, accountTypeSelectionV2Fragment), accountTypeSelectionV2Fragment);
                UserSession userSession = accountTypeSelectionV2Fragment.A02;
                0qQ.A0B(userSession, 0);
                EDV edv = new EDV(9, eyq, A002);
                1OC A003 = F7X.A00(userSession, "email_and_sms");
                A003.A00 = edv;
                1ES.A03(A003);
                return;
            }
            A00(r5, accountTypeSelectionV2Fragment);
        }
    }

    public static void A02(AccountTypeSelectionV2Fragment accountTypeSelectionV2Fragment, String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (!accountTypeSelectionV2Fragment.A07 && (businessFlowAnalyticsLogger = accountTypeSelectionV2Fragment.A00) != null) {
            businessFlowAnalyticsLogger.Ckp(new C22030Xtl("account_type_selection", accountTypeSelectionV2Fragment.A05, str, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    public final void DZI() {
        A02(this, "continue");
        if (this.mController == null || this.A04 == DbT.A0j(this.A02).A0J()) {
            if (this.mController != null) {
                16V r1 = 16V.A05;
                if (r1.equals(this.A04) && r1.equals(DbT.A0j(this.A02).A0J())) {
                    C48756Ejf.A00(C47697EDg.A00(this, 9), this.A02, this, this.A06);
                    return;
                }
            }
            A01(this);
            return;
        }
        ((BusinessConversionActivity) this.mController).A0o(requireContext(), this, this, this.A04, "account_type_selection", true);
    }

    public final void DeL(String str, String str2, String str3) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Ckh(new C22030Xtl("account_type_selection", this.A05, "switch_to_professional", str2, str3, (Map) null, (Map) null, (Map) null));
        }
        C59689JTv.A09(requireContext(), str);
        this.A01.A00();
    }

    public final void Dei() {
        this.A01.A01();
    }

    public final void Det(16V r11) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Ckg(new C22030Xtl("account_type_selection", this.A05, "switch_to_professional", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if (16V.A05.equals(DbT.A0j(this.A02).A0J())) {
            C48756Ejf.A00(C47697EDg.A00(this, 9), this.A02, this, this.A06);
            return;
        }
        this.A08.post(new C51170Fpg(this));
    }

    public final AnonymousClass0wW getSession() {
        return this.A02;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger == null) {
            return true;
        }
        businessFlowAnalyticsLogger.ChP(new C22030Xtl("account_type_selection", this.A05, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        return true;
    }

    public final void onAttach(Context context) {
        AccountTypeSelectionV2Fragment.super.onAttach(context);
        this.mController = FG1.A01(this);
    }

    public final void onCreate(Bundle bundle) {
        16V r0;
        int A022 = AnonymousClass0fD.A02(34459038);
        AccountTypeSelectionV2Fragment.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = DbX.A0U(this);
        this.A05 = DbU.A0l(requireArguments, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        G8D g8d = this.mController;
        if (g8d != null) {
            this.A00 = C319596qs.A00(g8d.B6a(), this, this.A02, (String) AnonymousClass7TE.A14(((BusinessConversionActivity) this.mController).A0C));
        }
        UserSession userSession = this.A02;
        0eE r1 = AnonymousClass0t1.A01;
        if (r1.A01(userSession).A0J() != null) {
            r0 = r1.A01(this.A02).A0J();
            this.A03 = r0;
        } else {
            this.A03 = 16V.A08;
            r0 = 16V.A05;
        }
        this.A04 = r0;
        this.A06 = FG1.A04(this.mController);
        AnonymousClass0fD.A09(404990344, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int A022 = AnonymousClass0fD.A02(-1007450277);
        this.A07 = true;
        View inflate = layoutInflater.inflate(R.layout.account_type_selection_v2_fragment, viewGroup, false);
        IgdsBottomButtonLayout A0c = DbT.A0c(inflate, R.id.navigation_bar_igds_bottom_button);
        0qQ.A0B(A0c, 2);
        EEJ eej = new EEJ((C51925G7t) this, A0c, 2131968361, -1);
        this.A01 = eej;
        registerLifecycleListener(eej);
        EEJ eej2 = this.A01;
        BusinessNavBar businessNavBar = eej2.A00;
        if (businessNavBar != null) {
            businessNavBar.setPrimaryButtonEnabled(false);
        } else {
            IgdsBottomButtonLayout igdsBottomButtonLayout = eej2.A02;
            if (igdsBottomButtonLayout != null) {
                igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
            }
        }
        View requireViewById = inflate.requireViewById(R.id.header);
        TextView A062 = Dba.A06(requireViewById);
        TextView A052 = Dba.A05(requireViewById);
        16V r0 = this.A03;
        16V r7 = 16V.A06;
        if (r0 == r7) {
            A062.setText(2131952112);
            i = 2131952111;
        } else {
            A062.setText(2131952110);
            i = 2131952109;
        }
        A052.setText(i);
        16V r5 = this.A03;
        View requireViewById2 = inflate.requireViewById(R.id.card_1);
        View view = requireViewById2;
        View requireViewById3 = inflate.requireViewById(R.id.card_2);
        if (r5 != r7) {
            view = requireViewById3;
            requireViewById3 = requireViewById2;
        }
        ViewGroup A0C = DbU.A0C(requireViewById3, R.id.container_value_prop);
        ViewGroup A0C2 = DbU.A0C(view, R.id.container_value_prop);
        A0C.setVisibility(8);
        A0C2.setVisibility(8);
        this.mBusinessRadioButton = (RadioButton) requireViewById3.requireViewById(R.id.radio_account_type);
        this.mCreatorRadioButton = (RadioButton) view.requireViewById(R.id.radio_account_type);
        AnonymousClass0fU.A00(new FPH(A0C, A0C2, this, 12), this.mBusinessRadioButton);
        AnonymousClass0fU.A00(new FPH(A0C2, A0C, this, 13), this.mCreatorRadioButton);
        FPB.A01(requireViewById3, 13, this);
        FPB.A01(view, 14, this);
        DbU.A0G(requireViewById3, R.id.text_card_title).setText(2131952102);
        DbU.A0G(requireViewById3, R.id.text_card_description).setText(2131952101);
        DbU.A0G(view, R.id.text_card_title).setText(2131952104);
        DbU.A0G(view, R.id.text_card_description).setText(2131952103);
        if (this.A00 != null) {
            String str = this.A05;
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("preselected_account_type", this.A03.A01);
            this.A00.Cka(new C22030Xtl("account_type_selection", str, (String) null, (String) null, (String) null, A1E, (Map) null, (Map) null));
        }
        AnonymousClass0fD.A09(1919441539, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-387637542);
        super.onDestroyView();
        unregisterLifecycleListener(this.A01);
        AnonymousClass0fD.A09(-63247709, A022);
    }

    public final void onViewStateRestored(Bundle bundle) {
        RadioButton radioButton;
        int A022 = AnonymousClass0fD.A02(-1520255634);
        super.onViewStateRestored(bundle);
        int ordinal = this.A04.ordinal();
        if (ordinal != 2) {
            if (ordinal == 3) {
                radioButton = this.mCreatorRadioButton;
            }
            this.A07 = false;
            AnonymousClass0fD.A09(-1651681999, A022);
        }
        radioButton = this.mBusinessRadioButton;
        radioButton.performClick();
        this.A07 = false;
        AnonymousClass0fD.A09(-1651681999, A022);
    }
}
