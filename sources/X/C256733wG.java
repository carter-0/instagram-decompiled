package X;

import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3wG  reason: invalid class name and case insensitive filesystem */
public abstract class C256733wG {
    public final long A00;
    public final long A01;
    public final C256683wB A02;
    public final C256573vz A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;

    public final AnonymousClass4XE A00() {
        if (this instanceof C256723wF) {
            return ((C256723wF) this).A03;
        }
        return (AnonymousClass4XD) this;
    }

    public final C256573vz A01() {
        if (this instanceof C256723wF) {
            return ((C256723wF) this).A02;
        }
        return null;
    }

    public String A02() {
        if (this instanceof C256723wF) {
            return ((C256723wF) this).A04;
        }
        return null;
    }

    public final String A03() {
        return ((C256383vg) this.A04.get(0)).A03;
    }

    public final boolean A04() {
        if (this instanceof C256723wF) {
            return false;
        }
        C256763wJ r1 = ((AnonymousClass4XD) this).A00;
        if (r1 instanceof C256753wI) {
            return ((C256753wI) r1).A03;
        }
        return false;
    }

    public C256733wG(C256683wB r9, C256563vy r10, List list, List list2, List list3, List list4) {
        C256573vz r2;
        long j;
        C256703wD.A03(!list.isEmpty());
        this.A04 = list;
        this.A02 = r9;
        this.A06 = Collections.unmodifiableList(list2);
        this.A05 = list3;
        this.A07 = list4;
        if (r10 instanceof C256753wI) {
            C256753wI r0 = (C256753wI) r10;
            C45443CwV cwV = r0.A01;
            if (cwV != null) {
                C256683wB r02 = this.A02;
                r2 = new C256573vz(cwV.A00(r02.A0T, r02.A05, 0, 0), 0, -1);
            } else {
                r2 = r0.A02;
            }
        } else {
            r2 = r10.A02;
        }
        this.A03 = r2;
        this.A01 = Util.A09(r10.A00, 1000000, r10.A01);
        if (r10 instanceof C256763wJ) {
            j = ((C256763wJ) r10).A03;
        } else {
            j = 0;
        }
        this.A00 = j;
    }
}
