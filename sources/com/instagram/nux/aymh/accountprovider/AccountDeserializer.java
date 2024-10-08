package com.instagram.nux.aymh.accountprovider;

import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.C13491TbI;
import X.C13657TeO;
import X.C15050ULg;
import X.C273654mx;
import X.C49774F6h;
import X.C60937Jtv;
import X.Dbj;
import X.QP8;
import X.R2D;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.fx.access.constants.FxcalAccountType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.NoSuchElementException;

public final class AccountDeserializer implements C13657TeO {
    public final /* bridge */ /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, C13491TbI tbI) {
        String str;
        String str2;
        SimpleImageUrl simpleImageUrl;
        Object obj;
        String str3;
        String str4;
        String str5;
        String asString;
        0qQ.A0B(jsonElement, 0);
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        0qQ.A0A(asJsonObject);
        String asString2 = asJsonObject.get("accountSource").getAsString();
        0qQ.A07(asString2);
        for (Integer num : AnonymousClass05K.A00(10)) {
            if (0qQ.A0K(C49774F6h.A00(num), asString2)) {
                JsonElement jsonElement2 = asJsonObject.get(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
                if (jsonElement2 == null || (jsonElement2 instanceof R2D)) {
                    str = null;
                } else {
                    str = jsonElement2.getAsString();
                }
                JsonElement jsonElement3 = asJsonObject.get("userId");
                if (jsonElement3 == null || (jsonElement3 instanceof R2D)) {
                    str2 = null;
                } else {
                    str2 = jsonElement3.getAsString();
                }
                JsonElement jsonElement4 = asJsonObject.get("profileImageUrl");
                if (jsonElement4 == null || (asString = jsonElement4.getAsString()) == null) {
                    simpleImageUrl = null;
                } else {
                    simpleImageUrl = new SimpleImageUrl(asString);
                }
                JsonElement jsonElement5 = asJsonObject.get("authorizationData");
                switch (num.intValue()) {
                    case 0:
                    case 6:
                    case 7:
                    case 9:
                        0qQ.A0C(jsonElement5, "null cannot be cast to non-null type com.google.gson.JsonObject");
                        JsonObject jsonObject = (JsonObject) jsonElement5;
                        String asString3 = jsonObject.get(Dbj.A03()).getAsString();
                        JsonElement jsonElement6 = jsonObject.get("password");
                        if (jsonElement6 != null) {
                            str3 = jsonElement6.getAsString();
                        } else {
                            str3 = null;
                        }
                        0qQ.A0A(asString3);
                        obj = new C15050ULg(asString3, str3, 5);
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 8:
                        0qQ.A0C(jsonElement5, "null cannot be cast to non-null type com.google.gson.JsonObject");
                        JsonObject jsonObject2 = (JsonObject) jsonElement5;
                        String asString4 = jsonObject2.get("loginUserId").getAsString();
                        JsonElement jsonElement7 = jsonObject2.get("accessToken");
                        String str6 = null;
                        if (jsonElement7 != null) {
                            str4 = jsonElement7.getAsString();
                        } else {
                            str4 = null;
                        }
                        JsonElement jsonElement8 = jsonObject2.get("deviceBasedLoginToken");
                        if (jsonElement8 != null) {
                            str5 = jsonElement8.getAsString();
                        } else {
                            str5 = null;
                        }
                        JsonElement jsonElement9 = jsonObject2.get("fbId");
                        if (jsonElement9 != null) {
                            str6 = jsonElement9.getAsString();
                        }
                        Map map = FxcalAccountType.A01;
                        String asString5 = jsonObject2.get("accountType").getAsString();
                        0qQ.A07(asString5);
                        0qQ.A0A(asString4);
                        obj = new QP8((FxcalAccountType) FxcalAccountType.A01.get(asString5), asString4, str4, str5, str6);
                        break;
                    default:
                        throw AnonymousClass7TE.A1K();
                }
                return new C60937Jtv(simpleImageUrl, num, obj, str, str2);
            }
        }
        throw new NoSuchElementException(C273654mx.A00(5));
    }
}
