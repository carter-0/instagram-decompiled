package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* renamed from: X.Abv  reason: case insensitive filesystem */
public final class C40424Abv implements X6W {
    public float A00 = -1.0f;
    public int A01 = 0;
    public int A02 = 0;
    public C306576Mr A03;
    public String A04 = "";
    public List A05;
    public List A06;

    public C40424Abv() {
        C306576Mr r1 = C306576Mr.DISABLED;
        0sn r0 = 0sn.A00;
        AnonymousClass7TG.A1S(r1, r0);
        this.A03 = r1;
        this.A05 = r0;
        this.A06 = r0;
    }

    public final Integer CAn() {
        return AnonymousClass05K.A03;
    }

    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            A0K.A0P("primary_color", this.A01);
            A0K.A0P("secondary_color", this.A02);
            String str = this.A04;
            if (str != null) {
                A0K.A0R("font_name", str);
            }
            A0K.A0O("letter_spacing_multiplier", this.A00);
            C306576Mr r0 = this.A03;
            if (r0 != null) {
                A0K.A0R("text_emphasis_mode", r0.A00);
            }
            if (this.A05 != null) {
                16P.A03(A0K, "line_coordinate_x");
                for (Number number : this.A05) {
                    if (number != null) {
                        A0K.A0f(number.floatValue());
                    }
                }
                A0K.A0Y();
            }
            if (this.A06 != null) {
                16P.A03(A0K, "line_coordinate_y");
                for (Number number2 : this.A06) {
                    if (number2 != null) {
                        A0K.A0f(number2.floatValue());
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
