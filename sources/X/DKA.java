package X;

import com.instagram.api.schemas.IGLiveGames;

public final class DKA extends 0Yg implements 0sP {
    public static final DKA A00 = new DKA();

    public DKA() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGLiveGames.A01.get(obj);
        if (obj2 == null) {
            return IGLiveGames.UNRECOGNIZED;
        }
        return obj2;
    }
}
