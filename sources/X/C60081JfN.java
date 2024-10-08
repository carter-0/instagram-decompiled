package X;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JfN  reason: case insensitive filesystem */
public final class C60081JfN extends 04T {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C252213ok A02;
    public final /* synthetic */ AnonymousClass3E6 A03;
    public final /* synthetic */ LCe A04;
    public final /* synthetic */ 0r1 A05;

    public final void A04(04a r3) {
        0qQ.A0B(r3, 0);
        AnonymousClass03j.A00(this.A01, (AnonymousClass03Q) null);
        04a.A01(this.A00, (04T) null);
        this.A03.EEH(this.A02);
        this.A04.A00(C64899Ljz.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60081JfN(View view, View view2, C252213ok r4, AnonymousClass3E6 r5, LCe lCe, 0r1 r7) {
        super(0);
        this.A04 = lCe;
        this.A05 = r7;
        this.A01 = view;
        this.A00 = view2;
        this.A03 = r5;
        this.A02 = r4;
    }

    public final void A03(04a r3) {
        this.A04.A00(C64900Lk0.A00);
        this.A05.A00 = true;
    }

    public final AnonymousClass04S A01(AnonymousClass04S r3, 04a r4) {
        AnonymousClass7TG.A1N(r4, r3);
        this.A04.A00(C64901Lk1.A00);
        return r3;
    }

    public final 04k A02(04k r4, List list) {
        Object obj;
        AnonymousClass7TG.A1N(r4, list);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if ((((04a) obj).A00.A06() & 8) != 0) {
                break;
            }
        }
        04a r2 = (04a) obj;
        if (r2 != null) {
            this.A04.A00(new C61180JyZ(r2));
        }
        return r4;
    }
}
