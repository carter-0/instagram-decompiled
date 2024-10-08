package X;

import java.util.Arrays;

/* renamed from: X.Vje  reason: case insensitive filesystem */
public final class C18002Vje {
    public final int A00;
    public final int A01;
    public final int A02;
    public final X82 A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            C18002Vje vje = (C18002Vje) obj;
            if (!(Float.compare(0.0f, 0.0f) == 0 && this.A01 == vje.A01 && this.A02 == vje.A02 && this.A04 == vje.A04 && this.A00 == vje.A00 && this.A03.Cb5(vje.A03) && "1:1.5".equals("1:1.5"))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        X82 x82 = this.A03;
        Float valueOf = Float.valueOf(0.0f);
        Integer A0k = C51967G9n.A0k();
        return Arrays.hashCode(new Object[]{x82, valueOf, valueOf, A0k, "1:1.5", Integer.valueOf(this.A01), Integer.valueOf(this.A02), Float.valueOf(0.25f), Float.valueOf(0.35f), Float.valueOf(0.2f), Float.valueOf(0.9f), AnonymousClass7TE.A0v(), A0k, A0k, A0k, Boolean.valueOf(this.A04), Integer.valueOf(this.A00)});
    }

    public C18002Vje(X82 x82, int i, int i2, int i3, boolean z) {
        this.A03 = x82;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = z;
        this.A00 = i3;
    }
}
