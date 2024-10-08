package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import java.util.List;

/* renamed from: X.Xxv  reason: case insensitive filesystem */
public final class C22240Xxv implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass67N A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ boolean A08;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        C3030067a.A04("MailboxInstagramSecureMessage", C273654mx.A00(2991), this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A02;
        MailboxNullable A0K = C66581MXm.A0K();
        C22251Xy7 xy7 = new C22251Xy7(this, 15);
        AnonymousClass681 r0 = AnonymousClass67N.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0K, 0, 0, "MCAMailboxInstagramSecureMessage", "InstagramSecureMessagesForNotifications", xy7);
    }

    public C22240Xxv(AnonymousClass67N r1, MailboxFutureImpl mailboxFutureImpl, List list, List list2, List list3, List list4, List list5, int i, boolean z) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = mailboxFutureImpl;
        this.A07 = list;
        this.A04 = list2;
        this.A06 = list3;
        this.A05 = list4;
        this.A03 = list5;
        this.A08 = z;
    }
}
