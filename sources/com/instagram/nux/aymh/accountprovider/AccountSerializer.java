package com.instagram.nux.aymh.accountprovider;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C13492TbJ;
import X.C13658TeP;
import X.C15050ULg;
import X.C49774F6h;
import X.C60937Jtv;
import X.C7209Pzb;
import X.DbY;
import X.Dbj;
import X.QP8;
import X.R2D;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.instagram.common.typedurl.ImageUrl;
import java.lang.reflect.Type;

public final class AccountSerializer implements C13658TeP {
    public final /* bridge */ /* synthetic */ JsonElement serialize(Object obj, Type type, C13492TbJ tbJ) {
        String str;
        JsonElement A01;
        JsonObject jsonObject;
        String str2;
        String str3;
        C60937Jtv jtv = (C60937Jtv) obj;
        DbY.A1S(jtv, tbJ);
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, jtv.A03);
        jsonObject2.addProperty("userId", jtv.A04);
        Integer num = jtv.A01;
        jsonObject2.addProperty("accountSource", C49774F6h.A00(num));
        ImageUrl imageUrl = jtv.A00;
        if (imageUrl != null) {
            str = imageUrl.getUrl();
        } else {
            str = null;
        }
        Gson gson = ((C7209Pzb) tbJ).A00.A00;
        if (str == null) {
            A01 = R2D.A00;
        } else {
            A01 = gson.A01(str, str.getClass());
        }
        jsonObject2.add("profileImageUrl", A01);
        new JsonObject();
        switch (num.intValue()) {
            case 0:
            case 6:
            case 7:
            case 9:
                Object obj2 = jtv.A02;
                0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.nux.aymh.accountprovider.credentials.UsernameAndPasswordCredentials");
                C15050ULg uLg = (C15050ULg) obj2;
                jsonObject = new JsonObject();
                jsonObject.addProperty(Dbj.A03(), uLg.A01);
                str2 = uLg.A00;
                str3 = "password";
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                Object obj3 = jtv.A02;
                0qQ.A0C(obj3, "null cannot be cast to non-null type com.instagram.nux.aymh.accountprovider.credentials.TokenCredentials");
                QP8 qp8 = (QP8) obj3;
                jsonObject = new JsonObject();
                jsonObject.addProperty("loginUserId", qp8.A04);
                jsonObject.addProperty("accessToken", qp8.A01);
                jsonObject.addProperty("deviceBasedLoginToken", qp8.A02);
                jsonObject.addProperty("fbId", qp8.A03);
                str2 = String.valueOf(qp8.A00);
                str3 = "accountType";
                break;
            default:
                throw AnonymousClass7TE.A1K();
        }
        jsonObject.addProperty(str3, str2);
        jsonObject2.add("authorizationData", jsonObject);
        return jsonObject2;
    }
}
