package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.SlimMailbox;

/* renamed from: X.5nG  reason: invalid class name and case insensitive filesystem */
public final class C294925nG implements MailboxCallback {
    public final /* synthetic */ AnonymousClass68K A00;
    public final /* synthetic */ Runnable A01;

    public C294925nG(AnonymousClass68K r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        ((SlimMailbox) obj).mCallbackExecutor.execute(this.A01);
    }
}
