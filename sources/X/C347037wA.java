package X;

import android.app.Activity;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.7wA  reason: invalid class name and case insensitive filesystem */
public abstract class C347037wA {
    public static final BrandedContentGatingInfo A00(BrandedContentGatingInfo brandedContentGatingInfo, AnonymousClass0iw r8, UserSession userSession, BrandedContentTag brandedContentTag, HashMap hashMap) {
        Integer num;
        0qQ.A0B(userSession, 0);
        if (hashMap == null) {
            return brandedContentGatingInfo;
        }
        String A00 = AnonymousClass000.A00(4661);
        String str = null;
        if (hashMap.containsKey(A00)) {
            if (brandedContentTag != null) {
                str = brandedContentTag.A01;
            }
            String obj = hashMap.toString();
            0qQ.A07(obj);
            0wc A01 = AnonymousClass0kN.A01(r8, userSession);
            0Aj A002 = A01.A00(A01.A00, "ig_media_country_block_gating_values_selected");
            A002.AAJ("gating_rules", obj);
            A002.AAJ("source_of_action", r8.getModuleName());
            A002.AAJ("sponsor_id", str);
            A002.Cgf();
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray((String) hashMap.get(A00));
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArray.getString(i);
                    0qQ.A07(string);
                    arrayList.add(string);
                }
                HashMap hashMap2 = brandedContentGatingInfo.A02;
                return CV8.A00(brandedContentGatingInfo.A00, brandedContentGatingInfo.A01, brandedContentGatingInfo.A03, arrayList, hashMap2);
            } catch (JSONException unused) {
                throw new IllegalArgumentException("Illegal Json string passed from Bloks");
            }
        } else {
            if (brandedContentTag != null) {
                str = brandedContentTag.A01;
            }
            String obj2 = hashMap.toString();
            0qQ.A07(obj2);
            0wc A012 = AnonymousClass0kN.A01(r8, userSession);
            0Aj A003 = A012.A00(A012.A00, "ig_media_age_geo_gating_values_selected");
            A003.AAJ("gating_rules", obj2);
            A003.AAJ("source_of_action", r8.getModuleName());
            A003.AAJ("sponsor_id", str);
            A003.Cgf();
            String A004 = AnonymousClass000.A00(1268);
            String str2 = (String) hashMap.get(A004);
            HashMap hashMap3 = brandedContentGatingInfo.A02;
            List list = brandedContentGatingInfo.A03;
            List list2 = brandedContentGatingInfo.A04;
            String str3 = brandedContentGatingInfo.A01;
            if (str2 == null || str2.length() == 0) {
                num = null;
            } else {
                num = Integer.valueOf(Integer.parseInt(str2));
            }
            BrandedContentGatingInfo A005 = CV8.A00(num, str3, list, list2, hashMap3);
            hashMap.remove(A004);
            List list3 = A005.A03;
            List list4 = A005.A04;
            Integer num2 = A005.A00;
            String str4 = A005.A01;
            HashMap hashMap4 = null;
            if (!hashMap.isEmpty()) {
                HashMap hashMap5 = new HashMap();
                for (Map.Entry entry : hashMap.entrySet()) {
                    Object key = entry.getKey();
                    String str5 = (String) entry.getValue();
                    if (str5 != null) {
                        hashMap5.put(key, Integer.valueOf(Integer.parseInt(str5)));
                    }
                }
                if (!hashMap5.isEmpty()) {
                    hashMap4 = hashMap5;
                }
            }
            return CV8.A00(num2, str4, list3, list4, hashMap4);
        }
    }

    public static final String A01(C268654dm r2) {
        0qQ.A0B(r2, 0);
        1XP r22 = (1XP) r2.A00();
        if (r22 == null) {
            return null;
        }
        String str = r22.mErrorType;
        if ("SPONSOR_CAN_NOT_BE_TAGGED".equals(str) || "CREATOR_CAN_NOT_TAG_BRAND_ONCE_POST_BEEN_PROMOTED".equals(str)) {
            return r22.getErrorMessage();
        }
        return null;
    }

    public static final void A03(Activity activity, UserSession userSession, 1Xj r7, User user, Class cls, String str) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(activity, 2);
        1NY r4 = new 1NY(userSession, -2);
        r4.A04();
        r4.A0A(002.A0g("media/", r7.getId(), "/edit_media/"));
        r4.A0Q(C61290K1b.class, C64024LJl.class);
        r4.A9m(Dbp.A02(0, 9, 37), 0qv.A00(activity));
        r4.A9m("container_module", str);
        r4.A0R = true;
        try {
            String id = user.getId();
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            A0A.A0c();
            A0A.A0q("removed");
            A0A.A0b();
            A0A.A0t(id);
            A0A.A0Y();
            A0A.A0Z();
            A0A.close();
            String obj = stringWriter.toString();
            0qQ.A07(obj);
            r4.A9m(AnonymousClass000.A00(4029), obj);
        } catch (IOException e) {
            0KC.A05(cls, "Unable to parse branded content tag", e);
        }
        1OC A0M = r4.A0M();
        A0M.A00 = new KAG(activity, userSession);
        1ES.A01().schedule(A0M);
    }

    public static final boolean A04(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        1Av A00 = 1Au.A00(userSession);
        Object CDM = A00.A0L.CDM(A00, 1Av.A8a[139]);
        if (0eE.A00(userSession).A00().A1O() || "eligible".equals(CDM)) {
            return true;
        }
        return false;
    }

    public static final boolean A05(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        1Av A00 = 1Au.A00(userSession);
        Object CDM = A00.A0L.CDM(A00, 1Av.A8a[139]);
        if (0eE.A00(userSession).A00().A1O() || "eligible".equals(CDM) || C66579MXk.A00(311).equals(CDM)) {
            return true;
        }
        return false;
    }

    public static final boolean A06(UserSession userSession, String str, boolean z, boolean z2) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str, 1);
        if ((!"story".equals(str) || !z || !z2) && 0eE.A00(userSession).A00().A2K() && 182.A06(0Tu.A05, userSession, 36311547600962130L)) {
            return true;
        }
        return false;
    }

    public static final String A02(List list, List list2) {
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A0A.A0c();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((BrandedContentTag) it.next()).A01;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        for (Object next : arrayList2) {
            String str2 = (String) next;
            if (str2 != null && (!(list2 instanceof Collection) || !list2.isEmpty())) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (str2.equals(((BrandedContentTag) it2.next()).A01)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            arrayList.add(next);
        }
        A0A.A0q("removed");
        A0A.A0b();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            A0A.A0t((String) it3.next());
        }
        A0A.A0Y();
        A0A.A0q("in");
        A0A.A0b();
        Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            BrandedContentTag brandedContentTag = (BrandedContentTag) it4.next();
            A0A.A0c();
            String str3 = brandedContentTag.A01;
            if (str3 != null) {
                A0A.A0R("sponsor_id", str3);
            }
            A0A.A0R("permission", String.valueOf(brandedContentTag.A04));
            A0A.A0S("is_pending", brandedContentTag.A03);
            A0A.A0Z();
        }
        A0A.A0Y();
        A0A.A0Z();
        A0A.close();
        String obj = stringWriter.toString();
        0qQ.A07(obj);
        return obj;
    }
}
