package X;

import java.util.Arrays;

/* renamed from: X.Npv  reason: case insensitive filesystem */
public final class C69673Npv {
    public boolean A00;
    public boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C69673Npv npv = (C69673Npv) obj;
            if (!(this.A01 == npv.A01 && this.A00 == npv.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A01), Boolean.valueOf(this.A00)});
    }
}
