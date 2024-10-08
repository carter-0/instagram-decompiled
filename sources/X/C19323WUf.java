package X;

import com.instagram.model.hashtag.HashtagImpl;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.WUf  reason: case insensitive filesystem */
public final class C19323WUf implements X6W {
    public int A00 = 0;
    public HashtagImpl A01 = null;

    public final Integer CAn() {
        return AnonymousClass05K.A0Y;
    }

    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            A0K.A0P("bounds_padding_for_underline", this.A00);
            if (this.A01 != null) {
                A0K.A0q("hashtag");
                C279594yt.A00(A0K, this.A01);
            }
            return AnonymousClass7TG.A0k(A0K, stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
