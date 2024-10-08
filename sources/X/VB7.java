package X;

import java.io.IOException;

public abstract class VB7 {
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.VbG] */
    public static C17624VbG parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("batch_size".equals(A17)) {
                    obj.A00 = AnonymousClass7TF.A0X(r3);
                } else if ("field_setting".equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if ("max_concurrent_batches".equals(A17)) {
                    obj.A01 = AnonymousClass7TF.A0X(r3);
                } else if ("max_num_contacts".equals(A17)) {
                    obj.A02 = AnonymousClass7TF.A0X(r3);
                } else if ("max_num_retries".equals(A17)) {
                    obj.A05 = AnonymousClass7TF.A0X(r3);
                } else if ("max_num_emails_in_contact".equals(A17)) {
                    obj.A03 = AnonymousClass7TF.A0X(r3);
                } else if ("max_num_phones_in_contact".equals(A17)) {
                    obj.A04 = AnonymousClass7TF.A0X(r3);
                } else if ("upload_interval".equals(A17)) {
                    obj.A06 = AnonymousClass7TF.A0X(r3);
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
}
