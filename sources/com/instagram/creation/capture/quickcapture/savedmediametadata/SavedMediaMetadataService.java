package com.instagram.creation.capture.quickcapture.savedmediametadata;

import X.0qQ;
import X.AnonymousClass8WL;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.common.session.UserSession;

public final class SavedMediaMetadataService {
    public final UserSession A00;
    public final EffectCollectionService A01;
    public final AnonymousClass8WL A02;

    public SavedMediaMetadataService(EffectCollectionService effectCollectionService, UserSession userSession, AnonymousClass8WL r4) {
        0qQ.A0B(effectCollectionService, 2);
        this.A00 = userSession;
        this.A01 = effectCollectionService;
        this.A02 = r4;
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C279284yO r27, com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService r28, java.util.List r29, X.AnonymousClass4D7 r30) {
        /*
            r0 = r28
            r6 = r29
            r1 = r27
            r7 = 2
            r8 = r30
            boolean r2 = X.C376789Ji.A00(r7, r8)
            if (r2 == 0) goto L_0x00e2
            r3 = r8
            X.9Ji r3 = (X.C376789Ji) r3
            int r5 = r3.A00
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r5 & r4
            if (r2 == 0) goto L_0x00e2
            int r5 = r5 - r4
            r3.A00 = r5
        L_0x001d:
            java.lang.Object r10 = r3.A06
            X.1Hj r8 = X.1Hj.A02
            int r2 = r3.A00
            r5 = 1
            if (r2 == 0) goto L_0x00b6
            if (r2 != r5) goto L_0x010c
            java.lang.Object r4 = r3.A05
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r2 = r3.A04
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r3.A03
            X.4yO r1 = (X.C279284yO) r1
            java.lang.Object r6 = r3.A02
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r0 = r3.A01
            com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService r0 = (com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService) r0
            X.0eS.A00(r10)
        L_0x003f:
            X.3Ii r10 = (X.C239803Ii) r10
            boolean r9 = r10 instanceof X.C239793Ih
            if (r9 == 0) goto L_0x0084
            X.3Ih r10 = (X.C239793Ih) r10
            java.lang.Object r9 = r10.A00
            com.instagram.camera.effect.models.CameraAREffect r9 = (com.instagram.camera.effect.models.CameraAREffect) r9
            r2.add(r9)
            com.instagram.common.session.UserSession r10 = r0.A00
            X.27r r14 = X.27p.A01(r10)
            X.JVj r15 = X.C59725JVj.POST_CAPTURE
            r25 = -1
            java.lang.String r13 = r9.A0K
            java.lang.String r12 = r9.A0M
            java.lang.String r11 = r9.A0B
            java.lang.String r10 = r9.A0C
            r27 = 0
            X.C359198cG.A00(r1)
            r16 = 0
            java.lang.String r9 = r9.A0I
            r28 = 4
            r21 = r16
            r22 = r16
            r24 = r16
            r26 = r25
            r29 = r27
            r30 = r27
            r23 = r9
            r20 = r10
            r19 = r11
            r18 = r12
            r17 = r13
            r14.A1P(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x0084:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x00e9
            java.lang.Object r12 = r4.next()
            java.lang.String r12 = (java.lang.String) r12
            com.instagram.ar.core.effectcollection.EffectCollectionService r10 = r0.A01
            boolean r9 = r1 instanceof X.AnonymousClass80O
            if (r9 == 0) goto L_0x00b3
            X.8cI r11 = X.C359218cI.A08
        L_0x0098:
            r13 = 0
            X.0qQ.A0B(r12, r5)
            r3.A01 = r0
            r3.A02 = r6
            r3.A03 = r1
            r3.A04 = r2
            r3.A05 = r4
            r3.A00 = r5
            r16 = 90
            r14 = r13
            r15 = r3
            java.lang.Object r10 = com.instagram.ar.core.effectcollection.EffectCollectionService.A03(r10, r11, r12, r13, r14, r15, r16)
            if (r10 != r8) goto L_0x003f
            return r8
        L_0x00b3:
            X.8cI r11 = X.C359218cI.A0H
            goto L_0x0098
        L_0x00b6:
            X.0eS.A00(r10)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.8WL r4 = r0.A02
            int r9 = r6.size()
            X.0qQ.A0B(r1, r5)
            X.02m r12 = r4.A01
            int r11 = r4.A00
            r10 = 17640219(0x10d2b1b, float:2.5928537E-38)
            r12.markerStart(r10, r11)
            java.lang.String r4 = "effects_count"
            r12.markerAnnotate(r10, r11, r4, r9)
            java.lang.String r9 = r1.A02
            java.lang.String r4 = "effects_source"
            r12.markerAnnotate(r10, r11, r4, r9)
            java.util.Iterator r4 = r6.iterator()
            goto L_0x0084
        L_0x00e2:
            X.9Ji r3 = new X.9Ji
            r3.<init>(r0, r8, r7)
            goto L_0x001d
        L_0x00e9:
            int r3 = r6.size()
            int r1 = r2.size()
            X.8WL r0 = r0.A02
            if (r3 != r1) goto L_0x0100
            X.02m r3 = r0.A01
            int r1 = r0.A00
            r0 = 17640219(0x10d2b1b, float:2.5928537E-38)
            r3.markerEnd(r0, r1, r7)
            return r2
        L_0x0100:
            X.02m r4 = r0.A01
            int r3 = r0.A00
            r1 = 17640219(0x10d2b1b, float:2.5928537E-38)
            r0 = 3
            r4.markerEnd(r1, r3, r0)
            return r2
        L_0x010c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService.A00(X.4yO, com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C352218Cl r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r3 = 16
            boolean r0 = X.C376709Ja.A00(r3, r8)
            if (r0 == 0) goto L_0x00b4
            r5 = r8
            X.9Ja r5 = (X.C376709Ja) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b4
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0092
            if (r0 != r3) goto L_0x00bb
            java.lang.Object r2 = r5.A02
            X.9U5 r2 = (X.AnonymousClass9U5) r2
            java.lang.Object r7 = r5.A01
            X.8Cl r7 = (X.C352218Cl) r7
            X.0eS.A00(r1)
        L_0x002c:
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = X.00k.A0N(r1)
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            if (r0 == 0) goto L_0x0038
            r7.A0E = r0
        L_0x0038:
            java.lang.Float r0 = r2.A01
            if (r0 == 0) goto L_0x0047
            float r1 = r0.floatValue()
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r1)
            r7.A0O = r0
        L_0x0047:
            java.lang.Long r0 = r2.A05
            if (r0 == 0) goto L_0x0056
            long r3 = r0.longValue()
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r3)
            r7.A0W = r0
        L_0x0056:
            java.lang.Integer r0 = r2.A04
            if (r0 == 0) goto L_0x0065
            int r1 = r0.intValue()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r7.A0T = r0
        L_0x0065:
            java.lang.Float r0 = r2.A02
            if (r0 == 0) goto L_0x0074
            float r1 = r0.floatValue()
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r1)
            r7.A0P = r0
        L_0x0074:
            java.lang.Integer r0 = r2.A03
            if (r0 == 0) goto L_0x0083
            int r1 = r0.intValue()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r7.A0Q = r0
        L_0x0083:
            X.8GK r0 = r2.A00
            if (r0 == 0) goto L_0x0089
            r7.A0K = r0
        L_0x0089:
            java.lang.String r0 = r2.A06
            if (r0 == 0) goto L_0x008f
            r7.A0b = r0
        L_0x008f:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0092:
            X.0eS.A00(r1)
            java.lang.String r0 = r7.A06()
            X.9U5 r2 = X.AnonymousClass8VQ.A00(r0)
            if (r2 == 0) goto L_0x008f
            r7.A17 = r3
            java.util.List r1 = r2.A00()
            X.9QA r0 = X.AnonymousClass9QA.A00
            r5.A01 = r7
            r5.A02 = r2
            r5.A00 = r3
            java.lang.Object r1 = A00(r0, r6, r1, r5)
            if (r1 != r4) goto L_0x002c
            return r4
        L_0x00b4:
            X.9Ja r5 = new X.9Ja
            r5.<init>(r6, r8, r3)
            goto L_0x0016
        L_0x00bb:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService.A01(X.8Cl, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C349307zv r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            r3 = 27
            boolean r0 = X.MED.A04(r3, r11)
            if (r0 == 0) goto L_0x00a4
            r5 = r11
            X.MED r5 = (X.MED) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a4
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A04
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x007d
            if (r0 != r3) goto L_0x00af
            java.lang.Object r10 = r5.A03
            X.7zv r10 = (X.C349307zv) r10
            java.lang.Object r2 = r5.A02
            X.9U5 r2 = (X.AnonymousClass9U5) r2
            java.lang.Object r8 = r5.A01
            X.7zv r8 = (X.C349307zv) r8
            X.0eS.A00(r1)
        L_0x0030:
            java.util.List r1 = (java.util.List) r1
            r10.A0u = r1
            X.8GK r0 = r2.A00
            if (r0 == 0) goto L_0x003a
            r8.A0W = r0
        L_0x003a:
            java.lang.String r0 = r2.A06
            if (r0 == 0) goto L_0x0040
            r8.A0g = r0
        L_0x0040:
            java.util.List r1 = r2.A09
            if (r1 == 0) goto L_0x00ae
            r7 = 0
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r5 = r1.iterator()
        L_0x0054:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            com.instagram.api.schemas.CameraTool r4 = X.C2807253k.A00(r0)
            r0 = 0
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r0)
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r0)
            com.instagram.feed.media.CameraToolInfo r0 = new com.instagram.feed.media.CameraToolInfo
            r0.<init>(r4, r3, r2, r1)
            r6.add(r0)
            goto L_0x0054
        L_0x007d:
            X.0eS.A00(r1)
            java.lang.String r0 = r10.A0k
            X.9U5 r2 = X.AnonymousClass8VQ.A00(r0)
            if (r2 != 0) goto L_0x0089
            return r10
        L_0x0089:
            boolean r0 = r2.A0B
            r10.A1F = r0
            java.util.List r1 = r2.A00()
            X.80N r0 = X.AnonymousClass80N.A00
            r5.A01 = r10
            r5.A02 = r2
            r5.A03 = r10
            r5.A00 = r3
            java.lang.Object r1 = A00(r0, r9, r1, r5)
            if (r1 != r4) goto L_0x00a2
            return r4
        L_0x00a2:
            r8 = r10
            goto L_0x0030
        L_0x00a4:
            X.MED r5 = new X.MED
            r5.<init>(r9, r11, r3)
            goto L_0x0016
        L_0x00ab:
            r8.A09(r7, r6)
        L_0x00ae:
            return r8
        L_0x00af:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService.A02(X.7zv, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C349307zv r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r3 = 17
            boolean r0 = X.C376709Ja.A00(r3, r8)
            if (r0 == 0) goto L_0x0069
            r5 = r8
            X.9Ja r5 = (X.C376709Ja) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0069
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0047
            if (r0 != r3) goto L_0x006f
            java.lang.Object r2 = r5.A02
            X.9U5 r2 = (X.AnonymousClass9U5) r2
            java.lang.Object r7 = r5.A01
            X.7zv r7 = (X.C349307zv) r7
            X.0eS.A00(r1)
        L_0x002c:
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = X.00k.A0N(r1)
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            if (r0 == 0) goto L_0x0038
            r7.A0P = r0
        L_0x0038:
            X.8GK r0 = r2.A00
            if (r0 == 0) goto L_0x003e
            r7.A0W = r0
        L_0x003e:
            java.lang.String r0 = r2.A06
            if (r0 == 0) goto L_0x0044
            r7.A0g = r0
        L_0x0044:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0047:
            X.0eS.A00(r1)
            java.lang.String r0 = r7.A0k
            X.9U5 r2 = X.AnonymousClass8VQ.A00(r0)
            if (r2 == 0) goto L_0x0044
            boolean r0 = r2.A0B
            r7.A1F = r0
            java.util.List r1 = r2.A00()
            X.9QA r0 = X.AnonymousClass9QA.A00
            r5.A01 = r7
            r5.A02 = r2
            r5.A00 = r3
            java.lang.Object r1 = A00(r0, r6, r1, r5)
            if (r1 != r4) goto L_0x002c
            return r4
        L_0x0069:
            X.9Ja r5 = new X.9Ja
            r5.<init>(r6, r8, r3)
            goto L_0x0016
        L_0x006f:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService.A03(X.7zv, X.4D7):java.lang.Object");
    }
}
