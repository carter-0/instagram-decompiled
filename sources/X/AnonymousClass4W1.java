package X;

import android.util.Pair;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4W1  reason: invalid class name */
public final class AnonymousClass4W1 implements 0Jp {
    public static final AnonymousClass0eM A04 = AnonymousClass0eN.A00(0eO.A04, AnonymousClass4W2.A00);
    public final int A00;
    public final AnonymousClass42R A01;
    public final AnonymousClass4W0 A02;
    public final C241063Ns A03;

    public final void ATC(UserSession userSession, 0Jv r21) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        ImmutableSetMultimap immutableSetMultimap = this.A02.A00;
        if (immutableSetMultimap.isEmpty()) {
            String str = userSession2.A06;
            0KC.A0P("IGFetcherUserOperationPayload", "%s is not in experiment and will not retrieve via background fetch", new Object[]{str});
            this.A03.A0K(new C283915Jv((AnonymousClass4W5) null, str));
        } else if (182.A06(0Tu.A05, userSession2, 36329453319635075L)) {
            AnonymousClass42R r7 = this.A01;
            ImmutableSet keySet = immutableSetMultimap.A01.keySet();
            0qQ.A07(keySet);
            List<QuickPromotionSurface> A0a = 00k.A0a(keySet);
            ArrayList arrayList = new ArrayList(0Yv.A1E(A0a, 10));
            for (QuickPromotionSurface quickPromotionSurface : A0a) {
                ImmutableSet<Trigger> A08 = immutableSetMultimap.AXL(quickPromotionSurface);
                0qQ.A07(A08);
                ArrayList arrayList2 = new ArrayList(0Yv.A1E(A08, 10));
                for (Trigger trigger : A08) {
                    arrayList2.add(trigger.A01);
                }
                2IV r5 = new 2IV();
                r5.A09(quickPromotionSurface.A01.toString(), "surface_id");
                r5.A05("triggers", arrayList2);
                arrayList.add(r5);
            }
            ImmutableMap immutableMap = r7.A00.A00;
            ArrayList arrayList3 = new ArrayList();
            C249803kO it = ((ImmutableCollection) immutableMap.entrySet()).iterator();
            0qQ.A07(it);
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                2IV r4 = new 2IV();
                r4.A09((String) entry.getKey(), "context_key");
                r4.A09((String) entry.getValue(), "context_value");
                arrayList3.add(r4);
            }
            2IV r72 = new 2IV();
            r72.A05("context_data_tuples", arrayList3);
            2IS r42 = new 2IS();
            2IS r52 = new 2IS();
            ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
            if (copyOf == null) {
                copyOf = ImmutableList.of();
            }
            r42.A05("surface_triggers", copyOf);
            r42.A03("scale", Double.valueOf((double) this.A00));
            r42.A00(r72, "trigger_context");
            r42.A04("bloks_version", "62c196cc283670265c8243af7482f62f8856499ba6f7f01c5067e75d05225969");
            AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "QuickPromotionSurfaceQueryV3", r42.getParamsCopy(), r52.getParamsCopy(), C43104Bsq.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "ig_quick_promotion_batch_fetch_root", new ArrayList());
            1vn A012 = 1vm.A01(userSession2);
            C45950DGe dGe = new C45950DGe(userSession2, this);
            A012.ATL(new C45915DEv(dGe), new DFH(dGe), pandoGraphQLRequest);
        } else {
            A04.getValue();
            AnonymousClass42R r10 = this.A01;
            int i = this.A00;
            JSONObject jSONObject = new JSONObject();
            ImmutableMap immutableMap2 = immutableSetMultimap.A01;
            0qQ.A07(immutableMap2);
            for (Map.Entry entry2 : immutableMap2.entrySet()) {
                QuickPromotionSurface quickPromotionSurface2 = (QuickPromotionSurface) entry2.getKey();
                JSONArray jSONArray = new JSONArray();
                for (Trigger trigger2 : (Collection) entry2.getValue()) {
                    jSONArray.put(trigger2.A01);
                }
                try {
                    jSONObject.put(String.valueOf(quickPromotionSurface2.A00), jSONArray);
                } catch (JSONException e) {
                    0KC.A0L("IGFetcherUserOperationPayload", AnonymousClass000.A00(2270), e, new Object[]{"surfaces_to_triggers"});
                }
            }
            String obj = jSONObject.toString();
            0qQ.A07(obj);
            2cX r43 = r10.A00;
            if (r43.A00.isEmpty()) {
                HashMap hashMap = new HashMap();
                if (!immutableMap2.isEmpty()) {
                    Iterator it2 = immutableMap2.entrySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Map.Entry entry3 = (Map.Entry) it2.next();
                        Object key = entry3.getKey();
                        Collection collection = (Collection) entry3.getValue();
                        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0e;
                        0qQ.A0A(key);
                        Map map = AnonymousClass2kY.A01;
                        0qQ.A0B(key, 1);
                        List<C227972ka> A013 = AnonymousClass2kY.A01(quickPromotionSlot);
                        ArrayList arrayList4 = new ArrayList(A013.size());
                        for (C227972ka r02 : A013) {
                            arrayList4.add(r02.A00);
                        }
                        if (arrayList4.contains(key)) {
                            0qQ.A0A(collection);
                            0qQ.A0B(collection, 1);
                            0qQ.A0B(quickPromotionSlot, 0);
                            Collection collection2 = (Collection) AnonymousClass2kY.A00.get(quickPromotionSlot);
                            if (collection2 != null && !Collections.disjoint(collection2, collection)) {
                                Pair A002 = C379669Uv.A00(userSession2);
                                if (A002 != null) {
                                    hashMap.put("lat", A002.first.toString());
                                    hashMap.put("lng", A002.second.toString());
                                }
                            }
                        }
                    }
                }
                r43 = new 2cX(hashMap);
            }
            1NY r53 = new 1NY(userSession2, -2);
            r53.A08(AnonymousClass05K.A01);
            r53.A0A("qp/batch_fetch/");
            r53.A9m("vc_policy", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
            r53.A9m("version", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            r53.A9m("surfaces_to_triggers", obj);
            r53.A9m("scale", String.valueOf(i));
            r53.A9m("is_sdk", "true");
            ImmutableMap immutableMap3 = r43.A00;
            if (!immutableMap3.isEmpty()) {
                0qQ.A0C(immutableMap3, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                r53.A9m("trigger_context", new JSONObject(immutableMap3).toString());
            }
            r53.A0O((15p) null, AnonymousClass4W5.class, C283605Im.class, false);
            r53.A0R = true;
            1OC A0M = r53.A0M();
            A0M.A00 = new C283615In(userSession2, this.A03);
            1ES.A03(A0M);
        }
    }

    public AnonymousClass4W1(AnonymousClass42R r1, AnonymousClass4W0 r2, C241063Ns r3, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A03 = r3;
        this.A02 = r2;
    }
}
