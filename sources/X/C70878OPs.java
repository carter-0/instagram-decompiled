package X;

import java.io.IOException;

/* renamed from: X.OPs  reason: case insensitive filesystem */
public abstract class C70878OPs {
    public static N4Q parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            C270194gL r5 = null;
            Integer num = null;
            String str = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("broadcast".equals(A17)) {
                    r5 = C45893D9w.parseFromJson(r10);
                } else if ("video_offset".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if ("text".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (r5 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("broadcast", r10, "DirectPostLiveReply");
            } else if (num == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("video_offset", r10, "DirectPostLiveReply");
            } else if (str != null || !(r10 instanceof 0c9)) {
                return new N4Q(r5, str, num.intValue());
            } else {
                AnonymousClass7TF.A1L("text", r10, "DirectPostLiveReply");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(N4Q n4q, 17Z r3) {
        r3.A0c();
        C270194gL r1 = (C270194gL) n4q.A01;
        if (r1 != null) {
            r3.A0q("broadcast");
            C45893D9w.A00(r3, r1);
        }
        r3.A0P("video_offset", n4q.A00);
        C41846B3n.A0z(r3, n4q.A02);
        r3.A0Z();
    }
}
