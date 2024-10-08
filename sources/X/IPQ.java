package X;

import android.graphics.Rect;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class IPQ implements C252093oY {
    public long A00;
    public final C55933Hpv A01 = new C55933Hpv();
    public final C55933Hpv A02 = new C55933Hpv();
    public final Map A03 = AnonymousClass7TE.A1H();

    public final long B0M(AnonymousClass30Y r5) {
        0qQ.A0B(r5, 0);
        C55766Hn1 hn1 = (C55766Hn1) this.A03.get(r5.A05);
        if (hn1 == null) {
            return 0;
        }
        return this.A00 - hn1.A03;
    }

    public final void B9a(Rect rect, AnonymousClass30Y r4) {
        0qQ.A0B(rect, 1);
        rect.setEmpty();
        C55766Hn1 hn1 = (C55766Hn1) this.A03.get(r4.A05);
        if (hn1 != null) {
            for (Rect union : hn1.A02) {
                rect.union(union);
            }
        }
    }

    public final void B9b(AnonymousClass30Y r3, List list) {
        0qQ.A0B(list, 1);
        list.clear();
        C55766Hn1 hn1 = (C55766Hn1) this.A03.get(r3.A05);
        if (hn1 != null) {
            list.addAll(hn1.A02);
        }
    }

    public final Integer CEk(AnonymousClass30Y r3) {
        0qQ.A0B(r3, 0);
        C55766Hn1 hn1 = (C55766Hn1) this.A03.get(r3.A05);
        if (hn1 != null) {
            return hn1.A00;
        }
        return AnonymousClass05K.A0C;
    }

    public final void CFR(Rect rect) {
    }

    public final float CFe(AnonymousClass30Y r9) {
        0qQ.A0B(r9, 0);
        Map map = this.A03;
        String str = r9.A05;
        C55766Hn1 hn1 = (C55766Hn1) map.get(str);
        if (hn1 == null) {
            return 0.0f;
        }
        int i = 0;
        int i2 = 0;
        for (Rect rect : hn1.A01) {
            i2 += rect.height() * rect.width();
        }
        for (Rect rect2 : hn1.A02) {
            i += rect2.height() * rect2.width();
        }
        if (i2 != 0) {
            return ((float) i) / ((float) i2);
        }
        0KC.A0E("ViewpointSnapshotImpl", 002.A0R("Total possible area is empty for viewpoint data: ", str));
        return 0.0f;
    }

    private final void A00(C55933Hpv hpv) {
        Iterator A0v = AnonymousClass7TF.A0v(hpv.A00);
        while (A0v.hasNext()) {
            AnonymousClass30Y r2 = (AnonymousClass30Y) A0v.next();
            C55766Hn1 hn1 = (C55766Hn1) this.A03.get(r2.A05);
            if (hn1 != null) {
                hn1.A00 = AnonymousClass05K.A0C;
                hn1.A01.clear();
                hn1.A02.clear();
                r2.A01(this);
            }
        }
    }

    public final void A01() {
        C55933Hpv hpv = this.A02;
        for (AnonymousClass30Y A012 : hpv.A01) {
            A012.A01(this);
        }
        A00(hpv);
        C55933Hpv hpv2 = this.A01;
        for (AnonymousClass30Y A013 : hpv2.A01) {
            A013.A01(this);
        }
        A00(hpv2);
    }

    public final void A02(long j) {
        this.A00 = j;
        C55933Hpv hpv = this.A02;
        Iterator A0v = AnonymousClass7TF.A0v(hpv.A00);
        while (A0v.hasNext()) {
            this.A03.remove(((AnonymousClass30Y) A0v.next()).A05);
        }
        C55933Hpv hpv2 = this.A01;
        Iterator A0v2 = AnonymousClass7TF.A0v(hpv2.A00);
        while (A0v2.hasNext()) {
            this.A03.remove(((AnonymousClass30Y) A0v2.next()).A05);
        }
        Iterator A0v3 = AnonymousClass7TF.A0v(this.A03);
        while (A0v3.hasNext()) {
            C55766Hn1 hn1 = (C55766Hn1) A0v3.next();
            hn1.A01.clear();
            hn1.A02.clear();
        }
        hpv.A00();
        hpv2.A00();
    }

    public final long BlK() {
        return this.A00;
    }

    public final void B9Y(Rect rect, AnonymousClass30Y r4) {
        AnonymousClass7TG.A1N(r4, rect);
        rect.setEmpty();
        C55766Hn1 hn1 = (C55766Hn1) this.A03.get(r4.A05);
        if (hn1 != null) {
            for (Rect union : hn1.A01) {
                rect.union(union);
            }
        }
    }

    public final int BPd(AnonymousClass30Y r2) {
        Rect A0W = AnonymousClass7TE.A0W();
        B9Y(A0W, r2);
        return A0W.height();
    }

    public final int BPe(AnonymousClass30Y r2) {
        Rect A0W = AnonymousClass7TE.A0W();
        B9Y(A0W, r2);
        return A0W.width();
    }
}
