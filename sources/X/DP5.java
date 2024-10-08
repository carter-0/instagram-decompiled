package X;

import com.instagram.api.schemas.IGAIAgentVisibilityStatus;

public final class DP5 extends 0Yg implements 0sP {
    public static final DP5 A00 = new DP5();

    public DP5() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGAIAgentVisibilityStatus.A01.get(obj);
        if (obj2 == null) {
            return IGAIAgentVisibilityStatus.UNRECOGNIZED;
        }
        return obj2;
    }
}
