package X;

import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.7P4  reason: invalid class name */
public abstract class AnonymousClass7P4 {
    public static AnonymousClass7P6 parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            Long l = null;
            Long l2 = null;
            String str2 = null;
            ArrayList arrayList2 = null;
            while (r9.A1J() != 16L.A09) {
                String A0q = r9.A0q();
                r9.A1J();
                if ("direct_thread_id".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("direct_pending_recipients".equals(A0q)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r9.A1J() != 16L.A08) {
                            PendingRecipient parseFromJson = C330927Ou.parseFromJson(r9);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("msys_thread_key".equals(A0q)) {
                    l = Long.valueOf(r9.A0y());
                } else if ("msys_thread_fbid".equals(A0q)) {
                    l2 = Long.valueOf(r9.A0y());
                } else if ("msys_transport_type".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if ("msys_pending_recipients".equals(A0q)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r9.A1J() != 16L.A08) {
                            C49864FAh parseFromJson2 = C48993EnV.parseFromJson(r9);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                r9.A0z();
            }
            return new AnonymousClass7P6(l, l2, str, str2, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
