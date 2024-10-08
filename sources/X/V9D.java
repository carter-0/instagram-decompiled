package X;

import android.content.Context;
import java.util.LinkedHashMap;

public abstract class V9D {
    /* JADX WARNING: type inference failed for: r3v0, types: [X.V4R, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.V4R, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [X.V4R, java.lang.Object] */
    public static final Object A00(C307896Rx r11, AnonymousClass6Tm r12) {
        AnonymousClass4O9 r5;
        AnonymousClass4OA r4;
        Context context;
        AnonymousClass4OB r0;
        Object A03 = r12.A03(0);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A03;
        Object A02 = r12.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) A02;
        try {
            r5 = AnonymousClass4O9.valueOf(AnonymousClass7TF.A0k(str));
        } catch (IllegalArgumentException unused) {
            r5 = null;
        }
        try {
            r4 = AnonymousClass4OA.valueOf(AnonymousClass7TF.A0k(str2));
        } catch (IllegalArgumentException unused2) {
            r4 = null;
        }
        C277014uI r8 = ((C280064zw) r12.A00()).A00;
        C307786Rm r02 = r11.A03;
        if (r02 != null) {
            context = r02.A00;
        } else {
            context = null;
        }
        AnonymousClass4OB r03 = AnonymousClass4OB.STATUS_ERROR;
        if (!(context == null || r5 == null || r4 == null)) {
            ? obj = new Object();
            ? obj2 = new Object();
            ? obj3 = new Object();
            switch (r5.ordinal()) {
                case 0:
                    r03 = C18595Vum.A00(context, r4, false);
                    break;
                case 1:
                    r03 = C18595Vum.A00(context, r4, true);
                    break;
                case 3:
                    r03 = obj.A01(context);
                    break;
                case 4:
                    C17965Viz viz = new C17965Viz(AnonymousClass4O9.CONTACT, r4);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r4));
                    for (String str3 : viz.A01()) {
                        if (1DL.A07(context, str3)) {
                            r0 = AnonymousClass4OB.GRANTED;
                        } else {
                            r0 = AnonymousClass4OB.DENIED;
                        }
                        linkedHashMap.put(str3, r0);
                    }
                    r03 = viz.A00(linkedHashMap);
                    break;
                case 5:
                    r03 = obj3.A01(context);
                    break;
                case 8:
                    r03 = obj2.A01(context);
                    break;
                default:
                    r03 = AnonymousClass4OB.NOT_SUPPORTED;
                    break;
            }
        }
        DbX.A1P(r11, new C308276Tl(), r8, r03.A00, 0);
        return null;
    }
}
