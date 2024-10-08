package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7ga  reason: invalid class name and case insensitive filesystem */
public abstract class C337587ga extends C337597gb implements C251213mk, C251233mm, C251293ms, Cloneable {
    public static final AtomicInteger A0A = new AtomicInteger(0);
    public int A00;
    public C337587ga A01;
    public C337557gX A02;
    public String A03;
    public String A04;
    public List A05;
    public Map A06;
    public boolean A07;
    public final int A08 = A0A.getAndIncrement();
    public final String A09;

    public static void A01(C337587ga r1) {
        r1.A07 = true;
        C337587ga r0 = r1.A01;
        if (r0 != null) {
            A01(r0);
        }
    }

    public final C251223ml B2H() {
        return this;
    }

    public static HashMap A00(C337587ga r8) {
        HashMap hashMap = new HashMap();
        if (r8 != null) {
            List list = r8.A05;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C337587ga r3 = (C337587ga) list.get(i);
                    hashMap.put(r3.A03, new Pair(r3, Integer.valueOf(i)));
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Children of current section ");
                sb.append(r8);
                sb.append(" is null!");
                throw new IllegalStateException(sb.toString());
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* renamed from: A05 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CSo(X.C337587ga r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C337577gZ
            if (r0 == 0) goto L_0x0048
            r2 = r3
            X.7gZ r2 = (X.C337577gZ) r2
            if (r2 == r4) goto L_0x00e1
            if (r4 == 0) goto L_0x0023
            java.lang.Class r1 = r2.getClass()
            java.lang.Class r0 = r4.getClass()
            if (r1 != r0) goto L_0x0023
            X.7gZ r4 = (X.C337577gZ) r4
            X.0sP r1 = r2.A01
            X.0sP r0 = r4.A01
            if (r1 == 0) goto L_0x0025
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0028
        L_0x0023:
            r0 = 0
            return r0
        L_0x0025:
            if (r0 == 0) goto L_0x0028
            goto L_0x0023
        L_0x0028:
            X.0sa r1 = r2.A00
            X.0sa r0 = r4.A00
            if (r1 == 0) goto L_0x0035
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0038
            goto L_0x0023
        L_0x0035:
            if (r0 == 0) goto L_0x0038
            goto L_0x0023
        L_0x0038:
            X.0sG r1 = r2.A03
            X.0sG r0 = r4.A03
            if (r1 == 0) goto L_0x0045
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00cf
            goto L_0x0023
        L_0x0045:
            if (r0 == 0) goto L_0x00cf
            goto L_0x0023
        L_0x0048:
            boolean r0 = r3 instanceof X.C337767gs
            if (r0 == 0) goto L_0x007d
            r2 = r3
            X.7gs r2 = (X.C337767gs) r2
            if (r2 == r4) goto L_0x00e1
            if (r4 == 0) goto L_0x0023
            java.lang.Class r1 = r2.getClass()
            java.lang.Class r0 = r4.getClass()
            if (r1 != r0) goto L_0x0023
            X.7gs r4 = (X.C337767gs) r4
            java.lang.Boolean r1 = r2.A03
            java.lang.Boolean r0 = r4.A03
            if (r1 == 0) goto L_0x006c
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x006f
            goto L_0x0023
        L_0x006c:
            if (r0 == 0) goto L_0x006f
            goto L_0x0023
        L_0x006f:
            java.util.List r1 = r2.A04
            java.util.List r0 = r4.A04
            if (r1 == 0) goto L_0x007a
            boolean r0 = r1.equals(r0)
            goto L_0x00d9
        L_0x007a:
            if (r0 == 0) goto L_0x00e1
            goto L_0x0023
        L_0x007d:
            r2 = r3
            X.9VY r2 = (X.AnonymousClass9VY) r2
            if (r2 == r4) goto L_0x00e1
            if (r4 == 0) goto L_0x0023
            java.lang.Class r1 = r2.getClass()
            java.lang.Class r0 = r4.getClass()
            if (r1 != r0) goto L_0x0023
            X.9VY r4 = (X.AnonymousClass9VY) r4
            X.GFO r1 = r2.A03
            X.GFO r0 = r4.A03
            if (r1 == 0) goto L_0x009d
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00a0
            goto L_0x0023
        L_0x009d:
            if (r0 == 0) goto L_0x00a0
            goto L_0x0023
        L_0x00a0:
            X.JTB r1 = r2.A02
            X.JTB r0 = r4.A02
            if (r1 == 0) goto L_0x00ae
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00b2
            goto L_0x0023
        L_0x00ae:
            if (r0 == 0) goto L_0x00b2
            goto L_0x0023
        L_0x00b2:
            X.4DU r1 = r2.A01
            X.4DU r0 = r4.A01
            if (r1 == 0) goto L_0x00c0
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00c4
            goto L_0x0023
        L_0x00c0:
            if (r0 == 0) goto L_0x00c4
            goto L_0x0023
        L_0x00c4:
            boolean r1 = r2.A04
            boolean r0 = r4.A04
            if (r1 != r0) goto L_0x0023
            com.instagram.common.session.UserSession r1 = r2.A00
            com.instagram.common.session.UserSession r0 = r4.A00
            goto L_0x00d3
        L_0x00cf:
            X.0sI r1 = r2.A02
            X.0sI r0 = r4.A02
        L_0x00d3:
            if (r1 == 0) goto L_0x00dd
            boolean r0 = r1.equals(r0)
        L_0x00d9:
            if (r0 != 0) goto L_0x00e1
            goto L_0x0023
        L_0x00dd:
            if (r0 == 0) goto L_0x00e1
            goto L_0x0023
        L_0x00e1:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C337587ga.CSo(X.7ga):boolean");
    }

    public final String toString() {
        return this.A09;
    }

    public C337587ga(String str) {
        this.A09 = str;
        this.A04 = str;
    }

    public final C337587ga A04(boolean z) {
        try {
            C337587ga r1 = (C337587ga) super.clone();
            if (!z) {
                if (r1.A05 != null) {
                    r1.A05 = new ArrayList();
                }
                r1.A00 = 0;
                r1.A07 = false;
                r1.A06 = null;
            }
            return r1;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
