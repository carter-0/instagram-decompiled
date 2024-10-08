package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

public abstract class XXC {
    public static final void A00(0wc r6, C254523sc r7, AnonymousClass4DU r8) {
        double d;
        long j;
        String str;
        Long A10;
        Long A102;
        0Aj A0e = AnonymousClass7TE.A0e(r6, AnonymousClass000.A00(662));
        0jB A01 = r7.A01();
        if (A0e.isSampled()) {
            String A1C = C51966G9m.A1C(C271774jZ.A8A, A01);
            String str2 = "";
            if (A1C == null) {
                A1C = str2;
            }
            A0e.AAJ("source_of_action", A1C);
            Number A0b = C21053XCe.A0b(C271774jZ.A8L, A01);
            double d2 = 0.0d;
            if (A0b != null) {
                d = (double) A0b.floatValue();
            } else {
                d = 0.0d;
            }
            A0e.A8D("start_x_position", Double.valueOf(d));
            Number A0b2 = C21053XCe.A0b(C271774jZ.A8M, A01);
            if (A0b2 != null) {
                d2 = (double) A0b2.floatValue();
            }
            A0e.A8D("start_y_position", Double.valueOf(d2));
            String A1C2 = C51966G9m.A1C(C271774jZ.A9T, A01);
            if (A1C2 == null) {
                A1C2 = str2;
            }
            A0e.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A1C2);
            String A1C3 = C51966G9m.A1C(C271774jZ.A5I, A01);
            if (A1C3 == null) {
                A1C3 = str2;
            }
            C51965G9l.A1I(A0e, A1C3);
            String A1C4 = C51966G9m.A1C(C271774jZ.A8O, A01);
            if (A1C4 != null) {
                str2 = A1C4;
            }
            A0e.AAJ("story_ranking_token", str2);
            String A1C5 = C51966G9m.A1C(C271774jZ.A9Q, A01);
            long j2 = 0;
            if (A1C5 == null || (A102 = AnonymousClass7TE.A10(A1C5)) == null) {
                j = 0;
            } else {
                j = A102.longValue();
            }
            A0e.A9F("tray_pos_excl_own_story", Long.valueOf(j));
            ArrayList arrayList = (ArrayList) A01.A01(C271774jZ.A2q);
            if (!(arrayList == null || (str = (String) 00k.A0O(arrayList, 0)) == null || (A10 = AnonymousClass7TE.A10(str)) == null)) {
                j2 = A10.longValue();
            }
            A0e.A9F("feed_sticker_media_id", Long.valueOf(j2));
            A0e.A7p("is_ad", false);
            C21053XCe.A0u(A0e, C271774jZ.A0Z, A01);
            C21055XCg.A1B(A0e, A01, C51966G9m.A13(C271774jZ.A0C, A01), "ad_id");
            C21055XCg.A0h(A0e, C271774jZ.A5a, A01);
            C21054XCf.A1T(A0e, A01);
            C21055XCg.A0q(A0e, A01);
            C21055XCg.A0u(A0e, A01);
            C21054XCf.A0z(A0e, A01);
            C21054XCf.A0Y(A0e, A01);
            A0e.AAJ("tray_session_id", C51966G9m.A1C(C271774jZ.A7X, A01));
            C21054XCf.A1U(A0e, A01);
            C21054XCf.A0h(A0e, A01);
            C21054XCf.A0q(A0e, A01);
            C21054XCf.A1C(A0e, A01);
            C21053XCe.A10(A0e, A01);
            C21054XCf.A0b(A0e, A01);
            C21054XCf.A0e(A0e, A01);
            A0e.A8D("current_play_time", C21053XCe.A0Z(C21053XCe.A0b(C271774jZ.A1w, A01)));
            C21054XCf.A0m(A0e, A01);
            C21054XCf.A0V(A0e, A01);
            A0e.A8D("end_x_position", C21055XCg.A0K(C271774jZ.A2S, A01));
            A0e.A8D("end_y_position", C21055XCg.A0K(C271774jZ.A2T, A01));
            A0e.A8D("x_velocity", C21055XCg.A0K(C271774jZ.A9u, A01));
            A0e.A8D("y_velocity", C21055XCg.A0K(C271774jZ.A9v, A01));
            C21054XCf.A0x(A0e, A01);
            A0e.A9F("sponsor_tag_count", C51966G9m.A13(C271774jZ.A8F, A01));
            C21055XCg.A1F(A0e, A01, "inventory_source", C51966G9m.A1C(C271774jZ.A3q, A01));
            C21055XCg.A0w(A0e, A01);
            C21055XCg.A18(A0e, A01, C21053XCe.A0Y(C271774jZ.A5T, A01), "media_time_paused");
            C21055XCg.A0m(A0e, A01);
            C21054XCf.A0T(A0e, A01);
            C21054XCf.A0A(A0e, A01);
            C21054XCf.A0I(A0e, A01);
            C21054XCf.A0L(A0e, A01);
            C21054XCf.A0B(A0e, A01);
            C21054XCf.A0D(A0e, A01);
            A0e.A9F("post_id", C51972G9s.A0i(C51966G9m.A1C(C271774jZ.A6Z, A01)));
            C21054XCf.A1V(A0e, A01);
            C21055XCg.A17(A0e, A01);
            C21054XCf.A0X(A0e, A01);
            C51969G9p.A19(A0e, r8);
            C21054XCf.A17(A0e, A01);
            C21055XCg.A1G(A0e, A01, "ranking_info_token", C51966G9m.A1C(C271774jZ.A6p, A01));
            C21055XCg.A1A(A0e, A01, C51966G9m.A13(C271774jZ.A9P, A01), "tray_position");
            C21054XCf.A0J(A0e, A01);
            DbX.A1L(A0e);
        }
    }
}
