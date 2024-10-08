package X;

import java.io.IOException;

public abstract class JUW {
    public static final C279584ys A00(String str) {
        if (str != null) {
            try {
                return C67211sN.parseFromJson(16P.A00(str));
            } catch (IOException e) {
                0kD.A06("ClipsTemplateInfoConverter", "Failed to deserialize ClipsTemplateInfo from ClipsDraft", e);
            }
        }
        return null;
    }
}
