package X;

import com.facebook.instagramreverb.mca.MailboxInstagramReverbJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.instagram.direct.msys.reverb.InstamadilloLoggingContext;
import java.util.List;

/* renamed from: X.OpC  reason: case insensitive filesystem */
public final class C71692OpC implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ NAZ A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ InstamadilloLoggingContext A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        C3030067a.A04("MailboxInstagramReverb", "loadMessagesByOTIDs", this.A00);
        String A0u = C66580MXl.A0u(NAZ.A00, 12);
        NotificationScope EBU = C66580MXl.A0H(accountSession).EBU(new C71733Opt(A0u, this, 34), A0u, 1);
        this.A02.setNotification(A0u, EBU);
        MailboxInstagramReverbJNI.dispatchVOOOOOOZ(1, accountSession, this.A04, this.A06, this.A05, this.A03, EBU, this.A07);
    }

    public C71692OpC(NAZ naz, MailboxFutureImpl mailboxFutureImpl, InstamadilloLoggingContext instamadilloLoggingContext, String str, List list, List list2, int i, boolean z) {
        this.A01 = naz;
        this.A00 = i;
        this.A02 = mailboxFutureImpl;
        this.A04 = str;
        this.A06 = list;
        this.A05 = list2;
        this.A03 = instamadilloLoggingContext;
        this.A07 = z;
    }
}
