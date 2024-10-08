package X;

import com.instagram.clips.model.metadata.InteractionUpsellCTAType;

public final class J1Q extends 0Yg implements 0sP {
    public static final J1Q A00 = new J1Q();

    public J1Q() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = InteractionUpsellCTAType.A01.get(obj);
        if (obj2 == null) {
            return InteractionUpsellCTAType.UNRECOGNIZED;
        }
        return obj2;
    }
}
