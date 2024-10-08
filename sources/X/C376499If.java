package X;

import com.instagram.user.model.User;

/* renamed from: X.9If  reason: invalid class name and case insensitive filesystem */
public final class C376499If extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;

    public C376499If(C376459Ib r2, AnonymousClass3W1 r3, CharSequence charSequence, boolean z, boolean z2) {
        0qQ.A0B(charSequence, 4);
        this.A02 = r3;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = charSequence;
        this.A01 = r2;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C376499If)) {
                return false;
            }
            C376499If r3 = (C376499If) obj;
            if (r3.A00 != 1 || this.A04 != r3.A04 || !0qQ.A0K(this.A03, r3.A03) || this.A05 != r3.A05 || !0qQ.A0K(this.A01, r3.A01)) {
                return false;
            }
            obj2 = this.A02;
            obj3 = r3.A02;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C376499If)) {
                return false;
            }
            C376499If r32 = (C376499If) obj;
            if (r32.A00 != 0 || !0qQ.A0K(this.A02, r32.A02) || this.A05 != r32.A05 || this.A04 != r32.A04 || !0qQ.A0K(this.A03, r32.A03)) {
                return false;
            }
            obj2 = this.A01;
            obj3 = r32.A01;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Object obj;
        int hashCode2;
        if (this.A00 != 0) {
            int i = 1237;
            if (this.A04) {
                i = 1231;
            }
            int hashCode3 = ((i * 31) + this.A03.hashCode()) * 31;
            int i2 = 1237;
            if (this.A05) {
                i2 = 1231;
            }
            int i3 = (hashCode3 + i2) * 31;
            Object obj2 = this.A01;
            if (obj2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = obj2.hashCode();
            }
            hashCode = (i3 + hashCode2) * 31;
            obj = this.A02;
        } else {
            int hashCode4 = this.A02.hashCode() * 31;
            int i4 = 1237;
            if (this.A05) {
                i4 = 1231;
            }
            int i5 = (hashCode4 + i4) * 31;
            int i6 = 1237;
            if (this.A04) {
                i6 = 1231;
            }
            hashCode = (((i5 + i6) * 31) + this.A03.hashCode()) * 31;
            obj = this.A01;
        }
        return hashCode + obj.hashCode();
    }

    public C376499If(AnonymousClass9J2 r2, C381479bp r3, User user, boolean z, boolean z2) {
        this.A04 = z;
        this.A03 = user;
        this.A05 = z2;
        this.A01 = r3;
        this.A02 = r2;
    }
}
