package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;

/* renamed from: X.Fji  reason: case insensitive filesystem */
public final class C50864Fji implements G6H {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("bot_id");
        if (queryParameter != null && queryParameter.length() != 0) {
            UserSession userSession = this.A02;
            if (!C331227Qb.A03(userSession)) {
                C49951FGg.A01(this.A00, userSession, EV9.AI_THREAD, C69503Nml.A0E.toString(), queryParameter, false);
                return;
            }
            AnonymousClass9B9.A00();
            new AiAgentThreadLauncher(userSession).A08(this.A00, this.A01, queryParameter, (String) null, (String) null, (String) null, true);
        }
    }

    public C50864Fji(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = r2;
    }
}
