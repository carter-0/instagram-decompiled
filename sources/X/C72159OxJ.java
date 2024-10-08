package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.OxJ  reason: case insensitive filesystem */
public final /* synthetic */ class C72159OxJ implements AnonymousClass67Q {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AnonymousClass67N A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ Long A05;

    public /* synthetic */ C72159OxJ(AnonymousClass67N r1, Long l, Long l2, int i, int i2, long j) {
        this.A03 = r1;
        this.A02 = j;
        this.A04 = l;
        this.A05 = l2;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void Eyr(AnonymousClass67Z r18) {
        long longValue;
        AnonymousClass67N r6 = this.A03;
        long j = this.A02;
        Long l = this.A04;
        Long l2 = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        MYb mYb = MYb.A0M;
        long j2 = 0;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        if (l2 != null) {
            j2 = l2.longValue();
        }
        C71624Oo5 oo5 = new C71624Oo5(r18);
        AnonymousClass68L A0I = C66581MXm.A0I(r6);
        MailboxFutureImpl A0G = C66580MXl.A0G(A0I);
        int A002 = C3030067a.A00(A0G);
        TraceInfo A0I2 = C66580MXl.A0I(oo5, A0G, "MailboxInstagramSecureMessage", "loadThreadViewDataWithOptions");
        if (!A0I.EJd(new C71694OpE(r6, A0G, A002, i, i2, j, longValue, j2))) {
            A0G.cancel(false);
            C3030067a.A02(A002);
            C3030067a.A03(A0I2, "MailboxInstagramSecureMessage", "loadThreadViewDataWithOptions");
        }
        PlatformLogger.platformEventLog(5);
    }
}
