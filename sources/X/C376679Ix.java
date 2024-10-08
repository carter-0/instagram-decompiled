package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.9Ix  reason: invalid class name and case insensitive filesystem */
public final class C376679Ix extends AnonymousClass0T0 implements C232272tM, AnonymousClass7FW {
    public final int A00 = 1;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final String A04;

    public C376679Ix(DirectMessageIdentifier directMessageIdentifier, String str, int i, int i2, int i3) {
        0qQ.A0B(str, 1);
        this.A04 = str;
        this.A03 = directMessageIdentifier;
        this.A02 = i;
        this.A01 = i2;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C376679Ix)) {
                return false;
            }
            C376679Ix r3 = (C376679Ix) obj;
            if (r3.A00 != 1 || !0qQ.A0K(this.A03, r3.A03) || !0qQ.A0K(this.A04, r3.A04) || this.A01 != r3.A01) {
                return false;
            }
            i = this.A02;
            i2 = r3.A02;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C376679Ix)) {
                return false;
            }
            C376679Ix r32 = (C376679Ix) obj;
            if (r32.A00 != 0 || !0qQ.A0K(this.A04, r32.A04) || !0qQ.A0K(this.A03, r32.A03) || this.A02 != r32.A02) {
                return false;
            }
            i = this.A01;
            i2 = r32.A01;
        }
        if (i != i2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        if (this.A00 != 0) {
            int hashCode3 = this.A03.hashCode() * 31;
            String str = this.A04;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            hashCode = (((hashCode3 + hashCode2) * 31) + this.A01) * 31;
            i = this.A02;
        } else {
            hashCode = ((((this.A04.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A02) * 31;
            i = this.A01;
        }
        return hashCode + i;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public C376679Ix(DirectMessageIdentifier directMessageIdentifier, String str, int i, int i2) {
        this.A03 = directMessageIdentifier;
        this.A04 = str;
        this.A01 = i;
        this.A02 = i2;
    }
}
