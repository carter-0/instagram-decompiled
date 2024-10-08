package X;

import com.instagram.api.schemas.StoryTrendingPromptMediaSubType;

/* renamed from: X.DMs  reason: case insensitive filesystem */
public final class C46113DMs extends 0Yg implements 0sP {
    public static final C46113DMs A00 = new C46113DMs();

    public C46113DMs() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = StoryTrendingPromptMediaSubType.A01.get(obj);
        if (obj2 == null) {
            return StoryTrendingPromptMediaSubType.UNRECOGNIZED;
        }
        return obj2;
    }
}
