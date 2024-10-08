package X;

import android.graphics.RectF;
import android.os.Bundle;

/* renamed from: X.9r8  reason: invalid class name and case insensitive filesystem */
public final class C390349r8 extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelAttributionQuickCameraFragment";
    public RectF A00;
    public final C41837B2s A01 = new WUP(this, 17);

    public final String getModuleName() {
        return C273654mx.A00(236);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0254, code lost:
        if (r10 == X.28D.A0W) goto L_0x0256;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass80D A02(android.view.ViewGroup r38) {
        /*
            r37 = this;
            r3 = r37
            android.os.Bundle r2 = r3.requireArguments()
            java.lang.String r0 = "effect_id"
            java.lang.String r33 = r2.getString(r0)
            java.lang.String r0 = "effect_cryptohash"
            java.lang.String r34 = r2.getString(r0)
            java.lang.String r0 = "effect_revision_id"
            java.lang.String r35 = r2.getString(r0)
            java.lang.String r0 = "effect_persisted_metadata"
            java.lang.String r36 = r2.getString(r0)
            r0 = 1385(0x569, float:1.941E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r2.getString(r0)
            if (r0 == 0) goto L_0x016b
            com.instagram.api.schemas.CameraTool r5 = X.C2807253k.A00(r0)
            r0 = 614(0x266, float:8.6E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r7 = r2.getString(r0)
            r0 = 1384(0x568, float:1.94E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r8 = r2.getString(r0)
            r0 = 3189(0xc75, float:4.469E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r9 = r2.getString(r0)
            r0 = 3190(0xc76, float:4.47E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r10 = r2.getString(r0)
            r0 = 3191(0xc77, float:4.472E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r11 = r2.getString(r0)
            java.lang.String r0 = "gen_ai_tool_info_topic"
            java.lang.String r13 = r2.getString(r0)
            r6 = 0
            com.instagram.api.schemas.GenAIToolInfoDict r30 = new com.instagram.api.schemas.GenAIToolInfoDict
            r4 = r30
            r12 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x006f:
            r0 = 178(0xb2, float:2.5E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            android.os.Parcelable r4 = r2.getParcelable(r0)
            java.lang.Class<com.instagram.api.schemas.StoryPromptTappableData> r1 = com.instagram.api.schemas.StoryPromptTappableData.class
            android.os.Parcelable$Creator r0 = com.instagram.api.schemas.StoryPromptTappableData.CREATOR
            java.lang.Object r13 = X.0B0.A01(r0, r4, r1)
            com.instagram.api.schemas.StoryPromptTappableData r13 = (com.instagram.api.schemas.StoryPromptTappableData) r13
            r0 = 1386(0x56a, float:1.942E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r29 = r2.getBoolean(r0)
            r0 = 12
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.Object r28 = r2.get(r0)
            r0 = r28
            X.Kit r0 = (X.C62622Kit) r0
            r28 = r0
            r0 = 22
            java.lang.String r0 = X.C273654mx.A00(r0)
            android.os.Parcelable r12 = r2.getParcelable(r0)
            com.instagram.creation.cameraconfiguration.CameraConfiguration r12 = (com.instagram.creation.cameraconfiguration.CameraConfiguration) r12
            r0 = 593(0x251, float:8.31E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r11 = 0
            boolean r27 = r2.getBoolean(r0, r11)
            r0 = 5056(0x13c0, float:7.085E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r26 = r2.getBoolean(r0, r11)
            X.28D r10 = X.28D.A5J
            r1 = r10
            java.lang.String r4 = "camera_entry_point"
            java.lang.Object r0 = r2.get(r4)
            boolean r0 = r0 instanceof X.28D
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r10 = r2.get(r4)
            X.28D r10 = (X.28D) r10
        L_0x00d1:
            r0 = 2124(0x84c, float:2.976E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r25 = r2.getString(r0)
            r0 = 591(0x24f, float:8.28E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r24 = r2.getString(r0)
            r0 = 2126(0x84e, float:2.979E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.util.ArrayList r23 = r2.getStringArrayList(r0)
            r0 = 387(0x183, float:5.42E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r22 = r2.getString(r0)
            r0 = 2753(0xac1, float:3.858E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r21 = r2.getBoolean(r0, r11)
            r0 = 4034(0xfc2, float:5.653E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r20 = r2.getParcelable(r0)
            r0 = r20
            com.instagram.creation.capture.quickcapture.model.FundraiserSharedToLive r0 = (com.instagram.creation.capture.quickcapture.model.FundraiserSharedToLive) r0
            r20 = r0
            r0 = 1368(0x558, float:1.917E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.util.ArrayList r19 = r2.getParcelableArrayList(r0)
            java.lang.String r0 = "music_attribution_config"
            android.os.Parcelable r18 = r2.getParcelable(r0)
            r0 = r18
            com.instagram.music.common.config.MusicAttributionConfig r0 = (com.instagram.music.common.config.MusicAttributionConfig) r0
            r18 = r0
            r0 = 3044(0xbe4, float:4.266E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.io.Serializable r17 = r2.getSerializable(r0)
            r0 = r17
            X.84B r0 = (X.AnonymousClass84B) r0
            r17 = r0
            if (r10 == r1) goto L_0x0168
            r8 = r10
        L_0x013c:
            X.28D r0 = X.28D.A2X
            if (r8 == r0) goto L_0x014c
            X.28D r0 = X.28D.A3v
            if (r8 == r0) goto L_0x014c
            X.28D r0 = X.28D.A2E
            if (r8 == r0) goto L_0x014c
            X.28D r0 = X.28D.A4F
            if (r8 != r0) goto L_0x0166
        L_0x014c:
            if (r12 == 0) goto L_0x0158
            java.util.Set r1 = r12.A04
            X.8aL r0 = X.C358088aL.A0T
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0166
        L_0x0158:
            r9 = 1
        L_0x0159:
            r0 = 574(0x23e, float:8.04E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x018b
            goto L_0x016f
        L_0x0166:
            r9 = 0
            goto L_0x0159
        L_0x0168:
            X.28D r8 = X.28D.A4f
            goto L_0x013c
        L_0x016b:
            r30 = 0
            goto L_0x006f
        L_0x016f:
            com.instagram.common.session.UserSession r4 = r3.A00     // Catch:{ IOException -> 0x0183 }
            java.lang.String r1 = r2.getString(r1)     // Catch:{ IOException -> 0x0183 }
            r1.getClass()     // Catch:{ IOException -> 0x0183 }
            X.0c5 r0 = X.0c9.A04     // Catch:{ IOException -> 0x0183 }
            X.0c9 r0 = r0.A01(r4, r1)     // Catch:{ IOException -> 0x0183 }
            X.87G r16 = X.D0Y.parseFromJson(r0)     // Catch:{ IOException -> 0x0183 }
            goto L_0x018d
        L_0x0183:
            r4 = move-exception
            java.lang.String r1 = "deserialize_create_mode_attribution"
            java.lang.String r0 = "Failed to deserialize canvasAttributionElement"
            X.0wb.A06(r1, r0, r4)
        L_0x018b:
            r16 = 0
        L_0x018d:
            if (r29 == 0) goto L_0x02f5
            com.instagram.common.session.UserSession r5 = r3.A00
            X.0qQ.A0B(r5, r11)
            X.0Tu r4 = X.0Tu.A05
            r0 = 36319918494129906(0x8108c6001d1ef2, double:3.032200932036246E-306)
            boolean r15 = X.182.A06(r4, r5, r0)
        L_0x019f:
            r0 = 31
            java.lang.String r0 = X.C273654mx.A00(r0)
            android.os.Parcelable r14 = r2.getParcelable(r0)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r14 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r14
            r0 = 175(0xaf, float:2.45E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x01bf
            java.io.Serializable r7 = r2.getSerializable(r1)
            X.80E r7 = (X.AnonymousClass80E) r7
            if (r7 != 0) goto L_0x01c1
        L_0x01bf:
            X.80E r7 = X.AnonymousClass80E.ALL
        L_0x01c1:
            X.80D r6 = X.AnonymousClass80D.A00()
            X.B2s r0 = r3.A01
            X.AnonymousClass80D.A0D(r6, r0, r3)
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            X.9QA r1 = X.AnonymousClass9QA.A00
            r0.add(r1)
            if (r27 != 0) goto L_0x01e6
            if (r9 != 0) goto L_0x01e6
            X.80N r1 = X.AnonymousClass80N.A00
            r0.add(r1)
            X.80L r1 = X.AnonymousClass80L.A00
            r0.add(r1)
            X.8jC r1 = X.C363138jC.A00
            r0.add(r1)
        L_0x01e6:
            X.80I r1 = X.AnonymousClass80H.A02
            X.80H r0 = r1.A02(r0)
            r0.getClass()
            r6.A0W = r0
            r5 = 1
            r6.A3h = r5
            X.2k2 r0 = r3.volumeKeyPressController
            r6.A0R = r0
            X.80C r0 = r3.A02
            r0.getClass()
            r6.A0t = r0
            r27 = r38
            r27.getClass()
            r0 = r27
            r6.A09 = r0
            r6.A0B = r8
            r6.A0O = r3
            r0 = r25
            r6.A2Q = r0
            r0 = r24
            r6.A2g = r0
            r6.A3F = r5
            android.graphics.RectF r0 = r3.A00
            r1 = r0
            r0 = r26 ^ 1
            r4 = r26
            X.AnonymousClass80D.A04(r1, r6, r4, r0)
            r6.A3H = r5
            r6.A47 = r5
            X.AnonymousClass80D.A0B(r6)
            r0 = r18
            r6.A1N = r0
            r6.A3k = r9
            r0 = 2754(0xac2, float:3.859E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.getBoolean(r0, r5)
            r6.A44 = r0
            r6.A3Q = r15
            r0 = r16
            r6.A0N = r0
            r0 = r21
            r6.A41 = r0
            r6.A3f = r5
            r0 = r20
            r6.A0v = r0
            r6.A0y = r7
            r6.A3g = r5
            X.28D r0 = X.28D.A0V
            if (r10 == r0) goto L_0x0256
            X.28D r1 = X.28D.A0W
            r0 = 0
            if (r10 != r1) goto L_0x0257
        L_0x0256:
            r0 = 1
        L_0x0257:
            r6.A3N = r0
            r0 = r22
            r6.A2p = r0
            r0 = r29
            r6.A3R = r0
            r0 = r30
            r6.A0I = r0
            r1 = 0
            if (r30 == 0) goto L_0x0271
            com.instagram.api.schemas.CameraTool r0 = r0.A00
            int r0 = r0.ordinal()
            switch(r0) {
                case 15: goto L_0x02e5;
                case 65: goto L_0x02eb;
                case 68: goto L_0x02f1;
                case 70: goto L_0x02ee;
                case 115: goto L_0x02e2;
                case 186: goto L_0x02e8;
                default: goto L_0x0271;
            }
        L_0x0271:
            r6.A0X = r1
            X.57C r0 = X.AnonymousClass57C.STORY_ATTRIBUTION
            r6.A0A = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r29)
            r6.A21 = r0
            r0 = r29 ^ 1
            r6.A3G = r0
            r0 = r19
            r6.A30 = r0
            r6.A1S = r14
            if (r23 == 0) goto L_0x0293
            boolean r0 = r23.isEmpty()
            if (r0 != 0) goto L_0x0293
            r0 = r23
            r6.A2y = r0
        L_0x0293:
            X.28D r0 = X.28D.A50
            if (r8 == r0) goto L_0x029b
            X.28D r0 = X.28D.A51
            if (r8 != r0) goto L_0x02a5
        L_0x029b:
            r2 = 0
            X.AVK r1 = new X.AVK
            r0 = r27
            r1.<init>(r0, r2)
            r6.A0d = r1
        L_0x02a5:
            X.28D r0 = X.28D.A4n
            if (r8 != r0) goto L_0x02ab
            r6.A3y = r5
        L_0x02ab:
            if (r13 == 0) goto L_0x02b4
            com.instagram.reels.prompt.model.PromptStickerModel r0 = new com.instagram.reels.prompt.model.PromptStickerModel
            r0.<init>(r13)
            r6.A1h = r0
        L_0x02b4:
            r29 = r17
            r30 = r12
            r31 = r6
            r32 = r28
            X.C39605A1v.A00(r29, r30, r31, r32, r33, r34, r35, r36)
            android.os.Bundle r1 = r3.requireArguments()
            r0 = 3743(0xe9f, float:5.245E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x02e1
            java.io.File r0 = X.AnonymousClass7TE.A0t(r0)
            X.0qQ.A0B(r0, r11)
            com.instagram.common.gallery.Medium r1 = X.C282665Eg.A03(r0, r5, r11)
            r0 = 0
            r6.A0P = r1
            r6.A0w = r0
            r6.A3y = r5
        L_0x02e1:
            return r6
        L_0x02e2:
            X.8aL r1 = X.C358088aL.A0m
            goto L_0x0271
        L_0x02e5:
            X.8aL r1 = X.C358088aL.A0A
            goto L_0x0271
        L_0x02e8:
            X.8aL r1 = X.C358088aL.A11
            goto L_0x0271
        L_0x02eb:
            X.8aL r1 = X.C358088aL.A0O
            goto L_0x0271
        L_0x02ee:
            X.8aL r1 = X.C358088aL.A0S
            goto L_0x0271
        L_0x02f1:
            X.8aL r1 = X.C358088aL.A0Q
            goto L_0x0271
        L_0x02f5:
            r15 = 0
            if (r9 != 0) goto L_0x019f
            r15 = 1
            goto L_0x019f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C390349r8.A02(android.view.ViewGroup):X.80D");
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(895652074);
        super.onCreate(bundle);
        this.A00 = (RectF) requireArguments().getParcelable("camera_entry_bounds");
        AnonymousClass0fD.A09(-1679637421, A02);
    }
}
