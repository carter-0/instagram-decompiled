package X;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.settings.common.PaymentOptionsFragment;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

public final class RBY extends C2806552w {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RBY(R8N r8n, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = r8n;
    }

    public final void onClick(View view) {
        Fragment paymentOptionsFragment;
        switch (this.A00) {
            case 0:
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putString("page", "settings");
                R8X r8x = (R8X) this.A01;
                AnonymousClass0eM r4 = r8x.A06;
                if (182.A06(0Tu.A05, DbT.A0X(r4), 36310362190250018L)) {
                    paymentOptionsFragment = SAY.A00(A0a);
                } else {
                    paymentOptionsFragment = new PaymentOptionsFragment();
                    paymentOptionsFragment.setArguments(A0a);
                }
                C309516Yo A0Q = DbU.A0Q(r8x.requireActivity(), DbT.A0X(r4));
                0qQ.A0A(paymentOptionsFragment);
                A0Q.A0D(paymentOptionsFragment);
                A0Q.A04();
                return;
            case 1:
                0kR.A0F(((Fragment) this.A01).requireActivity(), 0cp.A03("https://m.facebook.com/payments_terms"));
                return;
            case 2:
                S3Q A002 = R8N.A00((R8N) this.A01);
                if (AnonymousClass1Yj.A00 == null) {
                    0qQ.A0F("newInstance");
                    throw AnonymousClass00P.createAndThrow();
                }
                boolean z = A002.A08;
                boolean z2 = A002.A09;
                AnonymousClass4DH r2 = new AnonymousClass4DH();
                Bundle A0a2 = AnonymousClass7TE.A0a();
                A0a2.putBoolean("is_payment_enabled", z);
                A0a2.putBoolean("is_reconsent_enabled", z2);
                r2.setArguments(A0a2);
                C309516Yo A0Q2 = DbU.A0Q(A002.A01, A002.A02);
                A0Q2.A0D(r2);
                A0Q2.A04();
                return;
            case 3:
                Uri A03 = 0cp.A03("https://help.instagram.com/1335687273948910");
                R8N r8n = (R8N) this.A01;
                0kR.A0F(r8n.requireContext(), A03);
                C11242SHc.A00((C11242SHc) r8n.A0B.getValue(), "settings_data_policy_clicked", (String) null);
                return;
            case 4:
                Uri A032 = 0cp.A03("https://help.instagram.com/563153788532689");
                R8N r8n2 = (R8N) this.A01;
                0kR.A0F(r8n2.requireContext(), A032);
                if (r8n2.A06) {
                    S3Q A003 = R8N.A00(r8n2);
                    String str = r8n2.A00;
                    0qQ.A0B(str, 0);
                    A003.A03.A01(str, "warning_learn_more_clicked");
                    return;
                }
                return;
            default:
                R8T r8t = (R8T) this.A01;
                FragmentActivity fragmentActivity = r8t.A06;
                0qQ.A0A(fragmentActivity);
                UserSession userSession = r8t.A08;
                0qQ.A0A(userSession);
                boolean A1U = AnonymousClass7TF.A1U(0, fragmentActivity, userSession);
                String A012 = SQU.A01(fragmentActivity, "https://help.instagram.com/271237319690904/");
                0qQ.A07(A012);
                SimpleWebViewActivity.A02.A02(fragmentActivity, userSession, new SimpleWebViewConfig(A012, (String) null, fragmentActivity.getString(2131963313), (String) null, false, false, false, false, false, A1U, false, A1U, false, false, false, false));
                T6A t6a = r8t.A0A;
                0qQ.A0A(t6a);
                t6a.A00(RDG.A01, RDI.A02, r8t.A0C);
                if (r8t.A0G) {
                    UserSession userSession2 = r8t.A08;
                    if (userSession2 != null) {
                        String str2 = r8t.A0B;
                        String str3 = r8t.A0D;
                        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r8t, userSession2), "av_see_approved_documents");
                        if (A0e.isSampled()) {
                            if (str2 == null) {
                                str2 = "";
                            }
                            STD.A01(A0e, str2, "av_idv", "select_alt_ids", str3);
                            Pxi.A1C(A0e, "id_verification");
                            return;
                        }
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RBY(R8T r8t, int i) {
        super(Integer.valueOf(i));
        this.A00 = 5;
        this.A01 = r8t;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RBY(R8X r8x, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = r8x;
    }
}
