package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.Collections;

/* renamed from: X.DhE  reason: case insensitive filesystem */
public final class C46572DhE implements AnonymousClass2hV {
    public static final C46572DhE A00 = new C46572DhE();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        DirectShareTarget directShareTarget = (DirectShareTarget) obj;
        if (Collections.unmodifiableList(directShareTarget.A0Q).size() == 1) {
            return ((PendingRecipient) Collections.unmodifiableList(directShareTarget.A0Q).get(0)).getId();
        }
        return null;
    }
}
