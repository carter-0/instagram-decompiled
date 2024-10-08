package X;

import java.io.IOException;

/* renamed from: X.EnR  reason: case insensitive filesystem */
public abstract class C48989EnR {
    /* JADX WARNING: type inference failed for: r2v0, types: [X.4gd, java.lang.Object] */
    public static C270374gd parseFromJson(16F r3) {
        Integer num;
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("fb_connect_upsell".equals(A17)) {
                    obj.A04 = C48988EnQ.parseFromJson(r3);
                } else if ("vk_connect_upsell".equals(A17)) {
                    obj.A05 = C48988EnQ.parseFromJson(r3);
                } else if ("ci_connect_upsell".equals(A17)) {
                    obj.A03 = C48988EnQ.parseFromJson(r3);
                } else if ("generic_megaphone".equals(A17)) {
                    obj.A02 = C17008VEi.parseFromJson(r3);
                } else if ("rux".equals(A17)) {
                    obj.A01 = C48901Em1.parseFromJson(r3);
                }
                r3.A0z();
            }
            C48220Eb1 eb1 = obj.A04;
            if (eb1 != null) {
                num = AnonymousClass05K.A01;
            } else {
                eb1 = obj.A05;
                if (eb1 != null) {
                    num = AnonymousClass05K.A0C;
                } else {
                    eb1 = obj.A03;
                    if (eb1 != null) {
                        num = AnonymousClass05K.A0N;
                    } else {
                        eb1 = obj.A02;
                        if (eb1 != null) {
                            num = AnonymousClass05K.A0j;
                        } else {
                            eb1 = obj.A01;
                            if (eb1 == null) {
                                return obj;
                            }
                            num = AnonymousClass05K.A0Y;
                        }
                    }
                }
            }
            obj.A06 = num;
            obj.A00 = eb1;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
