package X;

import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;
import java.lang.ref.WeakReference;

public final class GMN extends C251343mx {
    public final C62320sa A00;
    public final C376459Ib A01;
    public final 2WX A02;
    public final UserSession A03;
    public final AnonymousClass4GS A04;
    public final C246653ex A05;
    public final C59491JLp A06;
    public final AnonymousClass33B A07;
    public final C246853fL A08;
    public final C59553JNz A09;
    public final AnonymousClass4DU A0A;
    public final AnonymousClass3W1 A0B;
    public final WeakReference A0C;
    public final C62320sa A0D;
    public final 0sP A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r0.A05.A0B == false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d2, code lost:
        if (X.182.A06(X.0Tu.A06, r9, 36328053160295329L) != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r2 == X.AnonymousClass05K.A0N) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01bc, code lost:
        if (X.182.A06(X.0Tu.A06, r9, 36328053160295329L) != false) goto L_0x01be;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A06(X.2Wb r28, X.GMO r29, java.lang.Integer r30, java.util.List r31) {
        /*
            r27 = this;
            r14 = 0
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            r2 = r30
            if (r2 == r7) goto L_0x000c
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r1 = 0
            if (r2 != r0) goto L_0x000d
        L_0x000c:
            r1 = 1
        L_0x000d:
            r16 = 1098907648(0x41800000, float:16.0)
            r10 = 0
            r8 = 1
            r0 = r27
            r13 = r28
            r26 = r29
            r15 = r31
            if (r1 == 0) goto L_0x00e6
            if (r2 == r7) goto L_0x001f
            r16 = 0
        L_0x001f:
            int r1 = r15.size()
            if (r1 != r8) goto L_0x002d
            X.3ex r1 = r0.A05
            boolean r1 = r1.A0B
            r24 = 1
            if (r1 != 0) goto L_0x002f
        L_0x002d:
            r24 = 0
        L_0x002f:
            int r5 = X.C51966G9m.A06(r15)
            if (r5 < 0) goto L_0x0111
            r4 = 0
        L_0x0036:
            java.lang.Object r3 = r15.get(r4)
            X.4Ji r3 = (X.AnonymousClass4Ji) r3
            boolean r1 = r3 instanceof com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState
            if (r1 == 0) goto L_0x0085
            X.3XV r1 = X.2WX.A02
            int r1 = r15.size()
            int r1 = r1 + -1
            int r1 = r1 - r4
            float r1 = (float) r1
            float r1 = r1 * r16
            double r1 = (double) r1
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            java.lang.Integer r7 = X.AnonymousClass05K.A0N
            X.9JR r6 = new X.9JR
            r6.<init>(r7, r8, r1)
            X.2WX r2 = new X.2WX
            r2.<init>(r10, r6)
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r3 = (com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState) r3
            com.instagram.common.session.UserSession r1 = r0.A03
            long r21 = X.GMK.A00(r1, r4)
            int r1 = r4 % 2
            r23 = 0
            if (r1 != 0) goto L_0x006d
            r23 = 1
        L_0x006d:
            r1 = r26
            X.JLq r1 = r1.A00
            r17 = r0
            r18 = r2
            r19 = r3
            r20 = r1
            X.GOK r1 = r17.A05(r18, r19, r20, r21, r23)
            r13.A00(r1)
        L_0x0080:
            if (r4 == r5) goto L_0x0111
            int r4 = r4 + 1
            goto L_0x0036
        L_0x0085:
            boolean r1 = r3 instanceof com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState
            if (r1 == 0) goto L_0x0080
            X.3XV r1 = X.2WX.A02
            int r1 = r15.size()
            int r1 = r1 + -1
            int r1 = r1 - r4
            int r1 = r1 % 2
            float r1 = (float) r1
            float r1 = r1 * r16
            double r1 = (double) r1
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            java.lang.Integer r7 = X.AnonymousClass05K.A0N
            X.9JR r6 = new X.9JR
            r6.<init>(r7, r8, r1)
            X.2WX r7 = new X.2WX
            r7.<init>(r10, r6)
            com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState r3 = (com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState) r3
            com.instagram.common.session.UserSession r9 = r0.A03
            long r21 = X.GMK.A00(r9, r4)
            int r1 = r4 % 2
            r23 = 0
            if (r1 != 0) goto L_0x00b8
            r23 = 1
        L_0x00b8:
            X.3ex r2 = r0.A05
            boolean r1 = r2.A09
            if (r1 == 0) goto L_0x00d4
            boolean r1 = r2.A0A
            if (r1 == 0) goto L_0x00d4
            X.0qQ.A0B(r9, r14)
            X.0Tu r6 = X.0Tu.A06
            r1 = 36328053160295329(0x81102c00003ba1, double:3.037345327674931E-306)
            boolean r1 = X.182.A06(r6, r9, r1)
            r25 = 1
            if (r1 == 0) goto L_0x00d6
        L_0x00d4:
            r25 = 0
        L_0x00d6:
            r17 = r0
            r18 = r7
            r19 = r3
            r20 = r26
            X.GMs r1 = r17.A04(r18, r19, r20, r21, r23, r24, r25)
            r13.A00(r1)
            goto L_0x0080
        L_0x00e6:
            r15.size()
            java.lang.Object r3 = X.00k.A0J(r15)
            boolean r1 = r3 instanceof com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState
            if (r1 == 0) goto L_0x01d2
            com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState r3 = (com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState) r3
            if (r3 == 0) goto L_0x01d2
            com.instagram.common.session.UserSession r2 = r0.A03
            X.4DU r1 = r0.A0A
            java.lang.String r1 = r1.getModuleName()
            boolean r1 = X.C52306GMw.A01(r2, r3, r1)
            if (r1 == 0) goto L_0x01d2
            X.2HY r1 = X.0sr.A1R(r15)
        L_0x0107:
            int r5 = r1.A00
            int r6 = r1.A01
            int r4 = r1.A02
            if (r4 <= 0) goto L_0x0112
            if (r5 <= r6) goto L_0x0116
        L_0x0111:
            return
        L_0x0112:
            if (r4 >= 0) goto L_0x0111
            if (r6 > r5) goto L_0x0111
        L_0x0116:
            java.lang.Object r3 = r15.get(r5)
            X.4Ji r3 = (X.AnonymousClass4Ji) r3
            boolean r1 = r3 instanceof com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState
            if (r1 == 0) goto L_0x0163
            int r1 = r15.size()
            int r1 = r1 - r5
            float r2 = (float) r1
            float r2 = r2 * r16
            r1 = 1090519040(0x41000000, float:8.0)
            float r2 = r2 - r1
            X.3XV r1 = X.2WX.A02
            double r1 = (double) r2
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            X.9JR r9 = new X.9JR
            r9.<init>(r7, r8, r1)
            X.2WX r2 = new X.2WX
            r2.<init>(r10, r9)
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r3 = (com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState) r3
            com.instagram.common.session.UserSession r1 = r0.A03
            long r21 = X.GMK.A00(r1, r5)
            int r1 = r5 % 2
            r23 = 0
            if (r1 != 0) goto L_0x014c
            r23 = 1
        L_0x014c:
            r1 = r26
            X.JLq r1 = r1.A00
            r17 = r0
            r18 = r2
            r19 = r3
            r20 = r1
            X.GOK r1 = r17.A05(r18, r19, r20, r21, r23)
            r13.A00(r1)
        L_0x015f:
            if (r5 == r6) goto L_0x0111
            int r5 = r5 + r4
            goto L_0x0116
        L_0x0163:
            boolean r1 = r3 instanceof com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState
            if (r1 == 0) goto L_0x015f
            com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState r3 = (com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState) r3
            com.instagram.common.session.UserSession r9 = r0.A03
            X.4DU r1 = r0.A0A
            java.lang.String r1 = r1.getModuleName()
            boolean r1 = X.C52306GMw.A01(r9, r3, r1)
            r2 = 1098907648(0x41800000, float:16.0)
            if (r1 == 0) goto L_0x017a
            r2 = 0
        L_0x017a:
            X.3XV r1 = X.2WX.A02
            int r1 = r15.size()
            int r1 = r1 + -1
            int r1 = r1 - r5
            float r1 = (float) r1
            float r1 = r1 * r2
            double r1 = (double) r1
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            java.lang.Integer r11 = X.AnonymousClass05K.A0N
            X.9JR r12 = new X.9JR
            r12.<init>(r11, r8, r1)
            X.2WX r11 = new X.2WX
            r11.<init>(r10, r12)
            long r21 = X.GMK.A00(r9, r5)
            int r1 = r5 % 2
            r23 = 0
            if (r1 != 0) goto L_0x01a2
            r23 = 1
        L_0x01a2:
            X.3ex r2 = r0.A05
            boolean r1 = r2.A09
            if (r1 == 0) goto L_0x01be
            boolean r1 = r2.A0A
            if (r1 == 0) goto L_0x01be
            X.0qQ.A0B(r9, r14)
            X.0Tu r12 = X.0Tu.A06
            r1 = 36328053160295329(0x81102c00003ba1, double:3.037345327674931E-306)
            boolean r1 = X.182.A06(r12, r9, r1)
            r25 = 1
            if (r1 == 0) goto L_0x01c0
        L_0x01be:
            r25 = 0
        L_0x01c0:
            r17 = r0
            r18 = r11
            r19 = r3
            r20 = r26
            r24 = r14
            X.GMs r1 = r17.A04(r18, r19, r20, r21, r23, r24, r25)
            r13.A00(r1)
            goto L_0x015f
        L_0x01d2:
            X.2HY r1 = X.0sr.A1R(r15)
            X.2HZ r1 = X.C229632nm.A0A(r1)
            goto L_0x0107
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GMN.A06(X.2Wb, X.GMO, java.lang.Integer, java.util.List):void");
    }

    public GMN(C376459Ib r5, 2WX r6, UserSession userSession, AnonymousClass4GS r8, C246653ex r9, C59491JLp jLp, AnonymousClass33B r11, C246853fL r12, C59553JNz jNz, AnonymousClass4DU r14, AnonymousClass3W1 r15, WeakReference weakReference, C62320sa r17, C62320sa r18, 0sP r19, boolean z, boolean z2, boolean z3) {
        0sP r1 = r19;
        AnonymousClass7TG.A1S(jLp, r1);
        C62320sa r3 = r17;
        0qQ.A0B(r3, 8);
        C51969G9p.A1O(r5, 11, r11);
        C62320sa r2 = r18;
        C51969G9p.A1S(r12, 14, r2);
        0qQ.A0B(r15, 18);
        this.A05 = r9;
        this.A03 = userSession;
        this.A0A = r14;
        this.A02 = r6;
        this.A06 = jLp;
        this.A0E = r1;
        this.A09 = jNz;
        this.A00 = r3;
        this.A0F = z;
        this.A0G = z2;
        this.A01 = r5;
        this.A04 = r8;
        this.A07 = r11;
        this.A08 = r12;
        this.A0C = weakReference;
        this.A0H = z3;
        this.A0D = r2;
        this.A0B = r15;
    }

    private final C53915GwL A00(C53372Gmw gmw, 2WX r17, C59492JLq jLq, long j) {
        AnonymousClass4DU r9 = this.A0A;
        UserSession userSession = this.A03;
        0sP r10 = this.A0E;
        C59553JNz jNz = this.A09;
        return new C53915GwL(this.A01, gmw, r17, userSession, this.A04, jLq, this.A07, jNz, r9, r10, j, this.A0F, this.A0G);
    }

    private final C52302GMs A04(2WX r23, SocialContextBubbleUiState socialContextBubbleUiState, GMO gmo, long j, boolean z, boolean z2, boolean z3) {
        UserSession userSession = this.A03;
        AnonymousClass4DU r5 = this.A0A;
        0sP r14 = this.A0E;
        C59553JNz jNz = this.A09;
        C376459Ib r3 = this.A01;
        boolean z4 = this.A0F;
        boolean z5 = this.A0G;
        C246853fL r9 = this.A08;
        C62320sa r13 = this.A0D;
        return new C52302GMs(r3, r23, r5, userSession, socialContextBubbleUiState, gmo, r9, jNz, this.A0B, this.A0C, r13, r14, j, z, z4, z5, z2, z3);
    }

    private final GOK A05(2WX r22, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, C59492JLq jLq, long j, boolean z) {
        UserSession userSession = this.A03;
        AnonymousClass4DU r13 = this.A0A;
        0sP r14 = this.A0E;
        C59553JNz jNz = this.A09;
        return new GOK(this.A01, r22, (AnonymousClass0iw) null, userSession, this.A04, (C52976GgT) null, notesPogThoughtBubbleUiState, jLq, this.A07, jNz, r13, r14, 65552, j, z, this.A0F, this.A0G);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0109, code lost:
        if (r4 == X.AnonymousClass05K.A0N) goto L_0x010b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r20) {
        /*
            r19 = this;
            r10 = r20
            boolean r0 = X.C51966G9m.A1Z(r10)
            X.3Zh r1 = X.C243573Zh.FLEX_START
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            r8 = 3
            X.9JS r1 = X.C51965G9l.A0d(r9, r1, r8)
            r4 = 0
            X.2WX r2 = X.C51965G9l.A0X(r4, r1)
            r12 = r19
            X.2WX r1 = r12.A02
            X.2WX r7 = r2.A00(r1)
            X.JLp r5 = r12.A06
            X.GMn r1 = X.C52297GMn.A00
            boolean r1 = X.0qQ.A0K(r5, r1)
            if (r1 == 0) goto L_0x00ee
            X.3ex r1 = r12.A05
            X.0qQ.A0B(r1, r0)
            X.4Jg r2 = r1.A01
            boolean r1 = r2 instanceof X.AnonymousClass4Jf
            if (r1 == 0) goto L_0x007a
            X.4Jf r2 = (X.AnonymousClass4Jf) r2
            java.util.List r6 = r2.A00
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r6.iterator()
        L_0x003d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0057
            java.lang.Object r2 = r3.next()
            X.4Ji r2 = (X.AnonymousClass4Ji) r2
            boolean r1 = r2 instanceof com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState
            if (r1 == 0) goto L_0x003d
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r2 = (com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState) r2
            com.instagram.common.typedurl.ImageUrl r1 = r2.A03
            if (r1 == 0) goto L_0x003d
            r5.add(r1)
            goto L_0x003d
        L_0x0057:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x005e
            return r4
        L_0x005e:
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r2 = r6.iterator()
        L_0x0066:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x00b3
            java.lang.Object r1 = r2.next()
            X.4Ji r1 = (X.AnonymousClass4Ji) r1
            com.instagram.common.typedurl.ImageUrl r1 = r1.Adz()
            r3.add(r1)
            goto L_0x0066
        L_0x007a:
            boolean r1 = r2 instanceof X.C53519Gpp
            if (r1 == 0) goto L_0x00e9
            X.Gpp r2 = (X.C53519Gpp) r2
            X.Gmw r1 = r2.A00
            java.lang.Object r1 = r1.A04
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x008e:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x00a0
            java.lang.Object r1 = r2.next()
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r1 = (com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState) r1
            com.instagram.common.typedurl.ImageUrl r1 = r1.A03
            r5.add(r1)
            goto L_0x008e
        L_0x00a0:
            java.util.List r3 = X.00k.A0d(r5, r8)
            int r1 = X.DbT.A02(r5, r8)
            int r2 = java.lang.Math.max(r1, r0)
            r1 = 6
            X.JwA r8 = new X.JwA
            r8.<init>((java.util.List) r3, (int) r2, (int) r1)
            goto L_0x00b9
        L_0x00b3:
            r1 = 6
            X.JwA r8 = new X.JwA
            r8.<init>((java.util.List) r3, (int) r0, (int) r1)
        L_0x00b9:
            r2 = 49
            X.J6I r1 = new X.J6I
            r1.<init>(r12, r2)
            X.2WX r1 = X.C51973G9u.A0Z(r4, r1)
            X.2WX r6 = r7.A00(r1)
            X.2Wb r5 = X.C51972G9s.A0Q(r10)
            X.4DU r4 = r12.A0A
            com.instagram.common.session.UserSession r3 = r12.A03
            X.0Tu r2 = X.DbS.A0J(r3, r0)
            r0 = 36326713131087809(0x810ef4000937c1, double:3.0364978878082305E-306)
            boolean r2 = X.182.A06(r2, r3, r0)
            boolean r1 = r12.A0H
            X.GtJ r0 = new X.GtJ
            r0.<init>(r8, r4, r2, r1)
            X.2Tl r0 = X.C51967G9n.A0N(r0, r5, r10, r6)
            return r0
        L_0x00e9:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00ee:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.contentnotes.ui.animator.NonMinimizedContentNotesInteractionState"
            X.0qQ.A0C(r5, r1)
            X.GMO r5 = (X.GMO) r5
            X.3ex r3 = r12.A05
            X.4Jg r1 = r3.A01
            boolean r2 = r1 instanceof X.AnonymousClass4Jf
            if (r2 == 0) goto L_0x0126
            java.lang.Integer r4 = r3.A03
            X.0qQ.A0B(r4, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r4 == r0) goto L_0x010b
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r3 = 0
            if (r4 != r0) goto L_0x010c
        L_0x010b:
            r3 = 1
        L_0x010c:
            X.2Wb r2 = X.C51972G9s.A0Q(r10)
            X.4Jf r1 = (X.AnonymousClass4Jf) r1
            java.util.List r0 = r1.A00
            if (r3 == 0) goto L_0x011e
            r12.A06(r2, r5, r4, r0)
            X.2Tp r0 = X.C243563Zg.A0B(r2, r10, r7)
            return r0
        L_0x011e:
            r12.A06(r2, r5, r4, r0)
            X.2Tl r0 = X.C243563Zg.A03(r2, r10, r7)
            return r0
        L_0x0126:
            boolean r2 = r1 instanceof X.C53519Gpp
            if (r2 == 0) goto L_0x01eb
            java.lang.Integer r3 = r3.A03
            X.0qQ.A0B(r3, r0)
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            if (r3 == r6) goto L_0x0197
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            if (r3 == r2) goto L_0x0197
            X.2Wb r8 = X.C51972G9s.A0Q(r10)
            X.Gpp r1 = (X.C53519Gpp) r1
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r14 = r1.A01
            if (r14 == 0) goto L_0x0195
            long r2 = X.C51970G9q.A0D()
            java.lang.Integer r9 = X.AnonymousClass05K.A0A
            X.2WX r11 = X.AnonymousClass9JR.A00(r4, r9, r0, r2)
            long r2 = X.C51969G9p.A0F()
            r9 = 1
            X.2WX r13 = X.AnonymousClass9JR.A00(r11, r6, r9, r2)
            com.instagram.common.session.UserSession r2 = r12.A03
            long r16 = X.GMK.A00(r2, r0)
            X.JLq r15 = r5.A00
            r18 = r0
            X.GOK r2 = r12.A05(r13, r14, r15, r16, r18)
        L_0x0162:
            r8.A00(r2)
            long r2 = X.C51969G9p.A0F()
            r9 = 1
            X.2WX r14 = X.AnonymousClass9JR.A00(r4, r6, r9, r2)
            X.Gmw r13 = r1.A00
            com.instagram.common.session.UserSession r3 = r12.A03
            X.0Tu r2 = X.DbS.A0J(r3, r0)
            r0 = 36602127909524025(0x82097100121239, double:3.210671302697591E-306)
            long r16 = X.182.A01(r2, r3, r0)
            r0 = 36602127909392951(0x82097100101237, double:3.210671302614699E-306)
            long r0 = X.182.A01(r2, r3, r0)
            long r16 = r16 + r0
            X.JLq r15 = r5.A00
            X.GwL r0 = r12.A00(r13, r14, r15, r16)
            X.2Tl r0 = X.C51967G9n.A0N(r0, r8, r10, r7)
            return r0
        L_0x0195:
            r2 = r4
            goto L_0x0162
        L_0x0197:
            X.2Wb r6 = X.C51972G9s.A0Q(r10)
            X.Gpp r1 = (X.C53519Gpp) r1
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r14 = r1.A01
            if (r14 == 0) goto L_0x01e9
            long r2 = X.C51969G9p.A0F()
            java.lang.Integer r11 = X.AnonymousClass05K.A0A
            X.2WX r13 = X.AnonymousClass9JR.A00(r4, r11, r0, r2)
            com.instagram.common.session.UserSession r2 = r12.A03
            long r16 = X.GMK.A00(r2, r0)
            X.JLq r15 = r5.A00
            r18 = r0
            X.GOK r2 = r12.A05(r13, r14, r15, r16, r18)
        L_0x01b9:
            r6.A00(r2)
            X.3Zh r2 = X.C243573Zh.FLEX_END
            X.2WX r14 = X.C51971G9r.A0Y(r4, r9, r2, r8)
            X.Gmw r13 = r1.A00
            com.instagram.common.session.UserSession r3 = r12.A03
            X.0Tu r2 = X.DbS.A0J(r3, r0)
            r0 = 36602127909524025(0x82097100121239, double:3.210671302697591E-306)
            long r16 = X.182.A01(r2, r3, r0)
            r0 = 36602127909392951(0x82097100101237, double:3.210671302614699E-306)
            long r0 = X.182.A01(r2, r3, r0)
            long r16 = r16 + r0
            X.JLq r15 = r5.A00
            X.GwL r0 = r12.A00(r13, r14, r15, r16)
            X.2Tp r0 = X.C51967G9n.A0Q(r0, r6, r10, r7)
            return r0
        L_0x01e9:
            r2 = r4
            goto L_0x01b9
        L_0x01eb:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GMN.A0X(X.3Y5):X.3mp");
    }
}
