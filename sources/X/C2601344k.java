package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimePayload;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.44k  reason: invalid class name and case insensitive filesystem */
public abstract class C2601344k extends RealtimeEventHandler {
    public final HashMap A00 = new HashMap();

    public final boolean canHandleRealtimeEvent(String str, String str2) {
        Integer A0l;
        0qQ.A0B(str, 0);
        if (RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str) || str2 == null || (A0l = 00y.A0l(str2)) == null || A0l.intValue() != 3) {
            return false;
        }
        return true;
    }

    public final List getMqttTopicsToHandle() {
        List singletonList = Collections.singletonList(RealtimeConstants.MQTT_TOPIC_SKYWALKER);
        0qQ.A07(singletonList);
        return singletonList;
    }

    public final boolean handleRealtimeEvent(C291065gS r14, RealtimePayload realtimePayload) {
        AnonymousClass00P th;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C61084JwM jwM;
        C45299Cu2 cu2;
        String str6;
        String str7;
        String str8;
        C45300Cu3 cu3;
        C45299Cu2 cu22;
        if (realtimePayload == null || !canHandleRealtimeEvent(RealtimeConstants.MQTT_TOPIC_SKYWALKER, realtimePayload.subTopic)) {
            return false;
        }
        String str9 = realtimePayload.stringPayload;
        0qQ.A06(str9);
        try {
            C45458Cwp cwp = C45146Cr7.parseFromJson(16P.A00(str9)).A00;
            if (cwp != null) {
                HashMap hashMap = this.A00;
                ULZ ulz = cwp.A00;
                if (ulz != null) {
                    str2 = ulz.A08;
                } else {
                    str2 = null;
                }
                if (hashMap.containsKey(str2)) {
                    return true;
                }
                C2601244j r2 = (C2601244j) this;
                if (cwp.A01 == null || cwp.A03 == null) {
                    0wb.A03("IgLiveWithRealtimeEventHandler", 0mp.A06("Missing broadcast id or body for %s event.", new Object[]{cwp.A00().name()}));
                } else {
                    int ordinal = cwp.A00().ordinal();
                    if (ordinal == 1) {
                        String str10 = cwp.A03;
                        if (str10 != null) {
                            AnonymousClass1Nd.A00(r2.A01).A00(new C62168KbQ(cwp, str10));
                        }
                    } else if (ordinal != 4) {
                        if (ordinal == 5) {
                            C45383CvP cvP = cwp.A01;
                            if (cvP != null) {
                                cu3 = cvP.A02;
                            } else {
                                cu3 = null;
                            }
                            String str11 = cwp.A03;
                            if (cu3 == null || str11 == null) {
                                str7 = "live-with-mqtt-messaging";
                                str8 = "Invalid/Empty payload for DISMISS event";
                            } else {
                                1Ng A002 = AnonymousClass1Nd.A00(r2.A01);
                                if (cu3.A00 == null) {
                                    str = "reason";
                                } else if (cu3.A01 != null) {
                                    A002.A00(new C62167KbP(str11));
                                } else {
                                    str = "detailedReasonString";
                                }
                            }
                        } else if (ordinal != 6) {
                            cwp.A00();
                        } else {
                            C45383CvP cvP2 = cwp.A01;
                            if (cvP2 == null || (cu22 = cvP2.A01) == null) {
                                str7 = "live-with-mqtt-messaging";
                                str8 = "Invalid/Empty payload for CONFERENCE_STATE event";
                            } else {
                                HashMap hashMap2 = cu22.A01;
                                if (hashMap2 != null) {
                                    for (Object next : hashMap2.keySet()) {
                                        0qQ.A07(next);
                                        String str12 = (String) next;
                                        HashMap hashMap3 = cu22.A01;
                                        if (hashMap3 != null) {
                                            C10309Rq7 rq7 = (C10309Rq7) hashMap3.get(str12);
                                            String str13 = cwp.A03;
                                            if (!(rq7 == null || str13 == null)) {
                                                1Ng A003 = AnonymousClass1Nd.A00(r2.A01);
                                                Integer num = rq7.A00;
                                                if (num != null) {
                                                    A003.A00(new C62171KbT(num, str13, str12, cu22.A00));
                                                } else {
                                                    str = IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE;
                                                }
                                            }
                                        }
                                    }
                                }
                                str = "participantStates";
                            }
                        }
                        0wb.A03(str7, str8);
                    } else {
                        ULZ ulz2 = cwp.A00;
                        if (ulz2 != null) {
                            str6 = ulz2.A07;
                        } else {
                            str6 = null;
                        }
                        String str14 = cwp.A03;
                        if (!(str6 == null || str14 == null)) {
                            C2601144i.A00().A00(r2.A00, r2.A01, str14, str6, (String) null);
                        }
                    }
                    synchronized (r2) {
                        try {
                            ULZ ulz3 = cwp.A00;
                            String str15 = null;
                            if (ulz3 != null) {
                                str4 = ulz3.A08;
                                str15 = ulz3.A07;
                            } else {
                                str4 = null;
                            }
                            String str16 = cwp.A03;
                            if (!(str4 == null || str15 == null || str16 == null)) {
                                UserSession userSession = r2.A01;
                                String name = cwp.A00().name();
                                int ordinal2 = cwp.A00().ordinal();
                                Integer num2 = null;
                                if (ordinal2 == 1) {
                                    C45383CvP cvP3 = cwp.A01;
                                    if (!(cvP3 == null || (jwM = cvP3.A00) == null)) {
                                        num2 = (Integer) jwM.A02;
                                    }
                                } else if (ordinal2 != 6) {
                                    str5 = "";
                                    0qQ.A0B(userSession, 0);
                                    0qQ.A0B(name, 4);
                                    0qQ.A0B(str5, 5);
                                    1NY r6 = new 1NY(userSession, -2);
                                    r6.A04();
                                    r6.A0K("live/%s/confirm/", new Object[]{str16});
                                    r6.A9m("message_type", name);
                                    r6.A9m(Pxd.A00(44), str4);
                                    r6.A9m(AnonymousClass000.A00(3056), str15);
                                    r6.A9m("cur_version", str5);
                                    r6.A0Q(1XP.class, 1XY.class);
                                    r6.A0R = true;
                                    1OC A0M = r6.A0M();
                                    A0M.A00 = new KAE(cwp);
                                    1ES.A03(A0M);
                                } else {
                                    C45383CvP cvP4 = cwp.A01;
                                    if (!(cvP4 == null || (cu2 = cvP4.A01) == null)) {
                                        num2 = Integer.valueOf(cu2.A00);
                                    }
                                }
                                str5 = String.valueOf(num2);
                                0qQ.A0B(userSession, 0);
                                0qQ.A0B(name, 4);
                                0qQ.A0B(str5, 5);
                                1NY r62 = new 1NY(userSession, -2);
                                r62.A04();
                                r62.A0K("live/%s/confirm/", new Object[]{str16});
                                r62.A9m("message_type", name);
                                r62.A9m(Pxd.A00(44), str4);
                                r62.A9m(AnonymousClass000.A00(3056), str15);
                                r62.A9m("cur_version", str5);
                                r62.A0Q(1XP.class, 1XY.class);
                                r62.A0R = true;
                                1OC A0M2 = r62.A0M();
                                A0M2.A00 = new KAE(cwp);
                                1ES.A03(A0M2);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                Iterator it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    if (SystemClock.elapsedRealtime() - ((Number) ((Map.Entry) it.next()).getValue()).longValue() > 300000) {
                        it.remove();
                    }
                }
                ULZ ulz4 = cwp.A00;
                if (ulz4 == null || (str3 = ulz4.A08) == null) {
                    return true;
                }
                hashMap.put(str3, Long.valueOf(SystemClock.elapsedRealtime()));
                return true;
            }
            str = "payload";
            0qQ.A0F(str);
            th = AnonymousClass00P.createAndThrow();
            throw th;
        } catch (IOException e) {
            0wb.A06("IgVideoRealtimeEventHandler", "error parsing video realtime event from skywalker", e);
            return true;
        }
    }
}
