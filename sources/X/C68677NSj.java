package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.Execution;

/* renamed from: X.NSj  reason: case insensitive filesystem */
public final class C68677NSj extends 0vM {
    public final /* synthetic */ Mailbox A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68677NSj(Mailbox mailbox) {
        super("ResumeTaskProcessingInCriticalPath", 1912568424, 5, false, false);
        this.A00 = mailbox;
    }

    public final void loggedRun() {
        Mailbox mailbox = this.A00;
        Execution.executeAsync(new NBM(mailbox), mailbox.getAccountSession(), 1);
    }
}
