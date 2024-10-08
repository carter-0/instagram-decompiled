package X;

import com.facebook.msys.mca.Mailbox;

public final class NBM extends AnonymousClass45Y {
    public final /* synthetic */ Mailbox A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NBM(Mailbox mailbox) {
        super("scheduleTaskProcessingIfNeeded");
        this.A00 = mailbox;
    }

    public final void run() {
        this.A00.scheduleTaskProcessingIfNeededNative();
    }
}
