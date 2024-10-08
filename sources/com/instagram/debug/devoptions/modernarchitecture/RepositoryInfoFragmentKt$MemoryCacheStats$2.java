package com.instagram.debug.devoptions.modernarchitecture;

import X.0Yg;
import X.0sL;
import X.AnonymousClass7TE;
import X.C286575Wy;
import X.C51966G9m;
import X.C60340gF;
import androidx.compose.ui.Modifier;
import com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoViewModel;

public final class RepositoryInfoFragmentKt$MemoryCacheStats$2 extends 0Yg implements 0sL {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ RepositoryInfoViewModel.MemoryCacheStats $memoryCacheStats;
    public final /* synthetic */ Modifier $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragmentKt$MemoryCacheStats$2(RepositoryInfoViewModel.MemoryCacheStats memoryCacheStats, Modifier modifier, int i, int i2) {
        super(2);
        this.$memoryCacheStats = memoryCacheStats;
        this.$modifier = modifier;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(C286575Wy r5, int i) {
        RepositoryInfoFragmentKt.MemoryCacheStats(this.$memoryCacheStats, this.$modifier, r5, C51966G9m.A01(this.$$changed), this.$$default);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C286575Wy) obj, AnonymousClass7TE.A0M(obj2));
        return C60340gF.A00;
    }
}
