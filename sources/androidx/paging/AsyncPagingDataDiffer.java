package androidx.paging;

import X.AnonymousClass0qC;
import X.AnonymousClass0r6;
import X.C231452rh;
import X.C252303ot;
import X.C262094Cc;
import X.C62914KoS;
import X.C64329La4;
import X.C64331La6;
import X.C66370MPb;
import X.JTP;
import X.MPY;
import java.util.concurrent.atomic.AtomicInteger;

public final class AsyncPagingDataDiffer {
    public static final AsyncPagingDataDiffer $redex_init_class = null;
    public boolean A00;
    public final AsyncPagingDataDiffer$differBase$1 A01;
    public final MPY A02;
    public final C252303ot A03;
    public final C231452rh A04;
    public final AtomicInteger A05 = new AtomicInteger(0);
    public final C262094Cc A06;
    public final AnonymousClass0r6 A07;
    public final AnonymousClass0r6 A08;
    public final C262094Cc A09;

    static {
        C66370MPb mPb = C62914KoS.A00;
        if (mPb == null) {
            mPb = new C64331La6();
        }
        C62914KoS.A00 = mPb;
    }

    public AsyncPagingDataDiffer(C252303ot r4, C231452rh r5, C262094Cc r6, C262094Cc r7) {
        this.A03 = r4;
        this.A04 = r5;
        this.A09 = r6;
        this.A06 = r7;
        C64329La4 la4 = new C64329La4(this);
        this.A02 = la4;
        AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = new AsyncPagingDataDiffer$differBase$1(this, la4, r6);
        this.A01 = asyncPagingDataDiffer$differBase$1;
        this.A07 = new AnonymousClass0qC(asyncPagingDataDiffer$differBase$1.A0A);
        this.A08 = JTP.A10(asyncPagingDataDiffer$differBase$1.A09);
    }
}
