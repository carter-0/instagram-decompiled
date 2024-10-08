package X;

import com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import java.util.List;
import java.util.Map;

/* renamed from: X.OpK  reason: case insensitive filesystem */
public final class C71700OpK implements MailboxCallback {
    public final /* synthetic */ NAX A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ Number A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ Map A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = C66580MXl.A0u(NAX.A00, 354);
        NotificationScope A002 = C71733Opt.A00(C66580MXl.A0H(accountSession), this, A0u, 17);
        this.A01.setNotification(A0u, A002);
        MailboxEncryptedBackupsJNI.dispatchVOOOOOOOZZZ(53, accountSession, this.A02, this.A05, this.A04, this.A06, this.A03, A002, this.A08, this.A07, this.A09);
    }

    public C71700OpK(NAX nax, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, List list, List list2, Map map, boolean z, boolean z2, boolean z3) {
        this.A00 = nax;
        this.A01 = mailboxFutureImpl;
        this.A02 = number;
        this.A05 = list;
        this.A04 = list2;
        this.A06 = map;
        this.A03 = number2;
        this.A08 = z;
        this.A07 = z2;
        this.A09 = z3;
    }
}
