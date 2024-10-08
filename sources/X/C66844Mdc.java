package X;

import com.facebook.instagramreverb.mca.MailboxInstagramReverbJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.instagram.direct.msys.reverb.InstamadilloLoggingContext;
import java.util.List;

/* renamed from: X.Mdc  reason: case insensitive filesystem */
public final class C66844Mdc implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ NAZ A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ InstamadilloLoggingContext A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ List A08;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        C3030067a.A04("MailboxInstagramReverb", "loadMessageList", this.A00);
        String A0u = C66580MXl.A0u(NAZ.A00, 10);
        NotificationScope A002 = C71733Opt.A00(C66580MXl.A0H(accountSession), this, A0u, 33);
        this.A03.setNotification(A0u, A002);
        MailboxInstagramReverbJNI.dispatchVIOOOOOOO(0, this.A01, accountSession, this.A06, this.A05, this.A08, this.A07, this.A04, A002);
    }

    public C66844Mdc(NAZ naz, MailboxFutureImpl mailboxFutureImpl, InstamadilloLoggingContext instamadilloLoggingContext, Number number, String str, List list, List list2, int i, int i2) {
        this.A02 = naz;
        this.A00 = i;
        this.A03 = mailboxFutureImpl;
        this.A01 = i2;
        this.A06 = str;
        this.A05 = number;
        this.A08 = list;
        this.A07 = list2;
        this.A04 = instamadilloLoggingContext;
    }
}
