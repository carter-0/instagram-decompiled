package X;

import com.facebook.msys.mca.Mailbox;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6E6  reason: invalid class name */
public final class AnonymousClass6E6 implements AnonymousClass66d {
    public final /* synthetic */ Mailbox A00;

    public AnonymousClass6E6(Mailbox mailbox) {
        this.A00 = mailbox;
    }

    public final void onNewNotification(String str, AnonymousClass2Lq r5, Map map) {
        Set emptySet;
        Object obj;
        if (map != null) {
            Mailbox mailbox = Mailbox.$redex_init_class;
            if (!map.containsKey("MCINotificationKeyChangedStoredProcedures") || (obj = map.get("MCINotificationKeyChangedStoredProcedures")) == null) {
                emptySet = Collections.emptySet();
            } else {
                emptySet = (Set) obj;
            }
            for (1xN Dne : this.A00.mStoredProcedureChangedListeners) {
                Dne.Dne(emptySet);
            }
        }
    }
}
