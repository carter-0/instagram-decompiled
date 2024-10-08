package X;

import com.instagram.android.R;

/* renamed from: X.N3x  reason: case insensitive filesystem */
public final class C68182N3x extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public C68182N3x(String str, int i, int i2, int i3) {
        this.A00 = 0;
        this.A04 = str;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C68182N3x)) {
                return false;
            }
            C68182N3x n3x = (C68182N3x) obj;
            if (n3x.A00 == 1 && this.A01 == n3x.A01 && this.A03 == n3x.A03 && this.A02 == n3x.A02 && 0qQ.A0K(this.A04, n3x.A04)) {
                return true;
            }
            return false;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C68182N3x)) {
                return false;
            }
            C68182N3x n3x2 = (C68182N3x) obj;
            if (n3x2.A00 == 0 && 0qQ.A0K(this.A04, n3x2.A04) && this.A02 == n3x2.A02 && this.A03 == n3x2.A03 && this.A01 == n3x2.A01) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int A0O;
        int i;
        if (this.A00 != 0) {
            A0O = ((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31;
            i = this.A04.hashCode();
        } else {
            A0O = (((AnonymousClass7TE.A0O(this.A04) + this.A02) * 31) + this.A03) * 31;
            i = this.A01;
        }
        return A0O + i;
    }

    public final String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("UiGraphSingleSurfaceState(surfaceName=");
        A1A.append(this.A04);
        A1A.append(", rowsCount=");
        A1A.append(this.A02);
        A1A.append(", topRow=");
        A1A.append(this.A03);
        A1A.append(", bottomRow=");
        return C51975G9x.A0j(A1A, this.A01);
    }

    public C68182N3x(int i, int i2, String str) {
        this.A00 = 1;
        this.A01 = R.drawable.instagram_lock_filled_12;
        this.A03 = i;
        this.A02 = i2;
        this.A04 = str;
    }
}
