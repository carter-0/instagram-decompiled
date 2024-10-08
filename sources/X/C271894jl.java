package X;

/* renamed from: X.4jl  reason: invalid class name and case insensitive filesystem */
public final class C271894jl extends AnonymousClass0T0 {
    public final int A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C271894jl) {
                C271894jl r5 = (C271894jl) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A01;
        return ((C266914aY.A01(num).hashCode() + num.intValue()) * 31) + this.A00;
    }

    public final String toString() {
        String str;
        Integer num = this.A01;
        if (num != null) {
            str = C266914aY.A01(num);
        } else {
            str = "null";
        }
        return 002.A0l("LastItemSeen(itemType=", str, AnonymousClass000.A00(2031), ')', this.A00);
    }

    public C271894jl(int i, Integer num) {
        this.A01 = num;
        this.A00 = i;
    }
}
