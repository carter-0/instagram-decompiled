package X;

import java.io.IOException;

/* renamed from: X.47k  reason: invalid class name and case insensitive filesystem */
public abstract class C2608847k {
    public static C2608947l parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            Integer num = null;
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            while (r12.A1J() != 16L.A09) {
                String A0q = r12.A0q();
                r12.A1J();
                if ("audience_type".equals(A0q)) {
                    num = Integer.valueOf(r12.A1D());
                } else if ("is_added_to_inbox".equals(A0q)) {
                    bool = Boolean.valueOf(r12.A0d());
                } else if ("is_collaborator".equals(A0q)) {
                    bool2 = Boolean.valueOf(r12.A0d());
                } else if ("is_follower".equals(A0q)) {
                    bool3 = Boolean.valueOf(r12.A0d());
                } else if ("is_invited_collaborator".equals(A0q)) {
                    bool4 = Boolean.valueOf(r12.A0d());
                } else if ("is_subscriber".equals(A0q)) {
                    bool5 = Boolean.valueOf(r12.A0d());
                }
                r12.A0z();
            }
            if (num == null && (r12 instanceof 0c9)) {
                ((0c9) r12).A03.A00("audience_type", "CreatorBroadcastChatThreadPreviewResponseImpl");
            } else if (bool != null || !(r12 instanceof 0c9)) {
                return new C2608947l(bool2, bool3, bool4, bool5, num.intValue(), bool.booleanValue());
            } else {
                ((0c9) r12).A03.A00("is_added_to_inbox", "CreatorBroadcastChatThreadPreviewResponseImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
