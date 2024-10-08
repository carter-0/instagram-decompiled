package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WUj  reason: case insensitive filesystem */
public final class C19327WUj implements X6W {
    public float A00;
    public int A01;
    public List A02 = 0sn.A00;

    public final Integer CAn() {
        return AnonymousClass05K.A0C;
    }

    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            A0K.A0P("color", this.A01);
            A0K.A0O("corner_radius", this.A00);
            if (this.A02 != null) {
                16P.A03(A0K, "paths");
                Iterator it = this.A02.iterator();
                while (it.hasNext()) {
                    C13989Tnp.A1M(A0K, it);
                }
                A0K.A0Y();
            }
            return AnonymousClass7TG.A0k(A0K, stringWriter);
        } catch (IOException e) {
            0wb.A06("RoundedCornerTextBackgroundSpanMetadataModel", "Error jsonizing RoundedCornerTextBackgroundSpanMetadataModel", e);
            return "";
        }
    }
}
