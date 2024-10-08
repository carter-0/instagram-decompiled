package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fac  reason: case insensitive filesystem */
public final class C50377Fac implements C51867G5e {
    public final UserSession A00;

    public final void Cos(Bundle bundle) {
        EV0 ev0;
        String str;
        0qQ.A0B(bundle, 0);
        UserSession userSession = this.A00;
        if (!AnonymousClass5IJ.A02(userSession) || !AnonymousClass5IJ.A01(userSession)) {
            if (AnonymousClass5IJ.A02(userSession)) {
                ev0 = EV0.Social;
            } else {
                ev0 = EV0.Broadcast;
            }
            if (F5Z.A01(userSession, ev0)) {
                str = "broadcast_chat_setup";
            } else {
                str = "broadcast_chat_nux";
            }
        } else {
            str = "broadcast_chat_chooser";
        }
        bundle.putString("interest_based_channel_entry_point", str);
    }

    public C50377Fac(UserSession userSession) {
        this.A00 = userSession;
    }
}
