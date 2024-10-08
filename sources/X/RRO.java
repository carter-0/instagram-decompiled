package X;

import android.animation.TimeInterpolator;

public final class RRO {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public TimeInterpolator A04;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RRO) {
            RRO rro = (RRO) obj;
            if (this.A02 == rro.A02 && this.A03 == rro.A03 && this.A00 == rro.A00 && this.A01 == rro.A01) {
                TimeInterpolator timeInterpolator = this.A04;
                if (timeInterpolator == null) {
                    timeInterpolator = AnonymousClass6Y2.A02;
                }
                Class<?> cls = timeInterpolator.getClass();
                TimeInterpolator timeInterpolator2 = rro.A04;
                if (timeInterpolator2 == null) {
                    timeInterpolator2 = AnonymousClass6Y2.A02;
                }
                return cls.equals(timeInterpolator2.getClass());
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.A02;
        int A012 = AnonymousClass7TF.A01(this.A03, ((int) (j ^ (j >>> 32))) * 31);
        TimeInterpolator timeInterpolator = this.A04;
        if (timeInterpolator == null) {
            timeInterpolator = AnonymousClass6Y2.A02;
        }
        return ((AnonymousClass7TF.A07(timeInterpolator.getClass(), A012) + this.A00) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(10);
        A1A.append(C66581MXm.A0y(this));
        A1A.append('{');
        A1A.append(Pxf.A0h(this));
        A1A.append(" delay: ");
        A1A.append(this.A02);
        A1A.append(" duration: ");
        A1A.append(this.A03);
        A1A.append(" interpolator: ");
        TimeInterpolator timeInterpolator = this.A04;
        if (timeInterpolator == null) {
            timeInterpolator = AnonymousClass6Y2.A02;
        }
        A1A.append(timeInterpolator.getClass());
        A1A.append(" repeatCount: ");
        A1A.append(this.A00);
        A1A.append(" repeatMode: ");
        A1A.append(this.A01);
        return AnonymousClass7TF.A0l("}\n", A1A);
    }
}
