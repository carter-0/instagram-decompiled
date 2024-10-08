package X;

import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Eob  reason: case insensitive filesystem */
public abstract class C49057Eob {
    public static C49378Eug parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C49378Eug eug = new C49378Eug();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if ("recipients".equals(AnonymousClass7TE.A17(r5))) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            PendingRecipient parseFromJson = C330927Ou.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    eug.A00 = arrayList;
                }
                r5.A0z();
            }
            return eug;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
