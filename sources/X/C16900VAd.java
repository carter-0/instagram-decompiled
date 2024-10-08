package X;

import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;

/* renamed from: X.VAd  reason: case insensitive filesystem */
public abstract class C16900VAd {
    public static final boolean A00(PromoteData promoteData) {
        0qQ.A0B(promoteData, 0);
        if (promoteData.A0i != XIGIGBoostDestination.WHATSAPP_MESSAGE || !promoteData.A2V) {
            return false;
        }
        return true;
    }
}
