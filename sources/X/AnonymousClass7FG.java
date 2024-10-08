package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7FG  reason: invalid class name */
public abstract class AnonymousClass7FG {
    public static final AnonymousClass7FT A02(UserSession userSession, AnonymousClass7LQ r4, C254933tI r5) {
        0qQ.A0B(userSession, 0);
        C254703su r2 = r4.A0e;
        0qQ.A07(r2);
        boolean A00 = AnonymousClass7FH.A00(userSession, r4);
        C327627Bo A03 = r4.A03();
        0qQ.A07(A03);
        return A01(userSession, A03, r2, r5, A00);
    }

    public static final AnonymousClass7FT A01(UserSession userSession, C327627Bo r74, C254703su r75, C254933tI r76, boolean z) {
        long j;
        C254703su r2 = r75;
        String A0h = r2.A0h();
        0qQ.A0C(A0h, "null cannot be cast to non-null type kotlin.String");
        String A0f = r2.A0f();
        C254933tI r6 = r76;
        String str = r6.A0T;
        if (str == null && (str = r6.A0R) == null) {
            throw new IllegalStateException("message_id and client_context are both null");
        }
        String str2 = r6.A0R;
        MessageIdentifier messageIdentifier = new MessageIdentifier(A0h, A0f);
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        Long l = r6.A0P;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        long millis = timeUnit.toMillis(j);
        AnonymousClass7FR r8 = new AnonymousClass7FR((GifUrlImpl) null, (Integer) null, "", "", (String) null, (String) null, (String) null, (String) null, (List) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        UserSession userSession2 = userSession;
        ArrayList A0r = r2.A0r(0eE.A00(userSession2).A00());
        2FW r22 = r2.A10;
        0qQ.A07(r22);
        boolean A0K = 0qQ.A0K(r6.A0U, userSession2.A06);
        return new AnonymousClass7FT((C61063Jw1) null, r8, r74, r22, messageIdentifier, new MessageIdentifier(str, str2), A0r, millis, z, false, false, A0K, false);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0237, code lost:
        if (r5 == 1013) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x026b, code lost:
        if (((java.lang.Boolean) r70.A0f.getValue()).booleanValue() == false) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02a5, code lost:
        if (r35 != 2) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02c1, code lost:
        if (r0.length() == 0) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02e9, code lost:
        if (X.AnonymousClass48O.A07(r1) != false) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x031b, code lost:
        if (r5 == 29) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0339, code lost:
        if (r5 == 29) goto L_0x033b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00af, code lost:
        if (r5.contains(r2.A1u) == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0381, code lost:
        if (r31 == false) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x03a1, code lost:
        if (r16 == false) goto L_0x03a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x03bf, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36320519788438038L) != false) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x03d8, code lost:
        if (r4 != false) goto L_0x03da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x03e2, code lost:
        if (X.2R8.A00(r3) == false) goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x044d, code lost:
        if (((java.lang.Boolean) r70.A0F.getValue()).booleanValue() == false) goto L_0x044f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0465, code lost:
        if (X.AnonymousClass7FK.A01(r3, r27, r2, r5, r16, r58) == false) goto L_0x0467;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x047d, code lost:
        if (X.AnonymousClass7FK.A01(r3, r27, r2, r5, r16, r58) == false) goto L_0x047f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0495, code lost:
        if (X.AnonymousClass7FO.A00(r3, r2, r9, r76, r48, r5, r31) == false) goto L_0x0497;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0499, code lost:
        if (r7 != false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x049b, code lost:
        r68 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x04a1, code lost:
        if (r9.AFO(r2) != false) goto L_0x04a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x04a3, code lost:
        r68 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x04a5, code lost:
        if (r47 == false) goto L_0x0766;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x04a7, code lost:
        if (r65 == false) goto L_0x0766;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x04a9, code lost:
        if (r5 != 29) goto L_0x04b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x04b6, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36319342967397522L) != false) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x04ba, code lost:
        if (r2.A0Q == null) goto L_0x0766;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x04c8, code lost:
        if ((!r2.A1u.equals(X.C3262475z.A00(r3))) == false) goto L_0x0752;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x04ca, code lost:
        r1 = X.C70306O1k.A00(r3).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x04d2, code lost:
        if (r1 == false) goto L_0x0766;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x04d4, code lost:
        r48 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x04da, code lost:
        if (r2.A10 != X.2FW.A1q) goto L_0x04eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x04dc, code lost:
        if (r10 == false) goto L_0x04eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x04de, code lost:
        r91 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x04e9, code lost:
        if (new X.C227422jG(r3).A00() != false) goto L_0x04ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x04eb, code lost:
        r91 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x04ed, code lost:
        r74 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x04f1, code lost:
        if (r5 != 29) goto L_0x073e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x04f7, code lost:
        if (X.C66839MdX.A00(r3, r2) == false) goto L_0x074e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x04fd, code lost:
        if (X.AnonymousClass79U.A01(r3, r2) != false) goto L_0x0501;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x04ff, code lost:
        if (r30 == false) goto L_0x074e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0503, code lost:
        if (r14 != X.AnonymousClass05K.A00) goto L_0x074e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0510, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36319407392234791L) == false) goto L_0x074e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0512, code lost:
        if (r74 == false) goto L_0x0553;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0516, code lost:
        if (r5 == 29) goto L_0x0553;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0520, code lost:
        if (X.AnonymousClass78L.A00(r3).booleanValue() == false) goto L_0x0553;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x052d, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36328186304412727L) == false) goto L_0x0553;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x053f, code lost:
        if (X.1Au.A00(r3).A01.getInt("direct_message_translation_badge_nux_seen_count", 0) >= 2) goto L_0x0553;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0541, code lost:
        r75 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0551, code lost:
        if (X.1Au.A00(r3).A01.getBoolean("direct_message_translation_nux_accepted", false) == false) goto L_0x0555;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0553, code lost:
        r75 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0557, code lost:
        if (r5 != 29) goto L_0x057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x055d, code lost:
        if (X.C66839MdX.A00(r3, r2) == false) goto L_0x057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0563, code lost:
        if (X.AnonymousClass79U.A01(r3, r2) != false) goto L_0x0567;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0565, code lost:
        if (r30 == false) goto L_0x057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0569, code lost:
        if (r14 != X.AnonymousClass05K.A01) goto L_0x057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x056b, code lost:
        r76 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0578, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36319407392234791L) != false) goto L_0x057c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x057a, code lost:
        r76 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x057c, code lost:
        r77 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0580, code lost:
        if (r5 == 29) goto L_0x0596;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0586, code lost:
        if (X.AnonymousClass7CY.A01(r3, r2, r5) == false) goto L_0x0596;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x058a, code lost:
        if (r14 != X.AnonymousClass05K.A01) goto L_0x0596;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x058c, code lost:
        if (r27 == null) goto L_0x0725;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0594, code lost:
        if (r27.A01() != true) goto L_0x0725;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0596, code lost:
        r77 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x059e, code lost:
        if (X.AnonymousClass7FK.A02(r3, r27, r2, r14, r5) == false) goto L_0x05a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x05a0, code lost:
        r78 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x05a6, code lost:
        if (X.AnonymousClass79U.A03(r2) != false) goto L_0x05aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x05a8, code lost:
        r78 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x05aa, code lost:
        r79 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x05ac, code lost:
        if (r5 != 29) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x05ae, code lost:
        if (r28 == false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x05ba, code lost:
        if (X.0qQ.A0K(r3.A06, r2.BsI()) == false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x05c4, code lost:
        if (X.2FW.A05.contains(r2.A10) == false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x05c8, code lost:
        if (r2.A2F != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x05ce, code lost:
        if (r2.A0P() != null) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x05d0, code lost:
        r1 = r2.A0H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x05d4, code lost:
        if (r1 == null) goto L_0x05ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x05da, code lost:
        if (r1.isEmpty() != false) goto L_0x05ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x05dc, code lost:
        r0 = (X.C254873tC) X.00k.A0O(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x05e4, code lost:
        if (r0 == null) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x05ea, code lost:
        if (r0.A02 != 9) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x05f0, code lost:
        if (X.C347037wA.A05(r3) == false) goto L_0x06ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x05f2, code lost:
        r79 = X.182.A06(X.0Tu.A05, r3, 36319407392824624L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x05fd, code lost:
        r104 = r3;
        r105 = r70;
        r106 = r27;
        r107 = r2;
        r73 = r103.A05(r104, r105, r106, r107, r64, r5, r19, r25, r24, r68);
        r1 = (X.AnonymousClass7FP) r3.A01(X.AnonymousClass7FP.class, new X.C73918Ply(r3, 43));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x062a, code lost:
        if (X.AnonymousClass7FP.A00(r1, r2, r69) == false) goto L_0x063d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x062c, code lost:
        r58 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x063b, code lost:
        if (X.182.A06(X.0Tu.A05, r1.A00, 36325579259262013L) != false) goto L_0x063f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x063d, code lost:
        r58 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x063f, code lost:
        if (r17 == false) goto L_0x0643;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0641, code lost:
        if (r18 != false) goto L_0x0651;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0645, code lost:
        if (r5 != 1014) goto L_0x06eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x064f, code lost:
        if (X.0qQ.A0K(r3.A06, r22) == false) goto L_0x06eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0651, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0656, code lost:
        if (r2.A10 != X.2FW.A1g) goto L_0x065c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0658, code lost:
        r82 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x065a, code lost:
        if (r6 != false) goto L_0x065e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x065c, code lost:
        r82 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0662, code lost:
        if (r9.AG3(r2) == false) goto L_0x0672;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0664, code lost:
        r86 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0670, code lost:
        if (X.0qQ.A0K(r3.A06, r2.BsI()) != false) goto L_0x0674;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0672, code lost:
        r86 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0674, code lost:
        r87 = r9.AFp(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x067c, code lost:
        if (r2.A10 != X.2FW.A0y) goto L_0x08ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x067e, code lost:
        r1 = r2.A0H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0682, code lost:
        if (r1 == null) goto L_0x08ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0684, code lost:
        r0 = (X.C254873tC) r1.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x068c, code lost:
        if (r0 == null) goto L_0x08ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x068e, code lost:
        r0 = r0.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0692, code lost:
        if (r0 == null) goto L_0x08ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0694, code lost:
        r14 = r0.iterator();
        X.0qQ.A07(r14);
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x06a1, code lost:
        if (r14.hasNext() == false) goto L_0x08ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0037, code lost:
        if (X.AnonymousClass7FH.A00(r3, r1) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x06a3, code lost:
        r1 = (X.AnonymousClass9JN) r14.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x06b1, code lost:
        if (X.0qQ.A0K(r1.A05, "xma_long_press_action") == false) goto L_0x069d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x06b3, code lost:
        if (r6 != null) goto L_0x06ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x06b5, code lost:
        r6 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x06ba, code lost:
        r18 = r1.A04;
        r12 = r1.A02;
        r1 = (java.lang.Number) r1.A00;
        r8 = X.C391179sT.values();
        r11 = r8.length;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x06ca, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x06cb, code lost:
        if (r0 >= r11) goto L_0x06db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x06cd, code lost:
        r7 = r8[r0];
        r10 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x06d1, code lost:
        if (r1 == null) goto L_0x06e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x06d7, code lost:
        if (r10 != r1.intValue()) goto L_0x06e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x06d9, code lost:
        r7 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x06db, code lost:
        r6.add(new X.JV7(r7, r18, r12, 22));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x06e8, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x06eb, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x06ee, code lost:
        r0 = (X.C272664lA) X.AnonymousClass3S1.A00(X.C64456LcF.A00, (java.util.List) X.C63091KrK.A00(r3).A0D.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0702, code lost:
        if (r0 == null) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0704, code lost:
        r0 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0706, code lost:
        if (r0 == null) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x070a, code lost:
        if (r0 == com.instagram.api.schemas.MonetizationEligibilityDecision.A05) goto L_0x0714;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x070e, code lost:
        if (r0 == com.instagram.api.schemas.MonetizationEligibilityDecision.A04) goto L_0x0714;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0712, code lost:
        if (r0 != com.instagram.api.schemas.MonetizationEligibilityDecision.A06) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x071f, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36319407392824624L) == false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0721, code lost:
        r79 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x072d, code lost:
        if (X.AnonymousClass48O.A06(java.lang.Integer.valueOf(r5)) != false) goto L_0x0596;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x073a, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36328186304281654L) == false) goto L_0x0596;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0744, code lost:
        if (X.AnonymousClass7FK.A02(r3, r27, r2, r14, r5) == false) goto L_0x074e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x074a, code lost:
        if (X.AnonymousClass79U.A03(r2) != false) goto L_0x074e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x074e, code lost:
        r74 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0752, code lost:
        r1 = X.182.A06(X.0Tu.A05, r3, 36325613619655769L);
        X.0qQ.A0A(java.lang.Boolean.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0766, code lost:
        r48 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0772, code lost:
        if (r13 == null) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x077c, code lost:
        if (r13 != null) goto L_0x0429;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0786, code lost:
        if (r13 != null) goto L_0x0429;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x080c, code lost:
        if (r2.A1P() != false) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0177, code lost:
        if (r2.A1R() == false) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x08ac, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x08ae, code lost:
        r64 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x08b2, code lost:
        if (r4 != X.AnonymousClass05K.A0N) goto L_0x08b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x08b4, code lost:
        r64 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x08b6, code lost:
        r11 = r70;
        r8 = new X.AnonymousClass9N0(r3, r2, r11, r4, r13, 2);
        r108 = new X.AnonymousClass9N0(r3, r2, r11, r4, r13, 3);
        r103 = new X.AnonymousClass7FQ(r104, r105, r106, r107, r15, r5, r16, r69, r19, r25, r24, r115);
        r7 = new X.AnonymousClass9MP(18, r71, r3, r2, r69);
        r0 = r2.A1o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x08fb, code lost:
        if (r0 == null) goto L_0x0904;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x08fd, code lost:
        r1 = r0.length();
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0902, code lost:
        if (r1 != 0) goto L_0x0905;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0904, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0905, code lost:
        r1 = !r0;
        r69 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x090d, code lost:
        if (r2.A1S() == false) goto L_0x0911;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x090f, code lost:
        r69 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0911, code lost:
        r10 = r2.A2K;
        r71 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0917, code lost:
        if (r2.A2B == null) goto L_0x091b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0919, code lost:
        r71 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x091b, code lost:
        r0 = r2.A12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x091d, code lost:
        if (r0 == null) goto L_0x0a1e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x091f, code lost:
        r0 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0921, code lost:
        if (r0 == null) goto L_0x0a1e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0923, code lost:
        r7 = (com.instagram.model.mediasize.GifUrlImpl) r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0927, code lost:
        r0 = r2.A0q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0929, code lost:
        if (r0 == null) goto L_0x0a1a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x092b, code lost:
        r9 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x092d, code lost:
        r0 = r2.A1z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x092f, code lost:
        if (r0 == null) goto L_0x0935;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0931, code lost:
        r36 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0935, code lost:
        if (r17 == false) goto L_0x0946;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0937, code lost:
        r80 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0944, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36323736718355894L) != false) goto L_0x0948;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0946, code lost:
        r80 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0948, code lost:
        if (r6 == null) goto L_0x0a16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x094a, code lost:
        r39 = X.AnonymousClass62Q.A00(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x094e, code lost:
        r0 = r2.A0Q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0950, code lost:
        if (r0 == null) goto L_0x0a12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0952, code lost:
        r8 = r0.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0954, code lost:
        r6 = r2.A0e();
        r90 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x095a, code lost:
        if (r6 == null) goto L_0x0967;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x095c, code lost:
        X.0qQ.A0B("cutout_", 1);
        r90 = r6.startsWith("cutout_");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0967, code lost:
        r92 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x096d, code lost:
        if (r2.A10 != X.2FW.A1A) goto L_0x0971;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x018b, code lost:
        if (r4.A00(X.C376179Gx.A0F) == false) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x096f, code lost:
        r92 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0971, code lost:
        r30 = new X.AnonymousClass7FR(r7, r4, r33, r13, r9, r36, r8, r29, r39, r8, r108, r103, r7, r20, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r10, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, true, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92);
        r4 = X.0eE.A00(r3).A00();
        r9 = X.AnonymousClass48O.A03(r5);
        r8 = X.AnonymousClass7FS.A01(r3, r5, X.C331077Pk.A02.A03(r3, r27));
        r104 = r2.A1k(r4);
        r6 = new com.instagram.model.direct.messageid.MessageIdentifier(r2.A0h(), r2.A0f());
        r100 = java.util.concurrent.TimeUnit.MICROSECONDS.toMillis(r2.C7c());
        r103 = r2.A1P();
        r105 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x09c1, code lost:
        if (r8 != false) goto L_0x09cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x09c3, code lost:
        if (r104 != false) goto L_0x09cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x09c5, code lost:
        r104 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x09cb, code lost:
        if (r2.A0p(r4) == null) goto L_0x09cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x09cd, code lost:
        r104 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x09cf, code lost:
        if (r9 == false) goto L_0x0a0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x09d1, code lost:
        r99 = r2.A0q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x09d9, code lost:
        if (r2.A1j(r4) != false) goto L_0x09f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x09db, code lost:
        r0 = X.17h.A00(r3).A02(r2.A1u);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x09e5, code lost:
        if (r0 == null) goto L_0x0a0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x09e7, code lost:
        r1 = r0.A03.AaZ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x09f3, code lost:
        if (X.0qQ.A0K(r1, r3.A06) == false) goto L_0x09fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x09f7, code lost:
        if (r5 == 1013) goto L_0x09fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x09f9, code lost:
        r105 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x0a0a, code lost:
        return new X.AnonymousClass7FT((X.C61063Jw1) null, r30, r95, r96, r6, (com.instagram.model.direct.messageid.MessageIdentifier) null, r99, r100, r102, r103, r104, r105, r2.A2P);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0a0b, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0a0d, code lost:
        r99 = r2.A0r(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0a12, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x0a16, code lost:
        r39 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0a1a, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x0a1e, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e9, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36325836957365512L) == false) goto L_0x01eb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0427 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x076a  */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x076e  */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x0776  */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x0780  */
    /* JADX WARNING: Removed duplicated region for block: B:449:0x078a  */
    /* JADX WARNING: Removed duplicated region for block: B:488:0x0814  */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x083f  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass7FT A00(android.content.Context r111, com.instagram.common.session.UserSession r112, X.AnonymousClass9HC r113, X.AnonymousClass7LQ r114, X.2FW r115) {
        /*
            r1 = 0
            r71 = r111
            r0 = r71
            X.0qQ.A0B(r0, r1)
            r0 = 1
            r3 = r112
            X.0qQ.A0B(r3, r0)
            r1 = 3
            r70 = r113
            r0 = r70
            X.0qQ.A0B(r0, r1)
            r1 = 4
            r96 = r115
            r0 = r96
            X.0qQ.A0B(r0, r1)
            r1 = r114
            X.3su r2 = r1.A0e
            X.0qQ.A07(r2)
            r0 = r70
            com.instagram.direct.capabilities.Capabilities r4 = r0.A01
            X.9Gx r0 = X.C376179Gx.REACTIONS
            boolean r0 = r4.A00(r0)
            if (r0 == 0) goto L_0x0039
            boolean r0 = X.AnonymousClass7FH.A00(r3, r1)
            r102 = 1
            if (r0 != 0) goto L_0x003b
        L_0x0039:
            r102 = 0
        L_0x003b:
            int r35 = r1.A01()
            X.7SD r5 = r1.A0G
            X.3t3 r0 = r5.A0P
            r64 = r0
            boolean r0 = r5.A14
            r25 = r0
            boolean r0 = r5.A15
            r24 = r0
            boolean r0 = r5.A1G
            r19 = r0
            boolean r11 = r5.A0y
            boolean r0 = r5.A1A
            r16 = r0
            int r0 = r5.A07
            r40 = r0
            boolean r0 = r5.A1D
            r45 = r0
            boolean r0 = r5.A17
            r20 = r0
            boolean r0 = r5.A0s
            r28 = r0
            boolean r0 = r5.A0v
            r34 = r0
            boolean r0 = r5.A0t
            r33 = r0
            int r6 = r5.A08
            r29 = 1
            r0 = 29
            if (r6 != r0) goto L_0x00a6
            java.lang.String r5 = r5.A0T
            java.lang.String r0 = r2.A1u
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x00a6
            X.7SD r0 = r1.A0G
            java.util.List r0 = r0.A0a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r7 = r0.iterator()
        L_0x008e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r6 = r7.next()
            java.lang.String r0 = r3.A06
            boolean r0 = X.0qQ.A0K(r6, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x008e
            r5.add(r6)
            goto L_0x008e
        L_0x00a6:
            r29 = 0
            goto L_0x00b1
        L_0x00a9:
            java.lang.String r0 = r2.A1u
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L_0x00a6
        L_0x00b1:
            X.7SD r6 = r1.A0G
            int r5 = r6.A08
            int r0 = r6.A01
            java.lang.Integer r76 = java.lang.Integer.valueOf(r0)
            boolean r0 = r6.A11
            r58 = r0
            boolean r0 = r6.A0r
            r69 = r0
            boolean r8 = r6.A0o
            java.util.List r0 = r6.A0b
            r48 = r0
            boolean r0 = r6.A0n
            r31 = r0
            boolean r12 = X.C308556Us.A08(r3, r6)
            java.lang.Integer r14 = r1.A0N
            X.0qQ.A07(r14)
            X.7SD r6 = r1.A0G
            boolean r0 = r6.A1C
            r30 = r0
            X.3Tu r0 = r6.A0H
            r27 = r0
            X.7Bo r95 = r1.A03()
            X.0qQ.A07(r95)
            com.instagram.user.model.User r0 = r1.A0K
            r10 = 0
            if (r0 == 0) goto L_0x08a9
            X.4Cl r0 = r0.A03
            com.instagram.api.schemas.IGAIAgentType r6 = r0.AaX()
        L_0x00f2:
            com.instagram.api.schemas.IGAIAgentType r0 = com.instagram.api.schemas.IGAIAgentType.A04
            r17 = 0
            if (r6 != r0) goto L_0x00fa
            r17 = 1
        L_0x00fa:
            com.instagram.user.model.User r0 = r1.A0K
            if (r0 == 0) goto L_0x08a5
            boolean r18 = r0.A1T()
        L_0x0102:
            boolean r83 = r1.A06()
            com.instagram.user.model.User r0 = r1.A0K
            if (r0 == 0) goto L_0x08a1
            X.4Cl r0 = r0.A03
            java.lang.String r22 = r0.AaR()
        L_0x0110:
            X.7SD r0 = r1.A0G
            java.util.List r1 = r0.A0c
            if (r1 == 0) goto L_0x089d
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x087d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x087d
        L_0x0120:
            r32 = 0
        L_0x0122:
            r1 = 25
            r0 = r48
            X.0qQ.A0B(r0, r1)
            r21 = 0
            r26 = 1
            r23 = 2
            r114 = 3
            X.1at r1 = X.C327657Br.A00()
            X.2FW r0 = r2.A10
            X.0qQ.A07(r0)
            X.7Bu r9 = r1.A01(r0)
            X.0t1 r0 = X.0eE.A00(r3)
            com.instagram.user.model.User r15 = r0.A00()
            boolean r7 = r2.A1T()
            r115 = 0
            if (r7 != r12) goto L_0x0150
            r115 = 1
        L_0x0150:
            r6 = r48
            r1 = r69
            r0 = r19
            boolean r0 = X.C308556Us.A0W(r6, r1, r11, r8, r0)
            if (r0 == 0) goto L_0x0853
            r0 = r27
            boolean r0 = X.C308556Us.A0G(r3, r0)
            if (r0 == 0) goto L_0x0853
            boolean r0 = r2.A1S()
            if (r0 != 0) goto L_0x087a
        L_0x016a:
            r13 = 1
        L_0x016b:
            boolean r0 = r2.A1j(r15)
            if (r0 == 0) goto L_0x0179
            boolean r0 = r2.A1R()
            r72 = 1
            if (r0 != 0) goto L_0x017b
        L_0x0179:
            r72 = 0
        L_0x017b:
            r0 = r19
            boolean r0 = X.AnonymousClass7FI.A00(r3, r2, r5, r0, r11)
            if (r0 == 0) goto L_0x018d
            X.9Gx r0 = X.C376179Gx.MESSAGE_FORWARDING
            boolean r0 = r4.A00(r0)
            r47 = 1
            if (r0 != 0) goto L_0x018f
        L_0x018d:
            r47 = 0
        L_0x018f:
            X.7AG r0 = r2.A0Q
            r61 = 0
            if (r0 == 0) goto L_0x0197
            r61 = 1
        L_0x0197:
            if (r16 == 0) goto L_0x084f
            if (r25 != 0) goto L_0x084f
            if (r24 != 0) goto L_0x084f
            X.77w r8 = X.C3267177w.A00
            java.lang.String r0 = X.C3267177w.A01(r2)
            if (r0 == 0) goto L_0x084f
            X.0Tu r6 = X.0Tu.A05
            r0 = 36327159807097032(0x810f5c000038c8, double:3.036780367515083E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x084f
            X.7AG r0 = r2.A0Q
            if (r0 != 0) goto L_0x0849
            boolean r0 = r2.A1j(r15)
            if (r0 == 0) goto L_0x0842
            r0 = 36328023095851889(0x81102500053b71, double:3.0373263147998394E-306)
        L_0x01c1:
            boolean r84 = X.182.A06(r6, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r84)
            X.0qQ.A0A(r0)
        L_0x01cc:
            X.7AG r0 = r2.A0Q
            r93 = 0
            if (r0 == 0) goto L_0x01d4
            java.lang.String r10 = r0.A06
        L_0x01d4:
            java.lang.String r0 = "imagine_me"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x01eb
            X.0Tu r6 = X.0Tu.A05
            r0 = 36325836957365512(0x810e2800033508, double:3.0359437920181815E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            r85 = 1
            if (r0 != 0) goto L_0x01ed
        L_0x01eb:
            r85 = 0
        L_0x01ed:
            X.7AG r0 = r2.A0Q
            if (r0 == 0) goto L_0x01ff
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            if (r0 == 0) goto L_0x0810
            int r1 = r0.intValue()
            r0 = 1014(0x3f6, float:1.421E-42)
            if (r1 != r0) goto L_0x0810
        L_0x01ff:
            r62 = 0
        L_0x0201:
            boolean r0 = r2.A1j(r15)
            r10 = r0 ^ 1
            if (r10 == 0) goto L_0x0239
            boolean r0 = r9.AFl(r3, r2)
            if (r0 == 0) goto L_0x0239
            r0 = r70
            X.0eM r0 = r0.A0f
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0239
            X.9Gx r0 = X.C376179Gx.MESSAGE_REPORTING
            boolean r0 = r4.A00(r0)
            if (r0 == 0) goto L_0x0239
            if (r61 != 0) goto L_0x0239
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            boolean r0 = X.AnonymousClass48O.A06(r0)
            if (r0 != 0) goto L_0x0239
            r0 = 1013(0x3f5, float:1.42E-42)
            r49 = 1
            if (r5 != r0) goto L_0x023b
        L_0x0239:
            r49 = 0
        L_0x023b:
            r6 = 29
            if (r10 == 0) goto L_0x026d
            boolean r0 = r9.AFm(r3, r2)
            if (r0 == 0) goto L_0x026d
            if (r61 != 0) goto L_0x026d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            boolean r0 = X.AnonymousClass48O.A06(r0)
            if (r0 != 0) goto L_0x026d
            if (r5 != r6) goto L_0x026d
            X.9Gx r0 = X.C376179Gx.MESSAGE_REPORTING
            boolean r0 = r4.A00(r0)
            if (r0 == 0) goto L_0x026d
            r0 = r70
            X.0eM r0 = r0.A0f
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r88 = 1
            if (r0 != 0) goto L_0x026f
        L_0x026d:
            r88 = 0
        L_0x026f:
            X.7FK r103 = X.AnonymousClass7FK.A00
            r36 = r3
            r37 = r2
            r38 = r9
            r39 = r5
            r41 = r25
            r42 = r24
            r43 = r16
            r44 = r11
            r46 = r58
            boolean r50 = X.AnonymousClass7FK.A03(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            X.9Gx r0 = X.C376179Gx.MESSAGE_SAVE_MEDIA
            boolean r0 = r4.A00(r0)
            if (r0 == 0) goto L_0x02a7
            boolean r0 = r2.A2P
            if (r0 != 0) goto L_0x02a7
            if (r7 != 0) goto L_0x02a7
            boolean r0 = r9.AFn(r3, r2)
            if (r0 == 0) goto L_0x02a7
            if (r5 != r6) goto L_0x029f
            if (r31 == 0) goto L_0x02a7
        L_0x029f:
            r51 = 1
            r1 = r35
            r0 = r23
            if (r1 == r0) goto L_0x02a9
        L_0x02a7:
            r51 = 0
        L_0x02a9:
            boolean r0 = r2.A2P
            if (r0 != 0) goto L_0x02c3
            if (r7 == 0) goto L_0x02b5
            boolean r0 = r2.A1j(r15)
            if (r0 == 0) goto L_0x02c3
        L_0x02b5:
            java.lang.String r0 = r9.C1n(r3, r2)
            if (r0 == 0) goto L_0x02c3
            int r0 = r0.length()
            r52 = 1
            if (r0 != 0) goto L_0x02c5
        L_0x02c3:
            r52 = 0
        L_0x02c5:
            if (r20 != 0) goto L_0x02eb
            if (r52 == 0) goto L_0x02eb
            if (r7 != 0) goto L_0x02eb
            boolean r0 = X.DcI.A00(r3)
            if (r0 == 0) goto L_0x02eb
            boolean r0 = r2.A1j(r15)
            if (r0 == 0) goto L_0x02eb
            if (r5 == r6) goto L_0x02eb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            boolean r0 = X.AnonymousClass48O.A06(r1)
            if (r0 != 0) goto L_0x02eb
            boolean r0 = X.AnonymousClass48O.A07(r1)
            r53 = 1
            if (r0 == 0) goto L_0x02ed
        L_0x02eb:
            r53 = 0
        L_0x02ed:
            r0 = r70
            boolean r0 = r0.A1X
            r20 = r0
            r0 = r70
            X.0eM r0 = r0.A12
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            if (r20 != 0) goto L_0x031d
            if (r1 == 0) goto L_0x031d
            boolean r0 = r2.A1k(r15)
            if (r0 == 0) goto L_0x031d
            boolean r0 = r9.CVT(r3, r2)
            if (r0 == 0) goto L_0x031d
            X.9Gx r0 = X.C376179Gx.PSEUDO_USE_DIRECT_MESSAGE_WHEN_SENDING_INLINE_LIKE
            boolean r0 = r4.A00(r0)
            if (r0 == 0) goto L_0x031d
            r55 = 1
            if (r5 != r6) goto L_0x033b
        L_0x031d:
            r55 = 0
            if (r1 == 0) goto L_0x033b
            if (r20 != 0) goto L_0x033b
            if (r19 != 0) goto L_0x033b
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r2.A13
            if (r0 != 0) goto L_0x033b
            boolean r0 = r9.AFY(r2)
            if (r0 == 0) goto L_0x033b
            X.9Gx r0 = X.C376179Gx.PSEUDO_USE_DIRECT_MESSAGE_WHEN_SENDING_INLINE_LIKE
            boolean r0 = r4.A00(r0)
            if (r0 == 0) goto L_0x033b
            r54 = 1
            if (r5 != r6) goto L_0x033d
        L_0x033b:
            r54 = 0
        L_0x033d:
            X.9Gx r0 = X.C376179Gx.MESSAGE_REPLY
            boolean r0 = r4.A00(r0)
            if (r0 == 0) goto L_0x035d
            boolean r0 = r9.AFk(r3, r2)
            if (r0 == 0) goto L_0x035d
            if (r19 != 0) goto L_0x035d
            if (r16 == 0) goto L_0x035d
            if (r11 == 0) goto L_0x07f6
            X.2FW r1 = r2.A10
            X.2FW r0 = X.2FW.A0q
            if (r1 != r0) goto L_0x07f6
            boolean r0 = r2.A1V()
            if (r0 != 0) goto L_0x07f6
        L_0x035d:
            r45 = 0
        L_0x035f:
            if (r7 != 0) goto L_0x0383
            if (r28 != 0) goto L_0x0383
            if (r34 != 0) goto L_0x0383
            if (r33 != 0) goto L_0x0383
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r2.A13
            if (r0 != 0) goto L_0x0383
            boolean r0 = X.AnonymousClass7FM.A01(r3, r2)
            if (r0 == 0) goto L_0x0383
            X.9HW r4 = X.AnonymousClass9HV.A00(r3)
            r1 = 46
            r0 = r64
            boolean r0 = r4.A00(r0, r1)
            if (r0 == 0) goto L_0x0383
            r46 = 1
            if (r31 != 0) goto L_0x0385
        L_0x0383:
            r46 = 0
        L_0x0385:
            boolean r0 = r2.A1j(r15)
            if (r0 != 0) goto L_0x03a3
            X.9HW r4 = X.AnonymousClass9HV.A00(r3)
            r1 = 9
            r0 = r64
            boolean r0 = r4.A00(r0, r1)
            if (r0 == 0) goto L_0x03a3
            if (r28 != 0) goto L_0x039f
            if (r34 == 0) goto L_0x03a3
            if (r29 == 0) goto L_0x03a3
        L_0x039f:
            r56 = 1
            if (r16 != 0) goto L_0x03a5
        L_0x03a3:
            r56 = 0
        L_0x03a5:
            X.2FW r1 = r2.A10
            X.2FW r0 = X.2FW.A0q
            if (r1 != r0) goto L_0x07f2
            if (r7 == 0) goto L_0x03c1
            boolean r0 = r2.A1S()
            if (r0 == 0) goto L_0x03c1
            X.0Tu r4 = X.0Tu.A05
            r0 = 36320519788438038(0x810952000c2216, double:3.032581192977926E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            r4 = 1
            if (r0 == 0) goto L_0x03c2
        L_0x03c1:
            r4 = 0
        L_0x03c2:
            X.0t1 r0 = X.0eE.A00(r3)
            com.instagram.user.model.User r0 = r0.A00()
            boolean r0 = r2.A1j(r0)
            if (r0 == 0) goto L_0x03da
            java.lang.Integer r1 = r2.A1F
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 != r0) goto L_0x03da
            r57 = 1
            if (r4 == 0) goto L_0x03dc
        L_0x03da:
            r57 = 0
        L_0x03dc:
            boolean r0 = X.2R8.A00(r3)
            r59 = 1
            if (r0 != 0) goto L_0x03e6
        L_0x03e4:
            r59 = 0
        L_0x03e6:
            java.lang.Object r1 = r2.A1T
            boolean r0 = r1 instanceof X.AnonymousClass7FN
            if (r0 == 0) goto L_0x03f0
            X.7FN r1 = (X.AnonymousClass7FN) r1
            X.53G r1 = r1.A03
        L_0x03f0:
            boolean r0 = r1 instanceof X.AnonymousClass53H
            if (r0 == 0) goto L_0x07ef
            X.53H r1 = (X.AnonymousClass53H) r1
        L_0x03f6:
            java.lang.String r36 = ""
            if (r1 == 0) goto L_0x07e7
            com.instagram.model.direct.gifs.DirectAnimatedMediaUser r4 = r1.CCc()
            if (r4 == 0) goto L_0x07e7
            java.lang.String r0 = r4.A00
            r33 = r0
            int r0 = r33.length()
            if (r0 <= 0) goto L_0x07e7
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x07e7
            if (r5 == r6) goto L_0x07e7
            if (r12 != 0) goto L_0x07e7
            boolean r63 = r1.CcW()
            r60 = 1
        L_0x0418:
            boolean r0 = r2.A1R()
            if (r0 == 0) goto L_0x078a
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
        L_0x0420:
            int r0 = r4.intValue()
            switch(r0) {
                case 0: goto L_0x0776;
                case 1: goto L_0x0776;
                case 2: goto L_0x0780;
                case 3: goto L_0x076e;
                case 4: goto L_0x076e;
                case 5: goto L_0x076e;
                default: goto L_0x0427;
            }
        L_0x0427:
            r13 = r36
        L_0x0429:
            X.2FW r1 = r2.A10
            X.2FW r0 = X.2FW.A1d
            if (r1 != r0) goto L_0x076a
            com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem r0 = r2.A15
            if (r0 == 0) goto L_0x076a
            java.lang.String r0 = r0.A0A
            r29 = r0
            if (r0 == 0) goto L_0x044f
            if (r16 == 0) goto L_0x044f
            if (r19 != 0) goto L_0x044f
            r0 = r70
            X.0eM r0 = r0.A0F
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r89 = 1
            if (r0 != 0) goto L_0x0451
        L_0x044f:
            r89 = 0
        L_0x0451:
            if (r32 != 0) goto L_0x0467
            r37 = r3
            r38 = r27
            r39 = r2
            r40 = r5
            r41 = r16
            r42 = r58
            boolean r0 = X.AnonymousClass7FK.A01(r37, r38, r39, r40, r41, r42)
            r66 = 1
            if (r0 != 0) goto L_0x047f
        L_0x0467:
            r66 = 0
            if (r32 == 0) goto L_0x047f
            r37 = r3
            r38 = r27
            r39 = r2
            r40 = r5
            r41 = r16
            r42 = r58
            boolean r0 = X.AnonymousClass7FK.A01(r37, r38, r39, r40, r41, r42)
            r67 = 1
            if (r0 != 0) goto L_0x0481
        L_0x047f:
            r67 = 0
        L_0x0481:
            if (r7 != 0) goto L_0x0497
            r73 = r3
            r74 = r2
            r75 = r9
            r77 = r48
            r78 = r5
            r79 = r31
            boolean r0 = X.AnonymousClass7FO.A00(r73, r74, r75, r76, r77, r78, r79)
            r65 = 1
            if (r0 != 0) goto L_0x049b
        L_0x0497:
            r65 = 0
            if (r7 != 0) goto L_0x04a3
        L_0x049b:
            boolean r0 = r9.AFO(r2)
            r68 = 1
            if (r0 != 0) goto L_0x04a5
        L_0x04a3:
            r68 = 0
        L_0x04a5:
            if (r47 == 0) goto L_0x0766
            if (r65 == 0) goto L_0x0766
            if (r5 != r6) goto L_0x04b8
            X.0Tu r6 = X.0Tu.A05
            r0 = 36319342967397522(0x810840000c1c92, double:3.031836966613226E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 != 0) goto L_0x04d4
        L_0x04b8:
            X.7AG r0 = r2.A0Q
            if (r0 == 0) goto L_0x0766
            java.lang.String r1 = X.C3262475z.A00(r3)
            java.lang.String r0 = r2.A1u
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0752
            java.lang.Boolean r0 = X.C70306O1k.A00(r3)
            boolean r1 = r0.booleanValue()
        L_0x04d2:
            if (r1 == 0) goto L_0x0766
        L_0x04d4:
            r48 = 1
        L_0x04d6:
            X.2FW r1 = r2.A10
            X.2FW r0 = X.2FW.A1q
            if (r1 != r0) goto L_0x04eb
            if (r10 == 0) goto L_0x04eb
            X.2jG r0 = new X.2jG
            r0.<init>(r3)
            boolean r0 = r0.A00()
            r91 = 1
            if (r0 != 0) goto L_0x04ed
        L_0x04eb:
            r91 = 0
        L_0x04ed:
            r74 = 1
            r0 = 29
            if (r5 != r0) goto L_0x073e
            boolean r0 = X.C66839MdX.A00(r3, r2)
            if (r0 == 0) goto L_0x074e
            boolean r0 = X.AnonymousClass79U.A01(r3, r2)
            if (r0 != 0) goto L_0x0501
            if (r30 == 0) goto L_0x074e
        L_0x0501:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r14 != r0) goto L_0x074e
            X.0Tu r6 = X.0Tu.A05
            r0 = 36319407392234791(0x81084f00111d27, double:3.031877709139733E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x074e
        L_0x0512:
            if (r74 == 0) goto L_0x0553
            r0 = 29
            if (r5 == r0) goto L_0x0553
            java.lang.Boolean r0 = X.AnonymousClass78L.A00(r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0553
            X.0Tu r6 = X.0Tu.A05
            r0 = 36328186304412727(0x81104b00023c37, double:3.0374295285509015E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x0553
            X.1Av r0 = X.1Au.A00(r3)
            X.0xa r6 = r0.A01
            java.lang.String r1 = "direct_message_translation_badge_nux_seen_count"
            r0 = r21
            int r1 = r6.getInt(r1, r0)
            r0 = r23
            if (r1 >= r0) goto L_0x0553
            X.1Av r0 = X.1Au.A00(r3)
            X.0xa r6 = r0.A01
            java.lang.String r1 = "direct_message_translation_nux_accepted"
            r0 = r21
            boolean r0 = r6.getBoolean(r1, r0)
            r75 = 1
            if (r0 == 0) goto L_0x0555
        L_0x0553:
            r75 = 0
        L_0x0555:
            r0 = 29
            if (r5 != r0) goto L_0x057a
            boolean r0 = X.C66839MdX.A00(r3, r2)
            if (r0 == 0) goto L_0x057a
            boolean r0 = X.AnonymousClass79U.A01(r3, r2)
            if (r0 != 0) goto L_0x0567
            if (r30 == 0) goto L_0x057a
        L_0x0567:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r14 != r0) goto L_0x057a
            X.0Tu r6 = X.0Tu.A05
            r0 = 36319407392234791(0x81084f00111d27, double:3.031877709139733E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            r76 = 1
            if (r0 != 0) goto L_0x057c
        L_0x057a:
            r76 = 0
        L_0x057c:
            r77 = 1
            r1 = 29
            if (r5 == r1) goto L_0x0596
            boolean r0 = X.AnonymousClass7CY.A01(r3, r2, r5)
            if (r0 == 0) goto L_0x0596
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r14 != r0) goto L_0x0596
            if (r27 == 0) goto L_0x0725
            boolean r6 = r27.A01()
            r0 = r26
            if (r6 != r0) goto L_0x0725
        L_0x0596:
            r77 = 0
        L_0x0598:
            r0 = r27
            boolean r0 = X.AnonymousClass7FK.A02(r3, r0, r2, r14, r5)
            if (r0 == 0) goto L_0x05a8
            boolean r0 = X.AnonymousClass79U.A03(r2)
            r78 = 1
            if (r0 != 0) goto L_0x05aa
        L_0x05a8:
            r78 = 0
        L_0x05aa:
            r79 = 0
            if (r5 != r1) goto L_0x05fd
            if (r28 == 0) goto L_0x05fd
            java.lang.String r1 = r3.A06
            java.lang.String r0 = r2.BsI()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x05fd
            X.2FW r1 = r2.A10
            com.google.common.collect.ImmutableSet r0 = X.2FW.A05
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x05fd
            boolean r0 = r2.A2F
            if (r0 != 0) goto L_0x05fd
            X.3tI r0 = r2.A0P()
            if (r0 != 0) goto L_0x05fd
            com.google.common.collect.ImmutableList r1 = r2.A0H()
            if (r1 == 0) goto L_0x05ec
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x05ec
            r0 = r21
            java.lang.Object r0 = X.00k.A0O(r1, r0)
            X.3tC r0 = (X.C254873tC) r0
            if (r0 == 0) goto L_0x05fd
            int r1 = r0.A02
            r0 = 9
            if (r1 != r0) goto L_0x05fd
        L_0x05ec:
            boolean r0 = X.C347037wA.A05(r3)
            if (r0 == 0) goto L_0x06ee
            X.0Tu r6 = X.0Tu.A05
            r0 = 36319407392824624(0x81084f001a1d30, double:3.0318777095127456E-306)
            boolean r79 = X.182.A06(r6, r3, r0)
        L_0x05fd:
            r104 = r3
            r105 = r70
            r106 = r27
            r107 = r2
            r108 = r64
            r109 = r5
            r110 = r19
            r111 = r25
            r112 = r24
            r113 = r68
            boolean r73 = r103.A05(r104, r105, r106, r107, r108, r109, r110, r111, r112, r113)
            r1 = 43
            X.Ply r0 = new X.Ply
            r0.<init>(r3, r1)
            java.lang.Class<X.7FP> r1 = X.AnonymousClass7FP.class
            java.lang.Object r1 = r3.A01(r1, r0)
            X.7FP r1 = (X.AnonymousClass7FP) r1
            r0 = r69
            boolean r0 = X.AnonymousClass7FP.A00(r1, r2, r0)
            if (r0 == 0) goto L_0x063d
            com.instagram.common.session.UserSession r7 = r1.A00
            X.0Tu r6 = X.0Tu.A05
            r0 = 36325579259262013(0x810dec0002343d, double:3.035780822699862E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            r58 = 1
            if (r0 != 0) goto L_0x063f
        L_0x063d:
            r58 = 0
        L_0x063f:
            if (r17 == 0) goto L_0x0643
            if (r18 != 0) goto L_0x0651
        L_0x0643:
            r0 = 1014(0x3f6, float:1.421E-42)
            if (r5 != r0) goto L_0x06eb
            java.lang.String r1 = r3.A06
            r0 = r22
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x06eb
        L_0x0651:
            r6 = 1
        L_0x0652:
            X.2FW r1 = r2.A10
            X.2FW r0 = X.2FW.A1g
            if (r1 != r0) goto L_0x065c
            r82 = 1
            if (r6 != 0) goto L_0x065e
        L_0x065c:
            r82 = 0
        L_0x065e:
            boolean r0 = r9.AG3(r2)
            if (r0 == 0) goto L_0x0672
            java.lang.String r1 = r3.A06
            java.lang.String r0 = r2.BsI()
            boolean r0 = X.0qQ.A0K(r1, r0)
            r86 = 1
            if (r0 != 0) goto L_0x0674
        L_0x0672:
            r86 = 0
        L_0x0674:
            boolean r87 = r9.AFp(r2)
            X.2FW r1 = r2.A10
            X.2FW r0 = X.2FW.A0y
            if (r1 != r0) goto L_0x08ac
            com.google.common.collect.ImmutableList r1 = r2.A0H()
            if (r1 == 0) goto L_0x08ac
            r0 = r21
            java.lang.Object r0 = r1.get(r0)
            X.3tC r0 = (X.C254873tC) r0
            if (r0 == 0) goto L_0x08ac
            com.google.common.collect.ImmutableList r0 = r0.A01()
            if (r0 == 0) goto L_0x08ac
            X.3kO r14 = r0.iterator()
            X.0qQ.A07(r14)
            r6 = r93
        L_0x069d:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x08ae
            java.lang.Object r1 = r14.next()
            X.9JN r1 = (X.AnonymousClass9JN) r1
            java.lang.String r7 = r1.A05
            java.lang.String r0 = "xma_long_press_action"
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 == 0) goto L_0x069d
            if (r6 != 0) goto L_0x06ba
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x06ba:
            java.lang.String r0 = r1.A04
            r18 = r0
            java.lang.String r12 = r1.A02
            java.lang.Object r1 = r1.A00
            java.lang.Number r1 = (java.lang.Number) r1
            X.9sT[] r8 = X.C391179sT.values()
            int r11 = r8.length
            r0 = 0
        L_0x06ca:
            r7 = 0
            if (r0 >= r11) goto L_0x06db
            r7 = r8[r0]
            int r10 = r7.A00
            if (r1 == 0) goto L_0x06e8
            int r9 = r1.intValue()
            if (r10 != r9) goto L_0x06e8
            java.lang.Integer r7 = r7.A01
        L_0x06db:
            r8 = 22
            X.JV7 r1 = new X.JV7
            r0 = r18
            r1.<init>((java.lang.Integer) r7, (java.lang.String) r0, (java.lang.String) r12, (int) r8)
            r6.add(r1)
            goto L_0x069d
        L_0x06e8:
            int r0 = r0 + 1
            goto L_0x06ca
        L_0x06eb:
            r6 = 0
            goto L_0x0652
        L_0x06ee:
            com.instagram.brandedcontent.repository.BrandedContentSettingsRepository r0 = X.C63091KrK.A00(r3)
            X.0Ud r0 = r0.A0D
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            X.LcF r1 = X.C64456LcF.A00
            java.lang.Object r0 = X.AnonymousClass3S1.A00(r1, r0)
            X.4lA r0 = (X.C272664lA) r0
            if (r0 == 0) goto L_0x05fd
            com.instagram.api.schemas.MonetizationEligibilityDecision r0 = r0.A05
            if (r0 == 0) goto L_0x05fd
            com.instagram.api.schemas.MonetizationEligibilityDecision r1 = com.instagram.api.schemas.MonetizationEligibilityDecision.ELIGIBLE
            if (r0 == r1) goto L_0x0714
            com.instagram.api.schemas.MonetizationEligibilityDecision r1 = com.instagram.api.schemas.MonetizationEligibilityDecision.AT_RISK_OF_BECOMING_INELIGIBLE
            if (r0 == r1) goto L_0x0714
            com.instagram.api.schemas.MonetizationEligibilityDecision r1 = com.instagram.api.schemas.MonetizationEligibilityDecision.ELIGIBLE_PENDING_OPT_IN
            if (r0 != r1) goto L_0x05fd
        L_0x0714:
            X.0Tu r6 = X.0Tu.A05
            r0 = 36319407392824624(0x81084f001a1d30, double:3.0318777095127456E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x05fd
            r79 = 1
            goto L_0x05fd
        L_0x0725:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            boolean r0 = X.AnonymousClass48O.A06(r0)
            if (r0 != 0) goto L_0x0596
            X.0Tu r0 = X.0Tu.A05
            r6 = 36328186304281654(0x81104b00003c36, double:3.0374295284680104E-306)
            boolean r0 = X.182.A06(r0, r3, r6)
            if (r0 == 0) goto L_0x0596
            goto L_0x0598
        L_0x073e:
            r0 = r27
            boolean r0 = X.AnonymousClass7FK.A02(r3, r0, r2, r14, r5)
            if (r0 == 0) goto L_0x074e
            boolean r0 = X.AnonymousClass79U.A03(r2)
            if (r0 != 0) goto L_0x074e
            goto L_0x0512
        L_0x074e:
            r74 = 0
            goto L_0x0512
        L_0x0752:
            X.0Tu r6 = X.0Tu.A05
            r0 = 36325613619655769(0x810df4000c3459, double:3.035802552351231E-306)
            boolean r1 = X.182.A06(r6, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.0qQ.A0A(r0)
            goto L_0x04d2
        L_0x0766:
            r48 = 0
            goto L_0x04d6
        L_0x076a:
            r29 = r93
            goto L_0x044f
        L_0x076e:
            java.lang.String r13 = r2.A0e()
            if (r13 != 0) goto L_0x0429
            goto L_0x0427
        L_0x0776:
            if (r1 == 0) goto L_0x0427
            java.lang.String r13 = r1.getId()
            if (r13 != 0) goto L_0x0429
            goto L_0x0427
        L_0x0780:
            com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem r0 = r2.A15
            if (r0 == 0) goto L_0x0427
            java.lang.String r13 = r0.A07
            if (r13 != 0) goto L_0x0429
            goto L_0x0427
        L_0x078a:
            java.lang.String r8 = r2.A0e()
            if (r8 == 0) goto L_0x07a1
            java.lang.String r4 = "cutout_"
            r0 = r26
            X.0qQ.A0B(r4, r0)
            boolean r0 = r8.startsWith(r4)
            if (r0 == 0) goto L_0x07a1
            java.lang.Integer r4 = X.AnonymousClass05K.A0j
            goto L_0x0420
        L_0x07a1:
            if (r1 == 0) goto L_0x07cd
            boolean r4 = r1.CcW()
            r0 = r26
            if (r4 != r0) goto L_0x07af
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            goto L_0x0420
        L_0x07af:
            java.lang.String r0 = r1.getId()
            if (r0 == 0) goto L_0x07cd
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x07cd
            java.lang.Boolean r4 = r1.COc()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r26)
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 != 0) goto L_0x07cd
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            goto L_0x0420
        L_0x07cd:
            X.2FW r0 = r2.A10
            X.2FW r4 = X.2FW.A0O
            if (r0 == r4) goto L_0x07e3
            X.2FW r4 = X.2FW.A0J
            if (r0 == r4) goto L_0x07e3
            X.2FW r4 = X.2FW.A1d
            if (r0 != r4) goto L_0x07df
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            goto L_0x0420
        L_0x07df:
            java.lang.Integer r4 = X.AnonymousClass05K.A0u
            goto L_0x0420
        L_0x07e3:
            java.lang.Integer r4 = X.AnonymousClass05K.A0Y
            goto L_0x0420
        L_0x07e7:
            r33 = r36
            r60 = 0
            r63 = 0
            goto L_0x0418
        L_0x07ef:
            r1 = 0
            goto L_0x03f6
        L_0x07f2:
            r57 = 0
            goto L_0x03e4
        L_0x07f6:
            boolean r0 = r2.A2P
            if (r0 != 0) goto L_0x035d
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r2.A13
            if (r0 != 0) goto L_0x035d
            if (r13 == 0) goto L_0x035d
            java.lang.String r0 = r2.A0g()
            if (r0 == 0) goto L_0x035d
            boolean r0 = r2.A1P()
            r45 = 1
            if (r0 == 0) goto L_0x035f
            goto L_0x035d
        L_0x0810:
            X.7AG r0 = r2.A0Q
            if (r0 == 0) goto L_0x083f
            java.lang.String r1 = r0.A06
        L_0x0816:
            java.lang.String r0 = "imagine"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x01ff
            X.0Tu r6 = X.0Tu.A05
            r0 = 36327159807686865(0x810f5c000938d1, double:3.036780367888096E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 != 0) goto L_0x083b
            r0 = r70
            X.0eM r0 = r0.A14
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01ff
        L_0x083b:
            r62 = 1
            goto L_0x0201
        L_0x083f:
            r1 = r93
            goto L_0x0816
        L_0x0842:
            r0 = 36328023095786352(0x81102500043b70, double:3.0373263147583936E-306)
            goto L_0x01c1
        L_0x0849:
            boolean r84 = r8.A04(r2)
            goto L_0x01cc
        L_0x084f:
            r84 = 0
            goto L_0x01cc
        L_0x0853:
            r0 = r19
            boolean r0 = X.C308556Us.A0W(r6, r1, r11, r8, r0)
            if (r0 == 0) goto L_0x0876
            r0 = r27
            boolean r0 = X.C308556Us.A0H(r3, r0)
            if (r0 == 0) goto L_0x0876
            if (r115 == 0) goto L_0x087a
            if (r12 == 0) goto L_0x016a
            X.0Tu r6 = X.0Tu.A05
            r0 = 36321516220065259(0x810a3a000025eb, double:3.033211340351289E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x087a
            goto L_0x016a
        L_0x0876:
            if (r7 != 0) goto L_0x087a
            goto L_0x016a
        L_0x087a:
            r13 = 0
            goto L_0x016b
        L_0x087d:
            java.util.Iterator r6 = r1.iterator()
        L_0x0881:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0120
            java.lang.Object r0 = r6.next()
            X.OHR r0 = (X.OHR) r0
            java.lang.String r1 = r0.A02
            java.lang.String r0 = r2.A0h()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0881
            r32 = 1
            goto L_0x0122
        L_0x089d:
            r32 = 0
            goto L_0x0122
        L_0x08a1:
            r22 = r10
            goto L_0x0110
        L_0x08a5:
            r18 = 0
            goto L_0x0102
        L_0x08a9:
            r6 = r10
            goto L_0x00f2
        L_0x08ac:
            r6 = r93
        L_0x08ae:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r64 = 0
            if (r4 != r0) goto L_0x08b6
            r64 = 1
        L_0x08b6:
            X.9N0 r40 = new X.9N0
            r8 = r40
            r9 = r3
            r10 = r2
            r11 = r70
            r12 = r4
            r14 = r23
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.9N0 r41 = new X.9N0
            r108 = r41
            r109 = r3
            r110 = r2
            r111 = r11
            r112 = r4
            r113 = r13
            r108.<init>(r109, r110, r111, r112, r113, r114)
            X.7FQ r42 = new X.7FQ
            r103 = r42
            r108 = r15
            r109 = r5
            r110 = r16
            r111 = r69
            r112 = r19
            r113 = r25
            r114 = r24
            r103.<init>(r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115)
            r8 = 18
            X.9MP r43 = new X.9MP
            r7 = r43
            r9 = r71
            r10 = r3
            r11 = r2
            r12 = r69
            r7.<init>(r8, r9, r10, r11, r12)
            java.lang.String r0 = r2.A1o
            if (r0 == 0) goto L_0x0904
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0905
        L_0x0904:
            r0 = 1
        L_0x0905:
            r1 = r0 ^ 1
            boolean r0 = r2.A1S()
            r69 = 0
            if (r0 == 0) goto L_0x0911
            r69 = r1
        L_0x0911:
            boolean r10 = r2.A2K
            java.util.List r0 = r2.A2B
            r71 = 0
            if (r0 == 0) goto L_0x091b
            r71 = 1
        L_0x091b:
            X.53G r0 = r2.A12
            if (r0 == 0) goto L_0x0a1e
            X.9IE r0 = r0.A00
            if (r0 == 0) goto L_0x0a1e
            java.lang.Object r7 = r0.A00
            com.instagram.model.mediasize.GifUrlImpl r7 = (com.instagram.model.mediasize.GifUrlImpl) r7
        L_0x0927:
            com.instagram.direct.model.comments.DirectMessageComments r0 = r2.A0q
            if (r0 == 0) goto L_0x0a1a
            java.lang.String r9 = r0.A01
        L_0x092d:
            java.util.LinkedHashMap r0 = r2.A1z
            if (r0 == 0) goto L_0x0935
            java.lang.String r36 = r0.toString()
        L_0x0935:
            if (r17 == 0) goto L_0x0946
            X.0Tu r8 = X.0Tu.A05
            r0 = 36323736718355894(0x810c3f00032db6, double:3.0346155924115154E-306)
            boolean r0 = X.182.A06(r8, r3, r0)
            r80 = 1
            if (r0 != 0) goto L_0x0948
        L_0x0946:
            r80 = 0
        L_0x0948:
            if (r6 == 0) goto L_0x0a16
            X.62P r39 = X.AnonymousClass62Q.A00(r6)
        L_0x094e:
            X.7AG r0 = r2.A0Q
            if (r0 == 0) goto L_0x0a12
            java.lang.String r8 = r0.A09
        L_0x0954:
            java.lang.String r6 = r2.A0e()
            r90 = 0
            if (r6 == 0) goto L_0x0967
            java.lang.String r1 = "cutout_"
            r0 = r26
            X.0qQ.A0B(r1, r0)
            boolean r90 = r6.startsWith(r1)
        L_0x0967:
            X.2FW r1 = r2.A10
            X.2FW r0 = X.2FW.A1A
            r92 = 0
            if (r1 != r0) goto L_0x0971
            r92 = 1
        L_0x0971:
            X.7FR r30 = new X.7FR
            r31 = r7
            r32 = r4
            r34 = r13
            r35 = r9
            r37 = r8
            r38 = r29
            r44 = r20
            r70 = r10
            r81 = r26
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92)
            X.0t1 r0 = X.0eE.A00(r3)
            com.instagram.user.model.User r4 = r0.A00()
            boolean r9 = X.AnonymousClass48O.A03(r5)
            X.7Pi r1 = X.C331077Pk.A02
            r0 = r27
            boolean r0 = r1.A03(r3, r0)
            boolean r8 = X.AnonymousClass7FS.A01(r3, r5, r0)
            boolean r104 = r2.A1k(r4)
            java.lang.String r1 = r2.A0h()
            java.lang.String r0 = r2.A0f()
            com.instagram.model.direct.messageid.MessageIdentifier r6 = new com.instagram.model.direct.messageid.MessageIdentifier
            r6.<init>(r1, r0)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r0 = r2.C7c()
            long r100 = r7.toMillis(r0)
            boolean r103 = r2.A1P()
            r105 = 0
            if (r8 != 0) goto L_0x09cf
            if (r104 != 0) goto L_0x09cd
            java.lang.String r0 = r2.A0p(r4)
            r104 = 0
            if (r0 == 0) goto L_0x09cf
        L_0x09cd:
            r104 = 1
        L_0x09cf:
            if (r9 == 0) goto L_0x0a0d
            java.util.ArrayList r99 = r2.A0q()
        L_0x09d5:
            boolean r0 = r2.A1j(r4)
            if (r0 != 0) goto L_0x09f9
            X.17i r1 = X.17h.A00(r3)
            java.lang.String r0 = r2.A1u
            com.instagram.user.model.User r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0a0b
            X.4Cl r0 = r0.A03
            java.lang.String r1 = r0.AaZ()
        L_0x09ed:
            java.lang.String r0 = r3.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x09fb
            r0 = 1013(0x3f5, float:1.42E-42)
            if (r5 == r0) goto L_0x09fb
        L_0x09f9:
            r105 = 1
        L_0x09fb:
            boolean r0 = r2.A2P
            X.7FT r92 = new X.7FT
            r94 = r30
            r97 = r6
            r98 = r93
            r106 = r0
            r92.<init>(r93, r94, r95, r96, r97, r98, r99, r100, r102, r103, r104, r105, r106)
            return r92
        L_0x0a0b:
            r1 = 0
            goto L_0x09ed
        L_0x0a0d:
            java.util.ArrayList r99 = r2.A0r(r4)
            goto L_0x09d5
        L_0x0a12:
            r8 = r93
            goto L_0x0954
        L_0x0a16:
            r39 = r93
            goto L_0x094e
        L_0x0a1a:
            r9 = r93
            goto L_0x092d
        L_0x0a1e:
            r7 = r93
            goto L_0x0927
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7FG.A00(android.content.Context, com.instagram.common.session.UserSession, X.9HC, X.7LQ, X.2FW):X.7FT");
    }
}
