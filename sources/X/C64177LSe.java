package X;

import java.io.StringWriter;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.LSe  reason: case insensitive filesystem */
public abstract class C64177LSe {
    public static final Integer[] A00 = {AnonymousClass05K.A03, AnonymousClass05K.A04, AnonymousClass05K.A05, AnonymousClass05K.A06, AnonymousClass05K.A07, AnonymousClass05K.A08, AnonymousClass05K.A09, AnonymousClass05K.A0A, AnonymousClass05K.A0B, AnonymousClass05K.A0D};

    /* JADX WARNING: type inference failed for: r1v9, types: [X.LBU, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0383  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.LBU A00(X.AnonymousClass3Q2 r88, boolean r89) {
        /*
            r56 = 0
            r55 = 0
            r54 = 0
            r53 = 0
            r10 = 0
            r52 = 0
            r51 = 0
            r50 = 0
            r49 = 0
            r48 = 0
            r47 = 0
            r46 = 0
            r45 = 0
            r44 = 0
            r43 = 0
            r70 = 0
            r42 = 0
            r41 = 0
            r19 = 0
            r40 = 0
            r39 = 0
            r38 = 0
            r11 = 0
            r37 = 0
            r9 = 0
            r36 = 0
            r35 = 0
            r34 = 0
            r33 = 0
            java.util.LinkedHashSet r32 = X.DbS.A0y()
            java.util.LinkedHashSet r31 = X.DbS.A0y()
            r30 = 0
            com.instagram.common.gallery.metadata.MediaUploadMetadata r29 = new com.instagram.common.gallery.metadata.MediaUploadMetadata
            r57 = r29
            r58 = r10
            r59 = r10
            r60 = r10
            r61 = r10
            r62 = r10
            r63 = r10
            r64 = r10
            r65 = r10
            r66 = r10
            r67 = r10
            r68 = r10
            r69 = r30
            r57.<init>(r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69)
            X.0sn r28 = X.0sn.A00
            r13 = r88
            boolean r0 = r13.A5j
            r88 = r0
            X.L27 r0 = r13.A1Z
            if (r0 == 0) goto L_0x006e
            r42 = r0
        L_0x006e:
            long r2 = r13.A0X
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            long r2 = r2 / r0
            java.lang.String r0 = r13.A3l
            if (r0 == 0) goto L_0x007a
            r40 = r0
        L_0x007a:
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r0 = r13.A16
            r87 = r0
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo r0 = r13.A17
            if (r0 == 0) goto L_0x0084
            r44 = r0
        L_0x0084:
            java.lang.String r0 = r13.A2z
            if (r0 == 0) goto L_0x008a
            r45 = r0
        L_0x008a:
            java.lang.Boolean r0 = r13.A1t
            if (r0 == 0) goto L_0x0090
            r41 = r0
        L_0x0090:
            java.util.List r0 = r13.A4D
            if (r0 == 0) goto L_0x00ae
            java.util.ArrayList r10 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x009c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r0 = r1.next()
            X.55X r0 = (X.AnonymousClass55X) r0
            com.instagram.api.schemas.CameraTool r0 = r0.A01
            r10.add(r0)
            goto L_0x009c
        L_0x00ae:
            X.4a8 r0 = r13.A1g
            r86 = r0
            java.util.List r0 = r13.A4g
            r27 = r0
            java.util.List r0 = r13.A4Y
            r26 = r0
            java.util.List r0 = r13.A4l
            r25 = r0
            java.util.List r0 = r13.A4k
            r24 = r0
            java.util.List r0 = r13.A4o
            r23 = r0
            java.util.Set r0 = r13.A4u
            java.util.Set r1 = X.SAR.A00(r0)
            r0 = r32
            r0.addAll(r1)
            java.util.List r0 = r13.A4h
            r85 = r0
            r1 = r0
            r0 = r30
            X.0qQ.A0B(r1, r0)
            if (r89 == 0) goto L_0x00df
            java.util.List r9 = r13.A4b
        L_0x00df:
            java.util.List r0 = r13.A4P
            r22 = r0
            java.lang.String r0 = r13.A2o
            if (r0 == 0) goto L_0x00e8
            r11 = r0
        L_0x00e8:
            java.lang.String r0 = r13.A2n
            if (r0 == 0) goto L_0x00ee
            r47 = r0
        L_0x00ee:
            java.lang.String r0 = r13.A2V
            if (r0 == 0) goto L_0x00f4
            r54 = r0
        L_0x00f4:
            X.8GK r0 = r13.A1b
            if (r0 == 0) goto L_0x00fa
            r37 = r0
        L_0x00fa:
            java.lang.String r0 = r13.A2h
            if (r0 == 0) goto L_0x0100
            r48 = r0
        L_0x0100:
            java.lang.String r1 = r13.A2Y
            r21 = 0
            r4 = 1
            if (r1 == 0) goto L_0x010f
            int r0 = r1.length()
            if (r0 == 0) goto L_0x010f
            r52 = r1
        L_0x010f:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r13.A13
            if (r0 == 0) goto L_0x0115
            r29 = r0
        L_0x0115:
            java.lang.String r0 = r13.A2O
            if (r0 == 0) goto L_0x011b
            r55 = r0
        L_0x011b:
            java.lang.String r0 = r13.A3Y
            if (r0 == 0) goto L_0x0121
            r35 = r0
        L_0x0121:
            java.lang.String r0 = r13.A2K
            if (r0 == 0) goto L_0x0127
            r56 = r0
        L_0x0127:
            java.util.List r0 = r13.A4Z
            r20 = r0
            java.lang.String r0 = r13.A2X
            if (r0 == 0) goto L_0x0131
            r53 = r0
        L_0x0131:
            boolean r0 = r13.A4w
            r84 = r0
            java.lang.String r1 = r13.A3T
            if (r1 == 0) goto L_0x0141
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0141
            r36 = r1
        L_0x0141:
            java.lang.Integer r0 = r13.A2D
            if (r0 == 0) goto L_0x0147
            r39 = r0
        L_0x0147:
            java.util.List r1 = r13.A4j
            if (r1 == 0) goto L_0x0153
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0153
            r33 = r1
        L_0x0153:
            java.lang.String r0 = r13.A2v
            if (r0 == 0) goto L_0x0159
            r46 = r0
        L_0x0159:
            java.lang.Integer r0 = r13.A2E
            if (r0 == 0) goto L_0x015f
            r38 = r0
        L_0x015f:
            java.util.List r0 = r13.A4J
            if (r0 == 0) goto L_0x0169
            r49 = r0
            X.3QS r0 = r13.A1V
            r19 = r0
        L_0x0169:
            java.util.ArrayList r0 = r13.A0J()
            if (r0 == 0) goto L_0x0171
            r51 = r0
        L_0x0171:
            java.lang.String r0 = r13.A3e
            if (r0 == 0) goto L_0x0177
            r34 = r0
        L_0x0177:
            java.util.List r0 = r13.A4S
            if (r0 == 0) goto L_0x017d
            r43 = r0
        L_0x017d:
            com.instagram.clips.model.metadata.ClipsFanClubMetadata r0 = r13.A11
            if (r0 == 0) goto L_0x0183
            r50 = r0
        L_0x0183:
            java.lang.Integer[] r7 = A00
            r6 = 10
            r5 = 0
        L_0x0188:
            r0 = r7[r5]
            java.util.HashMap r1 = r13.A44
            if (r1 == 0) goto L_0x0404
            java.lang.String r0 = X.C59903JbS.A00(r0)
            boolean r0 = r1.containsKey(r0)
            if (r0 != r4) goto L_0x0404
            r18 = 1
        L_0x019a:
            boolean r0 = r13.A12()
            if (r0 == 0) goto L_0x01b0
            boolean r0 = r13.A5j
            if (r0 != 0) goto L_0x01b0
            java.util.List r1 = r13.A4G
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0387
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0387
        L_0x01b0:
            r1 = 0
        L_0x01b1:
            int r0 = r13.A0K
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r4)
            if (r18 != 0) goto L_0x01bd
            if (r1 != 0) goto L_0x01bd
            if (r0 == 0) goto L_0x01bf
        L_0x01bd:
            r21 = 1
        L_0x01bf:
            boolean r0 = r13.A57
            r83 = r0
            boolean r0 = r13.A5o
            r82 = r0
            boolean r0 = r13.A5v
            r68 = r0
            boolean r0 = r13.A4z
            r67 = r0
            com.instagram.api.schemas.RingSpecImpl r0 = r13.A0y
            if (r0 == 0) goto L_0x0383
            com.instagram.api.schemas.RingSpecImpl r17 = r0.F8l()
        L_0x01d7:
            X.3ID r0 = r13.A1m
            r66 = r0
            boolean r0 = r13.A62
            r65 = r0
            boolean r0 = r13.A5m
            r64 = r0
            boolean r0 = r13.A68
            r63 = r0
            boolean r0 = r13.A5H
            r62 = r0
            boolean r0 = r13.A5G
            r61 = r0
            boolean r0 = r13.A5n
            r60 = r0
            java.util.List r1 = r13.A4b
            X.3WT r0 = X.AnonymousClass3WT.ROLL_CALL_FIRST_TAKE
            X.3ui r0 = X.AnonymousClass497.A00(r0, r1)
            boolean r16 = X.AnonymousClass7TF.A1V(r0)
            boolean r0 = r13.A56
            r59 = r0
            boolean r0 = r13.A5k
            r58 = r0
            java.lang.String r0 = r13.A3r
            r57 = r0
            boolean r0 = r13.A5W
            r18 = r0
            java.lang.String r15 = r13.A2e
            java.util.Set r1 = r13.A4t
            r31.clear()
            if (r1 == 0) goto L_0x021d
            r0 = r31
            r0.addAll(r1)
        L_0x021d:
            X.8VT r14 = r13.A1Y
            java.util.List r12 = r13.A49
            java.lang.String r8 = r13.A31
            java.util.List r7 = r13.A4Q
            java.util.List r6 = r13.A4e
            java.lang.String r5 = r13.A3d
            boolean r4 = r13.A5d
            boolean r13 = r13.A4v
            if (r9 != 0) goto L_0x0231
            r9 = r28
        L_0x0231:
            if (r27 != 0) goto L_0x0235
            r27 = r28
        L_0x0235:
            if (r22 != 0) goto L_0x0239
            r22 = r28
        L_0x0239:
            if (r26 != 0) goto L_0x023d
            r26 = r28
        L_0x023d:
            if (r25 != 0) goto L_0x0241
            r25 = r28
        L_0x0241:
            if (r33 != 0) goto L_0x0245
            r33 = r28
        L_0x0245:
            if (r24 != 0) goto L_0x0249
            r24 = r28
        L_0x0249:
            if (r23 != 0) goto L_0x024d
            r23 = r28
        L_0x024d:
            if (r11 != 0) goto L_0x0250
            r11 = 0
        L_0x0250:
            if (r20 != 0) goto L_0x0254
            r20 = r28
        L_0x0254:
            X.LBU r1 = new X.LBU
            r1.<init>()
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = new com.instagram.common.gallery.metadata.MediaUploadMetadata
            r69 = r0
            r71 = r70
            r72 = r70
            r73 = r70
            r74 = r70
            r75 = r70
            r76 = r70
            r77 = r70
            r78 = r70
            r79 = r70
            r80 = r70
            r81 = r30
            r69.<init>(r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81)
            r1.A03 = r0
            r0 = r88
            r1.A11 = r0
            r0 = r42
            r1.A08 = r0
            r1.A00 = r2
            r0 = r40
            r1.A0R = r0
            r0 = r86
            r1.A0A = r0
            r1.A0g = r9
            r0 = r27
            r1.A0i = r0
            r0 = r22
            r1.A0b = r0
            r0 = r26
            r1.A0e = r0
            r0 = r25
            r1.A0l = r0
            r0 = r33
            r1.A0k = r0
            r0 = r24
            r1.A0m = r0
            r0 = r23
            r1.A0n = r0
            java.util.Set r0 = X.SAR.A01(r32)
            r1.A0o = r0
            r0 = r31
            r1.A0p = r0
            r1.A0N = r11
            r0 = r47
            r1.A0M = r0
            r0 = r54
            r1.A0H = r0
            r0 = r48
            r1.A0L = r0
            r0 = r52
            r1.A0J = r0
            r0 = r29
            r1.A03 = r0
            r0 = r55
            r1.A0G = r0
            r0 = r35
            r1.A0T = r0
            r0 = r56
            r1.A0F = r0
            r0 = r46
            r1.A0O = r0
            r0 = r20
            r1.A0f = r0
            r0 = r53
            r1.A0I = r0
            r0 = r84
            r1.A0q = r0
            r0 = r83
            r1.A0t = r0
            r0 = r82
            r1.A15 = r0
            r0 = r68
            r1.A16 = r0
            r0 = r67
            r1.A0r = r0
            r0 = r65
            r1.A17 = r0
            r0 = r64
            r1.A13 = r0
            r0 = r62
            r1.A0x = r0
            r0 = r37
            r1.A09 = r0
            r0 = r36
            r1.A0S = r0
            r0 = r39
            r1.A0D = r0
            r0 = r49
            r1.A0a = r0
            r0 = r51
            r1.A0Z = r0
            r0 = r61
            r1.A0w = r0
            r0 = r60
            r1.A14 = r0
            r0 = r16
            r1.A0y = r0
            r0 = r59
            r1.A0s = r0
            r0 = r58
            r1.A12 = r0
            r0 = r38
            r1.A0E = r0
            r0 = r57
            r1.A0W = r0
            r0 = r34
            r1.A0V = r0
            if (r17 == 0) goto L_0x0381
            com.instagram.api.schemas.RingSpecImpl r0 = r17.F8l()
        L_0x033a:
            r1.A01 = r0
            r0 = r66
            r1.A0B = r0
            r0 = r19
            r1.A06 = r0
            r0 = r18
            r1.A0z = r0
            r1.A0K = r15
            r0 = r85
            r1.A0j = r0
            r0 = r87
            r1.A04 = r0
            r0 = r41
            r1.A0C = r0
            r0 = r44
            r1.A05 = r0
            r0 = r45
            r1.A0P = r0
            r1.A07 = r14
            r0 = r43
            r1.A0d = r0
            r1.A0Y = r10
            r0 = r50
            r1.A02 = r0
            r1.A0X = r12
            r1.A0Q = r8
            r1.A0c = r7
            r1.A0h = r6
            r1.A0U = r5
            r0 = r21
            r1.A0u = r0
            r0 = r63
            r1.A18 = r0
            r1.A10 = r4
            r1.A0v = r13
            return r1
        L_0x0381:
            r0 = 0
            goto L_0x033a
        L_0x0383:
            r17 = 0
            goto L_0x01d7
        L_0x0387:
            java.util.Iterator r17 = r1.iterator()
        L_0x038b:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x01b0
            java.lang.Object r8 = r17.next()
            com.instagram.pendingmedia.model.ClipInfo r8 = (com.instagram.pendingmedia.model.ClipInfo) r8
            java.lang.String r1 = r8.A0F
            r16 = 0
            if (r1 == 0) goto L_0x03f5
            java.io.File r0 = X.AnonymousClass7TE.A0t(r1)
            long r14 = r0.length()
            r5 = 0
            int r0 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x03f5
            android.media.MediaMetadataRetriever r7 = new android.media.MediaMetadataRetriever
            r7.<init>()
            r7.setDataSource(r1)     // Catch:{ Exception -> 0x03c0 }
            r0 = 25
            java.lang.String r0 = r7.extractMetadata(r0)     // Catch:{ Exception -> 0x03c0 }
            if (r0 == 0) goto L_0x03f0
            java.lang.Float r16 = X.012.A0q(r0)     // Catch:{ Exception -> 0x03c0 }
            goto L_0x03f0
        L_0x03c0:
            X.0wj r6 = X.0wj.A01
            r5 = 518917599(0x1eee0ddf, float:2.5204967E-20)
            java.lang.StringBuilder r12 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed to read metadata from video: "
            r12.append(r0)
            r12.append(r1)
            java.lang.String r0 = ". File size: "
            r12.append(r0)
            long r0 = r8.A00()
            r12.append(r0)
            java.lang.String r0 = ". Mime type: "
            r12.append(r0)
            java.lang.String r0 = r8.A0P
            r12.append(r0)
            r0 = 46
            java.lang.String r0 = X.C51967G9n.A0r(r12, r0)
            r6.AEf(r0, r5)
        L_0x03f0:
            r7.release()     // Catch:{ IOException -> 0x03f3 }
        L_0x03f3:
            if (r16 != 0) goto L_0x0401
        L_0x03f5:
            java.lang.String r1 = r8.A0F
            if (r1 == 0) goto L_0x038b
            java.lang.String r0 = "camera"
            boolean r0 = X.00l.A0d(r1, r0, r4)
            if (r0 != r4) goto L_0x038b
        L_0x0401:
            r1 = 1
            goto L_0x01b1
        L_0x0404:
            int r5 = r5 + 1
            if (r5 < r6) goto L_0x0188
            r18 = 0
            goto L_0x019a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64177LSe.A00(X.3Q2, boolean):X.LBU");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.1Fb r2, com.instagram.pendingmedia.model.constants.ShareType r3) {
        /*
            if (r3 == 0) goto L_0x0048
            X.Kvh r0 = X.C63360Kvh.$redex_init_class
            int r1 = r3.ordinal()
            r0 = 16
            if (r1 == r0) goto L_0x0045
            r0 = 2
            if (r1 == r0) goto L_0x0042
            r0 = 3
            if (r1 == r0) goto L_0x003f
            r0 = 25
            if (r1 != r0) goto L_0x0048
            java.lang.Integer r0 = X.AnonymousClass05K.A02
        L_0x0018:
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x002b;
                case 2: goto L_0x002d;
                case 3: goto L_0x002f;
                case 4: goto L_0x0031;
                case 5: goto L_0x0033;
                case 6: goto L_0x0035;
                case 7: goto L_0x0037;
                case 8: goto L_0x0039;
                case 9: goto L_0x003c;
                default: goto L_0x001f;
            }
        L_0x001f:
            r0 = 11
        L_0x0021:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "configure_mode"
            r2.A9m(r0, r1)
            return
        L_0x002b:
            r0 = 1
            goto L_0x0021
        L_0x002d:
            r0 = 2
            goto L_0x0021
        L_0x002f:
            r0 = 3
            goto L_0x0021
        L_0x0031:
            r0 = 4
            goto L_0x0021
        L_0x0033:
            r0 = 5
            goto L_0x0021
        L_0x0035:
            r0 = 6
            goto L_0x0021
        L_0x0037:
            r0 = 7
            goto L_0x0021
        L_0x0039:
            r0 = 9
            goto L_0x0021
        L_0x003c:
            r0 = 10
            goto L_0x0021
        L_0x003f:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0018
        L_0x0042:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0018
        L_0x0045:
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            goto L_0x0018
        L_0x0048:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64177LSe.A02(X.1Fb, com.instagram.pendingmedia.model.constants.ShareType):void");
    }

    public static final void A03(1Fb r3, A7J a7j) {
        try {
            String A002 = C273654mx.A00(3192);
            StringWriter A0v = JTO.A0v();
            17W A0Q = JTO.A0Q(A0v);
            ABD.A00(A0Q, a7j);
            r3.A9m(A002, C51970G9q.A0k(Collections.singletonList(new JSONObject(JTP.A0n(A0Q, A0v)))));
        } catch (JSONException unused) {
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x048c, code lost:
        if (r0.isEmpty() != false) goto L_0x048e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0129, code lost:
        if (X.0qQ.A0K(r11.A1k, X.C273654mx.A00(157)) == false) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012b, code lost:
        r13.A0c();
        X.C255783ui.A05(r13, r11);
        r13.A0R(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r11.A11.A00);
        X.C255783ui.A02(r13, r7, r11, false);
        X.C255783ui.A04(r13, r11);
        r13.A0P(X.C273654mx.A00(409), r11.A07);
        r13.A0R(X.C273654mx.A00(193), r11.A1k);
        r13.A0Z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x015b, code lost:
        if (r26 != false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0161, code lost:
        if (r11.A11 == X.AnonymousClass3WT.MUSIC_OVERLAY) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0163, code lost:
        X.C255783ui.A01(r13, r7, r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0174, code lost:
        if (X.0qQ.A0K(r11.A1g, X.C273654mx.A00(358)) != false) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:613:0x0c5f, code lost:
        if (r1 != false) goto L_0x0c61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x020a, code lost:
        r0 = r11.A15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x020c, code lost:
        if (r0 == null) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x020e, code lost:
        A03(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0280, code lost:
        r1 = X.AnonymousClass000.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0284, code lost:
        r8.A9m(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.1Fb r22, com.instagram.common.session.UserSession r23, X.LBU r24, long r25, boolean r27) {
        /*
            r0 = 2
            r7 = r23
            r6 = r24
            int r1 = X.C51970G9q.A08(r0, r6, r7)
            X.0nE r0 = X.C61410nE.A00
            X.0qQ.A0B(r0, r1)
            if (r27 == 0) goto L_0x00c3
            boolean r0 = r6.A11
            if (r0 != 0) goto L_0x00c3
            r20 = 0
            X.1iA r0 = X.1iA.A0a
        L_0x0018:
            int r0 = r0.A00
            java.lang.String r18 = java.lang.String.valueOf(r0)
            r0 = 5104(0x13f0, float:7.152E-42)
            java.lang.String r19 = X.AnonymousClass000.A00(r0)
            r8 = r22
            r1 = r19
            r0 = r18
            r8.A9m(r1, r0)
            X.L27 r2 = r6.A08
            if (r2 == 0) goto L_0x0045
            java.io.StringWriter r1 = X.JTO.A0v()
            X.17W r0 = X.JTO.A0Q(r1)
            X.LJZ.A00(r0, r2)
            java.lang.String r1 = X.JTP.A0n(r0, r1)
            java.lang.String r0 = "implicit_location"
            r8.AA0(r0, r1)
        L_0x0045:
            r16 = 0
            int r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0065
            java.lang.String r1 = java.lang.String.valueOf(r25)
            java.lang.String r0 = "client_shared_at"
            r8.A9m(r0, r1)
            long r0 = X.AnonymousClass7TG.A0I()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 273(0x111, float:3.83E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r8.A9m(r0, r1)
        L_0x0065:
            java.lang.String r1 = r6.A0R
            java.lang.String r10 = "1"
            if (r1 == 0) goto L_0x009f
            java.lang.String r0 = "is_multi_upload"
            r8.A9m(r0, r10)
            java.lang.String r0 = "multi_upload_session_id"
            r8.A9m(r0, r1)
            X.4a8 r2 = r6.A0A
            if (r2 == 0) goto L_0x009f
            java.lang.String r0 = "is_segmented_video"
            r8.A9m(r0, r10)
            java.lang.String r1 = r2.A02
            r0 = 3940(0xf64, float:5.521E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r1)
            int r0 = r2.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "segmented_video_index"
            r8.A9m(r0, r1)
            int r0 = r2.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "segmented_video_count"
            r8.A9m(r0, r1)
        L_0x009f:
            java.util.List r0 = r6.A0g
            r21 = r0
            java.util.LinkedHashMap r12 = X.AnonymousClass7TE.A1H()
            if (r0 == 0) goto L_0x03fa
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x03fa
            X.3WT[] r4 = X.AnonymousClass3WT.values()
            int r3 = r4.length
            r2 = 0
        L_0x00b5:
            if (r2 >= r3) goto L_0x00c9
            r1 = r4[r2]
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r12.put(r1, r0)
            int r2 = r2 + 1
            goto L_0x00b5
        L_0x00c3:
            r20 = 1
            X.1iA r0 = X.1iA.A0Q
            goto L_0x0018
        L_0x00c9:
            java.util.Iterator r2 = r21.iterator()
        L_0x00cd:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ea
            X.3ui r1 = X.JTO.A0o(r2)
            X.3WT r0 = r1.A11
            java.lang.Object r0 = r12.get(r0)
            if (r0 == 0) goto L_0x00e5
            java.util.List r0 = (java.util.List) r0
            r0.add(r1)
            goto L_0x00cd
        L_0x00e5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00ea:
            X.3QS r0 = r6.A06
            boolean r26 = X.DbW.A1a(r0)
            r25 = 1
            java.io.StringWriter r24 = X.JTO.A0v()
            X.15p r14 = X.AnonymousClass15o.A00
            r0 = r24
            X.17W r13 = r14.A0A(r0)
            r0 = r21
            java.util.Iterator r23 = X.JTP.A0v(r13, r0)
            r22 = 1
        L_0x0106:
            boolean r0 = r23.hasNext()
            if (r0 == 0) goto L_0x028e
            X.3ui r11 = X.JTO.A0o(r23)
            X.3WT r0 = r11.A11
            X.Kvh r1 = X.C63360Kvh.$redex_init_class
            int r0 = r0.ordinal()
            java.lang.String r1 = "reshared_media_id"
            switch(r0) {
                case 4: goto L_0x026b;
                case 21: goto L_0x0178;
                case 22: goto L_0x01e4;
                case 23: goto L_0x0168;
                case 24: goto L_0x0178;
                case 28: goto L_0x01f3;
                case 40: goto L_0x017c;
                case 49: goto L_0x01d3;
                case 50: goto L_0x0178;
                case 55: goto L_0x0255;
                case 56: goto L_0x0184;
                case 58: goto L_0x0260;
                case 78: goto L_0x0276;
                default: goto L_0x011d;
            }
        L_0x011d:
            java.lang.String r1 = r11.A1k
            r0 = 157(0x9d, float:2.2E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x015b
            r13.A0c()
            X.C255783ui.A05(r13, r11)
            X.3WT r0 = r11.A11
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "type"
            r13.A0R(r0, r1)
            r0 = 0
            X.C255783ui.A02(r13, r7, r11, r0)
            X.C255783ui.A04(r13, r11)
            int r1 = r11.A07
            r0 = 409(0x199, float:5.73E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r13.A0P(r0, r1)
            java.lang.String r1 = r11.A1k
            r0 = 193(0xc1, float:2.7E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r13.A0R(r0, r1)
            r13.A0Z()
            goto L_0x0106
        L_0x015b:
            if (r26 != 0) goto L_0x0163
            X.3WT r1 = r11.A11
            X.3WT r0 = X.AnonymousClass3WT.MUSIC_OVERLAY
            if (r1 == r0) goto L_0x0106
        L_0x0163:
            r0 = 0
            X.C255783ui.A01(r13, r7, r11, r0)
            goto L_0x0106
        L_0x0168:
            java.lang.String r1 = r11.A1g
            r0 = 358(0x166, float:5.02E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x011d
            goto L_0x020a
        L_0x0178:
            java.lang.String r0 = r11.A1a
            goto L_0x0284
        L_0x017c:
            X.A7J r0 = r11.A15
            if (r0 == 0) goto L_0x0106
            A03(r8, r0)
            goto L_0x0106
        L_0x0184:
            X.JzL r0 = r11.A18
            if (r0 == 0) goto L_0x011d
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            java.lang.String r9 = r0.A06
            java.lang.String r4 = r0.A03
            java.lang.String r3 = r0.A04
            java.io.StringWriter r2 = X.JTO.A0v()
            X.17W r1 = r14.A0A(r2)
            r1.A0c()
            if (r9 == 0) goto L_0x01a5
            java.lang.String r0 = "text"
            r1.A0R(r0, r9)
        L_0x01a5:
            if (r4 == 0) goto L_0x01b0
            r0 = 3509(0xdb5, float:4.917E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A0R(r0, r4)
        L_0x01b0:
            if (r3 == 0) goto L_0x01bb
            r0 = 3510(0xdb6, float:4.919E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A0R(r0, r3)
        L_0x01bb:
            java.lang.String r1 = X.AnonymousClass7TG.A0k(r1, r2)
            X.0qQ.A07(r1)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            org.json.JSONArray r0 = r5.put(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "story_badges_thank_you_sticker"
            goto L_0x0284
        L_0x01d3:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "UNKNOWN ReelInteractive: "
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r11, r0, r1)
            java.lang.String r0 = "StoryShareParamsUtil"
            X.0wb.A03(r0, r1)
            goto L_0x0106
        L_0x01e4:
            java.util.ArrayList r0 = X.DbV.A14(r11)
            java.lang.String r0 = X.C255783ui.A00(r7, r0)
            X.0qQ.A07(r0)
            r1 = 5290(0x14aa, float:7.413E-42)
            goto L_0x0280
        L_0x01f3:
            if (r26 == 0) goto L_0x011d
            com.instagram.music.common.model.MusicOverlayStickerModel r1 = r11.A0u
            if (r1 == 0) goto L_0x0289
            java.lang.Boolean r2 = r1.A0E
            r0 = r25
            boolean r22 = X.AnonymousClass7TF.A1Y(r2, r0)
            if (r22 == 0) goto L_0x0213
            java.lang.String r1 = r1.A0e
            java.lang.String r0 = "original_media_id"
        L_0x0207:
            r8.A9m(r0, r1)
        L_0x020a:
            X.A7J r0 = r11.A15
            if (r0 == 0) goto L_0x011d
            A03(r8, r0)
            goto L_0x011d
        L_0x0213:
            java.lang.String r15 = r1.A0S
            java.lang.String r9 = r1.A0T
            java.lang.String r5 = r1.A0m
            java.lang.String r4 = r1.A0Y
            java.lang.String r3 = r1.A0Q
            java.io.StringWriter r2 = X.JTO.A0v()
            X.17W r1 = r14.A0A(r2)
            r1.A0c()
            if (r15 == 0) goto L_0x022f
            java.lang.String r0 = "audio_asset_id"
            r1.A0R(r0, r15)
        L_0x022f:
            if (r9 == 0) goto L_0x0236
            java.lang.String r0 = "audio_cluster_id"
            r1.A0R(r0, r9)
        L_0x0236:
            if (r5 == 0) goto L_0x023d
            java.lang.String r0 = "song_name"
            r1.A0R(r0, r5)
        L_0x023d:
            if (r4 == 0) goto L_0x0244
            java.lang.String r0 = "artist_name"
            r1.A0R(r0, r4)
        L_0x0244:
            if (r3 == 0) goto L_0x024b
            java.lang.String r0 = "alacorn_session_id"
            r1.A0R(r0, r3)
        L_0x024b:
            java.lang.String r1 = X.AnonymousClass7TG.A0k(r1, r2)
            X.0qQ.A07(r1)
            java.lang.String r0 = "story_music_metadata"
            goto L_0x0207
        L_0x0255:
            java.util.List r0 = X.AnonymousClass7TE.A1I(r11)
            java.lang.String r0 = X.C255783ui.A00(r7, r0)
            r1 = 5295(0x14af, float:7.42E-42)
            goto L_0x0280
        L_0x0260:
            java.util.List r0 = X.AnonymousClass7TE.A1I(r11)
            java.lang.String r0 = X.C255783ui.A00(r7, r0)
            r1 = 5289(0x14a9, float:7.411E-42)
            goto L_0x0280
        L_0x026b:
            java.util.List r0 = X.AnonymousClass7TE.A1I(r11)
            java.lang.String r0 = X.C255783ui.A00(r7, r0)
            r1 = 5288(0x14a8, float:7.41E-42)
            goto L_0x0280
        L_0x0276:
            java.util.List r0 = X.AnonymousClass7TE.A1I(r11)
            java.lang.String r0 = X.C255783ui.A00(r7, r0)
            r1 = 5293(0x14ad, float:7.417E-42)
        L_0x0280:
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
        L_0x0284:
            r8.A9m(r1, r0)
            goto L_0x011d
        L_0x0289:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x028e:
            if (r26 == 0) goto L_0x0297
            if (r22 == 0) goto L_0x0297
            java.lang.String r0 = "has_original_sound"
            r8.A9m(r0, r10)
        L_0x0297:
            r0 = r24
            java.lang.String r1 = X.JTR.A13(r13, r0)
            java.lang.String r0 = "tap_models"
            r8.A9m(r0, r1)
            X.3WT r5 = X.AnonymousClass3WT.GROUP_MENTION
            java.lang.Object r0 = r12.get(r5)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x032a
            boolean r1 = X.AnonymousClass7TE.A1b(r0)
            if (r1 == 0) goto L_0x032a
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.io.StringWriter r3 = X.JTO.A0v()
            X.17W r2 = r14.A0A(r3)
            java.util.Iterator r9 = X.JTP.A0v(r2, r0)
        L_0x02c2:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x02e4
            X.3ui r1 = X.JTO.A0o(r9)
            r0 = 0
            X.C255783ui.A01(r2, r7, r1, r0)
            X.9m3 r0 = r1.A0C()
            if (r0 == 0) goto L_0x02c2
            com.instagram.api.schemas.StoryGroupMentionTappableData r0 = r0.A00()
            if (r0 == 0) goto L_0x02c2
            java.util.List r0 = r0.A04
            if (r0 == 0) goto L_0x02c2
            r4.addAll(r0)
            goto L_0x02c2
        L_0x02e4:
            java.lang.String r1 = X.JTR.A13(r2, r3)
            r0 = 4805(0x12c5, float:6.733E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r1)
            java.io.StringWriter r2 = X.JTO.A0v()
            X.17W r1 = r14.A0A(r2)
            r1.A0b()
            java.util.Iterator r4 = r4.iterator()
        L_0x0300:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0321
            com.instagram.user.model.User r0 = X.DbT.A0k(r4)
            r1.A0c()
            java.lang.String r3 = r0.getId()
            java.lang.String r0 = "user_id"
            r1.A0R(r0, r3)
            java.lang.String r3 = r5.A00
            java.lang.String r0 = "display_type"
            r1.A0R(r0, r3)
            r1.A0Z()
            goto L_0x0300
        L_0x0321:
            java.lang.String r1 = X.JTR.A13(r1, r2)
            java.lang.String r0 = "reel_mentions"
            r8.A9m(r0, r1)
        L_0x032a:
            X.3WT r0 = X.AnonymousClass3WT.AVATAR
            java.lang.Object r1 = r12.get(r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x038a
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r1.iterator()
        L_0x033c:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0352
            X.3ui r1 = X.JTO.A0o(r2)
            X.ToH r1 = r1.A0C
            if (r1 == 0) goto L_0x033c
            java.lang.String r1 = r1.A09
            if (r1 == 0) goto L_0x033c
            r0.add(r1)
            goto L_0x033c
        L_0x0352:
            boolean r1 = X.AnonymousClass7TE.A1b(r0)
            if (r1 == 0) goto L_0x038a
            java.io.StringWriter r3 = X.JTO.A0v()
            X.17W r2 = r14.A0A(r3)
            java.util.Iterator r4 = X.JTP.A0v(r2, r0)
        L_0x0364:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0381
            java.lang.String r1 = X.AnonymousClass7TE.A18(r4)
            r2.A0c()
            java.lang.String r0 = "user_id"
            r2.A0R(r0, r1)
            java.lang.String r1 = "display_type"
            java.lang.String r0 = "avatar_mention"
            r2.A0R(r1, r0)
            r2.A0Z()
            goto L_0x0364
        L_0x0381:
            java.lang.String r1 = X.JTR.A13(r2, r3)
            java.lang.String r0 = "reel_mentions"
            r8.A9m(r0, r1)
        L_0x038a:
            X.3WT r0 = X.AnonymousClass3WT.BEFORE_AND_AFTER
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x03c2
            boolean r1 = X.AnonymousClass7TE.A1b(r0)
            if (r1 == 0) goto L_0x03c2
            java.io.StringWriter r3 = X.JTO.A0v()
            X.17W r2 = r14.A0A(r3)
            java.util.Iterator r4 = X.JTP.A0v(r2, r0)
        L_0x03a6:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x03b5
            X.3ui r1 = X.JTO.A0o(r4)
            r0 = 0
            X.C255783ui.A01(r2, r7, r1, r0)
            goto L_0x03a6
        L_0x03b5:
            java.lang.String r1 = X.JTR.A13(r2, r3)
            r0 = 5287(0x14a7, float:7.409E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r1)
        L_0x03c2:
            X.3WT r0 = X.AnonymousClass3WT.MUSIC_PICK_STICKER
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x03fa
            boolean r1 = X.AnonymousClass7TE.A1b(r0)
            if (r1 == 0) goto L_0x03fa
            java.io.StringWriter r2 = X.JTO.A0v()
            X.17W r3 = r14.A0A(r2)
            java.util.Iterator r4 = X.JTP.A0v(r3, r0)
        L_0x03de:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x03ed
            X.3ui r1 = X.JTO.A0o(r4)
            r0 = 0
            X.C255783ui.A01(r3, r7, r1, r0)
            goto L_0x03de
        L_0x03ed:
            java.lang.String r1 = X.JTR.A13(r3, r2)
            r0 = 5294(0x14ae, float:7.418E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r1)
        L_0x03fa:
            java.util.List r1 = r6.A0i
            if (r1 == 0) goto L_0x0483
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0483
            java.io.StringWriter r9 = X.JTO.A0v()
            X.17W r5 = X.C51970G9q.A0e(r9)
            java.util.Iterator r14 = r1.iterator()
        L_0x0410:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x047a
            X.3ui r4 = X.JTO.A0o(r14)
            r5.A0c()
            X.C255783ui.A03(r5, r4)
            X.3WT r0 = r4.A11
            int r1 = r0.ordinal()
            r0 = 17
            if (r1 != r0) goto L_0x0456
            X.UOC r0 = r4.A0i
            r0.getClass()
            java.util.List r0 = r0.A07
            java.util.Iterator r13 = r0.iterator()
            r3 = 0
        L_0x0436:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0451
            java.lang.Object r11 = r13.next()
            X.UOk r11 = (X.C15092UOk) r11
            int r0 = r11.A02
            float r0 = (float) r0
            float r2 = r11.A01
            float r0 = r0 / r2
            int r1 = (int) r0
            int r0 = r11.A04
            float r0 = (float) r0
            float r0 = r0 / r2
            int r0 = (int) r0
            int r1 = r1 - r0
            int r3 = r3 + r1
            goto L_0x0436
        L_0x0451:
            java.lang.String r0 = "asr_duration_ms"
            r5.A0P(r0, r3)
        L_0x0456:
            X.C255783ui.A05(r5, r4)
            java.lang.String r1 = r4.A1i
            java.lang.String r0 = "str_id"
            r5.A0R(r0, r1)
            java.lang.String r1 = r4.A1h
            java.lang.String r0 = "sticker_type"
            r5.A0R(r0, r1)
            java.lang.String r0 = r4.A1Y
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0476
            java.lang.String r1 = r4.A1Y
            java.lang.String r0 = "image_id"
            r5.A0R(r0, r1)
        L_0x0476:
            r5.A0Z()
            goto L_0x0410
        L_0x047a:
            java.lang.String r1 = X.JTR.A13(r5, r9)
            java.lang.String r0 = "static_models"
            r8.A9m(r0, r1)
        L_0x0483:
            java.util.List r0 = r6.A0e
            if (r0 == 0) goto L_0x048e
            boolean r2 = r0.isEmpty()
            r1 = 0
            if (r2 == 0) goto L_0x048f
        L_0x048e:
            r1 = 1
        L_0x048f:
            java.lang.String r11 = ","
            if (r1 != 0) goto L_0x04e8
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r0.iterator()
            r9 = 0
            r5 = 0
        L_0x04a1:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x04eb
            java.lang.Object r2 = r13.next()
            X.4nO r2 = (X.C273914nO) r2
            java.lang.String r0 = r2.A03
            if (r0 == 0) goto L_0x04b4
            r4.add(r0)
        L_0x04b4:
            java.lang.String r0 = r2.A04
            if (r0 == 0) goto L_0x04c2
            int r1 = r0.length()
            if (r1 == 0) goto L_0x04c2
            r3.add(r0)
            goto L_0x04a1
        L_0x04c2:
            java.lang.String r0 = r2.A00()
            X.0qQ.A07(r0)
            r3.add(r0)
            java.lang.String r1 = r2.A00()
            java.lang.String r0 = "superlative_sticker_bundle_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x04da
            r9 = 1
            goto L_0x04a1
        L_0x04da:
            java.lang.String r1 = r2.A00()
            java.lang.String r0 = "quicksnap_recap_bundle_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x04a1
            r5 = 1
            goto L_0x04a1
        L_0x04e8:
            r9 = 0
            r5 = 0
            goto L_0x050d
        L_0x04eb:
            boolean r0 = X.DbT.A1b(r4)
            if (r0 == 0) goto L_0x04ff
            X.3El r0 = new X.3El
            r0.<init>(r11)
            java.lang.String r1 = r0.A02(r4)
            java.lang.String r0 = "attribution_enabled_sticker_pack_ids"
            r8.A9m(r0, r1)
        L_0x04ff:
            X.3El r0 = new X.3El
            r0.<init>(r11)
            java.lang.String r1 = r0.A02(r3)
            java.lang.String r0 = "story_sticker_ids"
            r8.A9m(r0, r1)
        L_0x050d:
            java.lang.String r1 = "true"
            if (r9 == 0) goto L_0x051a
            r0 = 3464(0xd88, float:4.854E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.AA0(r0, r1)
        L_0x051a:
            if (r5 == 0) goto L_0x0521
            java.lang.String r0 = "is_quicksnap_recap"
            r8.AA0(r0, r1)
        L_0x0521:
            java.util.List r1 = r6.A0b
            if (r1 == 0) goto L_0x0540
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0540
            java.lang.String r1 = X.VFF.A00(r1)
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0540
            r0 = 2290(0x8f2, float:3.209E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r8.AA0(r0, r1)
        L_0x0540:
            java.util.List r1 = r6.A0l
            if (r1 == 0) goto L_0x0553
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0553
            java.lang.String r1 = X.C51970G9q.A0k(r1)
            java.lang.String r0 = "rich_text_format_types"
            r8.A9m(r0, r1)
        L_0x0553:
            java.util.List r1 = r6.A0k
            if (r1 == 0) goto L_0x056a
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x056a
            java.lang.String r1 = X.C51970G9q.A0k(r1)
            r0 = 5298(0x14b2, float:7.424E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r1)
        L_0x056a:
            java.util.List r0 = r6.A0m
            if (r0 == 0) goto L_0x0599
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0599
            java.io.StringWriter r2 = X.JTO.A0v()
            X.17W r1 = X.C51970G9q.A0e(r2)
            java.util.Iterator r3 = r0.iterator()
        L_0x0580:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0590
            java.lang.Object r0 = r3.next()
            X.5Ei r0 = (X.C282685Ei) r0
            X.C282675Eh.A00(r1, r0)
            goto L_0x0580
        L_0x0590:
            java.lang.String r1 = X.JTR.A13(r1, r2)
            java.lang.String r0 = "text_metadata"
            r8.A9m(r0, r1)
        L_0x0599:
            java.util.List r0 = r6.A0j
            if (r0 == 0) goto L_0x05cc
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x05cc
            java.io.StringWriter r2 = X.JTO.A0v()
            X.17W r1 = X.C51970G9q.A0e(r2)
            java.util.Iterator r3 = r0.iterator()
        L_0x05af:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x05bf
            java.lang.Object r0 = r3.next()
            X.5Ek r0 = (X.C282705Ek) r0
            X.C282695Ej.A00(r1, r0)
            goto L_0x05af
        L_0x05bf:
            java.lang.String r1 = X.JTS.A0k(r1, r2)
            r0 = 3374(0xd2e, float:4.728E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r8.A9m(r0, r1)
        L_0x05cc:
            java.util.Set r0 = r6.A0o
            if (r0 == 0) goto L_0x05e8
            java.util.Set r1 = X.SAR.A00(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x05e8
            X.3El r0 = new X.3El
            r0.<init>(r11)
            java.lang.String r1 = r0.A02(r1)
            java.lang.String r0 = "internal_features"
            r8.A9m(r0, r1)
        L_0x05e8:
            java.lang.String r1 = r6.A0N
            if (r1 == 0) goto L_0x05ff
            int r0 = r1.length()
            if (r0 == 0) goto L_0x05ff
            java.lang.String r0 = r6.A0T
            if (r0 != 0) goto L_0x05ff
            r0 = 1334(0x536, float:1.87E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r1)
        L_0x05ff:
            com.instagram.clips.model.metadata.ClipsFanClubMetadata r2 = r6.A02
            if (r2 == 0) goto L_0x061b
            java.io.StringWriter r1 = X.JTO.A0v()
            X.17W r0 = X.JTO.A0Q(r1)
            X.F5G.A00(r0, r2)
            java.lang.String r1 = X.JTP.A0n(r0, r1)
            r0 = 2340(0x924, float:3.279E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r8.A9m(r0, r1)
        L_0x061b:
            java.lang.String r1 = r6.A0M
            if (r1 == 0) goto L_0x062e
            int r0 = r1.length()
            if (r0 == 0) goto L_0x062e
            r0 = 282(0x11a, float:3.95E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r1)
        L_0x062e:
            X.8GK r2 = r6.A09
            if (r2 == 0) goto L_0x064a
            java.io.StringWriter r1 = X.JTO.A0v()
            X.17W r0 = X.JTO.A0Q(r1)
            X.AB6.A00(r0, r2)
            java.lang.String r1 = X.JTP.A0n(r0, r1)
            r0 = 595(0x253, float:8.34E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r1)
        L_0x064a:
            java.lang.String r1 = r6.A0H
            if (r1 == 0) goto L_0x0659
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0659
            java.lang.String r0 = "capture_type"
            r8.A9m(r0, r1)
        L_0x0659:
            java.lang.Integer r0 = r6.A0D
            if (r0 == 0) goto L_0x066a
            int r0 = r0.intValue()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "num_stopmotion_capture"
            r8.A9m(r0, r1)
        L_0x066a:
            java.lang.String r1 = r6.A0L
            if (r1 == 0) goto L_0x067d
            int r0 = r1.length()
            if (r0 == 0) goto L_0x067d
            r0 = 4667(0x123b, float:6.54E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r1)
        L_0x067d:
            java.lang.String r1 = r6.A0J
            if (r1 == 0) goto L_0x068c
            int r0 = r1.length()
            if (r0 == 0) goto L_0x068c
            java.lang.String r0 = "create_mode_format"
            r8.A9m(r0, r1)
        L_0x068c:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r9 = r6.A03
            java.lang.String r1 = r9.A03
            if (r1 == 0) goto L_0x06a1
            int r0 = r1.length()
            if (r0 == 0) goto L_0x06a1
            r0 = 507(0x1fb, float:7.1E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r1)
        L_0x06a1:
            java.lang.String r2 = r9.A04
            if (r2 == 0) goto L_0x06b0
            int r0 = r2.length()
            if (r0 == 0) goto L_0x06b0
            java.lang.String r0 = "app_attribution_android_raw_namespace"
            r8.A9m(r0, r2)
        L_0x06b0:
            java.lang.String r2 = r9.A05
            if (r2 == 0) goto L_0x06d5
            int r0 = r2.length()
            if (r0 == 0) goto L_0x06d5
            boolean r0 = X.0mp.A0B(r2)
            if (r0 != 0) goto L_0x06d5
            X.0sn r0 = X.0sn.A00
            java.lang.String r0 = X.C59737JVv.A02(r7, r1, r0)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x06d5
            r0 = 256(0x100, float:3.59E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r2)
        L_0x06d5:
            java.lang.String r2 = r9.A0A
            if (r2 == 0) goto L_0x06f6
            int r0 = r2.length()
            if (r0 == 0) goto L_0x06f6
            boolean r0 = X.0mp.A0B(r2)
            if (r0 != 0) goto L_0x06f6
            X.0sn r0 = X.0sn.A00
            java.lang.String r0 = X.C59737JVv.A02(r7, r1, r0)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x06f6
            java.lang.String r0 = "wearable_shared_media_global_id"
            r8.A9m(r0, r2)
        L_0x06f6:
            java.lang.String r1 = r6.A0G
            if (r1 == 0) goto L_0x0709
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0709
            r0 = 257(0x101, float:3.6E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r1)
        L_0x0709:
            java.lang.String r1 = r6.A0T
            if (r1 == 0) goto L_0x071c
            int r0 = r1.length()
            if (r0 == 0) goto L_0x071c
            r0 = 5189(0x1445, float:7.271E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r1)
        L_0x071c:
            java.lang.String r1 = r6.A0F
            if (r1 == 0) goto L_0x072f
            int r0 = r1.length()
            if (r0 == 0) goto L_0x072f
            r0 = 4481(0x1181, float:6.279E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r1)
        L_0x072f:
            java.lang.String r1 = r6.A0O
            if (r1 == 0) goto L_0x0742
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0742
            r0 = 4792(0x12b8, float:6.715E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r1)
        L_0x0742:
            java.util.List r14 = r6.A0f
            if (r14 == 0) goto L_0x07f0
            boolean r0 = X.AnonymousClass7TE.A1b(r14)
            if (r0 == 0) goto L_0x07f0
            r13 = 0
            java.io.StringWriter r5 = X.JTO.A0v()
            X.15p r4 = X.AnonymousClass15o.A00
            X.17W r3 = r4.A0A(r5)
            r3.A0b()
            r3.A0c()
            java.lang.String r0 = "links"
            r3.A0q(r0)
            r3.A0b()
            boolean r0 = r14.isEmpty()
            r2 = 0
            if (r0 != 0) goto L_0x07aa
            java.lang.Object r0 = r14.get(r13)
            com.instagram.feed.media.ReelCTAIntf r0 = (com.instagram.feed.media.ReelCTAIntf) r0
            java.lang.String r0 = X.AnonymousClass6MS.A02(r0)
            if (r0 == 0) goto L_0x0990
            r3.A0c()
            java.lang.Object r0 = r14.get(r13)
            com.instagram.feed.media.ReelCTAIntf r0 = (com.instagram.feed.media.ReelCTAIntf) r0
            java.lang.String r1 = X.AnonymousClass6MS.A02(r0)
            java.lang.String r0 = "webUri"
            r3.A0R(r0, r1)
            java.lang.Object r0 = r14.get(r13)
            if (r0 == 0) goto L_0x07a7
            X.4Cl r0 = X.DbX.A0m(r7)
            X.4bj r0 = r0.B4O()
            if (r0 == 0) goto L_0x07a7
            X.4Cl r0 = X.DbX.A0m(r7)
            X.4bj r0 = r0.B4O()
            if (r0 == 0) goto L_0x07a7
            r0.Bzz()
        L_0x07a7:
            r3.A0Z()
        L_0x07aa:
            r3.A0Y()
            java.lang.Object r0 = r14.get(r13)
            com.instagram.feed.media.ReelCTAIntf r0 = (com.instagram.feed.media.ReelCTAIntf) r0
            java.lang.String r1 = X.AnonymousClass6MS.A00(r0)
            if (r1 == 0) goto L_0x07e4
            com.instagram.feed.media.ReelCTA r0 = X.JTO.A0j(r14)
            if (r0 == 0) goto L_0x07e4
            java.lang.String r0 = r0.A09
            if (r0 == 0) goto L_0x07e4
            java.lang.String r0 = "id_based_cta"
            r3.A0q(r0)
            r3.A0c()
            r0 = 3684(0xe64, float:5.162E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A0R(r0, r1)
            com.instagram.feed.media.ReelCTA r0 = X.JTO.A0j(r14)
            if (r0 == 0) goto L_0x07dc
            java.lang.String r2 = r0.A09
        L_0x07dc:
            java.lang.String r0 = "cta_type"
            r3.A0R(r0, r2)
            r3.A0Z()
        L_0x07e4:
            r3.A0Z()
            java.lang.String r1 = X.JTS.A0k(r3, r5)
            java.lang.String r0 = "story_cta"
            r8.A9m(r0, r1)
        L_0x07f0:
            java.lang.String r1 = r6.A0I
            if (r1 == 0) goto L_0x07ff
            int r0 = r1.length()
            if (r0 == 0) goto L_0x07ff
            java.lang.String r0 = "camera_session_id"
            r8.A9m(r0, r1)
        L_0x07ff:
            boolean r0 = r6.A0q
            if (r0 == 0) goto L_0x080c
            r0 = 1449(0x5a9, float:2.03E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r8.A9m(r0, r10)
        L_0x080c:
            boolean r0 = r6.A15
            if (r0 == 0) goto L_0x0819
            r0 = 4969(0x1369, float:6.963E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r10)
        L_0x0819:
            boolean r0 = r6.A16
            if (r0 == 0) goto L_0x0822
            java.lang.String r0 = "is_stories_draft"
            r8.A9m(r0, r10)
        L_0x0822:
            boolean r0 = r6.A0r
            if (r0 == 0) goto L_0x082f
            r0 = 4957(0x135d, float:6.946E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r10)
        L_0x082f:
            long r0 = r6.A00
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x0842
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 3335(0xd07, float:4.673E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r1)
        L_0x0842:
            boolean r0 = r6.A0t
            if (r0 == 0) goto L_0x084b
            java.lang.String r0 = "has_animated_sticker"
            r8.A9m(r0, r10)
        L_0x084b:
            boolean r0 = r6.A17
            if (r0 == 0) goto L_0x0854
            java.lang.String r0 = "video_subtitles_enabled"
            r8.A9m(r0, r10)
        L_0x0854:
            boolean r0 = r6.A13
            if (r0 == 0) goto L_0x085d
            java.lang.String r0 = "private_mention_sharing_enabled"
            r8.A9m(r0, r10)
        L_0x085d:
            boolean r0 = r6.A0x
            if (r0 == 0) goto L_0x086a
            r0 = 1499(0x5db, float:2.1E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r10)
        L_0x086a:
            java.lang.String r1 = r6.A0S
            if (r1 == 0) goto L_0x087d
            int r0 = r1.length()
            if (r0 == 0) goto L_0x087d
            r0 = 1746(0x6d2, float:2.447E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r1)
        L_0x087d:
            java.util.List r1 = r6.A0a
            if (r1 == 0) goto L_0x0890
            X.4aB r0 = X.C266684aA.A0N
            java.lang.String r1 = r0.A00(r1)
            r0 = 2166(0x876, float:3.035E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r8.A9m(r0, r1)
        L_0x0890:
            X.3QS r2 = r6.A06
            if (r2 == 0) goto L_0x08a6
            com.instagram.music.common.model.MusicOverlayStickerModel r1 = X.C271404in.A05(r21)
            r0 = 0
            java.lang.String r1 = X.C64017LJe.A00(r0, r1, r2, r0, r0)
            r0 = 2162(0x872, float:3.03E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r8.AA0(r0, r1)
        L_0x08a6:
            java.util.List r0 = r6.A0Z
            if (r0 == 0) goto L_0x08b3
            java.lang.String r1 = X.0mh.A00(r0)
            java.lang.String r0 = "effect_ids"
            r8.AA0(r0, r1)
        L_0x08b3:
            boolean r0 = r6.A0w
            if (r0 == 0) goto L_0x08c0
            r0 = 4912(0x1330, float:6.883E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r10)
        L_0x08c0:
            boolean r0 = r6.A14
            if (r0 == 0) goto L_0x08cd
            r0 = 4967(0x1367, float:6.96E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r10)
        L_0x08cd:
            boolean r0 = r6.A0s
            if (r0 == 0) goto L_0x08d6
            java.lang.String r0 = "hallpass_creation"
            r8.A9m(r0, r10)
        L_0x08d6:
            boolean r0 = r6.A0y
            if (r0 == 0) goto L_0x08e3
            r0 = 4927(0x133f, float:6.904E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r10)
        L_0x08e3:
            boolean r0 = r6.A18
            if (r0 == 0) goto L_0x08f9
            java.lang.String r0 = "should_create_group_mention_thread"
            r8.A9m(r0, r10)
            X.0xY r2 = X.AnonymousClass7TF.A0N(r7)
            java.lang.String r1 = "allow_story_mention_group_thread_creation"
            r0 = 0
            r2.E5T(r1, r0)
            r2.apply()
        L_0x08f9:
            boolean r0 = r6.A10
            if (r0 == 0) goto L_0x0906
            r0 = 4943(0x134f, float:6.927E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r10)
        L_0x0906:
            boolean r0 = r6.A0v
            if (r0 == 0) goto L_0x090f
            java.lang.String r0 = "disable_comments"
            r8.A9m(r0, r10)
        L_0x090f:
            boolean r0 = r6.A12
            if (r0 == 0) goto L_0x091c
            r0 = 4956(0x135c, float:6.945E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r10)
        L_0x091c:
            java.lang.Integer r0 = r6.A0E
            if (r0 == 0) goto L_0x0931
            int r0 = r0.intValue()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 5090(0x13e2, float:7.133E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r1)
        L_0x0931:
            java.lang.String r1 = r6.A0W
            if (r1 == 0) goto L_0x093e
            r0 = 5345(0x14e1, float:7.49E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r1)
        L_0x093e:
            java.lang.String r1 = r6.A0V
            if (r1 == 0) goto L_0x0947
            java.lang.String r0 = "container_module"
            r8.A9m(r0, r1)
        L_0x0947:
            boolean r0 = r6.A0z
            if (r0 == 0) goto L_0x0950
            java.lang.String r0 = "from_drafts"
            r8.A9m(r0, r10)
        L_0x0950:
            java.lang.String r1 = r6.A0K
            if (r1 == 0) goto L_0x095d
            r0 = 4634(0x121a, float:6.494E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r1)
        L_0x095d:
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo r2 = r6.A05
            if (r2 == 0) goto L_0x0975
            java.io.StringWriter r1 = X.JTO.A0v()
            X.17W r0 = X.JTO.A0Q(r1)
            X.LI2.A00(r0, r2)
            java.lang.String r1 = X.JTP.A0n(r0, r1)
            java.lang.String r0 = "gallery_suggestions_info"
            r8.A9m(r0, r1)
        L_0x0975:
            java.lang.String r1 = r6.A0P
            if (r1 == 0) goto L_0x0982
            r0 = 4759(0x1297, float:6.669E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r1)
        L_0x0982:
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r3 = r6.A04
            java.lang.Boolean r0 = r6.A0C
            if (r3 == 0) goto L_0x0bad
            if (r0 == 0) goto L_0x0bad
            boolean r5 = r0.booleanValue()
            goto L_0x0b29
        L_0x0990:
            java.lang.Object r0 = r14.get(r13)
            com.instagram.feed.media.ReelCTAIntf r0 = (com.instagram.feed.media.ReelCTAIntf) r0
            java.lang.String r0 = X.AnonymousClass6MS.A01(r0)
            if (r0 == 0) goto L_0x09b7
            r3.A0c()
            java.lang.Object r0 = r14.get(r13)
            com.instagram.feed.media.ReelCTAIntf r0 = (com.instagram.feed.media.ReelCTAIntf) r0
            java.lang.String r1 = X.AnonymousClass6MS.A01(r0)
            r0 = 3131(0xc3b, float:4.387E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A0R(r0, r1)
            r3.A0Z()
            goto L_0x07aa
        L_0x09b7:
            com.instagram.feed.media.ReelCTA r0 = X.JTO.A0j(r14)
            if (r0 == 0) goto L_0x09f5
            com.instagram.model.shopping.reels.ProfileShopLink r0 = r0.A03
            if (r0 == 0) goto L_0x09f5
            r3.A0c()
            com.instagram.feed.media.ReelCTA r0 = X.JTO.A0j(r14)
            if (r0 == 0) goto L_0x09ee
            com.instagram.model.shopping.reels.ProfileShopLink r0 = r0.A03
            if (r0 == 0) goto L_0x09ee
            java.lang.String r0 = r0.BhF()
            if (r0 == 0) goto L_0x09ee
            com.instagram.feed.media.ReelCTA r0 = X.JTO.A0j(r14)
            if (r0 == 0) goto L_0x09f3
            com.instagram.model.shopping.reels.ProfileShopLink r0 = r0.A03
            if (r0 == 0) goto L_0x09f3
            java.lang.String r1 = r0.BhF()
            if (r1 != 0) goto L_0x09e5
            r1 = 0
        L_0x09e5:
            r0 = 89
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A0R(r0, r1)
        L_0x09ee:
            r3.A0Z()
            goto L_0x07aa
        L_0x09f3:
            r1 = r2
            goto L_0x09e5
        L_0x09f5:
            com.instagram.feed.media.ReelCTA r0 = X.JTO.A0j(r14)
            if (r0 == 0) goto L_0x0a21
            java.lang.Boolean r0 = r0.A06
            r1 = 1
            if (r0 == 0) goto L_0x0a21
            com.instagram.feed.media.ReelCTA r0 = X.JTO.A0j(r14)
            if (r0 == 0) goto L_0x0a21
            java.lang.Boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0a21
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0a21
            r3.A0c()
            r0 = 4894(0x131e, float:6.858E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A0S(r0, r1)
            r3.A0Z()
            goto L_0x07aa
        L_0x0a21:
            com.instagram.feed.media.ReelCTA r0 = X.JTO.A0j(r14)
            if (r0 == 0) goto L_0x0a85
            com.instagram.model.shopping.reels.ProductCollectionLink r0 = r0.A02
            if (r0 == 0) goto L_0x0a85
            com.instagram.feed.media.ReelCTA r0 = X.JTO.A0j(r14)
            if (r0 == 0) goto L_0x0a83
            com.instagram.model.shopping.reels.ProductCollectionLink r1 = r0.A02
        L_0x0a33:
            r3.A0c()
            java.lang.String r22 = ""
            if (r1 == 0) goto L_0x0a42
            com.instagram.api.schemas.MultiProductComponentDestinationType r0 = r1.A00
            if (r0 == 0) goto L_0x0a42
            java.lang.String r0 = r0.A00
            if (r0 != 0) goto L_0x0a44
        L_0x0a42:
            r0 = r22
        L_0x0a44:
            r15 = 138(0x8a, float:1.93E-43)
            java.lang.String r15 = X.C273654mx.A00(r15)
            r3.A0R(r15, r0)
            if (r1 == 0) goto L_0x0a55
            java.lang.String r0 = r1.A05
            if (r0 == 0) goto L_0x0a55
            r22 = r0
        L_0x0a55:
            r0 = 4703(0x125f, float:6.59E-42)
            java.lang.String r15 = X.AnonymousClass000.A00(r0)
            r0 = r22
            r3.A0R(r15, r0)
            if (r1 == 0) goto L_0x0a7e
            com.instagram.model.shopping.reels.ShoppingDestinationMetadata r1 = r1.A01
            if (r1 == 0) goto L_0x0a7e
            java.io.StringWriter r0 = X.JTO.A0v()
            X.17W r4 = r4.A0A(r0)
            X.C45691D1q.A00(r4, r1)
            java.lang.String r1 = X.JTP.A0n(r4, r0)
            r0 = 585(0x249, float:8.2E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A0R(r0, r1)
        L_0x0a7e:
            r3.A0Z()
            goto L_0x07aa
        L_0x0a83:
            r1 = r2
            goto L_0x0a33
        L_0x0a85:
            com.instagram.feed.media.ReelCTA r0 = X.JTO.A0j(r14)
            if (r0 == 0) goto L_0x0aba
            com.instagram.model.shopping.reels.ReelProductLink r0 = r0.A05
            if (r0 == 0) goto L_0x0aba
            com.instagram.feed.media.ReelCTA r0 = X.JTO.A0j(r14)
            if (r0 == 0) goto L_0x0aba
            com.instagram.model.shopping.reels.ReelProductLink r0 = r0.A05
            if (r0 == 0) goto L_0x0aba
            com.instagram.user.model.ProductDetailsProductItemDict r1 = r0.A00
            if (r1 == 0) goto L_0x0aba
            com.instagram.user.model.Product r0 = new com.instagram.user.model.Product
            r0.<init>(r2, r1)
            com.instagram.feed.media.ReelCTA r0 = X.JTO.A0j(r14)
            if (r0 == 0) goto L_0x07aa
            com.instagram.model.shopping.reels.ReelProductLink r0 = r0.A05
            if (r0 == 0) goto L_0x07aa
            com.instagram.user.model.ProductDetailsProductItemDict r1 = r0.A00
            if (r1 == 0) goto L_0x07aa
            com.instagram.user.model.Product r0 = new com.instagram.user.model.Product
            r0.<init>(r2, r1)
            X.AnonymousClass6MS.A03(r3, r0)
            goto L_0x07aa
        L_0x0aba:
            com.instagram.feed.media.ReelCTA r0 = X.JTO.A0j(r14)
            if (r0 == 0) goto L_0x07aa
            com.instagram.model.shopping.reels.ReelMultiProductLink r0 = r0.A04
            if (r0 == 0) goto L_0x07aa
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x07aa
            com.instagram.feed.media.ReelCTA r0 = X.JTO.A0j(r14)
            if (r0 == 0) goto L_0x07aa
            com.instagram.model.shopping.reels.ReelMultiProductLink r0 = r0.A04
            if (r0 == 0) goto L_0x07aa
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x07aa
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x07aa
            r3.A0c()
            r0 = 822(0x336, float:1.152E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.A0q(r0)
            r3.A0b()
            com.instagram.feed.media.ReelCTA r0 = X.JTO.A0j(r14)
            if (r0 == 0) goto L_0x0b21
            com.instagram.model.shopping.reels.ReelMultiProductLink r0 = r0.A04
            if (r0 == 0) goto L_0x0b21
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0b21
            com.instagram.feed.media.ReelCTA r0 = X.JTO.A0j(r14)
            if (r0 == 0) goto L_0x0b21
            com.instagram.model.shopping.reels.ReelMultiProductLink r0 = r0.A04
            if (r0 == 0) goto L_0x0b21
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0b21
            java.util.List r0 = X.C14502TxO.A02(r0)
            if (r0 == 0) goto L_0x0b21
            java.util.Iterator r1 = r0.iterator()
        L_0x0b11:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0b21
            java.lang.Object r0 = r1.next()
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            X.AnonymousClass6MS.A03(r3, r0)
            goto L_0x0b11
        L_0x0b21:
            r3.A0Y()
            r3.A0Z()
            goto L_0x07aa
        L_0x0b29:
            org.json.JSONObject r2 = X.DbS.A11()     // Catch:{ JSONException -> 0x0bad }
            java.lang.String r1 = "width"
            int r0 = r3.A04     // Catch:{ JSONException -> 0x0bad }
            int r0 = r0 % 180
            if (r0 != 0) goto L_0x0baa
            int r0 = r3.A05     // Catch:{ JSONException -> 0x0bad }
        L_0x0b37:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x0bad }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0bad }
            java.lang.String r1 = "height"
            int r0 = r3.A04     // Catch:{ JSONException -> 0x0bad }
            int r0 = r0 % 180
            if (r0 != 0) goto L_0x0ba7
            int r0 = r3.A03     // Catch:{ JSONException -> 0x0bad }
        L_0x0b48:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x0bad }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0bad }
            java.lang.String r1 = "x_transform"
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r0 = r3.A08     // Catch:{ JSONException -> 0x0bad }
            float r4 = r0.A02     // Catch:{ JSONException -> 0x0bad }
            int r0 = r3.A07     // Catch:{ JSONException -> 0x0bad }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x0bad }
            float r4 = r4 * r0
            int r0 = (int) r4     // Catch:{ JSONException -> 0x0bad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x0bad }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0bad }
            java.lang.String r1 = "y_transform"
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r0 = r3.A08     // Catch:{ JSONException -> 0x0bad }
            float r4 = r0.A03     // Catch:{ JSONException -> 0x0bad }
            int r0 = r3.A06     // Catch:{ JSONException -> 0x0bad }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x0bad }
            float r4 = r4 * r0
            int r0 = (int) r4     // Catch:{ JSONException -> 0x0bad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x0bad }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0bad }
            java.lang.String r1 = "zoom"
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r0 = r3.A08     // Catch:{ JSONException -> 0x0bad }
            float r0 = r0.A01     // Catch:{ JSONException -> 0x0bad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x0bad }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0bad }
            java.lang.String r1 = "rotation"
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r0 = r3.A08     // Catch:{ JSONException -> 0x0bad }
            float r0 = r0.A00     // Catch:{ JSONException -> 0x0bad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x0bad }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0bad }
            java.lang.String r1 = "background_coverage"
            if (r5 == 0) goto L_0x0ba4
            r0 = 1120403456(0x42c80000, float:100.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ JSONException -> 0x0bad }
        L_0x0b97:
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0bad }
            java.lang.String r1 = "media_transformation_info"
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x0bad }
            r8.A9m(r1, r0)     // Catch:{ JSONException -> 0x0bad }
            goto L_0x0bad
        L_0x0ba4:
            java.lang.String r0 = "0.0"
            goto L_0x0b97
        L_0x0ba7:
            int r0 = r3.A05     // Catch:{ JSONException -> 0x0bad }
            goto L_0x0b48
        L_0x0baa:
            int r0 = r3.A03     // Catch:{ JSONException -> 0x0bad }
            goto L_0x0b37
        L_0x0bad:
            java.util.List r4 = r6.A0d
            if (r4 == 0) goto L_0x0c30
            X.3WT r0 = X.AnonymousClass3WT.PROMPT
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0c05
            java.util.Iterator r3 = r0.iterator()
        L_0x0bbf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0c21
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.3ui r0 = (X.C255783ui) r0
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r0.A0F()
            if (r0 == 0) goto L_0x0bbf
            boolean r1 = r0.A0D
            r0 = 1
            if (r1 != r0) goto L_0x0bbf
        L_0x0bd7:
            X.3ui r2 = (X.C255783ui) r2
            if (r2 == 0) goto L_0x0c05
            com.instagram.reels.prompt.model.PromptStickerModel r2 = r2.A0F()
            if (r2 == 0) goto L_0x0c05
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r2.A00
            java.lang.String r1 = r0.getBackgroundColor()
            if (r1 == 0) goto L_0x0bf3
            java.lang.Object r0 = X.00k.A0I(r4)
            X.LMH r0 = (X.LMH) r0
            X.LN5 r0 = r0.A01
            r0.A00 = r1
        L_0x0bf3:
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r2.A00
            java.lang.String r1 = r0.Bzk()
            if (r1 == 0) goto L_0x0c05
            java.lang.Object r0 = X.00k.A0I(r4)
            X.LMH r0 = (X.LMH) r0
            X.LN5 r0 = r0.A01
            r0.A06 = r1
        L_0x0c05:
            java.io.StringWriter r3 = X.JTO.A0v()
            X.17W r2 = X.C51970G9q.A0e(r3)
            java.util.Iterator r1 = r4.iterator()
        L_0x0c11:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0c23
            java.lang.Object r0 = r1.next()
            X.LMH r0 = (X.LMH) r0
            X.LIX.A00(r2, r0)
            goto L_0x0c11
        L_0x0c21:
            r2 = 0
            goto L_0x0bd7
        L_0x0c23:
            java.lang.String r1 = X.JTS.A0k(r2, r3)
            r0 = 2943(0xb7f, float:4.124E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.AA0(r0, r1)
        L_0x0c30:
            java.lang.String r0 = r9.A02
            if (r0 == 0) goto L_0x0c45
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x0c45
            java.lang.String r1 = r9.A02
            r0 = 248(0xf8, float:3.48E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r1)
        L_0x0c45:
            java.lang.String r0 = r9.A08
            if (r0 == 0) goto L_0x0c56
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x0c56
            java.lang.String r1 = r9.A08
            java.lang.String r0 = "metagallery_media_id"
            r8.A9m(r0, r1)
        L_0x0c56:
            java.lang.String r0 = r9.A07
            if (r0 == 0) goto L_0x0c61
            boolean r1 = X.00l.A0W(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0c62
        L_0x0c61:
            r0 = 1
        L_0x0c62:
            java.lang.String r2 = "0"
            if (r0 != 0) goto L_0x0c75
            java.lang.String r0 = r9.A07
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 != 0) goto L_0x0c75
            java.lang.String r1 = r9.A07
            java.lang.String r0 = "horizon_world_id"
            r8.A9m(r0, r1)
        L_0x0c75:
            com.instagram.common.gallery.metadata.ImmersiveMediaFields r0 = r9.A00
            if (r0 == 0) goto L_0x0c94
            boolean r0 = r0.A01
            r4 = 1
            if (r0 != r4) goto L_0x0c94
            java.io.StringWriter r3 = X.JTO.A0v()
            X.17W r1 = X.AnonymousClass7TF.A0K(r3)
            java.lang.String r0 = "is_3d"
            r1.A0S(r0, r4)
            java.lang.String r1 = X.AnonymousClass7TG.A0k(r1, r3)
            java.lang.String r0 = "immersive_media_info"
            r8.A9m(r0, r1)
        L_0x0c94:
            java.util.List r1 = r6.A0X
            if (r1 == 0) goto L_0x0ccd
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x0ccd
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.util.Iterator r1 = r1.iterator()
        L_0x0ca6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0cb7
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            r3.append(r0)
            r3.append(r11)
            goto L_0x0ca6
        L_0x0cb7:
            int r1 = r3.length()
            r0 = 1
            int r1 = r1 - r0
            r3.deleteCharAt(r1)
            java.lang.String r1 = r3.toString()
            r0 = 5291(0x14ab, float:7.414E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9m(r0, r1)
        L_0x0ccd:
            java.lang.String r1 = r6.A0Q
            if (r1 == 0) goto L_0x0cdc
            boolean r0 = X.00l.A0W(r1)
            if (r0 != 0) goto L_0x0cdc
            java.lang.String r0 = "hallpass_id"
            r8.A9m(r0, r1)
        L_0x0cdc:
            java.util.List r1 = r6.A0c
            if (r1 == 0) goto L_0x0cf6
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x0cf6
            java.lang.String r1 = X.C51970G9q.A0k(r1)
            java.lang.String r0 = "root_media_ids"
            r8.A9m(r0, r1)
            java.lang.String r1 = "dependent_to_root_media_use_case"
            java.lang.String r0 = "4"
            r8.A9m(r1, r0)
        L_0x0cf6:
            java.util.List r1 = r6.A0h
            if (r1 == 0) goto L_0x0d1b
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0d1b
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x0d08:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0d12
            X.JTS.A1V(r3, r1)
            goto L_0x0d08
        L_0x0d12:
            java.lang.String r1 = X.C51970G9q.A0k(r3)
            java.lang.String r0 = "share_to_friends_story_distributor_ids"
            r8.A9m(r0, r1)
        L_0x0d1b:
            java.lang.String r1 = r6.A0U
            if (r1 == 0) goto L_0x0d24
            java.lang.String r0 = "pending_share_to_friends_story_media_id"
            r8.A9m(r0, r1)
        L_0x0d24:
            java.lang.String r3 = "has_camera_metadata"
            if (r20 == 0) goto L_0x0d35
            X.0Tu r4 = X.0Tu.A05
            r0 = 36321129673008261(0x8109e000002485, double:3.032966886435943E-306)
            boolean r0 = X.182.A06(r4, r7, r0)
            if (r0 != 0) goto L_0x0d44
        L_0x0d35:
            if (r27 == 0) goto L_0x0d4d
            X.0Tu r4 = X.0Tu.A05
            r0 = 36321129673073798(0x8109e000012486, double:3.032966886477389E-306)
            boolean r0 = X.182.A06(r4, r7, r0)
            if (r0 == 0) goto L_0x0d4d
        L_0x0d44:
            boolean r0 = r6.A0u
            if (r0 != 0) goto L_0x0d49
            r10 = r2
        L_0x0d49:
            r8.A9m(r3, r10)
        L_0x0d4c:
            return
        L_0x0d4d:
            java.lang.String r5 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "google"
            if (r5 == 0) goto L_0x0d4c
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0d4c
            X.0wj r2 = X.0wj.A01
            r1 = 18951022(0x1212b6e, float:2.960219E-38)
            java.lang.String r0 = "MISSING_CAMERA_METADATA_FLAG"
            X.0f9 r4 = r2.AEf(r0, r1)
            java.lang.String r0 = "manufacturer"
            r4.ABQ(r0, r5)
            java.lang.String r1 = android.os.Build.BRAND
            java.lang.String r0 = "brand"
            r4.ABQ(r0, r1)
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "model"
            r4.ABQ(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r0 = "os_version"
            r4.ABO(r0, r1)
            X.0Tu r2 = X.0Tu.A06
            r0 = 36321129673008261(0x8109e000002485, double:3.032966886435943E-306)
            boolean r1 = X.182.A06(r2, r7, r0)
            java.lang.String r0 = "is_logging_enabled"
            r4.ABR(r0, r1)
            boolean r0 = r6.A0u
            r4.ABR(r3, r0)
            r1 = r19
            r0 = r18
            r4.ABQ(r1, r0)
            r4.report()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64177LSe.A01(X.1Fb, com.instagram.common.session.UserSession, X.LBU, long, boolean):void");
    }
}
