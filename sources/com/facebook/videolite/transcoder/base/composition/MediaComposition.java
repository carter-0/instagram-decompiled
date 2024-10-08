package com.facebook.videolite.transcoder.base.composition;

import X.C266714aE;
import X.C266724aF;
import X.C266744aH;
import X.C266754aI;
import X.C266764aJ;
import X.C266774aK;
import X.C266794aM;
import X.C266824aP;
import X.RV5;
import X.SIO;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaComposition {
    public HashMap A00;
    public HashMap A01;
    public HashMap A02;
    public boolean A03;
    public HashMap A04 = new HashMap();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MediaComposition mediaComposition = (MediaComposition) obj;
            HashMap hashMap = this.A02;
            HashMap hashMap2 = mediaComposition.A02;
            if (hashMap != hashMap2 && !hashMap.equals(hashMap2)) {
                return false;
            }
            HashMap hashMap3 = this.A00;
            HashMap hashMap4 = mediaComposition.A00;
            return hashMap3 == hashMap4 || hashMap3.equals(hashMap4);
        }
    }

    public static MediaComposition A00(String str) {
        C266714aE r1;
        C266714aE r8;
        C266714aE r5;
        File file;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("mTypeToTracksMap");
            HashMap hashMap = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                int i2 = jSONObject2.getInt("TrackType");
                if (i2 == 1) {
                    r8 = C266714aE.AUDIO;
                } else if (i2 != 2) {
                    r8 = C266714aE.MIXED;
                } else {
                    r8 = C266714aE.VIDEO;
                }
                JSONArray jSONArray2 = jSONObject2.getJSONArray("TrackMap");
                int length = jSONArray2.length();
                HashMap hashMap2 = new HashMap();
                for (int i3 = 0; i3 < length; i3++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                    int i4 = jSONObject3.getInt("TrackIndex");
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("MediaTrackComposition");
                    String string = jSONObject4.getString("mName");
                    long j = jSONObject4.getLong("mStartAtTimeUs");
                    int i5 = jSONObject4.getInt("mTrackType");
                    if (i5 == 1) {
                        r5 = C266714aE.AUDIO;
                    } else if (i5 != 2) {
                        r5 = C266714aE.MIXED;
                    } else {
                        r5 = C266714aE.VIDEO;
                    }
                    JSONArray jSONArray3 = jSONObject4.getJSONArray("mSegments");
                    int length2 = jSONArray3.length();
                    ArrayList arrayList = new ArrayList();
                    for (int i6 = 0; i6 < length2; i6++) {
                        JSONObject jSONObject5 = jSONArray3.getJSONObject(i6);
                        String optString = jSONObject5.optString("mSourceFile");
                        URL url = null;
                        if (optString.length() == 0) {
                            file = null;
                        } else {
                            file = new File(optString);
                        }
                        String optString2 = jSONObject5.optString("mUrl");
                        if (optString2.length() != 0) {
                            url = new URL(optString2);
                        }
                        C266724aF A002 = C266724aF.A00(jSONObject5.getJSONObject("mSourceTimeRange"));
                        long j2 = jSONObject5.getLong("mPhotoDurationUs");
                        int i7 = jSONObject5.getInt("mOutputFps");
                        C266744aH r13 = new C266744aH(file);
                        r13.A03 = A002;
                        r13.A02 = j2;
                        r13.A00 = i7;
                        r13.A05 = url;
                        r13.A01 = (long) jSONObject5.getInt("mMediaOriginalDurationMs");
                        arrayList.add(r13.A00());
                    }
                    C266764aJ r3 = new C266764aJ(r5, string, j);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        r3.A02((C266754aI) it.next());
                    }
                    JSONArray jSONArray4 = jSONObject4.getJSONArray("mTimelineSpeedList");
                    int length3 = jSONArray4.length();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i8 = 0; i8 < length3; i8++) {
                        arrayList2.add(new C266774aK(jSONArray4.getJSONObject(i8)));
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        C266774aK r0 = (C266774aK) it2.next();
                        r3.A01(r0.A01, r0.A00);
                    }
                    jSONObject4.getJSONArray("mTimelineEffects");
                    Iterator it3 = new ArrayList().iterator();
                    while (it3.hasNext()) {
                        r3.A03((SIO) it3.next());
                    }
                    hashMap2.put(Integer.valueOf(i4), new C266794aM(r3));
                }
                hashMap.put(r8, hashMap2);
            }
            C266824aP r6 = new C266824aP();
            for (HashMap values : hashMap.values()) {
                for (C266794aM A042 : values.values()) {
                    r6.A04(A042);
                }
            }
            JSONArray jSONArray5 = jSONObject.getJSONArray("mTrackTypeToTimelineEffects");
            HashMap hashMap3 = new HashMap();
            int length4 = jSONArray5.length();
            for (int i9 = 0; i9 < length4; i9++) {
                JSONObject jSONObject6 = jSONArray5.getJSONObject(i9);
                int i10 = jSONObject6.getInt("TrackType");
                if (i10 == 1) {
                    r1 = C266714aE.AUDIO;
                } else if (i10 != 2) {
                    r1 = C266714aE.MIXED;
                } else {
                    r1 = C266714aE.VIDEO;
                }
                jSONObject6.getJSONArray("TimelineEffects");
                hashMap3.put(r1, new ArrayList());
            }
            for (Map.Entry entry : hashMap3.entrySet()) {
                for (SIO sio : (List) entry.getValue()) {
                    r6.A01(sio.A00, (C266714aE) entry.getKey(), sio.A01);
                }
            }
            return new MediaComposition(r6);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    private void A01() {
        if (!this.A03) {
            for (AbstractMap entrySet : this.A02.values()) {
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : entrySet.entrySet()) {
                    Object key = entry.getKey();
                    C266794aM r2 = (C266794aM) entry.getValue();
                    hashMap.put(key, new ArrayList(r2.A04));
                    this.A04.put(r2.A01, hashMap);
                }
            }
            this.A03 = true;
        }
    }

    public final C266824aP A03() {
        C266824aP r6 = new C266824aP();
        for (AbstractMap abstractMap : this.A02.values()) {
            int i = 0;
            while (true) {
                if (i < abstractMap.size()) {
                    C266794aM r0 = (C266794aM) abstractMap.get(Integer.valueOf(i));
                    if (r0 != null) {
                        r6.A04(r0);
                        i++;
                    } else {
                        throw new IllegalArgumentException("track composition is null");
                    }
                }
            }
        }
        for (Map.Entry entry : this.A00.entrySet()) {
            for (SIO sio : (List) entry.getValue()) {
                r6.A01(sio.A00, (C266714aE) entry.getKey(), sio.A01);
            }
        }
        return r6;
    }

    public final String A05() {
        try {
            JSONObject jSONObject = new JSONObject();
            HashMap hashMap = this.A02;
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : hashMap.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("TrackType", ((C266714aE) entry.getKey()).A00);
                JSONArray jSONArray2 = new JSONArray();
                for (Map.Entry entry2 : ((AbstractMap) entry.getValue()).entrySet()) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("TrackIndex", entry2.getKey());
                    jSONObject3.put("MediaTrackComposition", entry2.getValue().hashCode());
                    jSONArray2.put(jSONObject3);
                }
                jSONObject2.put("TrackMap", jSONArray2);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("mTypeToTracksMap", jSONArray);
            HashMap hashMap2 = this.A00;
            JSONArray jSONArray3 = new JSONArray();
            for (Map.Entry entry3 : hashMap2.entrySet()) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("TrackType", ((C266714aE) entry3.getKey()).A00);
                JSONArray jSONArray4 = new JSONArray();
                for (Object hashCode : (List) entry3.getValue()) {
                    jSONArray4.put(hashCode.hashCode());
                }
                jSONObject4.put("TimelineEffects", jSONArray4);
                jSONArray3.put(jSONObject4);
            }
            jSONObject.put("mTrackTypeToTimelineEffects", jSONArray3);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public final HashMap A06(C266714aE r6) {
        HashMap hashMap = new HashMap();
        List list = (List) this.A00.get(r6);
        if (list != null && !list.isEmpty()) {
            hashMap.put(-1, list);
        }
        HashMap A07 = A07(r6);
        if (A07 != null) {
            for (Map.Entry entry : A07.entrySet()) {
                Object key = entry.getKey();
                List list2 = ((C266794aM) entry.getValue()).A05;
                if (!list2.isEmpty()) {
                    hashMap.put(key, list2);
                }
            }
        }
        return hashMap;
    }

    public final JSONObject A09() {
        JSONObject jSONObject = new JSONObject();
        HashMap hashMap = this.A02;
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : hashMap.entrySet()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("TrackType", ((C266714aE) entry.getKey()).A00);
            JSONArray jSONArray2 = new JSONArray();
            for (Map.Entry entry2 : ((AbstractMap) entry.getValue()).entrySet()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("TrackIndex", entry2.getKey());
                jSONObject3.put("MediaTrackComposition", ((C266794aM) entry2.getValue()).A01());
                jSONArray2.put(jSONObject3);
            }
            jSONObject2.put("TrackMap", jSONArray2);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("mTypeToTracksMap", jSONArray);
        HashMap hashMap2 = this.A00;
        JSONArray jSONArray3 = new JSONArray();
        for (Map.Entry entry3 : hashMap2.entrySet()) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("TrackType", ((C266714aE) entry3.getKey()).A00);
            JSONArray jSONArray4 = new JSONArray();
            for (SIO sio : (List) entry3.getValue()) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("mTargetTimeRange", sio.A00.A04());
                jSONObject5.put("mMediaEffect", sio.A01.F00());
                jSONArray4.put(jSONObject5);
            }
            jSONObject4.put("TimelineEffects", jSONArray4);
            jSONArray3.put(jSONObject4);
        }
        jSONObject.put("mTrackTypeToTimelineEffects", jSONArray3);
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r0 = new java.lang.RuntimeException("media track segment validation error", r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(java.lang.Boolean r14) {
        /*
            r13 = this;
            java.util.HashMap r3 = r13.A02
            boolean r0 = r3.isEmpty()
            r2 = r0 ^ 1
            java.lang.String r0 = "type to track map is empty"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            java.lang.String r4 = "media composition validation error"
            if (r2 == 0) goto L_0x00e3
            java.util.Collection r0 = r3.values()
            java.util.Iterator r12 = r0.iterator()
        L_0x001b:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r1 = r12.next()
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            int r0 = r1.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Collection r0 = r1.values()
            java.util.Iterator r11 = r0.iterator()
        L_0x0038:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r6 = r11.next()
            X.4aM r6 = (X.C266794aM) r6
            java.util.List r0 = r6.A04
            java.util.Iterator r10 = r0.iterator()
        L_0x004a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r0 = r10.next()
            X.4aI r0 = (X.C266754aI) r0
            java.lang.String r7 = "source file cannot be read. path="
            java.io.File r8 = r0.A04
            r2 = 1
            java.lang.String r3 = "media track segment validation error"
            if (r8 == 0) goto L_0x0095
            boolean r0 = r14.booleanValue()     // Catch:{ IOException -> 0x00cf }
            if (r0 == 0) goto L_0x007d
            java.io.File r9 = r8.getCanonicalFile()     // Catch:{ IOException -> 0x00cf }
        L_0x0069:
            boolean r2 = r9.exists()     // Catch:{ IOException -> 0x00cf }
            java.lang.String r1 = "source file not exist. path="
            java.lang.String r0 = r8.getPath()     // Catch:{ IOException -> 0x00cf }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ IOException -> 0x00cf }
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ IOException -> 0x00cf }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00cf }
            goto L_0x007f
        L_0x007d:
            r9 = r8
            goto L_0x0069
        L_0x007f:
            if (r2 == 0) goto L_0x00c9
            boolean r2 = r9.canRead()     // Catch:{ IOException -> 0x00cf }
            java.lang.String r0 = r8.getPath()     // Catch:{ IOException -> 0x00cf }
            java.lang.String r0 = X.002.A0R(r7, r0)     // Catch:{ IOException -> 0x00cf }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x00cf }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00cf }
            if (r2 != 0) goto L_0x004a
            goto L_0x00c3
        L_0x0095:
            java.net.URL r0 = r0.A05
            if (r0 != 0) goto L_0x009a
            r2 = 0
        L_0x009a:
            java.lang.String r0 = "url cannot be null"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            if (r2 != 0) goto L_0x004a
            X.TQC r0 = new X.TQC
            r0.<init>(r3, r1)
            throw r0
        L_0x00a9:
            java.lang.String r1 = r6.A02
            boolean r0 = r5.contains(r1)
            if (r0 == 0) goto L_0x00be
            java.lang.String r0 = "duplicate track name"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            X.TQC r0 = new X.TQC
            r0.<init>(r4, r1)
            throw r0
        L_0x00be:
            r5.add(r1)
            goto L_0x0038
        L_0x00c3:
            X.TQC r0 = new X.TQC     // Catch:{ IOException -> 0x00cf }
            r0.<init>(r3, r1)     // Catch:{ IOException -> 0x00cf }
            goto L_0x00ce
        L_0x00c9:
            X.TQC r0 = new X.TQC     // Catch:{ IOException -> 0x00cf }
            r0.<init>(r3, r1)     // Catch:{ IOException -> 0x00cf }
        L_0x00ce:
            throw r0     // Catch:{ IOException -> 0x00cf }
        L_0x00cf:
            java.lang.String r0 = r8.getPath()
            java.lang.String r0 = X.002.A0R(r7, r0)
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            X.TQC r0 = new X.TQC
            r0.<init>(r3, r1)
            throw r0
        L_0x00e2:
            return
        L_0x00e3:
            X.TQC r0 = new X.TQC
            r0.<init>(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.videolite.transcoder.base.composition.MediaComposition.A0A(java.lang.Boolean):void");
    }

    public final boolean A0B(C266714aE r6) {
        AbstractMap abstractMap = (AbstractMap) this.A02.get(r6);
        if (abstractMap == null) {
            return false;
        }
        for (Map.Entry value : abstractMap.entrySet()) {
            Iterator it = new ArrayList(((C266794aM) value.getValue()).A07).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!RV5.A00(((C266774aK) it.next()).A00, 1.0f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A00});
    }

    public MediaComposition(C266824aP r3) {
        HashMap hashMap = new HashMap();
        this.A02 = hashMap;
        hashMap.putAll(r3.A02);
        HashMap hashMap2 = new HashMap();
        this.A00 = hashMap2;
        hashMap2.putAll(r3.A00);
        HashMap hashMap3 = new HashMap();
        this.A01 = hashMap3;
        hashMap3.putAll(r3.A01);
    }

    public final int A02(C266714aE r4, String str) {
        A01();
        AbstractMap abstractMap = (AbstractMap) this.A02.get(r4);
        if (abstractMap == null) {
            return -1;
        }
        for (Map.Entry entry : abstractMap.entrySet()) {
            if (((C266794aM) entry.getValue()).A02.equals(str)) {
                return ((Number) entry.getKey()).intValue();
            }
        }
        return -1;
    }

    public final C266794aM A04(C266714aE r3, int i) {
        A01();
        AbstractMap abstractMap = (AbstractMap) this.A02.get(r3);
        if (abstractMap != null) {
            return (C266794aM) abstractMap.get(Integer.valueOf(i));
        }
        return null;
    }

    public final HashMap A07(C266714aE r3) {
        A01();
        HashMap hashMap = this.A02;
        if (hashMap.get(r3) != null) {
            return (HashMap) hashMap.get(r3);
        }
        return null;
    }

    public final List A08(C266714aE r3, int i) {
        A01();
        AbstractMap abstractMap = (AbstractMap) this.A04.get(r3);
        if (abstractMap != null) {
            return (List) abstractMap.get(Integer.valueOf(i));
        }
        return null;
    }

    public final String toString() {
        try {
            return A09().toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
