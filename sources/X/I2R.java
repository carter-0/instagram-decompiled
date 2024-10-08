package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public abstract class I2R {
    public static final void A02(AnonymousClass0iw r11, UserSession userSession, 1Xj r13, String str, String str2, long j, boolean z, boolean z2) {
        String str3;
        AnonymousClass0iw r4 = r11;
        UserSession userSession2 = userSession;
        String str4 = str;
        C51974G9v.A1K(userSession, r11, str);
        String str5 = "on_impression";
        String str6 = str2;
        if (!0qQ.A0K(str2, str5)) {
            str5 = "sfplt_in_menu";
        }
        1Xj r6 = r13;
        boolean z3 = z;
        if (182.A06(0Tu.A05, userSession2, 36312183257301956L)) {
            I7O.A07(r4, userSession2, r6, str5, r13.A0C.B2y(), str4, (String) null, (String) null, str6, j, z3, z2);
            return;
        }
        String A2n = r13.A2n();
        if (A2n != null) {
            String BkE = r13.A0C.BkE();
            String Bt7 = r13.A0C.Bt7();
            1NY A0a = AnonymousClass7TG.A0a(userSession2);
            if (z) {
                str3 = "clips/hide/";
            } else {
                str3 = "clips/unhide/";
            }
            A0a.A0E = str3;
            A0a.A9m("clips_media_id", A2n);
            A0a.A0G("recommendation_data", BkE);
            A0a.A0G("sfplt_token", Bt7);
            1ES.A03(DbU.A0S(A0a, 1XP.class, 1XY.class));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final 1NY A00(UserSession userSession, String str) {
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("clips/trend/");
        C51968G9o.A1J(A0a, C298815u5.class, AnonymousClass93W.class, str);
        return A0a;
    }

    public static final 1OC A01(ClipsViewerSource clipsViewerSource, UserSession userSession, String str, String str2) {
        1NY A0M = DbU.A0M(userSession);
        Integer num = AnonymousClass05K.A01;
        A0M.A08(num);
        A0M.A0A("clips/playlist_clips/");
        C51968G9o.A1M(A0M, "playlist_id", str, str2);
        A0M.A0G(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, clipsViewerSource.A00);
        A0M.A0A = "clips/playlist_clips/";
        A0M.A07(num);
        C51972G9s.A18(A0M, userSession, AnonymousClass93W.class);
        return A0M.A0M();
    }
}
