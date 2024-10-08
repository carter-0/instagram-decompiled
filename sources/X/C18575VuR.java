package X;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: X.VuR  reason: case insensitive filesystem */
public final class C18575VuR {
    public C16672Uz8 A00;
    public String A01;
    public final Context A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;
    public final Map A06;

    public static C18459Vs8 A00(C16672Uz8 uz8, C18575VuR vuR) {
        C18459Vs8 vs8 = (C18459Vs8) vuR.A06.get(uz8);
        if (vs8 != null) {
            return vs8;
        }
        throw C66582MXn.A0k(uz8, "Unsupported FeedRequestType: ", new StringBuilder());
    }

    public final void A01(C324596za r11, String str, boolean z, boolean z2, boolean z3) {
        C18459Vs8 A002 = A00(this.A00, this);
        if (z) {
            C324366zA r1 = A002.A02.A03;
            r1.A07 = null;
            r1.A02 = null;
            A002.A01 = null;
            A002.A00 = null;
        }
        C324356z9 r3 = A002.A02;
        String str2 = r3.A03.A07;
        List list = A002.A01;
        String str3 = A002.A00;
        UserSession userSession = this.A03;
        String str4 = this.A04;
        AnonymousClass7TG.A1N(userSession, str4);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0Q(UY7.class, C18212Vnc.class);
        DbU.A1P(A0a, "tags/%s/sections/", new Object[]{str4});
        C3724090s.A06(A0a, str2);
        if (str2 == null) {
            this.A01 = AnonymousClass7TF.A0b();
        }
        if (list != null && !list.isEmpty()) {
            A0a.A9m("next_media_ids", list.toString());
        }
        if (str3 != null) {
            A0a.A9m("page", str3);
        }
        A0a.A9m("rank_token", this.A01);
        1Bk r6 = ((C57091IOf) userSession.A01(C57091IOf.class, new MMJ(userSession, 17))).A00;
        HashSet hashSet = new HashSet();
        String A003 = AnonymousClass000.A00(3935);
        Set A062 = r6.A06(A003, hashSet);
        r6.A0A(A003);
        if (!A062.isEmpty()) {
            A0a.A9m(A003, 0mp.A05(",", A062));
        }
        Context context = this.A02;
        if (1Wr.isLocationEnabled(context) && 1Wr.isLocationPermitted(context, userSession, "HASH_TAG")) {
            1Wr r12 = 1Wr.A00;
            r12.getClass();
            Location lastLocation = r12.getLastLocation(userSession, "HashtagFeedRequestController");
            if (lastLocation != null) {
                A0a.A9m("lat", String.valueOf(lastLocation.getLatitude()));
                A0a.A9m("lng", String.valueOf(lastLocation.getLongitude()));
            }
        }
        A0a.A0H("include_persistent", z2);
        if (z2) {
            JSONArray jSONArray = new JSONArray();
            for (Object next : ((VQP) userSession.A01(VQP.class, new C73914Plp(userSession, 32))).A00) {
                if (next != C16672Uz8.UNSPECIFIED) {
                    jSONArray.put(next.toString());
                }
            }
            A0a.A9m("supported_tabs", jSONArray.toString());
        }
        if (z3) {
            A0a.A9m("include_challenges", "true");
        }
        C16672Uz8 uz8 = this.A00;
        if (uz8 != C16672Uz8.UNSPECIFIED) {
            A0a.A9m("tab", uz8.toString());
        }
        String str5 = this.A05;
        if (str5 != null) {
            A0a.A9m(AnonymousClass000.A00(5318), str5);
        }
        r3.A03(DbT.A0T(A0a, "media_recency_filter", str), new C15963Ulf(r11, A002));
    }

    public C18575VuR(Context context, UserSession userSession, C16672Uz8 uz8, String str, String str2, Map map) {
        this.A02 = context;
        this.A06 = map;
        String encode = Uri.encode(str.trim());
        this.A04 = encode;
        this.A03 = userSession;
        this.A00 = uz8;
        this.A05 = str2;
        17k.A0F(C13990Tnq.A1a(encode));
    }
}
