package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.IIj  reason: case insensitive filesystem */
public final class C56940IIj implements MailboxCallback {
    public final int A00;
    public final Object A01;

    public C56940IIj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        switch (this.A00) {
            case 0:
                ((2Eq) this.A01).C6I();
                return;
            case 1:
                ((1K2) this.A01).set(obj);
                return;
            default:
                ((AnonymousClass67Z) this.A01).A00();
                return;
        }
    }
}
