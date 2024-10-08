package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* renamed from: X.WUp  reason: case insensitive filesystem */
public final class C19333WUp implements X6W {
    public float A00;
    public int A01;
    public int A02;
    public C306576Mr A03;
    public List A04;

    public final Integer CAn() {
        return AnonymousClass05K.A0A;
    }

    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            A0K.A0O("duplication_offset", this.A00);
            A0K.A0P("text_color", this.A02);
            A0K.A0P("background_color", this.A01);
            C306576Mr r0 = this.A03;
            if (r0 != null) {
                C13988Tno.A1F(A0K, r0);
            }
            if (this.A04 != null) {
                16P.A03(A0K, "line_coordinates");
                for (C17397VTy vTy : this.A04) {
                    if (vTy != null) {
                        A0K.A0c();
                        A0K.A0O("point_x", vTy.A00);
                        A0K.A0O("point_y", vTy.A01);
                        A0K.A0Z();
                    }
                }
                A0K.A0Y();
            }
            return AnonymousClass7TG.A0k(A0K, stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
