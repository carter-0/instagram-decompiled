package X;

import java.io.IOException;

/* renamed from: X.Nwk  reason: case insensitive filesystem */
public abstract class C70068Nwk {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.OW8, java.lang.Object] */
    public static OW8 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (AnonymousClass000.A00(360).equals(A17)) {
                    obj.A09 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(1738).equals(A17)) {
                    obj.A07 = AnonymousClass7TG.A0l(r3);
                } else if ("item_id".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("original_message_client_context".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("reaction_client_context".equals(A17)) {
                    obj.A06 = AnonymousClass7TG.A0l(r3);
                } else if ("message_content_type_id".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("emoji".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("super_react_type".equals(A17)) {
                    obj.A08 = AnonymousClass7TG.A0l(r3);
                } else if ("reaction_action_source".equals(A17)) {
                    obj.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("avatar_reaction".equals(A17)) {
                    obj.A00 = C70872OPl.parseFromJson(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
