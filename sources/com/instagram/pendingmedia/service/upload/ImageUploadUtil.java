package com.instagram.pendingmedia.service.upload;

import X.002;
import X.0Aj;
import X.0Tu;
import X.0Yt;
import X.0mb;
import X.0mp;
import X.0qQ;
import X.0xI;
import X.182;
import X.1iA;
import X.AnonymousClass000;
import X.AnonymousClass3Q2;
import X.AnonymousClass3QD;
import X.AnonymousClass55S;
import X.AnonymousClass55U;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C11286SJe;
import X.C12075SmU;
import X.C2373737j;
import X.C2373837k;
import X.C282375Cv;
import X.C59906JbV;
import X.C59907JbW;
import X.C59908JbX;
import X.C59968Jcd;
import X.C61970qY;
import X.C62011KVk;
import X.C62013KVm;
import X.C62014KVn;
import X.C62020KVu;
import X.C62021KVv;
import X.C62846KnM;
import X.C63375Kvw;
import X.C63740L4y;
import X.C63949LEr;
import X.C64011Bq;
import X.C64171LRw;
import X.C64193LTa;
import X.C64386Lb3;
import X.DbV;
import X.DbY;
import X.JTR;
import X.JTS;
import X.KVt;
import X.L28;
import X.LP8;
import android.content.Context;
import android.os.SystemClock;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ImageUploadUtil {
    public static final ImageUploadUtil A00 = new Object();

    public static final L28 A00(LP8 lp8) {
        C63740L4y A02;
        AnonymousClass55U A022;
        ImageUploadUtil imageUploadUtil = A00;
        A05(lp8, 1109);
        AnonymousClass3Q2 r7 = lp8.A0D;
        lp8.A07 = new C62014KVn(r7);
        String str = r7.A33;
        UserSession userSession = lp8.A0C;
        C12075SmU A0e = JTR.A0e(userSession);
        LinkedHashMap A0G = C64193LTa.A0G(userSession, r7, r7.A3t);
        long uptimeMillis = SystemClock.uptimeMillis();
        imageUploadUtil.A04(lp8);
        1iA r2 = r7.A1G;
        1iA r4 = 1iA.A06;
        if (r2 != r4) {
            r4 = 1iA.A0Q;
        }
        C64386Lb3 lb3 = lp8.A07;
        int i = r7.A09;
        String str2 = r7.A3t;
        if (r7.A6C) {
            A02 = new C63740L4y(C64171LRw.A01(userSession, r4, r7, r7.A2s), r4);
        } else {
            A02 = C64171LRw.A02(r4, r7.A0F(), A0G);
        }
        C62846KnM A03 = FbUploaderUtil.A03(A0e, lb3, A02, str, str2, i);
        if (A03 instanceof KVt) {
            String str3 = ((KVt) A03).A00;
            A022 = FbUploaderUtil.A01(lp8, str3);
            imageUploadUtil.A06(A022.A01, lp8, 002.A0R("fbupload:Photo upload error:", str3), new FileNotFoundException(str3));
        } else if (A03 instanceof C62020KVu) {
            Throwable th = ((C62020KVu) A03).A00;
            A05(lp8, 1111);
            A022 = FbUploaderUtil.A02(lp8, "image", th);
            imageUploadUtil.A06(A022.A01, lp8, AnonymousClass7TF.A0m("fbupload:Photo upload error:", th), th);
        } else if (A03 instanceof C62021KVv) {
            return imageUploadUtil.A01(((C62021KVv) A03).A00, lp8, uptimeMillis);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return new C62011KVk(A022);
    }

    private final C62013KVm A01(C11286SJe sJe, LP8 lp8, long j) {
        LinkedHashMap A0E;
        Map A07;
        String str;
        double d;
        AnonymousClass3Q2 r5 = lp8.A0D;
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap hashMap = sJe.A09;
        if (hashMap != null) {
            Iterator A0s = AnonymousClass7TF.A0s(hashMap);
            while (A0s.hasNext()) {
                JTR.A1U(A1E, AnonymousClass7TE.A1J(A0s));
            }
        }
        r5.A46 = A1E;
        if (r5.A6C) {
            r5.A2I = DbV.A0q(sJe.A05);
        }
        r5.A0b(AnonymousClass3QD.UPLOADED);
        A05(lp8, 1110);
        if (!182.A06(0Tu.A05, lp8.A0C, 36311869723640616L) || (str = r5.A33) == null) {
            A0E = 0Yt.A0E();
        } else {
            float A03 = (((float) 0mb.A03(str)) * 8.0f) / (((float) (SystemClock.uptimeMillis() - j)) / 1000.0f);
            double A01 = C64011Bq.A00().A01();
            if (A01 > 0.0d) {
                d = A01 * 8.0d * 1024.0d;
            } else {
                d = -1.0d;
            }
            A0E = DbY.A0p("actual_upload_bits_per_second", 0mp.A06("%.0f", new Object[]{Float.valueOf(A03)}), AnonymousClass7TE.A1L("estimated_upload_bits_per_second", 0mp.A06("%.0f", new Object[]{Double.valueOf(d)})));
        }
        C63949LEr lEr = lp8.A0F;
        1iA r1 = r5.A1G;
        1iA r0 = 1iA.A0Q;
        C2373837k r6 = lEr.A01;
        if (r1 == r0) {
            AnonymousClass3Q2 r2 = lEr.A00;
            C2373737j r62 = (C2373737j) r6;
            C2373737j.A0B(r2, r62, "upload_photo_success", "fbupload");
            r62.A0G(r2, A0E, -1);
        } else {
            AnonymousClass3Q2 r52 = lEr.A00;
            C2373737j r63 = (C2373737j) r6;
            C2373737j.A0B(r52, r63, "upload_cover_photo_success", "fbupload");
            0Aj A0e = AnonymousClass7TE.A0e(r63.A01, "ig_video_cover_photo_upload_success");
            if (A0e.isSampled()) {
                Context context = r63.A00;
                UserSession userSession = r63.A02;
                C59907JbW jbW = new C59907JbW(context, userSession, r52);
                AnonymousClass3Q2 r8 = jbW.A02;
                JTS.A1B(A0e, r8);
                C59908JbX.A02(A0e, userSession, r52, jbW);
                C59908JbX.A06(A0e, jbW);
                C59908JbX.A05(A0e, jbW, "target_surface", C59906JbV.A03(userSession, r52, (ShareType) null, true));
                A0e.A9F("file_size_bytes", jbW.A0A());
                C59908JbX.A04(A0e, jbW, jbW.A0A(), "file_size_bytes");
                A0e.A9F("original_file_size_bytes", Long.valueOf(0mb.A03(r8.A3K)));
                A03(A0e, r8);
                A0e.AAJ("ingest_type", jbW.A0I());
                if (r52.A5D) {
                    A07 = null;
                } else {
                    A07 = jbW.A07();
                }
                JTS.A1C(A0e, A07);
                A0e.Cgf();
            }
            r63.Cjm(r52, "ig_video_cover_photo_upload_success", (String) null);
        }
        return C62013KVm.A00;
    }

    /* JADX WARNING: type inference failed for: r23v1, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.LP8 r22, com.instagram.pendingmedia.service.upload.ImageUploadUtil r23, X.AnonymousClass4D7 r24) {
        /*
            r9 = r23
            r12 = r22
            r3 = 3
            r4 = r24
            boolean r0 = X.JYA.A01(r3, r4)
            if (r0 == 0) goto L_0x00cf
            r11 = r4
            X.JYA r11 = (X.JYA) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00cf
            int r2 = r2 - r1
            r11.A00 = r2
        L_0x001b:
            java.lang.Object r3 = r11.A04
            X.1Hj r10 = X.1Hj.A02
            int r0 = r11.A00
            r13 = 1
            if (r0 == 0) goto L_0x0076
            if (r0 != r13) goto L_0x00e8
            long r1 = r11.A01
            java.lang.Object r12 = r11.A03
            X.LP8 r12 = (X.LP8) r12
            java.lang.Object r9 = r11.A02
            com.instagram.pendingmedia.service.upload.ImageUploadUtil r9 = (com.instagram.pendingmedia.service.upload.ImageUploadUtil) r9
            X.0eS.A00(r3)
        L_0x0033:
            X.KnM r3 = (X.C62846KnM) r3
            boolean r0 = r3 instanceof X.KVt
            if (r0 == 0) goto L_0x0057
            X.KVt r3 = (X.KVt) r3
            java.lang.String r4 = r3.A00
            X.55U r3 = com.instagram.pendingmedia.service.upload.FbUploaderUtil.A01(r12, r4)
            java.lang.String r0 = "fbupload:Photo upload error:"
            java.lang.String r2 = X.002.A0R(r0, r4)
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            r1.<init>(r4)
            X.55S r0 = r3.A01
            r9.A06(r0, r12, r2, r1)
        L_0x0051:
            X.KVk r10 = new X.KVk
            r10.<init>(r3)
            return r10
        L_0x0057:
            boolean r0 = r3 instanceof X.C62020KVu
            if (r0 == 0) goto L_0x00d6
            X.KVu r3 = (X.C62020KVu) r3
            java.lang.Throwable r2 = r3.A00
            r0 = 1111(0x457, float:1.557E-42)
            A05(r12, r0)
            java.lang.String r0 = "image"
            X.55U r3 = com.instagram.pendingmedia.service.upload.FbUploaderUtil.A02(r12, r0, r2)
            java.lang.String r0 = "fbupload:Photo upload error:"
            java.lang.String r1 = X.AnonymousClass7TF.A0m(r0, r2)
            X.55S r0 = r3.A01
            r9.A06(r0, r12, r1, r2)
            goto L_0x0051
        L_0x0076:
            X.0eS.A00(r3)
            X.3Q2 r8 = r12.A0D
            java.lang.String r15 = r8.A33
            com.instagram.common.session.UserSession r7 = r12.A0C
            X.SmU r17 = X.JTR.A0e(r7)
            java.lang.String r0 = r8.A3t
            java.util.LinkedHashMap r6 = X.C64193LTa.A0G(r7, r8, r0)
            long r1 = android.os.SystemClock.uptimeMillis()
            r9.A04(r12)
            X.1iA r5 = X.1iA.A0Q
            com.instagram.pendingmedia.service.upload.FbUploaderUtil r16 = com.instagram.pendingmedia.service.upload.FbUploaderUtil.A00
            X.Lb3 r14 = r12.A07
            int r4 = r8.A09
            java.lang.String r3 = r8.A3t
            boolean r0 = r8.A6C
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = r8.A2s
            X.SFy r6 = X.C64171LRw.A01(r7, r5, r8, r0)
            X.L4y r0 = new X.L4y
            r0.<init>(r6, r5)
        L_0x00a9:
            r11.A02 = r9
            r11.A03 = r12
            r11.A01 = r1
            r11.A00 = r13
            java.lang.String r22 = ""
            r23 = r11
            r24 = r4
            r19 = r0
            r20 = r15
            r21 = r3
            r18 = r14
            java.lang.Object r3 = r16.A05(r17, r18, r19, r20, r21, r22, r23, r24)
            if (r3 != r10) goto L_0x0033
            return r10
        L_0x00c6:
            java.lang.String r0 = r8.A0F()
            X.L4y r0 = X.C64171LRw.A02(r5, r0, r6)
            goto L_0x00a9
        L_0x00cf:
            X.JYA r11 = new X.JYA
            r11.<init>(r9, r4, r3)
            goto L_0x001b
        L_0x00d6:
            boolean r0 = r3 instanceof X.C62021KVv
            if (r0 == 0) goto L_0x00e3
            X.KVv r3 = (X.C62021KVv) r3
            X.SJe r0 = r3.A00
            X.KVm r10 = r9.A01(r0, r12, r1)
            return r10
        L_0x00e3:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00e8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.upload.ImageUploadUtil.A02(X.LP8, com.instagram.pendingmedia.service.upload.ImageUploadUtil, X.4D7):java.lang.Object");
    }

    public static void A03(0Aj r2, AnonymousClass3Q2 r3) {
        r2.A9F(AnonymousClass000.A00(729), Long.valueOf((long) r3.A0G));
        r2.A9F(AnonymousClass000.A00(730), Long.valueOf((long) r3.A0H));
    }

    private final void A04(LP8 lp8) {
        Map A07;
        C63949LEr lEr = lp8.A0F;
        1iA r1 = lp8.A0D.A1G;
        1iA r0 = 1iA.A0Q;
        C2373837k r6 = lEr.A01;
        if (r1 == r0) {
            AnonymousClass3Q2 r12 = lEr.A00;
            C2373737j r62 = (C2373737j) r6;
            C2373737j.A0B(r12, r62, "upload_photo_attempt", "fbupload");
            r62.EG0(r12);
            return;
        }
        AnonymousClass3Q2 r5 = lEr.A00;
        C2373737j r63 = (C2373737j) r6;
        C2373737j.A0B(r5, r63, "upload_cover_photo_attempt", "fbupload");
        0Aj A0e = AnonymousClass7TE.A0e(r63.A01, "ig_video_cover_photo_upload_start");
        if (A0e.isSampled()) {
            Context context = r63.A00;
            UserSession userSession = r63.A02;
            C59907JbW jbW = new C59907JbW(context, userSession, r5);
            AnonymousClass3Q2 r8 = jbW.A02;
            JTS.A1B(A0e, r8);
            C59908JbX.A02(A0e, userSession, r5, jbW);
            C59908JbX.A06(A0e, jbW);
            C59908JbX.A05(A0e, jbW, "target_surface", C59906JbV.A03(userSession, r5, (ShareType) null, true));
            C59908JbX.A04(A0e, jbW, jbW.A0A(), "file_size_bytes");
            A0e.A9F("original_file_size_bytes", Long.valueOf(0mb.A03(r8.A3K)));
            A03(A0e, r8);
            A0e.AAJ("ingest_type", jbW.A0I());
            if (r5.A5D) {
                A07 = null;
            } else {
                A07 = jbW.A07();
            }
            JTS.A1C(A0e, A07);
            A0e.Cgf();
        }
        r63.Cjm(r5, "ig_video_cover_photo_upload_start", (String) null);
    }

    public static final void A05(LP8 lp8, int i) {
        0qQ.A07(C282375Cv.A00(lp8.A0C));
        String str = lp8.A0D.A3p;
        if (str != null) {
            C282375Cv.A03(str, (List) null, 4, i, 0);
        }
    }

    public final void A06(AnonymousClass55S r12, LP8 lp8, String str, Throwable th) {
        Map A07;
        boolean A1Z = AnonymousClass7TG.A1Z(lp8, str);
        C63949LEr lEr = lp8.A0F;
        1iA r1 = lp8.A0D.A1G;
        1iA r0 = 1iA.A0Q;
        C2373837k r5 = lEr.A01;
        if (r1 == r0) {
            AnonymousClass3Q2 r13 = lEr.A00;
            C2373737j r52 = (C2373737j) r5;
            C2373737j.A0B(r13, r52, "upload_photo_failure", str);
            r52.EFz(r12, r13, str, th);
            return;
        }
        AnonymousClass3Q2 r4 = lEr.A00;
        C2373737j r53 = (C2373737j) r5;
        C2373737j.A0B(r4, r53, "upload_cover_photo_failure", str);
        0Aj A0e = AnonymousClass7TE.A0e(r53.A01, "ig_video_cover_photo_upload_failure");
        if (A0e.isSampled()) {
            Context context = r53.A00;
            UserSession userSession = r53.A02;
            C59907JbW jbW = new C59907JbW(context, userSession, r4);
            AnonymousClass3Q2 r8 = jbW.A02;
            JTS.A1B(A0e, r8);
            C59908JbX.A05(A0e, jbW, "connection", C61970qY.A08(jbW.A00));
            C59908JbX.A02(A0e, userSession, r4, jbW);
            A0e.AAJ("target_surface", C59906JbV.A03(userSession, r4, (ShareType) null, A1Z));
            A0e.AAJ("ingest_type", jbW.A0I());
            C59908JbX.A03(A0e, jbW);
            A0e.A9F("duration_ms", jbW.A08());
            A0e.A9F("file_size_bytes", jbW.A0A());
            C59908JbX.A04(A0e, jbW, Long.valueOf(0mb.A03(r8.A3K)), "original_file_size_bytes");
            A03(A0e, r8);
            A0e.AAJ("reason", C2373737j.A03(th));
            A0e.AAJ("error_message", str);
            A0e.A9H("exception_data", C63375Kvw.A00(th));
            if (r4.A5D) {
                A07 = null;
            } else {
                A07 = jbW.A07();
            }
            JTS.A1C(A0e, A07);
            A0e.Cgf();
        }
        C59968Jcd.A01((0xI) null, r4, th);
        r53.A0E(r4, TraceFieldType.FailureReason, str);
        r53.A0E(r4, "error_type", r12.name());
        r53.Cjm(r4, "ig_video_cover_photo_upload_failure", (String) null);
        C2373737j.A0D(r4, r53, th);
    }
}
