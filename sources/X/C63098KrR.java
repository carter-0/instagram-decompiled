package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.ProductAREffectContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KrR  reason: case insensitive filesystem */
public abstract class C63098KrR {
    public static final Reel A00(UserSession userSession, C60855JsO jsO, String str, int i) {
        ImmutableList A02;
        AnonymousClass3FZ r5;
        SimpleImageUrl simpleImageUrl;
        SimpleImageUrl simpleImageUrl2;
        ArrayList arrayList;
        ArrayList arrayList2;
        AnonymousClass3HX r4;
        String str2;
        boolean z;
        String optString;
        ImmutableList A03;
        ImmutableList A032;
        AnonymousClass3FZ A00;
        String A05;
        String A052;
        AnonymousClass3FZ A002 = jsO.A00(C60854JsN.class, "ar_effects");
        if (A002 == null || (A02 = A002.A02("effects_by_id", C60853JsM.class)) == null || (r5 = (AnonymousClass3FZ) 00k.A0J(A02)) == null) {
            return null;
        }
        AnonymousClass3FZ A003 = r5.A00(C60852JsL.class, AnonymousClass000.A00(381));
        String str3 = null;
        if (A003 == null || (A052 = A003.A05("uri")) == null) {
            simpleImageUrl = null;
        } else {
            simpleImageUrl = C253833rU.A00(DbT.A09(A052), -1, -1);
        }
        Class<C60849JsI> cls = C60849JsI.class;
        AnonymousClass3FZ A004 = r5.A00(cls, "attribution_user");
        if (A004 == null || (A00 = A004.A00(C60848JsH.class, "profile_picture")) == null || (A05 = A00.A05("uri")) == null) {
            simpleImageUrl2 = null;
        } else {
            simpleImageUrl2 = C253833rU.A00(DbT.A09(A05), -1, -1);
        }
        Class<C60850JsJ> cls2 = C60850JsJ.class;
        String A005 = C66579MXk.A00(60);
        AnonymousClass3FZ A006 = r5.A00(cls2, A005);
        if (A006 == null || (A032 = A006.A03("primary_actions", C348647yn.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) == null) {
            arrayList = 0sn.A00;
        } else {
            arrayList = AnonymousClass7TF.A0p(A032);
            Iterator it = A032.iterator();
            while (it.hasNext()) {
                DbU.A1X(it.next(), arrayList);
            }
        }
        AnonymousClass3FZ A007 = r5.A00(cls2, A005);
        if (A007 == null || (A03 = A007.A03("secondary_actions", C348647yn.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) == null) {
            arrayList2 = 0sn.A00;
        } else {
            arrayList2 = AnonymousClass7TF.A0p(A03);
            Iterator it2 = A03.iterator();
            while (it2.hasNext()) {
                DbU.A1X(it2.next(), arrayList2);
            }
        }
        AnonymousClass3FZ A008 = r5.A00(C60851JsK.class, "media");
        UserSession userSession2 = userSession;
        if (A008 == null || (optString = A008.A00.optString("preview_video")) == null) {
            r4 = AnonymousClass3P9.A00;
        } else {
            r4 = AnonymousClass3HR.parseFromJson(0c9.A04.A01(userSession2, optString));
        }
        Reel A0I = 1OP.A05(userSession2).A0I(r4, false);
        String A053 = r5.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (A053 == null) {
            A053 = AnonymousClass7TG.A0j();
        }
        String A054 = r5.A05(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        if (A054 == null) {
            A054 = "";
        }
        AnonymousClass3FZ A009 = r5.A00(cls, "attribution_user");
        if (A009 != null) {
            str2 = A009.A05(C46476Dff.A01());
        } else {
            str2 = null;
        }
        AnonymousClass3FZ A0010 = r5.A00(cls, "attribution_user");
        if (A0010 != null) {
            str3 = A0010.A05("instagram_user_id");
        }
        Enum A04 = r5.A04(C273654mx.A00(386), C348737yw.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        if (A04 != null) {
            z = A04.equals(C348737yw.SAVED);
        } else {
            z = false;
        }
        A0I.A0G = new AttributedAREffect(simpleImageUrl, simpleImageUrl2, (C62622Kit) null, (ProductAREffectContainer) null, A053, A054, str2, str3, (String) null, str, (String) null, arrayList, arrayList2, (List) null, i, z);
        return A0I;
    }
}
