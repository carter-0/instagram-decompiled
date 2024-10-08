package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.AppColorMode;
import com.instagram.api.schemas.DirectMediaFallbackUrl;
import com.instagram.api.schemas.ThreadThemeType;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8wn  reason: invalid class name and case insensitive filesystem */
public abstract class C370638wn {
    public static C370688wu parseFromJson(16F r76) {
        String str;
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        String str2;
        16F r1 = r76;
        0qQ.A0B(r1, 0);
        try {
            Boolean bool = null;
            if (r1.A11() != 16L.A0D) {
                r1.A0z();
                return null;
            }
            Integer num = null;
            String str3 = null;
            ArrayList arrayList = null;
            AppColorMode appColorMode = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            Integer num2 = null;
            ArrayList arrayList2 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            ArrayList arrayList3 = null;
            C370738wz r29 = null;
            ArrayList arrayList4 = null;
            String str13 = null;
            String str14 = null;
            ArrayList arrayList5 = null;
            C370658wq r30 = null;
            String str15 = null;
            String str16 = null;
            Boolean bool2 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            String str30 = null;
            String str31 = null;
            String str32 = null;
            String str33 = null;
            Long l = null;
            ThreadThemeType threadThemeType = null;
            AnonymousClass9JL r27 = null;
            String str34 = null;
            while (r1.A1J() != 16L.A09) {
                String A0q = r1.A0q();
                r1.A1J();
                if ("action_bar_badge_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r1.A1P();
                    }
                } else if ("alternative_themes".equals(A0q)) {
                    if (r1.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r1.A1J() != 16L.A08) {
                            C370688wu parseFromJson = parseFromJson(r1);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("app_color_mode".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r1.A1P();
                    }
                    appColorMode = (AppColorMode) AppColorMode.A01.get(str2);
                    if (appColorMode == null) {
                        appColorMode = AppColorMode.UNRECOGNIZED;
                    }
                } else if ("blurred_composer_background_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r1.A1P();
                    }
                } else if ("blurred_composer_border_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r1.A1P();
                    }
                } else if ("blurred_composer_opaque_background_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r1.A1P();
                    }
                } else if ("bottom_gradient_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r1.A1P();
                    }
                } else if ("bubble_border_width".equals(A0q)) {
                    num2 = Integer.valueOf(r1.A1D());
                } else if ("can_display_border_on_visual_message_tombstones".equals(A0q)) {
                    bool = Boolean.valueOf(r1.A0d());
                } else if ("composer_circle_button_colors".equals(A0q)) {
                    if (r1.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r1.A1J() != 16L.A08) {
                            if (!(r1.A11() == 16L.A0G || (A1P4 = r1.A1P()) == null)) {
                                arrayList2.add(A1P4);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("composer_icon_background_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r1.A1P();
                    }
                } else if ("composer_icon_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r1.A1P();
                    }
                } else if ("composer_input_background_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r1.A1P();
                    }
                } else if ("composer_placeholder_text_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r1.A1P();
                    }
                } else if ("composer_secondary_button_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r1.A1P();
                    }
                } else if ("composer_send_button_colors".equals(A0q)) {
                    if (r1.A11() == 16L.A0C) {
                        arrayList3 = new ArrayList();
                        while (r1.A1J() != 16L.A08) {
                            if (!(r1.A11() == 16L.A0G || (A1P3 = r1.A1P()) == null)) {
                                arrayList3.add(A1P3);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("corner_radius".equals(A0q)) {
                    num = Integer.valueOf(r1.A1D());
                } else if ("customized_theme_asset".equals(A0q)) {
                    r29 = C370728wy.parseFromJson(r1);
                } else if ("emphasis_colors".equals(A0q)) {
                    if (r1.A11() == 16L.A0C) {
                        arrayList4 = new ArrayList();
                        while (r1.A1J() != 16L.A08) {
                            if (!(r1.A11() == 16L.A0G || (A1P2 = r1.A1P()) == null)) {
                                arrayList4.add(A1P2);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("emphasized_action_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str13 = null;
                    } else {
                        str13 = r1.A1P();
                    }
                } else if ("fallback_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str14 = null;
                    } else {
                        str14 = r1.A1P();
                    }
                } else if ("gradient_colors".equals(A0q)) {
                    if (r1.A11() == 16L.A0C) {
                        arrayList5 = new ArrayList();
                        while (r1.A1J() != 16L.A08) {
                            if (!(r1.A11() == 16L.A0G || (A1P = r1.A1P()) == null)) {
                                arrayList5.add(A1P);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if ("icon_asset".equals(A0q)) {
                    r30 = C370648wp.parseFromJson(r1);
                } else if ("inbound_message_text_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str15 = null;
                    } else {
                        str15 = r1.A1P();
                    }
                } else if ("incoming_message_bubble_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str16 = null;
                    } else {
                        str16 = r1.A1P();
                    }
                } else if ("is_deprecated".equals(A0q)) {
                    bool2 = Boolean.valueOf(r1.A0d());
                } else if ("loading_message_bubble_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str17 = null;
                    } else {
                        str17 = r1.A1P();
                    }
                } else if ("message_context_line_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str18 = null;
                    } else {
                        str18 = r1.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str19 = null;
                    } else {
                        str19 = r1.A1P();
                    }
                } else if ("navigation_bar_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str20 = null;
                    } else {
                        str20 = r1.A1P();
                    }
                } else if ("navigation_bar_icon_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str21 = null;
                    } else {
                        str21 = r1.A1P();
                    }
                } else if ("navigation_bar_subtitle_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str22 = null;
                    } else {
                        str22 = r1.A1P();
                    }
                } else if ("navigation_bar_title_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str23 = null;
                    } else {
                        str23 = r1.A1P();
                    }
                } else if ("outbound_message_text_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str24 = null;
                    } else {
                        str24 = r1.A1P();
                    }
                } else if ("primary_button_text_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str25 = null;
                    } else {
                        str25 = r1.A1P();
                    }
                } else if ("quoted_incoming_message_bubble_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str26 = null;
                    } else {
                        str26 = r1.A1P();
                    }
                } else if ("reaction_pill_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str27 = null;
                    } else {
                        str27 = r1.A1P();
                    }
                } else if ("secondary_text_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str28 = null;
                    } else {
                        str28 = r1.A1P();
                    }
                } else if ("shh_mode_interleaved_background_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str29 = null;
                    } else {
                        str29 = r1.A1P();
                    }
                } else if ("should_show_incoming_message_bubble_border".equals(A0q)) {
                    bool3 = Boolean.valueOf(r1.A0d());
                } else if ("should_use_diagonal_gradient_for_composer_circle_button".equals(A0q)) {
                    bool4 = Boolean.valueOf(r1.A0d());
                } else if ("solid_composer_background_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str30 = null;
                    } else {
                        str30 = r1.A1P();
                    }
                } else if ("solid_composer_border_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str31 = null;
                    } else {
                        str31 = r1.A1P();
                    }
                } else if ("solid_separator_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str32 = null;
                    } else {
                        str32 = r1.A1P();
                    }
                } else if ("subtitle".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str33 = null;
                    } else {
                        str33 = r1.A1P();
                    }
                } else if ("theme_id".equals(A0q)) {
                    l = Long.valueOf(r1.A0y());
                } else if ("theme_type".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r1.A1P();
                    }
                    threadThemeType = (ThreadThemeType) ThreadThemeType.A01.get(str);
                    if (threadThemeType == null) {
                        threadThemeType = ThreadThemeType.UNRECOGNIZED;
                    }
                } else if ("thread_background_asset".equals(A0q)) {
                    r27 = C370678ws.parseFromJson(r1);
                } else if ("thread_background_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str34 = null;
                    } else {
                        str34 = r1.A1P();
                    }
                }
                r1.A0z();
            }
            if (arrayList == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("alternative_themes", "LoadableThreadTheme");
            } else if (bool == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("can_display_border_on_visual_message_tombstones", "LoadableThreadTheme");
            } else if (num == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("corner_radius", "LoadableThreadTheme");
            } else if (arrayList5 == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("gradient_colors", "LoadableThreadTheme");
            } else if (bool2 == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("is_deprecated", "LoadableThreadTheme");
            } else if (str19 == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "LoadableThreadTheme");
            } else if (bool3 == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("should_show_incoming_message_bubble_border", "LoadableThreadTheme");
            } else if (bool4 == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("should_use_diagonal_gradient_for_composer_circle_button", "LoadableThreadTheme");
            } else if (l == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("theme_id", "LoadableThreadTheme");
            } else if (threadThemeType != null || !(r1 instanceof 0c9)) {
                return new C370688wu(r27, appColorMode, r29, r30, threadThemeType, num2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, num.intValue(), l.longValue(), bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue());
            } else {
                ((0c9) r1).A03.A00("theme_type", "LoadableThreadTheme");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r6, C370688wu r7) {
        r6.A0c();
        String str = r7.A08;
        if (str != null) {
            r6.A0R("action_bar_badge_color", str);
        }
        List<C370688wu> list = r7.A0e;
        if (list != null) {
            16P.A03(r6, "alternative_themes");
            for (C370688wu r0 : list) {
                if (r0 != null) {
                    A00(r6, r0);
                }
            }
            r6.A0Y();
        }
        AppColorMode appColorMode = r7.A03;
        if (appColorMode != null) {
            r6.A0R("app_color_mode", appColorMode.A00);
        }
        String str2 = r7.A09;
        if (str2 != null) {
            r6.A0R("blurred_composer_background_color", str2);
        }
        String str3 = r7.A0A;
        if (str3 != null) {
            r6.A0R("blurred_composer_border_color", str3);
        }
        String str4 = r7.A0B;
        if (str4 != null) {
            r6.A0R("blurred_composer_opaque_background_color", str4);
        }
        String str5 = r7.A0C;
        if (str5 != null) {
            r6.A0R("bottom_gradient_color", str5);
        }
        Integer num = r7.A07;
        if (num != null) {
            r6.A0P("bubble_border_width", num.intValue());
        }
        r6.A0S("can_display_border_on_visual_message_tombstones", r7.A0j);
        List<String> list2 = r7.A0f;
        if (list2 != null) {
            16P.A03(r6, "composer_circle_button_colors");
            for (String str6 : list2) {
                if (str6 != null) {
                    r6.A0t(str6);
                }
            }
            r6.A0Y();
        }
        String str7 = r7.A0D;
        if (str7 != null) {
            r6.A0R("composer_icon_background_color", str7);
        }
        String str8 = r7.A0E;
        if (str8 != null) {
            r6.A0R("composer_icon_color", str8);
        }
        String str9 = r7.A0F;
        if (str9 != null) {
            r6.A0R("composer_input_background_color", str9);
        }
        String str10 = r7.A0G;
        if (str10 != null) {
            r6.A0R("composer_placeholder_text_color", str10);
        }
        String str11 = r7.A0H;
        if (str11 != null) {
            r6.A0R("composer_secondary_button_color", str11);
        }
        List<String> list3 = r7.A0g;
        if (list3 != null) {
            16P.A03(r6, "composer_send_button_colors");
            for (String str12 : list3) {
                if (str12 != null) {
                    r6.A0t(str12);
                }
            }
            r6.A0Y();
        }
        r6.A0P("corner_radius", r7.A00);
        C370698wv r1 = r7.A04;
        if (r1 != null) {
            r6.A0q("customized_theme_asset");
            r6.A0c();
            String str13 = ((C370738wz) r1).A00;
            if (str13 != null) {
                r6.A0R("theme_image_url", str13);
            }
            r6.A0Z();
        }
        List<String> list4 = r7.A0h;
        if (list4 != null) {
            16P.A03(r6, "emphasis_colors");
            for (String str14 : list4) {
                if (str14 != null) {
                    r6.A0t(str14);
                }
            }
            r6.A0Y();
        }
        String str15 = r7.A0I;
        if (str15 != null) {
            r6.A0R("emphasized_action_color", str15);
        }
        String str16 = r7.A0J;
        if (str16 != null) {
            r6.A0R("fallback_color", str16);
        }
        List<String> list5 = r7.A0i;
        if (list5 != null) {
            16P.A03(r6, "gradient_colors");
            for (String str17 : list5) {
                if (str17 != null) {
                    r6.A0t(str17);
                }
            }
            r6.A0Y();
        }
        C370668wr r2 = r7.A05;
        if (r2 != null) {
            r6.A0q("icon_asset");
            C370658wq r22 = (C370658wq) r2;
            r6.A0c();
            String str18 = r22.A00;
            if (str18 != null) {
                r6.A0R("fifty", str18);
            }
            List<ExtendedImageUrl> list6 = r22.A04;
            if (list6 != null) {
                16P.A03(r6, "icon_images");
                for (ExtendedImageUrl extendedImageUrl : list6) {
                    if (extendedImageUrl != null) {
                        16W.A00(r6, extendedImageUrl);
                    }
                }
                r6.A0Y();
            }
            String str19 = r22.A01;
            if (str19 != null) {
                r6.A0R("one_hundred", str19);
            }
            String str20 = r22.A02;
            if (str20 != null) {
                r6.A0R("seventy_five", str20);
            }
            String str21 = r22.A03;
            if (str21 != null) {
                r6.A0R("two_hundred", str21);
            }
            r6.A0Z();
        }
        String str22 = r7.A0K;
        if (str22 != null) {
            r6.A0R("inbound_message_text_color", str22);
        }
        String str23 = r7.A0L;
        if (str23 != null) {
            r6.A0R("incoming_message_bubble_color", str23);
        }
        r6.A0S("is_deprecated", r7.A0k);
        String str24 = r7.A0M;
        if (str24 != null) {
            r6.A0R("loading_message_bubble_color", str24);
        }
        String str25 = r7.A0N;
        if (str25 != null) {
            r6.A0R("message_context_line_color", str25);
        }
        String str26 = r7.A0O;
        if (str26 != null) {
            r6.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str26);
        }
        String str27 = r7.A0P;
        if (str27 != null) {
            r6.A0R("navigation_bar_color", str27);
        }
        String str28 = r7.A0Q;
        if (str28 != null) {
            r6.A0R("navigation_bar_icon_color", str28);
        }
        String str29 = r7.A0R;
        if (str29 != null) {
            r6.A0R("navigation_bar_subtitle_color", str29);
        }
        String str30 = r7.A0S;
        if (str30 != null) {
            r6.A0R("navigation_bar_title_color", str30);
        }
        String str31 = r7.A0T;
        if (str31 != null) {
            r6.A0R("outbound_message_text_color", str31);
        }
        String str32 = r7.A0U;
        if (str32 != null) {
            r6.A0R("primary_button_text_color", str32);
        }
        String str33 = r7.A0V;
        if (str33 != null) {
            r6.A0R("quoted_incoming_message_bubble_color", str33);
        }
        String str34 = r7.A0W;
        if (str34 != null) {
            r6.A0R("reaction_pill_color", str34);
        }
        String str35 = r7.A0X;
        if (str35 != null) {
            r6.A0R("secondary_text_color", str35);
        }
        String str36 = r7.A0Y;
        if (str36 != null) {
            r6.A0R("shh_mode_interleaved_background_color", str36);
        }
        r6.A0S("should_show_incoming_message_bubble_border", r7.A0l);
        r6.A0S("should_use_diagonal_gradient_for_composer_circle_button", r7.A0m);
        String str37 = r7.A0Z;
        if (str37 != null) {
            r6.A0R("solid_composer_background_color", str37);
        }
        String str38 = r7.A0a;
        if (str38 != null) {
            r6.A0R("solid_composer_border_color", str38);
        }
        String str39 = r7.A0b;
        if (str39 != null) {
            r6.A0R("solid_separator_color", str39);
        }
        String str40 = r7.A0c;
        if (str40 != null) {
            r6.A0R("subtitle", str40);
        }
        r6.A0Q("theme_id", r7.A01);
        ThreadThemeType threadThemeType = r7.A06;
        if (threadThemeType != null) {
            r6.A0R("theme_type", threadThemeType.A00);
        }
        AnonymousClass9JL r3 = r7.A02;
        if (r3 != null) {
            r6.A0q("thread_background_asset");
            r6.A0c();
            List<ExtendedImageUrl> list7 = (List) r3.A01;
            if (list7 != null) {
                16P.A03(r6, "background_images");
                for (ExtendedImageUrl extendedImageUrl2 : list7) {
                    if (extendedImageUrl2 != null) {
                        16W.A00(r6, extendedImageUrl2);
                    }
                }
                r6.A0Y();
            }
            C381549bw r23 = (C381549bw) r3.A02;
            if (r23 != null) {
                r6.A0q("background_video");
                r6.A0c();
                String str41 = r23.A05;
                if (str41 != null) {
                    r6.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str41);
                }
                ImageInfo imageInfo = r23.A04;
                if (imageInfo != null) {
                    r6.A0q("image_versions2");
                    1dH.A00(r6, imageInfo.FEa());
                }
                r6.A0P("media_type", r23.A01);
                r6.A0P("original_height", r23.A02);
                r6.A0P("original_width", r23.A03);
                r6.A0O("video_duration", r23.A00);
                List<YBN> list8 = r23.A06;
                if (list8 != null) {
                    16P.A03(r6, "video_versions");
                    for (YBN ybn : list8) {
                        if (ybn != null) {
                            C381859ch r4 = (C381859ch) ybn;
                            r6.A0c();
                            DirectMediaFallbackUrl directMediaFallbackUrl = r4.A00;
                            if (directMediaFallbackUrl != null) {
                                r6.A0q("fallback");
                                r6.A0c();
                                String str42 = directMediaFallbackUrl.A00;
                                if (str42 != null) {
                                    r6.A0R("url", str42);
                                }
                                r6.A0Z();
                            }
                            Integer num2 = r4.A01;
                            if (num2 != null) {
                                r6.A0P(IgReactMediaPickerNativeModule.HEIGHT, num2.intValue());
                            }
                            String str43 = r4.A05;
                            if (str43 != null) {
                                r6.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str43);
                            }
                            Integer num3 = r4.A02;
                            if (num3 != null) {
                                r6.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, num3.intValue());
                            }
                            String str44 = r4.A06;
                            if (str44 != null) {
                                r6.A0R("url", str44);
                            }
                            Long l = r4.A04;
                            if (l != null) {
                                r6.A0Q("url_expiration_timestamp_us", l.longValue());
                            }
                            Integer num4 = r4.A03;
                            if (num4 != null) {
                                r6.A0P(IgReactMediaPickerNativeModule.WIDTH, num4.intValue());
                            }
                            r6.A0Z();
                        }
                    }
                    r6.A0Y();
                }
                r6.A0Z();
            }
            String str45 = r3.A03;
            if (str45 != null) {
                r6.A0R(AnonymousClass000.A00(289), str45);
            }
            String str46 = r3.A04;
            if (str46 != null) {
                r6.A0R("one_thousand_twenty_four", str46);
            }
            String str47 = r3.A05;
            if (str47 != null) {
                r6.A0R("seven_hundred_twenty", str47);
            }
            String str48 = r3.A06;
            if (str48 != null) {
                r6.A0R("two_thousand_forty_eight", str48);
            }
            r6.A0Z();
        }
        String str49 = r7.A0d;
        if (str49 != null) {
            r6.A0R("thread_background_color", str49);
        }
        r6.A0Z();
    }
}
