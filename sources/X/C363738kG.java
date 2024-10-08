package X;

import com.facebook.common.callercontext.CallerContext;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.8kG  reason: invalid class name and case insensitive filesystem */
public final class C363738kG implements AnonymousClass2Kv {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C363698kC A01;

    public C363738kG(UserSession userSession, C363698kC r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r1v20, types: [java.lang.Object, X.8jk] */
    /* JADX WARNING: type inference failed for: r1v26, types: [X.8jm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v4, types: [java.lang.Object, X.805] */
    /* JADX WARNING: type inference failed for: r1v34, types: [java.lang.Object, X.805] */
    /* JADX WARNING: type inference failed for: r7v14, types: [java.lang.Object, X.805] */
    public final void invoke(AnonymousClass3JD r36) {
        LinkedHashMap linkedHashMap;
        ImmutableList<C250663lr> immutableList;
        String str;
        C250663lr r0;
        ImmutableList requiredCompactedTreeListField;
        String str2;
        String str3;
        String str4;
        AnonymousClass805 r7;
        AnonymousClass805 r1;
        C250663lr optionalTreeField;
        C250663lr optionalTreeField2;
        C250663lr optionalTreeField3;
        if (r36 == null) {
            this.A01.A00(new Throwable("GraphQL response is null"));
            return;
        }
        C250663lr r4 = (C250663lr) r36.Bny();
        if (r4 != null) {
            C363698kC r3 = this.A01;
            UserSession userSession = this.A00;
            Class<AnonymousClass5w5> cls = AnonymousClass5w5.class;
            C250663lr optionalTreeField4 = r4.getOptionalTreeField(0, "fx_service_cache(caller_name:$caller_name,client_caller_name:$client_caller_name,custom_partner_params:$custom_partner_params,service_names:$service_names)", cls, 1159217915);
            if (optionalTreeField4 == null || (requiredCompactedTreeListField = optionalTreeField4.getRequiredCompactedTreeListField(0, "services", AnonymousClass5w6.class, 139359514)) == null) {
                linkedHashMap = 0Yt.A0E();
            } else {
                int A0L = 0se.A0L(0Yv.A1E(requiredCompactedTreeListField, 10));
                if (A0L < 16) {
                    A0L = 16;
                }
                linkedHashMap = new LinkedHashMap(A0L);
                Iterator it = requiredCompactedTreeListField.iterator();
                while (it.hasNext()) {
                    C250663lr r6 = (C250663lr) it.next();
                    C363718kE r02 = (C363718kE) r6.getOptionalEnumField(0, "service_name", C363718kE.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (r02 == null || (str2 = r02.name()) == null) {
                        str2 = "";
                    }
                    C3019360t r03 = (C3019360t) r6.getOptionalEnumField(1, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, C3019360t.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (r03 == null || (str3 = r03.name()) == null) {
                        str3 = "";
                    }
                    ImmutableList requiredCompactedTreeListField2 = r6.getRequiredCompactedTreeListField(4, "identity_mapping", C3019260s.class, 85196813);
                    0qQ.A07(requiredCompactedTreeListField2);
                    ArrayList arrayList = new ArrayList(0Yv.A1E(requiredCompactedTreeListField2, 10));
                    Iterator it2 = requiredCompactedTreeListField2.iterator();
                    while (it2.hasNext()) {
                        C250663lr r9 = (C250663lr) it2.next();
                        String optionalStringField = r9.getOptionalStringField(0, "source_identity_id");
                        if (optionalStringField == null) {
                            optionalStringField = "";
                        }
                        ImmutableList requiredCompactedTreeListField3 = r9.getRequiredCompactedTreeListField(1, "destination_identities", C3019460u.class, 1322015678);
                        0qQ.A07(requiredCompactedTreeListField3);
                        ArrayList arrayList2 = new ArrayList(0Yv.A1E(requiredCompactedTreeListField3, 10));
                        Iterator it3 = requiredCompactedTreeListField3.iterator();
                        while (it3.hasNext()) {
                            C250663lr r13 = (C250663lr) it3.next();
                            String optionalStringField2 = r13.getOptionalStringField(1, "identity_id");
                            String str5 = "";
                            if (optionalStringField2 == null) {
                                optionalStringField2 = str5;
                            }
                            C3019660w r04 = (C3019660w) r13.getOptionalEnumField(2, "identity_type", C3019660w.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                            AnonymousClass805 r11 = null;
                            if (r04 == null || (str4 = r04.name()) == null) {
                                str4 = str5;
                            }
                            String optionalStringField3 = r13.getOptionalStringField(0, "obfuscated_identity_id");
                            if (optionalStringField3 == null) {
                                optionalStringField3 = str5;
                            }
                            Class<C3019560v> cls2 = C3019560v.class;
                            C250663lr optionalTreeField5 = r13.getOptionalTreeField(3, "surface_to_xpost_eligibility", cls2, -1959246681);
                            if (optionalTreeField5 == null || (optionalTreeField3 = optionalTreeField5.getOptionalTreeField(0, "feed", C3019760x.class, 1129334296)) == null) {
                                r7 = null;
                            } else {
                                boolean coercedBooleanField = optionalTreeField3.getCoercedBooleanField(0, "is_eligible");
                                String optionalStringField4 = optionalTreeField3.getOptionalStringField(1, "ineligible_reason");
                                if (optionalStringField4 == null) {
                                    optionalStringField4 = str5;
                                }
                                ? obj = new Object();
                                obj.A01 = "feed";
                                obj.A02 = coercedBooleanField;
                                obj.A00 = optionalStringField4;
                                r7 = obj;
                            }
                            C250663lr optionalTreeField6 = r13.getOptionalTreeField(3, "surface_to_xpost_eligibility", cls2, -1959246681);
                            if (optionalTreeField6 == null || (optionalTreeField2 = optionalTreeField6.getOptionalTreeField(1, "story", C3019860y.class, -1718691780)) == null) {
                                r1 = null;
                            } else {
                                boolean coercedBooleanField2 = optionalTreeField2.getCoercedBooleanField(0, "is_eligible");
                                String optionalStringField5 = optionalTreeField2.getOptionalStringField(1, "ineligible_reason");
                                if (optionalStringField5 == null) {
                                    optionalStringField5 = str5;
                                }
                                ? obj2 = new Object();
                                obj2.A01 = "story";
                                obj2.A02 = coercedBooleanField2;
                                obj2.A00 = optionalStringField5;
                                r1 = obj2;
                            }
                            C250663lr optionalTreeField7 = r13.getOptionalTreeField(3, "surface_to_xpost_eligibility", cls2, -1959246681);
                            if (!(optionalTreeField7 == null || (optionalTreeField = optionalTreeField7.getOptionalTreeField(2, "reels", C3019960z.class, -1245036760)) == null)) {
                                boolean coercedBooleanField3 = optionalTreeField.getCoercedBooleanField(0, "is_eligible");
                                String optionalStringField6 = optionalTreeField.getOptionalStringField(1, "ineligible_reason");
                                if (optionalStringField6 != null) {
                                    str5 = optionalStringField6;
                                }
                                ? obj3 = new Object();
                                obj3.A01 = "reels";
                                obj3.A02 = coercedBooleanField3;
                                obj3.A00 = str5;
                                r11 = obj3;
                            }
                            AnonymousClass805[] r05 = {r7, r1, r11};
                            0qQ.A0B(r05, 0);
                            arrayList2.add(new C363488jo(optionalStringField2, str4, optionalStringField3, 03t.A0I(r05)));
                        }
                        ? obj4 = new Object();
                        obj4.A00 = optionalStringField;
                        obj4.A01 = arrayList2;
                        arrayList.add(obj4);
                    }
                    ImmutableList requiredCompactedTreeListField4 = r6.getRequiredCompactedTreeListField(2, "extra_client_cache_data", AnonymousClass60q.class, -729702242);
                    0qQ.A07(requiredCompactedTreeListField4);
                    HashMap hashMap = new HashMap();
                    Iterator it4 = requiredCompactedTreeListField4.iterator();
                    while (it4.hasNext()) {
                        C250663lr r8 = (C250663lr) it4.next();
                        String optionalStringField7 = r8.getOptionalStringField(0, "data_key");
                        String str6 = "";
                        if (optionalStringField7 == null) {
                            optionalStringField7 = str6;
                        }
                        String A08 = r8.A08("data_value");
                        if (A08 != null) {
                            str6 = A08;
                        }
                        hashMap.put(optionalStringField7, str6);
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    0qQ.A0B(hashMap, 3);
                    ? obj5 = new Object();
                    obj5.A01 = str3;
                    obj5.A03 = arrayList;
                    obj5.A02 = hashMap;
                    obj5.A00 = currentTimeMillis;
                    linkedHashMap.put(str2, obj5);
                }
            }
            ImmutableList immutableList2 = 0sn.A00;
            System.currentTimeMillis();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            C250663lr optionalTreeField8 = r4.getOptionalTreeField(0, "fx_service_cache(caller_name:$caller_name,client_caller_name:$client_caller_name,custom_partner_params:$custom_partner_params,service_names:$service_names)", cls, 1159217915);
            if (optionalTreeField8 == null || (immutableList = optionalTreeField8.getRequiredCompactedTreeListField(0, "services", AnonymousClass5w6.class, 139359514)) == null) {
                immutableList = immutableList2;
            }
            for (C250663lr r112 : immutableList) {
                Class<AnonymousClass60r> cls3 = AnonymousClass60r.class;
                if (r112.getOptionalTreeField(3, "custom_service_data", cls3, 897468673) != null) {
                    C363718kE r06 = (C363718kE) r112.getOptionalEnumField(0, "service_name", C363718kE.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (r06 == null || (str = r06.name()) == null) {
                        str = "";
                    }
                    C250663lr optionalTreeField9 = r112.getOptionalTreeField(3, "custom_service_data", cls3, 897468673);
                    if (optionalTreeField9 != null) {
                        r0 = optionalTreeField9.reinterpretRequired(0, AnonymousClass610.class, -1583918415);
                    } else {
                        r0 = null;
                    }
                    linkedHashMap2.put(str, r0);
                }
            }
            AnonymousClass0t1.A01.A01(userSession).A03.getFbidV2();
            C363428ji r82 = r3.A01;
            1wg r10 = r82.A04;
            String str7 = r3.A03;
            CallerContext callerContext = r3.A00;
            String str8 = callerContext.A02;
            0qQ.A07(str8);
            r10.A04("service_manual_fetch_success", str7, 00k.A0a(linkedHashMap.keySet()), 0Yt.A02(new 0eP[]{new 0eP("caller_class", str8)}));
            List list = r3.A04;
            int A0L2 = 0se.A0L(0Yv.A1E(list, 10));
            if (A0L2 < 16) {
                A0L2 = 16;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(A0L2);
            for (Object next : list) {
                linkedHashMap3.put(next, linkedHashMap.get(next));
            }
            r82.A04(callerContext, str7, linkedHashMap3);
            r82.A00 = 0Yt.A03(linkedHashMap2);
            C363768kJ r07 = r3.A02;
            if (r07 != null) {
                r07.onSuccess();
            }
        }
    }
}
