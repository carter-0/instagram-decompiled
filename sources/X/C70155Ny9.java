package X;

import java.io.IOException;

/* renamed from: X.Ny9  reason: case insensitive filesystem */
public abstract class C70155Ny9 {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.OHq] */
    public static C70721OHq parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("audience_type".equals(A17)) {
                    obj.A00 = AnonymousClass7TF.A0X(r4);
                } else if (C41845B3m.A19(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    obj.A05 = A0l;
                } else if ("subtitle".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    obj.A03 = A0l2;
                } else if ("profile_picture_url".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    obj.A02 = A0l3;
                } else if ("thread_igid".equals(A17)) {
                    String A0l4 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l4, 0);
                    obj.A04 = A0l4;
                } else if ("creator_username".equals(A17)) {
                    String A0l5 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l5, 0);
                    obj.A01 = A0l5;
                } else if ("show_verified_badge".equals(A17)) {
                    obj.A07 = r4.A0d();
                } else if ("is_unread".equals(A17)) {
                    obj.A06 = r4.A0d();
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
