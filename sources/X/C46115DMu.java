package X;

import com.instagram.api.schemas.UpcomingEventStickerSource;

/* renamed from: X.DMu  reason: case insensitive filesystem */
public final class C46115DMu extends 0Yg implements 0sP {
    public static final C46115DMu A00 = new C46115DMu();

    public C46115DMu() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = UpcomingEventStickerSource.A01.get(obj);
        if (obj2 == null) {
            return UpcomingEventStickerSource.UNRECOGNIZED;
        }
        return obj2;
    }
}
