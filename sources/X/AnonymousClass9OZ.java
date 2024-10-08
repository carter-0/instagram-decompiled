package X;

import java.io.IOException;

/* renamed from: X.9OZ  reason: invalid class name */
public abstract class AnonymousClass9OZ {
    public static final C370018vh A00(String str) {
        if (str != null) {
            try {
                return C370008vg.parseFromJson(16P.A00(str));
            } catch (IOException e) {
                0kD.A06("SerializedMediaEditsConverter", "Failed to deserialize SerializedMediaEdits from Clips draft.", e);
            }
        }
        return null;
    }
}
