package X;

import android.app.Activity;
import android.content.Context;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.V8v  reason: case insensitive filesystem */
public abstract class C16866V8v {
    public static final LinkedHashMap A00(C307896Rx r5, AnonymousClass6Tm r6) {
        Integer num;
        String str;
        AbstractCollection abstractCollection = (AbstractCollection) r6.A01();
        C307786Rm r1 = r5.A03;
        if (r1 != null) {
            Map map = C17150VKc.A00;
            Context context = r1.A00;
            0qQ.A0B(abstractCollection, 1);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z = context instanceof Activity;
            Iterator A1G = AnonymousClass7TE.A1G(abstractCollection);
            if (!z) {
                while (A1G.hasNext()) {
                    linkedHashMap.put(AnonymousClass7TF.A0a(A1G), "UNKNOWN");
                }
            } else {
                while (A1G.hasNext()) {
                    Object A0a = AnonymousClass7TF.A0a(A1G);
                    Activity activity = (Activity) context;
                    String A11 = DbT.A11(A0a, C17150VKc.A00);
                    if (A11 == null) {
                        num = AnonymousClass05K.A0N;
                    } else if (activity.checkSelfPermission(A11) == 0) {
                        num = AnonymousClass05K.A00;
                    } else if ((!AnonymousClass0xl.A00(C61170le.A00).A05(A11)) || activity.shouldShowRequestPermissionRationale(A11)) {
                        num = AnonymousClass05K.A01;
                    } else {
                        num = AnonymousClass05K.A0C;
                    }
                    switch (num.intValue()) {
                        case 0:
                            str = "GRANTED";
                            break;
                        case 1:
                            str = "DENIED";
                            break;
                        case 2:
                            str = "PERMANENTLY_DENIED";
                            break;
                        default:
                            str = "UNKNOWN";
                            break;
                    }
                    linkedHashMap.put(A0a, str);
                }
            }
            return linkedHashMap;
        }
        throw AnonymousClass7TE.A0y();
    }
}
