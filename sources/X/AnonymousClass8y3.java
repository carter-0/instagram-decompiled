package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.8y3  reason: invalid class name */
public final class AnonymousClass8y3 implements AnonymousClass5Ef {
    public final int A00;
    public final ImageUrl A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final String A05;

    public final String B8E() {
        return this.A05;
    }

    public final String BJR() {
        return this.A02;
    }

    public final int Boe() {
        return 0;
    }

    public final boolean COf() {
        return this.A03;
    }

    public final boolean CeS() {
        return this.A04;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return 0qQ.A0K(this.A02, ((AnonymousClass8y3) obj).A02);
    }

    public final int getDuration() {
        return this.A00;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public final boolean isValid() {
        if (this.A01 != null) {
            return true;
        }
        return false;
    }

    public AnonymousClass8y3(ImageUrl imageUrl, String str, int i, boolean z, boolean z2) {
        this.A02 = str;
        this.A01 = imageUrl;
        this.A04 = z;
        this.A00 = i;
        this.A03 = z2;
        this.A05 = C347917xa.A01(i);
    }
}
