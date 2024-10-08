package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.6Ah  reason: invalid class name and case insensitive filesystem */
public final class C303666Ah implements MailboxCallback {
    public final /* synthetic */ Runnable A00;

    public C303666Ah(Runnable runnable) {
        this.A00 = runnable;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        this.A00.run();
    }
}
