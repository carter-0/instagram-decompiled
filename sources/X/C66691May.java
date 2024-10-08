package X;

import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.May  reason: case insensitive filesystem */
public final class C66691May {
    public static final C66691May A00 = new Object();

    public static final String A04(Resources resources, AtomicBoolean atomicBoolean, int i, int i2, boolean z) {
        String A0d;
        if (i < i2 || i2 <= 1) {
            atomicBoolean.set(true);
            int i3 = R.plurals.direct_thread_n_new_messages;
            if (z) {
                i3 = R.plurals.direct_thread_n_unwatched_reels;
            }
            A0d = DbY.A0d(resources, i, i3);
        } else {
            int i4 = 2131960549;
            if (z) {
                i4 = 2131960550;
            }
            A0d = JTS.A0i(resources, i2 - 1, i4);
        }
        0qQ.A0A(A0d);
        return A0d;
    }

    private final CharSequence A03(C74541Pwa pwa, C74514Pw9 pw9, C74516PwB pwB) {
        CharSequence BxI;
        CharSequence obj;
        if (pwa == null || (BxI = pwa.ANc(pw9.BxI())) == null) {
            BxI = pw9.BxI();
        }
        if (!pwB.CKs()) {
            return BxI;
        }
        if (BxI instanceof SpannableString) {
            obj = SpannableString.valueOf(new SpannableStringBuilder(BxI).replace(0, 0, "📣 · "));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("📣 · ");
            sb.append(BxI);
            obj = sb.toString();
        }
        return obj;
    }

    private final boolean A05(C74514Pw9 pw9, Integer num, boolean z) {
        if ((num == AnonymousClass05K.A00 || num == AnonymousClass05K.A0Y) && pw9.Aqm() == 2FW.A16 && z && pw9.BsG() != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r0 = com.instagram.android.R.attr.igds_color_secondary_text;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        return r2.getColor(X.2Yu.A0H(r2, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r4 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(android.content.Context r2, java.lang.Integer r3, boolean r4) {
        /*
            int r1 = r3.intValue()
            r0 = 13
            if (r1 == r0) goto L_0x001f
            switch(r1) {
                case 1: goto L_0x0017;
                case 2: goto L_0x001b;
                case 3: goto L_0x001b;
                case 4: goto L_0x001b;
                case 8: goto L_0x001b;
                case 9: goto L_0x001b;
                case 12: goto L_0x001f;
                case 15: goto L_0x0017;
                case 24: goto L_0x001b;
                default: goto L_0x000b;
            }
        L_0x000b:
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
        L_0x000e:
            int r0 = X.2Yu.A0H(r2, r0)
            int r0 = r2.getColor(r0)
            return r0
        L_0x0017:
            r0 = 2130970215(0x7f040667, float:1.7549134E38)
            goto L_0x000e
        L_0x001b:
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            goto L_0x000e
        L_0x001f:
            r0 = 2130970270(0x7f04069e, float:1.7549245E38)
            if (r4 != 0) goto L_0x000e
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66691May.A00(android.content.Context, java.lang.Integer, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (X.C308556Us.A02(r6) == false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.CharSequence A02(android.content.Context r4, X.C74541Pwa r5, com.instagram.common.session.UserSession r6, X.C74514Pw9 r7, X.C74516PwB r8, java.util.concurrent.atomic.AtomicBoolean r9, java.util.concurrent.atomic.AtomicBoolean r10, int r11, int r12) {
        /*
            r3 = this;
            boolean r0 = r7.CRV()
            r2 = 0
            if (r0 == 0) goto L_0x000e
            boolean r0 = X.C308556Us.A02(r6)
            r1 = 1
            if (r0 != 0) goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            boolean r0 = r8.CV3()
            if (r0 != 0) goto L_0x001f
            boolean r0 = r7.CRS()
            if (r0 != 0) goto L_0x001f
            if (r1 != 0) goto L_0x001f
            r0 = 0
            return r0
        L_0x001f:
            if (r11 <= 0) goto L_0x002d
            android.content.res.Resources r0 = r4.getResources()
            X.0qQ.A07(r0)
            java.lang.String r0 = A04(r0, r9, r11, r12, r2)
            return r0
        L_0x002d:
            boolean r0 = r7.COD()
            if (r0 == 0) goto L_0x0041
            boolean r0 = X.C308556Us.A02(r6)
            if (r0 == 0) goto L_0x0041
            r10.set(r2)
            java.lang.CharSequence r0 = r3.A03(r5, r7, r8)
            return r0
        L_0x0041:
            r10.set(r2)
            r0 = 2131959111(0x7f131d47, float:1.9554853E38)
            java.lang.String r0 = r4.getString(r0)
            X.0qQ.A0A(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66691May.A02(android.content.Context, X.Pwa, com.instagram.common.session.UserSession, X.Pw9, X.PwB, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicBoolean, int, int):java.lang.CharSequence");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0208, code lost:
        if (X.0qQ.A0K(r5.BsJ(), r7.A06) == false) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        r24 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0274, code lost:
        if (X.C250993mO.A00(r8) < 2) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x027a, code lost:
        if (r12 > 0) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x028c, code lost:
        if (r5.BMS() != X.AnonymousClass05K.A0C) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02a9, code lost:
        if (r5.CRV() == false) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02b4, code lost:
        if (r8 != false) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02c5, code lost:
        if (X.C66718MbP.A00(r3, r7, r5, r42) == null) goto L_0x02c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0319, code lost:
        if (((java.lang.Boolean) r4.getValue()).booleanValue() != false) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x039b, code lost:
        if (r17 != false) goto L_0x039d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x03c0, code lost:
        if (r1.A00 > 0) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x03d9, code lost:
        if (r6 != 4) goto L_0x03db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0402, code lost:
        if (r6 != 4) goto L_0x0404;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0415, code lost:
        if (r5.Aqm() != X.2FW.A16) goto L_0x0417;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x043a, code lost:
        if (r37 == null) goto L_0x0601;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x043c, code lost:
        r0 = r22.ANc(r5.BxI());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0446, code lost:
        if (r0 == null) goto L_0x0601;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x044e, code lost:
        if (r5.Aqm() != X.2FW.A16) goto L_0x0561;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0452, code lost:
        if (r4 == X.AnonymousClass05K.A01) goto L_0x0561;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0454, code lost:
        if (r0 == null) goto L_0x0462;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0456, code lost:
        if (r22 == null) goto L_0x0460;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0458, code lost:
        r32 = r22.ARp(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x045e, code lost:
        if (r32 != null) goto L_0x0462;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0460, code lost:
        r32 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0462, code lost:
        r7 = new android.text.SpannableString(r32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0469, code lost:
        r0 = X.AnonymousClass05K.A08;
        r31 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x046d, code lost:
        if (r4 != r0) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x046f, code lost:
        r31 = 2131959058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0472, code lost:
        if (r4 != r0) goto L_0x055d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0480, code lost:
        if (((java.lang.Boolean) r14.A04.getValue()).booleanValue() == false) goto L_0x0557;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0482, code lost:
        r0 = X.2Yu.A03(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0486, code lost:
        r32 = r3.getColor(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x048a, code lost:
        if (r27 == false) goto L_0x04ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x048c, code lost:
        r1 = A00(r3, r4, r6.get());
        r26 = r3.getDrawable(com.instagram.android.R.drawable.instagram_lock_filled_12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x049b, code lost:
        if (r26 == null) goto L_0x0553;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x049d, code lost:
        X.AnonymousClass7TE.A1R(r26.mutate(), r1);
        r1 = X.C51972G9s.A08(r3);
        r26.setBounds(0, 0, r1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x04ad, code lost:
        if (r7 == null) goto L_0x054f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x04af, code lost:
        r8 = A00(r3, r4, r6.get());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x04b7, code lost:
        switch(r6) {
            case 2: goto L_0x054c;
            case 3: goto L_0x054c;
            case 4: goto L_0x054c;
            case 8: goto L_0x054c;
            case 9: goto L_0x054c;
            case 15: goto L_0x054c;
            case 24: goto L_0x054c;
            default: goto L_0x04ba;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x04ba, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x04bb, code lost:
        r1 = null;
        r5 = new X.C66720MbR(r7, (java.lang.String) null, r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x04c1, code lost:
        if (r16 == null) goto L_0x04f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x04c3, code lost:
        r0 = ((double) r16.longValue()) / 1000000.0d;
        r8 = new android.text.SpannableString(X.1G0.A04(r3, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x04d8, code lost:
        if (r6 == 4) goto L_0x0548;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x04dc, code lost:
        if (r6 == 2) goto L_0x0548;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x04de, code lost:
        r7 = com.instagram.android.R.attr.igds_color_error_or_destructive;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x04e3, code lost:
        if (r6 == 15) goto L_0x04e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x04e5, code lost:
        r7 = com.instagram.android.R.attr.igds_color_secondary_text;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x04e8, code lost:
        r1 = new X.C66720MbR(r8, X.1G0.A03(r3, r0), r3.getColor(X.2Yu.A0H(r3, r7)), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        if ((r6.A01 & 4) != 4) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x04fb, code lost:
        if (r4 != r28) goto L_0x052c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0501, code lost:
        if (r6.get() == false) goto L_0x052c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0503, code lost:
        r6 = new android.text.SpannableStringBuilder();
        r6.append(new android.text.SpannableString(r3.getString(2131959084)));
        r6 = android.text.SpannableString.valueOf(r6);
        X.0qQ.A07(r6);
        r1 = new X.C66720MbR(r6, (java.lang.String) null, r3.getColor(X.1QE.A02(r3)), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0547, code lost:
        return new X.C66694Mb1(r12, r25, r26, r5, r1, r22, r4, r31, r32, r33, r15, r35, r36, r6.get(), r42.Cdy());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0548, code lost:
        r7 = com.instagram.android.R.attr.igds_color_primary_text;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x054c, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x054f, code lost:
        r1 = null;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0553, code lost:
        r26 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0557, code lost:
        r0 = X.1QE.A02(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x055d, code lost:
        r32 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0561, code lost:
        if (r0 != null) goto L_0x057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0563, code lost:
        r7 = X.0wj.A01.AEf("Inbox - Digest shouldn't be null for this type", 20134884);
        r7.ABQ("THREAD_DIGEST_TYPE", X.C48844El6.A00(r4));
        r7.report();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x057c, code lost:
        if (r14.A0C == false) goto L_0x059b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0582, code lost:
        if (r31 != r30) goto L_0x059b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0588, code lost:
        if (r42.CVE() != false) goto L_0x059b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x058e, code lost:
        if (r42.CR6() != false) goto L_0x059b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0590, code lost:
        r0 = r3.getResources().getString(2131953179);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x059b, code lost:
        if (r0 != null) goto L_0x05a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x059d, code lost:
        r0 = r3.getString(2131959111);
        X.0qQ.A07(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x05a7, code lost:
        r7 = r0.length() - 1;
        r5 = 0;
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x05ae, code lost:
        if (r5 > r7) goto L_0x05d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x05b0, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x05b1, code lost:
        if (r9 != false) goto L_0x05b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x05b3, code lost:
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x05b4, code lost:
        r8 = X.0qQ.A00(r0.charAt(r1), 32);
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x05bf, code lost:
        if (r8 > 0) goto L_0x05c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x05c1, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x05c2, code lost:
        if (r9 != false) goto L_0x05cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x05c4, code lost:
        if (r1 != false) goto L_0x05c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x05c6, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x05c8, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x05cb, code lost:
        if (r1 == false) goto L_0x05d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x05cd, code lost:
        r7 = r7 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x05d0, code lost:
        r1 = new android.text.SpannableStringBuilder(r0.subSequence(r5, r7 + 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x05db, code lost:
        if (r29 == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x05dd, code lost:
        if (r27 == false) goto L_0x05f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x05df, code lost:
        r1.replace(0, 0, "· ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x05e4, code lost:
        r1.append(" ·");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x05e9, code lost:
        r0 = android.text.SpannableString.valueOf(r1);
        X.0qQ.A07(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x05f2, code lost:
        if (r27 == false) goto L_0x05e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x05f9, code lost:
        if (X.0mk.A02(r3) == false) goto L_0x05e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x05fb, code lost:
        r1.replace(0, 0, "· ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0601, code lost:
        r0 = r5.BxI();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cc, code lost:
        if (r10 != false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x07c7, code lost:
        X.0qQ.A0A(r0);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x080a, code lost:
        if (r17 != false) goto L_0x080c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x09d4, code lost:
        X.0qQ.A07(r0);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x09ea, code lost:
        if (r7 == 0) goto L_0x0a44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x09ec, code lost:
        if (r7 == 1) goto L_0x0a19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x09f0, code lost:
        if (r7 == 2) goto L_0x0a09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x09f2, code lost:
        r9 = 2131958560;
        r0 = new java.lang.Object[2];
        r0[0] = r1.get(0);
        r1 = java.lang.Integer.valueOf(r7 - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0a02, code lost:
        r0[1] = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0a04, code lost:
        r0 = r3.getString(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0a09, code lost:
        r9 = 2131958561;
        r0 = new java.lang.Object[2];
        r0[0] = r1.get(0);
        r1 = r1.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0a19, code lost:
        r9 = 2131958559;
        r0 = new java.lang.Object[]{r1.get(0)};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0a44, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0a5b, code lost:
        if (r16 != null) goto L_0x042c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0a61, code lost:
        if (r14.A0A == false) goto L_0x0a5b;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:548:0x0a6a  */
    /* JADX WARNING: Removed duplicated region for block: B:551:0x0a7f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C66694Mb1 A01(android.content.Context r35, android.text.SpannableString r36, X.C74541Pwa r37, com.instagram.common.session.UserSession r38, X.Mi5 r39, X.C74514Pw9 r40, X.C74516PwB r41, X.C67292MlR r42, java.util.List r43, int r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50) {
        /*
            r0 = r36
            r2 = 0
            r10 = 13
            r23 = 2
            r14 = r39
            boolean r1 = r14.A0B
            r6 = 0
            if (r1 == 0) goto L_0x0145
            r1 = r42
            if (r42 == 0) goto L_0x03c4
            java.util.List r3 = X.C67579MqD.A00
            java.util.Iterator r7 = r3.iterator()
        L_0x0018:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x03be
            java.lang.Object r4 = r7.next()
            X.42s r5 = r1.A02
            java.util.Map r3 = r5.A02
            boolean r3 = r3.containsValue(r4)
            if (r3 != 0) goto L_0x0034
            java.util.Map r3 = r5.A01
            boolean r3 = r3.containsValue(r4)
            if (r3 == 0) goto L_0x0018
        L_0x0034:
            r24 = 1
        L_0x0036:
            if (r36 == 0) goto L_0x03bb
            int r3 = r0.length()
            if (r3 == 0) goto L_0x03bb
            java.lang.String r11 = r0.toString()
        L_0x0042:
            r7 = r38
            r5 = r40
            r42 = r41
            r34 = r43
            r3 = r35
            if (r40 == 0) goto L_0x03b7
            if (r46 != 0) goto L_0x01c2
            int r4 = r42.C6a()
            boolean r4 = X.AnonymousClass48O.A02(r4)
            if (r4 == 0) goto L_0x0173
            int r8 = r42.BHS()
            r4 = 6
            if (r8 != r4) goto L_0x0173
        L_0x0061:
            java.lang.Integer r4 = X.AnonymousClass05K.A0E
        L_0x0063:
            if (r49 != 0) goto L_0x014c
            r8 = 0
        L_0x0066:
            X.3kW r6 = X.AnonymousClass1Qz.A00(r7)
            X.1R7 r6 = r6.C82()
            java.lang.String r9 = "ig_video_nux"
            java.util.Set r6 = r6.A0C
            boolean r17 = r6.contains(r9)
            java.util.concurrent.atomic.AtomicBoolean r21 = new java.util.concurrent.atomic.AtomicBoolean
            r6 = r21
            r6.<init>(r8)
            r8 = 1
            r6 = 3
            X.0qQ.A0B(r4, r6)
            X.May r11 = A00
            X.0Tu r6 = X.0Tu.A05
            r9 = 36592318203101624(0x820085000101b8, double:3.2044676048555474E-306)
            long r9 = X.182.A01(r6, r7, r9)
            int r6 = (int) r9
            r35 = r6
            r9 = r44
            int r15 = java.lang.Math.min(r9, r6)
            java.util.concurrent.atomic.AtomicBoolean r24 = new java.util.concurrent.atomic.AtomicBoolean
            r6 = r24
            r6.<init>(r2)
            X.3Tu r6 = r42.AiM()
            if (r6 == 0) goto L_0x00ad
            int r6 = r6.A01
            r9 = 4
            r6 = r6 & 4
            r10 = 1
            if (r6 == r9) goto L_0x00ae
        L_0x00ad:
            r10 = 0
        L_0x00ae:
            X.3tH r31 = r42.C9i()
            X.3tH r30 = X.C254923tH.ACT
            r9 = r31
            r6 = r30
            if (r9 != r6) goto L_0x00ca
            boolean r6 = r42.CVE()
            if (r6 != 0) goto L_0x00ca
            boolean r6 = r42.CR6()
            if (r6 != 0) goto L_0x00ca
            boolean r6 = r14.A0C
            if (r6 == 0) goto L_0x00ce
        L_0x00ca:
            r27 = 0
            if (r10 == 0) goto L_0x00d0
        L_0x00ce:
            r27 = 1
        L_0x00d0:
            r22 = r37
            if (r40 != 0) goto L_0x03c8
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
            int r0 = X.2Yu.A0H(r3, r0)
            int r6 = r3.getColor(r0)
            r0 = 2131959111(0x7f131d47, float:1.9554853E38)
            java.lang.String r0 = r3.getString(r0)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r0)
            if (r37 == 0) goto L_0x014a
            r0 = r22
            java.lang.String r0 = r0.ARp(r1)
            if (r0 == 0) goto L_0x014a
        L_0x00f5:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r0)
            if (r27 == 0) goto L_0x0103
            java.lang.String r0 = "· "
            r1.replace(r2, r2, r0)
        L_0x0103:
            android.text.SpannableString r0 = android.text.SpannableString.valueOf(r1)
            X.0qQ.A07(r0)
            r5 = 0
            X.MbR r4 = new X.MbR
            r4.<init>((android.text.SpannableString) r0, (java.lang.String) r5, (int) r6, (int) r2)
            if (r27 == 0) goto L_0x0148
            r0 = 2131238507(0x7f081e6b, float:1.8093295E38)
            android.graphics.drawable.Drawable r1 = r3.getDrawable(r0)
            if (r1 == 0) goto L_0x0146
            android.graphics.drawable.Drawable r0 = r1.mutate()
            X.AnonymousClass7TE.A1R(r0, r6)
            int r0 = X.C51972G9s.A08(r3)
            r1.setBounds(r2, r2, r0, r0)
        L_0x0129:
            r18 = 21
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            X.Mb1 r6 = new X.Mb1
            r7 = r5
            r8 = r5
            r9 = r1
            r10 = r4
            r11 = r5
            r12 = r22
            r14 = r2
            r15 = r2
            r16 = r2
            r17 = r2
            r19 = r2
            r20 = r2
            r21 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0145:
            return r6
        L_0x0146:
            r1 = 0
            goto L_0x0129
        L_0x0148:
            r1 = r5
            goto L_0x0129
        L_0x014a:
            r0 = r1
            goto L_0x00f5
        L_0x014c:
            X.MbI r11 = X.C66685Mas.A00(r3, r7)
            int r8 = r4.intValue()
            if (r8 == r10) goto L_0x016b
            if (r8 != r2) goto L_0x015f
            X.MkN r9 = X.C67227MkN.RECEIVER
            r8 = r42
            r11.A03(r9, r5, r8)
        L_0x015f:
            if (r40 == 0) goto L_0x0165
            java.lang.String r6 = r5.getId()
        L_0x0165:
            boolean r8 = r11.A04(r6)
            goto L_0x0066
        L_0x016b:
            X.MkN r9 = X.C67227MkN.SENDER
            r8 = r42
            r11.A03(r9, r5, r8)
            goto L_0x015f
        L_0x0173:
            boolean r4 = r42.Ca9()
            if (r4 == 0) goto L_0x0191
            int r8 = r42.BHS()
            r4 = 8
            if (r8 != r4) goto L_0x0191
            java.lang.Integer r4 = r42.Amj()
            if (r4 == 0) goto L_0x0191
            int r8 = r4.intValue()
            r4 = r23
            if (r8 != r4) goto L_0x0191
            goto L_0x0061
        L_0x0191:
            int r4 = r42.C6a()
            boolean r4 = X.AnonymousClass48O.A02(r4)
            if (r4 == 0) goto L_0x01a6
            int r8 = r42.BHS()
            r4 = 6
            if (r8 != r4) goto L_0x01a6
        L_0x01a2:
            java.lang.Integer r4 = X.AnonymousClass05K.A0F
            goto L_0x0063
        L_0x01a6:
            boolean r4 = r42.Ca9()
            if (r4 == 0) goto L_0x01c2
            int r9 = r42.BHS()
            r8 = 1
            r4 = 8
            if (r9 != r4) goto L_0x01c2
            java.lang.Integer r4 = r42.Amj()
            if (r4 == 0) goto L_0x01c2
            int r4 = r4.intValue()
            if (r4 != r8) goto L_0x01c2
            goto L_0x01a2
        L_0x01c2:
            r22 = 1
            if (r48 == 0) goto L_0x01f0
            boolean r8 = r42.CUG()
            java.util.List r4 = r42.BkC()
            boolean r4 = X.C66640Ma9.A05(r4, r8)
            if (r4 == 0) goto L_0x01d8
            java.lang.Integer r4 = X.AnonymousClass05K.A02
            goto L_0x0063
        L_0x01d8:
            if (r46 != 0) goto L_0x03b3
            boolean r4 = r42.isPending()
            if (r4 == 0) goto L_0x03af
            boolean r4 = r42.AqP()
            if (r4 == 0) goto L_0x03af
            boolean r4 = X.C67015Mgo.A04(r7)
            if (r4 == 0) goto L_0x03af
            java.lang.Integer r4 = X.AnonymousClass05K.A0B
            goto L_0x0063
        L_0x01f0:
            boolean r21 = r5.CKy()
            X.2FW r8 = r5.Aqm()
            X.2FW r4 = X.2FW.A0q
            if (r8 != r4) goto L_0x020a
            java.lang.String r8 = r5.BsJ()
            java.lang.String r4 = r7.A06
            boolean r4 = X.0qQ.A0K(r8, r4)
            r20 = 1
            if (r4 != 0) goto L_0x020c
        L_0x020a:
            r20 = 0
        L_0x020c:
            if (r45 == 0) goto L_0x0277
            X.3mO r4 = X.C250993mO.A01(r7)
            X.0qQ.A07(r4)
            long r12 = java.lang.System.currentTimeMillis()
            long r8 = r5.C7a()
            long r12 = r12 - r8
            int r4 = r42.BHS()
            if (r4 != 0) goto L_0x0277
            long r8 = X.C67294MlT.A00
            int r4 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x0277
            java.util.List r4 = r42.Bk9()
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0277
            boolean r8 = r42.CUG()
            boolean r4 = r34.isEmpty()
            if (r4 != 0) goto L_0x0277
            if (r8 == 0) goto L_0x025e
            java.util.Iterator r13 = r34.iterator()
            r12 = 0
        L_0x0247:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x027a
            java.lang.Object r4 = r13.next()
            X.3mU r4 = (X.C251053mU) r4
            long r8 = r4.A01
            int r4 = X.C250993mO.A00(r8)
            if (r4 != 0) goto L_0x0247
            int r12 = r12 + 1
            goto L_0x0247
        L_0x025e:
            r4 = r34
            java.lang.Object r4 = r4.get(r2)
            X.3mU r4 = (X.C251053mU) r4
            long r8 = r4.A01
            r12 = 0
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x0277
            int r8 = X.C250993mO.A00(r8)
            r4 = r23
            if (r8 >= r4) goto L_0x0277
            goto L_0x027c
        L_0x0277:
            r19 = 0
            goto L_0x027e
        L_0x027a:
            if (r12 <= 0) goto L_0x0277
        L_0x027c:
            r19 = 1
        L_0x027e:
            boolean r4 = r5.CU0()
            if (r4 == 0) goto L_0x028e
            java.lang.Integer r8 = r5.BMS()
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            r18 = 1
            if (r8 == r4) goto L_0x0290
        L_0x028e:
            r18 = 0
        L_0x0290:
            X.2FW r8 = r5.Aqm()
            X.2FW r4 = X.2FW.A0G
            if (r8 != r4) goto L_0x02a4
            X.0eE r4 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r4 = r4.A01(r7)
            boolean r4 = X.2Ek.A03(r4)
            if (r4 != 0) goto L_0x02ab
        L_0x02a4:
            boolean r4 = r5.CRV()
            r8 = 0
            if (r4 == 0) goto L_0x02ac
        L_0x02ab:
            r8 = 1
        L_0x02ac:
            boolean r4 = r5.CU0()
            if (r4 == 0) goto L_0x02b6
            r17 = 1
            if (r8 == 0) goto L_0x02b8
        L_0x02b6:
            r17 = 0
        L_0x02b8:
            boolean r4 = r42.CaN()
            if (r4 == 0) goto L_0x02c7
            r4 = r42
            java.lang.String r4 = X.C66718MbP.A00(r3, r7, r5, r4)
            r13 = 1
            if (r4 != 0) goto L_0x02c8
        L_0x02c7:
            r13 = 0
        L_0x02c8:
            java.util.LinkedHashMap r8 = r42.CCp()
            java.lang.String r4 = r7.A06
            java.lang.Object r8 = r8.get(r4)
            X.MbG r8 = (X.C66709MbG) r8
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MICROSECONDS
            if (r8 == 0) goto L_0x033c
            java.lang.Object r8 = r8.A03
            X.3Sc r8 = (X.C241973Sc) r8
            if (r8 == 0) goto L_0x033c
            long r8 = r8.A00
        L_0x02e0:
            long r15 = r4.toMillis(r8)
            boolean r4 = r42.Cdt()
            if (r4 != 0) goto L_0x02f0
            boolean r4 = r42.CWp()
            if (r4 == 0) goto L_0x033a
        L_0x02f0:
            boolean r4 = r5.CXc()
            if (r4 != 0) goto L_0x02fc
            boolean r4 = r5.CXd()
            if (r4 == 0) goto L_0x033a
        L_0x02fc:
            r12 = 1
        L_0x02fd:
            if (r11 == 0) goto L_0x0337
            int r4 = r11.length()
            if (r4 == 0) goto L_0x0337
            X.3sy r4 = r42.CBV()
            boolean r4 = r4 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r4 == 0) goto L_0x0334
            X.0eM r4 = r14.A01
        L_0x030f:
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0337
        L_0x031b:
            int r4 = r42.C6a()
            X.N2U r9 = r42.C43()
            boolean r4 = X.AnonymousClass48O.A04(r4)
            r8 = 1
            if (r4 == 0) goto L_0x033f
            if (r9 == 0) goto L_0x033f
            int r4 = r9.A00
            if (r4 != r8) goto L_0x033f
            java.lang.Integer r4 = X.AnonymousClass05K.A0G
            goto L_0x0063
        L_0x0334:
            X.0eM r4 = r14.A03
            goto L_0x030f
        L_0x0337:
            r22 = 0
            goto L_0x031b
        L_0x033a:
            r12 = 0
            goto L_0x02fd
        L_0x033c:
            r8 = 0
            goto L_0x02e0
        L_0x033f:
            if (r24 == 0) goto L_0x0351
            if (r47 == 0) goto L_0x0347
            java.lang.Integer r4 = X.AnonymousClass05K.A1F
            goto L_0x0063
        L_0x0347:
            if (r46 == 0) goto L_0x034d
            java.lang.Integer r4 = X.AnonymousClass05K.A1I
            goto L_0x0063
        L_0x034d:
            java.lang.Integer r4 = X.AnonymousClass05K.A15
            goto L_0x0063
        L_0x0351:
            if (r21 == 0) goto L_0x0357
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            goto L_0x0063
        L_0x0357:
            boolean r4 = r42.CJY()
            if (r4 == 0) goto L_0x0361
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            goto L_0x0063
        L_0x0361:
            if (r12 == 0) goto L_0x0367
            java.lang.Integer r4 = X.AnonymousClass05K.A07
            goto L_0x0063
        L_0x0367:
            if (r50 == 0) goto L_0x036d
            java.lang.Integer r4 = X.AnonymousClass05K.A0H
            goto L_0x0063
        L_0x036d:
            if (r47 == 0) goto L_0x0373
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            goto L_0x0063
        L_0x0373:
            if (r46 != 0) goto L_0x03b3
            if (r22 == 0) goto L_0x037b
            java.lang.Integer r4 = X.AnonymousClass05K.A08
            goto L_0x0063
        L_0x037b:
            if (r19 == 0) goto L_0x0381
            java.lang.Integer r4 = X.AnonymousClass05K.A0u
            goto L_0x0063
        L_0x0381:
            if (r18 == 0) goto L_0x0387
            java.lang.Integer r4 = X.AnonymousClass05K.A03
            goto L_0x0063
        L_0x0387:
            long r8 = r5.C7a()
            int r4 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x03b7
            boolean r4 = r5.EHm()
            if (r4 != 0) goto L_0x03b7
            boolean r4 = r42.CVE()
            if (r4 == 0) goto L_0x03a1
            if (r17 == 0) goto L_0x03af
        L_0x039d:
            java.lang.Integer r4 = X.AnonymousClass05K.A05
            goto L_0x0063
        L_0x03a1:
            if (r13 == 0) goto L_0x03a7
            java.lang.Integer r4 = X.AnonymousClass05K.A04
            goto L_0x0063
        L_0x03a7:
            if (r17 != 0) goto L_0x039d
            if (r20 == 0) goto L_0x03af
            java.lang.Integer r4 = X.AnonymousClass05K.A0j
            goto L_0x0063
        L_0x03af:
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            goto L_0x0063
        L_0x03b3:
            java.lang.Integer r4 = X.AnonymousClass05K.A0Y
            goto L_0x0063
        L_0x03b7:
            java.lang.Integer r4 = X.AnonymousClass05K.A09
            goto L_0x0063
        L_0x03bb:
            r11 = r6
            goto L_0x0042
        L_0x03be:
            int r3 = r1.A00
            if (r3 <= 0) goto L_0x03c4
            goto L_0x0034
        L_0x03c4:
            r24 = 0
            goto L_0x0036
        L_0x03c8:
            boolean r10 = r42.CUG()
            r29 = 1
            int r6 = r4.intValue()
            r12 = 0
            if (r6 == r2) goto L_0x0a9d
            r9 = 5
            if (r6 == r9) goto L_0x0a83
            r9 = 4
            if (r6 == r9) goto L_0x0a9d
        L_0x03db:
            boolean r9 = r11.A05(r5, r4, r10)
            if (r9 == 0) goto L_0x0a7f
            r9 = 2131231560(0x7f080348, float:1.8079204E38)
            android.graphics.drawable.Drawable r25 = r3.getDrawable(r9)
            if (r25 == 0) goto L_0x0ad6
            android.content.res.Resources r13 = r3.getResources()
            r9 = 2131165331(0x7f070093, float:1.7944876E38)
            int r13 = r13.getDimensionPixelSize(r9)
            r9 = r25
            r9.setBounds(r2, r2, r13, r13)
        L_0x03fa:
            r33 = 0
            if (r6 == r2) goto L_0x0a64
            r9 = 5
            if (r6 == r9) goto L_0x0a72
            r9 = 4
            if (r6 == r9) goto L_0x0a64
        L_0x0404:
            java.lang.Integer r28 = X.AnonymousClass05K.A00
            r9 = r28
            if (r4 == r9) goto L_0x040e
            java.lang.Integer r9 = X.AnonymousClass05K.A0Y
            if (r4 != r9) goto L_0x0417
        L_0x040e:
            X.2FW r10 = r5.Aqm()
            X.2FW r9 = X.2FW.A16
            r13 = 1
            if (r10 == r9) goto L_0x0418
        L_0x0417:
            r13 = 0
        L_0x0418:
            r36 = r13 ^ 1
            boolean r9 = r42.CUG()
            r26 = 0
            if (r9 == 0) goto L_0x0a48
            r10 = r31
            r9 = r30
            if (r10 != r9) goto L_0x0a48
            r16 = r26
        L_0x042a:
            r29 = 0
        L_0x042c:
            android.content.res.Resources r13 = r3.getResources()
            boolean r10 = r42.CUG()
            r32 = 0
            r9 = 1
            switch(r6) {
                case 0: goto L_0x0610;
                case 1: goto L_0x067d;
                case 2: goto L_0x0686;
                case 3: goto L_0x0697;
                case 4: goto L_0x0610;
                case 5: goto L_0x043a;
                case 6: goto L_0x06cc;
                case 7: goto L_0x06f7;
                case 8: goto L_0x06f7;
                case 9: goto L_0x06f7;
                case 10: goto L_0x081f;
                case 11: goto L_0x0828;
                case 12: goto L_0x0831;
                case 13: goto L_0x0839;
                case 14: goto L_0x08d3;
                case 15: goto L_0x0973;
                case 16: goto L_0x0a44;
                case 17: goto L_0x09b2;
                case 18: goto L_0x09bb;
                case 19: goto L_0x0a25;
                case 20: goto L_0x043a;
                case 21: goto L_0x0a2d;
                case 22: goto L_0x0607;
                case 23: goto L_0x0a35;
                case 24: goto L_0x0a3d;
                default: goto L_0x043a;
            }
        L_0x043a:
            if (r37 == 0) goto L_0x0601
            java.lang.CharSequence r1 = r5.BxI()
            r0 = r22
            java.lang.String r0 = r0.ANc(r1)
            if (r0 == 0) goto L_0x0601
        L_0x0448:
            X.2FW r5 = r5.Aqm()
            X.2FW r1 = X.2FW.A16
            if (r5 != r1) goto L_0x0561
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r4 == r1) goto L_0x0561
            if (r0 == 0) goto L_0x0462
        L_0x0456:
            if (r22 == 0) goto L_0x0460
            r1 = r22
            java.lang.String r32 = r1.ARp(r0)
            if (r32 != 0) goto L_0x0462
        L_0x0460:
            r32 = r0
        L_0x0462:
            android.text.SpannableString r7 = new android.text.SpannableString
            r0 = r32
            r7.<init>(r0)
        L_0x0469:
            java.lang.Integer r0 = X.AnonymousClass05K.A08
            r31 = 0
            if (r4 != r0) goto L_0x0472
            r31 = 2131959058(0x7f131d12, float:1.9554746E38)
        L_0x0472:
            if (r4 != r0) goto L_0x055d
            X.0eM r0 = r14.A04
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0557
            int r0 = X.2Yu.A03(r3)
        L_0x0486:
            int r32 = r3.getColor(r0)
        L_0x048a:
            if (r27 == 0) goto L_0x04ad
            boolean r0 = r21.get()
            int r1 = A00(r3, r4, r0)
            r0 = 2131238507(0x7f081e6b, float:1.8093295E38)
            android.graphics.drawable.Drawable r26 = r3.getDrawable(r0)
            if (r26 == 0) goto L_0x0553
            android.graphics.drawable.Drawable r0 = r26.mutate()
            X.AnonymousClass7TE.A1R(r0, r1)
            int r1 = X.C51972G9s.A08(r3)
            r0 = r26
            r0.setBounds(r2, r2, r1, r1)
        L_0x04ad:
            if (r7 == 0) goto L_0x054f
            boolean r0 = r21.get()
            int r8 = A00(r3, r4, r0)
            switch(r6) {
                case 2: goto L_0x054c;
                case 3: goto L_0x054c;
                case 4: goto L_0x054c;
                case 8: goto L_0x054c;
                case 9: goto L_0x054c;
                case 15: goto L_0x054c;
                case 24: goto L_0x054c;
                default: goto L_0x04ba;
            }
        L_0x04ba:
            r0 = 0
        L_0x04bb:
            r1 = 0
            X.MbR r5 = new X.MbR
            r5.<init>((android.text.SpannableString) r7, (java.lang.String) r1, (int) r8, (int) r0)
        L_0x04c1:
            if (r16 == 0) goto L_0x04f9
            long r7 = r16.longValue()
            double r0 = (double) r7
            r7 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 / r7
            java.lang.String r7 = X.1G0.A04(r3, r0)
            android.text.SpannableString r8 = new android.text.SpannableString
            r8.<init>(r7)
            r7 = 4
            if (r6 == r7) goto L_0x0548
            r7 = r23
            if (r6 == r7) goto L_0x0548
            r9 = 15
            r7 = 2130970215(0x7f040667, float:1.7549134E38)
            if (r6 == r9) goto L_0x04e8
            r7 = 2130970310(0x7f0406c6, float:1.7549327E38)
        L_0x04e8:
            int r6 = X.2Yu.A0H(r3, r7)
            int r6 = r3.getColor(r6)
            java.lang.String r0 = X.1G0.A03(r3, r0)
            X.MbR r1 = new X.MbR
            r1.<init>((android.text.SpannableString) r8, (java.lang.String) r0, (int) r6, (int) r2)
        L_0x04f9:
            r0 = r28
            if (r4 != r0) goto L_0x052c
            boolean r0 = r21.get()
            if (r0 == 0) goto L_0x052c
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            r0 = 2131959084(0x7f131d2c, float:1.9554798E38)
            java.lang.String r1 = r3.getString(r0)
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r1)
            r6.append(r0)
            android.text.SpannableString r6 = android.text.SpannableString.valueOf(r6)
            X.0qQ.A07(r6)
            int r0 = X.1QE.A02(r3)
            int r3 = r3.getColor(r0)
            r0 = 0
            X.MbR r1 = new X.MbR
            r1.<init>((android.text.SpannableString) r6, (java.lang.String) r0, (int) r3, (int) r2)
        L_0x052c:
            boolean r37 = r24.get()
            boolean r38 = r42.Cdy()
            X.Mb1 r6 = new X.Mb1
            r23 = r6
            r24 = r12
            r27 = r5
            r28 = r1
            r29 = r22
            r30 = r4
            r34 = r15
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            return r6
        L_0x0548:
            r7 = 2130970277(0x7f0406a5, float:1.754926E38)
            goto L_0x04e8
        L_0x054c:
            r0 = 1
            goto L_0x04bb
        L_0x054f:
            r1 = 0
            r5 = r1
            goto L_0x04c1
        L_0x0553:
            r26 = 0
            goto L_0x04ad
        L_0x0557:
            int r0 = X.1QE.A02(r3)
            goto L_0x0486
        L_0x055d:
            r32 = 0
            goto L_0x048a
        L_0x0561:
            if (r0 != 0) goto L_0x057a
            X.0wj r7 = X.0wj.A01
            r5 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r1 = "Inbox - Digest shouldn't be null for this type"
            X.0f9 r7 = r7.AEf(r1, r5)
            java.lang.String r5 = X.C48844El6.A00(r4)
            java.lang.String r1 = "THREAD_DIGEST_TYPE"
            r7.ABQ(r1, r5)
            r7.report()
        L_0x057a:
            boolean r1 = r14.A0C
            if (r1 == 0) goto L_0x059b
            r5 = r31
            r1 = r30
            if (r5 != r1) goto L_0x059b
            boolean r1 = r42.CVE()
            if (r1 != 0) goto L_0x059b
            boolean r1 = r42.CR6()
            if (r1 != 0) goto L_0x059b
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131953179(0x7f13061b, float:1.9542822E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x059b:
            if (r0 != 0) goto L_0x05a7
            r0 = 2131959111(0x7f131d47, float:1.9554853E38)
            java.lang.String r0 = r3.getString(r0)
            X.0qQ.A07(r0)
        L_0x05a7:
            int r7 = r0.length()
            int r7 = r7 - r8
            r5 = 0
            r9 = 0
        L_0x05ae:
            if (r5 > r7) goto L_0x05d0
            r1 = r7
            if (r9 != 0) goto L_0x05b4
            r1 = r5
        L_0x05b4:
            char r8 = r0.charAt(r1)
            r1 = 32
            int r8 = X.0qQ.A00(r8, r1)
            r1 = 0
            if (r8 > 0) goto L_0x05c2
            r1 = 1
        L_0x05c2:
            if (r9 != 0) goto L_0x05cb
            if (r1 != 0) goto L_0x05c8
            r9 = 1
            goto L_0x05ae
        L_0x05c8:
            int r5 = r5 + 1
            goto L_0x05ae
        L_0x05cb:
            if (r1 == 0) goto L_0x05d0
            int r7 = r7 + -1
            goto L_0x05ae
        L_0x05d0:
            int r1 = r7 + 1
            java.lang.CharSequence r0 = r0.subSequence(r5, r1)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r0)
            if (r29 == 0) goto L_0x05f2
            if (r27 == 0) goto L_0x05f5
            java.lang.String r0 = "· "
            r1.replace(r2, r2, r0)
        L_0x05e4:
            java.lang.String r0 = " ·"
            r1.append(r0)
        L_0x05e9:
            android.text.SpannableString r0 = android.text.SpannableString.valueOf(r1)
            X.0qQ.A07(r0)
            goto L_0x0456
        L_0x05f2:
            if (r27 == 0) goto L_0x05e9
            goto L_0x05fb
        L_0x05f5:
            boolean r0 = X.0mk.A02(r3)
            if (r0 == 0) goto L_0x05e4
        L_0x05fb:
            java.lang.String r0 = "· "
            r1.replace(r2, r2, r0)
            goto L_0x05e9
        L_0x0601:
            java.lang.CharSequence r0 = r5.BxI()
            goto L_0x0448
        L_0x0607:
            r0 = 2131960545(0x7f1322e1, float:1.9557762E38)
            java.lang.String r0 = r13.getString(r0)
            goto L_0x0a44
        L_0x0610:
            boolean r0 = r14.A0A
            if (r0 != 0) goto L_0x0618
            r7 = r26
            goto L_0x0469
        L_0x0618:
            r37 = r11
            r38 = r3
            r39 = r22
            r40 = r7
            r41 = r5
            r43 = r24
            r44 = r21
            r45 = r15
            r46 = r35
            java.lang.CharSequence r0 = r37.A02(r38, r39, r40, r41, r42, r43, r44, r45, r46)
            if (r0 != 0) goto L_0x0448
            if (r15 > r8) goto L_0x063a
            if (r15 != r8) goto L_0x0655
            boolean r0 = r5.Cbp()
            if (r0 == 0) goto L_0x0655
        L_0x063a:
            X.0qQ.A0A(r13)
            boolean r0 = r42.Cdy()
            if (r0 == 0) goto L_0x0653
            boolean r0 = X.C328447Ev.A02(r7)
            if (r0 == 0) goto L_0x0653
        L_0x0649:
            r1 = r24
            r0 = r35
            java.lang.String r0 = A04(r13, r1, r15, r0, r9)
            goto L_0x0448
        L_0x0653:
            r9 = 0
            goto L_0x0649
        L_0x0655:
            X.2FW r1 = r5.Aqm()
            X.2FW r0 = X.2FW.A16
            if (r1 != r0) goto L_0x0673
            boolean r0 = r11.A05(r5, r4, r10)
            if (r0 == 0) goto L_0x066f
            java.lang.String r1 = r5.BsG()
            r0 = 58
            java.lang.String r0 = X.002.A0C(r1, r0)
            goto L_0x0a44
        L_0x066f:
            java.lang.String r0 = ""
            goto L_0x0a44
        L_0x0673:
            r1 = r22
            r0 = r42
            java.lang.CharSequence r0 = r11.A03(r1, r5, r0)
            goto L_0x0448
        L_0x067d:
            r0 = 2131961937(0x7f132851, float:1.9560585E38)
            java.lang.String r0 = r13.getString(r0)
            goto L_0x0a44
        L_0x0686:
            r1 = 2131960680(0x7f132368, float:1.9558036E38)
            java.lang.String r0 = r42.C6f()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r13.getString(r1, r0)
            goto L_0x0a44
        L_0x0697:
            r37 = r11
            r38 = r3
            r39 = r22
            r40 = r7
            r41 = r5
            r43 = r24
            r44 = r21
            r45 = r15
            r46 = r35
            java.lang.CharSequence r0 = r37.A02(r38, r39, r40, r41, r42, r43, r44, r45, r46)
            if (r0 != 0) goto L_0x0448
            if (r15 <= r8) goto L_0x079f
            X.0qQ.A0A(r13)
            boolean r0 = r42.Cdy()
            if (r0 == 0) goto L_0x06ca
            boolean r0 = X.C328447Ev.A02(r7)
            if (r0 == 0) goto L_0x06ca
        L_0x06c0:
            r1 = r24
            r0 = r35
            java.lang.String r0 = A04(r13, r1, r15, r0, r9)
            goto L_0x0a44
        L_0x06ca:
            r9 = 0
            goto L_0x06c0
        L_0x06cc:
            X.3mO r1 = X.C250993mO.A01(r7)
            X.0qQ.A07(r1)
            if (r10 == 0) goto L_0x06f0
            X.3mS r7 = X.C251033mS.A00(r7)
            java.util.List r0 = r42.BkC()
            java.util.Map r0 = X.C250993mO.A04(r7, r0)
            java.lang.String r0 = r1.A09(r13, r0)
        L_0x06e5:
            if (r0 != 0) goto L_0x0a44
            java.lang.String r1 = "inbox_thread_digest_view_model_presence"
            java.lang.String r0 = "Recieved null presence digest for Presence digest type"
            X.0wb.A03(r1, r0)
            goto L_0x043a
        L_0x06f0:
            r0 = r34
            java.lang.String r0 = r1.A08(r13, r0)
            goto L_0x06e5
        L_0x06f7:
            X.0qQ.A0A(r13)
            X.0qQ.A0A(r1)
            if (r10 == 0) goto L_0x0797
            X.0qQ.A0B(r1, r2)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r10 = r1.A00
            if (r10 < r8) goto L_0x0719
            r9 = 0
        L_0x070c:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r7.add(r0)
            int r9 = r9 + 1
            if (r9 >= r10) goto L_0x075b
            goto L_0x070c
        L_0x0719:
            X.42s r9 = r1.A02
            X.Peh r0 = r9.A00
            if (r0 != 0) goto L_0x0726
            X.Peh r0 = new X.Peh
            r0.<init>(r9)
            r9.A00 = r0
        L_0x0726:
            java.util.Iterator r11 = r0.iterator()
        L_0x072a:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x075b
            java.lang.Object r0 = r11.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            X.0qQ.A0A(r0)
            java.lang.Object r9 = r0.getKey()
            X.5uu r9 = (X.C299305uu) r9
            java.lang.Object r10 = r0.getValue()
            java.util.List r0 = X.C67579MqD.A00
            boolean r0 = r0.contains(r10)
            if (r0 == 0) goto L_0x072a
            java.lang.String r10 = r9.A01
            java.lang.String r9 = r9.A00
            r0 = r42
            com.instagram.user.model.User r0 = r0.CCg(r10, r9)
            if (r0 == 0) goto L_0x072a
            r7.add(r0)
            goto L_0x072a
        L_0x075b:
            int r0 = r7.size()
            if (r0 <= r8) goto L_0x0775
            r10 = 2131958550(0x7f131b16, float:1.9553715E38)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            int r0 = r7.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x076e:
            r9[r2] = r0
            java.lang.String r0 = r13.getString(r10, r9)
            goto L_0x07c7
        L_0x0775:
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0797
            r10 = 2131958552(0x7f131b18, float:1.955372E38)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r7 = r7.get(r2)
            boolean r0 = r7 instanceof X.AnonymousClass170
            if (r0 == 0) goto L_0x0795
            X.177 r7 = (X.AnonymousClass177) r7
        L_0x078c:
            java.lang.String r0 = r1.A03
            if (r7 == 0) goto L_0x076e
            java.lang.String r0 = X.AnonymousClass50n.A08(r7)
            goto L_0x076e
        L_0x0795:
            r7 = 0
            goto L_0x078c
        L_0x0797:
            r0 = 2131958547(0x7f131b13, float:1.955371E38)
            java.lang.String r0 = r13.getString(r0)
            goto L_0x07c7
        L_0x079f:
            java.lang.String r11 = r5.BsG()
            X.0qQ.A0A(r13)
            java.lang.Boolean r0 = r5.Cen()
            if (r0 == 0) goto L_0x0ace
            boolean r9 = r0.booleanValue()
            if (r10 == 0) goto L_0x07d5
            boolean r7 = r5.Cep()
            if (r17 != 0) goto L_0x080c
            if (r11 == 0) goto L_0x0810
            if (r9 == 0) goto L_0x07cc
            r1 = 2131959124(0x7f131d54, float:1.955488E38)
        L_0x07bf:
            java.lang.Object[] r0 = new java.lang.Object[]{r11}
            java.lang.String r0 = r13.getString(r1, r0)
        L_0x07c7:
            X.0qQ.A0A(r0)
            goto L_0x0a44
        L_0x07cc:
            r1 = 2131959127(0x7f131d57, float:1.9554886E38)
            if (r7 == 0) goto L_0x07bf
            r1 = 2131959128(0x7f131d58, float:1.9554888E38)
            goto L_0x07bf
        L_0x07d5:
            boolean r0 = r5.Ceq()
            java.lang.String r1 = r5.CFp()
            boolean r7 = r5.Cep()
            if (r0 == 0) goto L_0x080a
            if (r17 == 0) goto L_0x07ed
            r0 = 2131976990(0x7f13631e, float:1.9591116E38)
        L_0x07e8:
            java.lang.String r0 = r13.getString(r0)
            goto L_0x07c7
        L_0x07ed:
            java.lang.String r0 = "story_camera_reply"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0806
            java.lang.String r0 = "story_remix_reply"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0806
            r0 = 2131959102(0x7f131d3e, float:1.9554835E38)
            if (r9 == 0) goto L_0x07e8
            r0 = 2131959098(0x7f131d3a, float:1.9554827E38)
            goto L_0x07e8
        L_0x0806:
            r0 = 2131959092(0x7f131d34, float:1.9554815E38)
            goto L_0x07e8
        L_0x080a:
            if (r17 == 0) goto L_0x0810
        L_0x080c:
            r0 = 2131976989(0x7f13631d, float:1.9591114E38)
            goto L_0x07e8
        L_0x0810:
            if (r9 == 0) goto L_0x0816
            r0 = 2131959097(0x7f131d39, float:1.9554825E38)
            goto L_0x07e8
        L_0x0816:
            r0 = 2131959100(0x7f131d3c, float:1.955483E38)
            if (r7 == 0) goto L_0x07e8
            r0 = 2131959101(0x7f131d3d, float:1.9554833E38)
            goto L_0x07e8
        L_0x081f:
            r0 = 2131972358(0x7f135106, float:1.9581721E38)
            java.lang.String r0 = r13.getString(r0)
            goto L_0x0a44
        L_0x0828:
            r0 = 2131958539(0x7f131b0b, float:1.9553693E38)
            java.lang.String r0 = r3.getString(r0)
            goto L_0x0a44
        L_0x0831:
            r0 = r42
            java.lang.String r0 = X.C66718MbP.A00(r3, r7, r5, r0)
            goto L_0x0a44
        L_0x0839:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r5.C7a()
            long r0 = r7.toMicros(r0)
            long r9 = java.lang.System.currentTimeMillis()
            long r19 = r7.toHours(r9)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r9 = r11.toHours(r0)
            long r19 = r19 - r9
            long r9 = java.lang.System.currentTimeMillis()
            long r17 = r7.toMinutes(r9)
            long r9 = r11.toMinutes(r0)
            long r17 = r17 - r9
            r9 = 1
            int r7 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0873
            r0 = 2131958545(0x7f131b11, float:1.9553705E38)
            java.lang.String r0 = r3.getString(r0)
        L_0x086e:
            X.0qQ.A07(r0)
            goto L_0x0448
        L_0x0873:
            r9 = 60
            int r7 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0889
            r7 = 2131958544(0x7f131b10, float:1.9553703E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Long r0 = java.lang.Long.valueOf(r17)
        L_0x0882:
            r1[r2] = r0
            java.lang.String r0 = r3.getString(r7, r1)
            goto L_0x086e
        L_0x0889:
            r9 = 24
            int r7 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0899
            r7 = 2131958542(0x7f131b0e, float:1.95537E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Long r0 = java.lang.Long.valueOf(r19)
            goto L_0x0882
        L_0x0899:
            long r17 = X.C66683Maq.A00(r0)
            r9 = 14
            int r7 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x08af
            r0 = 2131958540(0x7f131b0c, float:1.9553695E38)
        L_0x08a6:
            java.lang.String r0 = r3.getString(r0)
        L_0x08aa:
            X.0qQ.A0A(r0)
            goto L_0x0448
        L_0x08af:
            r9 = 7
            int r7 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r7 < 0) goto L_0x08b9
            r0 = 2131958543(0x7f131b0f, float:1.9553701E38)
            goto L_0x08a6
        L_0x08b9:
            r9 = 1
            int r7 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x08cf
            r7 = 2131958541(0x7f131b0d, float:1.9553697E38)
            java.lang.String r0 = X.C66683Maq.A01(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r3.getString(r7, r0)
            goto L_0x08aa
        L_0x08cf:
            r0 = 2131958546(0x7f131b12, float:1.9553707E38)
            goto L_0x08a6
        L_0x08d3:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r5.C7a()
            long r0 = r7.toMicros(r0)
            long r9 = java.lang.System.currentTimeMillis()
            long r19 = r7.toHours(r9)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r9 = r11.toHours(r0)
            long r19 = r19 - r9
            long r9 = java.lang.System.currentTimeMillis()
            long r17 = r7.toMinutes(r9)
            long r9 = r11.toMinutes(r0)
            long r17 = r17 - r9
            r9 = 1
            int r7 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x090a
            r0 = 2131959083(0x7f131d2b, float:1.9554796E38)
            java.lang.String r0 = r3.getString(r0)
            goto L_0x09d4
        L_0x090a:
            r9 = 60
            int r7 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0921
            r1 = 2131959082(0x7f131d2a, float:1.9554794E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Long r7 = java.lang.Long.valueOf(r17)
        L_0x0919:
            r0[r2] = r7
            java.lang.String r0 = r3.getString(r1, r0)
            goto L_0x09d4
        L_0x0921:
            r9 = 24
            int r7 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0931
            r1 = 2131959080(0x7f131d28, float:1.955479E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Long r7 = java.lang.Long.valueOf(r19)
            goto L_0x0919
        L_0x0931:
            long r17 = X.C66683Maq.A00(r0)
            r9 = 14
            int r7 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0947
            r0 = 2131959076(0x7f131d24, float:1.9554782E38)
            java.lang.String r0 = r3.getString(r0)
            X.0qQ.A0A(r0)
            goto L_0x0a44
        L_0x0947:
            r9 = 7
            int r7 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r7 < 0) goto L_0x0959
            r0 = 2131959081(0x7f131d29, float:1.9554792E38)
        L_0x0950:
            java.lang.String r0 = r3.getString(r0)
        L_0x0954:
            X.0qQ.A07(r0)
            goto L_0x0a44
        L_0x0959:
            r9 = 1
            int r7 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x096f
            r7 = 2131959077(0x7f131d25, float:1.9554784E38)
            java.lang.String r0 = X.C66683Maq.A01(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r3.getString(r7, r0)
            goto L_0x0954
        L_0x096f:
            r0 = 2131959085(0x7f131d2d, float:1.95548E38)
            goto L_0x0950
        L_0x0973:
            boolean r0 = r5.CXc()
            if (r0 != 0) goto L_0x099a
            boolean r0 = r5.CXd()
            if (r0 != 0) goto L_0x099a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Attempt to get missed call digest for a message that isn't that of a missed call: "
            r1.append(r0)
            X.2FW r0 = r5.Aqm()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x099a:
            boolean r1 = r5.CXc()
            X.Mdq r0 = new X.Mdq
            r0.<init>(r3, r2, r2, r2)
            if (r1 == 0) goto L_0x09af
            X.0eM r0 = r0.A0A
        L_0x09a7:
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0a44
        L_0x09af:
            X.0eM r0 = r0.A0B
            goto L_0x09a7
        L_0x09b2:
            r0 = 2131959111(0x7f131d47, float:1.9554853E38)
            java.lang.String r0 = r3.getString(r0)
            goto L_0x0a44
        L_0x09bb:
            java.util.List r1 = r5.CGC()
            boolean r7 = r1.isEmpty()
            java.lang.String r0 = ""
            if (r7 != 0) goto L_0x0a44
            boolean r7 = r42.CUG()
            if (r7 != 0) goto L_0x09d8
            r0 = 2131958522(0x7f131afa, float:1.9553659E38)
        L_0x09d0:
            java.lang.String r0 = r3.getString(r0)
        L_0x09d4:
            X.0qQ.A07(r0)
            goto L_0x0a44
        L_0x09d8:
            int r7 = r1.size()
            java.util.List r9 = r42.Bk9()
            int r9 = r9.size()
            if (r9 != r7) goto L_0x09ea
            r0 = 2131958557(0x7f131b1d, float:1.955373E38)
            goto L_0x09d0
        L_0x09ea:
            if (r7 == 0) goto L_0x0a44
            if (r7 == r8) goto L_0x0a19
            r0 = r23
            if (r7 == r0) goto L_0x0a09
            r9 = 2131958560(0x7f131b20, float:1.9553736E38)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r1 = r1.get(r2)
            r0[r2] = r1
            int r7 = r7 - r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
        L_0x0a02:
            r0[r8] = r1
        L_0x0a04:
            java.lang.String r0 = r3.getString(r9, r0)
            goto L_0x09d4
        L_0x0a09:
            r9 = 2131958561(0x7f131b21, float:1.9553738E38)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r7 = r1.get(r2)
            r0[r2] = r7
            java.lang.Object r1 = r1.get(r8)
            goto L_0x0a02
        L_0x0a19:
            r9 = 2131958559(0x7f131b1f, float:1.9553734E38)
            java.lang.Object r0 = r1.get(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            goto L_0x0a04
        L_0x0a25:
            r0 = 2131959059(0x7f131d13, float:1.9554748E38)
            java.lang.String r0 = r13.getString(r0)
            goto L_0x0a44
        L_0x0a2d:
            r0 = 2131960447(0x7f13227f, float:1.9557563E38)
            java.lang.String r0 = r13.getString(r0)
            goto L_0x0a44
        L_0x0a35:
            r0 = 2131958668(0x7f131b8c, float:1.9553955E38)
            java.lang.String r0 = r3.getString(r0)
            goto L_0x0a44
        L_0x0a3d:
            r0 = 2131959112(0x7f131d48, float:1.9554855E38)
            java.lang.String r0 = r3.getString(r0)
        L_0x0a44:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            goto L_0x0448
        L_0x0a48:
            r16 = 0
            switch(r6) {
                case 0: goto L_0x0a5f;
                case 1: goto L_0x0a4d;
                case 2: goto L_0x0a4d;
                case 3: goto L_0x0a4d;
                case 4: goto L_0x0a5f;
                case 5: goto L_0x0a4d;
                case 6: goto L_0x0a5b;
                case 7: goto L_0x0a5b;
                case 8: goto L_0x0a5b;
                case 9: goto L_0x0a5b;
                case 10: goto L_0x0a5b;
                case 11: goto L_0x0a5b;
                case 12: goto L_0x0a5b;
                case 13: goto L_0x0a5b;
                case 14: goto L_0x0a5b;
                case 15: goto L_0x0a4d;
                case 16: goto L_0x0a5b;
                case 17: goto L_0x0a4d;
                case 18: goto L_0x0a5b;
                case 19: goto L_0x0a4d;
                case 20: goto L_0x0a4d;
                case 21: goto L_0x0a4d;
                case 22: goto L_0x0a4d;
                case 23: goto L_0x0a4d;
                case 24: goto L_0x0a5b;
                default: goto L_0x0a4d;
            }
        L_0x0a4d:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r9 = r5.C7a()
            long r9 = r13.toMicros(r9)
            java.lang.Long r16 = java.lang.Long.valueOf(r9)
        L_0x0a5b:
            if (r16 == 0) goto L_0x042a
            goto L_0x042c
        L_0x0a5f:
            boolean r9 = r14.A0A
            if (r9 != 0) goto L_0x0a4d
            goto L_0x0a5b
        L_0x0a64:
            boolean r9 = r11.A05(r5, r4, r10)
            if (r9 == 0) goto L_0x0404
            android.content.res.Resources r10 = r3.getResources()
            r9 = 2131165190(0x7f070006, float:1.794459E38)
            goto L_0x0a79
        L_0x0a72:
            android.content.res.Resources r10 = r3.getResources()
            r9 = 2131165195(0x7f07000b, float:1.79446E38)
        L_0x0a79:
            int r33 = r10.getDimensionPixelOffset(r9)
            goto L_0x0404
        L_0x0a7f:
            r25 = 0
            goto L_0x03fa
        L_0x0a83:
            r9 = 2131237819(0x7f081bbb, float:1.80919E38)
            android.graphics.drawable.Drawable r12 = r3.getDrawable(r9)
            if (r12 == 0) goto L_0x0ade
            int r9 = X.2Yu.A08(r3)
            int r9 = r3.getColor(r9)
            android.graphics.ColorFilter r9 = X.AnonymousClass37O.A00(r9)
            r12.setColorFilter(r9)
            goto L_0x03db
        L_0x0a9d:
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            if (r4 == r9) goto L_0x0aa5
            java.lang.Integer r9 = X.AnonymousClass05K.A0Y
            if (r4 != r9) goto L_0x03db
        L_0x0aa5:
            X.2FW r13 = r5.Aqm()
            X.2FW r9 = X.2FW.A16
            if (r13 != r9) goto L_0x03db
            boolean r9 = r11.A05(r5, r4, r10)
            if (r9 != 0) goto L_0x03db
            if (r15 > r8) goto L_0x03db
            r9 = 2131231560(0x7f080348, float:1.8079204E38)
            android.graphics.drawable.Drawable r12 = r3.getDrawable(r9)
            if (r12 == 0) goto L_0x0ae6
            android.content.res.Resources r13 = r3.getResources()
            r9 = 2131165331(0x7f070093, float:1.7944876E38)
            int r9 = r13.getDimensionPixelSize(r9)
            r12.setBounds(r2, r2, r9, r9)
            goto L_0x03db
        L_0x0ace:
            java.lang.String r1 = "Message should be a visual media message!"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0ad6:
            java.lang.String r1 = "Drawable shouldn't be missing!"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0ade:
            java.lang.String r1 = "Drawable should not be missing!"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0ae6:
            java.lang.String r1 = "Drawable shouldn't be missing!"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66691May.A01(android.content.Context, android.text.SpannableString, X.Pwa, com.instagram.common.session.UserSession, X.Mi5, X.Pw9, X.PwB, X.MlR, java.util.List, int, boolean, boolean, boolean, boolean, boolean, boolean):X.Mb1");
    }
}
