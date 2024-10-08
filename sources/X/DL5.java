package X;

import com.instagram.api.schemas.ListeningNowState;

public final class DL5 extends 0Yg implements 0sP {
    public static final DL5 A00 = new DL5();

    public DL5() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ListeningNowState.A01.get(obj);
        if (obj2 == null) {
            return ListeningNowState.UNRECOGNIZED;
        }
        return obj2;
    }
}
