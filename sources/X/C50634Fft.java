package X;

import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fft  reason: case insensitive filesystem */
public final class C50634Fft implements G6A {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ boolean A02;

    public C50634Fft(FragmentActivity fragmentActivity, UserSession userSession, boolean z) {
        this.A02 = z;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final void onFinished() {
        boolean z = this.A02;
        UserSession userSession = this.A01;
        FragmentActivity fragmentActivity = this.A00;
        0xG r3 = C49853F9s.A00;
        if (z) {
            C46413Dea.A07(fragmentActivity, (Uri) null, r3, userSession, DbS.A01(), false, false, false, true);
        } else {
            C46413Dea.A08(fragmentActivity, r3, userSession);
        }
    }
}
