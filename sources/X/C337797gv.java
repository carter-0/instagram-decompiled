package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7gv  reason: invalid class name and case insensitive filesystem */
public final class C337797gv {
    public int A00;
    public C338037hJ A01;
    public C337587ga A02;
    public final List A03 = new ArrayList();

    public static C337797gv A00(C337797gv r16, C337797gv r17) {
        int i;
        C338037hJ r2;
        C338037hJ r1 = null;
        int i2 = 0;
        C337797gv r5 = new C337797gv();
        r5.A00 = 0;
        r5.A02 = null;
        r5.A01 = null;
        C337797gv r0 = r16;
        if (r16 != null) {
            i = r0.A00;
        } else {
            i = 0;
        }
        C337797gv r8 = r17;
        if (r17 != null) {
            i2 = r8.A00;
        }
        List list = r5.A03;
        if (r16 != null) {
            r2 = r0.A01;
        } else {
            r2 = null;
        }
        if (r17 != null) {
            r1 = r8.A01;
        }
        if (r16 != null) {
            for (Object add : r0.A03) {
                list.add(add);
            }
        }
        if (r17 != null) {
            for (C337897h5 r7 : r8.A03) {
                int i3 = r7.A02;
                int i4 = -1;
                if (i3 >= 0) {
                    i4 = i3 + i;
                }
                list.add(new C337897h5(r7.A04, r7.A07, r7.A06, r7.A05, r7.A03, r7.A01 + i, i4, r7.A00));
            }
        }
        r5.A00 = i + i2;
        if (r2 != null) {
            if (r1 != null) {
                r2 = r2.A00(r1);
            }
            r1 = r2;
        }
        r5.A01 = r1;
        return r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        r11.A01 = r0.A00(new X.C338037hJ(r3, r4, r5, r6, r7, r8, r9, r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C337897h5 r12) {
        /*
            r11 = this;
            java.util.List r0 = r11.A03
            r0.add(r12)
            int r2 = r12.A03
            r1 = -3
            r3 = 1
            r0 = -1
            if (r2 == r1) goto L_0x005e
            if (r2 == r0) goto L_0x005b
            if (r2 == r3) goto L_0x0015
            r0 = 3
            r3 = -1
            if (r2 == r0) goto L_0x0015
            r3 = 0
        L_0x0015:
            int r0 = r11.A00
            int r0 = r0 + r3
            r11.A00 = r0
            X.7hJ r0 = r11.A01
            if (r0 == 0) goto L_0x0033
            switch(r2) {
                case -3: goto L_0x0034;
                case -2: goto L_0x003a;
                case -1: goto L_0x0042;
                case 0: goto L_0x0046;
                case 1: goto L_0x004f;
                case 2: goto L_0x0051;
                case 3: goto L_0x0057;
                default: goto L_0x0021;
            }
        L_0x0021:
            r4 = 0
        L_0x0022:
            r5 = 0
        L_0x0023:
            r6 = 0
        L_0x0024:
            r7 = 0
        L_0x0025:
            r8 = 0
        L_0x0026:
            r9 = 0
        L_0x0027:
            r10 = 0
        L_0x0028:
            X.7hJ r2 = new X.7hJ
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            X.7hJ r0 = r0.A00(r2)
            r11.A01 = r0
        L_0x0033:
            return
        L_0x0034:
            int r7 = r12.A00
            r4 = 0
            r5 = 0
            r6 = 0
            goto L_0x0025
        L_0x003a:
            int r9 = r12.A00
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            goto L_0x0027
        L_0x0042:
            int r5 = r12.A00
            r4 = 0
            goto L_0x0023
        L_0x0046:
            int r10 = r12.A00
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            goto L_0x0028
        L_0x004f:
            r4 = 1
            goto L_0x0022
        L_0x0051:
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            goto L_0x0026
        L_0x0057:
            r4 = 0
            r5 = 0
            r6 = 1
            goto L_0x0024
        L_0x005b:
            int r3 = r12.A00
            goto L_0x0015
        L_0x005e:
            int r0 = r12.A00
            int r3 = -r0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C337797gv.A01(X.7h5):void");
    }
}
