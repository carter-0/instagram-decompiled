package X;

import com.facebook.msys.mcs.SyncHandler;

/* renamed from: X.5nE  reason: invalid class name and case insensitive filesystem */
public final class C294905nE extends AnonymousClass45Y {
    public final /* synthetic */ SyncHandler A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C294905nE(SyncHandler syncHandler) {
        super("notifyEnterAppForeground");
        this.A00 = syncHandler;
    }

    public final void run() {
        this.A00.notifyAppEnterForeground();
    }
}
