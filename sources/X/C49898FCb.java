package X;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.FCb  reason: case insensitive filesystem */
public abstract class C49898FCb {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r1.length() != 0) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A01(android.content.Context r2, X.0lg r3) {
        /*
            r0 = 1
            X.0qQ.A0B(r3, r0)
            java.util.ArrayList r2 = X.C49196Er1.A00(r2)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0030
            java.lang.String r1 = A00(r3)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0020
            if (r1 == 0) goto L_0x0020
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0031
        L_0x0020:
            java.lang.String r1 = X.C49315Esy.A00
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0030
            if (r1 == 0) goto L_0x0030
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0031
        L_0x0030:
            return r2
        L_0x0031:
            r2.add(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49898FCb.A01(android.content.Context, X.0lg):java.util.ArrayList");
    }

    public static final String A00(0lg r3) {
        Object obj;
        Pair pair;
        String A02 = FV8.A00().A02(r3, "ig_android_growth_fx_access_fb_ig_prefill_email", "EmailPrefillGenerator");
        if (C48215Eaw.A00 == null) {
            return null;
        }
        Pair pair2 = C48215Eaw.A00;
        if (pair2 != null) {
            obj = pair2.first;
        } else {
            obj = null;
        }
        if (!0qQ.A0K(obj, A02) || (pair = C48215Eaw.A00) == null) {
            return null;
        }
        return (String) pair.second;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.EbZ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [X.EbZ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v9, types: [X.EbZ, java.lang.Object] */
    public static final ArrayList A02(Context context, 0lg r6, Integer num) {
        AnonymousClass7TG.A1O(context, r6);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = C49196Er1.A00(context).iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            0qQ.A0B(A18, 1);
            Integer num2 = AnonymousClass05K.A00;
            ? obj = new Object();
            obj.A02 = A18;
            obj.A00 = num2;
            obj.A01 = "android_account_manager";
            A1C.add(obj);
        }
        if (!(num == AnonymousClass05K.A0C || num == AnonymousClass05K.A0N)) {
            String A00 = A00(r6);
            if (!(A00 == null || A00.length() == 0)) {
                Integer num3 = AnonymousClass05K.A00;
                ? obj2 = new Object();
                obj2.A02 = A00;
                obj2.A00 = num3;
                obj2.A01 = "fb_first_party";
                A1C.add(obj2);
            }
            String str = C49315Esy.A00;
            if (!(str == null || str.length() == 0)) {
                Integer num4 = AnonymousClass05K.A00;
                ? obj3 = new Object();
                obj3.A02 = str;
                obj3.A00 = num4;
                obj3.A01 = "uig_via_phone_id";
                A1C.add(obj3);
            }
        }
        return A1C;
    }
}
