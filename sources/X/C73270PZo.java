package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.PZo  reason: case insensitive filesystem */
public final class C73270PZo implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C68369NCw A01;

    public C73270PZo(FragmentActivity fragmentActivity, C68369NCw nCw) {
        this.A01 = nCw;
        this.A00 = fragmentActivity;
    }

    public final void run() {
        C68369NCw nCw = this.A01;
        Context context = nCw.A00;
        UserSession userSession = nCw.A01;
        C49951FGg.A02(context, this.A00, DbS.A0O("DevXAgentAppProxy"), userSession, C69287Nin.UNKNOWN, (DirectShareTarget) null);
    }
}
