package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.WUd  reason: case insensitive filesystem */
public final class C19321WUd implements X6W {
    public float A00;

    public final Integer CAn() {
        return AnonymousClass05K.A0F;
    }

    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            A0K.A0O("text_size_px", this.A00);
            return AnonymousClass7TG.A0k(A0K, stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
