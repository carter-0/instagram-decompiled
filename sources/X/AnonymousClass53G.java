package X;

import com.instagram.model.direct.gifs.DirectAnimatedMediaUser;

/* renamed from: X.53G  reason: invalid class name */
public final class AnonymousClass53G extends AnonymousClass0T0 implements AnonymousClass53H {
    public final AnonymousClass9IE A00;
    public final DirectAnimatedMediaUser A01;
    public final Boolean A02;
    public final Boolean A03;
    public final String A04;
    public final boolean A05;

    public AnonymousClass53G(AnonymousClass9IE r2, DirectAnimatedMediaUser directAnimatedMediaUser, Boolean bool, Boolean bool2, String str, boolean z) {
        0qQ.A0B(str, 1);
        this.A04 = str;
        this.A03 = bool;
        this.A05 = z;
        this.A00 = r2;
        this.A01 = directAnimatedMediaUser;
        this.A02 = bool2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass53G) {
                AnonymousClass53G r5 = (AnonymousClass53G) obj;
                if (!0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A03, r5.A03) || this.A05 != r5.A05 || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final DirectAnimatedMediaUser CCc() {
        return this.A01;
    }

    public final Boolean COc() {
        return this.A02;
    }

    public final boolean CcW() {
        return this.A05;
    }

    public final String getId() {
        return this.A04;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.A04.hashCode() * 31;
        Boolean bool = this.A03;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        int i3 = 1237;
        if (this.A05) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        AnonymousClass9IE r0 = this.A00;
        if (r0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r0.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        DirectAnimatedMediaUser directAnimatedMediaUser = this.A01;
        if (directAnimatedMediaUser == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = directAnimatedMediaUser.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        Boolean bool2 = this.A02;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return i6 + i;
    }
}
