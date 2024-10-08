package X;

import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;

public final class PQ1 implements C74429Puj {
    public final /* synthetic */ DirectMessagesInteropOptionsViewModel A00;
    public final /* synthetic */ PQ2 A01;

    public final void D5a(NHW nhw) {
        DirectMessagesInteropOptionsViewModel A002 = NHW.A00(nhw);
        PQ2 pq2 = this.A01;
        C71109Ocn ocn = pq2.A06;
        String str = pq2.A0A;
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel = this.A00;
        16V r7 = pq2.A08;
        boolean z = pq2.A0C;
        boolean z2 = pq2.A0D;
        0qQ.A0B(str, 0);
        C71109Ocn.A03(ocn, directMessagesInteropOptionsViewModel, A002, r7, str, z, z2, true);
        DirectMessageInteropReachabilityOptions A003 = A002.A00(str);
        if (A003 != null) {
            String str2 = A003.A03;
            C69185Ngf ngf = pq2.A02;
            if (ngf != null) {
                C70962OTj oTj = pq2.A03;
                if (oTj != null) {
                    oTj.A00 = str2;
                }
                ngf.A07();
            }
            pq2.A07.A02(A002, str);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public PQ1(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, PQ2 pq2) {
        this.A01 = pq2;
        this.A00 = directMessagesInteropOptionsViewModel;
    }

    public final void D0f() {
        PQ2.A00(this.A01);
    }
}
