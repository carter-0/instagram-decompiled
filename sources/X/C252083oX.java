package X;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3oX  reason: invalid class name and case insensitive filesystem */
public final class C252083oX implements C252093oY {
    public long A00;
    public final C71732ep A01 = new C71732ep();
    public final C71732ep A02 = new C71732ep();
    public final Map A03 = new HashMap();
    public final boolean A04;
    public final C71712ek A05;
    public final List A06 = new ArrayList(1);

    public static Rect A00(AnonymousClass3P2 r2) {
        if (r2 != null) {
            Rect rect = r2.A02;
            if (!(rect.top == Integer.MIN_VALUE || rect.left == Integer.MIN_VALUE || rect.right == Integer.MIN_VALUE || rect.bottom == Integer.MIN_VALUE)) {
                return rect;
            }
        }
        throw new IllegalStateException("This viewpoint has not been measured or is a group which will never return a measurement since it's made up of subviews that could be offscreen");
    }

    private void A01(C71732ep r6) {
        for (AnonymousClass30Y r3 : r6.A00.values()) {
            AnonymousClass3P2 r1 = (AnonymousClass3P2) this.A03.get(r3.A00);
            if (r1 != null) {
                r1.A01 = AnonymousClass05K.A0C;
                r1.A03.clear();
                r3.A01(this);
            } else if (this.A05 != null) {
                0wb.A01.Ew0("ViewpointSnapshotReducerJv", 002.A0R("null view property for removed item ", r3.A00));
            }
        }
    }

    public final void A02() {
        C71732ep r2 = this.A02;
        for (AnonymousClass30Y A012 : r2.A01) {
            A012.A01(this);
        }
        A01(r2);
        C71732ep r22 = this.A01;
        for (AnonymousClass30Y A013 : r22.A01) {
            A013.A01(this);
        }
        A01(r22);
    }

    public final void A03(long j, List list) {
        this.A00 = j;
        List list2 = this.A06;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            list2.add(new Rect((Rect) it.next()));
        }
        C71732ep r4 = this.A02;
        for (AnonymousClass30Y r0 : r4.A00.values()) {
            this.A03.remove(r0.A00);
        }
        C71732ep r3 = this.A01;
        for (AnonymousClass30Y r02 : r3.A00.values()) {
            this.A03.remove(r02.A00);
        }
        for (AnonymousClass3P2 r03 : this.A03.values()) {
            r03.A03.clear();
        }
        C71732ep.A00(r4);
        C71732ep.A00(r3);
    }

    public final long B0M(AnonymousClass30Y r5) {
        AnonymousClass3P2 r0 = (AnonymousClass3P2) this.A03.get(r5.A00);
        if (r0 == null) {
            return 0;
        }
        return this.A00 - r0.A00;
    }

    public final void B9Y(Rect rect, AnonymousClass30Y r4) {
        rect.set(A00((AnonymousClass3P2) this.A03.get(r4.A00)));
    }

    public final int BPd(AnonymousClass30Y r3) {
        return A00((AnonymousClass3P2) this.A03.get(r3.A00)).height();
    }

    public final int BPe(AnonymousClass30Y r3) {
        return A00((AnonymousClass3P2) this.A03.get(r3.A00)).width();
    }

    public final long BlK() {
        return this.A00;
    }

    public final Integer CEk(AnonymousClass30Y r3) {
        return ((AnonymousClass3P2) this.A03.get(r3.A00)).A01;
    }

    public final float CFe(AnonymousClass30Y r6) {
        AnonymousClass3P2 r1 = (AnonymousClass3P2) this.A03.get(r6.A00);
        if (r1 == null) {
            return 0.0f;
        }
        Rect A002 = A00(r1);
        int height = A002.height() * A002.width();
        int i = 0;
        for (Rect rect : r1.A03) {
            i += rect.height() * rect.width();
        }
        return ((float) i) / ((float) height);
    }

    public C252083oX(C71712ek r3, boolean z) {
        this.A05 = r3;
        this.A04 = z;
    }

    public final void B9a(Rect rect, AnonymousClass30Y r4) {
        rect.setEmpty();
        for (Rect union : ((AnonymousClass3P2) this.A03.get(r4.A00)).A03) {
            rect.union(union);
        }
    }

    public final void B9b(AnonymousClass30Y r3, List list) {
        list.clear();
        list.addAll(((AnonymousClass3P2) this.A03.get(r3.A00)).A03);
    }

    public final void CFR(Rect rect) {
        rect.setEmpty();
        for (Rect union : this.A06) {
            rect.union(union);
        }
    }
}
