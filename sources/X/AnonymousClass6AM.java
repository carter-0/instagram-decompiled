package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.Execution;

/* renamed from: X.6AM  reason: invalid class name */
public final class AnonymousClass6AM extends 0ng {
    public final /* synthetic */ C3031167l A00;
    public final /* synthetic */ C3031767r A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6AM(C3031167l r4, C3031767r r5) {
        super(1912568424, 3, false, false);
        this.A01 = r5;
        this.A00 = r4;
    }

    public final void run() {
        if (0qQ.A0K(this.A01.A00, false)) {
            Mailbox mailbox = this.A00.A01;
            Execution.executeAsync(new C293095k3(mailbox), mailbox.getAccountSession(), 1);
        }
    }
}
