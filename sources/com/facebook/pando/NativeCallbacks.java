package com.facebook.pando;

import X.002;
import X.00k;
import X.0qQ;
import X.0sP;
import X.AnonymousClass1vU;
import X.C250663lr;
import X.C253613r5;

public final class NativeCallbacks {
    public final C253613r5 innerCallbacks;

    public NativeCallbacks(C253613r5 r2) {
        0qQ.A0B(r2, 1);
        this.innerCallbacks = r2;
    }

    public final void onError(PandoError pandoError) {
        0qQ.A0B(pandoError, 0);
        this.innerCallbacks.DCi(pandoError);
    }

    public final void onModelUpdate(TreeJNI treeJNI, Summary summary) {
        0qQ.A0B(treeJNI, 0);
        Summary summary2 = summary;
        0qQ.A0B(summary2, 1);
        if (AnonymousClass1vU.A00 && (treeJNI instanceof C250663lr)) {
            C250663lr r1 = (C250663lr) treeJNI;
            if (!r1.areAllSelectionsOptionalOrNonnull()) {
                String obj = treeJNI.getClass().toString();
                0qQ.A07(obj);
                this.innerCallbacks.DCi(new PandoError(002.A0R("A root field is required but null, or is required and has a recursively required but null child field:\n", 00k.A0P("\n", "", "", r1.bubbledNullPaths(obj), (0sP) null)), "", "", 0, "", "", "", false, false, false, ""));
                return;
            }
        }
        this.innerCallbacks.DvP(summary2, treeJNI);
    }
}
