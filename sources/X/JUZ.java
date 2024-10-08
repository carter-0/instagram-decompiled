package X;

import java.io.IOException;

public abstract class JUZ {
    public static final C61000Juw A00(String str) {
        if (str != null) {
            try {
                16F A03 = AnonymousClass15o.A00.A03(str);
                A03.A12();
                return LPS.parseFromJson(A03);
            } catch (IOException e) {
                0kD.A06("BioProductConverter", "Failed to deserialize UpcomingEvent from ClipsDraft", e);
            }
        }
        return null;
    }
}
