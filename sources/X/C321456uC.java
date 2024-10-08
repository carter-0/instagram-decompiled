package X;

import android.view.View;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.6uC  reason: invalid class name and case insensitive filesystem */
public final class C321456uC implements AnonymousClass726, AnonymousClass728 {
    public final 2el A00;
    public final C229932oe A01;
    public final List A02;
    public final List A03;

    public final void AAh(1Xj r5, int i) {
        0qQ.A0B(r5, 0);
        Integer valueOf = Integer.valueOf(i);
        String id = r5.getId();
        AnonymousClass30Y r0 = AnonymousClass30Y.A07;
        C2354830a r3 = new C2354830a(r5, valueOf, id);
        for (C250603lj A002 : this.A02) {
            r3.A00(A002);
        }
        C229932oe r2 = this.A01;
        String id2 = r5.getId();
        if (id2 != null) {
            r2.A01(r3.A01(), id2);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void AAi(Reel reel, int i) {
        0qQ.A0B(reel, 0);
        Integer valueOf = Integer.valueOf(i);
        String id = reel.getId();
        AnonymousClass30Y r0 = AnonymousClass30Y.A07;
        C2354830a r3 = new C2354830a(reel, valueOf, id);
        for (C250603lj A002 : this.A03) {
            r3.A00(A002);
        }
        C229932oe r2 = this.A01;
        String id2 = reel.getId();
        0qQ.A07(id2);
        r2.A01(r3.A01(), id2);
    }

    public final void ECC(View view, 1Xj r4) {
        C229932oe r1 = this.A01;
        String id = r4.getId();
        if (id != null) {
            this.A00.A05(view, r1.A00(id));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void ECD(View view, Reel reel) {
        C229932oe r1 = this.A01;
        String id = reel.getId();
        0qQ.A07(id);
        this.A00.A05(view, r1.A00(id));
    }

    public C321456uC(2el r1, C229932oe r2, List list, List list2) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = list;
        this.A03 = list2;
    }
}
