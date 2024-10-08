package X;

import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.9J1  reason: invalid class name */
public final class AnonymousClass9J1 extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public AnonymousClass9J1(Drawable drawable, Drawable drawable2, Integer num, String str) {
        0qQ.A0B(drawable, 3);
        this.A01 = num;
        this.A04 = str;
        this.A02 = drawable;
        this.A03 = drawable2;
    }

    public final boolean equals(Object obj) {
        AnonymousClass9J1 r3;
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass9J1)) {
                return false;
            }
            r3 = (AnonymousClass9J1) obj;
            if (r3.A00 != 1 || this.A01 != r3.A01 || !0qQ.A0K(this.A04, r3.A04)) {
                return false;
            }
            obj2 = this.A02;
            obj3 = r3.A02;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof AnonymousClass9J1)) {
                return false;
            }
            r3 = (AnonymousClass9J1) obj;
            if (r3.A00 != 0 || !0qQ.A0K(this.A01, r3.A01) || !0qQ.A0K(this.A02, r3.A02)) {
                return false;
            }
            obj2 = this.A04;
            obj3 = r3.A04;
        }
        if (!0qQ.A0K(obj2, obj3) || !0qQ.A0K(this.A03, r3.A03)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str;
        if (this.A00 != 0) {
            int intValue = ((Number) this.A01).intValue();
            switch (intValue) {
                case 1:
                    str = "DISAPPEARING";
                    break;
                case 2:
                    str = "VIEW_ONCE";
                    break;
                default:
                    str = "KEEP_IN_CHAT";
                    break;
            }
            return ((((((str.hashCode() + intValue) * 31) + this.A04.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode();
        }
        int hashCode3 = this.A01.hashCode() * 31;
        Object obj = this.A02;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str2 = this.A04;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Object obj2 = this.A03;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return i3 + i;
    }

    public AnonymousClass9J1(String str, List list, List list2, List list3) {
        0qQ.A0B(list, 1);
        this.A01 = list;
        this.A02 = list2;
        this.A04 = str;
        this.A03 = list3;
    }
}
