package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.Sgx  reason: case insensitive filesystem */
public final class C11811Sgx implements C13519Tbo {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public final C13687Tf4 Ezs(S7N s7n, Q6Y q6y, C11796Sgi sgi) {
        return new C11790Sgc(s7n, q6y, this, sgi);
    }

    public final String toString() {
        return 002.A0v("ShapeGroup{name='", this.A00, "' Shapes: ", Arrays.toString(this.A01.toArray()), '}');
    }

    public C11811Sgx(String str, List list, boolean z) {
        this.A00 = str;
        this.A01 = list;
        this.A02 = z;
    }
}
