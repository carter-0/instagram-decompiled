package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.5kN  reason: invalid class name and case insensitive filesystem */
public abstract class C293225kN {
    public static void A00(17Z r2, DirectThreadThemeInfo directThreadThemeInfo) {
        int i;
        r2.A0c();
        String str = directThreadThemeInfo.A0b;
        if (str != null) {
            r2.A0R("fallback_color", str);
        }
        String str2 = directThreadThemeInfo.A0M;
        if (str2 != null) {
            r2.A0R("dark_fallback_color", str2);
        }
        String str3 = directThreadThemeInfo.A0o;
        if (str3 != null) {
            r2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3);
        }
        String str4 = directThreadThemeInfo.A0f;
        if (str4 != null) {
            r2.A0R("accessibility_label", str4);
        }
        if (directThreadThemeInfo.A0s != null) {
            16P.A03(r2, "gradient_colors");
            for (String str5 : directThreadThemeInfo.A0s) {
                if (str5 != null) {
                    r2.A0t(str5);
                }
            }
            r2.A0Y();
        }
        if (directThreadThemeInfo.A0q != null) {
            16P.A03(r2, "dark_gradient_colors");
            for (String str6 : directThreadThemeInfo.A0q) {
                if (str6 != null) {
                    r2.A0t(str6);
                }
            }
            r2.A0Y();
        }
        String str7 = directThreadThemeInfo.A0Z;
        if (str7 != null) {
            r2.A0R("background_color", str7);
        }
        String str8 = directThreadThemeInfo.A0K;
        if (str8 != null) {
            r2.A0R("dark_background_color", str8);
        }
        Integer num = directThreadThemeInfo.A0A;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    i = 2;
                    break;
                case 2:
                    i = 3;
                    break;
                default:
                    i = 1;
                    break;
            }
            r2.A0P("thread_view_mode", i);
        }
        String str9 = directThreadThemeInfo.A0l;
        if (str9 != null) {
            r2.A0R("light_large_background_image_uri", str9);
        }
        String str10 = directThreadThemeInfo.A0i;
        if (str10 != null) {
            r2.A0R("dark_large_background_image_uri", str10);
        }
        r2.A0P("accessibility_label_id", directThreadThemeInfo.A00);
        String str11 = directThreadThemeInfo.A0a;
        if (str11 != null) {
            r2.A0R("composer_color", str11);
        }
        String str12 = directThreadThemeInfo.A0L;
        if (str12 != null) {
            r2.A0R("dark_composer_color", str12);
        }
        r2.A0P("light_theme_background_drawable_resource_id", directThreadThemeInfo.A06);
        r2.A0P("dark_theme_background_drawable_resource_id", directThreadThemeInfo.A02);
        r2.A0P("light_preview_icon_drawable_resource_id", directThreadThemeInfo.A07);
        r2.A0P("dark_preview_icon_drawable_resource_id", directThreadThemeInfo.A03);
        String str13 = directThreadThemeInfo.A0n;
        if (str13 != null) {
            r2.A0R("light_preview_icon_uri", str13);
        }
        String str14 = directThreadThemeInfo.A0j;
        if (str14 != null) {
            r2.A0R("dark_preview_icon_uri", str14);
        }
        String str15 = directThreadThemeInfo.A0m;
        if (str15 != null) {
            r2.A0R("light_background_preview_uri", str15);
        }
        String str16 = directThreadThemeInfo.A0h;
        if (str16 != null) {
            r2.A0R("dark_background_preview_uri", str16);
        }
        String str17 = directThreadThemeInfo.A0c;
        if (str17 != null) {
            r2.A0R("light_theme_incoming_message_bubble_color", str17);
        }
        String str18 = directThreadThemeInfo.A0N;
        if (str18 != null) {
            r2.A0R("dark_theme_incoming_message_bubble_color", str18);
        }
        r2.A0P("bubble_border_width", directThreadThemeInfo.A01);
        r2.A0P("ungroupable_bubble_corner_radius", directThreadThemeInfo.A08);
        r2.A0P("groupable_bubble_corner_radius", directThreadThemeInfo.A05);
        String str19 = directThreadThemeInfo.A0d;
        if (str19 != null) {
            r2.A0R("light_theme_nav_bar_color", str19);
        }
        String str20 = directThreadThemeInfo.A0O;
        if (str20 != null) {
            r2.A0R("dark_theme_nav_bar_color", str20);
        }
        String str21 = directThreadThemeInfo.A0e;
        if (str21 != null) {
            r2.A0R("light_theme_nav_bar_subtitle_color", str21);
        }
        String str22 = directThreadThemeInfo.A0P;
        if (str22 != null) {
            r2.A0R("dark_theme_nav_bar_subtitle_color", str22);
        }
        String str23 = directThreadThemeInfo.A0Y;
        if (str23 != null) {
            r2.A0R("light_primary_text_message_from_me_color", str23);
        }
        String str24 = directThreadThemeInfo.A0J;
        if (str24 != null) {
            r2.A0R("dark_primary_text_message_from_me_color", str24);
        }
        String str25 = directThreadThemeInfo.A0S;
        if (str25 != null) {
            r2.A0R("light_composer_border_color", str25);
        }
        String str26 = directThreadThemeInfo.A0D;
        if (str26 != null) {
            r2.A0R("dark_composer_border_color", str26);
        }
        if (directThreadThemeInfo.A0r != null) {
            16P.A03(r2, "light_composer_icon_background_colors");
            for (String str27 : directThreadThemeInfo.A0r) {
                if (str27 != null) {
                    r2.A0t(str27);
                }
            }
            r2.A0Y();
        }
        if (directThreadThemeInfo.A0p != null) {
            16P.A03(r2, "dark_composer_icon_background_colors");
            for (String str28 : directThreadThemeInfo.A0p) {
                if (str28 != null) {
                    r2.A0t(str28);
                }
            }
            r2.A0Y();
        }
        String str29 = directThreadThemeInfo.A0T;
        if (str29 != null) {
            r2.A0R("light_composer_icon_color", str29);
        }
        String str30 = directThreadThemeInfo.A0E;
        if (str30 != null) {
            r2.A0R("dark_composer_icon_color", str30);
        }
        String str31 = directThreadThemeInfo.A0Q;
        if (str31 != null) {
            r2.A0R("light_action_bar_badge_color", str31);
        }
        String str32 = directThreadThemeInfo.A0B;
        if (str32 != null) {
            r2.A0R("dark_action_bar_badge_color", str32);
        }
        String str33 = directThreadThemeInfo.A0V;
        if (str33 != null) {
            r2.A0R("light_message_attribution_color", str33);
        }
        String str34 = directThreadThemeInfo.A0G;
        if (str34 != null) {
            r2.A0R("dark_message_attribution_color", str34);
        }
        String str35 = directThreadThemeInfo.A0W;
        if (str35 != null) {
            r2.A0R("light_message_context_line_color", str35);
        }
        String str36 = directThreadThemeInfo.A0H;
        if (str36 != null) {
            r2.A0R("dark_message_context_line_color", str36);
        }
        r2.A0P("extra_theme_info", directThreadThemeInfo.A04);
        String str37 = directThreadThemeInfo.A0k;
        if (str37 != null) {
            r2.A0R("extra_theme_info_string", str37);
        }
        String str38 = directThreadThemeInfo.A0X;
        if (str38 != null) {
            r2.A0R("light_primary_button_text_color", str38);
        }
        String str39 = directThreadThemeInfo.A0I;
        if (str39 != null) {
            r2.A0R("dark_primary_button_text_color", str39);
        }
        r2.A0S("force_dark_naviation_bar", directThreadThemeInfo.A0t);
        String str40 = directThreadThemeInfo.A0U;
        if (str40 != null) {
            r2.A0R("light_input_placeholder_text_color", str40);
        }
        String str41 = directThreadThemeInfo.A0F;
        if (str41 != null) {
            r2.A0R("dark_input_placeholder_text_color", str41);
        }
        String str42 = directThreadThemeInfo.A0g;
        if (str42 != null) {
            r2.A0R("custom_background_drawable_url", str42);
        }
        String str43 = directThreadThemeInfo.A0R;
        if (str43 != null) {
            r2.A0R("light_bottom_gradient_color", str43);
        }
        String str44 = directThreadThemeInfo.A0C;
        if (str44 != null) {
            r2.A0R("dark_bottom_gradient_color", str44);
        }
        r2.A0Z();
    }
}
