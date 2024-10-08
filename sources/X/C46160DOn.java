package X;

import com.instagram.api.schemas.PollType;

/* renamed from: X.DOn  reason: case insensitive filesystem */
public final class C46160DOn extends 0Yg implements 0sP {
    public static final C46160DOn A00 = new C46160DOn();

    public C46160DOn() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = PollType.A01.get(obj);
        if (obj2 == null) {
            return PollType.UNRECOGNIZED;
        }
        return obj2;
    }
}
