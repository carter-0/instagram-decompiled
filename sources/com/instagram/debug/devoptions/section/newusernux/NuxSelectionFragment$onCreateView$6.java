package com.instagram.debug.devoptions.section.newusernux;

import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C47938ENp;
import X.C47944ENv;
import X.C49044EoO;
import X.C49045EoP;
import X.G6A;
import android.content.Context;
import android.view.View;
import java.util.List;

public final class NuxSelectionFragment$onCreateView$6 implements View.OnClickListener {
    public final /* synthetic */ NuxSelectionFragment this$0;

    public NuxSelectionFragment$onCreateView$6(NuxSelectionFragment nuxSelectionFragment) {
        this.this$0 = nuxSelectionFragment;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-917088012);
        Context context = this.this$0.getContext();
        if (context != null) {
            NuxSelectionFragment nuxSelectionFragment = this.this$0;
            List access$getSerializableSteps = nuxSelectionFragment.getSerializableSteps();
            nuxSelectionFragment.saveSelectedSteps(access$getSerializableSteps);
            C47944ENv A00 = C49045EoP.A00(nuxSelectionFragment.delegate, access$getSerializableSteps);
            C47938ENp A01 = C47938ENp.A03.A01(context, AnonymousClass7TE.A0l(nuxSelectionFragment.session$delegate), nuxSelectionFragment.delegate, (G6A) null);
            nuxSelectionFragment.logic = A01;
            A01.A02(A00, true);
            C49044EoO.A00(AnonymousClass7TE.A0l(nuxSelectionFragment.session$delegate), context, false);
        }
        AnonymousClass0fD.A0C(2126327907, A05);
    }
}
