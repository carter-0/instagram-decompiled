package X;

/* renamed from: X.EqN  reason: case insensitive filesystem */
public abstract class C49156EqN {
    public static void A00(C58840Ae r5, C54689HOu hOu, String str, String str2, String str3, boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        0Aj A0e = AnonymousClass7TE.A0e((0wc) r5, "instagram_user_tag_tap");
        if (A0e.isSampled()) {
            A0e.A8M(hOu, "action_source");
            DbS.A1O(A0e, str);
            A0e.AAJ("media_compound_key", str2);
            A0e.AAE(C263944Ny.A00(str3), "target_id");
            A0e.A9F("has_category_label", Long.valueOf(j));
            A0e.Cgf();
        }
    }
}
