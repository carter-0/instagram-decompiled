package X;

import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;
import java.util.List;

/* renamed from: X.9Ih  reason: invalid class name and case insensitive filesystem */
public final class C376519Ih extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public C376519Ih(C359218cI r3, List list) {
        this(r3, AnonymousClass05K.A0Y, (Long) null, list);
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C376519Ih)) {
                return false;
            }
            C376519Ih r3 = (C376519Ih) obj;
            if (r3.A00 != 1 || this.A05 != r3.A05 || !0qQ.A0K(this.A01, r3.A01) || !0qQ.A0K(this.A02, r3.A02) || !0qQ.A0K(this.A04, r3.A04) || this.A03 != r3.A03) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C376519Ih)) {
                return false;
            }
            C376519Ih r32 = (C376519Ih) obj;
            if (r32.A00 != 0 || !0qQ.A0K(this.A01, r32.A01) || !0qQ.A0K(this.A02, r32.A02) || this.A03 != r32.A03 || !0qQ.A0K(this.A04, r32.A04)) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        String str;
        int hashCode;
        Object obj;
        int i;
        int hashCode2;
        int hashCode3;
        if (this.A00 != 0) {
            int i2 = 1237;
            if (this.A05) {
                i2 = 1231;
            }
            int i3 = i2 * 31;
            Object obj2 = this.A01;
            int i4 = 0;
            if (obj2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = obj2.hashCode();
            }
            int i5 = (i3 + hashCode2) * 31;
            Object obj3 = this.A02;
            if (obj3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = obj3.hashCode();
            }
            int i6 = (i5 + hashCode3) * 31;
            Object obj4 = this.A04;
            if (obj4 != null) {
                i4 = obj4.hashCode();
            }
            hashCode = (i6 + i4) * 31;
            obj = this.A03;
        } else {
            int hashCode4 = ((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31;
            int intValue = ((Number) this.A03).intValue();
            switch (intValue) {
                case 1:
                    str = "IN_MEMORY_CACHE";
                    break;
                case 2:
                    str = "DB";
                    break;
                case 3:
                    str = "EXPIRED_DB";
                    break;
                case 4:
                    str = "NETWORK";
                    break;
                case 5:
                    str = "PARTIAL_CACHE";
                    break;
                default:
                    str = "HTTP_CACHE";
                    break;
            }
            hashCode = (hashCode4 + str.hashCode() + intValue) * 31;
            obj = this.A04;
            if (obj == null) {
                i = 0;
                return hashCode + i;
            }
        }
        i = obj.hashCode();
        return hashCode + i;
    }

    public C376519Ih(C359218cI r3, Integer num, Long l, List list) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(list, 2);
        this.A01 = r3;
        this.A02 = list;
        this.A03 = num;
        this.A04 = l;
        this.A05 = num != AnonymousClass05K.A0Y;
    }

    public C376519Ih(C242243Te r3, CreatorSubscriberThreadInfo creatorSubscriberThreadInfo, List list, boolean z) {
        C327857Cl r0 = C327857Cl.ADMIN_ONLY;
        this.A00 = 1;
        this.A05 = z;
        this.A01 = creatorSubscriberThreadInfo;
        this.A02 = r3;
        this.A04 = list;
        this.A03 = r0;
    }
}
