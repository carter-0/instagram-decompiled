package X;

import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.realtimeclient.RealtimeClientManager$Observer;

/* renamed from: X.NRc  reason: case insensitive filesystem */
public final class C68646NRc extends 0ng {
    public final /* synthetic */ C69241Nhv A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68646NRc(C69241Nhv nhv) {
        super(1978777196, 3, false, false);
        this.A00 = nhv;
    }

    public final void run() {
        C69241Nhv nhv = this.A00;
        RealtimeClientManager$Observer realtimeClientManager$Observer = nhv.A04;
        if (realtimeClientManager$Observer != null) {
            RealtimeClientManager.getInstance(nhv.A03).removeObserver(realtimeClientManager$Observer);
        }
        nhv.A04 = null;
        1a8 r0 = nhv.A01;
        if (r0 != null) {
            r0.A00.dispose();
        }
        nhv.A01 = null;
        1a8 r02 = nhv.A02;
        if (r02 != null) {
            r02.A00.dispose();
        }
        nhv.A02 = null;
        1wn r2 = nhv.A00;
        if (r2 != null) {
            AnonymousClass1Nd.A00(nhv.A03).A02(r2, C66729Mba.class);
        }
        nhv.A00 = null;
    }
}
