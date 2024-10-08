package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4aM  reason: invalid class name and case insensitive filesystem */
public final class C266794aM {
    public final long A00;
    public final C266714aE A01;
    public final String A02;
    public final HashMap A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C266794aM r7 = (C266794aM) obj;
            if (!this.A02.equals(r7.A02) || this.A00 != r7.A00 || !this.A04.equals(r7.A04) || this.A01 != r7.A01 || !this.A07.equals(r7.A07) || !this.A05.equals(r7.A05)) {
                return false;
            }
        }
        return true;
    }

    public final C266764aJ A00() {
        C266764aJ r3 = new C266764aJ(this.A01, this.A02, this.A00);
        for (C266754aI A022 : this.A04) {
            r3.A02(A022);
        }
        for (C266774aK r0 : this.A07) {
            r3.A01(r0.A01, r0.A00);
        }
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            it.next();
            r3.A06.add((Object) null);
        }
        for (SIO A032 : this.A05) {
            r3.A03(A032);
        }
        return r3;
    }

    public final JSONObject A01() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mName", this.A02);
        jSONObject.put("mStartAtTimeUs", this.A00);
        jSONObject.put("mTrackType", this.A01.A00);
        List<C266754aI> list = this.A04;
        JSONArray jSONArray = new JSONArray();
        for (C266754aI A002 : list) {
            jSONArray.put(A002.A00());
        }
        jSONObject.put("mSegments", jSONArray);
        List<C266774aK> list2 = this.A07;
        JSONArray jSONArray2 = new JSONArray();
        for (C266774aK r2 : list2) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mTargetTimeRange", r2.A01.A04());
            jSONObject2.put("mSpeed", (double) r2.A00);
            jSONArray2.put(jSONObject2);
        }
        jSONObject.put("mTimelineSpeedList", jSONArray2);
        List list3 = this.A06;
        JSONArray jSONArray3 = new JSONArray();
        Iterator it = list3.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("toJSON");
        }
        jSONObject.put("mTimelinePtsMutatorList", jSONArray3);
        List<SIO> list4 = this.A05;
        JSONArray jSONArray4 = new JSONArray();
        for (SIO sio : list4) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("mTargetTimeRange", sio.A00.A04());
            jSONObject3.put("mMediaEffect", sio.A01.F00());
            jSONArray4.put(jSONObject3);
        }
        jSONObject.put("mTimelineEffects", jSONArray4);
        return jSONObject;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A04, this.A01, this.A07, this.A05, Long.valueOf(this.A00)});
    }

    public C266794aM(C266764aJ r3) {
        this.A02 = r3.A02;
        this.A01 = r3.A01;
        this.A04 = r3.A04;
        this.A00 = r3.A00;
        this.A05 = r3.A05;
        this.A03 = r3.A03;
        List list = r3.A06;
        Collections.sort(list, C266804aN.A00);
        this.A06 = list;
        List list2 = r3.A07;
        Collections.sort(list2, C266814aO.A00);
        this.A07 = list2;
    }

    public final String toString() {
        try {
            return A01().toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
