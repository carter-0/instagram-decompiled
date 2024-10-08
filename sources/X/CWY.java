package X;

import com.instagram.user.model.User;
import java.io.IOException;

public abstract class CWY {
    public static BBJ parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            Integer num = null;
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            User user = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("audience_type".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r14);
                } else if ("is_added_to_inbox".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r14);
                } else if ("is_collaborator".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r14);
                } else if ("is_follower".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r14);
                } else if ("is_invited_collaborator".equals(A17)) {
                    bool4 = AnonymousClass7TF.A0S(r14);
                } else if ("is_subscriber".equals(A17)) {
                    bool5 = AnonymousClass7TF.A0S(r14);
                } else {
                    user = C41846B3n.A0a(r14, user, A17, "thread_creator");
                }
                r14.A0z();
            }
            if (num == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("audience_type", r14, "CreatorBroadcastChatThreadGroupLinkPreviewResponse");
            } else if (bool == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_added_to_inbox", r14, "CreatorBroadcastChatThreadGroupLinkPreviewResponse");
            } else if (user != null || !(r14 instanceof 0c9)) {
                return new BBJ(user, bool2, bool3, bool4, bool5, num.intValue(), bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("thread_creator", r14, "CreatorBroadcastChatThreadGroupLinkPreviewResponse");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
