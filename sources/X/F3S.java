package X;

import java.util.Arrays;
import java.util.Map;

public final class F3S {
    public final String A00;
    public final String A01;
    public final String A02;
    public final Map A03;
    public final C368108s5 A04;
    public final C368238sI A05;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F3S)) {
            return false;
        }
        F3S f3s = (F3S) obj;
        return this.A02.equals(f3s.A02) && this.A01.equals(f3s.A01) && this.A00.equals(f3s.A00) && this.A04.equals(f3s.A04) && this.A05.equals(f3s.A05) && this.A03.equals(f3s.A03);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A01, this.A00, this.A04, this.A03});
    }

    public F3S(String str, String str2, String str3, Map map, C368108s5 r5, C368238sI r6) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = map;
    }
}
