package X;

import com.instagram.common.gallery.Medium;

public final class KK0 extends L05 {
    public final long A00;
    public final long A01;
    public final Medium A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KK0) {
                KK0 kk0 = (KK0) obj;
                if (!(0qQ.A0K(this.A02, kk0.A02) && this.A01 == kk0.A01 && this.A00 == kk0.A00 && this.A03 == kk0.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A03, AnonymousClass7TF.A01(this.A00, AnonymousClass7TF.A01(this.A01, AnonymousClass7TE.A0K(this.A02))));
    }

    public KK0(Medium medium, long j, long j2, boolean z) {
        super(medium);
        this.A02 = medium;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = z;
    }
}
