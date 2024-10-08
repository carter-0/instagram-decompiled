package com.instagram.debug.devoptions.section.localinjection;

import X.0nA;
import X.AnonymousClass0fD;
import X.AnonymousClass7TG;
import X.C249403jg;
import androidx.recyclerview.widget.RecyclerView;

public final class InjectMediaFragment$onCreateView$1 extends C249403jg {
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A0D = AnonymousClass7TG.A0D(recyclerView, 976463603);
        super.onScrollStateChanged(recyclerView, i);
        if (i == 1) {
            0nA.A0N(recyclerView);
            recyclerView.requestFocus();
        }
        AnonymousClass0fD.A0A(-1954876737, A0D);
    }
}
