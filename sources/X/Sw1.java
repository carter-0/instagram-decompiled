package X;

import java.util.Set;

public final class Sw1 implements C13626Tds {
    public final C9144RQv A00;
    public final C13455Tai A01;
    public final Set A02;

    public final C12523Sw0 C9h(S5K s5k, C13624Tdq tdq, Class cls, String str) {
        Set set = this.A02;
        S5K s5k2 = s5k;
        if (set.contains(s5k)) {
            return new C12523Sw0(s5k2, tdq, this.A00, this.A01, str);
        }
        throw Pxf.A0X("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{s5k, set});
    }

    public Sw1(C9144RQv rQv, C13455Tai tai, Set set) {
        this.A02 = set;
        this.A00 = rQv;
        this.A01 = tai;
    }
}
