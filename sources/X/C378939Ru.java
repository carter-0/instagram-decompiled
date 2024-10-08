package X;

import android.hardware.Camera;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9Ru  reason: invalid class name and case insensitive filesystem */
public final class C378939Ru {
    public static final AtomicInteger A05 = new AtomicInteger(AnonymousClass972.MUTABLE_FLAG_MASK);
    public final Camera.Parameters A00;
    public final Camera A01;
    public final C378849Rl A02;
    public final int A03;
    public final C14252Tsa A04;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v33, resolved type: X.7pa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v34, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v35, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v36, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v37, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v38, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v39, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v40, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v41, resolved type: java.lang.Number} */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04bb, code lost:
        r1.A04(r0, r12);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(X.C342727p4 r11, java.lang.Object r12) {
        /*
            r10 = this;
            int r1 = r11.A00
            r9 = 0
            r3 = 1
            if (r1 == 0) goto L_0x04df
            if (r1 == r3) goto L_0x04bf
            r0 = 2
            if (r1 == r0) goto L_0x0473
            r0 = 3
            if (r1 == r0) goto L_0x044b
            r0 = 27
            if (r1 == r0) goto L_0x0429
            r0 = 42
            if (r1 == r0) goto L_0x043c
            r0 = 45
            if (r1 == r0) goto L_0x0408
            r0 = 52
            if (r1 == r0) goto L_0x03f5
            r0 = 57
            if (r1 == r0) goto L_0x0410
            r0 = 59
            java.lang.String r7 = "flip-h"
            r8 = 270(0x10e, float:3.78E-43)
            java.lang.String r6 = "flip-v"
            r5 = 90
            if (r1 == r0) goto L_0x03c1
            r0 = 100
            switch(r1) {
                case 8: goto L_0x0282;
                case 9: goto L_0x0389;
                case 10: goto L_0x0363;
                case 11: goto L_0x0330;
                case 12: goto L_0x02f2;
                case 13: goto L_0x02d2;
                case 14: goto L_0x02b8;
                case 15: goto L_0x029e;
                default: goto L_0x0033;
            }
        L_0x0033:
            switch(r1) {
                case 17: goto L_0x0262;
                case 18: goto L_0x0242;
                case 19: goto L_0x0222;
                default: goto L_0x0036;
            }
        L_0x0036:
            switch(r1) {
                case 21: goto L_0x01ed;
                case 22: goto L_0x01c7;
                case 23: goto L_0x01a1;
                case 24: goto L_0x04ff;
                case 25: goto L_0x0181;
                default: goto L_0x0039;
            }
        L_0x0039:
            r4 = 0
            switch(r1) {
                case 30: goto L_0x04a9;
                case 31: goto L_0x008e;
                case 32: goto L_0x007a;
                case 33: goto L_0x0161;
                case 34: goto L_0x0108;
                case 35: goto L_0x005c;
                case 36: goto L_0x0048;
                case 37: goto L_0x00d5;
                case 38: goto L_0x00a2;
                case 39: goto L_0x0128;
                default: goto L_0x003d;
            }
        L_0x003d:
            java.lang.String r0 = "Invalid Settings key: "
            java.lang.String r0 = X.002.A0O(r0, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x0048:
            r12.getClass()
            X.7pa r12 = (X.C343047pa) r12
            android.hardware.Camera$Parameters r2 = r10.A00
            int r1 = r12.A02
            int r0 = r12.A01
            r2.setJpegThumbnailSize(r1, r0)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0c
            goto L_0x04bb
        L_0x005c:
            X.Tsa r1 = r10.A04
            X.7p1 r0 = X.C342687p0.A0F
            boolean r0 = X.AnonymousClass7TG.A1V(r0, r1)
            if (r0 == 0) goto L_0x0074
            android.hardware.Camera$Parameters r2 = r10.A00
            r12.getClass()
            java.lang.String r1 = r12.toString()
            java.lang.String r0 = "video-size"
            r2.set(r0, r1)
        L_0x0074:
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0y
            goto L_0x0425
        L_0x007a:
            r12.getClass()
            java.lang.Number r12 = (java.lang.Number) r12
            double r1 = r12.doubleValue()
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.setGpsLatitude(r1)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0F
            goto L_0x04bb
        L_0x008e:
            r12.getClass()
            java.lang.Number r12 = (java.lang.Number) r12
            double r1 = r12.doubleValue()
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.setGpsLongitude(r1)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0G
            goto L_0x04bb
        L_0x00a2:
            java.util.List r12 = (java.util.List) r12
            X.Tsa r2 = r10.A04
            X.7p1 r0 = X.C342687p0.A0W
            boolean r0 = X.AnonymousClass7TG.A1V(r0, r2)
            if (r0 == 0) goto L_0x050b
            r12.getClass()
            int r1 = r12.size()
            X.7p1 r0 = X.C342687p0.A0i
            java.lang.Object r0 = r2.A01(r0)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            if (r1 > r0) goto L_0x050b
            android.hardware.Camera$Parameters r1 = r10.A00
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x00ca
            r4 = r12
        L_0x00ca:
            r1.setMeteringAreas(r4)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0f
            r1.A04(r0, r12)
            return r3
        L_0x00d5:
            java.util.List r12 = (java.util.List) r12
            X.Tsa r2 = r10.A04
            X.7p1 r0 = X.C342687p0.A0V
            boolean r0 = X.AnonymousClass7TG.A1V(r0, r2)
            if (r0 == 0) goto L_0x050b
            r12.getClass()
            int r1 = r12.size()
            X.7p1 r0 = X.C342687p0.A0h
            java.lang.Object r0 = r2.A01(r0)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            if (r1 > r0) goto L_0x050b
            android.hardware.Camera$Parameters r1 = r10.A00
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x00fd
            r4 = r12
        L_0x00fd:
            r1.setFocusAreas(r4)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0C
            r1.A04(r0, r12)
            return r3
        L_0x0108:
            X.7pa r12 = (X.C343047pa) r12
            X.Tsa r1 = r10.A04
            X.7p1 r0 = X.C342687p0.A10
            boolean r0 = A00(r0, r1, r12)
            if (r0 == 0) goto L_0x050b
            android.hardware.Camera$Parameters r2 = r10.A00
            r12.getClass()
            int r1 = r12.A02
            int r0 = r12.A01
            r2.setPictureSize(r1, r0)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0k
            r1.A04(r0, r12)
            return r3
        L_0x0128:
            int[] r12 = (int[]) r12
            X.Tsa r1 = r10.A04
            X.7p1 r0 = X.C342687p0.A12
            java.lang.Object r0 = r1.A01(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x050b
            if (r12 == 0) goto L_0x050b
            java.util.Iterator r4 = r0.iterator()
        L_0x013c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x050b
            java.lang.Object r1 = r4.next()
            int[] r1 = (int[]) r1
            r0 = r1[r9]
            r2 = r12[r9]
            if (r0 != r2) goto L_0x013c
            r0 = r1[r3]
            r1 = r12[r3]
            if (r0 != r1) goto L_0x013c
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.setPreviewFpsRange(r2, r1)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0n
            r1.A04(r0, r12)
            return r3
        L_0x0161:
            X.7pa r12 = (X.C343047pa) r12
            X.Tsa r1 = r10.A04
            X.7p1 r0 = X.C342687p0.A14
            boolean r0 = A00(r0, r1, r12)
            if (r0 == 0) goto L_0x050b
            android.hardware.Camera$Parameters r2 = r10.A00
            r12.getClass()
            int r1 = r12.A02
            int r0 = r12.A01
            r2.setPreviewSize(r1, r0)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0q
            r1.A04(r0, r12)
            return r3
        L_0x0181:
            r12.getClass()
            java.lang.Number r12 = (java.lang.Number) r12
            int r2 = r12.intValue()
            X.Tsa r1 = r10.A04
            X.7p1 r0 = X.C342687p0.A0f
            boolean r0 = X.AnonymousClass7TG.A1V(r0, r1)
            if (r0 == 0) goto L_0x050b
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.setZoom(r2)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A11
            r1.A04(r0, r12)
            return r3
        L_0x01a1:
            r12.getClass()
            java.lang.Number r12 = (java.lang.Number) r12
            int r0 = r12.intValue()
            java.lang.String r2 = X.C378889Rp.A05(r0)
            if (r2 == 0) goto L_0x050b
            X.Tsa r1 = r10.A04
            X.7p1 r0 = X.C342687p0.A17
            boolean r0 = A00(r0, r1, r12)
            if (r0 == 0) goto L_0x050b
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.setSceneMode(r2)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0s
            r1.A04(r0, r12)
            return r3
        L_0x01c7:
            r12.getClass()
            java.lang.Number r12 = (java.lang.Number) r12
            int r4 = r12.intValue()
            X.Tsa r0 = r10.A04
            X.TtG r0 = r0.A00
            if (r0 == 0) goto L_0x050b
            android.hardware.Camera$Parameters r2 = r10.A00
            java.lang.String r1 = r0.A03
            android.util.SparseArray r0 = r0.A01
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            r2.set(r1, r0)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0L
            r1.A04(r0, r12)
            return r3
        L_0x01ed:
            r12.getClass()
            java.lang.Number r12 = (java.lang.Number) r12
            int r4 = r12.intValue()
            android.hardware.Camera$Parameters r2 = r10.A00
            r2.setRotation(r4)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0g
            r1.A04(r0, r12)
            X.7p4 r0 = X.C342717p3.A0V
            boolean r0 = X.AnonymousClass7TG.A1W(r0, r1)
            if (r0 == 0) goto L_0x04be
            X.Tsa r1 = r10.A04
            X.7p1 r0 = X.C342687p0.A0I
            boolean r0 = X.AnonymousClass7TG.A1V(r0, r1)
            if (r0 == 0) goto L_0x04be
            java.lang.String r0 = "snapshot-picture-flip"
            if (r4 == r5) goto L_0x021e
            if (r4 == r8) goto L_0x021e
            r2.set(r0, r7)
            return r3
        L_0x021e:
            r2.set(r0, r6)
            return r3
        L_0x0222:
            r12.getClass()
            java.lang.Number r12 = (java.lang.Number) r12
            int r2 = r12.intValue()
            X.Tsa r1 = r10.A04
            X.7p1 r0 = X.C342687p0.A13
            boolean r0 = A00(r0, r1, r12)
            if (r0 == 0) goto L_0x050b
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.setPreviewFrameRate(r2)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0o
            r1.A04(r0, r12)
            return r3
        L_0x0242:
            r12.getClass()
            java.lang.Number r12 = (java.lang.Number) r12
            int r2 = r12.intValue()
            X.Tsa r1 = r10.A04
            X.7p1 r0 = X.C342687p0.A11
            boolean r0 = A00(r0, r1, r12)
            if (r0 == 0) goto L_0x050b
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.setPreviewFormat(r2)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0m
            r1.A04(r0, r12)
            return r3
        L_0x0262:
            r12.getClass()
            java.lang.Number r12 = (java.lang.Number) r12
            int r2 = r12.intValue()
            X.Tsa r1 = r10.A04
            X.7p1 r0 = X.C342687p0.A0z
            boolean r0 = A00(r0, r1, r12)
            if (r0 == 0) goto L_0x050b
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.setPictureFormat(r2)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0i
            r1.A04(r0, r12)
            return r3
        L_0x0282:
            r12.getClass()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r1 = r12.booleanValue()
            java.util.HashSet r0 = X.C343077pd.A06
            boolean r0 = X.C348137xw.A02(r0)
            if (r0 != 0) goto L_0x050b
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.setRecordingHint(r1)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0r
            goto L_0x0447
        L_0x029e:
            r12.getClass()
            java.lang.Number r12 = (java.lang.Number) r12
            int r1 = r12.intValue()
            if (r1 <= 0) goto L_0x050b
            if (r1 > r0) goto L_0x050b
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.setJpegThumbnailQuality(r1)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0b
            r1.A04(r0, r12)
            return r3
        L_0x02b8:
            r12.getClass()
            java.lang.Number r12 = (java.lang.Number) r12
            int r1 = r12.intValue()
            if (r1 <= 0) goto L_0x050b
            if (r1 > r0) goto L_0x050b
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.setJpegQuality(r1)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0a
            r1.A04(r0, r12)
            return r3
        L_0x02d2:
            r12.getClass()
            java.lang.Number r12 = (java.lang.Number) r12
            int r2 = r12.intValue()
            X.Tsa r1 = r10.A04
            X.7p1 r0 = X.C342687p0.A0G
            boolean r0 = X.AnonymousClass7TG.A1V(r0, r1)
            if (r0 == 0) goto L_0x050b
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.setExposureCompensation(r2)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A09
            r1.A04(r0, r12)
            return r3
        L_0x02f2:
            r12.getClass()
            java.lang.Number r12 = (java.lang.Number) r12
            int r0 = r12.intValue()
            switch(r0) {
                case 0: goto L_0x0317;
                case 1: goto L_0x0314;
                case 2: goto L_0x0311;
                case 3: goto L_0x030e;
                case 4: goto L_0x030b;
                case 5: goto L_0x0308;
                case 6: goto L_0x0305;
                case 7: goto L_0x0302;
                case 8: goto L_0x02ff;
                default: goto L_0x02fe;
            }
        L_0x02fe:
            return r9
        L_0x02ff:
            java.lang.String r2 = "aqua"
            goto L_0x0319
        L_0x0302:
            java.lang.String r2 = "blackboard"
            goto L_0x0319
        L_0x0305:
            java.lang.String r2 = "whiteboard"
            goto L_0x0319
        L_0x0308:
            java.lang.String r2 = "posterize"
            goto L_0x0319
        L_0x030b:
            java.lang.String r2 = "sepia"
            goto L_0x0319
        L_0x030e:
            java.lang.String r2 = "solarize"
            goto L_0x0319
        L_0x0311:
            java.lang.String r2 = "negative"
            goto L_0x0319
        L_0x0314:
            java.lang.String r2 = "mono"
            goto L_0x0319
        L_0x0317:
            java.lang.String r2 = "none"
        L_0x0319:
            X.Tsa r1 = r10.A04
            X.7p1 r0 = X.C342687p0.A0s
            boolean r0 = A00(r0, r1, r12)
            if (r0 == 0) goto L_0x050b
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.setColorEffect(r2)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A07
            r1.A04(r0, r12)
            return r3
        L_0x0330:
            r12.getClass()
            java.lang.Number r12 = (java.lang.Number) r12
            int r1 = r12.intValue()
            if (r1 == 0) goto L_0x0360
            if (r1 == r3) goto L_0x035d
            r0 = 2
            if (r1 == r0) goto L_0x035a
            r0 = 3
            if (r1 != r0) goto L_0x050b
            java.lang.String r2 = "auto"
        L_0x0345:
            X.Tsa r1 = r10.A04
            X.7p1 r0 = X.C342687p0.A0q
            boolean r0 = A00(r0, r1, r12)
            if (r0 == 0) goto L_0x050b
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.setAntibanding(r2)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A00
            goto L_0x04bb
        L_0x035a:
            java.lang.String r2 = "60hz"
            goto L_0x0345
        L_0x035d:
            java.lang.String r2 = "50hz"
            goto L_0x0345
        L_0x0360:
            java.lang.String r2 = "off"
            goto L_0x0345
        L_0x0363:
            r12.getClass()
            java.lang.Number r12 = (java.lang.Number) r12
            int r0 = r12.intValue()
            java.lang.String r2 = X.C378899Rq.A01(r0)
            if (r2 == 0) goto L_0x050b
            X.Tsa r1 = r10.A04
            X.7p1 r0 = X.C342687p0.A0v
            boolean r0 = A00(r0, r1, r12)
            if (r0 == 0) goto L_0x050b
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.setFlashMode(r2)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0B
            r1.A04(r0, r12)
            return r3
        L_0x0389:
            r12.getClass()
            java.lang.Number r12 = (java.lang.Number) r12
            int r0 = r12.intValue()
            switch(r0) {
                case 0: goto L_0x03a8;
                case 1: goto L_0x03a5;
                case 2: goto L_0x03a2;
                case 3: goto L_0x039f;
                case 4: goto L_0x039c;
                case 5: goto L_0x0399;
                case 6: goto L_0x0396;
                default: goto L_0x0395;
            }
        L_0x0395:
            return r9
        L_0x0396:
            java.lang.String r2 = "infinity"
            goto L_0x03aa
        L_0x0399:
            java.lang.String r2 = "edof"
            goto L_0x03aa
        L_0x039c:
            java.lang.String r2 = "continuous-picture"
            goto L_0x03aa
        L_0x039f:
            java.lang.String r2 = "continuous-video"
            goto L_0x03aa
        L_0x03a2:
            java.lang.String r2 = "macro"
            goto L_0x03aa
        L_0x03a5:
            java.lang.String r2 = "auto"
            goto L_0x03aa
        L_0x03a8:
            java.lang.String r2 = "fixed"
        L_0x03aa:
            X.Tsa r1 = r10.A04
            X.7p1 r0 = X.C342687p0.A0w
            boolean r0 = A00(r0, r1, r12)
            if (r0 == 0) goto L_0x050b
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.setFocusMode(r2)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0D
            r1.A04(r0, r12)
            return r3
        L_0x03c1:
            X.9Rl r4 = r10.A02
            X.7p4 r0 = X.C342717p3.A0V
            boolean r0 = X.AnonymousClass7TG.A1W(r0, r4)
            if (r0 == 0) goto L_0x04be
            X.Tsa r1 = r10.A04
            X.7p1 r0 = X.C342687p0.A0I
            boolean r0 = X.AnonymousClass7TG.A1V(r0, r1)
            if (r0 == 0) goto L_0x04be
            r12.getClass()
            java.lang.Number r12 = (java.lang.Number) r12
            int r2 = r12.intValue()
            X.7p4 r0 = X.C342717p3.A0x
            r4.A04(r0, r12)
            java.lang.String r1 = "video-flip"
            if (r2 == r5) goto L_0x03ef
            if (r2 == r8) goto L_0x03ef
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.set(r1, r7)
            return r3
        L_0x03ef:
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.set(r1, r6)
            return r3
        L_0x03f5:
            r2 = 0
            X.Tsa r1 = r10.A04
            X.7p1 r0 = X.C342687p0.A0F
            boolean r0 = X.AnonymousClass7TG.A1V(r0, r1)
            if (r0 == 0) goto L_0x050b
            r2.getClass()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0408:
            r12.getClass()
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0N
            goto L_0x0425
        L_0x0410:
            r12.getClass()
            int r0 = r10.A03
            if (r0 != r3) goto L_0x050b
            X.Tsa r1 = r10.A04
            X.7p1 r0 = X.C342687p0.A0I
            boolean r0 = X.AnonymousClass7TG.A1V(r0, r1)
            if (r0 == 0) goto L_0x050b
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0V
        L_0x0425:
            r1.A04(r0, r12)
            return r3
        L_0x0429:
            r12.getClass()
            java.lang.Number r12 = (java.lang.Number) r12
            long r1 = r12.longValue()
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.setGpsTimestamp(r1)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0I
            goto L_0x0447
        L_0x043c:
            java.lang.String r12 = (java.lang.String) r12
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.setGpsProcessingMethod(r12)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0H
        L_0x0447:
            r1.A04(r0, r12)
            return r3
        L_0x044b:
            r12.getClass()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r2 = r12.booleanValue()
            X.Tsa r1 = r10.A04
            X.7p1 r0 = X.C342687p0.A0b
            boolean r0 = X.AnonymousClass7TG.A1V(r0, r1)
            if (r0 == 0) goto L_0x050b
            java.util.HashSet r0 = X.C343077pd.A07
            boolean r0 = X.C348137xw.A02(r0)
            if (r0 != 0) goto L_0x050b
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.setVideoStabilization(r2)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0Z
            r1.A04(r0, r12)
            return r3
        L_0x0473:
            r12.getClass()
            boolean r5 = X.AnonymousClass7TE.A1a(r12)
            X.Tsa r1 = r10.A04
            X.7p1 r0 = X.C342687p0.A0K
            boolean r0 = X.AnonymousClass7TG.A1V(r0, r1)
            if (r0 == 0) goto L_0x050b
            r4 = 0
            if (r5 == 0) goto L_0x0489
            r4 = 17
        L_0x0489:
            android.hardware.Camera$Parameters r1 = r10.A00
            java.lang.String r0 = X.C378889Rp.A05(r4)
            r1.setSceneMode(r0)
            X.9Rl r2 = r10.A02
            X.7p4 r1 = X.C342717p3.A0s
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2.A04(r1, r0)
            if (r5 == 0) goto L_0x04be
            X.7p4 r1 = X.C342717p3.A0r
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r10.A01(r1, r0)
            return r3
        L_0x04a9:
            r12.getClass()
            java.lang.Number r12 = (java.lang.Number) r12
            double r1 = r12.doubleValue()
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.setGpsAltitude(r1)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0E
        L_0x04bb:
            r1.A04(r0, r12)
        L_0x04be:
            return r3
        L_0x04bf:
            r12.getClass()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r2 = r12.booleanValue()
            X.Tsa r1 = r10.A04
            X.7p1 r0 = X.C342687p0.A06
            boolean r0 = X.AnonymousClass7TG.A1V(r0, r1)
            if (r0 == 0) goto L_0x050b
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.setAutoWhiteBalanceLock(r2)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0R
            r1.A04(r0, r12)
            return r3
        L_0x04df:
            r12.getClass()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r2 = r12.booleanValue()
            X.Tsa r1 = r10.A04
            X.7p1 r0 = X.C342687p0.A03
            boolean r0 = X.AnonymousClass7TG.A1V(r0, r1)
            if (r0 == 0) goto L_0x050b
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.setAutoExposureLock(r2)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0P
            r1.A04(r0, r12)
            return r3
        L_0x04ff:
            r12.getClass()
            java.lang.Number r12 = (java.lang.Number) r12
            int r0 = r12.intValue()
            switch(r0) {
                case 1: goto L_0x0521;
                case 2: goto L_0x051e;
                case 3: goto L_0x051b;
                case 4: goto L_0x0518;
                case 5: goto L_0x0515;
                case 6: goto L_0x0512;
                case 7: goto L_0x050f;
                case 8: goto L_0x050c;
                default: goto L_0x050b;
            }
        L_0x050b:
            return r9
        L_0x050c:
            java.lang.String r2 = "shade"
            goto L_0x0523
        L_0x050f:
            java.lang.String r2 = "twilight"
            goto L_0x0523
        L_0x0512:
            java.lang.String r2 = "cloudy-daylight"
            goto L_0x0523
        L_0x0515:
            java.lang.String r2 = "daylight"
            goto L_0x0523
        L_0x0518:
            java.lang.String r2 = "warm-fluorescent"
            goto L_0x0523
        L_0x051b:
            java.lang.String r2 = "fluorescent"
            goto L_0x0523
        L_0x051e:
            java.lang.String r2 = "incandescent"
            goto L_0x0523
        L_0x0521:
            java.lang.String r2 = "auto"
        L_0x0523:
            X.Tsa r1 = r10.A04
            X.7p1 r0 = X.C342687p0.A1B
            boolean r0 = A00(r0, r1, r12)
            if (r0 == 0) goto L_0x050b
            android.hardware.Camera$Parameters r0 = r10.A00
            r0.setWhiteBalance(r2)
            X.9Rl r1 = r10.A02
            X.7p4 r0 = X.C342717p3.A0z
            r1.A04(r0, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378939Ru.A01(X.7p4, java.lang.Object):boolean");
    }

    public C378939Ru(Camera.Parameters parameters, Camera camera, C14252Tsa tsa, C378849Rl r4, int i) {
        this.A01 = camera;
        this.A00 = parameters;
        this.A04 = tsa;
        this.A02 = r4;
        this.A03 = i;
    }

    public static boolean A00(C342697p1 r0, C342687p0 r1, Object obj) {
        List list = (List) r1.A01(r0);
        if (list == null || obj == null || !list.contains(obj)) {
            return false;
        }
        return true;
    }
}
