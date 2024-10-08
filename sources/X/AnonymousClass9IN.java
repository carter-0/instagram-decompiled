package X;

import java.util.List;

/* renamed from: X.9IN  reason: invalid class name */
public final class AnonymousClass9IN extends AnonymousClass0T0 implements C242723Vr {
    public final int A00 = 1;
    public final int A01;
    public final int A02;
    public final Object A03;

    public AnonymousClass9IN(List list, int i) {
        0qQ.A0B(list, 1);
        this.A03 = list;
        this.A02 = i;
        this.A01 = 0;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof AnonymousClass9IN) || ((AnonymousClass9IN) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final void CfE(0sP r3) {
        if (this.A00 != 0) {
            r3.invoke(this.A03);
            return;
        }
        for (Object invoke : (List) this.A03) {
            r3.invoke(invoke);
        }
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!A00(i, obj)) {
            return false;
        }
        AnonymousClass9IN r3 = (AnonymousClass9IN) obj;
        if (0qQ.A0K(this.A03, r3.A03) && this.A02 == r3.A02 && this.A01 == r3.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj;
        int hashCode;
        if (this.A00 != 0) {
            obj = this.A03;
            if (obj == null) {
                hashCode = 0;
            }
            hashCode = obj.hashCode();
        } else {
            obj = this.A03;
            hashCode = obj.hashCode();
        }
        return (((hashCode * 31) + this.A02) * 31) + this.A01;
    }

    public AnonymousClass9IN(Object obj, int i, int i2) {
        this.A03 = obj;
        this.A02 = i;
        this.A01 = i2;
    }
}
