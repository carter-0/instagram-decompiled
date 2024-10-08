package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import java.util.List;

/* renamed from: X.67N  reason: invalid class name */
public final class AnonymousClass67N extends MailboxFeature {
    public static AnonymousClass681 A00 = new AnonymousClass66z();

    public final MailboxFutureImpl A00(MailboxCallback mailboxCallback, Number number, Number number2, Number number3, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, long j, boolean z) {
        AnonymousClass68L ASa = this.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASa);
        int A002 = C3030067a.A00(mailboxFutureImpl);
        TraceInfo A01 = C3030067a.A01(mailboxFutureImpl, "MailboxInstagramSecureMessage", "runInstagramAttachmentClientSend");
        MailboxCallback mailboxCallback2 = mailboxCallback;
        if (mailboxCallback != null) {
            mailboxFutureImpl.Eiu(mailboxCallback2);
        }
        if (!ASa.EJd(new C22247Xy3(this, mailboxFutureImpl, number, number2, number3, str, str2, str3, list, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, A002, j, z))) {
            mailboxFutureImpl.cancel(false);
            C3030067a.A02(A002);
            C3030067a.A03(A01, "MailboxInstagramSecureMessage", "runInstagramAttachmentClientSend");
        }
        PlatformLogger.platformEventLog(5);
        return mailboxFutureImpl;
    }

    public final void A01(MailboxCallback mailboxCallback) {
        AnonymousClass68L ASa = this.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASa);
        int A002 = C3030067a.A00(mailboxFutureImpl);
        TraceInfo A01 = C3030067a.A01(mailboxFutureImpl, "MailboxInstagramSecureMessage", "loadInstagramSecureContactList");
        mailboxFutureImpl.Eiu(mailboxCallback);
        if (!ASa.EJd(new C71639OoK(this, mailboxFutureImpl, A002))) {
            mailboxFutureImpl.cancel(false);
            C3030067a.A02(A002);
            C3030067a.A03(A01, "MailboxInstagramSecureMessage", "loadInstagramSecureContactList");
        }
        PlatformLogger.platformEventLog(5);
    }

    public final void A02(MailboxCallback mailboxCallback, Number number, Number number2, String str, String str2, String str3, String str4, String str5, List list, long j, boolean z) {
        AnonymousClass68L ASa = this.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASa);
        int A002 = C3030067a.A00(mailboxFutureImpl);
        TraceInfo A01 = C3030067a.A01(mailboxFutureImpl, "MailboxInstagramSecureMessage", "runInstagramMessageInsertOptimistic");
        MailboxCallback mailboxCallback2 = mailboxCallback;
        if (mailboxCallback != null) {
            mailboxFutureImpl.Eiu(mailboxCallback2);
        }
        if (!ASa.EJd(new C22242Xxx(this, mailboxFutureImpl, number, number2, str, str2, str3, str4, str5, list, A002, j, z))) {
            mailboxFutureImpl.cancel(false);
            C3030067a.A02(A002);
            C3030067a.A03(A01, "MailboxInstagramSecureMessage", "runInstagramMessageInsertOptimistic");
        }
        PlatformLogger.platformEventLog(5);
    }
}
