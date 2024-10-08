package X;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.TQr  reason: case insensitive filesystem */
public final class C13225TQr extends RuntimeException {
    public Throwable A00;
    public final List A01;
    public final String A02;

    /* JADX WARNING: Can't wrap try/catch for region: R(9:9|(1:(1:12)(1:(2:13|(1:16)(1:49))))(0)|17|(4:20|(2:22|52)(2:23|53)|51|18)|24|25|26|27|(1:46)(2:29|(2:31|47)(3:(2:32|(1:36)(1:35))|36|48))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0068 */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0015 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Throwable getCause() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Throwable r5 = r8.A00     // Catch:{ all -> 0x0083 }
            if (r5 != 0) goto L_0x0081
            X.TQj r5 = new X.TQj     // Catch:{ all -> 0x0083 }
            r5.<init>()     // Catch:{ all -> 0x0083 }
            java.util.HashSet r4 = X.AnonymousClass7TE.A1F()     // Catch:{ all -> 0x0083 }
            java.util.List r0 = r8.A01     // Catch:{ all -> 0x0083 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x0083 }
            r6 = r5
        L_0x0015:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x007f
            java.lang.Object r3 = r7.next()     // Catch:{ all -> 0x0083 }
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch:{ all -> 0x0083 }
            boolean r0 = r4.contains(r3)     // Catch:{ all -> 0x0083 }
            if (r0 != 0) goto L_0x0015
            r4.add(r3)     // Catch:{ all -> 0x0083 }
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0083 }
            java.lang.Throwable r1 = r3.getCause()     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x0044
            if (r1 != r3) goto L_0x0037
            goto L_0x0044
        L_0x0037:
            r2.add(r1)     // Catch:{ all -> 0x0083 }
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0044
            if (r0 == r1) goto L_0x0044
            r1 = r0
            goto L_0x0037
        L_0x0044:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0083 }
        L_0x0048:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0065
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0083 }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ all -> 0x0083 }
            boolean r0 = r4.contains(r1)     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = "Duplicate found in causal chain so cropping to prevent loop ..."
            java.lang.RuntimeException r3 = X.AnonymousClass7TE.A15(r0)     // Catch:{ all -> 0x0083 }
            goto L_0x0048
        L_0x0061:
            r4.add(r1)     // Catch:{ all -> 0x0083 }
            goto L_0x0048
        L_0x0065:
            r6.initCause(r3)     // Catch:{ all -> 0x0068 }
        L_0x0068:
            java.lang.Throwable r1 = r6.getCause()     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x0015
            java.lang.Throwable r0 = r8.A00     // Catch:{ all -> 0x0083 }
            if (r0 != r1) goto L_0x0073
            goto L_0x0015
        L_0x0073:
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x007d
            if (r0 == r1) goto L_0x007d
            r1 = r0
            goto L_0x0073
        L_0x007d:
            r6 = r1
            goto L_0x0015
        L_0x007f:
            r8.A00 = r5     // Catch:{ all -> 0x0083 }
        L_0x0081:
            monitor-exit(r8)
            return r5
        L_0x0083:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13225TQr.getCause():java.lang.Throwable");
    }

    public final String getMessage() {
        return this.A02;
    }

    public final void printStackTrace(PrintStream printStream) {
        StringBuilder A14 = Pxe.A14(128);
        A14.append(this);
        A14.append(10);
        for (StackTraceElement append : getStackTrace()) {
            A14.append("\tat ");
            A14.append(append);
            A14.append(10);
        }
        int i = 1;
        for (Throwable A002 : this.A01) {
            A14.append("  ComposedException ");
            A14.append(i);
            A14.append(" :\n");
            A00("\t", A14, A002);
            i++;
        }
        printStream.println(A14.toString());
    }

    public C13225TQr(Iterable iterable) {
        LinkedHashSet A0y = DbS.A0y();
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (iterable != null) {
            for (Object obj : iterable) {
                if (obj instanceof C13225TQr) {
                    A0y.addAll(((C13225TQr) obj).A01);
                } else {
                    A0y.add(obj == null ? AnonymousClass7TE.A11("Throwable was null!") : obj);
                }
            }
        } else {
            A0y.add(AnonymousClass7TE.A11("errors was null"));
        }
        if (!A0y.isEmpty()) {
            A1C.addAll(A0y);
            List unmodifiableList = Collections.unmodifiableList(A1C);
            this.A01 = unmodifiableList;
            this.A02 = 002.A03(unmodifiableList.size(), " exceptions occurred. ");
            return;
        }
        throw AnonymousClass7TE.A0w("errors is empty");
    }

    private void A00(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(th);
        sb.append(10);
        for (StackTraceElement append : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(append);
            sb.append(10);
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            A00("", sb, th.getCause());
        }
    }

    public final void printStackTrace(PrintWriter printWriter) {
        StringBuilder A14 = Pxe.A14(128);
        A14.append(this);
        A14.append(10);
        for (StackTraceElement append : getStackTrace()) {
            A14.append("\tat ");
            A14.append(append);
            A14.append(10);
        }
        int i = 1;
        for (Throwable A002 : this.A01) {
            A14.append("  ComposedException ");
            A14.append(i);
            A14.append(" :\n");
            A00("\t", A14, A002);
            i++;
        }
        printWriter.println(A14.toString());
    }

    public final void printStackTrace() {
        printStackTrace(System.err);
    }
}
