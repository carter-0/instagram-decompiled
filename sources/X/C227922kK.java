package X;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: X.2kK  reason: invalid class name and case insensitive filesystem */
public final class C227922kK {
    public static SimpleDateFormat A0J;
    public static SimpleDateFormat A0K;
    public static final Charset A0L;
    public static final Pattern A0M = Pattern.compile(".*[1-9].*");
    public static final boolean A0N = Log.isLoggable("ExifInterface", 3);
    public static final byte[] A0O = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final byte[] A0P = {104, 101, 105, 99};
    public static final byte[] A0Q = {109, 105, 102, 49};
    public static final byte[] A0R = {102, 116, 121, 112};
    public static final byte[] A0S;
    public static final byte[] A0T = {-1, -40, -1};
    public static final byte[] A0U = {79, 76, 89, 77, 80, 0};
    public static final byte[] A0V = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] A0W = {101, 88, 73, 102};
    public static final byte[] A0X = {73, 69, 78, 68};
    public static final byte[] A0Y = {73, 72, 68, 82};
    public static final byte[] A0Z = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] A0a = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] A0b = "ANMF".getBytes(Charset.defaultCharset());
    public static final byte[] A0c = {69, 88, 73, 70};
    public static final byte[] A0d = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] A0e = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] A0f = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] A0g = {82, 73, 70, 70};
    public static final byte[] A0h = {87, 69, 66, 80};
    public static final byte[] A0i = {-99, 1, 42};
    public static final int[] A0j = {8};
    public static final int[] A0k = {8, 8, 8};
    public static final int[] A0l = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final String[] A0m = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final AnonymousClass2kM[][] A0n;
    public static final HashMap A0o = new HashMap();
    public static final HashSet A0p = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    public static final List A0q = Arrays.asList(new Integer[]{2, 7, 4, 5});
    public static final List A0r = Arrays.asList(new Integer[]{1, 6, 3, 8});
    public static final Pattern A0s = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern A0t = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern A0u = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final byte[] A0v;
    public static final AnonymousClass2kM[] A0w = {new AnonymousClass2kM("SubIFDPointer", 330, 4), new AnonymousClass2kM("ExifIFDPointer", 34665, 4), new AnonymousClass2kM("GPSInfoIFDPointer", 34853, 4), new AnonymousClass2kM("InteroperabilityIFDPointer", 40965, 4), new AnonymousClass2kM("CameraSettingsIFDPointer", 8224, 1), new AnonymousClass2kM("ImageProcessingIFDPointer", 8256, 1)};
    public static final AnonymousClass2kM[] A0x;
    public static final AnonymousClass2kM[] A0y;
    public static final AnonymousClass2kM[] A0z;
    public static final AnonymousClass2kM[] A10;
    public static final AnonymousClass2kM[] A11;
    public static final AnonymousClass2kM[] A12;
    public static final AnonymousClass2kM[] A13;
    public static final AnonymousClass2kM[] A14;
    public static final AnonymousClass2kM[] A15;
    public static final HashMap[] A16 = new HashMap[10];
    public static final HashMap[] A17 = new HashMap[10];
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public AssetManager.AssetInputStream A06;
    public FileDescriptor A07;
    public String A08;
    public ByteOrder A09 = ByteOrder.BIG_ENDIAN;
    public Set A0A = new HashSet(10);
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public byte[] A0F;
    public int A0G;
    public int A0H;
    public final HashMap[] A0I = new HashMap[10];

    private void A05() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.A0I;
            if (i < 10) {
                HashMap hashMap = hashMapArr[i];
                hashMap.size();
                for (Map.Entry entry : hashMap.entrySet()) {
                    C227982kb r1 = (C227982kb) entry.getValue();
                    entry.getKey();
                    r1.toString();
                    r1.A05(this.A09);
                }
                i++;
            } else {
                return;
            }
        }
    }

    private void A06() {
        A07(0, 5);
        A07(0, 4);
        A07(5, 4);
        HashMap[] hashMapArr = this.A0I;
        Object obj = hashMapArr[1].get("PixelXDimension");
        Object obj2 = hashMapArr[1].get("PixelYDimension");
        if (!(obj == null || obj2 == null)) {
            hashMapArr[0].put("ImageWidth", obj);
            hashMapArr[0].put("ImageLength", obj2);
        }
        if (hashMapArr[4].isEmpty() && A0L(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        A0L(hashMapArr[4]);
        A08(0, "ThumbnailOrientation", "Orientation");
        A08(0, "ThumbnailImageLength", "ImageLength");
        A08(0, "ThumbnailImageWidth", "ImageWidth");
        A08(5, "ThumbnailOrientation", "Orientation");
        A08(5, "ThumbnailImageLength", "ImageLength");
        A08(5, "ThumbnailImageWidth", "ImageWidth");
        A08(4, "Orientation", "ThumbnailOrientation");
        A08(4, "ImageLength", "ThumbnailImageLength");
        A08(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* JADX WARNING: type inference failed for: r6v6, types: [X.2kZ, X.50S] */
    /* JADX WARNING: type inference failed for: r7v2, types: [X.2kZ, X.50S] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0138, code lost:
        if (r9[(r6 + 4) + 4] == r3[r6]) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x013a, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x013d, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x013f, code lost:
        r1 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0142, code lost:
        r1 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0145, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0148, code lost:
        r1 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        r6 = "FUJIFILMCCD-RAW".getBytes(java.nio.charset.Charset.defaultCharset());
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r3 >= r6.length) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (r9[r3] == r6[r3]) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0356, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        r1 = new java.io.IOException("Encountered corrupt PNG file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r7 = new X.C227962kZ(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:?, code lost:
        r1 = new java.io.IOException("Encountered corrupt WebP file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0 = (long) r7.readInt();
        r10 = new byte[4];
        r7.readFully(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0452, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0453, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0457, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        r2 = A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x045a, code lost:
        if (r2 != false) goto L_0x045c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x045c, code lost:
        android.util.Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0463, code lost:
        A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
        if (java.util.Arrays.equals(r10, A0R) == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0472, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0473, code lost:
        A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0478, code lost:
        if (A0N != false) goto L_0x047a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x047a, code lost:
        A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x047d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        r14 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        if (r0 != 1) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        r0 = r7.readLong();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        if (r0 >= 16) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0079, code lost:
        r14 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007f, code lost:
        if (r0 <= com.facebook.proxygen.LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0081, code lost:
        r0 = com.facebook.proxygen.LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0083, code lost:
        r0 = r0 - r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0086, code lost:
        if (r0 < 8) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0088, code lost:
        r6 = new byte[4];
        r14 = 0;
        r13 = false;
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0094, code lost:
        if (r14 >= (r0 / 4)) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r7.readFully(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009b, code lost:
        if (r14 == 1) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a3, code lost:
        if (java.util.Arrays.equals(r6, A0Q) == false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a5, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ad, code lost:
        if (java.util.Arrays.equals(r6, A0P) == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00af, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b0, code lost:
        if (r13 == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b2, code lost:
        if (r12 == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b5, code lost:
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r7.close();
        r1 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bf, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c3, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c4, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c9, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00cc, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r3 = new X.C227962kZ(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r0 = A03(r3);
        r4.A09 = r0;
        r3.A02 = r0;
        r1 = r3.readShort();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e6, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ea, code lost:
        if (r6 == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ec, code lost:
        r1 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00ee, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r3 = new X.C227962kZ(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r0 = A03(r3);
        r4.A09 = r0;
        r3.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0102, code lost:
        if (r3.readShort() == 85) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0104, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0108, code lost:
        if (r6 == false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x010a, code lost:
        r1 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x010d, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r3 = A0Z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0112, code lost:
        if (r6 < 8) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0114, code lost:
        r1 = r9[r6];
        r0 = r3[r6];
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x011a, code lost:
        if (r1 != r0) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x011c, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x011d, code lost:
        r0 = A0g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0120, code lost:
        if (r3 < 4) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0126, code lost:
        if (r9[r3] == r0[r3]) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0128, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x012b, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x012c, code lost:
        r3 = A0h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x012e, code lost:
        if (r6 < 4) goto L_0x0130;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x00e7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x0105 */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0145 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:18:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015d A[Catch:{ IOException | UnsupportedOperationException -> 0x0457 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0208 A[Catch:{ IOException | UnsupportedOperationException -> 0x0457 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02b0 A[Catch:{ IOException | UnsupportedOperationException -> 0x0457 }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0452 A[Catch:{ IOException | UnsupportedOperationException -> 0x0457 }, ExcHandler: all (th java.lang.Throwable), PHI: r3 
      PHI: (r3v20 X.2kZ) = (r3v26 X.2kZ), (r3v27 X.2kZ) binds: [B:76:0x00f4, B:62:0x00d2] A[DONT_GENERATE, DONT_INLINE], Splitter:B:62:0x00d2] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0457 A[ExcHandler: IOException | UnsupportedOperationException (r3v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:68:0x00e7] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:262:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0H(java.io.InputStream r19) {
        /*
            r18 = this;
            r8 = 0
            r1 = 0
        L_0x0002:
            r4 = r18
            java.util.HashMap[] r5 = r4.A0I     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r0.<init>()     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r5[r1] = r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            int r1 = r1 + 1
            r0 = 10
            if (r1 < r0) goto L_0x0002
            r0 = 5000(0x1388, float:7.006E-42)
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r1 = r19
            r2.<init>(r1, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r2.mark(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            byte[] r9 = new byte[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r2.read(r9)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r2.reset()     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r6 = 0
        L_0x0028:
            byte[] r3 = A0T     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r0 = 3
            if (r6 >= r0) goto L_0x014b
            byte r1 = r9[r6]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            byte r0 = r3[r6]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            if (r1 == r0) goto L_0x004b
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.lang.String r0 = "FUJIFILMCCD-RAW"
            byte[] r6 = r0.getBytes(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r3 = 0
        L_0x003e:
            int r0 = r6.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            if (r3 >= r0) goto L_0x0148
            byte r1 = r9[r3]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            byte r0 = r6[r3]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            if (r1 == r0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            int r3 = r3 + 1
            goto L_0x003e
        L_0x004b:
            int r6 = r6 + 1
            goto L_0x0028
        L_0x004e:
            X.2kZ r7 = new X.2kZ     // Catch:{ Exception -> 0x00cc, all -> 0x0145 }
            r7.<init>(r9)     // Catch:{ Exception -> 0x00cc, all -> 0x0145 }
            int r0 = r7.readInt()     // Catch:{ all -> 0x00c3 }
            long r0 = (long) r0     // Catch:{ all -> 0x00c3 }
            r6 = 4
            byte[] r10 = new byte[r6]     // Catch:{ all -> 0x00c3 }
            r7.readFully(r10)     // Catch:{ all -> 0x00c3 }
            byte[] r3 = A0R     // Catch:{ all -> 0x00c3 }
            boolean r3 = java.util.Arrays.equals(r10, r3)     // Catch:{ all -> 0x00c3 }
            if (r3 == 0) goto L_0x00bf
            r14 = 16
            r12 = 8
            r16 = 1
            int r3 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r3 != 0) goto L_0x0079
            long r0 = r7.readLong()     // Catch:{ all -> 0x00c3 }
            int r3 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r3 >= 0) goto L_0x007b
            goto L_0x00bf
        L_0x0079:
            r14 = 8
        L_0x007b:
            r10 = 5000(0x1388, double:2.4703E-320)
            int r3 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x0083
            r0 = 5000(0x1388, double:2.4703E-320)
        L_0x0083:
            long r0 = r0 - r14
            int r3 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r3 < 0) goto L_0x00bf
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x00c3 }
            r14 = 0
            r13 = 0
            r12 = 0
        L_0x008e:
            r10 = 4
            long r10 = r0 / r10
            int r3 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r3 >= 0) goto L_0x00bf
            r7.readFully(r6)     // Catch:{ Exception -> 0x00c9 }
            int r3 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r3 == 0) goto L_0x00b5
            byte[] r3 = A0Q     // Catch:{ all -> 0x00c3 }
            boolean r3 = java.util.Arrays.equals(r6, r3)     // Catch:{ all -> 0x00c3 }
            if (r3 == 0) goto L_0x00a7
            r13 = 1
            goto L_0x00b2
        L_0x00a7:
            byte[] r3 = A0P     // Catch:{ all -> 0x00c3 }
            boolean r3 = java.util.Arrays.equals(r6, r3)     // Catch:{ all -> 0x00c3 }
            if (r3 == 0) goto L_0x00b0
            r12 = 1
        L_0x00b0:
            if (r13 == 0) goto L_0x00b5
        L_0x00b2:
            if (r12 == 0) goto L_0x00b5
            goto L_0x00b8
        L_0x00b5:
            long r14 = r14 + r16
            goto L_0x008e
        L_0x00b8:
            r7.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r1 = 12
            goto L_0x014c
        L_0x00bf:
            r7.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            goto L_0x00cc
        L_0x00c3:
            r1 = move-exception
            r7.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            goto L_0x0456
        L_0x00c9:
            r7.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
        L_0x00cc:
            r6 = 0
            X.2kZ r3 = new X.2kZ     // Catch:{ Exception -> 0x00ea, all -> 0x0145 }
            r3.<init>(r9)     // Catch:{ Exception -> 0x00ea, all -> 0x0145 }
            java.nio.ByteOrder r0 = A03(r3)     // Catch:{ Exception -> 0x00e7, all -> 0x0452 }
            r4.A09 = r0     // Catch:{ Exception -> 0x00e7, all -> 0x0452 }
            r3.A02 = r0     // Catch:{ Exception -> 0x00e7, all -> 0x0452 }
            short r1 = r3.readShort()     // Catch:{ Exception -> 0x00e7, all -> 0x0452 }
            r0 = 20306(0x4f52, float:2.8455E-41)
            if (r1 == r0) goto L_0x00e6
            r0 = 21330(0x5352, float:2.989E-41)
            if (r1 != r0) goto L_0x00e7
        L_0x00e6:
            r6 = 1
        L_0x00e7:
            r3.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
        L_0x00ea:
            if (r6 == 0) goto L_0x00ee
            r1 = 7
            goto L_0x014c
        L_0x00ee:
            r6 = 0
            X.2kZ r3 = new X.2kZ     // Catch:{ Exception -> 0x0108, all -> 0x0145 }
            r3.<init>(r9)     // Catch:{ Exception -> 0x0108, all -> 0x0145 }
            java.nio.ByteOrder r0 = A03(r3)     // Catch:{ Exception -> 0x0105, all -> 0x0452 }
            r4.A09 = r0     // Catch:{ Exception -> 0x0105, all -> 0x0452 }
            r3.A02 = r0     // Catch:{ Exception -> 0x0105, all -> 0x0452 }
            short r1 = r3.readShort()     // Catch:{ Exception -> 0x0105, all -> 0x0452 }
            r0 = 85
            if (r1 != r0) goto L_0x0105
            r6 = 1
        L_0x0105:
            r3.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
        L_0x0108:
            if (r6 == 0) goto L_0x010d
            r1 = 10
            goto L_0x014c
        L_0x010d:
            r6 = 0
        L_0x010e:
            byte[] r3 = A0Z     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r0 = 8
            if (r6 >= r0) goto L_0x0142
            byte r1 = r9[r6]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            byte r0 = r3[r6]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            int r6 = r6 + 1
            if (r1 == r0) goto L_0x010e
            r3 = 0
        L_0x011d:
            byte[] r0 = A0g     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r7 = 4
            if (r3 >= r7) goto L_0x012b
            byte r1 = r9[r3]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            byte r0 = r0[r3]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            if (r1 != r0) goto L_0x013d
            int r3 = r3 + 1
            goto L_0x011d
        L_0x012b:
            r6 = 0
        L_0x012c:
            byte[] r3 = A0h     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            if (r6 >= r7) goto L_0x013f
            int r0 = r6 + 4
            int r0 = r0 + 4
            byte r1 = r9[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            byte r0 = r3[r6]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            if (r1 != r0) goto L_0x013d
            int r6 = r6 + 1
            goto L_0x012c
        L_0x013d:
            r1 = 0
            goto L_0x014c
        L_0x013f:
            r1 = 14
            goto L_0x014c
        L_0x0142:
            r1 = 13
            goto L_0x014c
        L_0x0145:
            r1 = move-exception
            goto L_0x0456
        L_0x0148:
            r1 = 9
            goto L_0x014c
        L_0x014b:
            r1 = 4
        L_0x014c:
            r4.A00 = r1     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r0 = 4
            if (r1 == r0) goto L_0x02b0
            r0 = 9
            if (r1 == r0) goto L_0x02b0
            r0 = 13
            if (r1 == r0) goto L_0x02b0
            r0 = 14
            if (r1 == r0) goto L_0x02b0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            X.50S r6 = new X.50S     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r6.<init>(r2, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            boolean r0 = r2.markSupported()     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            if (r0 == 0) goto L_0x02a7
            java.io.DataInputStream r0 = r6.A04     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0.mark(r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            int r1 = r4.A00     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r0 = 12
            if (r1 != r0) goto L_0x0186
            r4.A0D(r6)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
        L_0x017b:
            int r0 = r4.A01     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            long r0 = (long) r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r6.A01(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r4.A0A(r6)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            goto L_0x0467
        L_0x0186:
            r2 = 7
            if (r1 != r2) goto L_0x0265
            r4.A0E(r6)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r11 = 1
            r1 = r5[r11]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.lang.String r0 = "MakerNote"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            X.2kb r0 = (X.C227982kb) r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            if (r0 == 0) goto L_0x017b
            byte[] r0 = r0.A03     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            X.50S r7 = new X.50S     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r7.<init>(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.io.DataInputStream r0 = r7.A04     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r0.mark(r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.nio.ByteOrder r0 = r4.A09     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r7.A02 = r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            byte[] r10 = A0U     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r0 = 6
            byte[] r9 = new byte[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r7.readFully(r9)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r0 = 0
            r7.A01(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            byte[] r3 = A0V     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r0 = 10
            byte[] r1 = new byte[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r7.readFully(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            boolean r0 = java.util.Arrays.equals(r9, r10)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            if (r0 == 0) goto L_0x01c8
            r0 = 8
            goto L_0x01d0
        L_0x01c8:
            boolean r0 = java.util.Arrays.equals(r1, r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            if (r0 == 0) goto L_0x01d3
            r0 = 12
        L_0x01d0:
            r7.A01(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
        L_0x01d3:
            r0 = 6
            r4.A0F(r7, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r1 = r5[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.lang.String r0 = "PreviewImageStart"
            java.lang.Object r7 = r1.get(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r1 = r5[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.lang.String r0 = "PreviewImageLength"
            java.lang.Object r3 = r1.get(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            if (r7 == 0) goto L_0x01fa
            if (r3 == 0) goto L_0x01fa
            r2 = 5
            r1 = r5[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.lang.String r0 = "JPEGInterchangeFormat"
            r1.put(r0, r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r1 = r5[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.lang.String r0 = "JPEGInterchangeFormatLength"
            r1.put(r0, r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
        L_0x01fa:
            r0 = 8
            r1 = r5[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.lang.String r0 = "AspectFrame"
            java.lang.Object r1 = r1.get(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            X.2kb r1 = (X.C227982kb) r1     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            if (r1 == 0) goto L_0x017b
            java.nio.ByteOrder r0 = r4.A09     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.lang.Object r9 = r1.A04(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            int[] r9 = (int[]) r9     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            if (r9 == 0) goto L_0x0254
            int r1 = r9.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r0 = 4
            if (r1 != r0) goto L_0x0254
            r0 = 2
            r7 = r9[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r3 = r9[r8]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            if (r7 <= r3) goto L_0x017b
            r0 = 3
            r2 = r9[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r1 = r9[r11]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            if (r2 <= r1) goto L_0x017b
            int r7 = r7 - r3
            int r0 = r7 + 1
            int r2 = r2 - r1
            int r2 = r2 + 1
            if (r0 >= r2) goto L_0x0230
            int r0 = r0 + r2
            int r2 = r0 - r2
            int r0 = r0 - r2
        L_0x0230:
            java.nio.ByteOrder r1 = r4.A09     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            int[] r0 = new int[]{r0}     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            X.2kb r3 = X.C227982kb.A00(r1, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.nio.ByteOrder r1 = r4.A09     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            int[] r0 = new int[]{r2}     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            X.2kb r2 = X.C227982kb.A00(r1, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r1 = r5[r8]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.lang.String r0 = "ImageWidth"
            r1.put(r0, r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r1 = r5[r8]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.lang.String r0 = "ImageLength"
            r1.put(r0, r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            goto L_0x017b
        L_0x0254:
            java.lang.String r1 = "Invalid aspect frame values. frame="
            java.lang.String r0 = java.util.Arrays.toString(r9)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.w(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            goto L_0x017b
        L_0x0265:
            r0 = 10
            if (r1 != r0) goto L_0x02a2
            r4.A0E(r6)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r1 = r5[r8]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.lang.String r0 = "JpgFromRaw"
            java.lang.Object r1 = r1.get(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            X.2kb r1 = (X.C227982kb) r1     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            if (r1 == 0) goto L_0x0286
            byte[] r0 = r1.A03     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            X.2kZ r7 = new X.2kZ     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r7.<init>(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            long r2 = r1.A02     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            int r1 = (int) r2     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r0 = 5
            r4.A0B(r7, r1, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
        L_0x0286:
            r1 = r5[r8]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.lang.String r0 = "ISO"
            java.lang.Object r3 = r1.get(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r2 = 1
            r0 = r5[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.lang.String r1 = "PhotographicSensitivity"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            if (r3 == 0) goto L_0x017b
            if (r0 != 0) goto L_0x017b
            r0 = r5[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r0.put(r1, r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            goto L_0x017b
        L_0x02a2:
            r4.A0E(r6)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            goto L_0x017b
        L_0x02a7:
            java.lang.String r0 = "Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r1.<init>(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            goto L_0x0456
        L_0x02b0:
            java.nio.ByteOrder r9 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            X.2kZ r7 = new X.2kZ     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r7.<init>(r2, r9)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            int r1 = r4.A00     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r0 = 4
            if (r1 != r0) goto L_0x02c1
            r4.A0B(r7, r8, r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            goto L_0x0467
        L_0x02c1:
            r0 = 13
            if (r1 != r0) goto L_0x0360
            r7.A02 = r9     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r0 = 8
            r7.A00(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r9 = 8
        L_0x02ce:
            int r2 = r7.readInt()     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            r1 = 4
            int r0 = r9 + 4
            byte[] r1 = new byte[r1]     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            r7.readFully(r1)     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            int r9 = r0 + 4
            r0 = 16
            if (r9 != r0) goto L_0x02f0
            byte[] r0 = A0Y     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            if (r0 != 0) goto L_0x02f0
            java.lang.String r0 = "Encountered invalid PNG file--IHDR chunk should appearas the first chunk"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            r1.<init>(r0)     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            goto L_0x0356
        L_0x02f0:
            byte[] r0 = A0X     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            if (r0 != 0) goto L_0x0467
            byte[] r0 = A0W     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            if (r0 == 0) goto L_0x032d
            byte[] r6 = new byte[r2]     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            r7.readFully(r6)     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            int r5 = r7.readInt()     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            java.util.zip.CRC32 r3 = new java.util.zip.CRC32     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            r3.<init>()     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            r3.update(r1)     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            r3.update(r6)     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            long r1 = r3.getValue()     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            int r0 = (int) r1     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            if (r0 != r5) goto L_0x0334
            r4.A01 = r9     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            r4.A0K(r6, r8)     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            r4.A06()     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            X.2kZ r0 = new X.2kZ     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            r0.<init>(r6)     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            r4.A0A(r0)     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            goto L_0x0467
        L_0x032d:
            int r0 = r2 + 4
            r7.A00(r0)     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            int r9 = r9 + r0
            goto L_0x02ce
        L_0x0334:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            r2.<init>()     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            java.lang.String r0 = "Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: "
            r2.append(r0)     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            r2.append(r5)     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            java.lang.String r0 = ", calculated CRC value: "
            r2.append(r0)     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            long r0 = r3.getValue()     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            r2.append(r0)     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            java.lang.String r0 = r2.toString()     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
            r1.<init>(r0)     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
        L_0x0356:
            throw r1     // Catch:{ EOFException -> 0x0357, IOException | UnsupportedOperationException -> 0x0457 }
        L_0x0357:
            java.lang.String r0 = "Encountered corrupt PNG file."
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r1.<init>(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            goto L_0x0456
        L_0x0360:
            r0 = 9
            if (r1 != r0) goto L_0x03f2
            r0 = 84
            r7.A00(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r2 = 4
            byte[] r0 = new byte[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            byte[] r1 = new byte[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            byte[] r2 = new byte[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r7.readFully(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r7.readFully(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r7.readFully(r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            int r6 = r0.getInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            int r1 = r0.getInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            int r3 = r0.getInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            byte[] r2 = new byte[r1]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            int r0 = r7.A01     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            int r0 = r6 - r0
            r7.A00(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r7.readFully(r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            X.2kZ r1 = new X.2kZ     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r1.<init>(r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r0 = 5
            r4.A0B(r1, r6, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            int r0 = r7.A01     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            int r3 = r3 - r0
            r7.A00(r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r7.A02 = r9     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            int r6 = r7.readInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r3 = 0
        L_0x03b3:
            if (r3 >= r6) goto L_0x0467
            int r2 = r7.readUnsignedShort()     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            int r1 = r7.readUnsignedShort()     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r0 = 273(0x111, float:3.83E-43)
            if (r2 != r0) goto L_0x03ec
            short r0 = r7.readShort()     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            short r2 = r7.readShort()     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.nio.ByteOrder r1 = r4.A09     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            int[] r0 = new int[]{r0}     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            X.2kb r3 = X.C227982kb.A00(r1, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.nio.ByteOrder r1 = r4.A09     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            int[] r0 = new int[]{r2}     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            X.2kb r2 = X.C227982kb.A00(r1, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r1 = r5[r8]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.lang.String r0 = "ImageLength"
            r1.put(r0, r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r1 = r5[r8]     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            java.lang.String r0 = "ImageWidth"
            r1.put(r0, r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            goto L_0x0467
        L_0x03ec:
            r7.A00(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            int r3 = r3 + 1
            goto L_0x03b3
        L_0x03f2:
            r0 = 14
            if (r1 != r0) goto L_0x0467
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r7.A02 = r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r6 = 4
            r7.A00(r6)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            int r0 = r7.readInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            int r5 = r0 + 8
            r7.A00(r6)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r2 = 12
            goto L_0x040d
        L_0x040a:
            r7.A00(r3)     // Catch:{ EOFException -> 0x044a, IOException | UnsupportedOperationException -> 0x0457 }
        L_0x040d:
            byte[] r1 = new byte[r6]     // Catch:{ EOFException -> 0x044a, IOException | UnsupportedOperationException -> 0x0457 }
            r7.readFully(r1)     // Catch:{ EOFException -> 0x044a, IOException | UnsupportedOperationException -> 0x0457 }
            int r0 = r2 + 4
            int r3 = r7.readInt()     // Catch:{ EOFException -> 0x044a, IOException | UnsupportedOperationException -> 0x0457 }
            int r2 = r0 + 4
            byte[] r0 = A0c     // Catch:{ EOFException -> 0x044a, IOException | UnsupportedOperationException -> 0x0457 }
            boolean r0 = java.util.Arrays.equals(r0, r1)     // Catch:{ EOFException -> 0x044a, IOException | UnsupportedOperationException -> 0x0457 }
            if (r0 == 0) goto L_0x0435
            byte[] r1 = new byte[r3]     // Catch:{ EOFException -> 0x044a, IOException | UnsupportedOperationException -> 0x0457 }
            r7.readFully(r1)     // Catch:{ EOFException -> 0x044a, IOException | UnsupportedOperationException -> 0x0457 }
            r4.A01 = r2     // Catch:{ EOFException -> 0x044a, IOException | UnsupportedOperationException -> 0x0457 }
            r4.A0K(r1, r8)     // Catch:{ EOFException -> 0x044a, IOException | UnsupportedOperationException -> 0x0457 }
            X.2kZ r0 = new X.2kZ     // Catch:{ EOFException -> 0x044a, IOException | UnsupportedOperationException -> 0x0457 }
            r0.<init>(r1)     // Catch:{ EOFException -> 0x044a, IOException | UnsupportedOperationException -> 0x0457 }
            r4.A0A(r0)     // Catch:{ EOFException -> 0x044a, IOException | UnsupportedOperationException -> 0x0457 }
            goto L_0x0467
        L_0x0435:
            int r1 = r3 % 2
            r0 = 1
            if (r1 != r0) goto L_0x043c
            int r3 = r3 + 1
        L_0x043c:
            int r2 = r2 + r3
            if (r2 == r5) goto L_0x0467
            if (r2 > r5) goto L_0x0442
            goto L_0x040a
        L_0x0442:
            java.lang.String r1 = "Encountered WebP file with invalid chunk size"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ EOFException -> 0x044a, IOException | UnsupportedOperationException -> 0x0457 }
            r0.<init>(r1)     // Catch:{ EOFException -> 0x044a, IOException | UnsupportedOperationException -> 0x0457 }
            throw r0     // Catch:{ EOFException -> 0x044a, IOException | UnsupportedOperationException -> 0x0457 }
        L_0x044a:
            java.lang.String r0 = "Encountered corrupt WebP file."
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            r1.<init>(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
            goto L_0x0456
        L_0x0452:
            r1 = move-exception
            r3.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
        L_0x0456:
            throw r1     // Catch:{ IOException | UnsupportedOperationException -> 0x0457 }
        L_0x0457:
            r3 = move-exception
            boolean r2 = A0N     // Catch:{ all -> 0x0472 }
            if (r2 == 0) goto L_0x0463
            java.lang.String r1 = "ExifInterface"
            java.lang.String r0 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r0, r3)     // Catch:{ all -> 0x0472 }
        L_0x0463:
            r4.A04()
            goto L_0x046c
        L_0x0467:
            r4.A04()
            boolean r2 = A0N
        L_0x046c:
            if (r2 == 0) goto L_0x0471
            r4.A05()
        L_0x0471:
            return
        L_0x0472:
            r1 = move-exception
            r4.A04()
            boolean r0 = A0N
            if (r0 == 0) goto L_0x047d
            r4.A05()
        L_0x047d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227922kK.A0H(java.io.InputStream):void");
    }

    private void A0J(String str) {
        int i = 0;
        do {
            this.A0I[i].remove(str);
            i++;
        } while (i < 10);
    }

    static {
        AnonymousClass2kM[] r61 = new AnonymousClass2kM[42];
        System.arraycopy(new AnonymousClass2kM[]{new AnonymousClass2kM("NewSubfileType", 254, 4), new AnonymousClass2kM("SubfileType", 255, 4), new AnonymousClass2kM("ImageWidth", 256, 3, 4), new AnonymousClass2kM("ImageLength", 257, 3, 4), new AnonymousClass2kM("BitsPerSample", 258, 3), new AnonymousClass2kM("Compression", 259, 3), new AnonymousClass2kM("PhotometricInterpretation", 262, 3), new AnonymousClass2kM("ImageDescription", 270, 2), new AnonymousClass2kM("Make", 271, 2), new AnonymousClass2kM("Model", 272, 2), new AnonymousClass2kM("StripOffsets", 273, 3, 4), new AnonymousClass2kM("Orientation", 274, 3), new AnonymousClass2kM("SamplesPerPixel", 277, 3), new AnonymousClass2kM("RowsPerStrip", 278, 3, 4), new AnonymousClass2kM("StripByteCounts", 279, 3, 4), new AnonymousClass2kM("XResolution", 282, 5), new AnonymousClass2kM("YResolution", 283, 5), new AnonymousClass2kM("PlanarConfiguration", 284, 3), new AnonymousClass2kM("ResolutionUnit", 296, 3), new AnonymousClass2kM("TransferFunction", 301, 3), new AnonymousClass2kM("Software", 305, 2), new AnonymousClass2kM("DateTime", 306, 2), new AnonymousClass2kM("Artist", 315, 2), new AnonymousClass2kM("WhitePoint", 318, 5), new AnonymousClass2kM("PrimaryChromaticities", 319, 5), new AnonymousClass2kM("SubIFDPointer", 330, 4), new AnonymousClass2kM("JPEGInterchangeFormat", 513, 4)}, 0, r61, 0, 27);
        System.arraycopy(new AnonymousClass2kM[]{new AnonymousClass2kM("JPEGInterchangeFormatLength", 514, 4), new AnonymousClass2kM("YCbCrCoefficients", 529, 5), new AnonymousClass2kM("YCbCrSubSampling", 530, 3), new AnonymousClass2kM("YCbCrPositioning", 531, 3), new AnonymousClass2kM("ReferenceBlackWhite", 532, 5), new AnonymousClass2kM("Copyright", 33432, 2), new AnonymousClass2kM("ExifIFDPointer", 34665, 4), new AnonymousClass2kM("GPSInfoIFDPointer", 34853, 4), new AnonymousClass2kM("SensorTopBorder", 4, 4), new AnonymousClass2kM("SensorLeftBorder", 5, 4), new AnonymousClass2kM("SensorBottomBorder", 6, 4), new AnonymousClass2kM("SensorRightBorder", 7, 4), new AnonymousClass2kM("ISO", 23, 3), new AnonymousClass2kM("JpgFromRaw", 46, 7), new AnonymousClass2kM("Xmp", 700, 1)}, 0, r61, 27, 15);
        A11 = r61;
        AnonymousClass2kM[] r51 = new AnonymousClass2kM[74];
        System.arraycopy(new AnonymousClass2kM[]{new AnonymousClass2kM("ExposureTime", 33434, 5), new AnonymousClass2kM("FNumber", 33437, 5), new AnonymousClass2kM("ExposureProgram", 34850, 3), new AnonymousClass2kM("SpectralSensitivity", 34852, 2), new AnonymousClass2kM("PhotographicSensitivity", 34855, 3), new AnonymousClass2kM("OECF", 34856, 7), new AnonymousClass2kM("SensitivityType", 34864, 3), new AnonymousClass2kM("StandardOutputSensitivity", 34865, 4), new AnonymousClass2kM("RecommendedExposureIndex", 34866, 4), new AnonymousClass2kM("ISOSpeed", 34867, 4), new AnonymousClass2kM("ISOSpeedLatitudeyyy", 34868, 4), new AnonymousClass2kM("ISOSpeedLatitudezzz", 34869, 4), new AnonymousClass2kM("ExifVersion", 36864, 2), new AnonymousClass2kM("DateTimeOriginal", 36867, 2), new AnonymousClass2kM("DateTimeDigitized", 36868, 2), new AnonymousClass2kM("OffsetTime", 36880, 2), new AnonymousClass2kM("OffsetTimeOriginal", 36881, 2), new AnonymousClass2kM("OffsetTimeDigitized", 36882, 2), new AnonymousClass2kM("ComponentsConfiguration", 37121, 7), new AnonymousClass2kM("CompressedBitsPerPixel", 37122, 5), new AnonymousClass2kM("ShutterSpeedValue", 37377, 10), new AnonymousClass2kM("ApertureValue", 37378, 5), new AnonymousClass2kM("BrightnessValue", 37379, 10), new AnonymousClass2kM("ExposureBiasValue", 37380, 10), new AnonymousClass2kM("MaxApertureValue", 37381, 5), new AnonymousClass2kM("SubjectDistance", 37382, 5), new AnonymousClass2kM("MeteringMode", 37383, 3)}, 0, r51, 0, 27);
        System.arraycopy(new AnonymousClass2kM[]{new AnonymousClass2kM("LightSource", 37384, 3), new AnonymousClass2kM("Flash", 37385, 3), new AnonymousClass2kM("FocalLength", 37386, 5), new AnonymousClass2kM("SubjectArea", 37396, 3), new AnonymousClass2kM("MakerNote", 37500, 7), new AnonymousClass2kM("UserComment", 37510, 7), new AnonymousClass2kM("SubSecTime", 37520, 2), new AnonymousClass2kM("SubSecTimeOriginal", 37521, 2), new AnonymousClass2kM("SubSecTimeDigitized", 37522, 2), new AnonymousClass2kM("FlashpixVersion", 40960, 7), new AnonymousClass2kM("ColorSpace", 40961, 3), new AnonymousClass2kM("PixelXDimension", 40962, 3, 4), new AnonymousClass2kM("PixelYDimension", 40963, 3, 4), new AnonymousClass2kM("RelatedSoundFile", 40964, 2), new AnonymousClass2kM("InteroperabilityIFDPointer", 40965, 4), new AnonymousClass2kM("FlashEnergy", 41483, 5), new AnonymousClass2kM("SpatialFrequencyResponse", 41484, 7), new AnonymousClass2kM("FocalPlaneXResolution", 41486, 5), new AnonymousClass2kM("FocalPlaneYResolution", 41487, 5), new AnonymousClass2kM("FocalPlaneResolutionUnit", 41488, 3), new AnonymousClass2kM("SubjectLocation", 41492, 3), new AnonymousClass2kM("ExposureIndex", 41493, 5), new AnonymousClass2kM("SensingMethod", 41495, 3), new AnonymousClass2kM("FileSource", 41728, 7), new AnonymousClass2kM("SceneType", 41729, 7), new AnonymousClass2kM("CFAPattern", 41730, 7), new AnonymousClass2kM("CustomRendered", 41985, 3)}, 0, r51, 27, 27);
        System.arraycopy(new AnonymousClass2kM[]{new AnonymousClass2kM("ExposureMode", 41986, 3), new AnonymousClass2kM("WhiteBalance", 41987, 3), new AnonymousClass2kM("DigitalZoomRatio", 41988, 5), new AnonymousClass2kM("FocalLengthIn35mmFilm", 41989, 3), new AnonymousClass2kM("SceneCaptureType", 41990, 3), new AnonymousClass2kM("GainControl", 41991, 3), new AnonymousClass2kM("Contrast", 41992, 3), new AnonymousClass2kM("Saturation", 41993, 3), new AnonymousClass2kM("Sharpness", 41994, 3), new AnonymousClass2kM("DeviceSettingDescription", 41995, 7), new AnonymousClass2kM("SubjectDistanceRange", 41996, 3), new AnonymousClass2kM("ImageUniqueID", 42016, 2), new AnonymousClass2kM("CameraOwnerName", 42032, 2), new AnonymousClass2kM("BodySerialNumber", 42033, 2), new AnonymousClass2kM("LensSpecification", 42034, 5), new AnonymousClass2kM("LensMake", 42035, 2), new AnonymousClass2kM("LensModel", 42036, 2), new AnonymousClass2kM("Gamma", 42240, 5), new AnonymousClass2kM("DNGVersion", 50706, 1), new AnonymousClass2kM("DefaultCropSize", 50720, 3, 4)}, 0, r51, 54, 20);
        A0x = r51;
        AnonymousClass2kM[] r28 = new AnonymousClass2kM[32];
        System.arraycopy(new AnonymousClass2kM[]{new AnonymousClass2kM("GPSVersionID", 0, 1), new AnonymousClass2kM("GPSLatitudeRef", 1, 2), new AnonymousClass2kM("GPSLatitude", 2, 5, 10), new AnonymousClass2kM("GPSLongitudeRef", 3, 2), new AnonymousClass2kM("GPSLongitude", 4, 5, 10), new AnonymousClass2kM("GPSAltitudeRef", 5, 1), new AnonymousClass2kM("GPSAltitude", 6, 5), new AnonymousClass2kM("GPSTimeStamp", 7, 5), new AnonymousClass2kM("GPSSatellites", 8, 2), new AnonymousClass2kM("GPSStatus", 9, 2), new AnonymousClass2kM("GPSMeasureMode", 10, 2), new AnonymousClass2kM("GPSDOP", 11, 5), new AnonymousClass2kM("GPSSpeedRef", 12, 2), new AnonymousClass2kM("GPSSpeed", 13, 5), new AnonymousClass2kM("GPSTrackRef", 14, 2), new AnonymousClass2kM("GPSTrack", 15, 5), new AnonymousClass2kM("GPSImgDirectionRef", 16, 2), new AnonymousClass2kM("GPSImgDirection", 17, 5), new AnonymousClass2kM("GPSMapDatum", 18, 2), new AnonymousClass2kM("GPSDestLatitudeRef", 19, 2), new AnonymousClass2kM("GPSDestLatitude", 20, 5), new AnonymousClass2kM("GPSDestLongitudeRef", 21, 2), new AnonymousClass2kM("GPSDestLongitude", 22, 5), new AnonymousClass2kM("GPSDestBearingRef", 23, 2), new AnonymousClass2kM("GPSDestBearing", 24, 5), new AnonymousClass2kM("GPSDestDistanceRef", 25, 2), new AnonymousClass2kM("GPSDestDistance", 26, 5)}, 0, r28, 0, 27);
        System.arraycopy(new AnonymousClass2kM[]{new AnonymousClass2kM("GPSProcessingMethod", 27, 7), new AnonymousClass2kM("GPSAreaInformation", 28, 7), new AnonymousClass2kM("GPSDateStamp", 29, 2), new AnonymousClass2kM("GPSDifferential", 30, 3), new AnonymousClass2kM("GPSHPositioningError", 31, 5)}, 0, r28, 27, 5);
        A0y = r28;
        AnonymousClass2kM[] r105 = {new AnonymousClass2kM("InteroperabilityIndex", 1, 2)};
        A0z = r105;
        AnonymousClass2kM[] r8 = new AnonymousClass2kM[37];
        System.arraycopy(new AnonymousClass2kM[]{new AnonymousClass2kM("NewSubfileType", 254, 4), new AnonymousClass2kM("SubfileType", 255, 4), new AnonymousClass2kM("ThumbnailImageWidth", 256, 3, 4), new AnonymousClass2kM("ThumbnailImageLength", 257, 3, 4), new AnonymousClass2kM("BitsPerSample", 258, 3), new AnonymousClass2kM("Compression", 259, 3), new AnonymousClass2kM("PhotometricInterpretation", 262, 3), new AnonymousClass2kM("ImageDescription", 270, 2), new AnonymousClass2kM("Make", 271, 2), new AnonymousClass2kM("Model", 272, 2), new AnonymousClass2kM("StripOffsets", 273, 3, 4), new AnonymousClass2kM("ThumbnailOrientation", 274, 3), new AnonymousClass2kM("SamplesPerPixel", 277, 3), new AnonymousClass2kM("RowsPerStrip", 278, 3, 4), new AnonymousClass2kM("StripByteCounts", 279, 3, 4), new AnonymousClass2kM("XResolution", 282, 5), new AnonymousClass2kM("YResolution", 283, 5), new AnonymousClass2kM("PlanarConfiguration", 284, 3), new AnonymousClass2kM("ResolutionUnit", 296, 3), new AnonymousClass2kM("TransferFunction", 301, 3), new AnonymousClass2kM("Software", 305, 2), new AnonymousClass2kM("DateTime", 306, 2), new AnonymousClass2kM("Artist", 315, 2), new AnonymousClass2kM("WhitePoint", 318, 5), new AnonymousClass2kM("PrimaryChromaticities", 319, 5), new AnonymousClass2kM("SubIFDPointer", 330, 4), new AnonymousClass2kM("JPEGInterchangeFormat", 513, 4)}, 0, r8, 0, 27);
        System.arraycopy(new AnonymousClass2kM[]{new AnonymousClass2kM("JPEGInterchangeFormatLength", 514, 4), new AnonymousClass2kM("YCbCrCoefficients", 529, 5), new AnonymousClass2kM("YCbCrSubSampling", 530, 3), new AnonymousClass2kM("YCbCrPositioning", 531, 3), new AnonymousClass2kM("ReferenceBlackWhite", 532, 5), new AnonymousClass2kM("Copyright", 33432, 2), new AnonymousClass2kM("ExifIFDPointer", 34665, 4), new AnonymousClass2kM("GPSInfoIFDPointer", 34853, 4), new AnonymousClass2kM("DNGVersion", 50706, 1), new AnonymousClass2kM("DefaultCropSize", 50720, 3, 4)}, 0, r8, 27, 10);
        A10 = r8;
        AnonymousClass2kM[] r108 = {new AnonymousClass2kM("ThumbnailImage", 256, 7), new AnonymousClass2kM("CameraSettingsIFDPointer", 8224, 4), new AnonymousClass2kM("ImageProcessingIFDPointer", 8256, 4)};
        A14 = r108;
        AnonymousClass2kM[] r109 = {new AnonymousClass2kM("PreviewImageStart", 257, 4), new AnonymousClass2kM("PreviewImageLength", 258, 4)};
        A12 = r109;
        AnonymousClass2kM[] r110 = {new AnonymousClass2kM("AspectFrame", 4371, 3)};
        A13 = r110;
        AnonymousClass2kM[] r111 = {new AnonymousClass2kM("ColorSpace", 55, 3)};
        A15 = r111;
        A0n = new AnonymousClass2kM[][]{r61, r51, r28, r105, r8, r61, r108, r109, r110, r111};
        Charset forName = Charset.forName("US-ASCII");
        A0L = forName;
        A0S = "Exif\u0000\u0000".getBytes(forName);
        A0v = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        A0J = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        A0K = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            AnonymousClass2kM[][] r5 = A0n;
            if (i < 10) {
                HashMap[] hashMapArr = A16;
                hashMapArr[i] = new HashMap();
                HashMap[] hashMapArr2 = A17;
                hashMapArr2[i] = new HashMap();
                for (AnonymousClass2kM r6 : r5[i]) {
                    hashMapArr[i].put(Integer.valueOf(r6.A00), r6);
                    hashMapArr2[i].put(r6.A03, r6);
                }
                i++;
            } else {
                HashMap hashMap = A0o;
                AnonymousClass2kM[] r7 = A0w;
                hashMap.put(Integer.valueOf(r7[0].A00), 5);
                hashMap.put(Integer.valueOf(r7[1].A00), 1);
                hashMap.put(Integer.valueOf(r7[2].A00), 2);
                hashMap.put(Integer.valueOf(r7[3].A00), 3);
                hashMap.put(Integer.valueOf(r7[4].A00), 7);
                hashMap.put(Integer.valueOf(r7[5].A00), 8);
                return;
            }
        }
    }

    public static double A00(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            double parseDouble2 = Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim());
            String[] split4 = split[2].split("/", -1);
            double parseDouble3 = parseDouble + (parseDouble2 / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (str2.equals("S") || str2.equals("W")) {
                return -parseDouble3;
            }
            if (str2.equals("N") || str2.equals("E")) {
                return parseDouble3;
            }
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:63|64|65) */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        java.lang.Double.parseDouble(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0133, code lost:
        return new android.util.Pair(12, -1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0125 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A01(java.lang.String r13) {
        /*
            java.lang.String r1 = ","
            boolean r0 = r13.contains(r1)
            r9 = 0
            r5 = 1
            r8 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r6 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            if (r0 == 0) goto L_0x0095
            java.lang.String[] r7 = r13.split(r1, r6)
            r0 = r7[r9]
            android.util.Pair r2 = A01(r0)
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r8) goto L_0x0029
        L_0x0028:
            return r2
        L_0x0029:
            int r0 = r7.length
            if (r5 >= r0) goto L_0x0028
            r0 = r7[r5]
            android.util.Pair r9 = A01(r0)
            java.lang.Object r10 = r9.first
            java.lang.Object r0 = r2.first
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x008c
            java.lang.Object r1 = r9.second
            java.lang.Object r0 = r2.first
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x008c
            r8 = -1
        L_0x0047:
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == r6) goto L_0x008a
            java.lang.Object r0 = r2.second
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0063
            java.lang.Object r1 = r9.second
            java.lang.Object r0 = r2.second
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x008a
        L_0x0063:
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
        L_0x006b:
            if (r8 != r6) goto L_0x0075
            if (r0 != r6) goto L_0x0075
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r4, r3)
            return r2
        L_0x0075:
            if (r8 != r6) goto L_0x0083
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x007b:
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r0, r3)
        L_0x0080:
            int r5 = r5 + 1
            goto L_0x0029
        L_0x0083:
            if (r0 != r6) goto L_0x0080
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            goto L_0x007b
        L_0x008a:
            r0 = -1
            goto L_0x006b
        L_0x008c:
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r8 = r0.intValue()
            goto L_0x0047
        L_0x0095:
            java.lang.String r1 = "/"
            boolean r0 = r13.contains(r1)
            r11 = 0
            if (r0 == 0) goto L_0x00ec
            java.lang.String[] r2 = r13.split(r1, r6)
            int r0 = r2.length
            if (r0 != r8) goto L_0x0134
            r0 = r2[r9]     // Catch:{ NumberFormatException -> 0x0134 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x0134 }
            long r7 = (long) r0     // Catch:{ NumberFormatException -> 0x0134 }
            r0 = r2[r5]     // Catch:{ NumberFormatException -> 0x0134 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x0134 }
            long r5 = (long) r0     // Catch:{ NumberFormatException -> 0x0134 }
            r10 = 10
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00e2
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00e2
            r9 = 5
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00d8
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00d8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x0134 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ NumberFormatException -> 0x0134 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x0134 }
            r2.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x0134 }
            return r2
        L_0x00d8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ NumberFormatException -> 0x0134 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x0134 }
            r2.<init>(r0, r3)     // Catch:{ NumberFormatException -> 0x0134 }
            return r2
        L_0x00e2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x0134 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x0134 }
            r2.<init>(r0, r3)     // Catch:{ NumberFormatException -> 0x0134 }
            return r2
        L_0x00ec:
            long r6 = java.lang.Long.parseLong(r13)     // Catch:{ NumberFormatException -> 0x0125 }
            r5 = 4
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x010b
            r1 = 65535(0xffff, double:3.23786E-319)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x010b
            r0 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0125 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ NumberFormatException -> 0x0125 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x0125 }
            r2.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x0125 }
            return r2
        L_0x010b:
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x011b
            r0 = 9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0125 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x0125 }
            r2.<init>(r0, r3)     // Catch:{ NumberFormatException -> 0x0125 }
            return r2
        L_0x011b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ NumberFormatException -> 0x0125 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x0125 }
            r2.<init>(r0, r3)     // Catch:{ NumberFormatException -> 0x0125 }
            return r2
        L_0x0125:
            java.lang.Double.parseDouble(r13)     // Catch:{ NumberFormatException -> 0x0134 }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0134 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x0134 }
            r2.<init>(r0, r3)     // Catch:{ NumberFormatException -> 0x0134 }
            return r2
        L_0x0134:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227922kK.A01(java.lang.String):android.util.Pair");
    }

    public static C227982kb A02(C227922kK r2, String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        int i = 0;
        do {
            C227982kb r0 = (C227982kb) r2.A0I[i].get(str);
            if (r0 != null) {
                return r0;
            }
            i++;
        } while (i < 10);
        return null;
    }

    private void A04() {
        String A0N2 = A0N("DateTimeOriginal");
        if (A0N2 != null && A0N("DateTime") == null) {
            HashMap hashMap = this.A0I[0];
            byte[] bytes = 002.A0C(A0N2, 0).getBytes(A0L);
            hashMap.put("DateTime", new C227982kb(-1, bytes, 2, bytes.length));
        }
        if (A0N("ImageWidth") == null) {
            this.A0I[0].put("ImageWidth", C227982kb.A01(this.A09, new long[]{0}));
        }
        if (A0N("ImageLength") == null) {
            this.A0I[0].put("ImageLength", C227982kb.A01(this.A09, new long[]{0}));
        }
        if (A0N("Orientation") == null) {
            this.A0I[0].put("Orientation", C227982kb.A01(this.A09, new long[]{0}));
        }
        if (A0N("LightSource") == null) {
            this.A0I[1].put("LightSource", C227982kb.A01(this.A09, new long[]{0}));
        }
    }

    private void A07(int i, int i2) {
        HashMap[] hashMapArr = this.A0I;
        HashMap hashMap = hashMapArr[i];
        if (!hashMap.isEmpty() && !hashMapArr[i2].isEmpty()) {
            C227982kb r6 = (C227982kb) hashMap.get("ImageLength");
            C227982kb r2 = (C227982kb) hashMapArr[i].get("ImageWidth");
            C227982kb r1 = (C227982kb) hashMapArr[i2].get("ImageLength");
            C227982kb r4 = (C227982kb) hashMapArr[i2].get("ImageWidth");
            if (r6 != null && r2 != null && r1 != null && r4 != null) {
                int A032 = r6.A03(this.A09);
                int A033 = r2.A03(this.A09);
                int A034 = r1.A03(this.A09);
                int A035 = r4.A03(this.A09);
                if (A032 < A034 && A033 < A035) {
                    HashMap hashMap2 = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap2;
                }
            }
        }
    }

    private void A08(int i, String str, String str2) {
        HashMap[] hashMapArr = this.A0I;
        HashMap hashMap = hashMapArr[i];
        if (!hashMap.isEmpty() && hashMap.get(str) != null) {
            HashMap hashMap2 = hashMapArr[i];
            hashMap2.put(str2, hashMap2.get(str));
            hashMapArr[i].remove(str);
        }
    }

    private void A0A(C227962kZ r19) {
        int i;
        int i2;
        long[] jArr;
        long[] jArr2;
        String str;
        int length;
        int length2;
        C227982kb r1;
        HashMap hashMap = this.A0I[4];
        C227982kb r12 = (C227982kb) hashMap.get("Compression");
        C227962kZ r10 = r19;
        if (r12 != null) {
            int A032 = r12.A03(this.A09);
            this.A03 = A032;
            if (A032 != 1) {
                if (A032 != 6) {
                    if (A032 != 7) {
                        return;
                    }
                }
            }
            C227982kb r13 = (C227982kb) hashMap.get("BitsPerSample");
            if (r13 != null) {
                int[] iArr = (int[]) r13.A04(this.A09);
                int[] iArr2 = A0k;
                if (!Arrays.equals(iArr2, iArr)) {
                    if (this.A00 == 3 && (r1 = (C227982kb) hashMap.get("PhotometricInterpretation")) != null) {
                        int A033 = r1.A03(this.A09);
                        if (A033 == 1) {
                            if (!Arrays.equals(iArr, A0j)) {
                                return;
                            }
                        } else if (A033 != 6 || !Arrays.equals(iArr, iArr2)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                C227982kb r14 = (C227982kb) hashMap.get("StripOffsets");
                C227982kb r5 = (C227982kb) hashMap.get("StripByteCounts");
                if (r14 != null && r5 != null) {
                    Object A042 = r14.A04(this.A09);
                    if (A042 instanceof int[]) {
                        int[] iArr3 = (int[]) A042;
                        int length3 = iArr3.length;
                        jArr = new long[length3];
                        for (int i3 = 0; i3 < length3; i3++) {
                            jArr[i3] = (long) iArr3[i3];
                        }
                    } else if (A042 instanceof long[]) {
                        jArr = (long[]) A042;
                    } else {
                        jArr = null;
                    }
                    Object A043 = r5.A04(this.A09);
                    if (A043 instanceof int[]) {
                        int[] iArr4 = (int[]) A043;
                        int length4 = iArr4.length;
                        jArr2 = new long[length4];
                        for (int i4 = 0; i4 < length4; i4++) {
                            jArr2[i4] = (long) iArr4[i4];
                        }
                    } else if (A043 instanceof long[]) {
                        jArr2 = (long[]) A043;
                    } else {
                        jArr2 = null;
                    }
                    if (jArr == null || (length = jArr.length) == 0) {
                        str = "stripOffsets should not be null or have zero length.";
                    } else if (jArr2 == null || (length2 = jArr2.length) == 0) {
                        str = "stripByteCounts should not be null or have zero length.";
                    } else if (length != length2) {
                        str = "stripOffsets and stripByteCounts should have same length.";
                    } else {
                        long j = 0;
                        int i5 = 0;
                        do {
                            j += jArr2[i5];
                            i5++;
                        } while (i5 < length2);
                        i = (int) j;
                        byte[] bArr = new byte[i];
                        this.A0B = true;
                        this.A0D = true;
                        this.A0C = true;
                        int i6 = 0;
                        int i7 = 0;
                        int i8 = 0;
                        do {
                            int i9 = (int) jArr[i6];
                            int i10 = (int) jArr2[i6];
                            if (i6 < length - 1 && ((long) (i9 + i10)) != jArr[i6 + 1]) {
                                this.A0B = false;
                            }
                            int i11 = i9 - i7;
                            if (i11 >= 0) {
                                try {
                                    r10.A00(i11);
                                    int i12 = i7 + i11;
                                    byte[] bArr2 = new byte[i10];
                                    r10.readFully(bArr2);
                                    i7 = i12 + i10;
                                    System.arraycopy(bArr2, 0, bArr, i8, i10);
                                    i8 += i10;
                                    i6++;
                                } catch (EOFException unused) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } while (i6 < length);
                        this.A0F = bArr;
                        if (this.A0B) {
                            i2 = (int) jArr[0];
                            this.A05 = i2;
                            this.A04 = i;
                        }
                        return;
                    }
                    Log.w("ExifInterface", str);
                    return;
                }
                return;
            }
            return;
        }
        this.A03 = 6;
        C227982kb r2 = (C227982kb) hashMap.get("JPEGInterchangeFormat");
        C227982kb r15 = (C227982kb) hashMap.get("JPEGInterchangeFormatLength");
        if (r2 != null && r15 != null) {
            i2 = r2.A03(this.A09);
            i = r15.A03(this.A09);
            if (this.A00 == 7) {
                i2 += this.A02;
            }
            if (i2 > 0 && i > 0) {
                this.A0C = true;
                if (this.A08 == null && this.A06 == null && this.A07 == null) {
                    byte[] bArr3 = new byte[i];
                    r10.A00(i2);
                    r10.readFully(bArr3);
                    this.A0F = bArr3;
                }
                this.A05 = i2;
                this.A04 = i;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0096 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0055 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0B(X.C227962kZ r27, int r28, int r29) {
        /*
            r26 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r6 = r27
            r6.A02 = r0
            byte r0 = r6.readByte()
            java.lang.String r2 = "Invalid marker: "
            r14 = -1
            if (r0 != r14) goto L_0x016c
            byte r1 = r6.readByte()
            r0 = -40
            if (r1 != r0) goto L_0x015c
            r19 = 2
            r7 = 2
        L_0x001a:
            byte r0 = r6.readByte()
            if (r0 != r14) goto L_0x014a
            r8 = 1
            int r0 = r7 + 1
            byte r1 = r6.readByte()
            int r2 = r0 + 1
            r0 = -39
            r9 = r26
            if (r1 == r0) goto L_0x0145
            r0 = -38
            if (r1 == r0) goto L_0x0145
            int r11 = r6.readUnsignedShort()
            int r11 = r11 - r19
            int r7 = r2 + 2
            java.lang.String r10 = "Invalid length"
            if (r11 < 0) goto L_0x013f
            r0 = -31
            r5 = 0
            r13 = r29
            if (r1 == r0) goto L_0x00d2
            r0 = -2
            if (r1 == r0) goto L_0x00a2
            switch(r1) {
                case -64: goto L_0x005a;
                case -63: goto L_0x005a;
                case -62: goto L_0x005a;
                case -61: goto L_0x005a;
                default: goto L_0x004c;
            }
        L_0x004c:
            switch(r1) {
                case -59: goto L_0x005a;
                case -58: goto L_0x005a;
                case -57: goto L_0x005a;
                default: goto L_0x004f;
            }
        L_0x004f:
            switch(r1) {
                case -55: goto L_0x005a;
                case -54: goto L_0x005a;
                case -53: goto L_0x005a;
                default: goto L_0x0052;
            }
        L_0x0052:
            switch(r1) {
                case -51: goto L_0x005a;
                case -50: goto L_0x005a;
                case -49: goto L_0x005a;
                default: goto L_0x0055;
            }
        L_0x0055:
            r6.A00(r11)
            int r7 = r7 + r11
            goto L_0x001a
        L_0x005a:
            r6.A00(r8)
            java.util.HashMap[] r12 = r9.A0I
            r16 = r12[r29]
            r4 = 4
            if (r13 == r4) goto L_0x009f
            java.lang.String r3 = "ImageLength"
        L_0x0066:
            int r0 = r6.readUnsignedShort()
            long r1 = (long) r0
            java.nio.ByteOrder r15 = r9.A09
            long[] r0 = new long[r8]
            r0[r5] = r1
            X.2kb r1 = X.C227982kb.A01(r15, r0)
            r0 = r16
            r0.put(r3, r1)
            r2 = r12[r29]
            if (r13 == r4) goto L_0x009c
            java.lang.String r4 = "ImageWidth"
        L_0x0080:
            int r0 = r6.readUnsignedShort()
            long r0 = (long) r0
            java.nio.ByteOrder r9 = r9.A09
            long[] r3 = new long[r8]
            r3[r5] = r0
            X.2kb r0 = X.C227982kb.A01(r9, r3)
            r2.put(r4, r0)
            int r11 = r11 + -5
            if (r11 >= 0) goto L_0x0055
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r10)
            throw r0
        L_0x009c:
            java.lang.String r4 = "ThumbnailImageWidth"
            goto L_0x0080
        L_0x009f:
            java.lang.String r3 = "ThumbnailImageLength"
            goto L_0x0066
        L_0x00a2:
            byte[] r4 = new byte[r11]
            r6.readFully(r4)
            java.lang.String r2 = "UserComment"
            java.lang.String r0 = r9.A0N(r2)
            if (r0 != 0) goto L_0x013c
            java.util.HashMap[] r0 = r9.A0I
            r3 = r0[r8]
            java.nio.charset.Charset r1 = A0L
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r1)
            java.lang.String r0 = X.002.A0C(r0, r5)
            byte[] r1 = r0.getBytes(r1)
            int r0 = r1.length
            r16 = -1
            X.2kb r15 = new X.2kb
            r18 = r1
            r20 = r0
            r15.<init>(r16, r18, r19, r20)
            r3.put(r2, r15)
            goto L_0x013c
        L_0x00d2:
            byte[] r4 = new byte[r11]
            r6.readFully(r4)
            int r12 = r7 + r11
            byte[] r10 = A0S
            if (r10 == 0) goto L_0x00ec
            int r3 = r10.length
            if (r11 < r3) goto L_0x00ec
            r2 = 0
        L_0x00e1:
            if (r2 >= r3) goto L_0x0127
            byte r1 = r4[r2]
            byte r0 = r10[r2]
            if (r1 != r0) goto L_0x00ec
            int r2 = r2 + 1
            goto L_0x00e1
        L_0x00ec:
            byte[] r10 = A0v
            if (r10 == 0) goto L_0x013b
            int r3 = r10.length
            if (r11 < r3) goto L_0x013b
            r2 = 0
        L_0x00f4:
            if (r2 >= r3) goto L_0x00ff
            byte r1 = r4[r2]
            byte r0 = r10[r2]
            if (r1 != r0) goto L_0x013b
            int r2 = r2 + 1
            goto L_0x00f4
        L_0x00ff:
            int r7 = r7 + r3
            byte[] r11 = java.util.Arrays.copyOfRange(r4, r3, r11)
            java.lang.String r10 = "Xmp"
            java.lang.String r0 = r9.A0N(r10)
            if (r0 != 0) goto L_0x013b
            java.util.HashMap[] r0 = r9.A0I
            r4 = r0[r5]
            int r3 = r11.length
            long r0 = (long) r7
            X.2kb r2 = new X.2kb
            r20 = r2
            r21 = r0
            r23 = r11
            r24 = r8
            r25 = r3
            r20.<init>(r21, r23, r24, r25)
            r4.put(r10, r2)
            r9.A0E = r8
            goto L_0x013b
        L_0x0127:
            byte[] r1 = java.util.Arrays.copyOfRange(r4, r3, r11)
            int r0 = r28 + r7
            int r0 = r0 + r3
            r9.A01 = r0
            r9.A0K(r1, r13)
            X.2kZ r0 = new X.2kZ
            r0.<init>(r1)
            r9.A0A(r0)
        L_0x013b:
            r7 = r12
        L_0x013c:
            r11 = 0
            goto L_0x0055
        L_0x013f:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r10)
            throw r0
        L_0x0145:
            java.nio.ByteOrder r0 = r9.A09
            r6.A02 = r0
            return
        L_0x014a:
            java.lang.String r1 = "Invalid marker:"
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x015c:
            r0 = 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r1 = X.002.A0R(r2, r0)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x016c:
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r1 = X.002.A0R(r2, r0)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227922kK.A0B(X.2kZ, int, int):void");
    }

    private void A0C(RCC rcc) {
        HashMap[] hashMapArr;
        byte[] bArr;
        long j;
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        AnonymousClass2kM[] r19 = A0w;
        int i = 0;
        do {
            A0J(r19[i].A03);
            i++;
        } while (i < 6);
        if (this.A0C) {
            if (this.A0D) {
                A0J("StripOffsets");
                A0J("StripByteCounts");
            } else {
                A0J("JPEGInterchangeFormat");
                A0J("JPEGInterchangeFormatLength");
            }
        }
        int i2 = 0;
        do {
            hashMapArr = this.A0I;
            for (Object obj : hashMapArr[i2].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    hashMapArr[i2].remove(entry.getKey());
                }
            }
            i2++;
        } while (i2 < 10);
        if (!hashMapArr[1].isEmpty()) {
            hashMapArr[0].put(r19[1].A03, C227982kb.A01(this.A09, new long[]{0}));
        }
        if (!hashMapArr[2].isEmpty()) {
            hashMapArr[0].put(r19[2].A03, C227982kb.A01(this.A09, new long[]{0}));
        }
        if (!hashMapArr[3].isEmpty()) {
            hashMapArr[1].put(r19[3].A03, C227982kb.A01(this.A09, new long[]{0}));
        }
        if (this.A0C) {
            boolean z = this.A0D;
            HashMap hashMap = hashMapArr[4];
            if (z) {
                hashMap.put("StripOffsets", C227982kb.A00(this.A09, new int[]{0}));
                hashMapArr[4].put("StripByteCounts", C227982kb.A00(this.A09, new int[]{this.A04}));
            } else {
                hashMap.put("JPEGInterchangeFormat", C227982kb.A01(this.A09, new long[]{0}));
                hashMapArr[4].put("JPEGInterchangeFormatLength", C227982kb.A01(this.A09, new long[]{(long) this.A04}));
            }
        }
        int i3 = 0;
        do {
            int i4 = 0;
            for (Map.Entry value : hashMapArr[i3].entrySet()) {
                C227982kb r13 = (C227982kb) value.getValue();
                int i5 = A0l[r13.A00] * r13.A01;
                if (i5 > 4) {
                    i4 += i5;
                }
            }
            iArr2[i3] = iArr2[i3] + i4;
            i3++;
        } while (i3 < 10);
        int i6 = 8;
        int i7 = 0;
        do {
            if (!hashMapArr[i7].isEmpty()) {
                iArr[i7] = i6;
                i6 += (hashMapArr[i7].size() * 12) + 2 + 4 + iArr2[i7];
            }
            i7++;
        } while (i7 < 10);
        if (this.A0C) {
            boolean z2 = this.A0D;
            HashMap hashMap2 = hashMapArr[4];
            if (z2) {
                hashMap2.put("StripOffsets", C227982kb.A00(this.A09, new int[]{i6}));
            } else {
                hashMap2.put("JPEGInterchangeFormat", C227982kb.A01(this.A09, new long[]{(long) i6}));
            }
            this.A05 = i6;
            i6 += this.A04;
        }
        if (this.A00 == 4) {
            i6 += 8;
        }
        if (A0N) {
            int i8 = 0;
            do {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", new Object[]{Integer.valueOf(i8), Integer.valueOf(iArr[i8]), Integer.valueOf(hashMapArr[i8].size()), Integer.valueOf(iArr2[i8]), Integer.valueOf(i6)});
                i8++;
            } while (i8 < 10);
        }
        if (!hashMapArr[1].isEmpty()) {
            hashMapArr[0].put(r19[1].A03, C227982kb.A01(this.A09, new long[]{(long) iArr[1]}));
        }
        if (!hashMapArr[2].isEmpty()) {
            hashMapArr[0].put(r19[2].A03, C227982kb.A01(this.A09, new long[]{(long) iArr[2]}));
        }
        if (!hashMapArr[3].isEmpty()) {
            hashMapArr[1].put(r19[3].A03, C227982kb.A01(this.A09, new long[]{(long) iArr[3]}));
        }
        int i9 = this.A00;
        RCC rcc2 = rcc;
        if (i9 != 4) {
            if (i9 == 13) {
                rcc2.A00(i6);
                bArr = A0W;
                rcc2.write(bArr);
            } else if (i9 == 14) {
                rcc2.write(A0c);
                rcc2.A00(i6);
            }
        } else if (i6 <= 65535) {
            rcc2.A02((short) i6);
            bArr = A0S;
            rcc2.write(bArr);
        } else {
            throw new IllegalStateException(002.A0c("Size of exif data (", " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)", i6));
        }
        short s = 18761;
        if (this.A09 == ByteOrder.BIG_ENDIAN) {
            s = 19789;
        }
        rcc2.A02(s);
        rcc2.A00 = this.A09;
        rcc2.A02(42);
        rcc2.A00(8);
        int i10 = 0;
        do {
            if (!hashMapArr[i10].isEmpty()) {
                rcc2.A01(hashMapArr[i10].size());
                HashMap hashMap3 = hashMapArr[i10];
                int size = iArr[i10] + 2 + (hashMap3.size() * 12) + 4;
                for (Map.Entry entry2 : hashMap3.entrySet()) {
                    int i11 = ((AnonymousClass2kM) A17[i10].get(entry2.getKey())).A00;
                    C227982kb r15 = (C227982kb) entry2.getValue();
                    int[] iArr3 = A0l;
                    int i12 = r15.A00;
                    int i13 = iArr3[i12];
                    int i14 = r15.A01;
                    int i15 = i13 * i14;
                    rcc2.A01(i11);
                    rcc2.A01(i12);
                    rcc2.A00(i14);
                    if (i15 > 4) {
                        long j2 = (long) size;
                        if (j2 <= 4294967295L) {
                            rcc2.A00((int) j2);
                            size += i15;
                        } else {
                            throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
                        }
                    } else {
                        rcc2.write(r15.A03);
                        while (i15 < 4) {
                            rcc2.A01.write(0);
                            i15++;
                        }
                    }
                }
                if (i10 != 0 || hashMapArr[4].isEmpty()) {
                    j = 0;
                } else {
                    j = (long) iArr[4];
                    if (j > 4294967295L) {
                        throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
                    }
                }
                rcc2.A00((int) j);
                for (Map.Entry value2 : hashMapArr[i10].entrySet()) {
                    byte[] bArr2 = ((C227982kb) value2.getValue()).A03;
                    int length = bArr2.length;
                    if (length > 4) {
                        rcc2.write(bArr2, 0, length);
                    }
                }
            }
            i10++;
        } while (i10 < 10);
        if (this.A0C) {
            rcc2.write(A0Q());
        }
        if (this.A00 == 14 && i6 % 2 == 1) {
            rcc2.A01.write(0);
        }
        rcc2.A00 = ByteOrder.BIG_ENDIAN;
    }

    private void A0D(AnonymousClass50S r12) {
        String str;
        String str2;
        IOException iOException;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new C7353Q6h(r12, this));
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            boolean equals = "yes".equals(extractMetadata3);
            String str3 = null;
            if (equals) {
                str3 = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str3 = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str2 = null;
                str = null;
            }
            if (str3 != null) {
                this.A0I[0].put("ImageWidth", C227982kb.A00(this.A09, new int[]{Integer.parseInt(str3)}));
            }
            if (str2 != null) {
                this.A0I[0].put("ImageLength", C227982kb.A00(this.A09, new int[]{Integer.parseInt(str2)}));
            }
            if (str != null) {
                int i = 1;
                int parseInt = Integer.parseInt(str);
                if (parseInt == 90) {
                    i = 6;
                } else if (parseInt == 180) {
                    i = 3;
                } else if (parseInt == 270) {
                    i = 8;
                }
                this.A0I[0].put("Orientation", C227982kb.A00(this.A09, new int[]{i}));
            }
            if (!(extractMetadata == null || extractMetadata2 == null)) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    r12.A01((long) parseInt2);
                    byte[] bArr = new byte[6];
                    r12.readFully(bArr);
                    int i2 = parseInt2 + 6;
                    int i3 = parseInt3 - 6;
                    if (Arrays.equals(bArr, A0S)) {
                        byte[] bArr2 = new byte[i3];
                        r12.readFully(bArr2);
                        this.A01 = i2;
                        A0K(bArr2, 0);
                    } else {
                        iOException = new IOException("Invalid identifier");
                    }
                } else {
                    iOException = new IOException("Invalid exif length");
                }
                throw iOException;
            }
            mediaMetadataRetriever.release();
        } catch (RuntimeException unused) {
            throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0232, code lost:
        if (r4 == 9) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0234, code lost:
        if (r1 == 9) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0238, code lost:
        if (r7 == 8) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x023c, code lost:
        if (r7 == 7) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        if (r1 != 4) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
        if (r7 != 3) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01cf, code lost:
        if (((long) r8.A01) != r2) goto L_0x00fd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0F(X.AnonymousClass50S r33, int r34) {
        /*
            r32 = this;
            r9 = r32
            java.util.Set r14 = r9.A0A
            r8 = r33
            int r0 = r8.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14.add(r0)
            short r24 = r8.readShort()
            boolean r23 = A0N
            if (r24 <= 0) goto L_0x013d
            r22 = 0
            r11 = 0
        L_0x001a:
            int r1 = r8.readUnsignedShort()
            int r7 = r8.readUnsignedShort()
            int r21 = r8.readInt()
            int r0 = r8.A01
            long r2 = (long) r0
            r17 = 4
            long r2 = r2 + r17
            java.util.HashMap[] r0 = A16
            r25 = r34
            r0 = r0[r34]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            java.lang.Object r6 = r0.get(r10)
            X.2kM r6 = (X.AnonymousClass2kM) r6
            if (r23 == 0) goto L_0x0058
            java.lang.Integer r5 = java.lang.Integer.valueOf(r25)
            if (r6 == 0) goto L_0x0241
            java.lang.String r4 = r6.A03
        L_0x0047:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r10, r4, r1, r0}
            java.lang.String r0 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String.format(r0, r1)
        L_0x0058:
            r12 = 7
            if (r6 == 0) goto L_0x00fd
            if (r7 <= 0) goto L_0x00fd
            int[] r13 = A0l
            r0 = 14
            if (r7 >= r0) goto L_0x00fd
            int r4 = r6.A01
            if (r4 == r12) goto L_0x023c
            if (r7 == r12) goto L_0x023e
            if (r4 == r7) goto L_0x023c
            int r1 = r6.A02
            if (r1 == r7) goto L_0x023c
            r0 = 4
            if (r4 == r0) goto L_0x0074
            if (r1 != r0) goto L_0x0230
        L_0x0074:
            r0 = 3
            if (r7 != r0) goto L_0x0230
        L_0x0077:
            r0 = r21
            long r4 = (long) r0
            r0 = r13[r7]
            long r0 = (long) r0
            long r4 = r4 * r0
            r15 = 0
            int r0 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x00fd
            r15 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x00fd
            java.lang.String r20 = "Compression"
            int r0 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a9
            int r13 = r8.readInt()
            int r0 = r9.A00
            if (r0 != r12) goto L_0x00a5
            java.lang.String r12 = r6.A03
            java.lang.String r0 = "MakerNote"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x01d3
            r9.A02 = r13
        L_0x00a5:
            long r0 = (long) r13
            r8.A01(r0)
        L_0x00a9:
            java.util.HashMap r0 = A0o
            java.lang.Object r12 = r0.get(r10)
            java.lang.Number r12 = (java.lang.Number) r12
            r10 = 8
            if (r12 == 0) goto L_0x0168
            r0 = -1
            r4 = 3
            if (r7 == r4) goto L_0x015c
            r4 = 4
            if (r7 == r4) goto L_0x014f
            if (r7 == r10) goto L_0x0161
            r4 = 9
            if (r7 == r4) goto L_0x014a
            r4 = 13
            if (r7 == r4) goto L_0x014a
        L_0x00c7:
            if (r23 == 0) goto L_0x00d8
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            java.lang.String r4 = r6.A03
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r4}
            java.lang.String r4 = "Offset: %d, tagName: %s"
            java.lang.String.format(r4, r5)
        L_0x00d8:
            r7 = -1
            r5 = 0
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00fd
            int r4 = r8.A00
            if (r4 == r7) goto L_0x00e8
            long r4 = (long) r4
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x00fd
        L_0x00e8:
            int r4 = (int) r0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r14.contains(r4)
            if (r4 != 0) goto L_0x00fd
            r8.A01(r0)
            int r0 = r12.intValue()
            r9.A0F(r8, r0)
        L_0x00fd:
            r8.A01(r2)
        L_0x0100:
            int r0 = r11 + 1
            short r11 = (short) r0
            r3 = 5
            r0 = r24
            if (r11 < r0) goto L_0x001a
            int r6 = r8.readInt()
            if (r23 == 0) goto L_0x011b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "nextIfdOffset: %d"
            java.lang.String.format(r0, r1)
        L_0x011b:
            long r1 = (long) r6
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x013d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            boolean r0 = r14.contains(r0)
            if (r0 != 0) goto L_0x013d
            r8.A01(r1)
            java.util.HashMap[] r2 = r9.A0I
            r1 = 4
            r0 = r2[r1]
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x013e
            r9.A0F(r8, r1)
        L_0x013d:
            return
        L_0x013e:
            r0 = r2[r3]
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x013d
            r9.A0F(r8, r3)
            return
        L_0x014a:
            int r0 = r8.readInt()
            goto L_0x0165
        L_0x014f:
            int r0 = r8.readInt()
            long r0 = (long) r0
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            goto L_0x00c7
        L_0x015c:
            int r0 = r8.readUnsignedShort()
            goto L_0x0165
        L_0x0161:
            short r0 = r8.readShort()
        L_0x0165:
            long r0 = (long) r0
            goto L_0x00c7
        L_0x0168:
            int r1 = r8.A01
            int r0 = r9.A01
            int r1 = r1 + r0
            int r0 = (int) r4
            byte[] r5 = new byte[r0]
            r8.readFully(r5)
            long r0 = (long) r1
            X.2kb r4 = new X.2kb
            r26 = r4
            r27 = r0
            r29 = r5
            r30 = r7
            r31 = r21
            r26.<init>(r27, r29, r30, r31)
            java.util.HashMap[] r0 = r9.A0I
            r0 = r0[r34]
            java.lang.String r5 = r6.A03
            r0.put(r5, r4)
            java.lang.String r0 = "DNGVersion"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0197
            r0 = 3
            r9.A00 = r0
        L_0x0197:
            java.lang.String r0 = "Make"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x01a7
            java.lang.String r0 = "Model"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x01b5
        L_0x01a7:
            java.nio.ByteOrder r0 = r9.A09
            java.lang.String r1 = r4.A05(r0)
            java.lang.String r0 = "PENTAX"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x01c8
        L_0x01b5:
            r0 = r20
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x01ca
            java.nio.ByteOrder r0 = r9.A09
            int r1 = r4.A03(r0)
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 != r0) goto L_0x01ca
        L_0x01c8:
            r9.A00 = r10
        L_0x01ca:
            int r0 = r8.A01
            long r0 = (long) r0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0100
            goto L_0x00fd
        L_0x01d3:
            r1 = 6
            r0 = r25
            if (r0 != r1) goto L_0x00a5
            java.lang.String r0 = "ThumbnailImage"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00a5
            r9.A0H = r13
            r0 = r21
            r9.A0G = r0
            java.nio.ByteOrder r15 = r9.A09
            r12 = 1
            int[] r0 = new int[]{r1}
            X.2kb r19 = X.C227982kb.A00(r15, r0)
            int r0 = r9.A0H
            long r0 = (long) r0
            java.nio.ByteOrder r15 = r9.A09
            r16 = r15
            long[] r15 = new long[r12]
            r15[r22] = r0
            r0 = r16
            X.2kb r18 = X.C227982kb.A01(r0, r15)
            int r0 = r9.A0G
            long r0 = (long) r0
            java.nio.ByteOrder r15 = r9.A09
            long[] r12 = new long[r12]
            r12[r22] = r0
            X.2kb r17 = X.C227982kb.A01(r15, r12)
            java.util.HashMap[] r12 = r9.A0I
            r16 = 4
            r15 = r12[r16]
            r1 = r20
            r0 = r19
            r15.put(r1, r0)
            r15 = r12[r16]
            java.lang.String r1 = "JPEGInterchangeFormat"
            r0 = r18
            r15.put(r1, r0)
            r12 = r12[r16]
            java.lang.String r1 = "JPEGInterchangeFormatLength"
            r0 = r17
            r12.put(r1, r0)
            goto L_0x00a5
        L_0x0230:
            r0 = 9
            if (r4 == r0) goto L_0x0236
            if (r1 != r0) goto L_0x00fd
        L_0x0236:
            r0 = 8
            if (r7 != r0) goto L_0x00fd
            goto L_0x0077
        L_0x023c:
            if (r7 != r12) goto L_0x0077
        L_0x023e:
            r7 = r4
            goto L_0x0077
        L_0x0241:
            r4 = 0
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227922kK.A0F(X.50S, int):void");
    }

    private void A0G(AnonymousClass50S r14, int i) {
        StringBuilder sb;
        String str;
        C227982kb A002;
        C227982kb A003;
        HashMap[] hashMapArr = this.A0I;
        C227982kb r12 = (C227982kb) hashMapArr[i].get("DefaultCropSize");
        C227982kb r8 = (C227982kb) hashMapArr[i].get("SensorTopBorder");
        C227982kb r7 = (C227982kb) hashMapArr[i].get("SensorLeftBorder");
        C227982kb r2 = (C227982kb) hashMapArr[i].get("SensorBottomBorder");
        C227982kb r6 = (C227982kb) hashMapArr[i].get("SensorRightBorder");
        if (r12 != null) {
            int i2 = r12.A00;
            Object A042 = r12.A04(this.A09);
            if (i2 == 5) {
                Q4T[] q4tArr = (Q4T[]) A042;
                if (q4tArr == null || q4tArr.length != 2) {
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    str = Arrays.toString(q4tArr);
                    sb.append(str);
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                A002 = C227982kb.A02(this.A09, new Q4T[]{q4tArr[0]});
                A003 = C227982kb.A02(this.A09, new Q4T[]{q4tArr[1]});
            } else {
                int[] iArr = (int[]) A042;
                if (iArr == null || iArr.length != 2) {
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    str = Arrays.toString(iArr);
                    sb.append(str);
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                A002 = C227982kb.A00(this.A09, new int[]{iArr[0]});
                A003 = C227982kb.A00(this.A09, new int[]{iArr[1]});
            }
            hashMapArr[i].put("ImageWidth", A002);
            hashMapArr[i].put("ImageLength", A003);
        } else if (r8 == null || r7 == null || r2 == null || r6 == null) {
            Object obj = hashMapArr[i].get("ImageLength");
            Object obj2 = hashMapArr[i].get("ImageWidth");
            if (obj == null || obj2 == null) {
                C227982kb r22 = (C227982kb) hashMapArr[i].get("JPEGInterchangeFormat");
                Object obj3 = hashMapArr[i].get("JPEGInterchangeFormatLength");
                if (r22 != null && obj3 != null) {
                    int A032 = r22.A03(this.A09);
                    int A033 = r22.A03(this.A09);
                    r14.A01((long) A032);
                    byte[] bArr = new byte[A033];
                    r14.readFully(bArr);
                    A0B(new C227962kZ(bArr), A032, i);
                }
            }
        } else {
            int A034 = r8.A03(this.A09);
            int A035 = r2.A03(this.A09);
            int A036 = r6.A03(this.A09);
            int A037 = r7.A03(this.A09);
            if (A035 > A034 && A036 > A037) {
                C227982kb A004 = C227982kb.A00(this.A09, new int[]{A035 - A034});
                C227982kb A005 = C227982kb.A00(this.A09, new int[]{A036 - A037});
                hashMapArr[i].put("ImageLength", A004);
                hashMapArr[i].put("ImageWidth", A005);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:4|5|6|7|8|9|11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        r6.A07 = r4.getFD();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0I(java.lang.String r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0030
            r5 = 0
            r6.A06 = r5
            r6.A08 = r7
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x002b }
            r4.<init>(r7)     // Catch:{ all -> 0x002b }
            java.io.FileDescriptor r3 = r4.getFD()     // Catch:{ all -> 0x0028 }
            int r2 = android.system.OsConstants.SEEK_CUR     // Catch:{ Exception -> 0x0018 }
            r0 = 0
            android.system.Os.lseek(r3, r0, r2)     // Catch:{ Exception -> 0x0018 }
            goto L_0x001b
        L_0x0018:
            r6.A07 = r5     // Catch:{ all -> 0x0028 }
            goto L_0x0021
        L_0x001b:
            java.io.FileDescriptor r0 = r4.getFD()     // Catch:{ all -> 0x0028 }
            r6.A07 = r0     // Catch:{ all -> 0x0028 }
        L_0x0021:
            r6.A0H(r4)     // Catch:{ all -> 0x0028 }
            X.C227992kc.A00(r4)
            return
        L_0x0028:
            r1 = move-exception
            r5 = r4
            goto L_0x002c
        L_0x002b:
            r1 = move-exception
        L_0x002c:
            X.C227992kc.A00(r5)
            throw r1
        L_0x0030:
            java.lang.String r0 = "filename cannot be null"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227922kK.A0I(java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.2kZ, X.50S] */
    private void A0K(byte[] bArr, int i) {
        ? r2 = new C227962kZ(bArr);
        r2.A04.mark(Integer.MAX_VALUE);
        A09(r2);
        A0F(r2, i);
    }

    private boolean A0L(HashMap hashMap) {
        C227982kb r2 = (C227982kb) hashMap.get("ImageLength");
        C227982kb r1 = (C227982kb) hashMap.get("ImageWidth");
        if (!(r2 == null || r1 == null)) {
            int A032 = r2.A03(this.A09);
            int A033 = r1.A03(this.A09);
            if (A032 > 512 || A033 > 512) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String A0N(String str) {
        NumberFormatException numberFormatException;
        NumberFormatException numberFormatException2;
        double d;
        StringBuilder sb;
        if (str != null) {
            C227982kb A022 = A02(this, str);
            if (A022 != null) {
                if (!A0p.contains(str)) {
                    return A022.A05(this.A09);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i = A022.A00;
                    if (i == 5 || i == 10) {
                        Q4T[] q4tArr = (Q4T[]) A022.A04(this.A09);
                        if (q4tArr == null || q4tArr.length != 3) {
                            sb = new StringBuilder();
                            sb.append("Invalid GPS Timestamp array. array=");
                            sb.append(Arrays.toString(q4tArr));
                        } else {
                            Q4T q4t = q4tArr[0];
                            Integer valueOf = Integer.valueOf((int) (((float) q4t.A01) / ((float) q4t.A00)));
                            Q4T q4t2 = q4tArr[1];
                            Integer valueOf2 = Integer.valueOf((int) (((float) q4t2.A01) / ((float) q4t2.A00)));
                            Q4T q4t3 = q4tArr[2];
                            return String.format(C66579MXk.A00(44), new Object[]{valueOf, valueOf2, Integer.valueOf((int) (((float) q4t3.A01) / ((float) q4t3.A00)))});
                        }
                    } else {
                        sb = new StringBuilder();
                        sb.append("GPS Timestamp format is not rational. format=");
                        sb.append(i);
                    }
                    Log.w("ExifInterface", sb.toString());
                    return null;
                }
                try {
                    Object A042 = A022.A04(this.A09);
                    if (A042 != null) {
                        if (A042 instanceof String) {
                            d = Double.parseDouble((String) A042);
                        } else {
                            if (A042 instanceof long[]) {
                                long[] jArr = (long[]) A042;
                                if (jArr.length == 1) {
                                    d = (double) jArr[0];
                                } else {
                                    numberFormatException2 = new NumberFormatException("There are more than one component");
                                }
                            } else if (A042 instanceof int[]) {
                                int[] iArr = (int[]) A042;
                                if (iArr.length == 1) {
                                    d = (double) iArr[0];
                                } else {
                                    numberFormatException2 = new NumberFormatException("There are more than one component");
                                }
                            } else if (A042 instanceof double[]) {
                                double[] dArr = (double[]) A042;
                                if (dArr.length == 1) {
                                    d = dArr[0];
                                } else {
                                    numberFormatException2 = new NumberFormatException("There are more than one component");
                                }
                            } else if (A042 instanceof Q4T[]) {
                                Q4T[] q4tArr2 = (Q4T[]) A042;
                                if (q4tArr2.length == 1) {
                                    Q4T q4t4 = q4tArr2[0];
                                    d = ((double) q4t4.A01) / ((double) q4t4.A00);
                                } else {
                                    numberFormatException = new NumberFormatException("There are more than one component");
                                }
                            } else {
                                numberFormatException = new NumberFormatException(AnonymousClass000.A00(2186));
                            }
                            throw numberFormatException2;
                        }
                        return Double.toString(d);
                    }
                    numberFormatException = new NumberFormatException(AnonymousClass000.A00(2376));
                    throw numberFormatException;
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 400 */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0467, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0468, code lost:
        r3 = null;
        r2 = null;
        r26 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x046e, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x046f, code lost:
        r3 = null;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0472, code lost:
        r23 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x047f, code lost:
        android.system.Os.lseek(r4.A07, 0, android.system.OsConstants.SEEK_SET);
        r0 = new java.io.FileOutputStream(r4.A07);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0495, code lost:
        r0 = new java.io.FileOutputStream(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x04d3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x04d4, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x04de, code lost:
        r25.delete();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x047f A[Catch:{ Exception -> 0x049f, all -> 0x049b }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0495 A[Catch:{ Exception -> 0x049f, all -> 0x049b }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x04d3 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:40:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x04de  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:118:0x021a=Splitter:B:118:0x021a, B:218:0x043c=Splitter:B:218:0x043c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0O() {
        /*
            r28 = this;
            r4 = r28
            int r1 = r4.A00
            r0 = 4
            if (r1 == r0) goto L_0x0017
            r0 = 13
            if (r1 == r0) goto L_0x0017
            r0 = 14
            if (r1 == r0) goto L_0x0017
            java.lang.String r1 = "ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats."
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0017:
            java.io.FileDescriptor r0 = r4.A07
            if (r0 != 0) goto L_0x0027
            java.lang.String r0 = r4.A08
            if (r0 != 0) goto L_0x0027
            java.lang.String r1 = "ExifInterface does not support saving attributes for the current input."
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0027:
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x003b
            boolean r0 = r4.A0D
            if (r0 == 0) goto L_0x003b
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x003b
            java.lang.String r1 = "ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x003b:
            r1 = 1
            int r2 = r4.A03
            r12 = 6
            if (r2 == r12) goto L_0x004a
            r0 = 7
            if (r2 == r0) goto L_0x004a
            r0 = 0
        L_0x0045:
            r4.A0F = r0
            r26 = 0
            goto L_0x004f
        L_0x004a:
            byte[] r0 = r4.A0Q()
            goto L_0x0045
        L_0x004f:
            java.lang.String r2 = "temp"
            java.lang.String r0 = "tmp"
            java.io.File r25 = java.io.File.createTempFile(r2, r0)     // Catch:{ Exception -> 0x04f0, all -> 0x04ec }
            java.lang.String r0 = r4.A08     // Catch:{ Exception -> 0x04f0, all -> 0x04ec }
            if (r0 == 0) goto L_0x0061
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x04f0, all -> 0x04ec }
            r5.<init>(r0)     // Catch:{ Exception -> 0x04f0, all -> 0x04ec }
            goto L_0x0071
        L_0x0061:
            java.io.FileDescriptor r5 = r4.A07     // Catch:{ Exception -> 0x04f0, all -> 0x04ec }
            int r0 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x04f0, all -> 0x04ec }
            r2 = 0
            android.system.Os.lseek(r5, r2, r0)     // Catch:{ Exception -> 0x04f0, all -> 0x04ec }
            java.io.FileDescriptor r0 = r4.A07     // Catch:{ Exception -> 0x04f0, all -> 0x04ec }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x04f0, all -> 0x04ec }
            r5.<init>(r0)     // Catch:{ Exception -> 0x04f0, all -> 0x04ec }
        L_0x0071:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x04e6, all -> 0x04fd }
            r0 = r25
            r3.<init>(r0)     // Catch:{ Exception -> 0x04e6, all -> 0x04fd }
            X.C227992kc.A01(r5, r3)     // Catch:{ Exception -> 0x04e4, all -> 0x04e2 }
            X.C227992kc.A00(r5)
            X.C227992kc.A00(r3)
            r5 = 0
            java.io.FileInputStream r24 = new java.io.FileInputStream     // Catch:{ Exception -> 0x046e, all -> 0x04d3 }
            r2 = r24
            r2.<init>(r0)     // Catch:{ Exception -> 0x046e, all -> 0x04d3 }
            java.lang.String r2 = r4.A08     // Catch:{ Exception -> 0x0467, all -> 0x04d3 }
            if (r2 == 0) goto L_0x0095
            java.io.FileOutputStream r23 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0467, all -> 0x04d3 }
            r0 = r23
            r0.<init>(r2)     // Catch:{ Exception -> 0x0467, all -> 0x04d3 }
            goto L_0x00a7
        L_0x0095:
            java.io.FileDescriptor r6 = r4.A07     // Catch:{ Exception -> 0x0467, all -> 0x04d3 }
            int r0 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0467, all -> 0x04d3 }
            r2 = 0
            android.system.Os.lseek(r6, r2, r0)     // Catch:{ Exception -> 0x0467, all -> 0x04d3 }
            java.io.FileDescriptor r2 = r4.A07     // Catch:{ Exception -> 0x0467, all -> 0x04d3 }
            java.io.FileOutputStream r23 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0467, all -> 0x04d3 }
            r0 = r23
            r0.<init>(r2)     // Catch:{ Exception -> 0x0467, all -> 0x04d3 }
        L_0x00a7:
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0460, all -> 0x04d3 }
            r0 = r24
            r3.<init>(r0)     // Catch:{ Exception -> 0x0460, all -> 0x04d3 }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0458, all -> 0x0454 }
            r0 = r23
            r2.<init>(r0)     // Catch:{ Exception -> 0x0458, all -> 0x0454 }
            int r6 = r4.A00     // Catch:{ Exception -> 0x045c }
            r0 = 4
            if (r6 != r0) goto L_0x01a2
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x045c }
            X.2kZ r10 = new X.2kZ     // Catch:{ Exception -> 0x045c }
            r10.<init>(r3, r0)     // Catch:{ Exception -> 0x045c }
            X.RCC r9 = new X.RCC     // Catch:{ Exception -> 0x045c }
            r9.<init>(r2, r0)     // Catch:{ Exception -> 0x045c }
            byte r0 = r10.readByte()     // Catch:{ Exception -> 0x045c }
            java.lang.String r13 = "Invalid marker"
            r14 = -1
            if (r0 != r14) goto L_0x019b
            java.io.OutputStream r11 = r9.A01     // Catch:{ Exception -> 0x045c }
            r11.write(r14)     // Catch:{ Exception -> 0x045c }
            byte r1 = r10.readByte()     // Catch:{ Exception -> 0x045c }
            r0 = -40
            if (r1 != r0) goto L_0x0194
            r11.write(r0)     // Catch:{ Exception -> 0x045c }
            r6 = 0
            java.lang.String r1 = "Xmp"
            java.lang.String r0 = r4.A0N(r1)     // Catch:{ Exception -> 0x045c }
            if (r0 == 0) goto L_0x00f4
            boolean r0 = r4.A0E     // Catch:{ Exception -> 0x045c }
            if (r0 == 0) goto L_0x00f4
            java.util.HashMap[] r0 = r4.A0I     // Catch:{ Exception -> 0x045c }
            r0 = r0[r5]     // Catch:{ Exception -> 0x045c }
            java.lang.Object r6 = r0.remove(r1)     // Catch:{ Exception -> 0x045c }
        L_0x00f4:
            r11.write(r14)     // Catch:{ Exception -> 0x045c }
            r8 = -31
            r11.write(r8)     // Catch:{ Exception -> 0x045c }
            r4.A0C(r9)     // Catch:{ Exception -> 0x045c }
            if (r6 == 0) goto L_0x0108
            java.util.HashMap[] r0 = r4.A0I     // Catch:{ Exception -> 0x045c }
            r0 = r0[r5]     // Catch:{ Exception -> 0x045c }
            r0.put(r1, r6)     // Catch:{ Exception -> 0x045c }
        L_0x0108:
            r7 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r7]     // Catch:{ Exception -> 0x045c }
        L_0x010c:
            byte r0 = r10.readByte()     // Catch:{ Exception -> 0x045c }
            if (r0 != r14) goto L_0x018d
            byte r1 = r10.readByte()     // Catch:{ Exception -> 0x045c }
            r0 = -39
            if (r1 == r0) goto L_0x020b
            r0 = -38
            if (r1 == r0) goto L_0x020b
            java.lang.String r0 = "Invalid length"
            if (r1 == r8) goto L_0x0146
            r11.write(r14)     // Catch:{ Exception -> 0x045c }
            r11.write(r1)     // Catch:{ Exception -> 0x045c }
            int r1 = r10.readUnsignedShort()     // Catch:{ Exception -> 0x045c }
            r9.A01(r1)     // Catch:{ Exception -> 0x045c }
            int r1 = r1 + -2
            if (r1 >= 0) goto L_0x0135
            goto L_0x0440
        L_0x0135:
            if (r1 <= 0) goto L_0x010c
            int r0 = java.lang.Math.min(r1, r7)     // Catch:{ Exception -> 0x045c }
            int r0 = r10.read(r6, r5, r0)     // Catch:{ Exception -> 0x045c }
            if (r0 < 0) goto L_0x010c
            r9.write(r6, r5, r0)     // Catch:{ Exception -> 0x045c }
            int r1 = r1 - r0
            goto L_0x0135
        L_0x0146:
            int r1 = r10.readUnsignedShort()     // Catch:{ Exception -> 0x045c }
            int r1 = r1 + -2
            if (r1 < 0) goto L_0x0186
            byte[] r15 = new byte[r12]     // Catch:{ Exception -> 0x045c }
            if (r1 < r12) goto L_0x0163
            r10.readFully(r15)     // Catch:{ Exception -> 0x045c }
            byte[] r0 = A0S     // Catch:{ Exception -> 0x045c }
            boolean r0 = java.util.Arrays.equals(r15, r0)     // Catch:{ Exception -> 0x045c }
            if (r0 == 0) goto L_0x0163
            int r0 = r1 + -6
            r10.A00(r0)     // Catch:{ Exception -> 0x045c }
            goto L_0x010c
        L_0x0163:
            r11.write(r14)     // Catch:{ Exception -> 0x045c }
            r11.write(r8)     // Catch:{ Exception -> 0x045c }
            int r0 = r1 + 2
            r9.A01(r0)     // Catch:{ Exception -> 0x045c }
            if (r1 < r12) goto L_0x0175
            int r1 = r1 + -6
            r9.write(r15)     // Catch:{ Exception -> 0x045c }
        L_0x0175:
            if (r1 <= 0) goto L_0x010c
            int r0 = java.lang.Math.min(r1, r7)     // Catch:{ Exception -> 0x045c }
            int r0 = r10.read(r6, r5, r0)     // Catch:{ Exception -> 0x045c }
            if (r0 < 0) goto L_0x010c
            r9.write(r6, r5, r0)     // Catch:{ Exception -> 0x045c }
            int r1 = r1 - r0
            goto L_0x0175
        L_0x0186:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x045c }
            r1.<init>(r0)     // Catch:{ Exception -> 0x045c }
            goto L_0x0445
        L_0x018d:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x045c }
            r1.<init>(r13)     // Catch:{ Exception -> 0x045c }
            goto L_0x0445
        L_0x0194:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x045c }
            r1.<init>(r13)     // Catch:{ Exception -> 0x045c }
            goto L_0x0445
        L_0x019b:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x045c }
            r1.<init>(r13)     // Catch:{ Exception -> 0x045c }
            goto L_0x0445
        L_0x01a2:
            r0 = 13
            if (r6 != r0) goto L_0x021f
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x045c }
            X.2kZ r10 = new X.2kZ     // Catch:{ Exception -> 0x045c }
            r10.<init>(r3, r1)     // Catch:{ Exception -> 0x045c }
            X.RCC r9 = new X.RCC     // Catch:{ Exception -> 0x045c }
            r9.<init>(r2, r1)     // Catch:{ Exception -> 0x045c }
            r6 = 8
            X.C227992kc.A02(r10, r9, r6)     // Catch:{ Exception -> 0x045c }
            int r0 = r4.A01     // Catch:{ Exception -> 0x045c }
            r7 = 4
            if (r0 != 0) goto L_0x01cb
            int r0 = r10.readInt()     // Catch:{ Exception -> 0x045c }
            r9.A00(r0)     // Catch:{ Exception -> 0x045c }
            int r0 = r0 + 4
            int r0 = r0 + 4
            X.C227992kc.A02(r10, r9, r0)     // Catch:{ Exception -> 0x045c }
            goto L_0x01dc
        L_0x01cb:
            int r0 = r0 - r6
            int r0 = r0 - r7
            int r0 = r0 - r7
            X.C227992kc.A02(r10, r9, r0)     // Catch:{ Exception -> 0x045c }
            int r0 = r10.readInt()     // Catch:{ Exception -> 0x045c }
            int r0 = r0 + 4
            int r0 = r0 + 4
            r10.A00(r0)     // Catch:{ Exception -> 0x045c }
        L_0x01dc:
            r0 = 0
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0219 }
            r8.<init>()     // Catch:{ all -> 0x0219 }
            X.RCC r0 = new X.RCC     // Catch:{ all -> 0x0216 }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x0216 }
            r4.A0C(r0)     // Catch:{ all -> 0x0216 }
            java.io.OutputStream r0 = r0.A01     // Catch:{ all -> 0x0216 }
            java.io.ByteArrayOutputStream r0 = (java.io.ByteArrayOutputStream) r0     // Catch:{ all -> 0x0216 }
            byte[] r6 = r0.toByteArray()     // Catch:{ all -> 0x0216 }
            r9.write(r6)     // Catch:{ all -> 0x0216 }
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32     // Catch:{ all -> 0x0216 }
            r1.<init>()     // Catch:{ all -> 0x0216 }
            int r0 = r6.length     // Catch:{ all -> 0x0216 }
            int r0 = r0 - r7
            r1.update(r6, r7, r0)     // Catch:{ all -> 0x0216 }
            long r6 = r1.getValue()     // Catch:{ all -> 0x0216 }
            int r0 = (int) r6     // Catch:{ all -> 0x0216 }
            r9.A00(r0)     // Catch:{ all -> 0x0216 }
            X.C227992kc.A00(r8)     // Catch:{ Exception -> 0x045c }
            goto L_0x0211
        L_0x020b:
            r11.write(r14)     // Catch:{ Exception -> 0x045c }
            r11.write(r1)     // Catch:{ Exception -> 0x045c }
        L_0x0211:
            X.C227992kc.A01(r10, r9)     // Catch:{ Exception -> 0x045c }
            goto L_0x0446
        L_0x0216:
            r1 = move-exception
            r0 = r8
            goto L_0x021a
        L_0x0219:
            r1 = move-exception
        L_0x021a:
            X.C227992kc.A00(r0)     // Catch:{ Exception -> 0x045c }
            goto L_0x0445
        L_0x021f:
            r0 = 14
            if (r6 != r0) goto L_0x0446
            java.nio.ByteOrder r9 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ Exception -> 0x045c }
            X.2kZ r8 = new X.2kZ     // Catch:{ Exception -> 0x045c }
            r8.<init>(r3, r9)     // Catch:{ Exception -> 0x045c }
            X.RCC r6 = new X.RCC     // Catch:{ Exception -> 0x045c }
            r6.<init>(r2, r9)     // Catch:{ Exception -> 0x045c }
            r11 = 4
            X.C227992kc.A02(r8, r6, r11)     // Catch:{ Exception -> 0x045c }
            byte[] r22 = A0h     // Catch:{ Exception -> 0x045c }
            r21 = 8
            r0 = r21
            r8.A00(r0)     // Catch:{ Exception -> 0x045c }
            r7 = 0
            java.io.ByteArrayOutputStream r20 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0432 }
            r20.<init>()     // Catch:{ Exception -> 0x0432 }
            X.RCC r7 = new X.RCC     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r0 = r20
            r7.<init>(r0, r9)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            int r9 = r4.A01     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            if (r9 == 0) goto L_0x0267
            r0 = 12
            int r9 = r9 - r0
            int r9 = r9 - r11
            int r9 = r9 - r11
            X.C227992kc.A02(r8, r7, r9)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r8.A00(r11)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            int r1 = r8.readInt()     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            int r0 = r1 % 2
            if (r0 == 0) goto L_0x0262
            int r1 = r1 + 1
        L_0x0262:
            r8.A00(r1)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            goto L_0x03e7
        L_0x0267:
            byte[] r10 = new byte[r11]     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r8.readFully(r10)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            byte[] r13 = A0f     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            boolean r0 = java.util.Arrays.equals(r10, r13)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r14 = 0
            r19 = 1
            if (r0 == 0) goto L_0x02e3
            int r10 = r8.readInt()     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            int r9 = r10 % 2
            r0 = r10
            if (r9 != r1) goto L_0x0282
            int r0 = r10 + 1
        L_0x0282:
            byte[] r9 = new byte[r0]     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r8.readFully(r9)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            byte r0 = r9[r5]     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r0 = r0 | 8
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r9[r5] = r0     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            int r0 = r0 >> r1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x0294
            r14 = 1
        L_0x0294:
            r7.write(r13)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r7.A00(r10)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r7.write(r9)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            if (r14 == 0) goto L_0x0401
            byte[] r12 = A0a     // Catch:{ Exception -> 0x042e, all -> 0x042a }
        L_0x02a1:
            byte[] r10 = new byte[r11]     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r8.readFully(r10)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            int r9 = r8.readInt()     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r7.write(r10)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r7.A00(r9)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            int r0 = r9 % 2
            if (r0 != r1) goto L_0x02b6
            int r9 = r9 + 1
        L_0x02b6:
            X.C227992kc.A02(r8, r7, r9)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            boolean r0 = java.util.Arrays.equals(r10, r12)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            if (r0 != 0) goto L_0x02c0
            goto L_0x02a1
        L_0x02c0:
            byte[] r10 = new byte[r11]     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r8.readFully(r10)     // Catch:{ EOFException -> 0x03e7 }
            byte[] r0 = A0b     // Catch:{ EOFException -> 0x03e7 }
            boolean r0 = java.util.Arrays.equals(r10, r0)     // Catch:{ EOFException -> 0x03e7 }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x03e7
            int r9 = r8.readInt()     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r7.write(r10)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r7.A00(r9)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            int r0 = r9 % 2
            if (r0 != r1) goto L_0x02df
            int r9 = r9 + 1
        L_0x02df:
            X.C227992kc.A02(r8, r7, r9)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            goto L_0x02c0
        L_0x02e3:
            byte[] r18 = A0d     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r0 = r18
            boolean r0 = java.util.Arrays.equals(r10, r0)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            if (r0 != 0) goto L_0x02f5
            byte[] r0 = A0e     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            boolean r0 = java.util.Arrays.equals(r10, r0)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            if (r0 == 0) goto L_0x03ea
        L_0x02f5:
            int r17 = r8.readInt()     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            int r0 = r17 % 2
            r9 = r17
            if (r0 != r1) goto L_0x0301
            int r9 = r17 + 1
        L_0x0301:
            r1 = 3
            byte[] r0 = new byte[r1]     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r27 = r0
            r0 = r18
            boolean r0 = java.util.Arrays.equals(r10, r0)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r16 = 47
            if (r0 == 0) goto L_0x03a0
            r0 = r27
            r8.readFully(r0)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            byte[] r1 = new byte[r1]     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r8.readFully(r1)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            byte[] r0 = A0i     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            boolean r0 = java.util.Arrays.equals(r0, r1)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            if (r0 == 0) goto L_0x03d9
            int r1 = r8.readInt()     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            int r0 = r1 << 18
            int r15 = r0 >> 18
            int r0 = r1 << 2
            int r14 = r0 >> 18
            int r9 = r9 + -10
            r19 = 0
        L_0x0332:
            r7.write(r13)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r0 = 10
            r7.A00(r0)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            byte[] r13 = new byte[r0]     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            if (r19 == 0) goto L_0x0345
            byte r0 = r13[r5]     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r0 = r0 | 16
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r13[r5] = r0     // Catch:{ Exception -> 0x042e, all -> 0x042a }
        L_0x0345:
            byte r0 = r13[r5]     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r0 = r0 | 8
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r13[r5] = r0     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            int r15 = r15 + -1
            int r14 = r14 + -1
            byte r0 = (byte) r15     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r13[r11] = r0     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r11 = 5
            int r0 = r15 >> 8
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r13[r11] = r0     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            int r0 = r15 >> 16
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r13[r12] = r0     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r11 = 7
            byte r0 = (byte) r14     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r13[r11] = r0     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            int r0 = r14 >> 8
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r13[r21] = r0     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r11 = 9
            int r0 = r14 >> 16
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r13[r11] = r0     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r7.write(r13)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r7.write(r10)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r0 = r17
            r7.A00(r0)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r0 = r18
            boolean r0 = java.util.Arrays.equals(r10, r0)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            if (r0 == 0) goto L_0x0392
            r0 = r27
            r7.write(r0)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            byte[] r0 = A0i     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r7.write(r0)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
        L_0x038b:
            r7.A00(r1)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
        L_0x038e:
            X.C227992kc.A02(r8, r7, r9)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            goto L_0x03e7
        L_0x0392:
            byte[] r0 = A0e     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            boolean r0 = java.util.Arrays.equals(r10, r0)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            if (r0 == 0) goto L_0x038e
            r0 = r16
            r7.write(r0)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            goto L_0x038b
        L_0x03a0:
            byte[] r0 = A0e     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            boolean r0 = java.util.Arrays.equals(r10, r0)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            if (r0 == 0) goto L_0x03cb
            byte r1 = r8.readByte()     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r0 = r16
            if (r1 != r0) goto L_0x03d1
            int r1 = r8.readInt()     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r0 = r1 & 16383(0x3fff, float:2.2957E-41)
            int r15 = r0 + 1
            r0 = 268419072(0xfffc000, float:2.5218897E-29)
            r0 = r0 & r1
            int r0 = r0 >>> 14
            int r14 = r0 + 1
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x03c7
            r19 = 0
        L_0x03c7:
            int r9 = r9 + -5
            goto L_0x0332
        L_0x03cb:
            r15 = 0
            r19 = 0
            r1 = 0
            goto L_0x0332
        L_0x03d1:
            java.lang.String r0 = "Error checking VP8L signature"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r1.<init>(r0)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            goto L_0x03e0
        L_0x03d9:
            java.lang.String r0 = "Error checking VP8 signature"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r1.<init>(r0)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
        L_0x03e0:
            throw r1     // Catch:{ Exception -> 0x042e, all -> 0x042a }
        L_0x03e1:
            boolean r0 = java.util.Arrays.equals(r10, r12)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            if (r0 == 0) goto L_0x0405
        L_0x03e7:
            r4.A0C(r7)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
        L_0x03ea:
            X.C227992kc.A01(r8, r7)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            int r0 = r20.size()     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            int r0 = r0 + 4
            r6.A00(r0)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r0 = r22
            r6.write(r0)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r0 = r20
            r0.writeTo(r6)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            goto L_0x0426
        L_0x0401:
            byte[] r13 = A0d     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            byte[] r12 = A0e     // Catch:{ Exception -> 0x042e, all -> 0x042a }
        L_0x0405:
            byte[] r10 = new byte[r11]     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r8.readFully(r10)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            int r9 = r8.readInt()     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r7.write(r10)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            r7.A00(r9)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            int r0 = r9 % 2
            if (r0 != r1) goto L_0x041a
            int r9 = r9 + 1
        L_0x041a:
            X.C227992kc.A02(r8, r7, r9)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            boolean r0 = java.util.Arrays.equals(r10, r13)     // Catch:{ Exception -> 0x042e, all -> 0x042a }
            if (r0 != 0) goto L_0x03e7
            if (r12 == 0) goto L_0x0405
            goto L_0x03e1
        L_0x0426:
            X.C227992kc.A00(r20)     // Catch:{ Exception -> 0x045c }
            goto L_0x0446
        L_0x042a:
            r1 = move-exception
            r7 = r20
            goto L_0x043c
        L_0x042e:
            r6 = move-exception
            r7 = r20
            goto L_0x0433
        L_0x0432:
            r6 = move-exception
        L_0x0433:
            java.lang.String r1 = "Failed to save WebP file"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x043b }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x043b }
            throw r0     // Catch:{ all -> 0x043b }
        L_0x043b:
            r1 = move-exception
        L_0x043c:
            X.C227992kc.A00(r7)     // Catch:{ Exception -> 0x045c }
            goto L_0x0445
        L_0x0440:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x045c }
            r1.<init>(r0)     // Catch:{ Exception -> 0x045c }
        L_0x0445:
            throw r1     // Catch:{ Exception -> 0x045c }
        L_0x0446:
            X.C227992kc.A00(r3)
            X.C227992kc.A00(r2)
            r25.delete()
            r0 = r26
            r4.A0F = r0
            return
        L_0x0454:
            r0 = move-exception
            r2 = r26
            goto L_0x04d0
        L_0x0458:
            r9 = move-exception
            r2 = r26
            goto L_0x045d
        L_0x045c:
            r9 = move-exception
        L_0x045d:
            r26 = r24
            goto L_0x0474
        L_0x0460:
            r9 = move-exception
            r2 = r26
            r26 = r24
            r3 = r2
            goto L_0x0474
        L_0x0467:
            r9 = move-exception
            r3 = r26
            r2 = r3
            r26 = r24
            goto L_0x0472
        L_0x046e:
            r9 = move-exception
            r3 = r26
            r2 = r3
        L_0x0472:
            r23 = r3
        L_0x0474:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x04a3, all -> 0x04a1 }
            r0 = r25
            r6.<init>(r0)     // Catch:{ Exception -> 0x04a3, all -> 0x04a1 }
            java.lang.String r1 = r4.A08     // Catch:{ Exception -> 0x049f, all -> 0x049b }
            if (r1 != 0) goto L_0x0495
            java.io.FileDescriptor r8 = r4.A07     // Catch:{ Exception -> 0x049f, all -> 0x049b }
            int r7 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x049f, all -> 0x049b }
            r0 = 0
            android.system.Os.lseek(r8, r0, r7)     // Catch:{ Exception -> 0x049f, all -> 0x049b }
            java.io.FileDescriptor r1 = r4.A07     // Catch:{ Exception -> 0x049f, all -> 0x049b }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x049f, all -> 0x049b }
            r0.<init>(r1)     // Catch:{ Exception -> 0x049f, all -> 0x049b }
        L_0x048f:
            r23 = r0
            X.C227992kc.A01(r6, r0)     // Catch:{ Exception -> 0x049f, all -> 0x049b }
            goto L_0x04c1
        L_0x0495:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x049f, all -> 0x049b }
            r0.<init>(r1)     // Catch:{ Exception -> 0x049f, all -> 0x049b }
            goto L_0x048f
        L_0x049b:
            r1 = move-exception
            r26 = r6
            goto L_0x04ba
        L_0x049f:
            r4 = move-exception
            goto L_0x04a6
        L_0x04a1:
            r1 = move-exception
            goto L_0x04ba
        L_0x04a3:
            r4 = move-exception
            r6 = r26
        L_0x04a6:
            java.lang.String r1 = "Failed to save new file. Original file is stored in "
            java.lang.String r0 = r25.getAbsolutePath()     // Catch:{ all -> 0x04b6 }
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x04b6 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x04b6 }
            r0.<init>(r1, r4)     // Catch:{ all -> 0x04b6 }
            throw r0     // Catch:{ all -> 0x04b6 }
        L_0x04b6:
            r1 = move-exception
            r26 = r6
            r5 = 1
        L_0x04ba:
            X.C227992kc.A00(r26)     // Catch:{ all -> 0x04cf }
            X.C227992kc.A00(r23)     // Catch:{ all -> 0x04cf }
            goto L_0x04ce
        L_0x04c1:
            X.C227992kc.A00(r6)     // Catch:{ all -> 0x04cf }
            X.C227992kc.A00(r0)     // Catch:{ all -> 0x04cf }
            java.lang.String r0 = "Failed to save new file"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x04cf }
            r1.<init>(r0, r9)     // Catch:{ all -> 0x04cf }
        L_0x04ce:
            throw r1     // Catch:{ all -> 0x04cf }
        L_0x04cf:
            r0 = move-exception
        L_0x04d0:
            r26 = r3
            goto L_0x04d6
        L_0x04d3:
            r0 = move-exception
            r2 = r26
        L_0x04d6:
            X.C227992kc.A00(r26)
            X.C227992kc.A00(r2)
            if (r5 != 0) goto L_0x04e1
            r25.delete()
        L_0x04e1:
            throw r0
        L_0x04e2:
            r0 = move-exception
            goto L_0x0500
        L_0x04e4:
            r2 = move-exception
            goto L_0x04e9
        L_0x04e6:
            r2 = move-exception
            r3 = r26
        L_0x04e9:
            r26 = r5
            goto L_0x04f3
        L_0x04ec:
            r0 = move-exception
            r3 = r26
            goto L_0x0502
        L_0x04f0:
            r2 = move-exception
            r3 = r26
        L_0x04f3:
            java.lang.String r1 = "Failed to copy original file to temp file"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x04fb }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x04fb }
            throw r0     // Catch:{ all -> 0x04fb }
        L_0x04fb:
            r0 = move-exception
            goto L_0x0502
        L_0x04fd:
            r0 = move-exception
            r3 = r26
        L_0x0500:
            r26 = r5
        L_0x0502:
            X.C227992kc.A00(r26)
            X.C227992kc.A00(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227922kK.A0O():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (r2 == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        if (r2 != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x014f, code lost:
        if (r7 != 2) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01de, code lost:
        r19 = new X.C227982kb(-1, r9.array(), r23, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02bb, code lost:
        r1.put(r4, r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x005e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0P(java.lang.String r26, java.lang.String r27) {
        /*
            r25 = this;
            r4 = r26
            r3 = r27
            if (r26 == 0) goto L_0x02df
            java.lang.String r0 = "DateTime"
            boolean r0 = r0.equals(r4)
            java.lang.String r11 = " : "
            java.lang.String r10 = "Invalid value for "
            java.lang.String r9 = "ExifInterface"
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "DateTimeOriginal"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "DateTimeDigitized"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0069
        L_0x0024:
            if (r27 == 0) goto L_0x0069
            java.util.regex.Pattern r0 = A0s
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r5 = r0.find()
            java.util.regex.Pattern r0 = A0t
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r2 = r0.find()
            int r1 = r3.length()
            r0 = 19
            if (r1 != r0) goto L_0x0046
            if (r5 != 0) goto L_0x005f
            if (r2 != 0) goto L_0x0061
        L_0x0046:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r4)
            r2.append(r11)
            r2.append(r3)
        L_0x0057:
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r9, r0)
        L_0x005e:
            return
        L_0x005f:
            if (r2 == 0) goto L_0x0069
        L_0x0061:
            java.lang.String r1 = "-"
            java.lang.String r0 = ":"
            java.lang.String r3 = r3.replaceAll(r1, r0)
        L_0x0069:
            java.lang.String r0 = "ISOSpeedRatings"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0073
            java.lang.String r4 = "PhotographicSensitivity"
        L_0x0073:
            r18 = 2
            r15 = 1
            if (r3 == 0) goto L_0x00f5
            java.util.HashSet r0 = A0p
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "GPSTimeStamp"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00a6
            java.util.regex.Pattern r0 = A0u
            java.util.regex.Matcher r5 = r0.matcher(r3)
            boolean r0 = r5.find()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            if (r0 != 0) goto L_0x00bd
            r2.<init>()
            r2.append(r10)
            r2.append(r4)
            r2.append(r11)
            r2.append(r3)
            goto L_0x0057
        L_0x00a6:
            double r7 = java.lang.Double.parseDouble(r3)     // Catch:{ NumberFormatException -> 0x02d7 }
            r0 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r7 = r7 * r0
            long r5 = (long) r7     // Catch:{ NumberFormatException -> 0x02d7 }
            r0 = 10000(0x2710, double:4.9407E-320)
            X.Q4T r2 = new X.Q4T     // Catch:{ NumberFormatException -> 0x02d7 }
            r2.<init>(r5, r0)     // Catch:{ NumberFormatException -> 0x02d7 }
            java.lang.String r3 = r2.toString()     // Catch:{ NumberFormatException -> 0x02d7 }
            goto L_0x00f5
        L_0x00bd:
            r2.<init>()
            java.lang.String r0 = r5.group(r15)
            int r0 = java.lang.Integer.parseInt(r0)
            r2.append(r0)
            java.lang.String r1 = "/1,"
            r2.append(r1)
            r0 = r18
            java.lang.String r0 = r5.group(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            r2.append(r0)
            r2.append(r1)
            r0 = 3
            java.lang.String r0 = r5.group(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            r2.append(r0)
            java.lang.String r0 = "/1"
            r2.append(r0)
            java.lang.String r3 = r2.toString()
        L_0x00f5:
            r11 = 0
            r2 = 0
        L_0x00f7:
            java.util.HashMap[] r0 = A17
            r0 = r0[r2]
            java.lang.Object r9 = r0.get(r4)
            X.2kM r9 = (X.AnonymousClass2kM) r9
            r5 = r25
            if (r9 == 0) goto L_0x010e
            if (r3 != 0) goto L_0x011c
            java.util.HashMap[] r0 = r5.A0I
            r0 = r0[r2]
            r0.remove(r4)
        L_0x010e:
            int r2 = r2 + 1
            r0 = 10
            if (r2 >= r0) goto L_0x005e
            r0 = 4
            if (r2 != r0) goto L_0x00f7
            boolean r0 = r5.A0C
            if (r0 != 0) goto L_0x00f7
            goto L_0x010e
        L_0x011c:
            android.util.Pair r1 = A01(r3)
            int r7 = r9.A01
            java.lang.Object r0 = r1.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            r8 = -1
            if (r7 == r6) goto L_0x0140
            java.lang.Object r0 = r1.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            if (r7 == r1) goto L_0x0140
            int r0 = r9.A02
            if (r0 == r8) goto L_0x0148
            if (r0 == r6) goto L_0x013f
            if (r0 != r1) goto L_0x0148
        L_0x013f:
            r7 = r0
        L_0x0140:
            java.lang.String r17 = "/"
            java.lang.String r0 = ","
            switch(r7) {
                case 1: goto L_0x0288;
                case 2: goto L_0x0269;
                case 3: goto L_0x0249;
                case 4: goto L_0x0229;
                case 5: goto L_0x01ef;
                case 6: goto L_0x0147;
                case 7: goto L_0x0269;
                case 8: goto L_0x0147;
                case 9: goto L_0x01a8;
                case 10: goto L_0x0152;
                default: goto L_0x0147;
            }
        L_0x0147:
            goto L_0x010e
        L_0x0148:
            if (r7 == r15) goto L_0x0140
            r0 = 7
            if (r7 == r0) goto L_0x0140
            r0 = r18
            if (r7 != r0) goto L_0x010e
            goto L_0x0140
        L_0x0152:
            java.lang.String[] r12 = r3.split(r0, r8)
            int r6 = r12.length
            X.Q4T[] r0 = new X.Q4T[r6]
            r16 = r0
            r7 = 0
        L_0x015c:
            if (r7 >= r6) goto L_0x017e
            r1 = r12[r7]
            r0 = r17
            java.lang.String[] r9 = r1.split(r0, r8)
            r0 = r9[r11]
            double r0 = java.lang.Double.parseDouble(r0)
            long r13 = (long) r0
            r0 = r9[r15]
            double r9 = java.lang.Double.parseDouble(r0)
            long r0 = (long) r9
            X.Q4T r9 = new X.Q4T
            r9.<init>(r13, r0)
            r16[r7] = r9
            int r7 = r7 + 1
            goto L_0x015c
        L_0x017e:
            java.util.HashMap[] r0 = r5.A0I
            r1 = r0[r2]
            java.nio.ByteOrder r7 = r5.A09
            int[] r0 = A0l
            r23 = 10
            r0 = r0[r23]
            int r0 = r0 * r6
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r0)
            r9.order(r7)
            r10 = 0
        L_0x0195:
            if (r10 >= r6) goto L_0x01de
            r12 = r16[r10]
            long r7 = r12.A01
            int r0 = (int) r7
            r9.putInt(r0)
            long r7 = r12.A00
            int r0 = (int) r7
            r9.putInt(r0)
            int r10 = r10 + 1
            goto L_0x0195
        L_0x01a8:
            java.lang.String[] r7 = r3.split(r0, r8)
            int r6 = r7.length
            int[] r8 = new int[r6]
            r1 = 0
        L_0x01b0:
            if (r1 >= r6) goto L_0x01bd
            r0 = r7[r1]
            int r0 = java.lang.Integer.parseInt(r0)
            r8[r1] = r0
            int r1 = r1 + 1
            goto L_0x01b0
        L_0x01bd:
            java.util.HashMap[] r0 = r5.A0I
            r1 = r0[r2]
            java.nio.ByteOrder r7 = r5.A09
            int[] r0 = A0l
            r23 = 9
            r0 = r0[r23]
            int r0 = r0 * r6
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r0)
            r9.order(r7)
            r7 = 0
        L_0x01d4:
            if (r7 >= r6) goto L_0x01de
            r0 = r8[r7]
            r9.putInt(r0)
            int r7 = r7 + 1
            goto L_0x01d4
        L_0x01de:
            byte[] r22 = r9.array()
            r20 = -1
            X.2kb r0 = new X.2kb
            r24 = r6
            r19 = r0
            r19.<init>(r20, r22, r23, r24)
            goto L_0x02bb
        L_0x01ef:
            java.lang.String[] r12 = r3.split(r0, r8)
            int r10 = r12.length
            X.Q4T[] r13 = new X.Q4T[r10]
            r9 = 0
        L_0x01f7:
            if (r9 >= r10) goto L_0x021d
            r1 = r12[r9]
            r0 = r17
            java.lang.String[] r14 = r1.split(r0, r8)
            r0 = r14[r11]
            double r6 = java.lang.Double.parseDouble(r0)
            long r0 = (long) r6
            r19 = r0
            r0 = r14[r15]
            double r0 = java.lang.Double.parseDouble(r0)
            long r6 = (long) r0
            X.Q4T r14 = new X.Q4T
            r0 = r19
            r14.<init>(r0, r6)
            r13[r9] = r14
            int r9 = r9 + 1
            goto L_0x01f7
        L_0x021d:
            java.util.HashMap[] r0 = r5.A0I
            r1 = r0[r2]
            java.nio.ByteOrder r0 = r5.A09
            X.2kb r0 = X.C227982kb.A02(r0, r13)
            goto L_0x02bb
        L_0x0229:
            java.lang.String[] r9 = r3.split(r0, r8)
            int r8 = r9.length
            long[] r7 = new long[r8]
            r6 = 0
        L_0x0231:
            if (r6 >= r8) goto L_0x023e
            r0 = r9[r6]
            long r0 = java.lang.Long.parseLong(r0)
            r7[r6] = r0
            int r6 = r6 + 1
            goto L_0x0231
        L_0x023e:
            java.util.HashMap[] r0 = r5.A0I
            r1 = r0[r2]
            java.nio.ByteOrder r0 = r5.A09
            X.2kb r0 = X.C227982kb.A01(r0, r7)
            goto L_0x02bb
        L_0x0249:
            java.lang.String[] r8 = r3.split(r0, r8)
            int r7 = r8.length
            int[] r6 = new int[r7]
            r1 = 0
        L_0x0251:
            if (r1 >= r7) goto L_0x025e
            r0 = r8[r1]
            int r0 = java.lang.Integer.parseInt(r0)
            r6[r1] = r0
            int r1 = r1 + 1
            goto L_0x0251
        L_0x025e:
            java.util.HashMap[] r0 = r5.A0I
            r1 = r0[r2]
            java.nio.ByteOrder r0 = r5.A09
            X.2kb r0 = X.C227982kb.A00(r0, r6)
            goto L_0x02bb
        L_0x0269:
            java.util.HashMap[] r0 = r5.A0I
            r1 = r0[r2]
            java.lang.String r6 = X.002.A0C(r3, r11)
            java.nio.charset.Charset r0 = A0L
            byte[] r7 = r6.getBytes(r0)
            int r6 = r7.length
            r20 = -1
            X.2kb r0 = new X.2kb
            r19 = r0
            r22 = r7
            r23 = r18
            r24 = r6
            r19.<init>(r20, r22, r23, r24)
            goto L_0x02bb
        L_0x0288:
            java.util.HashMap[] r0 = r5.A0I
            r1 = r0[r2]
            int r0 = r3.length()
            if (r0 != r15) goto L_0x02c0
            char r0 = r3.charAt(r11)
            r7 = 48
            if (r0 < r7) goto L_0x02c0
            char r6 = r3.charAt(r11)
            r0 = 49
            if (r6 > r0) goto L_0x02c0
            byte[] r6 = new byte[r15]
            char r0 = r3.charAt(r11)
            int r0 = r0 - r7
            byte r0 = (byte) r0
            r6[r11] = r0
            r20 = -1
            X.2kb r0 = new X.2kb
            r19 = r0
            r22 = r6
            r23 = r15
            r24 = r15
            r19.<init>(r20, r22, r23, r24)
        L_0x02bb:
            r1.put(r4, r0)
            goto L_0x010e
        L_0x02c0:
            java.nio.charset.Charset r0 = A0L
            byte[] r7 = r3.getBytes(r0)
            int r6 = r7.length
            r20 = -1
            X.2kb r0 = new X.2kb
            r19 = r0
            r22 = r7
            r23 = r15
            r24 = r6
            r19.<init>(r20, r22, r23, r24)
            goto L_0x02bb
        L_0x02d7:
            java.lang.String r0 = X.002.A0u(r10, r4, r11, r3)
            android.util.Log.w(r9, r0)
            return
        L_0x02df:
            java.lang.String r1 = "tag shouldn't be null"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227922kK.A0P(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A0Q() {
        /*
            r7 = this;
            boolean r0 = r7.A0C
            r6 = 0
            if (r0 != 0) goto L_0x0006
            return r6
        L_0x0006:
            byte[] r0 = r7.A0F
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            android.content.res.AssetManager$AssetInputStream r4 = r7.A06     // Catch:{ Exception -> 0x0080, all -> 0x0069 }
            if (r4 == 0) goto L_0x001f
            boolean r0 = r4.markSupported()     // Catch:{ Exception -> 0x001d, all -> 0x006c }
            if (r0 == 0) goto L_0x0019
            r4.reset()     // Catch:{ Exception -> 0x001d, all -> 0x006c }
            goto L_0x0028
        L_0x0019:
            X.C227992kc.A00(r4)
            return r6
        L_0x001d:
            r5 = r6
            goto L_0x0084
        L_0x001f:
            java.lang.String r0 = r7.A08     // Catch:{ Exception -> 0x0080, all -> 0x0069 }
            if (r0 == 0) goto L_0x002a
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0080, all -> 0x0069 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0080, all -> 0x0069 }
        L_0x0028:
            r5 = r6
            goto L_0x003c
        L_0x002a:
            java.io.FileDescriptor r0 = r7.A07     // Catch:{ Exception -> 0x0080, all -> 0x0069 }
            java.io.FileDescriptor r5 = android.system.Os.dup(r0)     // Catch:{ Exception -> 0x0080, all -> 0x0069 }
            int r2 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0083, all -> 0x0067 }
            r0 = 0
            android.system.Os.lseek(r5, r0, r2)     // Catch:{ Exception -> 0x0083, all -> 0x0067 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0083, all -> 0x0067 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0083, all -> 0x0067 }
        L_0x003c:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x0084, all -> 0x0065 }
            X.2kZ r3 = new X.2kZ     // Catch:{ Exception -> 0x0084, all -> 0x0065 }
            r3.<init>(r4, r0)     // Catch:{ Exception -> 0x0084, all -> 0x0065 }
            int r1 = r7.A05     // Catch:{ Exception -> 0x0084, all -> 0x0065 }
            int r0 = r7.A01     // Catch:{ Exception -> 0x0084, all -> 0x0065 }
            int r1 = r1 + r0
            r3.A00(r1)     // Catch:{ Exception -> 0x0084, all -> 0x0065 }
            int r0 = r7.A04     // Catch:{ Exception -> 0x0084, all -> 0x0065 }
            byte[] r2 = new byte[r0]     // Catch:{ Exception -> 0x0084, all -> 0x0065 }
            r3.readFully(r2)     // Catch:{ Exception -> 0x0084, all -> 0x0065 }
            r7.A0F = r2     // Catch:{ Exception -> 0x0084, all -> 0x0065 }
            X.C227992kc.A00(r4)
            if (r5 == 0) goto L_0x0064
            java.lang.String r1 = "ExifInterfaceUtils"
            android.system.Os.close(r5)     // Catch:{ Exception -> 0x005f }
            return r2
        L_0x005f:
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
        L_0x0064:
            return r2
        L_0x0065:
            r2 = move-exception
            goto L_0x006e
        L_0x0067:
            r2 = move-exception
            goto L_0x006f
        L_0x0069:
            r2 = move-exception
            r5 = r6
            goto L_0x006f
        L_0x006c:
            r2 = move-exception
            r5 = r6
        L_0x006e:
            r6 = r4
        L_0x006f:
            X.C227992kc.A00(r6)
            if (r5 == 0) goto L_0x007f
            java.lang.String r1 = "ExifInterfaceUtils"
            android.system.Os.close(r5)     // Catch:{ Exception -> 0x007a }
            throw r2
        L_0x007a:
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
        L_0x007f:
            throw r2
        L_0x0080:
            r4 = r6
            r5 = r6
            goto L_0x0084
        L_0x0083:
            r4 = r6
        L_0x0084:
            X.C227992kc.A00(r4)
            if (r5 == 0) goto L_0x0094
            java.lang.String r1 = "ExifInterfaceUtils"
            android.system.Os.close(r5)     // Catch:{ Exception -> 0x008f }
            return r6
        L_0x008f:
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
        L_0x0094:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227922kK.A0Q():byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C227922kK(java.io.FileDescriptor r6) {
        /*
            r5 = this;
            r5.<init>()
            r1 = 10
            java.util.HashMap[] r0 = new java.util.HashMap[r1]
            r5.A0I = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            r5.A0A = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r5.A09 = r0
            if (r6 == 0) goto L_0x0064
            r4 = 0
            r5.A06 = r4
            r5.A08 = r4
            r3 = 0
            int r2 = android.system.OsConstants.SEEK_CUR     // Catch:{ Exception -> 0x0034 }
            r0 = 0
            android.system.Os.lseek(r6, r0, r2)     // Catch:{ Exception -> 0x0034 }
            r5.A07 = r6
            java.io.FileDescriptor r6 = android.system.Os.dup(r6)     // Catch:{ Exception -> 0x002b }
            r3 = 1
            goto L_0x0036
        L_0x002b:
            r2 = move-exception
            java.lang.String r1 = "Failed to duplicate file descriptor"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1, r2)
            throw r0
        L_0x0034:
            r5.A07 = r4
        L_0x0036:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x004f }
            r0.<init>(r6)     // Catch:{ all -> 0x004f }
            r5.A0H(r0)     // Catch:{ all -> 0x0052 }
            X.C227992kc.A00(r0)
            if (r3 == 0) goto L_0x004e
            java.lang.String r1 = "ExifInterfaceUtils"
            android.system.Os.close(r6)     // Catch:{ Exception -> 0x0049 }
            return
        L_0x0049:
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
        L_0x004e:
            return
        L_0x004f:
            r2 = move-exception
            r0 = r4
            goto L_0x0053
        L_0x0052:
            r2 = move-exception
        L_0x0053:
            X.C227992kc.A00(r0)
            if (r3 == 0) goto L_0x0063
            java.lang.String r1 = "ExifInterfaceUtils"
            android.system.Os.close(r6)     // Catch:{ Exception -> 0x005e }
            throw r2
        L_0x005e:
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
        L_0x0063:
            throw r2
        L_0x0064:
            java.lang.String r0 = "fileDescriptor cannot be null"
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227922kK.<init>(java.io.FileDescriptor):void");
    }

    public static ByteOrder A03(C227962kZ r2) {
        short readShort = r2.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException(002.A0R("Invalid byte order: ", Integer.toHexString(readShort)));
    }

    private void A09(C227962kZ r4) {
        ByteOrder A032 = A03(r4);
        this.A09 = A032;
        r4.A02 = A032;
        int readUnsignedShort = r4.readUnsignedShort();
        int i = this.A00;
        if (i == 7 || i == 10 || readUnsignedShort == 42) {
            int readInt = r4.readInt();
            if (readInt >= 8) {
                int i2 = readInt - 8;
                if (i2 > 0) {
                    r4.A00(i2);
                    return;
                }
                return;
            }
            throw new IOException(002.A0O(AnonymousClass000.A00(2331), readInt));
        }
        throw new IOException(002.A0R(AnonymousClass000.A00(2333), Integer.toHexString(readUnsignedShort)));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.2kZ, X.50S] */
    private void A0E(AnonymousClass50S r6) {
        A09(r6);
        A0F(r6, 0);
        A0G(r6, 0);
        A0G(r6, 5);
        A0G(r6, 4);
        A06();
        if (this.A00 == 8) {
            HashMap[] hashMapArr = this.A0I;
            C227982kb r0 = (C227982kb) hashMapArr[1].get("MakerNote");
            if (r0 != null) {
                ? r2 = new C227962kZ(r0.A03);
                r2.A04.mark(Integer.MAX_VALUE);
                r2.A02 = this.A09;
                r2.A00(6);
                A0F(r2, 9);
                Object obj = hashMapArr[9].get("ColorSpace");
                if (obj != null) {
                    hashMapArr[1].put("ColorSpace", obj);
                }
            }
        }
    }

    public final int A0M(String str, int i) {
        C227982kb A022 = A02(this, str);
        if (A022 == null) {
            return i;
        }
        try {
            return A022.A03(this.A09);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public C227922kK(InputStream inputStream) {
        if (inputStream != null) {
            this.A08 = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.A06 = (AssetManager.AssetInputStream) inputStream;
                this.A07 = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        Os.lseek(fileInputStream.getFD(), 0, OsConstants.SEEK_CUR);
                        this.A06 = null;
                        this.A07 = fileInputStream.getFD();
                    } catch (Exception unused) {
                    }
                }
                this.A06 = null;
                this.A07 = null;
            }
            A0H(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    public C227922kK(String str) {
        if (str != null) {
            A0I(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public C227922kK(File file) {
        A0I(file.getAbsolutePath());
    }
}
