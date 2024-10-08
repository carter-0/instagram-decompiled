package X;

import com.facebook.msys.mca.Mailbox;

/* renamed from: X.67h  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3030767h implements C3030867i {
    public final /* synthetic */ 1xN A00;
    public final /* synthetic */ Mailbox A01;

    public /* synthetic */ C3030767h(1xN r1, Mailbox mailbox) {
        this.A01 = mailbox;
        this.A00 = r1;
    }

    public final void cancel() {
        Mailbox mailbox = this.A01;
        1xN r1 = this.A00;
        MYb mYb = MYb.A0M;
        mailbox.mStoredProcedureChangedListeners.remove(r1);
    }
}
