package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;

/* renamed from: X.62l  reason: invalid class name and case insensitive filesystem */
public final class C3022962l implements MailboxCallback {
    public final /* synthetic */ AnonymousClass67Z A00;
    public final /* synthetic */ AnonymousClass61J A01;

    public C3022962l(AnonymousClass67Z r1, AnonymousClass61J r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        C3023862z r1;
        MailboxNullable mailboxNullable = (MailboxNullable) obj;
        if (!(mailboxNullable == null || (r1 = (C3023862z) mailboxNullable.value) == null)) {
            this.A01.A03(r1);
        }
        AnonymousClass67Z r0 = this.A00;
        r0.A02(mailboxNullable);
        r0.A00();
    }
}
