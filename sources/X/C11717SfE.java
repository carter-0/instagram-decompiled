package X;

import android.util.SparseArray;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.io.EOFException;

/* renamed from: X.SfE  reason: case insensitive filesystem */
public abstract class C11717SfE implements C13900TjN {
    public int A00;
    public int A01 = IgNetworkConsentStorage.MAX_ENTRIES;
    public int A02;
    public int A03;
    public int A04;
    public long A05 = Long.MIN_VALUE;
    public long A06 = Long.MIN_VALUE;
    public long A07 = Long.MIN_VALUE;
    public SJM A08;
    public SJM A09;
    public boolean A0A = true;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D = true;
    public int[] A0E = new int[IgNetworkConsentStorage.MAX_ENTRIES];
    public int[] A0F = new int[IgNetworkConsentStorage.MAX_ENTRIES];
    public long[] A0G = new long[IgNetworkConsentStorage.MAX_ENTRIES];
    public long[] A0H = new long[IgNetworkConsentStorage.MAX_ENTRIES];
    public long[] A0I = new long[IgNetworkConsentStorage.MAX_ENTRIES];
    public S4h[] A0J = new S4h[IgNetworkConsentStorage.MAX_ENTRIES];
    public SJM A0K;
    public boolean A0L = true;
    public final SSD A0M;
    public final C11178SEe A0N = new C11178SEe(new C11668SeR());
    public final C10508RtN A0O = new Object();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0193, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x019e, code lost:
        if (r6.equals("02") == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01a0, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01ab, code lost:
        if (r6.equals("01") == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ad, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01b1, code lost:
        r1 = X.Pxf.A05(X.Pxe.A0K(r1, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01bb, code lost:
        if (r1 == 16) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01bf, code lost:
        if (r1 == 256) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01c3, code lost:
        if (r1 != 512) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01c5, code lost:
        r1 = "video/avc";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01c8, code lost:
        r4.A00 = r3.size();
        r3.add(new X.S1v(r4, r1, true));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01d8, code lost:
        r1 = "video/hevc";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c7, code lost:
        r1 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ff, code lost:
        if (r1 == null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0101, code lost:
        r6 = r7[2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0103, code lost:
        if (r6 == null) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0109, code lost:
        switch(r6.hashCode()) {
            case 1537: goto L_0x01a5;
            case 1538: goto L_0x0198;
            case 1539: goto L_0x018b;
            case 1540: goto L_0x0114;
            case 1541: goto L_0x017a;
            case 1542: goto L_0x016f;
            case 1543: goto L_0x0164;
            case 1544: goto L_0x0159;
            case 1545: goto L_0x014e;
            case 1567: goto L_0x0143;
            case 1568: goto L_0x0138;
            case 1569: goto L_0x012d;
            case 1570: goto L_0x0122;
            default: goto L_0x010c;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010c, code lost:
        r0 = X.AnonymousClass7TE.A1A();
        r8 = "Unknown Dolby Vision level string: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011a, code lost:
        if (r6.equals("04") == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x011c, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0128, code lost:
        if (r6.equals("13") == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x012a, code lost:
        r0 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0133, code lost:
        if (r6.equals("12") == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0135, code lost:
        r0 = X.C249703kE.FLAG_MOVED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x013e, code lost:
        if (r6.equals("11") == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0140, code lost:
        r0 = 1024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0149, code lost:
        if (r6.equals("10") == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x014b, code lost:
        r0 = 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0154, code lost:
        if (r6.equals("09") == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0156, code lost:
        r0 = 256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x015f, code lost:
        if (r6.equals("08") == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0161, code lost:
        r0 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x016a, code lost:
        if (r6.equals("07") == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x016c, code lost:
        r0 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0175, code lost:
        if (r6.equals("06") == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0177, code lost:
        r0 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0180, code lost:
        if (r6.equals("05") == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0182, code lost:
        r0 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0184, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0188, code lost:
        if (r0 != null) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0191, code lost:
        if (r6.equals("03") == false) goto L_0x010c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AWO(X.SJM r13) {
        /*
            r12 = this;
            r11 = r12
            r4 = r12
            X.QDw r4 = (X.C7457QDw) r4
            monitor-enter(r11)
            boolean r0 = r4.A0D     // Catch:{ all -> 0x029c }
            if (r0 == 0) goto L_0x000a
            goto L_0x000d
        L_0x000a:
            X.SJM r0 = r4.A09     // Catch:{ all -> 0x029c }
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            monitor-exit(r11)
            if (r0 != 0) goto L_0x0075
            X.Sro r1 = r4.A03
            int r0 = r1.A00
            int r0 = r0 + 1
            r1.A00 = r0
            java.util.ArrayList r3 = r1.A0I
            int r0 = r3.size()
            r4.A01 = r0
            r2 = 0
            r1 = 0
            X.S1v r0 = new X.S1v
            r0.<init>(r4, r2, r1)
            r3.add(r0)
            java.lang.String r1 = r13.A0Y
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0075
            java.lang.String r6 = r13.A0T
            if (r6 == 0) goto L_0x0075
            java.lang.String r0 = "\\."
            java.lang.String[] r7 = r6.split(r0)
            int r1 = r7.length
            java.lang.String r8 = "Ignoring malformed Dolby Vision codec string: "
            java.lang.String r5 = "MediaCodecUtil"
            r0 = 3
            if (r1 < r0) goto L_0x01dc
            java.util.regex.Pattern r1 = X.C10051Rlo.A00
            r2 = 1
            r0 = r7[r2]
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r0 = r1.matches()
            if (r0 == 0) goto L_0x01dc
            java.lang.String r6 = r1.group(r2)
            if (r6 == 0) goto L_0x0068
            int r0 = r6.hashCode()
            r10 = 8
            r9 = 4
            r8 = 2
            switch(r0) {
                case 1536: goto L_0x00f3;
                case 1537: goto L_0x00e6;
                case 1538: goto L_0x00d9;
                case 1539: goto L_0x00cc;
                case 1540: goto L_0x00bd;
                case 1541: goto L_0x00b2;
                case 1542: goto L_0x00a7;
                case 1543: goto L_0x009c;
                case 1544: goto L_0x0091;
                case 1545: goto L_0x0086;
                case 1567: goto L_0x007b;
                default: goto L_0x0068;
            }
        L_0x0068:
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()
            java.lang.String r8 = "Unknown Dolby Vision profile string: "
        L_0x006e:
            java.lang.String r0 = X.Pxg.A0s(r8, r6, r0)
            X.STH.A03(r5, r0)
        L_0x0075:
            r5 = 0
            r12.A0K = r13
            monitor-enter(r11)
            goto L_0x01e2
        L_0x007b:
            java.lang.String r0 = "10"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0068
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x00c7
        L_0x0086:
            java.lang.String r0 = "09"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0068
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x00c7
        L_0x0091:
            java.lang.String r0 = "08"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0068
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x00c7
        L_0x009c:
            java.lang.String r0 = "07"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0068
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x00c7
        L_0x00a7:
            java.lang.String r0 = "06"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0068
            r0 = 64
            goto L_0x00c7
        L_0x00b2:
            java.lang.String r0 = "05"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0068
            r0 = 32
            goto L_0x00c7
        L_0x00bd:
            java.lang.String r0 = "04"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0068
            r0 = 16
        L_0x00c7:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L_0x00ff
        L_0x00cc:
            java.lang.String r0 = "03"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            goto L_0x00ff
        L_0x00d9:
            java.lang.String r0 = "02"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            goto L_0x00ff
        L_0x00e6:
            java.lang.String r0 = "01"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            goto L_0x00ff
        L_0x00f3:
            java.lang.String r0 = "00"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
        L_0x00ff:
            if (r1 == 0) goto L_0x0068
            r6 = r7[r8]
            if (r6 == 0) goto L_0x010c
            int r0 = r6.hashCode()
            switch(r0) {
                case 1537: goto L_0x01a5;
                case 1538: goto L_0x0198;
                case 1539: goto L_0x018b;
                case 1540: goto L_0x0114;
                case 1541: goto L_0x017a;
                case 1542: goto L_0x016f;
                case 1543: goto L_0x0164;
                case 1544: goto L_0x0159;
                case 1545: goto L_0x014e;
                case 1567: goto L_0x0143;
                case 1568: goto L_0x0138;
                case 1569: goto L_0x012d;
                case 1570: goto L_0x0122;
                default: goto L_0x010c;
            }
        L_0x010c:
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()
            java.lang.String r8 = "Unknown Dolby Vision level string: "
            goto L_0x006e
        L_0x0114:
            java.lang.String r0 = "04"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x010c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            goto L_0x01b1
        L_0x0122:
            java.lang.String r0 = "13"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x010c
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x0184
        L_0x012d:
            java.lang.String r0 = "12"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x010c
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x0184
        L_0x0138:
            java.lang.String r0 = "11"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x010c
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x0184
        L_0x0143:
            java.lang.String r0 = "10"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x010c
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x0184
        L_0x014e:
            java.lang.String r0 = "09"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x010c
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x0184
        L_0x0159:
            java.lang.String r0 = "08"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x010c
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x0184
        L_0x0164:
            java.lang.String r0 = "07"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x010c
            r0 = 64
            goto L_0x0184
        L_0x016f:
            java.lang.String r0 = "06"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x010c
            r0 = 32
            goto L_0x0184
        L_0x017a:
            java.lang.String r0 = "05"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x010c
            r0 = 16
        L_0x0184:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 != 0) goto L_0x01b1
            goto L_0x010c
        L_0x018b:
            java.lang.String r0 = "03"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x010c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            goto L_0x01b1
        L_0x0198:
            java.lang.String r0 = "02"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x010c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            goto L_0x01b1
        L_0x01a5:
            java.lang.String r0 = "01"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x010c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x01b1:
            android.util.Pair r0 = X.Pxe.A0K(r1, r0)
            int r1 = X.Pxf.A05(r0)
            r0 = 16
            if (r1 == r0) goto L_0x01d8
            r0 = 256(0x100, float:3.59E-43)
            if (r1 == r0) goto L_0x01d8
            r0 = 512(0x200, float:7.175E-43)
            if (r1 != r0) goto L_0x0075
            java.lang.String r1 = "video/avc"
        L_0x01c8:
            int r0 = r3.size()
            r4.A00 = r0
            X.S1v r0 = new X.S1v
            r0.<init>(r4, r1, r2)
            r3.add(r0)
            goto L_0x0075
        L_0x01d8:
            java.lang.String r1 = "video/hevc"
            goto L_0x01c8
        L_0x01dc:
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()
            goto L_0x006e
        L_0x01e2:
            r12.A0D = r5     // Catch:{ all -> 0x029c }
            X.SJM r0 = r12.A09     // Catch:{ all -> 0x029c }
            boolean r0 = androidx.media3.common.util.Util.A0E(r13, r0)     // Catch:{ all -> 0x029c }
            if (r0 != 0) goto L_0x029a
            X.SEe r0 = r12.A0N     // Catch:{ all -> 0x029c }
            android.util.SparseArray r1 = r0.A01     // Catch:{ all -> 0x029c }
            int r0 = r1.size()     // Catch:{ all -> 0x029c }
            if (r0 == 0) goto L_0x0218
            int r0 = r1.size()     // Catch:{ all -> 0x029c }
            int r0 = r0 + -1
            java.lang.Object r0 = r1.valueAt(r0)     // Catch:{ all -> 0x029c }
            X.Rqh r0 = (X.C10344Rqh) r0     // Catch:{ all -> 0x029c }
            X.SJM r0 = r0.A00     // Catch:{ all -> 0x029c }
            boolean r0 = r0.equals(r13)     // Catch:{ all -> 0x029c }
            if (r0 == 0) goto L_0x0218
            int r0 = r1.size()     // Catch:{ all -> 0x029c }
            int r0 = r0 + -1
            java.lang.Object r0 = r1.valueAt(r0)     // Catch:{ all -> 0x029c }
            X.Rqh r0 = (X.C10344Rqh) r0     // Catch:{ all -> 0x029c }
            X.SJM r13 = r0.A00     // Catch:{ all -> 0x029c }
        L_0x0218:
            r12.A09 = r13     // Catch:{ all -> 0x029c }
            boolean r4 = r12.A0A     // Catch:{ all -> 0x029c }
            java.lang.String r3 = r13.A0Y     // Catch:{ all -> 0x029c }
            java.lang.String r1 = r13.A0T     // Catch:{ all -> 0x029c }
            r6 = 0
            if (r3 == 0) goto L_0x0291
            int r0 = r3.hashCode()     // Catch:{ all -> 0x029c }
            r2 = 1
            switch(r0) {
                case -2123537834: goto L_0x022c;
                case -432837260: goto L_0x022f;
                case -432837259: goto L_0x0232;
                case -53558318: goto L_0x0235;
                case 187078296: goto L_0x0262;
                case 187094639: goto L_0x0265;
                case 1504578661: goto L_0x0268;
                case 1504619009: goto L_0x026b;
                case 1504831518: goto L_0x026e;
                case 1903231877: goto L_0x0271;
                case 1903589369: goto L_0x0274;
                default: goto L_0x022b;
            }     // Catch:{ all -> 0x029c }
        L_0x022b:
            goto L_0x0291
        L_0x022c:
            java.lang.String r0 = "audio/eac3-joc"
            goto L_0x0276
        L_0x022f:
            java.lang.String r0 = "audio/mpeg-L1"
            goto L_0x0276
        L_0x0232:
            java.lang.String r0 = "audio/mpeg-L2"
            goto L_0x0276
        L_0x0235:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x029c }
            if (r0 == 0) goto L_0x0291
            if (r1 == 0) goto L_0x0291
            java.util.regex.Pattern r0 = X.SQX.A01     // Catch:{ all -> 0x029c }
            java.util.regex.Matcher r1 = r0.matcher(r1)     // Catch:{ all -> 0x029c }
            boolean r0 = r1.matches()     // Catch:{ all -> 0x029c }
            if (r0 == 0) goto L_0x0291
            java.lang.String r3 = X.Pxf.A0o(r1, r2)     // Catch:{ all -> 0x029c }
            r2 = 2
            java.lang.String r1 = r1.group(r2)     // Catch:{ all -> 0x029c }
            r0 = 16
            java.lang.Integer.parseInt(r3, r0)     // Catch:{ NumberFormatException -> 0x0291 }
            if (r1 == 0) goto L_0x0291
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0291 }
            if (r1 == r2) goto L_0x0293
            goto L_0x027e
        L_0x0262:
            java.lang.String r0 = "audio/ac3"
            goto L_0x0276
        L_0x0265:
            java.lang.String r0 = "audio/raw"
            goto L_0x0276
        L_0x0268:
            java.lang.String r0 = "audio/eac3"
            goto L_0x0276
        L_0x026b:
            java.lang.String r0 = "audio/flac"
            goto L_0x0276
        L_0x026e:
            java.lang.String r0 = "audio/mpeg"
            goto L_0x0276
        L_0x0271:
            java.lang.String r0 = "audio/g711-alaw"
            goto L_0x0276
        L_0x0274:
            java.lang.String r0 = "audio/g711-mlaw"
        L_0x0276:
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x029c }
            r1 = 1
            if (r0 != 0) goto L_0x0295
            goto L_0x0291
        L_0x027e:
            r0 = 5
            if (r1 == r0) goto L_0x0293
            r0 = 29
            if (r1 == r0) goto L_0x0293
            r0 = 42
            if (r1 == r0) goto L_0x0291
            r0 = 22
            if (r1 == r0) goto L_0x0293
            r0 = 23
            if (r1 == r0) goto L_0x0293
        L_0x0291:
            r1 = r6
            goto L_0x0295
        L_0x0293:
            r6 = 1
            goto L_0x0291
        L_0x0295:
            r4 = r4 & r1
            r12.A0A = r4     // Catch:{ all -> 0x029c }
            r12.A0C = r5     // Catch:{ all -> 0x029c }
        L_0x029a:
            monitor-exit(r11)
            return
        L_0x029c:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11717SfE.AWO(X.SJM):void");
    }

    public final /* synthetic */ int EJe(C13506TbX tbX, int i, boolean z) {
        return EJk(tbX, i, 0, z);
    }

    public final /* synthetic */ void EJf(C11389SRd sRd, int i) {
        EJg(sRd, i, 0);
    }

    public void EJm(S4h s4h, int i, int i2, int i3, long j) {
        int i4 = i & 1;
        boolean A1P = AnonymousClass7TF.A1P(i4);
        if (this.A0L) {
            if (A1P) {
                this.A0L = false;
            } else {
                return;
            }
        }
        long j2 = j;
        if (this.A0A) {
            if (j < Long.MIN_VALUE) {
                return;
            }
            if (i4 == 0) {
                if (!this.A0C) {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("Overriding unexpected non-sync sample for format: ");
                    STH.A03("SampleQueue", AnonymousClass7TF.A0i(this.A09, A1A));
                    this.A0C = true;
                }
                i |= 1;
            }
        }
        long j3 = (this.A0M.A00 - ((long) i2)) - ((long) i3);
        synchronized (this) {
            int i5 = this.A02;
            if (i5 > 0) {
                int i6 = this.A04 + (i5 - 1);
                int i7 = this.A01;
                if (i6 >= i7) {
                    i6 -= i7;
                }
                C11366SPh.A01(Dba.A1U(((this.A0G[i6] + ((long) this.A0F[i6])) > j3 ? 1 : ((this.A0G[i6] + ((long) this.A0F[i6])) == j3 ? 0 : -1))));
            }
            this.A0B = AnonymousClass7TF.A1P(536870912 & i);
            this.A06 = Math.max(this.A06, j2);
            int i8 = this.A04 + this.A02;
            int i9 = this.A01;
            if (i8 >= i9) {
                i8 -= i9;
            }
            this.A0I[i8] = j;
            this.A0G[i8] = j3;
            this.A0F[i8] = i2;
            this.A0E[i8] = i;
            this.A0J[i8] = s4h;
            this.A0H[i8] = 0;
            C11178SEe sEe = this.A0N;
            SparseArray sparseArray = sEe.A01;
            if (sparseArray.size() == 0 || !((C10344Rqh) sparseArray.valueAt(sparseArray.size() - 1)).A00.equals(this.A09)) {
                SJM sjm = this.A09;
                sjm.getClass();
                C13869Tiq tiq = C13869Tiq.A00;
                int i10 = this.A00 + this.A02;
                C10344Rqh rqh = new C10344Rqh(sjm, tiq);
                boolean z = false;
                if (sEe.A00 == -1) {
                    C11366SPh.A02(AnonymousClass7TF.A1Q(sparseArray.size()));
                    sEe.A00 = 0;
                }
                if (sparseArray.size() > 0) {
                    int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
                    if (i10 >= keyAt) {
                        z = true;
                    }
                    C11366SPh.A01(z);
                    if (keyAt == i10) {
                        sEe.A02.accept(sparseArray.valueAt(sparseArray.size() - 1));
                    }
                }
                sparseArray.append(i10, rqh);
            }
            int i11 = this.A02 + 1;
            this.A02 = i11;
            int i12 = this.A01;
            if (i11 == i12) {
                int i13 = i12 + IgNetworkConsentStorage.MAX_ENTRIES;
                long[] jArr = new long[i13];
                long[] jArr2 = new long[i13];
                long[] jArr3 = new long[i13];
                int[] iArr = new int[i13];
                int[] iArr2 = new int[i13];
                S4h[] s4hArr = new S4h[i13];
                int i14 = this.A04;
                int i15 = i12 - i14;
                System.arraycopy(this.A0G, i14, jArr2, 0, i15);
                System.arraycopy(this.A0I, this.A04, jArr3, 0, i15);
                System.arraycopy(this.A0E, this.A04, iArr, 0, i15);
                System.arraycopy(this.A0F, this.A04, iArr2, 0, i15);
                System.arraycopy(this.A0J, this.A04, s4hArr, 0, i15);
                System.arraycopy(this.A0H, this.A04, jArr, 0, i15);
                int i16 = this.A04;
                System.arraycopy(this.A0G, 0, jArr2, i15, i16);
                System.arraycopy(this.A0I, 0, jArr3, i15, i16);
                System.arraycopy(this.A0E, 0, iArr, i15, i16);
                System.arraycopy(this.A0F, 0, iArr2, i15, i16);
                System.arraycopy(this.A0J, 0, s4hArr, i15, i16);
                System.arraycopy(this.A0H, 0, jArr, i15, i16);
                this.A0G = jArr2;
                this.A0I = jArr3;
                this.A0E = iArr;
                this.A0F = iArr2;
                this.A0J = s4hArr;
                this.A0H = jArr;
                this.A04 = 0;
                this.A01 = i13;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a3, code lost:
        if ((r10.A00 & 4) == 4) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a7, code lost:
        if ((r12 & 1) == 0) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a9, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ac, code lost:
        if ((r12 & 4) != 0) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ae, code lost:
        r2 = r9.A0M;
        r1 = r2.A02;
        r0 = r2.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b4, code lost:
        if (r8 == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b6, code lost:
        X.SSD.A01(r0, r10, r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b9, code lost:
        return -4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ba, code lost:
        r2.A02 = X.SSD.A01(r0, r10, r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c1, code lost:
        if (r8 != false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c3, code lost:
        r9.A03++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c9, code lost:
        return -4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00dc, code lost:
        return -3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x002e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(X.C7455QDu r10, X.S02 r11, int r12) {
        /*
            r9 = this;
            r0 = r12 & 2
            r8 = 0
            boolean r7 = X.AnonymousClass7TF.A1P(r0)
            X.RtN r4 = r9.A0O
            r6 = r9
            monitor-enter(r6)
            int r1 = r9.A03     // Catch:{ all -> 0x00de }
            int r0 = r9.A02     // Catch:{ all -> 0x00de }
            if (r1 == r0) goto L_0x0091
            X.SEe r5 = r9.A0N     // Catch:{ all -> 0x00de }
            int r3 = r9.A00     // Catch:{ all -> 0x00de }
            int r3 = r3 + r1
            int r1 = r5.A00     // Catch:{ all -> 0x00de }
            r0 = -1
            if (r1 != r0) goto L_0x001d
            r1 = 0
            goto L_0x002b
        L_0x001d:
            if (r1 <= 0) goto L_0x002e
            android.util.SparseArray r0 = r5.A01     // Catch:{ all -> 0x00de }
            int r0 = r0.keyAt(r1)     // Catch:{ all -> 0x00de }
            if (r3 >= r0) goto L_0x002e
            int r0 = r5.A00     // Catch:{ all -> 0x00de }
            int r1 = r0 + -1
        L_0x002b:
            r5.A00 = r1     // Catch:{ all -> 0x00de }
            goto L_0x001d
        L_0x002e:
            int r2 = r5.A00     // Catch:{ all -> 0x00de }
            android.util.SparseArray r1 = r5.A01     // Catch:{ all -> 0x00de }
            int r0 = r1.size()     // Catch:{ all -> 0x00de }
            int r0 = r0 + -1
            if (r2 >= r0) goto L_0x0049
            int r0 = r2 + 1
            int r0 = r1.keyAt(r0)     // Catch:{ all -> 0x00de }
            if (r3 < r0) goto L_0x0049
            int r0 = r5.A00     // Catch:{ all -> 0x00de }
            int r0 = r0 + 1
            r5.A00 = r0     // Catch:{ all -> 0x00de }
            goto L_0x002e
        L_0x0049:
            int r0 = r5.A00     // Catch:{ all -> 0x00de }
            java.lang.Object r0 = r1.valueAt(r0)     // Catch:{ all -> 0x00de }
            X.Rqh r0 = (X.C10344Rqh) r0     // Catch:{ all -> 0x00de }
            X.SJM r1 = r0.A00     // Catch:{ all -> 0x00de }
            if (r7 != 0) goto L_0x00d4
            X.SJM r0 = r9.A08     // Catch:{ all -> 0x00de }
            if (r1 != r0) goto L_0x00d4
            int r5 = r9.A03     // Catch:{ all -> 0x00de }
            int r2 = r9.A04     // Catch:{ all -> 0x00de }
            int r2 = r2 + r5
            int r0 = r9.A01     // Catch:{ all -> 0x00de }
            if (r2 < r0) goto L_0x0063
            int r2 = r2 - r0
        L_0x0063:
            r3 = 1
            int[] r0 = r9.A0E     // Catch:{ all -> 0x00de }
            r1 = r0[r2]     // Catch:{ all -> 0x00de }
            r10.A00 = r1     // Catch:{ all -> 0x00de }
            int r0 = r9.A02     // Catch:{ all -> 0x00de }
            int r0 = r0 - r3
            if (r5 != r0) goto L_0x0078
            boolean r0 = r9.A0B     // Catch:{ all -> 0x00de }
            if (r0 == 0) goto L_0x0078
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 | r1
            r10.A00 = r0     // Catch:{ all -> 0x00de }
        L_0x0078:
            long[] r0 = r9.A0I     // Catch:{ all -> 0x00de }
            r0 = r0[r2]     // Catch:{ all -> 0x00de }
            r10.A00 = r0     // Catch:{ all -> 0x00de }
            int[] r0 = r9.A0F     // Catch:{ all -> 0x00de }
            r0 = r0[r2]     // Catch:{ all -> 0x00de }
            r4.A00 = r0     // Catch:{ all -> 0x00de }
            long[] r0 = r9.A0G     // Catch:{ all -> 0x00de }
            r0 = r0[r2]     // Catch:{ all -> 0x00de }
            r4.A01 = r0     // Catch:{ all -> 0x00de }
            X.S4h[] r0 = r9.A0J     // Catch:{ all -> 0x00de }
            r0 = r0[r2]     // Catch:{ all -> 0x00de }
            r4.A02 = r0     // Catch:{ all -> 0x00de }
            goto L_0x009c
        L_0x0091:
            boolean r0 = r9.A0B     // Catch:{ all -> 0x00de }
            if (r0 == 0) goto L_0x00ca
            r0 = 4
            r10.A00 = r0     // Catch:{ all -> 0x00de }
            r0 = -9223372036854775808
            r10.A00 = r0     // Catch:{ all -> 0x00de }
        L_0x009c:
            monitor-exit(r6)
            r3 = -4
            r1 = 4
            int r0 = r10.A00
            r0 = r0 & 4
            if (r0 == r1) goto L_0x00b9
            r0 = r12 & 1
            if (r0 == 0) goto L_0x00aa
            r8 = 1
        L_0x00aa:
            r0 = r12 & 4
            if (r0 != 0) goto L_0x00c1
            X.SSD r2 = r9.A0M
            X.RQh r1 = r2.A02
            X.SRd r0 = r2.A04
            if (r8 == 0) goto L_0x00ba
            X.SSD.A01(r0, r10, r1, r4)
        L_0x00b9:
            return r3
        L_0x00ba:
            X.RQh r0 = X.SSD.A01(r0, r10, r1, r4)
            r2.A02 = r0
            goto L_0x00c3
        L_0x00c1:
            if (r8 != 0) goto L_0x00b9
        L_0x00c3:
            int r0 = r9.A03
            int r0 = r0 + 1
            r9.A03 = r0
            return r3
        L_0x00ca:
            X.SJM r1 = r9.A09     // Catch:{ all -> 0x00de }
            if (r1 == 0) goto L_0x00db
            if (r7 != 0) goto L_0x00d4
            X.SJM r0 = r9.A08     // Catch:{ all -> 0x00de }
            if (r1 == r0) goto L_0x00db
        L_0x00d4:
            r9.A08 = r1     // Catch:{ all -> 0x00de }
            r11.A00 = r1     // Catch:{ all -> 0x00de }
            monitor-exit(r6)
            r3 = -5
            return r3
        L_0x00db:
            monitor-exit(r6)
            r3 = -3
            return r3
        L_0x00de:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11717SfE.A00(X.QDu, X.S02, int):int");
    }

    public final void A01(boolean z) {
        SparseArray sparseArray;
        SSD ssd = this.A0M;
        C9133RQh rQh = ssd.A01;
        if (rQh.A03 != null) {
            C9133RQh rQh2 = rQh;
            C11677Sea sea = (C11677Sea) ssd.A05;
            synchronized (sea) {
                do {
                    C10149RnQ[] rnQArr = sea.A02;
                    int i = sea.A01;
                    sea.A01 = i + 1;
                    C10149RnQ rnQ = rQh2.A03;
                    rnQ.getClass();
                    rnQArr[i] = rnQ;
                    sea.A00--;
                    rQh2 = rQh2.A02;
                    if (rQh2 == null || rQh2.A03 == null) {
                        sea.notifyAll();
                    }
                    C10149RnQ[] rnQArr2 = sea.A02;
                    int i2 = sea.A01;
                    sea.A01 = i2 + 1;
                    C10149RnQ rnQ2 = rQh2.A03;
                    rnQ2.getClass();
                    rnQArr2[i2] = rnQ2;
                    sea.A00--;
                    rQh2 = rQh2.A02;
                    break;
                } while (rQh2.A03 == null);
                sea.notifyAll();
            }
            rQh.A03 = null;
            rQh.A02 = null;
        }
        C9133RQh rQh3 = ssd.A01;
        C11366SPh.A02(DbW.A1a(rQh3.A03));
        rQh3.A01 = 0;
        rQh3.A00 = 65536;
        ssd.A02 = rQh3;
        ssd.A03 = rQh3;
        ssd.A00 = 0;
        ssd.A05.FI0();
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A0L = true;
        this.A07 = Long.MIN_VALUE;
        this.A05 = Long.MIN_VALUE;
        this.A06 = Long.MIN_VALUE;
        this.A0B = false;
        C11178SEe sEe = this.A0N;
        int i3 = 0;
        while (true) {
            sparseArray = sEe.A01;
            if (i3 >= sparseArray.size()) {
                break;
            }
            sEe.A02.accept(sparseArray.valueAt(i3));
            i3++;
        }
        sEe.A00 = -1;
        sparseArray.clear();
        if (z) {
            this.A0K = null;
            this.A09 = null;
            this.A0D = true;
            this.A0A = true;
        }
    }

    public final void EJg(C11389SRd sRd, int i, int i2) {
        SSD ssd = this.A0M;
        while (i > 0) {
            int A002 = SSD.A00(ssd, i);
            C9133RQh rQh = ssd.A03;
            sRd.A0R(rQh.A03.A00, (int) (ssd.A00 - rQh.A01), A002);
            i -= A002;
            long j = ssd.A00 + ((long) A002);
            ssd.A00 = j;
            C9133RQh rQh2 = ssd.A03;
            if (j == rQh2.A00) {
                ssd.A03 = rQh2.A02;
            }
        }
    }

    public final int EJk(C13506TbX tbX, int i, int i2, boolean z) {
        SSD ssd = this.A0M;
        int A002 = SSD.A00(ssd, i);
        C9133RQh rQh = ssd.A03;
        int read = tbX.read(rQh.A03.A00, (int) (ssd.A00 - rQh.A01), A002);
        if (read != -1) {
            long j = ssd.A00 + ((long) read);
            ssd.A00 = j;
            C9133RQh rQh2 = ssd.A03;
            if (j != rQh2.A00) {
                return read;
            }
            ssd.A03 = rQh2.A02;
            return read;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.RtN, java.lang.Object] */
    public C11717SfE(C13509Tba tba) {
        this.A0M = new SSD(tba);
    }
}
