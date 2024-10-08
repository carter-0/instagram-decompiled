package X;

/* renamed from: X.7Z5  reason: invalid class name */
public final class AnonymousClass7Z5 extends AnonymousClass0T0 implements C232262tL, C331837So {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7Z5) {
                AnonymousClass7Z5 r5 = (AnonymousClass7Z5) obj;
                if (!(this.A02 == r5.A02 && this.A03 == r5.A03 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final long C7Z() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return "javaClass";
    }

    public final int getType() {
        return 15;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A03) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A01) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A00) {
            i7 = 1231;
        }
        return i6 + i7;
    }

    public AnonymousClass7Z5(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = z;
        this.A03 = z2;
        this.A01 = z3;
        this.A00 = z4;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
