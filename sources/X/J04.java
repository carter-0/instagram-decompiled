package X;

import com.instagram.api.schemas.ChallengeButtonAction;

public final class J04 extends 0Yg implements 0sP {
    public static final J04 A00 = new J04();

    public J04() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ChallengeButtonAction.A01.get(obj);
        if (obj2 == null) {
            return ChallengeButtonAction.UNRECOGNIZED;
        }
        return obj2;
    }
}
