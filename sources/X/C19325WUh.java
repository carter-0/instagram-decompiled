package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.WUh  reason: case insensitive filesystem */
public final class C19325WUh implements X6W {
    public int A00;
    public C306576Mr A01;

    public final Integer CAn() {
        return AnonymousClass05K.A07;
    }

    public final String toJson() {
        String str;
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            A0K.A0P("primary_color", this.A00);
            C306576Mr r0 = this.A01;
            if (r0 != null) {
                C13988Tno.A1F(A0K, r0);
            }
            str = AnonymousClass7TG.A0k(A0K, stringWriter);
        } catch (IOException e) {
            0wb.A06("TextEmphasisNeonSpanMetadataModel", "Error jsonizing TextEmphasisNeonSpanMetadataModel", e);
            str = "";
        }
        0qQ.A0A(str);
        return str;
    }
}
