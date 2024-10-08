package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.78w  reason: invalid class name and case insensitive filesystem */
public final class C3269778w {
    public static final C3269778w A00 = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036 A[LOOP:0: B:1:0x000a->B:13:0x0036, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.text.Editable r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            int r3 = r4.length()
            r2 = 1
            int r3 = r3 - r2
        L_0x000a:
            r0 = -1
            if (r0 >= r3) goto L_0x001c
            char r0 = r4.charAt(r3)
            boolean r0 = X.11R.A01(r0)
            if (r3 != 0) goto L_0x001d
            if (r0 == 0) goto L_0x002e
        L_0x0019:
            r4.delete(r3, r2)
        L_0x001c:
            return
        L_0x001d:
            if (r0 == 0) goto L_0x002e
            int r0 = r3 + -1
            char r0 = r4.charAt(r0)
            boolean r0 = X.11R.A01(r0)
            if (r0 == 0) goto L_0x002e
        L_0x002b:
            int r2 = r3 + 1
            goto L_0x0019
        L_0x002e:
            char r1 = r4.charAt(r3)
            r0 = 10
            if (r1 == r0) goto L_0x002b
            int r3 = r3 + -1
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3269778w.A00(android.text.Editable):void");
    }

    public static final boolean A01(UserSession userSession, DirectThreadKey directThreadKey, String str) {
        String str2;
        Long l;
        0qQ.A0B(directThreadKey, 2);
        if (str != null) {
            ArrayList Aax = 2L2.A00(userSession).Aax(directThreadKey, true);
            ArrayList arrayList = new ArrayList();
            Iterator it = Aax.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C254703su r0 = (C254703su) next;
                ImmutableList A0H = r0.A0H();
                if (r0.A10 == 2FW.A0y && A0H != null && !A0H.isEmpty()) {
                    C254873tC r02 = (C254873tC) 00k.A0J(A0H);
                    if (r02 == null || (l = r02.A0m) == null) {
                        str2 = null;
                    } else {
                        str2 = l.toString();
                    }
                    if (0qQ.A0K(str2, str)) {
                        arrayList.add(next);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final boolean A02(C59832Ja7 ja7, UserSession userSession, DirectThreadKey directThreadKey) {
        long j;
        0qQ.A0B(directThreadKey, 1);
        if (ja7 != null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Number number = (Number) ja7.A00;
            if (number != null) {
                j = number.longValue();
            } else {
                j = 0;
            }
            if (timeUnit.toMillis(j) > System.currentTimeMillis()) {
                return true;
            }
        }
        String str = directThreadKey.A00;
        if (str == null) {
            return false;
        }
        return A01(userSession, directThreadKey, (String) ((C72184Oxt) userSession.A01(C72184Oxt.class, C73810Pk9.A00)).A00.get(str));
    }
}
