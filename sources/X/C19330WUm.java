package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WUm  reason: case insensitive filesystem */
public final class C19330WUm implements X6W {
    public float A00;
    public int A01;
    public C306576Mr A02;
    public List A03;

    public final Integer CAn() {
        return AnonymousClass05K.A1F;
    }

    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            A0K.A0P("background_color", this.A01);
            A0K.A0O("stroke_width", this.A00);
            if (this.A03 != null) {
                16P.A03(A0K, "serializable_paths");
                Iterator it = this.A03.iterator();
                while (it.hasNext()) {
                    C13989Tnp.A1M(A0K, it);
                }
                A0K.A0Y();
            }
            C306576Mr r0 = this.A02;
            if (r0 != null) {
                C13988Tno.A1F(A0K, r0);
            }
            return AnonymousClass7TG.A0k(A0K, stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
