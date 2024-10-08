package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.6Ag  reason: invalid class name */
public final class AnonymousClass6Ag implements MailboxCallback {
    public final /* synthetic */ Runnable A00;

    public AnonymousClass6Ag(Runnable runnable) {
        this.A00 = runnable;
    }

    public final void onCompletion(Object obj) {
        this.A00.run();
    }
}
