package X;

import android.util.SparseArray;

/* renamed from: X.4xe  reason: invalid class name and case insensitive filesystem */
public abstract class C278864xe {
    public boolean A00(int i) {
        if (this instanceof C278894xh) {
            return false;
        }
        SparseArray sparseArray = C278854xd.A00;
        C278904xi r3 = (C278904xi) sparseArray.get(i);
        if (r3 == null || r3.A00 == null) {
            return true;
        }
        sparseArray.remove(i);
        if (r3.A00.isDone()) {
            return false;
        }
        if (r3.A01) {
            0KC.A0P("DumpUploadJob", "Job %d running past cancel - interrupt not supported", new Object[]{Integer.valueOf(i)});
            return false;
        }
        r3.A00.cancel(false);
        return true;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.4xi, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(android.os.Bundle r9, X.C278884xg r10, int r11) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C278894xh
            r6 = r10
            if (r0 == 0) goto L_0x0086
            if (r9 == 0) goto L_0x0011
            java.lang.String r1 = "unknown"
            java.lang.String r0 = "trigger"
            java.lang.String r1 = r9.getString(r0, r1)
            if (r1 != 0) goto L_0x0013
        L_0x0011:
            java.lang.String r1 = "unknown"
        L_0x0013:
            int r0 = r1.hashCode()
            switch(r0) {
                case -1484649986: goto L_0x0077;
                case 3615: goto L_0x006c;
                case 101200: goto L_0x0061;
                case 109457: goto L_0x0056;
                case 602983540: goto L_0x004b;
                case 1144304223: goto L_0x0040;
                case 1427822892: goto L_0x0035;
                case 1454414201: goto L_0x002a;
                default: goto L_0x001a;
            }
        L_0x001a:
            java.lang.Integer r2 = X.AnonymousClass05K.A0u
        L_0x001c:
            X.95d r1 = new X.95d
            r1.<init>(r10)
            X.3R2 r0 = X.AnonymousClass3QY.A00()
            r0.CsW(r1, r2)
        L_0x0028:
            r0 = 1
            return r0
        L_0x002a:
            java.lang.String r0 = "session_change"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001a
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            goto L_0x001c
        L_0x0035:
            java.lang.String r0 = "background_job"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001a
            java.lang.Integer r2 = X.AnonymousClass05K.A0j
            goto L_0x001c
        L_0x0040:
            java.lang.String r0 = "app_startup"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001a
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            goto L_0x001c
        L_0x004b:
            java.lang.String r0 = "dev_options"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001a
            java.lang.Integer r2 = X.AnonymousClass05K.A15
            goto L_0x001c
        L_0x0056:
            java.lang.String r0 = "nux"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001a
            java.lang.Integer r2 = X.AnonymousClass05K.A1F
            goto L_0x001c
        L_0x0061:
            java.lang.String r0 = "fcm"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001a
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            goto L_0x001c
        L_0x006c:
            java.lang.String r0 = "qp"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001a
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            goto L_0x001c
        L_0x0077:
            r0 = 2618(0xa3a, float:3.669E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001a
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            goto L_0x001c
        L_0x0086:
            X.2QF r3 = X.2QF.A00()
            r1 = 0
            X.4xi r5 = new X.4xi
            r5.<init>()
            monitor-enter(r3)
            X.2Pn r4 = r3.A0E     // Catch:{ all -> 0x00b3 }
            monitor-exit(r3)
            X.4xj r2 = new X.4xj
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask
            r0.<init>(r2, r1)
            r5.A00 = r0
            android.util.SparseArray r0 = X.C278854xd.A00
            r0.append(r11, r5)
            X.4xm r0 = r3.A04()
            java.util.concurrent.Executor r1 = r0.A09
            java.util.concurrent.FutureTask r0 = r5.A00
            r1.execute(r0)
            goto L_0x0028
        L_0x00b3:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C278864xe.A01(android.os.Bundle, X.4xg, int):boolean");
    }
}
