package X;

import com.instagram.clips.audio.soundsync.repository.data.SoundSyncSuggestedAudioNetworkDataSource;

/* renamed from: X.LBu  reason: case insensitive filesystem */
public final class C63910LBu {
    public final SoundSyncSuggestedAudioNetworkDataSource A00;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.JUG, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.util.Map r14, X.AnonymousClass4D7 r15, int r16) {
        /*
            r13 = this;
            com.instagram.clips.audio.soundsync.repository.data.SoundSyncSuggestedAudioNetworkDataSource r6 = r13.A00
            r4 = 20
            boolean r0 = X.JUG.A03(r4, r15)
            if (r0 == 0) goto L_0x0109
            r3 = r15
            X.JUG r3 = (X.JUG) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0109
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0018:
            java.lang.Object r1 = r3.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r3.A00
            r5 = 1
            if (r0 == 0) goto L_0x004e
            if (r0 != r5) goto L_0x0114
            X.0eS.A00(r1)
        L_0x0026:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0034
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x010f
            X.5sO r1 = X.DbU.A0f()
        L_0x0034:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0045
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.CGK r0 = (X.CGK) r0
            java.util.List r0 = r0.A00
            X.3Ih r1 = X.C41845B3m.A0d(r0)
        L_0x0044:
            return r1
        L_0x0045:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0044
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x004e:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r2 = r6.A00
            X.1NY r6 = X.AnonymousClass7TG.A0a(r2)
            java.lang.String r1 = "music/clips_sound_sync_audio_suggestions/"
            r6.A0A(r1)
            java.lang.String r0 = "number_to_fetch"
            r7 = r16
            r6.A0C(r0, r7)
            java.lang.String r0 = X.002.A0O(r1, r7)
            r6.A0A = r0
            r6.A03()
            java.lang.Class<X.D1z> r0 = X.C45700D1z.class
            X.C51972G9s.A18(r6, r2, r0)
            if (r14 == 0) goto L_0x00f9
            java.io.StringWriter r2 = X.JTO.A0v()     // Catch:{ IOException -> 0x00f1 }
            android.util.JsonWriter r7 = new android.util.JsonWriter     // Catch:{ IOException -> 0x00f1 }
            r7.<init>(r2)     // Catch:{ IOException -> 0x00f1 }
            r7.beginArray()     // Catch:{ IOException -> 0x00f1 }
            java.util.Iterator r12 = X.AnonymousClass7TF.A0u(r14)     // Catch:{ IOException -> 0x00f1 }
        L_0x0083:
            boolean r0 = r12.hasNext()     // Catch:{ IOException -> 0x00f1 }
            if (r0 == 0) goto L_0x00e1
            java.util.Map$Entry r11 = X.AnonymousClass7TE.A1J(r12)     // Catch:{ IOException -> 0x00f1 }
            java.lang.Object r0 = r11.getValue()     // Catch:{ IOException -> 0x00f1 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ IOException -> 0x00f1 }
            java.util.Iterator r10 = X.AnonymousClass7TF.A0u(r0)     // Catch:{ IOException -> 0x00f1 }
        L_0x0097:
            boolean r0 = r10.hasNext()     // Catch:{ IOException -> 0x00f1 }
            if (r0 == 0) goto L_0x0083
            java.util.Map$Entry r9 = X.AnonymousClass7TE.A1J(r10)     // Catch:{ IOException -> 0x00f1 }
            r7.beginObject()     // Catch:{ IOException -> 0x00f1 }
            java.lang.Object r0 = r11.getKey()     // Catch:{ IOException -> 0x00f1 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ IOException -> 0x00f1 }
            int r0 = r0.length()     // Catch:{ IOException -> 0x00f1 }
            if (r0 != 0) goto L_0x00d6
            java.lang.String r8 = ""
        L_0x00b2:
            java.lang.String r0 = "concept"
            android.util.JsonWriter r1 = r7.name(r0)     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r0 = X.DbT.A13(r9)     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r0 = X.002.A0R(r8, r0)     // Catch:{ IOException -> 0x00f1 }
            r1.value(r0)     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r0 = "score"
            android.util.JsonWriter r1 = r7.name(r0)     // Catch:{ IOException -> 0x00f1 }
            java.lang.Object r0 = r9.getValue()     // Catch:{ IOException -> 0x00f1 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IOException -> 0x00f1 }
            r1.value(r0)     // Catch:{ IOException -> 0x00f1 }
            r7.endObject()     // Catch:{ IOException -> 0x00f1 }
            goto L_0x0097
        L_0x00d6:
            java.lang.String r1 = X.DbT.A13(r11)     // Catch:{ IOException -> 0x00f1 }
            r0 = 95
            java.lang.String r8 = X.002.A0C(r1, r0)     // Catch:{ IOException -> 0x00f1 }
            goto L_0x00b2
        L_0x00e1:
            r7.endArray()     // Catch:{ IOException -> 0x00f1 }
            r7.close()     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r1 = "contextual_rec_topics"
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x00f1 }
            r6.A9m(r1, r0)     // Catch:{ IOException -> 0x00f1 }
            goto L_0x00f9
        L_0x00f1:
            r2 = move-exception
            java.lang.String r1 = "SoundSyncApiUtil"
            java.lang.String r0 = "Failed to generate contextual music recommendation data"
            X.0wb.A06(r1, r0, r2)
        L_0x00f9:
            X.1OC r1 = r6.A0M()
            r3.A00 = r5
            r0 = 1180339056(0x465a8b70, float:13986.859)
            java.lang.Object r1 = r1.A00(r0, r3)
            if (r1 != r4) goto L_0x0026
            return r4
        L_0x0109:
            X.JUG r3 = X.JUG.A00(r6, r15, r4)
            goto L_0x0018
        L_0x010f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0114:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63910LBu.A00(java.util.Map, X.4D7, int):java.lang.Object");
    }

    public C63910LBu(SoundSyncSuggestedAudioNetworkDataSource soundSyncSuggestedAudioNetworkDataSource) {
        this.A00 = soundSyncSuggestedAudioNetworkDataSource;
    }
}
