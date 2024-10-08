package com.instagram.debug.quickexperiment;

import X.00k;
import X.0Yg;
import X.0sn;
import X.0tS;
import X.C273654mx;
import X.C62320sa;
import X.DbT;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public final class QuickExperimentCategoriesFragment$testRigParameterNames$2 extends 0Yg implements C62320sa {
    public final /* synthetic */ QuickExperimentCategoriesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QuickExperimentCategoriesFragment$testRigParameterNames$2(QuickExperimentCategoriesFragment quickExperimentCategoriesFragment) {
        super(0);
        this.this$0 = quickExperimentCategoriesFragment;
    }

    public final Set invoke() {
        ArrayList<String> arrayList;
        Bundle bundle = this.this$0.mArguments;
        if (bundle == null || (arrayList = bundle.getStringArrayList(C273654mx.A00(2975))) == null) {
            arrayList = 0sn.A00;
        }
        Set A0j = 00k.A0j(arrayList);
        0tS A0h = DbT.A0h();
        A0j.addAll((Collection) A0h.A24.CDM(A0h, 0tS.A4G[253]));
        return A0j;
    }
}
