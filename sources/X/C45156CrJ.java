package X;

import com.instagram.api.schemas.GrowthFrictionInfo;
import com.instagram.api.schemas.GrowthFrictionInterventionCategories;
import com.instagram.api.schemas.GrowthFrictionInterventionDetail;
import com.instagram.user.model.User;

/* renamed from: X.CrJ  reason: case insensitive filesystem */
public abstract class C45156CrJ {
    public static final GrowthFrictionInterventionDetail A00(User user, Integer num) {
        GrowthFrictionInfo BAD;
        GrowthFrictionInterventionCategories BIc;
        GrowthFrictionInfo BAD2 = user.A03.BAD();
        boolean z = false;
        if (BAD2 != null && BAD2.BAW()) {
            z = true;
        }
        if (!z || (BAD = user.A03.BAD()) == null || (BIc = BAD.BIc()) == null) {
            return null;
        }
        if (num.intValue() != 1) {
            return BIc.BRb();
        }
        return BIc.C3r();
    }
}
