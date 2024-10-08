package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3QG  reason: invalid class name */
public final class AnonymousClass3QG {
    public int A00 = 100;
    public int A01 = 0;
    public List A02;
    public List A03;

    public final boolean equals(Object obj) {
        Class<?> cls;
        int i;
        int i2;
        List unmodifiableList;
        List unmodifiableList2;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!0qQ.A0K(cls2, cls)) {
            return false;
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.pendingmedia.model.VideoFilterSetting");
        AnonymousClass3QG r4 = (AnonymousClass3QG) obj;
        if (this.A00 == r4.A00 && this.A01 == r4.A01) {
            List list = r4.A03;
            if (list == null || (unmodifiableList2 = Collections.unmodifiableList(list)) == null) {
                i = 0;
            } else {
                i = unmodifiableList2.size();
            }
            List list2 = this.A03;
            if (list2 == null || (unmodifiableList = Collections.unmodifiableList(list2)) == null) {
                i2 = 0;
            } else {
                i2 = unmodifiableList.size();
            }
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        List unmodifiableList;
        Integer valueOf = Integer.valueOf(this.A00);
        Integer valueOf2 = Integer.valueOf(this.A01);
        List list = this.A03;
        if (list == null || (unmodifiableList = Collections.unmodifiableList(list)) == null) {
            i = 0;
        } else {
            i = unmodifiableList.size();
        }
        return Arrays.hashCode(new Object[]{valueOf, valueOf2, Integer.valueOf(i)});
    }
}
