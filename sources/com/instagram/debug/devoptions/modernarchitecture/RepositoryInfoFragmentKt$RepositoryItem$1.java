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

public final class RepositoryInfoFragmentKt$RepositoryItem$1 extends 0Yg implements 0sL {
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ RepositoryInfoViewModel.RepositoryInfo $repositoryInfo;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragmentKt$RepositoryItem$1(RepositoryInfoViewModel.RepositoryInfo repositoryInfo, Modifier modifier) {
        super(2);
        this.$repositoryInfo = repositoryInfo;
        this.$modifier = modifier;
    }

    public final void invoke(C286575Wy r9, int i) {
        if ((i & 3) != 2 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1106345473, "com.instagram.debug.devoptions.modernarchitecture.RepositoryItem.<anonymous> (RepositoryInfoFragment.kt:101)");
            }
            String A0R = 002.A0R("Feature: ", this.$repositoryInfo.featureTag);
            AnonymousClass5ZZ.A06(r9, C287195Zj.A0B(this.$modifier, 0.0f, 4.0f, 4.0f, 4.0f), C51966G9m.A0b(r9), A0R);
            RepositoryInfoViewModel.MemoryCacheStats memoryCacheStats = this.$repositoryInfo.memoryCacheStats;
            if (memoryCacheStats != null) {
                RepositoryInfoFragmentKt.MemoryCacheStats(memoryCacheStats, (Modifier) null, r9, 0, 2);
            }
            if (0fL.A02()) {
                0fL.A00(-1284727678);
                return;
            }
            return;
        }
        r9.Evl();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C286575Wy) obj, AnonymousClass7TE.A0M(obj2));
        return C60340gF.A00;
    }
}
