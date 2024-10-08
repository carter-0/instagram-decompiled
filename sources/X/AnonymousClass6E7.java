package X;

import com.facebook.msys.mca.Mailbox;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6E7  reason: invalid class name */
public final class AnonymousClass6E7 implements AnonymousClass66d {
    public final /* synthetic */ Mailbox A00;

    public AnonymousClass6E7(Mailbox mailbox) {
        this.A00 = mailbox;
    }

    public final void onNewNotification(String str, AnonymousClass2Lq r4, Map map) {
        if (map != null) {
            Mailbox mailbox = Mailbox.$redex_init_class;
            if (map.containsKey("MCINotificationKeyChangedStoredProcedures")) {
                map.get("MCINotificationKeyChangedStoredProcedures");
            }
            Iterator it = this.A00.mStoredProcedureChangedListeners.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
