package com.facebook.tigon.observers;

import X.0qQ;
import X.AnonymousClass7TE;
import X.Xr6;
import com.facebook.ultralight.UL;
import java.util.Iterator;
import java.util.Set;

public final class FBTigonXplatObserversHolder extends TigonXplatObserversHolder {
    public FBTigonXplatObserversHolder() {
        Set set = (Set) Xr6.A00(UL.id._UL__ULSEP_java_util_Set_ULLT_com_facebook_tigon_observers_TigonObserver_ULGT__ULSEP_BINDING_ID);
        0qQ.A07(set);
        Iterator it = set.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass7TE.A11("getDisabled");
        }
    }
}
