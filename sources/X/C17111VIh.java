package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VIh  reason: case insensitive filesystem */
public abstract class C17111VIh {
    public static final void A00(17Z r4, ULl uLl) {
        0qQ.A0B(uLl, 1);
        r4.A0c();
        r4.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, uLl.A0L);
        String str = uLl.A0P;
        if (str != null) {
            r4.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        }
        String str2 = uLl.A0M;
        if (str2 != null) {
            r4.A0R("image_url", str2);
        }
        r4.A0O(AnonymousClass000.A00(644), uLl.A02);
        r4.A0O("image_width", uLl.A01);
        r4.A0O("image_height", uLl.A00);
        r4.A0O(AnonymousClass000.A00(809), uLl.A06);
        C41846B3n.A0z(r4, uLl.A0W);
        r4.A0P("font_size", uLl.A07);
        r4.A0O("text_x", uLl.A04);
        r4.A0O("text_y", uLl.A05);
        String str3 = uLl.A0a;
        if (str3 != null) {
            r4.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3);
        }
        r4.A0R("text_color", uLl.A0Y);
        r4.A0R(AnonymousClass000.A00(4096), uLl.A0X);
        r4.A0O(AnonymousClass000.A00(4095), uLl.A03);
        XMC xmc = uLl.A0D;
        if (xmc != null) {
            r4.A0q("location");
            XXr.A00(r4, xmc);
        }
        C15044UKx uKx = uLl.A0C;
        if (uKx != null) {
            r4.A0q("hashtag");
            r4.A0c();
            Boolean bool = uKx.A00;
            if (bool != null) {
                r4.A0S("allow_following", bool.booleanValue());
            }
            Boolean bool2 = uKx.A01;
            if (bool2 != null) {
                r4.A0S("allow_muting_story", bool2.booleanValue());
            }
            Integer num = uKx.A07;
            if (num != null) {
                r4.A0P("follow_status", num.intValue());
            }
            Integer num2 = uKx.A08;
            if (num2 != null) {
                r4.A0P("following", num2.intValue());
            }
            String str4 = uKx.A0A;
            if (str4 != null) {
                r4.A0R("formatted_media_count", str4);
            }
            Boolean bool3 = uKx.A02;
            if (bool3 != null) {
                r4.A0S("hide_use_hashtag_button", bool3.booleanValue());
            }
            String str5 = uKx.A0B;
            if (str5 != null) {
                r4.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str5);
            }
            Boolean bool4 = uKx.A03;
            if (bool4 != null) {
                r4.A0S("is_eligible_for_survey", bool4.booleanValue());
            }
            Boolean bool5 = uKx.A04;
            if (bool5 != null) {
                r4.A0S("is_local", bool5.booleanValue());
            }
            Integer num3 = uKx.A09;
            if (num3 != null) {
                r4.A0P("media_count", num3.intValue());
            }
            String str6 = uKx.A0C;
            if (str6 != null) {
                r4.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str6);
            }
            Boolean bool6 = uKx.A05;
            if (bool6 != null) {
                r4.A0S("non_violating", bool6.booleanValue());
            }
            String str7 = uKx.A0D;
            if (str7 != null) {
                r4.A0R("profile_pic_url", str7);
            }
            String str8 = uKx.A0E;
            if (str8 != null) {
                r4.A0R("search_result_subtitle", str8);
            }
            String str9 = uKx.A0F;
            if (str9 != null) {
                r4.A0R("search_subtitle", str9);
            }
            Boolean bool7 = uKx.A06;
            if (bool7 != null) {
                r4.A0S("use_default_avatar", bool7.booleanValue());
            }
            r4.A0Z();
        }
        String str10 = uLl.A0H;
        if (str10 != null) {
            r4.A0R("attribution", str10);
        }
        String str11 = uLl.A0S;
        if (str11 != null) {
            r4.A0R("question", str11);
        }
        List list = uLl.A0c;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r4, "question_types", list);
            while (A0s.hasNext()) {
                C16571UxO uxO = (C16571UxO) A0s.next();
                0qQ.A0B(uxO, 0);
                r4.A0t(uxO.A00);
            }
            r4.A0Y();
        }
        List list2 = uLl.A0d;
        if (list2 != null) {
            Iterator A0s2 = C41845B3m.A0s(r4, "response_types", list2);
            while (A0s2.hasNext()) {
                C16570UxN uxN = (C16570UxN) A0s2.next();
                0qQ.A0B(uxN, 0);
                r4.A0t(uxN.A00);
            }
            r4.A0Y();
        }
        String str12 = uLl.A0I;
        if (str12 != null) {
            r4.A0R("emoji", str12);
        }
        Boolean bool8 = uLl.A0F;
        if (bool8 != null) {
            r4.A0S("has_countdowns", bool8.booleanValue());
        }
        r4.A0P("num_active_collabs", uLl.A09);
        String str13 = uLl.A0N;
        if (str13 != null) {
            r4.A0R(AnonymousClass000.A00(3519), str13);
        }
        ULl uLl2 = uLl.A0E;
        if (uLl2 != null) {
            r4.A0q(AnonymousClass000.A00(3243));
            A00(r4, uLl2);
        }
        r4.A0R("prompt", uLl.A0R);
        r4.A0R("hint", uLl.A0K);
        List list3 = uLl.A0b;
        if (list3 != null) {
            Iterator A0s3 = C41845B3m.A0s(r4, "keywords", list3);
            while (A0s3.hasNext()) {
                C13988Tno.A1H(r4, A0s3);
            }
            r4.A0Y();
        }
        r4.A0R(AnonymousClass000.A00(792), uLl.A0T);
        r4.A0R(C273654mx.A00(95), uLl.A0U);
        String str14 = uLl.A0J;
        if (str14 != null) {
            r4.A0R("expression_id", str14);
        }
        String str15 = uLl.A0Q;
        if (str15 != null) {
            r4.A0R("profile_pic_url", str15);
        }
        String str16 = uLl.A0O;
        if (str16 != null) {
            r4.A0R("media_insights_id", str16);
        }
        r4.A0P("num_supporters", uLl.A0A);
        C41846B3n.A10(r4, uLl.A0Z);
        r4.A0Q(Pxd.A00(83), uLl.A0B);
        String str17 = uLl.A0V;
        if (str17 != null) {
            r4.A0R("surface", str17);
        }
        String str18 = uLl.A0G;
        if (str18 != null) {
            r4.A0R("accessibility_label", str18);
        }
        r4.A0P("fps", uLl.A08);
        r4.A0Z();
    }
}
