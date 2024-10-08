package X;

import com.facebook.msys.mci.NetworkSession;

/* renamed from: X.6AL  reason: invalid class name */
public final class AnonymousClass6AL extends AnonymousClass45Y {
    public final /* synthetic */ AnonymousClass6AJ A00;
    public final /* synthetic */ boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6AL(AnonymousClass6AJ r2, boolean z) {
        super("setNetWorkState");
        this.A01 = z;
        this.A00 = r2;
    }

    public final void run() {
        boolean z = this.A01;
        NetworkSession networkSession = this.A00.A00;
        if (z) {
            networkSession.setNetworkStateConnected();
        } else {
            networkSession.setNetworkStateDisconnected();
        }
    }
}
