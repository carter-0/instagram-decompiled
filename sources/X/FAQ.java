package X;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

public final class FAQ {
    public final String A00;
    public final Map A01;
    public final C368108s5 A02;
    public final C368238sI A03;

    public static Set A00(Object obj, C368108s5 r4, C368238sI r5) {
        Set singleton = Collections.singleton(new FAQ((String) null, 0se.A0M(new 0eP("resolver_type", obj)), r4, r5));
        0qQ.A07(singleton);
        return singleton;
    }

    public FAQ(String str, Map map, C368108s5 r3, C368238sI r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = str == null ? "" : str;
        this.A01 = map;
    }
}
