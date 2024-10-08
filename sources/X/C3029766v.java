package X;

import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.66v  reason: invalid class name and case insensitive filesystem */
public final class C3029766v implements MailboxCallback {
    public final /* synthetic */ AnonymousClass66t A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ Number A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ Number A08;
    public final /* synthetic */ Number A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;

    public C3029766v(AnonymousClass66t r1, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, Number number3, Number number4, Number number5, Number number6, Number number7, Number number8, String str, String str2) {
        this.A00 = r1;
        this.A01 = mailboxFutureImpl;
        this.A05 = number;
        this.A04 = number2;
        this.A03 = number3;
        this.A02 = number4;
        this.A06 = number5;
        this.A08 = number6;
        this.A07 = number7;
        this.A0B = str;
        this.A0A = str2;
        this.A09 = number8;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String str = (String) AnonymousClass66t.A00.A00(49);
        NotificationScope EBU = accountSession.getSessionedNotificationCenterCallbackManager().EBU(new AnonymousClass672(this, str), str, 1);
        this.A01.setNotification(str, EBU);
        MailboxCoreJNI.dispatchVOOOOOOOOOOOOO(0, accountSession, this.A05, this.A04, this.A03, this.A02, this.A06, this.A08, this.A07, this.A0B, (Object) null, EBU, this.A0A, this.A09);
    }
}
