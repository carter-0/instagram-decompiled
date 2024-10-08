package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.Ooa  reason: case insensitive filesystem */
public final class C71655Ooa implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass67Z A01;
    public final /* synthetic */ AnonymousClass61J A02;
    public final /* synthetic */ boolean A03;

    public C71655Ooa(AnonymousClass67Z r1, AnonymousClass61J r2, int i, boolean z) {
        this.A02 = r2;
        this.A00 = i;
        this.A03 = z;
        this.A01 = r1;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        if (DbX.A1a(obj)) {
            this.A02.A01.A00(this.A00, this.A03);
        }
        AnonymousClass67Z r0 = this.A01;
        r0.A02(obj);
        r0.A00();
    }
}
