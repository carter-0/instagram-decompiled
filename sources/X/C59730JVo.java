package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.JVo  reason: case insensitive filesystem */
public abstract class C59730JVo {
    public static final long A00 = TimeUnit.MINUTES.toMillis(20);

    public static C290815g0 A00(Context context, UserSession userSession, 1Xj r3, String str) {
        return A03(context, userSession, A05(context, r3, str, false, false));
    }

    public static C290815g0 A04(Context context, UserSession userSession, C11211SFl sFl, long j, boolean z) {
        return new C290815g0(new C13155TNn(context, userSession, sFl, sFl.A01, sFl.A00, j, z), 483);
    }

    public static C290815g0 A01(Context context, UserSession userSession, C331377Qt r12) {
        String str;
        String A002 = C66579MXk.A00(541);
        boolean A01 = r12.A01();
        if (A01) {
            str = r12.A05;
        } else {
            str = r12.A04;
        }
        List list = r12.A07;
        if (list == null) {
            list = Collections.emptyList();
        }
        return A04(context, userSession, new C11211SFl(str, A002, 0, 0, A01, true, !C271404in.A0D(C271404in.A05(list)), false, false), -1, true);
    }

    public static C290815g0 A03(Context context, UserSession userSession, C11211SFl sFl) {
        return A04(context, userSession, sFl, -1, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r7 = r13.CeS();
        r3 = r13.CEL();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r16 == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r0 = r13.A1p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r0 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        r0 = r0.Al9();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r0 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        r2 = (com.instagram.model.mediasize.ExtendedImageUrl) X.00k.A0O(r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        r2.getClass();
        r1 = X.C271404in.A03((com.instagram.api.schemas.MusicProduct) null, r13, (java.lang.Integer) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r7 == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        r0 = X.C255583uN.A00(r3);
        r0.getClass();
        r0 = X.AnonymousClass3OT.A00(r0);
        X.0qQ.A0A(r0);
        r3 = ((com.instagram.model.mediasize.VideoUrlImpl) r0).A06;
        r5 = 0;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        if (r15 != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        if (X.C271404in.A0D(r1) == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        return new X.C11211SFl(r3, r14, r5, r6, r7, false, r9, r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        r3 = X.C226972iH.A00(r2).getUrl();
        r5 = r2.getWidth();
        r6 = r2.getHeight();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
        r2 = r13.A1n(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.C284745Nt.A09(r1) == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r1 != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.B92();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r0 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0.isEmpty() == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C11211SFl A05(android.content.Context r12, X.1Xj r13, java.lang.String r14, boolean r15, boolean r16) {
        /*
            X.1Xy r0 = r13.A0C
            com.instagram.feed.media.CreativeConfigIntf r1 = r0.AsO()
            if (r1 == 0) goto L_0x000f
            boolean r0 = X.C284745Nt.A09(r1)
            r10 = 1
            if (r0 != 0) goto L_0x0012
        L_0x000f:
            r10 = 0
            if (r1 == 0) goto L_0x001f
        L_0x0012:
            java.util.List r0 = r1.B92()
            if (r0 == 0) goto L_0x001f
            boolean r0 = r0.isEmpty()
            r11 = 1
            if (r0 == 0) goto L_0x0020
        L_0x001f:
            r11 = 0
        L_0x0020:
            boolean r7 = r13.CeS()
            X.3WR r3 = r13.CEL()
            if (r16 == 0) goto L_0x0080
            com.instagram.model.mediasize.ImageInfo r0 = r13.A1p()
            if (r0 == 0) goto L_0x007e
            r1 = 0
            java.util.List r0 = r0.Al9()
            if (r0 == 0) goto L_0x007e
            java.lang.Object r2 = X.00k.A0O(r0, r1)
            com.instagram.model.mediasize.ExtendedImageUrl r2 = (com.instagram.model.mediasize.ExtendedImageUrl) r2
        L_0x003d:
            r2.getClass()
            r0 = 0
            com.instagram.music.common.model.MusicOverlayStickerModel r1 = X.C271404in.A03(r0, r13, r0)
            if (r7 == 0) goto L_0x006d
            com.instagram.model.mediasize.VideoUrlImpl r0 = X.C255583uN.A00(r3)
            r0.getClass()
            X.16c r0 = X.AnonymousClass3OT.A00(r0)
            X.0qQ.A0A(r0)
            com.instagram.model.mediasize.VideoUrlImpl r0 = (com.instagram.model.mediasize.VideoUrlImpl) r0
            java.lang.String r3 = r0.A06
            r5 = 0
            r6 = 0
        L_0x005b:
            if (r15 != 0) goto L_0x0064
            boolean r0 = X.C271404in.A0D(r1)
            r9 = 1
            if (r0 == 0) goto L_0x0065
        L_0x0064:
            r9 = 0
        L_0x0065:
            r8 = 0
            X.SFl r2 = new X.SFl
            r4 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r2
        L_0x006d:
            com.instagram.common.typedurl.ImageUrl r0 = X.C226972iH.A00(r2)
            java.lang.String r3 = r0.getUrl()
            int r5 = r2.getWidth()
            int r6 = r2.getHeight()
            goto L_0x005b
        L_0x007e:
            r2 = 0
            goto L_0x003d
        L_0x0080:
            com.instagram.model.mediasize.ExtendedImageUrl r2 = r13.A1n(r12)
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59730JVo.A05(android.content.Context, X.1Xj, java.lang.String, boolean, boolean):X.SFl");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r2.isEmpty() != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        if (r0.isEmpty() != false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C11211SFl A06(X.C270184gK r12, java.lang.String r13) {
        /*
            X.3Q2 r3 = r12.A00
            boolean r8 = r3.A12()
            if (r8 == 0) goto L_0x003d
            java.lang.String r4 = r3.A3V
        L_0x000a:
            r6 = 0
            java.util.List r1 = r3.A4b
            X.497 r0 = X.C59923Jbm.A00
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r0.A02(r1)
            boolean r0 = X.C271404in.A0D(r0)
            r10 = r0 ^ 1
            java.util.List r0 = r3.A4S
            if (r0 == 0) goto L_0x0047
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r0.iterator()
        L_0x0025:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r0 = r1.next()
            X.LMH r0 = (X.LMH) r0
            com.instagram.api.schemas.CameraTool r0 = r0.A00
            X.JZd r0 = X.C59808JZc.A00(r0)
            if (r0 == 0) goto L_0x0025
            r2.add(r0)
            goto L_0x0025
        L_0x003d:
            java.lang.String r4 = r3.A33
            goto L_0x000a
        L_0x0040:
            boolean r1 = r2.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0048
        L_0x0047:
            r0 = 1
        L_0x0048:
            r11 = r0 ^ 1
            java.util.List r0 = r3.A4S
            if (r0 == 0) goto L_0x0055
            boolean r0 = r0.isEmpty()
            r12 = 1
            if (r0 == 0) goto L_0x0056
        L_0x0055:
            r12 = 0
        L_0x0056:
            r9 = 1
            X.SFl r3 = new X.SFl
            r5 = r13
            r7 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59730JVo.A06(X.4gK, java.lang.String):X.SFl");
    }

    public static File A07(0lg r16, File file, String str, long j) {
        String canonicalPath;
        AnonymousClass47Y r11;
        11Z.A05(AnonymousClass000.A00(2514));
        File file2 = null;
        0lg r15 = r16;
        File file3 = file;
        String str2 = str;
        long j2 = j;
        try {
            AnonymousClass2hY E1h = AnonymousClass2hY.A09.E1h(str2);
            1QU A002 = JTQ.A0E().A00();
            if (j != -1) {
                r11 = 14G.A03().A07((AnonymousClass47S) null, A002, E1h, r15, (Map) null, 0, j);
            } else {
                r11 = 14G.A03().A08(A002, E1h, r15);
            }
            if (file3 != null) {
                try {
                    if (!0mb.A09(file3, r11.A02.AjD()) && r15 != null) {
                        try {
                            0f9 AEf = 0wj.A01.AEf("copyFile failed", 817899034);
                            AEf.ABQ(DialogModule.KEY_MESSAGE, 002.A0R("saveFile=", file3.getCanonicalPath()));
                            AEf.ABP("maxByteRange", j2);
                            AEf.ABQ("videoUrl", str2);
                            AEf.report();
                        } catch (Throwable th) {
                            th = th;
                            file2 = file3;
                        }
                    }
                    file2 = file3;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        r11.close();
                    } catch (Throwable th3) {
                        C9153RRe.A00(th, th3);
                    }
                    throw th;
                }
            }
            r11.close();
            return file2;
        } catch (IOException e) {
            if (r15 != null) {
                try {
                    0f9 AEf2 = 0wj.A01.AEf("IOException", 817899034);
                    if (file3 == null) {
                        canonicalPath = "null";
                    } else {
                        canonicalPath = file3.getCanonicalPath();
                    }
                    AEf2.ABQ(DialogModule.KEY_MESSAGE, 002.A0R("saveFile=", canonicalPath));
                    AEf2.ABP("maxByteRange", j2);
                    AnonymousClass7TF.A19(AEf2, "videoUrl", str2, e);
                    return file2;
                } catch (IOException unused) {
                    return file2;
                }
            }
            return file2;
        }
    }

    public static void A08(Context context, File file) {
        if (context != null) {
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(file));
            context.sendBroadcast(intent);
            return;
        }
        throw AnonymousClass7TE.A0w("null arguments");
    }

    public static C290815g0 A02(Context context, UserSession userSession, C255773uh r8, String str, boolean z, boolean z2) {
        C11211SFl A05;
        Context context2 = context;
        if (r8.A1Y()) {
            C270184gK r0 = r8.A0d;
            r0.getClass();
            A05 = A06(r0, str);
        } else {
            1Xj r1 = r8.A0b;
            r1.getClass();
            A05 = A05(context, r1, str, z2, false);
        }
        return A04(context2, userSession, A05, -1, z);
    }
}
