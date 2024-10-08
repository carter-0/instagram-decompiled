package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.Oo8  reason: case insensitive filesystem */
public final /* synthetic */ class C71627Oo8 implements MailboxCallback {
    public final /* synthetic */ Runnable A00;

    public /* synthetic */ C71627Oo8(Runnable runnable) {
        this.A00 = runnable;
    }

    public final void onCompletion(Object obj) {
        Runnable runnable = this.A00;
        1aD.A06.accept(1aE.A04);
        runnable.run();
    }
}
