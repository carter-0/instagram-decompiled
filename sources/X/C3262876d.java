package X;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.model.mediasize.VideoUrlImpl;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.io.File;
import java.util.List;

/* renamed from: X.76d  reason: invalid class name and case insensitive filesystem */
public final class C3262876d {
    public final Context A00;
    public final C249883kW A01;
    public final UserSession A02;
    public final C3263176g A03;
    public final C3263276h A04;
    public final C3262976e A05;
    public final C3263076f A06;

    public final AnonymousClass77B A02(Medium medium, boolean z) {
        0eP r2;
        SimpleImageUrl A012;
        VideoUrlImpl videoUrlImpl;
        Integer num;
        Long l;
        Medium medium2 = medium;
        boolean CeS = medium2.CeS();
        String str = null;
        if (CeS) {
            String str2 = medium2.A0X;
            float A002 = medium2.A00();
            0qQ.A0B(str2, 0);
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(str2);
                String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
                if (extractMetadata != null) {
                    num = 00y.A0l(extractMetadata);
                } else {
                    num = null;
                }
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(9);
                if (extractMetadata2 != null) {
                    l = 00y.A0n(10, extractMetadata2);
                } else {
                    l = null;
                }
                if (!(num == null || l == null)) {
                    int intValue = num.intValue();
                    if (intValue == 90 || intValue == 270) {
                        A002 = 1.0f / A002;
                    }
                    r2 = new 0eP(Float.valueOf(A002), l);
                }
            } catch (Exception e) {
                0wb.A06("DirectMediaViewerVideoMetadataTask_doInBackground_setDataSource", "File does not exist ", e);
            }
            r2 = new 0eP(Float.valueOf(1.0f), 0L);
        } else {
            r2 = new 0eP(Float.valueOf(medium2.A00()), (Object) null);
        }
        float floatValue = ((Number) r2.A00).floatValue();
        Long l2 = (Long) r2.A01;
        String str3 = medium2.A0X;
        if (CeS) {
            A012 = null;
            videoUrlImpl = new VideoUrlImpl(str3);
            str = str3;
        } else {
            A012 = C253833rU.A01(new File(str3));
            videoUrlImpl = null;
        }
        UserSession userSession = this.A02;
        1aU A003 = 1aU.A00();
        1aU A004 = 1aU.A00();
        1aU A005 = A00(str);
        1aU A006 = A00(videoUrlImpl);
        int i = 0;
        int i2 = 8;
        if (CeS) {
            i = 8;
            i2 = 0;
        }
        return new AnonymousClass77B((Uri) null, A003, A004, A005, A006, A00(A012).A0M(new C72000Oua(new C74184PqQ(this, 35))).A0C(), userSession, (AnonymousClass79H) null, (PrivacyMediaOverlayViewModel) null, (1Xj) null, (C300925yB) null, (2FW) null, (C254793t3) null, (1iA) null, (Boolean) null, (Long) null, (Long) null, l2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, floatValue, i, i2, 8, 0, CeS, true, z, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v4, resolved type: com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel} */
    /* JADX WARNING: type inference failed for: r13v6, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a0, code lost:
        if (r2.A01.C82().A0C.contains("ig_zero_rating_data_banner") == false) goto L_0x00a2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass77B A03(com.instagram.common.session.UserSession r68, X.C71039Oa5 r69, X.C254743sy r70, java.lang.Long r71, java.lang.String r72, java.lang.String r73, boolean r74) {
        /*
            r67 = this;
            r10 = 0
            r11 = r68
            X.0qQ.A0B(r11, r10)
            r7 = 1
            r1 = r69
            X.0qQ.A0B(r1, r7)
            X.1Xj r2 = r1.A02()
            if (r2 == 0) goto L_0x0170
            r4 = r70
            boolean r0 = r4 instanceof com.instagram.model.direct.DirectThreadKey
            r3 = 0
            if (r0 == 0) goto L_0x0034
            boolean r0 = r2.CeS()
            if (r0 == 0) goto L_0x016c
            java.lang.Integer r14 = X.AnonymousClass05K.A0Y
        L_0x0021:
            com.instagram.model.direct.DirectThreadKey r12 = X.C66647MaG.A03(r4)
            r13 = 0
            r16 = r10
            r17 = r10
            r15 = r10
            X.797 r2 = X.AnonymousClass796.A02(r11, r12, r13, r14, r15, r16, r17)
            X.797 r0 = X.AnonymousClass797.OPEN_ONLY
            if (r2 == r0) goto L_0x0034
            r3 = 1
        L_0x0034:
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r3)
        L_0x0038:
            java.lang.Object r0 = r1.A00
            boolean r9 = r0 instanceof X.N3S
            java.lang.String r4 = "Required value was null."
            r2 = r67
            r28 = r71
            r52 = r74
            if (r9 == 0) goto L_0x017a
            r5 = r0
            X.N3S r5 = (X.N3S) r5
            if (r5 == 0) goto L_0x0174
            java.lang.String r34 = r1.A04()
            boolean r3 = r0 instanceof X.OIP
            if (r3 == 0) goto L_0x0168
            r1 = r0
            X.OIP r1 = (X.OIP) r1
            boolean r8 = r1.A0H
            java.lang.String r6 = r1.A06
        L_0x005a:
            if (r3 == 0) goto L_0x0165
            X.OIP r0 = (X.OIP) r0
            java.lang.String r4 = r0.A05
        L_0x0060:
            X.1iA r3 = X.C70885OQc.A01(r5)
            X.1iA r0 = X.1iA.A0a
            r50 = 0
            if (r3 != r0) goto L_0x006c
            r50 = 1
        L_0x006c:
            long r0 = r5.A01
            java.lang.String r9 = r5.A07
            r13 = 0
            android.net.Uri r0 = X.OXF.A00(r9, r13, r0)
            if (r50 == 0) goto L_0x0147
            X.1aU r14 = X.1aU.A00()
            X.76f r1 = r2.A06
            java.lang.String r0 = r0.toString()
            X.0qQ.A07(r0)
            X.1aU r1 = r1.A00(r0)
            X.Lic r0 = X.C64816Lic.A00
            X.1aU r0 = r1.A0L(r0)
        L_0x008e:
            if (r50 == 0) goto L_0x00a2
            X.3kW r1 = r2.A01
            X.1R7 r1 = r1.C82()
            java.lang.String r9 = "ig_zero_rating_data_banner"
            java.util.Set r1 = r1.A0C
            boolean r1 = r1.contains(r9)
            r48 = 0
            if (r1 != 0) goto L_0x00a4
        L_0x00a2:
            r48 = 8
        L_0x00a4:
            X.76f r2 = r2.A06
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.C70885OQc.A00(r5)
            java.lang.String r1 = r1.getUrl()
            X.0qQ.A07(r1)
            X.1aU r2 = r2.A00(r1)
            X.Ovo r1 = X.C72075Ovo.A00
            X.1aU r15 = r2.A0L(r1)
            java.lang.Integer r2 = r5.A06
            java.lang.Integer r1 = r5.A03
            r45 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x00d7
            if (r1 == 0) goto L_0x00d7
            int r1 = r1.intValue()
            if (r1 != 0) goto L_0x013f
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x00cd:
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            if (r1 == 0) goto L_0x00d7
            float r45 = r1.floatValue()
        L_0x00d7:
            X.Lib r1 = X.C64815Lib.A00
            X.1aU r16 = r0.A0L(r1)
            java.lang.String r2 = r5.A0B
            java.lang.String r1 = r5.A08
            X.1aU r18 = X.1aU.A00()
            X.77B r12 = new X.77B
            r20 = r13
            r21 = r13
            r22 = r13
            r23 = r13
            r24 = r13
            r25 = r13
            r26 = r3
            r29 = r13
            r30 = r13
            r31 = r2
            r32 = r1
            r33 = r13
            r35 = r13
            r36 = r13
            r37 = r13
            r38 = r6
            r39 = r4
            r40 = r13
            r41 = r13
            r42 = r13
            r43 = r13
            r44 = r13
            r46 = r10
            r47 = r10
            r49 = r10
            r51 = r10
            r53 = r10
            r54 = r10
            r55 = r7
            r56 = r10
            r57 = r7
            r58 = r10
            r59 = r10
            r60 = r8
            r61 = r10
            r62 = r10
            r63 = r10
            r64 = r10
            r65 = r10
            r66 = r10
            r19 = r11
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)
            return r12
        L_0x013f:
            int r2 = r2.intValue()
            float r2 = (float) r2
            float r1 = (float) r1
            float r2 = r2 / r1
            goto L_0x00cd
        L_0x0147:
            X.76e r9 = r2.A05
            X.76f r1 = r9.A02
            java.lang.String r0 = r0.toString()
            X.0qQ.A07(r0)
            X.1aU r1 = r1.A00(r0)
            X.AYW r0 = new X.AYW
            r0.<init>(r9)
            X.1aU r14 = r1.A0L(r0)
            X.1aU r0 = X.1aU.A00()
            goto L_0x008e
        L_0x0165:
            r4 = 0
            goto L_0x0060
        L_0x0168:
            r8 = 0
            r6 = 0
            goto L_0x005a
        L_0x016c:
            java.lang.Integer r14 = X.AnonymousClass05K.A0N
            goto L_0x0021
        L_0x0170:
            r27 = 0
            goto L_0x0038
        L_0x0174:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x017a:
            X.1Xj r3 = r1.A02()
            if (r3 == 0) goto L_0x0262
            X.1Xj r14 = r1.A02()
            if (r14 == 0) goto L_0x025c
            java.lang.String r21 = r1.A07()
            X.2FW r15 = X.2FW.A1A
            X.1iA r17 = r14.BR7()
            java.lang.String r23 = r1.A04()
            long r11 = r1.A01()
            boolean r34 = r1.A08()
            android.content.Context r3 = r2.A00
            android.content.res.Resources r3 = r3.getResources()
            int r5 = r1.A00()
            r4 = 1
            if (r5 == r7) goto L_0x01aa
            r4 = 0
        L_0x01aa:
            r13 = 0
            if (r4 == 0) goto L_0x023b
            r38 = 0
            r4 = 2131238269(0x7f081d7d, float:1.8092812E38)
            java.lang.Integer r36 = java.lang.Integer.valueOf(r4)
            if (r3 == 0) goto L_0x01bf
            r4 = 2131964457(0x7f133229, float:1.9565696E38)
            java.lang.String r13 = r3.getString(r4)
        L_0x01bf:
            java.lang.Integer r37 = X.AnonymousClass05K.A00
            r42 = 2
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r35 = new com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel
            r39 = r38
            r40 = r13
            r41 = r38
            r43 = r10
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43)
            r13 = r35
        L_0x01d2:
            boolean r3 = r0 instanceof X.OIP
            if (r3 == 0) goto L_0x0239
            r4 = r0
            X.OIP r4 = (X.OIP) r4
            boolean r8 = r4.A0H
        L_0x01db:
            if (r3 == 0) goto L_0x0237
            r4 = r0
            X.OIP r4 = (X.OIP) r4
            java.lang.String r7 = r4.A06
        L_0x01e2:
            if (r3 == 0) goto L_0x0235
            r4 = r0
            X.OIP r4 = (X.OIP) r4
            java.lang.String r6 = r4.A05
        L_0x01e9:
            boolean r38 = r1.A09()
            if (r3 == 0) goto L_0x022f
            X.OIP r0 = (X.OIP) r0
            boolean r5 = r0.A0D
            java.lang.String r4 = r0.A0B
            java.lang.String r3 = r0.A0C
            boolean r1 = r0.A0E
            boolean r0 = r0.A0F
        L_0x01fb:
            java.lang.Long r19 = java.lang.Long.valueOf(r11)
            r16 = 0
            r22 = r72
            r29 = r73
            r12 = r2
            r18 = r27
            r20 = r28
            r24 = r16
            r25 = r6
            r26 = r7
            r27 = r4
            r28 = r3
            r30 = r52
            r31 = r10
            r32 = r10
            r33 = r9
            r35 = r10
            r36 = r8
            r37 = r10
            r39 = r5
            r40 = r1
            r41 = r0
            r42 = r10
            X.77B r12 = A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return r12
        L_0x022f:
            r5 = 0
            r4 = 0
            r3 = 0
            r1 = 0
            r0 = 0
            goto L_0x01fb
        L_0x0235:
            r6 = 0
            goto L_0x01e9
        L_0x0237:
            r7 = 0
            goto L_0x01e2
        L_0x0239:
            r8 = 0
            goto L_0x01db
        L_0x023b:
            int r4 = r1.A00()
            r3 = 100
            if (r4 != r3) goto L_0x01d2
            java.lang.Integer r37 = X.AnonymousClass05K.A01
            r36 = 0
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r13 = new com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel
            r35 = r13
            r38 = r36
            r39 = r36
            r40 = r36
            r41 = r36
            r42 = r7
            r43 = r10
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43)
            goto L_0x01d2
        L_0x025c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0262:
            java.lang.String r3 = r1.A06()
            com.instagram.common.typedurl.SimpleImageUrl r2 = new com.instagram.common.typedurl.SimpleImageUrl
            r2.<init>(r3)
            X.1aU r14 = X.1aU.A09(r2)
            X.1aU r15 = X.1aU.A09(r2)
            X.1aU r16 = X.1aU.A00()
            X.1aU r17 = X.1aU.A00()
            java.lang.String r31 = r1.A07()
            java.lang.String r32 = r1.A05()
            r13 = 0
            java.lang.String r33 = r1.A05()
            java.lang.String r34 = r1.A04()
            X.1aU r18 = X.1aU.A00()
            boolean r62 = r1.A09()
            boolean r1 = r0 instanceof X.OIP
            if (r1 == 0) goto L_0x02fc
            X.OIP r0 = (X.OIP) r0
            boolean r4 = r0.A0D
            java.lang.String r3 = r0.A0B
            java.lang.String r2 = r0.A0C
            boolean r1 = r0.A0E
            boolean r0 = r0.A0F
        L_0x02a4:
            r45 = 1065353216(0x3f800000, float:1.0)
            r47 = 8
            X.77B r12 = new X.77B
            r19 = r11
            r20 = r13
            r21 = r13
            r22 = r13
            r23 = r13
            r24 = r13
            r25 = r13
            r26 = r13
            r29 = r13
            r30 = r13
            r35 = r13
            r36 = r13
            r37 = r13
            r38 = r13
            r39 = r13
            r40 = r3
            r41 = r2
            r42 = r13
            r43 = r13
            r44 = r13
            r46 = r10
            r48 = r47
            r49 = r10
            r50 = r10
            r51 = r10
            r52 = r10
            r53 = r10
            r54 = r10
            r55 = r10
            r56 = r10
            r57 = r9
            r58 = r10
            r59 = r10
            r60 = r10
            r61 = r10
            r63 = r4
            r64 = r1
            r65 = r0
            r66 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)
            return r12
        L_0x02fc:
            r4 = 0
            r3 = 0
            r2 = 0
            r1 = 0
            r0 = 0
            goto L_0x02a4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3262876d.A03(com.instagram.common.session.UserSession, X.Oa5, X.3sy, java.lang.Long, java.lang.String, java.lang.String, boolean):X.77B");
    }

    public /* synthetic */ C3262876d(Context context, C249883kW r6, UserSession userSession) {
        C3262976e r3 = new C3262976e(userSession);
        C3263076f r2 = new C3263076f(userSession);
        C3263176g r1 = new C3263176g(userSession);
        0qQ.A0B(context, 1);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r6;
        this.A05 = r3;
        this.A06 = r2;
        this.A03 = r1;
        this.A04 = new C3263276h(context);
    }

    public static final 1aU A00(Object obj) {
        if (obj == null) {
            return 1aU.A00();
        }
        return 1aU.A09(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass77B A04(X.C254703su r66, X.C300925yB r67, java.lang.Long r68, boolean r69, boolean r70) {
        /*
            r65 = this;
            r1 = r67
            boolean r2 = r1.A05()
            r3 = r65
            r0 = r66
            r26 = r68
            r50 = r69
            r52 = r70
            if (r2 == 0) goto L_0x0142
            java.lang.String r5 = r1.A08
            if (r5 == 0) goto L_0x012a
            java.lang.String r4 = "content://com.instagram.android.tam-attachment"
            r2 = 1
            X.0qQ.A0B(r4, r2)
            boolean r53 = r5.startsWith(r4)
            if (r53 == 0) goto L_0x012c
            java.lang.String r4 = r1.A08
            com.instagram.common.typedurl.SimpleImageUrl r2 = new com.instagram.common.typedurl.SimpleImageUrl
            r2.<init>(r4)
            X.1aU r13 = X.1aU.A09(r2)
        L_0x002d:
            if (r53 == 0) goto L_0x00e0
            X.76f r4 = r3.A06
            java.lang.String r2 = r1.A04()
            X.1aU r2 = r4.A00(r2)
            X.Lid r4 = X.C64817Lid.A00
        L_0x003b:
            X.68Z r4 = (X.AnonymousClass68Z) r4
            X.1aU r15 = r2.A0L(r4)
        L_0x0041:
            com.instagram.common.session.UserSession r8 = r3.A02
            float r43 = r1.A01()
            X.1aU r12 = X.1aU.A00()
            java.lang.String r2 = r1.A04()
            X.1aU r14 = A00(r2)
            java.lang.String r7 = r0.A1u
            java.lang.String r30 = r0.A0g()
            X.2FW r6 = r0.A10
            X.1iA r5 = r1.A01
            X.3kW r2 = r3.A01
            X.1R7 r2 = r2.C82()
            java.lang.String r3 = "ig_zero_rating_data_banner"
            java.util.Set r2 = r2.A0C
            boolean r2 = r2.contains(r3)
            r46 = 8
            if (r2 == 0) goto L_0x0071
            r46 = 0
        L_0x0071:
            java.lang.String r32 = r0.A0f()
            boolean r3 = r0.A2P
            X.1aU r16 = X.1aU.A00()
            long r9 = r0.C7c()
            java.lang.String r2 = r1.A08
            boolean r0 = r0.A2G
            boolean r4 = r1.A0B
            r11 = 0
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r4)
            java.lang.Long r27 = java.lang.Long.valueOf(r9)
            r48 = 1
            r44 = 8
            r45 = 0
            X.77B r10 = new X.77B
            r18 = r11
            r19 = r11
            r20 = r11
            r23 = r11
            r24 = r5
            r28 = r11
            r29 = r7
            r31 = r11
            r33 = r11
            r34 = r2
            r35 = r11
            r36 = r11
            r37 = r11
            r38 = r11
            r39 = r11
            r40 = r11
            r41 = r11
            r42 = r11
            r47 = r45
            r49 = r48
            r51 = r3
            r54 = r45
            r55 = r0
            r56 = r45
            r57 = r45
            r58 = r45
            r59 = r45
            r60 = r45
            r61 = r45
            r62 = r45
            r63 = r45
            r64 = r45
            r21 = r1
            r22 = r6
            r17 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64)
            return r10
        L_0x00e0:
            java.lang.String r2 = r1.A04()
            boolean r2 = X.C66834MdS.A08(r2)
            if (r2 == 0) goto L_0x0108
            X.76g r5 = r3.A03
            java.lang.String r4 = r1.A04()
            boolean r2 = X.C66834MdS.A08(r4)
            if (r2 != 0) goto L_0x00fe
            X.1aU r2 = X.1aU.A00()
        L_0x00fa:
            X.Lie r4 = X.C64818Lie.A00
            goto L_0x003b
        L_0x00fe:
            X.Owi r2 = new X.Owi
            r2.<init>(r5, r4)
            X.1aU r2 = X.1aU.A06(r2)
            goto L_0x00fa
        L_0x0108:
            boolean r2 = r1.A05()
            if (r2 == 0) goto L_0x013a
            java.lang.String r4 = r1.A09
            if (r4 == 0) goto L_0x0132
            java.io.File r2 = new java.io.File
            r2.<init>(r4)
            android.net.Uri r2 = android.net.Uri.fromFile(r2)
            java.lang.String r4 = r2.toString()
            com.instagram.model.mediasize.VideoUrlImpl r2 = new com.instagram.model.mediasize.VideoUrlImpl
            r2.<init>(r4)
            X.1aU r15 = X.1aU.A09(r2)
            goto L_0x0041
        L_0x012a:
            r53 = 0
        L_0x012c:
            X.1aU r13 = X.1aU.A00()
            goto L_0x002d
        L_0x0132:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x013a:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0142:
            java.lang.String r5 = r1.A03()
            r2 = 0
            java.lang.String r4 = "content://com.instagram.android.tam-attachment"
            boolean r53 = X.00p.A0k(r5, r4, r2)
            if (r53 == 0) goto L_0x01fc
            java.lang.String r5 = r1.A03()
            com.instagram.common.typedurl.SimpleImageUrl r4 = new com.instagram.common.typedurl.SimpleImageUrl
            r4.<init>(r5)
            X.1aU r13 = X.1aU.A09(r4)
        L_0x015c:
            com.instagram.common.session.UserSession r8 = r3.A02
            float r43 = r1.A01()
            java.lang.String r4 = r1.A03()
            java.io.File r3 = new java.io.File
            r3.<init>(r4)
            r11 = 0
            r4 = -1
            android.net.Uri r3 = android.net.Uri.fromFile(r3)
            X.0qQ.A07(r3)
            com.instagram.common.typedurl.SimpleImageUrl r3 = X.C253833rU.A00(r3, r4, r4)
            X.1aU r12 = A00(r3)
            X.1aU r14 = X.1aU.A00()
            X.1aU r15 = X.1aU.A00()
            java.lang.String r7 = r0.A1u
            java.lang.String r30 = r0.A0g()
            X.2FW r6 = r0.A10
            X.1iA r4 = r1.A01
            java.lang.String r32 = r0.A0f()
            boolean r3 = r0.A2P
            X.1aU r16 = X.1aU.A00()
            long r9 = r0.C7c()
            boolean r0 = r0.A2G
            boolean r5 = r1.A0B
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r5)
            java.lang.Long r27 = java.lang.Long.valueOf(r9)
            r45 = 8
            X.77B r10 = new X.77B
            r18 = r11
            r19 = r11
            r20 = r11
            r23 = r11
            r24 = r4
            r28 = r11
            r29 = r7
            r31 = r11
            r33 = r11
            r34 = r11
            r35 = r11
            r36 = r11
            r37 = r11
            r38 = r11
            r39 = r11
            r40 = r11
            r41 = r11
            r42 = r11
            r44 = r2
            r46 = r45
            r47 = r2
            r48 = r2
            r49 = r2
            r51 = r3
            r54 = r2
            r55 = r0
            r56 = r2
            r57 = r2
            r58 = r2
            r59 = r2
            r60 = r2
            r61 = r2
            r62 = r2
            r63 = r2
            r64 = r2
            r21 = r1
            r22 = r6
            r17 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64)
            return r10
        L_0x01fc:
            X.1aU r13 = X.1aU.A00()
            goto L_0x015c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3262876d.A04(X.3su, X.5yB, java.lang.Long, boolean, boolean):X.77B");
    }

    public final AnonymousClass77B A05(C254703su r37, Long l, boolean z) {
        1Xj r7;
        String str;
        C254703su r1 = r37;
        synchronized (r1) {
            C271374ik r0 = r1.A0d;
            if (r0 != null) {
                r7 = r0.A05;
            } else {
                r7 = null;
            }
        }
        boolean z2 = z;
        if (r7 != null) {
            String str2 = r1.A1u;
            String A0g = r1.A0g();
            2FW r8 = r1.A10;
            0qQ.A07(r8);
            1iA BR7 = r7.BR7();
            String A0f = r1.A0f();
            boolean z3 = r1.A2P;
            boolean A1T = r1.A1T();
            long C7c = r1.C7c();
            return A01(this, (PrivacyMediaOverlayViewModel) null, r7, r8, (C254793t3) null, BR7, Boolean.valueOf(r1.A1S()), Long.valueOf(C7c), l, str2, A0g, A0f, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, z2, z3, A1T, r1.A2G, false, true, false, true, false, false, false, false, false);
        }
        PendingMediaStore A002 = 28K.A00(this.A02);
        C331377Qt r02 = r1.A0w;
        if (r02 != null) {
            str = r02.A03;
        } else {
            str = null;
        }
        AnonymousClass3Q2 A032 = A002.A03(str);
        if (A032 == null) {
            return null;
        }
        return A04(r1, C63326Kv9.A00(A032), r1.A1K, z2, r1.A1T());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003d, code lost:
        if (r3.A01.C82().A0C.contains("ig_zero_rating_data_banner") == false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass77B A01(X.C3262876d r59, com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r60, X.1Xj r61, X.2FW r62, X.C254793t3 r63, X.1iA r64, java.lang.Boolean r65, java.lang.Long r66, java.lang.Long r67, java.lang.String r68, java.lang.String r69, java.lang.String r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.lang.String r76, boolean r77, boolean r78, boolean r79, boolean r80, boolean r81, boolean r82, boolean r83, boolean r84, boolean r85, boolean r86, boolean r87, boolean r88, boolean r89) {
        /*
            r42 = 0
            r6 = 0
            r15 = r61
            float r38 = r15.A0l()
            X.1iA r1 = r15.BR7()
            X.1iA r0 = X.1iA.A0a
            r3 = r59
            if (r1 != r0) goto L_0x00ba
            r43 = 1
            com.instagram.common.typedurl.ImageUrl r5 = r15.A1Q()
            java.lang.String r2 = r15.A0M
            java.lang.String r1 = r15.getId()
            X.1Xy r0 = r15.A0C
            java.util.List r0 = r0.CEY()
            java.util.ArrayList r0 = X.AnonymousClass3WQ.A00(r0)
            com.instagram.model.mediasize.VideoUrlImpl r4 = X.C255583uN.A01(r1, r0)
            X.3kW r0 = r3.A01
            X.1R7 r0 = r0.C82()
            java.lang.String r1 = "ig_zero_rating_data_banner"
            java.util.Set r0 = r0.A0C
            boolean r0 = r0.contains(r1)
            r41 = 0
            if (r0 != 0) goto L_0x0041
        L_0x003f:
            r41 = 8
        L_0x0041:
            r39 = 8
            if (r5 == 0) goto L_0x0047
            r39 = 0
        L_0x0047:
            r40 = 8
            if (r43 == 0) goto L_0x004d
            r40 = 0
        L_0x004d:
            com.instagram.common.session.UserSession r12 = r3.A02
            X.1aU r7 = A00(r5)
            X.1aU r8 = A00(r5)
            X.1aU r9 = A00(r2)
            X.1aU r10 = A00(r4)
            java.lang.String r26 = r15.getId()
            X.1aU r11 = X.1aU.A00()
            X.77B r5 = new X.77B
            r57 = r87
            r56 = r86
            r19 = r64
            r20 = r65
            r22 = r66
            r21 = r67
            r24 = r68
            r25 = r69
            r27 = r70
            r30 = r71
            r17 = r62
            r58 = r88
            r18 = r63
            r59 = r89
            r14 = r60
            r32 = r72
            r31 = r73
            r33 = r74
            r34 = r75
            r36 = r76
            r45 = r77
            r46 = r78
            r47 = r79
            r50 = r80
            r51 = r81
            r52 = r82
            r53 = r83
            r54 = r84
            r55 = r85
            r13 = r6
            r16 = r6
            r23 = r6
            r28 = r6
            r29 = r6
            r35 = r6
            r37 = r6
            r44 = r42
            r48 = r42
            r49 = r42
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            return r5
        L_0x00ba:
            r43 = 0
            android.content.Context r0 = r3.A00
            com.instagram.model.mediasize.ExtendedImageUrl r5 = r15.A1n(r0)
            r4 = 0
            r2 = r6
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3262876d.A01(X.76d, com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel, X.1Xj, X.2FW, X.3t3, X.1iA, java.lang.Boolean, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):X.77B");
    }
}
