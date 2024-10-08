package X;

import com.instagram.api.schemas.StoryPromptType;

/* renamed from: X.DMd  reason: case insensitive filesystem */
public final class C46098DMd extends 0Yg implements 0sP {
    public static final C46098DMd A00 = new C46098DMd();

    public C46098DMd() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = StoryPromptType.A01.get(obj);
        if (obj2 == null) {
            return StoryPromptType.UNRECOGNIZED;
        }
        return obj2;
    }
}
