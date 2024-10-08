package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.CollectionPrivacyModeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.save.model.SavedCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.I5w  reason: case insensitive filesystem */
public abstract class C56641I5w {
    public static void A02(CollectionPrivacyModeEnum collectionPrivacyModeEnum, AnonymousClass0iw r11, 1P0 r12, UserSession userSession, String str, String str2, String str3) {
        UserSession userSession2 = userSession;
        1NY A0N = DbU.A0N(userSession);
        String str4 = str;
        A0N.A0K("collections/%s/edit/", new Object[]{str});
        String str5 = str2;
        A0N.A9m(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2);
        A0N.A0R(1XP.class, 1XY.class);
        String str6 = str3;
        A0N.A0G("cover_media_id", str6);
        CollectionPrivacyModeEnum collectionPrivacyModeEnum2 = collectionPrivacyModeEnum;
        if (collectionPrivacyModeEnum != null) {
            A0N.A9m("privacy_mode", collectionPrivacyModeEnum.A00);
        }
        1OC A0U = DbT.A0U(A0N, true);
        A0U.A00 = new C54255H4y(r12, r11, userSession2, collectionPrivacyModeEnum2, str5, str4, str6, 1);
        1ES.A03(A0U);
    }

    public static 1NY A00(CollectionPrivacyModeEnum collectionPrivacyModeEnum, UserSession userSession, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("collections/create/");
        A0N.A9m(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        A0N.A9m("module_name", str2);
        A0N.A0R(SavedCollection.class, C18689Vwn.class);
        if (str3 != null) {
            A0N.A9m("added_media_fbids", 0mh.A00(DbV.A14(str3)));
        }
        if (list != null) {
            A0N.A9m("added_media_ids", 0mh.A00(list));
        }
        if (!(str4 == null || list == null || !list.contains(str4))) {
            A0N.A9m("cover_media_id", str4);
        }
        if (bool2.booleanValue()) {
            A0N.A9m(AnonymousClass000.A00(1575), "CLIPS_PLAYLIST");
        }
        if (collectionPrivacyModeEnum != null) {
            A0N.A9m("privacy_mode", collectionPrivacyModeEnum.A00);
        }
        A0N.A0G("surface", str5);
        A0N.A0E("with_search_text", bool);
        A0N.A0G(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str6);
        A0N.A0R = true;
        return A0N;
    }

    public static 1OC A01(UserSession userSession, String str, List list, Map map) {
        1NY A0O = DbU.A0O(userSession);
        A0O.A0A(C66579MXk.A00(717));
        A0O.A0R(C54074Gyy.class, C56341Hws.class);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1C.add(((C54665HMw) it.next()).A01);
        }
        A0O.A9m("collection_types", 0mh.A00(A1C));
        C3724090s.A06(A0O, str);
        if (map != null) {
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                C51974G9v.A1C(A0O, A0u);
            }
        }
        return A0O.A0M();
    }

    public static void A03(CollectionPrivacyModeEnum collectionPrivacyModeEnum, 1P0 r12, UserSession userSession, String str, String str2, String str3, List list, boolean z) {
        1NY A00 = A00(collectionPrivacyModeEnum, userSession, (Boolean) null, Boolean.valueOf(z), str, str2, (String) null, str3, (String) null, (String) null, list);
        A00.A0A("collections/create/");
        1OC A0M = A00.A0M();
        H51.A00(A0M, r12, userSession, 12);
        1ES.A03(A0M);
    }

    public static void A04(1P0 r4, UserSession userSession, String str) {
        1NY A0N = DbU.A0N(userSession);
        A0N.A0K("collections/%s/delete/", new Object[]{str});
        A0N.A0R(1XP.class, 1XY.class);
        1OC A0U = DbT.A0U(A0N, true);
        A0U.A00 = new EDL(r4, userSession, str, 14);
        1ES.A03(A0U);
    }
}
