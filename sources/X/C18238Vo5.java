package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vo5  reason: case insensitive filesystem */
public abstract class C18238Vo5 {
    public static 1NY A00(UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z) {
        String str9;
        1NY A0N = DbU.A0N(userSession);
        if (z) {
            str9 = "media/%s/%s/clips_question_response/";
        } else {
            str9 = "media/%s/%s/story_question_response/";
        }
        A0N.A0A(StringFormatUtil.formatStrLocaleSafe(str9, str, str2));
        A0N.A0R(1XP.class, 1XY.class);
        A0N.A9m(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3);
        A0N.A9m(AnonymousClass000.A00(2790), str4);
        A0N.A9m(AnonymousClass000.A00(5077), str5);
        A0N.A0G("container_module", str6);
        A0N.A9m(AnonymousClass000.A00(76), str7);
        A0N.A9m("tray_session_id", str8);
        A0N.A0C("tray_position", i);
        A0N.A9m("nav_chain", DbS.A0k());
        A0N.A0R = true;
        return A0N;
    }

    public static 1OC A01(UserSession userSession, C17801VgE vgE) {
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A(String.format("media/%s/delete_story_question_response/", new Object[]{vgE.A00.A07}));
        A0N.A9m("question_id", vgE.A01.A08);
        A0N.A0R(1XP.class, 1XY.class);
        A0N.A0R = true;
        return A0N.A0M();
    }
}
