package X;

import com.instagram.realtimeclient.RealtimeClientManager;

/* renamed from: X.Al2  reason: case insensitive filesystem */
public final class C40894Al2 implements Runnable {
    public final /* synthetic */ RealtimeClientManager A00;

    public C40894Al2(RealtimeClientManager realtimeClientManager) {
        this.A00 = realtimeClientManager;
    }

    public final void run() {
        this.A00.removeKeepAliveCondition(C66579MXk.A00(100));
    }
}
