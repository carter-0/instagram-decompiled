package X;

import java.io.BufferedReader;
import java.io.FileReader;

/* renamed from: X.Sks  reason: case insensitive filesystem */
public final class C12031Sks implements C274924pJ {
    public boolean A00;

    public final String getName() {
        return "memory_pressure";
    }

    public final void update() {
    }

    public final void AGZ(S3X s3x, StackTraceElement[] stackTraceElementArr) {
        BufferedReader bufferedReader;
        if (this.A00 && (s3x instanceof QJT)) {
            QJT qjt = (QJT) s3x;
            try {
                bufferedReader = new BufferedReader(new FileReader(AnonymousClass7TE.A0t("/proc/pressure/memory")));
                String[] strArr = {bufferedReader.readLine(), bufferedReader.readLine(), bufferedReader.readLine()};
                bufferedReader.close();
                qjt.A0E = strArr;
            } catch (Throwable unused) {
                this.A00 = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r1.canRead() == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12031Sks() {
        /*
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "/proc/pressure/memory"
            java.io.File r1 = X.AnonymousClass7TE.A0t(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0016
            boolean r1 = r1.canRead()
            r0 = 1
            if (r1 != 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12031Sks.<init>():void");
    }
}
