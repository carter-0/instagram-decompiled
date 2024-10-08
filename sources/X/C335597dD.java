package X;

import com.instagram.api.schemas.NudgeType;
import com.instagram.api.schemas.NudgeVisualType;
import java.util.List;

/* renamed from: X.7dD  reason: invalid class name and case insensitive filesystem */
public final class C335597dD extends AnonymousClass0T0 implements C335607dE {
    public final NudgeType A00;
    public final NudgeVisualType A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C335597dD) {
                C335597dD r5 = (C335597dD) obj;
                if (!(0qQ.A0K(this.A02, r5.A02) && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A02;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        NudgeType nudgeType = this.A00;
        int hashCode2 = (hashCode + (nudgeType == null ? 0 : nudgeType.hashCode())) * 31;
        NudgeVisualType nudgeVisualType = this.A01;
        if (nudgeVisualType != null) {
            i = nudgeVisualType.hashCode();
        }
        return hashCode2 + i;
    }

    public C335597dD(NudgeType nudgeType, NudgeVisualType nudgeVisualType, List list) {
        this.A02 = list;
        this.A00 = nudgeType;
        this.A01 = nudgeVisualType;
    }
}
