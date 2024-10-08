package X;

import android.app.Activity;
import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Nhj  reason: case insensitive filesystem */
public final class C69229Nhj extends C49727F3r {
    public final /* synthetic */ C71093OcF A00;

    public final void A03(C307896Rx r26, C277014uI r27, C277014uI r28, String str, List list) {
        String asString;
        String A0m;
        Long A10;
        String str2 = str;
        0qQ.A0B(str2, 1);
        C71093OcF ocF = this.A00;
        if (ocF.A0F) {
            Activity activity = ocF.A0I;
            C71077Oaw oaw = new C71077Oaw(activity, ocF.A0K);
            List list2 = list;
            C307896Rx r1 = r26;
            C277014uI r9 = r27;
            C277014uI r10 = r28;
            if (list2.contains("ig_user_impersonation_me") || list2.contains("ig_user_impersonation_someone_i_know") || list2.contains("ig_user_impersonation_someone_i_follow") || list2.contains("ig_impersonation_celebrity") || list2.contains("ig_user_impersonation_someone_else")) {
                C299275ur r8 = new C299275ur(r1);
                if (00l.A0W(str2)) {
                    0wb.A03("reporting_bottom_sheet_impersonation_report", "Token is blank, so unable to find Victim ID");
                } else {
                    try {
                        JsonObject jsonObject = (JsonObject) new Gson().A08(str2, JsonObject.class);
                        if (!jsonObject.has("victim_id") || (asString = jsonObject.getAsJsonPrimitive("victim_id").getAsString()) == null || 00l.A0W(asString)) {
                            0wb.A03("reporting_bottom_sheet_impersonation_report", "Victim ID not found in Json token");
                        } else {
                            User user = ocF.A01;
                            if (user != null) {
                                Iterator it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    Object next = it.next();
                                    Map map = C71077Oaw.A02;
                                    if (map.containsKey(next)) {
                                        Object obj = map.get(next);
                                        if (obj != null) {
                                            Number number = (Number) obj;
                                            if (number != null) {
                                                if (ocF.A0B == null) {
                                                    String str3 = ocF.A05;
                                                    if (str3 == null || (A10 = AnonymousClass7TE.A10(str3)) == null) {
                                                        throw AnonymousClass7TE.A0z("Required value was null.");
                                                    }
                                                    long longValue = A10.longValue();
                                                    1a8 A0P = C66581MXm.A0P();
                                                    ImmutableList A0K = DbU.A0K(list2);
                                                    int intValue = number.intValue();
                                                    Long BST = user.BST();
                                                    if (BST != null) {
                                                        long longValue2 = BST.longValue();
                                                        A0P.A02(1aU.A01(C71994OuS.A00, MYc.A01(oaw.A00, "MsysReportUtil").A01.A0C.A0M(new C72044OvJ(A0K, Long.valueOf(longValue), BST, str2, asString, intValue)), C71077Oaw.A00(oaw, str2, longValue2)), new PSW(5, r8, r10, r9, oaw));
                                                        return;
                                                    }
                                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                                }
                                                C61480nO A002 = 0nY.A00();
                                                0qQ.A07(A002);
                                                A002.ATE(new C68669NSb(r8, r9, r10, user, oaw, str2, asString, list2));
                                                return;
                                            }
                                        } else {
                                            throw AnonymousClass7TE.A0z("Required value was null.");
                                        }
                                    }
                                }
                                A0m = AnonymousClass7TG.A0m(list2, "Invalid impersonation reporting tags: ", AnonymousClass7TE.A1A());
                                0wb.A03("reporting_bottom_sheet_impersonation_report", A0m);
                                oaw.A02(r8, r10);
                                return;
                            }
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } catch (AnonymousClass1Aw e) {
                        0wb.A06("reporting_bottom_sheet_impersonation_report", "Failed to parse Json token", e);
                    }
                }
                A0m = "Unable to find Victim ID from Json token";
                0wb.A03("reporting_bottom_sheet_impersonation_report", A0m);
                oaw.A02(r8, r10);
                return;
            }
            C71198OfK ofK = new C71198OfK(r1, oaw, r10, ocF, list2, r9, str2, 1);
            C71185Of3 of3 = new C71185Of3(11, r10, oaw, r1);
            C358248ab A0Y = DbS.A0Y(activity);
            A0Y.A09(2131972187);
            A0Y.A08(2131972185);
            A0Y.A0s(false);
            A0Y.A0r(false);
            A0Y.A0I(ofK, 2131972186);
            DbX.A16(of3, A0Y);
        }
    }

    public C69229Nhj(C71093OcF ocF) {
        this.A00 = ocF;
    }

    public final void A00() {
        ((C71038Oa2) this.A00.A0Q.getValue()).A01();
    }

    public final void A01() {
        C71093OcF ocF = this.A00;
        ocF.A03.De7();
        ((C71038Oa2) ocF.A0Q.getValue()).A02(303960177);
        C59689JTv.A0D(ocF.A0I, "request_error");
    }

    public final void A02() {
        C71093OcF ocF = this.A00;
        ocF.A03.DeA((String) null);
        AnonymousClass0eM r3 = ocF.A0Q;
        ((C71038Oa2) r3.getValue()).A04(AnonymousClass05K.A00, (String) null, true);
        C71038Oa2 oa2 = (C71038Oa2) r3.getValue();
        synchronized (oa2) {
            if (oa2.A00) {
                02m.A0p.markerPoint(303960177, "network_request_start");
            }
        }
    }

    public final void A04(Integer num) {
        C71093OcF ocF = this.A00;
        AnonymousClass0eM r3 = ocF.A0Q;
        C71038Oa2 oa2 = (C71038Oa2) r3.getValue();
        synchronized (oa2) {
            String A002 = AnonymousClass000.A00(712);
            if (oa2.A00) {
                02m.A0p.markerPoint(303960177, A002);
            }
        }
        ((C71038Oa2) r3.getValue()).A03((Boolean) null, (Integer) null, num, (String) null, ocF.A04(), 303960177);
        ((C71038Oa2) r3.getValue()).A03(AnonymousClass7TE.A0v(), AnonymousClass05K.A00, num, (String) null, (Map) null, 303965077);
    }

    public final void A05(HashMap hashMap) {
        if (hashMap != null) {
            String A0r = DbS.A0r("selected_tag_types", hashMap);
            if (0qQ.A0K(hashMap.get("feedback_submitted"), RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
                C71093OcF ocF = this.A00;
                ocF.A03.Do1(A0r);
                ocF.A0E = true;
            }
            if (0qQ.A0K(hashMap.get("submit_report_failed"), RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
                this.A00.A03.Do0(A0r, (String) null, (String) null);
            }
        }
        C71093OcF ocF2 = this.A00;
        ocF2.A03.Cyb(ocF2.A0E);
    }
}
