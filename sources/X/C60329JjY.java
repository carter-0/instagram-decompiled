package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.JjY  reason: case insensitive filesystem */
public final class C60329JjY extends 2YL implements MU9 {
    public Dc2 A00;
    public C62320sa A01 = MLB.A00;
    public C62320sa A02 = MLC.A00;
    public final C62037KWw A03;
    public final Map A04 = AnonymousClass7TE.A1H();
    public final Set A05;
    public final C249513ju A06;
    public final AnonymousClass0r6 A07;

    public C60329JjY(C62037KWw kWw) {
        0qQ.A0B(kWw, 1);
        this.A03 = kWw;
        1HR A0w = G9w.A0w();
        this.A06 = A0w;
        this.A07 = 0u9.A04(A0w);
        this.A05 = DbS.A0y();
    }

    public final 2Fk A00(C66569MWx mWx) {
        0qQ.A0B(mWx, 0);
        Map map = this.A04;
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            if (((2Fk) C51971G9r.A0p(A0u)).A02.A00 <= 0) {
                A0u.remove();
            }
        }
        String BfO = mWx.BfO();
        Object obj = map.get(BfO);
        if (obj == null) {
            obj = DbT.A0G(this.A03.A03(mWx.BfO(), mWx.isBookmarked()));
            map.put(BfO, obj);
        }
        return (2Fk) obj;
    }

    public final void A01(C66569MWx mWx, C62320sa r9, C62320sa r10, boolean z) {
        0qQ.A0B(r10, 3);
        this.A02 = r9;
        this.A01 = r10;
        Set set = this.A05;
        C66569MWx mWx2 = mWx;
        if (set.contains(mWx)) {
            set.remove(mWx);
        }
        set.add(mWx);
        AnonymousClass7TE.A1Z(new C59673JTe(mWx2, this, (AnonymousClass4D7) null, 22, z), C318116oQ.A00(this));
    }

    public final void Dol(boolean z) {
        this.A02.invoke();
    }

    public final void DCu(Integer num, String str, boolean z) {
        AnonymousClass7TG.A1O(num, str);
        C55123HcW.A00(num, str, z);
        Dba.A1S(this, C318116oQ.A00(this), 31, z);
        this.A01.invoke();
    }
}
