package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.LlA  reason: case insensitive filesystem */
public final class C64971LlA implements C317466nJ {
    public ImageUrl A00;
    public C317476nK A01;
    public C317876nz A02;

    public final boolean CKf() {
        return false;
    }

    public final ArrayList A00() {
        int ordinal = this.A01.ordinal();
        if (ordinal == 0) {
            C317876nz r0 = this.A02;
            r0.getClass();
            return r0.A01();
        } else if (ordinal == 1) {
            Object obj = null;
            obj.getClass();
            throw AnonymousClass00P.createAndThrow();
        } else {
            throw AnonymousClass7TE.A1B("Unknown boostable item type.");
        }
    }

    public final C317486nL B0p() {
        return null;
    }

    public final C317876nz BzU() {
        return this.A02;
    }

    public final C317476nK CAW() {
        return this.A01;
    }

    public final ImageUrl CCI() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C64971LlA) {
            C64971LlA llA = (C64971LlA) obj;
            if (!2PP.A00(llA.A00(), A00()) || !2PP.A00(llA.A00, this.A00)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{A00(), this.A00});
    }
}
