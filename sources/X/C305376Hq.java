package X;

/* renamed from: X.6Hq  reason: invalid class name and case insensitive filesystem */
public final class C305376Hq {
    public final long A00 = (4284900966L << 32);
    public final C304836Fk A01;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (0qQ.A0K(cls2, cls)) {
                0qQ.A0C(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
                C305376Hq r9 = (C305376Hq) obj;
                long j = this.A00;
                long j2 = r9.A00;
                long j3 = AnonymousClass5RW.A01;
                if (j != j2 || !0qQ.A0K(this.A01, r9.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = AnonymousClass5RW.A01;
        return (((int) (j ^ (j >>> 32))) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OverscrollConfiguration(glowColor=");
        sb.append(AnonymousClass5RW.A06(this.A00));
        sb.append(", drawPadding=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ C305376Hq() {
        long j = AnonymousClass5RW.A01;
        C304826Fj r0 = new C304826Fj(0.0f, 0.0f, 0.0f, 0.0f);
        this.A01 = r0;
    }
}
