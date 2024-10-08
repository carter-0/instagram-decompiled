package X;

import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import java.util.function.Predicate;

/* renamed from: X.Wql  reason: case insensitive filesystem */
public final /* synthetic */ class C20401Wql implements Predicate {
    public final boolean test(Object obj) {
        C17884Vhb vhb = (C17884Vhb) obj;
        if (vhb.A01 != ProfileGridItemTypeEnum.MEDIA || vhb.A02 == null) {
            return false;
        }
        return true;
    }
}
