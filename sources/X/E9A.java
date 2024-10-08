package X;

import com.instagram.business.fragment.SupportServicePartnerSelectionFragment;
import java.util.List;

public final class E9A extends 2Ru {
    public List A00 = AnonymousClass7TE.A1C();
    public final E9Z A01;
    public final SupportServicePartnerSelectionFragment A02;

    public E9A(SupportServicePartnerSelectionFragment supportServicePartnerSelectionFragment) {
        super(false);
        this.A02 = supportServicePartnerSelectionFragment;
        E9Z e9z = new E9Z(this);
        this.A01 = e9z;
        DbU.A1Q(this, e9z);
    }

    public final boolean isEmpty() {
        List list = this.A00;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }
}
