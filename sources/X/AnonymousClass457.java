package X;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.util.Pair;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.457  reason: invalid class name */
public abstract class AnonymousClass457 {
    public static Handler A00;
    public static File A01;
    public static File A02;
    public static File A03;
    public static File A04;
    public static File A05;
    public static File A06;
    public static File A07;
    public static File A08;
    public static File A09;
    public static File A0A;

    public static String A09(Context context, String str, long j, boolean z) {
        return A0A(context, str, j, z, true, false);
    }

    public static Pair A00(String str) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        Q0V A002 = Q0V.A00("video_session_util_extract_media_info");
        try {
            A002.ETt(str);
            for (int i = 0; i < A002.A00.getTrackCount(); i++) {
                String obj = A002.A00.getTrackFormat(i).toString();
                arrayList.add(obj);
                for (String split : obj.substring(1, obj.length() - 1).split(",")) {
                    String[] split2 = split.split("=");
                    hashMap.put(0mp.A06("track_%s_%s", new Object[]{Integer.valueOf(i + 1), split2[0].trim()}), split2[1].trim());
                }
            }
            A002.release();
            return Pair.create(0mp.A05("\n", arrayList), hashMap);
        } catch (Exception e) {
            0wb.A07("media_track_info_extraction_error", e);
            Pair create = Pair.create(002.A0R("Failed to extract track info: ", e.getMessage()), hashMap);
            A002.release();
            return create;
        } catch (Throwable th) {
            A002.release();
            throw th;
        }
    }

    public static File A02() {
        File file = A06;
        if (file != null) {
            return file;
        }
        File CGg = AnonymousClass1F2.A00().CGg((1LJ) null, 479650569);
        A06 = CGg;
        return CGg;
    }

    public static File A03() {
        File file = A07;
        if (file != null) {
            return file;
        }
        File CGg = AnonymousClass1F2.A00().CGg((1LJ) null, 1091194249);
        A07 = CGg;
        return CGg;
    }

    public static File A04() {
        File file = A08;
        if (file != null) {
            return file;
        }
        File CGg = AnonymousClass1F2.A00().CGg((1LJ) null, 2067368366);
        A08 = CGg;
        return CGg;
    }

    public static File A05() {
        File file = A09;
        if (file != null) {
            return file;
        }
        File CGg = AnonymousClass1F2.A00().CGg((1LJ) null, 1737640186);
        A09 = CGg;
        return CGg;
    }

    public static File A06() {
        File file = A0A;
        if (file != null) {
            return file;
        }
        File AXT = AnonymousClass1F2.A00().AXT((1LJ) null, 1877184530);
        A0A = AXT;
        return AXT;
    }

    public static String A07(long j) {
        return new SimpleDateFormat("'VID'_yyyyMMdd_HHmmss_SSS", Locale.US).format(new Date(j));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (X.182.A06(X.0Tu.A05, r13, 36311049384755626L) == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        r0 = (long) (((double) r14.A1N.A00()) * X.182.A00(X.0Tu.A06, r13, 37155474314952714L));
        r2 = r12.getExternalFilesDir((java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r2 != null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        if (r0 <= r6) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r0 < X.0mb.A00(r12)) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
        r2 = new android.os.StatFs(r2.getAbsolutePath());
        r6 = r2.getAvailableBlocksLong() * r2.getBlockSizeLong();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c8, code lost:
        if (r15 == X.AnonymousClass05K.A00) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r14.A4w != false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r15 != X.AnonymousClass05K.A00) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r0 != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A08(android.content.Context r12, com.instagram.common.session.UserSession r13, X.AnonymousClass3Q2 r14, java.lang.Integer r15) {
        /*
            java.lang.String r10 = "mp4"
            r4 = r14
            boolean r0 = r14.A5V
            r9 = r12
            if (r0 == 0) goto L_0x008a
            java.util.EnumSet r0 = com.instagram.pendingmedia.model.constants.ShareType.A02
            boolean r1 = r14.A15(r0)
            boolean r0 = X.C59911Jba.A00(r14)
            boolean r0 = X.C63470KxZ.A00(r13, r1, r0)
            if (r0 == 0) goto L_0x001d
            boolean r1 = r14.A4w
            r0 = 1
            if (r1 == 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r15 == r1) goto L_0x0024
        L_0x0022:
            if (r0 == 0) goto L_0x00cc
        L_0x0024:
            r8 = 1
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311049384755626(0x8100b5000001aa, double:3.026592071554914E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            if (r0 == 0) goto L_0x005c
            com.instagram.pendingmedia.model.ClipInfo r0 = r14.A1N
            long r0 = r0.A00()
            double r2 = (double) r0
            X.0Tu r6 = X.0Tu.A06
            r0 = 37155474314952714(0x8400b50001000a, double:3.5606097976378246E-306)
            double r0 = X.182.A00(r6, r13, r0)
            double r2 = r2 * r0
            long r0 = (long) r2
            r2 = 0
            java.io.File r2 = r12.getExternalFilesDir(r2)
            if (r2 != 0) goto L_0x0077
            r6 = 0
        L_0x004f:
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x005c
            long r6 = X.0mb.A00(r12)
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r13 = 0
            if (r2 < 0) goto L_0x005d
        L_0x005c:
            r13 = r8
        L_0x005d:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r15 != r0) goto L_0x0072
            java.lang.String r0 = r14.A35
            long r11 = java.lang.Long.parseLong(r0)
        L_0x0067:
            boolean r0 = r14.A66
            r14 = r0 ^ 1
            boolean r15 = r4.A5p
            java.lang.String r0 = A0A(r9, r10, r11, r13, r14, r15)
            return r0
        L_0x0072:
            long r11 = java.lang.System.nanoTime()
            goto L_0x0067
        L_0x0077:
            java.lang.String r3 = r2.getAbsolutePath()
            android.os.StatFs r2 = new android.os.StatFs
            r2.<init>(r3)
            long r6 = r2.getAvailableBlocksLong()
            long r2 = r2.getBlockSizeLong()
            long r6 = r6 * r2
            goto L_0x004f
        L_0x008a:
            boolean r0 = r14.A0x()
            if (r0 != 0) goto L_0x00c6
            com.instagram.pendingmedia.model.constants.ShareType r1 = r14.A0E()
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.MEDIA_KIT
            if (r1 == r0) goto L_0x00c6
            boolean r0 = X.0oI.A09(r12)
            if (r0 != 0) goto L_0x00c6
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            com.instagram.pendingmedia.model.constants.ShareType r0 = r14.A0E()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00cc
            boolean r0 = r14.A5U
            if (r0 != 0) goto L_0x00cc
            X.1Av r3 = X.1Au.A00(r13)
            X.0s0 r2 = r3.A7p
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 31
            r0 = r1[r0]
            java.lang.Object r0 = r2.CDM(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0022
        L_0x00c6:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r15 != r0) goto L_0x00cc
            goto L_0x0024
        L_0x00cc:
            r8 = 0
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass457.A08(android.content.Context, com.instagram.common.session.UserSession, X.3Q2, java.lang.Integer):java.lang.String");
    }

    public static String A0A(Context context, String str, long j, boolean z, boolean z2, boolean z3) {
        File file;
        if (!z || (Build.VERSION.SDK_INT < 33 && !1DL.A07(context, AnonymousClass000.A00(10)))) {
            A0E();
            file = (File) AnonymousClass45D.A01.getValue();
        } else {
            File file2 = A05;
            if (file2 == null) {
                file2 = new File(0eY.A00(Environment.DIRECTORY_MOVIES), 0lz.A00(context).replace(' ', '_'));
                A05 = file2;
            }
            file2.mkdirs();
            file = A05;
        }
        String A072 = A07(j);
        if (z3) {
            A072 = 002.A0R(A072, "_secondary");
        }
        File file3 = new File(file, 0mp.A06("%s.%s", new Object[]{A072, str}));
        if (z2) {
            file3.delete();
        }
        return file3.getAbsolutePath();
    }

    public static File A01() {
        return new File(A04(), 002.A0e(AnonymousClass000.A00(1234), ".jpeg", System.currentTimeMillis()));
    }

    public static String A0B(String str) {
        String A0g = 002.A0g(A07(System.currentTimeMillis()), AnonymousClass000.A00(2554), ".mp4");
        File file = new File(A03(), str);
        file.mkdirs();
        return new File(file, A0g).getPath();
    }

    public static String A0C(String str, int i, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (str == null) {
            str = 0mp.A06("%s_session_%s", new Object[]{A07(currentTimeMillis), Integer.valueOf(i)});
            if (z) {
                new File(A03(), str).mkdirs();
            }
        }
        return str;
    }

    public static String A0D(String str, String str2) {
        File A022 = A02();
        A022.mkdirs();
        return new File(A022, 002.A0r("audio_", str, str2, System.currentTimeMillis())).getAbsolutePath();
    }

    public static void A0E() {
        A03().mkdirs();
        A04().mkdirs();
        A02().mkdirs();
        File file = A02;
        if (file == null) {
            file = AnonymousClass1F2.A00().CGg((1LJ) null, 1700449719);
            A02 = file;
        }
        file.mkdirs();
        A05().mkdirs();
        AnonymousClass0eM r4 = AnonymousClass45D.A01;
        ((File) r4.getValue()).mkdirs();
        A06().mkdir();
        File file2 = A01;
        if (file2 == null) {
            file2 = AnonymousClass1F2.A00().AXT((1LJ) null, 2066873147);
            A01 = file2;
        }
        file2.mkdir();
        File file3 = A03;
        if (file3 == null) {
            file3 = AnonymousClass1F2.A00().CGg((1LJ) null, 1460857084);
            A03 = file3;
        }
        file3.mkdir();
        boolean isDirectory = A03().isDirectory();
        boolean isDirectory2 = A04().isDirectory();
        boolean isDirectory3 = A02().isDirectory();
        boolean isDirectory4 = ((File) r4.getValue()).isDirectory();
        File file4 = A03;
        if (file4 == null) {
            file4 = AnonymousClass1F2.A00().CGg((1LJ) null, 1460857084);
            A03 = file4;
        }
        boolean isDirectory5 = file4.isDirectory();
        if (!isDirectory || !isDirectory2 || !isDirectory3 || !isDirectory4 || !isDirectory5) {
            Boolean valueOf = Boolean.valueOf(isDirectory);
            String A062 = 0mp.A06("clips:%s covers:%s audio:%s renderedVideo:%s assetsInternal:%s", new Object[]{valueOf, valueOf, Boolean.valueOf(isDirectory3), Boolean.valueOf(isDirectory4), Boolean.valueOf(isDirectory5)});
            0wb.A03("create_video_dirs", A062);
            throw new IllegalStateException(002.A0R("Could not create video directories. reason:", A062));
        }
    }

    public static void A0F(String str) {
        File file = new File(A03(), str);
        if (file.isDirectory()) {
            0nY.A00().ATE(new KId(file));
        }
    }
}
