package X;

import java.util.LinkedHashMap;

/* renamed from: X.6sa  reason: invalid class name and case insensitive filesystem */
public abstract class C320566sa implements C320576sb {
    public C320526sW A00;
    public boolean A01;
    public final LinkedHashMap A02 = new LinkedHashMap();
    public final boolean A03;

    public void A02(C320726sq r8, Object obj, String str) {
        LinkedHashMap linkedHashMap = this.A02;
        boolean containsKey = linkedHashMap.containsKey(str);
        if (containsKey) {
            C320726sq r1 = (C320726sq) linkedHashMap.remove(str);
            int i = 0;
            if (r1 != null) {
                r1.Ejf(false, -1);
            }
            for (C320726sq r0 : linkedHashMap.values()) {
                i++;
                if (r0 != null) {
                    r0.Ejf(true, i);
                }
            }
        } else if (r8 != null || (r8 = A00(obj)) != null) {
            r8.Ejf(true, linkedHashMap.size() + 1);
            linkedHashMap.put(str, r8);
        } else {
            return;
        }
        C320526sW r12 = this.A00;
        if (r12 != null) {
            r12.Cf9(str, !containsKey);
        }
        C320526sW r02 = this.A00;
        if (r02 != null) {
            r02.update();
        }
    }

    public final void A01() {
        LinkedHashMap linkedHashMap = this.A02;
        for (C320726sq r2 : linkedHashMap.values()) {
            if (r2 != null) {
                r2.Ejf(false, -1);
            }
        }
        linkedHashMap.clear();
    }

    public final void A03(boolean z) {
        if (this.A01 != z) {
            this.A01 = z;
            if (z) {
                A01();
            }
            C320526sW r1 = this.A00;
            if (r1 != null) {
                r1.Ejd(this.A01);
            }
            C320526sW r0 = this.A00;
            if (r0 != null) {
                r0.update();
            }
        }
    }

    public final boolean CVD() {
        return this.A01;
    }

    public final boolean EtM() {
        return this.A03;
    }

    public C320566sa(boolean z, boolean z2) {
        this.A01 = z;
        this.A03 = z2;
    }

    public C320726sq A00(Object obj) {
        return null;
    }
}
