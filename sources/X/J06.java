package X;

import com.instagram.api.schemas.ChallengeState;

public final class J06 extends 0Yg implements 0sP {
    public static final J06 A00 = new J06();

    public J06() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ChallengeState.A01.get(obj);
        if (obj2 == null) {
            return ChallengeState.UNRECOGNIZED;
        }
        return obj2;
    }
}
