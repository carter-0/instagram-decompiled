package X;

import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.facebook.tam.mca.MailboxTamJNI;

/* renamed from: X.Ool  reason: case insensitive filesystem */
public final class C71666Ool implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public C71666Ool(Object obj, Object obj2, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
        this.A04 = str2;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        if (this.A00 != 0) {
            ((MailboxObservableImpl) this.A02).setResult(MailboxTamJNI.dispatchOOOO(10, obj, this.A03, this.A04));
            return;
        }
        AccountSession accountSession = (AccountSession) obj;
        String A0u = C66580MXl.A0u(NAY.A00, 45);
        NotificationScope A002 = C71733Opt.A00(C66580MXl.A0H(accountSession), this, A0u, 21);
        C66580MXl.A1N(A002, this.A02, A0u);
        MailboxInstagramMemJNI.dispatchVOOOO(11, accountSession, this.A03, this.A04, A002);
    }
}
