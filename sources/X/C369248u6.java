package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.RingSpecImpl;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryTemplateDict;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;
import java.util.ArrayList;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.8u6  reason: invalid class name and case insensitive filesystem */
public abstract class C369248u6 {
    public static C317876nz parseFromJson(16F r40) {
        C381789cK r5;
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        String A1P5;
        16F r13 = r40;
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            Long l = null;
            C318046oG r16 = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            Float f = null;
            Boolean bool2 = null;
            Integer num = null;
            String str6 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            RingSpecImpl ringSpecImpl = null;
            AnonymousClass3ID r30 = null;
            C39746A7m a7m = null;
            TrackDataImpl trackDataImpl = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            Boolean bool5 = null;
            ArrayList arrayList8 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            StoryPromptTappableData storyPromptTappableData = null;
            ArrayList arrayList9 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Float f2 = null;
            while (r13.A1J() != 16L.A09) {
                String A0q = r13.A0q();
                r13.A1J();
                if ("duration_ms".equals(A0q)) {
                    l = Long.valueOf(r13.A0y());
                } else if ("keywords".equals(A0q)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r13.A1J() != 16L.A08) {
                            if (!(r13.A11() == 16L.A0G || (A1P5 = r13.A1P()) == null)) {
                                arrayList2.add(A1P5);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("titles".equals(A0q)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList3 = new ArrayList();
                        while (r13.A1J() != 16L.A08) {
                            if (!(r13.A11() == 16L.A0G || (A1P4 = r13.A1P()) == null)) {
                                arrayList3.add(A1P4);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("include_in_recent".equals(A0q)) {
                    bool = Boolean.valueOf(r13.A0d());
                } else if ("help_text".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("secondary_text".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                } else if ("prompt".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                } else if ("default_prompt".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r13.A1P();
                    }
                } else if ("button_texts".equals(A0q)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList4 = new ArrayList();
                        while (r13.A1J() != 16L.A08) {
                            if (!(r13.A11() == 16L.A0G || (A1P3 = r13.A1P()) == null)) {
                                arrayList4.add(A1P3);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("prompts".equals(A0q)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList5 = new ArrayList();
                        while (r13.A1J() != 16L.A08) {
                            if (!(r13.A11() == 16L.A0G || (A1P2 = r13.A1P()) == null)) {
                                arrayList5.add(A1P2);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if ("minimum_scale".equals(A0q)) {
                    f = new Float(r13.A0U());
                } else if ("maximum_scale".equals(A0q)) {
                    f2 = new Float(r13.A0U());
                } else if ("bounding_box_enabled".equals(A0q)) {
                    bool2 = Boolean.valueOf(r13.A0d());
                } else if ("reel_media_sticker_limit".equals(A0q)) {
                    num = Integer.valueOf(r13.A1D());
                } else if ("render_framework".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r13.A1P();
                    }
                } else if ("has_attribution".equals(A0q)) {
                    bool3 = Boolean.valueOf(r13.A0d());
                } else if ("partnered_account".equals(A0q)) {
                    bool4 = Boolean.valueOf(r13.A0d());
                } else if ("ring_spec".equals(A0q)) {
                    ringSpecImpl = C45620CzW.parseFromJson(r13);
                } else if ("ring_glyph".equals(A0q)) {
                    r30 = D2M.parseFromJson(r13);
                } else if ("gif_sticker".equals(A0q)) {
                    a7m = A0I.parseFromJson(r13);
                } else if ("track".equals(A0q)) {
                    trackDataImpl = AnonymousClass3UP.parseFromJson(r13);
                } else if ("suggested_prompts".equals(A0q)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList6 = new ArrayList();
                        while (r13.A1J() != 16L.A08) {
                            if (!(r13.A11() == 16L.A0G || (A1P = r13.A1P()) == null)) {
                                arrayList6.add(A1P);
                            }
                        }
                    } else {
                        arrayList6 = null;
                    }
                } else if ("instapal_characters".equals(A0q)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList7 = new ArrayList();
                        while (r13.A1J() != 16L.A08) {
                            N4G parseFromJson = C394079xV.parseFromJson(r13);
                            if (parseFromJson != null) {
                                arrayList7.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList7 = null;
                    }
                } else if ("has_avatar".equals(A0q)) {
                    bool5 = Boolean.valueOf(r13.A0d());
                } else if ("prompt_titles".equals(A0q)) {
                    16L A11 = r13.A11();
                    16L r14 = 16L.A0C;
                    if (A11 == r14) {
                        arrayList8 = new ArrayList();
                        while (true) {
                            16L A1J = r13.A1J();
                            16L r15 = 16L.A08;
                            if (A1J == r15) {
                                break;
                            }
                            if (r13.A11() == r14) {
                                ArrayList arrayList10 = new ArrayList();
                                while (r13.A1J() != r15) {
                                    if (r13.A11() == 16L.A0J) {
                                        String A1Q = r13.A1Q();
                                        0qQ.A07(A1Q);
                                        arrayList10.add(A1Q);
                                    }
                                }
                                r5 = new C381789cK((String) arrayList10.get(0), (String) arrayList10.get(1));
                            } else {
                                r5 = new C381789cK("", "");
                            }
                            arrayList8.add(r5);
                        }
                    } else {
                        arrayList8 = null;
                    }
                } else if ("is_boost_eligible".equals(A0q)) {
                    bool6 = Boolean.valueOf(r13.A0d());
                } else if ("is_interactive_sticker".equals(A0q)) {
                    bool7 = Boolean.valueOf(r13.A0d());
                } else if ("election_add_yours_data".equals(A0q)) {
                    storyPromptTappableData = C281985Ai.parseFromJson(r13);
                } else if ("suggested_templates".equals(A0q)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList9 = new ArrayList();
                        while (r13.A1J() != 16L.A08) {
                            StoryTemplateDict parseFromJson2 = C282005Al.parseFromJson(r13);
                            if (parseFromJson2 != null) {
                                arrayList9.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList9 = null;
                    }
                } else if ("is_suggested_sticker".equals(A0q)) {
                    bool8 = Boolean.valueOf(r13.A0d());
                } else if ("should_display_new_badge".equals(A0q)) {
                    bool9 = Boolean.valueOf(r13.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("stickers".equals(A0q)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r13.A1J() != 16L.A08) {
                            C317966o8 parseFromJson3 = C369258u7.parseFromJson(r13);
                            if (parseFromJson3 != null) {
                                arrayList.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("sticker_type".equals(A0q)) {
                    String A1Q2 = r13.A1Q();
                    0qQ.A0B(A1Q2, 0);
                    C318046oG[] values = C318046oG.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            r16 = null;
                            break;
                        }
                        r16 = values[i];
                        if (0qQ.A0K(r16.A00, A1Q2)) {
                            break;
                        }
                        i++;
                    }
                }
                r13.A0z();
            }
            if (str == null && (r13 instanceof 0c9)) {
                ((0c9) r13).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "StaticSticker");
            } else if (arrayList != null || !(r13 instanceof 0c9)) {
                C317876nz r52 = new C317876nz(r16, str, arrayList);
                if (l != null) {
                    r52.A0G = l;
                }
                if (arrayList2 != null) {
                    r52.A0P = arrayList2;
                }
                if (arrayList3 != null) {
                    r52.A0U = arrayList3;
                }
                if (bool != null) {
                    r52.A0X = bool.booleanValue();
                }
                if (str2 != null) {
                    r52.A0I = str2;
                }
                if (str3 != null) {
                    r52.A0L = str3;
                }
                if (str4 != null) {
                    r52.A0J = str4;
                }
                if (str5 != null) {
                    r52.A0H = str5;
                }
                if (arrayList4 != null) {
                    r52.A0M = arrayList4;
                }
                if (arrayList5 != null) {
                    r52.A0R = arrayList5;
                }
                if (f != null) {
                    r52.A0D = f;
                }
                if (f2 != null) {
                    r52.A0C = f2;
                }
                if (bool2 != null) {
                    r52.A0B = bool2;
                }
                if (num != null) {
                    r52.A0E = num;
                }
                if (str6 != null) {
                    r52.A0K = str6;
                }
                if (bool3 != null) {
                    r52.A0V = bool3.booleanValue();
                }
                if (bool4 != null) {
                    r52.A0W = bool4.booleanValue();
                }
                if (ringSpecImpl != null) {
                    r52.A00 = ringSpecImpl;
                }
                if (r30 != null) {
                    r52.A06 = r30;
                }
                if (a7m != null) {
                    r52.A05 = a7m;
                }
                if (trackDataImpl != null) {
                    r52.A02 = trackDataImpl;
                }
                if (arrayList6 != null) {
                    r52.A0S = arrayList6;
                }
                if (arrayList7 != null) {
                    r52.A0N = arrayList7;
                }
                if (bool5 != null) {
                    r52.A07 = bool5;
                }
                if (arrayList8 != null) {
                    r52.A0Q = arrayList8;
                }
                if (bool6 != null) {
                    r52.A08 = bool6;
                }
                if (bool7 != null) {
                    r52.A09 = bool7;
                }
                if (storyPromptTappableData != null) {
                    r52.A01 = storyPromptTappableData;
                }
                if (arrayList9 != null) {
                    r52.A0T = arrayList9;
                }
                if (bool8 != null) {
                    r52.A0Y = bool8.booleanValue();
                }
                if (bool9 != null) {
                    r52.A0A = bool9;
                }
                r52.A03();
                return r52;
            } else {
                ((0c9) r13).A03.A00("stickers", "StaticSticker");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r6, C317876nz r7) {
        r6.A0c();
        Long l = r7.A0G;
        if (l != null) {
            r6.A0Q("duration_ms", l.longValue());
        }
        16P.A03(r6, "keywords");
        for (String str : r7.A0P) {
            if (str != null) {
                r6.A0t(str);
            }
        }
        r6.A0Y();
        if (r7.A0U != null) {
            16P.A03(r6, "titles");
            for (String str2 : r7.A0U) {
                if (str2 != null) {
                    r6.A0t(str2);
                }
            }
            r6.A0Y();
        }
        r6.A0S("include_in_recent", r7.A0X);
        String str3 = r7.A0I;
        if (str3 != null) {
            r6.A0R("help_text", str3);
        }
        String str4 = r7.A0L;
        if (str4 != null) {
            r6.A0R("secondary_text", str4);
        }
        String str5 = r7.A0J;
        if (str5 != null) {
            r6.A0R("prompt", str5);
        }
        String str6 = r7.A0H;
        if (str6 != null) {
            r6.A0R("default_prompt", str6);
        }
        if (r7.A0M != null) {
            16P.A03(r6, "button_texts");
            for (String str7 : r7.A0M) {
                if (str7 != null) {
                    r6.A0t(str7);
                }
            }
            r6.A0Y();
        }
        if (r7.A0R != null) {
            16P.A03(r6, "prompts");
            for (String str8 : r7.A0R) {
                if (str8 != null) {
                    r6.A0t(str8);
                }
            }
            r6.A0Y();
        }
        Float f = r7.A0D;
        if (f != null) {
            r6.A0O("minimum_scale", f.floatValue());
        }
        Float f2 = r7.A0C;
        if (f2 != null) {
            r6.A0O("maximum_scale", f2.floatValue());
        }
        Boolean bool = r7.A0B;
        if (bool != null) {
            r6.A0S("bounding_box_enabled", bool.booleanValue());
        }
        Integer num = r7.A0E;
        if (num != null) {
            r6.A0P("reel_media_sticker_limit", num.intValue());
        }
        String str9 = r7.A0K;
        if (str9 != null) {
            r6.A0R("render_framework", str9);
        }
        r6.A0S("has_attribution", r7.A0V);
        r6.A0S("partnered_account", r7.A0W);
        if (r7.A00 != null) {
            r6.A0q("ring_spec");
            C45620CzW.A00(r6, r7.A00);
        }
        if (r7.A06 != null) {
            r6.A0q("ring_glyph");
            D2M.A00(r6, r7.A06, true);
        }
        if (r7.A05 != null) {
            r6.A0q("gif_sticker");
            C39746A7m a7m = r7.A05;
            r6.A0c();
            String str10 = a7m.A05;
            if (str10 != null) {
                r6.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str10);
            }
            if (a7m.A00 != null) {
                r6.A0q("images");
                C39747A7n a7n = a7m.A00;
                r6.A0c();
                if (a7n.A00 != null) {
                    r6.A0q("fixed_height");
                    LJ2.A00(r6, a7n.A00);
                }
                if (a7n.A06 != null) {
                    r6.A0q("fixed_height_still");
                    LJ2.A00(r6, a7n.A06);
                }
                if (a7n.A01 != null) {
                    r6.A0q("fixed_height_downsampled");
                    LJ2.A00(r6, a7n.A01);
                }
                if (a7n.A02 != null) {
                    r6.A0q("downsized");
                    LJ2.A00(r6, a7n.A02);
                }
                if (a7n.A04 != null) {
                    r6.A0q("downsized_medium");
                    LJ2.A00(r6, a7n.A04);
                }
                if (a7n.A03 != null) {
                    r6.A0q("downsized_large");
                    LJ2.A00(r6, a7n.A03);
                }
                if (a7n.A05 != null) {
                    r6.A0q("original");
                    LJ2.A00(r6, a7n.A05);
                }
                r6.A0Z();
            }
            if (a7m.A01 != null) {
                r6.A0q(MediaStreamTrack.VIDEO_TRACK_KIND);
                A6M a6m = a7m.A01;
                r6.A0c();
                String str11 = a6m.A02;
                if (str11 != null) {
                    r6.A0R(DevServerEntity.COLUMN_DESCRIPTION, str11);
                }
                Float f3 = a6m.A01;
                if (f3 != null) {
                    r6.A0O(TraceFieldType.Duration, f3.floatValue());
                }
                if (a6m.A00 != null) {
                    r6.A0q("assets");
                    C39723A6o a6o = a6m.A00;
                    r6.A0c();
                    if (a6o.A01 != null) {
                        r6.A0q("360p");
                        AB0.A00(r6, a6o.A01);
                    }
                    if (a6o.A02 != null) {
                        r6.A0q("480p");
                        AB0.A00(r6, a6o.A02);
                    }
                    if (a6o.A03 != null) {
                        r6.A0q("720p");
                        AB0.A00(r6, a6o.A03);
                    }
                    if (a6o.A00 != null) {
                        r6.A0q("1080p");
                        AB0.A00(r6, a6o.A00);
                    }
                    r6.A0Z();
                }
                r6.A0Z();
            }
            if (a7m.A02 != null) {
                r6.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                A5V a5v = a7m.A02;
                r6.A0c();
                r6.A0S("is_verified", a5v.A01);
                String str12 = a5v.A00;
                if (str12 != null) {
                    r6.A0R(AnonymousClass9NM.A00(10, 8, 28), str12);
                }
                r6.A0Z();
            }
            Boolean bool2 = a7m.A03;
            if (bool2 != null) {
                r6.A0S("is_sticker", bool2.booleanValue());
            }
            String str13 = a7m.A04;
            if (str13 != null) {
                r6.A0R("expression_id", str13);
            }
            String str14 = a7m.A06;
            if (str14 != null) {
                r6.A0R(DialogModule.KEY_TITLE, str14);
            }
            r6.A0Z();
        }
        if (r7.A02 != null) {
            r6.A0q("track");
            AnonymousClass3UP.A00(r6, r7.A02);
        }
        if (r7.A0S != null) {
            16P.A03(r6, "suggested_prompts");
            for (String str15 : r7.A0S) {
                if (str15 != null) {
                    r6.A0t(str15);
                }
            }
            r6.A0Y();
        }
        if (r7.A0N != null) {
            16P.A03(r6, "instapal_characters");
            for (N4G n4g : r7.A0N) {
                if (n4g != null) {
                    r6.A0c();
                    String str16 = n4g.A01;
                    if (str16 != null) {
                        r6.A0R(AnonymousClass000.A00(266), str16);
                    }
                    r6.A0P("like_count", n4g.A00);
                    r6.A0Z();
                }
            }
            r6.A0Y();
        }
        Boolean bool3 = r7.A07;
        if (bool3 != null) {
            r6.A0S("has_avatar", bool3.booleanValue());
        }
        if (r7.A0Q != null) {
            16P.A03(r6, "prompt_titles");
            for (Object obj : r7.A0Q) {
                if (obj != null) {
                    r6.A0c();
                    r6.A0Z();
                }
            }
            r6.A0Y();
        }
        Boolean bool4 = r7.A08;
        if (bool4 != null) {
            r6.A0S("is_boost_eligible", bool4.booleanValue());
        }
        Boolean bool5 = r7.A09;
        if (bool5 != null) {
            r6.A0S("is_interactive_sticker", bool5.booleanValue());
        }
        if (r7.A01 != null) {
            r6.A0q("election_add_yours_data");
            C281985Ai.A00(r6, r7.A01, true);
        }
        if (r7.A0T != null) {
            16P.A03(r6, "suggested_templates");
            for (StoryTemplateDict storyTemplateDict : r7.A0T) {
                if (storyTemplateDict != null) {
                    C282005Al.A00(r6, storyTemplateDict);
                }
            }
            r6.A0Y();
        }
        r6.A0S("is_suggested_sticker", r7.A0Y);
        Boolean bool6 = r7.A0A;
        if (bool6 != null) {
            r6.A0S("should_display_new_badge", bool6.booleanValue());
        }
        r6.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r7.A0Z);
        16P.A03(r6, "stickers");
        for (C317966o8 r0 : r7.A0O) {
            if (r0 != null) {
                C369258u7.A00(r6, r0);
            }
        }
        r6.A0Y();
        C318046oG r02 = r7.A03;
        if (r02 != null) {
            r6.A0R("sticker_type", r02.toString());
        }
        r6.A0Z();
    }
}
