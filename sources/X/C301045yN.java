package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.SlimMailbox;

/* renamed from: X.5yN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C301045yN implements MailboxCallback {
    public final /* synthetic */ Runnable A00;

    public /* synthetic */ C301045yN(Runnable runnable) {
        this.A00 = runnable;
    }

    public final void onCompletion(Object obj) {
        ((SlimMailbox) obj).mCallbackExecutor.execute(this.A00);
    }
}
