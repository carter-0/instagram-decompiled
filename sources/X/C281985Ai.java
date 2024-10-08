package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ElectionAddYoursInfoDict;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.api.schemas.StoryLinkInfoDict;
import com.instagram.api.schemas.StoryPromptDisablementState;
import com.instagram.api.schemas.StoryPromptFailureTooltipDict;
import com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict;
import com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDictImpl;
import com.instagram.api.schemas.StoryPromptParticipationFrictionType;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.api.schemas.StoryTemplateDict;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Ai  reason: invalid class name and case insensitive filesystem */
public abstract class C281985Ai {
    public static void A00(17Z r4, StoryPromptTappableData storyPromptTappableData, boolean z) {
        if (z) {
            r4.A0c();
        }
        String str = storyPromptTappableData.A0L;
        if (str != null) {
            r4.A0R("background_color", str);
        }
        StoryPromptDisablementState storyPromptDisablementState = storyPromptTappableData.A03;
        if (storyPromptDisablementState != null) {
            r4.A0R("disablement_state", storyPromptDisablementState.A00);
        }
        ElectionAddYoursInfoDict electionAddYoursInfoDict = storyPromptTappableData.A01;
        if (electionAddYoursInfoDict != null) {
            r4.A0q("election_add_yours_info");
            r4.A0c();
            Boolean bool = electionAddYoursInfoDict.A00;
            if (bool != null) {
                r4.A0S("disable_bottom_sheet", bool.booleanValue());
            }
            List<String> list = electionAddYoursInfoDict.A02;
            if (list != null) {
                16P.A03(r4, "title_options");
                for (String str2 : list) {
                    if (str2 != null) {
                        r4.A0t(str2);
                    }
                }
                r4.A0Y();
            }
            String str3 = electionAddYoursInfoDict.A01;
            if (str3 != null) {
                r4.A0R("tray_title", str3);
            }
            r4.A0Z();
        }
        List<User> list2 = storyPromptTappableData.A0R;
        if (list2 != null) {
            16P.A03(r4, "facepile_top_participants");
            for (User user : list2) {
                if (user != null) {
                    Parcelable.Creator creator = User.CREATOR;
                    1aC.A08(r4, user);
                }
            }
            r4.A0Y();
        }
        GenAIToolInfoDict genAIToolInfoDict = storyPromptTappableData.A02;
        if (genAIToolInfoDict != null) {
            r4.A0q("gen_ai_tool_info");
            C63981LGz.A00(r4, genAIToolInfoDict);
        }
        Boolean bool2 = storyPromptTappableData.A09;
        if (bool2 != null) {
            r4.A0S("has_participated", bool2.booleanValue());
        }
        String str4 = storyPromptTappableData.A0M;
        if (str4 != null) {
            r4.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str4);
        }
        Boolean bool3 = storyPromptTappableData.A0A;
        if (bool3 != null) {
            r4.A0S("is_before_and_after", bool3.booleanValue());
        }
        Boolean bool4 = storyPromptTappableData.A0B;
        if (bool4 != null) {
            r4.A0S("is_clips_v2_media", bool4.booleanValue());
        }
        Boolean bool5 = storyPromptTappableData.A0C;
        if (bool5 != null) {
            r4.A0S("is_created_from_add_yours_browsing", bool5.booleanValue());
        }
        Boolean bool6 = storyPromptTappableData.A0D;
        if (bool6 != null) {
            r4.A0S("is_from_add_yours_camera_tool", bool6.booleanValue());
        }
        Boolean bool7 = storyPromptTappableData.A0E;
        if (bool7 != null) {
            r4.A0S("is_icon_disabled", bool7.booleanValue());
        }
        Boolean bool8 = storyPromptTappableData.A0F;
        if (bool8 != null) {
            r4.A0S("is_original_prompt_media", bool8.booleanValue());
        }
        Boolean bool9 = storyPromptTappableData.A0G;
        if (bool9 != null) {
            r4.A0S("is_pinned_by_creator", bool9.booleanValue());
        }
        Boolean bool10 = storyPromptTappableData.A0H;
        if (bool10 != null) {
            r4.A0S("is_speakeasy", bool10.booleanValue());
        }
        Boolean bool11 = storyPromptTappableData.A0I;
        if (bool11 != null) {
            r4.A0S("is_story_trending_prompt", bool11.booleanValue());
        }
        Boolean bool12 = storyPromptTappableData.A0J;
        if (bool12 != null) {
            r4.A0S("is_trending_prompt", bool12.booleanValue());
        }
        Boolean bool13 = storyPromptTappableData.A0K;
        if (bool13 != null) {
            r4.A0S("is_viewer_original_author", bool13.booleanValue());
        }
        String str5 = storyPromptTappableData.A0N;
        if (str5 != null) {
            r4.A0R("media_id", str5);
        }
        User user2 = storyPromptTappableData.A08;
        if (user2 != null) {
            r4.A0q("original_author");
            Parcelable.Creator creator2 = User.CREATOR;
            1aC.A08(r4, user2);
        }
        r4.A0P("participant_count", storyPromptTappableData.A00);
        StoryPromptParticipationFrictionInfoDict storyPromptParticipationFrictionInfoDict = storyPromptTappableData.A05;
        if (storyPromptParticipationFrictionInfoDict != null) {
            r4.A0q("participation_friction_info");
            StoryPromptParticipationFrictionInfoDictImpl FAq = storyPromptParticipationFrictionInfoDict.FAq();
            r4.A0c();
            String str6 = FAq.A02;
            if (str6 != null) {
                r4.A0R("body_1", str6);
            }
            String str7 = FAq.A03;
            if (str7 != null) {
                r4.A0R("body_2", str7);
            }
            StoryLinkInfoDict storyLinkInfoDict = FAq.A00;
            if (storyLinkInfoDict != null) {
                r4.A0q("body_2_link");
                AnonymousClass5Ig.A00(r4, storyLinkInfoDict, true);
            }
            StoryPromptParticipationFrictionType storyPromptParticipationFrictionType = FAq.A01;
            if (storyPromptParticipationFrictionType != null) {
                r4.A0R("friction_type", storyPromptParticipationFrictionType.A00);
            }
            String str8 = FAq.A04;
            if (str8 != null) {
                r4.A0R(DialogModule.KEY_TITLE, str8);
            }
            r4.A0Z();
        }
        StoryPromptFailureTooltipDict storyPromptFailureTooltipDict = storyPromptTappableData.A04;
        if (storyPromptFailureTooltipDict != null) {
            r4.A0q("prompt_failure_tooltip");
            r4.A0c();
            String str9 = storyPromptFailureTooltipDict.A00;
            if (str9 != null) {
                r4.A0R("error_message_body", str9);
            }
            String str10 = storyPromptFailureTooltipDict.A01;
            if (str10 != null) {
                r4.A0R("error_message_title", str10);
            }
            r4.A0Z();
        }
        String str11 = storyPromptTappableData.A0O;
        if (str11 != null) {
            r4.A0R("prompt_style", str11);
        }
        StoryPromptType storyPromptType = storyPromptTappableData.A06;
        if (storyPromptType != null) {
            r4.A0R("prompt_type", storyPromptType.A00);
        }
        String str12 = storyPromptTappableData.A0P;
        if (str12 != null) {
            r4.A0R("sticker_style_str", str12);
        }
        StoryTemplateDict storyTemplateDict = storyPromptTappableData.A07;
        if (storyTemplateDict != null) {
            r4.A0q("story_template");
            C282005Al.A00(r4, storyTemplateDict);
        }
        String str13 = storyPromptTappableData.A0Q;
        if (str13 != null) {
            r4.A0R("text", str13);
        }
        if (z) {
            r4.A0Z();
        }
    }

    public static StoryPromptTappableData parseFromJson(16F r40) {
        String str;
        String str2;
        16F r1 = r40;
        0qQ.A0B(r1, 0);
        try {
            Integer num = null;
            if (r1.A11() != 16L.A0D) {
                r1.A0z();
                return null;
            }
            String str3 = null;
            StoryPromptDisablementState storyPromptDisablementState = null;
            ElectionAddYoursInfoDict electionAddYoursInfoDict = null;
            ArrayList arrayList = null;
            GenAIToolInfoDict genAIToolInfoDict = null;
            Boolean bool = null;
            String str4 = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            String str5 = null;
            User user = null;
            StoryPromptParticipationFrictionInfoDictImpl storyPromptParticipationFrictionInfoDictImpl = null;
            StoryPromptFailureTooltipDict storyPromptFailureTooltipDict = null;
            String str6 = null;
            StoryPromptType storyPromptType = null;
            String str7 = null;
            StoryTemplateDict storyTemplateDict = null;
            String str8 = null;
            while (r1.A1J() != 16L.A09) {
                String A0q = r1.A0q();
                r1.A1J();
                if ("background_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r1.A1P();
                    }
                } else if ("disablement_state".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r1.A1P();
                    }
                    storyPromptDisablementState = C281995Aj.A00(str2);
                } else if ("election_add_yours_info".equals(A0q)) {
                    electionAddYoursInfoDict = C369358uQ.parseFromJson(r1);
                } else if ("facepile_top_participants".equals(A0q)) {
                    if (r1.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r1.A1J() != 16L.A08) {
                            Parcelable.Creator creator = User.CREATOR;
                            User A00 = 1aC.A00(r1, false);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("gen_ai_tool_info".equals(A0q)) {
                    genAIToolInfoDict = C63981LGz.parseFromJson(r1);
                } else if ("has_participated".equals(A0q)) {
                    bool = Boolean.valueOf(r1.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r1.A1P();
                    }
                } else if ("is_before_and_after".equals(A0q)) {
                    bool2 = Boolean.valueOf(r1.A0d());
                } else if ("is_clips_v2_media".equals(A0q)) {
                    bool3 = Boolean.valueOf(r1.A0d());
                } else if ("is_created_from_add_yours_browsing".equals(A0q)) {
                    bool4 = Boolean.valueOf(r1.A0d());
                } else if ("is_from_add_yours_camera_tool".equals(A0q)) {
                    bool5 = Boolean.valueOf(r1.A0d());
                } else if ("is_icon_disabled".equals(A0q)) {
                    bool6 = Boolean.valueOf(r1.A0d());
                } else if ("is_original_prompt_media".equals(A0q)) {
                    bool7 = Boolean.valueOf(r1.A0d());
                } else if ("is_pinned_by_creator".equals(A0q)) {
                    bool8 = Boolean.valueOf(r1.A0d());
                } else if ("is_speakeasy".equals(A0q)) {
                    bool9 = Boolean.valueOf(r1.A0d());
                } else if ("is_story_trending_prompt".equals(A0q)) {
                    bool10 = Boolean.valueOf(r1.A0d());
                } else if ("is_trending_prompt".equals(A0q)) {
                    bool11 = Boolean.valueOf(r1.A0d());
                } else if ("is_viewer_original_author".equals(A0q)) {
                    bool12 = Boolean.valueOf(r1.A0d());
                } else if ("media_id".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r1.A1P();
                    }
                } else if ("original_author".equals(A0q)) {
                    Parcelable.Creator creator2 = User.CREATOR;
                    user = 1aC.A00(r1, false);
                } else if ("participant_count".equals(A0q)) {
                    num = Integer.valueOf(r1.A1D());
                } else if ("participation_friction_info".equals(A0q)) {
                    storyPromptParticipationFrictionInfoDictImpl = C44423Ceh.parseFromJson(r1);
                } else if ("prompt_failure_tooltip".equals(A0q)) {
                    storyPromptFailureTooltipDict = C44421Cef.parseFromJson(r1);
                } else if ("prompt_style".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r1.A1P();
                    }
                } else if ("prompt_type".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r1.A1P();
                    }
                    storyPromptType = (StoryPromptType) StoryPromptType.A01.get(str);
                    if (storyPromptType == null) {
                        storyPromptType = StoryPromptType.UNRECOGNIZED;
                    }
                } else if ("sticker_style_str".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r1.A1P();
                    }
                } else if ("story_template".equals(A0q)) {
                    storyTemplateDict = C282005Al.parseFromJson(r1);
                } else if ("text".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r1.A1P();
                    }
                }
                r1.A0z();
            }
            if (storyPromptDisablementState == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("disablement_state", "StoryPromptTappableData");
            } else if (arrayList == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("facepile_top_participants", "StoryPromptTappableData");
            } else if (str4 == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "StoryPromptTappableData");
            } else if (num == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("participant_count", "StoryPromptTappableData");
            } else if (str8 != null || !(r1 instanceof 0c9)) {
                return new StoryPromptTappableData(electionAddYoursInfoDict, genAIToolInfoDict, storyPromptDisablementState, storyPromptFailureTooltipDict, storyPromptParticipationFrictionInfoDictImpl, storyPromptType, storyTemplateDict, user, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, str3, str4, str5, str6, str7, str8, arrayList, num.intValue());
            } else {
                ((0c9) r1).A03.A00("text", "StoryPromptTappableData");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
