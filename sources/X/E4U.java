package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.onboarding.repository.OnboardingRepository;

public final class E4U extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "OnboardingTermsFragment";
    public ImageView A00;
    public C46788DlI A01;
    public final AnonymousClass0eM A02 = C51793G2c.A00(this, 37);
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public static final void A00(E4U e4u) {
        E4U e4u2 = e4u;
        C46788DlI dlI = e4u.A01;
        if (dlI != null) {
            FragmentActivity requireActivity = e4u.requireActivity();
            UserSession A0l = AnonymousClass7TE.A0l(e4u.A03);
            C46788DlI dlI2 = e4u.A01;
            if (dlI2 != null) {
                0qQ.A07(e4u.getString(dlI2.A01()));
                dlI.A06(e4u2, requireActivity, A0l, __redex_internal_original_name, (String) null);
                return;
            }
        }
        0qQ.A0F("productOnboardingViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131968811);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b7, code lost:
        if (X.1Q6.A01(r2) == false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b9, code lost:
        r0 = r5.getUserAgentString();
        X.0qQ.A07(r0);
        r5.setUserAgentString(X.1Ch.A01(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c7, code lost:
        r3.setWebViewClient(new X.Q95(r7, 5));
        r3.loadUrl(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            r1 = 0
            X.0qQ.A0B(r8, r1)
            super.onViewCreated(r8, r9)
            r0 = 2131435629(0x7f0b206d, float:1.8493106E38)
            android.widget.ImageView r0 = X.DbS.A0G(r8, r0)
            r7.A00 = r0
            r0 = 2131443977(0x7f0b4109, float:1.8510037E38)
            android.view.View r3 = X.AnonymousClass7TF.A0F(r8, r0)
            android.webkit.WebView r3 = (android.webkit.WebView) r3
            r3.setScrollBarStyle(r1)
            android.webkit.WebSettings r5 = r3.getSettings()
            X.0qQ.A07(r5)
            r0 = 1
            r5.setJavaScriptEnabled(r0)
            android.content.Context r0 = r7.getContext()
            r4 = 0
            if (r0 == 0) goto L_0x0037
            X.0eM r0 = r7.A03
            X.0lg r0 = X.DbT.A0X(r0)
            X.SAX.A00(r0, r4)
        L_0x0037:
            X.0eM r0 = r7.A03
            X.0lg r6 = X.DbT.A0X(r0)
            X.DlI r0 = r7.A01
            if (r0 == 0) goto L_0x00d5
            com.instagram.api.schemas.UserMonetizationProductType r0 = r0.A02()
            X.0qQ.A0B(r6, r1)
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L_0x0093;
                case 2: goto L_0x0096;
                case 10: goto L_0x0099;
                case 11: goto L_0x00a5;
                case 13: goto L_0x00a8;
                case 15: goto L_0x0090;
                default: goto L_0x004f;
            }
        L_0x004f:
            r0 = 2131428901(0x7f0b0625, float:1.847946E38)
            android.view.View r5 = r8.requireViewById(r0)
            X.61u r5 = (X.C3021461u) r5
            r0 = 2131968793(0x7f134319, float:1.957449E38)
            java.lang.String r2 = X.DbU.A0m(r7, r0)
            r1 = 10
            X.FOr r0 = new X.FOr
            r0.<init>((java.lang.String) r2, (java.lang.Object) r7, (int) r1)
            r5.setPrimaryAction(r2, r0)
            X.DlI r0 = r7.A01
            if (r0 == 0) goto L_0x00d5
            X.2Fj r3 = r0.A02
            X.07Z r2 = r7.getViewLifecycleOwner()
            r0 = 23
            X.MP7 r1 = new X.MP7
            r1.<init>(r5, r0)
            r0 = 21
            X.DbV.A1F(r2, r3, r1, r0)
            X.0xx r1 = X.DbV.A0J(r7)
            r0 = 16
            X.C51645Fy4.A01(r7, r1, r0)
            java.lang.String r1 = "impression"
            java.lang.String r0 = "terms"
            A01(r7, r1, r0, r4)
            return
        L_0x0090:
            java.lang.String r2 = "https://help.instagram.com/1322213587984073"
            goto L_0x00b3
        L_0x0093:
            java.lang.String r2 = "https://help.instagram.com/2811706922479237"
            goto L_0x00b3
        L_0x0096:
            java.lang.String r2 = "https://help.instagram.com/383069119533156"
            goto L_0x00b3
        L_0x0099:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36878779637563591(0x83050e000c00c7, double:3.385626969496906E-306)
            java.lang.String r2 = X.182.A04(r2, r6, r0)
            goto L_0x00b3
        L_0x00a5:
            java.lang.String r2 = "https://www.facebook.com/help/instagram/383069119533156"
            goto L_0x00b3
        L_0x00a8:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36878083852664984(0x83046c00090098, double:3.3851869523253263E-306)
            java.lang.String r2 = X.182.A04(r2, r6, r0)
        L_0x00b3:
            boolean r0 = X.1Q6.A01(r2)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = r5.getUserAgentString()
            X.0qQ.A07(r0)
            java.lang.String r0 = X.1Ch.A01(r0)
            r5.setUserAgentString(r0)
        L_0x00c7:
            r1 = 5
            X.Q95 r0 = new X.Q95
            r0.<init>(r7, r1)
            r3.setWebViewClient(r0)
            r3.loadUrl(r2)
            goto L_0x004f
        L_0x00d5:
            java.lang.String r0 = "productOnboardingViewModel"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E4U.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A01(E4U e4u, String str, String str2, String str3) {
        C50332FYn fYn = (C50332FYn) e4u.A02.getValue();
        C46788DlI dlI = e4u.A01;
        if (dlI != null) {
            String A012 = FCG.A01(dlI.A02());
            C46788DlI dlI2 = e4u.A01;
            if (dlI2 != null) {
                String A022 = FCG.A02(dlI2.A02());
                C46788DlI dlI3 = e4u.A01;
                if (dlI3 != null) {
                    fYn.A02(A012, A022, str, str2, __redex_internal_original_name, dlI3.A04(), str3);
                    return;
                }
            }
        }
        0qQ.A0F("productOnboardingViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final boolean onBackPressed() {
        A01(this, "back_button_clicked", "terms", __redex_internal_original_name);
        C46788DlI dlI = this.A01;
        if (dlI != null) {
            OnboardingRepository onboardingRepository = dlI.A05;
            C47184Drz drz = (C47184Drz) onboardingRepository.A00.get(dlI.A02());
            if (drz == null || drz.A00 == 0) {
                C46788DlI dlI2 = this.A01;
                if (dlI2 != null) {
                    C49004Eng.A00(this, dlI2);
                    return true;
                }
            } else {
                C46788DlI dlI3 = this.A01;
                if (dlI3 != null) {
                    dlI3.A05();
                    DbT.A1I(this);
                    return true;
                }
            }
        }
        0qQ.A0F("productOnboardingViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1 || i != 8888) {
            return;
        }
        if (intent == null || !intent.getBooleanExtra("EXTRA_IS_ONBOARDING_COMPLETE", false)) {
            C46788DlI dlI = this.A01;
            if (dlI == null) {
                0qQ.A0F("productOnboardingViewModel");
                throw AnonymousClass00P.createAndThrow();
            } else {
                dlI.A05();
            }
        } else {
            A00(this);
            FCM.A01(requireContext());
            A01(this, "finished", "payouts_onboarding", (String) null);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-548828162);
        E4U.super.onCreate(bundle);
        this.A01 = C47742EFc.A00(requireActivity(), this.A03);
        AnonymousClass0fD.A09(421188006, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-914265951);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.partner_program_terms_page, viewGroup, false);
        AnonymousClass0fD.A09(-1406323495, A022);
        return inflate;
    }
}
