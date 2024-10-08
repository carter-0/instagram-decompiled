package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import java.util.Map;

public final class GU5 implements C46206DQj {
    public final Fragment A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public GU5(Fragment fragment, AnonymousClass0iw r3, UserSession userSession) {
        0qQ.A0B(r3, 3);
        this.A02 = userSession;
        this.A00 = fragment;
        this.A01 = r3;
    }

    public final void DHE(1Xj r11, AnonymousClass3W1 r12) {
        String str;
        C65231bS B8b = r11.A0C.B8b();
        if (B8b != null) {
            str = B8b.getFundraiserId();
        } else {
            str = null;
        }
        UserSession userSession = this.A02;
        LTM.A07(this.A01, userSession, "evergreen_donate_button", "FEED_POST", str, (Map) null);
        C65231bS B8b2 = r11.A0C.B8b();
        if (B8b2 != null) {
            FundraiserCampaignTypeEnum B8e = B8b2.B8e();
            if (B8e == null || B8e.ordinal() != 9) {
                String fundraiserId = B8b2.getFundraiserId();
                String A2n = r11.A2n();
                if (A2n != null) {
                    C240063Jl.A01 = A2n;
                    C240063Jl.A00 = fundraiserId;
                    if (fundraiserId != null) {
                        Fragment fragment = this.A00;
                        FragmentActivity requireActivity = fragment.requireActivity();
                        String Bi3 = r11.Bi3();
                        String A2n2 = r11.A2n();
                        if (A2n2 != null) {
                            LTV.A0A(requireActivity, userSession, fundraiserId, "FEED_POST", Bi3, A2n2, true);
                            Context requireContext = fragment.requireContext();
                            String Bi32 = r11.Bi3();
                            String A2n3 = r11.A2n();
                            if (A2n3 != null) {
                                LTV.A03(requireContext, userSession, fundraiserId, "FEED_POST", Bi32, A2n3);
                                return;
                            }
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            String fundraiserId2 = B8b2.getFundraiserId();
            if (fundraiserId2 != null) {
                Context requireContext2 = this.A00.requireContext();
                String Bi33 = r11.Bi3();
                String A2n4 = r11.A2n();
                if (A2n4 != null) {
                    LTV.A02(requireContext2, userSession, fundraiserId2, Bi33, A2n4);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public final void EBd(View view, 1Xj r8) {
        String fundraiserId;
        C65231bS B8b = r8.A0C.B8b();
        if (B8b != null && (fundraiserId = B8b.getFundraiserId()) != null) {
            Context requireContext = this.A00.requireContext();
            UserSession userSession = this.A02;
            String Bi3 = r8.Bi3();
            String A2n = r8.A2n();
            if (A2n != null) {
                LTV.A04(requireContext, userSession, fundraiserId, "FEED_POST", Bi3, A2n);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
