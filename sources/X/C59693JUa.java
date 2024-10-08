package X;

import java.io.IOException;

/* renamed from: X.JUa  reason: case insensitive filesystem */
public abstract class C59693JUa {
    public static final C61080JwI A00(String str) {
        if (str != null) {
            try {
                16F A03 = AnonymousClass15o.A00.A03(str);
                A03.A12();
                return C45664D0o.parseFromJson(A03);
            } catch (IOException e) {
                0kD.A06("TrialParamsConverter", "Failed to deserialize TrialParams from ClipsDraft", e);
            }
        }
        return null;
    }
}
