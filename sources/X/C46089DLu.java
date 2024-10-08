package X;

import com.instagram.api.schemas.SocialContextType;

/* renamed from: X.DLu  reason: case insensitive filesystem */
public final class C46089DLu extends 0Yg implements 0sP {
    public static final C46089DLu A00 = new C46089DLu();

    public C46089DLu() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = SocialContextType.A01.get(obj);
        if (obj2 == null) {
            return SocialContextType.UNRECOGNIZED;
        }
        return obj2;
    }
}
