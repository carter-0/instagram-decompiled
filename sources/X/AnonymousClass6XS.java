package X;

import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.StoryPromptType;

/* renamed from: X.6XS  reason: invalid class name */
public abstract class AnonymousClass6XS {
    public static final C362088hK A00(CameraTool cameraTool) {
        if (cameraTool == null) {
            return null;
        }
        int ordinal = cameraTool.ordinal();
        if (ordinal == 115) {
            return C362088hK.A0B;
        }
        if (ordinal == 15) {
            return C362088hK.A09;
        }
        if (ordinal == 4) {
            return C362088hK.A0A;
        }
        return null;
    }

    public static final C362088hK A01(StoryPromptType storyPromptType) {
        int ordinal = storyPromptType.ordinal();
        if (ordinal == 6 || ordinal == 7) {
            return C362088hK.A09;
        }
        if (ordinal != 9) {
            return null;
        }
        return C362088hK.A0B;
    }
}
