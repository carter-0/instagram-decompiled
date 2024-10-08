package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsBreakingCreatorInfo;
import com.instagram.api.schemas.ClipsCreationEntryPoint;
import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.OriginalityInfo;
import com.instagram.api.schemas.ProfessionalClipsUpsellType;
import com.instagram.clips.model.metadata.ClipsContextualHighlightInfoIntf;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class B4L {
    public static Map A00(C67231sQ r5) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        ArrayList arrayList;
        TreeUpdaterJNI FHC;
        String str;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        TreeUpdaterJNI treeUpdaterJNI5;
        TreeUpdaterJNI treeUpdaterJNI6;
        TreeUpdaterJNI treeUpdaterJNI7;
        TreeUpdaterJNI treeUpdaterJNI8;
        TreeUpdaterJNI treeUpdaterJNI9;
        ArrayList arrayList2;
        TreeUpdaterJNI treeUpdaterJNI10;
        TreeUpdaterJNI treeUpdaterJNI11;
        String str2;
        TreeUpdaterJNI treeUpdaterJNI12;
        TreeUpdaterJNI treeUpdaterJNI13;
        TreeUpdaterJNI treeUpdaterJNI14;
        TreeUpdaterJNI treeUpdaterJNI15;
        String str3;
        TreeUpdaterJNI treeUpdaterJNI16;
        TreeUpdaterJNI treeUpdaterJNI17;
        TreeUpdaterJNI treeUpdaterJNI18;
        TreeUpdaterJNI treeUpdaterJNI19;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI20 = null;
        if (r5.AY4() != null) {
            C67021rj AY4 = r5.AY4();
            if (AY4 != null) {
                treeUpdaterJNI19 = AY4.FHC();
            } else {
                treeUpdaterJNI19 = null;
            }
            A1H.put("achievements_info", treeUpdaterJNI19);
        }
        if (r5.AZY() != null) {
            C67061rp AZY = r5.AZY();
            if (AZY != null) {
                treeUpdaterJNI18 = AZY.FHC();
            } else {
                treeUpdaterJNI18 = null;
            }
            A1H.put("additional_audio_info", treeUpdaterJNI18);
        }
        if (r5.Acg() != null) {
            C270484go Acg = r5.Acg();
            if (Acg != null) {
                treeUpdaterJNI17 = Acg.FHC();
            } else {
                treeUpdaterJNI17 = null;
            }
            A1H.put("asset_recommendation_info", treeUpdaterJNI17);
        }
        if (r5.Adl() != null) {
            C67091rt Adl = r5.Adl();
            if (Adl != null) {
                treeUpdaterJNI16 = Adl.FHC();
            } else {
                treeUpdaterJNI16 = null;
            }
            A1H.put("audio_ranking_info", treeUpdaterJNI16);
        }
        if (r5.Adu() != null) {
            MusicCanonicalType Adu = r5.Adu();
            if (Adu != null) {
                str3 = Adu.A00;
            } else {
                str3 = null;
            }
            A1H.put("audio_type", str3);
        }
        if (r5.Ahp() != null) {
            C67111rx Ahp = r5.Ahp();
            if (Ahp != null) {
                treeUpdaterJNI15 = Ahp.FHC();
            } else {
                treeUpdaterJNI15 = null;
            }
            A1H.put("branded_content_tag_info", treeUpdaterJNI15);
        }
        if (r5.Ahv() != null) {
            C270504gq Ahv = r5.Ahv();
            if (Ahv != null) {
                treeUpdaterJNI14 = Ahv.FHC();
            } else {
                treeUpdaterJNI14 = null;
            }
            A1H.put("breaking_content_info", treeUpdaterJNI14);
        }
        if (r5.Ahw() != null) {
            ClipsBreakingCreatorInfo Ahw = r5.Ahw();
            if (Ahw != null) {
                treeUpdaterJNI13 = Ahw.FHC();
            } else {
                treeUpdaterJNI13 = null;
            }
            A1H.put("breaking_creator_info", treeUpdaterJNI13);
        }
        if (r5.Ame() != null) {
            C270524gs Ame = r5.Ame();
            if (Ame != null) {
                treeUpdaterJNI12 = Ame.FHC();
            } else {
                treeUpdaterJNI12 = null;
            }
            A1H.put("challenge_info", treeUpdaterJNI12);
        }
        if (r5.Anu() != null) {
            ClipsCreationEntryPoint Anu = r5.Anu();
            if (Anu != null) {
                str2 = Anu.A00;
            } else {
                str2 = null;
            }
            A1H.put("clips_creation_entry_point", str2);
        }
        if (r5.AqV() != null) {
            AnonymousClass1s2 AqV = r5.AqV();
            if (AqV != null) {
                treeUpdaterJNI11 = AqV.FHC();
            } else {
                treeUpdaterJNI11 = null;
            }
            A1H.put("content_appreciation_info", treeUpdaterJNI11);
        }
        if (r5.Ar8() != null) {
            ClipsContextualHighlightInfoIntf Ar8 = r5.Ar8();
            if (Ar8 != null) {
                treeUpdaterJNI10 = Ar8.FHC();
            } else {
                treeUpdaterJNI10 = null;
            }
            A1H.put("contextual_highlight_info", treeUpdaterJNI10);
        }
        if (r5.Av2() != null) {
            List<DSU> Av2 = r5.Av2();
            if (Av2 != null) {
                arrayList2 = AnonymousClass7TE.A1C();
                for (DSU dsu : Av2) {
                    if (dsu != null) {
                        arrayList2.add(dsu.FHC());
                    }
                }
            } else {
                arrayList2 = null;
            }
            A1H.put("cutout_sticker_info", arrayList2);
        }
        if (r5.Axb() != null) {
            A1H.put("disable_use_in_clips_client_cache", r5.Axb());
        }
        if (r5.B3C() != null) {
            C270534gt B3C = r5.B3C();
            if (B3C != null) {
                treeUpdaterJNI9 = B3C.FHC();
            } else {
                treeUpdaterJNI9 = null;
            }
            A1H.put("external_media_info", treeUpdaterJNI9);
        }
        if (r5.B4u() != null) {
            A1H.put("featured_label", r5.B4u());
        }
        if (r5.BDO() != null) {
            A1H.put("high_intent_follow_eligible", r5.BDO());
        }
        if (r5.CT8() != null) {
            A1H.put("is_fan_club_promo_video", r5.CT8());
        }
        if (r5.CTA() != null) {
            A1H.put("is_fan_club_welcome_video", r5.CTA());
        }
        if (r5.Ca8() != null) {
            A1H.put("is_public_chat_welcome_video", r5.Ca8());
        }
        if (r5.Cbo() != null) {
            A1H.put("is_shared_to_fb", r5.Cbo());
        }
        if (r5.BP1() != null) {
            C67161s9 BP1 = r5.BP1();
            if (BP1 != null) {
                treeUpdaterJNI8 = BP1.FHC();
            } else {
                treeUpdaterJNI8 = null;
            }
            A1H.put("mashup_info", treeUpdaterJNI8);
        }
        if (r5.BRm() != null) {
            C270544gu BRm = r5.BRm();
            if (BRm != null) {
                treeUpdaterJNI7 = BRm.FHC();
            } else {
                treeUpdaterJNI7 = null;
            }
            A1H.put("merchandising_pill_info", treeUpdaterJNI7);
        }
        if (r5.getMusicCanonicalId() != null) {
            A1H.put("music_canonical_id", r5.getMusicCanonicalId());
        }
        if (r5.BUr() != null) {
            MusicInfo BUr = r5.BUr();
            if (BUr != null) {
                treeUpdaterJNI6 = BUr.FHC();
            } else {
                treeUpdaterJNI6 = null;
            }
            A1H.put("music_info", treeUpdaterJNI6);
        }
        if (r5.BXd() != null) {
            C270554gv BXd = r5.BXd();
            if (BXd != null) {
                treeUpdaterJNI5 = BXd.FHC();
            } else {
                treeUpdaterJNI5 = null;
            }
            A1H.put("nux_info", treeUpdaterJNI5);
        }
        if (r5.BZB() != null) {
            OriginalSoundDataIntf BZB = r5.BZB();
            if (BZB != null) {
                treeUpdaterJNI4 = BZB.FHC();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1H.put("original_sound_info", treeUpdaterJNI4);
        }
        if (r5.BZI() != null) {
            OriginalityInfo BZI = r5.BZI();
            if (BZI != null) {
                treeUpdaterJNI3 = BZI.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1H.put("originality_info", treeUpdaterJNI3);
        }
        if (r5.Bgb() != null) {
            ProfessionalClipsUpsellType Bgb = r5.Bgb();
            if (Bgb != null) {
                str = Bgb.A00;
            } else {
                str = null;
            }
            A1H.put("professional_clips_upsell_type", str);
        }
        if (r5.getReusableTextAttributeString() != null) {
            A1H.put("reusable_text_attribute_string", r5.getReusableTextAttributeString());
        }
        if (r5.BoE() != null) {
            List<C248923io> BoE = r5.BoE();
            if (BoE != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C248923io r0 : BoE) {
                    if (!(r0 == null || (FHC = r0.FHC()) == null)) {
                        arrayList.add(FHC);
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put("reusable_text_info", arrayList);
        }
        if (r5.Btl() != null) {
            ClipsShoppingInfoIntf Btl = r5.Btl();
            if (Btl != null) {
                treeUpdaterJNI2 = Btl.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("shopping_info", treeUpdaterJNI2);
        }
        if (r5.Buz() != null) {
            A1H.put("show_achievements", r5.Buz());
        }
        if (r5.Bw3() != null) {
            A1H.put("show_tips", r5.Bw3());
        }
        if (r5.C1x() != null) {
            A1H.put("stripped_media_id", r5.C1x());
        }
        if (r5.C4a() != null) {
            C270564gw C4a = r5.C4a();
            if (C4a != null) {
                treeUpdaterJNI = C4a.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("template_info", treeUpdaterJNI);
        }
        if (r5.CF4() != null) {
            C270584gy CF4 = r5.CF4();
            if (CF4 != null) {
                treeUpdaterJNI20 = CF4.FHC();
            }
            A1H.put("viewer_interaction_settings", treeUpdaterJNI20);
        }
        return 0Yt.A0B(A1H);
    }
}
