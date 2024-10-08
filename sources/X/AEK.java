package X;

import com.instagram.api.schemas.ACRType;
import com.instagram.realtimeclient.RealtimeSubscription;

public abstract class AEK {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r1 != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C266684aA A00(X.AnonymousClass51M r35, com.instagram.music.common.model.AudioOverlayTrack r36, int r37) {
        /*
            r10 = 2
            r8 = r35
            X.0qQ.A0B(r8, r10)
            X.51S r2 = r8.A0E
            java.util.List r0 = r2.A02
            r1 = 1
            if (r0 == 0) goto L_0x0129
            boolean r0 = r0.isEmpty()
            if (r0 != r1) goto L_0x0129
        L_0x0013:
            r7 = 0
            if (r1 != 0) goto L_0x0024
            java.util.List r0 = r2.A02
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            if (r0 == 0) goto L_0x0024
            java.lang.String r7 = r0.A0K
        L_0x0024:
            float r0 = r8.A00
            r30 = r0
            X.51R r1 = r8.A0F
            int r0 = r1.A08
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.GnY r2 = r8.A0C
            java.util.List r0 = r1.A0J
            if (r0 == 0) goto L_0x003d
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x003e
        L_0x003d:
            r0 = 1
        L_0x003e:
            r0 = r0 ^ 1
            java.lang.String r21 = A01(r2, r3, r0)
            int r6 = r8.A08
            int r0 = r8.A09
            int r6 = r6 - r0
            r1 = r36
            if (r36 == 0) goto L_0x0125
            com.instagram.music.common.model.MusicAssetModel r2 = r1.A08
            if (r2 == 0) goto L_0x0125
            boolean r0 = r1.A01()
            if (r0 != 0) goto L_0x0125
            boolean r0 = r2.A0U
            if (r0 == 0) goto L_0x0121
            java.lang.String r22 = "original_remix"
        L_0x005d:
            boolean r0 = r8.A0Q
            r20 = r0
            X.51R r0 = r8.A0F
            java.lang.String r15 = r0.A0F
            boolean r2 = X.AnonymousClass51Q.A05(r8)
            r0 = 0
            if (r2 == 0) goto L_0x011e
            X.51R r2 = r8.A0F
            java.lang.String r14 = r2.A0I
        L_0x0070:
            X.51R r5 = r8.A0F
            java.lang.String r3 = r5.A0D
            java.lang.String r2 = "front"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0110
            r31 = 1
        L_0x007e:
            java.lang.String r13 = r5.A0H
            r4 = 1
            if (r36 == 0) goto L_0x008d
            com.instagram.music.common.model.MusicAssetModel r3 = r1.A08
            if (r3 == 0) goto L_0x008d
            boolean r2 = r3.A0U
            if (r2 != r4) goto L_0x008d
            boolean r4 = r3.A0M
        L_0x008d:
            r2 = 1
            if (r36 == 0) goto L_0x010e
            com.instagram.music.common.model.MusicAssetModel r3 = r1.A08
            if (r3 == 0) goto L_0x010e
            boolean r3 = r3.A0U
            if (r3 != r2) goto L_0x010e
        L_0x0098:
            r19 = 0
            if (r2 == 0) goto L_0x00a6
            com.instagram.music.common.model.MusicAssetModel r1 = r1.A08
            if (r1 == 0) goto L_0x00a6
            boolean r1 = r1.A0N
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r1)
        L_0x00a6:
            boolean r12 = r8.A0R
            X.GnY r11 = r8.A0C
            if (r11 == 0) goto L_0x0109
            java.lang.String r9 = r11.A03
            java.lang.Object r3 = r11.A01
            java.lang.Object r2 = r11.A02
            java.lang.Object r1 = r11.A00
            java.lang.String r0 = r11.A04
        L_0x00b6:
            X.9JE r17 = new X.9JE
            r23 = r17
            r24 = r3
            r25 = r1
            r26 = r2
            r27 = r9
            r28 = r0
            r29 = r10
            r23.<init>(r24, r25, r26, r27, r28, r29)
            boolean r0 = r5.A0K
            if (r0 == 0) goto L_0x0106
            X.1iA r18 = X.1iA.A0Q
        L_0x00cf:
            int r1 = r8.A09
            java.lang.String r0 = r8.A0J
            java.lang.Boolean r2 = r5.A0C
            if (r2 == 0) goto L_0x0103
            boolean r36 = r2.booleanValue()
        L_0x00db:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r2 = r5.A0B
            java.lang.String r2 = r2.A08
            boolean r3 = r8.A0O
            X.4aA r16 = new X.4aA
            r29 = r37
            r32 = r1
            r33 = r20
            r34 = r4
            r35 = r12
            r37 = r3
            r20 = r7
            r23 = r15
            r24 = r14
            r25 = r13
            r26 = r0
            r27 = r2
            r28 = r30
            r30 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return r16
        L_0x0103:
            r36 = 0
            goto L_0x00db
        L_0x0106:
            X.1iA r18 = X.1iA.A0a
            goto L_0x00cf
        L_0x0109:
            r9 = r0
            r3 = r0
            r2 = r0
            r1 = r0
            goto L_0x00b6
        L_0x010e:
            r2 = 0
            goto L_0x0098
        L_0x0110:
            java.lang.String r2 = "back"
            boolean r2 = r2.equals(r3)
            r31 = -1
            if (r2 == 0) goto L_0x007e
            r31 = 2
            goto L_0x007e
        L_0x011e:
            r14 = r0
            goto L_0x0070
        L_0x0121:
            java.lang.String r22 = "music_selection"
            goto L_0x005d
        L_0x0125:
            java.lang.String r22 = "original"
            goto L_0x005d
        L_0x0129:
            r1 = 0
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AEK.A00(X.51M, com.instagram.music.common.model.AudioOverlayTrack, int):X.4aA");
    }

    public static final String A01(C53401GnY gnY, Integer num, boolean z) {
        if (z) {
            return "50";
        }
        if (gnY != null) {
            num = Integer.valueOf(I5p.A00((ACRType) gnY.A00, gnY.A03, 0));
        }
        if (num == null) {
            return RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        }
        int intValue = num.intValue();
        if (intValue == 29) {
            return "29";
        }
        if (intValue == 30) {
            return "30";
        }
        if (intValue == 40) {
            return "40";
        }
        if (intValue == 51) {
            return "51";
        }
        if (intValue == 52) {
            return "52";
        }
        if (intValue == 1) {
            return "0";
        }
        if (intValue == 4) {
            return "4";
        }
        if (intValue == 32) {
            return "32";
        }
        if (intValue == 35) {
            return "35";
        }
        if (intValue == 54) {
            return "54";
        }
        return RealtimeSubscription.GRAPHQL_MQTT_VERSION;
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [X.0v6, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x025a, code lost:
        if (r9 != false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0142, code lost:
        if (r10 == true) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01d3, code lost:
        if (r5.isEmpty() != false) goto L_0x01d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(com.instagram.api.schemas.MusicProduct r39, X.AnonymousClass8J0 r40, com.instagram.common.session.UserSession r41, com.instagram.music.common.model.AudioOverlayTrack r42, X.C349307zv r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.util.List r47, java.util.List r48, boolean r49) {
        /*
            r1 = r42
            r2 = 0
            r4 = 1
            r0 = 5
            r13 = r48
            X.0qQ.A0B(r13, r0)
            r3 = 0
            if (r47 == 0) goto L_0x003a
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r47.iterator()
        L_0x0015:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r7 = r8.next()
            r0 = r7
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            float r5 = r0.A00
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0015
            r6.add(r7)
            goto L_0x0015
        L_0x002d:
            int r0 = r6.size()
            if (r0 != r4) goto L_0x003b
            java.lang.Object r1 = X.00k.A0I(r6)
            com.instagram.music.common.model.AudioOverlayTrack r1 = (com.instagram.music.common.model.AudioOverlayTrack) r1
            goto L_0x003b
        L_0x003a:
            r6 = r3
        L_0x003b:
            r0 = r43
            r19 = r44
            if (r1 == 0) goto L_0x007f
            com.instagram.music.common.model.MusicAssetModel r5 = r1.A08
            if (r5 == 0) goto L_0x007f
            if (r44 == 0) goto L_0x007f
            if (r39 != 0) goto L_0x007c
            com.instagram.api.schemas.MusicProduct r15 = com.instagram.api.schemas.MusicProduct.CLIPS_CAMERA_FORMAT_V2
        L_0x004b:
            X.ADS r14 = X.ADS.A00
            r16 = r1
            r17 = r5
            r18 = r3
            r20 = r3
            com.instagram.music.common.model.MusicOverlayStickerModel r5 = r14.A00(r15, r16, r17, r18, r19, r20)
            r0.A0V = r5
        L_0x005b:
            if (r6 == 0) goto L_0x00e1
            int r5 = r6.size()
            if (r5 <= r4) goto L_0x00e1
            if (r44 == 0) goto L_0x00e1
            java.util.Iterator r7 = r13.iterator()
            r11 = 0
        L_0x006a:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L_0x0082
            java.lang.Object r5 = r7.next()
            X.51N r5 = (X.AnonymousClass51N) r5
            int r5 = r5.BrP()
            int r11 = r11 + r5
            goto L_0x006a
        L_0x007c:
            r15 = r39
            goto L_0x004b
        L_0x007f:
            r0.A0V = r3
            goto L_0x005b
        L_0x0082:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r6.iterator()
        L_0x008a:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L_0x009f
            java.lang.Object r6 = r7.next()
            r5 = r6
            com.instagram.music.common.model.AudioOverlayTrack r5 = (com.instagram.music.common.model.AudioOverlayTrack) r5
            com.instagram.music.common.model.MusicAssetModel r5 = r5.A08
            if (r5 == 0) goto L_0x008a
            r8.add(r6)
            goto L_0x008a
        L_0x009f:
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r8)
            java.util.Iterator r10 = r8.iterator()
        L_0x00a7:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x00df
            java.lang.Object r8 = r10.next()
            com.instagram.music.common.model.AudioOverlayTrack r8 = (com.instagram.music.common.model.AudioOverlayTrack) r8
            X.ADS r14 = X.ADS.A00
            com.instagram.music.common.model.MusicAssetModel r6 = r8.A08
            X.0qQ.A0A(r6)
            if (r39 != 0) goto L_0x00dc
            com.instagram.api.schemas.MusicProduct r15 = com.instagram.api.schemas.MusicProduct.CLIPS_CAMERA_FORMAT_V2
        L_0x00be:
            int r9 = r8.A01
            int r5 = r8.A04
            if (r9 != 0) goto L_0x00da
            int r9 = r11 - r5
        L_0x00c6:
            java.lang.Integer r18 = java.lang.Integer.valueOf(r9)
            java.lang.String r5 = r8.A0D
            r17 = r6
            r20 = r5
            r16 = r8
            com.instagram.music.common.model.MusicOverlayStickerModel r5 = r14.A00(r15, r16, r17, r18, r19, r20)
            r7.add(r5)
            goto L_0x00a7
        L_0x00da:
            int r9 = r9 - r5
            goto L_0x00c6
        L_0x00dc:
            r15 = r39
            goto L_0x00be
        L_0x00df:
            r0.A0z = r7
        L_0x00e1:
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r13)
            java.util.Iterator r17 = r13.iterator()
            r6 = 0
        L_0x00ea:
            boolean r5 = r17.hasNext()
            if (r5 == 0) goto L_0x01a9
            java.lang.Object r8 = r17.next()
            int r16 = r6 + 1
            if (r6 < 0) goto L_0x02eb
            X.51N r8 = (X.AnonymousClass51N) r8
            boolean r5 = r8 instanceof X.AnonymousClass51M
            if (r5 == 0) goto L_0x010a
            X.51M r8 = (X.AnonymousClass51M) r8
            X.4aA r8 = A00(r8, r1, r6)
        L_0x0104:
            r7.add(r8)
            r6 = r16
            goto L_0x00ea
        L_0x010a:
            java.lang.String r5 = "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.video.model.IgPhotoSegment"
            X.0qQ.A0C(r8, r5)
            X.KN4 r8 = (X.KN4) r8
            r30 = 1065353216(0x3f800000, float:1.0)
            X.GnY r11 = r8.A02
            r9 = 0
            java.lang.String r23 = A01(r11, r3, r2)
            int r5 = r8.A00
            r18 = r5
            if (r1 == 0) goto L_0x01a6
            com.instagram.music.common.model.MusicAssetModel r10 = r1.A08
            if (r10 == 0) goto L_0x01a6
            boolean r5 = r1.A01()
            if (r5 != 0) goto L_0x01a6
            boolean r5 = r10.A0U
            if (r5 == 0) goto L_0x01a3
            java.lang.String r24 = "original_remix"
        L_0x0130:
            java.lang.String r5 = r8.A0D
            r25 = r5
            r5 = 1
            if (r1 == 0) goto L_0x01a1
            com.instagram.music.common.model.MusicAssetModel r12 = r1.A08
            if (r12 == 0) goto L_0x01a1
            boolean r10 = r12.A0U
            if (r10 != r4) goto L_0x0141
            boolean r5 = r12.A0M
        L_0x0141:
            r12 = 1
            if (r10 != r4) goto L_0x01a1
        L_0x0144:
            r21 = 0
            if (r12 == 0) goto L_0x0152
            com.instagram.music.common.model.MusicAssetModel r10 = r1.A08
            if (r10 == 0) goto L_0x0152
            boolean r10 = r10.A0N
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r10)
        L_0x0152:
            if (r11 == 0) goto L_0x019c
            java.lang.String r15 = r11.A03
            java.lang.Object r14 = r11.A01
            java.lang.Object r12 = r11.A02
            java.lang.Object r10 = r11.A00
            java.lang.String r9 = r11.A04
        L_0x015e:
            r37 = 2
            X.9JE r19 = new X.9JE
            r31 = r19
            r32 = r14
            r33 = r10
            r34 = r12
            r35 = r15
            r36 = r9
            r31.<init>(r32, r33, r34, r35, r36, r37)
            X.1iA r20 = X.1iA.A0Q
            java.lang.String r10 = r8.A04
            boolean r9 = r8.A06
            r33 = -1
            X.4aA r8 = new X.4aA
            r26 = r3
            r27 = r3
            r28 = r10
            r29 = r3
            r31 = r6
            r32 = r18
            r34 = r2
            r35 = r2
            r36 = r5
            r37 = r2
            r38 = r2
            r39 = r9
            r18 = r8
            r22 = r3
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            goto L_0x0104
        L_0x019c:
            r15 = r3
            r14 = r3
            r12 = r3
            r10 = r3
            goto L_0x015e
        L_0x01a1:
            r12 = 0
            goto L_0x0144
        L_0x01a3:
            java.lang.String r24 = "music_selection"
            goto L_0x0130
        L_0x01a6:
            java.lang.String r24 = "original"
            goto L_0x0130
        L_0x01a9:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r13.iterator()
        L_0x01b1:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x01c3
            java.lang.Object r6 = r8.next()
            boolean r1 = r6 instanceof X.AnonymousClass51M
            if (r1 == 0) goto L_0x01b1
            r5.add(r6)
            goto L_0x01b1
        L_0x01c3:
            boolean r9 = r5 instanceof java.util.Collection
            r8 = 54
            if (r9 == 0) goto L_0x0242
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x0242
        L_0x01cf:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x025e
        L_0x01d5:
            r8 = 0
        L_0x01d6:
            r0.A0F = r8
            r0.A0v = r7
            r1 = r49
            r0.A16 = r1
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            int r11 = r13.size()
            r10 = 0
        L_0x01e7:
            if (r10 >= r11) goto L_0x0277
            java.lang.Object r6 = r13.get(r10)
            X.51N r6 = (X.AnonymousClass51N) r6
            boolean r1 = r6 instanceof X.AnonymousClass51M
            if (r1 == 0) goto L_0x023f
            X.51M r6 = (X.AnonymousClass51M) r6
            X.51R r1 = r6.A0F
            java.util.List r14 = r1.A0J
            if (r14 == 0) goto L_0x023f
            boolean r1 = r14.isEmpty()
            if (r1 != 0) goto L_0x023f
            java.lang.Object r1 = r14.get(r2)
            X.9JM r1 = (X.AnonymousClass9JM) r1
            java.lang.String r9 = r1.A03
            java.lang.Object r1 = r14.get(r2)
            X.9JM r1 = (X.AnonymousClass9JM) r1
            java.lang.String r8 = r1.A01
            java.lang.Object r1 = r14.get(r2)
            X.9JM r1 = (X.AnonymousClass9JM) r1
            java.lang.String r7 = r1.A05
            java.lang.Object r1 = r14.get(r2)
            X.9JM r1 = (X.AnonymousClass9JM) r1
            java.lang.String r6 = r1.A02
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            java.lang.Object r1 = r14.get(r2)
            X.9JM r1 = (X.AnonymousClass9JM) r1
            java.lang.String r1 = r1.A04
            X.9JM r14 = new X.9JM
            r17 = r8
            r18 = r7
            r19 = r6
            r20 = r1
            r16 = r9
            r14.<init>((java.lang.Integer) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20)
            r12.add(r14)
        L_0x023f:
            int r10 = r10 + 1
            goto L_0x01e7
        L_0x0242:
            java.util.Iterator r6 = r5.iterator()
        L_0x0246:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x025a
            java.lang.Object r1 = r6.next()
            X.51M r1 = (X.AnonymousClass51M) r1
            X.51R r1 = r1.A0F
            int r1 = r1.A08
            if (r1 != r8) goto L_0x0246
            goto L_0x01d6
        L_0x025a:
            if (r9 == 0) goto L_0x025e
            goto L_0x01cf
        L_0x025e:
            java.util.Iterator r6 = r5.iterator()
        L_0x0262:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x01d5
            java.lang.Object r1 = r6.next()
            X.51M r1 = (X.AnonymousClass51M) r1
            X.51R r1 = r1.A0F
            int r1 = r1.A08
            if (r1 != 0) goto L_0x0262
            r8 = 1
            goto L_0x01d6
        L_0x0277:
            r0.A0w = r12
            java.util.HashSet r6 = X.AnonymousClass7TE.A1F()
            java.util.List r1 = r0.A0y
            if (r1 == 0) goto L_0x0284
            r1.clear()
        L_0x0284:
            java.util.Iterator r11 = r5.iterator()
            r9 = 0
        L_0x0289:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x02f3
            java.lang.Object r8 = r11.next()
            int r10 = r9 + 1
            if (r9 < 0) goto L_0x02eb
            X.51M r8 = (X.AnonymousClass51M) r8
            X.51S r1 = r8.A0E
            java.util.List r1 = r1.A02
            if (r1 == 0) goto L_0x02a2
            r6.addAll(r1)
        L_0x02a2:
            X.51S r1 = r8.A0E
            java.util.Set r7 = r1.A04
            if (r7 == 0) goto L_0x02bd
            boolean r1 = r7.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x02bd
            java.util.Set r1 = r0.A11
            if (r1 != 0) goto L_0x02ba
            java.util.HashSet r1 = X.AnonymousClass7TE.A1F()
            r0.A11 = r1
        L_0x02ba:
            r1.addAll(r7)
        L_0x02bd:
            X.51S r1 = r8.A0E
            java.util.List r1 = r1.A03
            if (r1 == 0) goto L_0x02c6
            r0.A09(r9, r1)
        L_0x02c6:
            X.GnY r1 = r8.A0C
            if (r1 == 0) goto L_0x02db
            java.lang.String r7 = r1.A03
            if (r7 == 0) goto L_0x02db
            java.util.Set r1 = r0.A10
            if (r1 != 0) goto L_0x02d8
            java.util.HashSet r1 = X.AnonymousClass7TE.A1F()
            r0.A10 = r1
        L_0x02d8:
            r1.add(r7)
        L_0x02db:
            java.lang.String r1 = r0.A0s
            if (r1 != 0) goto L_0x02e7
            X.GnY r1 = r8.A0C
            if (r1 == 0) goto L_0x02e9
            java.lang.String r1 = r1.A04
        L_0x02e5:
            r0.A0s = r1
        L_0x02e7:
            r9 = r10
            goto L_0x0289
        L_0x02e9:
            r1 = 0
            goto L_0x02e5
        L_0x02eb:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02f3:
            boolean r1 = X.AnonymousClass7TE.A1b(r5)
            if (r1 == 0) goto L_0x0343
            java.lang.Object r1 = r5.get(r2)
            X.51M r1 = (X.AnonymousClass51M) r1
            X.0v6 r1 = r1.A0D
            if (r1 == 0) goto L_0x0343
            java.lang.Object r1 = r5.get(r2)
            X.51M r1 = (X.AnonymousClass51M) r1
            X.0v6 r5 = r1.A0D
        L_0x030b:
            r0.A0U = r5
            r5 = r40
            if (r40 == 0) goto L_0x031b
            X.8JI r1 = r5.A03
            if (r1 == 0) goto L_0x031b
            boolean r1 = r1.A01
            if (r1 != r4) goto L_0x031b
            r0.A0Q = r5
        L_0x031b:
            r1 = r45
            r0.A0n = r1
            java.util.List r1 = X.00k.A0a(r6)
            java.util.List r1 = X.00k.A0X(r1)
            r0.A0u = r1
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r13.iterator()
        L_0x0331:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0351
            java.lang.Object r4 = r5.next()
            boolean r1 = r4 instanceof X.AnonymousClass51M
            if (r1 == 0) goto L_0x0331
            r6.add(r4)
            goto L_0x0331
        L_0x0343:
            java.util.List r1 = X.0v6.A03
            X.0v6 r5 = new X.0v6
            r5.<init>()
            r5.A02 = r1
            r5.A00 = r2
            r5.A01 = r3
            goto L_0x030b
        L_0x0351:
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r4 = r6.iterator()
        L_0x0359:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x036d
            java.lang.Object r1 = r4.next()
            X.51M r1 = (X.AnonymousClass51M) r1
            X.51R r1 = r1.A0F
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r1.A0B
            r7.add(r1)
            goto L_0x0359
        L_0x036d:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r7.iterator()
        L_0x0375:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0389
            java.lang.Object r1 = r4.next()
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = (com.instagram.common.gallery.metadata.MediaUploadMetadata) r1
            java.lang.String r1 = r1.A03
            if (r1 == 0) goto L_0x0375
            r6.add(r1)
            goto L_0x0375
        L_0x0389:
            r5 = 0
            com.instagram.common.gallery.metadata.MediaUploadMetadata r4 = new com.instagram.common.gallery.metadata.MediaUploadMetadata
            r8 = r4
            r9 = r3
            r10 = r3
            r11 = r3
            r12 = r3
            r13 = r3
            r14 = r3
            r15 = r3
            r16 = r3
            r17 = r3
            r18 = r3
            r19 = r3
            r20 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.util.Iterator r2 = r7.iterator()
        L_0x03a5:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x03b5
            java.lang.Object r1 = r2.next()
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = (com.instagram.common.gallery.metadata.MediaUploadMetadata) r1
            r4.A01(r1)
            goto L_0x03a5
        L_0x03b5:
            java.lang.String r1 = ""
            r2 = r41
            X.Kp0 r1 = X.C59737JVv.A01(r2, r1, r6)
            if (r1 == 0) goto L_0x03c3
            java.lang.String r3 = r1.A01()
        L_0x03c3:
            r4.A03 = r3
            if (r1 == 0) goto L_0x03cb
            java.lang.String r5 = r1.A02()
        L_0x03cb:
            r4.A05 = r5
            r0.A0S = r4
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r0.A02()
            java.lang.String r1 = r1.A08
            if (r1 != 0) goto L_0x03df
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r0.A02()
            r1 = r46
            r0.A08 = r1
        L_0x03df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AEK.A02(com.instagram.api.schemas.MusicProduct, X.8J0, com.instagram.common.session.UserSession, com.instagram.music.common.model.AudioOverlayTrack, X.7zv, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, boolean):void");
    }
}
