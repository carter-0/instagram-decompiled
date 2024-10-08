package X;

import java.util.AbstractCollection;

public final class OTT {
    public final Integer A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public static void A00(Integer num, Object obj, Object obj2, Object obj3, AbstractCollection abstractCollection) {
        abstractCollection.add(new OTT(num, obj, obj2, obj3));
    }

    public OTT(Integer num, Object obj, Object obj2, Object obj3) {
        this.A00 = num;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }
}
