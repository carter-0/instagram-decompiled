package X;

import java.io.IOException;

public abstract class JUR {
    public static final AnonymousClass9P8 A00(String str) {
        if (str != null) {
            try {
                return AnonymousClass9P7.parseFromJson(16P.A00(str));
            } catch (IOException e) {
                0kD.A06("ClipsRemixDraftModelConverter", "Failed to deserialize ClipsRemixDraftModel from ClipsDraft", e);
            }
        }
        return null;
    }
}
