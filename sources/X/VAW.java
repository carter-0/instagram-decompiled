package X;

import com.instagram.business.promote.model.RejectionReason;
import com.instagram.business.promote.model.RejectionReasonRanges;
import java.io.IOException;
import java.util.ArrayList;

public abstract class VAW {
    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.business.promote.model.RejectionReason, java.lang.Object] */
    public static RejectionReason parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ? obj = new Object();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if (C41845B3m.A1A(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    obj.A00 = A0l;
                } else if ("ranges".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            RejectionReasonRanges parseFromJson = VAV.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    obj.A01 = arrayList;
                } else if ("is_rejected_due_to_hec".equals(A17)) {
                    obj.A02 = r5.A0d();
                }
                r5.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
