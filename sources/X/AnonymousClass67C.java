package X;

import com.facebook.msys.mca.Mailbox;

/* renamed from: X.67C  reason: invalid class name */
public final class AnonymousClass67C extends AnonymousClass45Y {
    public final /* synthetic */ Mailbox A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass67C(Mailbox mailbox) {
        super("setMailboxStateActive");
        this.A00 = mailbox;
    }

    public final void run() {
        0fh.A01("Mailbox.setStateActive.run", -1346576094);
        try {
            this.A00.setStateNative(1);
        } finally {
            0fh.A00(-1490602993);
        }
    }
}
