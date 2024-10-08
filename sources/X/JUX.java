package X;

import java.io.IOException;

public abstract class JUX {
    public static final C61062Jw0 A00(String str) {
        if (str != null) {
            try {
                return C45890D9t.parseFromJson(16P.A00(str));
            } catch (IOException e) {
                0kD.A06("ClipsShoppingMetadataConverter", "Failed to deserialize ClipsBrandedContentDraftModel from ClipsDraft", e);
            }
        }
        return null;
    }
}
