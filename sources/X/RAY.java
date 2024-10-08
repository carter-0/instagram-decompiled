package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.concurrent.ExecutorService;

public final class RAY extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C11354SOn A04;
    public final /* synthetic */ C13589TdH A05;
    public final /* synthetic */ C13754TgQ A06;
    public final /* synthetic */ AnonymousClass51R A07;
    public final /* synthetic */ AnonymousClass8PZ A08;
    public final /* synthetic */ File A09;
    public final /* synthetic */ ExecutorService A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RAY(C11354SOn sOn, C13589TdH tdH, C13754TgQ tgQ, AnonymousClass51R r7, AnonymousClass8PZ r8, File file, ExecutorService executorService, int i, int i2, int i3, int i4, boolean z) {
        super(90, 4, false, false);
        this.A09 = file;
        this.A02 = i;
        this.A03 = i2;
        this.A0B = z;
        this.A04 = sOn;
        this.A01 = i3;
        this.A00 = i4;
        this.A07 = r7;
        this.A08 = r8;
        this.A0A = executorService;
        this.A05 = tdH;
        this.A06 = tgQ;
    }

    public final void run() {
        File file = this.A09;
        int A012 = AIF.A01(file.getAbsolutePath());
        int i = this.A02;
        if (A012 > i) {
            A012 = i;
        }
        int i2 = this.A03;
        int i3 = A012 - i2;
        if (this.A0B) {
            C11354SOn sOn = this.A04;
            AnonymousClass51R r4 = this.A07;
            sOn.A0E = C9823Rhl.A00((float) this.A01, (float) this.A00, (float) r4.A09, (float) r4.A05);
        }
        try {
            AnonymousClass8PZ r1 = this.A08;
            Context context = r1.A0B;
            ExecutorService executorService = this.A0A;
            C11354SOn sOn2 = this.A04;
            C13589TdH tdH = this.A05;
            UserSession userSession = r1.A0F;
            0Tu r12 = 0Tu.A05;
            boolean A062 = 182.A06(r12, userSession, 36324179100512101L);
            boolean A063 = 182.A06(r12, userSession, 36324179101233005L);
            boolean A064 = 182.A06(r12, userSession, 36324179100905321L);
            boolean A065 = 182.A06(r12, userSession, 36324179101626227L);
            long A013 = 182.A01(r12, userSession, 36605654077674788L);
            boolean A066 = 182.A06(r12, userSession, 36324179102084986L);
            AnonymousClass7TF.A1E(executorService, 1, tdH);
            11Z.A02(new TKN(this.A06, C9598Rdc.A00(context, (C66093MBb) null, sOn2, tdH, (MediaComposition) null, (SFQ) null, file, executorService, i2, i, 1, A013, false, false, false, false, A062, A063, A064, A065, A066), this.A01, this.A00, i3));
        } catch (C351748Af e) {
            11Z.A02(new C12994THb(e, this.A06));
        }
    }
}
