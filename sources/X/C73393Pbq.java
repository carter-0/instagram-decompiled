package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Pbq  reason: case insensitive filesystem */
public final class C73393Pbq implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C226262fy A02;
    public final /* synthetic */ PMU A03;
    public final /* synthetic */ Integer A04;

    public C73393Pbq(View view, C226262fy r2, PMU pmu, Integer num, int i) {
        this.A03 = pmu;
        this.A04 = num;
        this.A01 = view;
        this.A00 = i;
        this.A02 = r2;
    }

    public final void run() {
        PMU pmu = this.A03;
        Integer num = this.A04;
        View view = this.A01;
        int i = this.A00;
        C226262fy r4 = this.A02;
        Context context = pmu.A0C;
        AnonymousClass5Gt r2 = new AnonymousClass5Gt(context, pmu.A0K, new C315476jx((CharSequence) AnonymousClass7TE.A16(context, i)));
        r2.A03(view);
        r2.A0F = false;
        r2.A04 = new C69034NdP(3, pmu, num);
        r2.A06(r4);
        r2.A00().A07(pmu.A0L);
    }
}
