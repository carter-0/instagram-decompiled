package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.WUl  reason: case insensitive filesystem */
public final class C19329WUl implements X6W {
    public int A00;
    public C306576Mr A01;
    public ArrayList A02;

    public final Integer CAn() {
        return AnonymousClass05K.A05;
    }

    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            A0K.A0P("background_color", this.A00);
            if (this.A02 != null) {
                16P.A03(A0K, "emphasis_rects");
                Iterator it = this.A02.iterator();
                while (it.hasNext()) {
                    C17512VYq vYq = (C17512VYq) it.next();
                    if (vYq != null) {
                        C18276Vor.A00(A0K, vYq);
                    }
                }
                A0K.A0Y();
            }
            C306576Mr r0 = this.A01;
            if (r0 != null) {
                C13988Tno.A1F(A0K, r0);
            }
            return AnonymousClass7TG.A0k(A0K, stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
