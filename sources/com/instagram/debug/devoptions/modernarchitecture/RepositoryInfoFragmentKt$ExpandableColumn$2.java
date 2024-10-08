package com.instagram.debug.devoptions.modernarchitecture;

import X.0Yg;
import X.0sL;
import X.AnonymousClass7TE;
import X.C286575Wy;
import X.C51966G9m;
import X.C60340gF;
import androidx.compose.ui.Modifier;

public final class RepositoryInfoFragmentKt$ExpandableColumn$2 extends 0Yg implements 0sL {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ 0sL $content;
    public final /* synthetic */ String $label;
    public final /* synthetic */ Modifier $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragmentKt$ExpandableColumn$2(String str, Modifier modifier, 0sL r4, int i, int i2) {
        super(2);
        this.$label = str;
        this.$modifier = modifier;
        this.$content = r4;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(C286575Wy r8, int i) {
        RepositoryInfoFragmentKt.ExpandableColumn(this.$label, this.$modifier, this.$content, r8, C51966G9m.A01(this.$$changed), this.$$default);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C286575Wy) obj, AnonymousClass7TE.A0M(obj2));
        return C60340gF.A00;
    }
}
