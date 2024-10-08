package X;

import com.facebook.blescan.BleScanOperation;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.6UF  reason: invalid class name */
public final class AnonymousClass6UF extends C3722490b {
    public int A00 = 0;
    public Throwable A01;
    public Throwable A02;
    public Throwable A03;
    public BleScanOperation A04;
    public AnonymousClass6UG A05;
    public QLS A06;
    public final O5V A07;
    public final C276264sw A08;
    public final ScheduledExecutorService A09;
    public final AnonymousClass0eK A0A;
    public final AnonymousClass0eK A0B;
    public final AnonymousClass0eK A0C;

    public final synchronized void A03() {
        AnonymousClass6UG r0 = this.A05;
        if (r0 != null && !r0.isDone()) {
            this.A05.cancel(true);
        }
        QLS qls = this.A06;
        if (qls != null && !qls.isDone()) {
            this.A06.cancel(true);
        }
        BleScanOperation bleScanOperation = this.A04;
        if (bleScanOperation != null && !bleScanOperation.isDone()) {
            this.A04.cancel(true);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:98|(4:99|100|101|102)|106|107) */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x003b, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:106:0x01ef */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass6UF r32, X.C11202SFc r33, java.lang.Object r34, java.lang.Object r35, java.lang.Object r36, java.lang.String r37) {
        /*
            r6 = r33
            r4 = r36
            r0 = r35
            r3 = r34
            boolean r2 = r6.A05
            r1 = 3
            if (r2 == 0) goto L_0x000e
            r1 = 4
        L_0x000e:
            r5 = r1 | 3
            r1 = r32
            int r2 = r1.A00
            if (r2 != r5) goto L_0x0325
            X.6UG r2 = r1.A05
            if (r2 != 0) goto L_0x001b
            r3 = 0
        L_0x001b:
            boolean r2 = r3 instanceof X.C276164sm
            r7 = 0
            if (r2 == 0) goto L_0x0172
            X.4sm r3 = (X.C276164sm) r3
            r1.A02 = r7
        L_0x0024:
            boolean r15 = r0 instanceof java.util.List
            if (r15 == 0) goto L_0x016b
            X.4ss r2 = r6.A02
            java.util.List r0 = (java.util.List) r0
            if (r2 == 0) goto L_0x003b
            r13 = -85
            r12 = 10
            int r11 = r2.A00
            if (r0 != 0) goto L_0x0131
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x003b:
            r1.A03 = r7
        L_0x003d:
            X.4sw r14 = r1.A08
            boolean r2 = X.C276264sw.A00(r14)
            r18 = 0
            if (r2 == 0) goto L_0x00b8
            X.4su r5 = r14.A04
            java.lang.String r2 = "android.permission.ACCESS_WIFI_STATE"
            android.content.Context r11 = r5.A00
            int r2 = r11.checkCallingOrSelfPermission(r2)
            if (r2 != 0) goto L_0x00b8
            boolean r2 = X.C276244su.A00(r5)
            if (r2 == 0) goto L_0x00b8
            android.content.Context r10 = r14.A01
            java.lang.String r2 = "wifi"
            java.lang.Object r2 = r10.getSystemService(r2)
            android.net.wifi.WifiManager r2 = (android.net.wifi.WifiManager) r2
            if (r2 == 0) goto L_0x00b8
            android.net.wifi.WifiInfo r16 = X.AnonymousClass0fl.A00(r2)
            if (r16 == 0) goto L_0x00b8
            java.lang.String r8 = r16.getSSID()
            if (r8 == 0) goto L_0x0094
            java.text.BreakIterator r2 = java.text.BreakIterator.getCharacterInstance()
            r2.setText(r8)
            int r13 = r2.last()
            r2 = 2
            if (r13 <= r2) goto L_0x0094
            r2 = 0
            int r12 = r8.codePointAt(r2)
            r9 = 1
            int r13 = r13 - r9
            int r5 = r8.codePointAt(r13)
            r2 = 34
            if (r12 != r2) goto L_0x0094
            if (r5 != r2) goto L_0x0094
            java.lang.String r8 = r8.substring(r9, r13)
        L_0x0094:
            java.lang.String r2 = r16.getBSSID()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00b8
            android.net.wifi.SupplicantState r5 = r16.getSupplicantState()
            android.net.wifi.SupplicantState r2 = android.net.wifi.SupplicantState.COMPLETED
            if (r5 != r2) goto L_0x00b8
            if (r8 == 0) goto L_0x00ce
            java.lang.String r2 = "_nomap"
            boolean r2 = r8.endsWith(r2)
            if (r2 != 0) goto L_0x00b8
            java.lang.String r2 = "_optout"
            boolean r2 = r8.contains(r2)
            if (r2 == 0) goto L_0x00ce
        L_0x00b8:
            boolean r9 = r4 instanceof java.util.List
            if (r9 == 0) goto L_0x00c8
            java.util.List r4 = (java.util.List) r4
            r1.A01 = r7
        L_0x00c0:
            boolean r2 = r6.A06
            if (r2 == 0) goto L_0x02e2
            X.O5V r5 = r1.A07
            goto L_0x0179
        L_0x00c8:
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r1.A01 = r4
            r4 = r7
            goto L_0x00c0
        L_0x00ce:
            X.0JP r2 = r14.A02
            long r24 = r2.now()
            r19 = 0
            r2 = 75
            java.lang.String r2 = X.Pxd.A00(r2)     // Catch:{ Exception -> 0x0111 }
            int r2 = r11.checkCallingOrSelfPermission(r2)     // Catch:{ Exception -> 0x0111 }
            if (r2 != 0) goto L_0x0119
            java.lang.String r2 = "connectivity"
            java.lang.Object r12 = r10.getSystemService(r2)     // Catch:{ Exception -> 0x0111 }
            android.net.ConnectivityManager r12 = (android.net.ConnectivityManager) r12     // Catch:{ Exception -> 0x0111 }
            if (r12 == 0) goto L_0x0119
            android.net.Network[] r11 = r12.getAllNetworks()     // Catch:{ Exception -> 0x0111 }
            int r10 = r11.length     // Catch:{ Exception -> 0x0111 }
            r9 = 0
        L_0x00f2:
            if (r9 >= r10) goto L_0x0119
            r2 = r11[r9]     // Catch:{ Exception -> 0x0111 }
            android.net.NetworkCapabilities r5 = r12.getNetworkCapabilities(r2)     // Catch:{ Exception -> 0x0111 }
            if (r5 == 0) goto L_0x010e
            r2 = 1
            boolean r2 = r5.hasTransport(r2)     // Catch:{ Exception -> 0x0111 }
            if (r2 == 0) goto L_0x010e
            r2 = 17
            boolean r2 = r5.hasCapability(r2)     // Catch:{ Exception -> 0x0111 }
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x0111 }
            goto L_0x0119
        L_0x010e:
            int r9 = r9 + 1
            goto L_0x00f2
        L_0x0111:
            r9 = move-exception
            java.lang.String r5 = "WifiScan"
            java.lang.String r2 = "Cannot check if the connected wifi has the Captive Portal capability"
            X.0KC.A0F(r5, r2, r9)
        L_0x0119:
            java.lang.String r21 = r16.getBSSID()
            int r23 = r16.getRssi()
            int r2 = r16.getFrequency()
            java.lang.Integer r20 = java.lang.Integer.valueOf(r2)
            X.SQr r18 = new X.SQr
            r22 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24)
            goto L_0x00b8
        L_0x0131:
            int r10 = r0.size()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r0)
            java.util.Comparator r0 = X.C9958RkD.A00
            java.util.Collections.sort(r9, r0)
            int r0 = r9.size()
            int r2 = java.lang.Math.min(r11, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r8 = 0
        L_0x014d:
            if (r8 >= r10) goto L_0x003b
            int r2 = r0.size()
            if (r2 >= r11) goto L_0x003b
            java.lang.Object r5 = r9.get(r8)
            X.SQr r5 = (X.C11379SQr) r5
            int r2 = r5.A02
            if (r2 >= r13) goto L_0x0165
            int r2 = r0.size()
            if (r2 >= r12) goto L_0x0168
        L_0x0165:
            r0.add(r5)
        L_0x0168:
            int r8 = r8 + 1
            goto L_0x014d
        L_0x016b:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1.A03 = r0
            r0 = r7
            goto L_0x003d
        L_0x0172:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r1.A02 = r3
            r3 = r7
            goto L_0x0024
        L_0x0179:
            X.1DF r8 = r5.A00     // Catch:{ SecurityException -> 0x020a }
            java.lang.String r2 = "CellInfoUtil"
            android.telephony.CellLocation r2 = r8.A04(r2)     // Catch:{ SecurityException -> 0x020a }
            android.telephony.TelephonyManager r10 = r8.A00     // Catch:{ SecurityException -> 0x020a }
            int r12 = r10.getPhoneType()     // Catch:{ SecurityException -> 0x020a }
            if (r12 == 0) goto L_0x019b
            r11 = 1
            if (r12 == r11) goto L_0x0198
            r11 = 2
            if (r12 == r11) goto L_0x0195
            r11 = 3
            if (r12 == r11) goto L_0x019e
            java.lang.String r21 = "UNKNOWN"
            goto L_0x01a0
        L_0x0195:
            java.lang.String r21 = "CDMA"
            goto L_0x01a0
        L_0x0198:
            java.lang.String r21 = "GSM"
            goto L_0x01a0
        L_0x019b:
            java.lang.String r21 = "NONE"
            goto L_0x01a0
        L_0x019e:
            java.lang.String r21 = "SIP"
        L_0x01a0:
            java.lang.String r22 = r10.getSimCountryIso()     // Catch:{ SecurityException -> 0x020a }
            java.lang.String r23 = r10.getSimOperator()     // Catch:{ SecurityException -> 0x020a }
            java.lang.String r24 = r10.getSimOperatorName()     // Catch:{ SecurityException -> 0x020a }
            boolean r29 = r10.hasIccCard()     // Catch:{ SecurityException -> 0x020a }
            int r8 = r8.A03()     // Catch:{ SecurityException -> 0x020a }
            java.lang.String r25 = X.AnonymousClass55C.A00(r8)     // Catch:{ SecurityException -> 0x020a }
            java.lang.String r26 = r10.getNetworkCountryIso()     // Catch:{ SecurityException -> 0x020a }
            java.lang.String r27 = r10.getNetworkOperator()     // Catch:{ SecurityException -> 0x020a }
            java.lang.String r28 = r10.getNetworkOperatorName()     // Catch:{ SecurityException -> 0x020a }
            boolean r30 = r10.isNetworkRoaming()     // Catch:{ SecurityException -> 0x020a }
            boolean r8 = r2 instanceof android.telephony.cdma.CdmaCellLocation     // Catch:{ SecurityException -> 0x020a }
            if (r8 == 0) goto L_0x01ec
            android.telephony.cdma.CdmaCellLocation r2 = (android.telephony.cdma.CdmaCellLocation) r2     // Catch:{ SecurityException -> 0x020a }
            r33 = 0
            int r8 = r2.getBaseStationLatitude()     // Catch:{ IllegalArgumentException -> 0x01e9 }
            double r10 = X.XnC.A00(r8)     // Catch:{ IllegalArgumentException -> 0x01e9 }
            java.lang.Double r32 = java.lang.Double.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x01e9 }
            int r8 = r2.getBaseStationLongitude()     // Catch:{ IllegalArgumentException -> 0x01ef }
            double r10 = X.XnC.A00(r8)     // Catch:{ IllegalArgumentException -> 0x01ef }
            java.lang.Double r33 = java.lang.Double.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x01ef }
            goto L_0x01ef
        L_0x01e9:
            r32 = r7
            goto L_0x01ef
        L_0x01ec:
            r20 = r7
            goto L_0x0202
        L_0x01ef:
            int r34 = r2.getNetworkId()     // Catch:{ SecurityException -> 0x020a }
            int r35 = r2.getSystemId()     // Catch:{ SecurityException -> 0x020a }
            int r36 = r2.getBaseStationId()     // Catch:{ SecurityException -> 0x020a }
            X.XnC r20 = new X.XnC     // Catch:{ SecurityException -> 0x020a }
            r31 = r20
            r31.<init>(r32, r33, r34, r35, r36)     // Catch:{ SecurityException -> 0x020a }
        L_0x0202:
            X.XbI r16 = new X.XbI     // Catch:{ SecurityException -> 0x020a }
            r19 = r16
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ SecurityException -> 0x020a }
            goto L_0x020c
        L_0x020a:
            r16 = r7
        L_0x020c:
            X.1DF r5 = r5.A00     // Catch:{ Exception | SecurityException -> 0x02e7 }
            java.lang.String r2 = "CellInfoUtil"
            java.util.List r5 = r5.A06(r2)     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r5 == 0) goto L_0x02e6
            int r2 = r5.size()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Exception | SecurityException -> 0x02e7 }
            r8.<init>(r2)     // Catch:{ Exception | SecurityException -> 0x02e7 }
            java.util.Iterator r12 = r5.iterator()     // Catch:{ Exception | SecurityException -> 0x02e7 }
        L_0x0223:
            boolean r2 = r12.hasNext()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r2 == 0) goto L_0x02e5
            java.lang.Object r5 = r12.next()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            android.telephony.CellInfo r5 = (android.telephony.CellInfo) r5     // Catch:{ Exception | SecurityException -> 0x02e7 }
            boolean r2 = r5 instanceof android.telephony.CellInfoCdma     // Catch:{ Exception | SecurityException -> 0x02e7 }
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == 0) goto L_0x0255
            r2 = r5
            android.telephony.CellInfoCdma r2 = (android.telephony.CellInfoCdma) r2     // Catch:{ Exception | SecurityException -> 0x02e7 }
            android.telephony.CellIdentityCdma r11 = r2.getCellIdentity()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r11 == 0) goto L_0x0223
            int r2 = r11.getBasestationId()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r2 == r10) goto L_0x0223
            int r2 = r11.getSystemId()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r2 == r10) goto L_0x0223
            int r2 = r11.getNetworkId()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r2 == r10) goto L_0x0223
        L_0x0251:
            r8.add(r5)     // Catch:{ Exception | SecurityException -> 0x02e7 }
            goto L_0x0223
        L_0x0255:
            boolean r2 = r5 instanceof android.telephony.CellInfoGsm     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r2 == 0) goto L_0x0285
            r2 = r5
            android.telephony.CellInfoGsm r2 = (android.telephony.CellInfoGsm) r2     // Catch:{ Exception | SecurityException -> 0x02e7 }
            android.telephony.CellIdentityGsm r11 = r2.getCellIdentity()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r11 == 0) goto L_0x0223
            int r2 = r11.getCid()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r2 == r10) goto L_0x0223
            int r2 = r11.getLac()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r2 == r10) goto L_0x0223
            int r2 = r11.getMcc()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r2 == r10) goto L_0x0223
            int r2 = r11.getMnc()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r2 == r10) goto L_0x0223
            int r2 = r11.getMcc()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r2 != 0) goto L_0x0251
            int r2 = r11.getMnc()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            goto L_0x02de
        L_0x0285:
            boolean r2 = r5 instanceof android.telephony.CellInfoLte     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r2 == 0) goto L_0x02af
            r2 = r5
            android.telephony.CellInfoLte r2 = (android.telephony.CellInfoLte) r2     // Catch:{ Exception | SecurityException -> 0x02e7 }
            android.telephony.CellIdentityLte r11 = r2.getCellIdentity()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r11 == 0) goto L_0x0223
            int r2 = r11.getCi()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r2 == r10) goto L_0x0223
            int r2 = r11.getMcc()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r2 == r10) goto L_0x0223
            int r2 = r11.getMnc()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r2 == r10) goto L_0x0223
            int r2 = r11.getMcc()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r2 != 0) goto L_0x0251
            int r2 = r11.getMnc()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            goto L_0x02de
        L_0x02af:
            boolean r2 = r5 instanceof android.telephony.CellInfoWcdma     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r2 == 0) goto L_0x0223
            r2 = r5
            android.telephony.CellInfoWcdma r2 = (android.telephony.CellInfoWcdma) r2     // Catch:{ Exception | SecurityException -> 0x02e7 }
            android.telephony.CellIdentityWcdma r11 = r2.getCellIdentity()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r11 == 0) goto L_0x0223
            int r2 = r11.getCid()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r2 == r10) goto L_0x0223
            int r2 = r11.getLac()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r2 == r10) goto L_0x0223
            int r2 = r11.getMcc()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r2 == r10) goto L_0x0223
            int r2 = r11.getMnc()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r2 == r10) goto L_0x0223
            int r2 = r11.getMcc()     // Catch:{ Exception | SecurityException -> 0x02e7 }
            if (r2 != 0) goto L_0x0251
            int r2 = r11.getMnc()     // Catch:{ Exception | SecurityException -> 0x02e7 }
        L_0x02de:
            if (r2 == 0) goto L_0x0223
            goto L_0x0251
        L_0x02e2:
            r16 = r7
            goto L_0x02e7
        L_0x02e5:
            r5 = r8
        L_0x02e6:
            r7 = r5
        L_0x02e7:
            r20 = 0
            java.lang.String r5 = ":"
            java.lang.String r2 = "LocationPackageOperation"
            r8 = r37
            java.lang.String r29 = X.002.A0g(r8, r5, r2)
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r15)
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r9)
            java.lang.String r2 = r6.A04
            X.SG0 r15 = new X.SG0
            r21 = r20
            r23 = r20
            r24 = r20
            r25 = r20
            r26 = r20
            r27 = r2
            r28 = r20
            r30 = r20
            r31 = r20
            r32 = r20
            r33 = r4
            r34 = r7
            r35 = r20
            r36 = r20
            r37 = r0
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r1.A01(r15)
        L_0x0325:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6UF.A00(X.6UF, X.SFc, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object, X.Y1Q] */
    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.Object, X.Y1Q] */
    /* JADX WARNING: type inference failed for: r12v0, types: [java.lang.Object, X.Y1Q] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void A04(X.C11202SFc r36, java.lang.String r37) {
        /*
            r35 = this;
            r9 = r35
            monitor-enter(r9)
            X.Y1Q r19 = new X.Y1Q     // Catch:{ all -> 0x03b3 }
            r19.<init>()     // Catch:{ all -> 0x03b3 }
            X.Y1Q r18 = new X.Y1Q     // Catch:{ all -> 0x03b3 }
            r18.<init>()     // Catch:{ all -> 0x03b3 }
            X.Y1Q r12 = new X.Y1Q     // Catch:{ all -> 0x03b3 }
            r12.<init>()     // Catch:{ all -> 0x03b3 }
            X.0eK r0 = r9.A0B     // Catch:{ all -> 0x03b3 }
            java.lang.Object r10 = r0.get()     // Catch:{ all -> 0x03b3 }
            X.6UG r10 = (X.AnonymousClass6UG) r10     // Catch:{ all -> 0x03b3 }
            r8 = r36
            X.Ryb r3 = r8.A01     // Catch:{ all -> 0x03b3 }
            monitor-enter(r10)     // Catch:{ all -> 0x03b3 }
            boolean r2 = r10.A03     // Catch:{ all -> 0x03ad }
            r1 = 0
            r7 = 1
            r0 = 0
            if (r2 != 0) goto L_0x0027
            r0 = 1
        L_0x0027:
            java.lang.String r6 = "already running"
            X.17k.A0H(r0, r6)     // Catch:{ all -> 0x03ad }
            boolean r0 = r10.isDone()     // Catch:{ all -> 0x03ad }
            if (r0 != 0) goto L_0x0033
            r1 = 1
        L_0x0033:
            java.lang.String r5 = "already done"
            X.17k.A0H(r1, r5)     // Catch:{ all -> 0x03ad }
            r3.getClass()     // Catch:{ all -> 0x03ad }
            r10.A00 = r3     // Catch:{ all -> 0x03ad }
            X.4hc r1 = r10.A06     // Catch:{ all -> 0x03ad }
            java.lang.Integer r3 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x03ad }
            r0 = 0
            java.lang.Integer r0 = X.C270924hc.A00(r1, r3, r0, r0, r7)     // Catch:{ all -> 0x03ad }
            java.lang.Integer r4 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x03ad }
            r34 = r37
            if (r0 == r4) goto L_0x0058
            java.lang.Integer r1 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x03ad }
            X.Q0M r0 = new X.Q0M     // Catch:{ all -> 0x03ad }
            r0.<init>(r1)     // Catch:{ all -> 0x03ad }
            r10.A02(r0)     // Catch:{ all -> 0x03ad }
            goto L_0x00d9
        L_0x0058:
            X.4hg r13 = r10.A07     // Catch:{ all -> 0x03ad }
            X.Ryb r2 = r10.A00     // Catch:{ all -> 0x03ad }
            long r0 = r2.A02     // Catch:{ all -> 0x03ad }
            float r11 = r2.A00     // Catch:{ all -> 0x03ad }
            r2 = 0
            r20 = r13
            r21 = r34
            r22 = r11
            r23 = r0
            r25 = r2
            X.4sm r0 = r20.A01(r21, r22, r23, r25)     // Catch:{ all -> 0x03ad }
            if (r0 == 0) goto L_0x0077
            r10.A01 = r0     // Catch:{ all -> 0x03ad }
            r10.A01(r0)     // Catch:{ all -> 0x03ad }
            goto L_0x00d9
        L_0x0077:
            r10.A03 = r7     // Catch:{ all -> 0x03ad }
            X.60p r11 = r10.A08     // Catch:{ all -> 0x03ad }
            java.util.concurrent.ScheduledExecutorService r15 = r10.A09     // Catch:{ all -> 0x03ad }
            monitor-enter(r11)     // Catch:{ all -> 0x03ad }
            X.0qQ.A0B(r15, r2)     // Catch:{ all -> 0x03aa }
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A0F     // Catch:{ all -> 0x03aa }
            boolean r0 = r0.get()     // Catch:{ all -> 0x03aa }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x03a2
            r11.A05 = r15     // Catch:{ all -> 0x03aa }
            monitor-exit(r11)     // Catch:{ all -> 0x03ad }
            X.TBW r14 = new X.TBW     // Catch:{ all -> 0x03ad }
            r14.<init>(r10)     // Catch:{ all -> 0x03ad }
            X.Ryb r0 = r10.A00     // Catch:{ all -> 0x03ad }
            long r0 = r0.A05     // Catch:{ all -> 0x03ad }
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x03ad }
            java.util.concurrent.ScheduledFuture r0 = r15.schedule(r14, r0, r13)     // Catch:{ all -> 0x03ad }
            r10.A02 = r0     // Catch:{ all -> 0x03ad }
            X.Ryb r13 = r10.A00     // Catch:{ all -> 0x03ad }
            java.lang.Integer r0 = r13.A07     // Catch:{ all -> 0x03ad }
            r22 = r0
            long r0 = r13.A05     // Catch:{ all -> 0x03ad }
            java.lang.Long r24 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x03ad }
            java.lang.Long r0 = r13.A08     // Catch:{ all -> 0x03ad }
            r23 = r0
            java.lang.Float r0 = r13.A06     // Catch:{ all -> 0x03ad }
            r17 = r0
            long r14 = r13.A04     // Catch:{ all -> 0x03ad }
            long r0 = r13.A03     // Catch:{ all -> 0x03ad }
            float r13 = r13.A01     // Catch:{ all -> 0x03ad }
            r16 = r13
            r25 = 0
            X.9QC r13 = new X.9QC     // Catch:{ all -> 0x03ad }
            r26 = r16
            r27 = r0
            r29 = r14
            r31 = r2
            r32 = r2
            r33 = r2
            r20 = r13
            r21 = r17
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r29, r31, r32, r33)     // Catch:{ all -> 0x03ad }
            X.TfW r1 = r10.A05     // Catch:{ all -> 0x03ad }
            r0 = r34
            r11.A07(r1, r13, r0)     // Catch:{ all -> 0x03ad }
        L_0x00d9:
            monitor-exit(r10)     // Catch:{ all -> 0x03b3 }
            X.Y3c r0 = new X.Y3c     // Catch:{ all -> 0x03b3 }
            r20 = r0
            r21 = r10
            r22 = r9
            r23 = r8
            r24 = r34
            r25 = r19
            r26 = r18
            r27 = r12
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x03b3 }
            java.util.concurrent.ScheduledExecutorService r11 = r9.A09     // Catch:{ all -> 0x03b3 }
            r10.addListener(r0, r11)     // Catch:{ all -> 0x03b3 }
            r9.A05 = r10     // Catch:{ all -> 0x03b3 }
            X.0eK r0 = r9.A0C     // Catch:{ all -> 0x03b3 }
            java.lang.Object r10 = r0.get()     // Catch:{ all -> 0x03b3 }
            X.QLS r10 = (X.QLS) r10     // Catch:{ all -> 0x03b3 }
            X.S1x r1 = r8.A03     // Catch:{ all -> 0x03b3 }
            monitor-enter(r10)     // Catch:{ all -> 0x03b3 }
            r1.getClass()     // Catch:{ RKG -> 0x022b }
            boolean r0 = r10.A04     // Catch:{ RKG -> 0x022b }
            r0 = r0 ^ 1
            X.17k.A0H(r0, r6)     // Catch:{ RKG -> 0x022b }
            boolean r0 = r10.isDone()     // Catch:{ RKG -> 0x022b }
            r0 = r0 ^ 1
            X.17k.A0H(r0, r5)     // Catch:{ RKG -> 0x022b }
            r10.A04 = r7     // Catch:{ RKG -> 0x022b }
            r10.A02 = r1     // Catch:{ RKG -> 0x022b }
            X.4su r2 = r10.A08     // Catch:{ RKG -> 0x022b }
            android.content.Context r1 = r2.A00     // Catch:{ Exception -> 0x0218 }
            android.content.pm.PackageManager r13 = r1.getPackageManager()     // Catch:{ Exception -> 0x0218 }
            java.lang.String r0 = "android.hardware.wifi"
            boolean r0 = r13.hasSystemFeature(r0)     // Catch:{ Exception -> 0x0218 }
            if (r0 == 0) goto L_0x0218
            java.lang.String r0 = "android.permission.ACCESS_WIFI_STATE"
            int r0 = r1.checkCallingOrSelfPermission(r0)     // Catch:{ RKG -> 0x022b }
            if (r0 != 0) goto L_0x0212
            boolean r0 = X.C276244su.A00(r2)     // Catch:{ RKG -> 0x022b }
            if (r0 == 0) goto L_0x0212
            java.lang.String r0 = "android.permission.CHANGE_WIFI_STATE"
            int r0 = r1.checkCallingOrSelfPermission(r0)     // Catch:{ RKG -> 0x022b }
            if (r0 != 0) goto L_0x0212
            java.lang.String r13 = "wifi"
            java.lang.Object r0 = r1.getSystemService(r13)     // Catch:{ SecurityException -> 0x014c }
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0     // Catch:{ SecurityException -> 0x014c }
            boolean r0 = r0.isWifiEnabled()     // Catch:{ SecurityException -> 0x014c }
            if (r0 != 0) goto L_0x015a
        L_0x014c:
            java.lang.String r13 = "wifi"
            java.lang.Object r0 = r1.getSystemService(r13)     // Catch:{ SecurityException -> 0x020a }
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0     // Catch:{ SecurityException -> 0x020a }
            boolean r0 = r0.isScanAlwaysAvailable()     // Catch:{ SecurityException -> 0x020a }
            if (r0 == 0) goto L_0x020a
        L_0x015a:
            X.S1x r0 = r10.A02     // Catch:{ RKG -> 0x022b }
            boolean r0 = r0.A00     // Catch:{ RKG -> 0x022b }
            r16 = 0
            if (r0 != 0) goto L_0x0192
            X.4sw r1 = r10.A01     // Catch:{ RKG -> 0x022b }
            r0 = 0
            java.util.ArrayList r15 = r1.A01(r0)     // Catch:{ RKG -> 0x022b }
            X.4sv r0 = r10.A09     // Catch:{ RKG -> 0x022b }
            r0.A00(r15)     // Catch:{ RKG -> 0x022b }
            X.S1x r0 = r10.A02     // Catch:{ RKG -> 0x022b }
            long r2 = r0.A01     // Catch:{ RKG -> 0x022b }
            X.0JR r14 = r10.A07     // Catch:{ RKG -> 0x022b }
            long r0 = r14.now()     // Catch:{ RKG -> 0x022b }
            java.util.ArrayList r1 = X.C9617Rdv.A00(r15, r2, r0)     // Catch:{ RKG -> 0x022b }
            if (r1 == 0) goto L_0x0192
            boolean r0 = r1.isEmpty()     // Catch:{ RKG -> 0x022b }
            if (r0 != 0) goto L_0x0192
            X.0JP r0 = r10.A06     // Catch:{ RKG -> 0x022b }
            java.util.ArrayList r0 = X.C11379SQr.A01(r0, r14, r1)     // Catch:{ RKG -> 0x022b }
            X.QLS.A00(r10)     // Catch:{ RKG -> 0x022b }
            r10.A01(r0)     // Catch:{ RKG -> 0x022b }
            goto L_0x0232
        L_0x0192:
            X.S1x r0 = r10.A02     // Catch:{ RKG -> 0x022b }
            long r0 = r0.A02     // Catch:{ RKG -> 0x022b }
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 == 0) goto L_0x0204
            java.util.concurrent.ScheduledExecutorService r14 = r10.A0A     // Catch:{ RKG -> 0x022b }
            X.TD6 r3 = new X.TD6     // Catch:{ RKG -> 0x022b }
            r3.<init>(r10)     // Catch:{ RKG -> 0x022b }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ RKG -> 0x022b }
            java.util.concurrent.ScheduledFuture r0 = r14.schedule(r3, r0, r2)     // Catch:{ RKG -> 0x022b }
            r10.A03 = r0     // Catch:{ RKG -> 0x022b }
            X.Q5z r3 = new X.Q5z     // Catch:{ RKG -> 0x022b }
            r3.<init>(r10)     // Catch:{ RKG -> 0x022b }
            r10.A00 = r3     // Catch:{ RKG -> 0x022b }
            android.content.Context r2 = r10.A05     // Catch:{ RKG -> 0x022b }
            java.lang.String r1 = "android.net.wifi.SCAN_RESULTS"
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch:{ RKG -> 0x022b }
            r0.<init>(r1)     // Catch:{ RKG -> 0x022b }
            X.0DH.A00(r3, r2, r0)     // Catch:{ RKG -> 0x022b }
            X.4sw r1 = r10.A01     // Catch:{ RKG -> 0x022b }
            boolean r0 = X.C276264sw.A00(r1)     // Catch:{ RKG -> 0x022b }
            if (r0 == 0) goto L_0x01fc
            boolean r0 = r1.A02()     // Catch:{ RKG -> 0x022b }
            if (r0 == 0) goto L_0x01fc
            android.content.Context r0 = r1.A01     // Catch:{ RKG -> 0x022b }
            java.lang.Object r1 = r0.getSystemService(r13)     // Catch:{ RKG -> 0x022b }
            android.net.wifi.WifiManager r1 = (android.net.wifi.WifiManager) r1     // Catch:{ RKG -> 0x022b }
            X.0fl r0 = X.AnonymousClass0fl.$redex_init_class     // Catch:{ RKG -> 0x022b }
            boolean r0 = X.AnonymousClass0T2.A01()     // Catch:{ RKG -> 0x022b }
            if (r0 == 0) goto L_0x01f5
            java.util.concurrent.locks.ReadWriteLock r2 = X.AnonymousClass0T2.A01     // Catch:{ all -> 0x0220 }
            java.util.concurrent.locks.Lock r0 = r2.readLock()     // Catch:{ all -> 0x0220 }
            r0.lock()     // Catch:{ all -> 0x0220 }
            X.0T1 r0 = X.AnonymousClass0T2.A00     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x01ec
            boolean r1 = r0.Dma(r1)     // Catch:{ all -> 0x0220 }
            goto L_0x01ed
        L_0x01ec:
            r1 = 0
        L_0x01ed:
            java.util.concurrent.locks.Lock r0 = r2.readLock()     // Catch:{ RKG -> 0x022b }
            r0.unlock()     // Catch:{ RKG -> 0x022b }
            goto L_0x01f9
        L_0x01f5:
            boolean r1 = r1.startScan()     // Catch:{ RKG -> 0x022b }
        L_0x01f9:
            if (r1 == 0) goto L_0x01fc
            goto L_0x0232
        L_0x01fc:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ RKG -> 0x022b }
            X.RKG r1 = new X.RKG     // Catch:{ RKG -> 0x022b }
            r1.<init>(r0)     // Catch:{ RKG -> 0x022b }
            goto L_0x022a
        L_0x0204:
            X.RKG r1 = new X.RKG     // Catch:{ RKG -> 0x022b }
            r1.<init>(r4)     // Catch:{ RKG -> 0x022b }
            goto L_0x022a
        L_0x020a:
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ RKG -> 0x022b }
            X.RKG r1 = new X.RKG     // Catch:{ RKG -> 0x022b }
            r1.<init>(r0)     // Catch:{ RKG -> 0x022b }
            goto L_0x022a
        L_0x0212:
            X.RKG r1 = new X.RKG     // Catch:{ RKG -> 0x022b }
            r1.<init>(r3)     // Catch:{ RKG -> 0x022b }
            goto L_0x022a
        L_0x0218:
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ RKG -> 0x022b }
            X.RKG r1 = new X.RKG     // Catch:{ RKG -> 0x022b }
            r1.<init>(r0)     // Catch:{ RKG -> 0x022b }
            goto L_0x022a
        L_0x0220:
            r1 = move-exception
            java.util.concurrent.locks.ReadWriteLock r0 = X.AnonymousClass0T2.A01     // Catch:{ RKG -> 0x022b }
            java.util.concurrent.locks.Lock r0 = r0.readLock()     // Catch:{ RKG -> 0x022b }
            r0.unlock()     // Catch:{ RKG -> 0x022b }
        L_0x022a:
            throw r1     // Catch:{ RKG -> 0x022b }
        L_0x022b:
            r0 = move-exception
            X.QLS.A00(r10)     // Catch:{ all -> 0x03ad }
            r10.A02(r0)     // Catch:{ all -> 0x03ad }
        L_0x0232:
            monitor-exit(r10)     // Catch:{ all -> 0x03b3 }
            X.Y3d r0 = new X.Y3d     // Catch:{ all -> 0x03b3 }
            r13 = r0
            r14 = r9
            r15 = r8
            r16 = r10
            r17 = r34
            r20 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x03b3 }
            r10.addListener(r0, r11)     // Catch:{ all -> 0x03b3 }
            r9.A06 = r10     // Catch:{ all -> 0x03b3 }
            boolean r0 = r8.A05     // Catch:{ all -> 0x03b3 }
            if (r0 == 0) goto L_0x038c
            X.0eK r0 = r9.A0A     // Catch:{ all -> 0x03b3 }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x03b3 }
            com.facebook.blescan.BleScanOperation r2 = (com.facebook.blescan.BleScanOperation) r2     // Catch:{ all -> 0x03b3 }
            X.S0D r1 = r8.A00     // Catch:{ all -> 0x03b3 }
            monitor-enter(r2)     // Catch:{ all -> 0x03b3 }
            r1.getClass()     // Catch:{ RK7 -> 0x0355, Exception -> 0x0353 }
            boolean r0 = r2.A02     // Catch:{ RK7 -> 0x0355, Exception -> 0x0353 }
            r0 = r0 ^ 1
            X.17k.A0H(r0, r6)     // Catch:{ RK7 -> 0x0355, Exception -> 0x0353 }
            boolean r0 = r2.isDone()     // Catch:{ RK7 -> 0x0355, Exception -> 0x0353 }
            r0 = r0 ^ 1
            X.17k.A0H(r0, r5)     // Catch:{ RK7 -> 0x0355, Exception -> 0x0353 }
            r2.A00 = r1     // Catch:{ RK7 -> 0x0355, Exception -> 0x0353 }
            r2.A02 = r7     // Catch:{ RK7 -> 0x0355, Exception -> 0x0353 }
            X.S3S r1 = r2.A01     // Catch:{ RK7 -> 0x0355, Exception -> 0x0353 }
            android.content.Context r3 = r2.A03     // Catch:{ RK7 -> 0x0355, Exception -> 0x0353 }
            monitor-enter(r1)     // Catch:{ RK7 -> 0x0355, Exception -> 0x0353 }
            byte[] r0 = X.C11158SCo.A00     // Catch:{ all -> 0x0350 }
            android.content.pm.PackageManager r5 = r3.getPackageManager()     // Catch:{ all -> 0x0350 }
            java.lang.String r0 = "android.hardware.bluetooth"
            boolean r0 = r5.hasSystemFeature(r0)     // Catch:{ all -> 0x0350 }
            if (r0 == 0) goto L_0x033b
            android.content.pm.PackageManager r5 = r3.getPackageManager()     // Catch:{ all -> 0x0350 }
            java.lang.String r0 = "android.hardware.bluetooth_le"
            boolean r0 = r5.hasSystemFeature(r0)     // Catch:{ all -> 0x0350 }
            if (r0 == 0) goto L_0x0333
            boolean r0 = X.C69733NrI.A00()     // Catch:{ all -> 0x0350 }
            if (r0 == 0) goto L_0x0315
            java.lang.String r0 = "android.permission.BLUETOOTH_ADVERTISE"
            int r0 = r3.checkCallingOrSelfPermission(r0)     // Catch:{ all -> 0x0350 }
            if (r0 != 0) goto L_0x030d
            java.lang.String r0 = "android.permission.BLUETOOTH_SCAN"
            int r0 = r3.checkCallingOrSelfPermission(r0)     // Catch:{ all -> 0x0350 }
            if (r0 != 0) goto L_0x030d
        L_0x02a1:
            android.content.pm.ApplicationInfo r0 = r3.getApplicationInfo()     // Catch:{ all -> 0x0350 }
            int r6 = r0.targetSdkVersion     // Catch:{ all -> 0x0350 }
            r0 = 26
            java.lang.String r5 = "android.permission.ACCESS_FINE_LOCATION"
            if (r6 < r0) goto L_0x02bb
            int r0 = r3.checkCallingOrSelfPermission(r5)     // Catch:{ all -> 0x0350 }
            if (r0 == 0) goto L_0x02d5
            java.lang.Integer r0 = X.AnonymousClass05K.A0j     // Catch:{ all -> 0x0350 }
            X.RK7 r3 = new X.RK7     // Catch:{ all -> 0x0350 }
            r3.<init>(r0)     // Catch:{ all -> 0x0350 }
        L_0x02ba:
            throw r3     // Catch:{ all -> 0x0350 }
        L_0x02bb:
            r0 = 21
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0350 }
            int r0 = r3.checkCallingOrSelfPermission(r0)     // Catch:{ all -> 0x0350 }
            if (r0 == 0) goto L_0x02d5
            int r0 = r3.checkCallingOrSelfPermission(r5)     // Catch:{ all -> 0x0350 }
            if (r0 == 0) goto L_0x02d5
            java.lang.Integer r0 = X.AnonymousClass05K.A0j     // Catch:{ all -> 0x0350 }
            X.RK7 r3 = new X.RK7     // Catch:{ all -> 0x0350 }
            r3.<init>(r0)     // Catch:{ all -> 0x0350 }
            goto L_0x02ba
        L_0x02d5:
            java.lang.Class<X.S3S> r5 = X.S3S.class
            monitor-enter(r5)     // Catch:{ all -> 0x0350 }
            android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ all -> 0x030a }
            if (r0 == 0) goto L_0x02fc
            boolean r0 = r0.isEnabled()     // Catch:{ all -> 0x030a }
            if (r0 == 0) goto L_0x0304
            monitor-exit(r5)     // Catch:{ all -> 0x0350 }
            android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ all -> 0x0350 }
            r1.A02 = r0     // Catch:{ all -> 0x0350 }
            android.bluetooth.le.BluetoothLeScanner r0 = r0.getBluetoothLeScanner()     // Catch:{ all -> 0x0350 }
            r1.A03 = r0     // Catch:{ all -> 0x0350 }
            if (r0 == 0) goto L_0x02f4
            goto L_0x0344
        L_0x02f4:
            java.lang.Integer r0 = X.AnonymousClass05K.A1F     // Catch:{ all -> 0x0350 }
            X.RK7 r3 = new X.RK7     // Catch:{ all -> 0x0350 }
            r3.<init>(r0)     // Catch:{ all -> 0x0350 }
            goto L_0x02ba
        L_0x02fc:
            java.lang.Integer r3 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x030a }
            X.RK7 r0 = new X.RK7     // Catch:{ all -> 0x030a }
            r0.<init>(r3)     // Catch:{ all -> 0x030a }
            goto L_0x0309
        L_0x0304:
            X.RK7 r0 = new X.RK7     // Catch:{ all -> 0x030a }
            r0.<init>(r4)     // Catch:{ all -> 0x030a }
        L_0x0309:
            throw r0     // Catch:{ all -> 0x030a }
        L_0x030a:
            r3 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0350 }
            goto L_0x02ba
        L_0x030d:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x0350 }
            X.RK7 r3 = new X.RK7     // Catch:{ all -> 0x0350 }
            r3.<init>(r0)     // Catch:{ all -> 0x0350 }
            goto L_0x02ba
        L_0x0315:
            r0 = 2603(0xa2b, float:3.648E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0350 }
            int r0 = r3.checkCallingOrSelfPermission(r0)     // Catch:{ all -> 0x0350 }
            if (r0 != 0) goto L_0x032b
            java.lang.String r0 = "android.permission.BLUETOOTH_ADMIN"
            int r0 = r3.checkCallingOrSelfPermission(r0)     // Catch:{ all -> 0x0350 }
            if (r0 != 0) goto L_0x032b
            goto L_0x02a1
        L_0x032b:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x0350 }
            X.RK7 r3 = new X.RK7     // Catch:{ all -> 0x0350 }
            r3.<init>(r0)     // Catch:{ all -> 0x0350 }
            goto L_0x02ba
        L_0x0333:
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0350 }
            X.RK7 r3 = new X.RK7     // Catch:{ all -> 0x0350 }
            r3.<init>(r0)     // Catch:{ all -> 0x0350 }
            goto L_0x02ba
        L_0x033b:
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0350 }
            X.RK7 r3 = new X.RK7     // Catch:{ all -> 0x0350 }
            r3.<init>(r0)     // Catch:{ all -> 0x0350 }
            goto L_0x02ba
        L_0x0344:
            monitor-exit(r1)     // Catch:{ RK7 -> 0x0355, Exception -> 0x0353 }
            java.util.concurrent.ScheduledExecutorService r1 = r2.A04     // Catch:{ RK7 -> 0x0355, Exception -> 0x0353 }
            X.TB6 r0 = new X.TB6     // Catch:{ RK7 -> 0x0355, Exception -> 0x0353 }
            r0.<init>(r2)     // Catch:{ RK7 -> 0x0355, Exception -> 0x0353 }
            r1.execute(r0)     // Catch:{ RK7 -> 0x0355, Exception -> 0x0353 }
            goto L_0x0377
        L_0x0350:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ RK7 -> 0x0355, Exception -> 0x0353 }
            throw r0     // Catch:{ RK7 -> 0x0355, Exception -> 0x0353 }
        L_0x0353:
            r4 = move-exception
            goto L_0x0357
        L_0x0355:
            r1 = move-exception
            goto L_0x0371
        L_0x0357:
            java.lang.Integer r3 = X.AnonymousClass05K.A1F     // Catch:{ all -> 0x03b0 }
            r0 = 363(0x16b, float:5.09E-43)
            java.lang.String r1 = X.Pxd.A00(r0)     // Catch:{ all -> 0x03b0 }
            r0 = 176(0xb0, float:2.47E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ all -> 0x03b0 }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x03b0 }
            X.RK7 r1 = new X.RK7     // Catch:{ all -> 0x03b0 }
            r1.<init>(r0, r4)     // Catch:{ all -> 0x03b0 }
            r3.getClass()     // Catch:{ all -> 0x03b0 }
        L_0x0371:
            com.facebook.blescan.BleScanOperation.A00(r2)     // Catch:{ all -> 0x03b0 }
            r2.A02(r1)     // Catch:{ all -> 0x03b0 }
        L_0x0377:
            monitor-exit(r2)     // Catch:{ all -> 0x03b3 }
            X.Y3e r0 = new X.Y3e     // Catch:{ all -> 0x03b3 }
            r20 = r0
            r21 = r2
            r25 = r12
            r26 = r19
            r27 = r18
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x03b3 }
            r2.addListener(r0, r11)     // Catch:{ all -> 0x03b3 }
            r9.A04 = r2     // Catch:{ all -> 0x03b3 }
        L_0x038c:
            r0 = r19
            java.lang.Object r2 = r0.A00     // Catch:{ all -> 0x03b3 }
            r0 = r18
            java.lang.Object r1 = r0.A00     // Catch:{ all -> 0x03b3 }
            java.lang.Object r0 = r12.A00     // Catch:{ all -> 0x03b3 }
            r3 = r9
            r4 = r8
            r5 = r2
            r6 = r1
            r7 = r0
            r8 = r34
            A00(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x03b3 }
            monitor-exit(r9)
            return
        L_0x03a2:
            java.lang.String r1 = "Must call this before operation starts"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03aa }
            r0.<init>(r1)     // Catch:{ all -> 0x03aa }
            throw r0     // Catch:{ all -> 0x03aa }
        L_0x03aa:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x03ad }
            throw r0     // Catch:{ all -> 0x03ad }
        L_0x03ad:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x03b3 }
            goto L_0x03b2
        L_0x03b0:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x03b3 }
        L_0x03b2:
            throw r0     // Catch:{ all -> 0x03b3 }
        L_0x03b3:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6UF.A04(X.SFc, java.lang.String):void");
    }

    public AnonymousClass6UF(O5V o5v, C276264sw r3, ScheduledExecutorService scheduledExecutorService, AnonymousClass0eK r5, AnonymousClass0eK r6, AnonymousClass0eK r7) {
        this.A07 = o5v;
        this.A0B = r5;
        this.A0C = r6;
        this.A0A = r7;
        this.A08 = r3;
        this.A09 = scheduledExecutorService;
    }
}
