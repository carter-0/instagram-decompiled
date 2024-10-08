package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.tam.mca.MailboxTamJNI;

/* renamed from: X.OoG  reason: case insensitive filesystem */
public final class C71635OoG implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ C68314NAb A01;

    public C71635OoG(MailboxFutureImpl mailboxFutureImpl, C68314NAb nAb) {
        this.A01 = nAb;
        this.A00 = mailboxFutureImpl;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        this.A00.setResult(MailboxTamJNI.dispatchOO(9, obj));
    }
}
