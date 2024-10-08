package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

public final class Ox1 implements AnonymousClass67Q {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public Ox1(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = obj2;
    }

    public final void Eyr(AnonymousClass67Z r14) {
        long j;
        int i;
        int i2;
        String str;
        C68314NAb nAb;
        MailboxFutureImpl mailboxFutureImpl;
        String str2;
        String str3;
        boolean z;
        TraceInfo traceInfo;
        AnonymousClass68L r0;
        switch (this.A00) {
            case 0:
                nAb = (C68314NAb) this.A01;
                str = this.A03;
                MYb mYb = MYb.A0M;
                j = ((Number) this.A02).longValue();
                C71722Opg A002 = C71722Opg.A00(r14, 54);
                z = false;
                r0 = nAb.mMailboxApiHandleMetaProvider.ASa(0);
                mailboxFutureImpl = C66580MXl.A0G(r0);
                str2 = "MailboxTam";
                str3 = "runTamClientThreadSessionActivate";
                i2 = C3030067a.A00(mailboxFutureImpl);
                traceInfo = C66580MXl.A0I(A002, mailboxFutureImpl, str2, str3);
                i = 3;
                break;
            case 1:
                nAb = (C68314NAb) this.A01;
                str = this.A03;
                MYb mYb2 = MYb.A0M;
                j = ((Number) this.A02).longValue();
                C71722Opg A003 = C71722Opg.A00(r14, 55);
                z = false;
                r0 = nAb.mMailboxApiHandleMetaProvider.ASa(0);
                mailboxFutureImpl = C66580MXl.A0G(r0);
                str2 = "MailboxTam";
                str3 = "runTamClientThreadSessionDeactivate";
                i2 = C3030067a.A00(mailboxFutureImpl);
                traceInfo = C66580MXl.A0I(A003, mailboxFutureImpl, str2, str3);
                i = 4;
                break;
            case 2:
                nAb = (C68314NAb) this.A01;
                str = this.A03;
                j = ((MsysThreadId) this.A02).A00;
                C71626Oo7 oo7 = new C71626Oo7(r14);
                z = false;
                r0 = C66580MXl.A0F(nAb, 0);
                mailboxFutureImpl = C66580MXl.A0G(r0);
                str2 = "MailboxTam";
                str3 = "runTamClientThreadSaveDraftMessage";
                i2 = C3030067a.A00(mailboxFutureImpl);
                traceInfo = C66580MXl.A0I(oo7, mailboxFutureImpl, str2, str3);
                i = 1;
                break;
            default:
                0qQ.A0B(r14, 0);
                MailboxFeature mailboxFeature = (MailboxFeature) this.A02;
                String str4 = this.A03;
                C71652OoX ooX = new C71652OoX(this.A01, r14, str4, 8);
                AnonymousClass68L A0F = C66580MXl.A0F(mailboxFeature, 0);
                MailboxFutureImpl A0J = C66581MXm.A0J(A0F, ooX);
                C66582MXn.A1E(A0F, new C71652OoX(mailboxFeature, A0J, str4, 7), A0J);
                return;
        }
        if (!r0.EJd(new C71720Ope(mailboxFutureImpl, nAb, str, i2, i, j))) {
            mailboxFutureImpl.cancel(z);
            C3030067a.A02(i2);
            C3030067a.A03(traceInfo, str2, str3);
        }
        PlatformLogger.platformEventLog(5);
    }
}
