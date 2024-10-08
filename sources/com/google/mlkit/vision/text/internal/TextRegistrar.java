package com.google.mlkit.vision.text.internal;

import X.AnonymousClass7TE;
import X.AnonymousClass95n;
import X.C10278Rpc;
import X.C10479Rsu;
import X.C12622T0g;
import X.C12623T0h;
import X.C3734595o;
import X.C8535QwZ;
import X.C8540Qwe;
import X.C8548Qwm;
import X.Pxe;
import X.Pxg;
import X.Pxh;
import X.R2u;
import X.SO3;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

public class TextRegistrar implements ComponentRegistrar {
    public final List getComponents() {
        Class<R2u> cls = R2u.class;
        int i = 0;
        C3734595o A0Y = Pxh.A0Y(cls);
        Pxh.A1G(A0Y, SO3.class, 1);
        AnonymousClass95n A0Z = Pxh.A0Z(A0Y, C12622T0g.A00);
        C3734595o A0Y2 = Pxh.A0Y(C10479Rsu.class);
        Pxh.A1G(A0Y2, cls, 1);
        Pxh.A1G(A0Y2, C10278Rpc.class, 1);
        AnonymousClass95n A0Z2 = Pxh.A0Z(A0Y2, C12623T0h.A00);
        C8548Qwm qwm = C8535QwZ.A00;
        Object[] objArr = {A0Z, A0Z2};
        while (objArr[i] != null) {
            i++;
            if (i >= 2) {
                return new C8540Qwe(objArr, 2);
            }
        }
        throw AnonymousClass7TE.A11(Pxg.A0t("at index ", Pxe.A14(20), i));
    }
}
