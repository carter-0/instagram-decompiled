package X;

import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.clips.audio.model.AudioPageAssetModel;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.Iterator;

public final class I6G {
    public static final I6G A00 = new Object();

    public static final void A01(1Fa r2, MusicPageTabType musicPageTabType, AudioPageAssetModel audioPageAssetModel, String str) {
        Iterator A0s = AnonymousClass7TF.A0s(A00(musicPageTabType, audioPageAssetModel, str, false, false));
        while (A0s.hasNext()) {
            C51974G9v.A1C(r2, A0s);
        }
    }

    public final 1OC A04(AudioPageAssetModel audioPageAssetModel, UserSession userSession, String str, boolean z) {
        0qQ.A0B(audioPageAssetModel, 1);
        1NY A0M = DbU.A0M(userSession);
        C51972G9s.A18(A0M, userSession, AnonymousClass93W.class);
        A0M.A0A("clips/music/");
        A0M.A04();
        if (z) {
            String A0m = AnonymousClass7TG.A0m(MusicPageTabType.CLIPS, audioPageAssetModel.A02, AnonymousClass7TE.A1A());
            if (str != null) {
                A0m = 002.A0R(A0m, str);
            }
            A0M.A0A = A0m;
            A0M.A07(AnonymousClass05K.A0N);
            A0M.A01 = 900000;
        }
        A01(A0M, (MusicPageTabType) null, audioPageAssetModel, str);
        return A0M.A0M();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (r23 != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.1GP A05(com.instagram.api.schemas.MusicPageTabType r18, com.instagram.clips.audio.model.AudioPageAssetModel r19, com.instagram.common.session.UserSession r20, java.lang.String r21, boolean r22, boolean r23, boolean r24, boolean r25) {
        /*
            r17 = this;
            r15 = 1
            r2 = 0
            r1 = 27647154(0x1a5dcb2, float:6.092811E-38)
            r0 = 0
            X.1FZ r5 = new X.1FZ
            r3 = r20
            r5.<init>(r3, r1, r15, r0)
            java.lang.String r0 = "clips/stream_clips_pivot_page/"
            r5.A0A(r0)
            r5.A04()
            java.lang.String r1 = "pivot_page_type"
            java.lang.String r0 = "audio"
            r5.A9m(r1, r0)
            com.google.gson.Gson r1 = new com.google.gson.Gson
            r1.<init>()
            r10 = r23
            if (r25 != 0) goto L_0x0028
            r0 = 0
            if (r23 == 0) goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            r6 = r18
            r7 = r19
            r8 = r21
            r4 = r24
            java.util.HashMap r0 = A00(r6, r7, r8, r4, r0)
            java.lang.String r1 = r1.A0B(r0)
            java.lang.String r0 = "music_page"
            r5.A9m(r0, r1)
            java.lang.Class<X.GVS> r14 = X.GVS.class
            X.0bH r12 = new X.0bH
            r12.<init>(r3)
            X.1NX r13 = new X.1NX
            r13.<init>(r2)
            X.1Fj r11 = new X.1Fj
            r16 = r15
            r11.<init>(r12, r13, r14, r15, r16)
            r5.A00 = r11
            r4 = r17
            r9 = r22
            r4.A02(r5, r6, r7, r8, r9, r10)
            X.1GP r0 = r5.A0M()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I6G.A05(com.instagram.api.schemas.MusicPageTabType, com.instagram.clips.audio.model.AudioPageAssetModel, com.instagram.common.session.UserSession, java.lang.String, boolean, boolean, boolean, boolean):X.1GP");
    }

    private final void A02(1Fa r5, MusicPageTabType musicPageTabType, AudioPageAssetModel audioPageAssetModel, String str, boolean z, boolean z2) {
        long j;
        String str2 = audioPageAssetModel.A02;
        if (musicPageTabType != null) {
            str2 = AnonymousClass7TG.A0m(musicPageTabType, str2, AnonymousClass7TE.A1A());
        }
        if (str != null) {
            str2 = 002.A0R(str2, str);
        }
        if (z || z2) {
            r5.A07(AnonymousClass05K.A01);
        } else {
            if (musicPageTabType == MusicPageTabType.PHOTOS) {
                j = StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS;
            } else {
                j = 900000;
            }
            r5.A07(AnonymousClass05K.A0N);
            r5.A01 = j;
        }
        r5.A0A = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r6.A00 == com.instagram.music.common.model.AudioType.MUSIC) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r2.length() == 0) goto L_0x000f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.HashMap A00(com.instagram.api.schemas.MusicPageTabType r5, com.instagram.clips.audio.model.AudioPageAssetModel r6, java.lang.String r7, boolean r8, boolean r9) {
        /*
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r2 = r6.A04
            if (r2 == 0) goto L_0x000f
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            java.lang.String r4 = "referrer_media_id"
            if (r0 != 0) goto L_0x005c
            if (r2 == 0) goto L_0x001b
            java.lang.String r0 = "music_canonical_id"
            r3.put(r0, r2)
        L_0x001b:
            java.lang.String r1 = r6.A05
            if (r1 == 0) goto L_0x0024
            java.lang.String r0 = "music_canonical_segment_id"
            r3.put(r0, r1)
        L_0x0024:
            com.instagram.music.common.model.AudioType r1 = r6.A00
            com.instagram.music.common.model.AudioType r0 = com.instagram.music.common.model.AudioType.MUSIC
            if (r1 != r0) goto L_0x0035
        L_0x002a:
            X.0eM r0 = r6.A06
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x0035
            r3.put(r4, r0)
        L_0x0035:
            if (r9 == 0) goto L_0x003e
            java.lang.String r1 = "6"
            java.lang.String r0 = "num_clips"
            r3.put(r0, r1)
        L_0x003e:
            if (r7 == 0) goto L_0x0045
            java.lang.String r0 = "max_id"
            r3.put(r0, r7)
        L_0x0045:
            if (r5 == 0) goto L_0x0050
            java.lang.String r1 = r5.A00
            if (r1 == 0) goto L_0x0050
            java.lang.String r0 = "tab_type"
            r3.put(r0, r1)
        L_0x0050:
            if (r8 == 0) goto L_0x005b
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "enable_chunk_streaming"
            r3.put(r0, r1)
        L_0x005b:
            return r3
        L_0x005c:
            java.lang.String r2 = r6.A01
            com.instagram.music.common.model.AudioType r1 = r6.A00
            com.instagram.music.common.model.AudioType r0 = com.instagram.music.common.model.AudioType.MUSIC
            if (r1 != r0) goto L_0x006f
            java.lang.String r0 = "audio_asset_id"
            r3.put(r0, r2)
            java.lang.String r0 = "audio_cluster_id"
            r3.put(r0, r2)
            goto L_0x002a
        L_0x006f:
            com.instagram.music.common.model.AudioType r0 = com.instagram.music.common.model.AudioType.ORIGINAL_AUDIO
            if (r1 != r0) goto L_0x0035
            r0 = 3707(0xe7b, float:5.195E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.put(r0, r2)
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I6G.A00(com.instagram.api.schemas.MusicPageTabType, com.instagram.clips.audio.model.AudioPageAssetModel, java.lang.String, boolean, boolean):java.util.HashMap");
    }

    public final 1OC A03(MusicPageTabType musicPageTabType, AudioPageAssetModel audioPageAssetModel, UserSession userSession, String str, boolean z, boolean z2) {
        1NY A0M = DbU.A0M(userSession);
        A0M.A0A("clips/music/");
        A0M.A04();
        C51972G9s.A18(A0M, userSession, GVS.class);
        A02(A0M, musicPageTabType, audioPageAssetModel, str, z, z2);
        A01(A0M, musicPageTabType, audioPageAssetModel, str);
        return A0M.A0M();
    }
}
