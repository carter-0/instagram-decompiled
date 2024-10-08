package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectVisualMessageTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class O17 {
    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.model.direct.DirectVisualMessageTarget, java.lang.Object] */
    public static DirectVisualMessageTarget parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("pending_recipients".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            PendingRecipient parseFromJson = C330927Ou.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A02 = arrayList;
                } else if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r4);
                } else if ("thread_title".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r4);
                } else if (C273654mx.A00(771).equals(A17)) {
                    obj.A03 = r4.A0d();
                }
                r4.A0z();
            }
            List list = obj.A02;
            if (list == null) {
                return obj;
            }
            Collections.sort(list, DirectVisualMessageTarget.A04);
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
