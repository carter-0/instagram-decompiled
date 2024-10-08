package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.OxE  reason: case insensitive filesystem */
public final /* synthetic */ class C72154OxE implements AnonymousClass67Q {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AnonymousClass67N A03;
    public final /* synthetic */ MsysThreadId A04;

    public /* synthetic */ C72154OxE(AnonymousClass67N r1, MsysThreadId msysThreadId, int i, int i2, long j) {
        this.A03 = r1;
        this.A04 = msysThreadId;
        this.A02 = j;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void Eyr(AnonymousClass67Z r16) {
        AnonymousClass67N r6 = this.A03;
        MsysThreadId msysThreadId = this.A04;
        long j = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        MYb mYb = MYb.A0M;
        long j2 = msysThreadId.A00;
        C71722Opg A002 = C71722Opg.A00(r16, 63);
        AnonymousClass68L ASa = r6.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl A0G = C66580MXl.A0G(ASa);
        int A003 = C3030067a.A00(A0G);
        TraceInfo A0I = C66580MXl.A0I(A002, A0G, "MailboxInstagramSecureMessage", "loadInstagramSecureMessageAttachmentList");
        if (!ASa.EJd(new C71684Op3(r6, A0G, A003, i, i2, j2, j))) {
            A0G.cancel(false);
            C3030067a.A02(A003);
            C3030067a.A03(A0I, "MailboxInstagramSecureMessage", "loadInstagramSecureMessageAttachmentList");
        }
        PlatformLogger.platformEventLog(5);
    }
}
