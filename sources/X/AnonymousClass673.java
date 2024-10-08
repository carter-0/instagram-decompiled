package X;

import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.673  reason: invalid class name */
public final class AnonymousClass673 implements MailboxCallback {
    public final /* synthetic */ AnonymousClass66t A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ Number A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ Number A08;
    public final /* synthetic */ String A09;

    public AnonymousClass673(AnonymousClass66t r1, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, Number number3, Number number4, Number number5, Number number6, Number number7, String str) {
        this.A00 = r1;
        this.A01 = mailboxFutureImpl;
        this.A05 = number;
        this.A04 = number2;
        this.A03 = number3;
        this.A02 = number4;
        this.A06 = number5;
        this.A08 = number6;
        this.A07 = number7;
        this.A09 = str;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String str = (String) AnonymousClass66t.A00.A00(47);
        NotificationScope EBU = accountSession.getSessionedNotificationCenterCallbackManager().EBU(new AnonymousClass674(this, str), str, 1);
        this.A01.setNotification(str, EBU);
        MailboxCoreJNI.dispatchVOOOOOOOOOOO(3, accountSession, this.A05, this.A04, this.A03, this.A02, this.A06, this.A08, this.A07, this.A09, (Object) null, EBU);
    }
}
