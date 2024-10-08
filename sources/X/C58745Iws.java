package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.Iws  reason: case insensitive filesystem */
public final class C58745Iws extends 0Yg implements 0sP {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Object A03;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.64W] */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = obj;
        if (this.A00 != 0) {
            MailboxFeature mailboxFeature = (MailboxFeature) obj2;
            0qQ.A0B(mailboxFeature, 0);
            2Eq r2 = (2Eq) this.A03;
            String obj3 = r2.C6I().toString();
            Long valueOf = Long.valueOf(this.A02);
            Long valueOf2 = Long.valueOf(this.A01);
            C56940IIj iIj = new C56940IIj(r2, 0);
            AnonymousClass68L ASa = mailboxFeature.mMailboxApiHandleMetaProvider.ASa(2);
            MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASa);
            String A002 = C66579MXk.A00(247);
            String A003 = C66579MXk.A00(748);
            int A004 = C3030067a.A00(mailboxFutureImpl);
            TraceInfo A012 = C3030067a.A01(mailboxFutureImpl, A002, A003);
            mailboxFutureImpl.Eiu(iIj);
            if (!ASa.EJd(new C71687Op6(mailboxFutureImpl, valueOf, mailboxFeature, valueOf2, obj3, A004, 2))) {
                mailboxFutureImpl.cancel(false);
                C3030067a.A02(A004);
                C3030067a.A03(A012, A002, A003);
            }
            PlatformLogger.platformEventLog(5);
            return C60340gF.A00;
        }
        AnonymousClass6GH r9 = (AnonymousClass6GH) obj2;
        0qQ.A0B(r9, 0);
        J6M A005 = J6M.A00(new C59103J6l(17, (Object) C51975G9x.A0K(G9t.A1D(C51965G9l.A0N(this.A02), this.A01)), this.A03), 25);
        ? obj4 = new Object();
        obj4.A00 = A005;
        r9.A01 = obj4;
        return obj4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58745Iws(Object obj, long j, int i, long j2) {
        super(1);
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
        this.A03 = obj;
    }
}
