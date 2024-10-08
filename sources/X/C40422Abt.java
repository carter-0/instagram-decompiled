package X;

import com.instagram.ui.text.TextColors;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.Abt  reason: case insensitive filesystem */
public final class C40422Abt implements X6W {
    public int A00;
    public TextColors A01;

    public final Integer CAn() {
        return AnonymousClass05K.A0u;
    }

    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            if (this.A01 != null) {
                A0K.A0q("text_colors");
                TextColors textColors = this.A01;
                if (textColors != null) {
                    ABL.A00(A0K, textColors);
                    A0K.A0P("primary_color", this.A00);
                    return AnonymousClass7TG.A0k(A0K, stringWriter);
                }
            }
            0qQ.A0F("textColors");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException unused) {
            return null;
        }
    }
}
