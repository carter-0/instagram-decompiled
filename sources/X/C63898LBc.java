package X;

/* renamed from: X.LBc  reason: case insensitive filesystem */
public final class C63898LBc {
    /* JADX WARNING: type inference failed for: r2v1, types: [com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r12 < 0) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel A00(android.content.Context r27, android.graphics.PointF r28, android.graphics.Rect r29, com.instagram.aistudio.logging.AiStudioLoggingData r30, X.2FW r31, com.instagram.model.direct.messageid.MessageIdentifier r32, java.lang.Boolean r33, java.lang.Integer r34, java.lang.Integer r35, java.lang.Long r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.util.List r44, java.util.List r45, java.util.List r46, int r47, int r48, long r49, boolean r51, boolean r52, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57, boolean r58, boolean r59, boolean r60, boolean r61, boolean r62, boolean r63) {
        /*
            r26 = this;
            r5 = 1
            r9 = r32
            X.0qQ.A0B(r9, r5)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            r2 = r49
            long r0 = r0.toMillis(r2)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1D(r44)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            r4 = 3
            r8 = r60
            if (r60 == 0) goto L_0x001c
            r4 = 7
        L_0x001c:
            boolean r11 = X.DbT.A1b(r7)
            r10 = 0
            if (r11 == 0) goto L_0x0031
            java.lang.Object r10 = r7.get(r10)
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r10 = (com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData) r10
            java.lang.Integer r11 = r10.A03
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            if (r11 != r10) goto L_0x0031
            int r4 = r4 + 1
        L_0x0031:
            if (r61 == 0) goto L_0x0050
            if (r60 != 0) goto L_0x0050
            java.util.Iterator r13 = r7.iterator()
            r12 = 0
        L_0x003a:
            boolean r10 = r13.hasNext()
            if (r10 == 0) goto L_0x0050
            java.lang.Object r10 = r13.next()
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r10 = (com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData) r10
            java.lang.Integer r11 = r10.A03
            java.lang.Integer r10 = X.AnonymousClass05K.A0N
            if (r11 != r10) goto L_0x008a
            r18 = 1
            if (r12 >= 0) goto L_0x0052
        L_0x0050:
            r18 = 0
        L_0x0052:
            r10 = r27
            if (r51 == 0) goto L_0x0120
            java.lang.Integer r12 = X.AnonymousClass05K.A0V
            r11 = 2131966723(0x7f133b03, float:1.9570292E38)
            java.lang.String r24 = X.AnonymousClass7TE.A16(r10, r11)
            r20 = 0
            X.NkG r21 = X.C69376NkG.A09
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r11 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData
            r23 = r20
            r25 = r20
            r19 = r11
            r22 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25)
            java.util.Iterator r16 = r7.iterator()
            r15 = 0
        L_0x0075:
            boolean r13 = r16.hasNext()
            if (r13 == 0) goto L_0x008d
            java.lang.Object r13 = r16.next()
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r13 = (com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData) r13
            X.NkG r14 = r13.A01
            X.NkG r13 = X.C69376NkG.A07
            if (r14 == r13) goto L_0x008e
            int r15 = r15 + 1
            goto L_0x0075
        L_0x008a:
            int r12 = r12 + 1
            goto L_0x003a
        L_0x008d:
            r15 = -1
        L_0x008e:
            if (r15 < r4) goto L_0x0099
            java.lang.Object r14 = r7.remove(r15)
            int r13 = r4 + -2
            r7.add(r13, r14)
        L_0x0099:
            int r13 = r7.size()
            if (r13 <= r4) goto L_0x00c0
            int r13 = r4 + -1
            r7.add(r13, r11)
        L_0x00a4:
            java.util.Iterator r16 = r7.iterator()
            r13 = 0
        L_0x00a9:
            boolean r14 = r16.hasNext()
            r17 = -1
            if (r14 == 0) goto L_0x00c6
            java.lang.Object r14 = r16.next()
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r14 = (com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData) r14
            java.lang.Integer r15 = r14.A03
            java.lang.Integer r14 = X.AnonymousClass05K.A0A
            if (r15 == r14) goto L_0x00c7
            int r13 = r13 + 1
            goto L_0x00a9
        L_0x00c0:
            if (r18 == 0) goto L_0x00a4
            r7.add(r11)
            goto L_0x00a4
        L_0x00c6:
            r13 = -1
        L_0x00c7:
            java.util.Iterator r16 = r7.iterator()
            r15 = 0
        L_0x00cc:
            boolean r14 = r16.hasNext()
            if (r14 == 0) goto L_0x00de
            java.lang.Object r14 = r16.next()
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r14 = (com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData) r14
            java.lang.Integer r14 = r14.A03
            if (r14 != r12) goto L_0x0115
            r17 = r15
        L_0x00de:
            if (r13 <= 0) goto L_0x00e8
            int r4 = r4 - r5
            if (r13 != r4) goto L_0x00e8
            if (r17 >= 0) goto L_0x0104
            r7.add(r13, r11)
        L_0x00e8:
            if (r18 == 0) goto L_0x0120
            java.util.Iterator r12 = r7.iterator()
            r11 = 0
        L_0x00ef:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x0118
            java.lang.Object r4 = r12.next()
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r4 = (com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData) r4
            java.lang.Integer r5 = r4.A03
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            if (r5 == r4) goto L_0x0119
            int r11 = r11 + 1
            goto L_0x00ef
        L_0x0104:
            int r11 = r17 + 1
            java.lang.Object r5 = r7.get(r11)
            java.lang.Object r4 = r7.get(r13)
            r7.set(r11, r4)
            r7.set(r13, r5)
            goto L_0x00e8
        L_0x0115:
            int r15 = r15 + 1
            goto L_0x00cc
        L_0x0118:
            r11 = -1
        L_0x0119:
            java.lang.Object r4 = r7.remove(r11)
            r7.add(r4)
        L_0x0120:
            java.util.Iterator r12 = r7.iterator()
            r11 = 0
        L_0x0125:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x014d
            java.lang.Object r4 = r12.next()
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r4 = (com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData) r4
            java.lang.Integer r5 = r4.A03
            java.lang.Integer r4 = X.AnonymousClass05K.A0V
            if (r5 != r4) goto L_0x01df
            if (r11 < 0) goto L_0x014d
            int r5 = r11 + 1
            int r4 = r7.size()
            java.util.List r4 = r7.subList(r5, r4)
            java.util.List r4 = X.00k.A0a(r4)
            r6.addAll(r4)
            r7.removeAll(r4)
        L_0x014d:
            java.lang.String r4 = X.AnonymousClass7F5.A00(r10, r2)
            r3 = 0
            r5 = r57
            if (r57 == 0) goto L_0x0159
            r3 = 2132017528(0x7f140178, float:1.9673337E38)
        L_0x0159:
            com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel r2 = new com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel
            r2.<init>()
            r2.A08 = r9
            r9 = r47
            r2.A02 = r9
            r9 = r48
            r2.A00 = r9
            r2.A0L = r7
            r2.A0O = r6
            r2.A0K = r4
            r2.A03 = r0
            r0 = r31
            r2.A07 = r0
            r0 = r28
            r2.A04 = r0
            r0 = r29
            r2.A05 = r0
            r0 = r45
            r2.A0N = r0
            r0 = r37
            r2.A0I = r0
            r0 = r38
            r2.A0J = r0
            r0 = r52
            r2.A0Z = r0
            r0 = r33
            r2.A09 = r0
            r0 = r36
            r2.A0C = r0
            r0 = r53
            r2.A0Y = r0
            r0 = r54
            r2.A0V = r0
            r0 = r55
            r2.A0X = r0
            r0 = r56
            r2.A0W = r0
            r2.A01 = r3
            r2.A0T = r5
            r0 = r58
            r2.A0S = r0
            r0 = r59
            r2.A0Q = r0
            r2.A0U = r8
            r0 = r39
            r2.A0F = r0
            r0 = r40
            r2.A0D = r0
            r0 = r41
            r2.A0G = r0
            r0 = r62
            r2.A0R = r0
            r0 = r42
            r2.A0E = r0
            r0 = r46
            r2.A0M = r0
            r0 = r43
            r2.A0H = r0
            r0 = r63
            r2.A0P = r0
            r0 = r34
            r2.A0B = r0
            r0 = r35
            r2.A0A = r0
            r0 = r30
            r2.A06 = r0
            return r2
        L_0x01df:
            int r11 = r11 + 1
            goto L_0x0125
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63898LBc.A00(android.content.Context, android.graphics.PointF, android.graphics.Rect, com.instagram.aistudio.logging.AiStudioLoggingData, X.2FW, com.instagram.model.direct.messageid.MessageIdentifier, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, int, int, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel");
    }
}
