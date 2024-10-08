package X;

import com.instagram.api.schemas.ChallengeState;

public final class J03 extends 0Yg implements 0sP {
    public static final J03 A00 = new J03();

    public J03() {
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
