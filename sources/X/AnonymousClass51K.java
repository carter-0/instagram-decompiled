package X;

/* renamed from: X.51K  reason: invalid class name */
public abstract class AnonymousClass51K {
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r1 = new java.io.IOException("failed to parse SerializableIgClipSegmentList");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass51W parseFromJson(X.16F r11) {
        /*
            r0 = 0
            X.0qQ.A0B(r11, r0)
            X.16L r0 = r11.A11()     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            X.16L r2 = X.16L.A0D     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            r5 = 0
            if (r0 == r2) goto L_0x0011
            r11.A0z()     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            return r5
        L_0x0011:
            r9 = r5
            r7 = r5
            r8 = r5
            r6 = r5
            r10 = r5
        L_0x0016:
            X.16L r0 = r11.A1J()     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            X.16L r3 = X.16L.A09     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            java.lang.String r1 = "ClipsStitchingParams"
            java.lang.String r4 = "serializable_ig_clip_segments"
            if (r0 == r3) goto L_0x00d2
            java.lang.String r1 = r11.A0q()     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            r11.A1J()     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            boolean r0 = r4.equals(r1)     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            if (r0 == 0) goto L_0x007f
            X.16L r1 = r11.A11()     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            if (r1 != r0) goto L_0x007d
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            r9.<init>()     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
        L_0x003c:
            X.16L r1 = r11.A1J()     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            if (r1 == r0) goto L_0x008b
            X.16L r0 = r11.A11()     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            if (r0 != r2) goto L_0x00e4
            r1 = 0
        L_0x004b:
            X.16L r0 = r11.A1J()     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            if (r0 == r3) goto L_0x0077
            java.lang.String r1 = r11.A0q()     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            X.0qQ.A07(r1)     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            r11.A1J()     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            java.lang.String r0 = "VIDEO"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            if (r0 == 0) goto L_0x0072
            X.51M r0 = X.AnonymousClass51L.parseFromJson(r11)     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
        L_0x0067:
            X.0qQ.A07(r0)     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            X.51N r0 = (X.AnonymousClass51N) r0     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            X.9IE r1 = new X.9IE     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            r1.<init>((X.AnonymousClass51N) r0)     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            goto L_0x004b
        L_0x0072:
            X.KN4 r0 = X.LIN.parseFromJson(r11)     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            goto L_0x0067
        L_0x0077:
            if (r1 == 0) goto L_0x003c
            r9.add(r1)     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            goto L_0x003c
        L_0x007d:
            r9 = r5
            goto L_0x008b
        L_0x007f:
            java.lang.String r0 = "audio_track_overlay"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            if (r0 == 0) goto L_0x008f
            X.51I r7 = X.AnonymousClass51H.parseFromJson(r11)     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
        L_0x008b:
            r11.A0z()     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            goto L_0x0016
        L_0x008f:
            java.lang.String r0 = "media_audio_overlay_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            if (r0 == 0) goto L_0x009c
            X.3QS r8 = X.AnonymousClass3RJ.parseFromJson(r11)     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            goto L_0x008b
        L_0x009c:
            java.lang.String r0 = "bleep_map"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            if (r0 == 0) goto L_0x00a9
            X.9IV r6 = X.AnonymousClass51V.parseFromJson(r11)     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            goto L_0x008b
        L_0x00a9:
            java.lang.String r0 = "audio_effects"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            if (r0 == 0) goto L_0x008b
            X.16L r1 = r11.A11()     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            if (r1 != r0) goto L_0x00d0
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            r10.<init>()     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
        L_0x00be:
            X.16L r1 = r11.A1J()     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            if (r1 == r0) goto L_0x008b
            X.55O r0 = X.AnonymousClass55N.parseFromJson(r11)     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            if (r0 == 0) goto L_0x00be
            r10.add(r0)     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            goto L_0x00be
        L_0x00d0:
            r10 = r5
            goto L_0x008b
        L_0x00d2:
            if (r9 != 0) goto L_0x00ec
            boolean r0 = r11 instanceof X.0c9     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            if (r0 == 0) goto L_0x00ec
            X.0c9 r11 = (X.0c9) r11     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            X.0LH r0 = r11.A03     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            r0.A00(r4, r1)     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x00eb
        L_0x00e4:
            java.lang.String r0 = "failed to parse SerializableIgClipSegmentList"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
        L_0x00eb:
            throw r1     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
        L_0x00ec:
            X.51W r5 = new X.51W     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x00f9, Exception -> 0x00f2 }
            return r5
        L_0x00f2:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00f9:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass51K.parseFromJson(X.16F):X.51W");
    }
}
