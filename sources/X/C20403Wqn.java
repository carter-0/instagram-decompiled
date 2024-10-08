package X;

import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import java.util.function.Predicate;

/* renamed from: X.Wqn  reason: case insensitive filesystem */
public final /* synthetic */ class C20403Wqn implements Predicate {
    public final boolean test(Object obj) {
        UNQ unq = (UNQ) obj;
        if (unq.A00 != ProfileGridItemTypeEnum.MEDIA || unq.A01 == null) {
            return false;
        }
        return true;
    }
}
