package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.7VA  reason: invalid class name */
public final class AnonymousClass7VA implements AnonymousClass7VB {
    public final AnonymousClass7VC A00 = new AnonymousClass7VC();
    public final C62320sa A01;

    public AnonymousClass7VA(C62320sa r2) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
    }

    public final void Cm9(DirectMessageIdentifier directMessageIdentifier) {
        AnonymousClass7VC r2 = this.A00;
        synchronized (r2) {
            r2.A00.remove(AnonymousClass7VC.A00(r2, directMessageIdentifier));
        }
        ((C333517Zg) this.A01.invoke()).C62().CmB(directMessageIdentifier);
    }

    public final void CmA(DirectMessageIdentifier directMessageIdentifier) {
        AnonymousClass7VC r1 = this.A00;
        synchronized (r1) {
            AnonymousClass7VC.A00(r1, directMessageIdentifier);
        }
    }
}
