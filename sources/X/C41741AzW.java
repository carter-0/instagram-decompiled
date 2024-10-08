package X;

import com.instagram.api.schemas.StoryPollColorType;

/* renamed from: X.AzW  reason: case insensitive filesystem */
public final class C41741AzW extends 0Yg implements 0sP {
    public static final C41741AzW A00 = new C41741AzW();

    public C41741AzW() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = StoryPollColorType.A01.get(obj);
        if (obj2 == null) {
            return StoryPollColorType.UNRECOGNIZED;
        }
        return obj2;
    }
}
