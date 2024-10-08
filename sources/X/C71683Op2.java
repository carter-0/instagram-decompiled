package X;

import com.facebook.instagramreverb.mca.MailboxInstagramReverbJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.instagram.direct.msys.reverb.InstamadilloLoggingContext;
import java.util.List;
import java.util.Map;

/* renamed from: X.Op2  reason: case insensitive filesystem */
public final class C71683Op2 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ NAZ A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ InstamadilloLoggingContext A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ Map A06;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        C3030067a.A04("MailboxInstagramReverb", "loadMessageListForThreads", this.A00);
        String A0u = C66580MXl.A0u(NAZ.A00, 11);
        NotificationScope A002 = C71733Opt.A00(C66580MXl.A0H(accountSession), this, A0u, 32);
        this.A02.setNotification(A0u, A002);
        MailboxInstagramReverbJNI.dispatchVOOOOOO(9, accountSession, this.A06, this.A04, this.A05, this.A03, A002);
    }

    public C71683Op2(NAZ naz, MailboxFutureImpl mailboxFutureImpl, InstamadilloLoggingContext instamadilloLoggingContext, Number number, List list, Map map, int i) {
        this.A01 = naz;
        this.A00 = i;
        this.A02 = mailboxFutureImpl;
        this.A06 = map;
        this.A04 = number;
        this.A05 = list;
        this.A03 = instamadilloLoggingContext;
    }
}
