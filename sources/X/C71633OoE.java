package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.SlimMailbox;

/* renamed from: X.OoE  reason: case insensitive filesystem */
public final class C71633OoE implements MailboxCallback {
    public final /* synthetic */ AnonymousClass68M A00;
    public final /* synthetic */ Runnable A01;

    public C71633OoE(AnonymousClass68M r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        ((SlimMailbox) obj).mCallbackExecutor.execute(this.A01);
    }
}
