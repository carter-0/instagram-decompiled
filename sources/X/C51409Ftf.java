package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ftf  reason: case insensitive filesystem */
public final class C51409Ftf implements Runnable {
    public final /* synthetic */ FF7 A00;
    public final /* synthetic */ boolean A01;

    public C51409Ftf(FF7 ff7, boolean z) {
        this.A00 = ff7;
        this.A01 = z;
    }

    public final void run() {
        FF7 ff7 = this.A00;
        C48142EZk eZk = C48142EZk.SMS;
        boolean z = this.A01;
        UserSession userSession = ff7.A04;
        C48145EZn eZn = C48145EZn.SETTINGS_AND_PRIVACY;
        C49947FGb.A03(eZn, eZk, userSession, z);
        F8M.A01(ff7.A02, eZn, eZk, userSession, AnonymousClass05K.A0u, (String) null);
    }
}
