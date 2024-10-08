package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fae  reason: case insensitive filesystem */
public final class C50379Fae implements C51867G5e {
    public final UserSession A00;
    public final EV0 A01;

    public final void Cos(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        EV0 ev0 = this.A01;
        if (ev0 == null) {
            UserSession userSession = this.A00;
            if (AnonymousClass5IJ.A02(userSession) && AnonymousClass5IJ.A01(userSession)) {
                return;
            }
            if (AnonymousClass5IJ.A02(userSession)) {
                ev0 = EV0.Social;
            } else {
                ev0 = EV0.Broadcast;
            }
        }
        bundle.putString("InterestBasedChannelType", ev0.name());
    }

    public C50379Fae(UserSession userSession, EV0 ev0) {
        this.A00 = userSession;
        this.A01 = ev0;
    }
}
