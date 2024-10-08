package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.io.IOException;

/* renamed from: X.9zt  reason: invalid class name and case insensitive filesystem */
public abstract class C395519zt {
    public static C65481cr parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C65481cr r1 = new C65481cr();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("reel_owner_user_id".equals(A17)) {
                    r1.A0J = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(3854).equals(A17)) {
                    r1.A0I = AnonymousClass7TG.A0l(r3);
                } else if ("reel_share".equals(A17)) {
                    r1.A00 = C70879OPt.parseFromJson(r3);
                } else if ("reaction_name".equals(A17)) {
                    r1.A0H = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(1126).equals(A17)) {
                    r1.A08 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(2683).equals(A17)) {
                    r1.A0A = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(4514).equals(A17)) {
                    r1.A09 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(725).equals(A17)) {
                    r1.A07 = AnonymousClass7TF.A0X(r3);
                } else if ("gif_id".equals(A17)) {
                    r1.A0D = AnonymousClass7TG.A0l(r3);
                } else if ("gif_is_sticker".equals(A17)) {
                    r1.A0K = r3.A0d();
                } else if (AnonymousClass000.A00(3397).equals(A17)) {
                    r1.A0F = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(663).equals(A17)) {
                    r1.A0G = AnonymousClass7TG.A0l(r3);
                } else if ("interact_user_id".equals(A17)) {
                    r1.A0E = AnonymousClass7TG.A0l(r3);
                } else if ("emoji_reaction_unicode".equals(A17)) {
                    r1.A0B = AnonymousClass7TG.A0l(r3);
                } else if (ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY.equals(A17)) {
                    r1.A0C = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(679).equals(A17)) {
                    r1.A05 = AnonymousClass7TF.A0S(r3);
                } else if ("receiver_is_online".equals(A17)) {
                    r1.A06 = AnonymousClass7TF.A0S(r3);
                } else if ("reaction_image_url_info".equals(A17)) {
                    r1.A01 = 16W.parseFromJson(r3);
                } else if ("is_group".equals(A17)) {
                    r1.A02 = AnonymousClass7TF.A0S(r3);
                } else if ("is_group_profile_story_reply".equals(A17)) {
                    r1.A03 = AnonymousClass7TF.A0S(r3);
                } else if ("is_highlight_reel".equals(A17)) {
                    r1.A04 = AnonymousClass7TF.A0S(r3);
                } else {
                    C66893Meb.A01(r3, r1, A17);
                }
                r3.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
