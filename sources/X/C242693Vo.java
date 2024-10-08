package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.3Vo  reason: invalid class name and case insensitive filesystem */
public final class C242693Vo {
    public final C226952iF A00;
    public final AnonymousClass3WR A01;
    public final String A02;

    public final boolean equals(Object obj) {
        ImageUrl imageUrl;
        if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
            return false;
        }
        C242693Vo r4 = (C242693Vo) obj;
        if (!0qQ.A0K(this.A02, r4.A02)) {
            return false;
        }
        C226952iF r0 = this.A00;
        if (r0 != null) {
            ImageUrl BGK = r0.BGK();
            C226952iF r02 = r4.A00;
            if (r02 != null) {
                imageUrl = r02.BGK();
            } else {
                imageUrl = null;
            }
            if (!2Ob.A00(BGK, imageUrl)) {
                return false;
            }
        } else if (r4.A00 != null) {
            return false;
        }
        return 2Ob.A00(this.A01, r4.A01);
    }

    public final int hashCode() {
        String str = this.A02;
        if (str == null) {
            return super.hashCode();
        }
        int hashCode = str.hashCode() * 31;
        int i = 1;
        int i2 = 0;
        if (this.A00 != null) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        if (this.A01 == null) {
            i = 0;
        }
        return i3 + i;
    }

    public final String toString() {
        String str;
        String str2 = this.A02;
        C226952iF r0 = this.A00;
        String str3 = null;
        if (r0 != null) {
            str = r0.AjI();
        } else {
            str = null;
        }
        AnonymousClass3WR r02 = this.A01;
        if (r02 != null) {
            str3 = r02.A02();
        }
        return 002.A13("ID = ", str2, ", Image = ", str, ", Video = ", str3);
    }

    public C242693Vo(C226952iF r1, AnonymousClass3WR r2, String str) {
        this.A02 = str;
        this.A00 = r1;
        this.A01 = r2;
    }
}
