package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6UD  reason: invalid class name */
public abstract class AnonymousClass6UD {
    public static final DirectShareTarget A00(User user, boolean z) {
        C254783t2 r1;
        PendingRecipient pendingRecipient = new PendingRecipient(user);
        List singletonList = Collections.singletonList(pendingRecipient);
        0qQ.A07(singletonList);
        String str = pendingRecipient.A0C;
        if (z) {
            r1 = new PIO(C254923tH.ACT, OXK.A01(singletonList));
        } else {
            r1 = new C291175gg(singletonList);
        }
        C254783t2 r12 = r1;
        0qQ.A0B(r12, 2);
        return new DirectShareTarget(r12, str, singletonList, true);
    }
}
