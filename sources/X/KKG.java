package X;

import com.instagram.android.R;

public final class KKG extends C63945LEl {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KKG) {
                KKG kkg = (KKG) obj;
                if (this.A00 != kkg.A00 || !0qQ.A0K(this.A01, kkg.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, this.A00 * 31);
    }

    public KKG(int i, String str) {
        super(i, Integer.valueOf(R.drawable.instagram_glasses_pano_outline_24));
        this.A00 = i;
        this.A01 = str;
    }
}
