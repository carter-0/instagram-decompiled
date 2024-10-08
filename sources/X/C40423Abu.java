package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.Abu  reason: case insensitive filesystem */
public final class C40423Abu implements X6W {
    public String A00;
    public boolean A01;

    public final Integer CAn() {
        return AnonymousClass05K.A0D;
    }

    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            String str = this.A00;
            if (str != null) {
                A0K.A0R("text_format_name", str);
            }
            A0K.A0S("is_emphasized", this.A01);
            return AnonymousClass7TG.A0k(A0K, stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
