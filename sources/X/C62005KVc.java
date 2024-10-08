package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf;
import com.instagram.model.shopping.incentives.igfunded.ImmutablePandoIgFundedIncentive;
import java.util.LinkedHashMap;

/* renamed from: X.KVc  reason: case insensitive filesystem */
public final class C62005KVc extends 17P implements C66561MWp {
    public final IgFundedIncentiveIntf BGk() {
        return (IgFundedIncentiveIntf) A04(-342910098, ImmutablePandoIgFundedIncentive.class);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.KVc, X.MWp] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (BGk() != null) {
            A1H.put("incentive_details", BGk().FHC());
        }
        return new TreeUpdaterJNI(0Yt.A0B(A1H), this);
    }

    public final C61223JzG FF1() {
        return new C61223JzG(BGk().FFV());
    }
}
