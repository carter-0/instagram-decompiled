package X;

import java.util.Arrays;

public final class S42 {
    public final RJA A00;

    public /* synthetic */ S42(RJA rja) {
        this.A00 = rja;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof S42) && SA1.A01(this.A00, ((S42) obj).A00));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, null, null});
    }
}
