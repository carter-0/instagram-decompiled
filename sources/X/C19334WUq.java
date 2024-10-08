package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.WUq  reason: case insensitive filesystem */
public final class C19334WUq implements X6W {
    public float A00;
    public float A01;
    public float A02;
    public int A03 = 0;
    public int A04 = 0;
    public C306576Mr A05;
    public C17512VYq A06;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.VYq, java.lang.Object] */
    public C19334WUq() {
        C306576Mr r4 = C306576Mr.DISABLED;
        ? obj = new Object();
        0qQ.A0B(r4, 3);
        this.A05 = r4;
        this.A02 = 0.0f;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A06 = obj;
    }

    public final Integer CAn() {
        return AnonymousClass05K.A0B;
    }

    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            A0K.A0P("primary_color", this.A03);
            A0K.A0P("secondary_color", this.A04);
            C306576Mr r0 = this.A05;
            if (r0 != null) {
                C13988Tno.A1F(A0K, r0);
            }
            A0K.A0O("top_padding_ratio", this.A02);
            A0K.A0O("bottom_padding_ratio", this.A00);
            A0K.A0O("horizontal_padding_ratio", this.A01);
            if (this.A06 != null) {
                A0K.A0q("emphasis_rect");
                C18276Vor.A00(A0K, this.A06);
            }
            return AnonymousClass7TG.A0k(A0K, stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
