package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.api.schemas.Lyrics;
import com.instagram.api.schemas.StoryTemplateAssetDict;
import com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict;
import com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDictImpl;
import com.instagram.api.schemas.StoryTemplateCaptionDict;
import com.instagram.api.schemas.StoryTemplateDict;
import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict;
import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDictImpl;
import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerShapes;
import com.instagram.api.schemas.StoryTemplateFillableMusicStickerDict;
import com.instagram.api.schemas.StoryTemplateFillableMusicStickerDictImpl;
import com.instagram.api.schemas.StoryTemplateFillableStickersDict;
import com.instagram.api.schemas.StoryTemplateFillableStickersDictImpl;
import com.instagram.api.schemas.StoryTemplateGiphyStickerDict;
import com.instagram.api.schemas.StoryTemplateGiphyStickerImageDict;
import com.instagram.api.schemas.StoryTemplateMusicAssetInfoDict;
import com.instagram.api.schemas.StoryTemplateMusicStickerDict;
import com.instagram.api.schemas.StoryTemplateReshareMediaDict;
import com.instagram.api.schemas.StoryTemplateReshareMediaDictImpl;
import com.instagram.api.schemas.StoryTemplateStaticOverlayDict;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Al  reason: invalid class name and case insensitive filesystem */
public abstract class C282005Al {
    public static StoryTemplateDict parseFromJson(16F r13) {
        String A1P;
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            StoryTemplateFillableStickersDictImpl storyTemplateFillableStickersDictImpl = null;
            Boolean bool = null;
            Boolean bool2 = null;
            StoryTemplateMusicStickerDict storyTemplateMusicStickerDict = null;
            StoryTemplateReshareMediaDictImpl storyTemplateReshareMediaDictImpl = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            StoryTemplateAssetDict storyTemplateAssetDict = null;
            ArrayList arrayList4 = null;
            while (r13.A1J() != 16L.A09) {
                String A0q = r13.A0q();
                r13.A1J();
                if ("fillable_stickers".equals(A0q)) {
                    storyTemplateFillableStickersDictImpl = C282015Ao.parseFromJson(r13);
                } else if ("is_eligible_for_reels_participation".equals(A0q)) {
                    bool = Boolean.valueOf(r13.A0d());
                } else if ("is_from_discovery_surface".equals(A0q)) {
                    bool2 = Boolean.valueOf(r13.A0d());
                } else if ("music_sticker".equals(A0q)) {
                    storyTemplateMusicStickerDict = C377769Nd.parseFromJson(r13);
                } else if ("reshare_media".equals(A0q)) {
                    storyTemplateReshareMediaDictImpl = C44453CfB.parseFromJson(r13);
                } else if ("story_avatar_overlays".equals(A0q)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r13.A1J() != 16L.A08) {
                            StoryTemplateAvatarStickerOverlayDictImpl parseFromJson = C393509wY.parseFromJson(r13);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("story_captions".equals(A0q)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r13.A1J() != 16L.A08) {
                            StoryTemplateCaptionDict parseFromJson2 = C369278uA.parseFromJson(r13);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("story_static_overlays".equals(A0q)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList3 = new ArrayList();
                        while (r13.A1J() != 16L.A08) {
                            StoryTemplateStaticOverlayDict parseFromJson3 = C369288uD.parseFromJson(r13);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("template_asset".equals(A0q)) {
                    storyTemplateAssetDict = D00.parseFromJson(r13);
                } else if ("template_sticker_ids".equals(A0q)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList4 = new ArrayList();
                        while (r13.A1J() != 16L.A08) {
                            if (!(r13.A11() == 16L.A0G || (A1P = r13.A1P()) == null)) {
                                arrayList4.add(A1P);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                }
                r13.A0z();
            }
            return new StoryTemplateDict(storyTemplateAssetDict, storyTemplateFillableStickersDictImpl, storyTemplateMusicStickerDict, storyTemplateReshareMediaDictImpl, bool, bool2, arrayList, arrayList2, arrayList3, arrayList4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r6, StoryTemplateDict storyTemplateDict) {
        r6.A0c();
        StoryTemplateFillableStickersDict storyTemplateFillableStickersDict = storyTemplateDict.A01;
        if (storyTemplateFillableStickersDict != null) {
            r6.A0q("fillable_stickers");
            StoryTemplateFillableStickersDictImpl FBb = storyTemplateFillableStickersDict.FBb();
            r6.A0c();
            List<StoryTemplateFillableGalleryStickerDict> list = FBb.A01;
            if (list != null) {
                16P.A03(r6, "fillable_gallery_stickers");
                for (StoryTemplateFillableGalleryStickerDict storyTemplateFillableGalleryStickerDict : list) {
                    if (storyTemplateFillableGalleryStickerDict != null) {
                        StoryTemplateFillableGalleryStickerDictImpl FBZ = storyTemplateFillableGalleryStickerDict.FBZ();
                        r6.A0c();
                        StoryTemplateFillableGalleryStickerShapes storyTemplateFillableGalleryStickerShapes = FBZ.A00;
                        if (storyTemplateFillableGalleryStickerShapes != null) {
                            r6.A0R("gallery_sticker_shape", storyTemplateFillableGalleryStickerShapes.A00);
                        }
                        Float f = FBZ.A01;
                        if (f != null) {
                            r6.A0O(IgReactMediaPickerNativeModule.HEIGHT, f.floatValue());
                        }
                        Float f2 = FBZ.A02;
                        if (f2 != null) {
                            r6.A0O("rotation", f2.floatValue());
                        }
                        Float f3 = FBZ.A03;
                        if (f3 != null) {
                            r6.A0O(IgReactMediaPickerNativeModule.WIDTH, f3.floatValue());
                        }
                        Float f4 = FBZ.A04;
                        if (f4 != null) {
                            r6.A0O("x", f4.floatValue());
                        }
                        Float f5 = FBZ.A05;
                        if (f5 != null) {
                            r6.A0O("y", f5.floatValue());
                        }
                        Integer num = FBZ.A06;
                        if (num != null) {
                            r6.A0P("z_index", num.intValue());
                        }
                        r6.A0Z();
                    }
                }
                r6.A0Y();
            }
            StoryTemplateFillableMusicStickerDict storyTemplateFillableMusicStickerDict = FBb.A00;
            if (storyTemplateFillableMusicStickerDict != null) {
                r6.A0q("fillable_music_sticker");
                StoryTemplateFillableMusicStickerDictImpl FBa = storyTemplateFillableMusicStickerDict.FBa();
                r6.A0c();
                String str = FBa.A06;
                if (str != null) {
                    r6.A0R("display_type", str);
                }
                Float f6 = FBa.A00;
                if (f6 != null) {
                    r6.A0O(IgReactMediaPickerNativeModule.HEIGHT, f6.floatValue());
                }
                Float f7 = FBa.A01;
                if (f7 != null) {
                    r6.A0O("rotation", f7.floatValue());
                }
                Float f8 = FBa.A02;
                if (f8 != null) {
                    r6.A0O(IgReactMediaPickerNativeModule.WIDTH, f8.floatValue());
                }
                Float f9 = FBa.A03;
                if (f9 != null) {
                    r6.A0O("x", f9.floatValue());
                }
                Float f10 = FBa.A04;
                if (f10 != null) {
                    r6.A0O("y", f10.floatValue());
                }
                Integer num2 = FBa.A05;
                if (num2 != null) {
                    r6.A0P("z_index", num2.intValue());
                }
                r6.A0Z();
            }
            r6.A0Z();
        }
        Boolean bool = storyTemplateDict.A04;
        if (bool != null) {
            r6.A0S("is_eligible_for_reels_participation", bool.booleanValue());
        }
        Boolean bool2 = storyTemplateDict.A05;
        if (bool2 != null) {
            r6.A0S("is_from_discovery_surface", bool2.booleanValue());
        }
        StoryTemplateMusicStickerDict storyTemplateMusicStickerDict = storyTemplateDict.A02;
        if (storyTemplateMusicStickerDict != null) {
            r6.A0q("music_sticker");
            r6.A0c();
            String str2 = storyTemplateMusicStickerDict.A0B;
            if (str2 != null) {
                r6.A0R("attribution", str2);
            }
            String str3 = storyTemplateMusicStickerDict.A0C;
            if (str3 != null) {
                r6.A0R("audio_asset_id", str3);
            }
            r6.A0P(AnonymousClass000.A00(518), storyTemplateMusicStickerDict.A05);
            String str4 = storyTemplateMusicStickerDict.A0D;
            if (str4 != null) {
                r6.A0R("audio_cluster_id", str4);
            }
            String str5 = storyTemplateMusicStickerDict.A0E;
            if (str5 != null) {
                r6.A0R("color", str5);
            }
            r6.A0P("derived_content_start_time_in_ms", storyTemplateMusicStickerDict.A06);
            String str6 = storyTemplateMusicStickerDict.A0F;
            if (str6 != null) {
                r6.A0R("display_type", str6);
            }
            r6.A0O(IgReactMediaPickerNativeModule.HEIGHT, storyTemplateMusicStickerDict.A00);
            Lyrics lyrics = storyTemplateMusicStickerDict.A09;
            if (lyrics != null) {
                r6.A0q("lyrics");
                AnonymousClass4DC.A00(r6, lyrics);
            }
            StoryTemplateMusicAssetInfoDict storyTemplateMusicAssetInfoDict = storyTemplateMusicStickerDict.A0A;
            if (storyTemplateMusicAssetInfoDict != null) {
                r6.A0q("music_asset_info");
                r6.A0c();
                String str7 = storyTemplateMusicAssetInfoDict.A03;
                if (str7 != null) {
                    r6.A0R(AnonymousClass000.A00(573), str7);
                }
                String str8 = storyTemplateMusicAssetInfoDict.A04;
                if (str8 != null) {
                    r6.A0R(C66579MXk.A00(737), str8);
                }
                Integer num3 = storyTemplateMusicAssetInfoDict.A02;
                if (num3 != null) {
                    r6.A0P("duration_in_ms", num3.intValue());
                }
                Boolean bool3 = storyTemplateMusicAssetInfoDict.A00;
                if (bool3 != null) {
                    r6.A0S("has_lyrics", bool3.booleanValue());
                }
                Boolean bool4 = storyTemplateMusicAssetInfoDict.A01;
                if (bool4 != null) {
                    r6.A0S("is_explicit", bool4.booleanValue());
                }
                String str9 = storyTemplateMusicAssetInfoDict.A05;
                if (str9 != null) {
                    r6.A0R(AnonymousClass000.A00(5145), str9);
                }
                String str10 = storyTemplateMusicAssetInfoDict.A06;
                if (str10 != null) {
                    r6.A0R(DialogModule.KEY_TITLE, str10);
                }
                r6.A0Z();
            }
            r6.A0P(AnonymousClass000.A00(732), storyTemplateMusicStickerDict.A07);
            r6.A0O("rotation", storyTemplateMusicStickerDict.A01);
            r6.A0O(IgReactMediaPickerNativeModule.WIDTH, storyTemplateMusicStickerDict.A02);
            r6.A0O("x", storyTemplateMusicStickerDict.A03);
            r6.A0O("y", storyTemplateMusicStickerDict.A04);
            r6.A0P("z_index", storyTemplateMusicStickerDict.A08);
            r6.A0Z();
        }
        StoryTemplateReshareMediaDict storyTemplateReshareMediaDict = storyTemplateDict.A03;
        if (storyTemplateReshareMediaDict != null) {
            r6.A0q("reshare_media");
            StoryTemplateReshareMediaDictImpl FBg = storyTemplateReshareMediaDict.FBg();
            r6.A0c();
            Integer num4 = FBg.A00;
            if (num4 != null) {
                r6.A0P("carousel_index", num4.intValue());
            }
            String str11 = FBg.A01;
            if (str11 != null) {
                r6.A0R("media_id", str11);
            }
            String str12 = FBg.A02;
            if (str12 != null) {
                r6.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str12);
            }
            r6.A0Z();
        }
        List<StoryTemplateAvatarStickerOverlayDict> list2 = storyTemplateDict.A06;
        if (list2 != null) {
            16P.A03(r6, "story_avatar_overlays");
            for (StoryTemplateAvatarStickerOverlayDict storyTemplateAvatarStickerOverlayDict : list2) {
                if (storyTemplateAvatarStickerOverlayDict != null) {
                    StoryTemplateAvatarStickerOverlayDictImpl FBW = storyTemplateAvatarStickerOverlayDict.FBW();
                    r6.A0c();
                    String str13 = FBW.A06;
                    if (str13 != null) {
                        r6.A0R("expression_id", str13);
                    }
                    Float f11 = FBW.A00;
                    if (f11 != null) {
                        r6.A0O(IgReactMediaPickerNativeModule.HEIGHT, f11.floatValue());
                    }
                    String str14 = FBW.A07;
                    if (str14 != null) {
                        r6.A0R("instruction_key_id", str14);
                    }
                    String str15 = FBW.A08;
                    if (str15 != null) {
                        r6.A0R("media_type", str15);
                    }
                    Float f12 = FBW.A01;
                    if (f12 != null) {
                        r6.A0O("rotation", f12.floatValue());
                    }
                    Float f13 = FBW.A02;
                    if (f13 != null) {
                        r6.A0O(IgReactMediaPickerNativeModule.WIDTH, f13.floatValue());
                    }
                    Float f14 = FBW.A03;
                    if (f14 != null) {
                        r6.A0O("x", f14.floatValue());
                    }
                    Float f15 = FBW.A04;
                    if (f15 != null) {
                        r6.A0O("y", f15.floatValue());
                    }
                    Integer num5 = FBW.A05;
                    if (num5 != null) {
                        r6.A0P("z_index", num5.intValue());
                    }
                    r6.A0Z();
                }
            }
            r6.A0Y();
        }
        List<StoryTemplateCaptionDict> list3 = storyTemplateDict.A07;
        if (list3 != null) {
            16P.A03(r6, "story_captions");
            for (StoryTemplateCaptionDict storyTemplateCaptionDict : list3) {
                if (storyTemplateCaptionDict != null) {
                    r6.A0c();
                    String str16 = storyTemplateCaptionDict.A09;
                    if (str16 != null) {
                        r6.A0R("alignment", str16);
                    }
                    String str17 = storyTemplateCaptionDict.A0A;
                    if (str17 != null) {
                        r6.A0R("animation", str17);
                    }
                    String str18 = storyTemplateCaptionDict.A0B;
                    if (str18 != null) {
                        r6.A0R("colors", str18);
                    }
                    String str19 = storyTemplateCaptionDict.A0C;
                    if (str19 != null) {
                        r6.A0R("effects", str19);
                    }
                    r6.A0O("font_size", storyTemplateCaptionDict.A00);
                    ClipsTextFormatType clipsTextFormatType = storyTemplateCaptionDict.A08;
                    if (clipsTextFormatType != null) {
                        r6.A0R("format_type", clipsTextFormatType.A00);
                    }
                    r6.A0O(IgReactMediaPickerNativeModule.HEIGHT, storyTemplateCaptionDict.A01);
                    r6.A0O("rotation", storyTemplateCaptionDict.A02);
                    r6.A0O("scale", storyTemplateCaptionDict.A03);
                    String str20 = storyTemplateCaptionDict.A0D;
                    if (str20 != null) {
                        r6.A0R("secondary_color", str20);
                    }
                    String str21 = storyTemplateCaptionDict.A0E;
                    if (str21 != null) {
                        r6.A0R("text", str21);
                    }
                    r6.A0O(IgReactMediaPickerNativeModule.WIDTH, storyTemplateCaptionDict.A04);
                    r6.A0O("x", storyTemplateCaptionDict.A05);
                    r6.A0O("y", storyTemplateCaptionDict.A06);
                    r6.A0P("z_index", storyTemplateCaptionDict.A07);
                    r6.A0Z();
                }
            }
            r6.A0Y();
        }
        List<StoryTemplateStaticOverlayDict> list4 = storyTemplateDict.A08;
        if (list4 != null) {
            16P.A03(r6, "story_static_overlays");
            for (StoryTemplateStaticOverlayDict storyTemplateStaticOverlayDict : list4) {
                if (storyTemplateStaticOverlayDict != null) {
                    r6.A0c();
                    StoryTemplateGiphyStickerDict storyTemplateGiphyStickerDict = storyTemplateStaticOverlayDict.A06;
                    if (storyTemplateGiphyStickerDict != null) {
                        r6.A0q("giphy_sticker_data");
                        r6.A0c();
                        String str22 = storyTemplateGiphyStickerDict.A01;
                        if (str22 != null) {
                            r6.A0R("gif_id", str22);
                        }
                        StoryTemplateGiphyStickerImageDict storyTemplateGiphyStickerImageDict = storyTemplateGiphyStickerDict.A00;
                        if (storyTemplateGiphyStickerImageDict != null) {
                            r6.A0q("image");
                            r6.A0c();
                            String str23 = storyTemplateGiphyStickerImageDict.A00;
                            if (str23 != null) {
                                r6.A0R(IgReactMediaPickerNativeModule.HEIGHT, str23);
                            }
                            String str24 = storyTemplateGiphyStickerImageDict.A01;
                            if (str24 != null) {
                                r6.A0R("mp4_url", str24);
                            }
                            String str25 = storyTemplateGiphyStickerImageDict.A02;
                            if (str25 != null) {
                                r6.A0R("url", str25);
                            }
                            String str26 = storyTemplateGiphyStickerImageDict.A03;
                            if (str26 != null) {
                                r6.A0R(IgReactMediaPickerNativeModule.WIDTH, str26);
                            }
                            r6.A0Z();
                        }
                        String str27 = storyTemplateGiphyStickerDict.A02;
                        if (str27 != null) {
                            r6.A0R(DialogModule.KEY_TITLE, str27);
                        }
                        String str28 = storyTemplateGiphyStickerDict.A03;
                        if (str28 != null) {
                            r6.A0R(AnonymousClass9NF.A02(42, 8, 57), str28);
                        }
                        r6.A0Z();
                    }
                    r6.A0O(IgReactMediaPickerNativeModule.HEIGHT, storyTemplateStaticOverlayDict.A00);
                    r6.A0O("rotation", storyTemplateStaticOverlayDict.A01);
                    String str29 = storyTemplateStaticOverlayDict.A07;
                    if (str29 != null) {
                        r6.A0R("sticker_type", str29);
                    }
                    String str30 = storyTemplateStaticOverlayDict.A08;
                    if (str30 != null) {
                        r6.A0R("str_id", str30);
                    }
                    r6.A0O(IgReactMediaPickerNativeModule.WIDTH, storyTemplateStaticOverlayDict.A02);
                    r6.A0O("x", storyTemplateStaticOverlayDict.A03);
                    r6.A0O("y", storyTemplateStaticOverlayDict.A04);
                    r6.A0P("z_index", storyTemplateStaticOverlayDict.A05);
                    r6.A0Z();
                }
            }
            r6.A0Y();
        }
        StoryTemplateAssetDict storyTemplateAssetDict = storyTemplateDict.A00;
        if (storyTemplateAssetDict != null) {
            r6.A0q("template_asset");
            D00.A00(r6, storyTemplateAssetDict);
        }
        List<String> list5 = storyTemplateDict.A09;
        if (list5 != null) {
            16P.A03(r6, "template_sticker_ids");
            for (String str31 : list5) {
                if (str31 != null) {
                    r6.A0t(str31);
                }
            }
            r6.A0Y();
        }
        r6.A0Z();
    }
}
