package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WUr  reason: case insensitive filesystem */
public final class C19335WUr implements X6W {
    public float A00;
    public float A01 = 0.0f;
    public float A02;
    public float A03;
    public float A04;
    public int A05 = 0;
    public int A06 = 0;
    public C306576Mr A07;
    public List A08;
    public boolean A09;

    public C19335WUr() {
        0sn r5 = 0sn.A00;
        C306576Mr r4 = C306576Mr.DISABLED;
        C51969G9p.A1N(r5, 4, r4);
        this.A08 = r5;
        this.A09 = false;
        this.A04 = 0.0f;
        this.A00 = 0.0f;
        this.A02 = 0.0f;
        this.A03 = 1.0f;
        this.A07 = r4;
    }

    public final Integer CAn() {
        return AnonymousClass05K.A09;
    }

    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            A0K.A0P("primary_color", this.A06);
            A0K.A0P("contrast_color", this.A05);
            A0K.A0O("corner_radius", this.A01);
            if (this.A08 != null) {
                16P.A03(A0K, "serializable_paths");
                Iterator it = this.A08.iterator();
                while (it.hasNext()) {
                    C13989Tnp.A1M(A0K, it);
                }
                A0K.A0Y();
            }
            A0K.A0S("is_frosted", this.A09);
            A0K.A0O("top_padding_ratio", this.A04);
            A0K.A0O("bottom_padding_ratio", this.A00);
            A0K.A0O("horizontal_padding_ratio", this.A02);
            A0K.A0O("line_spacing_multiplier", this.A03);
            C306576Mr r0 = this.A07;
            if (r0 != null) {
                C13988Tno.A1F(A0K, r0);
            }
            return AnonymousClass7TG.A0k(A0K, stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
