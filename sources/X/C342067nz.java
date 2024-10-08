package X;

import java.util.HashMap;

/* renamed from: X.7nz  reason: invalid class name and case insensitive filesystem */
public final class C342067nz {
    public final int A00;
    public final int A01;
    public final C341047mF A02;
    public final HashMap A03;

    public C342067nz(C341047mF r1, HashMap hashMap, int i, int i2) {
        this.A01 = i2;
        this.A00 = i;
        this.A02 = r1;
        this.A03 = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C342067nz r5 = (C342067nz) obj;
        if (this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02) {
            HashMap hashMap = this.A03;
            HashMap hashMap2 = r5.A03;
            if (hashMap == null) {
                return hashMap2 == null;
            }
            if (hashMap.equals(hashMap2)) {
                return true;
            }
        }
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }
}
