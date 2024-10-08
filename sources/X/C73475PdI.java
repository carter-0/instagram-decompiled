package X;

import com.instagram.realtimeclient.RealtimeClientManager;

/* renamed from: X.PdI  reason: case insensitive filesystem */
public final /* synthetic */ class C73475PdI implements C62320sa {
    public final /* synthetic */ 1aD A00;

    public /* synthetic */ C73475PdI(1aD r1) {
        this.A00 = r1;
    }

    public final Object invoke() {
        return Boolean.valueOf(RealtimeClientManager.getInstance(this.A00.A03).isMqttConnected());
    }
}
