package X;

import com.instagram.api.schemas.StoryTextAttributionType;

/* renamed from: X.DMp  reason: case insensitive filesystem */
public final class C46110DMp extends 0Yg implements 0sP {
    public static final C46110DMp A00 = new C46110DMp();

    public C46110DMp() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = StoryTextAttributionType.A01.get(obj);
        if (obj2 == null) {
            return StoryTextAttributionType.UNRECOGNIZED;
        }
        return obj2;
    }
}
