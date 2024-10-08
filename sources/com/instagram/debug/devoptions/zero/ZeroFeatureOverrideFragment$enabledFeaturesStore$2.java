package com.instagram.debug.devoptions.zero;

import X.0Yg;
import X.AnonymousClass7TE;
import X.C62320sa;
import com.instagram.debug.devoptions.zero.ZeroFeatureOverrideFragment;

public final class ZeroFeatureOverrideFragment$enabledFeaturesStore$2 extends 0Yg implements C62320sa {
    public final /* synthetic */ ZeroFeatureOverrideFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ZeroFeatureOverrideFragment$enabledFeaturesStore$2(ZeroFeatureOverrideFragment zeroFeatureOverrideFragment) {
        super(0);
        this.this$0 = zeroFeatureOverrideFragment;
    }

    public final ZeroFeatureOverrideFragment.EnabledFeaturesStore invoke() {
        return new ZeroFeatureOverrideFragment.EnabledFeaturesStore(AnonymousClass7TE.A0l(this.this$0.session$delegate));
    }
}
