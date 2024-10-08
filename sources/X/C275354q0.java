package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4q0  reason: invalid class name and case insensitive filesystem */
public abstract class C275354q0 {
    public static AnonymousClass4q1 parseFromJson(16F r10) {
        String A1P;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Boolean bool = null;
            Integer num = null;
            Integer num2 = null;
            Boolean bool2 = null;
            Integer num3 = null;
            Integer num4 = null;
            ArrayList arrayList = null;
            while (r10.A1J() != 16L.A09) {
                String A0q = r10.A0q();
                r10.A1J();
                if ("enqueued_for_federation".equals(A0q)) {
                    bool = Boolean.valueOf(r10.A0d());
                } else if ("federated_like_count".equals(A0q)) {
                    num = Integer.valueOf(r10.A1D());
                } else if ("fediverse_reply_count".equals(A0q)) {
                    num2 = Integer.valueOf(r10.A1D());
                } else if ("is_federated".equals(A0q)) {
                    bool2 = Boolean.valueOf(r10.A0d());
                } else if ("liked_instance_count".equals(A0q)) {
                    num3 = Integer.valueOf(r10.A1D());
                } else if ("reply_instance_count".equals(A0q)) {
                    num4 = Integer.valueOf(r10.A1D());
                } else if ("reply_owner_profile_pic_uris".equals(A0q)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r10.A1J() != 16L.A08) {
                            if (!(r10.A11() == 16L.A0G || (A1P = r10.A1P()) == null)) {
                                arrayList.add(A1P);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r10.A0z();
            }
            return new AnonymousClass4q1(bool, bool2, num, num2, num3, num4, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
