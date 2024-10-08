package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.MZb  reason: case insensitive filesystem */
public final class C66615MZb implements AnonymousClass66d {
    public final /* synthetic */ UserSession A00;

    public C66615MZb(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void onNewNotification(String str, AnonymousClass2Lq r5, Map map) {
        Object obj;
        AnonymousClass6AQ A002 = AnonymousClass6AP.A00(this.A00);
        if (map != null && (obj = map.get("MEMOfflineHandlingCompletionNotificationMessageCountKey")) != null) {
            int A0A = AnonymousClass7TG.A0A(00y.A0l(obj.toString()));
            A002.A07 = true;
            A002.A02 = A0A;
            C66580MXl.A1O(A002.A0E, true);
        }
    }
}
