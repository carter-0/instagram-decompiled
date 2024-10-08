package X;

import java.util.List;

/* renamed from: X.9Iw  reason: invalid class name and case insensitive filesystem */
public final class C376669Iw extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final int A01;
    public final Object A02;
    public final String A03;

    public C376669Iw(C62320sa r2, String str, int i) {
        0qQ.A0B(str, 1);
        this.A03 = str;
        this.A01 = i;
        this.A02 = r2;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C376669Iw)) {
                return false;
            }
            C376669Iw r3 = (C376669Iw) obj;
            if (r3.A00 != 1 || !0qQ.A0K(this.A03, r3.A03) || this.A01 != r3.A01 || !0qQ.A0K(this.A02, r3.A02)) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C376669Iw)) {
                return false;
            }
            C376669Iw r32 = (C376669Iw) obj;
            if (r32.A00 != 0 || !0qQ.A0K(this.A03, r32.A03) || !0qQ.A0K(this.A02, r32.A02) || this.A01 != r32.A01) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int i2 = this.A00;
        int hashCode2 = this.A03.hashCode();
        if (i2 != 0) {
            hashCode = ((hashCode2 * 31) + this.A01) * 31;
            i = this.A02.hashCode();
        } else {
            hashCode = ((hashCode2 * 31) + this.A02.hashCode()) * 31;
            i = this.A01;
        }
        return hashCode + i;
    }

    public C376669Iw(List list, int i, String str) {
        0qQ.A0B(str, 1);
        this.A03 = str;
        this.A02 = list;
        this.A01 = i;
    }
}
