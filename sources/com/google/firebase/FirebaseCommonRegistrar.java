package com.google.firebase;

import X.AnonymousClass963;
import X.AnonymousClass965;
import X.AnonymousClass967;
import X.AnonymousClass968;
import X.AnonymousClass969;
import X.AnonymousClass96A;
import X.AnonymousClass96B;
import X.AnonymousClass96E;
import X.AnonymousClass96F;
import X.AnonymousClass96G;
import X.AnonymousClass96H;
import X.C3734595o;
import X.C3735395y;
import X.C3735495z;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        C3734595o r3 = new C3734595o(C3735495z.class, new Class[0]);
        r3.A02(new C3735395y(AnonymousClass965.class, 2, 0));
        r3.A02 = AnonymousClass967.A00;
        arrayList.add(r3.A00());
        C3734595o r4 = new C3734595o(AnonymousClass968.class, new Class[0]);
        r4.A02(new C3735395y(Context.class, 1, 0));
        r4.A02(new C3735395y(AnonymousClass969.class, 2, 0));
        r4.A02 = AnonymousClass96A.A00;
        arrayList.add(r4.A00());
        arrayList.add(AnonymousClass963.A01("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(AnonymousClass963.A01("fire-core", "19.5.0"));
        arrayList.add(AnonymousClass963.A01("device-name", Build.PRODUCT.replace(' ', '_').replace('/', '_')));
        arrayList.add(AnonymousClass963.A01("device-model", Build.DEVICE.replace(' ', '_').replace('/', '_')));
        arrayList.add(AnonymousClass963.A01("device-brand", Build.BRAND.replace(' ', '_').replace('/', '_')));
        arrayList.add(AnonymousClass963.A00(AnonymousClass96B.A00, "android-target-sdk"));
        arrayList.add(AnonymousClass963.A00(AnonymousClass96E.A00, "android-min-sdk"));
        arrayList.add(AnonymousClass963.A00(AnonymousClass96F.A00, "android-platform"));
        arrayList.add(AnonymousClass963.A00(AnonymousClass96G.A00, "android-installer"));
        try {
            str = AnonymousClass96H.A00.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(AnonymousClass963.A01("kotlin", str));
        }
        return arrayList;
    }
}
