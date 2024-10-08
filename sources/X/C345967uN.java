package X;

import java.util.HashMap;

/* renamed from: X.7uN  reason: invalid class name and case insensitive filesystem */
public final class C345967uN {
    public C345897uG A00;
    public final C344507ry A01;
    public final C344567s4 A02;
    public final C345977uO A03;
    public final HashMap A04 = new HashMap();

    public C345967uN(C344507ry r6, C344567s4 r7) {
        C345977uO r3;
        0qQ.A0B(r7, 1);
        this.A02 = r7;
        this.A01 = r6;
        if (A01()) {
            C344507ry r4 = this.A01;
            r3 = new C345977uO(r4);
            boolean z = false;
            Object obj = r4.A00.get(C344507ry.A08);
            r3.A01 = ((Boolean) (obj != null ? obj : z)).booleanValue();
        } else {
            r3 = null;
        }
        this.A03 = r3;
    }

    public final boolean A00() {
        C344507ry r3 = this.A01;
        boolean z = false;
        Object obj = r3.A00.get(C344507ry.A0C);
        if (obj != null) {
            z = obj;
        }
        return ((Boolean) z).booleanValue();
    }

    public final boolean A01() {
        C344507ry r3 = this.A01;
        boolean z = false;
        Object obj = r3.A00.get(C344507ry.A0D);
        if (obj != null) {
            z = obj;
        }
        return ((Boolean) z).booleanValue();
    }

    public final boolean A02() {
        if (!A00()) {
            return false;
        }
        C344507ry r0 = this.A01;
        boolean z = false;
        Object obj = r0.A00.get(C344507ry.A0E);
        if (obj != null) {
            z = obj;
        }
        if (((Boolean) z).booleanValue()) {
            return true;
        }
        return false;
    }
}
