package X;

import java.io.IOException;

/* renamed from: X.3SY  reason: invalid class name */
public abstract class AnonymousClass3SY {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.3Sa, X.3SZ, java.lang.Object] */
    public static AnonymousClass3SZ parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("created_at".equals(A0q)) {
                    obj.A00 = r3.A0y();
                } else if ("shh_seen_state".equals(A0q)) {
                    obj.A02 = C241963Sb.parseFromJson(r3);
                } else if ("disappearing_messages_seen_state".equals(A0q)) {
                    obj.A01 = C241983Sd.parseFromJson(r3);
                } else {
                    C241993Se.A01(r3, obj, A0q);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r4, AnonymousClass3SZ r5) {
        r4.A0c();
        r4.A0Q("created_at", r5.A00);
        if (r5.A02 != null) {
            r4.A0q("shh_seen_state");
            C241973Sc r2 = r5.A02;
            r4.A0c();
            String str = r2.A01;
            if (str != null) {
                r4.A0R("item_id", str);
            }
            r4.A0Q("created_at", r2.A00);
            r4.A0Z();
        }
        if (r5.A01 != null) {
            r4.A0q("disappearing_messages_seen_state");
            AnonymousClass9JD r22 = r5.A01;
            r4.A0c();
            String str2 = r22.A02;
            if (str2 != null) {
                r4.A0R("item_id", str2);
            }
            Number number = (Number) r22.A01;
            if (number != null) {
                r4.A0Q("created_at", number.longValue());
            }
            String str3 = r22.A03;
            if (str3 != null) {
                r4.A0R("item_otid", str3);
            }
            Boolean bool = (Boolean) r22.A00;
            if (bool != null) {
                r4.A0S("is_different_than_cached_marker", bool.booleanValue());
            }
            r4.A0Z();
        }
        C241993Se.A00(r4, r5);
        r4.A0Z();
    }
}
