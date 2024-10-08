package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;

/* renamed from: X.Lc0  reason: case insensitive filesystem */
public final class C64445Lc0 implements MediaEffect {
    public final AnonymousClass3Q2 A00;
    public final boolean A01;

    public final void FJP(MediaEffect mediaEffect) {
    }

    public final boolean CRh() {
        return AnonymousClass7TE.A1b(this.A00.A4Y);
    }

    public final boolean Esg() {
        return this.A01;
    }

    public C64445Lc0(AnonymousClass3Q2 r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r4.A1N.A0H == false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject F00() {
        /*
            r5 = this;
            org.json.JSONObject r2 = X.DbS.A11()
            java.lang.String r1 = "class"
            java.lang.String r0 = "PendingMediaEffect"
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x000b }
        L_0x000b:
            X.3Q2 r4 = r5.A00
            java.lang.String r0 = r4.A2k
            if (r0 == 0) goto L_0x001c
            boolean r0 = X.JTQ.A1Z(r0)
        L_0x0015:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "hasImageOverlay"
            goto L_0x001e
        L_0x001c:
            r0 = 0
            goto L_0x0015
        L_0x001e:
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0021 }
        L_0x0021:
            boolean r0 = r4.A57
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "hasDynamicSticker"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x002c }
        L_0x002c:
            com.instagram.pendingmedia.model.ClipInfo r1 = r4.A1N
            com.instagram.pendingmedia.model.ClipInfo r0 = X.C376399Hv.A00()
            if (r1 == r0) goto L_0x003b
            com.instagram.pendingmedia.model.ClipInfo r0 = r4.A1N
            boolean r1 = r0.A0H
            r0 = 1
            if (r1 != 0) goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "hasTrimEdits"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0045 }
        L_0x0045:
            boolean r0 = r4.A5j
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "isPhotoToVideo"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0050 }
        L_0x0050:
            boolean r0 = r4.A5L
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "isCoverFrameEdited"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x005b }
        L_0x005b:
            boolean r0 = r4.A5M
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "isCoverFromCustomPhoto"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0066 }
        L_0x0066:
            boolean r0 = X.C59911Jba.A00(r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "hasMusicOverlay"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0073 }
        L_0x0073:
            boolean r0 = r4.A5I
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "isClipsEdited"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x007e }
        L_0x007e:
            boolean r0 = r4.A5G
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "isBoomerangV2"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0089 }
        L_0x0089:
            boolean r0 = r4.A5u
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "isStackMedia"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0094 }
        L_0x0094:
            boolean r0 = r4.A61
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "useSingleTranscode"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x009f }
        L_0x009f:
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r0 = r4.A16
            if (r0 != 0) goto L_0x00ab
            r0 = 0
        L_0x00a4:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "hasPinchToZoom"
            goto L_0x00b4
        L_0x00ab:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r0 = r0.A08
            boolean r0 = r0.A01()
            r0 = r0 ^ 1
            goto L_0x00a4
        L_0x00b4:
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x00b7 }
        L_0x00b7:
            X.51W r0 = r4.A1P
            r3 = 0
            if (r0 == 0) goto L_0x00ca
            java.util.List r0 = r0.A01()
            if (r0 == 0) goto L_0x00ca
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L_0x00ca
            r3 = 1
        L_0x00ca:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "isStitchedVideo"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x00d3 }
        L_0x00d3:
            boolean r0 = r4.A5W
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "isFromStoryDrafts"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x00de }
        L_0x00de:
            X.1iA r1 = r4.A1G
            java.lang.String r0 = "mediaType"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x00e5 }
        L_0x00e5:
            java.lang.String r1 = r4.A3C
            java.lang.String r0 = "navigationChain"
            if (r1 == 0) goto L_0x00ee
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x00ee }
        L_0x00ee:
            boolean r0 = r4.A5F
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "isAudioMuted"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x00f9 }
        L_0x00f9:
            java.lang.String r1 = r4.A2V
            java.lang.String r0 = "cameraCaptureType"
            if (r1 == 0) goto L_0x0102
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0102 }
        L_0x0102:
            java.lang.String r1 = r4.A2h
            java.lang.String r0 = "creationSurface"
            if (r1 == 0) goto L_0x010b
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x010b }
        L_0x010b:
            java.lang.String r1 = r4.A2Y
            java.lang.String r0 = "canvasModeFormat"
            if (r1 == 0) goto L_0x0114
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0114 }
        L_0x0114:
            java.lang.String r0 = r4.A2o
            r3 = 1
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "hasPrecaptureAREffects"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0124 }
        L_0x0124:
            com.instagram.camera.effect.models.CameraAREffect r0 = r4.A10
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "hasPostcaptureAREffects"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0133 }
        L_0x0133:
            X.4nL r0 = r4.A1a
            if (r0 == 0) goto L_0x0142
            java.lang.Integer r0 = r0.A0P
            if (r0 == 0) goto L_0x0142
        L_0x013b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "hasColorFilter"
            goto L_0x0144
        L_0x0142:
            r3 = 0
            goto L_0x013b
        L_0x0144:
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0147 }
        L_0x0147:
            boolean r0 = r4.A5x
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "isLandscape"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0152 }
        L_0x0152:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64445Lc0.F00():org.json.JSONObject");
    }
}
