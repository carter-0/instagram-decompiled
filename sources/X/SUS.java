package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public abstract class SUS {
    public static final Method A00;
    public static final Comparator A01 = new C13113TLw(15);
    public static final TimeZone A02 = TimeZone.getTimeZone("GMT");
    public static final Pattern A03 = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    public static final C22023Xt4 A04 = C22023Xt4.A00(new String[0]);
    public static final C21956Xml A05;
    public static final Y1D A06;
    public static final byte[] A07;
    public static final String[] A08 = new String[0];
    public static final Charset A09 = Charset.forName("UTF-32BE");
    public static final Charset A0A = Charset.forName("UTF-32LE");
    public static final TS1 A0B = TS1.A00(TAH.A01("efbbbf"), TAH.A01("feff"), TAH.A01("fffe"), TAH.A01("0000ffff"), TAH.A01("ffff0000"));

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.YCT, X.TPe] */
    static {
        byte[] bArr = new byte[0];
        A07 = bArr;
        Method method = null;
        ? obj = new Object();
        obj.A0K(bArr, 0);
        A06 = new C13411TYv(obj);
        A05 = new C21956Xml(bArr);
        Class<Throwable> cls = Throwable.class;
        try {
            method = cls.getDeclaredMethod("addSuppressed", new Class[]{cls});
        } catch (Exception unused) {
        }
        A00 = method;
    }

    public static int A00(char c) {
        char c2;
        if (c < '0') {
            return -1;
        }
        if (c <= '9') {
            return c - '0';
        }
        char c3 = 'a';
        if (c >= 'a') {
            c2 = 'f';
        } else {
            c3 = 'A';
            if (c < 'A') {
                return -1;
            }
            c2 = 'F';
        }
        if (c <= c2) {
            return (c - c3) + 10;
        }
        return -1;
    }

    public static int A01(String str, String str2, int i, int i2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.TPe] */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b7, code lost:
        if (r5 == 16) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b9, code lost:
        if (r4 == -1) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00bb, code lost:
        r1 = r5 - r4;
        java.lang.System.arraycopy(r10, r4, r10, 16 - r1, r1);
        java.util.Arrays.fill(r10, r4, (16 - r5) + r4, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d6, code lost:
        if ((r3 - r14) == 0) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r17 = java.net.InetAddress.getByAddress(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f0, code lost:
        throw X.Pxe.A0d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(java.lang.String r18) {
        /*
            java.lang.String r13 = ":"
            r9 = r18
            boolean r0 = r9.contains(r13)
            r18 = 0
            if (r0 == 0) goto L_0x015f
            java.lang.String r0 = "["
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = "]"
            boolean r0 = r9.endsWith(r0)
            if (r0 == 0) goto L_0x007b
            int r12 = r9.length()
            r11 = 1
            int r12 = r12 - r11
        L_0x0022:
            r8 = 16
            byte[] r10 = new byte[r8]
            r7 = -1
            r6 = 0
            r5 = 0
            r4 = -1
            r3 = -1
        L_0x002b:
            r17 = 0
            if (r11 >= r12) goto L_0x00b7
            if (r5 == r8) goto L_0x00f1
            int r2 = r11 + 2
            if (r2 > r12) goto L_0x006e
            java.lang.String r1 = "::"
            r0 = 2
            boolean r0 = r9.regionMatches(r11, r1, r6, r0)
            if (r0 == 0) goto L_0x006e
            if (r4 != r7) goto L_0x00f1
            int r5 = r5 + 2
            r4 = r5
            if (r2 == r12) goto L_0x00b7
            r3 = r2
        L_0x0046:
            r11 = r3
            r2 = 0
        L_0x0048:
            if (r11 >= r12) goto L_0x005a
            char r0 = r9.charAt(r11)
            int r0 = A00(r0)
            if (r0 == r7) goto L_0x005a
            int r2 = r2 << 4
            int r2 = r2 + r0
            int r11 = r11 + 1
            goto L_0x0048
        L_0x005a:
            int r1 = r11 - r3
            if (r1 == 0) goto L_0x00f1
            r0 = 4
            if (r1 > r0) goto L_0x00f1
            int r1 = r5 + 1
            int r0 = r2 >>> 8
            X.Pxe.A1H(r0, r10, r5)
            int r5 = r1 + 1
            X.Pxe.A1H(r2, r10, r1)
            goto L_0x002b
        L_0x006e:
            if (r5 == 0) goto L_0x0079
            r1 = 1
            boolean r0 = r9.regionMatches(r11, r13, r6, r1)
            if (r0 == 0) goto L_0x0081
            int r11 = r11 + 1
        L_0x0079:
            r3 = r11
            goto L_0x0046
        L_0x007b:
            r11 = 0
            int r12 = r9.length()
            goto L_0x0022
        L_0x0081:
            java.lang.String r0 = "."
            boolean r0 = r9.regionMatches(r11, r0, r6, r1)
            if (r0 == 0) goto L_0x00f1
            int r13 = r5 + -2
            r14 = r3
            r11 = r13
        L_0x008d:
            r16 = 0
            if (r3 >= r12) goto L_0x00e0
            if (r11 == r8) goto L_0x00b3
            if (r11 == r13) goto L_0x009f
            char r1 = r9.charAt(r3)
            r0 = 46
            if (r1 != r0) goto L_0x00b3
            int r14 = r3 + 1
        L_0x009f:
            r3 = r14
            r2 = 0
        L_0x00a1:
            if (r3 >= r12) goto L_0x00d4
            char r15 = r9.charAt(r3)
            r1 = 48
            if (r15 < r1) goto L_0x00d4
            r0 = 57
            if (r15 > r0) goto L_0x00d4
            if (r2 != 0) goto L_0x00c9
            if (r14 == r3) goto L_0x00c9
        L_0x00b3:
            if (r16 == 0) goto L_0x00f1
            int r5 = r5 + 2
        L_0x00b7:
            if (r5 == r8) goto L_0x00e7
            if (r4 == r7) goto L_0x00f1
            int r1 = r5 - r4
            int r0 = 16 - r1
            java.lang.System.arraycopy(r10, r4, r10, r0, r1)
            int r0 = r8 - r5
            int r0 = r0 + r4
            java.util.Arrays.fill(r10, r4, r0, r6)
            goto L_0x00e7
        L_0x00c9:
            int r2 = r2 * 10
            int r2 = r2 + r15
            int r2 = r2 - r1
            r0 = 255(0xff, float:3.57E-43)
            if (r2 > r0) goto L_0x00b3
            int r3 = r3 + 1
            goto L_0x00a1
        L_0x00d4:
            int r0 = r3 - r14
            if (r0 == 0) goto L_0x00b3
            int r1 = r11 + 1
            byte r0 = (byte) r2
            r10[r11] = r0
            r11 = r1
            r14 = r3
            goto L_0x008d
        L_0x00e0:
            int r0 = r13 + 4
            if (r11 != r0) goto L_0x00b3
            r16 = 1
            goto L_0x00b3
        L_0x00e7:
            java.net.InetAddress r17 = java.net.InetAddress.getByAddress(r10)     // Catch:{ UnknownHostException -> 0x00ec }
            goto L_0x00f1
        L_0x00ec:
            java.lang.AssertionError r0 = X.Pxe.A0d()
            throw r0
        L_0x00f1:
            if (r17 == 0) goto L_0x0199
            byte[] r7 = r17.getAddress()
            int r6 = r7.length
            if (r6 != r8) goto L_0x014a
            r5 = 0
            r4 = -1
            r9 = 0
            r3 = 0
        L_0x00fe:
            if (r9 >= r6) goto L_0x011c
            r2 = r9
        L_0x0101:
            if (r2 >= r8) goto L_0x0110
            byte r0 = r7[r2]
            if (r0 != 0) goto L_0x0110
            int r0 = r2 + 1
            byte r0 = r7[r0]
            if (r0 != 0) goto L_0x0110
            int r2 = r2 + 2
            goto L_0x0101
        L_0x0110:
            int r1 = r2 - r9
            if (r1 <= r3) goto L_0x0119
            r0 = 4
            if (r1 < r0) goto L_0x0119
            r4 = r9
            r3 = r1
        L_0x0119:
            int r9 = r2 + 2
            goto L_0x00fe
        L_0x011c:
            X.TPe r2 = new X.TPe
            r2.<init>()
        L_0x0121:
            if (r5 >= r6) goto L_0x0194
            r0 = 58
            if (r5 != r4) goto L_0x0131
            r2.A0B(r0)
            int r5 = r5 + r3
            if (r5 != r8) goto L_0x0121
            r2.A0B(r0)
            goto L_0x0121
        L_0x0131:
            if (r5 <= 0) goto L_0x0136
            r2.A0B(r0)
        L_0x0136:
            byte r0 = r7[r5]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 8
            int r0 = r5 + 1
            byte r0 = r7[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            long r0 = (long) r1
            r2.A0F(r0)
            int r5 = r5 + 2
            goto L_0x0121
        L_0x014a:
            r0 = 4
            if (r6 != r0) goto L_0x0152
            java.lang.String r0 = r17.getHostAddress()
            return r0
        L_0x0152:
            java.lang.String r1 = "Invalid IPv6 address: '"
            java.lang.String r0 = "'"
            java.lang.String r0 = X.002.A0g(r1, r9, r0)
            java.lang.AssertionError r0 = X.Pxe.A0e(r0)
            throw r0
        L_0x015f:
            java.lang.String r1 = java.net.IDN.toASCII(r9)     // Catch:{ IllegalArgumentException -> 0x019a }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x019a }
            java.lang.String r0 = r1.toLowerCase(r0)     // Catch:{ IllegalArgumentException -> 0x019a }
            boolean r1 = r0.isEmpty()     // Catch:{ IllegalArgumentException -> 0x019a }
            if (r1 != 0) goto L_0x0199
            r3 = 0
        L_0x0170:
            int r1 = r0.length()     // Catch:{ IllegalArgumentException -> 0x019a }
            if (r3 >= r1) goto L_0x0190
            char r2 = r0.charAt(r3)     // Catch:{ IllegalArgumentException -> 0x019a }
            r1 = 31
            if (r2 <= r1) goto L_0x018e
            r1 = 127(0x7f, float:1.78E-43)
            if (r2 >= r1) goto L_0x018e
            java.lang.String r1 = " #%/:?@[\\]"
            int r2 = r1.indexOf(r2)     // Catch:{ IllegalArgumentException -> 0x019a }
            r1 = -1
            if (r2 != r1) goto L_0x018e
            int r3 = r3 + 1
            goto L_0x0170
        L_0x018e:
            r1 = 1
            goto L_0x0191
        L_0x0190:
            r1 = 0
        L_0x0191:
            if (r1 == 0) goto L_0x0198
            return r18
        L_0x0194:
            java.lang.String r0 = r2.A05()
        L_0x0198:
            return r0
        L_0x0199:
            return r18
        L_0x019a:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUS.A03(java.lang.String):java.lang.String");
    }

    public static String A04(String str, int i, int i2) {
        int i3;
        while (true) {
            if (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                    break;
                }
                i++;
            } else {
                i = i2;
                break;
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                i3 = i;
                break;
            }
            char charAt2 = str.charAt(i2);
            if (charAt2 != 9 && charAt2 != 10 && charAt2 != 12 && charAt2 != 13 && charAt2 != ' ') {
                i3 = i2 + 1;
                break;
            }
        }
        return str.substring(i, i3);
    }

    public static String A05(C11427STm sTm, boolean z) {
        String str = sTm.A02;
        if (str.contains(":")) {
            str = 002.A0g("[", str, "]");
        }
        if (z || sTm.A00 != C11427STm.A00(sTm.A03)) {
            return 002.A0b(str, ":", sTm.A00);
        }
        return str;
    }

    public static C22023Xt4 A08(List list) {
        C21971XoG xoG = new C21971XoG();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Xs6 xs6 = (Xs6) it.next();
            xoG.A02(xs6.A01.A08(), xs6.A02.A08());
        }
        return new C22023Xt4(xoG);
    }

    public static void A09(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void A0A(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!A0B(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean A0D(C11427STm sTm, C11427STm sTm2) {
        if (!sTm.A02.equals(sTm2.A02) || sTm.A00 != sTm2.A00 || !sTm.A03.equals(sTm2.A03)) {
            return false;
        }
        return true;
    }

    public static int A02(TimeUnit timeUnit, long j) {
        if (j >= 0) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw AnonymousClass7TF.A0W(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT, " too large.");
            } else if (millis != 0 || j <= 0) {
                return (int) millis;
            } else {
                throw AnonymousClass7TF.A0W(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT, " too small.");
            }
        } else {
            throw AnonymousClass7TF.A0W(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT, " < 0");
        }
    }

    public static List A06(Object... objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static X509TrustManager A07() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw DbW.A0c("Unexpected default trust managers:", Arrays.toString(trustManagers));
        } catch (GeneralSecurityException unused) {
            throw Pxe.A0e("No System TLS");
        }
    }

    public static boolean A0B(AssertionError assertionError) {
        if (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, X.TPe] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r0 != Long.MAX_VALUE) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        if (r0 == Long.MAX_VALUE) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        r13.Ezn().A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        r13.Ezn().A04(r2 + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0076, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0C(java.util.concurrent.TimeUnit r12, X.C13970TmY r13, int r14) {
        /*
            long r2 = java.lang.System.nanoTime()
            X.SJy r0 = r13.Ezn()
            boolean r0 = r0.A07()
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L_0x002e
            X.SJy r0 = r13.Ezn()
            long r0 = r0.A00()
            long r0 = r0 - r2
        L_0x001c:
            X.SJy r6 = r13.Ezn()
            long r4 = (long) r14
            long r4 = r12.toNanos(r4)
            long r4 = java.lang.Math.min(r0, r4)
            long r4 = r4 + r2
            r6.A04(r4)
            goto L_0x0034
        L_0x002e:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x001c
        L_0x0034:
            X.TPe r9 = new X.TPe     // Catch:{ InterruptedIOException -> 0x005b, all -> 0x0049 }
            r9.<init>()     // Catch:{ InterruptedIOException -> 0x005b, all -> 0x0049 }
        L_0x0039:
            r4 = 8192(0x2000, double:4.0474E-320)
            long r7 = r13.E6C(r9, r4)     // Catch:{ InterruptedIOException -> 0x005b, all -> 0x0049 }
            r5 = -1
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0061
            r9.A0A()     // Catch:{ InterruptedIOException -> 0x005b, all -> 0x0049 }
            goto L_0x0039
        L_0x0049:
            r6 = move-exception
            int r5 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            X.SJy r4 = r13.Ezn()
            if (r5 != 0) goto L_0x0056
            r4.A02()
            throw r6
        L_0x0056:
            long r2 = r2 + r0
            r4.A04(r2)
            throw r6
        L_0x005b:
            r5 = 0
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 != 0) goto L_0x006e
            goto L_0x0066
        L_0x0061:
            r5 = 1
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 != 0) goto L_0x006e
        L_0x0066:
            X.SJy r0 = r13.Ezn()
            r0.A02()
            return r5
        L_0x006e:
            X.SJy r4 = r13.Ezn()
            long r2 = r2 + r0
            r4.A04(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUS.A0C(java.util.concurrent.TimeUnit, X.TmY, int):boolean");
    }

    public static String[] A0E(Comparator comparator, String[] strArr, String[] strArr2) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    A1C.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return Pxf.A1a(A1C, A1C.size());
    }
}
