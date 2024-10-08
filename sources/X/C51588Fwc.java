package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.DirectInviteContactViewModel;
import java.util.List;

/* renamed from: X.Fwc  reason: case insensitive filesystem */
public final class C51588Fwc implements AnonymousClass0eL, 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C51588Fwc(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                DbS.A1U(this.A02);
                return null;
            case 1:
                List list = ((AnonymousClass6Tm) obj2).A00;
                ((0sL) this.A02).invoke(list.get(0), list.get(1));
                return null;
            case 2:
                E5H.A09((E5H) this.A01, (C370538wd) this.A02);
                break;
            case 3:
                E5H.A09((E5H) this.A01, (C370538wd) this.A02);
                0KC.A0C(E5H.__redex_internal_original_name, "Sending of channel invites flow api has failed");
                break;
            default:
                EEP eep = (EEP) this.A01;
                DirectInviteContactViewModel directInviteContactViewModel = (DirectInviteContactViewModel) obj2;
                UserSession userSession = eep.A0g;
                boolean A012 = C267044ar.A01((Context) this.A02, userSession);
                C48145EZn eZn = C48145EZn.DIRECT_MESSAGE_OMNIPICKER;
                if (A012) {
                    C48142EZk eZk = C48142EZk.CONTACT_SMS;
                    C49947FGb.A03(eZn, eZk, userSession, A012);
                    Integer num = AnonymousClass05K.A0E;
                    EEP.A09(eep, directInviteContactViewModel, num, 43, directInviteContactViewModel.A00, directInviteContactViewModel.A03, true);
                    eep.A0o.A0B(AnonymousClass05K.A1F, num);
                    F8M.A01(eep.A0m, eZn, eZk, userSession, AnonymousClass05K.A0u, directInviteContactViewModel.A06);
                    return null;
                }
                C49947FGb.A06(eZn, userSession, A012);
                C49947FGb.A03(eZn, C48142EZk.SYSTEM_SHARE_SHEET, userSession, A012);
                Integer num2 = AnonymousClass05K.A0E;
                EEP.A09(eep, directInviteContactViewModel, num2, 6, directInviteContactViewModel.A00, directInviteContactViewModel.A03, true);
                eep.A0o.A0B(AnonymousClass05K.A1F, num2);
                EWV ewv = EWV.A0J;
                Fragment fragment = eep.A0m;
                C46395DeI.A0S(fragment, eZn, fragment, userSession, ewv, new C51153FpP());
                return null;
        }
        return C60340gF.A00;
    }
}
