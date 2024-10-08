package X;

/* renamed from: X.5cx  reason: invalid class name and case insensitive filesystem */
public abstract class C289065cx {
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0193, code lost:
        if (r16 == Integer.MAX_VALUE) goto L_0x0195;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C289145d6 A00(X.C287415a6 r60, X.C268004cb r61, java.util.List r62, int[] r63, X.C267974cY[] r64, int r65, int r66, int r67, int r68, int r69, int r70, int r71, int r72) {
        /*
            r2 = r69
            r8 = r67
            long r0 = (long) r2
            r25 = r0
            r53 = r70
            r43 = r71
            int r42 = r71 - r70
            r0 = r42
            int[] r0 = new int[r0]
            r41 = r0
            r40 = 0
            r3 = r53
            r1 = 0
            r6 = 0
            r9 = 0
            r10 = 0
            r39 = 0
            r38 = 0
        L_0x001f:
            r37 = 0
            r36 = 2147483647(0x7fffffff, float:NaN)
            r12 = r60
            r45 = r62
            r48 = r64
            r58 = r68
            r0 = r43
            if (r3 >= r0) goto L_0x00a1
            r0 = r45
            java.lang.Object r5 = r0.get(r3)
            X.4ci r5 = (X.C268074ci) r5
            X.5cz r0 = X.C289075cy.A00(r5)
            if (r0 == 0) goto L_0x009f
            float r4 = r0.A00
        L_0x0040:
            if (r38 != 0) goto L_0x004c
            if (r0 == 0) goto L_0x009c
            X.5ha r0 = r0.A01
            if (r0 == 0) goto L_0x009c
            boolean r0 = r0 instanceof X.C291685hi
            if (r0 == 0) goto L_0x009c
        L_0x004c:
            r38 = 1
        L_0x004e:
            int r0 = (r4 > r40 ? 1 : (r4 == r40 ? 0 : -1))
            if (r0 <= 0) goto L_0x0059
            float r39 = r39 + r4
            int r9 = r9 + 1
        L_0x0056:
            int r3 = r3 + 1
            goto L_0x001f
        L_0x0059:
            int r4 = r67 - r6
            r7 = r64[r3]
            if (r7 != 0) goto L_0x0076
            r0 = r36
            if (r8 != r0) goto L_0x0094
            r57 = 2147483647(0x7fffffff, float:NaN)
        L_0x0066:
            r55 = 0
            r54 = r12
            r56 = r55
            r59 = r55
            long r0 = r54.ALf(r55, r56, r57, r58, r59)
            X.4cY r7 = r5.Cnz(r0)
        L_0x0076:
            int r11 = r12.ClO(r7)
            int r5 = r12.ANQ(r7)
            int r0 = r3 - r70
            r41[r0] = r11
            int r4 = r4 - r11
            r0 = 0
            if (r4 >= r0) goto L_0x0087
            r4 = 0
        L_0x0087:
            int r1 = java.lang.Math.min(r2, r4)
            int r11 = r11 + r1
            int r6 = r6 + r11
            int r10 = java.lang.Math.max(r10, r5)
            r64[r3] = r7
            goto L_0x0056
        L_0x0094:
            r57 = r4
            r0 = 0
            if (r4 >= r0) goto L_0x0066
            r57 = 0
            goto L_0x0066
        L_0x009c:
            r38 = 0
            goto L_0x004e
        L_0x009f:
            r4 = 0
            goto L_0x0040
        L_0x00a1:
            r44 = r65
            if (r9 != 0) goto L_0x00f9
            int r6 = r6 - r1
            r8 = 0
        L_0x00a7:
            if (r38 == 0) goto L_0x01c9
            r5 = r53
            r4 = 0
            r7 = 0
        L_0x00ad:
            r0 = r43
            if (r5 >= r0) goto L_0x01cb
            r2 = r64[r5]
            X.0qQ.A0A(r2)
            java.lang.Object r1 = r2.BaX()
            boolean r0 = r1 instanceof X.C289085cz
            if (r0 == 0) goto L_0x00f6
            X.5cz r1 = (X.C289085cz) r1
            if (r1 == 0) goto L_0x00f6
            X.5ha r1 = r1.A01
            if (r1 == 0) goto L_0x00f6
            boolean r0 = r1 instanceof X.C291685hi
            if (r0 == 0) goto L_0x00f6
            X.5hi r1 = (X.C291685hi) r1
            X.HP6 r0 = r1.A00
            X.GeP r0 = (X.C52889GeP) r0
            X.5ia r0 = r0.A00
            int r0 = r2.AWx(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x00f6
            int r3 = r0.intValue()
            int r2 = r12.ANQ(r2)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = 0
            if (r3 == r1) goto L_0x00ea
            r0 = r3
        L_0x00ea:
            int r4 = java.lang.Math.max(r4, r0)
            if (r3 != r1) goto L_0x00f1
            r3 = r2
        L_0x00f1:
            int r2 = r2 - r3
            int r7 = java.lang.Math.max(r7, r2)
        L_0x00f6:
            int r5 = r5 + 1
            goto L_0x00ad
        L_0x00f9:
            r35 = r44
            r0 = r36
            if (r8 == r0) goto L_0x0101
            r35 = r8
        L_0x0101:
            int r0 = r9 + -1
            long r0 = (long) r0
            long r2 = r25 * r0
            int r0 = r35 - r6
            long r0 = (long) r0
            long r0 = r0 - r2
            r13 = 0
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x0112
            r0 = 0
        L_0x0112:
            float r7 = (float) r0
            float r7 = r7 / r39
            r13 = r53
            r33 = r0
        L_0x0119:
            java.lang.String r32 = "weightedSize "
            java.lang.String r31 = "weightUnitSpace "
            java.lang.String r30 = "totalWeight "
            java.lang.String r29 = "remainingToTarget "
            java.lang.String r28 = "arrangementSpacingTotal "
            java.lang.String r27 = "fixedSpace "
            java.lang.String r24 = "weightChildrenCount "
            java.lang.String r23 = "arrangementSpacingPx "
            java.lang.String r22 = "targetSpace "
            java.lang.String r21 = "mainAxisMin "
            r4 = r43
            if (r13 >= r4) goto L_0x014f
            r4 = r45
            java.lang.Object r4 = r4.get(r13)
            X.4cj r4 = (X.C268084cj) r4
            X.5cz r4 = X.C289075cy.A00(r4)
            if (r4 == 0) goto L_0x014d
            float r11 = r4.A00
        L_0x0141:
            float r14 = r7 * r11
            int r4 = java.lang.Math.round(r14)     // Catch:{ IllegalArgumentException -> 0x0209 }
            long r4 = (long) r4     // Catch:{ IllegalArgumentException -> 0x0209 }
            long r33 = r33 - r4
            int r13 = r13 + 1
            goto L_0x0119
        L_0x014d:
            r11 = 0
            goto L_0x0141
        L_0x014f:
            r15 = 0
            r11 = r53
        L_0x0152:
            r4 = r43
            if (r11 >= r4) goto L_0x01bd
            r4 = r64[r11]
            if (r4 != 0) goto L_0x01ba
            r4 = r45
            java.lang.Object r14 = r4.get(r11)
            X.4ci r14 = (X.C268074ci) r14
            X.5cz r13 = X.C289075cy.A00(r14)
            if (r13 == 0) goto L_0x0323
            float r4 = r13.A00
            r20 = r4
            int r4 = (r4 > r40 ? 1 : (r4 == r40 ? 0 : -1))
            if (r4 <= 0) goto L_0x0323
            int r19 = java.lang.Long.signum(r33)
            r4 = r19
            long r4 = (long) r4
            long r33 = r33 - r4
            float r18 = r7 * r20
            int r5 = java.lang.Math.round(r18)
            int r5 = r5 + r19
            r17 = 0
            r4 = r17
            int r16 = java.lang.Math.max(r4, r5)
            boolean r4 = r13.A02     // Catch:{ IllegalArgumentException -> 0x0285 }
            if (r4 == 0) goto L_0x0195
            r55 = r16
            r5 = r36
            r4 = r16
            if (r4 != r5) goto L_0x0197
        L_0x0195:
            r55 = 0
        L_0x0197:
            r59 = 1
            r54 = r12
            r56 = r17
            r57 = r16
            long r4 = r54.ALf(r55, r56, r57, r58, r59)     // Catch:{ IllegalArgumentException -> 0x0285 }
            X.4cY r5 = r14.Cnz(r4)
            int r14 = r12.ClO(r5)
            int r4 = r12.ANQ(r5)
            int r13 = r11 - r70
            r41[r13] = r14
            int r15 = r15 + r14
            int r10 = java.lang.Math.max(r10, r4)
            r64[r11] = r5
        L_0x01ba:
            int r11 = r11 + 1
            goto L_0x0152
        L_0x01bd:
            long r0 = (long) r15
            long r0 = r0 + r2
            int r2 = (int) r0
            int r8 = r67 - r6
            r0 = 0
            int r8 = X.C229632nm.A03(r2, r0, r8)
            goto L_0x00a7
        L_0x01c9:
            r7 = 0
            r4 = 0
        L_0x01cb:
            int r6 = r6 + r8
            r5 = 0
            if (r6 >= r5) goto L_0x01d0
            r6 = 0
        L_0x01d0:
            r0 = r44
            int r3 = java.lang.Math.max(r6, r0)
            int r7 = r7 + r4
            r0 = r66
            int r0 = java.lang.Math.max(r0, r7)
            int r51 = java.lang.Math.max(r10, r0)
            r0 = r42
            int[] r2 = new int[r0]
            r1 = 0
        L_0x01e6:
            if (r1 >= r0) goto L_0x01ed
            r2[r1] = r5
            int r1 = r1 + 1
            goto L_0x01e6
        L_0x01ed:
            r1 = r61
            r0 = r41
            r12.E35(r1, r0, r2, r3)
            r47 = r63
            r52 = r72
            r44 = r12
            r45 = r1
            r46 = r2
            r49 = r4
            r50 = r3
            r54 = r43
            X.5d6 r0 = r44.E2o(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            return r0
        L_0x0209:
            r12 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r4 = "This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax "
            r10.append(r4)
            r10.append(r8)
            r4 = r21
            r10.append(r4)
            r4 = r44
            r10.append(r4)
            r4 = r22
            r10.append(r4)
            r4 = r35
            r10.append(r4)
            r4 = r23
            r10.append(r4)
            r4 = r25
            r10.append(r4)
            r4 = r24
            r10.append(r4)
            r10.append(r9)
            r4 = r27
            r10.append(r4)
            r10.append(r6)
            r4 = r28
            r10.append(r4)
            r10.append(r2)
            r2 = r29
            r10.append(r2)
            r10.append(r0)
            r0 = r30
            r10.append(r0)
            r0 = r39
            r10.append(r0)
            r0 = r31
            r10.append(r0)
            r10.append(r7)
            java.lang.String r0 = "itemWeight "
            r10.append(r0)
            r10.append(r11)
            r0 = r32
            r10.append(r0)
            r10.append(r14)
            java.lang.String r1 = r10.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            java.lang.Throwable r0 = r0.initCause(r12)
            throw r0
        L_0x0285:
            r11 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r4 = "This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax "
            r10.append(r4)
            r10.append(r8)
            r4 = r21
            r10.append(r4)
            r4 = r44
            r10.append(r4)
            r4 = r22
            r10.append(r4)
            r4 = r35
            r10.append(r4)
            r4 = r23
            r10.append(r4)
            r4 = r25
            r10.append(r4)
            r4 = r24
            r10.append(r4)
            r10.append(r9)
            r4 = r27
            r10.append(r4)
            r10.append(r6)
            r4 = r28
            r10.append(r4)
            r10.append(r2)
            r2 = r29
            r10.append(r2)
            r10.append(r0)
            r0 = r30
            r10.append(r0)
            r0 = r39
            r10.append(r0)
            r0 = r31
            r10.append(r0)
            r10.append(r7)
            java.lang.String r0 = "weight "
            r10.append(r0)
            r0 = r20
            r10.append(r0)
            r0 = r32
            r10.append(r0)
            r0 = r18
            r10.append(r0)
            java.lang.String r0 = "crossAxisDesiredSize "
            r10.append(r0)
            r0 = r37
            r10.append(r0)
            java.lang.String r0 = "remainderUnit "
            r10.append(r0)
            r0 = r19
            r10.append(r0)
            java.lang.String r0 = "childMainAxisSize "
            r10.append(r0)
            r0 = r16
            r10.append(r0)
            java.lang.String r1 = r10.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            java.lang.Throwable r1 = r0.initCause(r11)
            throw r1
        L_0x0323:
            java.lang.String r0 = "All weights <= 0 should have placeables"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C289065cx.A00(X.5a6, X.4cb, java.util.List, int[], X.4cY[], int, int, int, int, int, int, int, int):X.5d6");
    }
}
