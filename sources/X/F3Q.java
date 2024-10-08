package X;

import java.util.Arrays;

public final class F3Q {
    public C49615EzY A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public final boolean equals(Object obj) {
        if (!(obj instanceof F3Q) || hashCode() != obj.hashCode()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr;
        C49615EzY ezY = this.A00;
        if (ezY != null) {
            objArr = new Object[]{this.A05, this.A03, Integer.valueOf(ezY.A00), Integer.valueOf(ezY.A01)};
        } else {
            objArr = new Object[]{this.A05, this.A03};
        }
        return Arrays.hashCode(objArr);
    }
}
