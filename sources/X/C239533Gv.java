package X;

import android.content.Context;
import com.instagram.pendingmedia.store.PendingMediaStore;

/* renamed from: X.3Gv  reason: invalid class name and case insensitive filesystem */
public final class C239533Gv implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ PendingMediaStore A01;

    public C239533Gv(Context context, PendingMediaStore pendingMediaStore) {
        this.A01 = pendingMediaStore;
        this.A00 = context;
    }

    public final void run() {
        0nY.A00().ATE(new AnonymousClass3T5(this.A00, this.A01));
    }
}
