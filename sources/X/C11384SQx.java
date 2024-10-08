package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.SQx  reason: case insensitive filesystem */
public final class C11384SQx {
    public static String A01(Object obj, Map map) {
        Object obj2 = map.get(obj);
        if (obj2 != null) {
            return obj2.toString();
        }
        return null;
    }

    public static final Map A02(AutofillData autofillData) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        Object obj20;
        Object obj21;
        Object obj22 = null;
        AutofillData autofillData2 = autofillData;
        if (autofillData != null) {
            obj22 = autofillData2.A00.get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        }
        Object obj23 = "";
        if (obj22 == null) {
            obj22 = obj23;
        }
        0eP A1L = AnonymousClass7TE.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, obj22);
        if (autofillData == null || (obj = autofillData2.A00.get("family-name")) == null) {
            obj = obj23;
        }
        0eP A1L2 = AnonymousClass7TE.A1L("family_name", obj);
        if (autofillData == null || (obj2 = autofillData2.A00.get("given-name")) == null) {
            obj2 = obj23;
        }
        0eP A1L3 = AnonymousClass7TE.A1L("given_name", obj2);
        if (autofillData == null || (obj3 = autofillData2.A00.get("tel")) == null) {
            obj3 = obj23;
        }
        0eP A1L4 = AnonymousClass7TE.A1L("tel", obj3);
        if (autofillData == null || (obj4 = autofillData2.A00.get("tel-country-code")) == null) {
            obj4 = obj23;
        }
        0eP A1L5 = AnonymousClass7TE.A1L("tel_country_code", obj4);
        if (autofillData == null || (obj5 = autofillData2.A00.get("tel-national")) == null) {
            obj5 = obj23;
        }
        0eP A1L6 = AnonymousClass7TE.A1L("tel_national", obj5);
        if (autofillData == null || (obj6 = autofillData2.A00.get("tel-area-code")) == null) {
            obj6 = obj23;
        }
        0eP A1L7 = AnonymousClass7TE.A1L("tel_area_code", obj6);
        if (autofillData == null || (obj7 = autofillData2.A00.get("tel-local")) == null) {
            obj7 = obj23;
        }
        0eP A1L8 = AnonymousClass7TE.A1L("tel_local", obj7);
        if (autofillData == null || (obj8 = autofillData2.A00.get("tel-local-prefix")) == null) {
            obj8 = obj23;
        }
        0eP A1L9 = AnonymousClass7TE.A1L("tel_local_prefix", obj8);
        if (autofillData == null || (obj9 = autofillData2.A00.get("tel-local-suffix")) == null) {
            obj9 = obj23;
        }
        0eP A1L10 = AnonymousClass7TE.A1L("tel_local_suffix", obj9);
        if (autofillData == null || (obj10 = autofillData2.A00.get("postal-code")) == null) {
            obj10 = obj23;
        }
        0eP A1L11 = AnonymousClass7TE.A1L("postal_code", obj10);
        if (autofillData == null || (obj11 = autofillData2.A00.get("country")) == null) {
            obj11 = obj23;
        }
        0eP A1L12 = AnonymousClass7TE.A1L("country", obj11);
        if (autofillData == null || (obj12 = autofillData2.A00.get("street-address")) == null) {
            obj12 = obj23;
        }
        0eP A1L13 = AnonymousClass7TE.A1L("street_address", obj12);
        if (autofillData == null || (obj13 = DbT.A11("address-line1", autofillData2.A00)) == null) {
            obj13 = obj23;
        }
        0eP A1L14 = AnonymousClass7TE.A1L("address_line1", obj13);
        if (autofillData == null || (obj14 = autofillData2.A00.get("address-line2")) == null) {
            obj14 = obj23;
        }
        0eP A1L15 = AnonymousClass7TE.A1L("address_line2", obj14);
        if (autofillData == null || (obj15 = autofillData2.A00.get("address-line3")) == null) {
            obj15 = obj23;
        }
        0eP A1L16 = AnonymousClass7TE.A1L("address_line3", obj15);
        if (autofillData == null || (obj16 = autofillData2.A00.get("address-level1")) == null) {
            obj16 = obj23;
        }
        0eP A1L17 = AnonymousClass7TE.A1L("address_level1", obj16);
        if (autofillData == null || (obj17 = autofillData2.A00.get("address-level2")) == null) {
            obj17 = obj23;
        }
        0eP A1L18 = AnonymousClass7TE.A1L("address_level2", obj17);
        if (autofillData == null || (obj18 = autofillData2.A00.get("address-level3")) == null) {
            obj18 = obj23;
        }
        0eP A1L19 = AnonymousClass7TE.A1L("address_level3", obj18);
        if (autofillData == null || (obj19 = autofillData2.A00.get("address-level4")) == null) {
            obj19 = obj23;
        }
        0eP A1L20 = AnonymousClass7TE.A1L("address_level4", obj19);
        if (autofillData == null || (obj20 = autofillData2.A00.get("email")) == null) {
            obj20 = obj23;
        }
        0eP A1L21 = AnonymousClass7TE.A1L("email", obj20);
        if (!(autofillData == null || (obj21 = autofillData2.A00.get("ent_id")) == null)) {
            obj23 = obj21;
        }
        LinkedHashMap A06 = 0Yt.A06(new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, A1L15, A1L16, A1L17, A1L18, A1L19, A1L20, A1L21, AnonymousClass7TE.A1L("ent_id", obj23)});
        0qQ.A0C(A06, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, java.lang.Object>");
        return A06;
    }

    public static final AutofillData A00(Map map, boolean z) {
        String str;
        Object obj;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("skip_graphql_save_request_for_bloks", String.valueOf(z));
        Object obj2 = map.get("given_name");
        if (obj2 != null) {
            str = obj2.toString();
        } else {
            str = null;
        }
        A1E.put("given-name", str);
        A1E.put("family-name", A01("family_name", map));
        A1E.put("street-address", A01("street_address", map));
        A1E.put("address-line1", A01("address_line1", map));
        A1E.put("address-line2", A01("address_line2", map));
        A1E.put("address-line3", A01("address_line3", map));
        A1E.put("address-level1", A01("address_level1", map));
        A1E.put("address-level2", A01("address_level2", map));
        A1E.put("address-level3", A01("address_level3", map));
        A1E.put("address-level4", A01("address_level4", map));
        A1E.put("postal-code", A01("postal_code", map));
        A1E.put("tel", A01("tel", map));
        A1E.put("tel-country-code", A01("tel_country_code", map));
        A1E.put("tel-national", A01("tel_national", map));
        A1E.put("tel-area-code", A01("tel_area_code", map));
        A1E.put("tel-local", A01("tel_local", map));
        A1E.put("tel-local-prefix", A01("tel_local_prefix", map));
        A1E.put("tel-local-suffix", A01("tel_local_suffix", map));
        A1E.put("email", A01("email", map));
        A1E.put("ent_id", A01("ent_id", map));
        LinkedHashMap A0x = DbS.A0x(0se.A0L(A1E.size()));
        Iterator A0s = AnonymousClass7TF.A0s(A1E);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            Object key = A1J.getKey();
            CharSequence charSequence = (CharSequence) A1J.getValue();
            if (charSequence == null || 00l.A0W(charSequence)) {
                obj = null;
            } else {
                obj = A1J.getValue();
            }
            A0x.put(key, obj);
        }
        return new AutofillData((Map) A0x);
    }

    public final LinkedHashMap A03(AutofillData autofillData) {
        Map A02 = A02(autofillData);
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        Iterator A0u = AnonymousClass7TF.A0u(A02);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (((CharSequence) A1J.getValue()).length() > 0) {
                Dbb.A1V(A1J, A1H);
            }
        }
        return A1H;
    }
}
