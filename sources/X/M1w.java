package X;

import android.content.Context;
import android.view.ViewGroup;

public final /* synthetic */ class M1w implements Runnable {
    public final /* synthetic */ LWg A00;

    public /* synthetic */ M1w(LWg lWg) {
        this.A00 = lWg;
    }

    public final void run() {
        LWg lWg = this.A00;
        ViewGroup viewGroup = lWg.A03;
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        AnonymousClass5Gt r1 = new AnonymousClass5Gt(context, lWg.A03, new C315476jx((CharSequence) context.getString(2131967991)));
        r1.A03(lWg.A09);
        r1.A02();
        r1.A07(C283255Gu.A06);
        r1.A0B = true;
        r1.A0A = true;
        AnonymousClass5Gv A002 = KSP.A00(r1, lWg, 0);
        lWg.A07 = A002;
        A002.A07(lWg.A0I);
    }
}
