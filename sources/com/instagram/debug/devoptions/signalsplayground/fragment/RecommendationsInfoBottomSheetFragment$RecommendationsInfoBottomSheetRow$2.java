package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.0Yg;
import X.0sL;
import X.AnonymousClass7TE;
import X.C286575Wy;
import X.C51966G9m;
import X.C60340gF;

public final class RecommendationsInfoBottomSheetFragment$RecommendationsInfoBottomSheetRow$2 extends 0Yg implements 0sL {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $iconRes;
    public final /* synthetic */ int $subtitleRes;
    public final /* synthetic */ int $titleRes;
    public final /* synthetic */ RecommendationsInfoBottomSheetFragment $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecommendationsInfoBottomSheetFragment$RecommendationsInfoBottomSheetRow$2(RecommendationsInfoBottomSheetFragment recommendationsInfoBottomSheetFragment, int i, int i2, int i3, int i4) {
        super(2);
        this.$tmp0_rcvr = recommendationsInfoBottomSheetFragment;
        this.$iconRes = i;
        this.$titleRes = i2;
        this.$subtitleRes = i3;
        this.$$changed = i4;
    }

    public final void invoke(C286575Wy r8, int i) {
        this.$tmp0_rcvr.RecommendationsInfoBottomSheetRow(this.$iconRes, this.$titleRes, this.$subtitleRes, r8, C51966G9m.A01(this.$$changed));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C286575Wy) obj, AnonymousClass7TE.A0M(obj2));
        return C60340gF.A00;
    }
}
