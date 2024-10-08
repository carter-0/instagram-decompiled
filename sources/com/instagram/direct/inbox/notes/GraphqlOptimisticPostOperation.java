package com.instagram.direct.inbox.notes;

import X.0qQ;
import X.17i;
import X.AnonymousClass7TE;
import X.C262224Cq;
import X.C279864zZ;
import X.C51972G9s;
import X.C51974G9v;
import X.C53370Gmu;
import X.C68176N3r;
import X.OJi;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteCreationSource;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import java.util.List;

public final class GraphqlOptimisticPostOperation extends OptimisticNetworkOperation {
    public C279864zZ A00;
    public C279864zZ A01;
    public boolean A02 = true;
    public final Context A03;
    public final C53370Gmu A04;
    public final UserSession A05;
    public final NotesRepository A06;
    public final NoteAudience A07;
    public final C68176N3r A08;
    public final NoteStyle A09;
    public final 17i A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D = AnonymousClass7TE.A1C();
    public final List A0E;
    public final C262224Cq A0F;
    public final int A0G;
    public final NotesApi A0H;
    public final OJi A0I;
    public final boolean A0J;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r20v0 */
    /* JADX WARNING: type inference failed for: r20v5, types: [X.55S, X.3sy] */
    /* JADX WARNING: type inference failed for: r20v9 */
    /* JADX WARNING: type inference failed for: r6v36 */
    /* JADX WARNING: type inference failed for: r6v37 */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0568, code lost:
        if (r7 != r2) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x04dc  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0509  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x056e  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x05bd  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x05dc  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x028a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(com.instagram.direct.inbox.notes.NotesApi r35, java.util.List r36, X.AnonymousClass4D7 r37) {
        /*
            r34 = this;
            r5 = r35
            r8 = r36
            r3 = 35
            r4 = r37
            boolean r0 = X.MED.A04(r3, r4)
            r9 = r34
            if (r0 == 0) goto L_0x0571
            r6 = r4
            X.MED r6 = (X.MED) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0571
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x001e:
            java.lang.Object r7 = r6.A04
            X.1Hj r2 = X.1Hj.A02
            int r3 = r6.A00
            r19 = 2
            r0 = 1
            r4 = 0
            if (r3 == 0) goto L_0x0248
            if (r3 == r0) goto L_0x0238
            r1 = r19
            if (r3 != r1) goto L_0x05df
            java.lang.Object r1 = r6.A02
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r6.A01
            com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation r3 = (com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation) r3
            X.0eS.A00(r7)
            r20 = r4
        L_0x003d:
            r2 = r7
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r5 = r2 instanceof X.C239793Ih
            if (r5 == 0) goto L_0x01e5
            r5 = r2
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r5 = r5.A00
            X.3JC r5 = (X.AnonymousClass3JC) r5
            java.lang.Object r8 = r5.A01
            X.C7f r8 = (X.C43735C7f) r8
            r5 = 0
            if (r8 == 0) goto L_0x05b5
            X.BiW r7 = r8.A0E()
            if (r7 == 0) goto L_0x0578
            java.lang.String r6 = "success"
            boolean r6 = r7.getCoercedBooleanField(r0, r6)
            if (r6 == 0) goto L_0x0578
            X.BiW r10 = r8.A0E()
            if (r10 == 0) goto L_0x0097
            java.lang.Class<X.9ed> r9 = X.C382859ed.class
            java.lang.String r7 = "inbox_tray_item"
            r6 = 1825783268(0x6cd33de4, float:2.043005E27)
            X.3lr r9 = r10.getOptionalTreeField(r5, r7, r9, r6)
            if (r9 == 0) goto L_0x0097
            java.lang.Class<X.69I> r7 = X.AnonymousClass69I.class
            r6 = -1665516441(0xffffffff9cba3c67, float:-1.2324061E-21)
            X.3lr r7 = r9.reinterpretRequired(r5, r7, r6)
            if (r7 == 0) goto L_0x0097
            r6 = 2871(0xb37, float:4.023E-42)
            java.lang.String r6 = X.C273654mx.A00(r6)
            java.lang.String r11 = r7.getRequiredStringField(r0, r6)
            if (r11 == 0) goto L_0x0097
            com.instagram.direct.inbox.notes.NotesRepository r10 = r3.A06
            X.4Cq r9 = r10.A01
            r7 = 6
            X.9KX r6 = new X.9KX
            r6.<init>(r10, r11, r4, r7)
            X.AnonymousClass7TE.A1Z(r6, r9)
        L_0x0097:
            X.OJi r6 = r3.A0I
            int r7 = r3.A0G
            X.0qQ.A0B(r1, r0)
            X.37k r6 = r6.A00
            java.lang.String r24 = java.lang.String.valueOf(r7)
            java.lang.String r26 = "notes"
            X.37j r6 = (X.C2373737j) r6
            r21 = r4
            r22 = r6
            r23 = r4
            r25 = r1
            r27 = r26
            r28 = r7
            r29 = r5
            r30 = r5
            X.C2373737j.A09(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.BiW r8 = r8.A0E()
            if (r8 == 0) goto L_0x056a
            java.lang.Class<X.9ed> r7 = X.C382859ed.class
            java.lang.String r6 = "inbox_tray_item"
            r1 = 1825783268(0x6cd33de4, float:2.043005E27)
            X.3lr r7 = r8.getOptionalTreeField(r5, r6, r7, r1)
            if (r7 == 0) goto L_0x056a
            java.lang.Class<X.69I> r6 = X.AnonymousClass69I.class
            r1 = -1665516441(0xffffffff9cba3c67, float:-1.2324061E-21)
            X.3lr r1 = r7.reinterpretRequired(r5, r6, r1)
            X.69I r1 = (X.AnonymousClass69I) r1
            if (r1 == 0) goto L_0x056a
            X.69J r7 = r1.A0E()
            if (r7 == 0) goto L_0x056a
            java.lang.Class<X.69N> r6 = X.AnonymousClass69N.class
            r1 = -1739341165(0xffffffff9853c293, float:-2.7369346E-24)
            X.3lr r8 = r7.reinterpretRequired(r5, r6, r1)
            if (r8 == 0) goto L_0x056a
            java.lang.Class<X.69V> r9 = X.AnonymousClass69V.class
            r7 = 14
            r1 = 3036(0xbdc, float:4.254E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r1)
            r1 = 2019794762(0x78639f4a, float:1.8466909E34)
            com.google.common.collect.ImmutableList r1 = r8.getOptionalCompactedTreeListField(r7, r6, r9, r1)
            if (r1 == 0) goto L_0x012a
            java.util.ArrayList r9 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r10 = r1.iterator()
        L_0x0107:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x012c
            X.3lr r7 = X.C41845B3m.A0V(r10)
            java.lang.Class<X.69R> r6 = X.AnonymousClass69R.class
            r1 = -1791809412(0xffffffff9533287c, float:-3.61807E-26)
            X.3lr r6 = r7.reinterpretRequired(r5, r6, r1)
            X.69R r6 = (X.AnonymousClass69R) r6
            com.instagram.common.session.UserSession r1 = r3.A05
            X.1E5 r1 = X.1E4.A00(r1)
            com.instagram.user.model.User r1 = r6.A0E(r1)
            r9.add(r1)
            goto L_0x0107
        L_0x012a:
            X.0sn r9 = X.0sn.A00
        L_0x012c:
            boolean r1 = X.AnonymousClass7TE.A1b(r9)
            if (r1 == 0) goto L_0x056a
            com.instagram.direct.inbox.notes.NotesRepository r1 = r3.A06
            com.instagram.common.session.UserSession r3 = r1.A0B
            X.0Tu r1 = X.0Tu.A05
            r6 = 36324917834428902(0x810d52000431e6, double:3.0353625349720584E-306)
            boolean r1 = X.182.A06(r1, r3, r6)
            if (r1 == 0) goto L_0x056a
            X.1as r12 = X.1as.A04
            X.0qQ.A07(r12)
            java.util.Iterator r13 = r9.iterator()
        L_0x014c:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x056a
            com.instagram.user.model.User r9 = X.DbT.A0k(r13)
            com.instagram.model.direct.DirectShareTarget r7 = new com.instagram.model.direct.DirectShareTarget
            r7.<init>((com.instagram.user.model.User) r9)
            r6 = 5
            java.lang.String r1 = "strong_id__"
            java.lang.String r1 = r8.getRequiredStringField(r6, r1)
            long r31 = X.C66580MXl.A08(r1)
            java.lang.String r1 = "text"
            java.lang.String r11 = r8.getRequiredStringField(r5, r1)
            java.lang.String r29 = r9.getUsername()
            java.lang.Class<X.69W> r10 = X.AnonymousClass69W.class
            r9 = 15
            java.lang.String r6 = "author"
            r1 = -1232598085(0xffffffffb6880bbb, float:-4.0544815E-6)
            X.3lr r9 = r8.getOptionalTreeField(r9, r6, r10, r1)
            if (r9 == 0) goto L_0x01e2
            java.lang.Class<X.69R> r6 = X.AnonymousClass69R.class
            r1 = -1791809412(0xffffffff9533287c, float:-3.61807E-26)
            X.3lr r9 = r9.reinterpretRequired(r5, r6, r1)
            if (r9 == 0) goto L_0x01e2
            java.lang.String r6 = "profile_pic_url"
            r1 = r19
            java.lang.String r25 = r9.getOptionalStringField(r1, r6)
            if (r25 == 0) goto L_0x01e2
            com.instagram.model.mediasize.ExtendedImageUrl r20 = new com.instagram.model.mediasize.ExtendedImageUrl
            r22 = r4
            r24 = r4
            r26 = r4
            r27 = r4
            r28 = r4
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x01a3:
            com.instagram.user.model.User r28 = X.AnonymousClass69P.A05(r3)
            boolean r33 = r12.A0I(r3, r7)
            r1 = 4
            X.0qQ.A0B(r11, r1)
            X.3t2 r1 = X.DbS.A0c(r7)
            boolean r1 = r1 instanceof X.C254773t1
            if (r1 == 0) goto L_0x014c
            X.7VU r10 = X.AnonymousClass7VT.A00(r3)
            X.3t2 r9 = X.DbS.A0c(r7)
            r1 = 30
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0qQ.A0C(r9, r1)
            X.3t1 r9 = (X.C254773t1) r9
            java.util.List r6 = X.DbW.A0m(r7)
            X.Pmt r1 = new X.Pmt
            r27 = r20
            r30 = r11
            r24 = r1
            r25 = r3
            r26 = r7
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r33)
            r10.A02(r9, r6, r1, r0)
            goto L_0x014c
        L_0x01e2:
            r20 = 0
            goto L_0x01a3
        L_0x01e5:
            boolean r5 = r2 instanceof X.C297815sO
            if (r5 == 0) goto L_0x056a
            r5 = r2
            X.5sO r5 = (X.C297815sO) r5
            java.lang.Object r9 = r5.A00
            r8 = r9
            X.4dm r8 = (X.C268654dm) r8
            boolean r5 = r8 instanceof X.C268664dn
            if (r5 == 0) goto L_0x0202
            com.instagram.direct.inbox.notes.NotesRepository r7 = r3.A06
            r5 = 0
            X.0qQ.A0B(r8, r5)
            X.4Cq r6 = r7.A01
            r5 = 41
            X.C73568Pfp.A02(r8, r7, r6, r5)
        L_0x0202:
            X.OJi r8 = r3.A0I
            int r7 = r3.A0G
            boolean r6 = r9 instanceof X.C268664dn
            if (r6 == 0) goto L_0x0236
            r3 = r9
            X.4dn r3 = (X.C268664dn) r3
            if (r3 == 0) goto L_0x0236
            java.lang.Throwable r5 = r3.A00
        L_0x0211:
            if (r6 == 0) goto L_0x0234
            X.4dn r9 = (X.C268664dn) r9
            if (r9 == 0) goto L_0x0234
            java.lang.Throwable r3 = r9.A00
            if (r3 == 0) goto L_0x0234
            java.lang.String r15 = r3.getMessage()
        L_0x021f:
            X.0qQ.A0B(r1, r0)
            X.37k r0 = r8.A00
            java.lang.String r11 = "notes"
            r8 = r0
            r9 = r4
            r10 = r4
            r12 = r11
            r13 = r4
            r14 = r1
            r16 = r5
            r17 = r7
            r8.EFu(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r2
        L_0x0234:
            r15 = r4
            goto L_0x021f
        L_0x0236:
            r5 = r4
            goto L_0x0211
        L_0x0238:
            java.lang.Object r8 = r6.A03
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r5 = r6.A02
            com.instagram.direct.inbox.notes.NotesApi r5 = (com.instagram.direct.inbox.notes.NotesApi) r5
            java.lang.Object r3 = r6.A01
            com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation r3 = (com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation) r3
            X.0eS.A00(r7)
            goto L_0x0260
        L_0x0248:
            X.0eS.A00(r7)
            com.instagram.direct.inbox.notes.NotesRepository r7 = r9.A06
            X.Gmu r3 = r9.A04
            java.lang.String r1 = r9.A0B
            r6.A01 = r9
            r6.A02 = r5
            r6.A03 = r8
            r6.A00 = r0
            java.lang.Object r1 = r7.A08(r3, r1, r8, r6)
            if (r1 == r2) goto L_0x056a
            r3 = r9
        L_0x0260:
            com.instagram.direct.inbox.notes.models.NoteStyle r1 = r3.A09
            r32 = r1
            java.lang.String r7 = X.AnonymousClass69P.A06(r32)
            java.util.List r1 = r3.A0E
            boolean r1 = com.instagram.direct.inbox.notes.NotesRepository.A04(r1)
            if (r1 == 0) goto L_0x0368
            java.lang.String r1 = "_with_pog_video"
        L_0x0272:
            java.lang.String r1 = X.002.A0R(r7, r1)
            java.lang.String r7 = r3.A0C
            r31 = r7
            com.instagram.direct.inbox.notes.models.NoteAudience r7 = r3.A07
            r30 = r7
            X.N3r r14 = r3.A08
            java.util.Iterator r16 = r8.iterator()
        L_0x0284:
            boolean r7 = r16.hasNext()
            if (r7 == 0) goto L_0x036c
            java.lang.Object r9 = r16.next()
            X.1Xj r9 = (X.1Xj) r9
            X.1iA r7 = r9.BR7()
            int r8 = r7.ordinal()
            r10 = 7
            if (r8 == r10) goto L_0x030b
            if (r8 == r0) goto L_0x02a1
            r7 = 0
            if (r8 == r7) goto L_0x02a1
            goto L_0x0284
        L_0x02a1:
            X.1Xy r7 = r9.A0C
            java.lang.String r8 = r7.getPk()
            r12 = 0
            if (r8 == 0) goto L_0x02c2
            java.lang.String r7 = "_"
            r9 = 0
            java.util.List r8 = X.DbV.A18(r8, r7)
            if (r8 == 0) goto L_0x02c2
            boolean r7 = r8.isEmpty()
            if (r7 != 0) goto L_0x02c2
            java.lang.String r7 = X.AnonymousClass7TE.A19(r8, r9)
            X.BBV r12 = new X.BBV
            r12.<init>(r7, r10)
        L_0x02c2:
            if (r14 == 0) goto L_0x02f0
            X.N38 r7 = r14.A08
            r17 = r7
            X.BBV r15 = r14.A05
            X.BBV r13 = r14.A03
            X.JV7 r11 = r14.A07
            X.Gmu r10 = r14.A02
            X.BBV r9 = r14.A04
            X.JwG r8 = r14.A00
            X.JwI r7 = r14.A01
            X.N3r r14 = new X.N3r
            r20 = r14
            r21 = r8
            r22 = r7
            r23 = r10
            r24 = r15
            r25 = r13
            r26 = r12
            r27 = r9
            r28 = r11
            r29 = r17
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x0284
        L_0x02f0:
            X.N3r r14 = new X.N3r
            r20 = r14
            r21 = r4
            r22 = r4
            r23 = r4
            r24 = r4
            r25 = r4
            r26 = r12
            r27 = r4
            r28 = r4
            r29 = r4
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x0284
        L_0x030b:
            X.1Xy r7 = r9.A0C
            java.lang.String r9 = r7.getPk()
            if (r9 == 0) goto L_0x0284
            r8 = 4
            if (r14 == 0) goto L_0x0348
            X.BBV r13 = new X.BBV
            r13.<init>(r9, r8)
            X.N38 r7 = r14.A08
            r17 = r7
            X.BBV r15 = r14.A05
            X.BBV r12 = r14.A06
            X.JV7 r11 = r14.A07
            X.Gmu r10 = r14.A02
            X.BBV r9 = r14.A04
            X.JwG r8 = r14.A00
            X.JwI r7 = r14.A01
            X.N3r r14 = new X.N3r
            r20 = r14
            r21 = r8
            r22 = r7
            r23 = r10
            r24 = r15
            r25 = r13
            r26 = r12
            r27 = r9
            r28 = r11
            r29 = r17
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x0284
        L_0x0348:
            X.BBV r7 = new X.BBV
            r7.<init>(r9, r8)
            X.N3r r14 = new X.N3r
            r20 = r14
            r21 = r4
            r22 = r4
            r23 = r4
            r24 = r4
            r25 = r7
            r26 = r4
            r27 = r4
            r28 = r4
            r29 = r4
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x0284
        L_0x0368:
            java.lang.String r1 = ""
            goto L_0x0272
        L_0x036c:
            boolean r7 = r3.A0J
            r18 = r7
            r6.A01 = r3
            r6.A02 = r1
            r6.A03 = r4
            r7 = r19
            r6.A00 = r7
            r20 = r4
            r17 = 0
            r12 = 0
            X.0K0 r16 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r9 = r4
            if (r14 == 0) goto L_0x056e
            r17 = r16
            X.N38 r11 = r14.A08
            r13 = 0
            if (r11 == 0) goto L_0x03e4
            X.2IV r10 = new X.2IV
            r10.<init>()
            java.lang.String r8 = r11.A05
            java.lang.String r7 = "audio_cluster_id"
            r10.A09(r8, r7)
            java.lang.String r8 = r11.A04
            java.lang.String r7 = "audio_asset_id"
            r10.A09(r8, r7)
            java.lang.String r8 = r11.A03
            r7 = 4445(0x115d, float:6.229E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r7)
            r10.A09(r8, r7)
            java.lang.Integer r8 = r11.A01
            java.lang.String r7 = "duration"
            r10.A07(r8, r7)
            java.lang.Integer r8 = r11.A02
            r7 = 789(0x315, float:1.106E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r7)
            r10.A07(r8, r7)
            java.lang.String r8 = r11.A06
            r7 = 134(0x86, float:1.88E-43)
            java.lang.String r7 = X.AnonymousClass000.A00(r7)
            r10.A09(r8, r7)
            java.lang.String r8 = r11.A07
            java.lang.String r7 = "original_author_id"
            r10.A09(r8, r7)
            java.lang.Boolean r8 = r11.A00
            java.lang.String r7 = "is_reshare_eligible"
            r10.A08(r7, r8)
            java.lang.String r8 = r11.A08
            java.lang.String r7 = "selected_lyrics"
            r10.A09(r8, r7)
            java.lang.String r7 = "music_note_create_info"
            X.0Df r12 = r16.A02()
            X.C66580MXl.A1M(r12, r10, r7)
        L_0x03e4:
            X.BBV r7 = r14.A06
            if (r7 == 0) goto L_0x03ff
            X.2IV r10 = new X.2IV
            r10.<init>()
            java.lang.String r8 = r7.A00
            java.lang.String r7 = "note_pog_media_id"
            r10.A09(r8, r7)
            java.lang.String r7 = "note_pog_video_create_info"
            if (r12 != 0) goto L_0x03fc
            X.0Df r12 = r16.A02()
        L_0x03fc:
            X.C66580MXl.A1M(r12, r10, r7)
        L_0x03ff:
            X.JV7 r11 = r14.A07
            if (r11 == 0) goto L_0x042a
            X.2IV r10 = new X.2IV
            r10.<init>()
            java.lang.String r8 = r11.A01
            java.lang.String r7 = "prompt_id"
            r10.A09(r8, r7)
            java.lang.Object r8 = r11.A00
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.String r7 = "prompt_source"
            r10.A07(r8, r7)
            java.lang.String r8 = r11.A02
            java.lang.String r7 = "prompt_text"
            r10.A09(r8, r7)
            java.lang.String r7 = "prompt_reply_note_create_info"
            if (r12 != 0) goto L_0x0427
            X.0Df r12 = r16.A02()
        L_0x0427:
            X.C66580MXl.A1M(r12, r10, r7)
        L_0x042a:
            X.Gmu r11 = r14.A02
            if (r11 == 0) goto L_0x0467
            X.2IV r10 = new X.2IV
            r10.<init>()
            float r7 = r11.A01
            double r7 = (double) r7
            java.lang.Double r15 = java.lang.Double.valueOf(r7)
            java.lang.String r8 = "longitude"
            X.0Df r7 = r10.A02()
            X.0Df.A00(r7, r15, r8)
            float r7 = r11.A00
            double r7 = (double) r7
            java.lang.Double r15 = java.lang.Double.valueOf(r7)
            java.lang.String r8 = "latitude"
            X.0Df r7 = r10.A02()
            X.0Df.A00(r7, r15, r8)
            java.lang.Object r8 = r11.A03
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            java.lang.String r7 = "is_lockable"
            r10.A08(r7, r8)
            java.lang.String r7 = "presence_note_create_info"
            if (r12 != 0) goto L_0x0464
            X.0Df r12 = r16.A02()
        L_0x0464:
            X.C66580MXl.A1M(r12, r10, r7)
        L_0x0467:
            X.BBV r7 = r14.A04
            if (r7 == 0) goto L_0x0482
            X.2IV r10 = new X.2IV
            r10.<init>()
            java.lang.String r8 = r7.A00
            java.lang.String r7 = "audio_cluster_id"
            r10.A09(r8, r7)
            java.lang.String r7 = "listening_now_create_info"
            if (r12 != 0) goto L_0x047f
            X.0Df r12 = r16.A02()
        L_0x047f:
            X.C66580MXl.A1M(r12, r10, r7)
        L_0x0482:
            X.JwG r7 = r14.A00
            if (r7 == 0) goto L_0x049f
            X.2IV r10 = new X.2IV
            r10.<init>()
            java.lang.Object r8 = r7.A00
            java.util.List r8 = (java.util.List) r8
            java.lang.String r7 = "invited_user_ids"
            r10.A05(r7, r8)
            java.lang.String r7 = "collab_note_create_info"
            if (r12 != 0) goto L_0x049c
            X.0Df r12 = r16.A02()
        L_0x049c:
            X.C66580MXl.A1M(r12, r10, r7)
        L_0x049f:
            X.JwI r7 = r14.A01
            if (r7 == 0) goto L_0x04d7
            X.2IV r8 = new X.2IV
            r8.<init>()
            X.2IV r10 = new X.2IV
            r10.<init>()
            java.lang.Object r14 = r7.A00
            X.Jvk r14 = (X.C61046Jvk) r14
            if (r14 == 0) goto L_0x056b
            java.lang.String r11 = r14.A00
        L_0x04b5:
            java.lang.String r7 = "gif_media_id"
            r10.A09(r11, r7)
            if (r14 == 0) goto L_0x04c2
            boolean r7 = r14.A01
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r7)
        L_0x04c2:
            java.lang.String r7 = "is_sticker"
            r10.A08(r7, r13)
            java.lang.String r7 = "gif_params"
            r8.A06(r10, r7)
            java.lang.String r7 = "gif_note_create_info"
            if (r12 != 0) goto L_0x04d4
            X.0Df r12 = r16.A02()
        L_0x04d4:
            X.C66580MXl.A1M(r12, r8, r7)
        L_0x04d7:
            r8 = 1
        L_0x04d8:
            java.lang.String r7 = "note_create_info"
            if (r8 == 0) goto L_0x04e9
            X.0Df r9 = r16.A02()
            if (r12 != 0) goto L_0x04e6
            X.0Df r12 = r17.A02()
        L_0x04e6:
            r9.A0E(r12, r7)
        L_0x04e9:
            r7 = r32
            int r7 = r7.A00
            java.lang.Integer r8 = X.JTO.A0w(r7)
            r7 = 845(0x34d, float:1.184E-42)
            java.lang.String r7 = X.C273654mx.A00(r7)
            if (r9 != 0) goto L_0x04fd
            X.0Df r9 = r16.A02()
        L_0x04fd:
            X.0Df.A00(r9, r8, r7)
            java.lang.String r8 = "text"
            r7 = r31
            X.0Df.A00(r9, r7, r8)
            if (r18 == 0) goto L_0x0512
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            java.lang.String r7 = "include_e2ee_mentioned_user_list"
            X.0Df.A00(r9, r8, r7)
        L_0x0512:
            X.2IS r10 = X.C41845B3m.A04()
            X.2IS r12 = X.C41845B3m.A04()
            r7 = r30
            int r7 = r7.A00
            java.lang.Integer r11 = X.JTO.A0w(r7)
            java.lang.String r8 = "audience"
            r7 = r16
            X.0Df r11 = X.C41845B3m.A03(r7, r11, r8)
            java.lang.String r8 = "note"
            java.lang.String r7 = "inbox_tray_item_type"
            X.0Df.A00(r11, r8, r7)
            java.lang.String r7 = "note_create_params"
            X.0Df r8 = r16.A02()
            r8.A0E(r9, r7)
            java.lang.String r7 = "additional_params"
            r11.A0E(r8, r7)
            java.lang.String r7 = "request"
            X.1vR r8 = X.C41847B3o.A04(r11, r10, r7)
            java.util.Map r10 = r10.getParamsCopy()
            java.util.Map r11 = r12.getParamsCopy()
            java.lang.Class<X.C7f> r12 = X.C43735C7f.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "CreateInboxTrayItemRequest"
            r15 = 96
            java.lang.String r17 = "xdt_create_inbox_tray_item"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r0
            r14 = r4
            r16 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1vn r5 = r5.A00
            java.lang.Object r7 = r5.A04(r7, r6)
            if (r7 != r2) goto L_0x003d
        L_0x056a:
            return r2
        L_0x056b:
            r11 = r4
            goto L_0x04b5
        L_0x056e:
            r8 = 0
            goto L_0x04d8
        L_0x0571:
            X.MED r6 = new X.MED
            r6.<init>(r9, r4, r3)
            goto L_0x001e
        L_0x0578:
            X.BiW r6 = r8.A0E()
            if (r6 == 0) goto L_0x0584
            java.lang.String r4 = "exception_cause"
            java.lang.String r4 = r6.A0A(r4)
        L_0x0584:
            X.BiW r8 = r8.A0E()
            if (r8 == 0) goto L_0x05b2
            java.lang.String r7 = "exception_message"
            r6 = r19
            java.lang.String r8 = r8.getOptionalStringField(r6, r7)
        L_0x0592:
            if (r4 == 0) goto L_0x05b5
            if (r8 == 0) goto L_0x05b5
            java.lang.Throwable r7 = new java.lang.Throwable
            r7.<init>(r4)
            java.lang.Throwable r6 = new java.lang.Throwable
            r6.<init>(r8, r7)
            X.4dn r9 = new X.4dn
            r9.<init>(r6)
            com.instagram.direct.inbox.notes.NotesRepository r8 = r3.A06
            X.0qQ.A0B(r9, r5)
            X.4Cq r7 = r8.A01
            r6 = 41
            X.C73568Pfp.A02(r9, r8, r7, r6)
            goto L_0x05b7
        L_0x05b2:
            r8 = r20
            goto L_0x0592
        L_0x05b5:
            r9 = r20
        L_0x05b7:
            X.OJi r8 = r3.A0I
            int r7 = r3.A0G
            if (r9 == 0) goto L_0x05dc
            java.lang.Throwable r6 = r9.A00
        L_0x05bf:
            X.0qQ.A0B(r1, r0)
            X.37k r0 = r8.A00
            java.lang.String r22 = "notes"
            r19 = r0
            r21 = r20
            r23 = r22
            r24 = r20
            r25 = r1
            r26 = r4
            r27 = r6
            r28 = r7
            r19.EFu(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r3.A02 = r5
            return r2
        L_0x05dc:
            r6 = r20
            goto L_0x05bf
        L_0x05df:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation.A02(com.instagram.direct.inbox.notes.NotesApi, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GraphqlOptimisticPostOperation(Context context, UserSession userSession, NotesApi notesApi, NotesRepository notesRepository, NoteAudience noteAudience, C68176N3r n3r, NoteCreationSource noteCreationSource, NoteStyle noteStyle, 17i r10, String str, String str2, List list, C262224Cq r14, int i, boolean z) {
        super(notesApi);
        C53370Gmu gmu;
        C51972G9s.A1C(notesApi, r10);
        C51974G9v.A1Q(r14, str, noteAudience, noteStyle);
        0qQ.A0B(noteCreationSource, 11);
        0qQ.A0B(list, 14);
        this.A0G = i;
        this.A0H = notesApi;
        this.A06 = notesRepository;
        this.A0A = r10;
        this.A05 = userSession;
        this.A03 = context;
        this.A0F = r14;
        this.A0C = str;
        this.A07 = noteAudience;
        this.A09 = noteStyle;
        this.A08 = n3r;
        this.A0B = str2;
        this.A0E = list;
        this.A0J = z;
        this.A0I = new OJi(context, userSession);
        if (n3r != null) {
            gmu = n3r.A02;
        } else {
            gmu = null;
        }
        this.A04 = gmu;
    }
}
