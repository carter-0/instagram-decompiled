package X;

import java.util.List;
import java.util.Map;

public final class WIE implements X2Q {
    public final String A00;

    public final void AT9(C17850Vh3 vh3, Map map) {
        List<2dy> A13;
        List<2dy> A132;
        Number A14 = C51966G9m.A14("opacity_value_key", map);
        Float[] fArr = (Float[]) map.get("opacity_values_key");
        if (A14 != null) {
            try {
                C71532dv r0 = ((AnonymousClass61R) vh3.A00).A01;
                String str = this.A00;
                Map map2 = r0.A02;
                if (!(map2 == null || (A132 = C66580MXl.A13(str, map2)) == null)) {
                    for (2dy r1 : A132) {
                        r1.A06 = A14.floatValue();
                    }
                }
                if (fArr == null) {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        } else if (fArr == null) {
            throw new IllegalArgumentException("No opacity values in extras");
        }
        C71532dv r02 = ((AnonymousClass61R) vh3.A00).A01;
        String str2 = this.A00;
        Map map3 = r02.A02;
        if (map3 != null && (A13 = C66580MXl.A13(str2, map3)) != null) {
            for (2dy r4 : A13) {
                int length = fArr.length;
                float[] fArr2 = new float[length];
                for (int i = 0; i < length; i++) {
                    fArr2[i] = fArr[i].floatValue();
                }
                AnonymousClass6B4 r03 = r4.A0j;
                if (r03 != null) {
                    r03.A00 = fArr2;
                }
            }
        }
    }

    public WIE(String str) {
        this.A00 = str;
    }
}
