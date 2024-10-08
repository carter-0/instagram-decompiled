package X;

import android.content.Context;
import java.util.Map;

public abstract class SRj {
    /* JADX WARNING: type inference failed for: r0v10, types: [X.SrR, java.lang.Object] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C7232Q0d A01(android.content.Context r5, android.net.Uri r6, boolean r7) {
        /*
            r4 = 0
            r1 = 1
            java.lang.String r0 = r6.getPath()
            if (r0 != 0) goto L_0x0009
            r1 = 0
        L_0x0009:
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()
            java.lang.String r3 = "Path cannot be null contentUri: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r6, r3, r0)
            X.C266784aL.A06(r1, r0)
            java.io.File r0 = X.Pxg.A0Y(r6)
            java.lang.String r1 = r0.getPath()
            java.lang.String r0 = "video/mp4"
            java.lang.String r1 = X.Q1U.A00(r1, r0, r4)
            java.lang.String r0 = "video"
            r2 = 0
            boolean r0 = X.00p.A0k(r1, r0, r4)
            if (r0 == 0) goto L_0x0039
            X.Q1i r0 = new X.Q1i
            r0.<init>(r5, r7)
            X.Q0d r2 = r0.AU7(r6)     // Catch:{ IOException | RuntimeException -> 0x0055 }
            return r2
        L_0x0039:
            r1 = 1
            java.lang.String r0 = r6.getPath()
            if (r0 != 0) goto L_0x0041
            r1 = 0
        L_0x0041:
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r6, r3, r0)
            X.C266784aL.A06(r1, r0)
            X.SrR r0 = new X.SrR
            r0.<init>()
            X.Q0d r2 = r0.AU7(r6)     // Catch:{  }
        L_0x0055:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SRj.A01(android.content.Context, android.net.Uri, boolean):X.Q0d");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: X.Tgv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: X.Tgv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: X.Tgv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: X.Tgv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: X.Tgv} */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.Tgt, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v2, types: [X.Tfv, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C13778Tgt A00(X.C10848Rz8 r17) {
        /*
            r0 = r17
            X.RzN r1 = r0.A0C     // Catch:{ all -> 0x0084 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0084 }
            X.Tfv r11 = r0.A06     // Catch:{ all -> 0x0084 }
            X.0qQ.A07(r11)     // Catch:{ all -> 0x0084 }
            r14 = 0
            r13 = 1
            com.facebook.videolite.transcoder.base.composition.MediaComposition r12 = r1.A08     // Catch:{ all -> 0x0084 }
            if (r12 == 0) goto L_0x001d
            X.SrR r10 = new X.SrR     // Catch:{ all -> 0x0084 }
            r10.<init>()     // Catch:{ all -> 0x0084 }
            r15 = r14
            X.Q0d r10 = X.S9V.A00(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0084 }
            goto L_0x0029
        L_0x001d:
            java.io.File r2 = r1.A0D     // Catch:{ all -> 0x0084 }
            if (r2 == 0) goto L_0x007c
            android.net.Uri r2 = android.net.Uri.fromFile(r2)     // Catch:{ all -> 0x0084 }
            X.Q0d r10 = r11.AU7(r2)     // Catch:{ all -> 0x0084 }
        L_0x0029:
            if (r10 == 0) goto L_0x0077
            android.content.Context r5 = r0.A00     // Catch:{ all -> 0x0084 }
            X.ThT r15 = r0.A0A     // Catch:{ all -> 0x0084 }
            X.TdI r13 = r0.A08     // Catch:{ all -> 0x0084 }
            X.Tgv r14 = r0.A09     // Catch:{ all -> 0x0084 }
            X.0qQ.A07(r14)     // Catch:{ all -> 0x0084 }
            r3 = 0
            boolean r2 = r1.A0I     // Catch:{ all -> 0x0084 }
            if (r2 != 0) goto L_0x004a
            boolean r2 = A04(r1)     // Catch:{ all -> 0x0084 }
            if (r2 == 0) goto L_0x006b
            boolean r4 = r14.AFw()     // Catch:{ all -> 0x0084 }
            java.lang.String r2 = "Incompatible MediaExtractor for pass through"
            X.C266784aL.A06(r4, r2)     // Catch:{ all -> 0x0084 }
        L_0x004a:
            X.TdQ r2 = r0.A0D     // Catch:{ all -> 0x0084 }
            X.TdG r8 = r0.A04     // Catch:{ all -> 0x0084 }
            X.STP r9 = r0.A05     // Catch:{ all -> 0x0084 }
            X.TdH r12 = r0.A07     // Catch:{ all -> 0x0084 }
            X.Q1d r7 = r0.A03     // Catch:{ all -> 0x0084 }
            X.Tfu r6 = r0.A02     // Catch:{ all -> 0x0084 }
            X.Q4l r4 = new X.Q4l     // Catch:{ all -> 0x0084 }
            r17 = r2
            r16 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0084 }
            java.util.concurrent.ExecutorService r2 = r0.A0E     // Catch:{ all -> 0x0084 }
            X.Rs3 r1 = new X.Rs3     // Catch:{ all -> 0x0084 }
            r1.<init>(r3, r2)     // Catch:{ all -> 0x0084 }
            X.Sr7 r0 = X.TL9.A00(r1, r4)     // Catch:{ all -> 0x0084 }
            return r0
        L_0x006b:
            boolean r2 = r14.AFy()     // Catch:{ all -> 0x0084 }
            if (r2 != 0) goto L_0x004a
            X.Q4U r14 = new X.Q4U     // Catch:{ all -> 0x0084 }
            r14.<init>()     // Catch:{ all -> 0x0084 }
            goto L_0x004a
        L_0x0077:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x0084 }
            goto L_0x0083
        L_0x007c:
            java.lang.String r1 = "unable to extract MediaMetadata without MediaComposition or input file"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r1)     // Catch:{ all -> 0x0084 }
        L_0x0083:
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r3 = move-exception
            java.lang.String r2 = "TranscodeUtil"
            java.lang.String r1 = "Throwable"
            X.0KC.A0F(r2, r1, r3)
            r3.getMessage()
            X.RzN r0 = r0.A0C
            X.Ti9 r2 = r0.A07
            if (r2 == 0) goto L_0x00a2
            X.4ZS r1 = new X.4ZS
            r1.<init>(r3)
            X.SJL r0 = new X.SJL
            r0.<init>()
            r2.DDE(r0, r1)
        L_0x00a2:
            X.Sr6 r0 = new X.Sr6
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SRj.A00(X.Rz8):X.Tgt");
    }

    public static final C7232Q0d A02(Context context, String str, boolean z) {
        if (str == null) {
            return null;
        }
        try {
            return A01(context, DbT.A09(str), z);
        } catch (Exception e) {
            0KC.A0L("TranscodeUtil", "Exception in extractVideoMetadata for filePath: %s", e, new Object[]{str});
            return null;
        }
    }

    public static final void A03(C11354SOn sOn, String str, Map map, int i, int i2, boolean z) {
        if (z) {
            sOn.A0B = 0;
        }
        sOn.A0C = i;
        sOn.A0A = i2;
        sOn.A0O = true;
        sOn.A03 = 5;
        int i3 = (int) ((long) (((int) ((((double) ((((float) (i * i2)) * 30.0f) * 2.0f)) * 0.07d) / 1000.0d)) * 1024));
        sOn.A01 = i3;
        sOn.A04 = i3;
        if (str != null) {
            sOn.A0G = SJA.A00(str);
        }
        sOn.A0L = map;
    }

    public static final boolean A04(C10862RzN rzN) {
        if (rzN.A06 != null) {
            return false;
        }
        long j = rzN.A04;
        if (j == 0 || j == -1) {
            return true;
        }
        return false;
    }
}
