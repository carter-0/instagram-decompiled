package X;

import android.content.Context;
import android.graphics.PointF;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ode  reason: case insensitive filesystem */
public abstract class C71136Ode {
    public static final AnonymousClass7FT A00(Context context, AnonymousClass9HC r16, MessagingUser messagingUser, C74552Pwl pwl, 2FW r19, C62320sa r20, int i, boolean z, boolean z2) {
        return A01(context, r16, messagingUser, pwl, r19, r20, i, false, false, false, false, false, z, z2, true);
    }

    public static final AnonymousClass7FE A02(C74541Pwa pwa, AnonymousClass9HC r10, AnonymousClass7L2 r11, MessagingUser messagingUser, C74552Pwl pwl, AnonymousClass0eM r14, int i) {
        0qQ.A0B(r14, 7);
        C74541Pwa pwa2 = pwa;
        return C70101NxH.A00(pwa2, r10, r11, messagingUser, pwl, Boolean.valueOf(C71057Oaa.A00(pwa2, pwl, i)), Boolean.valueOf(C71057Oaa.A01(pwa2, pwl, i)), r14, i);
    }

    public static final C328547Ff A04(C74541Pwa pwa, MessagingUser messagingUser, C74552Pwl pwl, int i) {
        N8N A00;
        N8N A002 = C70100NxG.A00(pwa, pwl, i);
        int i2 = i + 1;
        if (i2 == pwl.getCount()) {
            A00 = null;
        } else {
            A00 = C70100NxG.A00(pwa, pwl, i2);
        }
        int A003 = C328487Ez.A00(messagingUser, A002, A00, C327657Br.A00().A01(OZ6.A00(pwa, pwl, i)), false, true);
        if (A003 == 0) {
            return new AnonymousClass7G5(new MessagingUser((IGAIAgentType) null, Long.valueOf(pwl.BsH(i)), pwl.BsK(i), 0, true), pwl.BsM(i));
        } else if (A003 != 4) {
            return AnonymousClass7GB.A00;
        } else {
            return C328537Fe.A00;
        }
    }

    public static final 0eP A07(MessagingUser messagingUser, C70464O7p o7p, boolean[] zArr) {
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap A1E2 = AnonymousClass7TE.A1E();
        if (o7p != null) {
            List list = o7p.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((C70702OGx) list.get(i)).A02;
                List list2 = (List) A1E.get(str);
                if (list2 == null) {
                    list2 = AnonymousClass7TE.A1C();
                }
                String valueOf = String.valueOf(((C70702OGx) list.get(i)).A03);
                list2.add(valueOf);
                A1E.put(str, list2);
                String str2 = ((C70702OGx) list.get(i)).A04;
                String str3 = "";
                if (str2 == null) {
                    str2 = str3;
                }
                A1E2.put(valueOf, DbS.A0V(str2));
                String str4 = ((C70702OGx) list.get(i)).A03;
                if (str4 != null) {
                    str3 = str4;
                }
                if (messagingUser.A03(str3)) {
                    zArr[0] = true;
                }
            }
        }
        return AnonymousClass7TE.A1L(A1E, A1E2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00d4, code lost:
        if (r1.Bmb(r0) != null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00f1, code lost:
        if (r84 != false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0101, code lost:
        if (r2.A00(X.C376179Gx.MESSAGE_FORWARDING) == false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0111, code lost:
        if (r2.A00(X.C376179Gx.MESSAGE_REPORTING) == false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0123, code lost:
        if (r9 != false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0137, code lost:
        if (r8 == false) goto L_0x0139;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass7FT A01(android.content.Context r75, X.AnonymousClass9HC r76, com.instagram.direct.model.messaginguser.MessagingUser r77, X.C74552Pwl r78, X.2FW r79, X.C62320sa r80, int r81, boolean r82, boolean r83, boolean r84, boolean r85, boolean r86, boolean r87, boolean r88, boolean r89) {
        /*
            r22 = 0
            r7 = r76
            r6 = r77
            r1 = r78
            r5 = r79
            r0 = r81
            if (r86 == 0) goto L_0x0098
            r9 = 0
            java.lang.String r11 = ""
            X.7FR r8 = new X.7FR
            r10 = r9
            r12 = r11
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r19 = r9
            r20 = r9
            r21 = r9
            r23 = r22
            r24 = r22
            r25 = r22
            r26 = r22
            r27 = r22
            r28 = r22
            r29 = r22
            r30 = r22
            r31 = r22
            r32 = r22
            r33 = r22
            r34 = r22
            r35 = r22
            r36 = r22
            r37 = r22
            r38 = r22
            r39 = r22
            r40 = r22
            r41 = r22
            r42 = r22
            r43 = r22
            r44 = r22
            r45 = r22
            r46 = r22
            r47 = r22
            r48 = r22
            r49 = r22
            r50 = r22
            r51 = r22
            r52 = r22
            r53 = r22
            r54 = r22
            r55 = r22
            r56 = r22
            r57 = r22
            r58 = r22
            r59 = r22
            r60 = r22
            r61 = r22
            r62 = r22
            r63 = r22
            r64 = r22
            r65 = r22
            r66 = r22
            r67 = r22
            r68 = r22
            r69 = r22
            r70 = r22
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)
        L_0x0087:
            r81 = r8
            r80 = r7
            r82 = r6
            r83 = r1
            r84 = r5
            r85 = r0
            X.7FT r0 = X.C70099NxF.A00(r80, r81, r82, r83, r84, r85, r86, r87)
            return r0
        L_0x0098:
            boolean r19 = X.C74552Pwl.A02(r6, r1, r0)
            X.7Fa r4 = X.C71095OcV.A00(r1, r0)
            long r16 = X.C74552Pwl.A00(r1, r0)
            java.lang.Long r14 = r1.BS9(r0)
            java.lang.Integer r2 = r1.CFk(r0)
            if (r2 == 0) goto L_0x01c9
            int r3 = r2.intValue()
            r2 = 10
            if (r3 != r2) goto L_0x01b9
            X.4k3 r11 = X.C272074k3.RAVEN_OPENED
        L_0x00b8:
            java.lang.Integer r13 = r1.CFl(r0)
            int r15 = r1.Azt(r0)
            java.lang.String r2 = r1.Bmb(r0)
            boolean r9 = X.AnonymousClass7TF.A1V(r2)
            java.lang.String r2 = r1.CH3(r0)
            if (r2 != 0) goto L_0x00d6
            java.lang.String r2 = r1.Bmb(r0)
            r62 = 0
            if (r2 == 0) goto L_0x00d8
        L_0x00d6:
            r62 = 1
        L_0x00d8:
            r2 = 8
            X.0qQ.A0B(r4, r2)
            com.instagram.direct.capabilities.Capabilities r2 = r7.A01
            X.7Fa r3 = X.C328497Fa.SENT
            boolean r8 = X.AnonymousClass7TF.A1W(r4, r3)
            X.9Gx r3 = X.C376179Gx.REACTIONS
            boolean r37 = r2.A00(r3)
            if (r19 == 0) goto L_0x00ef
            if (r8 == 0) goto L_0x00f3
        L_0x00ef:
            r38 = 1
            if (r84 != 0) goto L_0x00f5
        L_0x00f3:
            r38 = 0
        L_0x00f5:
            if (r85 == 0) goto L_0x0103
            if (r87 == 0) goto L_0x0103
            X.9Gx r3 = X.C376179Gx.MESSAGE_FORWARDING
            boolean r3 = r2.A00(r3)
            r40 = 1
            if (r3 != 0) goto L_0x0105
        L_0x0103:
            r40 = 0
        L_0x0105:
            if (r89 == 0) goto L_0x0113
            if (r19 != 0) goto L_0x0113
            X.9Gx r3 = X.C376179Gx.MESSAGE_REPORTING
            boolean r3 = r2.A00(r3)
            r42 = 1
            if (r3 != 0) goto L_0x0125
        L_0x0113:
            r42 = 0
            if (r19 == 0) goto L_0x0125
            if (r8 == 0) goto L_0x0125
            X.9Gx r3 = X.C376179Gx.MESSAGE_UNSEND
            boolean r2 = r2.A00(r3)
            if (r2 == 0) goto L_0x0125
            r43 = 1
            if (r9 == 0) goto L_0x0127
        L_0x0125:
            r43 = 0
        L_0x0127:
            boolean r44 = X.AnonymousClass7TF.A1P(r82)
            boolean r45 = X.AnonymousClass7TF.A1P(r83)
            X.2FW r2 = X.2FW.A1j
            if (r5 != r2) goto L_0x0139
            if (r19 == 0) goto L_0x0139
            r50 = 1
            if (r8 != 0) goto L_0x013b
        L_0x0139:
            r50 = 0
        L_0x013b:
            r24 = 0
            X.Pht r36 = new X.Pht
            r9 = r75
            r18 = r88
            r8 = r36
            r10 = r4
            r12 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r18, r19)
            java.lang.String r26 = ""
            X.7FR r8 = new X.7FR
            r35 = r80
            r23 = r8
            r25 = r24
            r27 = r26
            r28 = r24
            r29 = r24
            r30 = r24
            r31 = r24
            r32 = r24
            r33 = r24
            r34 = r24
            r39 = r22
            r41 = r22
            r46 = r22
            r47 = r22
            r48 = r22
            r49 = r22
            r51 = r22
            r52 = r22
            r53 = r22
            r54 = r22
            r55 = r22
            r56 = r22
            r57 = r22
            r58 = r22
            r59 = r22
            r60 = r22
            r61 = r22
            r63 = r22
            r64 = r22
            r65 = r22
            r66 = r22
            r67 = r22
            r68 = r22
            r69 = r22
            r70 = r22
            r71 = r22
            r72 = r22
            r73 = r22
            r74 = r22
            r75 = r22
            r76 = r22
            r77 = r22
            r78 = r22
            r79 = r22
            r80 = r22
            r81 = r22
            r82 = r22
            r83 = r22
            r84 = r22
            r85 = r22
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85)
            goto L_0x0087
        L_0x01b9:
            r2 = 20
            if (r3 != r2) goto L_0x01c1
            X.4k3 r11 = X.C272074k3.RAVEN_REPLAYED
            goto L_0x00b8
        L_0x01c1:
            r2 = 30
            if (r3 != r2) goto L_0x01c9
            X.4k3 r11 = X.C272074k3.RAVEN_SCREENSHOT
            goto L_0x00b8
        L_0x01c9:
            r11 = 0
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71136Ode.A01(android.content.Context, X.9HC, com.instagram.direct.model.messaginguser.MessagingUser, X.Pwl, X.2FW, X.0sa, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):X.7FT");
    }

    public static final String A05(Context context, MessagingUser messagingUser, OMF omf, C74552Pwl pwl, int i) {
        int i2;
        if (OPx.A01(omf)) {
            return pwl.BmW(i);
        }
        Long BmV = pwl.BmV(i);
        if (BmV != null) {
            boolean A01 = messagingUser.A01(BmV.longValue());
            if (C74552Pwl.A02(messagingUser, pwl, i)) {
                i2 = 2131959772;
                if (A01) {
                    i2 = 2131959774;
                }
            } else {
                i2 = 2131959771;
                if (A01) {
                    i2 = 2131959773;
                }
            }
            return context.getString(i2);
        }
        throw DbU.A0h();
    }

    public static final String A06(MessagingUser messagingUser, C74552Pwl pwl, int i) {
        C70464O7p Bjo = pwl.Bjo(i);
        if (Bjo == null) {
            return null;
        }
        List list = Bjo.A00;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (0qQ.A0K(((C70702OGx) list.get(i2)).A03, messagingUser.A03)) {
                return String.valueOf(((C70702OGx) list.get(i2)).A01);
            }
        }
        return null;
    }

    public static final C3266877t A03(Context context, C74541Pwa pwa, UserSession userSession, AnonymousClass9HC r46, AnonymousClass7L2 r47, MessagingUser messagingUser, OMF omf, C74552Pwl pwl, String str, Set set, int i) {
        String str2 = str;
        C74552Pwl pwl2 = pwl;
        int i2 = i;
        MessagingUser messagingUser2 = messagingUser;
        boolean A03 = messagingUser2.A03(String.valueOf(pwl2.BsH(i2)));
        0eP A07 = A07(messagingUser2, pwl2.Bjo(i2), new boolean[]{false});
        UserSession userSession2 = userSession;
        UserSession userSession3 = userSession2;
        C68899Nab A00 = ((C70763OKj) userSession3.A01(C70763OKj.class, new C73897PlY(userSession3, 41))).A00(pwl2, i2);
        AnonymousClass79F r18 = AnonymousClass79F.A00;
        ArrayList A032 = C71095OcV.A03(pwl2.Bjo(i2), pwl2.BsH(i2));
        MessageIdentifier A0i = C66580MXl.A0i(pwl2.BSF(i2), String.valueOf(pwl2.BNc(i2)));
        String A06 = A06(messagingUser2, pwl2, i2);
        OMF omf2 = omf;
        String valueOf = String.valueOf(omf2.A00.mResultSet.getLong(0, 0));
        String str3 = messagingUser2.A03;
        0qQ.A07(str3);
        boolean A01 = OPx.A01(omf2);
        AnonymousClass7L2 r3 = r47;
        C329967Kx r15 = r3.A04;
        2FW r14 = A00.A10;
        0qQ.A07(r14);
        AnonymousClass9HC r35 = r46;
        UserSession userSession4 = userSession2;
        AnonymousClass9HC r21 = r35;
        C329967Kx r22 = r15;
        2FW r23 = r14;
        AnonymousClass79G A033 = r18.A03((PointF) null, userSession4, r21, r22, r23, A0i, Long.valueOf(TimeUnit.MICROSECONDS.toMillis(A00.C7c())), A06, valueOf, str3, A032, (Map) A07.A00, (Map) A07.A01, A01, A03, false);
        C74541Pwa pwa2 = pwa;
        C328557Fg r7 = new C328557Fg(DbS.A0V(pwl2.BsO(i2)), A04(pwa2, messagingUser2, pwl2, i2), OPx.A01(omf2));
        C329987Kz A04 = AnonymousClass7FB.A04(r3, A03);
        Context context2 = context;
        C70743OJo oJo = new C70743OJo(context2);
        C74541Pwa pwa3 = pwa2;
        AnonymousClass9HC r222 = r35;
        MessagingUser messagingUser3 = messagingUser2;
        C74552Pwl pwl3 = pwl2;
        C331547Rk A002 = oJo.A00(pwa3, r222, messagingUser3, pwl3, set, i2, OPx.A01(omf2));
        if (pwl2.Azt(i2) > 0) {
            str2 = DbV.A0u(context2, str2, context2.getString(2131959745), 2131964456);
        }
        int i3 = r3.A00;
        boolean z = false;
        boolean z2 = false;
        C3266677r r43 = new C3266677r(userSession2, (MessageIdentifier) null, str2, (String) null, (String) null, i3, i3, false, false);
        if (A00.A0Q != null && A00.A10 == 2FW.A1A && AnonymousClass7TF.A1Z(r35.A0u)) {
            z2 = true;
        }
        String BSF = pwl2.BSF(i2);
        if (OZ6.A00(pwa2, pwl2, i2) == 2FW.A1s) {
            z = true;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(r3.A09);
        A1A.append('_');
        A1A.append(false);
        A1A.append('_');
        A1A.append(false);
        A1A.append('_');
        A1A.append(false);
        return new C3266877t((C376679Ix) null, (C376679Ix) null, userSession2, (AnonymousClass7AE) null, (AnonymousClass7AD) null, new C3266777s(A1A.toString(), AnonymousClass0eN.A01(new C73667Phg(2, r3, omf2))), r43, (AnonymousClass7AB) null, (C3262275x) null, (C3265777i) null, (AnonymousClass7AC) null, A002, (AnonymousClass7AF) null, r7, (AnonymousClass7AG) null, (AnonymousClass7AA) null, (AnonymousClass7A9) null, A033, (C328567Fh) null, BSF, (String) null, A04.A00, z, z2, A03, false, true);
    }
}
