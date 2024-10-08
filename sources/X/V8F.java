package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ElectionAddYoursInfoDictIntf;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.api.schemas.StoryPromptDisablementState;
import com.instagram.api.schemas.StoryPromptFailureTooltipDictIntf;
import com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict;
import com.instagram.api.schemas.StoryPromptTappableDataIntf;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.api.schemas.StoryTemplateDictIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class V8F {
    public static Map A00(StoryPromptTappableDataIntf storyPromptTappableDataIntf) {
        String str;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (storyPromptTappableDataIntf.getBackgroundColor() != null) {
            linkedHashMap.put("background_color", storyPromptTappableDataIntf.getBackgroundColor());
        }
        if (storyPromptTappableDataIntf.Axh() != null) {
            StoryPromptDisablementState Axh = storyPromptTappableDataIntf.Axh();
            0qQ.A0B(Axh, 0);
            linkedHashMap.put("disablement_state", Axh.A00);
        }
        TreeUpdaterJNI treeUpdaterJNI5 = null;
        if (storyPromptTappableDataIntf.B0N() != null) {
            ElectionAddYoursInfoDictIntf B0N = storyPromptTappableDataIntf.B0N();
            if (B0N != null) {
                treeUpdaterJNI4 = B0N.FHC();
            } else {
                treeUpdaterJNI4 = null;
            }
            linkedHashMap.put("election_add_yours_info", treeUpdaterJNI4);
        }
        if (storyPromptTappableDataIntf.B3f() != null) {
            List B3f = storyPromptTappableDataIntf.B3f();
            ArrayList A0r = AnonymousClass7TG.A0r(B3f);
            Iterator it = B3f.iterator();
            while (it.hasNext()) {
                C41846B3n.A1T(A0r, it);
            }
            linkedHashMap.put("facepile_top_participants", A0r);
        }
        if (storyPromptTappableDataIntf.B91() != null) {
            GenAIToolInfoDictIntf B91 = storyPromptTappableDataIntf.B91();
            if (B91 != null) {
                treeUpdaterJNI3 = B91.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            linkedHashMap.put(AnonymousClass000.A00(1383), treeUpdaterJNI3);
        }
        if (storyPromptTappableDataIntf.BBm() != null) {
            linkedHashMap.put("has_participated", storyPromptTappableDataIntf.BBm());
        }
        if (storyPromptTappableDataIntf.getId() != null) {
            C41845B3m.A0x(storyPromptTappableDataIntf.getId(), linkedHashMap);
        }
        if (storyPromptTappableDataIntf.CPO() != null) {
            linkedHashMap.put("is_before_and_after", storyPromptTappableDataIntf.CPO());
        }
        if (storyPromptTappableDataIntf.CQE() != null) {
            linkedHashMap.put("is_clips_v2_media", storyPromptTappableDataIntf.CQE());
        }
        if (storyPromptTappableDataIntf.CQh() != null) {
            linkedHashMap.put("is_created_from_add_yours_browsing", storyPromptTappableDataIntf.CQh());
        }
        if (storyPromptTappableDataIntf.CTy() != null) {
            linkedHashMap.put("is_from_add_yours_camera_tool", storyPromptTappableDataIntf.CTy());
        }
        if (storyPromptTappableDataIntf.CUt() != null) {
            linkedHashMap.put("is_icon_disabled", storyPromptTappableDataIntf.CUt());
        }
        if (storyPromptTappableDataIntf.CYj() != null) {
            linkedHashMap.put("is_original_prompt_media", storyPromptTappableDataIntf.CYj());
        }
        if (storyPromptTappableDataIntf.CZB() != null) {
            linkedHashMap.put("is_pinned_by_creator", storyPromptTappableDataIntf.CZB());
        }
        if (storyPromptTappableDataIntf.CcH() != null) {
            linkedHashMap.put("is_speakeasy", storyPromptTappableDataIntf.CcH());
        }
        if (storyPromptTappableDataIntf.Ccg() != null) {
            linkedHashMap.put("is_story_trending_prompt", storyPromptTappableDataIntf.Ccg());
        }
        if (storyPromptTappableDataIntf.Cdf() != null) {
            linkedHashMap.put("is_trending_prompt", storyPromptTappableDataIntf.Cdf());
        }
        if (storyPromptTappableDataIntf.Cej() != null) {
            linkedHashMap.put("is_viewer_original_author", storyPromptTappableDataIntf.Cej());
        }
        if (storyPromptTappableDataIntf.getMediaId() != null) {
            linkedHashMap.put("media_id", storyPromptTappableDataIntf.getMediaId());
        }
        User BYz = storyPromptTappableDataIntf.BYz();
        if (BYz != null) {
            linkedHashMap.put("original_author", BYz.A08());
        }
        storyPromptTappableDataIntf.Bak();
        linkedHashMap.put("participant_count", Integer.valueOf(storyPromptTappableDataIntf.Bak()));
        if (storyPromptTappableDataIntf.Ban() != null) {
            StoryPromptParticipationFrictionInfoDict Ban = storyPromptTappableDataIntf.Ban();
            if (Ban != null) {
                treeUpdaterJNI2 = Ban.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put(C273654mx.A00(873), treeUpdaterJNI2);
        }
        if (storyPromptTappableDataIntf.Bho() != null) {
            StoryPromptFailureTooltipDictIntf Bho = storyPromptTappableDataIntf.Bho();
            if (Bho != null) {
                treeUpdaterJNI = Bho.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("prompt_failure_tooltip", treeUpdaterJNI);
        }
        if (storyPromptTappableDataIntf.Bhs() != null) {
            linkedHashMap.put("prompt_style", storyPromptTappableDataIntf.Bhs());
        }
        if (storyPromptTappableDataIntf.Bhw() != null) {
            StoryPromptType Bhw = storyPromptTappableDataIntf.Bhw();
            if (Bhw != null) {
                str = Bhw.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("prompt_type", str);
        }
        if (storyPromptTappableDataIntf.Bzk() != null) {
            linkedHashMap.put("sticker_style_str", storyPromptTappableDataIntf.Bzk());
        }
        if (storyPromptTappableDataIntf.C1M() != null) {
            StoryTemplateDictIntf C1M = storyPromptTappableDataIntf.C1M();
            if (C1M != null) {
                treeUpdaterJNI5 = C1M.FHC();
            }
            linkedHashMap.put("story_template", treeUpdaterJNI5);
        }
        if (storyPromptTappableDataIntf.getText() != null) {
            linkedHashMap.put("text", storyPromptTappableDataIntf.getText());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
