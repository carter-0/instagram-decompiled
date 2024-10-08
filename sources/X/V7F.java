package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GroupMetadata;
import com.instagram.api.schemas.RingSpec;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V7F {
    public static Map A00(GroupMetadata groupMetadata) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (groupMetadata.AZs() != null) {
            linkedHashMap.put("admin_ids", groupMetadata.AZs());
        }
        if (groupMetadata.Ag7() != null) {
            linkedHashMap.put("blocked_user_ids", groupMetadata.Ag7());
        }
        groupMetadata.AkJ();
        linkedHashMap.put("can_post", Boolean.valueOf(groupMetadata.AkJ()));
        if (groupMetadata.Amh() != null) {
            linkedHashMap.put("channel_admin_id", groupMetadata.Amh());
        }
        if (groupMetadata.An2() != null) {
            linkedHashMap.put("chat_thread_id", groupMetadata.An2());
        }
        if (groupMetadata.B9w() != null) {
            linkedHashMap.put("group_fbid", groupMetadata.B9w());
        }
        if (groupMetadata.BA7() != null) {
            linkedHashMap.put("group_pk", groupMetadata.BA7());
        }
        groupMetadata.BA9();
        linkedHashMap.put(AnonymousClass000.A00(153), Boolean.valueOf(groupMetadata.BA9()));
        groupMetadata.BBo();
        linkedHashMap.put("has_pending_admin_invite", Boolean.valueOf(groupMetadata.BBo()));
        if (groupMetadata.BD4() != null) {
            linkedHashMap.put("hidden", groupMetadata.BD4());
        }
        groupMetadata.CUG();
        linkedHashMap.put("is_group", Boolean.valueOf(groupMetadata.CUG()));
        groupMetadata.CUI();
        linkedHashMap.put("is_group_full", Boolean.valueOf(groupMetadata.CUI()));
        groupMetadata.CUM();
        linkedHashMap.put("is_group_notes_allowed", Boolean.valueOf(groupMetadata.CUM()));
        groupMetadata.CaS();
        linkedHashMap.put("is_recommendable", Boolean.valueOf(groupMetadata.CaS()));
        groupMetadata.Cec();
        linkedHashMap.put("is_viewer_admin", Boolean.valueOf(groupMetadata.Cec()));
        groupMetadata.Ceg();
        linkedHashMap.put("is_viewer_in_chat_thread", Boolean.valueOf(groupMetadata.Ceg()));
        groupMetadata.Ceh();
        linkedHashMap.put("is_viewer_invited", Boolean.valueOf(groupMetadata.Ceh()));
        if (groupMetadata.BOs() != null) {
            linkedHashMap.put("mandatory_approvals_expire_at", groupMetadata.BOs());
        }
        groupMetadata.BWo();
        linkedHashMap.put("num_admins", Integer.valueOf(groupMetadata.BWo()));
        groupMetadata.BWr();
        linkedHashMap.put("num_blocked_users", Integer.valueOf(groupMetadata.BWr()));
        groupMetadata.BX4();
        linkedHashMap.put("num_pending_follow_requests", Integer.valueOf(groupMetadata.BX4()));
        groupMetadata.BX5();
        linkedHashMap.put("num_pending_invites", Integer.valueOf(groupMetadata.BX5()));
        groupMetadata.BX6();
        linkedHashMap.put("num_pending_notes", Integer.valueOf(groupMetadata.BX6()));
        groupMetadata.BX7();
        linkedHashMap.put("num_pending_notes_by_viewer", Integer.valueOf(groupMetadata.BX7()));
        groupMetadata.BX8();
        linkedHashMap.put("num_pending_posts", Integer.valueOf(groupMetadata.BX8()));
        groupMetadata.BX9();
        linkedHashMap.put("num_pending_posts_by_viewer", Integer.valueOf(groupMetadata.BX9()));
        if (groupMetadata.BbO() != null) {
            linkedHashMap.put("pending_admin_ids", groupMetadata.BbO());
        }
        if (groupMetadata.BoX() != null) {
            RingSpec BoX = groupMetadata.BoX();
            if (BoX != null) {
                treeUpdaterJNI = BoX.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("ring_spec", treeUpdaterJNI);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
