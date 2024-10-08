package X;

import java.util.List;

/* renamed from: X.Tsa  reason: case insensitive filesystem */
public final class C14252Tsa extends C342687p0 {
    public final C14282TtG A00;
    public final List A01;
    public final C343047pa A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Boolean A09;
    public final Boolean A0A;
    public final Boolean A0B;
    public final Boolean A0C;
    public final Boolean A0D;
    public final Boolean A0E;
    public final Boolean A0F;
    public final Float A0G;
    public final Float A0H;
    public final Float A0I;
    public final Integer A0J;
    public final Integer A0K;
    public final Integer A0L;
    public final Integer A0M;
    public final Integer A0N;
    public final Integer A0O;
    public final List A0P;
    public final List A0Q;
    public final List A0R;
    public final List A0S;
    public final List A0T;
    public final List A0U;
    public final List A0V;
    public final List A0W;
    public final List A0X;
    public final List A0Y;
    public final List A0Z;
    public final List A0a;
    public final List A0b;
    public final List A0c;
    public final List A0d;

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03a4, code lost:
        if (X.C66581MXm.A1W(17, r8) == false) goto L_0x03a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
        if (r2 == 0) goto L_0x00ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0335 A[LOOP:8: B:131:0x0333->B:132:0x0335, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14252Tsa(android.hardware.Camera.Parameters r21) {
        /*
            r20 = this;
            r3 = r20
            r3.<init>()
            r1 = r21
            int r19 = r1.getMaxNumDetectedFaces()
            int r18 = r1.getMaxNumFocusAreas()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r3.A0K = r0
            int r17 = r1.getMaxNumMeteringAreas()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            r3.A0L = r0
            boolean r8 = r1.isZoomSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r3.A0F = r0
            r12 = 0
            if (r8 == 0) goto L_0x006e
            int r0 = r1.getMaxZoom()
        L_0x0030:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r3.A0M = r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r3.A0O = r0
            boolean r0 = r1.isSmoothZoomSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A0E = r0
            if (r8 == 0) goto L_0x0070
            android.graphics.Rect r0 = X.C14254Tsc.A00
            java.util.List r7 = r1.getZoomRatios()
            int r5 = r7.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r5)
            r2 = 0
        L_0x0058:
            if (r2 >= r5) goto L_0x0071
            java.lang.Object r0 = r7.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r4.add(r0)
            int r2 = r2 + 1
            goto L_0x0058
        L_0x006e:
            r0 = 0
            goto L_0x0030
        L_0x0070:
            r4 = 0
        L_0x0071:
            java.util.List r2 = X.C14253Tsb.A00(r4)
            r3.A0d = r2
            r5 = 0
            if (r8 == 0) goto L_0x0137
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0137
            float r0 = X.AnonymousClass7TG.A00(r2, r12)
        L_0x0084:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3.A0I = r0
            if (r8 == 0) goto L_0x0134
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0134
            int r0 = r6.intValue()
            float r0 = X.AnonymousClass7TG.A00(r2, r0)
        L_0x009a:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3.A0H = r0
            int r4 = r1.getMinExposureCompensation()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r3.A0N = r0
            int r2 = r1.getMaxExposureCompensation()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3.A0J = r0
            r11 = 1
            if (r4 == 0) goto L_0x00ba
            r0 = 1
            if (r2 != 0) goto L_0x00bb
        L_0x00ba:
            r0 = 0
        L_0x00bb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A06 = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00cb
            float r5 = r1.getExposureCompensationStep()
        L_0x00cb:
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            r3.A0G = r0
            boolean r0 = r1.isAutoExposureLockSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A03 = r0
            boolean r0 = r1.isAutoWhiteBalanceLockSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A05 = r0
            boolean r0 = r1.isVideoSnapshotSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A0C = r0
            boolean r0 = r1.isVideoStabilizationSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A0D = r0
            java.util.List r0 = r1.getSupportedPreviewFrameRates()
            java.util.List r0 = X.C14253Tsb.A00(r0)
            r3.A01 = r0
            android.graphics.Rect r0 = X.C14254Tsc.A00
            java.util.List r7 = r1.getSupportedFocusModes()
            if (r7 == 0) goto L_0x013a
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x013a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r5 = r7.size()
            r4 = 0
        L_0x011b:
            if (r4 >= r5) goto L_0x013d
            java.lang.Object r0 = r7.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            int r2 = X.C378889Rp.A02(r0)
            r0 = -1
            if (r2 == r0) goto L_0x0131
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r6.add(r0)
        L_0x0131:
            int r4 = r4 + 1
            goto L_0x011b
        L_0x0134:
            r0 = 0
            goto L_0x009a
        L_0x0137:
            r0 = 0
            goto L_0x0084
        L_0x013a:
            java.util.List r10 = X.C14253Tsb.A00
            goto L_0x0141
        L_0x013d:
            java.util.List r10 = X.C14253Tsb.A00(r6)
        L_0x0141:
            r3.A0T = r10
            java.util.List r7 = r1.getSupportedAntibanding()
            if (r7 == 0) goto L_0x0172
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0172
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r5 = r7.size()
            r4 = 0
        L_0x0159:
            if (r4 >= r5) goto L_0x0175
            java.lang.Object r0 = r7.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            int r2 = X.C378889Rp.A00(r0)
            r0 = -1
            if (r2 == r0) goto L_0x016f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r6.add(r0)
        L_0x016f:
            int r4 = r4 + 1
            goto L_0x0159
        L_0x0172:
            java.util.List r0 = X.C14253Tsb.A00
            goto L_0x0179
        L_0x0175:
            java.util.List r0 = X.C14253Tsb.A00(r6)
        L_0x0179:
            r3.A0Q = r0
            java.util.List r7 = r1.getSupportedColorEffects()
            if (r7 == 0) goto L_0x01aa
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x01aa
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r5 = r7.size()
            r4 = 0
        L_0x0191:
            if (r4 >= r5) goto L_0x01ad
            java.lang.Object r0 = r7.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            int r2 = X.C378889Rp.A01(r0)
            r0 = -1
            if (r2 == r0) goto L_0x01a7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r6.add(r0)
        L_0x01a7:
            int r4 = r4 + 1
            goto L_0x0191
        L_0x01aa:
            java.util.List r0 = X.C14253Tsb.A00
            goto L_0x01b1
        L_0x01ad:
            java.util.List r0 = X.C14253Tsb.A00(r6)
        L_0x01b1:
            r3.A0R = r0
            java.util.List r7 = r1.getSupportedFlashModes()
            if (r7 == 0) goto L_0x01e2
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x01e2
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r5 = r7.size()
            r4 = 0
        L_0x01c9:
            if (r4 >= r5) goto L_0x01e5
            java.lang.Object r0 = r7.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            int r2 = X.C378899Rq.A00(r0)
            r0 = -1
            if (r2 == r0) goto L_0x01df
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r6.add(r0)
        L_0x01df:
            int r4 = r4 + 1
            goto L_0x01c9
        L_0x01e2:
            java.util.List r9 = X.C14253Tsb.A00
            goto L_0x01e9
        L_0x01e5:
            java.util.List r9 = X.C14253Tsb.A00(r6)
        L_0x01e9:
            r3.A0S = r9
            java.util.List r0 = r1.getSupportedPictureFormats()
            java.util.List r0 = X.C14253Tsb.A00(r0)
            r3.A0V = r0
            java.lang.String r0 = "preview-fps-range-values"
            java.lang.String r8 = r1.get(r0)
            r16 = 0
            if (r8 == 0) goto L_0x027d
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x027d
            r2 = 0
            char r0 = r8.charAt(r12)
            r7 = 40
            if (r0 != r7) goto L_0x027d
            int r0 = r8.length()
            int r0 = r0 + -1
            char r0 = r8.charAt(r0)
            r6 = 41
            if (r0 != r6) goto L_0x027d
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0221:
            int r4 = r8.indexOf(r6, r2)
            int r0 = r4 + 1
            java.lang.String r14 = r8.substring(r2, r0)
            java.lang.String r13 = "Invalid range list string="
            if (r14 == 0) goto L_0x0273
            char r0 = r14.charAt(r12)
            if (r0 != r7) goto L_0x0273
            int r0 = r14.length()
            int r0 = r0 - r11
            char r0 = r14.charAt(r0)
            if (r0 != r6) goto L_0x0273
            r0 = 44
            int r15 = r14.indexOf(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0269 }
            java.lang.String r0 = r14.substring(r11, r15)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0269 }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0269 }
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0269 }
            int r15 = r15 + 1
            int r0 = r14.indexOf(r6, r15)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0269 }
            java.lang.String r0 = r14.substring(r15, r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0269 }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0269 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0269 }
            int[] r0 = new int[]{r2, r0}     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0269 }
            goto L_0x0289
        L_0x0269:
            java.lang.String r2 = "ParametersHelper"
            java.lang.String r0 = X.002.A0R(r13, r14)
            android.util.Log.e(r2, r0)
            goto L_0x028c
        L_0x0273:
            java.lang.String r2 = "ParametersHelper"
            java.lang.String r0 = X.002.A0R(r13, r14)
            android.util.Log.e(r2, r0)
            goto L_0x028c
        L_0x027d:
            java.lang.String r2 = "ParametersHelper"
            java.lang.String r0 = "Invalid range list string="
            java.lang.String r0 = X.002.A0R(r0, r8)
            android.util.Log.e(r2, r0)
            goto L_0x029b
        L_0x0289:
            r5.add(r0)
        L_0x028c:
            int r2 = r8.indexOf(r7, r4)
            r0 = -1
            if (r2 != r0) goto L_0x0221
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x029b
            r16 = r5
        L_0x029b:
            java.util.List r0 = X.C14253Tsb.A00(r16)
            r3.A0Y = r0
            java.util.List r7 = r1.getSupportedSceneModes()
            if (r7 == 0) goto L_0x02d0
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x02d0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r5 = r7.size()
            r4 = 0
        L_0x02b7:
            if (r4 >= r5) goto L_0x02d3
            java.lang.Object r0 = r7.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            int r2 = X.C378889Rp.A03(r0)
            r0 = -1
            if (r2 == r0) goto L_0x02cd
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r6.add(r0)
        L_0x02cd:
            int r4 = r4 + 1
            goto L_0x02b7
        L_0x02d0:
            java.util.List r8 = X.C14253Tsb.A00
            goto L_0x02d7
        L_0x02d3:
            java.util.List r8 = X.C14253Tsb.A00(r6)
        L_0x02d7:
            r3.A0a = r8
            java.util.List r0 = r1.getSupportedPreviewFormats()
            java.util.List r0 = X.C14253Tsb.A00(r0)
            r3.A0X = r0
            java.util.List r7 = r1.getSupportedWhiteBalance()
            if (r7 == 0) goto L_0x0312
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0312
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r5 = r7.size()
            r4 = 0
        L_0x02f9:
            if (r4 >= r5) goto L_0x0315
            java.lang.Object r0 = r7.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            int r2 = X.C378889Rp.A04(r0)
            r0 = -1
            if (r2 == r0) goto L_0x030f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r6.add(r0)
        L_0x030f:
            int r4 = r4 + 1
            goto L_0x02f9
        L_0x0312:
            java.util.List r0 = X.C14253Tsb.A00
            goto L_0x0319
        L_0x0315:
            java.util.List r0 = X.C14253Tsb.A00(r6)
        L_0x0319:
            r3.A0c = r0
            java.util.List r0 = r1.getSupportedJpegThumbnailSizes()
            java.util.List r0 = X.C14254Tsc.A03(r0)
            r3.A0U = r0
            java.util.List r13 = r1.getSupportedPictureSizes()
            int r7 = r13.size()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r7)
            r5 = 0
        L_0x0333:
            if (r5 >= r7) goto L_0x034a
            java.lang.Object r0 = r13.get(r5)
            android.hardware.Camera$Size r0 = (android.hardware.Camera.Size) r0
            int r4 = r0.width
            int r2 = r0.height
            X.7pa r0 = new X.7pa
            r0.<init>(r4, r2)
            r6.add(r0)
            int r5 = r5 + 1
            goto L_0x0333
        L_0x034a:
            java.util.HashMap r0 = X.C343077pd.A00
            java.util.List r0 = X.C343077pd.A00(r0, r6)
            java.util.List r7 = java.util.Collections.unmodifiableList(r0)
            r3.A0W = r7
            java.util.List r0 = r1.getSupportedPreviewSizes()
            java.util.List r0 = X.C14254Tsc.A03(r0)
            r3.A0Z = r0
            java.util.List r14 = r1.getSupportedVideoSizes()
            if (r14 != 0) goto L_0x0414
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x036a:
            r3.A0b = r0
            r4 = 3
            boolean r0 = X.C66581MXm.A1W(r4, r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A0B = r0
            boolean r0 = X.C66581MXm.A1W(r11, r10)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A04 = r0
            boolean r0 = X.AnonymousClass7TF.A1R(r17)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A0A = r0
            boolean r0 = X.AnonymousClass7TF.A1R(r18)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A09 = r0
            java.util.HashSet r0 = X.C343077pd.A04
            boolean r0 = X.C348137xw.A02(r0)
            if (r0 != 0) goto L_0x03a6
            r0 = 17
            boolean r2 = X.C66581MXm.A1W(r0, r8)
            r0 = 1
            if (r2 != 0) goto L_0x03a7
        L_0x03a6:
            r0 = 0
        L_0x03a7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A08 = r0
            if (r19 <= 0) goto L_0x03b0
            r12 = 1
        L_0x03b0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r3.A07 = r0
            java.lang.String r0 = "preferred-preview-size-for-video"
            java.lang.String r2 = r1.get(r0)
            if (r2 == 0) goto L_0x0441
            java.lang.String r0 = "null"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0441
            java.lang.String r0 = "x"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0441
            java.util.ArrayList r9 = X.C14254Tsc.A01(r2)
            int r8 = r9.size()
            r6 = 0
        L_0x03d7:
            if (r6 >= r8) goto L_0x0441
            java.lang.Object r10 = r9.get(r6)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x0411
            r0 = 120(0x78, float:1.68E-43)
            int r2 = r10.indexOf(r0)
            r0 = -1
            java.lang.String r5 = "Invalid size parameter string="
            if (r2 == r0) goto L_0x03fe
            r0 = 0
            java.lang.String r0 = r10.substring(r0, r2)     // Catch:{ NumberFormatException -> 0x0408 }
            java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0408 }
            int r0 = r2 + 1
            java.lang.String r0 = r10.substring(r0)     // Catch:{ NumberFormatException -> 0x0408 }
            java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0408 }
            goto L_0x0441
        L_0x03fe:
            java.lang.String r2 = "ParametersHelper"
            java.lang.String r0 = X.002.A0R(r5, r10)
            android.util.Log.e(r2, r0)
            goto L_0x0411
        L_0x0408:
            java.lang.String r2 = "ParametersHelper"
            java.lang.String r0 = X.002.A0R(r5, r10)
            android.util.Log.e(r2, r0)
        L_0x0411:
            int r6 = r6 + 1
            goto L_0x03d7
        L_0x0414:
            int r13 = r14.size()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r13)
            r5 = 0
        L_0x041e:
            if (r5 >= r13) goto L_0x0435
            java.lang.Object r0 = r14.get(r5)
            android.hardware.Camera$Size r0 = (android.hardware.Camera.Size) r0
            int r4 = r0.width
            int r2 = r0.height
            X.7pa r0 = new X.7pa
            r0.<init>(r4, r2)
            r6.add(r0)
            int r5 = r5 + 1
            goto L_0x041e
        L_0x0435:
            java.util.HashMap r0 = X.C343077pd.A01
            java.util.List r0 = X.C343077pd.A00(r0, r6)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            goto L_0x036a
        L_0x0441:
            java.lang.String r0 = "iso-values"
            java.lang.String r2 = r1.get(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r10 = "iso"
            if (r0 == 0) goto L_0x0469
            java.lang.String r0 = "iso-mode-values"
            java.lang.String r2 = r1.get(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0469
            java.lang.String r0 = "iso-speed-values"
            java.lang.String r2 = r1.get(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x04b0
            java.lang.String r10 = "iso-speed"
        L_0x0469:
            java.lang.String r11 = r1.get(r10)
            java.util.ArrayList r0 = X.C14254Tsc.A01(r2)
            android.util.SparseArray r9 = new android.util.SparseArray
            r9.<init>()
            java.util.ArrayList r12 = X.Pxg.A14(r0)
            java.util.Iterator r6 = r0.iterator()
            r13 = -1
        L_0x047f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x04bf
            java.lang.Object r5 = r6.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r0 = "ISO"
            boolean r0 = r5.startsWith(r0)     // Catch:{ NumberFormatException -> 0x047f }
            if (r0 == 0) goto L_0x04ac
            java.lang.String r0 = r5.substring(r4)     // Catch:{ NumberFormatException -> 0x047f }
        L_0x0497:
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x047f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x047f }
            r9.put(r2, r5)     // Catch:{ NumberFormatException -> 0x047f }
            r12.add(r0)     // Catch:{ NumberFormatException -> 0x047f }
            boolean r0 = r5.equals(r11)     // Catch:{ NumberFormatException -> 0x047f }
            if (r0 == 0) goto L_0x047f
            goto L_0x04ae
        L_0x04ac:
            r0 = r5
            goto L_0x0497
        L_0x04ae:
            r13 = r2
            goto L_0x047f
        L_0x04b0:
            java.lang.String r0 = "nv-picture-iso-values"
            java.lang.String r2 = r1.get(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x04c5
            java.lang.String r10 = "nv-picture-iso"
            goto L_0x0469
        L_0x04bf:
            X.TtG r8 = new X.TtG
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x04c6
        L_0x04c5:
            r8 = 0
        L_0x04c6:
            r3.A00 = r8
            r6 = 0
            X.7pa r5 = new X.7pa
            r5.<init>(r6, r6)
        L_0x04ce:
            int r0 = r7.size()
            if (r6 >= r0) goto L_0x04e4
            java.lang.Object r4 = r7.get(r6)
            X.7pa r4 = (X.C343047pa) r4
            int r2 = r4.A00
            int r0 = r5.A00
            if (r2 <= r0) goto L_0x04e1
            r5 = r4
        L_0x04e1:
            int r6 = r6 + 1
            goto L_0x04ce
        L_0x04e4:
            r3.A02 = r5
            float r6 = r1.getFocalLength()
            float r0 = r1.getHorizontalViewAngle()
            double r7 = (double) r0
            r9 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r7 = r7 * r9
            r4 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r7 = r7 / r4
            float r0 = r1.getVerticalViewAngle()
            double r1 = (double) r0
            double r1 = r1 * r9
            double r1 = r1 / r4
            r0 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 * r0
            double r5 = (double) r6
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r1 = r1 / r9
            double r0 = java.lang.Math.tan(r1)
            double r0 = r0 * r5
            double r0 = java.lang.Math.abs(r0)
            float r4 = (float) r0
            double r7 = r7 / r9
            double r0 = java.lang.Math.tan(r7)
            double r5 = r5 * r0
            double r1 = java.lang.Math.abs(r5)
            float r0 = (float) r1
            java.lang.Float r1 = java.lang.Float.valueOf(r4)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Float[] r0 = new java.lang.Float[]{r1, r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r3.A0P = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14252Tsa.<init>(android.hardware.Camera$Parameters):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x00c7, code lost:
        return java.lang.Integer.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (X.C348137xw.A02(X.C348147xx.A01) != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r3.A00 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x008c, code lost:
        return java.util.Collections.emptyList();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C342697p1 r4) {
        /*
            r3 = this;
            int r2 = r4.A00
            r0 = 100
            if (r2 == r0) goto L_0x00e0
            r0 = 101(0x65, float:1.42E-43)
            if (r2 == r0) goto L_0x00e0
            r1 = -1
            switch(r2) {
                case 1: goto L_0x00dd;
                case 2: goto L_0x00da;
                case 3: goto L_0x00d7;
                case 4: goto L_0x00d4;
                case 5: goto L_0x00d1;
                case 6: goto L_0x00ce;
                case 7: goto L_0x00cb;
                case 8: goto L_0x00c8;
                case 9: goto L_0x00bd;
                case 10: goto L_0x00ba;
                case 11: goto L_0x00b7;
                case 12: goto L_0x00b4;
                case 13: goto L_0x00e0;
                case 14: goto L_0x00b1;
                case 15: goto L_0x00ae;
                case 16: goto L_0x00e0;
                case 17: goto L_0x00ab;
                case 18: goto L_0x00a8;
                case 19: goto L_0x00a5;
                case 20: goto L_0x00a2;
                case 21: goto L_0x009f;
                case 22: goto L_0x009c;
                case 23: goto L_0x0099;
                case 24: goto L_0x0096;
                case 25: goto L_0x0093;
                case 26: goto L_0x00e0;
                case 27: goto L_0x00e0;
                case 28: goto L_0x00e0;
                case 29: goto L_0x00e0;
                case 30: goto L_0x00e0;
                case 31: goto L_0x00e0;
                case 32: goto L_0x00e0;
                case 33: goto L_0x00e0;
                case 34: goto L_0x00e0;
                case 35: goto L_0x0090;
                case 36: goto L_0x008d;
                case 37: goto L_0x0088;
                case 38: goto L_0x0085;
                case 39: goto L_0x0082;
                case 40: goto L_0x007f;
                case 41: goto L_0x007c;
                case 42: goto L_0x0079;
                case 43: goto L_0x0076;
                case 44: goto L_0x0073;
                case 45: goto L_0x0070;
                case 46: goto L_0x0064;
                case 47: goto L_0x0088;
                case 48: goto L_0x0061;
                case 49: goto L_0x005e;
                case 50: goto L_0x005b;
                case 51: goto L_0x0058;
                case 52: goto L_0x0051;
                case 53: goto L_0x004e;
                case 54: goto L_0x0040;
                case 55: goto L_0x00e0;
                case 56: goto L_0x0030;
                case 57: goto L_0x00e0;
                case 58: goto L_0x0088;
                case 59: goto L_0x00e0;
                case 60: goto L_0x00e0;
                case 61: goto L_0x00e0;
                case 62: goto L_0x00e0;
                case 63: goto L_0x0088;
                case 64: goto L_0x0088;
                case 65: goto L_0x00e0;
                case 66: goto L_0x00e0;
                case 67: goto L_0x00e0;
                case 68: goto L_0x0027;
                case 69: goto L_0x00e0;
                case 70: goto L_0x00e0;
                case 71: goto L_0x00e0;
                case 72: goto L_0x00e0;
                case 73: goto L_0x0027;
                case 74: goto L_0x003d;
                case 75: goto L_0x003a;
                case 76: goto L_0x0037;
                case 77: goto L_0x00e0;
                case 78: goto L_0x00e0;
                default: goto L_0x000e;
            }
        L_0x000e:
            switch(r2) {
                case 83: goto L_0x00e0;
                case 84: goto L_0x0034;
                case 85: goto L_0x00e0;
                default: goto L_0x0011;
            }
        L_0x0011:
            switch(r2) {
                case 87: goto L_0x0088;
                case 88: goto L_0x0024;
                case 89: goto L_0x00e0;
                case 90: goto L_0x00c3;
                case 91: goto L_0x00e0;
                case 92: goto L_0x00e0;
                default: goto L_0x0014;
            }
        L_0x0014:
            r0 = 2330(0x91a, float:3.265E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = X.002.A0O(r0, r2)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0024:
            X.7l0 r0 = X.C340277l0.CAMERA1
            return r0
        L_0x0027:
            java.util.HashSet r0 = X.C348147xx.A01
            boolean r0 = X.C348137xw.A02(r0)
            if (r0 == 0) goto L_0x00e0
            goto L_0x0034
        L_0x0030:
            X.TtG r0 = r3.A00
            if (r0 == 0) goto L_0x00e0
        L_0x0034:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x0037:
            java.lang.Integer r0 = X.C342687p0.A1E
            return r0
        L_0x003a:
            X.7pa r0 = r3.A02
            return r0
        L_0x003d:
            java.util.List r0 = r3.A0P
            return r0
        L_0x0040:
            X.TtG r0 = r3.A00
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = r0.A02
            return r0
        L_0x0047:
            r0 = 4359(0x1107, float:6.108E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            return r0
        L_0x004e:
            java.util.List r0 = r3.A0Y
            return r0
        L_0x0051:
            X.7p1 r0 = X.C342687p0.A14
            java.lang.Object r0 = r3.A01(r0)
            return r0
        L_0x0058:
            java.util.List r0 = r3.A0b
            return r0
        L_0x005b:
            java.util.List r0 = r3.A0Z
            return r0
        L_0x005e:
            java.util.List r0 = r3.A0W
            return r0
        L_0x0061:
            java.util.List r0 = r3.A0U
            return r0
        L_0x0064:
            X.TtG r0 = r3.A00
            if (r0 == 0) goto L_0x006b
            java.util.List r0 = r0.A04
            return r0
        L_0x006b:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L_0x0070:
            java.util.List r0 = r3.A0c
            return r0
        L_0x0073:
            java.util.List r0 = r3.A0X
            return r0
        L_0x0076:
            java.util.List r0 = r3.A0a
            return r0
        L_0x0079:
            java.util.List r0 = r3.A0V
            return r0
        L_0x007c:
            java.util.List r0 = r3.A0S
            return r0
        L_0x007f:
            java.util.List r0 = r3.A0R
            return r0
        L_0x0082:
            java.util.List r0 = r3.A0Q
            return r0
        L_0x0085:
            java.util.List r0 = r3.A0T
            return r0
        L_0x0088:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L_0x008d:
            java.util.List r0 = r3.A0d
            return r0
        L_0x0090:
            java.util.List r0 = r3.A01
            return r0
        L_0x0093:
            java.lang.Boolean r0 = r3.A06
            return r0
        L_0x0096:
            java.lang.Boolean r0 = r3.A07
            return r0
        L_0x0099:
            java.lang.Boolean r0 = r3.A08
            return r0
        L_0x009c:
            java.lang.Boolean r0 = r3.A09
            return r0
        L_0x009f:
            java.lang.Boolean r0 = r3.A0A
            return r0
        L_0x00a2:
            java.lang.Boolean r0 = r3.A04
            return r0
        L_0x00a5:
            java.lang.Boolean r0 = r3.A0B
            return r0
        L_0x00a8:
            java.lang.Boolean r0 = r3.A0E
            return r0
        L_0x00ab:
            java.lang.Boolean r0 = r3.A0F
            return r0
        L_0x00ae:
            java.lang.Boolean r0 = r3.A0D
            return r0
        L_0x00b1:
            java.lang.Boolean r0 = r3.A0C
            return r0
        L_0x00b4:
            java.lang.Boolean r0 = r3.A05
            return r0
        L_0x00b7:
            java.lang.Boolean r0 = r3.A03
            return r0
        L_0x00ba:
            java.lang.Float r0 = r3.A0G
            return r0
        L_0x00bd:
            X.TtG r0 = r3.A00
            if (r0 == 0) goto L_0x00c3
            int r1 = r0.A00
        L_0x00c3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x00c8:
            java.lang.Integer r0 = r3.A0J
            return r0
        L_0x00cb:
            java.lang.Integer r0 = r3.A0N
            return r0
        L_0x00ce:
            java.lang.Float r0 = r3.A0I
            return r0
        L_0x00d1:
            java.lang.Float r0 = r3.A0H
            return r0
        L_0x00d4:
            java.lang.Integer r0 = r3.A0O
            return r0
        L_0x00d7:
            java.lang.Integer r0 = r3.A0M
            return r0
        L_0x00da:
            java.lang.Integer r0 = r3.A0L
            return r0
        L_0x00dd:
            java.lang.Integer r0 = r3.A0K
            return r0
        L_0x00e0:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14252Tsa.A01(X.7p1):java.lang.Object");
    }
}
