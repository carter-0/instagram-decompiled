package X;

import java.util.Arrays;

/* renamed from: X.Npu  reason: case insensitive filesystem */
public final class C69672Npu {
    public C70814OMj A00;
    public C69673Npv A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C69672Npu npu = (C69672Npu) obj;
            if (!2Ob.A00(this.A00, npu.A00) || !2Ob.A00(this.A01, npu.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }
}
