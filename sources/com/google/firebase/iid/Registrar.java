package com.google.firebase.iid;

import X.AnonymousClass95n;
import X.AnonymousClass960;
import X.AnonymousClass961;
import X.AnonymousClass962;
import X.AnonymousClass963;
import X.C3734195g;
import X.C3734595o;
import X.C3735195u;
import X.C3735395y;
import X.C3735495z;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

public final class Registrar implements ComponentRegistrar {
    public final List getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        C3734595o r2 = new C3734595o(cls, new Class[0]);
        r2.A02(new C3735395y(C3734195g.class, 1, 0));
        r2.A02(new C3735395y(C3735195u.class, 1, 0));
        r2.A02(new C3735395y(C3735495z.class, 1, 0));
        r2.A02 = AnonymousClass960.A00;
        boolean z = false;
        if (r2.A00 == 0) {
            z = true;
        }
        if (z) {
            r2.A00 = 1;
            AnonymousClass95n A00 = r2.A00();
            C3734595o r1 = new C3734595o(AnonymousClass961.class, new Class[0]);
            r1.A02(new C3735395y(cls, 1, 0));
            r1.A02 = AnonymousClass962.A00;
            return Arrays.asList(new AnonymousClass95n[]{A00, r1.A00(), AnonymousClass963.A01("fire-iid", "18.0.0")});
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
