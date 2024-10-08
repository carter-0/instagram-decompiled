package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.PmO  reason: case insensitive filesystem */
public final class C73944PmO extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Long A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73944PmO(Long l, int i, long j, boolean z) {
        super(1);
        this.A01 = j;
        this.A02 = l;
        this.A00 = i;
        this.A03 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        NAZ naz = (NAZ) obj;
        0qQ.A0B(naz, 0);
        String valueOf = String.valueOf(this.A01);
        Long l = this.A02;
        Integer valueOf2 = Integer.valueOf(this.A00);
        boolean z = this.A03;
        AnonymousClass68L A0I = C66581MXm.A0I(naz);
        MailboxFutureImpl A0G = C66580MXl.A0G(A0I);
        int A002 = C3030067a.A00(A0G);
        TraceInfo A012 = C3030067a.A01(A0G, "MailboxInstagramReverb", "loadMessagesForReporting");
        if (!A0I.EJd(new C71682Op1(naz, A0G, l, valueOf2, valueOf, A002, z))) {
            A0G.cancel(false);
            C3030067a.A02(A002);
            C3030067a.A03(A012, "MailboxInstagramReverb", "loadMessagesForReporting");
        }
        PlatformLogger.platformEventLog(5);
        return A0G;
    }
}
