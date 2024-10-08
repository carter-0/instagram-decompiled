package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.2pI  reason: invalid class name and case insensitive filesystem */
public final class C230262pI {
    public String A00;
    public String A01;
    public String A02 = UUID.randomUUID().toString();
    public HashMap A03 = new HashMap();
    public HashMap A04 = new HashMap();
    public HashMap A05 = new HashMap();
    public HashMap A06 = new HashMap();
    public List A07 = new ArrayList();
    public Map A08 = new HashMap();

    public static String A00(HashMap hashMap) {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            A0A.A0c();
            for (Map.Entry entry : hashMap.entrySet()) {
                A0A.A0q((String) entry.getKey());
                C308416Ue r5 = (C308416Ue) entry.getValue();
                A0A.A0b();
                for (int i = 0; i < r5.A00.size(); i++) {
                    C308406Ud r3 = (C308406Ud) r5.A00.get(i);
                    String str = r3.A04;
                    if (str == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(r3.A01);
                        sb.append("_");
                        sb.append(r3.A00);
                        str = sb.toString();
                        r3.A04 = str;
                    }
                    A0A.A0t(str);
                }
                A0A.A0Y();
            }
            A0A.A0Z();
            A0A.close();
            return stringWriter.toString();
        } catch (IOException e) {
            0KC.A0G("PendingReelSeenState", "Failed to serialize seen state to json", e);
            return null;
        }
    }

    public static String A01(HashMap hashMap) {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            A0A.A0c();
            for (Map.Entry entry : hashMap.entrySet()) {
                A0A.A0R((String) entry.getKey(), (String) entry.getValue());
            }
            A0A.A0Z();
            A0A.close();
            return stringWriter.toString();
        } catch (IOException e) {
            0KC.A0G("PendingReelSeenState", "Failed to serialize nuxes seen state to json", e);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.6Ud, java.lang.Object] */
    public static void A02(User user, String str, String str2, HashMap hashMap, long j) {
        StringBuilder sb;
        if (user != null && str2 != null) {
            String id = user.getId();
            ? obj = new Object();
            obj.A05 = str;
            obj.A02 = str2;
            obj.A06 = id;
            obj.A01 = j;
            obj.A00 = System.currentTimeMillis() / 1000;
            String str3 = obj.A03;
            if (str3 == null) {
                if ("SUPERLATIVE".equals(str2)) {
                    sb = new StringBuilder();
                    sb.append(id);
                    sb.append("_superlative:");
                    sb.append(str);
                    sb.append("_superlativeReel:");
                } else {
                    int indexOf = str2.indexOf(95);
                    if (indexOf != -1) {
                        str2 = str2.substring(0, indexOf);
                    }
                    sb = new StringBuilder();
                    sb.append(str2);
                    sb.append("_");
                    sb.append(obj.A06);
                    sb.append("_");
                    id = obj.A05;
                }
                sb.append(id);
                str3 = sb.toString();
                obj.A03 = str3;
            }
            C308416Ue r0 = (C308416Ue) hashMap.get(str3);
            if (r0 == null) {
                r0 = new C308416Ue();
                hashMap.put(str3, r0);
            }
            r0.A00.add(obj);
        }
    }

    public final 1OC A03(UserSession userSession) {
        String str;
        1NY r3 = new 1NY(userSession);
        r3.A08(AnonymousClass05K.A01);
        if (this.A03.size() > 0) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        r3.A0K("media/seen/?reel=%s&live_vod=0", new Object[]{str});
        r3.A0P = true;
        String A002 = A00(this.A03);
        String A003 = A00(this.A05);
        String A012 = A01(this.A04);
        String A013 = A01(this.A06);
        if (A002 != null) {
            r3.AA0("reels", A002);
        }
        if (A003 != null) {
            r3.AA0("reel_media_skipped", A003);
        }
        if (A012 != null) {
            r3.AA0("nuxes", A012);
        }
        if (A013 != null) {
            r3.AA0("nuxes_skipped", A013);
        }
        List list = this.A07;
        if (list != null) {
            r3.AA0("force_seen_story_ids", list.toString());
        }
        String str2 = this.A01;
        if (str2 != null) {
            r3.A9m("container_module", str2);
        }
        String str3 = this.A00;
        if (str3 != null) {
            r3.A9m("notification_type", str3);
        }
        Map map = this.A08;
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                r3.AA0((String) entry.getKey(), (String) entry.getValue());
            }
            r3.A0F("X_IG_PERF_QPL_JOIN_ID", String.valueOf(map.toString().hashCode()));
            r3.A0F("X_IG_PERF_QPL_MARKER_ID", "823333654");
        }
        r3.A0V = true;
        r3.A0R(1XP.class, 1XY.class);
        r3.A0R = true;
        return r3.A0M();
    }

    public final C230262pI A04() {
        C230262pI r4 = new C230262pI();
        r4.A04 = new HashMap(this.A04);
        r4.A06 = new HashMap(this.A06);
        r4.A01 = this.A01;
        r4.A00 = this.A00;
        Iterator it = this.A03.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Object obj = this.A03.get(next);
            obj.getClass();
            C308416Ue r3 = (C308416Ue) obj;
            C308416Ue r2 = new C308416Ue();
            for (int i = 0; i < r3.A00.size(); i++) {
                r2.A00.add(r3.A00.get(i));
            }
            r4.A03.put(next, r2);
        }
        for (Object next2 : this.A05.keySet()) {
            Object obj2 = this.A05.get(next2);
            obj2.getClass();
            C308416Ue r5 = (C308416Ue) obj2;
            C308416Ue r32 = new C308416Ue();
            for (int i2 = 0; i2 < r5.A00.size(); i2++) {
                r32.A00.add(r5.A00.get(i2));
            }
            r4.A05.put(next2, r32);
        }
        r4.A07.addAll(this.A07);
        for (Object next3 : this.A08.keySet()) {
            r4.A08.put(next3, this.A08.get(next3));
        }
        return r4;
    }

    public final void A05() {
        this.A04.clear();
        this.A03.clear();
        this.A08.clear();
        this.A07.clear();
    }

    public final boolean A07() {
        if (!this.A04.isEmpty() || !this.A03.isEmpty() || !this.A07.isEmpty()) {
            return false;
        }
        return true;
    }

    public final void A06(String str, UserSession userSession, 1Xj r9) {
        String id = r9.getId();
        String str2 = str;
        A02(r9.A2A(userSession), str2, id, this.A03, r9.A1A());
    }
}
