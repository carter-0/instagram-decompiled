package X;

import java.util.ArrayList;

/* renamed from: X.RlI  reason: case insensitive filesystem */
public abstract class C10023RlI {
    public static ArrayList A00;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0205, code lost:
        r0 = r12 ^ -1;
        r14 = r14 & r0;
        r17 = r17 & r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0210, code lost:
        if (r10.startsWith("0x") == false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        r0 = java.lang.Integer.parseInt(r10.substring(2), 16) << r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x021e, code lost:
        r0 = (r0 & r12) | r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0228, code lost:
        r14 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0229, code lost:
        r17 = r17 | r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0298, code lost:
        if ((13 - r12) == 0) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x029a, code lost:
        r10.substring(0, java.lang.Math.min(128, r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02a3, code lost:
        r10.substring(0, java.lang.Math.min(128, r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02ea, code lost:
        r14 = r14 & -16;
        r17 = r17 & -16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        r14 = ((java.lang.Integer.parseInt(r10) << 0) & 15) | r14;
        r17 = r17 | 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0304, code lost:
        r10.substring(0, java.lang.Math.min(48, r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0345, code lost:
        if (r5 == null) goto L_0x034f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0340 A[SYNTHETIC, Splitter:B:187:0x0340] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x037a A[Catch:{ Exception -> 0x08dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03ce A[Catch:{ Exception -> 0x08dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x03fd A[Catch:{ Exception -> 0x08dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0414 A[Catch:{ Exception -> 0x08dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x044d A[Catch:{ Exception -> 0x08dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x053a A[Catch:{ Exception -> 0x08dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0553 A[Catch:{ Exception -> 0x08dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x055f A[Catch:{ Exception -> 0x08dc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r29, X.0lg r30) {
        /*
            r9 = 0
            r8 = 1
            java.util.HashMap r20 = X.AnonymousClass7TE.A1E()     // Catch:{ Exception -> 0x08dc }
            java.util.HashMap r19 = X.AnonymousClass7TE.A1E()     // Catch:{ Exception -> 0x08dc }
            android.media.MediaCodecInfo[] r1 = X.Pxg.A1Z(r8)     // Catch:{ Exception -> 0x08dc }
            int r0 = r1.length     // Catch:{ Exception -> 0x08dc }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ Exception -> 0x08dc }
            java.util.List r0 = X.0sr.A1P(r0)     // Catch:{ Exception -> 0x08dc }
            java.util.List r18 = java.util.Collections.unmodifiableList(r0)     // Catch:{ Exception -> 0x08dc }
            X.0qg r4 = X.0qg.A01()     // Catch:{ Exception -> 0x08dc }
            android.util.ArrayMap r7 = new android.util.ArrayMap     // Catch:{ Exception -> 0x08dc }
            r7.<init>()     // Catch:{ Exception -> 0x08dc }
            java.lang.String r1 = android.os.Build.ID     // Catch:{ Exception -> 0x08dc }
            java.lang.String r0 = "os_build"
            r7.put(r0, r1)     // Catch:{ Exception -> 0x08dc }
            java.lang.String r0 = "os.version"
            java.lang.String r1 = java.lang.System.getProperty(r0)     // Catch:{ Exception -> 0x08dc }
            java.lang.String r0 = "kernel"
            r7.put(r0, r1)     // Catch:{ Exception -> 0x08dc }
            java.lang.String r6 = "ro.boot.hardware.platform"
            java.lang.String r5 = "unknown"
            r2 = r5
            java.lang.String r1 = X.0Ap.A03(r6)     // Catch:{ Exception -> 0x08dc }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x08dc }
            if (r0 != 0) goto L_0x004a
            r2 = r1
        L_0x004a:
            java.util.Locale r3 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x08dc }
            java.lang.String r0 = X.DbT.A12(r3, r2)     // Catch:{ Exception -> 0x08dc }
            java.lang.String r0 = X.DbV.A12(r0)     // Catch:{ Exception -> 0x08dc }
            r7.put(r6, r0)     // Catch:{ Exception -> 0x08dc }
            java.lang.String r2 = "ro.hardware"
            java.lang.String r1 = X.0Ap.A03(r2)     // Catch:{ Exception -> 0x08dc }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x08dc }
            if (r0 != 0) goto L_0x0065
            r5 = r1
        L_0x0065:
            java.lang.String r0 = X.DbT.A12(r3, r5)     // Catch:{ Exception -> 0x08dc }
            java.lang.String r0 = X.DbV.A12(r0)     // Catch:{ Exception -> 0x08dc }
            r7.put(r2, r0)     // Catch:{ Exception -> 0x08dc }
            X.159 r2 = X.AnonymousClass159.A00()     // Catch:{ Exception -> 0x08dc }
            java.lang.String r1 = r2.A01     // Catch:{ Exception -> 0x08dc }
            java.lang.String r0 = "chipset_vendor"
            r7.put(r0, r1)     // Catch:{ Exception -> 0x08dc }
            java.lang.String r2 = r2.A00     // Catch:{ Exception -> 0x08dc }
            java.lang.String r0 = "chipset_name"
            r7.put(r0, r2)     // Catch:{ Exception -> 0x08dc }
            java.lang.String r0 = "qualcomm"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x08dc }
            if (r0 == 0) goto L_0x00ab
            java.lang.String r1 = "Qualcomm"
        L_0x008d:
            java.lang.String r0 = "chipset_platform"
            r7.put(r0, r1)     // Catch:{ Exception -> 0x08dc }
            boolean r0 = r4.A03     // Catch:{ Exception -> 0x08dc }
            if (r0 != 0) goto L_0x035c
            java.lang.String r3 = "Unable to close reader for cpuinfo"
            r0 = 856(0x358, float:1.2E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ Exception -> 0x08dc }
            java.io.File r1 = X.AnonymousClass7TE.A0t(r0)     // Catch:{ Exception -> 0x08dc }
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x08dc }
            java.lang.String r2 = "ProcessorInfoUtil"
            if (r0 == 0) goto L_0x0350
            goto L_0x00dd
        L_0x00ab:
            java.lang.String r0 = "mediatek"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x08dc }
            if (r0 == 0) goto L_0x00b7
            java.lang.String r1 = "MediaTek"
            goto L_0x008d
        L_0x00b7:
            java.lang.String r0 = "spreadtrum"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x08dc }
            if (r0 == 0) goto L_0x00c3
            java.lang.String r1 = "Spreadtrum"
            goto L_0x008d
        L_0x00c3:
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x08dc }
            if (r0 == 0) goto L_0x00cf
            java.lang.String r1 = "Samsung"
            goto L_0x008d
        L_0x00cf:
            java.lang.String r0 = "hisilicon"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x08dc }
            if (r0 == 0) goto L_0x00da
            java.lang.String r1 = "Hisilicon"
            goto L_0x008d
        L_0x00da:
            java.lang.String r1 = "Unknown"
            goto L_0x008d
        L_0x00dd:
            r5 = 0
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x0338 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0338 }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0338 }
            r6.<init>(r0)     // Catch:{ IOException -> 0x0338 }
            r17 = 0
            r14 = 0
            java.lang.StringBuilder r5 = X.AnonymousClass7TE.A1A()     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            r1 = 0
            r16 = 0
        L_0x00f2:
            java.lang.String r11 = r6.readLine()     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r11 == 0) goto L_0x030f
            r0 = 58
            int r10 = r11.indexOf(r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            r13 = -1
            if (r10 == r13) goto L_0x00f2
            java.lang.String r12 = r11.substring(r9, r10)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            java.lang.String r12 = r12.trim()     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            java.lang.String r10 = X.Pxe.A0v(r10, r11)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            java.lang.String r10 = r10.trim()     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            int r11 = r12.length()     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r11 <= 0) goto L_0x00f2
            int r11 = r10.length()     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r11 <= 0) goto L_0x00f2
            int r15 = r12.hashCode()     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            switch(r15) {
                case -1815500307: goto L_0x0125;
                case -1542724959: goto L_0x01ed;
                case -1509145992: goto L_0x01f9;
                case -1094759278: goto L_0x022d;
                case -226015139: goto L_0x02ac;
                case 97513095: goto L_0x02c2;
                case 104069929: goto L_0x01bd;
                case 181553672: goto L_0x028a;
                case 516911339: goto L_0x015b;
                case 542854003: goto L_0x02d8;
                case 547394780: goto L_0x0195;
                case 909208690: goto L_0x01e3;
                case 1256489867: goto L_0x0133;
                case 1429357118: goto L_0x02e1;
                case 2046689570: goto L_0x02fb;
                default: goto L_0x0124;
            }     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
        L_0x0124:
            goto L_0x00f2
        L_0x0125:
            java.lang.String r0 = "CPU variant"
            boolean r0 = r12.equals(r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r0 == 0) goto L_0x00f2
            r12 = 15728640(0xf00000, float:2.2040519E-38)
            r11 = 20
            goto L_0x0205
        L_0x0133:
            java.lang.String r0 = "CPU part"
            boolean r0 = r12.equals(r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r0 == 0) goto L_0x00f2
            r12 = 65520(0xfff0, float:9.1813E-41)
            r11 = 4
            r0 = -65521(0xffffffffffff000f, float:NaN)
            r14 = r14 & r0
            r17 = r17 & r0
            java.lang.String r0 = "0x"
            boolean r0 = r10.startsWith(r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r0 == 0) goto L_0x00f2
            r0 = 2
            java.lang.String r10 = r10.substring(r0)     // Catch:{ NumberFormatException -> 0x00f2 }
            r0 = 16
            int r0 = java.lang.Integer.parseInt(r10, r0)     // Catch:{ NumberFormatException -> 0x00f2 }
            int r0 = r0 << r11
            goto L_0x021e
        L_0x015b:
            java.lang.String r0 = "CPU architecture"
            boolean r0 = r12.equals(r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r0 == 0) goto L_0x00f2
            r0 = -983041(0xfffffffffff0ffff, float:NaN)
            r14 = r14 & r0
            r17 = r17 & r0
            r12 = 15
            r11 = 6
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x0178 }
            r0 = 7
            if (r10 >= r0) goto L_0x0222
            if (r10 != r11) goto L_0x00f2
            r12 = 7
            goto L_0x0222
        L_0x0178:
            java.lang.String r0 = "AArch64"
            boolean r0 = r10.equals(r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r0 != 0) goto L_0x0222
            java.lang.String r0 = "5TEJ"
            boolean r0 = r10.equals(r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r0 == 0) goto L_0x018a
            goto L_0x0221
        L_0x018a:
            java.lang.String r0 = "5TE"
            boolean r0 = r10.equals(r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r0 == 0) goto L_0x00f2
            r12 = 5
            goto L_0x0222
        L_0x0195:
            java.lang.String r0 = "cpu family"
            boolean r0 = r12.equals(r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r0 == 0) goto L_0x00f2
            r0 = -267390721(0xfffffffff00ff0ff, float:-1.7819081E29)
            r14 = r14 & r0
            r17 = r17 & r0
            int r11 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x00f2 }
            r0 = 15
            int r0 = java.lang.Math.min(r11, r0)     // Catch:{ NumberFormatException -> 0x00f2 }
            int r11 = r11 - r0
            int r0 = r0 << 8
            r10 = r0 & 3840(0xf00, float:5.381E-42)
            r10 = r10 | r14
            int r14 = r11 << 20
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r14 = r14 & r0
            r14 = r14 | r10
            r12 = -1044736(0xfffffffffff00f00, float:NaN)
            goto L_0x0229
        L_0x01bd:
            java.lang.String r0 = "model"
            boolean r0 = r12.equals(r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r0 == 0) goto L_0x00f2
            r0 = -983281(0xfffffffffff0ff0f, float:NaN)
            r14 = r14 & r0
            r17 = r17 & r0
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x00f2 }
            r0 = r10 & 15
            int r11 = r10 >> 4
            int r0 = r0 << 4
            r10 = r0 & 240(0xf0, float:3.36E-43)
            r10 = r10 | r14
            int r14 = r11 << 16
            r0 = 983040(0xf0000, float:1.377532E-39)
            r14 = r14 & r0
            r14 = r14 | r10
            r12 = -267452176(0xfffffffff00f00f0, float:-1.7702996E29)
            goto L_0x0229
        L_0x01e3:
            java.lang.String r0 = "Processor"
            boolean r0 = r12.equals(r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r0 == 0) goto L_0x00f2
            goto L_0x0304
        L_0x01ed:
            java.lang.String r0 = "MSM Hardware"
            boolean r0 = r12.equals(r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r0 == 0) goto L_0x00f2
            r12 = 13
            goto L_0x0294
        L_0x01f9:
            java.lang.String r0 = "CPU implementer"
            boolean r0 = r12.equals(r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r0 == 0) goto L_0x00f2
            r12 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r11 = 24
        L_0x0205:
            r0 = r12 ^ -1
            r14 = r14 & r0
            r17 = r17 & r0
            java.lang.String r0 = "0x"
            boolean r0 = r10.startsWith(r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r0 == 0) goto L_0x00f2
            r0 = 2
            java.lang.String r10 = r10.substring(r0)     // Catch:{ NumberFormatException -> 0x00f2 }
            r0 = 16
            int r0 = java.lang.Integer.parseInt(r10, r0)     // Catch:{ NumberFormatException -> 0x00f2 }
            int r0 = r0 << r11
        L_0x021e:
            r0 = r0 & r12
            r0 = r0 | r14
            goto L_0x0228
        L_0x0221:
            r12 = 6
        L_0x0222:
            int r0 = r12 << 16
            r12 = 983040(0xf0000, float:1.377532E-39)
            r0 = r0 & r12
            r0 = r0 | r14
        L_0x0228:
            r14 = r0
        L_0x0229:
            r17 = r17 | r12
            goto L_0x00f2
        L_0x022d:
            java.lang.String r11 = "processor"
            boolean r11 = r12.equals(r11)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r11 == 0) goto L_0x00f2
            int r13 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x023a }
        L_0x023a:
            if (r13 == r1) goto L_0x0286
            if (r17 != 0) goto L_0x0240
            if (r16 == 0) goto L_0x0282
        L_0x0240:
            if (r1 < 0) goto L_0x0282
            int r10 = r5.length()     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r10 <= 0) goto L_0x024d
            r10 = 44
            r5.append(r10)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
        L_0x024d:
            r5.append(r1)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            r5.append(r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r17 == 0) goto L_0x027d
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            r12 = 28
        L_0x025b:
            int r0 = r14 >> r12
            r11 = 15
            r10 = r0 & 15
            int r0 = r17 >> r12
            r0 = r0 & 15
            if (r0 != r11) goto L_0x0268
            goto L_0x026b
        L_0x0268:
            r0 = 63
            goto L_0x0271
        L_0x026b:
            java.lang.String r0 = "0123456789ABCDEF"
            char r0 = r0.charAt(r10)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
        L_0x0271:
            r1.append(r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            int r12 = r12 + -4
            if (r12 >= 0) goto L_0x025b
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            goto L_0x027f
        L_0x027d:
            java.lang.String r0 = "?"
        L_0x027f:
            r5.append(r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
        L_0x0282:
            r14 = 0
            r17 = 0
            r1 = r13
        L_0x0286:
            r16 = 1
            goto L_0x00f2
        L_0x028a:
            java.lang.String r0 = "Hardware"
            boolean r0 = r12.equals(r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r0 == 0) goto L_0x00f2
            r12 = 14
        L_0x0294:
            r0 = 128(0x80, float:1.794E-43)
            int r12 = 13 - r12
            if (r12 == 0) goto L_0x02a3
            int r0 = java.lang.Math.min(r0, r11)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            r10.substring(r9, r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            goto L_0x00f2
        L_0x02a3:
            int r0 = java.lang.Math.min(r0, r11)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            r10.substring(r9, r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            goto L_0x00f2
        L_0x02ac:
            java.lang.String r0 = "Features"
            boolean r0 = r12.equals(r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r0 == 0) goto L_0x00f2
            r0 = 256(0x100, float:3.59E-43)
            int r0 = java.lang.Math.min(r0, r11)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            java.lang.String r0 = r10.substring(r9, r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            r4.A02 = r0     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            goto L_0x00f2
        L_0x02c2:
            java.lang.String r0 = "flags"
            boolean r0 = r12.equals(r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r0 == 0) goto L_0x00f2
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = java.lang.Math.min(r0, r11)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            java.lang.String r0 = r10.substring(r9, r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            r4.A02 = r0     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            goto L_0x00f2
        L_0x02d8:
            java.lang.String r0 = "CPU revision"
            boolean r0 = r12.equals(r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r0 == 0) goto L_0x00f2
            goto L_0x02ea
        L_0x02e1:
            java.lang.String r0 = "stepping"
            boolean r0 = r12.equals(r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r0 == 0) goto L_0x00f2
        L_0x02ea:
            r14 = r14 & -16
            r17 = r17 & -16
            int r0 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x00f2 }
            int r0 = r0 << r9
            r0 = r0 & 15
            r0 = r0 | r14
            r14 = r0
            r17 = r17 | 15
            goto L_0x00f2
        L_0x02fb:
            java.lang.String r0 = "model name"
            boolean r0 = r12.equals(r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r0 == 0) goto L_0x00f2
        L_0x0304:
            r0 = 48
            int r0 = java.lang.Math.min(r0, r11)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            r10.substring(r9, r0)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            goto L_0x00f2
        L_0x030f:
            if (r1 < 0) goto L_0x032e
            r5.length()     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
            if (r17 == 0) goto L_0x032e
            r10 = 28
        L_0x0318:
            int r0 = r14 >> r10
            r5 = 15
            r1 = r0 & 15
            int r0 = r17 >> r10
            r0 = r0 & 15
            if (r0 != r5) goto L_0x0329
            java.lang.String r0 = "0123456789ABCDEF"
            r0.charAt(r1)     // Catch:{ IOException -> 0x0335, all -> 0x0332 }
        L_0x0329:
            int r10 = r10 + -4
            if (r10 < 0) goto L_0x032e
            goto L_0x0318
        L_0x032e:
            r6.close()     // Catch:{ IOException -> 0x0356 }
            goto L_0x035a
        L_0x0332:
            r1 = move-exception
            r5 = r6
            goto L_0x0347
        L_0x0335:
            r1 = move-exception
            r5 = r6
            goto L_0x0339
        L_0x0338:
            r1 = move-exception
        L_0x0339:
            java.lang.String r0 = "Unable to read cpuinfo"
            X.0KC.A0H(r2, r0, r1)     // Catch:{ all -> 0x0344 }
            if (r5 == 0) goto L_0x035a
            r5.close()     // Catch:{ IOException -> 0x0356 }
            goto L_0x035a
        L_0x0344:
            r1 = move-exception
            if (r5 == 0) goto L_0x034f
        L_0x0347:
            r5.close()     // Catch:{ IOException -> 0x034b }
            goto L_0x034f
        L_0x034b:
            r0 = move-exception
            X.0KC.A0H(r2, r3, r0)     // Catch:{ Exception -> 0x08dc }
        L_0x034f:
            throw r1     // Catch:{ Exception -> 0x08dc }
        L_0x0350:
            java.lang.String r0 = "CPU Info file missing"
            X.0KC.A0D(r2, r0)     // Catch:{ Exception -> 0x08dc }
            goto L_0x035a
        L_0x0356:
            r0 = move-exception
            X.0KC.A0H(r2, r3, r0)     // Catch:{ Exception -> 0x08dc }
        L_0x035a:
            r4.A03 = r8     // Catch:{ Exception -> 0x08dc }
        L_0x035c:
            java.lang.String r1 = r4.A02     // Catch:{ Exception -> 0x08dc }
            java.lang.String r0 = "cpu_features"
            r7.put(r0, r1)     // Catch:{ Exception -> 0x08dc }
            X.0qg.A01()     // Catch:{ Exception -> 0x08dc }
            r3 = r29
            long r0 = X.0qg.A00(r3, r8)     // Catch:{ Exception -> 0x08dc }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x08dc }
            java.lang.String r0 = "total_memory"
            r7.put(r0, r1)     // Catch:{ Exception -> 0x08dc }
            java.lang.String[] r0 = android.os.Build.SUPPORTED_ABIS     // Catch:{ Exception -> 0x08dc }
            if (r0 == 0) goto L_0x03fd
            java.util.List r2 = X.03t.A0J(r0)     // Catch:{ Exception -> 0x08dc }
            java.lang.String r1 = "|"
            r0 = 0
            java.lang.String r6 = ""
            java.lang.String r1 = X.00k.A0P(r1, r6, r6, r2, r0)     // Catch:{ Exception -> 0x08dc }
        L_0x0388:
            java.lang.String r0 = "cpu_abi"
            r7.put(r0, r1)     // Catch:{ Exception -> 0x08dc }
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x08dc }
            int r0 = r0.availableProcessors()     // Catch:{ Exception -> 0x08dc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x08dc }
            java.lang.String r0 = "cpu_cores"
            r7.put(r0, r1)     // Catch:{ Exception -> 0x08dc }
            X.0Tu r4 = X.0Tu.A06     // Catch:{ Exception -> 0x08dc }
            r0 = 36593314635449439(0x82016d0000045f, double:3.2050977526846166E-306)
            r2 = r30
            long r0 = X.182.A01(r4, r2, r0)     // Catch:{ Exception -> 0x08dc }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x08dc }
            java.lang.String r0 = "ar_class"
            r7.put(r0, r1)     // Catch:{ Exception -> 0x08dc }
            android.util.ArrayMap r5 = new android.util.ArrayMap     // Catch:{ Exception -> 0x08dc }
            r5.<init>()     // Catch:{ Exception -> 0x08dc }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x08dc }
            java.lang.String r10 = "screen_width"
            r0 = 14
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ Exception -> 0x08dc }
            java.lang.String r11 = "window"
            java.lang.String r1 = "screen_height"
            r2 = 30
            if (r4 < r2) goto L_0x0414
            java.lang.Object r2 = r3.getSystemService(r11)     // Catch:{ Exception -> 0x08dc }
            X.0qQ.A0C(r2, r0)     // Catch:{ Exception -> 0x08dc }
            android.view.WindowManager r2 = (android.view.WindowManager) r2     // Catch:{ Exception -> 0x08dc }
            android.view.WindowMetrics r2 = r2.getCurrentWindowMetrics()     // Catch:{ Exception -> 0x08dc }
            X.0qQ.A07(r2)     // Catch:{ Exception -> 0x08dc }
            android.graphics.Rect r0 = r2.getBounds()     // Catch:{ Exception -> 0x08dc }
            int r0 = r0.width()     // Catch:{ Exception -> 0x08dc }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x08dc }
            r5.put(r10, r0)     // Catch:{ Exception -> 0x08dc }
            android.graphics.Rect r0 = r2.getBounds()     // Catch:{ Exception -> 0x08dc }
            int r0 = r0.height()     // Catch:{ Exception -> 0x08dc }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x08dc }
            r5.put(r1, r0)     // Catch:{ Exception -> 0x08dc }
            goto L_0x0401
        L_0x03fd:
            java.lang.String r1 = ""
            r6 = r1
            goto L_0x0388
        L_0x0401:
            r0 = 34
            if (r4 < r0) goto L_0x0443
            float r0 = r2.getDensity()     // Catch:{ Exception -> 0x08dc }
            java.lang.Float r1 = java.lang.Float.valueOf(r0)     // Catch:{ Exception -> 0x08dc }
            java.lang.String r0 = "screen_density"
            r5.put(r0, r1)     // Catch:{ Exception -> 0x08dc }
            goto L_0x0443
        L_0x0414:
            android.util.DisplayMetrics r2 = X.AnonymousClass7TF.A0E(r3)     // Catch:{ Exception -> 0x08dc }
            java.lang.Object r3 = r3.getSystemService(r11)     // Catch:{ Exception -> 0x08dc }
            X.0qQ.A0C(r3, r0)     // Catch:{ Exception -> 0x08dc }
            android.view.WindowManager r3 = (android.view.WindowManager) r3     // Catch:{ Exception -> 0x08dc }
            android.view.Display r0 = r3.getDefaultDisplay()     // Catch:{ Exception -> 0x08dc }
            r0.getRealMetrics(r2)     // Catch:{ Exception -> 0x08dc }
            int r0 = r2.heightPixels     // Catch:{ Exception -> 0x08dc }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x08dc }
            r5.put(r10, r0)     // Catch:{ Exception -> 0x08dc }
            int r0 = r2.widthPixels     // Catch:{ Exception -> 0x08dc }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x08dc }
            r5.put(r1, r0)     // Catch:{ Exception -> 0x08dc }
            float r0 = r2.density     // Catch:{ Exception -> 0x08dc }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ Exception -> 0x08dc }
            r5.put(r1, r0)     // Catch:{ Exception -> 0x08dc }
        L_0x0443:
            java.util.Iterator r21 = r18.iterator()     // Catch:{ Exception -> 0x08dc }
        L_0x0447:
            boolean r0 = r21.hasNext()     // Catch:{ Exception -> 0x08dc }
            if (r0 == 0) goto L_0x08e4
            java.lang.Object r23 = r21.next()     // Catch:{ Exception -> 0x08dc }
            r0 = r23
            android.media.MediaCodecInfo r0 = (android.media.MediaCodecInfo) r0     // Catch:{ Exception -> 0x08dc }
            r23 = r0
            java.lang.String[] r0 = r23.getSupportedTypes()     // Catch:{ Exception -> 0x08dc }
            X.0sC r22 = X.0pe.A00(r0)     // Catch:{ Exception -> 0x08dc }
        L_0x045f:
            boolean r0 = r22.hasNext()     // Catch:{ Exception -> 0x08dc }
            if (r0 == 0) goto L_0x0447
            java.lang.Object r11 = r22.next()     // Catch:{ Exception -> 0x08dc }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x08dc }
            java.lang.String r0 = "media_codec_info"
            r3 = 0
            r0.getClass()     // Catch:{ Exception -> 0x08dc }
            X.0xI r2 = X.0xI.A01(r0, r3)     // Catch:{ Exception -> 0x08dc }
            X.0qQ.A0A(r2)     // Catch:{ Exception -> 0x08dc }
            java.util.Iterator r10 = X.AnonymousClass7TF.A0u(r7)     // Catch:{ Exception -> 0x08dc }
        L_0x047d:
            boolean r0 = r10.hasNext()     // Catch:{ Exception -> 0x08dc }
            if (r0 == 0) goto L_0x0497
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r10)     // Catch:{ Exception -> 0x08dc }
            java.lang.String r1 = X.DbT.A13(r0)     // Catch:{ Exception -> 0x08dc }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x08dc }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x08dc }
            r2.A0C(r1, r0)     // Catch:{ Exception -> 0x08dc }
            goto L_0x047d
        L_0x0497:
            java.util.Iterator r10 = X.AnonymousClass7TF.A0u(r5)     // Catch:{ Exception -> 0x08dc }
        L_0x049b:
            boolean r0 = r10.hasNext()     // Catch:{ Exception -> 0x08dc }
            if (r0 == 0) goto L_0x04b5
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r10)     // Catch:{ Exception -> 0x08dc }
            java.lang.String r1 = X.DbT.A13(r0)     // Catch:{ Exception -> 0x08dc }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x08dc }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x08dc }
            r2.A0C(r1, r0)     // Catch:{ Exception -> 0x08dc }
            goto L_0x049b
        L_0x04b5:
            java.lang.String r0 = "mime_type"
            r2.A0C(r0, r11)     // Catch:{ Exception -> 0x08dc }
            java.lang.String r1 = "codec_name"
            java.lang.String r0 = r23.getName()     // Catch:{ Exception -> 0x08dc }
            r2.A0C(r1, r0)     // Catch:{ Exception -> 0x08dc }
            java.lang.String r1 = "codec_type"
            boolean r0 = r23.isEncoder()     // Catch:{ Exception -> 0x08dc }
            if (r0 == 0) goto L_0x04f0
            java.lang.String r0 = "encoder"
        L_0x04ce:
            r2.A0C(r1, r0)     // Catch:{ Exception -> 0x08dc }
            java.lang.String r1 = "performance_class"
            int r0 = X.SCJ.A00()     // Catch:{ Exception -> 0x08dc }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x08dc }
            r2.A08(r0, r1)     // Catch:{ Exception -> 0x08dc }
            java.lang.String r12 = "is_default"
            X.0qQ.A0A(r11)     // Catch:{ Exception -> 0x08dc }
            X.0qQ.A0B(r11, r8)     // Catch:{ Exception -> 0x08dc }
            boolean r0 = r23.isEncoder()     // Catch:{ Exception -> 0x08dc }
            r13 = r19
            if (r0 == 0) goto L_0x04f5
            goto L_0x04f3
        L_0x04f0:
            java.lang.String r0 = "decoder"
            goto L_0x04ce
        L_0x04f3:
            r13 = r20
        L_0x04f5:
            boolean r0 = r13.containsKey(r11)     // Catch:{ Exception -> 0x08dc }
            if (r0 != 0) goto L_0x0566
            boolean r15 = r23.isEncoder()     // Catch:{ Exception -> 0x08dc }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x08dc }
            r1 = 0
        L_0x0503:
            if (r15 == 0) goto L_0x0509
            r0 = 1888550608(0x7090fed0, float:3.5899113E29)
            goto L_0x0511
        L_0x0509:
            r0 = 1558229569(0x5ce0b241, float:5.05971096E17)
            android.media.MediaCodec r14 = X.0fX.A01(r11, r0)     // Catch:{ Exception -> 0x052c }
            goto L_0x0515
        L_0x0511:
            android.media.MediaCodec r14 = X.0fX.A02(r11, r0)     // Catch:{ Exception -> 0x052c }
        L_0x0515:
            X.0qQ.A0A(r14)     // Catch:{ Exception -> 0x052c }
            r14.getName()     // Catch:{ Exception -> 0x052c }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x052c }
            java.lang.String r10 = r14.getName()     // Catch:{ Exception -> 0x052c }
            X.0qQ.A07(r10)     // Catch:{ Exception -> 0x052c }
            r0 = -2097376322(0xffffffff82fc93be, float:-3.7112872E-37)
            X.0fX.A03(r14, r0)     // Catch:{ Exception -> 0x052c }
            goto L_0x0563
        L_0x052c:
            r14 = move-exception
            long r17 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x08dc }
            int r1 = r1 + 1
            r0 = 3
            if (r1 < r0) goto L_0x0503
            java.lang.Class<X.RvC> r16 = X.C10618RvC.class
            if (r15 == 0) goto L_0x055f
            java.lang.String r10 = "Encoder"
        L_0x053c:
            long r0 = X.Pxe.A0C(r17)     // Catch:{ Exception -> 0x08dc }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x08dc }
            java.lang.Object[] r15 = new java.lang.Object[]{r10, r11, r0}     // Catch:{ Exception -> 0x08dc }
            java.lang.String r10 = "%s MediaCodec create for type %s failed in %d ms."
            X.0I2 r1 = X.0KC.A01     // Catch:{ Exception -> 0x08dc }
            r0 = 5
            boolean r0 = r1.isLoggable(r0)     // Catch:{ Exception -> 0x08dc }
            if (r0 == 0) goto L_0x0562
            java.lang.String r1 = r16.getSimpleName()     // Catch:{ Exception -> 0x08dc }
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r10, r15)     // Catch:{ Exception -> 0x08dc }
            X.0KC.A0H(r1, r0, r14)     // Catch:{ Exception -> 0x08dc }
            goto L_0x0562
        L_0x055f:
            java.lang.String r10 = "Decoder"
            goto L_0x053c
        L_0x0562:
            r10 = r3
        L_0x0563:
            r13.put(r11, r10)     // Catch:{ Exception -> 0x08dc }
        L_0x0566:
            boolean r0 = r13.containsKey(r11)     // Catch:{ Exception -> 0x08dc }
            r10 = 1
            if (r0 == 0) goto L_0x0589
            java.lang.Object r0 = r13.get(r11)     // Catch:{ Exception -> 0x08dc }
            if (r0 == 0) goto L_0x0589
            java.lang.String r1 = X.DbS.A0r(r11, r13)     // Catch:{ Exception -> 0x08dc }
            java.lang.String r0 = r23.getName()     // Catch:{ Exception -> 0x08dc }
            boolean r0 = X.00p.A0j(r1, r0, r8)     // Catch:{ Exception -> 0x08dc }
            if (r0 == 0) goto L_0x0589
        L_0x0581:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)     // Catch:{ Exception -> 0x08dc }
            r2.A09(r12, r0)     // Catch:{ Exception -> 0x08dc }
            goto L_0x058b
        L_0x0589:
            r10 = 0
            goto L_0x0581
        L_0x058b:
            r0 = r23
            android.media.MediaCodecInfo$CodecCapabilities r17 = r0.getCapabilitiesForType(r11)     // Catch:{ Exception -> 0x0883 }
            java.lang.String r11 = "profile_levels"
            X.0qQ.A0A(r17)     // Catch:{ Exception -> 0x0883 }
            r0 = r17
            android.media.MediaCodecInfo$CodecProfileLevel[] r10 = r0.profileLevels     // Catch:{ Exception -> 0x0883 }
            if (r10 == 0) goto L_0x05c8
            int r0 = r10.length     // Catch:{ Exception -> 0x0883 }
            if (r0 == 0) goto L_0x05c8
            java.lang.String r1 = ","
            X.TXa r0 = X.C13365TXa.A00     // Catch:{ Exception -> 0x0883 }
            java.lang.String r0 = X.03t.A07(r1, r6, r6, r0, r10)     // Catch:{ Exception -> 0x0883 }
        L_0x05a8:
            r2.A0C(r11, r0)     // Catch:{ Exception -> 0x0883 }
            java.lang.String r10 = "color_formats"
            r0 = r17
            int[] r1 = r0.colorFormats     // Catch:{ Exception -> 0x0883 }
            if (r1 == 0) goto L_0x05c6
            int r0 = r1.length     // Catch:{ Exception -> 0x0883 }
            if (r0 == 0) goto L_0x05c6
            java.lang.String r0 = ","
            java.lang.String r0 = X.03t.A09(r0, r1)     // Catch:{ Exception -> 0x0883 }
        L_0x05bc:
            r2.A0C(r10, r0)     // Catch:{ Exception -> 0x0883 }
            java.lang.String r16 = "features"
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x0883 }
            goto L_0x05ca
        L_0x05c6:
            r0 = 0
            goto L_0x05bc
        L_0x05c8:
            r0 = 0
            goto L_0x05a8
        L_0x05ca:
            java.util.ArrayList r0 = A00     // Catch:{ all -> 0x065c }
            if (r0 != 0) goto L_0x0640
            java.lang.Class r0 = r17.getClass()     // Catch:{ all -> 0x065c }
            java.lang.reflect.Field[] r14 = r0.getFields()     // Catch:{ all -> 0x065c }
            java.util.ArrayList r13 = X.DbV.A15(r14)     // Catch:{ all -> 0x065c }
            int r12 = r14.length     // Catch:{ all -> 0x065c }
            r11 = 0
        L_0x05dc:
            if (r11 >= r12) goto L_0x05f5
            r1 = r14[r11]     // Catch:{ all -> 0x065c }
            java.lang.String r15 = r1.getName()     // Catch:{ all -> 0x065c }
            X.0qQ.A07(r15)     // Catch:{ all -> 0x065c }
            java.lang.String r0 = "FEATURE_"
            boolean r0 = X.C66580MXl.A1a(r0, r8, r15)     // Catch:{ all -> 0x065c }
            if (r0 == 0) goto L_0x05f2
            r13.add(r1)     // Catch:{ all -> 0x065c }
        L_0x05f2:
            int r11 = r11 + 1
            goto L_0x05dc
        L_0x05f5:
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x065c }
            java.util.Iterator r15 = r13.iterator()     // Catch:{ all -> 0x065c }
        L_0x05fd:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x065c }
            if (r0 == 0) goto L_0x0639
            java.lang.Object r1 = r15.next()     // Catch:{ all -> 0x065c }
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1     // Catch:{ all -> 0x065c }
            java.lang.Object r12 = r1.get(r3)     // Catch:{ all -> 0x0613 }
            X.DbS.A1Y(r12)     // Catch:{ all -> 0x0613 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0613 }
            goto L_0x0618
        L_0x0613:
            r0 = move-exception
            X.0eQ r12 = X.JTO.A1B(r0)     // Catch:{ all -> 0x065c }
        L_0x0618:
            java.lang.Throwable r13 = X.0eR.A00(r12)     // Catch:{ all -> 0x065c }
            if (r13 == 0) goto L_0x062f
            java.lang.String r14 = "Could not access feature name from field: "
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x065c }
            r0 = 46
            java.lang.String r1 = X.002.A0S(r14, r1, r0)     // Catch:{ all -> 0x065c }
            java.lang.String r0 = "MediaCodecInfoReporter"
            X.0KC.A0G(r0, r1, r13)     // Catch:{ all -> 0x065c }
        L_0x062f:
            boolean r0 = r12 instanceof X.0eQ     // Catch:{ all -> 0x065c }
            if (r0 != 0) goto L_0x05fd
            if (r12 == 0) goto L_0x05fd
            r11.add(r12)     // Catch:{ all -> 0x065c }
            goto L_0x05fd
        L_0x0639:
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x065c }
            X.00k.A0r(r11, r0)     // Catch:{ all -> 0x065c }
        L_0x0640:
            A00 = r0     // Catch:{ all -> 0x065c }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x065c }
        L_0x0646:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x065c }
            if (r0 == 0) goto L_0x0662
            java.lang.String r1 = X.AnonymousClass7TE.A18(r11)     // Catch:{ all -> 0x065c }
            r0 = r17
            boolean r0 = r0.isFeatureSupported(r1)     // Catch:{ all -> 0x065c }
            if (r0 == 0) goto L_0x0646
            r10.add(r1)     // Catch:{ all -> 0x065c }
            goto L_0x0646
        L_0x065c:
            r1 = move-exception
            java.lang.String r0 = "MediaCodecInfoReporter_get_supported_features_error"
            X.0wb.A07(r0, r1)     // Catch:{ Exception -> 0x0883 }
        L_0x0662:
            java.lang.String r1 = ","
            java.lang.String r10 = X.00k.A0P(r1, r6, r6, r10, r3)     // Catch:{ Exception -> 0x0883 }
            r0 = r16
            r2.A0C(r0, r10)     // Catch:{ Exception -> 0x0883 }
            r0 = 29
            if (r4 < r0) goto L_0x06fb
            android.media.MediaCodecInfo$VideoCapabilities r10 = r17.getVideoCapabilities()     // Catch:{ Exception -> 0x0883 }
            if (r10 == 0) goto L_0x06fb
            java.util.List r10 = r10.getSupportedPerformancePoints()     // Catch:{ Exception -> 0x0883 }
            if (r10 == 0) goto L_0x06fb
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r12 = android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.FHD_30     // Catch:{ Exception -> 0x0883 }
            java.lang.String r11 = "1080p@30"
            X.0eP r24 = X.AnonymousClass7TE.A1L(r11, r12)     // Catch:{ Exception -> 0x0883 }
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r12 = android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.FHD_60     // Catch:{ Exception -> 0x0883 }
            java.lang.String r11 = "1080p@60"
            X.0eP r25 = X.AnonymousClass7TE.A1L(r11, r12)     // Catch:{ Exception -> 0x0883 }
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r12 = android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.HD_30     // Catch:{ Exception -> 0x0883 }
            java.lang.String r11 = "720p@30"
            X.0eP r26 = X.AnonymousClass7TE.A1L(r11, r12)     // Catch:{ Exception -> 0x0883 }
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r12 = android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.HD_60     // Catch:{ Exception -> 0x0883 }
            java.lang.String r11 = "720p@60"
            X.0eP r27 = X.AnonymousClass7TE.A1L(r11, r12)     // Catch:{ Exception -> 0x0883 }
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r12 = android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.SD_30     // Catch:{ Exception -> 0x0883 }
            java.lang.String r11 = "480p@30"
            X.0eP r28 = X.AnonymousClass7TE.A1L(r11, r12)     // Catch:{ Exception -> 0x0883 }
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r12 = android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.SD_60     // Catch:{ Exception -> 0x0883 }
            java.lang.String r11 = "480p@60"
            X.0eP r29 = X.AnonymousClass7TE.A1L(r11, r12)     // Catch:{ Exception -> 0x0883 }
            X.0eP[] r11 = new X.0eP[]{r24, r25, r26, r27, r28, r29}     // Catch:{ Exception -> 0x0883 }
            java.util.List r11 = X.0sr.A1P(r11)     // Catch:{ Exception -> 0x0883 }
            java.util.Iterator r16 = r11.iterator()     // Catch:{ Exception -> 0x0883 }
        L_0x06b9:
            boolean r11 = r16.hasNext()     // Catch:{ Exception -> 0x0883 }
            if (r11 == 0) goto L_0x06fb
            java.lang.Object r11 = r16.next()     // Catch:{ Exception -> 0x0883 }
            X.0eP r11 = (X.0eP) r11     // Catch:{ Exception -> 0x0883 }
            java.lang.Object r13 = r11.A00     // Catch:{ Exception -> 0x0883 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x0883 }
            java.lang.Object r12 = r11.A01     // Catch:{ Exception -> 0x0883 }
            X.0qQ.A07(r12)     // Catch:{ Exception -> 0x0883 }
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r12 = (android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint) r12     // Catch:{ Exception -> 0x0883 }
            boolean r11 = r10 instanceof java.util.Collection     // Catch:{ Exception -> 0x0883 }
            r15 = 0
            if (r11 == 0) goto L_0x06e3
            boolean r11 = r10.isEmpty()     // Catch:{ Exception -> 0x0883 }
            if (r11 == 0) goto L_0x06e3
        L_0x06db:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r15)     // Catch:{ Exception -> 0x0883 }
            r2.A09(r13, r11)     // Catch:{ Exception -> 0x0883 }
            goto L_0x06b9
        L_0x06e3:
            java.util.Iterator r14 = r10.iterator()     // Catch:{ Exception -> 0x0883 }
        L_0x06e7:
            boolean r11 = r14.hasNext()     // Catch:{ Exception -> 0x0883 }
            if (r11 == 0) goto L_0x06db
            java.lang.Object r11 = r14.next()     // Catch:{ Exception -> 0x0883 }
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r11 = (android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint) r11     // Catch:{ Exception -> 0x0883 }
            boolean r11 = r11.covers(r12)     // Catch:{ Exception -> 0x0883 }
            if (r11 == 0) goto L_0x06e7
            r15 = 1
            goto L_0x06db
        L_0x06fb:
            android.media.MediaCodecInfo$EncoderCapabilities r12 = r17.getEncoderCapabilities()     // Catch:{ Exception -> 0x0883 }
            if (r12 == 0) goto L_0x074e
            android.util.Range r10 = r12.getComplexityRange()     // Catch:{ Exception -> 0x0883 }
            if (r10 == 0) goto L_0x0820
            java.lang.String r11 = r10.toString()     // Catch:{ Exception -> 0x0883 }
        L_0x070b:
            java.lang.String r10 = "encoder_complexity_range"
            r2.A0C(r10, r11)     // Catch:{ Exception -> 0x0883 }
            android.util.Range r10 = r12.getQualityRange()     // Catch:{ Exception -> 0x0883 }
            if (r10 == 0) goto L_0x081d
            java.lang.String r11 = r10.toString()     // Catch:{ Exception -> 0x0883 }
        L_0x071a:
            java.lang.String r10 = "encoder_quality_range"
            r2.A0C(r10, r11)     // Catch:{ Exception -> 0x0883 }
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x0883 }
            r10 = 2
            boolean r10 = r12.isBitrateModeSupported(r10)     // Catch:{ Exception -> 0x0883 }
            if (r10 == 0) goto L_0x072f
            java.lang.String r10 = "CBR"
            r11.add(r10)     // Catch:{ Exception -> 0x0883 }
        L_0x072f:
            boolean r10 = r12.isBitrateModeSupported(r8)     // Catch:{ Exception -> 0x0883 }
            if (r10 == 0) goto L_0x073a
            java.lang.String r10 = "VBR"
            r11.add(r10)     // Catch:{ Exception -> 0x0883 }
        L_0x073a:
            boolean r10 = r12.isBitrateModeSupported(r9)     // Catch:{ Exception -> 0x0883 }
            if (r10 == 0) goto L_0x0745
            java.lang.String r10 = "CQ"
            r11.add(r10)     // Catch:{ Exception -> 0x0883 }
        L_0x0745:
            java.lang.String r11 = X.00k.A0P(r1, r6, r6, r11, r3)     // Catch:{ Exception -> 0x0883 }
            java.lang.String r10 = "encoder_bitrate_modes"
            r2.A0C(r10, r11)     // Catch:{ Exception -> 0x0883 }
        L_0x074e:
            android.media.MediaCodecInfo$AudioCapabilities r12 = r17.getAudioCapabilities()     // Catch:{ Exception -> 0x0883 }
            if (r12 == 0) goto L_0x077f
            android.util.Range r10 = r12.getBitrateRange()     // Catch:{ Exception -> 0x0883 }
            if (r10 == 0) goto L_0x081a
            java.lang.String r11 = r10.toString()     // Catch:{ Exception -> 0x0883 }
        L_0x075e:
            java.lang.String r10 = "audio_bitrate_range"
            r2.A0C(r10, r11)     // Catch:{ Exception -> 0x0883 }
            int r10 = r12.getMaxInputChannelCount()     // Catch:{ Exception -> 0x0883 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0883 }
            java.lang.String r10 = "audio_max_input_channels"
            r2.A08(r11, r10)     // Catch:{ Exception -> 0x0883 }
            android.util.Range[] r10 = r12.getSupportedSampleRateRanges()     // Catch:{ Exception -> 0x0883 }
            if (r10 == 0) goto L_0x080b
            java.lang.String r11 = X.03t.A07(r1, r6, r6, r3, r10)     // Catch:{ Exception -> 0x0883 }
        L_0x077a:
            java.lang.String r10 = "audio_supported_sample_rates"
            r2.A0C(r10, r11)     // Catch:{ Exception -> 0x0883 }
        L_0x077f:
            android.media.MediaCodecInfo$VideoCapabilities r13 = r17.getVideoCapabilities()     // Catch:{ Exception -> 0x0883 }
            if (r13 == 0) goto L_0x0835
            int r10 = r13.getHeightAlignment()     // Catch:{ Exception -> 0x0883 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0883 }
            java.lang.String r10 = "video_height_alignment"
            r2.A08(r11, r10)     // Catch:{ Exception -> 0x0883 }
            int r10 = r13.getWidthAlignment()     // Catch:{ Exception -> 0x0883 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0883 }
            java.lang.String r10 = "video_width_alignment"
            r2.A08(r11, r10)     // Catch:{ Exception -> 0x0883 }
            android.util.Range r10 = r13.getBitrateRange()     // Catch:{ Exception -> 0x0883 }
            if (r10 == 0) goto L_0x0809
            java.lang.String r11 = r10.toString()     // Catch:{ Exception -> 0x0883 }
        L_0x07ab:
            java.lang.String r10 = "video_bitrate_range"
            r2.A0C(r10, r11)     // Catch:{ Exception -> 0x0883 }
            android.util.Range r10 = r13.getSupportedFrameRates()     // Catch:{ Exception -> 0x0883 }
            if (r10 == 0) goto L_0x0807
            java.lang.String r11 = r10.toString()     // Catch:{ Exception -> 0x0883 }
        L_0x07bb:
            java.lang.String r10 = "video_frame_rates"
            r2.A0C(r10, r11)     // Catch:{ Exception -> 0x0883 }
            android.util.Range r10 = r13.getSupportedHeights()     // Catch:{ Exception -> 0x0883 }
            if (r10 == 0) goto L_0x0805
            java.lang.String r11 = r10.toString()     // Catch:{ Exception -> 0x0883 }
        L_0x07cb:
            java.lang.String r10 = "video_supported_heights"
            r2.A0C(r10, r11)     // Catch:{ Exception -> 0x0883 }
            android.util.Range r10 = r13.getSupportedWidths()     // Catch:{ Exception -> 0x0883 }
            if (r10 == 0) goto L_0x0803
            java.lang.String r11 = r10.toString()     // Catch:{ Exception -> 0x0883 }
        L_0x07db:
            java.lang.String r10 = "video_supported_widths"
            r2.A0C(r10, r11)     // Catch:{ Exception -> 0x0883 }
            r12 = 1280(0x500, float:1.794E-42)
            r11 = 720(0x2d0, float:1.009E-42)
            boolean r10 = r13.isSizeSupported(r12, r11)     // Catch:{ Exception -> 0x0883 }
            if (r10 == 0) goto L_0x0823
            android.util.Range r10 = r13.getSupportedFrameRatesFor(r12, r11)     // Catch:{ Exception -> 0x0883 }
            java.lang.Comparable r10 = r10.getUpper()     // Catch:{ Exception -> 0x0883 }
            double r10 = X.JTO.A00(r10)     // Catch:{ Exception -> 0x0883 }
            int r12 = (int) r10     // Catch:{ Exception -> 0x0883 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x0883 }
            java.lang.String r10 = "video_hd_frame_rate"
            r2.A08(r11, r10)     // Catch:{ Exception -> 0x0883 }
            goto L_0x0823
        L_0x0803:
            r11 = 0
            goto L_0x07db
        L_0x0805:
            r11 = 0
            goto L_0x07cb
        L_0x0807:
            r11 = 0
            goto L_0x07bb
        L_0x0809:
            r11 = 0
            goto L_0x07ab
        L_0x080b:
            int[] r11 = r12.getSupportedSampleRates()     // Catch:{ Exception -> 0x0883 }
            X.0qQ.A07(r11)     // Catch:{ Exception -> 0x0883 }
            java.lang.String r10 = ";"
            java.lang.String r11 = X.03t.A09(r10, r11)     // Catch:{ Exception -> 0x0883 }
            goto L_0x077a
        L_0x081a:
            r11 = 0
            goto L_0x075e
        L_0x081d:
            r11 = 0
            goto L_0x071a
        L_0x0820:
            r11 = 0
            goto L_0x070b
        L_0x0823:
            if (r4 < r0) goto L_0x0835
            java.util.List r10 = r13.getSupportedPerformancePoints()     // Catch:{ Exception -> 0x0883 }
            if (r10 == 0) goto L_0x082f
            java.lang.String r3 = X.00k.A0P(r1, r6, r6, r10, r3)     // Catch:{ Exception -> 0x0883 }
        L_0x082f:
            java.lang.String r1 = "video_performance_points"
            r2.A0C(r1, r3)     // Catch:{ Exception -> 0x0883 }
        L_0x0835:
            java.lang.String r3 = "max_instances"
            int r1 = r17.getMaxSupportedInstances()     // Catch:{ Exception -> 0x0883 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0883 }
            r2.A08(r1, r3)     // Catch:{ Exception -> 0x0883 }
            if (r4 < r0) goto L_0x088d
            java.lang.String r1 = "is_alias"
            boolean r0 = r23.isAlias()     // Catch:{ Exception -> 0x0883 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0883 }
            r2.A09(r1, r0)     // Catch:{ Exception -> 0x0883 }
            java.lang.String r1 = "is_hardware"
            boolean r0 = r23.isHardwareAccelerated()     // Catch:{ Exception -> 0x0883 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0883 }
            r2.A09(r1, r0)     // Catch:{ Exception -> 0x0883 }
            java.lang.String r1 = "is_software_only"
            boolean r0 = r23.isSoftwareOnly()     // Catch:{ Exception -> 0x0883 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0883 }
            r2.A09(r1, r0)     // Catch:{ Exception -> 0x0883 }
            java.lang.String r1 = "is_vendor"
            boolean r0 = r23.isVendor()     // Catch:{ Exception -> 0x0883 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0883 }
            r2.A09(r1, r0)     // Catch:{ Exception -> 0x0883 }
            java.lang.String r1 = "canonical_name"
            java.lang.String r0 = r23.getCanonicalName()     // Catch:{ Exception -> 0x0883 }
            r2.A0C(r1, r0)     // Catch:{ Exception -> 0x0883 }
            goto L_0x088d
        L_0x0883:
            r0 = move-exception
            java.lang.String r1 = "extraction_error"
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x08dc }
            r2.A0C(r1, r0)     // Catch:{ Exception -> 0x08dc }
        L_0x088d:
            X.0xF r13 = r2.A06     // Catch:{ Exception -> 0x08dc }
            X.0qQ.A07(r13)     // Catch:{ Exception -> 0x08dc }
            X.02m r11 = X.02m.A0p     // Catch:{ Exception -> 0x08dc }
            r10 = 515391182(0x1eb83ece, float:1.9507733E-20)
            r11.markerStart(r10)     // Catch:{ all -> 0x08c5 }
            r12 = 0
        L_0x089b:
            r14 = r12
            X.0j0 r3 = r13.A00     // Catch:{ all -> 0x08c5 }
            int r0 = r3.A00     // Catch:{ all -> 0x08c5 }
            if (r12 >= r0) goto L_0x08c0
            java.lang.String r1 = r3.A03(r12)     // Catch:{ all -> 0x08c5 }
            int r12 = r12 + 1
            java.lang.Object r0 = r3.A01(r14)     // Catch:{ all -> 0x08c5 }
            android.util.Pair r3 = X.Pxe.A0K(r1, r0)     // Catch:{ all -> 0x08c5 }
            java.lang.Object r0 = r3.first     // Catch:{ all -> 0x08c5 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08c5 }
            java.lang.Object r0 = r3.second     // Catch:{ all -> 0x08c5 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08c5 }
            r11.markerAnnotate(r10, r1, r0)     // Catch:{ all -> 0x08c5 }
            goto L_0x089b
        L_0x08c0:
            r0 = 2
            r11.markerEnd(r10, r0)     // Catch:{ all -> 0x08c5 }
            goto L_0x08d5
        L_0x08c5:
            r3 = move-exception
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x08dc }
            java.lang.String r0 = "error"
            X.Pxf.A1I(r11, r0, r1, r10)     // Catch:{ Exception -> 0x08dc }
            java.lang.String r0 = "mediacodec_capability_qpl_err"
            X.0wb.A07(r0, r3)     // Catch:{ Exception -> 0x08dc }
        L_0x08d5:
            r0 = r30
            X.DbU.A1R(r2, r0)     // Catch:{ Exception -> 0x08dc }
            goto L_0x045f
        L_0x08dc:
            r2 = move-exception
            java.lang.String r1 = "MediaCodecInfoReporter"
            java.lang.String r0 = "Error During MediaCodec info reporting"
            X.0KC.A0G(r1, r0, r2)
        L_0x08e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10023RlI.A00(android.content.Context, X.0lg):void");
    }
}
