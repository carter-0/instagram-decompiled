package X;

import com.instagram.api.schemas.InspirationSignalType;

/* renamed from: X.DKc  reason: case insensitive filesystem */
public final class C46045DKc extends 0Yg implements 0sP {
    public static final C46045DKc A00 = new C46045DKc();

    public C46045DKc() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = InspirationSignalType.A01.get(obj);
        if (obj2 == null) {
            return InspirationSignalType.UNRECOGNIZED;
        }
        return obj2;
    }
}
