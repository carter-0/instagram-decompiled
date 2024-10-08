package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.6Ve  reason: invalid class name and case insensitive filesystem */
public final class C308676Ve implements C233012uo {
    public C233012uo A00;
    public C233012uo A01;
    public final List A02;

    public final boolean A7L(C233632w4 r5, C233042ur r6, C233072uu r7) {
        boolean z;
        0qQ.A0B(r7, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(r5, 2);
        List list = this.A02;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C233012uo r1 = (C233012uo) it.next();
            if (r1.A7L(r5, r6, r7)) {
                this.A01 = r1;
                z = true;
                break;
            }
        }
        C233012uo r0 = this.A00;
        if (z && r0 != null) {
            r0.A7L(r5, r6, r7);
            list.add(r0);
        }
        return z;
    }

    public final /* synthetic */ void CJE(C376459Ib r1, List list) {
    }

    public final void Cn7(C233632w4 r2, C238523Ce r3, boolean z) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 2);
        C233012uo r0 = this.A01;
        0qQ.A0A(r0);
        r0.Cn7(r2, r3, z);
    }

    public final /* synthetic */ void Cn8(AnonymousClass9J0 r2, C233632w4 r3, C238523Ce r4, String str, String str2, double d, boolean z) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r4, 3);
        Cn7(r3, r4, z);
    }

    public final boolean AFi() {
        C233012uo r0 = this.A01;
        0qQ.A0A(r0);
        return r0.AFi();
    }

    public final /* synthetic */ AnonymousClass4lJ AN3() {
        return new C57364IYv();
    }

    public final /* synthetic */ String B4s() {
        return "";
    }

    public final int BWK() {
        C233012uo r0 = this.A01;
        0qQ.A0A(r0);
        return r0.BWK();
    }

    public final int BfG() {
        C233012uo r0 = this.A01;
        0qQ.A0A(r0);
        return r0.BfG();
    }

    public final /* synthetic */ Set Bsw() {
        return new HashSet();
    }

    public final boolean CTb() {
        C233012uo r0 = this.A01;
        0qQ.A0A(r0);
        return r0.CTb();
    }

    public final void Cmj(boolean z) {
        C233012uo r0 = this.A01;
        0qQ.A0A(r0);
        r0.Cmj(z);
    }

    public final void Cmr() {
        C233012uo r0 = this.A01;
        0qQ.A0A(r0);
        r0.Cmr();
    }

    public final void Cn9(int i) {
        C233012uo r0 = this.A01;
        if (r0 != null) {
            r0.Cn9(i);
        }
    }

    public final boolean D69(int i, int i2) {
        C233012uo r0 = this.A00;
        if (r0 != null) {
            r0.D69(i, i2);
        }
        C233012uo r02 = this.A01;
        0qQ.A0A(r02);
        return r02.D69(i, i2);
    }

    public final void DsJ(int i) {
        C233012uo r0 = this.A01;
        0qQ.A0A(r0);
        r0.DsJ(i);
    }

    public final void deactivate() {
        for (C233012uo deactivate : this.A02) {
            deactivate.deactivate();
        }
    }

    public C308676Ve(List list) {
        this.A02 = list;
    }
}
