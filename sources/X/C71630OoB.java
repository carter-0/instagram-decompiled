package X;

import com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.OoB  reason: case insensitive filesystem */
public final class C71630OoB implements MailboxCallback {
    public final /* synthetic */ AnonymousClass632 A00;
    public final /* synthetic */ MailboxFutureImpl A01;

    public C71630OoB(AnonymousClass632 r1, MailboxFutureImpl mailboxFutureImpl) {
        this.A00 = r1;
        this.A01 = mailboxFutureImpl;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = C66580MXl.A0u(AnonymousClass632.A00, 14);
        NotificationScope A012 = C71734Opu.A01(C66580MXl.A0H(accountSession), this, A0u, 1);
        this.A01.setNotification(A0u, A012);
        MailboxAdvancedCryptoTransportJNI.dispatchVOO(2, accountSession, A012);
    }
}
