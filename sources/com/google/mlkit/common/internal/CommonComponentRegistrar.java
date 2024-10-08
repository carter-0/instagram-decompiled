package com.google.mlkit.common.internal;

import X.AnonymousClass95n;
import X.C10275RpZ;
import X.C10276Rpa;
import X.C10277Rpb;
import X.C10278Rpc;
import X.C10476Rsr;
import X.C10477Rss;
import X.C12616T0a;
import X.C12617T0b;
import X.C12618T0c;
import X.C12619T0d;
import X.C3734595o;
import X.C3735395y;
import X.C8496Qvs;
import X.C8498Qvu;
import X.C8499Qvv;
import X.C8506Qw2;
import X.Pxg;
import X.Pxh;
import X.SDx;
import X.SGk;
import X.SO3;
import X.T0W;
import X.T0X;
import X.T0Y;
import X.T0Z;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

public class CommonComponentRegistrar implements ComponentRegistrar {
    public final List getComponents() {
        AnonymousClass95n r6 = SGk.A01;
        C3734595o A0Y = Pxh.A0Y(SDx.class);
        Class<SO3> cls = SO3.class;
        Pxh.A1G(A0Y, cls, 1);
        AnonymousClass95n A0Z = Pxh.A0Z(A0Y, T0W.A00);
        Class<C8496Qvs> cls2 = C8496Qvs.class;
        AnonymousClass95n A0Z2 = Pxh.A0Z(Pxh.A0Y(cls2), T0X.A00);
        C3734595o A0Y2 = Pxh.A0Y(C10276Rpa.class);
        Class<C10275RpZ> cls3 = C10275RpZ.class;
        Pxh.A1G(A0Y2, cls3, 2);
        AnonymousClass95n A0Z3 = Pxh.A0Z(A0Y2, T0Y.A00);
        C3734595o A0Y3 = Pxh.A0Y(C10278Rpc.class);
        A0Y3.A02(new C3735395y(cls2, 1, 1));
        AnonymousClass95n A0Z4 = Pxh.A0Z(A0Y3, T0Z.A00);
        Class<C10477Rss> cls4 = C10477Rss.class;
        AnonymousClass95n A0Z5 = Pxh.A0Z(Pxh.A0Y(cls4), C12616T0a.A00);
        C3734595o A0Y4 = Pxh.A0Y(C10277Rpb.class);
        Pxh.A1G(A0Y4, cls4, 1);
        AnonymousClass95n A0Z6 = Pxh.A0Z(A0Y4, C12617T0b.A00);
        Class<C10476Rsr> cls5 = C10476Rsr.class;
        C3734595o A0Y5 = Pxh.A0Y(cls5);
        Pxh.A1G(A0Y5, cls, 1);
        AnonymousClass95n A0Z7 = Pxh.A0Z(A0Y5, C12618T0c.A00);
        C3734595o A0Y6 = Pxh.A0Y(cls3);
        A0Y6.A01 = 1;
        A0Y6.A02(new C3735395y(cls5, 1, 1));
        AnonymousClass95n A0Z8 = Pxh.A0Z(A0Y6, C12619T0d.A00);
        C8506Qw2 qw2 = C8499Qvv.A00;
        Object[] objArr = {r6, A0Z, A0Z2, A0Z3, A0Z4, A0Z5, A0Z6, A0Z7, A0Z8};
        int i = 0;
        while (objArr[i] != null) {
            i++;
            if (i >= 9) {
                return new C8498Qvu(objArr, 9);
            }
        }
        throw Pxg.A0h(i);
    }
}
