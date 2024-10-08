package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.3H4  reason: invalid class name */
public final class AnonymousClass3H4 {
    public final AnonymousClass3H3 A00;
    public final List A01;
    public final Map A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
                return false;
            }
            AnonymousClass3H4 r5 = (AnonymousClass3H4) obj;
            if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01, this.A02});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DirectBadgeInfo{badgeCount=");
        sb.append(this.A00);
        sb.append(", threadBadgeInfoList=");
        sb.append(this.A01);
        sb.append(", accountUnreadFolderCountMap=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }

    public AnonymousClass3H4(AnonymousClass3H3 r2, List list, Map map) {
        ImmutableList immutableList;
        ImmutableMap immutableMap;
        this.A00 = r2;
        if (list != null) {
            immutableList = ImmutableList.copyOf((Collection) list);
            0qQ.A07(immutableList);
        } else {
            immutableList = 0sn.A00;
        }
        this.A01 = immutableList;
        if (map != null) {
            immutableMap = ImmutableMap.copyOf(map);
        } else {
            immutableMap = RegularImmutableMap.A02;
        }
        this.A02 = immutableMap;
    }
}
