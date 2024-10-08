package X;

import com.facebook.proxygen.TraceFieldType;

public final class FEM {
    public static final FEM A00 = new Object();

    public static final void A00(0wc r1, String str, String str2, String str3) {
        0Aj A0e = AnonymousClass7TE.A0e(r1, "ig_to_fb_deep_deletion_client");
        if (A0e.isSampled()) {
            A0e.AAJ("ig_user_id", str);
            A0e.AAJ(TraceFieldType.AdhocEventName, str3);
            DbS.A1M(A0e, "reels");
            A0e.AAJ("post_id", str2);
            A0e.Cgf();
        }
    }
}
