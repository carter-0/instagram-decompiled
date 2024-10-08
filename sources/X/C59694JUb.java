package X;

import java.io.IOException;

/* renamed from: X.JUb  reason: case insensitive filesystem */
public abstract class C59694JUb {
    public static final C61100JxB A00(String str) {
        if (str != null) {
            try {
                16F A03 = AnonymousClass15o.A00.A03(str);
                A03.A12();
                return C63980LGx.parseFromJson(A03);
            } catch (IOException e) {
                0kD.A06("ContentSchedulingMetadataConverter", "Failed to deserialize ContentSchedulingMetadata from ClipsDraft", e);
            }
        }
        return null;
    }
}
