package X;

import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;
import java.util.List;

/* renamed from: X.3S8  reason: invalid class name */
public final class AnonymousClass3S8 implements Runnable {
    public final /* synthetic */ PendingMediaStore A00;
    public final /* synthetic */ PendingMediaStoreSerializer A01;

    public AnonymousClass3S8(PendingMediaStore pendingMediaStore, PendingMediaStoreSerializer pendingMediaStoreSerializer) {
        this.A01 = pendingMediaStoreSerializer;
        this.A00 = pendingMediaStore;
    }

    public final void run() {
        0KC.A0C("PendingMediaStoreSerializer", "wait for deserialization lock");
        PendingMediaStoreSerializer pendingMediaStoreSerializer = this.A01;
        Object obj = pendingMediaStoreSerializer.A05;
        PendingMediaStore pendingMediaStore = this.A00;
        synchronized (obj) {
            synchronized (pendingMediaStore) {
                pendingMediaStore.A01 = true;
            }
            0KC.A0C("PendingMediaStoreSerializer", "calling callbacks");
            List<Runnable> list = pendingMediaStoreSerializer.A08;
            for (Runnable run : list) {
                run.run();
            }
            list.clear();
        }
    }
}
