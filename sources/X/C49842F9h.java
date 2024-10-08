package X;

import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.F9h  reason: case insensitive filesystem */
public abstract class C49842F9h {
    public static Ep3 A00;

    static {
        TimeUnit.SECONDS.toMillis(10);
    }

    /* JADX WARNING: type inference failed for: r0v32, types: [java.lang.Object, X.Ep3] */
    public static final 1OC A00(UserSession userSession, QuickPromotionSlot quickPromotionSlot, Integer num, int i) {
        DbY.A1S(userSession, quickPromotionSlot);
        EnumMap enumMap = new EnumMap(QuickPromotionSurface.class);
        for (QuickPromotionSurface quickPromotionSurface : QuickPromotionSurface.values()) {
            EnumSet A002 = AnonymousClass2kY.A00(quickPromotionSlot, quickPromotionSurface);
            if (!A002.isEmpty()) {
                enumMap.put(quickPromotionSurface, A002);
            }
        }
        if (A00 == null) {
            A00 = new Object();
        }
        JSONObject A11 = DbS.A11();
        Iterator A0s = AnonymousClass7TF.A0s(enumMap);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            QuickPromotionSurface quickPromotionSurface2 = (QuickPromotionSurface) A1J.getKey();
            JSONArray jSONArray = new JSONArray();
            for (Trigger trigger : (Set) A1J.getValue()) {
                jSONArray.put(trigger.A01);
            }
            try {
                A11.put(String.valueOf(quickPromotionSurface2.A00), jSONArray);
            } catch (JSONException e) {
                0KC.A0L("QuickPromotionApi", AnonymousClass000.A00(2270), e, new Object[]{AnonymousClass000.A00(4080)});
            }
        }
        String A10 = DbT.A10(A11);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("qp/batch_fetch/");
        A0a.A9m("vc_policy", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A0a.A9m("version", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A0a.A9m(AnonymousClass000.A00(4080), A10);
        A0a.A9m("scale", String.valueOf(i));
        String format = String.format("%s%s/%s", Arrays.copyOf(new Object[]{"qp/batch_fetch/", AnonymousClass000.A00(2070), A10}, 3));
        0qQ.A07(format);
        A0a.A0A = format;
        A0a.A07 = num;
        0tS A0h = DbT.A0h();
        String A13 = DbV.A13(A0h, A0h.A2O, 0tS.A4G, 212);
        if (!(A13 == null || A13.length() == 0)) {
            A0a.A9m("qp_override_ip", A13);
        }
        C375889Fq r0 = C375889Fq.A00;
        15p r1 = AnonymousClass15o.A00;
        0qQ.A08(r1);
        A0a.A02 = new 1NS(r1, C283605Im.class);
        return DbT.A0U(A0a, true);
    }
}
