package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.PmF  reason: case insensitive filesystem */
public final class C73935PmF extends 0Yg implements 0sP {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73935PmF(long j, long j2, String str) {
        super(1);
        this.A01 = j;
        this.A00 = j2;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        NAZ naz = (NAZ) obj;
        0qQ.A0B(naz, 0);
        String valueOf = String.valueOf(this.A01);
        Long valueOf2 = Long.valueOf(this.A00);
        String str = this.A02;
        C71623Oo3 oo3 = new C71623Oo3(0);
        AnonymousClass68L A0I = C66581MXm.A0I(naz);
        MailboxFutureImpl A0G = C66580MXl.A0G(A0I);
        int A002 = C3030067a.A00(A0G);
        TraceInfo A0I2 = C66580MXl.A0I(oo3, A0G, "MailboxInstagramReverb", "deleteThread");
        if (!A0I.EJd(new C71671Ooq(naz, A0G, valueOf2, valueOf, str, A002))) {
            A0G.cancel(false);
            C3030067a.A02(A002);
            C3030067a.A03(A0I2, "MailboxInstagramReverb", "deleteThread");
        }
        PlatformLogger.platformEventLog(5);
        return C60340gF.A00;
    }
}
