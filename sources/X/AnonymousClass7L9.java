package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.7L9  reason: invalid class name */
public final class AnonymousClass7L9 {
    public final UserSession A00;
    public final AnonymousClass7UF A01;
    public final C333517Zg A02;
    public final AnonymousClass7L5 A03;
    public final OKL A04;
    public final AnonymousClass7L7 A05;
    public final C62320sa A06;
    public final C62320sa A07;
    public final 0sP A08;
    public final boolean A09;
    public final boolean A0A;
    public final Context A0B;
    public final AnonymousClass0iw A0C;
    public final AnonymousClass7UH A0D;
    public final String A0E;
    public final C62320sa A0F;
    public final C62320sa A0G;

    public AnonymousClass7L9(Context context, AnonymousClass0iw r3, UserSession userSession, AnonymousClass7UF r5, C333517Zg r6, AnonymousClass7L5 r7, OKL okl, AnonymousClass7L7 r9, AnonymousClass7UH r10, String str, C62320sa r12, C62320sa r13, C62320sa r14, C62320sa r15, 0sP r16, boolean z, boolean z2) {
        0qQ.A0B(r3, 3);
        0qQ.A0B(r5, 5);
        0qQ.A0B(r9, 6);
        0qQ.A0B(r10, 9);
        this.A0B = context;
        this.A00 = userSession;
        this.A0C = r3;
        this.A0E = str;
        this.A01 = r5;
        this.A05 = r9;
        this.A03 = r7;
        this.A04 = okl;
        this.A0D = r10;
        this.A02 = r6;
        this.A0A = z;
        this.A09 = z2;
        this.A07 = r12;
        this.A06 = r13;
        this.A0F = r14;
        this.A08 = r16;
        this.A0G = r15;
    }

    public static final void A00(AnonymousClass7L9 r1, String str, 0sP r3) {
        Object invoke = r1.A0F.invoke();
        if (invoke == null) {
            r1.A08.invoke(str);
            return;
        }
        AnonymousClass7UF r2 = r1.A01;
        r2.A00();
        r3.invoke(invoke);
        r2.A01((C254933tI) null, (Integer) null, 100);
    }

    public static final boolean A01(AnonymousClass7L9 r0, C254743sy r1) {
        if (!((Boolean) r0.A0G.invoke()).booleanValue() || !(r1 instanceof MsysThreadId)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015c, code lost:
        if (X.182.A06(r8, r10, 2342158155997580317L) == false) goto L_0x015e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0119 A[EDGE_INSN: B:153:0x0119->B:47:0x0119 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(X.N49 r46, X.C70766OKm r47, X.C70726OHv r48, com.instagram.direct.model.mentions.SendMentionData$MentionData r49, java.lang.Integer r50, java.lang.Integer r51, java.lang.Integer r52, java.lang.Long r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.util.List r58, boolean r59) {
        /*
            r45 = this;
            r17 = 0
            r11 = 0
            r0 = r45
            X.0sa r1 = r0.A0F
            java.lang.Object r5 = r1.invoke()
            X.3sy r5 = (X.C254743sy) r5
            r8 = 0
            r15 = r48
            if (r48 == 0) goto L_0x0402
            X.OBo r1 = r15.A02
            X.3tI r7 = r1.A01
            java.lang.String r9 = r7.A0T
            if (r9 == 0) goto L_0x001f
            X.7Zg r1 = r0.A02
            r1.CYZ(r9)
        L_0x001f:
            r4 = r56
            if (r5 != 0) goto L_0x004d
            X.7UH r2 = r0.A0D
            r1 = 623(0x26f, float:8.73E-43)
            java.lang.String r3 = X.C66579MXk.A00(r1)
            r2.A02(r4, r3)
            if (r56 == 0) goto L_0x004b
            int r1 = r4.hashCode()
        L_0x0034:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            com.instagram.common.session.UserSession r1 = r0.A00
            com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger r1 = X.C328727Fx.A00(r1, r2)
            if (r1 == 0) goto L_0x0043
            r1.onEndFlowFail(r3)
        L_0x0043:
            X.0sP r1 = r0.A08
            java.lang.String r0 = "DirectThreadFragment.sendTextMessage"
            r1.invoke(r0)
        L_0x004a:
            return r11
        L_0x004b:
            r1 = 0
            goto L_0x0034
        L_0x004d:
            X.7L5 r1 = r0.A03
            r20 = r1
            X.7UF r1 = r0.A01
            r44 = r1
            r44.A00()
            r6 = 1
            X.7Zg r1 = r0.A02
            r19 = r1
            X.9Gx r3 = X.C376179Gx.PSEUDO_GET_MENTIONED_USER_IDS
            boolean r2 = r1.AH1(r3)
            r1 = r54
            if (r2 == 0) goto L_0x00d1
            X.2Er r13 = r19.Api()
            if (r13 == 0) goto L_0x00ff
            java.util.List r2 = r13.BRZ()
            X.0qQ.A0B(r2, r11)
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.Iterator r10 = r2.iterator()
        L_0x007d:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0091
            java.lang.Object r3 = r10.next()
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            java.lang.String r2 = r3.getUsername()
            r8.put(r2, r3)
            goto L_0x007d
        L_0x0091:
            com.instagram.common.session.UserSession r14 = r0.A00
            r12 = 2
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            boolean r2 = X.LQG.A01(r14, r13, r1)
            if (r2 != 0) goto L_0x00d8
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.ArrayList r2 = X.C253053q8.A05(r1, r11)
            java.util.Iterator r16 = r2.iterator()
        L_0x00ac:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x00d5
            java.lang.Object r2 = r16.next()
            X.3uc r2 = (X.C255723uc) r2
            java.lang.String r2 = r2.A02
            java.lang.String r2 = r2.substring(r6)
            X.0qQ.A07(r2)
            java.lang.Object r2 = r8.get(r2)
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            if (r2 == 0) goto L_0x00ac
            java.lang.String r2 = r2.getId()
            r3.add(r2)
            goto L_0x00ac
        L_0x00d1:
            X.C69865NtT.A00(r3)
            goto L_0x00ff
        L_0x00d5:
            r10.addAll(r3)
        L_0x00d8:
            X.78S r2 = X.AnonymousClass78P.A00
            boolean r16 = r2.A00(r14, r13)
            if (r16 == 0) goto L_0x03fe
            java.lang.String r8 = ".*(/("
        L_0x00e2:
            java.lang.String r3 = "silent"
            java.lang.String r2 = ")).*"
            java.lang.String r2 = X.002.A0g(r8, r3, r2)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r12)
            java.util.regex.Matcher r2 = r2.matcher(r1)
            X.0qQ.A07(r2)
            boolean r2 = r2.matches()
            if (r2 == 0) goto L_0x03de
            if (r16 == 0) goto L_0x03de
            X.CHV r8 = X.CHV.A00
        L_0x00ff:
            r29 = r57
            r10 = r58
            r18 = r47
            r23 = r50
            r24 = r51
            r13 = r52
            r25 = r53
            if (r58 == 0) goto L_0x0119
            boolean r2 = r10 instanceof java.util.Collection
            if (r2 == 0) goto L_0x038e
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L_0x038e
        L_0x0119:
            if (r8 != 0) goto L_0x02a9
            if (r48 != 0) goto L_0x0203
            android.content.Context r12 = r0.A0B
            android.content.Context r2 = r12.getApplicationContext()
            X.0qQ.A07(r2)
            com.instagram.common.session.UserSession r10 = r0.A00
            X.OWT r2 = X.C70174NyS.A00(r2, r10)
            boolean r2 = r2.A02(r1)
            if (r2 == 0) goto L_0x0203
            boolean r2 = r0.A0A
            if (r2 == 0) goto L_0x0203
            X.0Tu r8 = X.0Tu.A05
            r2 = 2342156773019027687(0x2081032d001308e7, double:4.060298116161937E-152)
            boolean r2 = X.182.A06(r8, r10, r2)
            if (r2 == 0) goto L_0x0203
            boolean r2 = r0.A09
            if (r2 != 0) goto L_0x015e
            r2 = 2342156773019551982(0x2081032d001b08ee, double:4.060298116606495E-152)
            boolean r2 = X.182.A06(r8, r10, r2)
            if (r2 != 0) goto L_0x015e
            r2 = 2342158155997580317(0x2081046f00050c1d, double:4.061470764659789E-152)
            boolean r2 = X.182.A06(r8, r10, r2)
            r3 = 1
            if (r2 != 0) goto L_0x015f
        L_0x015e:
            r3 = 0
        L_0x015f:
            boolean r2 = A01(r0, r5)
            if (r2 == 0) goto L_0x01e3
            if (r3 == 0) goto L_0x01e3
            android.content.Context r2 = r12.getApplicationContext()
            X.0qQ.A07(r2)
            X.OWT r4 = X.C70174NyS.A00(r2, r10)
            X.0sa r2 = r0.A06
            java.lang.Object r9 = r2.invoke()
            X.3t2 r9 = (X.C254783t2) r9
            X.0qQ.A0B(r9, r6)
            X.N2L r3 = r4.A00(r1)
            if (r3 != 0) goto L_0x01fd
            java.util.Map r10 = r4.A03
            boolean r2 = r10.containsKey(r1)
            if (r2 == 0) goto L_0x01fd
            java.lang.String r8 = X.HZX.A00()
            com.instagram.common.session.UserSession r2 = r4.A02
            X.OyA r4 = X.C70171NyP.A00(r2)
            com.instagram.model.direct.threadkey.impl.MsysThreadId r3 = X.C66647MaG.A06(r5)
            r2 = r17
            r4.A00(r3, r8, r1, r2)
            X.7S9 r2 = r19.AvL()
            r2.E2N()
            X.59G r2 = new X.59G
            r2.<init>(r8, r5, r9)
            r10.put(r1, r2)
        L_0x01ad:
            if (r7 == 0) goto L_0x01c8
            com.instagram.common.session.UserSession r2 = r0.A00
            X.0iw r1 = r0.A0C
            X.7HC r3 = new X.7HC
            r3.<init>(r1, r2)
            if (r48 == 0) goto L_0x0406
            X.OBo r1 = r15.A02
            X.Njm r2 = r1.A00
            X.0qQ.A06(r2)
            X.2FW r1 = r7.A0F
            java.lang.String r1 = r1.A00
            r3.A00(r2, r5, r1)
        L_0x01c8:
            java.lang.String r2 = r0.A0E
            java.lang.String r1 = "inbox_active_now_tab"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x01dd
            com.instagram.common.session.UserSession r0 = r0.A00
            X.60k r1 = X.C3018660j.A01(r0)
            X.NmI r0 = X.C69474NmI.SEND
            r1.A0F(r0)
        L_0x01dd:
            r0 = r44
            r0.A01(r7, r13, r11)
            return r6
        L_0x01e3:
            android.content.Context r2 = r12.getApplicationContext()
            X.0qQ.A07(r2)
            X.OWT r4 = X.C70174NyS.A00(r2, r10)
            X.0sa r2 = r0.A06
            java.lang.Object r9 = r2.invoke()
            X.3t2 r9 = (X.C254783t2) r9
            X.0qQ.A0B(r9, r6)
            X.N2L r3 = r4.A00(r1)
        L_0x01fd:
            com.instagram.common.session.UserSession r2 = r4.A02
            X.C71148Oe6.A06(r2, r3, r9, r1)
            goto L_0x01ad
        L_0x0203:
            X.7S9 r12 = r19.AvL()
            boolean r2 = r12.EsR()
            r31 = r46
            r39 = r55
            if (r2 == 0) goto L_0x027b
            com.instagram.common.session.UserSession r8 = r0.A00
            X.0Tu r10 = X.0Tu.A05
            r2 = 36315146783558682(0x81046f00000c1a, double:3.0291832830568674E-306)
            boolean r2 = X.182.A06(r10, r8, r2)
            if (r2 == 0) goto L_0x027b
            if (r56 == 0) goto L_0x0236
            boolean r2 = A01(r0, r5)
            if (r2 == 0) goto L_0x0236
            X.OyA r3 = X.C70171NyP.A00(r8)
            com.instagram.model.direct.threadkey.impl.MsysThreadId r2 = X.C66647MaG.A06(r5)
            r3.A00(r2, r4, r1, r9)
            r12.E2N()
        L_0x0236:
            X.1a8 r8 = new X.1a8
            r2 = r17
            r8.<init>(r2)
            X.7L7 r2 = r0.A05
            java.lang.String r41 = r20.A00()
            r30 = r2
            r32 = r18
            r33 = r7
            r34 = r23
            r35 = r24
            r36 = r17
            r37 = r25
            r38 = r1
            r40 = r4
            r42 = r29
            r43 = r11
            X.1aU r3 = r30.A00(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            X.4fh r2 = X.C318146oT.A01
            X.1aU r3 = r3.A0P(r2)
            X.PSe r2 = new X.PSe
            r16 = r2
            r17 = r8
            r18 = r0
            r19 = r5
            r20 = r4
            r21 = r1
            r22 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r8.A02(r3, r2)
            goto L_0x01ad
        L_0x027b:
            X.7L7 r8 = r0.A05
            X.7L5 r2 = r8.A02
            java.lang.String r41 = r2.A00()
            r43 = r59
            r30 = r8
            r32 = r18
            r33 = r7
            r34 = r23
            r35 = r24
            r36 = r13
            r37 = r25
            r38 = r1
            r40 = r4
            r42 = r29
            X.1aU r3 = r30.A00(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            X.1a8 r2 = r8.A00
            X.PS7 r1 = new X.PS7
            r1.<init>(r8)
            r2.A02(r3, r1)
            goto L_0x01ad
        L_0x02a9:
            com.instagram.common.session.UserSession r4 = r0.A00
            X.0Tu r9 = X.0Tu.A05
            r2 = 36328439707352415(0x81108600003d5f, double:3.037589781590332E-306)
            boolean r2 = X.182.A06(r9, r4, r2)
            if (r2 == 0) goto L_0x02bc
            if (r49 == 0) goto L_0x02bc
            r8 = r49
        L_0x02bc:
            boolean r2 = r8 instanceof X.CHT
            if (r2 == 0) goto L_0x02f7
            X.7Zj r17 = r19.BsD()
            X.CHT r8 = (X.CHT) r8
            java.util.List r2 = r8.A00
            r8 = 0
        L_0x02c9:
            X.0sa r3 = r0.A07
            java.lang.Object r3 = r3.invoke()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r32 = r3.booleanValue()
            java.lang.String r28 = r20.A00()
            X.OKL r3 = r0.A04
            if (r3 == 0) goto L_0x02f4
            X.OCA r21 = r3.A00()
        L_0x02e1:
            java.lang.String r27 = "none"
            r22 = r5
            r26 = r1
            r30 = r2
            r31 = r10
            r19 = r7
            r20 = r8
            r17.EMv(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x01ad
        L_0x02f4:
            r21 = 0
            goto L_0x02e1
        L_0x02f7:
            boolean r2 = r8 instanceof com.instagram.direct.model.mentions.SendMentionData$MentionData
            if (r2 == 0) goto L_0x0303
            X.7Zj r17 = r19.BsD()
            r2 = 0
            com.instagram.direct.model.mentions.SendMentionData$MentionData r8 = (com.instagram.direct.model.mentions.SendMentionData$MentionData) r8
            goto L_0x02c9
        L_0x0303:
            boolean r2 = r8 instanceof X.CHV
            if (r2 == 0) goto L_0x0354
            X.7Zj r17 = r19.BsD()
            X.0sa r2 = r0.A07
            java.lang.Object r2 = r2.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r30 = r2.booleanValue()
            java.lang.String r27 = r20.A00()
            X.OKL r2 = r0.A04
            if (r2 == 0) goto L_0x0351
            X.OCA r20 = r2.A00()
        L_0x0323:
            java.lang.String r26 = "none"
            r19 = r7
            r21 = r5
            r22 = r23
            r23 = r24
            r24 = r25
            r25 = r1
            r28 = r29
            r29 = r10
            r17.EMj(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.1Am r2 = X.1Al.A01(r4)
            X.1An r1 = X.1An.A2r
            X.0xa r1 = r2.A03(r1)
            X.0xY r3 = r1.AR4()
            java.lang.String r2 = "SEND_SILENTLY_NUX_KEY_V2"
            r1 = 3
            r3.E5Z(r2, r1)
            r3.apply()
            goto L_0x01ad
        L_0x0351:
            r20 = 0
            goto L_0x0323
        L_0x0354:
            boolean r2 = r8 instanceof X.CHU
            if (r2 == 0) goto L_0x040e
            X.7Zj r17 = r19.BsD()
            X.0sa r2 = r0.A07
            java.lang.Object r2 = r2.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r30 = r2.booleanValue()
            java.lang.String r27 = r20.A00()
            X.OKL r2 = r0.A04
            if (r2 == 0) goto L_0x038b
            X.OCA r20 = r2.A00()
        L_0x0374:
            java.lang.String r26 = "none"
            r19 = r7
            r21 = r5
            r22 = r23
            r23 = r24
            r24 = r25
            r25 = r1
            r28 = r29
            r29 = r10
            r17.ELg(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x01ad
        L_0x038b:
            r20 = 0
            goto L_0x0374
        L_0x038e:
            java.util.Iterator r12 = r10.iterator()
        L_0x0392:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x0119
            java.lang.Object r2 = r12.next()
            X.9IY r2 = (X.AnonymousClass9IY) r2
            int r3 = r2.A03
            r2 = 5
            if (r3 == r2) goto L_0x03a6
            r2 = 6
            if (r3 != r2) goto L_0x0392
        L_0x03a6:
            if (r53 != 0) goto L_0x004a
            X.7Zj r17 = r19.BsD()
            X.0sa r2 = r0.A07
            java.lang.Object r2 = r2.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r30 = r2.booleanValue()
            java.lang.String r26 = r20.A00()
            X.OKL r2 = r0.A04
            if (r2 == 0) goto L_0x03db
            X.OCA r20 = r2.A00()
        L_0x03c4:
            java.lang.String r25 = "none"
            r19 = r7
            r21 = r5
            r22 = r23
            r23 = r24
            r24 = r1
            r27 = r4
            r28 = r29
            r29 = r10
            r17.EMu(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x01ad
        L_0x03db:
            r20 = 0
            goto L_0x03c4
        L_0x03de:
            boolean r2 = r10.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x03f1
            java.util.List r2 = X.00k.A0a(r10)
            X.CHT r8 = new X.CHT
            r8.<init>(r2)
            goto L_0x00ff
        L_0x03f1:
            boolean r2 = X.LQG.A01(r14, r13, r1)
            if (r2 == 0) goto L_0x03fb
            X.CHU r8 = X.CHU.A00
            goto L_0x00ff
        L_0x03fb:
            r8 = 0
            goto L_0x00ff
        L_0x03fe:
            java.lang.String r8 = ".*(@("
            goto L_0x00e2
        L_0x0402:
            r9 = r8
            r7 = r8
            goto L_0x001f
        L_0x0406:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x040e:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7L9.A02(X.N49, X.OKm, X.OHv, com.instagram.direct.model.mentions.SendMentionData$MentionData, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean):boolean");
    }
}
