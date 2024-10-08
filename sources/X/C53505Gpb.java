package X;

import com.instagram.android.R;

/* renamed from: X.Gpb  reason: case insensitive filesystem */
public final class C53505Gpb extends AnonymousClass0T0 implements C59640JRi {
    public final int A00 = 2131963750;
    public final int A01 = R.drawable.instagram_arrow_left_pano_outline_24;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53505Gpb)) {
            return false;
        }
        C53505Gpb gpb = (C53505Gpb) obj;
        if (this.A01 == gpb.A01 && this.A00 == gpb.A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.A01 * 31) + this.A00) * 31;
    }
}
