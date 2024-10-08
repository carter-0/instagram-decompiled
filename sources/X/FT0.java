package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

public final class FT0 implements AnonymousClass2hV {
    public final int A00;

    public FT0(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        switch (this.A00) {
            case 0:
                PendingRecipient pendingRecipient = (PendingRecipient) obj;
                pendingRecipient.getClass();
                return DbV.A0q(pendingRecipient.getId());
            case 1:
                DirectShareTarget directShareTarget = (DirectShareTarget) obj;
                if (directShareTarget == null || DbT.A14(directShareTarget).size() != 1) {
                    return null;
                }
                boolean A0U = directShareTarget.A0U();
                PendingRecipient pendingRecipient2 = (PendingRecipient) AnonymousClass7TE.A13(DbT.A14(directShareTarget));
                0qQ.A0B(pendingRecipient2, 1);
                pendingRecipient2.A0L = A0U;
                return pendingRecipient2.getId();
            default:
                return DbV.A0q((String) obj);
        }
    }
}
