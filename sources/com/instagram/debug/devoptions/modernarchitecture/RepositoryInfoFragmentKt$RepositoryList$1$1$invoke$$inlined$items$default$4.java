package com.instagram.debug.devoptions.modernarchitecture;

import X.0Yg;
import X.0fL;
import X.0sJ;
import X.AnonymousClass7TE;
import X.C286575Wy;
import X.C305236Hb;
import X.C51965G9l;
import X.C51970G9q;
import X.C60340gF;
import X.G9t;
import androidx.compose.ui.Modifier;
import com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoViewModel;
import java.util.List;

public final class RepositoryInfoFragmentKt$RepositoryList$1$1$invoke$$inlined$items$default$4 extends 0Yg implements 0sJ {
    public final /* synthetic */ List $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragmentKt$RepositoryList$1$1$invoke$$inlined$items$default$4(List list) {
        super(4);
        this.$items = list;
    }

    public final void invoke(C305236Hb r5, int i, C286575Wy r7, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = G9t.A0O(r7, r5) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= G9t.A06(r7, i);
        }
        if ((i3 & 147) != 146 || !r7.Bwn()) {
            if (0fL.A02()) {
                C51965G9l.A17(591454503);
            }
            r7.ExS(-2022757231);
            RepositoryInfoFragmentKt.RepositoryItem((RepositoryInfoViewModel.RepositoryInfo) this.$items.get(i), (Modifier) null, r7, ((i3 & 14) >> 3) & 14, 2);
            if (C51970G9q.A1Z(r7)) {
                0fL.A00(1337357822);
                return;
            }
            return;
        }
        r7.Evl();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((C305236Hb) obj, AnonymousClass7TE.A0M(obj2), (C286575Wy) obj3, AnonymousClass7TE.A0M(obj4));
        return C60340gF.A00;
    }
}
