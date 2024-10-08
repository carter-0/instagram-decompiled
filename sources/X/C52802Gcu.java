package X;

import android.content.Context;
import android.os.CountDownTimer;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Gcu  reason: case insensitive filesystem */
public final class C52802Gcu extends CountDownTimer {
    public final /* synthetic */ HnT A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52802Gcu(HnT hnT, long j) {
        super(j, 35);
        this.A00 = hnT;
    }

    public final void onFinish() {
        C337727go r0;
        2Wh r02;
        RecyclerView recyclerView;
        2Wh r03;
        RecyclerView recyclerView2;
        HnT hnT = this.A00;
        HK1 hk1 = hnT.A03;
        C51967G9n.A19(hk1.A08, 1.0f);
        2V5 r4 = hk1.A02;
        int i = 1;
        int A09 = C51970G9q.A09(r4) + 1;
        int A03 = hk1.A03();
        C334997cD r04 = hnT.A00;
        if (r04 != null && (r0 = r04.A01) != null && (r02 = r0.A01) != null && (recyclerView = r02.A04) != null && recyclerView.getScrollState() == 0) {
            if (A09 < A03) {
                Context context = hk1.A06;
                if (0mk.A02(context)) {
                    i = -1;
                }
                int A01 = i * C61380mr.A01(context, hk1.A02() + 12);
                C337727go r05 = ((C334997cD) hk1.A06.getValue()).A01;
                if (!(r05 == null || (r03 = r05.A01) == null || (recyclerView2 = r03.A04) == null)) {
                    recyclerView2.A0u(A01, 0);
                }
                C52802Gcu gcu = new C52802Gcu(hnT, hnT.A02);
                gcu.start();
                C51967G9n.A1A(r4, A09);
                hnT.A01 = gcu;
                return;
            }
            C51967G9n.A1B(hk1.A04, true);
        }
    }

    public final void onTick(long j) {
        HnT hnT = this.A00;
        2V5 r6 = hnT.A03.A08;
        long j2 = hnT.A02;
        C51967G9n.A19(r6, ((float) (j2 - j)) / ((float) j2));
    }
}
