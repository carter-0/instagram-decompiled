package X;

import com.facebook.msys.mca.Mailbox;

/* renamed from: X.5k3  reason: invalid class name and case insensitive filesystem */
public final class C293095k3 extends AnonymousClass45Y {
    public final /* synthetic */ Mailbox A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C293095k3(Mailbox mailbox) {
        super("startAllSyncDelayedSyncGroups");
        this.A00 = mailbox;
    }

    public final void run() {
        this.A00.startAllDelayedSyncGroupsNative();
    }
}
