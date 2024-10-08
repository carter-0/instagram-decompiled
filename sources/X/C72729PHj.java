package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.friendmap.view.fragment.FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;

/* renamed from: X.PHj  reason: case insensitive filesystem */
public final class C72729PHj implements MVB {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C72729PHj(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void onButtonClick(View view) {
        switch (this.A00) {
            case 0:
                FragmentActivity A06 = 2MD.A01().A06();
                if (A06 != null) {
                    FH6.A04(A06, (UserSession) this.A02, (User) this.A01, "SEND_ERROR_NOT_REACHABLE_NOTIFICATION", "SendErrorNotifier");
                    return;
                }
                return;
            case 1:
                Bundle A0a = AnonymousClass7TE.A0a();
                Dbb.A0i((Activity) this.A01, A0a, (0lg) this.A02, ModalActivity.class, "business_settings");
                return;
            case 2:
                AnonymousClass1Nd.A00((0lg) this.A02).A00(new 2Kc((2EM) this.A01, false, false, false));
                return;
            case 3:
                UserSession userSession = (UserSession) this.A02;
                new C71024OZb(userSession);
                C71024OZb.A00((Activity) this.A01, userSession);
                return;
            case 4:
                OVO ovo = (OVO) this.A02;
                UserSession userSession2 = ovo.A04;
                AnonymousClass0iw r3 = ovo.A03;
                C66709MbG mbG = (C66709MbG) this.A01;
                DirectThreadKey directThreadKey = (DirectThreadKey) mbG.A03;
                0qQ.A0B(directThreadKey, 2);
                OQ6.A00(r3, userSession2, directThreadKey, "set_reminder_success_toast_edit_tap");
                ovo.A01(directThreadKey, (Integer) mbG.A02);
                return;
            case 5:
                C68462NJa nJa = (C68462NJa) this.A02;
                C254783t2 r32 = ((PH0) this.A01).A03;
                1pE A012 = 1pE.A01(nJa.requireActivity(), nJa, AnonymousClass7TE.A0l(nJa.A0o), "friend_map_reply");
                A012.A0B = r32;
                A012.A06();
                return;
            default:
                C74352PtS ptS = ((FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig) ((NKO) this.A02).A09.getValue()).A00;
                if (ptS != null) {
                    ptS.Cfe(((C72698PGc) this.A01).A03);
                    return;
                }
                return;
        }
    }

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }
}
