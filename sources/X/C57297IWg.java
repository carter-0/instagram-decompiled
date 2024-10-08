package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IWg  reason: case insensitive filesystem */
public final class C57297IWg implements G6H {
    public final AnonymousClass4DH A00;
    public final UserSession A01;

    public C57297IWg(AnonymousClass4DH r2, UserSession userSession) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = userSession;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CI0(android.net.Uri r25, android.os.Bundle r26) {
        /*
            r24 = this;
            r2 = 0
            r6 = r25
            X.0qQ.A0B(r6, r2)
            X.28D r4 = X.28D.A48
            java.util.Set r0 = r6.getQueryParameterNames()
            java.lang.String r10 = "prompt_sticker_id"
            boolean r0 = r0.contains(r10)
            if (r0 == 0) goto L_0x0016
            X.28D r4 = X.28D.A22
        L_0x0016:
            r5 = r24
            com.instagram.common.session.UserSession r7 = r5.A01
            X.Hrt r1 = X.C250563lf.A0C(r4)
            java.lang.String r0 = "caption"
            java.lang.String r8 = r6.getQueryParameter(r0)
            java.lang.String r0 = "hashtag"
            java.lang.String r9 = r6.getQueryParameter(r0)
            r0 = 1
            if (r8 == 0) goto L_0x00fb
            boolean r3 = X.C51966G9m.A1X(r8)
            if (r3 != r0) goto L_0x00fb
        L_0x0033:
            X.0qQ.A0B(r8, r2)
            r1.A0b = r8
        L_0x0038:
            java.lang.String r3 = "effect_id"
            java.lang.String r3 = r6.getQueryParameter(r3)
            if (r3 == 0) goto L_0x0048
            boolean r8 = X.C51966G9m.A1X(r3)
            if (r8 != r0) goto L_0x0048
            r1.A0Q = r3
        L_0x0048:
            java.lang.String r8 = "camera_tool"
            java.lang.String r9 = r6.getQueryParameter(r8)
            if (r9 == 0) goto L_0x0058
            boolean r8 = X.C51966G9m.A1X(r9)
            if (r8 != r0) goto L_0x0058
            r1.A0L = r9
        L_0x0058:
            java.util.Set r8 = r6.getQueryParameterNames()
            boolean r8 = r8.contains(r10)
            if (r8 == 0) goto L_0x008d
            java.lang.String r13 = r6.getQueryParameter(r10)
            if (r13 != 0) goto L_0x006a
            java.lang.String r13 = ""
        L_0x006a:
            r9 = 0
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            com.instagram.user.model.User r11 = X.DbT.A0j(r7)
            java.lang.String r14 = ""
            X.0sn r18 = X.0sn.A00
            com.instagram.api.schemas.StoryPromptType r10 = com.instagram.api.schemas.StoryPromptType.DEFAULT
            com.instagram.reels.prompt.model.PromptStickerModel r8 = new com.instagram.reels.prompt.model.PromptStickerModel
            r15 = r9
            r16 = r9
            r17 = r9
            r20 = r2
            r22 = r2
            r23 = r2
            r19 = r2
            r21 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1.A0C = r8
        L_0x008d:
            java.lang.String r8 = "show_prompt"
            boolean r16 = r6.getBooleanQueryParameter(r8, r2)
            java.lang.String r8 = "audio_id"
            java.lang.String r14 = r6.getQueryParameter(r8)
            if (r14 == 0) goto L_0x010d
            boolean r6 = X.C51966G9m.A1X(r14)
            if (r6 != r0) goto L_0x010d
            X.4DH r8 = r5.A00
            android.content.Context r10 = r8.getContext()
            if (r10 == 0) goto L_0x00fa
            com.instagram.clips.model.metadata.AudioPageMetadata r6 = X.LT9.A06(r14)
            java.lang.String r9 = r6.A0C
            if (r9 == 0) goto L_0x010d
            com.instagram.music.common.model.AudioType r18 = com.instagram.music.common.model.AudioType.MUSIC
            r6 = 0
            com.instagram.clips.audio.model.AudioPageAssetModel r17 = new com.instagram.clips.audio.model.AudioPageAssetModel
            r21 = r6
            r22 = r6
            r19 = r9
            r20 = r6
            r17.<init>(r18, r19, r20, r21, r22)
            X.IMY r9 = new X.IMY
            r11 = r4
            r12 = r5
            r13 = r1
            r15 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r1 = "ClipsCameraActionHandler"
            X.0xG r18 = X.DbS.A0O(r1)
            X.0gy r3 = X.AnonymousClass07i.A00(r8)
            com.instagram.api.schemas.MusicPageTabType r12 = com.instagram.api.schemas.MusicPageTabType.CLIPS
            r1 = 5
            X.0qQ.A0B(r3, r1)
            X.IMb r11 = new X.IMb
            r13 = r17
            r14 = r2
            r15 = r0
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            X.H37 r1 = new X.H37
            r14 = r1
            r15 = r10
            r16 = r3
            r17 = r11
            r19 = r7
            r14.<init>(r15, r16, r17, r18, r19)
            r1.A03(r9)
            X.0sn r0 = X.0sn.A00
            r1.A04(r6, r6, r0, r2)
        L_0x00fa:
            return
        L_0x00fb:
            if (r9 == 0) goto L_0x0038
            boolean r3 = X.C51966G9m.A1X(r9)
            if (r3 != r0) goto L_0x0038
            r8 = 35
            r3 = 32
            java.lang.String r8 = X.002.A0E(r9, r8, r3)
            goto L_0x0033
        L_0x010d:
            A00(r4, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57297IWg.CI0(android.net.Uri, android.os.Bundle):void");
    }

    public static final void A00(28D r4, C57297IWg iWg, C56044Hrt hrt) {
        AnonymousClass4DH r3 = iWg.A00;
        I3M.A00(r3.requireActivity(), hrt.A00(), r3, r4, iWg.A01);
    }
}
