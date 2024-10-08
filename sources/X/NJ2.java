package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.bugreporter.BugReportComposerFragment;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.bugreporter.model.BugReport;
import com.instagram.common.session.UserSession;

public final class NJ2 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "GDPRPrivacyCheckFragment";
    public BugReportComposerViewModel A00;
    public C49673F1f A01;
    public C74547Pwg A02;
    public BugReport A03;
    public boolean A04;
    public final AnonymousClass0eM A05 = C227642jf.A01(this);

    public final void configureActionBar(2da r5) {
        UserSession userSession;
        0qQ.A0B(r5, 0);
        if (getSession() instanceof UserSession) {
            AnonymousClass0wW session = getSession();
            0qQ.A0C(session, AnonymousClass000.A00(2));
            userSession = (UserSession) session;
        } else {
            userSession = null;
        }
        r5.ETj(userSession, R.layout.bugreporter_actionbar_header, 50, 0);
        r5.ARS(0, true);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A06 = R.drawable.instagram_x_pano_outline_24;
        A0K.A05 = 2131953555;
        A0K.A0G = new C71403Ok2(this, 13);
        r5.A8p(new AnonymousClass3Jb(A0K));
    }

    public final String getModuleName() {
        return "gdpr_consent_for_rageshake";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        OLY oly = new OLY(requireContext());
        BugReportComposerViewModel bugReportComposerViewModel = this.A00;
        if (bugReportComposerViewModel == null) {
            str = "composerViewModel";
        } else {
            oly.A01 = bugReportComposerViewModel.A01;
            oly.A02 = bugReportComposerViewModel.A02;
            oly.A00 = bugReportComposerViewModel.A00;
            oly.A04 = bugReportComposerViewModel.A04;
            oly.A03 = bugReportComposerViewModel.A03;
            oly.A05 = bugReportComposerViewModel.A05;
            C74547Pwg pwg = this.A02;
            if (pwg == null) {
                str = "userFlowLoggerV2";
            } else {
                pwg.AVy("gdpr_privacy_check");
                C3021461u r2 = (C3021461u) AnonymousClass7TF.A0F(view, R.id.rageshake_continue_button);
                r2.setPrimaryActionOnClickListener(new C71405Ok4(5, oly, this));
                r2.setSecondaryActionOnClickListener(new C71405Ok4(6, oly, this));
                TextView A0R = AnonymousClass7TG.A0R(view, R.id.rageshake_span_with_link);
                String A0m = DbU.A0m(this, 2131954342);
                String A0z = DbV.A0z(this, A0m, 2131971282);
                0qQ.A0A(A0z);
                DbT.A1H(A0R);
                Context A0S = AnonymousClass7TE.A0S(A0R);
                SpannableStringBuilder A0C = DbS.A0C(A0z);
                AnonymousClass7AV.A05(A0C, new C69194Ngs(this, DbV.A02(A0S), 1), A0m);
                A0R.setText(A0C);
                Dbb.A0t(view, R.id.learn_more_spam_view, 0);
                TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.learn_more_spam_description);
                DbT.A1H(A0R2);
                String A0m2 = DbU.A0m(this, 2131964895);
                String A0z2 = DbV.A0z(this, A0m2, 2131964894);
                0qQ.A07(A0z2);
                SpannableStringBuilder A0C2 = DbS.A0C(A0z2);
                AnonymousClass7AV.A05(A0C2, new C69194Ngs(this, DbV.A02(A0R2.getContext()), 2), A0m2);
                A0R2.setText(A0C2);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public static final void A00(NJ2 nj2) {
        String str;
        String token = nj2.getSession().getToken();
        BugReport bugReport = nj2.A03;
        if (bugReport == null) {
            str = "bugReport";
        } else {
            BugReportComposerViewModel bugReportComposerViewModel = nj2.A00;
            if (bugReportComposerViewModel == null) {
                str = "composerViewModel";
            } else {
                C74547Pwg pwg = nj2.A02;
                if (pwg == null) {
                    str = "userFlowLoggerV2";
                } else {
                    BugReportComposerFragment A002 = C69811NsY.A00(bugReport, bugReportComposerViewModel, pwg, token);
                    nj2.A04 = true;
                    DbY.A14(A002, nj2.requireActivity(), nj2.getSession());
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        IllegalArgumentException illegalArgumentException;
        int i;
        BugReportComposerViewModel bugReportComposerViewModel;
        BugReport bugReport;
        int A022 = AnonymousClass0fD.A02(1143056865);
        NJ2.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (bugReportComposerViewModel = (BugReportComposerViewModel) bundle2.getParcelable("GDPRPrivacyCheckFragment.ARGUMENT_COMPOSER_VIEWMODEL")) == null) {
            illegalArgumentException = AnonymousClass7TE.A0w("BugReportComposerViewModel is required in order to launch this screen");
            i = 271352917;
        } else {
            this.A00 = bugReportComposerViewModel;
            Bundle bundle3 = this.mArguments;
            if (bundle3 == null || (bugReport = (BugReport) bundle3.getParcelable("GDPRPrivacyCheckFragment.ARGUMENT_BUGREPORT")) == null) {
                illegalArgumentException = AnonymousClass7TE.A0w("BugReport is required in order to launch this screen");
                i = -1710945694;
            } else {
                this.A03 = bugReport;
                this.A02 = C70853OOi.A00(this.mArguments, getSession());
                this.A01 = new C49673F1f(getSession(), "gdpr_consent_for_rageshake");
                AnonymousClass0fD.A09(2023187409, A022);
                return;
            }
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalArgumentException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-736561626);
        0qQ.A0B(layoutInflater, 0);
        NJ2.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.feedback_privacy_consent_screen, viewGroup, false);
        AnonymousClass0fD.A09(-557830071, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-392497397);
        super.onDestroy();
        if (!this.A04) {
            C74547Pwg pwg = this.A02;
            if (pwg == null) {
                0qQ.A0F("userFlowLoggerV2");
                throw AnonymousClass00P.createAndThrow();
            }
            pwg.AVr(AnonymousClass05K.A01);
        }
        AnonymousClass0fD.A09(806269740, A022);
    }
}
