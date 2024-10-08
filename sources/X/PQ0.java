package X;

import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;

public final class PQ0 implements C74429Puj {
    public final /* synthetic */ NMJ A00;
    public final /* synthetic */ DirectMessagesInteropOptionsViewModel A01;

    public final void D5a(NHW nhw) {
        DirectMessagesInteropOptionsViewModel A002 = NHW.A00(nhw);
        NMJ nmj = this.A00;
        String str = nmj.A01;
        if (str != null) {
            C71109Ocn.A03(nmj.A0A, this.A01, A002, nmj.A0G, str, nmj.A03, nmj.A0H, true);
        }
        nmj.A00 = A002;
        nmj.A02 = false;
        nmj.A0E.A00();
        C72197OyI oyI = nmj.A0D;
        oyI.A00 = C59689JTv.A01(nmj.A05, (String) null, 2131966270, 1);
        String str2 = nmj.A01;
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel = nmj.A00;
        if (directMessagesInteropOptionsViewModel != null) {
            oyI.A02(directMessagesInteropOptionsViewModel, str2);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public PQ0(NMJ nmj, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel) {
        this.A00 = nmj;
        this.A01 = directMessagesInteropOptionsViewModel;
    }

    public final void D0f() {
        NMJ nmj = this.A00;
        NMJ.A01(nmj);
        NMJ.A00(nmj);
    }
}
