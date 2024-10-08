package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.react.modules.appstate.AppStateModule;

public final class PyJ {
    public static Runnable A08;
    public static final Object A09 = Pxe.A0p();
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final Context A04;
    public final Handler A05 = AnonymousClass7TF.A0D();
    public final PyF A06;
    public final PyB A07;

    public PyJ(Context context, PyF pyF, PyB pyB) {
        String str;
        this.A07 = pyB;
        this.A02 = true;
        this.A04 = context;
        this.A06 = pyF;
        this.A03 = 34668546;
        pyB.A05.get(0);
        synchronized (this) {
            02m r5 = 02m.A0p;
            PyB pyB2 = this.A07;
            int i = pyB2.A00;
            1US r6 = (1US) pyB2.A05.get(0);
            r5.markerStart(34668546, i);
            r5.markerAnnotate(34668546, i, "module_name", r6.A00);
            r5.markerAnnotate(34668546, i, "google", C64601Rl.A00(this.A04));
            switch (pyB2.A04.intValue()) {
                case 0:
                    str = "foreground";
                    break;
                case 1:
                    str = AppStateModule.APP_STATE_BACKGROUND;
                    break;
                default:
                    str = "prefetch";
                    break;
            }
            r5.markerAnnotate(34668546, i, "use_case", str);
            r5.markerAnnotate(34668546, i, "is_downloaded", 1RH.A00().A05(r6));
            r5.markerAnnotate(34668546, i, "is_loaded", 1RH.A00().A06(r6));
            r5.markerAnnotate(34668546, i, "built_in", false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A01(boolean r9) {
        /*
            r8 = this;
            r7 = r8
            monitor-enter(r7)
            boolean r0 = r8.A02     // Catch:{ all -> 0x0084 }
            if (r0 != 0) goto L_0x0009
            boolean r0 = r8.A01     // Catch:{ all -> 0x0084 }
            goto L_0x0082
        L_0x0009:
            r4 = 0
            r8.A02 = r4     // Catch:{ all -> 0x0084 }
            boolean r0 = X.AnonymousClass7TF.A1Q(r9)
            X.02m r6 = X.02m.A0p     // Catch:{ all -> 0x0084 }
            X.PyB r3 = r8.A07     // Catch:{ all -> 0x0084 }
            int r5 = r3.A00     // Catch:{ all -> 0x0084 }
            r2 = 2
            if (r0 == 0) goto L_0x001f
            r1 = 34668546(0x2110002, float:1.065292E-37)
            r0 = 461(0x1cd, float:6.46E-43)
            goto L_0x0055
        L_0x001f:
            X.PyF r1 = r8.A06     // Catch:{ all -> 0x0084 }
            boolean r0 = r1.A07()     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = r1.A04()     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = r1.A04()     // Catch:{ all -> 0x0084 }
            X.5mY r0 = (X.C294495mY) r0     // Catch:{ all -> 0x0084 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x003f
            r0 = 34668546(0x2110002, float:1.065292E-37)
            r6.markerEnd(r0, r5, r2)     // Catch:{ all -> 0x0084 }
            r0 = 1
            goto L_0x0059
        L_0x003f:
            java.lang.Exception r0 = r1.A03()     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x0051
            r2 = 34668546(0x2110002, float:1.065292E-37)
            java.lang.String r1 = "error"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0084 }
            r6.markerAnnotate(r2, r5, r1, r0)     // Catch:{ all -> 0x0084 }
        L_0x0051:
            r1 = 34668546(0x2110002, float:1.065292E-37)
            r0 = 3
        L_0x0055:
            r6.markerEnd(r1, r5, r0)     // Catch:{ all -> 0x0084 }
            r0 = 0
        L_0x0059:
            r8.A01 = r0     // Catch:{ all -> 0x0086 }
            java.util.List r0 = r3.A05     // Catch:{ all -> 0x0086 }
            r0.get(r4)     // Catch:{ all -> 0x0086 }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0086 }
            X.8aN r0 = r3.A03     // Catch:{ all -> 0x0086 }
            if (r9 == 0) goto L_0x007b
            if (r0 == 0) goto L_0x007b
            X.84R r2 = new X.84R     // Catch:{ all -> 0x0086 }
            r2.<init>(r8, r0)     // Catch:{ all -> 0x0086 }
            java.lang.Integer r1 = X.PyA.A00(r3)     // Catch:{ all -> 0x0086 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0086 }
            if (r1 != r0) goto L_0x007e
            android.os.Handler r0 = r8.A05     // Catch:{ all -> 0x0086 }
            r0.post(r2)     // Catch:{ all -> 0x0086 }
        L_0x007b:
            boolean r0 = r8.A01     // Catch:{ all -> 0x0086 }
            goto L_0x0082
        L_0x007e:
            r2.run()     // Catch:{ all -> 0x0086 }
            goto L_0x007b
        L_0x0082:
            monitor-exit(r7)
            return r0
        L_0x0084:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PyJ.A01(boolean):boolean");
    }

    public final void A00() {
        PyB pyB = this.A07;
        if (PyA.A00(pyB) == AnonymousClass05K.A00 && pyB.A02 != null) {
            synchronized (this) {
                if (this.A00) {
                    this.A05.post(new C12930TDt(this));
                } else {
                    synchronized (A09) {
                        Runnable runnable = A08;
                        if (runnable != null) {
                            this.A05.removeCallbacks(runnable);
                            A08 = null;
                        }
                    }
                }
            }
        }
    }
}
