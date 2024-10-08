package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.Oo7  reason: case insensitive filesystem */
public final class C71626Oo7 implements MailboxCallback {
    public final AnonymousClass67Z A00;

    public C71626Oo7(AnonymousClass67Z r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final void onCompletion(Object obj) {
        AnonymousClass67Z r0 = this.A00;
        r0.A02(obj);
        r0.A00();
    }
}
