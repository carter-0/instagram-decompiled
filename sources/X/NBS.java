package X;

import com.facebook.msys.mca.Mailbox;

public final class NBS extends AnonymousClass45Y {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass68H A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NBS(AnonymousClass68H r2, int i) {
        super("cleanUp-mailbox");
        this.A01 = r2;
        this.A00 = i;
    }

    public final void run() {
        AnonymousClass685 logoutAndDelete;
        Mailbox mailbox = this.A01.A02;
        if (mailbox != null) {
            int i = this.A00;
            if (i == 0) {
                logoutAndDelete = mailbox.logoutAndDelete();
            } else if (i == 1) {
                logoutAndDelete = mailbox.logoutAndEncrypt();
            } else if (i == 2) {
                logoutAndDelete = mailbox.shutdown();
            } else if (i == 3) {
                logoutAndDelete = mailbox.shutdownAndDelete();
            } else if (i == 4) {
                logoutAndDelete = mailbox.shutdownAndEncrypt();
            } else {
                throw AnonymousClass7TE.A1B("The requested Mailbox shutdown operation is not currently supported");
            }
            logoutAndDelete.Eiu(C71722Opg.A00(this, 24));
        }
    }
}
