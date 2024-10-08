package X;

import java.io.IOException;

/* renamed from: X.Ejr  reason: case insensitive filesystem */
public abstract class C48768Ejr {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.F0A] */
    public static F0A parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("url".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("lock".equals(A17)) {
                    obj.A05 = r3.A0d();
                } else if ("api_path".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r3);
                } else if ("hide_webview_header".equals(A17)) {
                    obj.A03 = r3.A0d();
                } else if ("challenge_context".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("is_dialog".equals(A17)) {
                    obj.A04 = r3.A0d();
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
