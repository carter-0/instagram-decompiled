package X;

import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import java.util.function.Predicate;

/* renamed from: X.Wqm  reason: case insensitive filesystem */
public final /* synthetic */ class C20402Wqm implements Predicate {
    public final boolean test(Object obj) {
        C17884Vhb vhb = (C17884Vhb) obj;
        if (vhb.A01 != ProfileGridItemTypeEnum.HIGHLIGHT || vhb.A03 == null) {
            return false;
        }
        return true;
    }
}
