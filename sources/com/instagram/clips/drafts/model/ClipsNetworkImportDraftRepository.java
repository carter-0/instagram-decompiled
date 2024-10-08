package com.instagram.clips.drafts.model;

import X.02z;
import X.05G;
import X.0qQ;
import X.0sn;
import X.106;
import X.10b;
import X.19E;
import X.2Nn;
import X.AnonymousClass0Ud;
import X.AnonymousClass12T;
import X.AnonymousClass19G;
import X.C262204Co;
import X.C262224Cq;
import X.C369968vc;
import android.content.Context;
import com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource;
import com.instagram.clips.drafts.model.datasource.ClipsImportDraftDataSource;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class ClipsNetworkImportDraftRepository {
    public final Context A00;
    public final ClipsDraftLocalDataSource A01;
    public final ClipsImportDraftDataSource A02;
    public final UserSession A03;
    public final CameraSpec A04;
    public final 2Nn A05;
    public final HashSet A06 = new HashSet();
    public final HashSet A07 = new HashSet();
    public final HashSet A08 = new HashSet();
    public final C262224Cq A09 = 19E.A02(AnonymousClass12T.A00.CO6(480314591, 3).plus(new AnonymousClass19G((C262204Co) null)));
    public final AnonymousClass0Ud A0A;
    public final 05G A0B;

    /* JADX WARNING: type inference failed for: r1v2, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository r32, X.AnonymousClass55Q r33, java.lang.String r34, java.lang.String r35, java.util.List r36, X.AnonymousClass4D7 r37, X.C62320sa r38) {
        /*
            r0 = r32
            r2 = r34
            r6 = 35
            r7 = r37
            boolean r1 = X.C66146MDy.A02(r6, r7)
            if (r1 == 0) goto L_0x01f2
            r1 = r7
            X.MDy r1 = (X.C66146MDy) r1
            int r5 = r1.A00
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r5 & r4
            if (r3 == 0) goto L_0x01f2
            int r5 = r5 - r4
            r1.A00 = r5
        L_0x001c:
            java.lang.Object r4 = r1.A03
            X.1Hj r6 = X.1Hj.A02
            int r3 = r1.A00
            r5 = 1
            if (r3 == 0) goto L_0x0038
            if (r3 != r5) goto L_0x01f9
            java.lang.Object r2 = r1.A02
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r1.A01
            com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository r0 = (com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository) r0
            X.0eS.A00(r4)
        L_0x0032:
            A02(r0, r2)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0038:
            X.0eS.A00(r4)
            r3 = 10
            r4 = r33
            r8 = r36
            int r7 = X.0Yv.A1E(r8, r3)     // Catch:{ all -> 0x016a }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x016a }
            r3.<init>(r7)     // Catch:{ all -> 0x016a }
            java.util.Iterator r12 = r8.iterator()     // Catch:{ all -> 0x016a }
        L_0x004e:
            boolean r7 = r12.hasNext()     // Catch:{ all -> 0x016a }
            if (r7 == 0) goto L_0x0170
            java.lang.Object r14 = r12.next()     // Catch:{ all -> 0x016a }
            com.instagram.common.gallery.Medium r14 = (com.instagram.common.gallery.Medium) r14     // Catch:{ all -> 0x016a }
            boolean r7 = r14.A05()     // Catch:{ all -> 0x016a }
            if (r7 == 0) goto L_0x0111
            X.2Nn r10 = r0.A05     // Catch:{ all -> 0x016a }
            java.lang.String r9 = ".mp4"
            java.lang.String r7 = "draft_import"
            java.io.File r7 = X.C39907AIy.A03(r10, r2, r9, r7)     // Catch:{ all -> 0x016a }
            com.instagram.common.session.UserSession r15 = r0.A03     // Catch:{ all -> 0x016a }
            java.lang.String r17 = r7.getCanonicalPath()     // Catch:{ all -> 0x016a }
            X.0qQ.A07(r17)     // Catch:{ all -> 0x016a }
            com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec r7 = r0.A04     // Catch:{ all -> 0x016a }
            r19 = 5000(0x1388, double:2.4703E-320)
            r18 = 2
            r21 = 0
            X.TNo r13 = new X.TNo     // Catch:{ all -> 0x016a }
            r22 = r21
            r16 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19, r21, r22)     // Catch:{ all -> 0x016a }
            X.7zv r10 = r13.call()     // Catch:{ all -> 0x016a }
            com.instagram.common.gallery.metadata.MediaUploadMetadata r9 = r10.A02()     // Catch:{ all -> 0x016a }
            java.lang.Long r7 = r4.A02     // Catch:{ all -> 0x016a }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x016a }
            r9.A08 = r7     // Catch:{ all -> 0x016a }
            int r7 = r10.A07     // Catch:{ all -> 0x016a }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x016a }
            X.0eP r9 = new X.0eP     // Catch:{ all -> 0x016a }
            r9.<init>(r10, r7)     // Catch:{ all -> 0x016a }
        L_0x009f:
            java.lang.Object r10 = r9.A00     // Catch:{ all -> 0x016a }
            X.7zv r10 = (X.C349307zv) r10     // Catch:{ all -> 0x016a }
            java.lang.Object r7 = r9.A01     // Catch:{ all -> 0x016a }
            java.lang.Number r7 = (java.lang.Number) r7     // Catch:{ all -> 0x016a }
            int r9 = r7.intValue()     // Catch:{ all -> 0x016a }
            java.lang.Integer r7 = r4.A00     // Catch:{ all -> 0x016a }
            if (r7 == 0) goto L_0x010e
            int r7 = r7.intValue()     // Catch:{ all -> 0x016a }
        L_0x00b3:
            X.51R r17 = X.C39821AAs.A00(r10, r7, r9, r9)     // Catch:{ all -> 0x016a }
            X.51S r9 = X.AnonymousClass9NO.A00()     // Catch:{ all -> 0x016a }
            java.lang.Long r7 = r4.A01     // Catch:{ all -> 0x016a }
            if (r7 == 0) goto L_0x0162
            long r10 = r7.longValue()     // Catch:{ all -> 0x016a }
            java.lang.String r7 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x016a }
            com.instagram.api.schemas.CameraTool r11 = X.C2807253k.A00(r7)     // Catch:{ all -> 0x016a }
            r23 = 0
            java.lang.Float r10 = java.lang.Float.valueOf(r23)     // Catch:{ all -> 0x016a }
            com.instagram.feed.media.CameraToolInfo r7 = new com.instagram.feed.media.CameraToolInfo     // Catch:{ all -> 0x016a }
            r7.<init>(r11, r10, r10, r10)     // Catch:{ all -> 0x016a }
            java.util.List r7 = java.util.Collections.singletonList(r7)     // Catch:{ all -> 0x016a }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x016a }
            r9.A03 = r7     // Catch:{ all -> 0x016a }
            r24 = 0
            r14 = 0
            r30 = 1073741820(0x3ffffffc, float:1.9999995)
            X.51M r13 = new X.51M     // Catch:{ all -> 0x016a }
            r15 = r14
            r18 = r14
            r19 = r14
            r20 = r14
            r21 = r14
            r22 = r14
            r25 = r24
            r26 = r24
            r27 = r24
            r28 = r24
            r29 = r24
            r31 = r24
            r32 = r24
            r33 = r24
            r34 = r24
            r16 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x016a }
            r3.add(r13)     // Catch:{ all -> 0x016a }
            goto L_0x004e
        L_0x010e:
            r7 = 32
            goto L_0x00b3
        L_0x0111:
            X.2Nn r10 = r0.A05     // Catch:{ all -> 0x016a }
            java.lang.String r9 = ".mp4"
            java.lang.String r7 = "draft_import"
            java.io.File r10 = X.C39907AIy.A03(r10, r2, r9, r7)     // Catch:{ all -> 0x016a }
            java.lang.String r9 = r14.A0X     // Catch:{ all -> 0x016a }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x016a }
            r7.<init>(r9)     // Catch:{ all -> 0x016a }
            boolean r7 = r7.renameTo(r10)     // Catch:{ all -> 0x016a }
            if (r7 == 0) goto L_0x0152
            r14.A04(r10)     // Catch:{ all -> 0x016a }
            android.content.Context r11 = r0.A00     // Catch:{ all -> 0x016a }
            com.instagram.common.session.UserSession r10 = r0.A03     // Catch:{ all -> 0x016a }
            r9 = 0
            X.JZ5 r7 = new X.JZ5     // Catch:{ all -> 0x016a }
            r7.<init>(r11, r14, r10, r9)     // Catch:{ all -> 0x016a }
            X.7zv r10 = r7.call()     // Catch:{ all -> 0x016a }
            com.instagram.common.gallery.metadata.MediaUploadMetadata r9 = r10.A02()     // Catch:{ all -> 0x016a }
            java.lang.Long r7 = r4.A02     // Catch:{ all -> 0x016a }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x016a }
            r9.A08 = r7     // Catch:{ all -> 0x016a }
            int r7 = r14.A03     // Catch:{ all -> 0x016a }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x016a }
            X.0eP r9 = new X.0eP     // Catch:{ all -> 0x016a }
            r9.<init>(r10, r7)     // Catch:{ all -> 0x016a }
            goto L_0x009f
        L_0x0152:
            java.lang.String r9 = "Unable to rename file "
            java.lang.String r7 = r14.A0X     // Catch:{ all -> 0x016a }
            java.lang.String r3 = " for draftId: "
            java.lang.String r3 = X.002.A0u(r9, r7, r3, r2)     // Catch:{ all -> 0x016a }
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x016a }
            r7.<init>(r3)     // Catch:{ all -> 0x016a }
            goto L_0x0169
        L_0x0162:
            java.lang.String r3 = "Required value was null."
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x016a }
            r7.<init>(r3)     // Catch:{ all -> 0x016a }
        L_0x0169:
            throw r7     // Catch:{ all -> 0x016a }
        L_0x016a:
            r7 = move-exception
            X.0eQ r3 = new X.0eQ
            r3.<init>(r7)
        L_0x0170:
            java.lang.Throwable r11 = X.0eR.A00(r3)
            if (r11 == 0) goto L_0x018e
            X.0wj r10 = X.0wj.A01
            r9 = 817902720(0x30c03480, float:1.398476E-9)
            java.lang.String r7 = "ClipsNetworkImportDraftRepository"
            X.0f9 r10 = r10.AEf(r7, r9)
            java.lang.String r9 = "message"
            java.lang.String r7 = "Unable to parse clips"
            r10.ABQ(r9, r7)
            r10.ERJ(r11)
            r10.report()
        L_0x018e:
            boolean r12 = r3 instanceof X.0eQ
            r7 = r12 ^ 1
            r10 = r38
            if (r7 == 0) goto L_0x01ed
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r9 = r0.A01
            X.JXe r11 = new X.JXe
            r11.<init>()
            java.lang.Object r7 = X.00k.A0J(r8)
            com.instagram.common.gallery.Medium r7 = (com.instagram.common.gallery.Medium) r7
            r8 = 0
            if (r7 == 0) goto L_0x01a8
            java.lang.String r8 = r7.A0a
        L_0x01a8:
            X.JXc r7 = new X.JXc
            r7.<init>(r8)
            r11.A0C = r7
            X.JXc r7 = new X.JXc
            r8 = r35
            r7.<init>(r8)
            r11.A0g = r7
            X.JXu r7 = X.JXu.A03
            r11.A05(r7)
            X.0sn r7 = X.0sn.A00
            if (r12 == 0) goto L_0x01c2
            r3 = r7
        L_0x01c2:
            java.util.List r3 = (java.util.List) r3
            r11.A06(r3)
            java.lang.Long r3 = r4.A02
            java.lang.String r7 = java.lang.String.valueOf(r3)
            X.JXc r3 = new X.JXc
            r3.<init>(r7)
            r11.A0Z = r3
            X.50r r3 = X.C2801950r.CLIPS
            X.5kq r8 = r11.A02(r3, r2)
            r7 = 0
            X.Ldl r3 = new X.Ldl
            r3.<init>(r0, r4, r2, r10)
            r1.A01 = r0
            r1.A02 = r2
            r1.A00 = r5
            java.lang.Object r1 = r9.A01(r3, r8, r1, r7)
            if (r1 != r6) goto L_0x0032
            return r6
        L_0x01ed:
            r10.invoke()
            goto L_0x0032
        L_0x01f2:
            X.MDy r1 = new X.MDy
            r1.<init>(r0, r7, r6)
            goto L_0x001c
        L_0x01f9:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository.A00(com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository, X.55Q, java.lang.String, java.lang.String, java.util.List, X.4D7, X.0sa):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [X.4D7, X.ME1] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository r29, X.AnonymousClass55Q r30, java.lang.String r31, java.util.List r32, X.AnonymousClass4D7 r33, X.C62320sa r34) {
        /*
            r4 = r30
            r5 = r34
            r2 = r29
            r3 = r31
            r10 = 3
            r7 = r33
            boolean r0 = X.ME1.A02(r10, r7)
            if (r0 == 0) goto L_0x0177
            r9 = r7
            X.ME1 r9 = (X.ME1) r9
            int r6 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r6 & r1
            if (r0 == 0) goto L_0x0177
            int r6 = r6 - r1
            r9.A00 = r6
        L_0x001f:
            java.lang.Object r1 = r9.A06
            X.1Hj r8 = X.1Hj.A02
            int r0 = r9.A00
            r11 = 2
            r7 = 1
            if (r0 == 0) goto L_0x004d
            if (r0 == r7) goto L_0x0121
            if (r0 != r11) goto L_0x0184
            java.lang.Object r3 = r9.A02
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r9.A01
            com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository r2 = (com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository) r2
            X.0eS.A00(r1)
        L_0x0038:
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
        L_0x003f:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x004a
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x017e
            A02(r2, r3)
        L_0x004a:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x004d:
            X.0eS.A00(r1)
            r34 = r32
            java.lang.Object r6 = X.00k.A0J(r34)
            X.1Xj r6 = (X.1Xj) r6
            if (r6 == 0) goto L_0x004a
            r0 = 0
            java.util.Iterator r14 = r34.iterator()
        L_0x0060:
            boolean r12 = r14.hasNext()
            if (r12 == 0) goto L_0x007b
            java.lang.Object r13 = r14.next()
            X.1Xj r13 = (X.1Xj) r13
            boolean r12 = r13.A5p()
            if (r12 == 0) goto L_0x0076
            r12 = 5000(0x1388, double:2.4703E-320)
        L_0x0074:
            long r0 = r0 + r12
            goto L_0x0060
        L_0x0076:
            long r12 = r13.A1B()
            goto L_0x0074
        L_0x007b:
            int r15 = (int) r0
            X.05G r14 = r2.A0B
            java.lang.Object r0 = r14.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            X.50r r17 = X.C2801950r.CLIPS
            long r27 = r6.A1A()
            r12 = 1000(0x3e8, double:4.94E-321)
            long r27 = r27 * r12
            long r29 = r6.A1A()
            long r29 = r29 * r12
            r13 = 0
            r12 = 0
            X.8vc r1 = new X.8vc
            r18 = r13
            r19 = r13
            r21 = r13
            r22 = r13
            r23 = r13
            r24 = r13
            r25 = r13
            r26 = r15
            r31 = r12
            r32 = r12
            r33 = r7
            r20 = r3
            r16 = r13
            r15 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r32, r33)
            java.util.ArrayList r0 = X.00k.A0T(r1, r0)
            r14.Epw(r0)
            com.instagram.clips.drafts.model.datasource.ClipsImportDraftDataSource r0 = r2.A02
            r9.A01 = r2
            r9.A02 = r3
            r9.A03 = r4
            r9.A04 = r5
            r9.A05 = r6
            r9.A00 = r7
            X.72Q r1 = r0.A00
            r14 = 10
            r0 = r34
            int r0 = X.0Yv.A1E(r0, r14)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r0)
            java.util.Iterator r15 = r34.iterator()
        L_0x00de:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r0 = r15.next()
            X.1Xj r0 = (X.1Xj) r0
            com.instagram.common.gallery.Medium r0 = r1.A00(r0)
            r14.add(r0)
            goto L_0x00de
        L_0x00f2:
            X.5g0 r14 = r1.A01(r14, r13)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.1IW.A02
            X.4D7 r0 = X.1Ey.A02(r9)
            X.1IW r13 = new X.1IW
            r13.<init>(r7, r0)
            r13.A0I()
            X.KGu r0 = new X.KGu
            r0.<init>(r13)
            r14.A00 = r0
            r1 = 8
            X.J6O r0 = new X.J6O
            r0.<init>(r14, r1)
            r13.CO0(r0)
            r0 = 99
            X.1ES.A05(r14, r0, r10, r7, r12)
            java.lang.Object r1 = r13.A0E()
            if (r1 != r8) goto L_0x0138
            return r8
        L_0x0121:
            java.lang.Object r6 = r9.A05
            X.1Xj r6 = (X.1Xj) r6
            java.lang.Object r5 = r9.A04
            X.0sa r5 = (X.C62320sa) r5
            java.lang.Object r4 = r9.A03
            X.55Q r4 = (X.AnonymousClass55Q) r4
            java.lang.Object r3 = r9.A02
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r9.A01
            com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository r2 = (com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository) r2
            X.0eS.A00(r1)
        L_0x0138:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x016d
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r1 = r1.A00
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0038
            java.lang.String r13 = r6.getId()
            if (r13 == 0) goto L_0x018c
            r9.A01 = r2
            r9.A02 = r3
            r0 = 0
            r9.A03 = r0
            r9.A04 = r0
            r9.A05 = r0
            r9.A00 = r11
            r16 = r5
            r10 = r2
            r11 = r4
            r12 = r3
            r14 = r1
            r15 = r9
            java.lang.Object r0 = A00(r10, r11, r12, r13, r14, r15, r16)
            if (r0 != r8) goto L_0x0038
            return r8
        L_0x016d:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x003f
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0177:
            X.ME1 r9 = new X.ME1
            r9.<init>(r2, r7, r10)
            goto L_0x001f
        L_0x017e:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0184:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x018c:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository.A01(com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository, X.55Q, java.lang.String, java.util.List, X.4D7, X.0sa):java.lang.Object");
    }

    public static final void A02(ClipsNetworkImportDraftRepository clipsNetworkImportDraftRepository, String str) {
        clipsNetworkImportDraftRepository.A07.remove(str);
        05G r4 = clipsNetworkImportDraftRepository.A0B;
        ArrayList arrayList = new ArrayList();
        for (Object next : (List) r4.getValue()) {
            if (!0qQ.A0K(((C369968vc) next).A09, str)) {
                arrayList.add(next);
            }
        }
        r4.Epw(arrayList);
    }

    public ClipsNetworkImportDraftRepository(Context context, ClipsDraftLocalDataSource clipsDraftLocalDataSource, ClipsImportDraftDataSource clipsImportDraftDataSource, UserSession userSession, CameraSpec cameraSpec, 2Nn r10) {
        this.A00 = context;
        this.A03 = userSession;
        this.A02 = clipsImportDraftDataSource;
        this.A01 = clipsDraftLocalDataSource;
        this.A05 = r10;
        this.A04 = cameraSpec;
        02z A012 = 106.A01(0sn.A00);
        this.A0B = A012;
        this.A0A = 10b.A03(A012);
    }
}
