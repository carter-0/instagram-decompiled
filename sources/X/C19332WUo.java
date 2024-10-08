package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* renamed from: X.WUo  reason: case insensitive filesystem */
public final class C19332WUo implements X6W {
    public int A00;
    public int A01;
    public C306576Mr A02;
    public List A03;
    public List A04;

    public final Integer CAn() {
        return AnonymousClass05K.A1I;
    }

    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            A0K.A0P("text_color", this.A01);
            A0K.A0P("background_color", this.A00);
            if (this.A03 != null) {
                16P.A03(A0K, "first_layer_backgrounds");
                for (C18501Vsw vsw : this.A03) {
                    if (vsw != null) {
                        C18275Voq.A00(A0K, vsw);
                    }
                }
                A0K.A0Y();
            }
            if (this.A04 != null) {
                16P.A03(A0K, "second_layer_backgrounds");
                for (C18501Vsw vsw2 : this.A04) {
                    if (vsw2 != null) {
                        C18275Voq.A00(A0K, vsw2);
                    }
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
