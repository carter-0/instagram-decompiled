package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class MYF implements AnonymousClass0lh {
    public final Context A00;
    public final UserSession A01;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r0 = (r1 = (android.app.NotificationManager) r1).getNotificationChannel("ig_direct_video_chat");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(android.content.Context r3) {
        /*
            r2 = 1
            java.lang.String r0 = "notification"
            java.lang.Object r1 = r3.getSystemService(r0)
            boolean r0 = r1 instanceof android.app.NotificationManager
            if (r0 == 0) goto L_0x001e
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            if (r1 == 0) goto L_0x001e
            java.lang.String r0 = "ig_direct_video_chat"
            android.app.NotificationChannel r0 = r1.getNotificationChannel(r0)
            if (r0 == 0) goto L_0x001e
            int r0 = r0.getImportance()
            if (r0 != 0) goto L_0x001e
            r2 = 0
        L_0x001e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MYF.A00(android.content.Context):boolean");
    }

    public final void onSessionWillEnd() {
        if (1X9.A00 != null) {
            AnonymousClass38W.A00().A06.remove(this);
        }
        this.A01.A03(MYF.class);
    }

    public MYF(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
