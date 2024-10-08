package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.AbstractMap;

/* renamed from: X.Fhx  reason: case insensitive filesystem */
public final class C50758Fhx implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        String str;
        FUM fum = new FUM();
        AbstractMap A1E = AnonymousClass7TE.A1E();
        A1E.put("referer", "settings_ad_options");
        UserSession userSession = this.A01;
        if (182.A06(0Tu.A05, userSession, 36311474586583578L)) {
            A1E = FHB.A01();
            str = AnonymousClass000.A00(138);
        } else {
            str = "com.instagram.sensitive_topics.sensitive_topics.ad_topic_preferences_view";
        }
        FragmentActivity fragmentActivity = this.A00;
        0hq A0F = DbT.A0F(fragmentActivity);
        A0F.A0s(new FQk(1, A0F, this));
        C229382nI A0N = DbT.A0N(fragmentActivity, fum, userSession);
        C360678ey A05 = C359988do.A05(userSession, str, A1E);
        E84.A00(A05, A0N, 14);
        1ES.A03(A05);
    }

    public C50758Fhx(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
