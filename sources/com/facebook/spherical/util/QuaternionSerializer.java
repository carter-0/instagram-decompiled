package com.facebook.spherical.util;

import X.17Z;
import X.C269504fE;
import X.C291405h7;
import com.fasterxml.jackson.databind.JsonSerializer;

public class QuaternionSerializer extends JsonSerializer {
    static {
        Object obj = new Object();
        C291405h7.A08.putIfAbsent(Quaternion.class, obj);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r3, C269504fE r4, Object obj) {
        Quaternion quaternion = (Quaternion) obj;
        if (quaternion == null) {
            r3.A0a();
        }
        r3.A0c();
        float f = quaternion.w;
        r3.A0q("w");
        r3.A0f(f);
        float f2 = quaternion.x;
        r3.A0q("x");
        r3.A0f(f2);
        float f3 = quaternion.y;
        r3.A0q("y");
        r3.A0f(f3);
        float f4 = quaternion.z;
        r3.A0q("z");
        r3.A0f(f4);
        r3.A0Z();
    }
}
