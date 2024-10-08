package com.instagram.debug.devoptions.sandboxselector;

import X.0qQ;
import X.0sP;
import X.AnonymousClass0eL;
import X.AnonymousClass2gO;
import X.AnonymousClass7TG;
import X.C61910qF;

public final /* synthetic */ class SandboxSelectorFragment$sam$androidx_lifecycle_Observer$0 implements C61910qF, AnonymousClass2gO {
    public final /* synthetic */ 0sP function;

    public SandboxSelectorFragment$sam$androidx_lifecycle_Observer$0(0sP r2) {
        0qQ.A0B(r2, 1);
        this.function = r2;
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return this.function;
    }

    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass2gO) || !(obj instanceof C61910qF)) {
            return false;
        }
        return AnonymousClass7TG.A1Y(obj, this.function);
    }

    public final int hashCode() {
        return this.function.hashCode();
    }
}
