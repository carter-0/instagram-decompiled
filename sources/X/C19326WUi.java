package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.WUi  reason: case insensitive filesystem */
public final class C19326WUi implements X6W {
    public int A00;
    public int A01;

    public final Integer CAn() {
        return AnonymousClass05K.A08;
    }

    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            A0K.A0P("primary_color", this.A01);
            A0K.A0P("contrast_color", this.A00);
            return AnonymousClass7TG.A0k(A0K, stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
