package X;

import com.facebook.msys.mca.Mailbox;

/* renamed from: X.67g  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3030667g implements AnonymousClass67Q {
    public final /* synthetic */ Mailbox A00;

    public /* synthetic */ C3030667g(Mailbox mailbox) {
        this.A00 = mailbox;
    }

    public final void Eyr(AnonymousClass67Z r4) {
        Mailbox mailbox = this.A00;
        MYb mYb = MYb.A0M;
        r4.getClass();
        C67588MqM mqM = new C67588MqM(r4);
        r4.A01(new C3030767h(mqM, mailbox));
        mailbox.addStoredProcedureChangedListener(mqM);
    }
}
