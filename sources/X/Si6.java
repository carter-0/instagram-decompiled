package X;

import android.media.MediaMetadataRetriever;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Si6 implements C13691Tf9 {
    public static final SJ8 A03 = new SJ8(new C11862Sho(), C66580MXl.A0q(), "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption");
    public static final SJ8 A04 = new SJ8(new C11861Shn(), -1L, "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame");
    public static final List A05 = Collections.unmodifiableList(Arrays.asList(new String[]{"TP1A", "TD1A.220804.031"}));
    public static final C9211RTo A06 = new Object();
    public final C13813Thg A00;
    public final C9211RTo A01;
    public final C13537Tc9 A02;

    public final boolean CJU(C11856Shi shi, Object obj) {
        return true;
    }

    public Si6(C13813Thg thg, C13537Tc9 tc9) {
        C9211RTo rTo = A06;
        this.A00 = thg;
        this.A02 = tc9;
        this.A01 = rTo;
    }

    public static boolean A00(MediaMetadataRetriever mediaMetadataRetriever) {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int parseInt = Integer.parseInt(extractMetadata);
        int parseInt2 = Integer.parseInt(extractMetadata2);
        if ((parseInt == 7 || parseInt == 6) && parseInt2 == 6) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x004f: MOVE  (r6v4 int) = (r18v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a5 A[Catch:{ all -> 0x0089, all -> 0x0116 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00be A[Catch:{ all -> 0x0089, all -> 0x0116 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0110 A[SYNTHETIC, Splitter:B:65:0x0110] */
    public final X.C13796ThF ANe(X.C11856Shi r15, java.lang.Object r16, int r17, int r18) {
        /*
            r14 = this;
            X.SJ8 r0 = A04
            java.lang.Object r0 = r15.A00(r0)
            long r9 = X.AnonymousClass7TE.A0R(r0)
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x001d
            r1 = -1
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = "Requested frame must be non-negative, or DEFAULT_FRAME, given: "
            java.lang.IllegalArgumentException r1 = X.Pxg.A0b(r0, r9)
            throw r1
        L_0x001d:
            X.SJ8 r0 = A03
            java.lang.Object r1 = r15.A00(r0)
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 != 0) goto L_0x002b
            java.lang.Integer r1 = X.C66580MXl.A0q()
        L_0x002b:
            X.SJ8 r0 = X.C10977S3l.A00
            java.lang.Object r5 = r15.A00(r0)
            X.S3l r5 = (X.C10977S3l) r5
            if (r5 != 0) goto L_0x0037
            X.S3l r5 = X.C10977S3l.A03
        L_0x0037:
            android.media.MediaMetadataRetriever r8 = new android.media.MediaMetadataRetriever
            r8.<init>()
            r4 = 29
            X.Tc9 r0 = r14.A02     // Catch:{ all -> 0x0116 }
            r2 = r16
            r0.CN2(r8, r2)     // Catch:{ all -> 0x0116 }
            int r11 = r1.intValue()     // Catch:{ all -> 0x0116 }
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r17
            if (r7 == r0) goto L_0x008f
            r6 = r18
            if (r6 == r0) goto L_0x008f
            X.S3l r0 = X.C10977S3l.A05     // Catch:{ all -> 0x0116 }
            if (r5 == r0) goto L_0x008f
            r0 = 18
            int r3 = X.Pxh.A07(r8, r0)     // Catch:{ all -> 0x0089 }
            r0 = 19
            int r2 = X.Pxh.A07(r8, r0)     // Catch:{ all -> 0x0089 }
            r0 = 24
            int r1 = X.Pxh.A07(r8, r0)     // Catch:{ all -> 0x0089 }
            r0 = 90
            if (r1 == r0) goto L_0x0071
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != r0) goto L_0x0074
        L_0x0071:
            r0 = r2
            r2 = r3
            r3 = r0
        L_0x0074:
            float r1 = r5.A00(r3, r2, r7, r6)     // Catch:{ all -> 0x0089 }
            float r0 = (float) r3     // Catch:{ all -> 0x0089 }
            int r12 = X.AnonymousClass7TE.A05(r0, r1)     // Catch:{ all -> 0x0089 }
            float r0 = (float) r2     // Catch:{ all -> 0x0089 }
            int r13 = X.AnonymousClass7TE.A05(r1, r0)     // Catch:{ all -> 0x0089 }
            android.graphics.Bitmap r6 = r8.getScaledFrameAtTime(r9, r11, r12, r13)     // Catch:{ all -> 0x0089 }
            if (r6 != 0) goto L_0x0093
            goto L_0x008f
        L_0x0089:
            r1 = 3
            java.lang.String r0 = "VideoDecoder"
            android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0116 }
        L_0x008f:
            android.graphics.Bitmap r6 = r8.getFrameAtTime(r9, r11)     // Catch:{ all -> 0x0116 }
        L_0x0093:
            java.lang.String r3 = "VideoDecoder"
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = "Pixel"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x0116 }
            r2 = 33
            if (r0 == 0) goto L_0x00be
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0116 }
            if (r0 != r2) goto L_0x00be
            java.util.List r0 = A05     // Catch:{ all -> 0x0116 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0116 }
        L_0x00ab:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0116 }
            if (r0 == 0) goto L_0x00fb
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = android.os.Build.ID     // Catch:{ all -> 0x0116 }
            boolean r0 = r0.startsWith(r1)     // Catch:{ all -> 0x0116 }
            if (r0 == 0) goto L_0x00ab
            goto L_0x00c6
        L_0x00be:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0116 }
            r0 = 30
            if (r1 < r0) goto L_0x00fb
            if (r1 >= r2) goto L_0x00fb
        L_0x00c6:
            r2 = 3
            boolean r0 = A00(r8)     // Catch:{ NumberFormatException -> 0x00f8 }
            if (r0 == 0) goto L_0x00fb
            r0 = 24
            int r0 = X.Pxh.A07(r8, r0)     // Catch:{ NumberFormatException -> 0x00f8 }
            int r1 = java.lang.Math.abs(r0)     // Catch:{ NumberFormatException -> 0x00f8 }
            r0 = 180(0xb4, float:2.52E-43)
            if (r1 != r0) goto L_0x00fb
            android.util.Log.isLoggable(r3, r2)     // Catch:{ all -> 0x0116 }
            android.graphics.Matrix r5 = X.AnonymousClass7TE.A0U()     // Catch:{ all -> 0x0116 }
            r3 = 1127481344(0x43340000, float:180.0)
            float r2 = X.JTO.A02(r6)     // Catch:{ all -> 0x0116 }
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r1
            float r0 = X.JTO.A01(r6)     // Catch:{ all -> 0x0116 }
            float r0 = r0 / r1
            r5.postRotate(r3, r2, r0)     // Catch:{ all -> 0x0116 }
            android.graphics.Bitmap r6 = X.Pxk.A09(r6, r5)     // Catch:{ all -> 0x0116 }
            goto L_0x00fb
        L_0x00f8:
            android.util.Log.isLoggable(r3, r2)     // Catch:{ all -> 0x0116 }
        L_0x00fb:
            if (r6 == 0) goto L_0x0110
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x010c
            r8.close()
        L_0x0104:
            X.Thg r1 = r14.A00
            X.Sik r0 = new X.Sik
            r0.<init>(r6, r1)
            return r0
        L_0x010c:
            r8.release()
            goto L_0x0104
        L_0x0110:
            X.TQO r0 = new X.TQO     // Catch:{ all -> 0x0116 }
            r0.<init>()     // Catch:{ all -> 0x0116 }
            throw r0     // Catch:{ all -> 0x0116 }
        L_0x0116:
            r1 = move-exception
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x011f
            r8.close()
            throw r1
        L_0x011f:
            r8.release()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Si6.ANe(X.Shi, java.lang.Object, int, int):X.ThF");
    }
}
