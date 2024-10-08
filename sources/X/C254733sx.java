package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3sx  reason: invalid class name and case insensitive filesystem */
public abstract class C254733sx {
    /* JADX WARNING: type inference failed for: r0v4, types: [com.instagram.model.direct.DirectThreadKey, java.lang.Object] */
    public static DirectThreadKey parseFromJson(16F r6) {
        String A1P;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            ArrayList arrayList = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if ("thread_v2_id".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                } else if ("recipient_ids".equals(A0q)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r6.A1J() != 16L.A08) {
                            if (!(r6.A11() == 16L.A0G || (A1P = r6.A1P()) == null)) {
                                arrayList.add(A1P);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r6.A0z();
            }
            ? obj = new Object();
            if (str != null) {
                obj.A00 = str;
            }
            if (str2 != null) {
                obj.A01 = str2;
            }
            if (arrayList != null) {
                obj.A02 = arrayList;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, DirectThreadKey directThreadKey) {
        r2.A0c();
        String str = directThreadKey.A00;
        if (str != null) {
            r2.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        }
        String str2 = directThreadKey.A01;
        if (str2 != null) {
            r2.A0R("thread_v2_id", str2);
        }
        if (directThreadKey.A02 != null) {
            16P.A03(r2, "recipient_ids");
            for (String str3 : directThreadKey.A02) {
                if (str3 != null) {
                    r2.A0t(str3);
                }
            }
            r2.A0Y();
        }
        r2.A0Z();
    }
}
