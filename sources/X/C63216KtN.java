package X;

import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KtN  reason: case insensitive filesystem */
public abstract class C63216KtN {
    public static final Integer A00(List list) {
        if (list != null) {
            boolean z = list instanceof Collection;
            if (!z || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((PendingRecipient) it.next()).A0Q) {
                        return AnonymousClass05K.A01;
                    }
                }
            }
            if (!z || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((PendingRecipient) it2.next()).A0Y) {
                        return AnonymousClass05K.A0C;
                    }
                }
            }
        }
        return AnonymousClass05K.A00;
    }
}
