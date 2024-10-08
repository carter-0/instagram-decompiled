package com.instagram.comments.mvvm.data.network;

import X.00p;
import X.0mp;
import X.11S;
import X.17M;
import X.1Xj;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass8OY;
import X.C247733gp;
import X.C354958Oa;
import X.C65211bM;
import X.DDf;
import X.DbT;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.regex.Matcher;

public abstract class CommentPostingRequestExtensionsKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: X.572} */
    /* JADX WARNING: type inference failed for: r6v1, types: [X.Il5, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01ec, code lost:
        if (r13 == r12) goto L_0x01ee;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.api.schemas.CommentGiphyMediaInfo r25, X.C53335GmL r26, X.C53285GlX r27, com.instagram.common.session.UserSession r28, X.AnonymousClass571 r29, X.AnonymousClass572 r30, X.1Xj r31, X.1Xl r32, java.lang.String r33, java.lang.String r34, X.AnonymousClass4D7 r35) {
        /*
            r1 = r27
            r7 = r28
            r5 = r31
            r8 = r33
            r11 = r32
            r9 = r26
            r3 = r25
            r4 = r29
            r17 = r30
            r10 = r34
            r18 = 0
            r13 = r35
            boolean r0 = r13 instanceof X.C58073Il5
            if (r0 == 0) goto L_0x01ef
            r6 = r13
            X.Il5 r6 = (X.C58073Il5) r6
            int r2 = r6.A0C
            r0 = r18
            if (r2 != r0) goto L_0x01ef
            int r12 = r6.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r12 & r2
            if (r0 == 0) goto L_0x01ef
            int r12 = r12 - r2
            r6.A00 = r12
        L_0x0030:
            java.lang.Object r13 = r6.A03
            X.1Hj r12 = X.1Hj.A02
            int r0 = r6.A00
            r2 = 1
            if (r0 == 0) goto L_0x018a
            if (r0 != r2) goto L_0x01fb
            java.lang.Object r10 = r6.A0B
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r0 = r6.A0A
            r17 = r0
            r0 = r17
            X.572 r0 = (X.AnonymousClass572) r0
            r17 = r0
            java.lang.Object r4 = r6.A09
            X.571 r4 = (X.AnonymousClass571) r4
            java.lang.Object r3 = r6.A08
            com.instagram.api.schemas.CommentGiphyMediaInfo r3 = (com.instagram.api.schemas.CommentGiphyMediaInfo) r3
            java.lang.Object r9 = r6.A07
            X.GmL r9 = (X.C53335GmL) r9
            java.lang.Object r11 = r6.A06
            X.1Xl r11 = (X.1Xl) r11
            java.lang.Object r8 = r6.A05
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r5 = r6.A04
            X.1Xj r5 = (X.1Xj) r5
            java.lang.Object r7 = r6.A02
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            java.lang.Object r1 = r6.A01
            X.GlX r1 = (X.C53285GlX) r1
            X.0eS.A00(r13)
        L_0x006c:
            r12 = r13
            X.3Ii r12 = (X.C239803Ii) r12
            boolean r0 = r12 instanceof X.C239793Ih
            r14 = 0
            if (r0 == 0) goto L_0x0086
            X.3Ih r12 = (X.C239793Ih) r12
            java.lang.Object r0 = r12.A00
            X.GyR r0 = (X.C54042GyR) r0
            X.JRc r0 = r0.A00
            if (r0 != 0) goto L_0x008f
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0086:
            boolean r0 = r12 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00ba
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008f:
            X.1E4.A00(r7)
            X.Gos r0 = (X.C53460Gos) r0
            X.1E4.A00(r7)
            X.1bK r12 = r0.A00
            if (r12 == 0) goto L_0x0187
            java.lang.String r0 = r12.A0r
            if (r0 == 0) goto L_0x0187
            if (r5 == 0) goto L_0x00aa
            boolean r0 = r5.A67()
            if (r0 != r2) goto L_0x00aa
            X.JZW.A03(r12, r5)
        L_0x00aa:
            X.3gp r6 = new X.3gp
            r6.<init>(r12)
            r5 = 21
            X.JwJ r0 = new X.JwJ
            r0.<init>((java.lang.String) r14, (java.lang.Object) r6, (int) r5)
        L_0x00b6:
            X.3Ih r12 = X.C41845B3m.A0d(r0)
        L_0x00ba:
            boolean r0 = r12 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x01ee
            boolean r0 = r12 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01f6
            X.5sO r12 = (X.C297815sO) r12
            java.lang.Object r0 = r12.A00
            X.4dm r0 = (X.C268654dm) r0
            java.lang.Object r13 = r0.A00()
            X.1XT r13 = (X.AnonymousClass1XT) r13
            X.0Ym r6 = new X.0Ym
            r6.<init>()
            if (r13 == 0) goto L_0x00e2
            int r5 = r13.getStatusCode()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r5)
            java.lang.String r14 = r0.toString()
        L_0x00e2:
            java.lang.String r12 = ""
            r26 = r12
            if (r14 != 0) goto L_0x00e9
            r14 = r12
        L_0x00e9:
            java.lang.String r0 = "error_code"
            r6.put(r0, r14)
            java.lang.String r5 = "error_key"
            java.lang.String r0 = "comment_client_error"
            r6.put(r5, r0)
            if (r13 == 0) goto L_0x00fe
            java.lang.String r0 = r13.getErrorMessage()
            if (r0 == 0) goto L_0x00fe
            r12 = r0
        L_0x00fe:
            java.lang.String r0 = "error_message"
            r6.put(r0, r12)
            java.lang.String r5 = r9.A0E
            java.lang.String r0 = "m_pk"
            r6.put(r0, r5)
            X.0Ym r12 = X.0se.A0N(r6)
            X.1Yd r6 = X.HWC.A00()
            java.lang.String r5 = "latest_comment_posting_error"
            X.ODK r0 = new X.ODK
            r0.<init>(r5, r12)
            X.1Yc r6 = (X.C64901Yc) r6
            r6.A00 = r0
            java.lang.String r12 = r1.A03
            X.1Xj r29 = r11.BPf()
            long r5 = r1.A01
            int r0 = r1.A00
            r27 = r3
            r28 = r7
            r30 = r12
            r31 = r10
            r32 = r0
            r33 = r5
            X.3gp r28 = A00(r27, r28, r29, r30, r31, r32, r33)
            java.lang.String r30 = X.C61970qY.A07()
            boolean r10 = r9.A0W
            boolean r6 = r9.A0b
            java.lang.Integer r0 = r9.A06
            int r31 = X.DbX.A02(r0)
            java.lang.Integer r0 = r9.A04
            int r32 = X.DbX.A02(r0)
            java.lang.Integer r0 = r9.A07
            int r33 = X.DbX.A02(r0)
            X.I0n r5 = new X.I0n
            r29 = r8
            r34 = r10
            r35 = r6
            r27 = r5
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35)
            X.2fB r0 = X.C225942fB.A00(r7)
            r0.A0L(r5)
            X.0sn r29 = X.0sn.A00
            r24 = 0
            java.lang.Integer r25 = X.AnonymousClass05K.A0C
            X.7a4 r0 = r1.A02
            X.7fv r19 = new X.7fv
            r27 = r24
            r28 = r24
            r30 = r2
            r31 = r18
            r20 = r3
            r21 = r0
            r22 = r4
            r23 = r17
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.5sO r12 = X.C41845B3m.A0c(r19)
            return r12
        L_0x0187:
            r0 = r14
            goto L_0x00b6
        L_0x018a:
            X.0eS.A00(r13)
            X.1yr r0 = X.1yr.A00(r7)
            java.lang.String r14 = r1.A03
            r0.A04(r14)
            java.lang.String r0 = r1.A04
            A04(r7, r14, r0)
            X.1Xj r0 = r11.BPf()
            X.1Xj r0 = r0.A1e(r7)
            java.lang.String r16 = r0.getId()
            X.1NY r13 = X.AnonymousClass7TG.A0a(r7)
            r0 = r18
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r15 = r0
            r0 = 3006(0xbbe, float:4.212E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.DbU.A1P(r13, r0, r15)
            java.lang.Class<X.GyR> r15 = X.C54042GyR.class
            java.lang.Class<X.Huh> r0 = X.C56214Huh.class
            r13.A0Q(r15, r0)
            java.lang.String r0 = "comment_text"
            r13.A9m(r0, r14)
            java.lang.String r14 = "media_id"
            r0 = r16
            r13.A9m(r14, r0)
            X.1OC r13 = X.DbT.A0U(r13, r2)
            r6.A01 = r1
            r6.A02 = r7
            r6.A04 = r5
            r6.A05 = r8
            r6.A06 = r11
            r6.A07 = r9
            r6.A08 = r3
            r6.A09 = r4
            r0 = r17
            r6.A0A = r0
            r6.A0B = r10
            r6.A00 = r2
            java.lang.Object r13 = r13.A01(r6)
            if (r13 != r12) goto L_0x006c
        L_0x01ee:
            return r12
        L_0x01ef:
            X.Il5 r6 = new X.Il5
            r6.<init>(r13)
            goto L_0x0030
        L_0x01f6:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01fb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.network.CommentPostingRequestExtensionsKt.A01(com.instagram.api.schemas.CommentGiphyMediaInfo, X.GmL, X.GlX, com.instagram.common.session.UserSession, X.571, X.572, X.1Xj, X.1Xl, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: X.572} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: X.1Xl} */
    /* JADX WARNING: type inference failed for: r12v1, types: [X.JUK, X.4D7] */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: type inference failed for: r12v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.api.schemas.CommentGiphyMediaInfo r24, X.C53335GmL r25, X.C53285GlX r26, com.instagram.common.session.UserSession r27, X.AnonymousClass571 r28, X.AnonymousClass572 r29, X.1Xl r30, java.lang.String r31, java.lang.String r32, X.AnonymousClass4D7 r33) {
        /*
            r2 = r26
            r5 = r27
            r6 = r31
            r22 = r30
            r7 = r25
            r1 = r24
            r0 = r28
            r23 = r29
            r9 = r32
            r3 = 5
            r10 = r33
            boolean r3 = X.JUK.A02(r3, r10)
            if (r3 == 0) goto L_0x03cf
            r12 = r10
            X.JUK r12 = (X.JUK) r12
            int r8 = r12.A00
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r8 & r4
            if (r3 == 0) goto L_0x03cf
            int r8 = r8 - r4
            r12.A00 = r8
        L_0x0029:
            java.lang.Object r4 = r12.A0A
            X.1Hj r25 = X.1Hj.A02
            int r3 = r12.A00
            r24 = 1
            r11 = 0
            if (r3 == 0) goto L_0x01af
            r0 = r24
            if (r3 != r0) goto L_0x03db
            java.lang.Object r9 = r12.A09
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r12.A08
            r23 = r0
            r0 = r23
            X.572 r0 = (X.AnonymousClass572) r0
            r23 = r0
            java.lang.Object r0 = r12.A07
            X.571 r0 = (X.AnonymousClass571) r0
            java.lang.Object r1 = r12.A06
            com.instagram.api.schemas.CommentGiphyMediaInfo r1 = (com.instagram.api.schemas.CommentGiphyMediaInfo) r1
            java.lang.Object r7 = r12.A05
            X.GmL r7 = (X.C53335GmL) r7
            java.lang.Object r2 = r12.A04
            r22 = r2
            r2 = r22
            X.1Xl r2 = (X.1Xl) r2
            r22 = r2
            java.lang.Object r6 = r12.A03
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r12.A02
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r2 = r12.A01
            X.GlX r2 = (X.C53285GlX) r2
            X.0eS.A00(r4)
        L_0x006b:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r3 = r4 instanceof X.C239793Ih
            if (r3 == 0) goto L_0x01a6
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r8 = r4.A00
            X.Gyu r8 = (X.C54071Gyu) r8
            X.1bK r4 = r8.A00
            if (r4 == 0) goto L_0x01a3
            java.lang.String r3 = r4.A0r
            if (r3 == 0) goto L_0x01a3
            java.lang.String r10 = r8.A01
            X.3gp r8 = new X.3gp
            r8.<init>(r4)
            r4 = 21
            X.JwJ r3 = new X.JwJ
            r3.<init>((java.lang.String) r10, (java.lang.Object) r8, (int) r4)
        L_0x008d:
            X.3Ih r4 = X.C41845B3m.A0d(r3)
        L_0x0091:
            boolean r3 = r4 instanceof X.C239793Ih
            if (r3 != 0) goto L_0x013c
            boolean r3 = r4 instanceof X.C297815sO
            if (r3 == 0) goto L_0x03d6
            X.5sO r4 = (X.C297815sO) r4
            java.lang.Object r3 = r4.A00
            X.4dm r3 = (X.C268654dm) r3
            java.lang.Object r8 = r3.A00()
            X.Gyu r8 = (X.C54071Gyu) r8
            X.0Ym r10 = new X.0Ym
            r10.<init>()
            if (r8 == 0) goto L_0x00b7
            int r4 = r8.mStatusCode
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r4)
            java.lang.String r11 = r3.toString()
        L_0x00b7:
            java.lang.String r12 = ""
            r16 = r12
            if (r11 != 0) goto L_0x00be
            r11 = r12
        L_0x00be:
            java.lang.String r3 = "error_code"
            r10.put(r3, r11)
            java.lang.String r13 = "comment_client_error"
            if (r8 == 0) goto L_0x00d1
            java.lang.String r4 = r8.A02
            if (r4 == 0) goto L_0x00d1
            int r3 = r4.length()
            if (r3 != 0) goto L_0x00d2
        L_0x00d1:
            r4 = r13
        L_0x00d2:
            java.lang.String r3 = "error_key"
            r10.put(r3, r4)
            if (r8 == 0) goto L_0x00e0
            java.lang.String r3 = r8.getErrorMessage()
            if (r3 == 0) goto L_0x00e0
            r12 = r3
        L_0x00e0:
            java.lang.String r3 = "error_message"
            r10.put(r3, r12)
            java.lang.String r4 = r7.A0E
            java.lang.String r3 = "m_pk"
            r10.put(r3, r4)
            X.0Ym r11 = X.0se.A0N(r10)
            X.1Yd r10 = X.HWC.A00()
            java.lang.String r4 = "latest_comment_posting_error"
            X.ODK r3 = new X.ODK
            r3.<init>(r4, r11)
            X.1Yc r10 = (X.C64901Yc) r10
            r10.A00 = r3
            if (r8 == 0) goto L_0x013d
            java.lang.String r6 = r8.A04
            java.util.List r5 = r8.A06
            if (r5 != 0) goto L_0x0109
            X.0sn r5 = X.0sn.A00
        L_0x0109:
            java.lang.String r3 = r8.A03
            java.lang.Integer r14 = X.C54992HaP.A00(r3)
            java.lang.String r3 = r8.A05
            java.lang.Integer r15 = X.C54991HaO.A00(r3)
            X.7a4 r4 = r2.A02
            r20 = 0
            int r2 = r8.mStatusCode
            java.lang.String r17 = java.lang.String.valueOf(r2)
            java.lang.String r3 = r8.A02
            if (r3 != 0) goto L_0x0124
            r3 = r13
        L_0x0124:
            boolean r2 = r8.A07
            X.7fv r9 = new X.7fv
            r10 = r1
            r11 = r4
            r12 = r0
            r13 = r23
            r16 = r6
            r18 = r3
            r19 = r5
            r21 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0138:
            X.5sO r4 = X.C41845B3m.A0c(r9)
        L_0x013c:
            return r4
        L_0x013d:
            java.lang.String r10 = r2.A03
            X.1Xj r27 = r22.BPf()
            long r3 = r2.A01
            int r8 = r2.A00
            r25 = r1
            r26 = r5
            r28 = r10
            r29 = r9
            r30 = r8
            r31 = r3
            X.3gp r26 = A00(r25, r26, r27, r28, r29, r30, r31)
            java.lang.String r28 = X.C61970qY.A07()
            boolean r9 = r7.A0W
            boolean r8 = r7.A0b
            java.lang.Integer r3 = r7.A06
            r31 = -1
            int r29 = X.DbX.A02(r3)
            java.lang.Integer r3 = r7.A04
            int r30 = X.DbX.A02(r3)
            java.lang.Integer r3 = r7.A07
            if (r3 == 0) goto L_0x0175
            int r31 = r3.intValue()
        L_0x0175:
            r21 = 0
            X.I0n r4 = new X.I0n
            r25 = r4
            r27 = r6
            r32 = r9
            r33 = r8
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            X.2fB r3 = X.C225942fB.A00(r5)
            r3.A0L(r4)
            X.0sn r19 = X.0sn.A00
            r14 = 0
            java.lang.Integer r15 = X.AnonymousClass05K.A0C
            X.7a4 r2 = r2.A02
            X.7fv r9 = new X.7fv
            r10 = r1
            r11 = r2
            r12 = r0
            r13 = r23
            r17 = r14
            r18 = r14
            r20 = r24
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0138
        L_0x01a3:
            r3 = r11
            goto L_0x008d
        L_0x01a6:
            boolean r3 = r4 instanceof X.C297815sO
            if (r3 != 0) goto L_0x0091
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01af:
            X.0eS.A00(r4)
            X.1yr r3 = X.1yr.A00(r5)
            java.lang.String r13 = r2.A03
            r3.A04(r13)
            java.lang.String r3 = r2.A04
            r26 = r3
            A04(r5, r13, r3)
            X.1Xj r3 = r22.BPf()
            X.1Xj r21 = r3.A1e(r5)
            X.7a4 r3 = r2.A02
            if (r3 == 0) goto L_0x025f
            java.util.List r20 = r3.A00()
        L_0x01d2:
            r10 = 0
            r19 = 0
            X.1NY r8 = X.AnonymousClass7TG.A0a(r5)
            java.lang.Object[] r4 = X.C51969G9p.A1b(r21)
            java.lang.String r3 = "media/%s/comment/"
            X.DbU.A1P(r8, r3, r4)
            java.lang.Class<X.Gyu> r4 = X.C54071Gyu.class
            java.lang.Class<X.Hwb> r3 = X.C56324Hwb.class
            r8.A0O(r11, r4, r3, r10)
            java.lang.String r3 = "comment_text"
            r8.A9m(r3, r13)
            r3 = 300(0x12c, float:4.2E-43)
            java.lang.String r4 = X.AnonymousClass000.A00(r3)
            r3 = r26
            r8.A9m(r4, r3)
            int r14 = r13.length()
            long r3 = r2.A01
            int r13 = r2.A00
            java.lang.String r4 = X.C11155SCk.A00(r3, r14, r13)
            r3 = 1916(0x77c, float:2.685E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            X.C51968G9o.A1L(r8, r3, r4, r6)
            java.lang.String r4 = X.C61970qY.A07()
            java.lang.String r3 = "radio_type"
            r8.A9m(r3, r4)
            java.lang.String r3 = "replied_to_comment_id"
            r8.A9m(r3, r9)
            boolean r4 = r7.A0W
            java.lang.String r3 = "is_carousel_bumped_post"
            r8.A0H(r3, r4)
            java.lang.String r4 = X.C51965G9l.A0t(r21)
            java.lang.String r3 = "inventory_source"
            r8.A0G(r3, r4)
            java.lang.String r4 = X.DbS.A0k()
            java.lang.String r3 = "nav_chain"
            r8.A0G(r3, r4)
            java.lang.String r4 = X.DbT.A0x(r21)
            java.lang.String r3 = "logging_info_token"
            r8.A0G(r3, r4)
            r3 = r21
            X.1Xy r3 = r3.A0C
            X.DUd r3 = r3.Bmy()
            if (r3 == 0) goto L_0x025d
            java.lang.String r4 = r3.Bmx()
        L_0x024c:
            java.lang.String r3 = "repost_id"
            r8.A0G(r3, r4)
            r4 = 0
            if (r1 == 0) goto L_0x0273
            java.lang.String r14 = r1.A03
            java.lang.Boolean r3 = r1.A02
            if (r14 == 0) goto L_0x0273
            if (r3 == 0) goto L_0x0273
            goto L_0x0263
        L_0x025d:
            r4 = r11
            goto L_0x024c
        L_0x025f:
            r20 = r11
            goto L_0x01d2
        L_0x0263:
            java.io.StringWriter r13 = new java.io.StringWriter     // Catch:{ IOException | NullPointerException -> 0x0273 }
            r13.<init>()     // Catch:{ IOException | NullPointerException -> 0x0273 }
            android.util.JsonWriter r3 = X.G9w.A09(r13, r3, r14)     // Catch:{ IOException | NullPointerException -> 0x0273 }
            r3.close()     // Catch:{ IOException | NullPointerException -> 0x0273 }
            java.lang.String r4 = r13.toString()     // Catch:{ IOException | NullPointerException -> 0x0273 }
        L_0x0273:
            java.lang.String r3 = "gif_params"
            r8.A0G(r3, r4)
            java.lang.String r18 = "avatar_comment_post_error"
            r4 = 0
            if (r28 == 0) goto L_0x02c4
            java.lang.String r15 = r0.A05
            java.lang.String r14 = r0.A06
            com.instagram.api.schemas.MediaType r13 = r0.A00
            java.lang.Integer r3 = r0.A01
            r17 = r3
            if (r15 == 0) goto L_0x02c4
            if (r14 == 0) goto L_0x02c4
            if (r13 == 0) goto L_0x02c4
            if (r3 == 0) goto L_0x02c4
            java.io.StringWriter r16 = new java.io.StringWriter     // Catch:{ IOException -> 0x02b7, NullPointerException -> 0x02be }
            r16.<init>()     // Catch:{ IOException -> 0x02b7, NullPointerException -> 0x02be }
            r3 = r16
            android.util.JsonWriter r13 = X.G9w.A08(r13, r0, r3, r15, r14)     // Catch:{ IOException -> 0x02b7, NullPointerException -> 0x02be }
            int r3 = r17.intValue()     // Catch:{ IOException -> 0x02b7, NullPointerException -> 0x02be }
            int r3 = 1 - r3
            if (r3 == 0) goto L_0x02b4
            java.lang.String r3 = "COMMENTS_CONTEXTUAL_RECOMMENDATION"
        L_0x02a4:
            android.util.JsonWriter r3 = r13.value(r3)     // Catch:{ IOException -> 0x02b7, NullPointerException -> 0x02be }
            android.util.JsonWriter r3 = r3.endObject()     // Catch:{ IOException -> 0x02b7, NullPointerException -> 0x02be }
            r3.close()     // Catch:{ IOException -> 0x02b7, NullPointerException -> 0x02be }
            java.lang.String r4 = r16.toString()     // Catch:{ IOException -> 0x02b7, NullPointerException -> 0x02be }
            goto L_0x02c4
        L_0x02b4:
            java.lang.String r3 = "COMMENTS"
            goto L_0x02a4
        L_0x02b7:
            r13 = move-exception
            r3 = r18
            X.0wb.A07(r3, r13)
            goto L_0x02c4
        L_0x02be:
            r13 = move-exception
            r3 = r18
            X.0wb.A07(r3, r13)
        L_0x02c4:
            java.lang.String r3 = "avatar_params"
            r8.A0G(r3, r4)
            java.lang.String r13 = "imagine_create_comment_post_error"
            r4 = 0
            if (r29 == 0) goto L_0x02fc
            java.io.StringWriter r14 = new java.io.StringWriter     // Catch:{ IOException | NullPointerException -> 0x02f8 }
            r14.<init>()     // Catch:{ IOException | NullPointerException -> 0x02f8 }
            android.util.JsonWriter r3 = new android.util.JsonWriter     // Catch:{ IOException | NullPointerException -> 0x02f8 }
            r3.<init>(r14)     // Catch:{ IOException | NullPointerException -> 0x02f8 }
            android.util.JsonWriter r15 = r3.beginObject()     // Catch:{ IOException | NullPointerException -> 0x02f8 }
            java.lang.String r3 = "imagine_create_ent_id"
            android.util.JsonWriter r15 = r15.name(r3)     // Catch:{ IOException | NullPointerException -> 0x02f8 }
            r3 = r23
            java.lang.String r3 = r3.A00     // Catch:{ IOException | NullPointerException -> 0x02f8 }
            android.util.JsonWriter r3 = r15.value(r3)     // Catch:{ IOException | NullPointerException -> 0x02f8 }
            android.util.JsonWriter r3 = r3.endObject()     // Catch:{ IOException | NullPointerException -> 0x02f8 }
            if (r3 == 0) goto L_0x02f3
            r3.close()     // Catch:{ IOException | NullPointerException -> 0x02f8 }
        L_0x02f3:
            java.lang.String r4 = r14.toString()     // Catch:{ IOException | NullPointerException -> 0x02f8 }
            goto L_0x02fc
        L_0x02f8:
            r3 = move-exception
            X.0wb.A07(r13, r3)
        L_0x02fc:
            java.lang.String r3 = "imagine_create_params"
            r8.A0G(r3, r4)
            java.lang.String r4 = r7.A0H
            java.lang.String r3 = "starting_clips_media_id"
            r8.A0G(r3, r4)
            java.lang.String r4 = r7.A0I
            java.lang.String r3 = "starting_clips_ranking_token"
            r8.A0G(r3, r4)
            java.lang.Integer r3 = r7.A06
            if (r3 == 0) goto L_0x031c
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "feed_position"
            r8.A9m(r3, r4)
        L_0x031c:
            r21.A2L()
            r21.A2L()
            java.lang.Integer r3 = r21.A2L()
            java.lang.String r4 = X.C2606846q.A00(r3)
            java.lang.String r3 = "delivery_class"
            r8.A9m(r3, r4)
            boolean r3 = r21.CcK()
            if (r3 == 0) goto L_0x033e
            java.lang.String r4 = r21.A2v()
            java.lang.String r3 = "tracking_token"
            r8.A0G(r3, r4)
        L_0x033e:
            java.lang.Integer r3 = r7.A07
            if (r3 == 0) goto L_0x034b
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "recs_ix"
            r8.A9m(r3, r4)
        L_0x034b:
            java.lang.Integer r3 = r7.A04
            if (r3 == 0) goto L_0x0358
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "carousel_index"
            r8.A9m(r3, r4)
        L_0x0358:
            X.0Tu r15 = X.0Tu.A05
            r3 = 36323328696396889(0x810be000022c59, double:3.034357557681668E-306)
            boolean r14 = X.182.A06(r15, r5, r3)
            java.lang.String r13 = "include_carousel_child_mentions"
            r8.A0H(r13, r14)
            boolean r3 = X.182.A06(r15, r5, r3)
            if (r3 == 0) goto L_0x0373
            boolean r3 = r7.A0b
            if (r3 == 0) goto L_0x0373
            r10 = 1
        L_0x0373:
            r3 = 674(0x2a2, float:9.44E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r8.A0H(r3, r10)
            if (r20 == 0) goto L_0x0382
            java.lang.String r19 = r20.toString()
        L_0x0382:
            r3 = 541(0x21d, float:7.58E-43)
            java.lang.String r4 = X.AnonymousClass000.A00(r3)
            r3 = r19
            r8.A0G(r4, r3)
            java.lang.String r4 = "comment_creation_key"
            r3 = r26
            r8.A9m(r4, r3)
            r3 = 338(0x152, float:4.74E-43)
            java.lang.String r3 = X.C66579MXk.A00(r3)
            java.lang.String r4 = "true"
            r8.A9m(r3, r4)
            java.lang.String r3 = "include_media_code"
            r8.A9m(r3, r4)
            r3 = r24
            X.1OC r8 = X.DbT.A0U(r8, r3)
            r12.A01 = r2
            r12.A02 = r5
            r12.A03 = r6
            r3 = r22
            r12.A04 = r3
            r12.A05 = r7
            r12.A06 = r1
            r12.A07 = r0
            r3 = r23
            r12.A08 = r3
            r12.A09 = r9
            r3 = r24
            r12.A00 = r3
            r4 = r25
            java.lang.Object r8 = r8.A01(r12)
            if (r8 == r4) goto L_0x013c
            r4 = r8
            goto L_0x006b
        L_0x03cf:
            X.JUK r12 = new X.JUK
            r12.<init>(r10)
            goto L_0x0029
        L_0x03d6:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x03db:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.network.CommentPostingRequestExtensionsKt.A02(com.instagram.api.schemas.CommentGiphyMediaInfo, X.GmL, X.GlX, com.instagram.common.session.UserSession, X.571, X.572, X.1Xl, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.JUG, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v19, types: [X.7ft, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(X.C53285GlX r7, com.instagram.common.session.UserSession r8, X.1Xl r9, java.lang.String r10, X.AnonymousClass4D7 r11) {
        /*
            r3 = 35
            boolean r0 = X.JUG.A03(r3, r11)
            if (r0 == 0) goto L_0x00bb
            r4 = r11
            X.JUG r4 = (X.JUG) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00bb
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L_0x0078
            if (r0 != r3) goto L_0x00c7
            java.lang.Object r8 = r4.A01
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            X.0eS.A00(r1)
        L_0x0028:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x006f
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r5 = r1.A00
            X.Gyt r5 = (X.C54070Gyt) r5
            X.Dba.A0j(r3, r8, r5)
            long r2 = r5.A00
            X.0xY r1 = X.AnonymousClass7TF.A0N(r8)
            r0 = 1209(0x4b9, float:1.694E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.E5c(r0, r2)
            r1.apply()
            boolean r4 = r5.A04
            java.lang.String r3 = r5.A03
            java.lang.Integer r2 = r5.A02
            X.HMR r1 = r5.A01
            X.7ft r0 = new X.7ft
            r0.<init>()
            r0.A03 = r4
            r0.A02 = r3
            r0.A01 = r2
            r0.A00 = r1
            X.3Ih r1 = X.C41845B3m.A0d(r0)
        L_0x0062:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x006e
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00c2
            X.5sO r1 = X.DbU.A0f()
        L_0x006e:
            return r1
        L_0x006f:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0062
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0078:
            X.0eS.A00(r1)
            java.lang.String r7 = r7.A03
            X.1Xj r0 = r9.BPf()
            java.lang.String r6 = r0.getId()
            X.1NY r2 = X.AnonymousClass7TG.A0a(r8)
            r0 = 3553(0xde1, float:4.979E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0A(r0)
            java.lang.Class<X.Gyt> r1 = X.C54070Gyt.class
            java.lang.Class<X.HwZ> r0 = X.C56322HwZ.class
            r2.A0Q(r1, r0)
            java.lang.String r0 = "comment_text"
            r2.A9m(r0, r7)
            java.lang.String r0 = "media_id"
            r2.A0G(r0, r6)
            r0 = 2905(0xb59, float:4.071E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A9m(r0, r10)
            X.1OC r0 = X.DbT.A0U(r2, r3)
            r4.A01 = r8
            r4.A00 = r3
            java.lang.Object r1 = r0.A01(r4)
            if (r1 != r5) goto L_0x0028
            return r5
        L_0x00bb:
            X.JUG r4 = new X.JUG
            r4.<init>(r3, r11)
            goto L_0x0016
        L_0x00c2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00c7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.network.CommentPostingRequestExtensionsKt.A03(X.GlX, com.instagram.common.session.UserSession, X.1Xl, java.lang.String, X.4D7):java.lang.Object");
    }

    public static final C247733gp A00(CommentGiphyMediaInfo commentGiphyMediaInfo, UserSession userSession, 1Xj r7, String str, String str2, int i, long j) {
        Boolean bool;
        long max = Math.max(r7.A18() + 1, AnonymousClass7TG.A0I());
        DDf A00 = C65211bM.A00.A00();
        A00.A0t = new 11S("\\n{2,}").A00(str, "\n");
        A00.A09 = DbT.A0j(userSession);
        A00.A0g = Long.valueOf(max);
        User A2A = r7.A2A(userSession);
        if (A2A != null) {
            bool = Boolean.valueOf(AnonymousClass7TF.A1W(A2A.A02, 17M.A06));
        } else {
            bool = null;
        }
        A00.A0U = bool;
        A00.A0s = str2;
        A00.A0q = str2;
        A00.A02 = commentGiphyMediaInfo;
        A00.A0n = r7.getId();
        C247733gp r0 = new C247733gp(A00.A02());
        r0.A02(r7);
        r0.A04 = j;
        r0.A00 = i;
        return r0;
    }

    public static final void A04(UserSession userSession, String str, String str2) {
        Matcher A09 = 0mp.A09(str);
        ArrayList A1C = AnonymousClass7TE.A1C();
        while (A09.find()) {
            String group = A09.group(1);
            if (group != null) {
                A1C.add(00p.A0g(group, "@", "", false));
            }
        }
        C354958Oa A00 = AnonymousClass8OY.A00(userSession);
        if (DbT.A1b(A1C)) {
            A00.A01(str2, A1C);
        }
    }
}
