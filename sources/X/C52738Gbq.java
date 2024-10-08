package X;

import com.instagram.android.R;

/* renamed from: X.Gbq  reason: case insensitive filesystem */
public final class C52738Gbq extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    public C52738Gbq(C62320sa r4, int i, int i2) {
        int i3;
        this.A00 = i2;
        int i4 = 0;
        int i5 = 0;
        switch (i2) {
            case 0:
                i4 = (i & 1) != 0 ? R.drawable.instagram_arrow_left_pano_outline_24 : i4;
                i5 = (i & 2) != 0 ? 2131963750 : i5;
                r4 = (i & 4) != 0 ? null : r4;
                i3 = 0;
                break;
            case 1:
                i4 = (i & 1) != 0 ? R.drawable.instagram_x_pano_outline_24 : i4;
                i5 = (i & 2) != 0 ? 2131960862 : i5;
                r4 = (i & 4) != 0 ? null : r4;
                i3 = 1;
                break;
            default:
                r4 = (i & 4) != 0 ? null : r4;
                i3 = 2;
                break;
        }
        this.A00 = i3;
        this.A02 = i4;
        this.A01 = i5;
        this.A03 = r4;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (!(obj instanceof C52738Gbq)) {
            return false;
        }
        C52738Gbq gbq = (C52738Gbq) obj;
        if (gbq.A00 == i && this.A02 == gbq.A02 && this.A01 == gbq.A01 && 0qQ.A0K(this.A03, gbq.A03)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.A02 * 31) + this.A01) * 31) + AnonymousClass7TG.A0C(this.A03);
    }
}
