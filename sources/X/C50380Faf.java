package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Faf  reason: case insensitive filesystem */
public final class C50380Faf implements C51867G5e {
    public final UserSession A00;
    public final boolean A01;

    public final void Cos(Bundle bundle) {
        int i;
        0qQ.A0B(bundle, 0);
        if (this.A01) {
            i = 5;
        } else {
            UserSession userSession = this.A00;
            if ((!C375489Dt.A01(userSession) || AnonymousClass7K4.A00(userSession)) && C375469Dr.A00(userSession)) {
                i = 2;
            } else {
                bundle.putInt("interest_based_channel_implicit_audience_type", 0);
                return;
            }
        }
        bundle.putInt("interest_based_channel_implicit_audience_type", i);
    }

    public C50380Faf(UserSession userSession, boolean z) {
        this.A00 = userSession;
        this.A01 = z;
    }
}
