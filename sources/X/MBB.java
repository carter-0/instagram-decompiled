package X;

import com.instagram.api.schemas.CameraTool;
import com.instagram.model.direct.DirectShareTarget;
import java.util.function.Predicate;

public final class MBB implements Predicate {
    public final int A00;

    public MBB(int i) {
        this.A00 = i;
    }

    public final boolean test(Object obj) {
        switch (this.A00) {
            case 0:
                if (((LMH) obj).A00 == CameraTool.AI_CONTEXTUAL_BACKGROUND) {
                    return true;
                }
                return false;
            case 1:
                return ((DirectShareTarget) obj).A0M();
            default:
                if (obj != null) {
                    return true;
                }
                return false;
        }
    }
}
