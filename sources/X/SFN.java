package X;

import android.content.Context;
import java.util.regex.Pattern;

public final class SFN {
    public static final Pattern A04 = Pattern.compile("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");
    public static final Pattern A05 = Pattern.compile("\\d+");
    public static final String[] A06 = {"-journal", "-journal", "-uid", "-wal", "-shm", "-selfcheck", ".dat", ".back", ".corrupt"};
    public String A00;
    public String A01;
    public final Context A02;
    public final C10243Rp3 A03;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r1 == null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SFN(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            android.content.Context r2 = r4.getApplicationContext()
            r3.A02 = r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo()
            if (r0 == 0) goto L_0x0029
            java.lang.String r1 = r0.dataDir
            if (r1 == 0) goto L_0x0029
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0029
            java.io.File r1 = X.AnonymousClass7TE.A0t(r1)
        L_0x0021:
            X.Rp3 r0 = new X.Rp3
            r0.<init>(r1)
        L_0x0026:
            r3.A03 = r0
            return
        L_0x0029:
            java.io.File r0 = r2.getCacheDir()
            if (r0 != 0) goto L_0x0034
            r1 = 0
        L_0x0030:
            r0 = 0
            if (r1 != 0) goto L_0x0021
            goto L_0x0026
        L_0x0034:
            java.io.File r1 = r0.getParentFile()
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SFN.<init>(android.content.Context):void");
    }
}
