package X;

import com.instagram.api.schemas.IGAIAgentVisibilityStatus;

public final class DPG extends 0Yg implements 0sP {
    public static final DPG A00 = new DPG();

    public DPG() {
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
