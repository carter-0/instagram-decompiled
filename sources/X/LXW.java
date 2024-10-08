package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.leadads.activity.LeadAdsActivity;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

public final class LXW implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public LXW(Object obj, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = str2;
    }

    public final void onClick(View view) {
        int i;
        int i2;
        String str;
        switch (this.A00) {
            case 0:
                i2 = AnonymousClass0fD.A05(1447475628);
                C8072QgQ qgQ = (C8072QgQ) this.A01;
                String str2 = this.A03;
                C8072QgQ.A06(qgQ, Pxd.A00(920), this.A02, str2, (String) null, (String) null, (String) null, (String) null);
                AnonymousClass2gB r3 = qgQ.A03;
                AnonymousClass2E0.A02().A0B();
                r3.A0B(new SR4(new C12421Stz(str2)));
                i = 1370527218;
                break;
            case 1:
                i2 = AnonymousClass0fD.A05(-574451825);
                KGA kga = (KGA) this.A01;
                C49950FGf.A02(kga.A00, kga.A03, kga.A04, this.A02, this.A03, "tap_on_code");
                i = -461360852;
                break;
            case 2:
                i2 = AnonymousClass0fD.A05(1750044924);
                KGA kga2 = (KGA) this.A01;
                C49950FGf.A02(kga2.A00, kga2.A03, kga2.A04, this.A02, this.A03, "copy_button");
                i = -1160614120;
                break;
            case 3:
                i2 = AnonymousClass0fD.A05(-890888527);
                KGA kga3 = (KGA) this.A01;
                C49950FGf.A01(kga3.A00, kga3.A01, kga3.A03, kga3.A04, this.A02, this.A03, kga3.A06, (String) null);
                i = 933233944;
                break;
            case 4:
                i2 = AnonymousClass0fD.A05(1825283075);
                C15299Ua6 ua6 = (C15299Ua6) this.A01;
                String str3 = this.A02;
                String str4 = this.A03;
                FragmentActivity activity = ua6.getActivity();
                if (activity != null) {
                    AnonymousClass0eM r5 = ua6.A0F;
                    JTU.A0D(r5).A0F(C16678UzE.BOOST_PACKAGES, "boost_packages_suggested_badge");
                    C331127Pr A0f = DbX.A0f(r5);
                    A0f.A0d = str3;
                    C331157Pu A002 = A0f.A00();
                    C61353K3v k3v = new C61353K3v();
                    k3v.setArguments(AnonymousClass7TG.A0P("boost_packages_badge_description", str4, AnonymousClass7TE.A1L("IgSessionManager.SESSION_TOKEN_KEY", AnonymousClass7TE.A0l(r5).A05)));
                    A002.A02(activity, k3v);
                }
                i = -1346309591;
                break;
            case 5:
                i2 = AnonymousClass0fD.A05(1840195376);
                LeadAdsActivity leadAdsActivity = (LeadAdsActivity) this.A01;
                SpinnerImageView spinnerImageView = leadAdsActivity.A01;
                if (spinnerImageView != null) {
                    DbS.A1T(spinnerImageView);
                    String str5 = leadAdsActivity.A02;
                    if (str5 != null) {
                        LeadAdsActivity.A00(AnonymousClass7TE.A0l(leadAdsActivity.A0A), leadAdsActivity, str5, this.A03, this.A02, true);
                        i = -1370216540;
                        break;
                    } else {
                        str = "formId";
                    }
                } else {
                    str = "spinnerImageView";
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            case 6:
                String str6 = this.A02;
                String str7 = this.A03;
                ReelDashboardFragment reelDashboardFragment = ((C14625TzX) this.A01).A0B;
                FragmentActivity activity2 = reelDashboardFragment.getActivity();
                if (activity2 != null) {
                    C49957FGp.A05(activity2, reelDashboardFragment.A06, str6, str7);
                    return;
                }
                return;
            case 7:
                i2 = AnonymousClass0fD.A05(-996858730);
                String str8 = this.A03;
                String str9 = this.A02;
                C358248ab A0Y = DbS.A0Y(((LP7) this.A01).A0A);
                A0Y.A05 = str8;
                A0Y.A0q(str9);
                Dba.A1M(A0Y);
                Dba.A1L(A0Y);
                i = -753664981;
                break;
            case 8:
                int A05 = AnonymousClass0fD.A05(1694445942);
                C52029GCb gCb = (C52029GCb) this.A01;
                UserSession userSession = gCb.A0C;
                String str10 = this.A03;
                if (str10 != null) {
                    gCb.A0V.A01(C49190Eqv.A00(userSession, str10), this.A02);
                    AnonymousClass0fD.A0C(892760457, A05);
                    return;
                }
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A0C(-644282171, A05);
                throw A0y;
            default:
                return;
        }
        AnonymousClass0fD.A0C(i, i2);
    }
}
