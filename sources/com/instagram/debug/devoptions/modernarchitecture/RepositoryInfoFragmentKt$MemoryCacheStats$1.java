package com.instagram.debug.devoptions.modernarchitecture;

import X.002;
import X.0Yg;
import X.0fL;
import X.0sL;
import X.AnonymousClass5ZZ;
import X.AnonymousClass7TE;
import X.C286575Wy;
import X.C287195Zj;
import X.C51966G9m;
import X.C60340gF;
import androidx.compose.ui.Modifier;
import com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoViewModel;

public final class RepositoryInfoFragmentKt$MemoryCacheStats$1 extends 0Yg implements 0sL {
    public final /* synthetic */ RepositoryInfoViewModel.MemoryCacheStats $memoryCacheStats;
    public final /* synthetic */ Modifier $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragmentKt$MemoryCacheStats$1(RepositoryInfoViewModel.MemoryCacheStats memoryCacheStats, Modifier modifier) {
        super(2);
        this.$memoryCacheStats = memoryCacheStats;
        this.$modifier = modifier;
    }

    public final void invoke(C286575Wy r6, int i) {
        if ((i & 3) != 2 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(29644636, "com.instagram.debug.devoptions.modernarchitecture.MemoryCacheStats.<anonymous> (RepositoryInfoFragment.kt:114)");
            }
            String A0O = 002.A0O("Hit count: ", this.$memoryCacheStats.hitCount);
            AnonymousClass5ZZ.A06(r6, C287195Zj.A0B(this.$modifier, 0.0f, 4.0f, 4.0f, 4.0f), C51966G9m.A0b(r6), A0O);
            String A0O2 = 002.A0O("Miss count: ", this.$memoryCacheStats.missCount);
            AnonymousClass5ZZ.A06(r6, C287195Zj.A0B(this.$modifier, 0.0f, 4.0f, 4.0f, 4.0f), C51966G9m.A0b(r6), A0O2);
            String A0O3 = 002.A0O("Put count: ", this.$memoryCacheStats.putCount);
            AnonymousClass5ZZ.A06(r6, C287195Zj.A0B(this.$modifier, 0.0f, 4.0f, 4.0f, 4.0f), C51966G9m.A0b(r6), A0O3);
            String A0O4 = 002.A0O("Eviction count: ", this.$memoryCacheStats.evictionCount);
            AnonymousClass5ZZ.A06(r6, C287195Zj.A0B(this.$modifier, 0.0f, 4.0f, 4.0f, 4.0f), C51966G9m.A0b(r6), A0O4);
            if (0fL.A02()) {
                0fL.A00(-340472889);
                return;
            }
            return;
        }
        r6.Evl();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C286575Wy) obj, AnonymousClass7TE.A0M(obj2));
        return C60340gF.A00;
    }
}
