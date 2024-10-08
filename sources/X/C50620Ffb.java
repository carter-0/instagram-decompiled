package X;

import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ffb  reason: case insensitive filesystem */
public final class C50620Ffb implements G64 {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C50620Ffb(UserSession userSession, boolean z, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = userSession;
            this.A02 = z;
        } else {
            this.A02 = z;
            this.A01 = userSession;
        }
    }

    public final void CHr(FragmentActivity fragmentActivity) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (this.A00 != 0) {
            0qQ.A0B(fragmentActivity, 0);
            1WU A002 = AnonymousClass35B.A00();
            UserSession userSession = (UserSession) this.A01;
            FragmentActivity fragmentActivity3 = fragmentActivity;
            A002.A04(fragmentActivity3, userSession, new C50634Fft(fragmentActivity, userSession, this.A02), EXD.A04, false, false);
            return;
        }
        0qQ.A0B(fragmentActivity, 0);
        boolean z = this.A02;
        UserSession userSession2 = (UserSession) this.A01;
        0xG r3 = C49853F9s.A00;
        if (z) {
            C46413Dea.A07(fragmentActivity2, (Uri) null, r3, userSession2, DbS.A01(), true, false, false, true);
        } else {
            C46413Dea.A04(fragmentActivity, (Uri) null, r3, userSession2);
        }
    }
}
