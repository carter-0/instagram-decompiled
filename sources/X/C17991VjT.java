package X;

import com.instagram.user.model.Product;
import java.util.Arrays;

/* renamed from: X.VjT  reason: case insensitive filesystem */
public final class C17991VjT {
    public C16507Uw3 A00;
    public final C16513UwH A01;
    public final W0O A02;
    public final Product A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            C17991VjT vjT = (C17991VjT) obj;
            if (!(this.A01 == vjT.A01 && this.A00 == vjT.A00 && 0qQ.A0K(this.A02, vjT.A02))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00, this.A02});
    }

    public C17991VjT(C16513UwH uwH, C16507Uw3 uw3, W0O w0o, Product product) {
        this.A01 = uwH;
        this.A00 = uw3;
        this.A02 = w0o;
        this.A03 = product;
    }
}
