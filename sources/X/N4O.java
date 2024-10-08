package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.android.R;
import java.util.List;
import java.util.Map;

public final class N4O extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;

    public N4O(Boolean bool, Boolean bool2, Integer num, Long l, int i, int i2) {
        this.A02 = 2;
        l = (i2 & 1) != 0 ? null : l;
        num = (i2 & 2) != 0 ? AnonymousClass05K.A0C : num;
        i = (i2 & 4) != 0 ? -1 : i;
        bool = (i2 & 8) != 0 ? null : bool;
        bool2 = (i2 & 16) != 0 ? null : bool2;
        this.A02 = 2;
        0qQ.A0B(num, 2);
        this.A01 = l;
        this.A05 = num;
        this.A03 = i;
        this.A04 = bool;
        this.A00 = bool2;
    }

    public final boolean A00() {
        if (JTS.A06((Number) this.A01) > 0 || AnonymousClass7TF.A1Y(this.A00, true)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        N4O n4o;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        switch (this.A02) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof N4O) {
                    n4o = (N4O) obj;
                    if (n4o.A02 == 0 && this.A03 == n4o.A03 && 0qQ.A0K(this.A04, n4o.A04) && 0qQ.A0K(this.A01, n4o.A01)) {
                        obj2 = this.A05;
                        obj3 = n4o.A05;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof N4O)) {
                    return false;
                }
                N4O n4o2 = (N4O) obj;
                if (n4o2.A02 != 1 || !0qQ.A0K(this.A04, n4o2.A04) || !0qQ.A0K(this.A00, n4o2.A00) || !0qQ.A0K(this.A01, n4o2.A01) || this.A03 != n4o2.A03 || this.A05 != n4o2.A05) {
                    return false;
                }
                return true;
            case 2:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof N4O) {
                    n4o = (N4O) obj;
                    if (n4o.A02 == 2 && 0qQ.A0K(this.A01, n4o.A01) && this.A05 == n4o.A05 && this.A03 == n4o.A03) {
                        obj2 = this.A04;
                        obj3 = n4o.A04;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof N4O) {
                    N4O n4o3 = (N4O) obj;
                    if (n4o3.A02 == 3 && 0qQ.A0K(this.A00, n4o3.A00) && this.A03 == n4o3.A03 && 0qQ.A0K(this.A04, n4o3.A04) && 0qQ.A0K(this.A01, n4o3.A01)) {
                        obj4 = this.A05;
                        obj5 = n4o3.A05;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        obj4 = this.A00;
        obj5 = n4o.A00;
        if (!0qQ.A0K(obj4, obj5)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A032;
        int i;
        int A0L;
        String str;
        String str2;
        switch (this.A02) {
            case 0:
                int A0C = ((((this.A03 * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31;
                2Wd r1 = (2Wd) this.A05;
                if (r1 == null) {
                    A032 = 0;
                } else {
                    A032 = C51968G9o.A03(r1.A00);
                }
                i = (A0C + A032) * 31;
                A0L = AnonymousClass7TE.A0L(this.A00);
                break;
            case 1:
                A0L = (((((AnonymousClass7TE.A0K(this.A04) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31) + this.A03) * 31;
                int A0M = AnonymousClass7TE.A0M(this.A05);
                if (1 != A0M) {
                    str = "BANNER";
                } else {
                    str = "MEGAPHONE";
                }
                i = C51966G9m.A04(str, A0M);
                break;
            case 2:
                int A0C2 = AnonymousClass7TG.A0C(this.A01) * 31;
                int A0M2 = AnonymousClass7TE.A0M(this.A05);
                switch (A0M2) {
                    case 1:
                        str2 = "EXPIRED";
                        break;
                    case 2:
                        str2 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                        break;
                    default:
                        str2 = "UNSENT";
                        break;
                }
                i = (((C51971G9r.A0F(str2, A0M2, A0C2) + this.A03) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31;
                A0L = AnonymousClass7TE.A0L(this.A00);
                break;
            default:
                A0L = AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A04, (AnonymousClass7TE.A0K(this.A00) + this.A03) * 31));
                i = this.A05.hashCode();
                break;
        }
        return i + A0L;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public N4O(CharSequence charSequence, CharSequence charSequence2, Integer num) {
        this(charSequence, charSequence2, (CharSequence) null, num, (int) R.drawable.instagram_lock_pano_outline_24);
        this.A02 = 1;
    }

    public N4O(2Wd r4, Integer num, Integer num2, Object obj, int i, int i2) {
        this.A02 = 0;
        num = (i2 & 2) != 0 ? null : num;
        obj = (i2 & 4) != 0 ? null : obj;
        r4 = (i2 & 8) != 0 ? null : r4;
        num2 = (i2 & 16) != 0 ? null : num2;
        this.A02 = 0;
        this.A03 = i;
        this.A04 = num;
        this.A01 = obj;
        this.A05 = r4;
        this.A00 = num2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public N4O(X.C48178EaK r2, java.util.List r3, java.util.List r4, java.util.Map r5, kotlin.jvm.internal.DefaultConstructorMarker r6, int r7, int r8, int r9) {
        /*
            r1 = this;
            r0 = 3
            r1.A02 = r0
            X.0sn r3 = X.0sn.A00
            r6 = 0
            X.EKo r2 = X.C47868EKo.A00
            X.0sm r5 = X.0Yt.A0E()
            r4 = r3
            r1.<init>((X.C48178EaK) r2, (java.util.List) r3, (java.util.List) r4, (java.util.Map) r5, (int) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N4O.<init>(X.EaK, java.util.List, java.util.List, java.util.Map, kotlin.jvm.internal.DefaultConstructorMarker, int, int, int):void");
    }

    public N4O(C48178EaK eaK, List list, List list2, Map map, int i) {
        this.A02 = 3;
        C51973G9u.A0r(3, list2, eaK, map);
        this.A00 = list;
        this.A03 = i;
        this.A04 = list2;
        this.A01 = eaK;
        this.A05 = map;
    }

    public N4O(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Integer num, int i) {
        this.A02 = 1;
        this.A04 = charSequence;
        this.A00 = charSequence2;
        this.A01 = charSequence3;
        this.A03 = i;
        this.A05 = num;
    }

    public N4O() {
        this.A02 = 2;
        this.A02 = 2;
        Integer num = AnonymousClass05K.A0C;
        this.A02 = 2;
        0qQ.A0B(num, 2);
        this.A01 = null;
        this.A05 = num;
        this.A03 = -1;
        this.A04 = null;
        this.A00 = null;
    }
}
