package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.AiAgentMetadataDict;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.VFf  reason: case insensitive filesystem */
public abstract /* synthetic */ class C17031VFf {
    public static Map A00(XB3 xb3) {
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI;
        String str;
        String str2;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xb3.AYg() != null) {
            linkedHashMap.put("active_member_count", xb3.AYg());
        }
        String str3 = null;
        if (xb3.AaP() != null) {
            AiAgentMetadataDict AaP = xb3.AaP();
            if (AaP != null) {
                treeUpdaterJNI2 = AaP.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put("ai_agent_metadata", treeUpdaterJNI2);
        }
        if (xb3.AaW() != null) {
            linkedHashMap.put("ai_agent_toast_msg", xb3.AaW());
        }
        if (xb3.AdO() != null) {
            linkedHashMap.put("audience_type", xb3.AdO());
        }
        if (xb3.An3() != null) {
            ChatStickerChannelType An3 = xb3.An3();
            if (An3 != null) {
                str2 = An3.A00;
            } else {
                str2 = null;
            }
            linkedHashMap.put("chat_type", str2);
        }
        if (xb3.Aq0() != null) {
            linkedHashMap.put("connected_member_count", xb3.Aq0());
        }
        if (xb3.Avk() != null) {
            linkedHashMap.put("deeplink_url", xb3.Avk());
        }
        if (xb3.AzS() != null) {
            linkedHashMap.put("duration_s", xb3.AzS());
        }
        if (xb3.B20() != null) {
            linkedHashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, xb3.B20());
        }
        if (xb3.B9z() != null) {
            linkedHashMap.put("group_image_uri", xb3.B9z());
        }
        if (xb3.CQj() != null) {
            linkedHashMap.put("is_creation", xb3.CQj());
        }
        if (xb3.CRj() != null) {
            linkedHashMap.put("is_editing_enabled", xb3.CRj());
        }
        if (xb3.BJT() != null) {
            linkedHashMap.put("item_info", xb3.BJT());
        }
        if (xb3.BRU() != null) {
            linkedHashMap.put("member_count", xb3.BRU());
        }
        if (xb3.BRY() != null) {
            StoryJoinChatStatus BRY = xb3.BRY();
            if (BRY != null) {
                str = BRY.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("member_status", str);
        }
        if (xb3.Baj() != null) {
            C21040XAt Baj = xb3.Baj();
            if (Baj != null) {
                treeUpdaterJNI = Baj.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("partial_render_info", treeUpdaterJNI);
        }
        User BsL = xb3.BsL();
        if (BsL != null) {
            linkedHashMap.put("sender_info", BsL.A08());
        }
        if (xb3.BtI() != null) {
            linkedHashMap.put("share_source", xb3.BtI());
        }
        if (xb3.BxY() != null) {
            List<XAY> BxY = xb3.BxY();
            if (BxY != null) {
                arrayList = new ArrayList();
                for (XAY xay : BxY) {
                    if (xay != null) {
                        arrayList.add(xay.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put("social_context_users", arrayList);
        }
        if (xb3.Bzn() != null) {
            ChatStickerStickerType Bzn = xb3.Bzn();
            if (Bzn != null) {
                str3 = Bzn.A00;
            }
            linkedHashMap.put("sticker_type", str3);
        }
        if (xb3.C0I() != null) {
            linkedHashMap.put("story_chat_id", xb3.C0I());
        }
        if (xb3.C6C() != null) {
            linkedHashMap.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, xb3.C6C());
        }
        if (xb3.C6D() != null) {
            linkedHashMap.put("thread_id_v2", xb3.C6D());
        }
        if (xb3.getTitle() != null) {
            linkedHashMap.put(DialogModule.KEY_TITLE, xb3.getTitle());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
