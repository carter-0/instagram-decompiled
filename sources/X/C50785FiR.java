package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.FiR  reason: case insensitive filesystem */
public final class C50785FiR implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("event_source", "quick_promotion");
        C46649DiU A04 = C46649DiU.A04(AnonymousClass000.A00(2888), A1E);
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        DbS.A18(fragmentActivity, A0N, 2131952419);
        A0N.A0l = true;
        A04.A0D(fragmentActivity, A0N);
    }

    public C50785FiR(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
