package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf;
import java.util.LinkedHashMap;

/* renamed from: X.JzG  reason: case insensitive filesystem */
public final class C61223JzG extends AnonymousClass0T0 implements C66561MWp {
    public final IgFundedIncentive A00;

    public C61223JzG(IgFundedIncentive igFundedIncentive) {
        0qQ.A0B(igFundedIncentive, 1);
        this.A00 = igFundedIncentive;
    }

    public final C61223JzG FF1() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C61223JzG) && 0qQ.A0K(this.A00, ((C61223JzG) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ IgFundedIncentiveIntf BGk() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (BGk() != null) {
            A1H.put("incentive_details", BGk().FHC());
        }
        return new TreeUpdaterJNI("XDTShoppingNetegoInStoryIncentiveDestination", 0Yt.A0B(A1H));
    }
}
