package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;

/* renamed from: X.8nh  reason: invalid class name and case insensitive filesystem */
public final class C365798nh {
    public Bitmap A00;
    public Bitmap A01;
    public C352218Cl A02;
    public C349307zv A03;
    public boolean A04;
    public final C365758nd A05;
    public final String A06;

    public final Medium A00() {
        if (this.A05.ordinal() != 0) {
            C349307zv r0 = this.A03;
            r0.getClass();
            return r0.A0R;
        }
        C352218Cl r02 = this.A02;
        r02.getClass();
        return r02.A0F;
    }

    public final String A01() {
        if (this.A05.ordinal() != 0) {
            C349307zv r0 = this.A03;
            r0.getClass();
            return r0.A0h;
        }
        C352218Cl r02 = this.A02;
        r02.getClass();
        return r02.A06();
    }

    public final String A02() {
        if (this.A05.ordinal() != 0) {
            C349307zv r0 = this.A03;
            r0.getClass();
            return r0.A0k;
        }
        C352218Cl r02 = this.A02;
        r02.getClass();
        return r02.A06();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C365798nh)) {
            return false;
        }
        C365798nh r4 = (C365798nh) obj;
        if (this.A05 == r4.A05) {
            return 2PP.A00(this.A06, r4.A06);
        }
        return false;
    }

    public final int hashCode() {
        return this.A06.hashCode();
    }

    public C365798nh(C349307zv r2, String str) {
        this.A04 = false;
        this.A05 = C365758nd.A07;
        this.A03 = r2;
        this.A06 = str;
    }

    public C365798nh(Bitmap bitmap, C352218Cl r3, String str, boolean z) {
        this.A04 = false;
        this.A05 = C365758nd.A04;
        this.A02 = r3;
        this.A06 = str;
        this.A01 = bitmap;
        this.A04 = z;
    }

    public C365798nh(Bitmap bitmap, C349307zv r3, String str) {
        this.A04 = false;
        this.A05 = C365758nd.A07;
        this.A03 = r3;
        this.A06 = str;
        this.A00 = bitmap;
    }

    public C365798nh(C352218Cl r4) {
        this((Bitmap) null, r4, r4.A0h, false);
    }

    public C365798nh(C349307zv r2) {
        this(r2, r2.A07());
    }
}
