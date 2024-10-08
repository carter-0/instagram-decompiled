package com.google.mlkit.vision.common.internal;

import X.AnonymousClass7TE;
import X.AnonymousClass95n;
import X.C10279Rpd;
import X.C12621T0f;
import X.C3734595o;
import X.C8509Qw5;
import X.C8517QwD;
import X.C8518QwE;
import X.C9106RPd;
import X.Pxe;
import X.Pxg;
import X.Pxh;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

public class VisionCommonRegistrar implements ComponentRegistrar {
    public final List getComponents() {
        C3734595o A0Y = Pxh.A0Y(C10279Rpd.class);
        Pxh.A1G(A0Y, C9106RPd.class, 2);
        AnonymousClass95n A0Z = Pxh.A0Z(A0Y, C12621T0f.A00);
        C8509Qw5 qw5 = C8518QwE.A00;
        Object[] objArr = {A0Z};
        if (objArr[0] != null) {
            return new C8517QwD(objArr, 1);
        }
        throw AnonymousClass7TE.A11(Pxg.A0t("at index ", Pxe.A14(20), 0));
    }
}
