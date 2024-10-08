package com.facebook.react.uimanager;

import X.002;
import X.0I1;
import X.0Sd;
import X.AnonymousClass7TF;
import X.C18752Vzn;
import X.C18805W2w;
import X.QZL;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class ViewManagerPropertyUpdater$FallbackShadowNodeSetter implements ViewManagerPropertyUpdater$ShadowNodeSetter {
    public final Map A00;

    public final void Bhz(Map map) {
        Iterator A0v = AnonymousClass7TF.A0v(this.A00);
        while (A0v.hasNext()) {
            C18752Vzn vzn = (C18752Vzn) A0v.next();
            map.put(vzn.A01, vzn.A02);
        }
    }

    public final void EhL(ReactShadowNode reactShadowNode, Object obj, String str) {
        Object[] objArr;
        C18752Vzn vzn = (C18752Vzn) this.A00.get(str);
        if (vzn != null) {
            try {
                Integer num = vzn.A00;
                if (num == null) {
                    objArr = (Object[]) C18752Vzn.A04.get();
                    QZL qzl = ((ReactShadowNodeImpl) reactShadowNode).A0A;
                    0Sd.A00(qzl);
                    objArr[0] = vzn.A00(qzl, obj);
                } else {
                    objArr = (Object[]) C18752Vzn.A05.get();
                    objArr[0] = num;
                    QZL qzl2 = ((ReactShadowNodeImpl) reactShadowNode).A0A;
                    0Sd.A00(qzl2);
                    objArr[1] = vzn.A00(qzl2, obj);
                }
                vzn.A03.invoke(reactShadowNode, objArr);
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th) {
                String str2 = vzn.A01;
                0I1.A01(ViewManager.class, 002.A0R("Error while updating prop ", str2), th);
                String str3 = ((ReactShadowNodeImpl) reactShadowNode).A0E;
                0Sd.A00(str3);
                throw new RuntimeException(002.A0u("Error while updating property '", str2, "' in shadow node of type: ", str3), th);
            }
        }
    }

    public ViewManagerPropertyUpdater$FallbackShadowNodeSetter(Class cls) {
        this.A00 = C18805W2w.A02(cls);
    }
}
