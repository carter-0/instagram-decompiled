package X;

import android.content.Context;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.ArrayList;

/* renamed from: X.3Gw  reason: invalid class name and case insensitive filesystem */
public final class C239543Gw implements C61110lV {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ PendingMediaStore A01;

    public C239543Gw(Context context, PendingMediaStore pendingMediaStore) {
        this.A01 = pendingMediaStore;
        this.A00 = context;
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(-1175427390);
        PendingMediaStore pendingMediaStore = this.A01;
        Context context = this.A00;
        PendingMediaStore.A01(context, pendingMediaStore);
        0nY.A00().ATE(new RA1(new SFU(context, pendingMediaStore.A05, new ArrayList(pendingMediaStore.A06.values()))));
        AnonymousClass0fD.A0A(-1453176678, A03);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(-1464343996, AnonymousClass0fD.A03(465250655));
    }
}
