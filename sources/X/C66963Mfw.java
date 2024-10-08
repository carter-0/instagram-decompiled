package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Mfw  reason: case insensitive filesystem */
public abstract /* synthetic */ class C66963Mfw {
    public static Map A00(C2609247o r3) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.AsV() != null) {
            C2609047m AsV = r3.AsV();
            if (AsV != null) {
                treeUpdaterJNI = AsV.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("creator_broadcast_chat_thread_preview_response", treeUpdaterJNI);
        }
        if (r3.AsY() != null) {
            A1H.put("creator_igid", r3.AsY());
        }
        if (r3.Asi() != null) {
            A1H.put("creator_username", r3.Asi());
        }
        if (r3.B9y() != null) {
            A1H.put("group_image_background_uri", r3.B9y());
        }
        if (r3.B9z() != null) {
            A1H.put("group_image_uri", r3.B9z());
        }
        if (r3.BIn() != null) {
            A1H.put("invite_link", r3.BIn());
        }
        if (r3.CQt() != null) {
            A1H.put("is_creator_verified", r3.CQt());
        }
        if (r3.CX9() != null) {
            A1H.put("is_member", r3.CX9());
        }
        if (r3.BXU() != null) {
            A1H.put("number_of_members", r3.BXU());
        }
        if (r3.Btz() != null) {
            A1H.put("should_badge_channel", r3.Btz());
        }
        if (r3.BxL() != null) {
            A1H.put("social_channel_invite_id", r3.BxL());
        }
        if (r3.BxX() != null) {
            A1H.put(C273654mx.A00(186), r3.BxX());
        }
        if (r3.getSubtitle() != null) {
            A1H.put("subtitle", r3.getSubtitle());
        }
        if (r3.C6E() != null) {
            A1H.put("thread_igid", r3.C6E());
        }
        if (r3.C6b() != null) {
            A1H.put("thread_subtype", r3.C6b());
        }
        if (r3.getTitle() != null) {
            A1H.put(DialogModule.KEY_TITLE, r3.getTitle());
        }
        return 0Yt.A0B(A1H);
    }
}
