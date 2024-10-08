package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* renamed from: X.WUe  reason: case insensitive filesystem */
public final class C19322WUe implements X6W {
    public Integer A00;
    public List A01;

    public final Integer CAn() {
        return AnonymousClass05K.A01;
    }

    public final String toJson() {
        String str;
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            if (this.A01 != null) {
                16P.A03(A0K, AnonymousClass000.A00(619));
                List<Number> list = this.A01;
                if (list != null) {
                    for (Number number : list) {
                        if (number != null) {
                            A0K.A0g(number.intValue());
                        }
                    }
                    A0K.A0Y();
                    Integer num = this.A00;
                    if (num != null) {
                        A0K.A0R("text_alignment", AnonymousClass9UV.A00(num));
                        return AnonymousClass7TG.A0k(A0K, stringWriter);
                    }
                    str = "textAlignment";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            str = "gradientColorsList";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException unused) {
            return null;
        }
    }
}
