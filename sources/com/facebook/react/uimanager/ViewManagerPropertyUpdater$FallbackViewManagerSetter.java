package com.facebook.react.uimanager;

import X.002;
import X.0I1;
import X.AnonymousClass7TF;
import X.C18752Vzn;
import X.C18805W2w;
import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class ViewManagerPropertyUpdater$FallbackViewManagerSetter implements ViewManagerPropertyUpdater$ViewManagerSetter {
    public final Map A00;

    public final void Bhz(Map map) {
        Iterator A0v = AnonymousClass7TF.A0v(this.A00);
        while (A0v.hasNext()) {
            C18752Vzn vzn = (C18752Vzn) A0v.next();
            map.put(vzn.A01, vzn.A02);
        }
    }

    public final void EhM(View view, ViewManager viewManager, Object obj, String str) {
        Object[] objArr;
        C18752Vzn vzn = (C18752Vzn) this.A00.get(str);
        if (vzn != null) {
            try {
                Integer num = vzn.A00;
                if (num == null) {
                    objArr = (Object[]) C18752Vzn.A06.get();
                    objArr[0] = view;
                    objArr[1] = vzn.A00(view.getContext(), obj);
                } else {
                    objArr = (Object[]) C18752Vzn.A07.get();
                    objArr[0] = view;
                    objArr[1] = num;
                    objArr[2] = vzn.A00(view.getContext(), obj);
                }
                vzn.A03.invoke(viewManager, objArr);
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th) {
                String str2 = vzn.A01;
                0I1.A01(ViewManager.class, 002.A0R("Error while updating prop ", str2), th);
                throw new RuntimeException(002.A0u("Error while updating property '", str2, "' of a view managed by: ", viewManager.getName()), th);
            }
        }
    }

    public ViewManagerPropertyUpdater$FallbackViewManagerSetter(Class cls) {
        this.A00 = C18805W2w.A03(cls);
    }
}
