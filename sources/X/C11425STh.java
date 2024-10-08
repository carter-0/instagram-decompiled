package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: X.STh  reason: case insensitive filesystem */
public abstract class C11425STh {
    public static final Map A00 = AnonymousClass7TE.A1E();
    public static final Set A01 = AnonymousClass7TE.A1F();
    public static final byte[] A02 = {31, -117, 8};
    public static final byte[] A03 = {80, 75, 3, 4};

    /* JADX WARNING: type inference failed for: r1v0, types: [X.SJy, java.lang.Object] */
    public static SIM A04(InputStream inputStream, String str) {
        ? obj = new Object();
        if (inputStream != null) {
            return A03(new C7494QGl(new C13197TPd(new C13205TPl(inputStream, obj))), str, true);
        }
        throw AnonymousClass7TE.A0w("in == null");
    }

    public static SSQ A05(Runnable runnable, String str, Callable callable) {
        SSQ ssq = null;
        if (str != null) {
            Object A022 = SDm.A01.A00.A02(str);
            if (A022 != null) {
                ssq = new SSQ(A022);
            }
            Map map = A00;
            if (map.containsKey(str)) {
                ssq = (SSQ) map.get(str);
            }
            if (ssq != null) {
                if (runnable != null) {
                    runnable.run();
                }
                return ssq;
            }
        }
        ssq = new SSQ(callable, false);
        if (str != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ssq.A03(new C11781SgT(str, atomicBoolean, 0));
            ssq.A02(new C11781SgT(str, atomicBoolean, 1));
            if (!atomicBoolean.get()) {
                Map map2 = A00;
                map2.put(str, ssq);
                if (map2.size() == 1) {
                    ArrayList A1D = AnonymousClass7TE.A1D(A01);
                    if (0 < A1D.size()) {
                        A1D.get(0);
                        throw AnonymousClass7TE.A11("onIdleChanged");
                    }
                }
            }
        }
        return ssq;
    }

    public static Boolean A06(YCT yct, byte[] bArr) {
        try {
            C13197TPd tPd = new C13197TPd(new C13203TPj(yct));
            for (byte b : bArr) {
                if (tPd.readByte() != b) {
                    return false;
                }
            }
            tPd.close();
            return AnonymousClass7TE.A0v();
        } catch (Exception | NoSuchMethodError unused) {
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.SJy, java.lang.Object] */
    public static SIM A00(Context context, String str, int i) {
        Object A022;
        if (str != null && (A022 = SDm.A01.A00.A02(str)) != null) {
            return new SIM(A022);
        }
        try {
            InputStream openRawResource = context.getResources().openRawResource(i);
            ? obj = new Object();
            if (openRawResource != null) {
                C13197TPd tPd = new C13197TPd(new C13205TPl(openRawResource, obj));
                if (A06(tPd, A03).booleanValue()) {
                    return A02(context, str, new ZipInputStream(new C8847RCn(tPd)));
                }
                if (!A06(tPd, A02).booleanValue()) {
                    return A04(new C8847RCn(tPd), str);
                }
                try {
                    return A04(new GZIPInputStream(new C8847RCn(tPd)), str);
                } catch (IOException e) {
                    return new SIM((Throwable) e);
                }
            } else {
                throw AnonymousClass7TE.A0w("in == null");
            }
        } catch (Resources.NotFoundException e2) {
            return new SIM((Throwable) e2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.SJy, java.lang.Object] */
    public static SIM A01(Context context, String str, String str2) {
        Object A022;
        if (str2 != null && (A022 = SDm.A01.A00.A02(str2)) != null) {
            return new SIM(A022);
        }
        try {
            InputStream open = context.getAssets().open(str);
            ? obj = new Object();
            if (open != null) {
                C13197TPd tPd = new C13197TPd(new C13205TPl(open, obj));
                if (A06(tPd, A03).booleanValue()) {
                    return A02(context, str2, new ZipInputStream(new C8847RCn(tPd)));
                }
                if (A06(tPd, A02).booleanValue()) {
                    return A04(new GZIPInputStream(new C8847RCn(tPd)), str2);
                }
                return A04(new C8847RCn(tPd), str2);
            }
            throw AnonymousClass7TE.A0w("in == null");
        } catch (IOException e) {
            return new SIM((Throwable) e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:158:0x031c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.SIM A03(X.C12828T8z r27, java.lang.String r28, boolean r29) {
        /*
            r5 = r27
            r4 = r28
            if (r28 == 0) goto L_0x0019
            X.SDm r0 = X.SDm.A01     // Catch:{ Exception -> 0x0314 }
            X.01e r0 = r0.A00     // Catch:{ Exception -> 0x0314 }
            java.lang.Object r0 = r0.A02(r4)     // Catch:{ Exception -> 0x0314 }
            X.S7N r0 = (X.S7N) r0     // Catch:{ Exception -> 0x0314 }
            if (r0 == 0) goto L_0x0019
            X.SIM r1 = new X.SIM     // Catch:{ Exception -> 0x0314 }
            r1.<init>((java.lang.Object) r0)     // Catch:{ Exception -> 0x0314 }
            goto L_0x031a
        L_0x0019:
            X.SNH r0 = X.C10121Rmx.A00     // Catch:{ Exception -> 0x0314 }
            float r21 = X.SSo.A00()     // Catch:{ Exception -> 0x0314 }
            X.01c r20 = new X.01c     // Catch:{ Exception -> 0x0314 }
            r20.<init>()     // Catch:{ Exception -> 0x0314 }
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x0314 }
            java.util.HashMap r18 = X.AnonymousClass7TE.A1E()     // Catch:{ Exception -> 0x0314 }
            java.util.HashMap r17 = X.AnonymousClass7TE.A1E()     // Catch:{ Exception -> 0x0314 }
            java.util.HashMap r16 = X.AnonymousClass7TE.A1E()     // Catch:{ Exception -> 0x0314 }
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x0314 }
            X.01s r14 = new X.01s     // Catch:{ Exception -> 0x0314 }
            r14.<init>()     // Catch:{ Exception -> 0x0314 }
            X.S7N r3 = new X.S7N     // Catch:{ Exception -> 0x0314 }
            r3.<init>()     // Catch:{ Exception -> 0x0314 }
            r5.A0J()     // Catch:{ Exception -> 0x0314 }
            r13 = 0
            r12 = 0
            r2 = 0
            r7 = 0
            r6 = 0
        L_0x004a:
            boolean r0 = r5.A0Q()     // Catch:{ Exception -> 0x0314 }
            if (r0 == 0) goto L_0x02d1
            X.SNH r0 = X.C10121Rmx.A03     // Catch:{ Exception -> 0x0314 }
            int r0 = r5.A0D(r0)     // Catch:{ Exception -> 0x0314 }
            switch(r0) {
                case 0: goto L_0x0060;
                case 1: goto L_0x0065;
                case 2: goto L_0x006a;
                case 3: goto L_0x006f;
                case 4: goto L_0x0078;
                case 5: goto L_0x007d;
                case 6: goto L_0x00af;
                case 7: goto L_0x00e0;
                case 8: goto L_0x0173;
                case 9: goto L_0x01e6;
                case 10: goto L_0x0287;
                default: goto L_0x0059;
            }     // Catch:{ Exception -> 0x0314 }
        L_0x0059:
            r5.A0M()     // Catch:{ Exception -> 0x0314 }
            r5.A0N()     // Catch:{ Exception -> 0x0314 }
            goto L_0x004a
        L_0x0060:
            int r13 = r5.A0C()     // Catch:{ Exception -> 0x0314 }
            goto L_0x004a
        L_0x0065:
            int r6 = r5.A0C()     // Catch:{ Exception -> 0x0314 }
            goto L_0x004a
        L_0x006a:
            float r12 = X.Pxh.A02(r5)     // Catch:{ Exception -> 0x0314 }
            goto L_0x004a
        L_0x006f:
            float r2 = X.Pxh.A02(r5)     // Catch:{ Exception -> 0x0314 }
            r0 = 1008981770(0x3c23d70a, float:0.01)
            float r2 = r2 - r0
            goto L_0x004a
        L_0x0078:
            float r7 = X.Pxh.A02(r5)     // Catch:{ Exception -> 0x0314 }
            goto L_0x004a
        L_0x007d:
            java.lang.String r1 = r5.A0G()     // Catch:{ Exception -> 0x0314 }
            java.lang.String r0 = "\\."
            java.lang.String[] r1 = r1.split(r0)     // Catch:{ Exception -> 0x0314 }
            r0 = 0
            r0 = r1[r0]     // Catch:{ Exception -> 0x0314 }
            int r10 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0314 }
            r0 = 1
            r0 = r1[r0]     // Catch:{ Exception -> 0x0314 }
            int r9 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0314 }
            r0 = 2
            r0 = r1[r0]     // Catch:{ Exception -> 0x0314 }
            int r8 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0314 }
            r1 = 4
            r0 = 0
            if (r10 < r1) goto L_0x00a9
            if (r10 > r1) goto L_0x004a
            if (r9 < r1) goto L_0x00a9
            if (r9 > r1) goto L_0x004a
            if (r8 < r0) goto L_0x00a9
            goto L_0x004a
        L_0x00a9:
            java.lang.String r0 = "Lottie only supports bodymovin >= 4.4.0"
            r3.A03(r0)     // Catch:{ Exception -> 0x0314 }
            goto L_0x004a
        L_0x00af:
            r5.A0I()     // Catch:{ Exception -> 0x0314 }
            r10 = 0
        L_0x00b3:
            boolean r0 = r5.A0Q()     // Catch:{ Exception -> 0x0314 }
            if (r0 == 0) goto L_0x02cc
            X.S56 r9 = X.C11157SCn.A00(r3, r5)     // Catch:{ Exception -> 0x0314 }
            java.lang.Integer r1 = r9.A0H     // Catch:{ Exception -> 0x0314 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ Exception -> 0x0314 }
            if (r1 != r0) goto L_0x00c5
            int r10 = r10 + 1
        L_0x00c5:
            r0 = r19
            r0.add(r9)     // Catch:{ Exception -> 0x0314 }
            long r0 = r9.A07     // Catch:{ Exception -> 0x0314 }
            r8 = r20
            r8.A09(r0, r9)     // Catch:{ Exception -> 0x0314 }
            r0 = 4
            if (r10 <= r0) goto L_0x00b3
            java.lang.String r1 = "You have "
            java.lang.String r0 = " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers."
            java.lang.String r0 = X.002.A0c(r1, r0, r10)     // Catch:{ Exception -> 0x0314 }
            X.S85.A00(r0)     // Catch:{ Exception -> 0x0314 }
            goto L_0x00b3
        L_0x00e0:
            r5.A0I()     // Catch:{ Exception -> 0x0314 }
        L_0x00e3:
            boolean r0 = r5.A0Q()     // Catch:{ Exception -> 0x0314 }
            if (r0 == 0) goto L_0x02cc
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x0314 }
            X.01c r11 = new X.01c     // Catch:{ Exception -> 0x0314 }
            r11.<init>()     // Catch:{ Exception -> 0x0314 }
            r5.A0J()     // Catch:{ Exception -> 0x0314 }
            r9 = 0
            r26 = r9
            r27 = r9
            r23 = 0
            r24 = 0
        L_0x00fe:
            boolean r0 = r5.A0Q()     // Catch:{ Exception -> 0x0314 }
            if (r0 == 0) goto L_0x0155
            X.SNH r0 = X.C10121Rmx.A00     // Catch:{ Exception -> 0x0314 }
            int r1 = r5.A0D(r0)     // Catch:{ Exception -> 0x0314 }
            if (r1 == 0) goto L_0x0150
            r0 = 1
            if (r1 == r0) goto L_0x0136
            r0 = 2
            if (r1 == r0) goto L_0x0131
            r0 = 3
            if (r1 == r0) goto L_0x012c
            r0 = 4
            if (r1 == r0) goto L_0x0127
            r0 = 5
            if (r1 == r0) goto L_0x0122
            r5.A0M()     // Catch:{ Exception -> 0x0314 }
            r5.A0N()     // Catch:{ Exception -> 0x0314 }
            goto L_0x00fe
        L_0x0122:
            java.lang.String r27 = r5.A0G()     // Catch:{ Exception -> 0x0314 }
            goto L_0x00fe
        L_0x0127:
            java.lang.String r26 = r5.A0G()     // Catch:{ Exception -> 0x0314 }
            goto L_0x00fe
        L_0x012c:
            int r24 = r5.A0C()     // Catch:{ Exception -> 0x0314 }
            goto L_0x00fe
        L_0x0131:
            int r23 = r5.A0C()     // Catch:{ Exception -> 0x0314 }
            goto L_0x00fe
        L_0x0136:
            r5.A0I()     // Catch:{ Exception -> 0x0314 }
        L_0x0139:
            boolean r0 = r5.A0Q()     // Catch:{ Exception -> 0x0314 }
            if (r0 == 0) goto L_0x014c
            X.S56 r8 = X.C11157SCn.A00(r3, r5)     // Catch:{ Exception -> 0x0314 }
            long r0 = r8.A07     // Catch:{ Exception -> 0x0314 }
            r11.A09(r0, r8)     // Catch:{ Exception -> 0x0314 }
            r10.add(r8)     // Catch:{ Exception -> 0x0314 }
            goto L_0x0139
        L_0x014c:
            r5.A0K()     // Catch:{ Exception -> 0x0314 }
            goto L_0x00fe
        L_0x0150:
            java.lang.String r9 = r5.A0G()     // Catch:{ Exception -> 0x0314 }
            goto L_0x00fe
        L_0x0155:
            r5.A0L()     // Catch:{ Exception -> 0x0314 }
            if (r26 == 0) goto L_0x016c
            X.Rxj r0 = new X.Rxj     // Catch:{ Exception -> 0x0314 }
            r22 = r0
            r25 = r9
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x0314 }
            java.lang.String r8 = r0.A05     // Catch:{ Exception -> 0x0314 }
            r1 = r17
            r1.put(r8, r0)     // Catch:{ Exception -> 0x0314 }
            goto L_0x00e3
        L_0x016c:
            r0 = r18
            r0.put(r9, r10)     // Catch:{ Exception -> 0x0314 }
            goto L_0x00e3
        L_0x0173:
            r5.A0J()     // Catch:{ Exception -> 0x0314 }
        L_0x0176:
            boolean r0 = r5.A0Q()     // Catch:{ Exception -> 0x0314 }
            if (r0 == 0) goto L_0x01e1
            X.SNH r0 = X.C10121Rmx.A01     // Catch:{ Exception -> 0x0314 }
            int r0 = r5.A0D(r0)     // Catch:{ Exception -> 0x0314 }
            if (r0 == 0) goto L_0x018b
            r5.A0M()     // Catch:{ Exception -> 0x0314 }
            r5.A0N()     // Catch:{ Exception -> 0x0314 }
            goto L_0x0176
        L_0x018b:
            r5.A0I()     // Catch:{ Exception -> 0x0314 }
        L_0x018e:
            boolean r0 = r5.A0Q()     // Catch:{ Exception -> 0x0314 }
            if (r0 == 0) goto L_0x01dd
            X.SNH r0 = X.C9898RjD.A00     // Catch:{ Exception -> 0x0314 }
            r5.A0J()     // Catch:{ Exception -> 0x0314 }
            r10 = 0
            r9 = r10
            r1 = r10
        L_0x019c:
            boolean r0 = r5.A0Q()     // Catch:{ Exception -> 0x0314 }
            if (r0 == 0) goto L_0x01cd
            X.SNH r0 = X.C9898RjD.A00     // Catch:{ Exception -> 0x0314 }
            int r8 = r5.A0D(r0)     // Catch:{ Exception -> 0x0314 }
            if (r8 == 0) goto L_0x01c8
            r0 = 1
            if (r8 == r0) goto L_0x01c3
            r0 = 2
            if (r8 == r0) goto L_0x01be
            r0 = 3
            if (r8 == r0) goto L_0x01ba
            r5.A0M()     // Catch:{ Exception -> 0x0314 }
            r5.A0N()     // Catch:{ Exception -> 0x0314 }
            goto L_0x019c
        L_0x01ba:
            r5.A0B()     // Catch:{ Exception -> 0x0314 }
            goto L_0x019c
        L_0x01be:
            java.lang.String r1 = r5.A0G()     // Catch:{ Exception -> 0x0314 }
            goto L_0x019c
        L_0x01c3:
            java.lang.String r9 = r5.A0G()     // Catch:{ Exception -> 0x0314 }
            goto L_0x019c
        L_0x01c8:
            java.lang.String r10 = r5.A0G()     // Catch:{ Exception -> 0x0314 }
            goto L_0x019c
        L_0x01cd:
            r5.A0L()     // Catch:{ Exception -> 0x0314 }
            X.Rvo r8 = new X.Rvo     // Catch:{ Exception -> 0x0314 }
            r8.<init>(r10, r9, r1)     // Catch:{ Exception -> 0x0314 }
            java.lang.String r1 = r8.A02     // Catch:{ Exception -> 0x0314 }
            r0 = r16
            r0.put(r1, r8)     // Catch:{ Exception -> 0x0314 }
            goto L_0x018e
        L_0x01dd:
            r5.A0K()     // Catch:{ Exception -> 0x0314 }
            goto L_0x0176
        L_0x01e1:
            r5.A0L()     // Catch:{ Exception -> 0x0314 }
            goto L_0x004a
        L_0x01e6:
            r5.A0I()     // Catch:{ Exception -> 0x0314 }
        L_0x01e9:
            boolean r0 = r5.A0Q()     // Catch:{ Exception -> 0x0314 }
            if (r0 == 0) goto L_0x02cc
            X.SNH r0 = X.C10057Rlu.A00     // Catch:{ Exception -> 0x0314 }
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x0314 }
            r5.A0J()     // Catch:{ Exception -> 0x0314 }
            r23 = 0
            r8 = 0
            r24 = r23
            r27 = 0
            r26 = 0
        L_0x0201:
            boolean r0 = r5.A0Q()     // Catch:{ Exception -> 0x0314 }
            if (r0 == 0) goto L_0x0272
            X.SNH r0 = X.C10057Rlu.A01     // Catch:{ Exception -> 0x0314 }
            int r1 = r5.A0D(r0)     // Catch:{ Exception -> 0x0314 }
            if (r1 == 0) goto L_0x0269
            r0 = 1
            if (r1 == r0) goto L_0x0265
            r0 = 2
            if (r1 == r0) goto L_0x0260
            r0 = 3
            if (r1 == r0) goto L_0x025b
            r0 = 4
            if (r1 == r0) goto L_0x0256
            r0 = 5
            if (r1 == r0) goto L_0x0225
            r5.A0M()     // Catch:{ Exception -> 0x0314 }
            r5.A0N()     // Catch:{ Exception -> 0x0314 }
            goto L_0x0201
        L_0x0225:
            r5.A0J()     // Catch:{ Exception -> 0x0314 }
        L_0x0228:
            boolean r0 = r5.A0Q()     // Catch:{ Exception -> 0x0314 }
            if (r0 == 0) goto L_0x0252
            X.SNH r0 = X.C10057Rlu.A00     // Catch:{ Exception -> 0x0314 }
            int r0 = r5.A0D(r0)     // Catch:{ Exception -> 0x0314 }
            if (r0 == 0) goto L_0x023d
            r5.A0M()     // Catch:{ Exception -> 0x0314 }
            r5.A0N()     // Catch:{ Exception -> 0x0314 }
            goto L_0x0228
        L_0x023d:
            r5.A0I()     // Catch:{ Exception -> 0x0314 }
        L_0x0240:
            boolean r0 = r5.A0Q()     // Catch:{ Exception -> 0x0314 }
            if (r0 == 0) goto L_0x024e
            X.Tbo r0 = X.SQK.A01(r3, r5)     // Catch:{ Exception -> 0x0314 }
            r9.add(r0)     // Catch:{ Exception -> 0x0314 }
            goto L_0x0240
        L_0x024e:
            r5.A0K()     // Catch:{ Exception -> 0x0314 }
            goto L_0x0228
        L_0x0252:
            r5.A0L()     // Catch:{ Exception -> 0x0314 }
            goto L_0x0201
        L_0x0256:
            java.lang.String r24 = r5.A0G()     // Catch:{ Exception -> 0x0314 }
            goto L_0x0201
        L_0x025b:
            java.lang.String r23 = r5.A0G()     // Catch:{ Exception -> 0x0314 }
            goto L_0x0201
        L_0x0260:
            double r27 = r5.A0B()     // Catch:{ Exception -> 0x0314 }
            goto L_0x0201
        L_0x0265:
            r5.A0B()     // Catch:{ Exception -> 0x0314 }
            goto L_0x0201
        L_0x0269:
            java.lang.String r0 = r5.A0G()     // Catch:{ Exception -> 0x0314 }
            char r26 = r0.charAt(r8)     // Catch:{ Exception -> 0x0314 }
            goto L_0x0201
        L_0x0272:
            r5.A0L()     // Catch:{ Exception -> 0x0314 }
            X.S2b r0 = new X.S2b     // Catch:{ Exception -> 0x0314 }
            r22 = r0
            r25 = r9
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x0314 }
            int r1 = r0.hashCode()     // Catch:{ Exception -> 0x0314 }
            r14.A07(r1, r0)     // Catch:{ Exception -> 0x0314 }
            goto L_0x01e9
        L_0x0287:
            r5.A0I()     // Catch:{ Exception -> 0x0314 }
        L_0x028a:
            boolean r0 = r5.A0Q()     // Catch:{ Exception -> 0x0314 }
            if (r0 == 0) goto L_0x02cc
            r9 = 0
            r5.A0J()     // Catch:{ Exception -> 0x0314 }
            r8 = 0
            r1 = 0
        L_0x0296:
            boolean r0 = r5.A0Q()     // Catch:{ Exception -> 0x0314 }
            if (r0 == 0) goto L_0x02c0
            X.SNH r0 = X.C10121Rmx.A02     // Catch:{ Exception -> 0x0314 }
            int r10 = r5.A0D(r0)     // Catch:{ Exception -> 0x0314 }
            if (r10 == 0) goto L_0x02bb
            r0 = 1
            if (r10 == r0) goto L_0x02b6
            r0 = 2
            if (r10 == r0) goto L_0x02b1
            r5.A0M()     // Catch:{ Exception -> 0x0314 }
            r5.A0N()     // Catch:{ Exception -> 0x0314 }
            goto L_0x0296
        L_0x02b1:
            float r1 = X.Pxh.A02(r5)     // Catch:{ Exception -> 0x0314 }
            goto L_0x0296
        L_0x02b6:
            float r8 = X.Pxh.A02(r5)     // Catch:{ Exception -> 0x0314 }
            goto L_0x0296
        L_0x02bb:
            java.lang.String r9 = r5.A0G()     // Catch:{ Exception -> 0x0314 }
            goto L_0x0296
        L_0x02c0:
            r5.A0L()     // Catch:{ Exception -> 0x0314 }
            X.Rta r0 = new X.Rta     // Catch:{ Exception -> 0x0314 }
            r0.<init>(r9, r8, r1)     // Catch:{ Exception -> 0x0314 }
            r15.add(r0)     // Catch:{ Exception -> 0x0314 }
            goto L_0x028a
        L_0x02cc:
            r5.A0K()     // Catch:{ Exception -> 0x0314 }
            goto L_0x004a
        L_0x02d1:
            float r0 = (float) r13     // Catch:{ Exception -> 0x0314 }
            float r0 = r0 * r21
            int r8 = (int) r0     // Catch:{ Exception -> 0x0314 }
            float r0 = (float) r6     // Catch:{ Exception -> 0x0314 }
            float r0 = r0 * r21
            int r6 = (int) r0     // Catch:{ Exception -> 0x0314 }
            r1 = 0
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ Exception -> 0x0314 }
            r0.<init>(r1, r1, r8, r6)     // Catch:{ Exception -> 0x0314 }
            float r1 = X.SSo.A00()     // Catch:{ Exception -> 0x0314 }
            r3.A05 = r0     // Catch:{ Exception -> 0x0314 }
            r3.A03 = r12     // Catch:{ Exception -> 0x0314 }
            r3.A00 = r2     // Catch:{ Exception -> 0x0314 }
            r3.A01 = r7     // Catch:{ Exception -> 0x0314 }
            r0 = r19
            r3.A08 = r0     // Catch:{ Exception -> 0x0314 }
            r0 = r20
            r3.A06 = r0     // Catch:{ Exception -> 0x0314 }
            r0 = r18
            r3.A0C = r0     // Catch:{ Exception -> 0x0314 }
            r0 = r17
            r3.A0B = r0     // Catch:{ Exception -> 0x0314 }
            r3.A02 = r1     // Catch:{ Exception -> 0x0314 }
            r3.A07 = r14     // Catch:{ Exception -> 0x0314 }
            r0 = r16
            r3.A0A = r0     // Catch:{ Exception -> 0x0314 }
            r3.A09 = r15     // Catch:{ Exception -> 0x0314 }
            if (r4 == 0) goto L_0x030e
            X.SDm r0 = X.SDm.A01     // Catch:{ Exception -> 0x0314 }
            X.01e r0 = r0.A00     // Catch:{ Exception -> 0x0314 }
            r0.A05(r4, r3)     // Catch:{ Exception -> 0x0314 }
        L_0x030e:
            X.SIM r1 = new X.SIM     // Catch:{ Exception -> 0x0314 }
            r1.<init>((java.lang.Object) r3)     // Catch:{ Exception -> 0x0314 }
            goto L_0x031a
        L_0x0314:
            r0 = move-exception
            X.SIM r1 = new X.SIM     // Catch:{ all -> 0x0320 }
            r1.<init>((java.lang.Throwable) r0)     // Catch:{ all -> 0x0320 }
        L_0x031a:
            if (r29 == 0) goto L_0x031f
            X.SSo.A04(r5)
        L_0x031f:
            return r1
        L_0x0320:
            r0 = move-exception
            if (r29 == 0) goto L_0x0326
            X.SSo.A04(r5)
        L_0x0326:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11425STh.A03(X.T8z, java.lang.String, boolean):X.SIM");
    }

    /* JADX WARNING: type inference failed for: r1v17, types: [X.SJy, java.lang.Object] */
    public static SIM A02(Context context, String str, ZipInputStream zipInputStream) {
        FileOutputStream A0t;
        try {
            HashMap A1E = AnonymousClass7TE.A1E();
            HashMap A1E2 = AnonymousClass7TE.A1E();
            SIM sim = null;
            if (str != null) {
                try {
                    S7N s7n = (S7N) SDm.A01.A00.A02(str);
                    if (s7n != null) {
                        sim = new SIM((Object) s7n);
                        SSo.A04(zipInputStream);
                        return sim;
                    }
                } catch (IOException e) {
                    sim = new SIM((Throwable) e);
                }
            }
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            S7N s7n2 = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    s7n2 = (S7N) A03(new C7494QGl(new C13197TPd(new C13205TPl(zipInputStream, new Object()))), (String) null, false).A00;
                } else {
                    if (!name.contains(".png")) {
                        if (!name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                            if (name.contains(".ttf") || name.contains(".otf")) {
                                String[] split = name.split("/");
                                String str2 = split[split.length - 1];
                                String str3 = str2.split("\\.")[0];
                                File A0s = JTO.A0s(context.getCacheDir(), str2);
                                new FileOutputStream(A0s);
                                try {
                                    A0t = JTO.A0t(A0s);
                                    byte[] bArr = new byte[4096];
                                    while (true) {
                                        int read = zipInputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        A0t.write(bArr, 0, read);
                                    }
                                    A0t.flush();
                                    A0t.close();
                                } catch (Throwable th) {
                                    S85.A01(002.A11("Unable to save font ", str3, " to the temporary file: ", str2, ". "), th);
                                }
                                Typeface createFromFile = Typeface.createFromFile(A0s);
                                if (!A0s.delete()) {
                                    S85.A00(002.A0g("Failed to delete temp font file ", A0s.getAbsolutePath(), "."));
                                }
                                A1E2.put(str3, createFromFile);
                            } else {
                                zipInputStream.closeEntry();
                            }
                        }
                    }
                    String[] split2 = name.split("/");
                    A1E.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (s7n2 == null) {
                sim = new SIM((Throwable) AnonymousClass7TE.A0w("Unable to parse composition"));
                SSo.A04(zipInputStream);
                return sim;
            }
            Iterator A0s2 = AnonymousClass7TF.A0s(A1E);
            while (A0s2.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s2);
                String A13 = DbT.A13(A1J);
                Iterator A0v = AnonymousClass7TF.A0v(s7n2.A02());
                while (true) {
                    if (!A0v.hasNext()) {
                        break;
                    }
                    C10765Rxj rxj = (C10765Rxj) A0v.next();
                    if (rxj.A04.equals(A13)) {
                        rxj.A00 = SSo.A02((Bitmap) A1J.getValue(), rxj.A02, rxj.A01);
                        break;
                    }
                }
            }
            Iterator A0s3 = AnonymousClass7TF.A0s(A1E2);
            while (A0s3.hasNext()) {
                Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s3);
                Iterator A0v2 = AnonymousClass7TF.A0v(s7n2.A0A);
                boolean z = false;
                while (A0v2.hasNext()) {
                    C10654Rvo rvo = (C10654Rvo) A0v2.next();
                    if (rvo.A01.equals(A1J2.getKey())) {
                        rvo.A00 = (Typeface) A1J2.getValue();
                        z = true;
                    }
                }
                if (!z) {
                    S85.A00(002.A0g("Parsed font for ", DbT.A13(A1J2), " however it was not found in the animation."));
                }
            }
            if (A1E.isEmpty()) {
                Iterator A0u = AnonymousClass7TF.A0u(s7n2.A02());
                while (true) {
                    if (!A0u.hasNext()) {
                        break;
                    }
                    C10765Rxj rxj2 = (C10765Rxj) C51971G9r.A0p(A0u);
                    if (rxj2 == null) {
                        break;
                    }
                    String str4 = rxj2.A04;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (str4.startsWith("data:") && str4.indexOf("base64,") > 0) {
                        byte[] decode = Base64.decode(Pxe.A0v(str4.indexOf(44), str4), 0);
                        rxj2.A00 = 0fP.A00(decode, 0, decode.length, options);
                    }
                }
                SSo.A04(zipInputStream);
                return sim;
            }
            if (str != null) {
                SDm.A01.A00.A05(str, s7n2);
            }
            sim = new SIM((Object) s7n2);
            SSo.A04(zipInputStream);
            return sim;
            throw th;
        } catch (IllegalArgumentException e2) {
            S85.A01("data URL did not have correct base64 format.", e2);
        } catch (Throwable th2) {
            SSo.A04(zipInputStream);
            throw th2;
        }
    }
}
