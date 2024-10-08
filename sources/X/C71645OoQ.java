package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.tam.mca.MailboxTamJNI;

/* renamed from: X.OoQ  reason: case insensitive filesystem */
public final class C71645OoQ implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ C68314NAb A01;
    public final /* synthetic */ byte[] A02;

    public C71645OoQ(MailboxFutureImpl mailboxFutureImpl, C68314NAb nAb, byte[] bArr) {
        this.A01 = nAb;
        this.A02 = bArr;
        this.A00 = mailboxFutureImpl;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        this.A00.setResult(MailboxTamJNI.dispatchOOO(7, obj, this.A02));
    }
}
