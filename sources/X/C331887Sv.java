package X;

import android.content.Context;
import com.facebook.stash.core.FileStash;

/* renamed from: X.7Sv  reason: invalid class name and case insensitive filesystem */
public final class C331887Sv {
    public static final 1QU A03;
    public final FileStash A00;
    public final C331897Sw A01;
    public final 14G A02;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r4 = 0
            X.0qQ.A0B(r7, r4)
            if (r8 != 0) goto L_0x000f
            X.7Sz r0 = new X.7Sz
            r0.<init>()
            java.lang.String r8 = r0.A00(r7)
        L_0x000f:
            com.facebook.stash.core.FileStash r5 = r6.A00
            boolean r0 = r5.hasKey(r8)
            if (r0 == 0) goto L_0x0044
            java.io.InputStream r2 = r5.read(r8)
            if (r2 == 0) goto L_0x0043
            r1 = 20
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>(r1)
            byte[] r1 = X.1W7.A01(r2, r0, r4)
            if (r1 == 0) goto L_0x0043
        L_0x002a:
            X.7Sw r3 = r6.A01
            boolean r0 = X.C331917Sy.A02(r7)
            if (r0 == 0) goto L_0x0043
            X.WXS r2 = new X.WXS
            r2.<init>(r3, r7, r1)
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x0071
            X.ToU r0 = new X.ToU
            r0.<init>(r2, r3)
            X.11Z.A02(r0)
        L_0x0043:
            return
        L_0x0044:
            X.16e r0 = X.AnonymousClass2hY.A09
            X.2hY r3 = r0.E1h(r7)
            X.14G r2 = r6.A02
            X.1QU r1 = A03
            r0 = 0
            X.47Y r0 = r2.A08(r1, r3, r0)
            X.1Qb r0 = r0.A02
            java.io.InputStream r2 = r0.AjD()
            r1 = 20
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>(r1)
            byte[] r1 = X.1W7.A01(r2, r0, r4)
            if (r1 == 0) goto L_0x0043
            java.io.OutputStream r2 = r5.write(r8)
            r2.write(r1)     // Catch:{ all -> 0x007c }
            r2.close()
            goto L_0x002a
        L_0x0071:
            java.util.concurrent.ExecutorService r1 = r3.A07
            X.6tk r0 = new X.6tk
            r0.<init>(r2, r3)
            r1.execute(r0)
            return
        L_0x007c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007e }
        L_0x007e:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331887Sv.A00(java.lang.String, java.lang.String):void");
    }

    static {
        AnonymousClass1QT r1 = new AnonymousClass1QT();
        r1.A04 = 1CE.A06;
        r1.A03 = 1Fe.A03;
        A03 = r1.A00();
    }

    public /* synthetic */ C331887Sv(FileStash fileStash) {
        C331897Sw r0 = C331897Sw.A0A;
        Context context = C60960kU.A00;
        0qQ.A07(context);
        C331897Sw A002 = C331917Sy.A00(context);
        14G A032 = 14G.A03();
        0qQ.A0B(A002, 2);
        0qQ.A0B(A032, 3);
        this.A00 = fileStash;
        this.A01 = A002;
        this.A02 = A032;
    }
}
