package X;

import com.instagram.android.R;

/* renamed from: X.Gpm  reason: case insensitive filesystem */
public final class C53516Gpm extends AnonymousClass0T0 implements JPI {
    public final int A00 = R.drawable.instagram_chevron_down_outline_16;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53516Gpm) {
                C53516Gpm gpm = (C53516Gpm) obj;
                if (!(this.A00 == gpm.A00 && 0qQ.A0K(this.A01, gpm.A01) && this.A02 == gpm.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean getEnabled() {
        return this.A02;
    }

    public final Object getKey() {
        return null;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A08(this.A01, this.A00 * 31));
    }

    public C53516Gpm(String str, boolean z) {
        this.A01 = str;
        this.A02 = z;
    }
}
