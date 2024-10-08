package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "This QP action should already be deprecated.")
/* renamed from: X.Fjl  reason: case insensitive filesystem */
public final class C50867Fjl implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final String A02;

    public final void CI0(Uri uri, Bundle bundle) {
        String str;
        1Zp A012 = 1Zm.A00(this.A01).A01(AnonymousClass05K.A04, AnonymousClass05K.A0M, false);
        A012.A03("action_type", "INTEROP_MAIN_DISCLOSURE_SHEET");
        if (AnonymousClass000.A00(3155).equals(this.A02)) {
            str = "main_disclosure_inbox";
        } else {
            str = "main_disclosure_feed";
        }
        A012.A03("source", str);
        A012.A00();
    }

    public C50867Fjl(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = str;
    }
}
