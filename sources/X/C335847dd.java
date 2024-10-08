package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.7dd  reason: invalid class name and case insensitive filesystem */
public final class C335847dd extends AnonymousClass0T0 {
    public final ImageUrl A00;
    public final 1iA A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C335847dd) {
                C335847dd r5 = (C335847dd) obj;
                if (!0qQ.A0K(this.A04, r5.A04) || this.A05 != r5.A05 || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.A04;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        int i3 = 1237;
        if (this.A05) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        ImageUrl imageUrl = this.A00;
        if (imageUrl == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = imageUrl.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        User user = this.A02;
        if (user == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = user.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        String str2 = this.A03;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        1iA r0 = this.A01;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return i7 + i;
    }

    public C335847dd(ImageUrl imageUrl, 1iA r2, User user, String str, String str2, boolean z) {
        this.A04 = str;
        this.A05 = z;
        this.A00 = imageUrl;
        this.A02 = user;
        this.A03 = str2;
        this.A01 = r2;
    }

    public C335847dd() {
        this((ImageUrl) null, (1iA) null, (User) null, (String) null, (String) null, false);
    }
}
