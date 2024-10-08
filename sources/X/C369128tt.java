package X;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.8tt  reason: invalid class name and case insensitive filesystem */
public final class C369128tt {
    public static final Charset A04;
    public static final byte[] A05 = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final byte[] A06;
    public static final byte[] A07 = {-1, -40, -1};
    public static final int[] A08 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final String[] A09 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    public static final C369138tu[][] A0A;
    public static final HashMap A0B = new HashMap();
    public static final HashSet A0C = new HashSet(Arrays.asList(new String[]{"DigitalZoomRatio", "ExposureTime"}));
    public static final C369138tu[] A0D = {new C369138tu("SubIFDPointer", 330, 4), new C369138tu("ExifIFDPointer", 34665, 4)};
    public static final C369138tu[] A0E;
    public static final C369138tu[] A0F;
    public static final HashMap[] A0G = new HashMap[3];
    public int A00;
    public ByteOrder A01;
    public final HashMap[] A02 = new HashMap[3];
    public final Set A03 = new HashSet(3);

    static {
        C369138tu[] r11 = {new C369138tu("Orientation", 274, 3), new C369138tu("SubIFDPointer", 330, 4), new C369138tu("ExifIFDPointer", 34665, 4)};
        A0F = r11;
        C369138tu r4 = new C369138tu("ExposureTime", 33434, 5);
        C369138tu r13 = new C369138tu("PhotographicSensitivity", 34855, 3);
        C369138tu r12 = new C369138tu("ShutterSpeedValue", 37377, 10);
        C369138tu r14 = new C369138tu("ApertureValue", 37378, 5);
        C369138tu r19 = r13;
        C369138tu r20 = r12;
        C369138tu r18 = r4;
        C369138tu[] r0 = {r18, r19, r20, r14, new C369138tu("FocalLength", 37386, 5), new C369138tu("WhiteBalance", 41987, 3), new C369138tu("DigitalZoomRatio", 41988, 5), new C369138tu("FocalLengthIn35mmFilm", 41989, 3)};
        A0E = r0;
        A0A = new C369138tu[][]{r11, r0, r11};
        Charset forName = Charset.forName("US-ASCII");
        A04 = forName;
        A06 = "Exif\u0000\u0000".getBytes(forName);
        int i = 0;
        while (true) {
            C369138tu[][] r1 = A0A;
            if (i < 3) {
                HashMap[] hashMapArr = A0G;
                hashMapArr[i] = new HashMap();
                for (C369138tu r3 : r1[i]) {
                    hashMapArr[i].put(Integer.valueOf(r3.A00), r3);
                }
                i++;
            } else {
                A0B.put(Integer.valueOf(A0D[1].A00), 1);
                return;
            }
        }
    }

    public final int A02(String str, int i) {
        NumberFormatException numberFormatException;
        int i2 = 0;
        do {
            C369158tw r1 = (C369158tw) this.A02[i2].get(str);
            if (r1 != null) {
                try {
                    Object A002 = C369158tw.A00(r1, this.A01);
                    if (A002 == null) {
                        numberFormatException = new NumberFormatException(AnonymousClass000.A00(2377));
                    } else if (A002 instanceof String) {
                        return Integer.parseInt((String) A002);
                    } else {
                        if (A002 instanceof long[]) {
                            long[] jArr = (long[]) A002;
                            if (jArr.length == 1) {
                                return (int) jArr[0];
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else if (A002 instanceof int[]) {
                            int[] iArr = (int[]) A002;
                            if (iArr.length == 1) {
                                return iArr[0];
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else {
                            numberFormatException = new NumberFormatException(AnonymousClass000.A00(2187));
                        }
                    }
                    throw numberFormatException;
                } catch (NumberFormatException unused) {
                    return i;
                }
            } else {
                i2++;
            }
        } while (i2 < 3);
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        if (r12 == r0) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r12 == 7) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0131, code lost:
        if (((long) r9.A00) != r4) goto L_0x00ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(X.C369148tv r22, int r23) {
        /*
            r21 = this;
            r20 = r21
            r0 = r20
            java.util.Set r15 = r0.A03
            r9 = r22
            int r0 = r9.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r15.add(r0)
            int r0 = r9.A00
            int r0 = r0 + 2
            int r8 = r9.A03
            if (r0 > r8) goto L_0x00d5
            short r14 = r9.A04()
            int r1 = r9.A00
            int r0 = r14 * 12
            int r1 = r1 + r0
            if (r1 > r8) goto L_0x00d5
            if (r14 <= 0) goto L_0x00d5
            r10 = 0
        L_0x0027:
            int r1 = r9.A02()
            int r12 = r9.A02()
            int r19 = r9.A01()
            int r0 = r9.A00
            long r4 = (long) r0
            r16 = 4
            long r4 = r4 + r16
            java.util.HashMap[] r0 = A0G
            r0 = r0[r23]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            java.lang.Object r11 = r0.get(r13)
            X.8tu r11 = (X.C369138tu) r11
            if (r11 == 0) goto L_0x00ad
            if (r12 <= 0) goto L_0x00ad
            int[] r2 = A08
            r0 = 14
            if (r12 >= r0) goto L_0x00ad
            int r1 = r11.A01
            r0 = 7
            if (r1 == r0) goto L_0x0066
            if (r12 == r0) goto L_0x0069
            if (r1 == r12) goto L_0x0066
            r0 = 4
            if (r1 == r0) goto L_0x0135
            r0 = 9
            if (r1 != r0) goto L_0x00ad
            r0 = 8
        L_0x0064:
            if (r12 != r0) goto L_0x00ad
        L_0x0066:
            r0 = 7
            if (r12 != r0) goto L_0x006a
        L_0x0069:
            r12 = r1
        L_0x006a:
            r0 = r19
            long r6 = (long) r0
            r0 = r2[r12]
            long r0 = (long) r0
            long r6 = r6 * r0
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00ad
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00ad
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0091
            int r0 = r9.A01()
            long r2 = (long) r0
            long r17 = r2 + r6
            long r0 = (long) r8
            int r16 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r16 > 0) goto L_0x00ad
            r9.A05(r2)
        L_0x0091:
            java.util.HashMap r0 = A0B
            java.lang.Object r13 = r0.get(r13)
            java.lang.Number r13 = (java.lang.Number) r13
            if (r13 == 0) goto L_0x0114
            r0 = 3
            if (r12 == r0) goto L_0x00e7
            r0 = 4
            if (r12 == r0) goto L_0x00db
            r0 = 8
            if (r12 == r0) goto L_0x00d6
            r0 = 9
            if (r12 == r0) goto L_0x00ec
            r0 = 13
            if (r12 == r0) goto L_0x00ec
        L_0x00ad:
            r9.A05(r4)
        L_0x00b0:
            int r0 = r10 + 1
            short r10 = (short) r0
            if (r10 < r14) goto L_0x0027
            int r0 = r9.A00
            int r0 = r0 + 4
            if (r0 > r8) goto L_0x00d5
            int r5 = r9.A01()
            long r1 = (long) r5
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d5
            if (r5 >= r8) goto L_0x00d5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            boolean r0 = r15.contains(r0)
            if (r0 != 0) goto L_0x00d5
            r9.A05(r1)
        L_0x00d5:
            return
        L_0x00d6:
            short r0 = r9.A04()
            goto L_0x00f0
        L_0x00db:
            int r0 = r9.A01()
            long r2 = (long) r0
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            goto L_0x00f1
        L_0x00e7:
            int r0 = r9.A02()
            goto L_0x00f0
        L_0x00ec:
            int r0 = r9.A01()
        L_0x00f0:
            long r2 = (long) r0
        L_0x00f1:
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ad
            long r0 = (long) r8
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ad
            int r0 = (int) r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r15.contains(r0)
            if (r0 != 0) goto L_0x00ad
            r9.A05(r2)
            int r1 = r13.intValue()
            r0 = r20
            r0.A00(r9, r1)
            goto L_0x00ad
        L_0x0114:
            int r0 = (int) r6
            byte[] r1 = new byte[r0]
            r9.A06(r1)
            X.8tw r2 = new X.8tw
            r0 = r19
            r2.<init>(r1, r12, r0)
            r0 = r20
            java.util.HashMap[] r0 = r0.A02
            r1 = r0[r23]
            java.lang.String r0 = r11.A02
            r1.put(r0, r2)
            int r0 = r9.A00
            long r0 = (long) r0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x00b0
            goto L_0x00ad
        L_0x0135:
            r0 = 3
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369128tt.A00(X.8tv, int):void");
    }

    public final double A01(String str) {
        NumberFormatException numberFormatException;
        int i = 0;
        do {
            C369158tw r3 = (C369158tw) this.A02[i].get(str);
            if (r3 != null) {
                try {
                    Object A002 = C369158tw.A00(r3, this.A01);
                    if (A002 == null) {
                        numberFormatException = new NumberFormatException(AnonymousClass000.A00(2376));
                    } else if (A002 instanceof String) {
                        return Double.parseDouble((String) A002);
                    } else {
                        if (A002 instanceof long[]) {
                            long[] jArr = (long[]) A002;
                            if (jArr.length == 1) {
                                return (double) jArr[0];
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else if (A002 instanceof int[]) {
                            int[] iArr = (int[]) A002;
                            if (iArr.length == 1) {
                                return (double) iArr[0];
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else if (A002 instanceof double[]) {
                            double[] dArr = (double[]) A002;
                            if (dArr.length == 1) {
                                return dArr[0];
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else if (A002 instanceof C369168tx[]) {
                            C369168tx[] r6 = (C369168tx[]) A002;
                            if (r6.length == 1) {
                                C369168tx r0 = r6[0];
                                return ((double) r0.A01) / ((double) r0.A00);
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else {
                            numberFormatException = new NumberFormatException(AnonymousClass000.A00(2186));
                        }
                    }
                    throw numberFormatException;
                } catch (NumberFormatException unused) {
                    return -1.0d;
                }
            } else {
                i++;
            }
        } while (i < 3);
        return -1.0d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C369128tt(java.io.InputStream r15) {
        /*
            r14 = this;
            r14.<init>()
            r5 = 3
            java.util.HashMap[] r0 = new java.util.HashMap[r5]
            r14.A02 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r5)
            r14.A03 = r0
            java.nio.ByteOrder r6 = java.nio.ByteOrder.BIG_ENDIAN
            r14.A01 = r6
            r2 = 0
        L_0x0014:
            java.util.HashMap[] r1 = r14.A02     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r0.<init>()     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r1[r2] = r0     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            int r2 = r2 + 1
            if (r2 < r5) goto L_0x0014
            r0 = 5000(0x1388, float:7.006E-42)
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r4.<init>(r15, r0)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r4.mark(r0)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            byte[] r3 = new byte[r0]     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r4.read(r3)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r4.reset()     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r2 = 0
        L_0x0034:
            byte[] r0 = A07     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            if (r2 >= r5) goto L_0x0049
            byte r1 = r3[r2]     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            byte r0 = r0[r2]     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            if (r1 == r0) goto L_0x0046
            java.lang.String r0 = "This EXIF util only supports JPEG"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
        L_0x0045:
            throw r1     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
        L_0x0046:
            int r2 = r2 + 1
            goto L_0x0034
        L_0x0049:
            X.8tv r5 = new X.8tv     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r4 = 0
            r5.A02 = r6     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            byte r0 = r5.A00()     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            java.lang.String r2 = "Invalid marker: "
            r3 = -1
            if (r0 != r3) goto L_0x0172
            byte r1 = r5.A00()     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r0 = -40
            if (r1 != r0) goto L_0x0161
            r13 = 2
            r10 = 2
        L_0x0064:
            byte r0 = r5.A00()     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            if (r0 != r3) goto L_0x014e
            r7 = 1
            int r0 = r10 + 1
            byte r2 = r5.A00()     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            int r1 = r0 + 1
            r0 = -39
            if (r2 == r0) goto L_0x0183
            r0 = -38
            if (r2 == r0) goto L_0x0183
            int r11 = r5.A02()     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            int r11 = r11 - r13
            int r10 = r1 + 2
            java.lang.String r0 = "Invalid length"
            if (r11 < 0) goto L_0x0147
            r0 = -31
            if (r2 != r0) goto L_0x00fe
            byte[] r12 = new byte[r11]     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r5.A06(r12)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            int r9 = r10 + r11
            byte[] r8 = A06     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            if (r8 != 0) goto L_0x0096
            r7 = 0
        L_0x0096:
            int r6 = r8.length     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            if (r11 >= r6) goto L_0x009a
            r7 = 0
        L_0x009a:
            r2 = 0
        L_0x009b:
            if (r2 >= r6) goto L_0x00a7
            byte r1 = r12[r2]     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            byte r0 = r8[r2]     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            if (r1 == r0) goto L_0x00a4
            r7 = 0
        L_0x00a4:
            int r2 = r2 + 1
            goto L_0x009b
        L_0x00a7:
            if (r7 == 0) goto L_0x00fc
            byte[] r1 = java.util.Arrays.copyOfRange(r12, r6, r11)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            int r10 = r10 + r6
            r14.A00 = r10     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            X.8tv r7 = new X.8tv     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r7.<init>(r0)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            int r6 = r1.length     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            short r2 = r7.A04()     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r0 = 18761(0x4949, float:2.629E-41)
            if (r2 == r0) goto L_0x00ca
            r0 = 19789(0x4d4d, float:2.773E-41)
            if (r2 != r0) goto L_0x0107
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            goto L_0x00cc
        L_0x00ca:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
        L_0x00cc:
            r14.A01 = r0     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r7.A02 = r0     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            int r1 = r7.A02()     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r0 = 42
            if (r1 != r0) goto L_0x0129
            int r1 = r7.A01()     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r0 = 8
            if (r1 < r0) goto L_0x0118
            if (r1 >= r6) goto L_0x0118
            int r1 = r1 + -8
            if (r1 <= 0) goto L_0x00f9
            int r0 = r7.A03(r1)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            if (r0 == r1) goto L_0x00f9
            java.lang.String r0 = "Couldn't jump to first Ifd: "
            java.lang.String r0 = X.002.A0O(r0, r1)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            goto L_0x0045
        L_0x00f9:
            r14.A00(r7, r4)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
        L_0x00fc:
            r10 = r9
            r11 = 0
        L_0x00fe:
            int r0 = r5.A03(r11)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            if (r0 != r11) goto L_0x013e
            int r10 = r10 + r11
            goto L_0x0064
        L_0x0107:
            java.lang.String r1 = "Invalid byte order: "
            java.lang.String r0 = java.lang.Integer.toHexString(r2)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            goto L_0x0045
        L_0x0118:
            r0 = 2331(0x91b, float:3.266E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            java.lang.String r0 = X.002.A0O(r0, r1)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            goto L_0x0045
        L_0x0129:
            r0 = 2333(0x91d, float:3.269E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            java.lang.String r1 = java.lang.Integer.toHexString(r1)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            java.lang.String r0 = X.002.A0R(r0, r1)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            goto L_0x0045
        L_0x013e:
            java.lang.String r0 = "Invalid JPEG segment"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            goto L_0x0045
        L_0x0147:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            goto L_0x0045
        L_0x014e:
            java.lang.String r1 = "Invalid marker:"
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            goto L_0x0045
        L_0x0161:
            r0 = 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            java.lang.String r0 = X.002.A0R(r2, r0)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            goto L_0x0045
        L_0x0172:
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            java.lang.String r0 = X.002.A0R(r2, r0)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0183, all -> 0x0184 }
            goto L_0x0045
        L_0x0183:
            return
        L_0x0184:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369128tt.<init>(java.io.InputStream):void");
    }
}
