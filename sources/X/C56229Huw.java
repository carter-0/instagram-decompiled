package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Huw  reason: case insensitive filesystem */
public abstract class C56229Huw {
    public static final List A01(List list) {
        AnonymousClass9IC r14;
        List list2 = list;
        ArrayList A0r = AnonymousClass7TG.A0r(list2);
        int i = 0;
        for (Object next : list2) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            C299575vQ r2 = (C299575vQ) next;
            if (i == 0) {
                r14 = new AnonymousClass9IC(27, 0, false, false, true, false, false);
            } else {
                boolean z = true;
                if (i == list2.size() - 1) {
                    r14 = new AnonymousClass9IC(23, 0, false, false, false, true, false);
                } else {
                    if (i2 >= list2.size() || !(list2.get(i2) instanceof AnonymousClass6DT)) {
                        z = false;
                    }
                    r14 = new AnonymousClass9IC(15, 0, false, false, false, false, z);
                }
            }
            A0r.add(A00(r14, r2));
            i = i2;
        }
        return A0r;
    }

    /* JADX WARNING: type inference failed for: r1v77 */
    /* JADX WARNING: type inference failed for: r8v19, types: [X.GpI] */
    /* JADX WARNING: type inference failed for: r1v80 */
    /* JADX WARNING: type inference failed for: r9v26, types: [X.9JB] */
    /* JADX WARNING: type inference failed for: r13v21, types: [X.6Cy] */
    /* JADX WARNING: type inference failed for: r7v27, types: [X.GpC] */
    /* JADX WARNING: type inference failed for: r15v20, types: [X.5vV] */
    /* JADX WARNING: type inference failed for: r6v26, types: [X.9JB] */
    /* JADX WARNING: type inference failed for: r1v81 */
    /* JADX WARNING: type inference failed for: r6v27, types: [X.Gp8] */
    /* JADX WARNING: type inference failed for: r15v21, types: [X.6Cw] */
    /* JADX WARNING: type inference failed for: r15v22, types: [X.5vS] */
    /* JADX WARNING: type inference failed for: r13v22, types: [X.5vT] */
    /* JADX WARNING: type inference failed for: r8v20, types: [X.GpB] */
    /* JADX WARNING: type inference failed for: r6v28, types: [X.GpH] */
    /* JADX WARNING: type inference failed for: r1v82 */
    /* JADX WARNING: type inference failed for: r11v28, types: [X.GpD] */
    /* JADX WARNING: type inference failed for: r14v21, types: [X.GpE] */
    /* JADX WARNING: type inference failed for: r8v21, types: [X.6DX] */
    /* JADX WARNING: type inference failed for: r1v83 */
    /* JADX WARNING: type inference failed for: r1v84 */
    /* JADX WARNING: type inference failed for: r1v85 */
    /* JADX WARNING: type inference failed for: r1v86 */
    /* JADX WARNING: type inference failed for: r8v22, types: [X.GpI] */
    /* JADX WARNING: type inference failed for: r6v29, types: [X.Gp7] */
    /* JADX WARNING: type inference failed for: r6v30, types: [X.6DL] */
    /* JADX WARNING: type inference failed for: r6v31, types: [X.GpA] */
    /* JADX WARNING: type inference failed for: r1v87 */
    /* JADX WARNING: type inference failed for: r6v32, types: [X.GpH] */
    /* JADX WARNING: type inference failed for: r9v27, types: [X.GpH] */
    /* JADX WARNING: type inference failed for: r6v33, types: [X.6DU] */
    /* JADX WARNING: type inference failed for: r1v88 */
    /* JADX WARNING: type inference failed for: r1v89 */
    /* JADX WARNING: type inference failed for: r10v28, types: [X.6DT] */
    /* JADX WARNING: type inference failed for: r15v23, types: [X.5vW] */
    /* JADX WARNING: type inference failed for: r9v28, types: [X.6Bb] */
    /* JADX WARNING: type inference failed for: r14v22, types: [X.6Cx] */
    /* JADX WARNING: type inference failed for: r13v23, types: [X.5vP] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C299575vQ A00(X.AnonymousClass9IC r49, X.C299575vQ r50) {
        /*
            r1 = r50
            boolean r0 = r1 instanceof X.C299565vP
            r2 = r49
            if (r0 == 0) goto L_0x00be
            X.5vP r1 = (X.C299565vP) r1
            X.5vJ r7 = r1.A05
            com.instagram.common.typedurl.ImageUrl r0 = r1.A06
            r50 = r0
            java.lang.String r6 = r1.A0B
            java.lang.String r5 = r1.A0F
            int r0 = r1.A00
            r29 = r0
            com.instagram.user.model.FollowStatus r4 = r1.A07
            boolean r0 = r1.A0U
            r30 = r0
            boolean r0 = r1.A0O
            r31 = r0
            boolean r0 = r1.A0J
            r32 = r0
            boolean r0 = r1.A0Q
            r33 = r0
            X.5vN r3 = r1.A04
            boolean r0 = r1.A0P
            r34 = r0
            java.lang.Double r0 = r1.A08
            r49 = r0
            boolean r0 = r1.A0L
            r35 = r0
            boolean r0 = r1.A0G
            r36 = r0
            boolean r0 = r1.A0V
            r24 = r0
            boolean r0 = r1.A0I
            r23 = r0
            boolean r0 = r1.A0H
            r22 = r0
            boolean r0 = r1.A0X
            r21 = r0
            boolean r0 = r1.A0W
            r20 = r0
            com.instagram.api.schemas.TextPostAppHeaderFollowVariant r9 = r1.A03
            boolean r0 = r1.A0N
            r19 = r0
            boolean r0 = r1.A0M
            r18 = r0
            boolean r0 = r1.A0R
            r17 = r0
            java.lang.String r0 = r1.A0A
            r25 = r0
            java.lang.String r0 = r1.A0E
            r16 = r0
            java.lang.String r14 = r1.A0D
            boolean r13 = r1.A0Y
            java.lang.Long r12 = r1.A09
            com.instagram.api.schemas.MetaPlaceDict r11 = r1.A02
            boolean r10 = r1.A0K
            boolean r8 = r1.A0T
            boolean r0 = r1.A0S
            java.lang.String r15 = r1.A0C
            r1 = 0
            X.AnonymousClass7TG.A0w(r1, r7, r6, r5)
            r1 = 6
            X.0qQ.A0B(r4, r1)
            r1 = 11
            X.C51970G9q.A1N(r3, r1, r9)
            X.5vP r1 = new X.5vP
            r26 = r16
            r27 = r14
            r28 = r15
            r37 = r24
            r38 = r23
            r39 = r22
            r40 = r21
            r41 = r20
            r42 = r19
            r43 = r18
            r44 = r17
            r45 = r13
            r46 = r10
            r47 = r8
            r48 = r0
            r13 = r1
            r14 = r2
            r15 = r11
            r16 = r9
            r17 = r3
            r18 = r7
            r19 = r50
            r20 = r4
            r21 = r49
            r22 = r12
            r23 = r6
            r24 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
        L_0x00bb:
            X.5vQ r1 = (X.C299575vQ) r1
            return r1
        L_0x00be:
            boolean r0 = r1 instanceof X.C304296Cx
            if (r0 == 0) goto L_0x0105
            X.6Cx r1 = (X.C304296Cx) r1
            X.5vJ r13 = r1.A02
            boolean r12 = r1.A0B
            com.instagram.common.typedurl.ImageUrl r11 = r1.A03
            java.lang.String r10 = r1.A06
            java.lang.String r9 = r1.A08
            com.instagram.user.model.FollowStatus r8 = r1.A04
            boolean r7 = r1.A0C
            java.lang.String r6 = r1.A07
            java.lang.String r5 = r1.A05
            int r4 = r1.A00
            boolean r3 = r1.A0A
            boolean r14 = r1.A09
            r0 = 0
            X.C51974G9v.A0d(r0, r13, r10, r9, r8)
            r0 = 8
            X.0qQ.A0B(r6, r0)
            X.6Cx r1 = new X.6Cx
            r27 = r14
            r14 = r1
            r15 = r2
            r16 = r13
            r17 = r11
            r18 = r8
            r19 = r10
            r20 = r9
            r21 = r6
            r22 = r5
            r23 = r4
            r24 = r12
            r25 = r7
            r26 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x00bb
        L_0x0105:
            boolean r0 = r1 instanceof X.C303856Bb
            if (r0 == 0) goto L_0x012d
            X.6Bb r1 = (X.C303856Bb) r1
            X.5vJ r8 = r1.A01
            X.62P r7 = r1.A03
            boolean r6 = r1.A05
            boolean r5 = r1.A06
            boolean r4 = r1.A04
            boolean r3 = r1.A07
            java.lang.Integer r0 = r1.A02
            X.DbY.A1S(r8, r7)
            X.6Bb r1 = new X.6Bb
            r9 = r1
            r10 = r2
            r11 = r8
            r12 = r0
            r13 = r7
            r14 = r6
            r15 = r5
            r16 = r4
            r17 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x00bb
        L_0x012d:
            boolean r0 = r1 instanceof X.AnonymousClass5vW
            if (r0 == 0) goto L_0x0179
            X.5vW r1 = (X.AnonymousClass5vW) r1
            X.5vJ r14 = r1.A03
            int r13 = r1.A00
            boolean r12 = r1.A0B
            int r11 = r1.A01
            boolean r10 = r1.A0C
            boolean r9 = r1.A08
            X.62P r8 = r1.A06
            boolean r7 = r1.A07
            boolean r6 = r1.A09
            boolean r5 = r1.A0E
            boolean r4 = r1.A0D
            X.5vk r3 = r1.A05
            X.5vl r0 = r1.A04
            boolean r15 = r1.A0A
            r1 = 0
            X.AnonymousClass7TF.A1E(r14, r1, r8)
            X.5vW r1 = new X.5vW
            r28 = r5
            r29 = r4
            r30 = r15
            r15 = r1
            r16 = r2
            r17 = r14
            r18 = r0
            r19 = r3
            r20 = r8
            r21 = r13
            r22 = r11
            r23 = r12
            r24 = r10
            r25 = r9
            r26 = r7
            r27 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x00bb
        L_0x0179:
            boolean r0 = r1 instanceof X.AnonymousClass6DT
            if (r0 == 0) goto L_0x01eb
            X.6DT r1 = (X.AnonymousClass6DT) r1
            X.5vJ r6 = r1.A06
            int r0 = r1.A00
            r34 = r0
            int r0 = r1.A01
            r18 = r0
            int r0 = r1.A02
            r19 = r0
            int r0 = r1.A03
            r20 = r0
            boolean r0 = r1.A0H
            r21 = r0
            boolean r0 = r1.A0I
            r22 = r0
            boolean r0 = r1.A0F
            r17 = r0
            boolean r0 = r1.A0C
            r16 = r0
            boolean r14 = r1.A0A
            boolean r13 = r1.A0D
            boolean r12 = r1.A0B
            boolean r11 = r1.A0M
            boolean r10 = r1.A0L
            java.lang.String r9 = r1.A08
            X.5vk r8 = r1.A07
            com.instagram.api.schemas.RepostRestrictedReason r7 = r1.A05
            X.62P r5 = r1.A09
            boolean r4 = r1.A0G
            boolean r3 = r1.A0J
            boolean r0 = r1.A0E
            boolean r15 = r1.A0K
            r1 = 0
            X.0qQ.A0B(r6, r1)
            r1 = 18
            X.0qQ.A0B(r5, r1)
            X.6DT r1 = new X.6DT
            r23 = r17
            r24 = r16
            r25 = r14
            r26 = r13
            r27 = r12
            r28 = r11
            r29 = r10
            r30 = r4
            r31 = r3
            r32 = r0
            r33 = r15
            r10 = r1
            r11 = r2
            r12 = r7
            r13 = r6
            r14 = r8
            r15 = r9
            r16 = r5
            r17 = r34
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x00bb
        L_0x01eb:
            r8 = 0
            boolean r0 = X.C53483GpF.A00(r8, r1)
            if (r0 == 0) goto L_0x0202
            X.GpF r1 = (X.C53483GpF) r1
            java.lang.Object r0 = r1.A02
            X.5vJ r0 = (X.C299505vJ) r0
            X.0qQ.A0B(r0, r8)
            X.GpF r1 = new X.GpF
            r1.<init>(r2, r0, r8)
            goto L_0x00bb
        L_0x0202:
            boolean r0 = r1 instanceof X.C53473Gp5
            if (r0 == 0) goto L_0x0216
            X.Gp5 r1 = (X.C53473Gp5) r1
            X.5vJ r3 = r1.A01
            boolean r0 = r1.A02
            X.0qQ.A0B(r3, r8)
            X.Gp5 r1 = new X.Gp5
            r1.<init>(r2, r3, r0)
            goto L_0x00bb
        L_0x0216:
            boolean r0 = r1 instanceof X.AnonymousClass6DU
            if (r0 == 0) goto L_0x0234
            X.6DU r1 = (X.AnonymousClass6DU) r1
            X.5vJ r5 = r1.A01
            int r4 = r1.A00
            X.62P r3 = r1.A02
            boolean r0 = r1.A03
            X.AnonymousClass7TF.A1C(r5, r8, r3)
            X.6DU r1 = new X.6DU
            r6 = r1
            r7 = r2
            r8 = r5
            r9 = r3
            r10 = r4
            r11 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x00bb
        L_0x0234:
            boolean r0 = X.C53485GpH.A00(r8, r1)
            if (r0 == 0) goto L_0x0256
            X.GpH r1 = (X.C53485GpH) r1
            java.lang.Object r4 = r1.A03
            X.5vJ r4 = (X.C299505vJ) r4
            boolean r3 = r1.A05
            java.lang.Object r0 = r1.A01
            X.4w6 r0 = (X.C278014w6) r0
            X.0qQ.A0B(r4, r8)
            X.GpH r1 = new X.GpH
            r9 = r1
            r10 = r2
            r11 = r0
            r12 = r4
            r13 = r8
            r14 = r3
            r9.<init>((X.AnonymousClass9IC) r10, (X.C278014w6) r11, (X.C299505vJ) r12, (int) r13, (boolean) r14)
            goto L_0x00bb
        L_0x0256:
            r5 = 1
            boolean r0 = X.C53485GpH.A00(r5, r1)
            if (r0 == 0) goto L_0x0279
            X.GpH r1 = (X.C53485GpH) r1
            java.lang.Object r4 = r1.A03
            X.5vJ r4 = (X.C299505vJ) r4
            boolean r3 = r1.A05
            java.lang.Object r0 = r1.A01
            X.4w6 r0 = (X.C278014w6) r0
            X.0qQ.A0B(r4, r8)
            X.GpH r1 = new X.GpH
            r6 = r1
            r7 = r2
            r8 = r0
            r9 = r4
            r10 = r5
            r11 = r3
            r6.<init>((X.AnonymousClass9IC) r7, (X.C278014w6) r8, (X.C299505vJ) r9, (int) r10, (boolean) r11)
            goto L_0x00bb
        L_0x0279:
            boolean r0 = X.C53484GpG.A00(r5, r1)
            if (r0 == 0) goto L_0x028f
            X.GpG r1 = (X.C53484GpG) r1
            java.lang.Object r0 = r1.A02
            X.5vJ r0 = (X.C299505vJ) r0
            X.0qQ.A0B(r0, r8)
            X.GpG r1 = new X.GpG
            r1.<init>(r2, r0, r5)
            goto L_0x00bb
        L_0x028f:
            boolean r0 = r1 instanceof X.C53478GpA
            if (r0 == 0) goto L_0x02ad
            X.GpA r1 = (X.C53478GpA) r1
            X.5vJ r5 = r1.A00
            boolean r4 = r1.A03
            java.lang.String r3 = r1.A01
            X.62P r0 = r1.A02
            X.0qQ.A0B(r5, r8)
            X.GpA r1 = new X.GpA
            r6 = r1
            r7 = r2
            r8 = r5
            r9 = r3
            r10 = r0
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x00bb
        L_0x02ad:
            boolean r0 = r1 instanceof X.AnonymousClass6DL
            if (r0 == 0) goto L_0x02cb
            X.6DL r1 = (X.AnonymousClass6DL) r1
            X.5vJ r5 = r1.A02
            boolean r4 = r1.A03
            X.Jvw r3 = r1.A01
            boolean r0 = r1.A04
            X.AnonymousClass7TF.A1C(r5, r8, r3)
            X.6DL r1 = new X.6DL
            r6 = r1
            r7 = r2
            r8 = r3
            r9 = r5
            r10 = r4
            r11 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x00bb
        L_0x02cb:
            boolean r0 = r1 instanceof X.C53475Gp7
            if (r0 == 0) goto L_0x02e9
            X.Gp7 r1 = (X.C53475Gp7) r1
            X.5vJ r5 = r1.A01
            boolean r4 = r1.A04
            X.5vK r3 = r1.A02
            X.Glw r0 = r1.A03
            X.AnonymousClass7TG.A0w(r8, r5, r3, r0)
            X.Gp7 r1 = new X.Gp7
            r6 = r1
            r7 = r2
            r8 = r5
            r9 = r3
            r10 = r0
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x00bb
        L_0x02e9:
            boolean r0 = X.C53486GpI.A00(r8, r1)
            if (r0 == 0) goto L_0x0317
            X.GpI r1 = (X.C53486GpI) r1
            java.lang.Object r7 = r1.A03
            X.5vJ r7 = (X.C299505vJ) r7
            java.lang.Object r6 = r1.A01
            com.instagram.api.schemas.MediaNoticeIcon r6 = (com.instagram.api.schemas.MediaNoticeIcon) r6
            java.lang.String r5 = r1.A07
            java.lang.String r4 = r1.A06
            java.lang.String r3 = r1.A05
            X.0qQ.A0B(r7, r8)
            X.C51974G9v.A1M(r6, r5, r4)
            r0 = 5
            X.0qQ.A0B(r3, r0)
            X.GpI r1 = new X.GpI
            r8 = r1
            r9 = r2
            r10 = r6
            r11 = r7
            r12 = r5
            r13 = r4
            r14 = r3
            r8.<init>((X.AnonymousClass9IC) r9, (com.instagram.api.schemas.MediaNoticeIcon) r10, (X.C299505vJ) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14)
            goto L_0x00bb
        L_0x0317:
            boolean r0 = X.C53484GpG.A00(r8, r1)
            if (r0 == 0) goto L_0x032d
            X.GpG r1 = (X.C53484GpG) r1
            java.lang.Object r0 = r1.A02
            X.5vJ r0 = (X.C299505vJ) r0
            X.0qQ.A0B(r0, r8)
            X.GpG r1 = new X.GpG
            r1.<init>(r2, r0, r8)
            goto L_0x00bb
        L_0x032d:
            boolean r0 = X.C53483GpF.A00(r5, r1)
            if (r0 == 0) goto L_0x0343
            X.GpF r1 = (X.C53483GpF) r1
            java.lang.Object r0 = r1.A02
            X.5vJ r0 = (X.C299505vJ) r0
            X.0qQ.A0B(r0, r8)
            X.GpF r1 = new X.GpF
            r1.<init>(r2, r0, r5)
            goto L_0x00bb
        L_0x0343:
            boolean r0 = r1 instanceof X.AnonymousClass6DK
            if (r0 == 0) goto L_0x0357
            X.6DK r1 = (X.AnonymousClass6DK) r1
            X.5vJ r3 = r1.A02
            X.Gle r0 = r1.A01
            X.AnonymousClass7TF.A1B(r3, r8, r0)
            X.6DK r1 = new X.6DK
            r1.<init>(r2, r0, r3)
            goto L_0x00bb
        L_0x0357:
            boolean r0 = r1 instanceof X.AnonymousClass6DW
            if (r0 == 0) goto L_0x036d
            X.6DW r1 = (X.AnonymousClass6DW) r1
            X.5vJ r4 = r1.A00
            boolean r3 = r1.A02
            boolean r0 = r1.A01
            X.0qQ.A0B(r4, r8)
            X.6DW r1 = new X.6DW
            r1.<init>(r2, r4, r3, r0)
            goto L_0x00bb
        L_0x036d:
            boolean r0 = r1 instanceof X.AnonymousClass6DX
            if (r0 == 0) goto L_0x0392
            X.6DX r1 = (X.AnonymousClass6DX) r1
            X.5vJ r7 = r1.A02
            java.lang.String r6 = r1.A03
            int r5 = r1.A00
            int r4 = r1.A01
            X.62P r3 = r1.A04
            X.AnonymousClass7TF.A1B(r7, r8, r6)
            r0 = 5
            X.0qQ.A0B(r3, r0)
            X.6DX r1 = new X.6DX
            r8 = r1
            r9 = r2
            r10 = r7
            r11 = r6
            r12 = r3
            r13 = r5
            r14 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14)
            goto L_0x00bb
        L_0x0392:
            boolean r0 = r1 instanceof X.C53482GpE
            if (r0 == 0) goto L_0x03d0
            X.GpE r1 = (X.C53482GpE) r1
            X.5vJ r13 = r1.A02
            boolean r12 = r1.A08
            X.GmJ r11 = r1.A04
            boolean r10 = r1.A07
            boolean r9 = r1.A0A
            boolean r7 = r1.A09
            X.5vl r6 = r1.A03
            boolean r5 = r1.A06
            int r4 = r1.A00
            boolean r3 = r1.A0B
            java.lang.Integer r0 = r1.A05
            X.0qQ.A0B(r13, r8)
            X.GpE r1 = new X.GpE
            r14 = r1
            r15 = r2
            r16 = r13
            r17 = r6
            r18 = r11
            r19 = r0
            r20 = r4
            r21 = r12
            r22 = r10
            r23 = r9
            r24 = r7
            r25 = r5
            r26 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x00bb
        L_0x03d0:
            boolean r0 = r1 instanceof X.C53481GpD
            if (r0 == 0) goto L_0x03ff
            X.GpD r1 = (X.C53481GpD) r1
            X.5vJ r10 = r1.A03
            boolean r9 = r1.A08
            boolean r7 = r1.A07
            java.lang.String r6 = r1.A05
            java.lang.String r5 = r1.A06
            int r4 = r1.A00
            X.5vl r3 = r1.A04
            int r0 = r1.A01
            X.0qQ.A0B(r10, r8)
            X.GpD r1 = new X.GpD
            r11 = r1
            r12 = r2
            r13 = r10
            r14 = r3
            r15 = r6
            r16 = r5
            r17 = r4
            r18 = r0
            r19 = r9
            r20 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x00bb
        L_0x03ff:
            boolean r0 = r1 instanceof X.C53474Gp6
            if (r0 == 0) goto L_0x0415
            X.Gp6 r1 = (X.C53474Gp6) r1
            X.5vJ r4 = r1.A00
            java.lang.String r3 = r1.A01
            boolean r0 = r1.A02
            X.AnonymousClass7TF.A1B(r4, r8, r3)
            X.Gp6 r1 = new X.Gp6
            r1.<init>(r2, r4, r3, r0)
            goto L_0x00bb
        L_0x0415:
            r9 = 2
            boolean r0 = X.C53485GpH.A00(r9, r1)
            if (r0 == 0) goto L_0x043d
            X.GpH r1 = (X.C53485GpH) r1
            java.lang.Object r5 = r1.A02
            X.5vJ r5 = (X.C299505vJ) r5
            java.lang.String r4 = r1.A04
            boolean r3 = r1.A05
            java.lang.Object r0 = r1.A03
            java.lang.Long r0 = (java.lang.Long) r0
            X.0qQ.A0B(r5, r8)
            X.0qQ.A0B(r4, r9)
            X.GpH r1 = new X.GpH
            r6 = r1
            r7 = r2
            r8 = r5
            r9 = r0
            r10 = r4
            r11 = r3
            r6.<init>((X.AnonymousClass9IC) r7, (X.C299505vJ) r8, (java.lang.Long) r9, (java.lang.String) r10, (boolean) r11)
            goto L_0x00bb
        L_0x043d:
            boolean r0 = r1 instanceof X.C53479GpB
            if (r0 == 0) goto L_0x0467
            X.GpB r1 = (X.C53479GpB) r1
            X.5vJ r10 = r1.A01
            java.lang.String r7 = r1.A07
            java.lang.String r6 = r1.A02
            java.lang.String r5 = r1.A05
            java.lang.String r4 = r1.A06
            java.lang.String r3 = r1.A04
            java.lang.String r0 = r1.A03
            X.0qQ.A0B(r10, r8)
            X.AnonymousClass7TF.A1C(r7, r9, r6)
            X.GpB r1 = new X.GpB
            r8 = r1
            r9 = r2
            r11 = r7
            r12 = r6
            r13 = r5
            r14 = r4
            r15 = r3
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00bb
        L_0x0467:
            boolean r0 = r1 instanceof X.C299605vT
            if (r0 == 0) goto L_0x049f
            X.5vT r1 = (X.C299605vT) r1
            X.5vJ r12 = r1.A01
            X.5vK r11 = r1.A02
            boolean r10 = r1.A05
            boolean r7 = r1.A07
            boolean r6 = r1.A06
            boolean r5 = r1.A04
            boolean r4 = r1.A08
            boolean r3 = r1.A09
            java.lang.Integer r0 = r1.A03
            X.0qQ.A0B(r12, r8)
            X.0qQ.A0B(r11, r9)
            X.5vT r1 = new X.5vT
            r13 = r1
            r14 = r2
            r15 = r12
            r16 = r11
            r17 = r0
            r18 = r10
            r19 = r7
            r20 = r6
            r21 = r5
            r22 = r4
            r23 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x00bb
        L_0x049f:
            boolean r0 = r1 instanceof X.C299595vS
            if (r0 == 0) goto L_0x04ea
            X.5vS r1 = (X.C299595vS) r1
            X.5vJ r14 = r1.A04
            int r13 = r1.A00
            java.lang.String r12 = r1.A07
            boolean r11 = r1.A0A
            int r10 = r1.A01
            X.5vR r9 = r1.A05
            X.5vk r7 = r1.A06
            X.4oN r6 = r1.A03
            boolean r5 = r1.A0C
            boolean r4 = r1.A0B
            boolean r3 = r1.A0D
            boolean r0 = r1.A08
            boolean r15 = r1.A09
            X.AnonymousClass7TF.A1C(r14, r8, r12)
            r1 = 6
            X.0qQ.A0B(r9, r1)
            X.5vS r1 = new X.5vS
            r28 = r0
            r29 = r15
            r15 = r1
            r16 = r2
            r17 = r6
            r18 = r14
            r19 = r9
            r20 = r7
            r21 = r12
            r22 = r13
            r23 = r10
            r24 = r11
            r25 = r5
            r26 = r4
            r27 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x00bb
        L_0x04ea:
            boolean r0 = r1 instanceof X.C304286Cw
            if (r0 == 0) goto L_0x0531
            X.6Cw r1 = (X.C304286Cw) r1
            X.5vJ r14 = r1.A04
            int r13 = r1.A00
            int r12 = r1.A01
            java.lang.String r11 = r1.A08
            boolean r10 = r1.A0A
            X.5vR r9 = r1.A05
            X.5vk r7 = r1.A07
            X.4oN r6 = r1.A03
            X.5vK r5 = r1.A06
            boolean r4 = r1.A0B
            boolean r3 = r1.A09
            boolean r0 = r1.A0C
            boolean r15 = r1.A0D
            X.DbW.A1O(r14, r8, r9)
            X.6Cw r1 = new X.6Cw
            r28 = r0
            r29 = r15
            r15 = r1
            r16 = r2
            r17 = r6
            r18 = r14
            r19 = r9
            r20 = r5
            r21 = r7
            r22 = r11
            r23 = r13
            r24 = r12
            r25 = r10
            r26 = r4
            r27 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x00bb
        L_0x0531:
            boolean r0 = r1 instanceof X.C53476Gp8
            if (r0 == 0) goto L_0x0552
            X.Gp8 r1 = (X.C53476Gp8) r1
            X.5vJ r5 = r1.A02
            java.lang.String r4 = r1.A03
            com.instagram.api.schemas.ThreadHeaderStyle r3 = r1.A01
            int r0 = r1.A00
            X.0qQ.A0B(r5, r8)
            X.0qQ.A0B(r4, r9)
            X.Gp8 r1 = new X.Gp8
            r6 = r1
            r7 = r2
            r8 = r3
            r9 = r5
            r10 = r4
            r11 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x00bb
        L_0x0552:
            boolean r0 = r1 instanceof X.C53477Gp9
            if (r0 == 0) goto L_0x0568
            X.Gp9 r1 = (X.C53477Gp9) r1
            X.5vJ r4 = r1.A00
            boolean r3 = r1.A02
            java.lang.Integer r0 = r1.A01
            X.AnonymousClass7TF.A1C(r4, r8, r0)
            X.Gp9 r1 = new X.Gp9
            r1.<init>(r2, r4, r0, r3)
            goto L_0x00bb
        L_0x0568:
            boolean r0 = X.AnonymousClass9JB.A00(r5, r1)
            if (r0 == 0) goto L_0x058b
            X.9JB r1 = (X.AnonymousClass9JB) r1
            java.lang.Object r4 = r1.A02
            X.5vJ r4 = (X.C299505vJ) r4
            java.lang.String r3 = r1.A03
            java.lang.String r0 = r1.A04
            X.0qQ.A0B(r4, r8)
            X.AnonymousClass7TF.A1C(r3, r9, r0)
            X.9JB r1 = new X.9JB
            r6 = r1
            r7 = r2
            r8 = r4
            r9 = r3
            r10 = r0
            r11 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x00bb
        L_0x058b:
            boolean r0 = r1 instanceof X.C299625vV
            if (r0 == 0) goto L_0x05e6
            X.5vV r1 = (X.C299625vV) r1
            X.5vJ r9 = r1.A02
            boolean r0 = r1.A0D
            r22 = r0
            boolean r0 = r1.A0E
            r23 = r0
            boolean r0 = r1.A0B
            r24 = r0
            boolean r0 = r1.A08
            r25 = r0
            boolean r0 = r1.A06
            r26 = r0
            boolean r14 = r1.A09
            boolean r13 = r1.A07
            boolean r12 = r1.A0G
            java.lang.String r11 = r1.A05
            boolean r10 = r1.A0I
            boolean r7 = r1.A0H
            X.5vk r6 = r1.A04
            X.5vl r5 = r1.A03
            com.instagram.api.schemas.RepostRestrictedReason r4 = r1.A01
            boolean r3 = r1.A0C
            boolean r0 = r1.A0F
            boolean r15 = r1.A0A
            X.0qQ.A0B(r9, r8)
            X.5vV r1 = new X.5vV
            r28 = r13
            r29 = r12
            r30 = r10
            r31 = r7
            r32 = r3
            r33 = r0
            r34 = r15
            r15 = r1
            r16 = r2
            r17 = r4
            r18 = r9
            r19 = r5
            r20 = r6
            r21 = r11
            r27 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x00bb
        L_0x05e6:
            boolean r0 = r1 instanceof X.C53480GpC
            if (r0 == 0) goto L_0x0607
            X.GpC r1 = (X.C53480GpC) r1
            X.5vJ r6 = r1.A00
            java.lang.String r5 = r1.A03
            java.lang.String r4 = r1.A02
            java.lang.Integer r3 = r1.A01
            boolean r0 = r1.A04
            X.AnonymousClass7TF.A1D(r6, r8, r3)
            X.GpC r1 = new X.GpC
            r7 = r1
            r8 = r2
            r9 = r6
            r10 = r3
            r11 = r5
            r12 = r4
            r13 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            goto L_0x00bb
        L_0x0607:
            boolean r0 = r1 instanceof X.C304306Cy
            if (r0 == 0) goto L_0x063f
            X.6Cy r1 = (X.C304306Cy) r1
            X.5vJ r12 = r1.A03
            java.lang.String r11 = r1.A07
            X.GlV r10 = r1.A05
            boolean r7 = r1.A08
            java.lang.String r6 = r1.A06
            int r5 = r1.A00
            X.5vR r4 = r1.A04
            int r3 = r1.A01
            X.0qQ.A0B(r12, r8)
            X.AnonymousClass7TF.A1C(r11, r9, r10)
            r0 = 7
            X.0qQ.A0B(r4, r0)
            X.6Cy r1 = new X.6Cy
            r13 = r1
            r14 = r2
            r15 = r12
            r16 = r4
            r17 = r10
            r18 = r11
            r19 = r6
            r20 = r5
            r21 = r3
            r22 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x00bb
        L_0x063f:
            boolean r0 = X.AnonymousClass9JB.A00(r8, r1)
            if (r0 == 0) goto L_0x0662
            X.9JB r1 = (X.AnonymousClass9JB) r1
            java.lang.Object r4 = r1.A02
            X.5vJ r4 = (X.C299505vJ) r4
            java.lang.String r3 = r1.A04
            java.lang.String r0 = r1.A03
            X.0qQ.A0B(r4, r8)
            X.AnonymousClass7TF.A1C(r3, r9, r0)
            X.9JB r1 = new X.9JB
            r9 = r1
            r10 = r2
            r11 = r4
            r12 = r3
            r13 = r0
            r14 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x00bb
        L_0x0662:
            boolean r0 = r1 instanceof X.AnonymousClass6DV
            if (r0 == 0) goto L_0x0679
            X.6DV r1 = (X.AnonymousClass6DV) r1
            X.5vJ r3 = r1.A00
            X.62P r0 = r1.A01
            X.0qQ.A0B(r3, r8)
            X.0qQ.A0B(r0, r9)
            X.6DV r1 = new X.6DV
            r1.<init>(r2, r3, r0)
            goto L_0x00bb
        L_0x0679:
            boolean r0 = X.C53486GpI.A00(r5, r1)
            if (r0 == 0) goto L_0x06a3
            X.GpI r1 = (X.C53486GpI) r1
            java.lang.Object r7 = r1.A03
            X.5vJ r7 = (X.C299505vJ) r7
            java.lang.String r6 = r1.A06
            java.lang.String r5 = r1.A07
            java.lang.String r4 = r1.A05
            java.lang.String r3 = r1.A04
            java.lang.Object r0 = r1.A01
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            X.AnonymousClass7TF.A1C(r7, r8, r5)
            X.GpI r1 = new X.GpI
            r8 = r1
            r9 = r2
            r10 = r7
            r11 = r0
            r12 = r6
            r13 = r5
            r14 = r4
            r15 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x00bb
        L_0x06a3:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56229Huw.A00(X.9IC, X.5vQ):X.5vQ");
    }
}
