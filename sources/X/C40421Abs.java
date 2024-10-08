package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.Abs  reason: case insensitive filesystem */
public final class C40421Abs implements X6W {
    public final Integer CAn() {
        return AnonymousClass05K.A15;
    }

    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            return AnonymousClass7TG.A0k(AnonymousClass7TF.A0K(stringWriter), stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
