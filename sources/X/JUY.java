package X;

import java.io.IOException;

public abstract class JUY {
    public static final C63815L7w A00(String str) {
        if (str != null) {
            try {
                return LID.parseFromJson(16P.A00(str));
            } catch (IOException e) {
                0kD.A06("ClipsBrandedContentDraftModel", "Failed to deserialize ClipsBrandedContentDraftModel from ClipsDraft", e);
            }
        }
        return null;
    }
}
