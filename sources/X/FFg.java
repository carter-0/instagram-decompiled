package X;

import com.google.common.collect.ImmutableMap;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class FFg {
    public static final List A00 = 0sr.A1P(new 2aD[]{2aD.A0I, 2aD.A0G, 2aD.A0f, 2aD.A0T});

    public static final C71062aE A01(Map map) {
        Object obj = null;
        Iterator it = A00.iterator();
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                int i = map.get(next);
                if (i == null) {
                    i = 0;
                }
                if (AnonymousClass7TE.A0M(i) > 0) {
                    obj = next;
                    break;
                }
            } else {
                break;
            }
        }
        return (C71062aE) obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A02(android.content.Context r3, X.C71062aE r4, java.util.Map r5, int r6) {
        /*
            r0 = 0
            X.0qQ.A0B(r3, r0)
            android.content.res.Resources r3 = r3.getResources()
            java.lang.Object r0 = r5.get(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = X.AnonymousClass7TG.A0A(r0)
            if (r4 == 0) goto L_0x004a
            if (r1 <= 0) goto L_0x004a
            X.2aD r0 = X.2aD.A0I
            if (r4 != r0) goto L_0x0030
            r0 = 2131820612(0x7f110044, float:1.9273944E38)
        L_0x001d:
            java.lang.String r2 = X.DbY.A0d(r3, r1, r0)
        L_0x0021:
            int r6 = r6 - r1
            if (r6 <= 0) goto L_0x002f
            r1 = 2131952941(0x7f13052d, float:1.9542339E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.String r2 = X.DbV.A0w(r3, r2, r0, r1)
        L_0x002f:
            return r2
        L_0x0030:
            X.2aD r0 = X.2aD.A0G
            if (r4 != r0) goto L_0x0038
            r0 = 2131820618(0x7f11004a, float:1.9273956E38)
            goto L_0x001d
        L_0x0038:
            X.2aD r0 = X.2aD.A0f
            if (r4 != r0) goto L_0x0040
            r0 = 2131820714(0x7f1100aa, float:1.927415E38)
            goto L_0x001d
        L_0x0040:
            X.2aD r0 = X.2aD.A0T
            if (r4 != r0) goto L_0x0048
            r0 = 2131820770(0x7f1100e2, float:1.9274264E38)
            goto L_0x001d
        L_0x0048:
            r2 = 0
            goto L_0x0021
        L_0x004a:
            r0 = 2131820858(0x7f11013a, float:1.9274443E38)
            java.lang.String r2 = X.DbY.A0d(r3, r6, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FFg.A02(android.content.Context, X.2aE, java.util.Map, int):java.lang.String");
    }

    public static final AnonymousClass3H3 A00(User user) {
        Number number;
        if (user != null) {
            ImmutableMap copyOf = ImmutableMap.copyOf(user.A05);
            0qQ.A07(copyOf);
            if (!copyOf.isEmpty() && (number = (Number) copyOf.get(2aD.A0I)) != null) {
                int intValue = number.intValue();
                Number number2 = (Number) copyOf.get(2aD.A0J);
                int i = -1;
                int A02 = DbX.A02((Number) copyOf.get(2aD.A0K));
                if (number2 != null) {
                    i = number2.intValue();
                }
                return new AnonymousClass3H3(intValue, A02, i);
            }
        }
        return new AnonymousClass3H3(0, -1, -1);
    }
}
