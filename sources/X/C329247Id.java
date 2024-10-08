package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.7Id  reason: invalid class name and case insensitive filesystem */
public final class C329247Id {
    public C329307Ij A00;
    public final C328967Gz A01;
    public final C329217Ia A02;
    public final C329257Ie A03;
    public final Set A04 = new LinkedHashSet();
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final AnonymousClass7IR A07;
    public final C254783t2 A08;
    public final List A09;
    public final AnonymousClass0eK A0A;
    public final AnonymousClass0eK A0B;

    public C329247Id(AnonymousClass0iw r2, UserSession userSession, C329217Ia r4, C254783t2 r5, List list, AnonymousClass0eK r7, AnonymousClass0eK r8, AnonymousClass0eK r9) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r7, 2);
        0qQ.A0B(r5, 3);
        0qQ.A0B(r2, 8);
        this.A06 = userSession;
        this.A0A = r7;
        this.A08 = r5;
        this.A02 = r4;
        this.A09 = list;
        this.A0B = r9;
        this.A05 = r2;
        this.A01 = new C328967Gz(r2, userSession);
        this.A03 = new C329257Ie(r2, userSession, r5, r8);
        this.A07 = new AnonymousClass7IR(r2, userSession);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.instagram.direct.model.mentions.SendMentionData$MentionData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: com.instagram.direct.model.mentions.SendMentionData$MentionData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v68, resolved type: com.instagram.direct.model.mentions.SendMentionData$MentionData} */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v19, types: [X.0Ac] */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* JADX WARNING: type inference failed for: r0v39, types: [java.lang.Object, com.instagram.direct.model.mentions.MentionedEntity] */
    /* JADX WARNING: type inference failed for: r5v73 */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01be, code lost:
        if (r3.A09 == null) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01d5, code lost:
        if (X.182.A06(X.0Tu.A05, r0.A1Z, 36314459588987449L) == false) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01fe, code lost:
        if (r8 != false) goto L_0x0200;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(android.text.Editable r44, java.lang.Long r45, java.lang.String r46) {
        /*
            r43 = this;
            r1 = 0
            r37 = r46
            r0 = r37
            X.0qQ.A0B(r0, r1)
            r8 = r44
            java.util.List r18 = X.OQX.A00(r8)
            boolean r0 = r18.isEmpty()
            if (r0 == 0) goto L_0x0018
            java.util.List r18 = X.LQG.A00(r8)
        L_0x0018:
            r17 = 0
            if (r44 == 0) goto L_0x002d
            int r2 = r8.length()
            java.lang.Class<X.L8A> r0 = X.L8A.class
            java.lang.Object[] r0 = r8.getSpans(r1, r2, r0)
            X.L8A[] r0 = (X.L8A[]) r0
            if (r0 == 0) goto L_0x002d
            int r0 = r0.length
            r17 = r0
        L_0x002d:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            if (r44 == 0) goto L_0x0099
            int r2 = r8.length()
            java.lang.Class<X.L8A> r0 = X.L8A.class
            java.lang.Object[] r5 = r8.getSpans(r1, r2, r0)
            java.lang.String r4 = r8.toString()
            int r3 = r4.length()
            r9 = 0
        L_0x0047:
            if (r9 >= r3) goto L_0x0058
            char r2 = r4.charAt(r9)
            r0 = 32
            int r0 = X.0qQ.A00(r2, r0)
            if (r0 > 0) goto L_0x0059
            int r9 = r9 + 1
            goto L_0x0047
        L_0x0058:
            r9 = r3
        L_0x0059:
            X.0sC r10 = X.0pe.A00(r5)
        L_0x005d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0099
            java.lang.Object r6 = r10.next()
            X.L8A r6 = (X.L8A) r6
            int r0 = r8.getSpanStart(r6)
            int r0 = r0 - r9
            int r5 = java.lang.Math.max(r1, r0)
            int r2 = r8.length()
            int r0 = r8.getSpanEnd(r6)
            int r0 = r0 - r5
            int r0 = r0 - r9
            int r4 = java.lang.Math.min(r2, r0)
            java.lang.String r3 = r6.A02
            if (r3 != 0) goto L_0x0086
            java.lang.String r3 = ""
        L_0x0086:
            int r2 = r6.A00
            com.instagram.direct.model.mentions.MentionedEntity r0 = new com.instagram.direct.model.mentions.MentionedEntity
            r0.<init>()
            r0.A03 = r3
            r0.A01 = r5
            r0.A00 = r4
            r0.A02 = r2
            r7.add(r0)
            goto L_0x005d
        L_0x0099:
            r24 = 1
            com.instagram.direct.model.mentions.SendMentionData$MentionData r26 = new com.instagram.direct.model.mentions.SendMentionData$MentionData
            r26.<init>()
            r0 = r26
            r0.A00 = r7
            boolean r0 = r18.isEmpty()
            r16 = 1
            r0 = r0 ^ 1
            r6 = 0
            if (r0 == 0) goto L_0x0140
            java.util.List r25 = X.OQX.A01(r18)
        L_0x00b3:
            r2 = r43
            X.7Ia r0 = r2.A02
            r42 = r0
            X.7Hl r0 = r0.A01
            X.7Ij r3 = r0.A0b
            java.util.List r3 = r3.A02()
            int r7 = r3.size()
            com.instagram.common.session.UserSession r3 = r2.A06
            r41 = r3
            X.0Tu r8 = X.0Tu.A06
            r3 = 36325742468871355(0x810e12000f34bb, double:3.035884037114002E-306)
            r5 = r41
            boolean r3 = X.182.A06(r8, r5, r3)
            if (r3 == 0) goto L_0x0154
            X.0iw r4 = r2.A05
            X.7IR r5 = new X.7IR
            r3 = r41
            r5.<init>(r4, r3)
            X.3t2 r8 = r2.A08
            X.0eK r9 = r2.A0A
            java.lang.Object r3 = r9.get()
            X.2Ep r3 = (X.AnonymousClass2Ep) r3
            X.XSV r28 = X.OP1.A00(r3)
            long r3 = (long) r7
            java.lang.Long r30 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r9.get()
            X.2Eq r3 = (X.2Eq) r3
            if (r3 == 0) goto L_0x013e
            com.instagram.model.direct.DirectThreadKey r3 = r3.BJy()
            java.util.List r9 = r3.A02
        L_0x0102:
            if (r25 == 0) goto L_0x0144
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r12 = r25.iterator()
        L_0x010d:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x0145
            java.lang.Object r3 = r12.next()
            X.9IY r3 = (X.AnonymousClass9IY) r3
            int r11 = r3.A02     // Catch:{ IndexOutOfBoundsException -> 0x012f }
            int r3 = r3.A01     // Catch:{ IndexOutOfBoundsException -> 0x012f }
            int r10 = r11 + r3
            r3 = r37
            java.lang.CharSequence r3 = r3.subSequence(r11, r10)     // Catch:{ IndexOutOfBoundsException -> 0x012f }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x012f }
            if (r3 == 0) goto L_0x010d
            r4.add(r3)
            goto L_0x010d
        L_0x012f:
            X.0wj r11 = X.0wj.A01
            r10 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r3 = "command range wrong"
            X.0f9 r3 = r11.AEf(r3, r10)
            r3.report()
            goto L_0x010d
        L_0x013e:
            r9 = r6
            goto L_0x0102
        L_0x0140:
            r25 = r6
            goto L_0x00b3
        L_0x0144:
            r4 = r6
        L_0x0145:
            java.lang.String r31 = "send"
            java.lang.String r32 = "composer"
            r29 = r8
            r33 = r9
            r34 = r4
            r27 = r5
            r27.A00(r28, r29, r30, r31, r32, r33, r34)
        L_0x0154:
            if (r7 <= 0) goto L_0x01b7
            java.lang.CharSequence r3 = X.00l.A0B(r37)
            java.lang.String r3 = r3.toString()
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x01b5
            X.GnY r7 = new X.GnY
            r5 = r26
            r4 = r37
            r3 = r25
            r7.<init>(r5, r4, r3)
            java.lang.String r5 = r7.A04
            java.lang.String r4 = r7.A03
            int r3 = X.C329067Hl.A00(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            java.lang.String r12 = "thread_composer"
            r8 = r0
            r10 = r5
            r11 = r4
            r13 = r24
            r14 = r13
            X.C329067Hl.A0i(r8, r9, r10, r11, r12, r13, r14)
        L_0x0186:
            X.7Ij r3 = r0.A0b
            java.util.List r3 = r3.A02()
            java.util.Iterator r9 = r3.iterator()
        L_0x0190:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x04e0
            java.lang.Object r8 = r9.next()
            X.B1z r8 = (X.C41819B1z) r8
            java.lang.String r3 = r8.BNd()
            r4 = 0
            java.lang.String r5 = X.C329067Hl.A0A(r7, r0, r6, r3)
            if (r5 == 0) goto L_0x01af
            com.instagram.common.session.UserSession r4 = r0.A1Z
            X.HNL r3 = X.HNL.THREADVIEW_USER_INPUT_PROMPT
            java.lang.String r4 = X.C70892OQk.A01(r3, r4, r6, r5)
        L_0x01af:
            r3 = r24
            r8.ELx(r7, r4, r3)
            goto L_0x0190
        L_0x01b5:
            r7 = r6
            goto L_0x0186
        L_0x01b7:
            X.7Kg r3 = r0.A0c
            if (r3 == 0) goto L_0x01c0
            X.OHv r3 = r3.A09
            r10 = 1
            if (r3 != 0) goto L_0x01c1
        L_0x01c0:
            r10 = 0
        L_0x01c1:
            boolean r3 = X.C71052OaU.A02(r37)
            if (r3 == 0) goto L_0x01d7
            com.instagram.common.session.UserSession r7 = r0.A1Z
            X.0Tu r5 = X.0Tu.A05
            r3 = 36314459588987449(0x8103cf00030a39, double:3.028748698442909E-306)
            boolean r3 = X.182.A06(r5, r7, r3)
            r8 = 1
            if (r3 != 0) goto L_0x01d8
        L_0x01d7:
            r8 = 0
        L_0x01d8:
            java.lang.String r3 = X.HZX.A00()
            X.2Er r4 = r0.A0W
            if (r4 == 0) goto L_0x08d8
            int r4 = r4.C6a()
            java.lang.Integer r28 = java.lang.Integer.valueOf(r4)
        L_0x01e8:
            com.instagram.common.session.UserSession r4 = r0.A1Z
            boolean r7 = X.C329067Hl.A0t(r0)
            int r9 = r3.hashCode()
            X.0qQ.A0B(r4, r1)
            r5 = r24
            X.OYx.A00(r4, r9, r7, r5)
            if (r10 != 0) goto L_0x0200
            r32 = 1
            if (r8 == 0) goto L_0x0202
        L_0x0200:
            r32 = 0
        L_0x0202:
            java.lang.String r31 = "thread_composer"
            r27 = r0
            r29 = r37
            r30 = r3
            r33 = r1
            X.C329067Hl.A0i(r27, r28, r29, r30, r31, r32, r33)
            com.instagram.model.direct.DirectThreadKey r7 = X.C329067Hl.A09(r0)
            java.lang.Integer r23 = X.AnonymousClass05K.A00
            r5 = r23
            boolean r5 = X.AnonymousClass796.A07(r4, r7, r5)
            if (r5 == 0) goto L_0x026e
            X.ODz r13 = X.C70134Nxo.A00(r4)
            r5 = r23
            X.3tH r12 = X.C329067Hl.A05(r0, r5)
            X.2Er r5 = r0.A0W
            if (r5 == 0) goto L_0x08d4
            boolean r5 = r5.CUG()
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r5)
        L_0x0233:
            java.util.HashMap r21 = X.C329067Hl.A0H(r0)
            java.util.HashMap r20 = new java.util.HashMap
            r20.<init>()
            X.0eK r5 = r0.A24
            java.lang.Object r8 = r5.get()
            java.lang.String r7 = "ephemeral_lifetime_ms"
            r5 = r20
            r5.put(r7, r8)
            X.3t2 r5 = r0.A1z
            r19 = r5
            r14 = 20000(0x4e20, double:9.8813E-320)
            r5 = 2
            X.0qQ.A0B(r12, r5)
            java.util.Set r11 = r13.A01
            boolean r5 = r11.contains(r3)
            r10 = 20128010(0x133210a, float:3.2900812E-38)
            X.02m r8 = r13.A00
            if (r5 == 0) goto L_0x07e3
            java.lang.String r7 = "error"
            java.lang.String r5 = "loggingId_collision"
            r8.markerAnnotate(r10, r9, r7, r5)
            r5 = 3
            r8.markerEnd(r10, r9, r5)
            r11.remove(r3)
        L_0x026e:
            boolean r7 = X.C329067Hl.A0s(r0)
            r5 = 0
            if (r7 != 0) goto L_0x027b
            boolean r7 = X.C71052OaU.A03(r25)
            if (r7 == 0) goto L_0x0309
        L_0x027b:
            java.lang.String r34 = X.HZX.A00()
            java.lang.String r32 = X.C329067Hl.A0F(r0)
            X.5D7 r27 = X.AnonymousClass5D5.A00(r4)
            boolean r7 = X.0mp.A0B(r32)
            r7 = r7 ^ 1
            java.lang.Boolean r29 = java.lang.Boolean.valueOf(r7)
            java.lang.String r7 = r0.A21
            X.HNL r28 = X.HNL.THREADVIEW_USER_INPUT_PROMPT
            r30 = r6
            r31 = r3
            r33 = r7
            r35 = r24
            r36 = r1
            r27.A00(r28, r29, r30, r31, r32, r33, r34, r35, r36)
            boolean r7 = X.C329067Hl.A0s(r0)
            if (r7 == 0) goto L_0x07dd
            java.lang.String r10 = X.C329067Hl.A0E(r0)
        L_0x02ac:
            boolean r7 = X.C329067Hl.A0s(r0)
            if (r7 == 0) goto L_0x02b4
            X.XSV r5 = X.XSV.A02
        L_0x02b4:
            X.7I3 r7 = r0.A0J
            java.lang.String r11 = X.C329067Hl.A0F(r0)
            java.lang.String r9 = r0.A0x
            X.0wc r7 = r7.A01
            X.1Ln r8 = X.1Ln.A0J(r7)
            X.0Aj r7 = r8.A00
            boolean r7 = r7.isSampled()
            if (r7 == 0) goto L_0x02f4
            r7 = 6
            r8.A0X(r7)
            X.Nml r12 = X.C69503Nml.A05
            java.lang.String r7 = "entry_point"
            r8.A0M(r12, r7)
            java.lang.String r7 = "thread_id"
            r8.A0R(r7, r11)
            java.lang.String r7 = "agent_id"
            r8.A0R(r7, r10)
            java.lang.String r7 = "thread_type"
            r8.A0M(r5, r7)
            if (r9 == 0) goto L_0x07da
            r5 = 10
            java.lang.Long r7 = X.00y.A0n(r5, r9)
        L_0x02ec:
            java.lang.String r5 = "content_author_id"
            r8.A0Q(r5, r7)
            r8.Cgf()
        L_0x02f4:
            X.7I6 r7 = r0.A0A
            java.lang.String r5 = "ai_thread_text_message_sent"
            r8 = 673059101(0x281e111d, float:8.774473E-15)
            X.02m r7 = r7.A06
            r7.markerPoint(r8, r5)
            short r5 = X.JVT.A00(r23)
            r7.markerEnd(r8, r5)
            r5 = r34
        L_0x0309:
            X.OWa r7 = r0.A0S
            if (r7 == 0) goto L_0x0310
            r7.A04(r1, r1)
        L_0x0310:
            X.AnonymousClass72B.A00(r4)
            X.7Kl r8 = r0.A0t
            if (r8 == 0) goto L_0x0321
            java.util.UUID r7 = java.util.UUID.randomUUID()
            java.lang.String r7 = r7.toString()
            r8.A0D = r7
        L_0x0321:
            X.7Kg r7 = r0.A0c
            if (r7 == 0) goto L_0x032d
            X.OHv r7 = r7.A09
            if (r7 == 0) goto L_0x032e
            boolean r8 = r7.A08
            if (r8 == 0) goto L_0x032e
        L_0x032d:
            r7 = r6
        L_0x032e:
            X.C329067Hl.A0W(r0)
            X.1a8 r8 = r0.A1Y
            r8.A01()
            X.7IU r9 = r0.A1v
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            java.lang.Integer r8 = r9.A00
            if (r10 == r8) goto L_0x034e
            r9.A00 = r10
            com.instagram.common.session.UserSession r8 = r9.A01
            X.1Ng r9 = X.AnonymousClass1Nd.A00(r8)
            X.7QW r8 = new X.7QW
            r8.<init>(r10)
            r9.A00(r8)
        L_0x034e:
            X.7Kg r8 = r0.A0c
            r35 = r45
            if (r8 == 0) goto L_0x0441
            X.Jvb r8 = r8.A07
            if (r8 == 0) goto L_0x0441
            if (r45 == 0) goto L_0x035d
            r16 = 0
        L_0x035c:
            return r16
        L_0x035d:
            java.lang.String r5 = r8.A00
            X.7Sa r4 = r0.A1i
            java.lang.String r9 = r8.A02
            r3 = r24
            X.0qQ.A0B(r9, r3)
            if (r5 == 0) goto L_0x03a4
            X.9H7 r3 = r4.A00
            X.7TI r3 = X.AnonymousClass9H7.A01(r3)
            X.7L9 r8 = r3.A0K()
            X.7L7 r3 = r8.A05
            X.0sa r3 = r3.A05
            java.lang.Object r4 = r3.invoke()
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x04a9
            r3 = 10
            int r3 = X.0Yv.A1E(r4, r3)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r3)
            java.util.Iterator r10 = r4.iterator()
        L_0x038f:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x04aa
            java.lang.Object r4 = r10.next()
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            com.instagram.pendingmedia.model.recipients.PendingRecipient r3 = new com.instagram.pendingmedia.model.recipients.PendingRecipient
            r3.<init>((com.instagram.user.model.User) r4)
            r7.add(r3)
            goto L_0x038f
        L_0x03a4:
            X.9H7 r8 = r4.A00
            X.7TI r3 = X.AnonymousClass9H7.A01(r8)
            X.7L9 r7 = r3.A0K()
            X.7L7 r3 = r7.A05
            X.0sa r3 = r3.A05
            java.lang.Object r4 = r3.invoke()
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x03de
            r3 = 10
            int r3 = X.0Yv.A1E(r4, r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r3)
            java.util.Iterator r10 = r4.iterator()
        L_0x03c9:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x03df
            java.lang.Object r4 = r10.next()
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            com.instagram.pendingmedia.model.recipients.PendingRecipient r3 = new com.instagram.pendingmedia.model.recipients.PendingRecipient
            r3.<init>((com.instagram.user.model.User) r4)
            r5.add(r3)
            goto L_0x03c9
        L_0x03de:
            r5 = r6
        L_0x03df:
            com.instagram.common.session.UserSession r3 = r7.A00
            X.1E8 r3 = X.1E7.A00(r3)
            X.1Xj r26 = r3.A02(r9)
            if (r26 == 0) goto L_0x040f
            if (r5 == 0) goto L_0x040f
            X.0sa r3 = r7.A06
            java.lang.Object r3 = r3.invoke()
            X.3t2 r3 = (X.C254783t2) r3
            com.instagram.model.direct.DirectShareTarget r4 = new com.instagram.model.direct.DirectShareTarget
            r4.<init>(r3, r6, r5, r1)
            X.7Zg r3 = r7.A02
            X.7Z7 r25 = r3.BsE()
            r27 = r4
            r28 = r37
            r29 = r6
            r30 = r6
            r31 = r24
            r32 = r1
            r25.EM0(r26, r27, r28, r29, r30, r31, r32)
        L_0x040f:
            com.instagram.common.session.UserSession r5 = r8.A10
            X.3t2 r7 = r8.A1S
            X.4DU r4 = r8.A1Q
            r3 = 2
            X.0qQ.A0B(r4, r3)
            X.0wc r5 = X.AnonymousClass0kN.A01(r4, r5)
            java.lang.String r4 = "direct_feed_reply_sent"
            X.0kJ r3 = r5.A00
            X.0Aj r5 = r5.A00(r3, r4)
            java.lang.String r4 = "send"
            java.lang.String r3 = "action"
            r5.AAJ(r3, r4)
            java.lang.String r4 = "feed_post_reply"
            java.lang.String r3 = "type"
            r5.AAJ(r3, r4)
            java.lang.String r4 = X.AnonymousClass4KK.A02(r7)
            java.lang.String r3 = "open_thread_id"
            r5.AAJ(r3, r4)
            r5.Cgf()
            goto L_0x04de
        L_0x0441:
            X.7Kj r9 = r0.A0i
            if (r9 == 0) goto L_0x04a6
            android.view.ViewGroup r8 = r9.A01
            if (r8 == 0) goto L_0x04a3
            int r8 = r8.getVisibility()
            if (r8 != 0) goto L_0x04a3
            int r8 = r9.A00
            java.lang.Integer r32 = java.lang.Integer.valueOf(r8)
        L_0x0455:
            X.7Kj r10 = r0.A0i
            com.instagram.model.direct.DirectThreadKey r13 = X.C329067Hl.A09(r0)
            boolean r9 = r0.A28
            android.view.ViewGroup r8 = r10.A01
            if (r8 == 0) goto L_0x0473
            int r8 = r8.getVisibility()
            if (r8 != 0) goto L_0x0473
            X.Ob1 r11 = X.C71082Ob1.A00
            com.instagram.common.session.UserSession r8 = r10.A08
            r15 = 6
            r12 = r8
            r14 = r6
            r16 = r9
            r11.A02(r12, r13, r14, r15, r16)
        L_0x0473:
            if (r5 == 0) goto L_0x04a0
            X.HNL r8 = X.HNL.THREADVIEW_USER_INPUT_PROMPT
            java.lang.String r39 = X.C70892OQk.A01(r8, r4, r6, r5)
        L_0x047b:
            X.7Sa r5 = r0.A1i
            int r4 = r0.A00
            java.lang.Integer r33 = java.lang.Integer.valueOf(r4)
            X.7Ij r4 = r0.A0b
            java.lang.Integer r4 = r4.A0B
            r27 = r5
            r28 = r6
            r29 = r6
            r30 = r7
            r31 = r26
            r34 = r4
            r36 = r37
            r37 = r6
            r38 = r3
            r40 = r25
            boolean r16 = r27.A09(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            goto L_0x04de
        L_0x04a0:
            r39 = r6
            goto L_0x047b
        L_0x04a3:
            r32 = 0
            goto L_0x0455
        L_0x04a6:
            r32 = r6
            goto L_0x0473
        L_0x04a9:
            r7 = r6
        L_0x04aa:
            com.instagram.common.session.UserSession r3 = r8.A00
            X.1E8 r3 = X.1E7.A00(r3)
            X.1Xj r27 = r3.A02(r9)
            if (r27 == 0) goto L_0x04de
            if (r7 == 0) goto L_0x04de
            X.0sa r3 = r8.A06
            java.lang.Object r3 = r3.invoke()
            X.3t2 r3 = (X.C254783t2) r3
            com.instagram.model.direct.DirectShareTarget r4 = new com.instagram.model.direct.DirectShareTarget
            r4.<init>(r3, r6, r7, r1)
            X.7Zg r3 = r8.A02
            X.7Z7 r25 = r3.BsE()
            r26 = r6
            r28 = r6
            r29 = r4
            r30 = r5
            r31 = r37
            r32 = r6
            r33 = r1
            r34 = r24
            r25.ELY(r26, r27, r28, r29, r30, r31, r32, r33, r34)
        L_0x04de:
            if (r16 == 0) goto L_0x035c
        L_0x04e0:
            X.7Ie r4 = r2.A03
            boolean r3 = r18.isEmpty()
            r3 = r3 ^ 1
            if (r3 != 0) goto L_0x04ec
            if (r17 <= 0) goto L_0x0604
        L_0x04ec:
            X.7If r7 = r4.A00
            java.lang.String r9 = "mention"
            X.0wc r5 = r7.A00
            java.lang.String r4 = "ig_direct_command_system_sent"
            X.0kJ r3 = r5.A00
            X.0Aj r4 = r5.A00(r3, r4)
            r3 = 213(0xd5, float:2.98E-43)
            X.1Ln r5 = new X.1Ln
            r5.<init>(r4, r3)
            X.0Aj r3 = r5.A00
            boolean r3 = r3.isSampled()
            if (r3 == 0) goto L_0x0604
            X.0eK r3 = r7.A02
            java.lang.Object r3 = r3.get()
            X.0qQ.A07(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r4 = r3.booleanValue()
            X.3t2 r7 = r7.A01
            java.lang.String r11 = X.AnonymousClass4KK.A02(r7)
            if (r11 != 0) goto L_0x0522
            java.lang.String r11 = ""
        L_0x0522:
            r3 = 10
            java.lang.Long r10 = X.00y.A0n(r3, r11)
            boolean r12 = X.AnonymousClass6W3.A07(r7)
            if (r12 == 0) goto L_0x0587
            if (r4 == 0) goto L_0x0584
            X.XSV r8 = X.XSV.A03
        L_0x0532:
            X.B8P r4 = new X.B8P
            r4.<init>()
            java.lang.String r3 = "id"
            r4.A06(r3, r11)
            java.lang.String r3 = "key"
            r4.A06(r3, r11)
            java.lang.String r3 = "type"
            r4.A01(r8, r3)
            java.lang.String r3 = "thread"
            r5.A0N(r4, r3)
            java.lang.String r3 = "recipient_id"
            r5.A0Q(r3, r10)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.util.Iterator r11 = r18.iterator()
        L_0x0559:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x058f
            java.lang.Object r8 = r11.next()
            r3 = r8
            X.JwA r3 = (X.C61072JwA) r3
            java.lang.Object r3 = r3.A02
            X.75i r3 = (X.C3260875i) r3
            X.7OS r3 = r3.A01()
            java.lang.String r4 = r3.A00
            java.lang.Object r3 = r10.get(r4)
            if (r3 != 0) goto L_0x057e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r10.put(r4, r3)
        L_0x057e:
            java.util.List r3 = (java.util.List) r3
            r3.add(r8)
            goto L_0x0559
        L_0x0584:
            X.XSV r8 = X.XSV.A04
            goto L_0x0532
        L_0x0587:
            if (r4 == 0) goto L_0x058c
            X.XSV r8 = X.XSV.A05
            goto L_0x0532
        L_0x058c:
            X.XSV r8 = X.XSV.A06
            goto L_0x0532
        L_0x058f:
            int r3 = r10.size()
            int r3 = X.0se.A0L(r3)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>(r3)
            java.util.Set r3 = r10.entrySet()
            java.util.Iterator r10 = r3.iterator()
        L_0x05a4:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x05c6
            java.lang.Object r3 = r10.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8.put(r4, r3)
            goto L_0x05a4
        L_0x05c6:
            if (r17 <= 0) goto L_0x05d5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            X.0eP r3 = new X.0eP
            r3.<init>(r9, r4)
            java.util.Map r8 = X.0Yt.A0C(r8, r3)
        L_0x05d5:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>(r8)
            java.lang.String r4 = r3.toString()
            X.0qQ.A07(r4)
            java.lang.String r3 = "command_type"
            r5.A0R(r3, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r12)
            java.lang.String r3 = "is_e2ee"
            r5.A0O(r3, r4)
            java.lang.Long r4 = X.AnonymousClass4KK.A01(r7)
            java.lang.String r3 = "occamadillo_thread_id"
            r5.A0Q(r3, r4)
            java.lang.String r4 = X.AnonymousClass4KK.A02(r7)
            java.lang.String r3 = "open_thread_id"
            r5.A0R(r3, r4)
            r5.Cgf()
        L_0x0604:
            r5 = 766842320(0x2db515d0, float:2.0587004E-11)
            java.util.List r3 = r2.A09
            java.lang.Object r4 = X.00k.A0N(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x0613
            java.lang.String r4 = ""
        L_0x0613:
            r3 = r41
            X.AnonymousClass59S.A01(r3, r4, r5)
            X.7IR r4 = r2.A07
            X.3t2 r5 = r2.A08
            java.util.Set r3 = r2.A04
            java.util.List r7 = X.00k.A0a(r3)
            X.0wc r8 = r4.A00
            java.lang.String r4 = "direct_composer_send_text"
            X.0kJ r3 = r8.A00
            X.0Aj r9 = r8.A00(r3, r4)
            boolean r3 = r9.isSampled()
            if (r3 == 0) goto L_0x0690
            X.1QJ r3 = X.AnonymousClass1QI.A00
            X.1QM r3 = r3.A02
            java.lang.String r4 = r3.A00
            java.lang.String r3 = "nav_chain"
            r9.AAJ(r3, r4)
            java.lang.String r4 = X.AnonymousClass4KK.A02(r5)
            java.lang.String r3 = "open_thread_id"
            r9.AAJ(r3, r4)
            java.lang.Long r4 = X.AnonymousClass4KK.A01(r5)
            java.lang.String r3 = "occamadillo_thread_id"
            r9.A9F(r3, r4)
            boolean r3 = X.AnonymousClass6W3.A07(r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            java.lang.String r3 = "is_e2ee"
            r9.A7p(r3, r4)
            r3 = 10
            int r3 = X.0Yv.A1E(r7, r3)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r3)
            java.util.Iterator r7 = r7.iterator()
        L_0x066b:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0688
            java.lang.Object r3 = r7.next()
            X.HLb r3 = (X.C54618HLb) r3
            java.lang.String r4 = r3.name()
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r3 = r4.toLowerCase(r3)
            X.0qQ.A07(r3)
            r8.add(r3)
            goto L_0x066b
        L_0x0688:
            java.lang.String r3 = "rich_text_format"
            r9.AAe(r3, r8)
            r9.Cgf()
        L_0x0690:
            X.0eK r3 = r2.A0B
            java.lang.Object r3 = r3.get()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x06ba
            X.0iw r4 = r2.A05
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r10 = r3.toString()
            X.0qQ.A07(r10)
            X.EZi r7 = X.C48140EZi.OMNIPICKER_THREAD_PREVIEW
            java.lang.String r12 = X.AnonymousClass4KK.A02(r5)
            java.lang.String r13 = "new"
            r8 = r4
            r9 = r41
            r11 = r6
            X.C3265677h.A09(r7, r8, r9, r10, r11, r12, r13)
        L_0x06ba:
            X.7Ij r3 = r2.A00
            if (r3 == 0) goto L_0x06c1
            r3.A06(r6)
        L_0x06c1:
            X.7Ij r2 = r2.A00
            if (r2 == 0) goto L_0x06c8
            r2.A03()
        L_0x06c8:
            X.7Sa r2 = r0.A1i
            r2.A08(r1)
            X.3t2 r2 = r0.A1z
            X.0qQ.A0B(r2, r1)
            boolean r2 = r2 instanceof X.AnonymousClass9HR
            r2 = r2 ^ 1
            X.C329067Hl.A0j(r0, r2)
            X.C329067Hl.A0m(r0, r1, r1)
            X.C329067Hl.A0S(r0)
            X.C329067Hl.A0T(r0)
            int r3 = X.C329067Hl.A00(r0)
            r2 = 29
            if (r3 != r2) goto L_0x035c
            X.2Er r2 = r0.A0W
            if (r2 == 0) goto L_0x07d7
            java.lang.String r3 = r2.AsX()
        L_0x06f2:
            com.instagram.common.session.UserSession r10 = r0.A1Z
            java.lang.String r2 = r10.A06
            boolean r2 = X.2Ob.A00(r3, r2)
            if (r2 == 0) goto L_0x035c
            r2 = r42
            androidx.fragment.app.FragmentActivity r9 = r2.A00
            X.0iw r2 = r0.A1X
            java.lang.String r7 = X.C329067Hl.A0D(r0)
            java.lang.String r8 = r0.A21
            r0 = 2
            X.0qQ.A0B(r2, r0)
            r3 = 3
            X.0qQ.A0B(r7, r3)
            X.6jB r2 = X.C314986jA.A00(r10)
            X.0t1 r0 = X.0eE.A00(r10)
            com.instagram.user.model.User r0 = r0.A00()
            X.4Cl r0 = r0.A03
            com.instagram.api.schemas.FanClubInfoDict r0 = r0.B3v()
            if (r0 == 0) goto L_0x035c
            X.0xa r6 = r2.A01
            java.lang.String r5 = "broadcast_channels_impression_count"
            int r0 = r6.getInt(r5, r1)
            if (r0 >= r3) goto L_0x035c
            r2 = 0
            java.lang.String r4 = "broadcast_channels_last_seen_timestamp"
            long r13 = r6.getLong(r4, r2)
            long r11 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            r2 = 7
            long r2 = r0.toMillis(r2)
            long r11 = r11 - r2
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x035c
            X.0Tu r0 = X.0Tu.A05
            r2 = 36328542786567587(0x81109e00003da3, double:3.0376549693010734E-306)
            boolean r0 = X.182.A06(r0, r10, r2)
            if (r0 == 0) goto L_0x035c
            X.91q r3 = new X.91q
            r3.<init>(r10)
            r0 = 2131237651(0x7f081b13, float:1.8091558E38)
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            if (r2 == 0) goto L_0x035c
            X.F3t r11 = new X.F3t
            r11.<init>(r9)
            r0 = 2131961953(0x7f132861, float:1.9560617E38)
            java.lang.String r0 = r9.getString(r0)
            X.0qQ.A07(r0)
            r11.A06 = r0
            r0 = 2131961954(0x7f132862, float:1.956062E38)
            java.lang.String r0 = r9.getString(r0)
            X.0qQ.A07(r0)
            r11.A04 = r0
            r11.A03(r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r11.A05 = r0
            r0 = 2131961951(0x7f13285f, float:1.9560613E38)
            java.lang.String r2 = r9.getString(r0)
            X.0qQ.A07(r2)
            X.AKk r0 = new X.AKk
            r19 = r10
            r20 = r3
            r21 = r7
            r22 = r8
            r17 = r0
            r18 = r9
            r17.<init>(r18, r19, r20, r21, r22)
            r11.A02(r0, r2)
            r0 = 2131961952(0x7f132860, float:1.9560615E38)
            java.lang.String r2 = r9.getString(r0)
            X.0qQ.A07(r2)
            X.AKa r0 = new X.AKa
            r0.<init>(r3, r7, r8)
            r11.A07 = r2
            r11.A00 = r0
            r11.A01()
            X.9tD r0 = X.C391519tD.IMPRESSION
            r3.A01(r0, r7, r8)
            X.0xY r2 = r6.AR4()
            int r0 = r6.getInt(r5, r1)
            int r0 = r0 + 1
            r2.E5Z(r5, r0)
            long r0 = java.lang.System.currentTimeMillis()
            r2.E5c(r4, r0)
            r2.apply()
            return r16
        L_0x07d7:
            r3 = 0
            goto L_0x06f2
        L_0x07da:
            r7 = 0
            goto L_0x02ec
        L_0x07dd:
            java.lang.String r10 = X.C3262475z.A00(r4)
            goto L_0x02ac
        L_0x07e3:
            r8.markerStart(r10, r9)
            android.os.Looper r5 = X.C64021Cb.A00()
            android.os.Handler r7 = new android.os.Handler
            r7.<init>(r5)
            X.PZ9 r5 = new X.PZ9
            r5.<init>(r13, r3)
            r7.postDelayed(r5, r14)
            java.lang.String r7 = "text"
            java.lang.String r5 = "message_type"
            r8.markerAnnotate(r10, r9, r5, r7)
            java.lang.String r7 = r12.A00
            java.lang.String r5 = "transport_type"
            r8.markerAnnotate(r10, r9, r5, r7)
            java.util.Set r5 = r21.entrySet()
            java.util.Iterator r12 = r5.iterator()
        L_0x080d:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x082d
            java.lang.Object r5 = r12.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r7 = r5.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r8.markerAnnotate(r10, r9, r7, r5)
            goto L_0x080d
        L_0x082d:
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            java.util.Set r5 = r20.entrySet()
            java.util.Iterator r14 = r5.iterator()
        L_0x083a:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x0858
            java.lang.Object r12 = r14.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r5 = r12.getValue()
            if (r5 == 0) goto L_0x083a
            java.lang.Object r7 = r12.getKey()
            java.lang.Object r5 = r12.getValue()
            r13.put(r7, r5)
            goto L_0x083a
        L_0x0858:
            java.util.Set r5 = r13.entrySet()
            java.util.Iterator r12 = r5.iterator()
        L_0x0860:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x088a
            java.lang.Object r5 = r12.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r7 = r5.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            if (r5 == 0) goto L_0x08de
            long r33 = r5.longValue()
            r29 = r8
            r30 = r10
            r31 = r9
            r32 = r7
            r29.markerAnnotate(r30, r31, r32, r33)
            goto L_0x0860
        L_0x088a:
            if (r22 == 0) goto L_0x0895
            boolean r7 = r22.booleanValue()
            java.lang.String r5 = "is_group"
            r8.markerAnnotate(r10, r9, r5, r7)
        L_0x0895:
            if (r28 == 0) goto L_0x08b1
            int r7 = r28.intValue()
            r5 = 1892(0x764, float:2.651E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            r8.markerAnnotate(r10, r9, r5, r7)
            java.lang.String r7 = X.AnonymousClass48O.A00(r7)
            r5 = 1891(0x763, float:2.65E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            r8.markerAnnotate(r10, r9, r5, r7)
        L_0x08b1:
            if (r19 == 0) goto L_0x08be
            java.lang.String r7 = X.AnonymousClass4KK.A02(r19)
            if (r7 == 0) goto L_0x08be
            java.lang.String r5 = "open_thread_id"
            r8.markerAnnotate(r10, r9, r5, r7)
        L_0x08be:
            r11.add(r3)
            boolean r5 = r11.contains(r3)
            if (r5 == 0) goto L_0x026e
            java.lang.String r7 = "queue_pending"
            java.lang.String r5 = "_start"
            java.lang.String r5 = X.002.A0R(r7, r5)
            r8.markerPoint(r10, r9, r5)
            goto L_0x026e
        L_0x08d4:
            r22 = r6
            goto L_0x0233
        L_0x08d8:
            java.lang.Integer r28 = java.lang.Integer.valueOf(r1)
            goto L_0x01e8
        L_0x08de:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329247Id.A01(android.text.Editable, java.lang.Long, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r0.A02() == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(boolean r12) {
        /*
            r11 = this;
            X.7IR r10 = r11.A07
            java.util.List r8 = r11.A09
            X.7Ia r6 = r11.A02
            X.7Hl r5 = r6.A01
            X.7Kg r0 = r5.A0c
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.A02()
            r9 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r9 = 0
        L_0x0014:
            X.3t2 r4 = r11.A08
            com.instagram.common.session.UserSession r7 = r11.A06
            X.0Tu r2 = X.0Tu.A06
            r0 = 36325742468871355(0x810e12000f34bb, double:3.035884037114002E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x00b6
            X.0eK r0 = r5.A22
            java.lang.Object r0 = r0.get()
            X.2Ep r0 = (X.AnonymousClass2Ep) r0
            X.XSV r3 = X.OP1.A00(r0)
        L_0x0031:
            X.0wc r2 = r10.A00
            java.lang.String r1 = "direct_composer_tap_gallery"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x007f
            java.lang.String r1 = X.AnonymousClass4KK.A02(r4)
            java.lang.String r0 = "open_thread_id"
            r2.AAJ(r0, r1)
            java.lang.Long r1 = X.AnonymousClass4KK.A01(r4)
            java.lang.String r0 = "occamadillo_thread_id"
            r2.A9F(r0, r1)
            java.lang.String r0 = "recipient_ids"
            r2.AAe(r0, r8)
            boolean r0 = X.AnonymousClass6W3.A07(r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_e2ee"
            r2.A7p(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            java.lang.String r0 = "is_reply_flow"
            r2.A7p(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            java.lang.String r0 = "is_bottom_sheet_thread"
            r2.A7p(r0, r1)
            java.lang.String r0 = "thread_type"
            r2.A8M(r3, r0)
            r2.Cgf()
        L_0x007f:
            X.OYk r3 = X.C63234Ktf.A00(r7)
            r4 = 0
            java.lang.String r2 = "thread_composer"
            r1 = 49
            X.IwS r0 = new X.IwS
            r0.<init>(r4, r3, r2, r1)
            X.C71012OYk.A01(r3, r0)
            X.JVm r2 = X.AnonymousClass9PJ.A00(r7)
            X.28D r1 = X.28D.A2T
            r0 = 1
            r2.A07(r1, r0)
            android.view.ViewGroup r0 = r5.A1V
            X.0nA.A0N(r0)
            boolean r3 = X.C329067Hl.A0z(r5)
            X.Mpp r2 = X.C67555Mpp.TRIGGER_MEDIA_GALLERY
            androidx.fragment.app.FragmentActivity r1 = r6.A00
            X.PFg r0 = new X.PFg
            r0.<init>(r1, r6, r3)
            boolean r0 = X.C329067Hl.A13(r5, r2, r0)
            if (r0 != 0) goto L_0x00b5
            r5.A1K(r1, r4, r3)
        L_0x00b5:
            return
        L_0x00b6:
            X.XSV r3 = X.XSV.A07
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329247Id.A00(boolean):void");
    }
}
