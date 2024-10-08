package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

public final /* synthetic */ class M2C implements Runnable {
    public final /* synthetic */ LE9 A00;

    public /* synthetic */ M2C(LE9 le9) {
        this.A00 = le9;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.7rx] */
    public final void run() {
        LE9 le9 = this.A00;
        Context context = le9.A02;
        UserSession userSession = le9.A05;
        le9.A00 = C39823AAu.A01(context, new Object(), new C343897qz(), userSession, "instagram_feed_post_capture_blur_icon", AnonymousClass000.A00(991), (LinkedHashMap) null, AnonymousClass7TF.A1U(0, context, userSession), false);
    }
}
