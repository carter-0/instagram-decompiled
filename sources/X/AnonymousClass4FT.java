package X;

import java.util.List;

/* renamed from: X.4FT  reason: invalid class name */
public final class AnonymousClass4FT extends AnonymousClass0T0 implements C242723Vr {
    public final int A00;
    public final int A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4FT) {
                AnonymousClass4FT r5 = (AnonymousClass4FT) obj;
                if (!(0qQ.A0K(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A01) * 31 * 31) + this.A00;
    }

    public final void CfE(0sP r3) {
        for (Object invoke : this.A02) {
            r3.invoke(invoke);
        }
    }

    public AnonymousClass4FT(List list, int i, int i2) {
        this.A02 = list;
        this.A01 = i;
        this.A00 = i2;
    }
}
