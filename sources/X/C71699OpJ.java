package X;

import com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.util.NotificationScope;
import java.util.List;

/* renamed from: X.OpJ  reason: case insensitive filesystem */
public final class C71699OpJ implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass67N A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ LoggingOption A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        C3030067a.A04("MailboxInstagramSecureMessage", "createOptimisticThread", this.A00);
        String A0u = C66580MXl.A0u(AnonymousClass67N.A00, 4);
        NotificationScope A012 = C71734Opu.A01(C66580MXl.A0H(accountSession), this, A0u, 24);
        this.A03.setNotification(A0u, A012);
        MailboxInstagramSecureMessageJNI.dispatchVIOOOOOZZZ(3, this.A01, accountSession, this.A06, this.A05, this.A04, A012, this.A07, this.A08, false);
    }

    public C71699OpJ(AnonymousClass67N r1, MailboxFutureImpl mailboxFutureImpl, LoggingOption loggingOption, String str, List list, int i, int i2, boolean z, boolean z2) {
        this.A02 = r1;
        this.A00 = i;
        this.A03 = mailboxFutureImpl;
        this.A01 = i2;
        this.A06 = list;
        this.A05 = str;
        this.A04 = loggingOption;
        this.A07 = z;
        this.A08 = z2;
    }
}
