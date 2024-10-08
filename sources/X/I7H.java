package X;

import android.content.Context;
import com.instagram.api.schemas.ClipsMidCardType;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class I7H {
    public static final I7H A00 = new Object();

    /* JADX WARNING: type inference failed for: r12v2, types: [X.MDU, X.4D7] */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        if (r2.size() != r5) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(android.content.Context r7, com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository r8, com.instagram.common.session.UserSession r9, X.I7H r10, X.AnonymousClass4D7 r11, int r12) {
        /*
            r5 = r12
            r3 = 2
            r4 = r11
            boolean r0 = r11 instanceof X.MDU
            if (r0 == 0) goto L_0x0087
            r12 = r4
            X.MDU r12 = (X.MDU) r12
            int r0 = r12.A0A
            if (r0 != r3) goto L_0x0087
            int r2 = r12.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0087
            int r2 = r2 - r1
            r12.A00 = r2
        L_0x0019:
            java.lang.Object r0 = r12.A09
            X.1Hj r4 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 == 0) goto L_0x0053
            if (r1 != r3) goto L_0x008d
            int r5 = r12.A01
            java.lang.Object r1 = r12.A08
            java.lang.Object r6 = r12.A07
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r12.A06
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r8 = r12.A05
            com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository r8 = (com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository) r8
            java.lang.Object r7 = r12.A04
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r9 = r12.A03
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            java.lang.Object r10 = r12.A02
            X.I7H r10 = (X.I7H) r10
            X.0eS.A00(r0)
        L_0x0043:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x004c
            r2.add(r1)
        L_0x004c:
            int r0 = r2.size()
            if (r0 != r5) goto L_0x0060
        L_0x0052:
            return r2
        L_0x0053:
            X.0eS.A00(r0)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r8.A00
            java.util.Iterator r6 = r0.iterator()
        L_0x0060:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r1 = r6.next()
            X.8vc r1 = (X.C369968vc) r1
            java.lang.String r11 = r1.A09
            r12.A02 = r10
            r12.A03 = r9
            r12.A04 = r7
            r12.A05 = r8
            r12.A06 = r2
            r12.A07 = r6
            r12.A08 = r1
            r12.A01 = r5
            r12.A00 = r3
            java.lang.Object r0 = A03(r7, r8, r9, r10, r11, r12)
            if (r0 != r4) goto L_0x0043
            return r4
        L_0x0087:
            X.MDU r12 = new X.MDU
            r12.<init>(r10, r11, r3)
            goto L_0x0019
        L_0x008d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7H.A04(android.content.Context, com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository, com.instagram.common.session.UserSession, X.I7H, X.4D7, int):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b6, code lost:
        if (r7 != null) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C53332GmI A08(android.content.Context r39, com.instagram.common.session.UserSession r40, X.C55892HpD r41) {
        /*
            r38 = this;
            r1 = 0
            r0 = r41
            X.0qQ.A0B(r0, r1)
            r5 = 1
            r4 = 5
            r10 = r40
            X.0qQ.A0B(r10, r5)
            r2 = 2
            r1 = 26
            r11 = r39
            X.0qQ.A0B(r11, r2)
            com.instagram.api.schemas.ClipsMidCardType r2 = r0.A0A
            int r3 = r2.ordinal()
            if (r3 == r4) goto L_0x0179
            if (r3 == r1) goto L_0x010c
            if (r3 == r5) goto L_0x0076
            r1 = 19
            if (r3 == r1) goto L_0x0027
            r13 = 0
        L_0x0026:
            return r13
        L_0x0027:
            java.lang.Integer r1 = r0.A03
            if (r1 == 0) goto L_0x0073
            int r36 = r1.intValue()
            X.Got r6 = r0.A02
            if (r6 == 0) goto L_0x0073
            java.util.List r8 = r6.A03
            if (r8 == 0) goto L_0x0073
            r5 = 0
            java.lang.Object r1 = X.00k.A0O(r8, r5)
            X.4sL r1 = (X.C276014sL) r1
            if (r1 == 0) goto L_0x0073
            X.1Xj r1 = r1.A00
            if (r1 == 0) goto L_0x0073
            X.1sQ r3 = X.C51966G9m.A0n(r1)
            if (r3 == 0) goto L_0x0073
            com.instagram.api.schemas.MusicInfo r1 = r3.BUr()
            if (r1 == 0) goto L_0x0067
            X.46h r4 = new X.46h
            r4.<init>(r1)
        L_0x0055:
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r8)
            java.util.Iterator r3 = r8.iterator()
        L_0x005d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0247
            A07(r7, r3)
            goto L_0x005d
        L_0x0067:
            com.instagram.api.schemas.OriginalSoundDataIntf r1 = r3.BZB()
            if (r1 == 0) goto L_0x0073
            X.5Bc r4 = new X.5Bc
            r4.<init>(r1)
            goto L_0x0055
        L_0x0073:
            r13 = 0
            goto L_0x0284
        L_0x0076:
            java.lang.Integer r1 = r0.A03
            r13 = 0
            if (r1 == 0) goto L_0x0026
            int r30 = r1.intValue()
            X.GoT r6 = r0.A00
            if (r6 == 0) goto L_0x0026
            java.util.List r7 = r6.A03
            r5 = 0
            if (r7 == 0) goto L_0x00a0
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x00a0
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r7)
            java.util.Iterator r3 = r7.iterator()
        L_0x0096:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x00b8
            A07(r4, r3)
            goto L_0x0096
        L_0x00a0:
            java.util.List r1 = r6.A02
            if (r1 == 0) goto L_0x0026
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r3 = r1.iterator()
        L_0x00ac:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x00b6
            A07(r4, r3)
            goto L_0x00ac
        L_0x00b6:
            if (r7 == 0) goto L_0x0109
        L_0x00b8:
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x0109
            java.lang.String r3 = "camera_roll_ray_ban_stories"
        L_0x00c0:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0026
            java.lang.Object r1 = r4.get(r5)
            X.4bN r1 = (X.C267324bN) r1
            X.1Xj r1 = r1.A02
            if (r1 == 0) goto L_0x0026
            java.lang.String r18 = r1.A2n()
            if (r18 == 0) goto L_0x0026
            java.lang.Integer r1 = r0.A0D
            com.instagram.api.schemas.InstagramMidcardType r11 = A00(r2)
            com.instagram.api.schemas.ClipsMidCardSubtype r10 = X.HTW.A00(r3)
            X.GmI r7 = new X.GmI
            r8 = r6
            r9 = r13
            r12 = r13
            r14 = r13
            r15 = r13
            r16 = r13
            r17 = r1
            r19 = r13
            r20 = r13
            r21 = r13
            r22 = r13
            r23 = r13
            r24 = r4
            r25 = r13
            r26 = r13
            r27 = r13
            r28 = r13
            r29 = r13
            r31 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r13 = r7
            goto L_0x0286
        L_0x0109:
            java.lang.String r3 = "camera_roll"
            goto L_0x00c0
        L_0x010c:
            java.lang.Integer r1 = r0.A03
            r13 = 0
            if (r1 == 0) goto L_0x0284
            int r36 = r1.intValue()
            X.BHo r6 = r0.A0B
            if (r6 == 0) goto L_0x0284
            java.util.List r1 = r6.A01
            if (r1 == 0) goto L_0x0284
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r3 = r1.iterator()
        L_0x0125:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x012f
            A07(r5, r3)
            goto L_0x0125
        L_0x012f:
            r4 = 0
            java.lang.Object r1 = r5.get(r4)
            X.4bN r1 = (X.C267324bN) r1
            X.1Xj r1 = r1.A02
            if (r1 == 0) goto L_0x0284
            java.lang.String r24 = r1.A2n()
            if (r24 == 0) goto L_0x0284
            java.lang.Integer r3 = r0.A0D
            com.instagram.api.schemas.InstagramMidcardType r17 = A00(r2)
            java.lang.String r1 = r6.A00
            com.instagram.api.schemas.ClipsMidCardSubtype r16 = X.HTW.A00(r1)
            r14 = 0
            X.GmI r13 = new X.GmI
            r15 = r14
            r18 = r14
            r19 = r14
            r21 = r14
            r22 = r14
            r25 = r14
            r26 = r14
            r27 = r14
            r28 = r14
            r29 = r14
            r30 = r5
            r31 = r14
            r32 = r14
            r33 = r14
            r34 = r14
            r35 = r14
            r37 = r4
            r20 = r6
            r23 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x0284
        L_0x0179:
            java.lang.Integer r1 = r0.A03
            r13 = 0
            if (r1 == 0) goto L_0x0026
            int r35 = r1.intValue()
            X.Goa r1 = r0.A01
            if (r1 == 0) goto L_0x0026
            java.lang.String r6 = r1.A02
            if (r6 == 0) goto L_0x0026
            java.util.List r4 = r1.A06
            if (r4 == 0) goto L_0x0026
            r3 = 10
            java.util.List r5 = X.00k.A0d(r4, r3)
            if (r5 == 0) goto L_0x0026
            r4 = 0
            java.util.List r7 = r1.A07
            if (r7 == 0) goto L_0x0244
            java.lang.Object r3 = X.00k.A0O(r7, r4)
            X.Gox r3 = (X.C53465Gox) r3
        L_0x01a1:
            java.util.ArrayList r31 = X.I5p.A03(r3)
            if (r7 == 0) goto L_0x0026
            java.lang.Object r3 = X.00k.A0O(r7, r4)
            X.Gox r3 = (X.C53465Gox) r3
            if (r3 == 0) goto L_0x0026
            int r9 = r3.A00
            java.lang.Integer r3 = X.I5p.A01(r31)
            if (r3 == 0) goto L_0x0026
            int r8 = r3.intValue()
            java.lang.Object r3 = X.00k.A0O(r7, r4)
            X.Gox r3 = (X.C53465Gox) r3
            if (r3 == 0) goto L_0x0026
            com.instagram.api.schemas.TrackData r12 = r3.A01
            if (r12 == 0) goto L_0x0026
            com.instagram.music.common.model.MusicAssetModel r7 = com.instagram.music.common.model.MusicAssetModel.A01(r12, r4)
            com.instagram.music.common.model.AudioOverlayTrack r3 = new com.instagram.music.common.model.AudioOverlayTrack
            r3.<init>(r7, r9, r8)
            java.lang.String r17 = r12.getProgressiveDownloadUrl()
            if (r17 == 0) goto L_0x01e1
            r14 = r11
            r15 = r10
            r16 = r3
            r18 = r9
            r19 = r8
            X.I5p.A04(r14, r15, r16, r17, r18, r19)
        L_0x01e1:
            X.1Xj r7 = X.DbZ.A0T(r5, r4)
            com.instagram.common.typedurl.ImageUrl r9 = r7.A1Q()
            if (r9 == 0) goto L_0x01f8
            X.1NK r8 = X.1NK.A00()
            java.lang.String r7 = "ClipsMidcard"
            X.1OO r7 = r8.A0J(r9, r7)
            r7.A01()
        L_0x01f8:
            X.4bN r7 = new X.4bN
            r7.<init>()
            java.util.List r29 = X.AnonymousClass7TE.A1I(r7)
            java.lang.String r9 = r1.A05
            java.lang.String r8 = r1.A04
            com.instagram.api.schemas.ClipsACRMidCardSubType r14 = r1.A00
            com.instagram.api.schemas.InstagramMidcardType r16 = A00(r2)
            if (r14 == 0) goto L_0x0242
            java.lang.String r2 = r14.A00
        L_0x020f:
            com.instagram.api.schemas.ClipsMidCardSubtype r15 = X.HTW.A00(r2)
            java.lang.String r7 = r1.A03
            java.lang.Integer r2 = r0.A0D
            java.lang.String r1 = r1.A01
            X.GmI r12 = new X.GmI
            r17 = r13
            r18 = r13
            r19 = r13
            r20 = r13
            r21 = r3
            r22 = r2
            r23 = r6
            r24 = r9
            r25 = r8
            r26 = r6
            r27 = r7
            r28 = r1
            r30 = r5
            r32 = r13
            r33 = r13
            r34 = r13
            r36 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r13 = r12
            goto L_0x0286
        L_0x0242:
            r2 = r13
            goto L_0x020f
        L_0x0244:
            r3 = r13
            goto L_0x01a1
        L_0x0247:
            java.lang.String r24 = r4.getAssetId()
            r14 = 0
            com.instagram.api.schemas.InstagramMidcardType r17 = A00(r2)
            com.instagram.api.schemas.ClipsRSAMidCardSubType r1 = r6.A00
            if (r1 == 0) goto L_0x028b
            java.lang.String r1 = r1.A00
        L_0x0256:
            com.instagram.api.schemas.ClipsMidCardSubtype r16 = X.HTW.A00(r1)
            X.GmI r13 = new X.GmI
            r15 = r14
            r18 = r14
            r20 = r14
            r22 = r14
            r23 = r14
            r25 = r14
            r26 = r14
            r27 = r14
            r28 = r14
            r29 = r14
            r30 = r7
            r31 = r14
            r32 = r14
            r33 = r14
            r34 = r14
            r35 = r14
            r37 = r5
            r21 = r4
            r19 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
        L_0x0284:
            if (r13 == 0) goto L_0x0026
        L_0x0286:
            java.lang.Integer r0 = r0.A0C
            r13.A00 = r0
            return r13
        L_0x028b:
            r1 = 0
            goto L_0x0256
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7H.A08(android.content.Context, com.instagram.common.session.UserSession, X.HpD):X.GmI");
    }

    /* JADX WARNING: type inference failed for: r15v1, types: [X.4D7, X.ME1] */
    /* JADX WARNING: type inference failed for: r15v5 */
    /* JADX WARNING: type inference failed for: r15v6 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(android.content.Context r23, X.C53452Gok r24, com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository r25, com.instagram.common.session.UserSession r26, X.I7H r27, X.AnonymousClass4D7 r28) {
        /*
            r11 = r25
            r9 = r24
            r12 = r26
            r10 = r23
            r3 = 17
            r4 = r28
            boolean r0 = X.ME1.A02(r3, r4)
            if (r0 == 0) goto L_0x009d
            r15 = r4
            X.ME1 r15 = (X.ME1) r15
            int r2 = r15.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009d
            int r2 = r2 - r1
            r15.A00 = r2
        L_0x0020:
            java.lang.Object r0 = r15.A06
            X.1Hj r1 = X.1Hj.A02
            int r4 = r15.A00
            r2 = 2
            r3 = 1
            r5 = 0
            if (r4 == 0) goto L_0x0043
            if (r4 == r3) goto L_0x006b
            if (r4 != r2) goto L_0x00e9
            java.lang.Object r14 = r15.A04
            java.lang.Object r10 = r15.A03
            android.content.Context r10 = (android.content.Context) r10
            java.lang.Object r12 = r15.A02
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            java.lang.Object r9 = r15.A01
            X.Gok r9 = (X.C53452Gok) r9
            X.0eS.A00(r0)
        L_0x0040:
            if (r0 != 0) goto L_0x00a6
            return r5
        L_0x0043:
            X.0eS.A00(r0)
            X.Goh r0 = r9.A06
            X.Goi r0 = r0.A01
            X.Goj r0 = r0.A00
            X.JSD r0 = r0.A03
            if (r0 == 0) goto L_0x00ee
            java.lang.String r14 = r0.Ayq()
            if (r14 == 0) goto L_0x00ee
            X.I7H r13 = A00
            r15.A01 = r11
            r15.A02 = r9
            r15.A03 = r12
            r15.A04 = r10
            r15.A05 = r14
            r15.A00 = r3
            java.lang.Object r0 = A03(r10, r11, r12, r13, r14, r15)
            if (r0 != r1) goto L_0x0082
            return r1
        L_0x006b:
            java.lang.Object r14 = r15.A05
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r10 = r15.A04
            android.content.Context r10 = (android.content.Context) r10
            java.lang.Object r12 = r15.A03
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            java.lang.Object r9 = r15.A02
            X.Gok r9 = (X.C53452Gok) r9
            java.lang.Object r11 = r15.A01
            com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository r11 = (com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository) r11
            X.0eS.A00(r0)
        L_0x0082:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x00ee
            r15.A01 = r9
            r15.A02 = r12
            r15.A03 = r10
            r15.A04 = r14
            r15.A05 = r5
            r15.A00 = r2
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r0 = r11.A01
            java.lang.Object r0 = r0.A09(r14, r15)
            if (r0 != r1) goto L_0x0040
            return r1
        L_0x009d:
            X.ME1 r15 = new X.ME1
            r0 = r27
            r15.<init>(r0, r4, r3)
            goto L_0x0020
        L_0x00a6:
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            java.util.List r24 = A06(r10, r12, r0)
            if (r24 != 0) goto L_0x00b1
            return r5
        L_0x00b1:
            java.lang.String r15 = r9.A09
            X.0sn r21 = X.0sn.A00
            int r1 = r9.A01
            int r0 = r9.A02
            com.instagram.api.schemas.InstagramMidcardType r8 = r9.A05
            com.instagram.api.schemas.ClipsMidCardSubtype r7 = r9.A03
            if (r7 != 0) goto L_0x00c1
            com.instagram.api.schemas.ClipsMidCardSubtype r7 = com.instagram.api.schemas.ClipsMidCardSubtype.A0v
        L_0x00c1:
            java.util.List r25 = X.AnonymousClass7TE.A1I(r14)
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r0)
            r28 = 0
            X.GmI r4 = new X.GmI
            r6 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            r16 = r5
            r17 = r5
            r18 = r5
            r19 = r5
            r20 = r5
            r22 = r5
            r23 = r5
            r26 = r5
            r27 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r4
        L_0x00e9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00ee:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7H.A01(android.content.Context, X.Gok, com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository, com.instagram.common.session.UserSession, X.I7H, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.MDt, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(android.content.Context r35, X.C53452Gok r36, com.instagram.common.session.UserSession r37, X.I7H r38, X.AnonymousClass4D7 r39) {
        /*
            r11 = r35
            r0 = r38
            r3 = r36
            r1 = r37
            r7 = 7
            r8 = r39
            boolean r2 = X.C66141MDt.A02(r7, r8)
            if (r2 == 0) goto L_0x020b
            r2 = r8
            X.MDt r2 = (X.C66141MDt) r2
            int r6 = r2.A00
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r6 & r5
            if (r4 == 0) goto L_0x020b
            int r6 = r6 - r5
            r2.A00 = r6
        L_0x001f:
            java.lang.Object r10 = r2.A08
            X.1Hj r4 = X.1Hj.A02
            int r5 = r2.A00
            r6 = 4
            r12 = 3
            r9 = 2
            r8 = 1
            if (r5 == 0) goto L_0x0072
            if (r5 == r8) goto L_0x0056
            if (r5 == r9) goto L_0x0039
            if (r5 == r12) goto L_0x00a4
            if (r5 != r6) goto L_0x0212
            java.lang.Object r15 = r2.A01
            X.0eS.A00(r10)
        L_0x0038:
            return r15
        L_0x0039:
            java.lang.Object r11 = r2.A07
            android.content.Context r11 = (android.content.Context) r11
            java.lang.Object r12 = r2.A06
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            java.lang.Object r5 = r2.A05
            X.Gok r5 = (X.C53452Gok) r5
            java.lang.Object r1 = r2.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r3 = r2.A02
            X.Gok r3 = (X.C53452Gok) r3
            java.lang.Object r0 = r2.A01
            X.I7H r0 = (X.I7H) r0
            X.0eS.A00(r10)
            goto L_0x00f6
        L_0x0056:
            java.lang.Object r11 = r2.A07
            android.content.Context r11 = (android.content.Context) r11
            java.lang.Object r12 = r2.A06
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            java.lang.Object r5 = r2.A05
            X.Gok r5 = (X.C53452Gok) r5
            java.lang.Object r1 = r2.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r3 = r2.A02
            X.Gok r3 = (X.C53452Gok) r3
            java.lang.Object r0 = r2.A01
            X.I7H r0 = (X.I7H) r0
            X.0eS.A00(r10)
            goto L_0x00d4
        L_0x0072:
            X.0eS.A00(r10)
            X.2MU r10 = com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository.A09
            android.content.Context r7 = r11.getApplicationContext()
            java.lang.String r5 = "null cannot be cast to non-null type android.app.Application"
            X.0qQ.A0C(r7, r5)
            android.app.Application r7 = (android.app.Application) r7
            com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository r13 = r10.A00(r7, r1)
            com.instagram.api.schemas.MidCardLayoutType r5 = r3.A07
            int r5 = r5.ordinal()
            if (r5 == r8) goto L_0x00b6
            if (r5 == r9) goto L_0x00d8
            r2.A01 = r0
            r2.A02 = r3
            r2.A03 = r1
            r2.A00 = r12
            r14 = r1
            r15 = r0
            r16 = r2
            r12 = r3
            java.lang.Object r10 = A01(r11, r12, r13, r14, r15, r16)
            if (r10 != r4) goto L_0x00b3
            return r4
        L_0x00a4:
            java.lang.Object r1 = r2.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r3 = r2.A02
            X.Gok r3 = (X.C53452Gok) r3
            java.lang.Object r0 = r2.A01
            X.I7H r0 = (X.I7H) r0
            X.0eS.A00(r10)
        L_0x00b3:
            r15 = r10
            goto L_0x01f1
        L_0x00b6:
            r2.A01 = r0
            r2.A02 = r3
            r2.A03 = r1
            r2.A04 = r0
            r2.A05 = r3
            r2.A06 = r1
            r2.A07 = r11
            r2.A00 = r8
            r12 = r13
            r13 = r1
            r14 = r0
            r15 = r2
            r16 = r6
            java.lang.Object r10 = A04(r11, r12, r13, r14, r15, r16)
            if (r10 == r4) goto L_0x020a
            r5 = r3
            r12 = r1
        L_0x00d4:
            java.util.List r10 = (java.util.List) r10
            r9 = 1
            goto L_0x00f9
        L_0x00d8:
            r16 = 5
            r2.A01 = r0
            r2.A02 = r3
            r2.A03 = r1
            r2.A04 = r0
            r2.A05 = r3
            r2.A06 = r1
            r2.A07 = r11
            r2.A00 = r9
            r12 = r13
            r13 = r1
            r14 = r0
            r15 = r2
            java.lang.Object r10 = A04(r11, r12, r13, r14, r15, r16)
            if (r10 == r4) goto L_0x020a
            r5 = r3
            r12 = r1
        L_0x00f6:
            java.util.List r10 = (java.util.List) r10
            r9 = 0
        L_0x00f9:
            int r7 = r10.size()
            if (r7 < r6) goto L_0x0141
            java.util.List r34 = A06(r11, r12, r10)
            r15 = 0
            if (r34 == 0) goto L_0x01f0
            if (r9 == 0) goto L_0x0126
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0p(r10)
            java.util.Iterator r8 = r10.iterator()
        L_0x0110:
            boolean r7 = r8.hasNext()
            if (r7 == 0) goto L_0x0127
            java.lang.Object r7 = r8.next()
            X.8vc r7 = (X.C369968vc) r7
            int r7 = r7.A00
            java.lang.String r7 = X.C347917xa.A01(r7)
            r9.add(r7)
            goto L_0x0110
        L_0x0126:
            r9 = r15
        L_0x0127:
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r10)
            java.util.Iterator r10 = r10.iterator()
        L_0x012f:
            boolean r7 = r10.hasNext()
            if (r7 == 0) goto L_0x01ae
            java.lang.Object r7 = r10.next()
            X.8vc r7 = (X.C369968vc) r7
            java.lang.String r7 = r7.A09
            r8.add(r7)
            goto L_0x012f
        L_0x0141:
            if (r7 < r8) goto L_0x01ac
            r7 = 0
            java.util.List r7 = r10.subList(r7, r8)
            java.util.List r35 = A06(r11, r12, r7)
            if (r35 == 0) goto L_0x01ac
            java.util.ArrayList r10 = X.AnonymousClass7TG.A0r(r7)
            java.util.Iterator r9 = r7.iterator()
        L_0x0156:
            boolean r7 = r9.hasNext()
            if (r7 == 0) goto L_0x0168
            java.lang.Object r7 = r9.next()
            X.8vc r7 = (X.C369968vc) r7
            java.lang.String r7 = r7.A09
            r10.add(r7)
            goto L_0x0156
        L_0x0168:
            java.lang.String r13 = r5.A09
            X.0sn r32 = X.0sn.A00
            int r11 = r5.A01
            int r12 = r5.A02
            com.instagram.api.schemas.InstagramMidcardType r9 = r5.A05
            com.instagram.api.schemas.ClipsMidCardSubtype r7 = r5.A03
            if (r7 != 0) goto L_0x0178
            com.instagram.api.schemas.ClipsMidCardSubtype r7 = com.instagram.api.schemas.ClipsMidCardSubtype.A0v
        L_0x0178:
            r16 = 0
            java.lang.Integer r25 = java.lang.Integer.valueOf(r12)
            X.GmI r15 = new X.GmI
            r17 = r16
            r20 = r5
            r21 = r16
            r22 = r16
            r23 = r16
            r24 = r16
            r26 = r13
            r27 = r16
            r28 = r16
            r29 = r16
            r30 = r16
            r31 = r16
            r33 = r16
            r34 = r16
            r36 = r10
            r37 = r16
            r38 = r11
            r39 = r8
            r18 = r7
            r19 = r9
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            goto L_0x01f0
        L_0x01ac:
            r15 = 0
            goto L_0x01f0
        L_0x01ae:
            java.lang.String r13 = r5.A09
            X.0sn r31 = X.0sn.A00
            int r11 = r5.A01
            int r12 = r5.A02
            com.instagram.api.schemas.InstagramMidcardType r10 = r5.A05
            com.instagram.api.schemas.ClipsMidCardSubtype r7 = r5.A03
            if (r7 != 0) goto L_0x01be
            com.instagram.api.schemas.ClipsMidCardSubtype r7 = com.instagram.api.schemas.ClipsMidCardSubtype.A0v
        L_0x01be:
            java.lang.Integer r24 = java.lang.Integer.valueOf(r12)
            r38 = 0
            X.GmI r14 = new X.GmI
            r16 = r15
            r20 = r15
            r21 = r15
            r22 = r15
            r23 = r15
            r26 = r15
            r27 = r15
            r28 = r15
            r29 = r15
            r30 = r15
            r32 = r15
            r33 = r15
            r35 = r8
            r36 = r9
            r37 = r11
            r25 = r13
            r18 = r10
            r19 = r5
            r17 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r15 = r14
        L_0x01f0:
            r10 = r15
        L_0x01f1:
            if (r10 != 0) goto L_0x0038
            r2.A01 = r10
            r5 = 0
            r2.A02 = r5
            r2.A03 = r5
            r2.A04 = r5
            r2.A05 = r5
            r2.A06 = r5
            r2.A07 = r5
            r2.A00 = r6
            java.lang.Object r0 = A05(r3, r1, r0, r2)
            if (r0 != r4) goto L_0x0038
        L_0x020a:
            return r4
        L_0x020b:
            X.MDt r2 = new X.MDt
            r2.<init>(r0, r8, r7)
            goto L_0x001f
        L_0x0212:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7H.A02(android.content.Context, X.Gok, com.instagram.common.session.UserSession, X.I7H, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(android.content.Context r6, com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository r7, com.instagram.common.session.UserSession r8, X.I7H r9, java.lang.String r10, X.AnonymousClass4D7 r11) {
        /*
            r4 = 29
            boolean r0 = X.C66147MDz.A02(r4, r11)
            if (r0 == 0) goto L_0x0077
            r3 = r11
            X.MDz r3 = (X.C66147MDz) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0077
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r3.A04
            X.1Hj r4 = X.1Hj.A02
            int r1 = r3.A00
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 == r0) goto L_0x004a
            if (r1 != r2) goto L_0x007d
            X.0eS.A00(r5)
        L_0x0027:
            X.GO1 r5 = (X.GO1) r5
            java.util.List r0 = r5.A00
            boolean r0 = r0.isEmpty()
        L_0x002f:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x0034:
            X.0eS.A00(r5)
            r3.A01 = r10
            r3.A02 = r8
            r3.A03 = r6
            r3.A00 = r0
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r0 = r7.A01
            X.2NP r0 = r0.A01
            java.lang.Object r5 = r0.A0H(r10, r3)
            if (r5 != r4) goto L_0x0059
            return r4
        L_0x004a:
            java.lang.Object r6 = r3.A03
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r8 = r3.A02
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            java.lang.Object r10 = r3.A01
            java.lang.String r10 = (java.lang.String) r10
            X.0eS.A00(r5)
        L_0x0059:
            boolean r0 = X.AnonymousClass7TE.A1a(r5)
            if (r0 == 0) goto L_0x0075
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            com.instagram.clips.drafts.model.validation.ClipsDraftValidator r1 = X.HWL.A00(r6, r8, r0)
            r0 = 0
            r3.A01 = r0
            r3.A02 = r0
            r3.A03 = r0
            r3.A00 = r2
            java.lang.Object r5 = r1.A01(r10, r3)
            if (r5 != r4) goto L_0x0027
            return r4
        L_0x0075:
            r0 = 0
            goto L_0x002f
        L_0x0077:
            X.MDz r3 = new X.MDz
            r3.<init>(r9, r11, r4)
            goto L_0x0016
        L_0x007d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7H.A03(android.content.Context, com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository, com.instagram.common.session.UserSession, X.I7H, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.Il7, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(X.C53452Gok r32, com.instagram.common.session.UserSession r33, X.I7H r34, X.AnonymousClass4D7 r35) {
        /*
            r3 = 19
            r4 = r35
            boolean r0 = X.C58075Il7.A02(r3, r4)
            if (r0 == 0) goto L_0x00b6
            r5 = r4
            X.Il7 r5 = (X.C58075Il7) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b6
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0018:
            java.lang.Object r1 = r5.A01
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r7 = 1
            if (r0 == 0) goto L_0x005f
            if (r0 != r7) goto L_0x00c6
            X.0eS.A00(r1)
        L_0x0026:
            boolean r0 = r1 instanceof X.C239793Ih
            r3 = 817892914(0x30c00e32, float:1.3973873E-9)
            if (r0 == 0) goto L_0x0056
            X.0wj r2 = X.0wj.A01
            java.lang.String r1 = "ClipsMidcardValidDisplayModelUtil"
            java.lang.String r0 = ": Write midcard seen state when draft data is invalid"
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.DbT.A1Q(r2, r0, r3)
            X.3Ih r1 = X.C51967G9n.A0d()
        L_0x003e:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0053
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00c1
            X.0wj r2 = X.0wj.A01
            java.lang.String r1 = "ClipsMidcardValidDisplayModelUtil"
            java.lang.String r0 = ": Failed to write midcard seen state when draft data is invalid"
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.DbT.A1Q(r2, r0, r3)
        L_0x0053:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x0056:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x003e
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x005f:
            X.0eS.A00(r1)
            r13 = r32
            java.lang.String r4 = r13.A09
            X.0sn r25 = X.0sn.A00
            int r2 = r13.A01
            int r1 = r13.A02
            com.instagram.api.schemas.InstagramMidcardType r12 = r13.A05
            com.instagram.api.schemas.ClipsMidCardSubtype r11 = r13.A03
            if (r11 != 0) goto L_0x0074
            com.instagram.api.schemas.ClipsMidCardSubtype r11 = com.instagram.api.schemas.ClipsMidCardSubtype.A0v
        L_0x0074:
            r9 = 0
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r3 = 0
            X.GmI r8 = new X.GmI
            r10 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r19 = r4
            r20 = r9
            r21 = r9
            r22 = r9
            r23 = r9
            r24 = r9
            r26 = r9
            r27 = r9
            r28 = r9
            r29 = r9
            r30 = r9
            r31 = r2
            r32 = r3
            r18 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r0 = r33
            X.1OC r2 = X.C56369HxN.A01(r8, r0)
            r5.A00 = r7
            r1 = 575058749(0x2246b33d, float:2.6928892E-18)
            r0 = 2
            java.lang.Object r1 = r2.A02(r5, r1, r0, r3)
            if (r1 != r6) goto L_0x0026
            return r6
        L_0x00b6:
            r0 = 42
            X.Il7 r5 = new X.Il7
            r1 = r34
            r5.<init>((java.lang.Object) r1, (X.AnonymousClass4D7) r4, (int) r3, (int) r0)
            goto L_0x0018
        L_0x00c1:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00c6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7H.A05(X.Gok, com.instagram.common.session.UserSession, X.I7H, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r5 == null) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(android.content.Context r31, X.C53452Gok r32, com.instagram.common.session.UserSession r33, X.AnonymousClass4D7 r34) {
        /*
            r30 = this;
            r10 = r32
            r3 = 43
            r5 = r34
            boolean r0 = X.C66139MDr.A01(r3, r5)
            r6 = r30
            if (r0 == 0) goto L_0x00aa
            r4 = r5
            X.MDr r4 = (X.C66139MDr) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00aa
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001c:
            java.lang.Object r5 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r1 = r4.A00
            r2 = 1
            r0 = 9
            if (r1 == 0) goto L_0x003e
            if (r1 != r2) goto L_0x00b1
            java.lang.Object r10 = r4.A01
            X.Gok r10 = (X.C53452Gok) r10
            X.0eS.A00(r5)
        L_0x0030:
            X.GmI r5 = (X.C53332GmI) r5
            if (r5 == 0) goto L_0x003d
        L_0x0034:
            int r1 = r10.A00
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r5.A00 = r0
        L_0x003d:
            return r5
        L_0x003e:
            X.0eS.A00(r5)
            com.instagram.api.schemas.InstagramMidcardType r9 = r10.A05
            int r1 = r9.ordinal()
            if (r1 == r0) goto L_0x009b
            r0 = 33
            if (r1 == r0) goto L_0x00b6
            X.Goh r0 = r10.A06
            java.util.List r0 = r0.A08
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0059:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0063
            A07(r3, r1)
            goto L_0x0059
        L_0x0063:
            java.lang.String r2 = r10.A09
            int r1 = r10.A01
            int r0 = r10.A02
            com.instagram.api.schemas.ClipsMidCardSubtype r8 = r10.A03
            if (r8 != 0) goto L_0x006f
            com.instagram.api.schemas.ClipsMidCardSubtype r8 = com.instagram.api.schemas.ClipsMidCardSubtype.A0v
        L_0x006f:
            r6 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            r29 = 0
            X.GmI r5 = new X.GmI
            r7 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r16 = r2
            r17 = r6
            r18 = r6
            r19 = r6
            r20 = r6
            r21 = r6
            r22 = r3
            r23 = r6
            r24 = r6
            r25 = r6
            r26 = r6
            r27 = r6
            r28 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x0034
        L_0x009b:
            r4.A01 = r10
            r4.A00 = r2
            r1 = r31
            r0 = r33
            java.lang.Object r5 = A02(r1, r10, r0, r6, r4)
            if (r5 != r3) goto L_0x0030
            return r3
        L_0x00aa:
            X.MDr r4 = new X.MDr
            r4.<init>(r6, r5, r3)
            goto L_0x001c
        L_0x00b1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00b6:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7H.A09(android.content.Context, X.Gok, com.instagram.common.session.UserSession, X.4D7):java.lang.Object");
    }

    public static final InstagramMidcardType A00(ClipsMidCardType clipsMidCardType) {
        int ordinal = clipsMidCardType.ordinal();
        if (ordinal == 5) {
            return InstagramMidcardType.A0F;
        }
        if (ordinal == 26) {
            return InstagramMidcardType.A0e;
        }
        if (ordinal == 1) {
            return InstagramMidcardType.A09;
        }
        if (ordinal == 19) {
            return InstagramMidcardType.A0V;
        }
        if (ordinal != 24) {
            return InstagramMidcardType.A0j;
        }
        return InstagramMidcardType.A0a;
    }

    public static final List A06(Context context, UserSession userSession, List list) {
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                String A002 = C394639yR.A00(context, (C369968vc) it.next(), userSession);
                if (A002 == null) {
                    break;
                }
                A0r.add(C253833rU.A01(new File(A002)));
            } else if (!A0r.isEmpty()) {
                return A0r;
            }
        }
        return null;
    }

    public static void A07(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(C295375o3.A02(((C276014sL) it.next()).A00));
    }
}
