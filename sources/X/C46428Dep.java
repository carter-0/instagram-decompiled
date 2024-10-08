package X;

/* renamed from: X.Dep  reason: case insensitive filesystem */
public final class C46428Dep implements AnonymousClass11X {
    public final AnonymousClass11X A00;
    public final Integer A01;

    public final String getName() {
        return this.A00.getName();
    }

    public final int getRunnableId() {
        return this.A00.getRunnableId();
    }

    public final void onCancel() {
        this.A00.onCancel();
    }

    public final void onFinish() {
        this.A00.onFinish();
    }

    public final void onStart() {
        this.A00.onStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r5 = android.os.Process.getThreadPriority(android.os.Process.myTid());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            java.lang.Integer r6 = r7.A01
            if (r6 == 0) goto L_0x0057
            int r0 = android.os.Process.myTid()
            int r5 = android.os.Process.getThreadPriority(r0)
            int r4 = r6.intValue()
            if (r4 >= r5) goto L_0x0057
            r2 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r2)
            if (r0 == 0) goto L_0x002e
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r6, r0, r1)
            r0 = 975726106(0x3a28661a, float:6.423906E-4)
            X.0fS.A01(r1, r0)
        L_0x002e:
            android.os.Process.setThreadPriority(r4)
            X.11X r0 = r7.A00     // Catch:{ all -> 0x0046 }
            r0.run()     // Catch:{ all -> 0x0046 }
            android.os.Process.setThreadPriority(r5)
            boolean r0 = com.facebook.systrace.Systrace.A0E(r2)
            if (r0 == 0) goto L_0x005c
            r0 = 1405146987(0x53c0d76b, float:1.65649567E12)
            X.0fS.A00(r0)
            return
        L_0x0046:
            r1 = move-exception
            android.os.Process.setThreadPriority(r5)
            boolean r0 = com.facebook.systrace.Systrace.A0E(r2)
            if (r0 == 0) goto L_0x0056
            r0 = -1970267686(0xffffffff8a9019da, float:-1.387642E-32)
            X.0fS.A00(r0)
        L_0x0056:
            throw r1
        L_0x0057:
            X.11X r0 = r7.A00
            r0.run()
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46428Dep.run():void");
    }

    public C46428Dep(AnonymousClass11X r1, Integer num) {
        this.A00 = r1;
        this.A01 = num;
    }
}
