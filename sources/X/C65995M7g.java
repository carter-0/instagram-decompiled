package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.M7g  reason: case insensitive filesystem */
public final class C65995M7g implements Runnable {
    public final /* synthetic */ AnonymousClass5Gv A00;
    public final /* synthetic */ C61624KFa A01;

    public C65995M7g(AnonymousClass5Gv r1, C61624KFa kFa) {
        this.A01 = kFa;
        this.A00 = r1;
    }

    public final void run() {
        C61624KFa kFa = this.A01;
        Activity activity = kFa.A00;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            AnonymousClass5Gv r1 = this.A00;
            UserSession userSession = kFa.A01;
            r1.A07(userSession);
            27p.A01(userSession).A1M(C59725JVj.WASLIVE_SHARE_SHEET, AnonymousClass7TE.A0v(), "ig_video_sharing_settings");
        }
    }
}
